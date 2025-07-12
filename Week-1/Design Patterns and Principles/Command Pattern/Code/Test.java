public class Test {
    public static void main(String args[]){
        Light livingRoom = new Light("livingroom");
        Command turnon = new LightOn(livingRoom);
        Command turnoff = new LightOff(livingRoom);
        RemoteControl remote = new RemoteControl();
        remote.setRemoteCommand(turnon);
        remote.pressbutton();
        remote.setRemoteCommand(turnoff);
        remote.pressbutton();
        remote.setRemoteCommand(turnon);
        remote.pressbutton();
        remote.setRemoteCommand(turnon);
        remote.pressbutton();
        remote.setRemoteCommand(turnoff);
        remote.pressbutton();
    }
}