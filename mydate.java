/**
 * mydate
 */
public class mydate {

    private int day;
    private int month;
    private int year;
    public mydate(int d,int m, int y ){
        this.day=d;
        this.month=m;
        this.year=y;
    }
    public void printDay(){
        System.out.println("Day"+this.day);
    }
    
    public void printMonth(){
        System.out.println("MOnth: "+this.month);
    }
    public void printYear(){
        System.out.println("Year: "+this.year);
    }
    public void printDayMonthYear(){
        System.out.println("Day-MOnth-Year: "+this.day+"-"+this.month+"-"+this.year);
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.day;
    }
    public int getYear(){
        return this.day;
    }
    public void setDay(int d){
        if(d>=1 && d<=31){
            this.day=d;
        }

    }
    public void setMonth(int m){
        if(m>=1 && m<=12){
            this.day=m;
        }

    }
    public void setYear(int y){
        if(y>=1){
            this.day=y;
        }

    }
    @Override
    public String toString() {
        return this.day +"/"+ this.month+"/"+this.year;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
             return false;
        if (this.getClass() != obj.getClass())
             return false;
         mydate other = (mydate) obj;
        if (this.day != other.day)
            return false;
        if (this.month != other.month)
            return false;
        if (this.year != other.year)
            return false;
        return true;
            
    }
    @Override
    public int hashCode() {
        final int prime =31;
        int result =1;
        result=prime*result+day;
        result=prime*result+month;
        result=prime*result+year;
        return result;
    }
}   
    

