package io.moneylog.dto;

import io.moneylog.entity.Item;

import java.util.List;

public record ItemSummary(
        List<Item> items,
        int totalCost
) {
}