

public class Test7 {
    public static void main(String[] args) {
        
        double a[]=new double[] {2,3,4,1,5};
        double a1[]=new double[] {5,5,20,8,7,3};
        SapXepChen sxchen =new SapXepChen();
        SapXepChon sxchon =new SapXepChon();
        sxchen.sapXepTang(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        sxchon.sapXepTang(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        PhanMemMayTInh pmt = new PhanMemMayTInh();
        System.out.println("3*5= "+pmt.nhan(3, 5));
        pmt.sapXepGiam(a1);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }

		
    }
}

