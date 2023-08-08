package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.k8 */
public final class C42038k8 extends C41966g8 implements RandomAccess, C42296z9, C41915db {

    /* renamed from: d */
    public static final C42038k8 f106261d = new C42038k8(new boolean[0], 0, false);

    /* renamed from: b */
    public boolean[] f106262b;

    /* renamed from: c */
    public int f106263c;

    public C42038k8() {
        this(new boolean[10], 0, true);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo136872e();
        if (i < 0 || i > (i2 = this.f106263c)) {
            throw new IndexOutOfBoundsException(mo137074i(i));
        }
        boolean[] zArr = this.f106262b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f106262b, i, zArr2, i + 1, this.f106263c - i);
            this.f106262b = zArr2;
        }
        this.f106262b[i] = booleanValue;
        this.f106263c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo136872e();
        byte[] bArr = C41860aa.f105998d;
        collection.getClass();
        if (!(collection instanceof C42038k8)) {
            return super.addAll(collection);
        }
        C42038k8 k8Var = (C42038k8) collection;
        int i = k8Var.f106263c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f106263c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f106262b;
            if (i3 > zArr.length) {
                this.f106262b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(k8Var.f106262b, 0, this.f106262b, this.f106263c, k8Var.f106263c);
            this.f106263c = i3;
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
        if (!(obj instanceof C42038k8)) {
            return super.equals(obj);
        }
        C42038k8 k8Var = (C42038k8) obj;
        if (this.f106263c != k8Var.f106263c) {
            return false;
        }
        boolean[] zArr = k8Var.f106262b;
        for (int i = 0; i < this.f106263c; i++) {
            if (this.f106262b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo137076k(i);
        return Boolean.valueOf(this.f106262b[i]);
    }

    /* renamed from: h */
    public final void mo137073h(boolean z) {
        mo136872e();
        int i = this.f106263c;
        boolean[] zArr = this.f106262b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f106262b = zArr2;
        }
        boolean[] zArr3 = this.f106262b;
        int i2 = this.f106263c;
        this.f106263c = i2 + 1;
        zArr3[i2] = z;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f106263c; i2++) {
            i = (i * 31) + C41860aa.m169666a(this.f106262b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final String mo137074i(int i) {
        int i2 = this.f106263c;
        return "Index:" + i + ", Size:" + i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f106263c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f106262b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo137076k(int i) {
        if (i < 0 || i >= this.f106263c) {
            throw new IndexOutOfBoundsException(mo137074i(i));
        }
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C42296z9 mo136618n(int i) {
        if (i >= this.f106263c) {
            return new C42038k8(Arrays.copyOf(this.f106262b, i), this.f106263c, true);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136872e();
        mo137076k(i);
        boolean[] zArr = this.f106262b;
        boolean z = zArr[i];
        int i2 = this.f106263c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f106263c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo136872e();
        if (i2 >= i) {
            boolean[] zArr = this.f106262b;
            System.arraycopy(zArr, i2, zArr, i, this.f106263c - i2);
            this.f106263c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo136872e();
        mo137076k(i);
        boolean[] zArr = this.f106262b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f106263c;
    }

    public C42038k8(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f106262b = zArr;
        this.f106263c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo137073h(((Boolean) obj).booleanValue());
        return true;
    }
}
