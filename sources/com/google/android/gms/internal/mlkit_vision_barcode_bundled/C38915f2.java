package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f2 */
public final class C38915f2 extends C38864a1<Float> implements RandomAccess, C39048t2, C38907e4 {

    /* renamed from: d */
    public static final C38915f2 f98840d;

    /* renamed from: b */
    public float[] f98841b;

    /* renamed from: c */
    public int f98842c;

    static {
        C38915f2 f2Var = new C38915f2(new float[0], 0);
        f98840d = f2Var;
        f2Var.zzb();
    }

    public C38915f2() {
        this(new float[10], 0);
    }

    /* renamed from: h */
    public static C38915f2 m160489h() {
        return f98840d;
    }

    /* renamed from: V1 */
    public final void mo122874V1(float f) {
        mo122768e();
        int i = this.f98842c;
        float[] fArr = this.f98841b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f98841b = fArr2;
        }
        float[] fArr3 = this.f98841b;
        int i2 = this.f98842c;
        this.f98842c = i2 + 1;
        fArr3[i2] = f;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo122768e();
        if (i < 0 || i > (i2 = this.f98842c)) {
            throw new IndexOutOfBoundsException(mo122877i(i));
        }
        float[] fArr = this.f98841b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f98841b, i, fArr2, i + 1, this.f98842c - i);
            this.f98841b = fArr2;
        }
        this.f98841b[i] = floatValue;
        this.f98842c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo122768e();
        C39084x2.m160969e(collection);
        if (!(collection instanceof C38915f2)) {
            return super.addAll(collection);
        }
        C38915f2 f2Var = (C38915f2) collection;
        int i = f2Var.f98842c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f98842c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f98841b;
            if (i3 > fArr.length) {
                this.f98841b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(f2Var.f98841b, 0, this.f98841b, this.f98842c, f2Var.f98842c);
            this.f98842c = i3;
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
        if (!(obj instanceof C38915f2)) {
            return super.equals(obj);
        }
        C38915f2 f2Var = (C38915f2) obj;
        if (this.f98842c != f2Var.f98842c) {
            return false;
        }
        float[] fArr = f2Var.f98841b;
        for (int i = 0; i < this.f98842c; i++) {
            if (Float.floatToIntBits(this.f98841b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo122879k(i);
        return Float.valueOf(this.f98841b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f98842c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f98841b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final String mo122877i(int i) {
        int i2 = this.f98842c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f98842c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f98841b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo122879k(int i) {
        if (i < 0 || i >= this.f98842c) {
            throw new IndexOutOfBoundsException(mo122877i(i));
        }
    }

    /* renamed from: m */
    public final C39048t2 mo122844n(int i) {
        if (i >= this.f98842c) {
            return new C38915f2(Arrays.copyOf(this.f98841b, i), this.f98842c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo122768e();
        mo122879k(i);
        float[] fArr = this.f98841b;
        float f = fArr[i];
        int i2 = this.f98842c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f98842c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo122768e();
        if (i2 >= i) {
            float[] fArr = this.f98841b;
            System.arraycopy(fArr, i2, fArr, i, this.f98842c - i2);
            this.f98842c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo122768e();
        mo122879k(i);
        float[] fArr = this.f98841b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f98842c;
    }

    public C38915f2(float[] fArr, int i) {
        this.f98841b = fArr;
        this.f98842c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo122874V1(((Float) obj).floatValue());
        return true;
    }
}
