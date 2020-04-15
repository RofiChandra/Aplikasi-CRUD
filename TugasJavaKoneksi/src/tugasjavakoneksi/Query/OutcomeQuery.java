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
public class OutcomeQuery {
    public String create = ("INSERT INTO outcoming (name, product_id" 
            +", delivery_address, total, date, total_income) VALUES (?,?,?,?,?,?)");
    
    public String get = "SELECT * FROM outcoming";
    public String update = "UPDATE outcoming SET name = ?, product_id = ?"
            + ", address = ?, total = ?, outcoming = ?, total_income = ? WHERE id = ? ";
    public String search = "SELECT * FROM outcoming WHERE name LIKE ?";
    public String delete = "DELETE FROM outcoming WHERE id = ?"; 
}
