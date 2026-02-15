package io.moneylog.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import io.moneylog.entity.Category;
import io.moneylog.repository.CategoryMapper;

@Service
@RequiredArgsConstructor
public class CategoryService {

  private final CategoryMapper categoryMapper;

  public List<Category> findAll() {
    return categoryMapper.findAll();
  }
}