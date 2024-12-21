package java17com.java.sealedclasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java17.sealedclasses.Car;

class CarTest {

	@Test
	public void getCarAgeTest() {
		Car car = new Car();
		assertEquals(2, car.getCarAge(2022));
	}

}
