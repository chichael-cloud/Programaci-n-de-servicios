public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("ParkingNet España");

        Aparcamiento apMadrid = new Aparcamiento("Madrid", "Parking Gran Vía", 300000000);
        Aparcamiento apBarcelona = new Aparcamiento("Barcelona", "Parking Ramblas", 200000000);

        empresa.registrarAparcamiento(apMadrid);
        empresa.registrarAparcamiento(apBarcelona);


        System.out.println("Iniciando simulación de tráfico en Madrid...");
        
        Thread vehiculo1 = new Thread(new SimulacionVehiculo(apBarcelona  ), "Vehiculo-" + 1);
        vehiculo1.start();

      
        Thread vehiculo2 = new Thread(new SimulacionVehiculo(apBarcelona  ), "Vehiculo-" + 2);
        vehiculo2.start();

        try {
			vehiculo1.join();
			vehiculo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
        empresa.consultaGeneral();
    }
}