package com.addressservice.demo.model;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "addresses")
public class Address {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column @NotNull(message = "FirstName is required")
	@Size(min=2, message ="FirstName must not be less than 2 characters")
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	@NotNull(message = "StreetName is required")
	private String streetName;
	
	@Column
	@Nullable
	private String houseNumber;
	
	@Column
	@NotNull(message = "Zipcode is required")
	@Size(min=5, message ="Zipcode must have minimum 5 digit")
	@Size(max = 9, message ="Zipcode must have maximum 9 digit")
	private String zipCode;
	
	@Column
	@NotNull(message = "Location is required")
	private String location;
	
	Address(String streetName, String houseNumber){
		this.streetName= streetName;
		this.houseNumber= houseNumber;
	}
	
	 public String getStreetandHouseNumber() {
		    return this.streetName + " " + this.houseNumber;
		  }

		  public void setName(String name) {
		    String[] parts = name.split(" ");
		    this.houseNumber= parts[0];
		    this.streetName = parts[1];
		  }
		  
		  
	}
	

