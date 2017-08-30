package test;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Lx板子左端点横坐标，Rx板子左端点横坐标,h表示板子高度
 *
 */
/*
class Board implements Comparable<board> {
    int Lx, Rx, h;

    public Board(int lx, int rx, int h) {
        Lx = lx;
        Rx = rx;
        this.h = h;
    }

    public int compareTo(board o) {
        return o.h - this.h;
    }
}


public class test {
    static int[] leftMin;
    static int[] rightMin;
    static Board[] boards;
    private static final int MAX =Integer.MAX_VALUE ;
    static int max;
    static int n;

    public static int LeftMinTime(int i) { //计算从平台i左边到地面的最短时间
        if (i-1 == 1) {  //板子左端正下方没有别的板子
            if (boards[i].h > max) {
                //LeftMinTime(i) = MAX;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //测试数据组数
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            max = sc.nextInt();
            /*
            第一行是测试数据的组数t（0 <= t <= 20）。
            每组测试数据的第一行是四个整数N，X，Y，MAX，用空格分隔。
            N是平台的数目（不包括地面），X和Y是Jimmy开始下落的位置的横竖坐标，
            MAX是一次下落的最大高度。接下来的N行每行描述一个平台，包括三个整数，
            X1[i]，X2[i]和H[i]。H[i]表示平台的高度，
            X1[i]和X2[i]表示平台左右端点的横坐标。
            *//*
            leftMin = new int[n+1];
            rightMin = new int[n+1];
            Arrays.fill(leftMin, -1);
            Arrays.fill(rightMin, -1);

            boards = new Board[n+1];
            boards[0] = new Board(x,x,y);
            for (int j = 1; j <= n; j++) {
                boards[j] = new Board(sc.nextInt(), sc.nextInt(), sc.nextInt());
            }
            Arrays.sort(boards);
        }

    }



}
