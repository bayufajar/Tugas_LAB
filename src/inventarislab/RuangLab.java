package inventarislab;

public class RuangLab {
	private String jurusan;
	private String fakultas;
	private char lab;
	private double panjang;
	private double lebar;
	
	public RuangLab(String jurusan, String fakultas, char lab, double panjang, double lebar){
		System.out.println("Ruang Lab telah dibuat !");
		this.jurusan = jurusan;
		this.fakultas = fakultas;
		this.lab = lab;
		this.panjang = panjang;
		this.lebar = lebar;
		System.out.println("LAB "+lab+" fakultas "+fakultas+" jurusan "+jurusan);
		System.out.println("panjang "+panjang+" m");
		System.out.println("lebar "+lebar+" m");
	}
	
	
}
