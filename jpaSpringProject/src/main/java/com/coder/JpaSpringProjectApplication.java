package com.coder;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.coder.dao.UserRepository;
import com.coder.entities.User;

@SpringBootApplication
public class JpaSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaSpringProjectApplication.class, args);
		
		UserRepository repository = context.getBean(UserRepository.class);
//		User user = new User();
//		user.setAge("22");
//	    user.setName("Vikash");
//		user.setStatus("UnMarried");
//	    User user2 = new User();
//		user2.setAge("24");
//	    user2.setName("Ankur");
//	    user2.setStatus("UnMarried");
//		User user3 = new User();
//		user3.setAge("24");	user3.setName("Ankur");
//	    user3.setStatus("UnMarried");
//		
		//update
//		Optional<User> fetchedUser = repository.findById(1);
//		System.out.println(fetchedUser);
//		User u = fetchedUser.get();
//	    u.setName("Ritik Singh");
//	    repository.save(u);
//		System.out.println(u);	
		
//		Iterable<User> users = repository.saveAll(List.of(user,user2,user3));
//		users.forEach(user4->{System.out.println(user4);});
		
		//deleteAll
//		repository.deleteAll();
		
		//deleteById
//		repository.deleteById(252);
//		System.out.println("deleted specific element");
		
//		Iterable users = repository.findAll();
//		List<User> userOneByOne = (List<User>)users;
//		userOneByOne.forEach(user->{System.out.println(user.getId());});
//		for(User u: userOneByOne)
//		{
//			System.out.println(u);
//		}
//		System.out.println("-----------------------------");
//		
//		
//		List<User> u = repository.findByName("Ankur");
//		u.forEach(user->{System.out.println(u);});
		
		
//        System.out.println("-----------------------------");
//		
//		
//		List<User> u3 = repository.findByNameAndByAge("Vikash","22");
//		u2.forEach(user5->{System.out.println(user5);});
		
		List<User> u3 = repository.findByNameAndById("Vikash",302);
		u3.forEach(user5->{System.out.println(user5);});
		
	}

}
