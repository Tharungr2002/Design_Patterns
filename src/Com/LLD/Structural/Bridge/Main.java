package Com.LLD.Structural.Bridge;


interface videoQuality {//
    void play();
}
                                                                                     //implemetations
class HDVideoQuality implements videoQuality {
    public void play() {
        System.out.println("hq play");
    }
}

class K4VideoQuality implements videoQuality {
    public void play() {
        System.out.println("4k play");
    }
}

class k8VideoQualtiy implements videoQuality {
    public void play() {
        System.out.println("play 8k");
    }
}

abstract class Player {
    videoQuality videoquality;

    Player(videoQuality videoquality) {
        this.videoquality = videoquality;
    }

     abstract void open();
}

class MXPlayer extends Player {
    MXPlayer(videoQuality videoquality) {
        super(videoquality);
    }

    public void open() {
        videoquality.play();
        System.out.println("open in mx");
    }
}
class VLCPlayer extends Player {
    VLCPlayer(videoQuality videoquality) {
        super(videoquality);
    }

    public void open() {
        videoquality.play();
        System.out.println("open in VLCPlayer");
    }
}


public class Main {
    public static void main(String[] args) {
        Player player1 = new VLCPlayer(new HDVideoQuality());
        player1.open();

        Player player2 = new MXPlayer(new k8VideoQualtiy());
        player2.open();
    }
}


