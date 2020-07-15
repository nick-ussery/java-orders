package assignment.orders.models;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

public class OrderPayment
{
    @ManyToMany
    @JoinTable(name="orderspayments",
    joinColumns = @JoinColumn(name = "paymentid"),
            inverseJoinColumns = @JoinColumn(name = "orderid"))
    private Set<Payment> payments = new HashSet<>();

    public OrderPayment() {
    }

    public OrderPayment(Set<Payment> payments) {
        this.payments = payments;
    }



    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }


}
