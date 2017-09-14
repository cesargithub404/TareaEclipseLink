package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class EntityPersona {

	@Id
	@GeneratedValue
	@Column(name="PER_ID", nullable=false, unique=true)
private Integer id;

	@Column(name="PER_NOMBRE", nullable=false, length=25)
private String nombre;
	
	@Column(name="PER_APELLIDO", nullable=false, length=30)
	private String perapellido;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return nombre;
}

public void setName(String name) {
	this.nombre = name;
}


}
