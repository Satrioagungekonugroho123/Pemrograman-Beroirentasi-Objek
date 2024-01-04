package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Manusia;
import id.ac.undiksha.siak.people.Dosen;


public class Main {
	
	public static void main(String[] args) { 
		
		Dosen andre = new Dosen();
		
		andre.setNip("45678");
		andre.setNama("Andre");
		andre.setAlamat("Klungkung");
		andre.setTanggalLahir("30 November 1980");
		andre.setJenisKelamin(false);
		andre.setMatakuliah("Mata Kuliah: Pemrograman Berorientasi Objek");
		
		System.out.println ("-------------------------------");	
		
		System.out.println (andre.getNip());
		System.out.println (andre.getNama());
		System.out.println (andre.getAlamat());
		System.out.println (andre.getTanggalLahir());
		System.out.println (andre.getJenisKelamin());
		System.out.println (andre.getMatakuliah());
		
		System.out.println ("-------------------------------");	
		
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.printAll();
		mhs1.getProdi().setKodeProdi("10");
		mhs1.getProdi().setNamaProdi("ILKOM");
		
		System.out.println ("-------------------------------");	
		
		Mahasiswa siti = new Mahasiswa(
				"Siti",
				"Singaraja",
				"09 Januari 2003",
				true,
				
				"1223",
				"ILKOM"
				);
		siti.printAll();
		
		System.out.println ("-------------------------------");	
		
		Dosen devi = new Dosen(
				"Devi",
				"Singaraja",
				"16 Juli 1990",
				true,
				
				"23145",
				"Mata Kuliah: Matematika"
				);
		devi.printAll();
		
		System.out.println ("-------------------------------");	
		
		Dosen dewi = new Dosen(
				"Dewi",
				"Singaraja",
				"26 Februari 1995",
				true,
				
				"22314",
				"Mata Kuliah: Aljabar Linear"
				);
		dewi.printAll();
		
		System.out.println ("-------------------------------");	
		
		Manusia mn1 = new Mahasiswa();
		mn1.printAll();
		
		System.out.println ("-------------------------------");		
	}
}
