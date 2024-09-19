public class Mobile implements Comparable<Mobile> {
 String brandname;
 int modelyear;
 int storage;
 float androidversion;
 public Mobile(String brandname, int modelyear, int storage, double androidversion){
 this.brandname=brandname;
 this.modelyear=modelyear;
 this.storage=storage;
 this.androidversion= (float) androidversion;
 }
 public String toString(){
 return this.brandname+" "+this.modelyear+" "+this.storage+" "+this.androidversion;
 }

    @Override
    public int compareTo(Mobile o) {
        return (int) this.modelyear -o.modelyear;
    }
}
