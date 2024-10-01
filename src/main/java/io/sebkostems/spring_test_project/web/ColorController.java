package io.sebkostems.spring_test_project.web;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.sebkostems.spring_test_project.model.Color;

@RestController
@RequestMapping("/color")
public class ColorController {
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Color> getColors() {
        return null;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Color> getColor(@PathVariable("id") final Integer id) {
        return null;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Color> addColor(@RequestBody final Color color) {
        return ResponseEntity.ok(null);
    }
}
