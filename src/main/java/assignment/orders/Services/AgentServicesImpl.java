package assignment.orders.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import assignment.orders.Repositories.AgentRepository;
import assignment.orders.models.Agent;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "agentService")
public class AgentServicesImpl implements AgentServices
{
    @Autowired
    private AgentRepository agentrepos;

    @Transactional
    @Override
    public Agent save(Agent agent)
    {
        return agentrepos.save(agent);
    }

    @Override
    public Agent findById(long id) {
        Agent a = new Agent();
        a = agentrepos.findById(id).orElseThrow(()->new EntityNotFoundException("Agent " + id + "not found"));
        return null;
    }
}
