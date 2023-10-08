package primeiroprojeto;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {

		//sysout (ctrl + espaço)
		//System.out.println("Olá Mundo!");
//		System.out.println("Olá Mundo2!");
//		/*ctrl + s (salva o projeto)
//		ctrl + / (comentario)
//		ctrl + F11 (roda o projeto)*/
		
		//Identificadores(letra, _, $)
		//Reservadas (int, double, char)

		
		double numeroDecimal = 99.99; // numeros decimas
		float valorPi = 3.14f; 
		char unicaLetra = 'G';
		boolean valorVerdadeiro = true;
		
		//Declaração
		String nome;
		//Inicialização
		String nome1 = "Gabriel";
		//atribuição
		nome = "Gabriel";
		System.out.println("Nome :" + nome);
		//Reatribuição
		nome = "Jose";
		System.out.println("Nome :" + nome);
		
		//Operadores
		int n1 = 1; //inteiro
		int n2 = 2;
		System.out.println(n1 + n2);//soma
		System.out.println(n1 - n2);//diminuição
		System.out.println(n1 * n2);//Multiplica
		System.out.println(n1 / n2);//Divisão
		System.out.println(n1 % n2);//Resto da divisão
		
		//Operadores Relacionais
		int na = 1; //inteiro
		int nb = 2;
		
		System.out.println(na == nb);//Igual //false
		System.out.println(na != nb);//Diferente //true
		System.out.println(na < nb || na == nb);//A Menor ou igual B //true
		System.out.println(na >= nb );//A Maior ou igual ao B //false
		
		//Operadores Lógicos
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y);//E //false
		System.out.println(x || y);//OU //true
		System.out.println(!x);//Negação //false
		
		int numeroX = 10;
		//Incremento
		numeroX++; //11
		numeroX = numeroX + 1; //12
		//Decremento
		numeroX--; //11
		numeroX = numeroX - 1; //10
		//Operadores de atribuição
		numeroX += 5;//15 //numeroX = numeroX + 5; 
		numeroX -= 10; //5 //numeroX = numeroX - 10;
		numeroX *= 2; //10 //numeroX = numeroX * 2;
		numeroX /= 2; //5 //numeroX = numeroX / 2;
		
		//vetores
		//criando uma variavel chamada number de 5 posicoes vazias
		int[] number = new int[5];//0,1,2,3,4
		int[] inicializaVetor = {1,2,3,4,5};
		//Acessar
		int primeiroNumero = inicializaVetor[0]; //1
//		inicializaVetor[0]; 1
//		inicializaVetor[1]; 2
//		inicializaVetor[2]; 3
//		inicializaVetor[3]; 4
//		inicializaVetor[4]; 5
		//Modificar
		inicializaVetor[3] = 10; //{1,2,3,10,5};
		
		//Matriz
		int[][] matriz = new int[3][3]; 
		//[ , , ]
		//[ , , ]
		//[ , , ]
		int[][] inicializaMatriz = {
			   //0,1,2
				{1,2,3},//0
				{4,5,6},//1
				{7,8,9} //2
		};
		//Acessar
		int value = inicializaMatriz[1][2];//6
		inicializaMatriz[0][0] = 10; //{10,2,3},{4,5,6},{7,8,9}
		
		int[][] inicializaMatrizFor = {
				   //0,1,2
					{1,2,3},//0
					{4,5,6},//1
					{7,8,9} //2
			};
		
		for(int i=0; i < inicializaMatrizFor.length; i++) {
			for(int j=0; j < inicializaMatrizFor[i].length; j++) {
				System.out.println(inicializaMatrizFor[i][j]);
				//inicializaMatrizFor[0][0]
				//inicializaMatrizFor[0][1]
				//inicializaMatrizFor[0][2]
				//inicializaMatrizFor[1][0]
				//inicializaMatrizFor[1][1]
				//inicializaMatrizFor[1][2]
				//inicializaMatrizFor[2][0]
				//inicializaMatrizFor[2][1]
				//inicializaMatrizFor[2][2]
			}
		}
		int[] inicializaVetorFor = {10,20,30,40,50};
		for(int i=0; i < inicializaVetorFor.length; i++) {
			//i=1 vetor=5 
			System.out.println(inicializaVetorFor[i]);//1,2,3,4,5
			//i=5
		}
		
		int i = 0;
		while(i < inicializaVetorFor.length) {
			System.out.println(inicializaVetorFor[i]);
			i++;
		}
		
		//Condicionais
		//IF
		int idade = 17;
		if(idade >= 18) {
			System.out.println("Você é um adulto");
		}else {
			System.out.println("Você não é um adulto");
		}
		
		//Switch-case
		char nota = 'F';
		
		switch (nota) {
		case 'A':
			System.out.println("Voce passou com a nota maxima");
			break;
		case 'B':
			System.out.println("Voce passou");
			break;
		default:
			System.out.println("Voce reprovou");
		}
		int resultado = soma(7,8);
		System.out.println(resultado);
		System.out.println(soma(5, 3));
		System.out.println(soma(15, 23));
		System.out.println(soma(35, 34));
	}
	
	
	
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
}














