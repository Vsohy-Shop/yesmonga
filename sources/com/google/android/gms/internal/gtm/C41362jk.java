package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.gtm.jk */
public final class C41362jk extends C41743zg<Long> implements RandomAccess, C41626uj, C41195cl {

    /* renamed from: d */
    public static final C41362jk f104719d;

    /* renamed from: b */
    public long[] f104720b;

    /* renamed from: c */
    public int f104721c;

    static {
        C41362jk jkVar = new C41362jk(new long[0], 0);
        f104719d = jkVar;
        jkVar.zzb();
    }

    public C41362jk() {
        this(new long[10], 0);
    }

    /* renamed from: U */
    public final void mo135519U(int i) {
        if (i < 0 || i >= this.f104721c) {
            throw new IndexOutOfBoundsException(mo135525k(i));
        }
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo136121e();
        if (i < 0 || i > (i2 = this.f104721c)) {
            throw new IndexOutOfBoundsException(mo135525k(i));
        }
        long[] jArr = this.f104720b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f104720b, i, jArr2, i + 1, this.f104721c - i);
            this.f104720b = jArr2;
        }
        this.f104720b[i] = longValue;
        this.f104721c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo136121e();
        C41650vj.m168603e(collection);
        if (!(collection instanceof C41362jk)) {
            return super.addAll(collection);
        }
        C41362jk jkVar = (C41362jk) collection;
        int i = jkVar.f104721c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f104721c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f104720b;
            if (i3 > jArr.length) {
                this.f104720b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(jkVar.f104720b, 0, this.f104720b, this.f104721c, jkVar.f104721c);
            this.f104721c = i3;
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
        if (!(obj instanceof C41362jk)) {
            return super.equals(obj);
        }
        C41362jk jkVar = (C41362jk) obj;
        if (this.f104721c != jkVar.f104721c) {
            return false;
        }
        long[] jArr = jkVar.f104720b;
        for (int i = 0; i < this.f104721c; i++) {
            if (this.f104720b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo135519U(i);
        return Long.valueOf(this.f104720b[i]);
    }

    /* renamed from: h */
    public final long mo135522h(int i) {
        mo135519U(i);
        return this.f104720b[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f104721c; i2++) {
            i = (i * 31) + C41650vj.m168601c(this.f104720b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo135523i(long j) {
        mo136121e();
        int i = this.f104721c;
        long[] jArr = this.f104720b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f104720b = jArr2;
        }
        long[] jArr3 = this.f104720b;
        int i2 = this.f104721c;
        this.f104721c = i2 + 1;
        jArr3[i2] = j;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f104721c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f104720b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo135525k(int i) {
        int i2 = this.f104721c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C41626uj mo135130n(int i) {
        if (i >= this.f104721c) {
            return new C41362jk(Arrays.copyOf(this.f104720b, i), this.f104721c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136121e();
        mo135519U(i);
        long[] jArr = this.f104720b;
        long j = jArr[i];
        int i2 = this.f104721c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f104721c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo136121e();
        if (i2 >= i) {
            long[] jArr = this.f104720b;
            System.arraycopy(jArr, i2, jArr, i, this.f104721c - i2);
            this.f104721c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo136121e();
        mo135519U(i);
        long[] jArr = this.f104720b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f104721c;
    }

    public C41362jk(long[] jArr, int i) {
        this.f104720b = jArr;
        this.f104721c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo135523i(((Long) obj).longValue());
        return true;
    }
}
