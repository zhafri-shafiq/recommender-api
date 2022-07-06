package io.datajek.springbootdemo.recommenderapi;

public interface Filter {

    public String[] getRecommendations(String movie);
}
