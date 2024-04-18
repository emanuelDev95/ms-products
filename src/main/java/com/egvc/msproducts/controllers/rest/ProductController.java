package com.egvc.msproducts.controllers.rest;

import com.egvc.msproducts.dtos.MessageResponse;
import com.egvc.msproducts.dtos.ProductDTO;
import com.egvc.msproducts.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;


    @PostMapping()
    public ResponseEntity<MessageResponse<ProductDTO>> save(@RequestBody ProductDTO entity) {

        return ResponseEntity.status(HttpStatus.CREATED)
        .body(new MessageResponse<>(
            "Almacenado Exitosamente", 
            HttpStatus.CREATED.value(), 
            this.productService.save(entity)));
    }

    @GetMapping()
    public ResponseEntity<MessageResponse<List<ProductDTO>>> getAllPersons() {
        return ResponseEntity.ok(new MessageResponse<>(
            "OK", HttpStatus.OK.value(),
            this.productService.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MessageResponse<ProductDTO>> getById(@PathVariable @NonNull Long id) {
        return ResponseEntity.ok(MessageResponse.<ProductDTO>builder()
                .message("Exito")
                .statusCode(HttpStatus.OK.value())
                .data(this.productService.getById(id))
                .build());


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageResponse<Void>> deleteById(@PathVariable @NonNull Long id){
        this.productService.delete(id);
        return ResponseEntity.ok(MessageResponse.<Void>builder()
                .statusCode(HttpStatus.OK.value())
                .message("Eliminado Exitosamente")
                .build());

    }

    @PutMapping("/{id}")
    public ResponseEntity<MessageResponse<ProductDTO>> update(@RequestBody ProductDTO productDTO,
                                                              @PathVariable @NonNull Long id) {
        return ResponseEntity.ok(MessageResponse.<ProductDTO>builder()
                .message("Exito")
                .statusCode(HttpStatus.OK.value())
                .data(this.productService.update(productDTO,id))
                .build());


    }


}