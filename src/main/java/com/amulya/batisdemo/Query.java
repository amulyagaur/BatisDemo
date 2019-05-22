package com.amulya.batisdemo;

import java.util.ArrayList;
import java.util.List;

public class Query {

    List<Integer> l;

    public List<Integer> getL() {
        return l;
    }

    public void setL(List<Integer> l) {
        this.l = l;
    }

    Query(){
        l=new ArrayList<Integer>();
    }
}
