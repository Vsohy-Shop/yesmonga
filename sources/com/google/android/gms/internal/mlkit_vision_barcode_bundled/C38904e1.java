package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1 */
public final class C38904e1 extends C38864a1<Boolean> implements RandomAccess, C39075w2, C38907e4 {

    /* renamed from: d */
    public static final C38904e1 f98831d;

    /* renamed from: b */
    public boolean[] f98832b;

    /* renamed from: c */
    public int f98833c;

    static {
        C38904e1 e1Var = new C38904e1(new boolean[0], 0);
        f98831d = e1Var;
        e1Var.zzb();
    }

    public C38904e1() {
        this(new boolean[10], 0);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo122768e();
        if (i < 0 || i > (i2 = this.f98833c)) {
            throw new IndexOutOfBoundsException(mo122854i(i));
        }
        boolean[] zArr = this.f98832b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f98832b, i, zArr2, i + 1, this.f98833c - i);
            this.f98832b = zArr2;
        }
        this.f98832b[i] = booleanValue;
        this.f98833c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo122768e();
        C39084x2.m160969e(collection);
        if (!(collection instanceof C38904e1)) {
            return super.addAll(collection);
        }
        C38904e1 e1Var = (C38904e1) collection;
        int i = e1Var.f98833c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f98833c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f98832b;
            if (i3 > zArr.length) {
                this.f98832b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(e1Var.f98832b, 0, this.f98832b, this.f98833c, e1Var.f98833c);
            this.f98833c = i3;
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
        if (!(obj instanceof C38904e1)) {
            return super.equals(obj);
        }
        C38904e1 e1Var = (C38904e1) obj;
        if (this.f98833c != e1Var.f98833c) {
            return false;
        }
        boolean[] zArr = e1Var.f98832b;
        for (int i = 0; i < this.f98833c; i++) {
            if (this.f98832b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo122856k(i);
        return Boolean.valueOf(this.f98832b[i]);
    }

    /* renamed from: h */
    public final void mo122853h(boolean z) {
        mo122768e();
        int i = this.f98833c;
        boolean[] zArr = this.f98832b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f98832b = zArr2;
        }
        boolean[] zArr3 = this.f98832b;
        int i2 = this.f98833c;
        this.f98833c = i2 + 1;
        zArr3[i2] = z;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f98833c; i2++) {
            i = (i * 31) + C39084x2.m160965a(this.f98832b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final String mo122854i(int i) {
        int i2 = this.f98833c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f98833c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f98832b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo122856k(int i) {
        if (i < 0 || i >= this.f98833c) {
            throw new IndexOutOfBoundsException(mo122854i(i));
        }
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C39075w2 mo122844n(int i) {
        if (i >= this.f98833c) {
            return new C38904e1(Arrays.copyOf(this.f98832b, i), this.f98833c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo122768e();
        mo122856k(i);
        boolean[] zArr = this.f98832b;
        boolean z = zArr[i];
        int i2 = this.f98833c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f98833c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo122768e();
        if (i2 >= i) {
            boolean[] zArr = this.f98832b;
            System.arraycopy(zArr, i2, zArr, i, this.f98833c - i2);
            this.f98833c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo122768e();
        mo122856k(i);
        boolean[] zArr = this.f98832b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f98833c;
    }

    public C38904e1(boolean[] zArr, int i) {
        this.f98832b = zArr;
        this.f98833c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo122853h(((Boolean) obj).booleanValue());
        return true;
    }
}
