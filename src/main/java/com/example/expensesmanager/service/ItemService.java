package com.example.expensesmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.expensesmanager.entity.Item;
import com.example.expensesmanager.repository.ItemMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemService {

  private final ItemMapper itemMapper;

  @Transactional(readOnly = true)
  public List<Item> findAll() {
    return itemMapper.findAll();
  }

  @Transactional
  public int add(String name, int cost) {
    return itemMapper.insert(name, cost);
  }

}
