package smartHomeSocket;

import java.io.Serializable;
import java.util.ArrayList;

public class Casa implements Serializable{
	
	private ArCondicionado ar;
	private Geladeira geladeira;
	private ArrayList<Lampada> lamp;
	private TV tv;
	private ArrayList<Irrigador> irrigador;
	
	Casa(){
		this.ar = new ArCondicionado();
		this.geladeira = new Geladeira();
		this.lamp = new ArrayList<Lampada>(10);
		this.tv = new TV();
		this.irrigador = new ArrayList<Irrigador>(5);
		this.addIrri(1);
		this.addLamp(1);
		this.addLamp(2);
	}
	
	public TV getTV() {
		return this.tv;
	}
	
	public Lampada getLamp(int index) {
		return this.lamp.get(index);
	}
	
	public void addLamp(int i) {
		Lampada l = this.lamp.get(i);
		l = new Lampada();
	}
	
	public Irrigador getIrri(int index) {
		return this.irrigador.get(index);
	}
	
	public void addIrri(int i) {
		Irrigador irrigador = this.irrigador.get(i);
		irrigador = new Irrigador();
	}
	
	public ArCondicionado getAr() {
		return this.ar;
	}
	
	public Geladeira getGela() {
		return this.geladeira;
	}
	
	private void printLamp() {
		for(int i = 0; i < this.lamp.size(); i++) {
			System.out.println(lamp.get(i));
			System.out.println("---------------------------------------------------");
		}
	}
	
	private void printIrri() {
		for(int i = 0; i < this.irrigador.size(); i++) {
			System.out.println(irrigador.get(i));
			System.out.println("---------------------------------------------------");
		}
	}
	
	public void printCasa() {
		System.out.println("Status atual da casa: OK");
		System.out.println("Status dos dispositivos conectados:");
		System.out.println("---------------------------------------------------");
		this.getGela().printStats();
		System.out.println("---------------------------------------------------");
		this.getAr().printStats();
		System.out.println("---------------------------------------------------");
		this.getTV().printStats();
		System.out.println("---------------------------------------------------");
		this.printLamp();
		this.printIrri();
	}
}
