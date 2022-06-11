package org.liky.game.StartGame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class GameMain extends JFrame {

    Chessboard qpan;

    public GameMain() {
        qpan = new Chessboard();
        // 创建菜单栏
        JMenuBar menubar = new JMenuBar();

        JMenu menu = new JMenu("游戏(G)");
        JMenuItem item1 = new JMenuItem("新游戏");
        JMenuItem item2 = new JMenuItem("退出");
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        menubar.add(menu);


        // 按钮
        JPanel btn = new JPanel();
        btn.setLayout(new GridLayout(10, 1));
        Button btn1 = new Button("重新开始");
        Button btn2 = new Button("悔棋");
        btn.add(btn1);
        btn.add(btn2);

        // 窗口设置
        BorderLayout bl = new BorderLayout();
        //标题
        this.setTitle("五子棋");
        //界面大小
        this.setSize(480, 490);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.add(menubar, bl.NORTH);
        this.add(qpan, bl.CENTER);
        this.add(btn, bl.EAST);

        // 按钮事件
        btn1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                qpan.againGame();
            }

        });
        //悔棋
        btn2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                qpan.huiqi();
            }

        });

        // 新游戏
        item1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                qpan.againGame();
            }
        });

        // 退出
        item2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new GameMain();
    }

}