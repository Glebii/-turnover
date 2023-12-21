package com.example.appliances.api;

import com.example.appliances.model.request.SupplyRequest;
import com.example.appliances.model.response.SupplyResponse;
import com.example.appliances.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/providers")
public class SupplyApi {

    private final SupplyService supplyService;

    @Autowired
    public SupplyApi(SupplyService supplyService) {
        this.supplyService = supplyService;
    }

    @PostMapping
    public ResponseEntity<SupplyResponse> createProvider(@RequestBody SupplyRequest supplyRequest) {
        SupplyResponse createdSaleItem = supplyService.create(supplyRequest);
        return new ResponseEntity<>(createdSaleItem, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplyResponse> getProviderById(@PathVariable Long id) {
        SupplyResponse saleItem = supplyService.findById(id);
        return new ResponseEntity<>(saleItem, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupplyResponse> updateProvider(@RequestBody SupplyRequest supplyRequest, @PathVariable Long id) {
        SupplyResponse updatedSaleItem = supplyService.update(supplyRequest, id);
        return new ResponseEntity<>(updatedSaleItem, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<SupplyResponse>> getAllProviders() {
        List<SupplyResponse> saleItems = supplyService.findAll();
        return new ResponseEntity<>(saleItems, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProvider(@PathVariable Long id) {
        supplyService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}