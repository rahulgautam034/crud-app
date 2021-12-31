package com.crudapp;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.crudapp.dao.EmployeesRepository;
import com.crudapp.entity.Employees;

/**
 * employee test cases
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest

public class FlightTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private EmployeesRepository employeeRepository;

	/**
	 * find by email test
	 */
	@Test
	public void findByEmailTest() {
		String email = "Doe@gmail.com";

		Employees employee1 = new Employees();
		employee1.setId(1);
		employee1.setEmail(email);
		employee1.setFirstName("test");
		employee1.setLastName("user");
		entityManager.persist(employee1);
		entityManager.flush();

		Employees employees = employeeRepository.findByEmail(email);
		Assert.assertNotNull(employees);
		Assert.assertEquals(email, employees.getEmail());

	}

	/**
	 * find all list of employees
	 */
	@Test
	public void findAllEmployeeTest() {
		String email = "Doe@gmail.com";
		Employees employee1 = new Employees();
		employee1.setId(1);
		employee1.setEmail(email);
		employee1.setFirstName("test");
		employee1.setLastName("user");
		entityManager.persist(employee1);
		entityManager.flush();

		List<Employees> list = employeeRepository.findAll();
		Assert.assertNotNull(list);
		Assert.assertTrue(!list.isEmpty());

	}

}
