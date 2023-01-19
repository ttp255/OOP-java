public class Run {
    public static void main(String[] args) {
        
        mydate md =new mydate(25,5 ,2003);
        mydate md2 =new mydate(25, 5, 2003);
        mydate md1 =new mydate(25, 5, 2003);
        md.printDay();
        md.printMonth();
        md.printYear();
        md.printDayMonthYear();
        md2.printDayMonthYear();
        System.out.println("Day="+md.getDay());
        md.setDay(35);
        System.out.println("Day="+md.getDay());
        md.setDay(17);
        System.out.println("Day="+md.getDay());
        System.out.println(md);
        System.out.println("So sanh md vs md1: "+md.equals(md1));
        System.out.println("So sanh md vs md2: "+md1.equals(md2));
        System.out.println("md="+md.hashCode());
        System.out.println("md1="+md1.hashCode());
        System.out.println("md2="+md2.hashCode());

    }
}
