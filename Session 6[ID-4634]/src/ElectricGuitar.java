
public class ElectricGuitar extends StringedInstrument
{
	int beats=80;
	int numberOfStrings=10;
	@Override
	void play()
	{
		System.out.println("Play the instruments with"+beats+" beats");
	}
	void lutes()
	{
		System.out.println("Electric Guitar with "+numberOfStrings+" number of strings");
	}
}
