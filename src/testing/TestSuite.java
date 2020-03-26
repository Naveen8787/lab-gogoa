package testing;

//Uncomment the below code to test your application

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import services.Booking;
import services.FareCalculator;

@RunWith(Suite.class)
@SuiteClasses({ TestBooking.class, TestBus.class, TestFareCalculator.class, TestFlight.class, TestHotel.class,
		TestTrain.class })
public class TestSuite {

}

