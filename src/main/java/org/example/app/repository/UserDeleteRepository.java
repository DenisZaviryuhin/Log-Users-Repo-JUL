package org.example.app.repository;

import org.example.app.database.DBConn;
import org.example.app.utils.Constants;
import org.example.app.entity.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDeleteRepository {

    private static final Logger LOGGER =
            Logger.getLogger(UserDeleteRepository.class.getName());

    public String deleteUser(User user) {

        String sql = "DELETE FROM " + Constants.TABLE_USERS + " WHERE id = ?";

        try (PreparedStatement stmt = DBConn.connect().prepareStatement(sql)) {
            stmt.setInt(1, user.getId());
            stmt.executeUpdate();
            return Constants.DATA_DELETE_MSG;
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, Constants.LOG_DB_ERROR_MSG);
            return e.getMessage();
        }
    }
}
