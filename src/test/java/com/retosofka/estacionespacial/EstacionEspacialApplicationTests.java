package com.retosofka.estacionespacial;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
class EstacionEspacialApplicationTests {

/*
	@Autowired private NaveRepository repo;

	@Test
	public void testAddNew() {
		NaveTripulada nave1 = new NaveTripulada();
		nave1.setNombre("Urano 3");
		nave1.setOrbita(3500.0);

		NaveTripulada saveNave = repo.save(nave1);
	}
*/

}
