package com.example.danilo.danilo_pfc.Mapping;

import android.app.Activity;

/**
 * Created by Danilo on 03/09/17.
 */

public class Mapp<K,V>
{
    private final K key;
    private V value;

    public Mapp(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
