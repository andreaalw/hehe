package Session13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayDeque;
import java.util.Objects;

public class SnakeFrame extends JFrame {
    public SnakeFrame(){
        add(new SnakePanel());
        setDefaultCloseOperation(3);
        setSize(500,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new SnakeFrame();
    }
}

class SnakePanel extends JPanel implements KeyListener {
    private Point head = new Point(10,10);
    private java.util.Queue<Point> q = new ArrayDeque<>();

    public SnakePanel(){
        addKeyListener(this);
        setFocusable(true);

        for (int i = 0; i < 5; i++) {
            q.add(new Point(10,10-i+5));
            head.setLocation(10,10-i+5);
        }

        Timer t = new Timer(1000/10, (e)->{//fps
            refresh();
        });
    t.start();
    }
    private int move = KeyEvent.VK_UP;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (Object o:q.toArray()) {
            Point P = (Point) o;
            g2d.fillRect(P.x*10,P.y*10,10,10);
        }
        g2d.fillRect(head.x*10-2,head.y*10-2,14,14);


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


    void refresh(){
        q.poll();//yg kita apus yang first in
        switch (move){
            case KeyEvent.VK_UP: --head.y;break;
            case KeyEvent.VK_DOWN: ++head.y;break;
            case KeyEvent.VK_RIGHT: ++head.x;break;
            case KeyEvent.VK_LEFT: --head.x;break;

        }
        q.add(new Point(head.x,head.y));
        repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP ||
                e.getKeyCode() == KeyEvent.VK_DOWN||
                e.getKeyCode() == KeyEvent.VK_LEFT||
                e.getKeyCode() == KeyEvent.VK_RIGHT){
            move = e.getKeyCode();
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}
