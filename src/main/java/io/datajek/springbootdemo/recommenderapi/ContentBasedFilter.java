package io.datajek.springbootdemo.recommenderapi;

public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie) {
        //implement logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
