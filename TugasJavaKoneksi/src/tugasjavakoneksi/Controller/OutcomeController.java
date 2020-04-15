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
import tugasjavakoneksi.Query.OutcomeQuery;

/**
 *
 * @author HP
 */
public class OutcomeController extends BaseController{
    Helper helper = new Helper();
    OutcomeQuery query = new OutcomeQuery();
    
    public Boolean create (MainModel model) throws ParseException{
        String date = helper.parseDateToString(model.getOutcoming());
        
        Map<Integer, Object>map = new HashMap<>();
        map.put(1, model.getOutcome_name());
        map.put(2, model.getProduct_id());
        map.put(3, model.getAddress());
        map.put(4, model.getTotal());
        map.put(5, date);
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
    
    public Boolean update(String id, MainModel model) throws ParseException{
		String date = helper.parseDateToString(model.getOutcoming());
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getOutcome_name());
		map.put(2, model.getProduct_id());
		map.put(3, model.getAddress());
		map.put(4, model.getTotal());
		map.put(5, date);
		map.put(6, id);
		
		String sql = this.query.update;
		
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
