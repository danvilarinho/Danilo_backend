package com.example.danilo.danilo_pfc.Mapping;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MappingImpl extends Activity implements Mapping {


    @SuppressWarnings("unchecked")
    private List<Mapp<String,String>> values;

    public MappingImpl()
    {
        this.values = new ArrayList<>();
    }

    @Override
    public boolean containsKey(String str) {
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) != null) {
                if (values.get(i).getKey().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(String activity) {
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) != null) {
                if (values.get(i).getValue().equals(activity)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void setKey(String str, String activity) {
        values.add(new Mapp<String, String>(str, activity));
    }

    @Override
    public String getValue(String str) {
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) != null) {
                if (values.get(i).getKey().equals(str)) {
                    return values.get(i).getValue();
                }
            }
        }
        return null;
    }

    @Override
    public String getKey(int i) {
        for (int j = 0; j < values.size(); j++) {
            if (values.get(j) != null) {
                return values.get(j).getKey();
            }
        }
        return null;
    }

    @Override
    public int removeKV(String str) {
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) != null) {
                if (values.get(i).getKey().equals(str)) {
                    values.remove(i);
                    return 0;
                }
            }
        }
        return -1;
    }
}