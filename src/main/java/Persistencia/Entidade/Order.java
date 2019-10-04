package Persistencia.Entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Order implements Serializable{
    
    @Id @GeneratedValue
    private Long id;
    private double total;
    //@Temporal(TemporalType.DATE)
    private Date currentData;
    
    @ManyToOne
    private Customer customer;
    
    @OneToMany
    private List<LineItem> items;
    
}
