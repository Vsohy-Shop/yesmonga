package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.fb */
public final class C41951fb extends C41966g8 implements RandomAccess {

    /* renamed from: d */
    public static final C41951fb f106129d = new C41951fb(new Object[0], 0, false);

    /* renamed from: b */
    public Object[] f106130b;

    /* renamed from: c */
    public int f106131c;

    public C41951fb() {
        this(new Object[10], 0, true);
    }

    /* renamed from: h */
    public static C41951fb m169885h() {
        return f106129d;
    }

    public final void add(int i, Object obj) {
        int i2;
        mo136872e();
        if (i < 0 || i > (i2 = this.f106131c)) {
            throw new IndexOutOfBoundsException(mo136768i(i));
        }
        Object[] objArr = this.f106130b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f106130b, i, objArr2, i + 1, this.f106131c - i);
            this.f106130b = objArr2;
        }
        this.f106130b[i] = obj;
        this.f106131c++;
        this.modCount++;
    }

    public final Object get(int i) {
        mo136769k(i);
        return this.f106130b[i];
    }

    /* renamed from: i */
    public final String mo136768i(int i) {
        int i2 = this.f106131c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: k */
    public final void mo136769k(int i) {
        if (i < 0 || i >= this.f106131c) {
            throw new IndexOutOfBoundsException(mo136768i(i));
        }
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C42296z9 mo136618n(int i) {
        if (i >= this.f106131c) {
            return new C41951fb(Arrays.copyOf(this.f106130b, i), this.f106131c, true);
        }
        throw new IllegalArgumentException();
    }

    public final Object remove(int i) {
        mo136872e();
        mo136769k(i);
        Object[] objArr = this.f106130b;
        Object obj = objArr[i];
        int i2 = this.f106131c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f106131c--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo136872e();
        mo136769k(i);
        Object[] objArr = this.f106130b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f106131c;
    }

    public C41951fb(Object[] objArr, int i, boolean z) {
        super(z);
        this.f106130b = objArr;
        this.f106131c = i;
    }

    public final boolean add(Object obj) {
        mo136872e();
        int i = this.f106131c;
        Object[] objArr = this.f106130b;
        if (i == objArr.length) {
            this.f106130b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f106130b;
        int i2 = this.f106131c;
        this.f106131c = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
