package com.google.protobuf;

import com.google.protobuf.C34471v0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.v */
public final class C34470v extends C34337c<Double> implements C34471v0.C34473b, RandomAccess, C34510z1 {

    /* renamed from: e */
    public static final C34470v f83526e;

    /* renamed from: c */
    public double[] f83527c;

    /* renamed from: d */
    public int f83528d;

    static {
        C34470v vVar = new C34470v(new double[0], 0);
        f83526e = vVar;
        vVar.mo100970J();
    }

    public C34470v() {
        this(new double[10], 0);
    }

    /* renamed from: q */
    public static C34470v m140557q() {
        return f83526e;
    }

    /* renamed from: A */
    public Double remove(int i) {
        mo100975e();
        mo101630r(i);
        double[] dArr = this.f83527c;
        double d = dArr[i];
        int i2 = this.f83528d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f83528d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* renamed from: B */
    public double mo101620B(int i, double d) {
        mo100975e();
        mo101630r(i);
        double[] dArr = this.f83527c;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    /* renamed from: H */
    public Double set(int i, Double d) {
        return Double.valueOf(mo101620B(i, d.doubleValue()));
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo100975e();
        C34471v0.m140573d(collection);
        if (!(collection instanceof C34470v)) {
            return super.addAll(collection);
        }
        C34470v vVar = (C34470v) collection;
        int i = vVar.f83528d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f83528d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f83527c;
            if (i3 > dArr.length) {
                this.f83527c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(vVar.f83527c, 0, this.f83527c, this.f83528d, vVar.f83528d);
            this.f83528d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c0 */
    public void mo101622c0(double d) {
        mo100975e();
        int i = this.f83528d;
        double[] dArr = this.f83527c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f83527c = dArr2;
        }
        double[] dArr3 = this.f83527c;
        int i2 = this.f83528d;
        this.f83528d = i2 + 1;
        dArr3[i2] = d;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34470v)) {
            return super.equals(obj);
        }
        C34470v vVar = (C34470v) obj;
        if (this.f83528d != vVar.f83528d) {
            return false;
        }
        double[] dArr = vVar.f83527c;
        for (int i = 0; i < this.f83528d; i++) {
            if (Double.doubleToLongBits(this.f83527c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public double getDouble(int i) {
        mo101630r(i);
        return this.f83527c[i];
    }

    /* renamed from: h */
    public void add(int i, Double d) {
        mo101629k(i, d.doubleValue());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f83528d; i2++) {
            i = (i * 31) + C34471v0.m140588s(Double.doubleToLongBits(this.f83527c[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public boolean add(Double d) {
        mo101622c0(d.doubleValue());
        return true;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f83527c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo101629k(int i, double d) {
        int i2;
        mo100975e();
        if (i < 0 || i > (i2 = this.f83528d)) {
            throw new IndexOutOfBoundsException(mo101634y(i));
        }
        double[] dArr = this.f83527c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f83527c, i, dArr2, i + 1, this.f83528d - i);
            this.f83527c = dArr2;
        }
        this.f83527c[i] = d;
        this.f83528d++;
        this.modCount++;
    }

    /* renamed from: r */
    public final void mo101630r(int i) {
        if (i < 0 || i >= this.f83528d) {
            throw new IndexOutOfBoundsException(mo101634y(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo100975e();
        if (i2 >= i) {
            double[] dArr = this.f83527c;
            System.arraycopy(dArr, i2, dArr, i, this.f83528d - i2);
            this.f83528d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f83528d;
    }

    /* renamed from: w */
    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    /* renamed from: y */
    public final String mo101634y(int i) {
        return "Index:" + i + ", Size:" + this.f83528d;
    }

    public C34470v(double[] dArr, int i) {
        this.f83527c = dArr;
        this.f83528d = i;
    }

    /* renamed from: c */
    public C34471v0.C34473b m140562c(int i) {
        if (i >= this.f83528d) {
            return new C34470v(Arrays.copyOf(this.f83527c, i), this.f83528d);
        }
        throw new IllegalArgumentException();
    }
}
