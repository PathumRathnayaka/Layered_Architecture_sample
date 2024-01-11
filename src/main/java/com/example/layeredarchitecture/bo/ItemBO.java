package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dto.ItemDTO;

import java.sql.SQLException;

public interface ItemBO extends SuperBO{
    String genarateNewId() throws SQLException, ClassNotFoundException;
    boolean UpdateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException;
    public boolean existItem(String code) throws SQLException, ClassNotFoundException;
    public String genarateId() throws SQLException, ClassNotFoundException;
    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;
    public void update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
}
