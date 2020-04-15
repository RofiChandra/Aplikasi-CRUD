/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjavakoneksi.Query;

/**
 *
 * @author HP
 */
public class IncomeQuery {
    public String create = ("INSERT INTO incoming (name, goods_name" 
            +", goods_category, incoming, stock, price, status) VALUES (?,?,?,?,?,?,?)");
    
    public String get = "SELECT * FROM incoming";
    public String search = "SELECT * FROM incoming WHERE name LIKE ?";
    public String update = "UPDATE product SET name = ?, goods_name = ?, goods_category = ?," +
            "stock = ?, price = ? WHERE id = ?";
    public String delete = "DELETE FROM incoming WHERE id = ?";
    
}
