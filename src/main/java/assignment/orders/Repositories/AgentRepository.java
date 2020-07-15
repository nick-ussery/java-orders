package assignment.orders.Repositories;

import org.springframework.data.repository.CrudRepository;

import assignment.orders.models.Agent;

public interface AgentRepository extends CrudRepository<Agent, Long> {
}
