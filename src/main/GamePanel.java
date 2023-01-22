package main;
import inputs.keyboardInputs;
import inputs.MouseInputs;
import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    private Game game;


    public GamePanel(Game game){

        mouseInputs = new MouseInputs(this);
        this.game = game;

        setPanelSize();
        addKeyListener(new keyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280,800);
        setPreferredSize(size);
    }

    public void updateGame(){
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        game.render(g);

    }

    public Game getGame() {
        return game;
    }


    //    private void updateRectangle(){
//        xDelta += xDir;
//        if(xDelta>400 || xDelta < 0) {
//            xDir *= -1;
//            color = getRndColor();
//        }
//        yDelta += yDir;
//        if(yDelta>400 || yDelta < 0) {
//            xDir *= -1;
//            color = getRndColor();
//        }
//    }
//
//
//    private Color getRndColor(){
//        int r= random.nextInt(255);
//        int g= random.nextInt(255);
//        int b= random.nextInt(255);
//
//        return new Color(r,g,b);
//
//    }
}