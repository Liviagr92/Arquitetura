package Persistencia.dao;

import Persistencia.Entidade.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateDAO extends JpaRepository<State, Long>{}
