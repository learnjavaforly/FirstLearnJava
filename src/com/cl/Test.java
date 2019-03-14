package com.cl;
public class Test {
    public static void main(String[] args) {
//        new Test().getDistance(0D, 0D, 0D, 1D, 0D, 1D, 1D);
        new Test().getVerticalIntersection(1D, 0D, 0D, 1D, 5D, 5D);
    }

    //直线外一点垂直该线  求交点

    public void getVerticalIntersection(Double x1, Double y1, Double x2, Double y2, Double x3, Double y3) {
        //计算直线 ax + by + c = 0
        //由(y-y1)/(y2-y1)=(x-x1)/(x2-x1)得出
        Double a = y2 - y1;
        Double b = x1 - x2;
        if (a == 0)
            b = 1D;
        if (b == 0)
            a = 1D;
        Double c = -(a * x1 + b * y1);
        System.out.println(a + "x+" + b + "y+" + c);

//        当a=0时,垂线为x=x1(x1属于R）
        Double a3 = b;
        Double b3 = -a;
        if (a3 == 0) {
            b3 = 1d;
        }
//        当b=0时,垂线为y=y1(y1属于R）
        if (b3 == 0) {
            a3 = 1d;
        }
//        当a,b均不为零时可设为：bx-ay+c1=0

        Double c3 = -(a3 * x3 + b3 * y3);
        System.out.println(a3 + "x+" + b3 + "y+" + c3);

        //交点
        Double ry = 0D;
        Double rx = 0D;
        if (a == 0) {
            ry = -c / b;
            if (a3 == 0) {
                System.out.println("异常");
            } else {
                rx = -(b3 * ry + c3) / a3;
            }
        } else if (b == 0) {
            rx = -c / a;
            if (b3 == 0) {
                System.out.println("异常");

            } else {
                rx = -(a3 * ry + c3) / b3;
            }
        } else {
            ry = (c3 * a - c * a3) / (b * a3 - b3 * a);
            rx = -(b3 * ry + c3) / a3;
        }
        System.out.println(rx + "," + ry);

    }


    public void getDistance(Double x1, Double y1, Double x2, Double y2, Double x3, Double y3, Double r3) {
        //计算直线 ax + bx + c = 0
        //由(y-y1)/(y2-y1)=(x-x1)/(x2-x1)得出
        Double a = y2 - y1;
        Double b = x1 - x2;
        Double c = (x2 - x1) * y1 - x1 * (y2 - y1);

        //计算点到距离的公式 d=|Ax0+By0+C|/√A^2+B^2
        //计算分子
        Double molecule = Math.abs(a * x3 + b * y3 + c);
        //计算分母
        Double denominator = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        //得出距离
        Double distance = molecule / denominator;
        System.out.println(distance);
    }

    public void getLine(Double p1, Double q1, Double p2, Double q2, Double a, Double b, Double r) {
        //点1 切线
        Double molecule11 = (p1 - a) * (q1 - b) + r * Math.sqrt(Math.pow((p1 - a), 2) + Math.pow((q1 - b), 2) - Math.pow(r, 2));
        Double molecule12 = (p1 - a) * (q1 - b) - r * Math.sqrt(Math.pow((p1 - a), 2) + Math.pow((q1 - b), 2) - Math.pow(r, 2));
        Double denominator1 = Math.pow((p1 - a), 2) - Math.pow(r, 2);
        Double k11 = molecule11 / denominator1;
        Double k12 = molecule12 / denominator1;
        System.out.println("y=" + k11 + "(x-" + p1 + ")+" + q1);
        System.out.println("y=" + k12 + "(x-" + p1 + ")+" + q1);

        //点2  切线
        Double molecule21 = (p2 - a) * (q2 - b) + r * Math.sqrt(Math.pow((p2 - a), 2) + Math.pow((q2 - b), 2) - Math.pow(r, 2));
        Double molecule22 = (p2 - a) * (q2 - b) - r * Math.sqrt(Math.pow((p2 - a), 2) + Math.pow((q2 - b), 2) - Math.pow(r, 2));
        Double denominator2 = Math.pow((p2 - a), 2) - Math.pow(r, 2);
        Double k21 = molecule21 / denominator2;
        Double k22 = molecule22 / denominator2;
        System.out.println("y=" + k21 + "(x-" + p2 + ")+" + q2);
        System.out.println("y=" + k22 + "(x-" + p2 + ")+" + q2);

        //k11 k21
        //判断是否平行
        if (k11 != k21) {
            Double x_k11_k21 = (k11 * p1 - k21 * p2 + q2 - q1) / (k11 - k21);
            Double y_k11_k21 = k11 * (x_k11_k21 - p1) + q1;
            //x坐标需要在p1和p2之间
            if (p1 > p2) {
                if (x_k11_k21 > p2 && x_k11_k21 < p1) {
                    System.out.println(x_k11_k21 + "," + y_k11_k21);
                }
            } else {
                if (x_k11_k21 > p1 && x_k11_k21 < p2) {
                    System.out.println(x_k11_k21 + "," + y_k11_k21);
                }
            }

        }
        //k11 k22
        if (k11 != k22) {
            Double x_k11_k22 = (k11 * p1 - k22 * p2 + q2 - q1) / (k11 - k22);
            Double y_k11_k22 = k11 * (x_k11_k22 - p1) + q1;
            if (p1 > p2) {
                if (x_k11_k22 > p2 && x_k11_k22 < p1) {
                    System.out.println(x_k11_k22 + "," + y_k11_k22);
                }
            } else {
                if (x_k11_k22 > p1 && x_k11_k22 < p2) {
                    System.out.println(x_k11_k22 + "," + y_k11_k22);
                }
            }
        }

        //k12 k21
        if (k12 != k21) {
            Double x_k12_k21 = (k12 * p1 - k21 * p2 + q2 - q1) / (k12 - k21);
            Double y_k12_k21 = k12 * (x_k12_k21 - p1) + q1;
            if (p1 > p2) {
                if (x_k12_k21 > p2 && x_k12_k21 < p1) {
                    System.out.println(x_k12_k21 + "," + y_k12_k21);
                }
            } else {
                if (x_k12_k21 > p1 && x_k12_k21 < p2) {
                    System.out.println(x_k12_k21 + "," + y_k12_k21);
                }
            }
        }
        //k12 k22
        if (k12 != k22) {
            Double x_k12_k22 = (k12 * p1 - k22 * p2 + q2 - q1) / (k12 - k22);
            Double y_k12_k22 = k12 * (x_k12_k22 - p1) + q1;
            if (p1 > p2) {
                if (x_k12_k22 > p2 && x_k12_k22 < p1) {
                    System.out.println(x_k12_k22 + "," + y_k12_k22);
                }
            } else {
                if (x_k12_k22 > p1 && x_k12_k22 < p2) {
                    System.out.println(x_k12_k22 + "," + y_k12_k22);
                }
            }
        }

    }


    public Double countDistance(Double x1, Double y1, Double x2, Double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

    }
}
