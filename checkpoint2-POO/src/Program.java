import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		//Uso do console para receber entradas!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá vamos criar um campeonato de futebol!");
		System.out.printf("Digite o nome do campeonato:");
		String nomeCampeonato = sc.nextLine();
		
		//Uso de runtimeException
		try {
			System.out.println("Digite o ano do campeonato:");
			int ano = sc.nextInt();
			sc.nextLine();

			System.out.println("Digite um id para o campeonato:");
			int id = sc.nextInt();
			sc.nextLine();

			Campeonato c1 = new Campeonato(id, ano, nomeCampeonato);

			Partida p1 = new Partida(1,LocalDate.of(2017, 8, 20), 4, 2);
			Partida p2 = new Partida(2,LocalDate.of(2022, 8, 16),3,2);
			Partida p3 = new Partida(3,LocalDate.of(2022, 10, 20), 4, 2);
			Partida p4 = new Partida(4,LocalDate.of(2022, 9, 16), 1, 2);
			
			c1.addPartida(p1);
			c1.addPartida(p2);
			c1.addPartida(p3);
			c1.addPartida(p4);

			Time t1 = new Time(1, "Palmeiras");
			Time t2 = new Time(1, "Flamengo");
			
			p1.setTimeMandante(t2);
			p1.setTimeVisitante(t1);

			Jogador j1 = new Jogador(1, "rivaldo", 1986, "Masculino", 1.76, true);
			Jogador j2 = new Jogador(2, "valdivia", 1986, "Masculino", 1.73, true);

			Jogador j3 = new Jogador(3, "pedro", 1993, "Masculino", 1.80, true);
			Jogador j4 = new Jogador(4, "arrascaeta", 1988, "Masculino", 1.70, true);
			
			
			j3.compareTo(j4);
			j2.compareTo(j1);
			
			c1.partidaOcorrida();

			System.out.println("Parabéns voce criou um campeonato de nome: " + c1.getNome());
			sc.close();

		} catch (InputMismatchException e) {
			System.err.println("Erro na entrada de dados, digite um valor inteiro");
		} catch (Exception e) {
			System.out.println("Op's algo de errado não está certo!");
		}
		
		//Uso de exception personalizada!
		Campeonato c1 = new Campeonato(1, 2022, "Brasileiro");

		try {
			c1.addPartida(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
