package Objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Reserva {
	private Integer diaCheckIn;
	private Integer mesCheckIn;
	private Integer diaCheckOut;
	private Integer mesCheckOut;
	private Integer hospede;
	private Integer nQuartos;
	private static List<Reserva> reservas = new ArrayList<Reserva>();
	private static Scanner scan = new Scanner(System.in);
	
	public Reserva(Integer diaCheckIn, Integer mesCheckIn, Integer diaCheckOut, Integer mesCheckOut, Integer hospede,
			Integer nQuartos) {
		super();
		this.diaCheckIn = diaCheckIn;
		this.mesCheckIn = mesCheckIn;
		this.diaCheckOut = diaCheckOut;
		this.mesCheckOut = mesCheckOut;
		this.hospede = hospede;
		this.nQuartos = nQuartos;
	}
	
	public Integer getDiaCheckIn() {
		return diaCheckIn;
	}
	public void setDiaCheckIn(Integer diaCheckIn) {
		this.diaCheckIn = diaCheckIn;
	}
	public Integer getMesCheckIn() {
		return mesCheckIn;
	}
	public void setMesCheckIn(Integer mesCheckIn) {
		this.mesCheckIn = mesCheckIn;
	}
	public Integer getDiaCheckOut() {
		return diaCheckOut;
	}
	public void setDiaCheckOut(Integer diaCheckOut) {
		this.diaCheckOut = diaCheckOut;
	}
	public Integer getMesCheckOut() {
		return mesCheckOut;
	}
	public void setMesCheckOut(Integer mesCheckOut) {
		this.mesCheckOut = mesCheckOut;
	}
	public Integer getHospede() {
		return hospede;
	}
	public void setHospede(Integer hospede) {
		this.hospede = hospede;
	}
	public Integer getnQuartos() {
		return nQuartos;
	}
	public void setnQuartos(Integer nQuartos) {
		this.nQuartos = nQuartos;
	}

	@Override
	public String toString() {
		return "Reserva [diaCheckIn=" + diaCheckIn + ", mesCheckIn=" + mesCheckIn + ", diaCheckOut=" + diaCheckOut
				+ ", mesCheckOut=" + mesCheckOut + ", hospede=" + hospede + ", nQuartos=" + nQuartos + ", tipoQuarto="
				 + "]";
	}
	
	public static void reserva() {
		System.out.println("dia de entrada");
		Integer diaIn = scan.nextInt();
		System.out.println("mes da entrada");
		Integer mesIn = scan.nextInt();
		System.out.println("dia da saida");
		Integer diaOut = scan.nextInt();
		System.out.println("mes da saida");
		Integer mesOut = scan.nextInt();
		System.out.println("codigo do Hospéde");
		Integer codCliente = scan.nextInt();
		System.out.println("codigo do quarto");
		Integer codQuarto = scan.nextInt();
		reservas.add(new Reserva(diaIn, mesIn, diaOut, mesOut, codCliente, codQuarto));
		Quartos.checkIn(codQuarto);
		}
	
	public static void visualizarReserva(Integer cod) {
		for (Reserva reservas : reservas) {
            if(reservas.hospede == cod) {
            	System.out.println(reservas);
            	Quartos.visualizaQuartoCod(reservas.nQuartos);
            }
        }
	}

	public static void ocupacao() {
		System.out.println("ocupação do mes 1 ao 3");
		for (Reserva reservas : reservas) {
            if(reservas.mesCheckIn <= 3) {
            	System.out.println(reservas);
            }
        }
		System.out.println("ocupação do mes 4 ao 6");
		for (Reserva reservas : reservas) {
            if(reservas.mesCheckIn <= 6 && reservas.mesCheckIn > 3) {
            	System.out.println(reservas);
            }
        }
		System.out.println("ocupação do mes 7 ao 9");
		for (Reserva reservas : reservas) {
            if(reservas.mesCheckIn <= 9 && reservas.mesCheckIn > 6) {
            	System.out.println(reservas);
            }
        }
		System.out.println("ocupação do mes 10 ao 12");
		for (Reserva reservas : reservas) {
            if(reservas.mesCheckIn <= 12 && reservas.mesCheckIn > 9) {
            	System.out.println(reservas);
            }
        }
	}
}
