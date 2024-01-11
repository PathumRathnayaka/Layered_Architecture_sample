package lk.ijse.layeredarchitecture.dao.custom;

import lk.ijse.layeredarchitecture.dao.SuperDAO;
import lk.ijse.layeredarchitecture.dto.CustomDTO;

public interface QueryDAO extends SuperDAO {
    void customerOrderDetails(CustomDTO customDTO);
}
