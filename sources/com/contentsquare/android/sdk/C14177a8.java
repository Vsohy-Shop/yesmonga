package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14566o3;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.contentsquare.android.sdk.a8 */
public final class C14177a8 extends C14240c3<Double> implements C14566o3.C14568b, RandomAccess, C14548n9 {

    /* renamed from: d */
    public static final C14177a8 f35050d;

    /* renamed from: b */
    public double[] f35051b;

    /* renamed from: c */
    public int f35052c;

    static {
        C14177a8 a8Var = new C14177a8(new double[0], 0);
        f35050d = a8Var;
        a8Var.mo34819c();
    }

    public C14177a8() {
        this(new double[10], 0);
    }

    /* renamed from: A */
    public Double get(int i) {
        return Double.valueOf(mo34501H(i));
    }

    /* renamed from: H */
    public double mo34501H(int i) {
        mo34524y(i);
        return this.f35051b[i];
    }

    /* renamed from: M */
    public final String mo34502M(int i) {
        return "Index:" + i + ", Size:" + this.f35052c;
    }

    /* renamed from: Q */
    public C14566o3.C14568b mo34508b(int i) {
        if (i >= this.f35052c) {
            return new C14177a8(Arrays.copyOf(this.f35051b, i), this.f35052c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: W */
    public Double remove(int i) {
        mo34821e();
        mo34524y(i);
        double[] dArr = this.f35051b;
        double d = dArr[i];
        int i2 = this.f35052c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f35052c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo34821e();
        C14566o3.m62804f(collection);
        if (!(collection instanceof C14177a8)) {
            return super.addAll(collection);
        }
        C14177a8 a8Var = (C14177a8) collection;
        int i = a8Var.f35052c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f35052c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f35051b;
            if (i3 > dArr.length) {
                this.f35051b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(a8Var.f35051b, 0, this.f35051b, this.f35052c, a8Var.f35052c);
            this.f35052c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14177a8)) {
            return super.equals(obj);
        }
        C14177a8 a8Var = (C14177a8) obj;
        if (this.f35052c != a8Var.f35052c) {
            return false;
        }
        double[] dArr = a8Var.f35051b;
        for (int i = 0; i < this.f35052c; i++) {
            if (Double.doubleToLongBits(this.f35051b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public void mo34512h(double d) {
        mo34821e();
        int i = this.f35052c;
        double[] dArr = this.f35051b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f35051b = dArr2;
        }
        double[] dArr3 = this.f35051b;
        int i2 = this.f35052c;
        this.f35052c = i2 + 1;
        dArr3[i2] = d;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35052c; i2++) {
            i = (i * 31) + C14566o3.m62800b(Double.doubleToLongBits(this.f35051b[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final void mo34514i(int i, double d) {
        int i2;
        mo34821e();
        if (i < 0 || i > (i2 = this.f35052c)) {
            throw new IndexOutOfBoundsException(mo34502M(i));
        }
        double[] dArr = this.f35051b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f35051b, i, dArr2, i + 1, this.f35052c - i);
            this.f35051b = dArr2;
        }
        this.f35051b[i] = d;
        this.f35052c++;
        this.modCount++;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f35051b[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public void add(int i, Double d) {
        mo34514i(i, d.doubleValue());
    }

    /* renamed from: q */
    public boolean add(Double d) {
        mo34512h(d.doubleValue());
        return true;
    }

    /* renamed from: r */
    public double mo34518r(int i, double d) {
        mo34821e();
        mo34524y(i);
        double[] dArr = this.f35051b;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public void removeRange(int i, int i2) {
        mo34821e();
        if (i2 >= i) {
            double[] dArr = this.f35051b;
            System.arraycopy(dArr, i2, dArr, i, this.f35052c - i2);
            this.f35052c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f35052c;
    }

    /* renamed from: w */
    public Double set(int i, Double d) {
        return Double.valueOf(mo34518r(i, d.doubleValue()));
    }

    /* renamed from: y */
    public final void mo34524y(int i) {
        if (i < 0 || i >= this.f35052c) {
            throw new IndexOutOfBoundsException(mo34502M(i));
        }
    }

    public C14177a8(double[] dArr, int i) {
        this.f35051b = dArr;
        this.f35052c = i;
    }
}
