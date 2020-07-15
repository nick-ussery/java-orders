package assignment.orders.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import assignment.orders.Repositories.PaymentRepository;
import assignment.orders.models.Payment;

@Transactional
@Service(value = "paymentServices")
public class PaymentServicesImpl implements PaymentServices
{
    @Autowired
    private PaymentRepository paymentRepository;

//    @Transactional
//    @Override
//    public Payment save(Payment payment)
//    {
//        return paymentRepository.save(payment);
//    }


    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }
}
