
package Persistencia.Entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Customer extends Person implements Serializable{
    
    @ElementCollection
    private List<String> phone;
    
    @Enumerated(EnumType.STRING)
    private Status status;
    
}
