/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjavakoneksi.Model;

import java.util.Date;

/**
 *
 * @author HP
 */
public class MainModel {
    
    private String name;
    private String goods;
    private String price;
    private String stock;
    private String category;
    private Date income;
    
    //------------------outcome-----------------------//
    
    public String outcome_name;
	public String product_id;
	public String address;
	public String total;
	public Date outcoming;
	public String total_income;

    public void setOutcome_name(String outcome_name) {
        this.outcome_name = outcome_name;
    }

    public String getOutcome_name() {
        return outcome_name;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setOutcoming(Date outcoming) {
        this.outcoming = outcoming;
    }

    public Date getOutcoming() {
        return outcoming;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal_income(String total_income) {
        this.total_income = total_income;
    }

    public String getTotal_income() {
        return total_income;
    }
    
    
    
    //------------------------------------------------//
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getGoods() {
        return goods;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStock() {
        return stock;
    }

    public void setIncome(Date income) {
        this.income = income;
    }

    public Date getIncome() {
        return income;
    }

    

    

    

    
    //-----------------Outcome----------------//
    
    
       
   
}
