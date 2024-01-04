package id.ac.undiksha.siak.people;

import id.ac.undiksha.siak.organisasi.Prodi;

public class Mahasiswa extends Manusia {
	
	private String nim;
	
	public Mahasiswa() {
		super();
		this.nim	="<masukkan nim>";
	}

	public Mahasiswa(
			String nama, 
			String alamat, 
			String tanggalLahir, 
			boolean jenisKelamin, 
			
			String nim,
			String prodi
		) {
		super(nama, alamat, tanggalLahir, jenisKelamin);
		
		this.nim = nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public String getNim() {
		return this.nim;
	}

	public void printAll() {
		super.printAll();
		System.out.println (this.getNim());	
	}
	
	private Prodi prodi = new Prodi();

	public Prodi getProdi() {
		return prodi;
	}
	
	
}