package com.egvc.msproducts.controllers.rest;

import com.egvc.msproducts.dtos.BrandDto;
import com.egvc.msproducts.dtos.MessageResponse;
import com.egvc.msproducts.dtos.ProductDTO;
import com.egvc.msproducts.services.BrandService;
import com.egvc.msproducts.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/brands")
@AllArgsConstructor
public class BrandController {

    private final BrandService brandService;


    @PostMapping()
    public ResponseEntity<MessageResponse<BrandDto>> save(@RequestBody BrandDto entity) {

        return ResponseEntity.status(HttpStatus.CREATED)
        .body(new MessageResponse<>(
            "Almacenado Exitosamente", 
            HttpStatus.CREATED.value(), 
            this.brandService.save(entity)));
    }

    @GetMapping()
    public ResponseEntity<MessageResponse<List<BrandDto>>> getAllPersons() {
        return ResponseEntity.ok(new MessageResponse<>(
            "OK", HttpStatus.OK.value(),
            this.brandService.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MessageResponse<BrandDto>> getById(@PathVariable @NonNull Long id) {
        return ResponseEntity.ok(MessageResponse.<BrandDto>builder()
                .message("Exito")
                .statusCode(HttpStatus.OK.value())
                .data(this.brandService.getById(id))
                .build());


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageResponse<Void>> deleteById(@PathVariable @NonNull Long id){
        this.brandService.delete(id);
        return ResponseEntity.ok(MessageResponse.<Void>builder()
                .statusCode(HttpStatus.OK.value())
                .message("Eliminado Exitosamente")
                .build());

    }

    @PutMapping("/{id}")
    public ResponseEntity<MessageResponse<BrandDto>> update(@RequestBody BrandDto brandDto,
                                                              @PathVariable @NonNull Long id) {
        return ResponseEntity.ok(MessageResponse.<BrandDto>builder()
                .message("Exito")
                .statusCode(HttpStatus.OK.value())
                .data(this.brandService.update(brandDto,id))
                .build());


    }


}