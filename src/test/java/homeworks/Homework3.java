package homeworks;

import org.junit.jupiter.api.Test;

public class Homework3 {

    //METOD RASSTOJANIE MEZDU DVUMJA KOORDINATAMI NA KARTE
    //Даны две точки на плоскости с произвольными координатами. //
    //Например А(4,8) и Б(6,10). Определить расстояние между точками
    //d=(aY−aX)2+(bY−bX)2 и весь в d корне
    //Math.sqrt - korenj
    //Math.pow v kvadrat

    @Test
    public static void main(String[] args){

        int aX=4;
        int aY=8;
        int bX=6;
        int bY=10;
        double res = Math.sqrt(Math.pow(aY-aX,2) + Math.pow(bY-bX,2));
        System.out.println(res);
    }
}
