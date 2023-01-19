public class SapXepChen implements SapXepInterface {

    @Override
    public void sapXepTang(double[] a) {
        // TODO Auto-generated method stub
        int n = a.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = a[i];
			j = i - 1;

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
    }

    @Override
    public void sapXepGiam(double[] a) {
        // TODO Auto-generated method stub
        int n = a.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = a[i];
			j = i - 1;

			while (j >= 0 && a[j] < key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
    }
    
}
