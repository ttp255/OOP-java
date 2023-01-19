public class SapXepChon implements SapXepInterface {

    @Override
    public void sapXepTang(double[] a) {
        // TODO Auto-generated method stub
        int n=a.length;
        double tempt;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    tempt=a[i];
                    a[i]=a[j];
                    a[j]=tempt;
                }
            }
        }
    }

    @Override
    public void sapXepGiam(double[] a) {
        // TODO Auto-generated method stub
        int n=a.length;
        double tempt;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    tempt=a[i];
                    a[i]=a[j];
                    a[j]=tempt;
                }
            }
        }
    }
    
}
