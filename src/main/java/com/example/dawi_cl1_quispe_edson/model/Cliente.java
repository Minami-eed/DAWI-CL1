package com.example.dawi_cl1_quispe_edson.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private int id_cliente;

	@Column(name = "nom_cliente")
	private String nom_cliente;

	@ManyToOne
	@JoinColumn(name = "id_area")
	@NotNull(message = "Selecciona un Area")
	private Areas area;

	@Pattern(regexp = "[0-9]{9}", message = "Solo se aceptan 9 dígitos")
	@Column(name = "numero_cliente")
	private String numero_cliente;

	@Column(name = "edad_cliente")
	private int edad_cliente;

	@Column(name = "correo_cliente")
	private String correo_cliente;

	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nom_cliente=" + nom_cliente + ", area=" + area
				+ ", numero_cliente=" + numero_cliente + ", edad_cliente=" + edad_cliente + ", correo_cliente="
				+ correo_cliente + "]";
	}

	public Cliente() {
	}

	public Cliente(int id_cliente, String nom_cliente, @NotNull(message = "Selecciona un Area") Areas area,
			@Pattern(regexp = "[0-9]{9}", message = "Solo se aceptan 9 dígitos") String numero_cliente,
			int edad_cliente, String correo_cliente) {
		this.id_cliente = id_cliente;
		this.nom_cliente = nom_cliente;
		this.area = area;
		this.numero_cliente = numero_cliente;
		this.edad_cliente = edad_cliente;
		this.correo_cliente = correo_cliente;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNom_cliente() {
		return nom_cliente;
	}

	public void setNom_cliente(String nom_cliente) {
		this.nom_cliente = nom_cliente;
	}

	public Areas getArea() {
		return area;
	}

	public void setArea(Areas area) {
		this.area = area;
	}

	public String getNumero_cliente() {
		return numero_cliente;
	}

	public void setNumero_cliente(String numero_cliente) {
		this.numero_cliente = numero_cliente;
	}

	public int getEdad_cliente() {
		return edad_cliente;
	}

	public void setEdad_cliente(int edad_cliente) {
		this.edad_cliente = edad_cliente;
	}

	public String getCorreo_cliente() {
		return correo_cliente;
	}

	public void setCorreo_cliente(String correo_cliente) {
		this.correo_cliente = correo_cliente;
	}

}
