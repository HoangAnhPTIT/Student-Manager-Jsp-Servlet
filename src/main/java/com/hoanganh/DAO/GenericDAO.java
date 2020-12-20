package com.hoanganh.DAO;

import com.hoanganh.mapper.RowMapper;

import java.util.List;

public interface GenericDAO {
    <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
    Long save(String sql, Object... parameters);
}
