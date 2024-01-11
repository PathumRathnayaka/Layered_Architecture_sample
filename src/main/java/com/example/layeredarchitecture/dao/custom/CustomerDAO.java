package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.dto.CustomerDTO;
import com.example.layeredarchitecture.entity.Customer;

public interface CustomerDAO extends CrudDAO<Customer> {
     /*ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

     boolean saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;
     Object updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;
     boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;
     String generateNewId() throws SQLException, ClassNotFoundException;
     public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;*/

}
