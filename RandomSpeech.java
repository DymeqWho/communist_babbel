package Randomizer;

public class RandomSpeech {
    String[] listaSlow1 = {"koleżanki i koledzy", "z drugiej strony", "podobnie", "nie zapominajmy jednak, że", "w ten sposób", "praktyka dnia codziennego dowodzi, że", "wagi i znaczenia tych problemów nie trzeba szerzej uzasadniać, ponieważ", "różnorakie i bogate doświadczenia", "troska organizacji, a szczególnie", "wyższe założenai ideowe, także"};
    String[] listaSlow2 = {"realizacja nakreślonych zadań programowych", "zakres i miejsce szkolenia kadr", "stały wzrost iliśi i zakres naszej aktywności", "aktualna struktura organizacji", "nowy model działalności organizacyjnej", "dalszy rozwój róznych form działalności", "stałe zabezpieczenie informacyjno-programowe naszej dzialalności", "wzmacnianie i rozwijanie struktur", "konsultacja z szerokim aktywem", "rozpoczęcie powszechnej akcji kształtowania postaw"};
    String[] listaSlow3 = {"zmusza nas do przeanalizowania", "spełnia istotną role w krztałtowaniu", "wymaga sprecyzowania i określenia", "pomaga w przygotowaniu i realizacji", "zabezpiecza udział szerokiej grupie w kształtowaniu", "spełnia ważne zadania w wypracowaniu", "umozliwia w większym stopniu tworzenie", "powoduje docenianie wagi", "przedstawia interesującą próbę sprawdzenia", "pociąga za soba proces wdrażania i unowoczeńienia"};
    String[] listaSlow4 = {"istniejących warunków adyministracyjno-finansowych ", "dalszych kierunków rozwoju ", "systemu powszechnego uczestnictwa ", "postaw uczestników wobec zadań stawianych przez organizację ", "nowych propozycji ", "kierunków postepowego wychowania ", "systemu szkolenia kadry opowiadającego potrzebom ", "odpowiednich warunków aktywizacji ", "modelu rozwoju "};

    int dlugoscSlow1 = listaSlow1.length;
    int dlugoscSlow2 = listaSlow2.length;
    int dlugoscSlow3 = listaSlow3.length;
    int dlugoscSlow4 = listaSlow4.length;

    int generator1 = (int) (Math.random() * dlugoscSlow1);
    int generator2 = (int) (Math.random() * dlugoscSlow2);
    int generator3 = (int) (Math.random() * dlugoscSlow3);
    int generator4 = (int) (Math.random() * dlugoscSlow4);

    String wypowiedz = listaSlow1[generator1] + " " + listaSlow2[generator2] + " " + listaSlow3[generator3] + " " + listaSlow4[generator4];


}
