package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO {
     ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

     boolean deleteItem(String code) throws SQLException, ClassNotFoundException;

     boolean saveItem(ItemDTO item) throws SQLException, ClassNotFoundException;

     boolean updateItem(ItemDTO item) throws SQLException, ClassNotFoundException;

     boolean existItem(String code) throws SQLException, ClassNotFoundException;
     String searchItem() throws SQLException, ClassNotFoundException;
      ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;
      ArrayList<String> getItemCodes() throws SQLException, ClassNotFoundException;
}
