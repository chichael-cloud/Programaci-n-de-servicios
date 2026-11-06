package parallelprocessing.parkinglot;
public class parallelParkAcces {
	
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Aparcamineto Parking1 = new Aparcamiento("park1", 0, 0);
		Aparcamiento Parking2 = new Aparcamiento("park5", 100, 0);
		ParkingCompany company = new ParkingCompany("manuel_parking");
		company.addParking(parking1);
	}
	

}
