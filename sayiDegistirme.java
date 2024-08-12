public class sayiDegistirme {
    public static void main(String[] args) {
        int a = 5 , b = 10;
        System.out.println("Birini sayınız = " + a);
        System.out.println("İkinci sayınız = " + b);
        System.out.println();
        System.out.println("Değiştirme işlemi uygulanıyor..");
        System.out.println();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Birinci sayınız = " + b);
        System.out.println("İkinci sayınız = " + a);
    }
}