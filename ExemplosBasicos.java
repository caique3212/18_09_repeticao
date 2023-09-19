public class ExemplosBasicos{
    public static void main (String args []){
        // indent (indentaçao)
        // for, while e do/while
        // repetição manual, não faça isso
        // System.out.println(1);
        // System.out.println(2);
        // repetição controlada por contador
        // declarar o contador
        // int cont = 4;
        // while(cont <= 3){
        //     System.out.print(cont);
        //     cont = cont + 1;
        // }
        // for(int cont = 4;cont <=3;cont = cont + 1){
        //     System.out.println(cont);
        // }
        int cont = 1;
        do{
            System.out.printf("valor da vez: %d\n", cont);
            cont += 1; //cont = cont + 1;
        }while(cont <= 3);
    }
}