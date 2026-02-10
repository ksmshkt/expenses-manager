package com.example.expensesmanager.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.expensesmanager.entity.Item;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ItemMapper {

  List<Item> findByYearAndMonth(@Param("year") int year, @Param("month") int month);

  Item insert(@Param("name") String name, @Param("cost") Integer cost);

  Item selectById(@Param("id") Long id);

  int update(@Param("id") Long id, @Param("name") String name, @Param("cost") Integer cost);

  int delete(@Param("id") Long id);
}
