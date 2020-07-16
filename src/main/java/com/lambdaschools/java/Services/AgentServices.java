package com.lambdaschools.java.Services;

import com.lambdaschools.java.models.Agent;

public interface AgentServices {
    Agent save(Agent agent);
    Agent findById(long id);
}
