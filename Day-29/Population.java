public class Population {
    String countryname;
    Long populationincrores;
    Integer noofstates;

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public Long getPopulationincrores() {
        return populationincrores;
    }

    public void setPopulationincrores(Long populationincrores) {
        this.populationincrores = populationincrores;
    }

    public Integer getNoofstates() {
        return noofstates;
    }

    public void setNoofstates(Integer noofstates) {
        this.noofstates = noofstates;
    }

    public Population(String countryname, Long populationincrores, Integer noofstates) {
        this.countryname = countryname;
        this.populationincrores = populationincrores;
        this.noofstates = noofstates;
    }
public String toString(){
return(this.countryname+" "+this.populationincrores+" "+this.noofstates);
}
}
