package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
	
@Id
@GeneratedValue
private int id;	
private String nome;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

}
