package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.nz */
public final class C29539nz extends C29722sx<Integer> implements RandomAccess, C29724sz, f10 {

    /* renamed from: d */
    public static final C29539nz f71374d;

    /* renamed from: b */
    public int[] f71375b;

    /* renamed from: c */
    public int f71376c;

    static {
        C29539nz nzVar = new C29539nz(new int[0], 0);
        f71374d = nzVar;
        nzVar.mo84834I();
    }

    public C29539nz() {
        this(new int[10], 0);
    }

    /* renamed from: i */
    public static C29539nz m120811i() {
        return f71374d;
    }

    /* renamed from: P1 */
    public final /* bridge */ /* synthetic */ C29872wz mo84516P1(int i) {
        if (i >= this.f71376c) {
            return new C29539nz(Arrays.copyOf(this.f71375b, i), this.f71376c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo84835e();
        if (i < 0 || i > (i2 = this.f71376c)) {
            throw new IndexOutOfBoundsException(mo84750q(i));
        }
        int[] iArr = this.f71375b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f71375b, i, iArr2, i + 1, this.f71376c - i);
            this.f71375b = iArr2;
        }
        this.f71375b[i] = intValue;
        this.f71376c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo84835e();
        C29909xz.m121347e(collection);
        if (!(collection instanceof C29539nz)) {
            return super.addAll(collection);
        }
        C29539nz nzVar = (C29539nz) collection;
        int i = nzVar.f71376c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f71376c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f71375b;
            if (i3 > iArr.length) {
                this.f71375b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(nzVar.f71375b, 0, this.f71375b, this.f71376c, nzVar.f71376c);
            this.f71376c = i3;
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
        if (!(obj instanceof C29539nz)) {
            return super.equals(obj);
        }
        C29539nz nzVar = (C29539nz) obj;
        if (this.f71376c != nzVar.f71376c) {
            return false;
        }
        int[] iArr = nzVar.f71375b;
        for (int i = 0; i < this.f71376c; i++) {
            if (this.f71375b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo84751r(i);
        return Integer.valueOf(this.f71375b[i]);
    }

    /* renamed from: h */
    public final int mo84747h(int i) {
        mo84751r(i);
        return this.f71375b[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f71376c; i2++) {
            i = (i * 31) + this.f71375b[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f71376c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f71375b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo84749k(int i) {
        mo84835e();
        int i2 = this.f71376c;
        int[] iArr = this.f71375b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f71375b = iArr2;
        }
        int[] iArr3 = this.f71375b;
        int i3 = this.f71376c;
        this.f71376c = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: q */
    public final String mo84750q(int i) {
        int i2 = this.f71376c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: r */
    public final void mo84751r(int i) {
        if (i < 0 || i >= this.f71376c) {
            throw new IndexOutOfBoundsException(mo84750q(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo84835e();
        mo84751r(i);
        int[] iArr = this.f71375b;
        int i2 = iArr[i];
        int i3 = this.f71376c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f71376c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo84835e();
        if (i2 >= i) {
            int[] iArr = this.f71375b;
            System.arraycopy(iArr, i2, iArr, i, this.f71376c - i2);
            this.f71376c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo84835e();
        mo84751r(i);
        int[] iArr = this.f71375b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f71376c;
    }

    public C29539nz(int[] iArr, int i) {
        this.f71375b = iArr;
        this.f71376c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo84749k(((Integer) obj).intValue());
        return true;
    }
}
