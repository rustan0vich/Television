import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Channel channel1=new Channel(1,"Kino312");
        Channel channel2=new Channel(2,"KTRK");
        Channel channel3=new Channel(3,"5Canal");
        Channel channel4=new Channel(4,"SmartTV");
        Channel channel5=new Channel(5,"Balastan");
        Channel channel6=new Channel(6,"OshPirim");
        Channel channel7=new Channel(7,"CineMax");
        Channel channel8=new Channel(8,"Mir");
        Channel channel9=new Channel(9,"Youtube");
        Channel channel10=new Channel(10,"OshTV");
        Channel[] channels={channel1,channel2,channel3,channel4,channel5,channel6,channel7,channel8,channel9,channel10};

        Television television=new Television(channel1,channels);
        television.currentChannelShow();
        television.beforeChannel();
        television.nextChannel(3);
        Scanner s=new Scanner(System.in);
        System.out.println("Нажмите на номер канала, и я выведу имя канала");
        television.showNameOfChannel(s.nextInt());
        System.out.println("Нажмите на номер канала, и я выведу канал");
        television.numberChannel(s.nextInt());

    }
}