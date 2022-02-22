package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DriversManagerTest {
	
	private DriversManager dm=new DriversManager();
	private Passenger pasajero1=new Passenger("Jose","3A");
	private Driver driver= new Driver("Carlos", "A1", 30);
	
	@Test
	void testAddPassenger() {
		dm.addPassenger(pasajero1);
		assertEquals(pasajero1,dm.getPassenger(pasajero1.getId()));
		
	}

	@Test
	void testAddDriver() {
		dm.addDriver(driver);
		assertEquals(driver,dm.getDriver(driver.getId()));
	}

	@Test
	void testGetDriver() {
		dm.addDriver(driver);
		assertNotEquals(null,dm.getDriver(driver.getId()));
	}

}
