package com.cg.sprint;


import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

	import org.junit.jupiter.api.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.boot.test.mock.mockito.MockBean;

	import com.cg.sprint.model.AppUser;
	import com.cg.sprint.repository.AppUserRepository;
import com.cg.sprint.service.AppUserService;
	@SpringBootTest


	public class AppUserControllerTestsWithMockito {
		@Autowired
		AppUserRepository ar;

		@MockBean
		AppUserService as;

		 @Test
		public void testSave() {
			AppUser au = new AppUser();
			au.setUserId(24);
			au.setFirstName("Gayatri");
			au.setLastName("Shende");
			au.setPassword("Gs@1");
			au.setUserName("Gs");
		    au.setEmailId("Gs@12");
		    ar.save( au);
		    assertNotNull(ar.findById(9).get());
		}

	@Test
     public void testUpdate() {
		AppUser au = ar.findById(24).get();
		au.setPassword("Gs@1");
		ar.save(au);
		assertNotEquals("Gs@1",ar.findById(9).get().getPassword());
	}
	}
	

