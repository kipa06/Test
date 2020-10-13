public class Med_V2 {
    enum Pacient { Dima(198,100,"3 группу"){
        String getKrov(){
           return"2 группу";
        }
    }, Vlados(177,86,"2 группу"),
        Irik(189,88,"4 группу"),
        Leha(176,88,"1 группу");
    int rost;
    String krov;
    int wes;
    Pacient (int rost,int wes,String krov){
        this.rost = rost;
        this.wes = wes;
        this.krov = krov;

      }
      int getRost(){
        return rost;
      }
      int getWes(){
        return wes;
      }
      String getKrov(){
        return krov;
      }
    }

    public static void main(String[] args) {
        Pacient pacient = Pacient.Leha;//тут менять людей ))))
        System.out.println("Подходит "+pacient);
        System.out.println("Измеряем рост "+pacient.getRost());
        System.out.println("Измеряем вес "+pacient.getWes());
        System.out.println("Анализ крови даёт "+pacient.getKrov());//dsadas

    }
}
