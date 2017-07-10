package com.brain.base;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Brainhu on 2017/7/9.
 *
 1. 类和对象
 2. final 常量
 3. 构造方法及其重载
 4. this 和 super 关键字的使用
 5. 方法重写
 6. 类的三大特征:封装、继承、多态
 *
 */
public class MyFrame extends Frame {
    private static final long serialVersionUID = 1L;
    public static final int FRAME_WIDETH=900;   //窗口宽度
    public static final int FRAME_HIGHTH=730;   //窗口高度

    protected MyFrame(String s){
        super(s);
    }
    public void launchFrame() {
        this.setSize(FRAME_WIDETH, FRAME_HIGHTH);
        this.setLocation(100, 4);
        this.setVisible(true);
        //设置监听，关闭窗口
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        new FrameThread().start();//开启线程
    }
    /**
     *
     * 重画！！
     *
     */
    class FrameThread extends Thread {
        public void run() {
            while (true) {//死循环，不断重画
                repaint();
                try {
                    Thread.sleep(40);//间隔40ms画
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
