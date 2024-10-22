package Objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Quartos {
	private static Scanner scan = new Scanner(System.in);
	private Integer codQuarto;
	private Integer tipoQuarto;
	private Double valor;
	private Boolean status;
	private static List<Quartos> listaQuarto = new ArrayList<Quartos>();
	
	public Quartos(Integer codQuarto, Integer tipoQuarto, Double valor) {
		super();
		this.codQuarto = codQuarto;
		this.tipoQuarto = tipoQuarto;
		this.valor = valor;
		this.status = false;
	}

	@Override
	public String toString() {
		return "Quartos [codQuarto=" + codQuarto + ", tipoQuarto=" + tipoQuarto + ", valor=" + valor + ", status="
				+ status + "]";
	}
	
	public Integer getCodQuarto() {
		return codQuarto;
	}
	public void setCodQuarto(Integer codQuarto) {
		this.codQuarto = codQuarto;
	}
	public Integer getTipoQuarto() {
		return tipoQuarto;
	}
	public void setTipoQuarto(Integer tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public static void cadastroQuartos() {
		System.out.println("Digete o codigo do quarto");
		Integer cod = scan.nextInt();
		System.out.println("Digite 1 - para solteiro \n"
				+ "2 - para casal \n"
				+ "3 - para suite");
		Integer tipo = scan.nextInt();
		System.out.println("Digete a diaria do quarto");
		Double valor = scan.nextDouble();
		listaQuarto.add(new Quartos(cod, tipo, valor)); 
		}

	public static void visualizaQuarto() {
	            for (Quartos listaQuarto : listaQuarto) {
	                System.out.println(listaQuarto);
	            }
	}

	public static void checkInPegaCod() {
		System.out.println("informe codigo do quarto");
		Integer cod = scan.nextInt();
		checkIn(cod);
	}
	
	public static void checkIn(Integer cod) {
		for (Quartos listaQuarto : listaQuarto) {
            if(listaQuarto.codQuarto == cod) {
            	listaQuarto.status = true;
            }
        }
	}
	
	public static void checkOutPegaCod() {
		System.out.println("informe codigo do quarto");
		Integer cod = scan.nextInt();
		checkOut(cod);
	}
	
	public static void checkOut(Integer cod) {
		for (Quartos listaQuarto : listaQuarto) {
            if(listaQuarto.codQuarto == cod) {
            	listaQuarto.status = false;
            }
        }
	}

	public static void visualizaQuartoCod(Integer nQuartos) {
		for (Quartos listaQuarto : listaQuarto) {
			if(listaQuarto.codQuarto == nQuartos) {
            System.out.println(listaQuarto);
			}
		}
	}
}
