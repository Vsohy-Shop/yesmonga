package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class l00 extends C29722sx<Long> implements RandomAccess, C29835vz, f10 {

    /* renamed from: d */
    public static final l00 f71329d;

    /* renamed from: b */
    public long[] f71330b;

    /* renamed from: c */
    public int f71331c;

    static {
        l00 l00 = new l00(new long[0], 0);
        f71329d = l00;
        l00.mo84834I();
    }

    public l00() {
        this(new long[10], 0);
    }

    /* renamed from: i */
    public static l00 m120644i() {
        return f71329d;
    }

    /* renamed from: P1 */
    public final /* bridge */ /* synthetic */ C29872wz mo84516P1(int i) {
        if (i >= this.f71331c) {
            return new l00(Arrays.copyOf(this.f71330b, i), this.f71331c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo84835e();
        if (i < 0 || i > (i2 = this.f71331c)) {
            throw new IndexOutOfBoundsException(mo84708q(i));
        }
        long[] jArr = this.f71330b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f71330b, i, jArr2, i + 1, this.f71331c - i);
            this.f71330b = jArr2;
        }
        this.f71330b[i] = longValue;
        this.f71331c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo84835e();
        C29909xz.m121347e(collection);
        if (!(collection instanceof l00)) {
            return super.addAll(collection);
        }
        l00 l00 = (l00) collection;
        int i = l00.f71331c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f71331c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f71330b;
            if (i3 > jArr.length) {
                this.f71330b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(l00.f71330b, 0, this.f71330b, this.f71331c, l00.f71331c);
            this.f71331c = i3;
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
        if (!(obj instanceof l00)) {
            return super.equals(obj);
        }
        l00 l00 = (l00) obj;
        if (this.f71331c != l00.f71331c) {
            return false;
        }
        long[] jArr = l00.f71330b;
        for (int i = 0; i < this.f71331c; i++) {
            if (this.f71330b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo84709r(i);
        return Long.valueOf(this.f71330b[i]);
    }

    /* renamed from: h */
    public final long mo84705h(int i) {
        mo84709r(i);
        return this.f71330b[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f71331c; i2++) {
            i = (i * 31) + C29909xz.m121345c(this.f71330b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f71331c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f71330b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo84707k(long j) {
        mo84835e();
        int i = this.f71331c;
        long[] jArr = this.f71330b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f71330b = jArr2;
        }
        long[] jArr3 = this.f71330b;
        int i2 = this.f71331c;
        this.f71331c = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: q */
    public final String mo84708q(int i) {
        int i2 = this.f71331c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: r */
    public final void mo84709r(int i) {
        if (i < 0 || i >= this.f71331c) {
            throw new IndexOutOfBoundsException(mo84708q(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo84835e();
        mo84709r(i);
        long[] jArr = this.f71330b;
        long j = jArr[i];
        int i2 = this.f71331c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f71331c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo84835e();
        if (i2 >= i) {
            long[] jArr = this.f71330b;
            System.arraycopy(jArr, i2, jArr, i, this.f71331c - i2);
            this.f71331c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo84835e();
        mo84709r(i);
        long[] jArr = this.f71330b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f71331c;
    }

    public l00(long[] jArr, int i) {
        this.f71330b = jArr;
        this.f71331c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo84707k(((Long) obj).longValue());
        return true;
    }
}
