import java.util.Random;
import java.util.Scanner;

public class Main {

    static int fosforosTotalTemp;

    static  int nJogador1Temp;

    static int nJogador2Temp;

    static int nPcTemp;

    static int sort;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        fosforosTotalTemp = 21;

        System.out.println("O jogo dos 21 FOSFOROS coloca dois oponentes a \n retirar fosforos, a vez, ate sobrar o ultimo.\n Quem ficar com o ultimo fosforo perde.\n Em cada jogada e possivel retirar 1, 2, 3 ou 4 fosforos.\n");

        int op = 1;
        while (op != 0) {
            System.out.println("1-Jogar com 2 Humanos");
            System.out.println("2-Jogar contra o PC (Facil)");
            System.out.println("3-Jogar contra o PC (Dificil)");
            System.out.println("0-Sair");
            op = in.nextInt();

            switch (op) {
                case 0:
                    break;
                case 1:
                    Jogar2Humanos();
                    break;
                case 2:
                    JogarPcFacil();
                    break;
                case 3:
                    JogarPcDificil();
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;

            }
        }

    }

    private static void Jogar2Humanos() {
        fosforosTotalTemp = 21;

            Sortear();

        //System.out.println(sort);             //Verificar o sortear

        if (sort==1){
            System.out.println("A sorte ditou que o Jogador 1 inicia o jogo");
            while (fosforosTotalTemp != 1){
                Jogador1();
                Jogador2();
                sort=0;
            }
        } if (sort==2){
            System.out.println("A sorte ditou que o Jogador 2 inicia o jogo");
            while (fosforosTotalTemp != 1){
                Jogador2();
                Jogador1();
                sort=0;
            }
        }
    }

    private static void Sortear() {
        Random rnd = new Random();

        sort = rnd.nextInt(1,3);
    }

    private static void Jogador1() {
        Scanner in = new Scanner(System.in);


        if (fosforosTotalTemp > 4){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            do {
                System.out.println("     === Jogador 1 ===");
                System.out.println("Retire ente 1 e 4 fosforos");
                nJogador1Temp = in.nextInt();
            }
            while (nJogador1Temp <1 || nJogador1Temp > 4);
            fosforosTotalTemp = fosforosTotalTemp - nJogador1Temp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! Jogador 1 GANHOU !!!!\n");
            }
            return;
        }
        if (fosforosTotalTemp == 4){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            do {
                System.out.println("     === Jogador 1 ===");
                System.out.println("Retire ente 1 e 3 fosforos");
                nJogador1Temp = in.nextInt();
            }
            while (nJogador1Temp <1 || nJogador1Temp > 3);
            fosforosTotalTemp = fosforosTotalTemp - nJogador1Temp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! Jogador 1 GANHOU !!!!\n");
            }
            return;
        }
        if (fosforosTotalTemp == 3){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            do {
                System.out.println("     === Jogador 1 ===");
                System.out.println("Retire ente 1 e 2 fosforos");
                nJogador1Temp = in.nextInt();
            }
            while (nJogador1Temp <1 || nJogador1Temp > 2);
            fosforosTotalTemp = fosforosTotalTemp - nJogador1Temp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! Jogador 1 GANHOU !!!!\n");
            }
            return;
        }
        if (fosforosTotalTemp == 2){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            do {
                System.out.println("     === Jogador 1 ===");
                System.out.println("Retire 1 fosforo para GANHAR");
                nJogador1Temp = in.nextInt();
            }
            while (nJogador1Temp !=1);
            fosforosTotalTemp = fosforosTotalTemp - nJogador1Temp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! Jogador 1 GANHOU !!!!\n");
            }
        }
    }

    private static void Jogador2() {
        Scanner in = new Scanner(System.in);

        if (fosforosTotalTemp > 4){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            do {
                System.out.println("     === Jogador 2 ===");
                System.out.println("Retire ente 1 e 4 fosforos");
                nJogador2Temp = in.nextInt();
            }
            while (nJogador2Temp <1 || nJogador2Temp > 4);
            fosforosTotalTemp = fosforosTotalTemp - nJogador2Temp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! Jogador 2 GANHOU !!!!\n");
            }
            return;
        }
        if (fosforosTotalTemp == 4){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            do {
                System.out.println("     === Jogador 2 ===");
                System.out.println("Retire ente 1 e 3 fosforos");
                nJogador2Temp = in.nextInt();
            }
            while (nJogador2Temp <1 || nJogador2Temp > 3);
            fosforosTotalTemp = fosforosTotalTemp - nJogador2Temp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! Jogador 2 GANHOU !!!!\n");
            }
            return;
        }
        if (fosforosTotalTemp == 3){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            do {
                System.out.println("     === Jogador 2 ===");
                System.out.println("Retire ente 1 e 2 fosforos");
                nJogador2Temp = in.nextInt();
            }
            while (nJogador2Temp <1 || nJogador2Temp > 2);
            fosforosTotalTemp = fosforosTotalTemp - nJogador2Temp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! Jogador 2 GANHOU !!!!\n");
            }
            return;
        }
        if (fosforosTotalTemp == 2){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            do {
                System.out.println("     === Jogador 2 ===");
                System.out.println("Retire 1 fosforo para GANHAR");
                nJogador2Temp = in.nextInt();
            }
            while (nJogador2Temp !=1);
            fosforosTotalTemp = fosforosTotalTemp - nJogador2Temp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! Jogador 2 GANHOU !!!!\n");
            }
        }
    }

    private static void JogarPcFacil() {
        fosforosTotalTemp = 21;

        Sortear();
        //System.out.println(sort);             //Verificar o sortear

        if (sort==1){
            System.out.println("A sorte ditou que o Jogador 1 inicia o jogo");
            while (fosforosTotalTemp != 1){
                Jogador1();
                PcPoucoInteligente();
                sort=0;
            }
        } if (sort==2){
            System.out.println("A sorte ditou que o PC inicia o jogo");
            while (fosforosTotalTemp != 1){
                PcPoucoInteligente();
                Jogador1();
                sort=0;
            }
        }
    }

    private static void PcPoucoInteligente() {
        Random rnd = new Random();


        if (fosforosTotalTemp > 4){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
                nPcTemp = rnd.nextInt(1,5);
                System.out.println("  PC retirou " + nPcTemp + " fosforo(s)");
            fosforosTotalTemp = fosforosTotalTemp - nPcTemp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! PC GANHOU !!!!\n");
            }
            return;
        }
        if (fosforosTotalTemp == 4){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
                nPcTemp = rnd.nextInt(1,4);
                System.out.println("  PC retirou " + nPcTemp + " fosforo(s)");
            fosforosTotalTemp = fosforosTotalTemp - nPcTemp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! PC GANHOU !!!!\n");
            }
            return;
        }
        if (fosforosTotalTemp == 3){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
                nPcTemp = rnd.nextInt(1,3);
                System.out.println("  PC retirou " + nPcTemp + " fosforo(s)");
            fosforosTotalTemp = fosforosTotalTemp - nPcTemp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! PC GANHOU !!!!\n");
            }
            return;
        }
        if (fosforosTotalTemp == 2){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
                nPcTemp = 1;
                System.out.println("  PC retirou " + nPcTemp + " fosforo(s)");
            fosforosTotalTemp = fosforosTotalTemp - nPcTemp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! PC GANHOU !!!!\n");
            }

        }
    }

    private static void JogarPcDificil() {
        fosforosTotalTemp = 21;
        //sort = 2;                             //Testar Pc Inteligente
        Sortear();                              // Comentar e colocar sort=2 para testar pc inteligente
        //System.out.println(sort);             //Verificar o sortear

        if (sort==1){
            System.out.println("A sorte ditou que o Jogador 1 inicia o jogo");
            while (fosforosTotalTemp != 1){
                Jogador1();
                PcInteligente();
                sort=0;
            }
        } if (sort==2){
            System.out.println("A sorte ditou que o PC inicia o jogo");
            while (fosforosTotalTemp != 1){
                PcInteligente();
                Jogador1();
                sort=0;
            }
        }
    }

    private static void PcInteligente() {
        int restoDiv;

        Random rnd = new Random();

        if (fosforosTotalTemp > 4){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            restoDiv = fosforosTotalTemp % 5;
            if (fosforosTotalTemp != 21){
                if (restoDiv==1){
                    nPcTemp = 4;
                }else if (restoDiv == 0 ){
                    nPcTemp = rnd.nextInt(1,5);
                    //System.out.println("caso 1");
                }else {
                    nPcTemp = restoDiv-1;
                    //System.out.println("caso 2");
                }
            } else {
                nPcTemp = 1;
            }



            System.out.println("  PC retirou " + nPcTemp + " fosforo(s)");
            fosforosTotalTemp = fosforosTotalTemp - nPcTemp;
            if (fosforosTotalTemp == 1){
                System.out.println("!!!! PC GANHOU !!!!\n");
                return;
            }
            return;
        }
        if (fosforosTotalTemp == 4){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            nPcTemp = 3;
            System.out.println("  PC retirou " + nPcTemp + " fosforo(s)");
            fosforosTotalTemp = fosforosTotalTemp - nPcTemp;
            System.out.println("!!!! PC GANHOU !!!!\n");
           return;
        }
        if (fosforosTotalTemp == 3){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            nPcTemp = 2;
            System.out.println("  PC retirou " + nPcTemp + " fosforo(s)");
            fosforosTotalTemp = fosforosTotalTemp - nPcTemp;
            System.out.println("!!!! PC GANHOU !!!!\n");
            return;
        }
        if (fosforosTotalTemp == 2){
            System.out.println("\n==== Total " + fosforosTotalTemp + " Fosforos ====");
            nPcTemp = 1;
            System.out.println("  PC retirou " + nPcTemp + " fosforo(s)");
            fosforosTotalTemp = fosforosTotalTemp - nPcTemp;
            System.out.println("!!!! PC GANHOU !!!!\n");

        }
    }
}