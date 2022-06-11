package org.liky.game.frame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class MyChessFrame extends JFrame implements MouseListener {
    public MyChessFrame() {

        this.setTitle("五子棋");//设置窗体标题
        this.setSize(1000, 700);//设置窗体大小
        this.setResizable(false);//设置窗体是否可用改变大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体关闭方式
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
//        System.out.println("宽度为：" + width);
//        System.out.println("高度为：" + height);
        this.setLocation((width - 200) / 2, (height - 100) / 2);
        this.addMouseListener(this);
        //this.paint(g);
        this.setVisible(true);//是否显示窗体
    }

    public void paint(Graphics g) {
//        g.drawString("五子棋游戏", 20, 40);//绘制字符串
        //g.drawOval(20,40,40,40);//绘制一个空心的圆形
        //g.fillOval(20,40,40,40);//绘制一个实心的圆形
        //g.drawLine(20,40,40,40);//绘制一条线
        //g.drawRect(20,40,40,40);//绘制一个空心的矩形
        //g.fillRect(80,40,40,20);//绘制一个实心的矩形
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("E:\\java练习题\\FiveChessProject\\src\\org\\liky\\game\\img\\2.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(image,0,0,this);//绘制一个已经存在的图片
        g.drawOval(20,40,40,40);
        g.setColor(Color.BLUE);
        g.fillRect(80,40,40,20);
        g.setFont(new Font("微软雅黑",20,20));

        g.drawString("五子棋游戏",20,40);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标点击");
//        JOptionPane.showMessageDialog(this,"鼠标点击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("鼠标按下");
        System.out.println("点击位置： X --> " + e.getX());
        System.out.println("点击位置： Y --> " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标抬起");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        System.out.println("鼠标进入");
//        JOptionPane.showMessageDialog(this,"鼠标进入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        System.out.println("鼠标离开");
//        JOptionPane.showMessageDialog(this,"鼠标离开");
    }
}
