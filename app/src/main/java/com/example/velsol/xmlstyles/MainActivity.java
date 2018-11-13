package com.example.velsol.xmlstyles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    BarChart bchart;
    PieChart piechart;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // bchart=(BarChart)findViewById(R.id.bchart);
        piechart=(PieChart) findViewById(R.id.piechart);



//barchart starting here  .............
       /* ArrayList<BarEntry> entries = new ArrayList();
            entries.add(new BarEntry(4f, 0));
            entries.add(new BarEntry(8f, 1));
            entries.add(new BarEntry(6f, 2));
            entries.add(new BarEntry(12f, 3));
            entries.add(new BarEntry(18f, 4));
            entries.add(new BarEntry(9f, 5));


        BarDataSet dataset = new BarDataSet(entries, "hello");
    //defining the x-axis labels
        ArrayList<String> labels = new ArrayList();
            labels.add("January");
            labels.add("February");
            labels.add("March");
            labels.add("April");
            labels.add("May");
            labels.add("June");

            BarData data = new BarData(labels, dataset);
        bchart.setData(data); // set the data and list of lables into chart<br />
        bchart.setDescription("Description");*/
        //barchart ending......






        // IMPORTANT: In a PieChart, no values (Entry) should have the same
        // xIndex (even if from different DataSets), since no values can be
        // drawn above each other.

        //piechart is starting here

        ArrayList<Entry> yvalues = new ArrayList<Entry>();
        yvalues.add(new Entry(8f, 0));
        yvalues.add(new Entry(15f, 1));
        yvalues.add(new Entry(12f, 2));
        yvalues.add(new Entry(25f, 3));
        yvalues.add(new Entry(23f, 4));
        yvalues.add(new Entry(17f, 5));

        PieDataSet dataSet = new PieDataSet(yvalues, "Election Results");


        ArrayList<String> xVals = new ArrayList<String>();

        xVals.add("January");
        xVals.add("February");
        xVals.add("March");
        xVals.add("April");
        xVals.add("May");
        xVals.add("June");

        PieData data1 = new PieData(xVals, dataSet);
        data1.setValueFormatter(new PercentFormatter());
        piechart.setData(data1);
//piechart ending here .....



    }
}
