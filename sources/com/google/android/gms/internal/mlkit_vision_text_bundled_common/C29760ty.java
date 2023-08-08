package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ty */
public final class C29760ty extends C29722sx<Double> implements RandomAccess, C29872wz, f10 {

    /* renamed from: d */
    public static final C29760ty f71480d;

    /* renamed from: b */
    public double[] f71481b;

    /* renamed from: c */
    public int f71482c;

    static {
        C29760ty tyVar = new C29760ty(new double[0], 0);
        f71480d = tyVar;
        tyVar.mo84834I();
    }

    public C29760ty() {
        this(new double[10], 0);
    }

    /* renamed from: P1 */
    public final /* bridge */ /* synthetic */ C29872wz mo84516P1(int i) {
        if (i >= this.f71482c) {
            return new C29760ty(Arrays.copyOf(this.f71481b, i), this.f71482c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo84835e();
        if (i < 0 || i > (i2 = this.f71482c)) {
            throw new IndexOutOfBoundsException(mo84884i(i));
        }
        double[] dArr = this.f71481b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f71481b, i, dArr2, i + 1, this.f71482c - i);
            this.f71481b = dArr2;
        }
        this.f71481b[i] = doubleValue;
        this.f71482c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo84835e();
        C29909xz.m121347e(collection);
        if (!(collection instanceof C29760ty)) {
            return super.addAll(collection);
        }
        C29760ty tyVar = (C29760ty) collection;
        int i = tyVar.f71482c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f71482c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f71481b;
            if (i3 > dArr.length) {
                this.f71481b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(tyVar.f71481b, 0, this.f71481b, this.f71482c, tyVar.f71482c);
            this.f71482c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29760ty)) {
            return super.equals(obj);
        }
        C29760ty tyVar = (C29760ty) obj;
        if (this.f71482c != tyVar.f71482c) {
            return false;
        }
        double[] dArr = tyVar.f71481b;
        for (int i = 0; i < this.f71482c; i++) {
            if (Double.doubleToLongBits(this.f71481b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo84886k(i);
        return Double.valueOf(this.f71481b[i]);
    }

    /* renamed from: h */
    public final void mo84883h(double d) {
        mo84835e();
        int i = this.f71482c;
        double[] dArr = this.f71481b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f71481b = dArr2;
        }
        double[] dArr3 = this.f71481b;
        int i2 = this.f71482c;
        this.f71482c = i2 + 1;
        dArr3[i2] = d;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f71482c; i2++) {
            i = (i * 31) + C29909xz.m121345c(Double.doubleToLongBits(this.f71481b[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final String mo84884i(int i) {
        int i2 = this.f71482c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f71482c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f71481b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo84886k(int i) {
        if (i < 0 || i >= this.f71482c) {
            throw new IndexOutOfBoundsException(mo84884i(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo84835e();
        mo84886k(i);
        double[] dArr = this.f71481b;
        double d = dArr[i];
        int i2 = this.f71482c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f71482c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo84835e();
        if (i2 >= i) {
            double[] dArr = this.f71481b;
            System.arraycopy(dArr, i2, dArr, i, this.f71482c - i2);
            this.f71482c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo84835e();
        mo84886k(i);
        double[] dArr = this.f71481b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f71482c;
    }

    public C29760ty(double[] dArr, int i) {
        this.f71481b = dArr;
        this.f71482c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo84883h(((Double) obj).doubleValue());
        return true;
    }
}
