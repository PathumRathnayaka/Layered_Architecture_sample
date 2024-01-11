package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dto.CustomerDTO;
import com.example.layeredarchitecture.dto.ItemDTO;
import com.example.layeredarchitecture.dto.OrderDetailDTO;
import com.example.layeredarchitecture.entity.Customer;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface PlaceOrderBO extends SuperBO{
    public boolean saveOrder(String orderId, LocalDate orderDate, String customerId, List<OrderDetailDTO> orderDetails);
    public ItemDTO findItem(String code);
    public Customer searchCustomer(String id) throws SQLException, ClassNotFoundException;
    public ItemDTO searchItem(String id) throws SQLException, ClassNotFoundException;
}
