package com.lambdaschools.java.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.lambdaschools.java.models.Agent;

public interface AgentRepository extends CrudRepository<Agent, Long> {
}
