package br.com.rbeninca.listafrutas;

import java.util.HashMap;


import java.math.BigDecimal;
import java.util.HashMap;

public class FrutaController{
        //Array com instacias de frutas definidas como atributos da classe definidas como final abaixo
        public Fruta[] FRUTAS = {MACA, MORANGO,LARANJA,ABACATE,MELANCIA,CEREJA,UVA,BANANA,ACAI,AMEIXA,CACAU,
                CAJU,COCO,CRANBERRY,FIGO,FRAMBOESA,JACA,KIWI,MARACUJA,JAMBO,MEXIRICA,MELAO,TORANJA,VERGAMOTA,
                TAMARA,ROMA};
        public HashMap<String, Fruta>  FRUTA_MAP =new HashMap<>();


        public FrutaController() {
            for (Fruta fruta : FRUTAS) {
                FRUTA_MAP.put(String.valueOf(fruta.getCodigo()), fruta);
            }

        }

        //Definição de atributo da classe Frutas com nome de frutas e indtanciado os mesmos.
        public static final Fruta MACA = new Fruta("Maça",
                "Avermelhada com traços verdes",
                R.drawable.maca,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15151);
        public static final Fruta MORANGO = new Fruta("Morango",
                "Avermelhada com traços verdes",
                R.drawable.morango,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15152);
        public static final Fruta LARANJA = new Fruta("Laranja",
                "Fruta em formato esferico com coloraçaão laranja",
                R.drawable.laranja,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15154);
        public static final Fruta ABACATE = new Fruta("Abacate",
                "Fruta em formato esferico com esverdiada" ,
                R.drawable.abacate,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15155);
        public static final Fruta MELANCIA = new Fruta("Melancia",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.melancia,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15156);
        public static final Fruta CEREJA = new Fruta("Cereja",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.cereja,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15157);
        public static final Fruta UVA = new Fruta("Uva",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.morango,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15158);
        public static final Fruta BANANA = new Fruta("Banana",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.banana,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15159);
        public static final Fruta AMEIXA = new Fruta("Ameixa",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.ameixa,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15160);
        public static final Fruta CACAU = new Fruta("Cacau",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.cacau,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15161);
        public static final Fruta ACAI = new Fruta("Açaí",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.acai,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15162);
        public static final Fruta CAJU = new Fruta("Caju",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.caju,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15163);
        public static final Fruta COCO = new Fruta("Coco",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.coco,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15164);
        public static final Fruta CRANBERRY = new Fruta("Cranberry",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.cranberry,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15165);
        public static final Fruta FIGO = new Fruta("Figo",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.figo,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15166);
        public static final Fruta FRAMBOESA = new Fruta("Framboesa",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.framboesa,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15167);
        public static final Fruta JACA = new Fruta("Jaca",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.jaca,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15168);
        public static final Fruta JAMBO = new Fruta("Jambo",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.jambo,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15169);
        public static final Fruta KIWI = new Fruta("Wiki",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.kiwi,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15157);
        public static final Fruta MARACUJA = new Fruta("Maracuja",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.maracuja,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15170);
        public static final Fruta MEXIRICA = new Fruta("Mexirica",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.mexirica,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15171);
        public static final Fruta MELAO = new Fruta("Melão",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.melao,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15172);
        public static final Fruta TORANJA = new Fruta("Toranja",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.toranja,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15173);
        public static final Fruta VERGAMOTA = new Fruta("Vergamota",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.vergamota,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15174);
        public static final Fruta TAMARA = new Fruta("Tâmara",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.tamara,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15175);
        public static final Fruta ROMA = new Fruta("Romã",
                "Fruta em formato esferico verde por fora e vermlho por dentro" ,
                R.drawable.roma,
                new BigDecimal(3.9),
                new BigDecimal(6.50),
                2922,
                new BigDecimal(4.5),
                15176);
};
