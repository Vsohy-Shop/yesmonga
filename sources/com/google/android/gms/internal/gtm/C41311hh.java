package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.gtm.hh */
public final class C41311hh extends C41743zg<Boolean> implements RandomAccess, C41626uj, C41195cl {

    /* renamed from: d */
    public static final C41311hh f104662d;

    /* renamed from: b */
    public boolean[] f104663b;

    /* renamed from: c */
    public int f104664c;

    static {
        C41311hh hhVar = new C41311hh(new boolean[0], 0);
        f104662d = hhVar;
        hhVar.zzb();
    }

    public C41311hh() {
        this(new boolean[10], 0);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo136121e();
        if (i < 0 || i > (i2 = this.f104664c)) {
            throw new IndexOutOfBoundsException(mo135446i(i));
        }
        boolean[] zArr = this.f104663b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f104663b, i, zArr2, i + 1, this.f104664c - i);
            this.f104663b = zArr2;
        }
        this.f104663b[i] = booleanValue;
        this.f104664c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo136121e();
        C41650vj.m168603e(collection);
        if (!(collection instanceof C41311hh)) {
            return super.addAll(collection);
        }
        C41311hh hhVar = (C41311hh) collection;
        int i = hhVar.f104664c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f104664c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f104663b;
            if (i3 > zArr.length) {
                this.f104663b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(hhVar.f104663b, 0, this.f104663b, this.f104664c, hhVar.f104664c);
            this.f104664c = i3;
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
        if (!(obj instanceof C41311hh)) {
            return super.equals(obj);
        }
        C41311hh hhVar = (C41311hh) obj;
        if (this.f104664c != hhVar.f104664c) {
            return false;
        }
        boolean[] zArr = hhVar.f104663b;
        for (int i = 0; i < this.f104664c; i++) {
            if (this.f104663b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo135448k(i);
        return Boolean.valueOf(this.f104663b[i]);
    }

    /* renamed from: h */
    public final void mo135445h(boolean z) {
        mo136121e();
        int i = this.f104664c;
        boolean[] zArr = this.f104663b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f104663b = zArr2;
        }
        boolean[] zArr3 = this.f104663b;
        int i2 = this.f104664c;
        this.f104664c = i2 + 1;
        zArr3[i2] = z;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f104664c; i2++) {
            i = (i * 31) + C41650vj.m168599a(this.f104663b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final String mo135446i(int i) {
        int i2 = this.f104664c;
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
        int i = this.f104664c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f104663b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo135448k(int i) {
        if (i < 0 || i >= this.f104664c) {
            throw new IndexOutOfBoundsException(mo135446i(i));
        }
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C41626uj mo135130n(int i) {
        if (i >= this.f104664c) {
            return new C41311hh(Arrays.copyOf(this.f104663b, i), this.f104664c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136121e();
        mo135448k(i);
        boolean[] zArr = this.f104663b;
        boolean z = zArr[i];
        int i2 = this.f104664c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f104664c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo136121e();
        if (i2 >= i) {
            boolean[] zArr = this.f104663b;
            System.arraycopy(zArr, i2, zArr, i, this.f104664c - i2);
            this.f104664c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo136121e();
        mo135448k(i);
        boolean[] zArr = this.f104663b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f104664c;
    }

    public C41311hh(boolean[] zArr, int i) {
        this.f104663b = zArr;
        this.f104664c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo135445h(((Boolean) obj).booleanValue());
        return true;
    }
}
