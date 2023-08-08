package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.gtm.ti */
public final class C41601ti extends C41743zg<Double> implements RandomAccess, C41626uj, C41195cl {

    /* renamed from: d */
    public static final C41601ti f105018d;

    /* renamed from: b */
    public double[] f105019b;

    /* renamed from: c */
    public int f105020c;

    static {
        C41601ti tiVar = new C41601ti(new double[0], 0);
        f105018d = tiVar;
        tiVar.zzb();
    }

    public C41601ti() {
        this(new double[10], 0);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo136121e();
        if (i < 0 || i > (i2 = this.f105020c)) {
            throw new IndexOutOfBoundsException(mo135867i(i));
        }
        double[] dArr = this.f105019b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f105019b, i, dArr2, i + 1, this.f105020c - i);
            this.f105019b = dArr2;
        }
        this.f105019b[i] = doubleValue;
        this.f105020c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo136121e();
        C41650vj.m168603e(collection);
        if (!(collection instanceof C41601ti)) {
            return super.addAll(collection);
        }
        C41601ti tiVar = (C41601ti) collection;
        int i = tiVar.f105020c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f105020c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f105019b;
            if (i3 > dArr.length) {
                this.f105019b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(tiVar.f105019b, 0, this.f105019b, this.f105020c, tiVar.f105020c);
            this.f105020c = i3;
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
        if (!(obj instanceof C41601ti)) {
            return super.equals(obj);
        }
        C41601ti tiVar = (C41601ti) obj;
        if (this.f105020c != tiVar.f105020c) {
            return false;
        }
        double[] dArr = tiVar.f105019b;
        for (int i = 0; i < this.f105020c; i++) {
            if (Double.doubleToLongBits(this.f105019b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo135869k(i);
        return Double.valueOf(this.f105019b[i]);
    }

    /* renamed from: h */
    public final void mo135866h(double d) {
        mo136121e();
        int i = this.f105020c;
        double[] dArr = this.f105019b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f105019b = dArr2;
        }
        double[] dArr3 = this.f105019b;
        int i2 = this.f105020c;
        this.f105020c = i2 + 1;
        dArr3[i2] = d;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f105020c; i2++) {
            i = (i * 31) + C41650vj.m168601c(Double.doubleToLongBits(this.f105019b[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final String mo135867i(int i) {
        int i2 = this.f105020c;
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
        int i = this.f105020c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f105019b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo135869k(int i) {
        if (i < 0 || i >= this.f105020c) {
            throw new IndexOutOfBoundsException(mo135867i(i));
        }
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C41626uj mo135130n(int i) {
        if (i >= this.f105020c) {
            return new C41601ti(Arrays.copyOf(this.f105019b, i), this.f105020c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136121e();
        mo135869k(i);
        double[] dArr = this.f105019b;
        double d = dArr[i];
        int i2 = this.f105020c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f105020c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo136121e();
        if (i2 >= i) {
            double[] dArr = this.f105019b;
            System.arraycopy(dArr, i2, dArr, i, this.f105020c - i2);
            this.f105020c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo136121e();
        mo135869k(i);
        double[] dArr = this.f105019b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f105020c;
    }

    public C41601ti(double[] dArr, int i) {
        this.f105019b = dArr;
        this.f105020c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo135866h(((Double) obj).doubleValue());
        return true;
    }
}
