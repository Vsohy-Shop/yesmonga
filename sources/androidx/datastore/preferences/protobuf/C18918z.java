package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.z */
public final class C18918z extends C18695c<Double> implements C18753i1.C18755b, RandomAccess, C18846q2 {

    /* renamed from: e */
    public static final C18918z f48144e;

    /* renamed from: c */
    public double[] f48145c;

    /* renamed from: d */
    public int f48146d;

    static {
        C18918z zVar = new C18918z(new double[0], 0);
        f48144e = zVar;
        zVar.mo54404J();
    }

    public C18918z() {
        this(new double[10], 0);
    }

    /* renamed from: q */
    public static C18918z m88228q() {
        return f48144e;
    }

    /* renamed from: A */
    public Double remove(int i) {
        mo54411e();
        mo55680r(i);
        double[] dArr = this.f48145c;
        double d = dArr[i];
        int i2 = this.f48146d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f48146d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* renamed from: B */
    public double mo54825B(int i, double d) {
        mo54411e();
        mo55680r(i);
        double[] dArr = this.f48145c;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    /* renamed from: H */
    public Double set(int i, Double d) {
        return Double.valueOf(mo54825B(i, d.doubleValue()));
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo54411e();
        C18753i1.m86340d(collection);
        if (!(collection instanceof C18918z)) {
            return super.addAll(collection);
        }
        C18918z zVar = (C18918z) collection;
        int i = zVar.f48146d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f48146d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f48145c;
            if (i3 > dArr.length) {
                this.f48145c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zVar.f48145c, 0, this.f48145c, this.f48146d, zVar.f48146d);
            this.f48146d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c0 */
    public void mo54826c0(double d) {
        mo54411e();
        int i = this.f48146d;
        double[] dArr = this.f48145c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f48145c = dArr2;
        }
        double[] dArr3 = this.f48145c;
        int i2 = this.f48146d;
        this.f48146d = i2 + 1;
        dArr3[i2] = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18918z)) {
            return super.equals(obj);
        }
        C18918z zVar = (C18918z) obj;
        if (this.f48146d != zVar.f48146d) {
            return false;
        }
        double[] dArr = zVar.f48145c;
        for (int i = 0; i < this.f48146d; i++) {
            if (Double.doubleToLongBits(this.f48145c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public double getDouble(int i) {
        mo55680r(i);
        return this.f48145c[i];
    }

    /* renamed from: h */
    public void add(int i, Double d) {
        mo55679k(i, d.doubleValue());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f48146d; i2++) {
            i = (i * 31) + C18753i1.m86355s(Double.doubleToLongBits(this.f48145c[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public boolean add(Double d) {
        mo54826c0(d.doubleValue());
        return true;
    }

    /* renamed from: k */
    public final void mo55679k(int i, double d) {
        int i2;
        mo54411e();
        if (i < 0 || i > (i2 = this.f48146d)) {
            throw new IndexOutOfBoundsException(mo55684y(i));
        }
        double[] dArr = this.f48145c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f48145c, i, dArr2, i + 1, this.f48146d - i);
            this.f48145c = dArr2;
        }
        this.f48145c[i] = d;
        this.f48146d++;
        this.modCount++;
    }

    /* renamed from: r */
    public final void mo55680r(int i) {
        if (i < 0 || i >= this.f48146d) {
            throw new IndexOutOfBoundsException(mo55684y(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo54411e();
        if (i2 >= i) {
            double[] dArr = this.f48145c;
            System.arraycopy(dArr, i2, dArr, i, this.f48146d - i2);
            this.f48146d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f48146d;
    }

    /* renamed from: w */
    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    /* renamed from: y */
    public final String mo55684y(int i) {
        return "Index:" + i + ", Size:" + this.f48146d;
    }

    public C18918z(double[] dArr, int i) {
        this.f48145c = dArr;
        this.f48146d = i;
    }

    /* renamed from: c */
    public C18753i1.C18755b m88233c(int i) {
        if (i >= this.f48146d) {
            return new C18918z(Arrays.copyOf(this.f48145c, i), this.f48146d);
        }
        throw new IllegalArgumentException();
    }

    public boolean remove(Object obj) {
        mo54411e();
        for (int i = 0; i < this.f48146d; i++) {
            if (obj.equals(Double.valueOf(this.f48145c[i]))) {
                double[] dArr = this.f48145c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f48146d - i) - 1);
                this.f48146d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
