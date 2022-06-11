package org.liky.game.StartGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;

public class Chess {
    Chessboard cp; 	//棋盘
    int row;		//横坐标
    int col;		//纵坐标
    Color color;	//棋子颜色

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public static final int BANJING = 18;

    public Chess(Chessboard cp, int col, int row, Color color) {
        this.cp = cp;
        this.col = col;
        this.row = row;
        this.color = color;
    }

    //画棋子
    public void draw(Graphics g) {
        //定义棋子圆心
        int xPos = col * 20 + 15;
        int yPos = row * 20 + 15;

        Graphics2D g2d = (Graphics2D) g;

        RadialGradientPaint paint = null;
        Color[] c = { Color.WHITE, Color.BLACK };
        float[] f = { 0f, 1f };
        int x = xPos + 3;
        int y = yPos - 3;
        if (color == Color.WHITE) {
            paint = new RadialGradientPaint(x, y, BANJING * 3, f, c);
        } else {
            paint = new RadialGradientPaint(x, y, BANJING, f, c);
        }
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setPaint(paint);
        g2d.fillOval(xPos - BANJING / 2, yPos - BANJING / 2, BANJING, BANJING);
    }
}