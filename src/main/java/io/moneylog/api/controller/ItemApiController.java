package io.moneylog.api.controller;

import io.moneylog.api.response.ItemBaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.moneylog.api.request.ItemBaseRequest;
import io.moneylog.service.ItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor
public class ItemApiController {

  private final ItemService itemService;

  @PostMapping("/add")
  public ItemBaseResponse addItem(@RequestBody ItemBaseRequest itemBaseRequest) {
    ItemBaseResponse res = itemService.add(itemBaseRequest);

    return res;
  }

  @PutMapping("/{id}")
  public ItemBaseResponse updateItem(@PathVariable Long id, @RequestBody ItemBaseRequest itemBaseRequest) {
    ItemBaseResponse res = itemService.update(itemBaseRequest);

    return res;
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
    itemService.delete(id);

    return ResponseEntity.noContent().build();
  }

}