package assignment.orders.Controllers;

import assignment.orders.Services.AgentServices;
import assignment.orders.models.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name= "/agents")
public class AgentsController
{
    @Autowired
    private AgentServices agentServices;

    @GetMapping(name = "/agent{id}", produces = {"application/json"})
    public ResponseEntity<?> findById(@PathVariable long id)
    {
        Agent a = agentServices.findById(id);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }
}
