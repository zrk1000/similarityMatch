package com.zrk1000.match;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rongkang on 2017-08-24.
 */
public class Main {

    public static void main(String[] args) {
        List<Point> lis = new ArrayList<Point>();
        lis.add(new Point(200,425));
        lis.add(new Point(201,424));
        lis.add(new Point(202,423));
        lis.add(new Point(203,422));
        lis.add(new Point(204,421));
        System.out.println("匹配集合："+lis.toString());
        Point point = new Point(201, 421);
        System.out.println("匹配目标："+point);
        System.out.println("匹配结果："+getMinDistance(lis,point));
    }

    public static double distance(Point p1, Point p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static Point getMinDistance(List<Point> list,Point point) {
        Double distance = Double.MAX_VALUE;
        Point result = null;
        for(Point p:list){
            double d = distance(point, p);
            if(d < distance){
                distance = d;
                result = p;
            }
        }
        return result;
    }
}
