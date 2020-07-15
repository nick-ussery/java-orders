package java.orders.models;

import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;
    @Column(nullable = false)
    private String type;

    public Payment() {
    }

    public Payment(String type) {
        this.type = type;
    }

    @ManyToOne
    @JoinColumn(name="ordnum")
    private Order order;

    public long getPaymentid() {
        return paymentid;
    }


    public void setPaymentid(long paymentid) {
        this.paymentid = paymentid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
