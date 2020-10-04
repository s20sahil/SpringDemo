package com.addressservice.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.addressservice.demo.model.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

	Address findByFirstName(String firstname);

}
