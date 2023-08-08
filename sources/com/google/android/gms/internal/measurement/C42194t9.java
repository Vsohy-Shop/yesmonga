package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.t9 */
public final class C42194t9 extends C41966g8 implements RandomAccess, C42262x9, C41915db {

    /* renamed from: d */
    public static final C42194t9 f106427d = new C42194t9(new int[0], 0, false);

    /* renamed from: b */
    public int[] f106428b;

    /* renamed from: c */
    public int f106429c;

    public C42194t9() {
        this(new int[10], 0, true);
    }

    /* renamed from: i */
    public static C42194t9 m170871i() {
        return f106427d;
    }

    /* renamed from: U */
    public final void mo137313U(int i) {
        mo136872e();
        int i2 = this.f106429c;
        int[] iArr = this.f106428b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f106428b = iArr2;
        }
        int[] iArr3 = this.f106428b;
        int i3 = this.f106429c;
        this.f106429c = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo136872e();
        if (i < 0 || i > (i2 = this.f106429c)) {
            throw new IndexOutOfBoundsException(mo137318k(i));
        }
        int[] iArr = this.f106428b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f106428b, i, iArr2, i + 1, this.f106429c - i);
            this.f106428b = iArr2;
        }
        this.f106428b[i] = intValue;
        this.f106429c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo136872e();
        byte[] bArr = C41860aa.f105998d;
        collection.getClass();
        if (!(collection instanceof C42194t9)) {
            return super.addAll(collection);
        }
        C42194t9 t9Var = (C42194t9) collection;
        int i = t9Var.f106429c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f106429c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f106428b;
            if (i3 > iArr.length) {
                this.f106428b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(t9Var.f106428b, 0, this.f106428b, this.f106429c, t9Var.f106429c);
            this.f106429c = i3;
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
        if (!(obj instanceof C42194t9)) {
            return super.equals(obj);
        }
        C42194t9 t9Var = (C42194t9) obj;
        if (this.f106429c != t9Var.f106429c) {
            return false;
        }
        int[] iArr = t9Var.f106428b;
        for (int i = 0; i < this.f106429c; i++) {
            if (this.f106428b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo137319q(i);
        return Integer.valueOf(this.f106428b[i]);
    }

    /* renamed from: h */
    public final int mo137316h(int i) {
        mo137319q(i);
        return this.f106428b[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f106429c; i2++) {
            i = (i * 31) + this.f106428b[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f106429c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f106428b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo137318k(int i) {
        int i2 = this.f106429c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: q */
    public final void mo137319q(int i) {
        if (i < 0 || i >= this.f106429c) {
            throw new IndexOutOfBoundsException(mo137318k(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136872e();
        mo137319q(i);
        int[] iArr = this.f106428b;
        int i2 = iArr[i];
        int i3 = this.f106429c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f106429c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo136872e();
        if (i2 >= i) {
            int[] iArr = this.f106428b;
            System.arraycopy(iArr, i2, iArr, i, this.f106429c - i2);
            this.f106429c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo136872e();
        mo137319q(i);
        int[] iArr = this.f106428b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f106429c;
    }

    /* renamed from: v */
    public final C42262x9 mo136618n(int i) {
        if (i >= this.f106429c) {
            return new C42194t9(Arrays.copyOf(this.f106428b, i), this.f106429c, true);
        }
        throw new IllegalArgumentException();
    }

    public C42194t9(int[] iArr, int i, boolean z) {
        super(z);
        this.f106428b = iArr;
        this.f106429c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo137313U(((Integer) obj).intValue());
        return true;
    }
}
