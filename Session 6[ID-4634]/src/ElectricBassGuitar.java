
public class ElectricBassGuitar extends StringedInstrument
{
	int beats=70;
	int numberOfStrings=10;
	@Override
	void play()
	{
		System.out.println("Play the instruments with"+beats+" beats");
	}
	void lutes()
	{
		System.out.println("Electric bass Guitar with "+numberOfStrings+" number of strings");
	}
}
