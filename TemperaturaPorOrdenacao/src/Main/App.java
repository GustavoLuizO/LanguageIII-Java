package Main;

import java.util.Scanner;

import IOrdenacao.MetodoBubbleSort;
import IOrdenacao.MetodoInsertionSort;
import IOrdenacao.MetodoSelectionSort;
import Models.PacienteAdulto;
import Models.PacienteCrianca;
import Models.PacienteIdoso;

public class App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		MetodoBubbleSort mBS = new MetodoBubbleSort();
		MetodoInsertionSort mIS = new MetodoInsertionSort();
		MetodoSelectionSort mSS = new MetodoSelectionSort();
		
		System.out.print("Quantas medidas de temperatura ocorreram : ");
		int qtdMedida = ler.nextInt();
		ler.nextLine();
	
		Double[] tempCrianca = new Double[qtdMedida];
		Double[] tempAdulto = new Double[qtdMedida];
		Double[] tempIdoso = new Double[qtdMedida];
		
		for(int i = 0; i < qtdMedida; i++) {
			System.out.print("Medida Criança : ");
			tempCrianca[i] = ler.nextDouble();
			ler.nextLine();
			
			System.out.print("Medida Adulto : ");
			tempAdulto[i] = ler.nextDouble();
			ler.nextLine();
			
			System.out.print("Medida Idoso : ");
			tempIdoso[i] = ler.nextDouble();
		}		
		
		PacienteCrianca pC = new PacienteCrianca(mBS, 1, "José", tempCrianca);
		PacienteAdulto pA = new PacienteAdulto(mIS, 1, "Luiz", tempAdulto);
		PacienteIdoso pI = new PacienteIdoso(mIS, 1, "Gustavo", tempIdoso);
		
		pC.OrdenarTemperaturas();
		pA.OrdenarTemperaturas();
		pI.OrdenarTemperaturas();
		
		System.out.println("Temperatura paciente criança : ");
		for(int c = 0; c < qtdMedida; c++) {
			System.out.println(pC.getTemperaturasDuranteDia()[c]);
		}
		
		System.out.println("Temperatura paciente adulto : ");
		for (int a = 0; a < qtdMedida; a++) {
			System.out.println(pA.getTemperaturasDuranteDia()[a]);
		}
		
		System.out.println("Temperatura paciente idoso : ");
		for (int i = 0; i < qtdMedida; i++) {
			System.out.println(pI.getTemperaturasDuranteDia()[i]);
		}
	}

}
