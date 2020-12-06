package com.hoanganh.mapper;

import java.sql.ResultSet;

public interface RowMapper<T> {
	T rowMapper(ResultSet result);
}
