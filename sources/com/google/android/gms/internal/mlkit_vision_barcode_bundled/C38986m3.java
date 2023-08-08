package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.m3 */
public final class C38986m3 extends C38864a1<Long> implements RandomAccess, C39075w2, C38907e4 {

    /* renamed from: d */
    public static final C38986m3 f98898d;

    /* renamed from: b */
    public long[] f98899b;

    /* renamed from: c */
    public int f98900c;

    static {
        C38986m3 m3Var = new C38986m3(new long[0], 0);
        f98898d = m3Var;
        m3Var.zzb();
    }

    public C38986m3() {
        this(new long[10], 0);
    }

    /* renamed from: U */
    public final void mo122958U(int i) {
        if (i < 0 || i >= this.f98900c) {
            throw new IndexOutOfBoundsException(mo122964k(i));
        }
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo122768e();
        if (i < 0 || i > (i2 = this.f98900c)) {
            throw new IndexOutOfBoundsException(mo122964k(i));
        }
        long[] jArr = this.f98899b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f98899b, i, jArr2, i + 1, this.f98900c - i);
            this.f98899b = jArr2;
        }
        this.f98899b[i] = longValue;
        this.f98900c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo122768e();
        C39084x2.m160969e(collection);
        if (!(collection instanceof C38986m3)) {
            return super.addAll(collection);
        }
        C38986m3 m3Var = (C38986m3) collection;
        int i = m3Var.f98900c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f98900c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f98899b;
            if (i3 > jArr.length) {
                this.f98899b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(m3Var.f98899b, 0, this.f98899b, this.f98900c, m3Var.f98900c);
            this.f98900c = i3;
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
        if (!(obj instanceof C38986m3)) {
            return super.equals(obj);
        }
        C38986m3 m3Var = (C38986m3) obj;
        if (this.f98900c != m3Var.f98900c) {
            return false;
        }
        long[] jArr = m3Var.f98899b;
        for (int i = 0; i < this.f98900c; i++) {
            if (this.f98899b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo122958U(i);
        return Long.valueOf(this.f98899b[i]);
    }

    /* renamed from: h */
    public final long mo122961h(int i) {
        mo122958U(i);
        return this.f98899b[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f98900c; i2++) {
            i = (i * 31) + C39084x2.m160967c(this.f98899b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo122962i(long j) {
        mo122768e();
        int i = this.f98900c;
        long[] jArr = this.f98899b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f98899b = jArr2;
        }
        long[] jArr3 = this.f98899b;
        int i2 = this.f98900c;
        this.f98900c = i2 + 1;
        jArr3[i2] = j;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f98900c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f98899b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo122964k(int i) {
        int i2 = this.f98900c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C39075w2 mo122844n(int i) {
        if (i >= this.f98900c) {
            return new C38986m3(Arrays.copyOf(this.f98899b, i), this.f98900c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo122768e();
        mo122958U(i);
        long[] jArr = this.f98899b;
        long j = jArr[i];
        int i2 = this.f98900c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f98900c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo122768e();
        if (i2 >= i) {
            long[] jArr = this.f98899b;
            System.arraycopy(jArr, i2, jArr, i, this.f98900c - i2);
            this.f98900c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo122768e();
        mo122958U(i);
        long[] jArr = this.f98899b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f98900c;
    }

    public C38986m3(long[] jArr, int i) {
        this.f98899b = jArr;
        this.f98900c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo122962i(((Long) obj).longValue());
        return true;
    }
}
