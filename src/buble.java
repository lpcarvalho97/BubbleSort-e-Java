import java.util.Scanner;
import java.util.ArrayList;

public class buble {
	
	
	public static void main(String args[]){
		
		Scanner leitor = new Scanner(System.in);
		Scanner insert = new Scanner(System.in);
		int escolha = -1;
		int numero[] = new int[5];
		int[] vet = {8, 9, 3, 5, 1};
		int aux = 0;
		int i = 0;
		int seleciona = 0;
		
		
		
		
		while (escolha != 0) {
			
		
			
			System.out.println("Entre com a sua opção:\n Digite 0 para fechar o programa;\n "
					+ "Digite 1 para inserir números a serem organizados;\n Digite 2 para usar números predefinidos;\n"
					+ "Digite 3 para organizar o vetor;\n Digite 4 para listar o vetor.");
			
			escolha = leitor.nextInt();
			
			
			System.out.println("A sua escolha foi " + escolha + "\n");
			
			if (escolha == 1) {
				
				seleciona = 1;
				
				
				System.out.println("Insira 5 números: ");
				
				for(i = 0; i < 5; i++) {
					numero[i] =  insert.nextInt();
				}
				
			}
			
			
			
			else if(escolha == 2){
				
				seleciona = 0;

				System.out.println("Exemplo de vetor desordenado: ");
				for(i = 0; i<5; i++){
					System.out.println(" "+vet[i]);
				}
				
				
					
					
				} else if(escolha == 3) {
					
					if(seleciona == 0) {
						
						for(i = 0; i<5; i++){
							for(int j = 0; j<4; j++){
								if(vet[j] > vet[j + 1]){
									aux = vet[j];
									vet[j] = vet[j+1];
									vet[j+1] = aux;
									
								}
							}
						}
					} else {
							for(i = 0; i<5; i++){
								for(int j = 0; j<4; j++){
									if(numero[j] > numero[j + 1]){
										aux = numero[j];
										numero[j] = numero[j+1];
										numero[j+1] = aux;
										
									}
								}
							}
						} 
					System.out.println(" ");
					System.out.println("O vetor foi organizado.");
					
					} else if(escolha == 4) {
					
					if (seleciona == 0) {
						for(i = 0; i < 5; i++){
							System.out.println(" "+vet[i]);
						}
					}else {
							for(i = 0; i < 5; i++){
								System.out.println(" "+numero[i]);
						}
					}
					
					
					
				} else if(escolha == 0) {
					
					System.out.println("Desligando o programa...");
					
				} else {
					
				System.out.println("Digite um número de 0 a 4!\n");
			}
			
			
			}
		insert.close();
		leitor.close();
		
		
		
	}


}
