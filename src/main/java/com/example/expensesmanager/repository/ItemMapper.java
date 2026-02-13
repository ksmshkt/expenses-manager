package com.example.expensesmanager.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.expensesmanager.entity.Item;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ItemMapper {

  List<Item> findByYearAndMonth(@Param("year") int year, @Param("month") int month);

  Item insert(@Param("name") String name, @Param("cost") Integer cost, @Param("createdAt") LocalDateTime createdAt);

  Item selectById(@Param("id") Long id);

  int update(@Param("id") Long id, @Param("name") String name, @Param("cost") Integer cost, @Param("createdAt") LocalDateTime createdAt);

  int delete(@Param("id") Long id);
}
