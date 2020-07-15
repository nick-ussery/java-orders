package assignment.orders.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import assignment.orders.Repositories.CustomerRepository;
import assignment.orders.models.Customer;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerService")
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    private CustomerRepository customerrepos;

    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        return customerrepos.save(customer);
    }

    @Override
    public List<Customer> findAllCustomers() {
        List<Customer> list = new ArrayList<>();
        customerrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Customer findById(long id) {
        Customer c = new Customer();
        c = customerrepos.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Customer " + id + " Does not exist"));
        return c;
    }

    @Override
    public List<Customer> findNameLike(String subname) {
        List<Customer> myList = new ArrayList<>();
        customerrepos.findByNameContainingIgnoreCase(subname);
        return myList;
    }
}
