package io.github.vilginushki.resttest.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
    //I guess it's only to generate that communicate
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
