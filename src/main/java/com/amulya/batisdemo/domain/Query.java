package com.amulya.batisdemo.domain;

import java.util.List;

public class Query {

    List<Integer> l;

    public List<Integer> getL() {
        return l;
    }

    public void setL(List<Integer> l) {
        this.l = l;
    }

    public Query(List<Integer> l) {
        this.l = l;
    }
}
