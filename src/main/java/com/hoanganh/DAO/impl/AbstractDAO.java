package com.hoanganh.DAO.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.hoanganh.DAO.GenericDAO;
import com.hoanganh.mapper.RowMapper;

public class AbstractDAO implements GenericDAO {
	public Connection getConnection() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/servlet_jsp_SM";
		String user = "root";
		String password = "2442000";
		try {
			Class.forName(driverName);
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void setParameter(PreparedStatement statement, Object... parameters) {
		try {
			for (int i = 0; i < parameters.length; i++) {
				int index = i+1;
				Object parameter = parameters[i];
				if (parameter instanceof Long) {
					statement.setLong(index, (Long) parameter);
				} else if (parameter instanceof String) {
					statement.setString(index, (String) parameter);
				} else if (parameter instanceof Integer) {
					statement.setInt(index, (int) parameter);
				} else if (parameter instanceof Timestamp) {
					statement.setTimestamp(index, (Timestamp) parameter);
				} else if (parameter == null) {
					statement.setNull(index, Types.NULL);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters){
		List<T> results = new ArrayList<>();
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet result = null;
		try {
			statement = connection.prepareStatement(sql);
			setParameter(statement, parameters);
			result = statement.executeQuery();
			while(result.next()) {
				results.add(rowMapper.rowMapper(result));
			}
			return results;
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}

				if (connection != null) {
					connection.close();
				}
				if (result != null) {
					result.close();
				}
			} catch (SQLException se) {
				return null;

			}
		}
	}

	@Override
	public Long save(String sql, Object... parameters) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		ResultSet result = null;
		Long id = null;
		try{
			connection.setAutoCommit(false);
			statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			setParameter(statement,parameters);
			statement.executeUpdate();
			result = statement.getGeneratedKeys();
			while(result.next()){
				id = result.getLong(1);
			}
			connection.commit();
			return id;
		} catch(SQLException e){
			if(connection!=null){
				try {
					connection.rollback();
				} catch (SQLException throwables) {
					throwables.printStackTrace();
					return null;
				}
			}
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}

				if (connection != null) {
					connection.close();
				}
				if (result != null) {
					result.close();
				}
			} catch (SQLException se) {
				return null;

			}
		}


	}
}
