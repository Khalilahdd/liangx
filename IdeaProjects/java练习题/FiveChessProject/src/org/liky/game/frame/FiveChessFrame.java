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

public class FiveChessFrame extends JFrame implements MouseListener {

    //取得屏幕的宽度
    int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    //取得屏幕的高度
    int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    //保存棋子的坐标
    int x = 0;
    int y = 0;
    //保存之前下过的全部棋子的坐标
    int[][] allChess = new int[19][19];

    public FiveChessFrame() {
        //设置标题
        this.setTitle("五子棋");
        //设置窗体大小
        this.setSize(500, 500);
        //设置窗体出现位置
        this.setLocation((width - 1000) / 2, (height - 700) / 2);
        //将窗体设置为大小为不可改变
        this.setResizable(false);
        //将窗体方式设置为默认关闭后程序结束
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //为窗体加入监听器
        this.addMouseListener(this);
        //将窗体显示出来
        this.setVisible(true);


    }

    public void paint(Graphics g) {
        //背景图片
        BufferedImage bgImage = null;
        try {
            bgImage = ImageIO.read(new File("E:\\java练习题\\FiveChessProject\\src\\org\\liky\\game\\img\\2.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //绘制背景
        g.drawImage(bgImage, 3, 20, this);
        //输出标题信息
        g.setFont(new Font("黑体", Font.BOLD, 20));
        g.drawString("游戏信息", 130, 60);
        //输出时间信息
        g.setFont(new Font("宋体", 0, 12));
        g.drawString("黑方时间:无限制", 30, 470);
        g.drawString("白方时间:无限制", 260, 470);

        //绘制棋盘

        for (int i = 0; i < 19; i++) {
            g.drawLine(10, 70 + 20 * i, 370, 70 + 20 * i);
            g.drawLine(10 + 20 * i, 70, 10 + 20 * i, 430);
        }
        //标注点位
        g.fillOval(68, 128, 4, 4);
        g.fillOval(308, 128, 4, 4);
        g.fillOval(308, 368, 4, 4);
        g.fillOval(68, 368, 4, 4);
        g.fillOval(308,248,4,4);
        g.fillOval(188,128,4,4);
        g.fillOval(68,248,4,4);
        g.fillOval(188,368,4,4);
        g.fillOval(188,248,4,4);

        //绘制棋子
        g.fillOval(x,y,10,10);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
//        System.out.println("X" + e.getX());
//        System.out.println("Y" + e.getY());

        x = e.getX();
        y = e.getY();
        if (x >= 10 && x <= 370 && y >= 70 && y <= 430) {
//            System.out.println("在棋盘范围之内： " + x + " -- " + y);

            this.repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
