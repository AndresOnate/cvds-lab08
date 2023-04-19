package edu.eci.cvds.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Configuration {

    public Configuration(){}

    public Configuration(String property, String value){
        this.property = property;
        this.value = value;
    }

    
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//private Long configurationId;
    @Id
    private String property;
    private String value;

/**
    public Long getConfigurationId(){
        return this.configurationId;
    }
**/
    public String getProperty(){
        return this.property;
    }

    public String getValue(){
        return this.value;
    }
/**
    public void setConfigurationId(Long id){
        this.configurationId = id;
    }
**/
    public void setProperty(String name){
        this.property = name;
    }

    public void setValor(String value){
        this.value = value;

    }
    
}
