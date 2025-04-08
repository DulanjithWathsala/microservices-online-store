package edu.orgname.microservices.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "inventory", url = "${inventory.url}")
public interface InventoryClient {

    @GetMapping("/api/inventory/v1")
    boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity);
}
