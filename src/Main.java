public class Main {
    public static void main(String[] args) {

        System.out.println("Домашняя работа № 6");
        System.out.println("Задание № 1");

        for(int i = 1; i <= 10; i = i + 1){
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задание № 2");
        for(int i = 10; i >= 1; i = i - 1){
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задание № 3");
        for(int i = 2; i <= 16; i = i + 2){
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задание № 4");
        for(int i = 10; i >  -11  ; i = i - 1){
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задание № 5");
        for(int i = 1904; i <=  2096  ; i = i + 4){
            System.out.println( i  + " год является високосным  " );
        }


        System.out.println("Задание № 5  - 2 способ (с уточнением условий)");
        for(int i = 1904; i <=  2096  ; i ++){
            if (i % 4==0 && i % 100 != 0  || i % 400 ==0 );
            System.out.println( i  + " год является високосным  " );


        }
        System.out.println("Задание № 6");

        for(int i = 7; i <=  98  ; i = i + 7){
            System.out.print( i  + "  " );

        }


        System.out.println("Задание № 7");

        for(int i = 1; i <=  512  ; i = i *2 ){
            System.out.print( i  + "  " );


        }


        System.out.println("Задание № 8");
        int amountОfSavingsForMonth = 29000;
        int totalSavings = 0;
        for (int i = 1; i <= 12; i++) {
            totalSavings = totalSavings + amountОfSavingsForMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSavings);;
        }


        System.out.println("Задание № 8");
        int SumForMonth = 29000;
        double total1 = 0;
        double percent =  0.01;
        for (int i = 1; i <= 12; i++){
            total1 = total1 + SumForMonth * (1+percent);
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1 +  " рублей");;
        }


        System.out.println("Задание № 9 (выводим таблицу умножения целиком");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }
        System.out.println("Задание № 10 (выводим только с 2-кой - 1 способ) ");


        for (int i = 2; i  <= 2; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }
        System.out.println("Задание № 10 (выводим только с 2-кой - 2 способ) ");
        int i = 2; {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i*j);

            }

        }
























    }
}