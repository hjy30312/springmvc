package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Lx板子左端点横坐标，Rx板子左端点横坐标,h表示板子高度
 */

class Board implements Comparable<Board> {
    int Lx, Rx, h;

    public Board(int lx, int rx, int h) {
        Lx = lx;
        Rx = rx;
        this.h = h;
    }

    public int compareTo(Board o) {
        return o.h - this.h;
    }

}

public class test {
    static int[] leftMin;
    static int[] rightMin;
    static Board[] boards;
    private static final int MAX = Integer.MAX_VALUE;
    static int max;
    static int n;

    public static int minTime(int i, boolean isLeft) { //计算从平台i左边到地面的最短时间
        //初始化
        int x;
        int y = boards[i].h;
        //如果是去左边，就走到左边边上，如果去右边，就走到右边边上
        if (isLeft) {
            x = boards[i].Lx;
        } else {
            x = boards[i].Rx;
        }

        //找到现在这块板下面的那块板（满足落点在板的左右端之间）
        int j;
        for (j = i+1;j <= n; j++) {
            if (boards[j].Lx <= x && boards[j].Rx >= x)
                break;
        }

        //找到下面那块板后算出最短时间
        if (j == n+1) { //下方没有板了，直接到平台
            if (y > max) {
                return MAX;
            } else {
                return y;
            }
        } else {    //下方还有板
            if (y > max) {
                return MAX;
            } else {
                //避免重复计算
                if (leftMin[j] == -1)
                    leftMin[j] = minTime(j,true);
                if (rightMin[j] == -1)
                    rightMin[j] = minTime(j,false);
                //高度差 + Math.min(走左端,走右端)
                return (y - boards[j].h) +
                        Math.min(leftMin[j]+x-boards[j].Lx, rightMin[j]+boards[j].Rx-x);

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

            leftMin = new int[n + 1];
            rightMin = new int[n + 1];
            Arrays.fill(leftMin, -1);
            Arrays.fill(rightMin, -1);
            boards = new Board[n + 1];
            boards[0] = new Board(x, x, y);

            for (int j = 1; j <= n; j++) {
                boards[j] = new Board(sc.nextInt(), sc.nextInt(), sc.nextInt());
            }
            Arrays.sort(boards);    //按高度从高到低排
            System.out.println(minTime(0,true));
        }
    }
}
