/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjavakoneksi.Controller;

import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import tugasjavakoneksi.Helper.Helper;
import tugasjavakoneksi.Model.MainModel;
import tugasjavakoneksi.Query.IncomeQuery;

/**
 *
 * @author HP
 */
public class IncomeController extends BaseController{
    Helper helper = new Helper();
    IncomeQuery query = new IncomeQuery();
    
    public Boolean create(MainModel model) throws ParseException {
        String date = helper.parseDateToString(model.getIncome());
        
        Map<Integer, Object>map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getGoods());
        map.put(3, model.getCategory());
        map.put(4, model.getIncome());
        map.put(5, model.getStock());
        map.put(6, model.getPrice());
        
        
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
    
    public Boolean update (String id, MainModel model) throws ParseException {
        String date = helper.parseDateToString(model.getIncome());
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getGoods());
        map.put(3, model.getCategory());
        map.put(4, model.getIncome());
        map.put(5, model.getStock());
        map.put(6, model.getPrice());
        
        map.put(7, id);
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    
    public Boolean delete (String id) throws ParseException {
        Map<Integer, Object> map =  new HashMap<>();
        map.put(1, id);
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    
	}
    
    public ResultSet get() {
        String sql = this.query.get;
        return this.get(sql);
    }
    public ResultSet search (String name) {
        String sql = this.query.search;
        
        Map<Integer, Object>map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(name));
        
        return this.getWithParameter(map, sql);
    }
}
