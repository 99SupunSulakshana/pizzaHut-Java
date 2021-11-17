/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaproject;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author supun
 */
@Entity
@Table(name = "sales_products")
@NamedQueries({
    @NamedQuery(name = "SalesProducts.findAll", query = "SELECT s FROM SalesProducts s"),
    @NamedQuery(name = "SalesProducts.findById", query = "SELECT s FROM SalesProducts s WHERE s.id = :id"),
    @NamedQuery(name = "SalesProducts.findBySalesId", query = "SELECT s FROM SalesProducts s WHERE s.salesId = :salesId"),
    @NamedQuery(name = "SalesProducts.findByPname", query = "SELECT s FROM SalesProducts s WHERE s.pname = :pname"),
    @NamedQuery(name = "SalesProducts.findByPrice", query = "SELECT s FROM SalesProducts s WHERE s.price = :price"),
    @NamedQuery(name = "SalesProducts.findByQty", query = "SELECT s FROM SalesProducts s WHERE s.qty = :qty"),
    @NamedQuery(name = "SalesProducts.findByTotal", query = "SELECT s FROM SalesProducts s WHERE s.total = :total")})
public class SalesProducts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "sales_id")
    private int salesId;
    @Basic(optional = false)
    @Column(name = "pname")
    private String pname;
    @Basic(optional = false)
    @Column(name = "price")
    private int price;
    @Basic(optional = false)
    @Column(name = "qty")
    private int qty;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;

    public SalesProducts() {
    }

    public SalesProducts(Integer id) {
        this.id = id;
    }

    public SalesProducts(Integer id, int salesId, String pname, int price, int qty, int total) {
        this.id = id;
        this.salesId = salesId;
        this.pname = pname;
        this.price = price;
        this.qty = qty;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesProducts)) {
            return false;
        }
        SalesProducts other = (SalesProducts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pizzaproject.SalesProducts[ id=" + id + " ]";
    }
    
}
