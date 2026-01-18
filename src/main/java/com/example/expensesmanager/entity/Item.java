package com.example.expensesmanager.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Item {

  int id;

  String name;

  Integer cost;

  LocalDateTime createdAt;

}
