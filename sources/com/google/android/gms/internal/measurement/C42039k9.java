package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.k9 */
public final class C42039k9 extends C41966g8 implements RandomAccess, C42296z9, C41915db {

    /* renamed from: d */
    public static final C42039k9 f106264d = new C42039k9(new float[0], 0, false);

    /* renamed from: b */
    public float[] f106265b;

    /* renamed from: c */
    public int f106266c;

    public C42039k9() {
        this(new float[10], 0, true);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo136872e();
        if (i < 0 || i > (i2 = this.f106266c)) {
            throw new IndexOutOfBoundsException(mo137082i(i));
        }
        float[] fArr = this.f106265b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f106265b, i, fArr2, i + 1, this.f106266c - i);
            this.f106265b = fArr2;
        }
        this.f106265b[i] = floatValue;
        this.f106266c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo136872e();
        byte[] bArr = C41860aa.f105998d;
        collection.getClass();
        if (!(collection instanceof C42039k9)) {
            return super.addAll(collection);
        }
        C42039k9 k9Var = (C42039k9) collection;
        int i = k9Var.f106266c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f106266c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f106265b;
            if (i3 > fArr.length) {
                this.f106265b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(k9Var.f106265b, 0, this.f106265b, this.f106266c, k9Var.f106266c);
            this.f106266c = i3;
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
        if (!(obj instanceof C42039k9)) {
            return super.equals(obj);
        }
        C42039k9 k9Var = (C42039k9) obj;
        if (this.f106266c != k9Var.f106266c) {
            return false;
        }
        float[] fArr = k9Var.f106265b;
        for (int i = 0; i < this.f106266c; i++) {
            if (Float.floatToIntBits(this.f106265b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        mo137084k(i);
        return Float.valueOf(this.f106265b[i]);
    }

    /* renamed from: h */
    public final void mo137081h(float f) {
        mo136872e();
        int i = this.f106266c;
        float[] fArr = this.f106265b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f106265b = fArr2;
        }
        float[] fArr3 = this.f106265b;
        int i2 = this.f106266c;
        this.f106266c = i2 + 1;
        fArr3[i2] = f;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f106266c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f106265b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final String mo137082i(int i) {
        int i2 = this.f106266c;
        return "Index:" + i + ", Size:" + i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f106266c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f106265b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo137084k(int i) {
        if (i < 0 || i >= this.f106266c) {
            throw new IndexOutOfBoundsException(mo137082i(i));
        }
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C42296z9 mo136618n(int i) {
        if (i >= this.f106266c) {
            return new C42039k9(Arrays.copyOf(this.f106265b, i), this.f106266c, true);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136872e();
        mo137084k(i);
        float[] fArr = this.f106265b;
        float f = fArr[i];
        int i2 = this.f106266c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f106266c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo136872e();
        if (i2 >= i) {
            float[] fArr = this.f106265b;
            System.arraycopy(fArr, i2, fArr, i, this.f106266c - i2);
            this.f106266c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo136872e();
        mo137084k(i);
        float[] fArr = this.f106265b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f106266c;
    }

    public C42039k9(float[] fArr, int i, boolean z) {
        super(z);
        this.f106265b = fArr;
        this.f106266c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo137081h(((Float) obj).floatValue());
        return true;
    }
}
