package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w1 */
public final class C39074w1 extends C38864a1<Double> implements RandomAccess, C39075w2, C38907e4 {

    /* renamed from: d */
    public static final C39074w1 f98953d;

    /* renamed from: b */
    public double[] f98954b;

    /* renamed from: c */
    public int f98955c;

    static {
        C39074w1 w1Var = new C39074w1(new double[0], 0);
        f98953d = w1Var;
        w1Var.zzb();
    }

    public C39074w1() {
        this(new double[10], 0);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo122768e();
        if (i < 0 || i > (i2 = this.f98955c)) {
            throw new IndexOutOfBoundsException(mo123109i(i));
        }
        double[] dArr = this.f98954b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f98954b, i, dArr2, i + 1, this.f98955c - i);
            this.f98954b = dArr2;
        }
        this.f98954b[i] = doubleValue;
        this.f98955c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo122768e();
        C39084x2.m160969e(collection);
        if (!(collection instanceof C39074w1)) {
            return super.addAll(collection);
        }
        C39074w1 w1Var = (C39074w1) collection;
        int i = w1Var.f98955c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f98955c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f98954b;
            if (i3 > dArr.length) {
                this.f98954b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(w1Var.f98954b, 0, this.f98954b, this.f98955c, w1Var.f98955c);
            this.f98955c = i3;
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
        if (!(obj instanceof C39074w1)) {
            return super.equals(obj);
        }
        C39074w1 w1Var = (C39074w1) obj;
        if (this.f98955c != w1Var.f98955c) {
            return false;
        }
        double[] dArr = w1Var.f98954b;
        for (int i = 0; i < this.f98955c; i++) {
            if (Double.doubleToLongBits(this.f98954b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo123111k(i);
        return Double.valueOf(this.f98954b[i]);
    }

    /* renamed from: h */
    public final void mo123108h(double d) {
        mo122768e();
        int i = this.f98955c;
        double[] dArr = this.f98954b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f98954b = dArr2;
        }
        double[] dArr3 = this.f98954b;
        int i2 = this.f98955c;
        this.f98955c = i2 + 1;
        dArr3[i2] = d;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f98955c; i2++) {
            i = (i * 31) + C39084x2.m160967c(Double.doubleToLongBits(this.f98954b[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final String mo123109i(int i) {
        int i2 = this.f98955c;
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
        int i = this.f98955c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f98954b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo123111k(int i) {
        if (i < 0 || i >= this.f98955c) {
            throw new IndexOutOfBoundsException(mo123109i(i));
        }
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C39075w2 mo122844n(int i) {
        if (i >= this.f98955c) {
            return new C39074w1(Arrays.copyOf(this.f98954b, i), this.f98955c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo122768e();
        mo123111k(i);
        double[] dArr = this.f98954b;
        double d = dArr[i];
        int i2 = this.f98955c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f98955c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo122768e();
        if (i2 >= i) {
            double[] dArr = this.f98954b;
            System.arraycopy(dArr, i2, dArr, i, this.f98955c - i2);
            this.f98955c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo122768e();
        mo123111k(i);
        double[] dArr = this.f98954b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f98955c;
    }

    public C39074w1(double[] dArr, int i) {
        this.f98954b = dArr;
        this.f98955c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo123108h(((Double) obj).doubleValue());
        return true;
    }
}
