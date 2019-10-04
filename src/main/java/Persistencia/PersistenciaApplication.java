/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Persistencia.Entidade.State;
import Persistencia.dao.StateDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersistenciaApplication implements CommandLineRunner {
    
    private final StateDAO stateDAO;
    
    public static void main(String[] args){
        SpringApplication.run(PersistenciaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        stateDAO.save(State.builder().name("Paraná").build());
        
    }
    
}
