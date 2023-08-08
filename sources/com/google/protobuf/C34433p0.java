package com.google.protobuf;

import com.google.protobuf.C34471v0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.p0 */
public final class C34433p0 extends C34337c<Float> implements C34471v0.C34477f, RandomAccess, C34510z1 {

    /* renamed from: e */
    public static final C34433p0 f83437e;

    /* renamed from: c */
    public float[] f83438c;

    /* renamed from: d */
    public int f83439d;

    static {
        C34433p0 p0Var = new C34433p0(new float[0], 0);
        f83437e = p0Var;
        p0Var.mo100970J();
    }

    public C34433p0() {
        this(new float[10], 0);
    }

    /* renamed from: q */
    public static C34433p0 m140088q() {
        return f83437e;
    }

    /* renamed from: A */
    public Float remove(int i) {
        mo100975e();
        mo101483r(i);
        float[] fArr = this.f83438c;
        float f = fArr[i];
        int i2 = this.f83439d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f83439d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* renamed from: G */
    public void mo101474G(float f) {
        mo100975e();
        int i = this.f83439d;
        float[] fArr = this.f83438c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f83438c = fArr2;
        }
        float[] fArr3 = this.f83438c;
        int i2 = this.f83439d;
        this.f83439d = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: H */
    public Float set(int i, Float f) {
        return Float.valueOf(mo101486t(i, f.floatValue()));
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo100975e();
        C34471v0.m140573d(collection);
        if (!(collection instanceof C34433p0)) {
            return super.addAll(collection);
        }
        C34433p0 p0Var = (C34433p0) collection;
        int i = p0Var.f83439d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f83439d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f83438c;
            if (i3 > fArr.length) {
                this.f83438c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(p0Var.f83438c, 0, this.f83438c, this.f83439d, p0Var.f83439d);
            this.f83439d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34433p0)) {
            return super.equals(obj);
        }
        C34433p0 p0Var = (C34433p0) obj;
        if (this.f83439d != p0Var.f83439d) {
            return false;
        }
        float[] fArr = p0Var.f83438c;
        for (int i = 0; i < this.f83439d; i++) {
            if (Float.floatToIntBits(this.f83438c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public float getFloat(int i) {
        mo101483r(i);
        return this.f83438c[i];
    }

    /* renamed from: h */
    public void add(int i, Float f) {
        mo101482k(i, f.floatValue());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f83439d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f83438c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public boolean add(Float f) {
        mo101474G(f.floatValue());
        return true;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f83438c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo101482k(int i, float f) {
        int i2;
        mo100975e();
        if (i < 0 || i > (i2 = this.f83439d)) {
            throw new IndexOutOfBoundsException(mo101488y(i));
        }
        float[] fArr = this.f83438c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f83438c, i, fArr2, i + 1, this.f83439d - i);
            this.f83438c = fArr2;
        }
        this.f83438c[i] = f;
        this.f83439d++;
        this.modCount++;
    }

    /* renamed from: r */
    public final void mo101483r(int i) {
        if (i < 0 || i >= this.f83439d) {
            throw new IndexOutOfBoundsException(mo101488y(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo100975e();
        if (i2 >= i) {
            float[] fArr = this.f83438c;
            System.arraycopy(fArr, i2, fArr, i, this.f83439d - i2);
            this.f83439d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f83439d;
    }

    /* renamed from: t */
    public float mo101486t(int i, float f) {
        mo100975e();
        mo101483r(i);
        float[] fArr = this.f83438c;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    /* renamed from: w */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    /* renamed from: y */
    public final String mo101488y(int i) {
        return "Index:" + i + ", Size:" + this.f83439d;
    }

    public C34433p0(float[] fArr, int i) {
        this.f83438c = fArr;
        this.f83439d = i;
    }

    /* renamed from: c */
    public C34471v0.C34477f m140093c(int i) {
        if (i >= this.f83439d) {
            return new C34433p0(Arrays.copyOf(this.f83438c, i), this.f83439d);
        }
        throw new IllegalArgumentException();
    }
}
