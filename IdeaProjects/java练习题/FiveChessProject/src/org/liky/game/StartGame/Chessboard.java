package org.liky.game.StartGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chessboard extends JPanel {
    public static final int MARGIN = 15;
    public static final int SPAN = 20;
    public static final int ROWS = 19;
    public static final int COLS = 19;
    Chess[] chessList = new Chess[19 * 19];
    int chessCount = 0;
    boolean iso = false;
    boolean isBlack = true;
    String message = "黑棋先下";
    int score = 0;
    public Chessboard() {
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (iso) {
                    return;
                }
                int col, row;
                col = (e.getX() - 15 + 10) / 20;
                row = (e.getY() - 15 + 10) / 20;

                if (col > 19 || col < 0 || row > 19 || row < 0) {
                    return;
                } else {
                    if (haschess(col, row)) {
                        return;
                    } else {
                        Color c = Color.BLACK;
                        if (isBlack) {
                            c = Color.BLACK;
                            message = "轮到白棋";
                        } else {
                            c = Color.WHITE;
                            message = "轮到黑棋";
                        }
                        Chess cc = new Chess(Chessboard.this, col, row, c);
                        chessList[chessCount++] = cc;
                        repaint();

                        if (isWin(col, row)) {
                            if (c == Color.BLACK) {
                                JOptionPane.showMessageDialog(Chessboard.this, "黑棋获胜！");
                                score += 10;
                            } else if (c == Color.WHITE) {
                                JOptionPane.showMessageDialog(Chessboard.this, "白旗获胜！");
                                score += 20;
                            }
                            iso = true;
                            return;
                        }
                        isBlack = !isBlack;
                    }
                }
            }
        });
    }

    @Override
    public void paint(Graphics e) {
        e.setColor(Color.ORANGE);
        e.fillRect(0, 0, 410, 460);
        e.setColor(Color.black);
        for (int i = 0; i < 20; i++) {
            e.drawLine(MARGIN, MARGIN + SPAN * i, MARGIN + 19 * 20, MARGIN + 20 * i);
        }
        for (int i = 0; i < 20; i++) {
            e.drawLine(15 + SPAN * i, 15, 15 + SPAN * i, 15 + 19 * 20);
        }

        e.fillRect(15 + 3 * 20 - 2, 15 + 3 * 20 - 2, 5, 5);
        e.fillRect(15 + 9 * 20 - 2, 15 + 3 * 20 - 2, 5, 5);
        e.fillRect(15 + 15 * 20 - 2, 15 + 3 * 20 - 2, 5, 5);
        e.fillRect(15 + 3 * 20 - 2, 15 + 9 * 20 - 2, 5, 5);
        e.fillRect(15 + 9 * 20 - 2, 15 + 9 * 20 - 2, 5, 5);
        e.fillRect(15 + 15 * 20 - 2, 15 + 9 * 20 - 2, 5, 5);
        e.fillRect(15 + 3 * 20 - 2, 15 + 15 * 20 - 2, 5, 5);
        e.fillRect(15 + 9 * 20 - 2, 15 + 15 * 20 - 2, 5, 5);
        e.fillRect(15 + 15 * 20 - 2, 15 + 15 * 20 - 2, 5, 5);

        Graphics2D e2 = (Graphics2D) e;
        e2.setStroke(new BasicStroke(3f));
        e2.drawLine(10, 10, 10, 400);
        e2.drawLine(10, 10, 400, 10);
        e2.drawLine(400, 10, 400, 400);
        e2.drawLine(10, 400, 400, 400);

        for (int i = 0; i < chessCount; i++) {
            chessList[i].draw(e);
        }
        e.setFont(new Font("黑体", Font.BOLD, 15));
        e.drawString("游戏提示:" + message, 20, 420);
    }

    //判断是否在棋盘内
    private boolean haschess(int col, int row) {
        boolean result = false;
        for (int i = 0; i < chessCount; i++) {
            Chess cc = chessList[i];
            if (cc != null && cc.getCol() == col && cc.getRow() == row) {
                return true;
            }
        }
        return result;
    }

    private boolean haschess(int col, int row, Color c) {
        Boolean result = false;
        for (int i = 0; i < chessCount; i++) {
            Chess ch = chessList[i];
            if (ch != null && ch.getCol() == col && ch.getRow() == row && ch.getColor() == c) {
                result = true;
            }
        }
        return result;
    }

    private boolean isWin(int col, int row) {
        boolean result = false;
        int CountCh = 1;
        Color c = null;
        if (isBlack) {
            c = Color.BLACK;
        } else {
            c = Color.WHITE;
        }

        // 水平向左
        for (int x = col - 1; x >= 0; x--) {
            if (haschess(x, row, c)) {
                CountCh++;
            } else {
                break;
            }
        }
        // 水平向右
        for (int x = col + 1; x <= 19; x++) {
            if (haschess(x, row, c)) {
                CountCh++;
            } else {
                break;
            }
        }
        // 水平取胜
        if (CountCh >= 5) {
            result = true;
            message = "游戏结束";
        } else {
            result = false;
            CountCh = 1;
        }
        // 竖直向上
        for (int y = row - 1; y >= 0; y--) {
            if (haschess(col, y, c)) {
                CountCh++;
            } else {
                break;
            }
        }
        // 竖直向下
        for (int y = row + 1; y <= 19; y++) {
            if (haschess(col, y, c)) {
                CountCh++;
            } else {
                break;
            }
        }
        // 竖直取胜
        if (CountCh >= 5) {
            result = true;
            message = "游戏结束";
        } else {
            result = false;
            CountCh = 1;
        }
        // 斜向右上
        for (int x = col + 1, y = row - 1; x <= 19 && y >= 0; x++, y--) {
            if (haschess(x, y, c)) {
                CountCh++;
            } else {
                break;
            }
        }
        // 斜向左下
        for (int x = col - 1, y = row + 1; x >= 0 && y <= 19; x--, y++) {
            if (haschess(x, y, c)) {
                CountCh++;
            } else {
                break;
            }
        }
        // 斜向取胜
        if (CountCh >= 5) {
            result = true;
            message = "游戏结束";
        } else {
            result = false;
            CountCh = 1;
        }
        // 斜向左上
        for (int x = col - 1, y = row - 1; x >= 0 && y >= 0; x--, y--) {
            if (haschess(x, y, c)) {
                CountCh++;
            } else {
                break;
            }
        }
        // 斜向右下
        for (int x = col + 1, y = row + 1; x <= 19 && y <= 19; x--, y--) {
            if (haschess(x, y, c)) {
                CountCh++;
            } else {
                break;
            }
        }
        // 斜向取胜
        if (CountCh >= 5) {
            result = true;
            message = "游戏结束";
        } else {
            result = false;
            CountCh = 1;
        }

        return result;
    }

    public void againGame() {
        for (int i = 0; i < chessList.length; i++) {
            chessList[i] = null;
        }
        chessCount = 0;
        iso = false;
        message = "开局黑棋先手";
        repaint();
    }

    public void huiqi() {
        if (iso) {
            return;
        }
        chessList[chessCount - 1] = null;
        chessCount--;
        if (isBlack) {
            message = "白棋悔棋";
        } else {
            message = "黑棋悔棋";
        }
        isBlack = !isBlack;
        repaint();
    }
}