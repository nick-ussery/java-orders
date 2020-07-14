package java.orders.models;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="orders")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;
    private double ordamount;
    @Column(nullable = false)
    private double custcode;
    private String orderdescription;


    @ManyToOne()
    @JoinColumn(name = "orderid")
    private Customer customer;
    public Order() {
    }

    @OneToMany()
    @JoinTable(name="orders",
            joinColumns = @JoinColumn(name = "ordernum"),
            inverseJoinColumns = @JoinColumn(name = "paymentid"))
    private Set<Payment> payments = new HashSet<>();


    public Order(double ordamount,  Payment payments, double custcode, String orderdescription) {
        this.ordamount = ordamount;
        this.custcode = custcode;
        this.orderdescription = orderdescription;
        this.customer = customer;
        this.payments = (Set<Payment>) payments;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public double getCustcode() {
        return custcode;
    }

    public void setCustcode(double custcode) {
        this.custcode = custcode;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }
}
