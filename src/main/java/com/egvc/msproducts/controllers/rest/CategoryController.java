package com.egvc.msproducts.controllers.rest;

import com.egvc.msproducts.dtos.CategoryDto;
import com.egvc.msproducts.dtos.MessageResponse;
import com.egvc.msproducts.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/categories")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;


    @PostMapping()
    public ResponseEntity<MessageResponse<CategoryDto>> save(@RequestBody CategoryDto entity) {

        return ResponseEntity.status(HttpStatus.CREATED)
        .body(new MessageResponse<>(
            "Almacenado Exitosamente",
            HttpStatus.CREATED.value(),
            this.categoryService.save(entity)));
    }

    @GetMapping()
    public ResponseEntity<MessageResponse<List<CategoryDto>>> getAllPersons() {
        return ResponseEntity.ok(new MessageResponse<>(
            "OK", HttpStatus.OK.value(),
            this.categoryService.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MessageResponse<CategoryDto>> getById(@PathVariable @NonNull Long id) {
        return ResponseEntity.ok(MessageResponse.<CategoryDto>builder()
                .message("Exito")
                .statusCode(HttpStatus.OK.value())
                .data(this.categoryService.getById(id))
                .build());


    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageResponse<Void>> deleteById(@PathVariable @NonNull Long id){
        this.categoryService.delete(id);
        return ResponseEntity.ok(MessageResponse.<Void>builder()
                .statusCode(HttpStatus.OK.value())
                .message("Eliminado Exitosamente")
                .build());

    }

    @PutMapping("/{id}")
    public ResponseEntity<MessageResponse<CategoryDto>> update(@RequestBody CategoryDto productDTO,
                                                              @PathVariable @NonNull Long id) {
        return ResponseEntity.ok(MessageResponse.<CategoryDto>builder()
                .message("Exito")
                .statusCode(HttpStatus.OK.value())
                .data(this.categoryService.update(productDTO,id))
                .build());


    }


}