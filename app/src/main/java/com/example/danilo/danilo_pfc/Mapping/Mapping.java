package com.example.danilo.danilo_pfc.Mapping;

import android.app.Activity;

import java.util.Map;

/**
 * Created by Danilo on 03/09/17.
 */

public interface Mapping  {

    /**
     * Metodo para verificação de existencia de chave
     * @param str chave a ser encontrada
     * @return boolean
     */
    public boolean containsKey(String str);

    /**
     * Metodo para verificação de existencia de valor (activity)
     * @param activity activity a ser encontrada
     * @return boolean
     */
    public boolean containsValue(String  activity);

    /**
     * Metodo para criar um novo par chave, valor
     * @param str nome da chave
     * @param activity activity
     */
    public void setKey(String str, String activity);

    /**
     * Metodo retorna activity correspondente a chave de entrada
     * @param str chave
     * @return valor
     */
    public String getValue(String str);

    /**
     * Metodo retorna chave correspondente ao valor de entrada
     * @param i Posição da chave
     * @return Chave correspondente
     */
    public String getKey(int i);

    /**
     *  Metodo para remoção de chave - valor
     * @param str chave a ser removida
     * @return -1 não econtrado, 0 removido
     */
    public int removeKV(String str);


}
