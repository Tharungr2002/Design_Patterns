package Com.LLD.Behavioral.ChainOfResponsibility;

abstract class SupportSystem {
    protected SupportSystem supportSystem;

    public void setSupportSystem(SupportSystem supportSystem) {
        this.supportSystem = supportSystem;
    }

    public abstract void handleRequest(String issue);
}

class L1Support extends SupportSystem {
    public void handleRequest(String issue) {
        if(issue.equals("L1")) {
            System.out.println("handling l1");
        }
        else if(supportSystem != null) {
            supportSystem.handleRequest(issue);
        }
    }
}

class L2Support extends SupportSystem {
    public void handleRequest(String issue) {
        if(issue.equals("L2")) {
            System.out.println("handling l2");
        }
        else if(supportSystem != null) {
            supportSystem.handleRequest(issue);
        }
    }
}

class L3Support extends SupportSystem {
    public void handleRequest(String issue) {
        if(issue.equals("L3")) {
            System.out.println("handling l3");
        }
        else if(supportSystem != null) {
            supportSystem.handleRequest(issue);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        SupportSystem sp = new L1Support();
        SupportSystem sp2 = new L2Support();
        SupportSystem sp3 = new L3Support();

        sp.setSupportSystem(sp2);
        sp2.setSupportSystem(sp3);

        sp.handleRequest("L3");
    }
}
