package com.OnDemandCarWash;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.OnDemandCarWash.model.Washer;
import com.OnDemandCarWash.repository.WasherRepository;
import com.OnDemandCarWash.resource.WasherController;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes= {CarWashManagerApplicationTests.class})
public class CarWashManagerApplicationTests {
	
@Mock
WasherRepository washerrepository;

@InjectMocks
WasherController washercontroller;

public List<Washer> washer;

@Test
public void test_getAllWashers() {
	List<Washer> washer=new ArrayList<Washer>();
	washer.add(new Washer(0,"AAA","A",10000,true,3));
	
	when(washerrepository.findAll()).thenReturn(washer);
	  assertEquals(1,washercontroller.getBooks().size());
   }

}
