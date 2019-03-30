import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


import java.util.PriorityQueue;

/**
 * Maria Jose Castro Lemus 
 * 181202
 * Estructura de datos
 * Lab 8
 */

/**
 * @author Majo!
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		VectorHeap<Paciente> pacienteVec = new VectorHeap<Paciente>();
		PriorityQueue<Paciente> pacienteQue = new PriorityQueue<Paciente>();
		VectorHeap<Paciente> paciente = leerPacientes(pacienteVec);
		//paciente.leerPacientes();
		System.out.println("*********************************");
		System.out.println("*------------HOSPITAL-----------*");
		System.out.println("*********************************");
		System.out.println("1. Priority Queue");
		System.out.println("2. VectorHeap");
		int op = teclado.nextInt();
		if(op == 1) {
			
			
				while(pacienteQue.size()> 0) {
		        	System.out.println(pacienteQue.remove());
		        }
				
		
		}
		if(op ==2) {
	       
				while (pacienteVec.size()>0){
					
	                System.out.println(pacienteVec.remove());
				}
	        
		
	}
	}


public static VectorHeap<Paciente> leerPacientes(VectorHeap<Paciente> pacienteVec){
	//Vector pacienteVec= new Vector();
	try {
	BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"));  //lee el archivo  
    //StringBuilder sb = new StringBuilder();
    String line ="";
    //Vector pacienteVec= new Vector();
    
	while ((line = br.readLine())!= null) {
		String[] datos = line.split(", ");
		String name = datos[0];
		String sick = datos[1];
		String code = datos[2];
		//Paciente paciente = new Paciente(name,sick, code);
		//System.out.println(paciente);
		pacienteVec.add(new Paciente(name,sick, code));
		System.out.println(pacienteVec);
		System.out.println(pacienteVec.size());
	}
	}
	catch (Exception ex) {
        ex.printStackTrace();
    }
	//Vector pacienteVec;
	return pacienteVec;
	

}
}
