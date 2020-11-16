package com.github.wuxudong.rncharts.charts;

import com.github.mikephil.charting.formatter.ValueFormatter;

import java.text.DecimalFormat;

public class DisableNilValueFormatter extends ValueFormatter {

    private DecimalFormat mFormat;

    public DisableNilValueFormatter() {
        mFormat = new DecimalFormat("###,###,##0.00");
    }

    @Override
    public String getFormattedValue(float value) {

        if(value > 0) {
            return mFormat.format(value);
        } else {
            return "";
        }
    }
}