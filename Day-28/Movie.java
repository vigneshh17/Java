public class Movie implements Comparable<Movie> {
    String name;
    int year;
    double collections;
    public Movie(String name,int year,double collections){
     this.name=name;
     this.year=year;
     this.collections=collections;
    }
    public String toString(){
    return this.name+" "+this.year+" "+this.collections;
    }

    @Override
    public int compareTo(Movie o) {
        return (int) (o.year - this.year);
    }
}
