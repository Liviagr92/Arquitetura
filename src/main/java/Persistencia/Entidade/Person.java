package Persistencia.Entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Person implements Serializable {
    
    @Id @GeneratedValue
    protected Long id;
    protected String name;
    
    @ManyToOne
    protected City city;
    
    
}
