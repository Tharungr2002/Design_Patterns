package Com.LLD.Behavioral.Command;

import java.util.Stack;

interface Target {
    void on();
    void off();
}

class TV implements Target {

    @Override
    public void on() {
        System.out.println("on the tv");
    }

    @Override
    public void off() {
        System.out.println("off the tv");
    }
}

class AC implements Target {
    @Override
    public void on() {
        System.out.println("on the ac");
    }

    @Override
    public void off() {
        System.out.println("off the ac");
    }
}

interface Command {
    void execute();
    void undo();
}

class TVOnCommand implements Command {
    TV tv;
    TVOnCommand(TV tv) {
        this.tv= tv;
    }
    @Override
    public void undo() {
        tv.off();
    }

    @Override
    public void execute() {
        tv.on();
    }
}

class TVOffCommand implements Command {
    TV tv;
    TVOffCommand(TV tv) {
        this.tv= tv;
    }
    @Override
    public void undo() {
        tv.on();
    }

    @Override
    public void execute() {
        tv.off();
    }
}

class Remote {
    Stack<Command> st = new Stack<>();

    void pressButtom(Command command) {
        command.execute();
        st.add(command);
    }

    void pressUndo() {
        if(!st.empty()) {
            Command c1 = st.peek();
            st.pop();
            c1.undo();
            System.out.println("undo done");
        }
        else System.out.println("nothing to Undo");
    }

}

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Command tvon = new TVOnCommand(tv);      //instead of if tv "on" command , call tv.on() and "off" , call tv.off()
                                                 // encapsulate client -> command -> remote -> Target
        Remote r = new Remote();
        r.pressButtom(tvon);
        r.pressUndo();
        r.pressUndo();


    }
}
