package inheritanceDemo;

public class Main {
	// yaz�l�mda en �nemli �ey de�i�imdir ve de�i�ime direnmeyen programlar
	// yaz�lmal�d�r.
	//if yap�lar� �ok kullanmaktan ka��n�lmal�d�r.
	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
