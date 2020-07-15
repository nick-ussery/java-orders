package assignment.orders.Services;

import assignment.orders.models.Agent;

public interface AgentServices {
    Agent save(Agent agent);
    Agent findById(long id);
}
