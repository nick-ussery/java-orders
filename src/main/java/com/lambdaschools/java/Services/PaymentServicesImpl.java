package com.lambdaschools.java.Services;

import com.lambdaschools.java.Repositories.PaymentRepository;
import com.lambdaschools.java.models.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


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
