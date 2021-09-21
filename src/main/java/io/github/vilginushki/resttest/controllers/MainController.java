package io.github.vilginushki.resttest.controllers;

import io.github.vilginushki.resttest.exceptions.EmployeeNotFoundException;
import io.github.vilginushki.resttest.models.Employee;
import io.github.vilginushki.resttest.repos.EmployeeRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    //Class with all listeners for requests

    //Our repo
    private final EmployeeRepo repo;

    //constructor which creates repo
    public MainController(EmployeeRepo repo) {
        this.repo = repo;
    }

    //Get all employees list
    @GetMapping("/employees")
    public @ResponseBody
    List<Employee> all() {
        return repo.findAll();
    }

    //Get single employee
    @GetMapping("/employees/{id}")
    public @ResponseBody
    Employee one(@PathVariable Long id) {
        return repo.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    //Delete one employee
    @DeleteMapping("/employees/{id}")
    ResponseEntity<?> deleteOne(@PathVariable Long id) {
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    //Creates one employee
    @PostMapping("/employees")
    ResponseEntity<String> newOne(@RequestBody Employee e) {
        Long id = repo.findMaxId() + 1;
        e.setId(id);
        repo.save(e);
        return ResponseEntity.created(null)
                .body("Employee added");
    }

    //Edit employee
    @PutMapping("/employees/{id}")
    ResponseEntity<Employee> editOne(@PathVariable Long id, @RequestBody Employee e) {
        e.setId(id);
        repo.save(e);
        return ResponseEntity.ok(e);
    }
}
