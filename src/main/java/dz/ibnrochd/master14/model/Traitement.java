package dz.ibnrochd.master14.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "cabinet", name = "traitement")
public class Traitement implements Serializable {

	private static final long serialVersionUID = 8248365590951840055L;
    

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
    @Override
	public String toString() {
		return "Traitement [id=" + id + ", nom=" + nom + "]";
	}
	@Column(name = "nom", nullable = false, length = 255)
	private String nom;


    public Traitement() {
    	
    }
    
public Traitement(int id, String nom) {
	
	super();
	this.id = id;
	this.nom = nom;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}

}