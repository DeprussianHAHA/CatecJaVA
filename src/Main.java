public class Main {
    public static void main(String[] args) throws InterruptedException{

        Phone phone=new Phone("0982433243","iphone 14","Vladislav","green","2313320","158", "128", "6.1", "1170 x 2532", "6.7", "oled");
        Phone phone2=new Phone("456455243","Samsung ","Igor","white","56033203","190","512","5.5","1290 x 2796", "5.3", "ips");
        Phone phone3=new Phone("5463324377","Huawei","Grisha","red","8403033203","176","32","6.6","750 x 1334", "6.0", "oled");
        Phone phone4=new Phone("54562433243","Xiomi","Stavros","pink","4251312","204","128","5.4", "1080 x 1920", "4.1", "oled");
        Phone phone5=new Phone("1222433243","Lenovo","Robert","yellow","8145645","213","64","6.7","5536 x 4152", "4.4", "ips");
        System.out.println(phone.getPermissionPhone());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getRecieverPhone());
        System.out.println(phone4.getWeight());
        System.out.println(phone5.getModel());
        System.out.println(phone.getRecieverPhone());
        phone.setColorPhone("green");
        phone2.setModel("Iphone 14");
        phone3.setWeight("158");

    }
}