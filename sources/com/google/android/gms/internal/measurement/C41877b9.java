package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.b9 */
public final class C41877b9 extends C41966g8 implements RandomAccess, C42296z9, C41915db {

    /* renamed from: d */
    public static final C41877b9 f106025d = new C41877b9(new double[0], 0, false);

    /* renamed from: b */
    public double[] f106026b;

    /* renamed from: c */
    public int f106027c;

    public C41877b9() {
        this(new double[10], 0, true);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo136872e();
        if (i < 0 || i > (i2 = this.f106027c)) {
            throw new IndexOutOfBoundsException(mo136615i(i));
        }
        double[] dArr = this.f106026b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f106026b, i, dArr2, i + 1, this.f106027c - i);
            this.f106026b = dArr2;
        }
        this.f106026b[i] = doubleValue;
        this.f106027c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo136872e();
        byte[] bArr = C41860aa.f105998d;
        collection.getClass();
        if (!(collection instanceof C41877b9)) {
            return super.addAll(collection);
        }
        C41877b9 b9Var = (C41877b9) collection;
        int i = b9Var.f106027c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f106027c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f106026b;
            if (i3 > dArr.length) {
                this.f106026b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(b9Var.f106026b, 0, this.f106026b, this.f106027c, b9Var.f106027c);
            this.f106027c = i3;
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
        if (!(obj instanceof C41877b9)) {
            return super.equals(obj);
        }
        C41877b9 b9Var = (C41877b9) obj;
        if (this.f106027c != b9Var.f106027c) {
            return false;
        }
        double[] dArr = b9Var.f106026b;
        for (int i = 0; i < this.f106027c; i++) {
            if (Double.doubleToLongBits(this.f106026b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo136617k(i);
        return Double.valueOf(this.f106026b[i]);
    }

    /* renamed from: h */
    public final void mo136613h(double d) {
        mo136872e();
        int i = this.f106027c;
        double[] dArr = this.f106026b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f106026b = dArr2;
        }
        double[] dArr3 = this.f106026b;
        int i2 = this.f106027c;
        this.f106027c = i2 + 1;
        dArr3[i2] = d;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f106027c; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f106026b[i2]);
            byte[] bArr = C41860aa.f105998d;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    /* renamed from: i */
    public final String mo136615i(int i) {
        int i2 = this.f106027c;
        return "Index:" + i + ", Size:" + i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f106027c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f106026b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo136617k(int i) {
        if (i < 0 || i >= this.f106027c) {
            throw new IndexOutOfBoundsException(mo136615i(i));
        }
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C42296z9 mo136618n(int i) {
        if (i >= this.f106027c) {
            return new C41877b9(Arrays.copyOf(this.f106026b, i), this.f106027c, true);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136872e();
        mo136617k(i);
        double[] dArr = this.f106026b;
        double d = dArr[i];
        int i2 = this.f106027c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f106027c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo136872e();
        if (i2 >= i) {
            double[] dArr = this.f106026b;
            System.arraycopy(dArr, i2, dArr, i, this.f106027c - i2);
            this.f106027c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo136872e();
        mo136617k(i);
        double[] dArr = this.f106026b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f106027c;
    }

    public C41877b9(double[] dArr, int i, boolean z) {
        super(z);
        this.f106026b = dArr;
        this.f106027c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo136613h(((Double) obj).doubleValue());
        return true;
    }
}
