import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner leitor = new Scanner(System.in);
    
    String[] mes = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto",
    		"Setembro","Outrubro","Novembro","Dezembro"};
    double[] temp = new double[12];
    double maiorT = 0.0;
    double menorT = 0.0;	
    
    for(int i = 0; i < mes.length; i++) {
    System.out.println("Digite a temperatura media do mês de " + mes[i]);
    temp[i] = leitor.nextDouble();
    }
   for(int i = 0; i < 12; i++) {
	   if(temp[(int) maiorT] < temp[i]) {
		   maiorT = i;
	   }
   }
   for(int i = 0; i < temp.length; i++) {
	   if(temp[(int) menorT] > menorT) {
		   menorT = i;
	   }
   }
   System.out.println("A maior temperatura foi " + temp[(int) maiorT] + "cº no mês de " + mes[(int) maiorT]);
   System.out.println("A menor temperatura foi " + temp[(int) menorT] + "cº no mês de " + mes[(int) menorT]);
	   
  }
}