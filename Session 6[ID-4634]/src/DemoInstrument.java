
public class DemoInstrument {

	public static void main(String[] args) {
		Instrument E1=new ElectricBassGuitar();
		Instrument E2 = new ElectricGuitar();
		StringedInstrument E3=new ElectricBassGuitar();
		StringedInstrument E4 = new ElectricGuitar();
		E1.play();
		E2.play();
		E3.play();
		E3.lutes();
		E4.play();
		E4.lutes();
	}

}
