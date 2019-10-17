package com.dengjinwen.basetool.activity.designPattern.commandMode;

import com.dengjinwen.basetool.library.tool.log;

/**
 * 接收者
 */
public class Lights {

    public void off(){
        log.e("灯关闭");
    }

    public void on(){
        log.e("灯打开");
    }
}
