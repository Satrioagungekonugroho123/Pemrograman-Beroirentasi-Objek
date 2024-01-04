package id.ac.undiksha.siak.people;

public class Dosen extends Manusia{
	
	private String nip;
	private String matakuliah;
	
	public Dosen() {
		this.nip	="<masukkan nip>";
		this.matakuliah	="<masukkan matakuliah>";
	}
	
	public Dosen(
			String nama, 
			String alamat, 
			String tanggalLahir, 
			boolean jenisKelamin, 
			String nip, 
			String matakuliah
		) {
		super(nama, alamat, tanggalLahir, jenisKelamin);
		this.nip = nip;
		this.matakuliah = matakuliah;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public String getNip() {
		return this.nip;
	}


	public String getMatakuliah() {
		return matakuliah;
	}

	public void setMatakuliah(String matakuliah) {
		this.matakuliah = matakuliah;
	}
	
	public void printAll() {
		super.printAll();
		System.out.println (this.getNip());
		System.out.println (this.getMatakuliah());
		
	}

	
	
}