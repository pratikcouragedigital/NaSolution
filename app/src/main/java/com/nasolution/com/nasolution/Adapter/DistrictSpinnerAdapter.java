package com.nasolution.com.nasolution.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.nasolution.com.nasolution.DistrictMaster;
import com.nasolution.com.nasolution.TalukaMaster;
import com.nasolution.com.nasolution.Model.DistrictListItems;

import java.util.ArrayList;
import java.util.List;

public class DistrictSpinnerAdapter extends ArrayAdapter {

    private ArrayList arrayList;
    private Context context;
    private DistrictListItems items = null;

    public DistrictSpinnerAdapter(Context context, int resource, List<String> districtStateList, List objects) {
        super(context, resource, objects);
    }

    public DistrictSpinnerAdapter(TalukaMaster talukaMaster, int district_spinneritem, List<String> talukaDistrictNameList) {
        super(talukaMaster,district_spinneritem,talukaDistrictNameList);

    }

    public DistrictSpinnerAdapter(Context company, int district_spinneritem, List<String> companyDistrictList) {
        super(company,district_spinneritem,companyDistrictList);
    }

    public DistrictSpinnerAdapter(DistrictMaster districtMaster, int district_spinneritem, List<String> districtNameList) {
        super(districtMaster, district_spinneritem, districtNameList);
    }

    @Override
    public boolean isEnabled(int position) {
        if(position == 0) {
            // Disable the first item from Spinner
            // First item will be use for hint
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {

        View view = super.getDropDownView(position, convertView, parent);
        TextView tv = (TextView) view;
        if(position == 0){
            // Set the hint text color gray
            tv.setTextColor(Color.GRAY);
            tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
        else {
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
        return view;
    }
}
