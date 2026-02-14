package io.moneylog.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Item {

  Long id;

  String name;

  Integer cost;

  LocalDate spentAt;

}
