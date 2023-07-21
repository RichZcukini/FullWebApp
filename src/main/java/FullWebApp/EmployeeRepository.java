package FullWebApp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}