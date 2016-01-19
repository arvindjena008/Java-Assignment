
public class StringedInstrument extends Instrument
{
	int beats=100;
	int numberOfStrings=6;
	@Override
	void play()
	{
		System.out.println("Play the instruments with"+beats+" beats");
	}
	void lutes()
	{
		System.out.println("Instruments that support the strings via a neck with "+numberOfStrings+" number of strings");
	}
}
