package com.example.layeredarchitecture.dao.impl;

import com.example.layeredarchitecture.dao.SqlUtil;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.db.DBConnection;
//import com.example.layeredarchitecture.dto.CustomerDTO;
import com.example.layeredarchitecture.entity.Customer;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {
    private Customer customer;

    // CustomerDTO customerDTO = new CustomerDTO();

    public ArrayList<Customer> getAll() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM Customer");
        ArrayList<Customer> getAllCustomer=new ArrayList<>();

        while (rst.next()){
            Customer customerDTO = new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"));
            getAllCustomer.add(customerDTO);
        }
        return getAllCustomer;
    }

    public boolean save(Customer customer) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO Customer (id,name, address) VALUES (?,?,?)");
        pstm.setString(1, customerDTO.getId());
        pstm.setString(2, customerDTO.getName());
        pstm.setString(3, customerDTO.getAddress());*/
        return SqlUtil.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",customer.getId(),customer.getName(),customer.getAddress());

    }
    public boolean update(Customer customer) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("UPDATE Customer SET name=?, address=? WHERE id=?");
        pstm.setString(1, customerDTO.getName());
        pstm.setString(2, customerDTO.getAddress());
        pstm.setString(3, customerDTO.getId());
        pstm.executeUpdate();*/
        return SqlUtil.execute("UPDATE Customer SET name=?, address=? WHERE id=?",customer.getName(),customer.getAddress(),customer.getId());


    }
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("DELETE FROM Customer WHERE id=?");
        pstm.setString(1, id);
        boolean isDeleted= pstm.executeUpdate()>0;
        return isDeleted;*/
        return SqlUtil.execute("DELETE FROM Customer WHERE id=?",id);

    }
    public String generateNewId() throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        ResultSet rst = connection.createStatement().executeQuery("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");*/
        ResultSet rst= SqlUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        String id = null;
        if (rst.next()) {
            id = rst.getString("id");
            return id;
        } else {
            return id;

        }
    }
    @Override
    public Customer search(String id) throws SQLException, ClassNotFoundException {

        ResultSet rst = SqlUtil.execute("SELECT * FROM Customer WHERE id=?");
        rst.next();
        return new Customer(id + "", rst.getString("name"), rst.getString("address"));
    }

    @Override
    public boolean exist(String code) throws SQLException, ClassNotFoundException {
        return false;
    }
}
