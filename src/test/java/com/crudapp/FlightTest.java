package com.crudapp;

import java.util.List;

import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.crudapp.dao.EmployeesRepository;
import com.crudapp.entity.Employees;

@RunWith(SpringRunner.class)
@DataJpaTest
public class FlightTest {

	@Autowired
	private TestEntityManager entityManager;

//	@Autowired
//	private EmployeesRepository employeeRepository;

	@Test
	public void findByEmailTest() {
		// given
		String email = "Doe@gmail.com";

		Employees employee1 = new Employees();
		employee1.setId(1);
		employee1.setEmail(email);
		employee1.setFirstName("test");
		employee1.setLastName("user");
//        entityManager.getEntityManager().getTransaction().begin();
		entityManager.persist(employee1);
		entityManager.flush();
//        Employees employee2 = employeeRepository.findByEmail(email);

//		Employees result  = 
//		Query query = entityManager.getEntityManager().createQuery("select e from employee e where e.email=:email");
//        entityManager.getEntityManager().getTransaction().commit();
//		query.setParameter(email, email);
//        Assert.assertNotNull(employee2);
//        Assert.assertEquals(employee2.getEmail(),email);
//		List list = query.getResultList();
//		System.out.println(list);

	}

}
