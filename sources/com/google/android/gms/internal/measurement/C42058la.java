package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.la */
public final class C42058la extends C41966g8 implements RandomAccess, C42279y9, C41915db {

    /* renamed from: d */
    public static final C42058la f106281d = new C42058la(new long[0], 0, false);

    /* renamed from: b */
    public long[] f106282b;

    /* renamed from: c */
    public int f106283c;

    public C42058la() {
        this(new long[10], 0, true);
    }

    /* renamed from: h */
    public static C42058la m170495h() {
        return f106281d;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo136872e();
        if (i < 0 || i > (i2 = this.f106283c)) {
            throw new IndexOutOfBoundsException(mo137115k(i));
        }
        long[] jArr = this.f106282b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f106282b, i, jArr2, i + 1, this.f106283c - i);
            this.f106282b = jArr2;
        }
        this.f106282b[i] = longValue;
        this.f106283c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo136872e();
        byte[] bArr = C41860aa.f105998d;
        collection.getClass();
        if (!(collection instanceof C42058la)) {
            return super.addAll(collection);
        }
        C42058la laVar = (C42058la) collection;
        int i = laVar.f106283c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f106283c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f106282b;
            if (i3 > jArr.length) {
                this.f106282b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(laVar.f106282b, 0, this.f106282b, this.f106283c, laVar.f106283c);
            this.f106283c = i3;
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
        if (!(obj instanceof C42058la)) {
            return super.equals(obj);
        }
        C42058la laVar = (C42058la) obj;
        if (this.f106283c != laVar.f106283c) {
            return false;
        }
        long[] jArr = laVar.f106282b;
        for (int i = 0; i < this.f106283c; i++) {
            if (this.f106282b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo137117q(i);
        return Long.valueOf(this.f106282b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f106283c; i2++) {
            long j = this.f106282b[i2];
            byte[] bArr = C41860aa.f105998d;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    /* renamed from: i */
    public final void mo137113i(long j) {
        mo136872e();
        int i = this.f106283c;
        long[] jArr = this.f106282b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f106282b = jArr2;
        }
        long[] jArr3 = this.f106282b;
        int i2 = this.f106283c;
        this.f106283c = i2 + 1;
        jArr3[i2] = j;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f106283c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f106282b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo137115k(int i) {
        int i2 = this.f106283c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: l */
    public final long mo137116l(int i) {
        mo137117q(i);
        return this.f106282b[i];
    }

    /* renamed from: q */
    public final void mo137117q(int i) {
        if (i < 0 || i >= this.f106283c) {
            throw new IndexOutOfBoundsException(mo137115k(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136872e();
        mo137117q(i);
        long[] jArr = this.f106282b;
        long j = jArr[i];
        int i2 = this.f106283c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f106283c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo136872e();
        if (i2 >= i) {
            long[] jArr = this.f106282b;
            System.arraycopy(jArr, i2, jArr, i, this.f106283c - i2);
            this.f106283c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo136872e();
        mo137117q(i);
        long[] jArr = this.f106282b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f106283c;
    }

    /* renamed from: x0 */
    public final C42279y9 mo136618n(int i) {
        if (i >= this.f106283c) {
            return new C42058la(Arrays.copyOf(this.f106282b, i), this.f106283c, true);
        }
        throw new IllegalArgumentException();
    }

    public C42058la(long[] jArr, int i, boolean z) {
        super(z);
        this.f106282b = jArr;
        this.f106283c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo137113i(((Long) obj).longValue());
        return true;
    }
}
