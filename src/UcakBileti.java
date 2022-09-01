import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);

            System.out.println("Merhaba Kac yaşındasımız");
            short yas = girdi.nextShort();
            System.out.println("Gideceginiz mesafe kac km");
            long mesafe = girdi.nextLong();
            System.out.println("Yolculuk tipini seçiniz\nTek yön--> 1\nGidiş-Dönüş-->2");
            byte tip = girdi.nextByte();
            boolean kontrol=false;
            double ucret,ind_ucret=0, yas_ind=0,tip_ind=0;
        if (yas<0) kontrol=true;
        if(mesafe<0) kontrol=true;
        if(tip!=1 && tip!=2) kontrol=true;
        
        if(kontrol) {
            System.out.println("Geçersiz bilgi girdiniz");
        } else {
            ucret = mesafe * (0.10);//ucreti hesapla
            if(yas<12){
                yas_ind =ucret*0.5;//12 yasından küçükler için indirimi hesapla
                ucret=ucret-yas_ind;

            }
            if (yas>12 && yas<24) {
                yas_ind =ucret*0.1;//12 ile 24 yaş arsındakiler için indirimi hesapla
                ucret=ucret-yas_ind;

            }
            if(yas>65){
                yas_ind=ucret*0.3;
                ucret=ucret-yas_ind;//65 yaşından büyükler için indirimi yesapla
            }
            if (tip==2) {
                tip_ind=ucret*0.2;    //gidiş dönüş bileti alanlar için indirimi hesapla

                ucret=ucret-tip_ind;
                ucret=ucret*2;
            } else {
                ucret=ucret-yas_ind;
            }




            System.out.println("Bilet fiyatınız = "+ ucret+ "TL");


        }
    }
}
