public class SimulacionVehiculo implements Runnable {
	private Aparcamiento aparcamiento;

	public SimulacionVehiculo(Aparcamiento aparcamiento) {
		this.aparcamiento = aparcamiento;
	}

	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 800000; i++)
			{
				aparcamiento.entrarCoche();

				//aparcamiento.salirCoche();
			}

		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}