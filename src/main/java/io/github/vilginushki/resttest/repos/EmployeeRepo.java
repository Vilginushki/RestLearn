package io.github.vilginushki.resttest.repos;

import io.github.vilginushki.resttest.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Query(value = "select MAX(id) from employees", nativeQuery = true)
    Long findMaxId();
    //Employees repository, it handles communication between Postgres, and our models (Employee)
}
