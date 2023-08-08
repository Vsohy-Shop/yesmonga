package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14566o3;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.contentsquare.android.sdk.gf */
public final class C14382gf extends C14240c3<Float> implements C14566o3.C14572f, RandomAccess, C14548n9 {

    /* renamed from: d */
    public static final C14382gf f35559d;

    /* renamed from: b */
    public float[] f35560b;

    /* renamed from: c */
    public int f35561c;

    static {
        C14382gf gfVar = new C14382gf(new float[0], 0);
        f35559d = gfVar;
        gfVar.mo34819c();
    }

    public C14382gf() {
        this(new float[10], 0);
    }

    /* renamed from: A */
    public Float get(int i) {
        return Float.valueOf(mo35380H(i));
    }

    /* renamed from: H */
    public float mo35380H(int i) {
        mo35397y(i);
        return this.f35560b[i];
    }

    /* renamed from: M */
    public final String mo35381M(int i) {
        return "Index:" + i + ", Size:" + this.f35561c;
    }

    /* renamed from: Q */
    public C14566o3.C14572f mo34508b(int i) {
        if (i >= this.f35561c) {
            return new C14382gf(Arrays.copyOf(this.f35560b, i), this.f35561c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: W */
    public Float remove(int i) {
        mo34821e();
        mo35397y(i);
        float[] fArr = this.f35560b;
        float f = fArr[i];
        int i2 = this.f35561c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f35561c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo34821e();
        C14566o3.m62804f(collection);
        if (!(collection instanceof C14382gf)) {
            return super.addAll(collection);
        }
        C14382gf gfVar = (C14382gf) collection;
        int i = gfVar.f35561c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f35561c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f35560b;
            if (i3 > fArr.length) {
                this.f35560b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(gfVar.f35560b, 0, this.f35560b, this.f35561c, gfVar.f35561c);
            this.f35561c = i3;
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
        if (!(obj instanceof C14382gf)) {
            return super.equals(obj);
        }
        C14382gf gfVar = (C14382gf) obj;
        if (this.f35561c != gfVar.f35561c) {
            return false;
        }
        float[] fArr = gfVar.f35560b;
        for (int i = 0; i < this.f35561c; i++) {
            if (Float.floatToIntBits(this.f35560b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public void mo35387h(float f) {
        mo34821e();
        int i = this.f35561c;
        float[] fArr = this.f35560b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f35560b = fArr2;
        }
        float[] fArr3 = this.f35560b;
        int i2 = this.f35561c;
        this.f35561c = i2 + 1;
        fArr3[i2] = f;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35561c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f35560b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo35388i(int i, float f) {
        int i2;
        mo34821e();
        if (i < 0 || i > (i2 = this.f35561c)) {
            throw new IndexOutOfBoundsException(mo35381M(i));
        }
        float[] fArr = this.f35560b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f35560b, i, fArr2, i + 1, this.f35561c - i);
            this.f35560b = fArr2;
        }
        this.f35560b[i] = f;
        this.f35561c++;
        this.modCount++;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f35560b[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public void add(int i, Float f) {
        mo35388i(i, f.floatValue());
    }

    /* renamed from: q */
    public boolean add(Float f) {
        mo35387h(f.floatValue());
        return true;
    }

    /* renamed from: r */
    public float mo35392r(int i, float f) {
        mo34821e();
        mo35397y(i);
        float[] fArr = this.f35560b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public void removeRange(int i, int i2) {
        mo34821e();
        if (i2 >= i) {
            float[] fArr = this.f35560b;
            System.arraycopy(fArr, i2, fArr, i, this.f35561c - i2);
            this.f35561c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f35561c;
    }

    /* renamed from: w */
    public Float set(int i, Float f) {
        return Float.valueOf(mo35392r(i, f.floatValue()));
    }

    /* renamed from: y */
    public final void mo35397y(int i) {
        if (i < 0 || i >= this.f35561c) {
            throw new IndexOutOfBoundsException(mo35381M(i));
        }
    }

    public C14382gf(float[] fArr, int i) {
        this.f35560b = fArr;
        this.f35561c = i;
    }
}
