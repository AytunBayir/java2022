package inheritanceDemo;

public class Main {
	// yazýlýmda en önemli þey deðiþimdir ve deðiþime direnmeyen programlar
	// yazýlmalýdýr.
	//if yapýlarý çok kullanmaktan kaçýnýlmalýdýr.
	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
