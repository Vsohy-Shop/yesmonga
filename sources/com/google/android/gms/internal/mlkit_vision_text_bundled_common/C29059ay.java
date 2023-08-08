package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ay */
public final class C29059ay extends C29722sx<Boolean> implements RandomAccess, C29872wz, f10 {

    /* renamed from: d */
    public static final C29059ay f71152d;

    /* renamed from: b */
    public boolean[] f71153b;

    /* renamed from: c */
    public int f71154c;

    static {
        C29059ay ayVar = new C29059ay(new boolean[0], 0);
        f71152d = ayVar;
        ayVar.mo84834I();
    }

    public C29059ay() {
        this(new boolean[10], 0);
    }

    /* renamed from: P1 */
    public final /* bridge */ /* synthetic */ C29872wz mo84516P1(int i) {
        if (i >= this.f71154c) {
            return new C29059ay(Arrays.copyOf(this.f71153b, i), this.f71154c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo84835e();
        if (i < 0 || i > (i2 = this.f71154c)) {
            throw new IndexOutOfBoundsException(mo84525i(i));
        }
        boolean[] zArr = this.f71153b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f71153b, i, zArr2, i + 1, this.f71154c - i);
            this.f71153b = zArr2;
        }
        this.f71153b[i] = booleanValue;
        this.f71154c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo84835e();
        C29909xz.m121347e(collection);
        if (!(collection instanceof C29059ay)) {
            return super.addAll(collection);
        }
        C29059ay ayVar = (C29059ay) collection;
        int i = ayVar.f71154c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f71154c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f71153b;
            if (i3 > zArr.length) {
                this.f71153b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(ayVar.f71153b, 0, this.f71153b, this.f71154c, ayVar.f71154c);
            this.f71154c = i3;
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
        if (!(obj instanceof C29059ay)) {
            return super.equals(obj);
        }
        C29059ay ayVar = (C29059ay) obj;
        if (this.f71154c != ayVar.f71154c) {
            return false;
        }
        boolean[] zArr = ayVar.f71153b;
        for (int i = 0; i < this.f71154c; i++) {
            if (this.f71153b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo84527k(i);
        return Boolean.valueOf(this.f71153b[i]);
    }

    /* renamed from: h */
    public final void mo84523h(boolean z) {
        mo84835e();
        int i = this.f71154c;
        boolean[] zArr = this.f71153b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f71153b = zArr2;
        }
        boolean[] zArr3 = this.f71153b;
        int i2 = this.f71154c;
        this.f71154c = i2 + 1;
        zArr3[i2] = z;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f71154c; i2++) {
            i = (i * 31) + C29909xz.m121343a(this.f71153b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final String mo84525i(int i) {
        int i2 = this.f71154c;
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
        int i = this.f71154c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f71153b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo84527k(int i) {
        if (i < 0 || i >= this.f71154c) {
            throw new IndexOutOfBoundsException(mo84525i(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo84835e();
        mo84527k(i);
        boolean[] zArr = this.f71153b;
        boolean z = zArr[i];
        int i2 = this.f71154c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f71154c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo84835e();
        if (i2 >= i) {
            boolean[] zArr = this.f71153b;
            System.arraycopy(zArr, i2, zArr, i, this.f71154c - i2);
            this.f71154c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo84835e();
        mo84527k(i);
        boolean[] zArr = this.f71153b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f71154c;
    }

    public C29059ay(boolean[] zArr, int i) {
        this.f71153b = zArr;
        this.f71154c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo84523h(((Boolean) obj).booleanValue());
        return true;
    }
}
