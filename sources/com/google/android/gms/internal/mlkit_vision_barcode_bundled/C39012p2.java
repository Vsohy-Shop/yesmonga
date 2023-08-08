package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p2 */
public final class C39012p2 extends C38864a1<Integer> implements RandomAccess, C39057u2, C38907e4 {

    /* renamed from: d */
    public static final C39012p2 f98913d;

    /* renamed from: b */
    public int[] f98914b;

    /* renamed from: c */
    public int f98915c;

    static {
        C39012p2 p2Var = new C39012p2(new int[0], 0);
        f98913d = p2Var;
        p2Var.zzb();
    }

    public C39012p2() {
        this(new int[10], 0);
    }

    /* renamed from: i */
    public static C39012p2 m160669i() {
        return f98913d;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo122768e();
        if (i < 0 || i > (i2 = this.f98915c)) {
            throw new IndexOutOfBoundsException(mo123003q(i));
        }
        int[] iArr = this.f98914b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f98914b, i, iArr2, i + 1, this.f98915c - i);
            this.f98914b = iArr2;
        }
        this.f98914b[i] = intValue;
        this.f98915c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo122768e();
        C39084x2.m160969e(collection);
        if (!(collection instanceof C39012p2)) {
            return super.addAll(collection);
        }
        C39012p2 p2Var = (C39012p2) collection;
        int i = p2Var.f98915c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f98915c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f98914b;
            if (i3 > iArr.length) {
                this.f98914b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(p2Var.f98914b, 0, this.f98914b, this.f98915c, p2Var.f98915c);
            this.f98915c = i3;
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
        if (!(obj instanceof C39012p2)) {
            return super.equals(obj);
        }
        C39012p2 p2Var = (C39012p2) obj;
        if (this.f98915c != p2Var.f98915c) {
            return false;
        }
        int[] iArr = p2Var.f98914b;
        for (int i = 0; i < this.f98915c; i++) {
            if (this.f98914b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo123004r(i);
        return Integer.valueOf(this.f98914b[i]);
    }

    /* renamed from: h */
    public final int mo123000h(int i) {
        mo123004r(i);
        return this.f98914b[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f98915c; i2++) {
            i = (i * 31) + this.f98914b[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f98915c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f98914b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo123002k(int i) {
        mo122768e();
        int i2 = this.f98915c;
        int[] iArr = this.f98914b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f98914b = iArr2;
        }
        int[] iArr3 = this.f98914b;
        int i3 = this.f98915c;
        this.f98915c = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C39075w2 mo122844n(int i) {
        if (i >= this.f98915c) {
            return new C39012p2(Arrays.copyOf(this.f98914b, i), this.f98915c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q */
    public final String mo123003q(int i) {
        int i2 = this.f98915c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: r */
    public final void mo123004r(int i) {
        if (i < 0 || i >= this.f98915c) {
            throw new IndexOutOfBoundsException(mo123003q(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo122768e();
        mo123004r(i);
        int[] iArr = this.f98914b;
        int i2 = iArr[i];
        int i3 = this.f98915c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f98915c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo122768e();
        if (i2 >= i) {
            int[] iArr = this.f98914b;
            System.arraycopy(iArr, i2, iArr, i, this.f98915c - i2);
            this.f98915c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo122768e();
        mo123004r(i);
        int[] iArr = this.f98914b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f98915c;
    }

    public C39012p2(int[] iArr, int i) {
        this.f98914b = iArr;
        this.f98915c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo123002k(((Integer) obj).intValue());
        return true;
    }
}
