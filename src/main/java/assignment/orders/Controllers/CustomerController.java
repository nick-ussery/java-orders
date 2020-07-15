package assignment.orders.Controllers;

import assignment.orders.Services.CustomerServices;
import assignment.orders.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController
{
    @Autowired
    private CustomerServices customerServices;

    @GetMapping(name = "/", produces = {"application/json"})
    public ResponseEntity<?>statusCheck()
    {
        return new ResponseEntity<>("Server is up", HttpStatus.OK);
    }

    @GetMapping(name = "/orders", produces = {"application/json"})
    public ResponseEntity<?> listAllCustomers()
    {
        System.out.println("Find all Customers intiated");
        List<Customer> myList = customerServices.findAllCustomers();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

    @GetMapping(name = "/customer/{id}", produces = {"application/json"})
    public ResponseEntity<?> findById(@PathVariable long id)
    {
        Customer c = customerServices.findById(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @GetMapping(name = "/namelike/{subname}", produces = {"application/json"})
    public ResponseEntity<?> findNameLike(@PathVariable String subname)
    {
        List<Customer> myList = customerServices.findNameLike(subname);
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
}
