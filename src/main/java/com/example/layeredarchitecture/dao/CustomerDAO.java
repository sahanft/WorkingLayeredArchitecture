package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {
     ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;
     boolean saveCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException;

    boolean updateCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException;

   boolean existCustomer(String id) throws SQLException, ClassNotFoundException;

    boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    String generateNewId() throws SQLException, ClassNotFoundException;
     CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;
     ArrayList<String> getCustomerIds() throws SQLException, ClassNotFoundException;
}
