package java.orders.Repositories;

import org.springframework.data.repository.CrudRepository;

import java.orders.models.Agent;

public interface AgentRepository extends CrudRepository<Agent, Long> {
}
