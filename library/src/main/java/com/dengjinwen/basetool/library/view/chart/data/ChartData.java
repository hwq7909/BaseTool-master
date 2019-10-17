package com.dengjinwen.basetool.library.view.chart.data;

import com.dengjinwen.basetool.library.view.chart.interfaces.iData.IChartData;

public class ChartData extends BaseData implements IChartData {

    protected String name="";

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }
}
