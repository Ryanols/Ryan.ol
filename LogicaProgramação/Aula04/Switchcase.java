package LogicaProgramação.Aula04;

public class Switchcase {
    public static void main(String[] args) {
        //Imprima o dia da semna considerando o domingo como 1 usando o switch
        int dayWeek = 9;
        String dayWeeKtrue;
        //Dentro do parametro existe agora algumas restrições de tipos. Mudança feita na versao 12.
        //São eles --> char , int , byte , short , enum e String. Somente essas.
        switch (dayWeek) {
            case 1:
                dayWeeKtrue = "Domingo";
                System.out.println(dayWeeKtrue);
                break;
            case 2:
                dayWeeKtrue = "Segunda";
                System.out.println(dayWeeKtrue);
                break;
            case 3:
                dayWeeKtrue = "Terça";
                System.out.println(dayWeeKtrue);
                break;
            case 4:
                dayWeeKtrue = "Quarta";
                System.out.println(dayWeeKtrue);
                break;
            case 5:
                dayWeeKtrue = "Quinta";
                System.out.println(dayWeeKtrue);
                break;
            case 6:
                dayWeeKtrue = "Sexta";
                System.out.println(dayWeeKtrue);
                break;
            case 7:
                dayWeeKtrue = "Sabado";
                System.out.println(dayWeeKtrue);
                break;
            default:
                dayWeeKtrue = "Esse número nao corresponde a nenhum dia da semana.";
                System.out.println(dayWeeKtrue);
                break;
        }

    }
}