package com.example.expensesmanager.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.expensesmanager.entity.Item;
import com.example.expensesmanager.service.ItemService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

  private final ItemService itemService;

  @GetMapping
  public String listItems(Model model) {

    List<Item> items = itemService.findAll();

    model.addAttribute("items", items);

    return "item-list";
  }
}
