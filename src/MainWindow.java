import javax.swing.*;



public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("BAttle TAnks");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(100,50);
//        GridCanvas xyz = new GridCanvas(320,320,20,20);
//        add(xyz);
        add(new Engine());
        setVisible(true);

    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }

}
