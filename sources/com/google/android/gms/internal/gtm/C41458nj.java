package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.gtm.nj */
public final class C41458nj extends C41743zg<Integer> implements RandomAccess, C41554rj, C41195cl {

    /* renamed from: d */
    public static final C41458nj f104819d;

    /* renamed from: b */
    public int[] f104820b;

    /* renamed from: c */
    public int f104821c;

    static {
        C41458nj njVar = new C41458nj(new int[0], 0);
        f104819d = njVar;
        njVar.zzb();
    }

    public C41458nj() {
        this(new int[10], 0);
    }

    /* renamed from: i */
    public static C41458nj m168083i() {
        return f104819d;
    }

    /* renamed from: U */
    public final void mo135665U(int i) {
        mo136121e();
        int i2 = this.f104821c;
        int[] iArr = this.f104820b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f104820b = iArr2;
        }
        int[] iArr3 = this.f104820b;
        int i3 = this.f104821c;
        this.f104821c = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo136121e();
        if (i < 0 || i > (i2 = this.f104821c)) {
            throw new IndexOutOfBoundsException(mo135670k(i));
        }
        int[] iArr = this.f104820b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f104820b, i, iArr2, i + 1, this.f104821c - i);
            this.f104820b = iArr2;
        }
        this.f104820b[i] = intValue;
        this.f104821c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo136121e();
        C41650vj.m168603e(collection);
        if (!(collection instanceof C41458nj)) {
            return super.addAll(collection);
        }
        C41458nj njVar = (C41458nj) collection;
        int i = njVar.f104821c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f104821c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f104820b;
            if (i3 > iArr.length) {
                this.f104820b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(njVar.f104820b, 0, this.f104820b, this.f104821c, njVar.f104821c);
            this.f104821c = i3;
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
        if (!(obj instanceof C41458nj)) {
            return super.equals(obj);
        }
        C41458nj njVar = (C41458nj) obj;
        if (this.f104821c != njVar.f104821c) {
            return false;
        }
        int[] iArr = njVar.f104820b;
        for (int i = 0; i < this.f104821c; i++) {
            if (this.f104820b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo135671q(i);
        return Integer.valueOf(this.f104820b[i]);
    }

    /* renamed from: h */
    public final int mo135668h(int i) {
        mo135671q(i);
        return this.f104820b[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f104821c; i2++) {
            i = (i * 31) + this.f104820b[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f104821c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f104820b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo135670k(int i) {
        int i2 = this.f104821c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: q */
    public final void mo135671q(int i) {
        if (i < 0 || i >= this.f104821c) {
            throw new IndexOutOfBoundsException(mo135670k(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136121e();
        mo135671q(i);
        int[] iArr = this.f104820b;
        int i2 = iArr[i];
        int i3 = this.f104821c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f104821c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo136121e();
        if (i2 >= i) {
            int[] iArr = this.f104820b;
            System.arraycopy(iArr, i2, iArr, i, this.f104821c - i2);
            this.f104821c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo136121e();
        mo135671q(i);
        int[] iArr = this.f104820b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f104821c;
    }

    /* renamed from: v */
    public final C41554rj mo135130n(int i) {
        if (i >= this.f104821c) {
            return new C41458nj(Arrays.copyOf(this.f104820b, i), this.f104821c);
        }
        throw new IllegalArgumentException();
    }

    public C41458nj(int[] iArr, int i) {
        this.f104820b = iArr;
        this.f104821c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo135665U(((Integer) obj).intValue());
        return true;
    }
}
