package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	//baseloggernabager daki calculate metodunu ogrencikredimanager icin ezmis yani override etmis olduk
	public double calculate(double total) {
		return total*1.10;
	}
}
