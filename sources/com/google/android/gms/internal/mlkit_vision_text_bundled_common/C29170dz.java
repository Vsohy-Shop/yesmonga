package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.dz */
public final class C29170dz extends C29722sx<Float> implements RandomAccess, C29687rz, f10 {

    /* renamed from: d */
    public static final C29170dz f71215d;

    /* renamed from: b */
    public float[] f71216b;

    /* renamed from: c */
    public int f71217c;

    static {
        C29170dz dzVar = new C29170dz(new float[0], 0);
        f71215d = dzVar;
        dzVar.mo84834I();
    }

    public C29170dz() {
        this(new float[10], 0);
    }

    /* renamed from: h */
    public static C29170dz m120318h() {
        return f71215d;
    }

    /* renamed from: P1 */
    public final /* bridge */ /* synthetic */ C29872wz mo84516P1(int i) {
        if (i >= this.f71217c) {
            return new C29170dz(Arrays.copyOf(this.f71216b, i), this.f71217c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo84835e();
        if (i < 0 || i > (i2 = this.f71217c)) {
            throw new IndexOutOfBoundsException(mo84594k(i));
        }
        float[] fArr = this.f71216b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f71216b, i, fArr2, i + 1, this.f71217c - i);
            this.f71216b = fArr2;
        }
        this.f71216b[i] = floatValue;
        this.f71217c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo84835e();
        C29909xz.m121347e(collection);
        if (!(collection instanceof C29170dz)) {
            return super.addAll(collection);
        }
        C29170dz dzVar = (C29170dz) collection;
        int i = dzVar.f71217c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f71217c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f71216b;
            if (i3 > fArr.length) {
                this.f71216b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(dzVar.f71216b, 0, this.f71216b, this.f71217c, dzVar.f71217c);
            this.f71217c = i3;
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
        if (!(obj instanceof C29170dz)) {
            return super.equals(obj);
        }
        C29170dz dzVar = (C29170dz) obj;
        if (this.f71217c != dzVar.f71217c) {
            return false;
        }
        float[] fArr = dzVar.f71216b;
        for (int i = 0; i < this.f71217c; i++) {
            if (Float.floatToIntBits(this.f71216b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo84595q(i);
        return Float.valueOf(this.f71216b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f71217c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f71216b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo84592i(float f) {
        mo84835e();
        int i = this.f71217c;
        float[] fArr = this.f71216b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f71216b = fArr2;
        }
        float[] fArr3 = this.f71216b;
        int i2 = this.f71217c;
        this.f71217c = i2 + 1;
        fArr3[i2] = f;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f71217c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f71216b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo84594k(int i) {
        int i2 = this.f71217c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: q */
    public final void mo84595q(int i) {
        if (i < 0 || i >= this.f71217c) {
            throw new IndexOutOfBoundsException(mo84594k(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo84835e();
        mo84595q(i);
        float[] fArr = this.f71216b;
        float f = fArr[i];
        int i2 = this.f71217c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f71217c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo84835e();
        if (i2 >= i) {
            float[] fArr = this.f71216b;
            System.arraycopy(fArr, i2, fArr, i, this.f71217c - i2);
            this.f71217c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo84835e();
        mo84595q(i);
        float[] fArr = this.f71216b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f71217c;
    }

    public C29170dz(float[] fArr, int i) {
        this.f71216b = fArr;
        this.f71217c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo84592i(((Float) obj).floatValue());
        return true;
    }
}
