package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.z0 */
public final class C18919z0 extends C18695c<Float> implements C18753i1.C18759f, RandomAccess, C18846q2 {

    /* renamed from: e */
    public static final C18919z0 f48147e;

    /* renamed from: c */
    public float[] f48148c;

    /* renamed from: d */
    public int f48149d;

    static {
        C18919z0 z0Var = new C18919z0(new float[0], 0);
        f48147e = z0Var;
        z0Var.mo54404J();
    }

    public C18919z0() {
        this(new float[10], 0);
    }

    /* renamed from: q */
    public static C18919z0 m88241q() {
        return f48147e;
    }

    /* renamed from: A */
    public Float remove(int i) {
        mo54411e();
        mo55691r(i);
        float[] fArr = this.f48148c;
        float f = fArr[i];
        int i2 = this.f48149d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f48149d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* renamed from: G */
    public void mo54828G(float f) {
        mo54411e();
        int i = this.f48149d;
        float[] fArr = this.f48148c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f48148c = fArr2;
        }
        float[] fArr3 = this.f48148c;
        int i2 = this.f48149d;
        this.f48149d = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: H */
    public Float set(int i, Float f) {
        return Float.valueOf(mo54830t(i, f.floatValue()));
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo54411e();
        C18753i1.m86340d(collection);
        if (!(collection instanceof C18919z0)) {
            return super.addAll(collection);
        }
        C18919z0 z0Var = (C18919z0) collection;
        int i = z0Var.f48149d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f48149d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f48148c;
            if (i3 > fArr.length) {
                this.f48148c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(z0Var.f48148c, 0, this.f48148c, this.f48149d, z0Var.f48149d);
            this.f48149d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18919z0)) {
            return super.equals(obj);
        }
        C18919z0 z0Var = (C18919z0) obj;
        if (this.f48149d != z0Var.f48149d) {
            return false;
        }
        float[] fArr = z0Var.f48148c;
        for (int i = 0; i < this.f48149d; i++) {
            if (Float.floatToIntBits(this.f48148c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public float getFloat(int i) {
        mo55691r(i);
        return this.f48148c[i];
    }

    /* renamed from: h */
    public void add(int i, Float f) {
        mo55690k(i, f.floatValue());
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f48149d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f48148c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public boolean add(Float f) {
        mo54828G(f.floatValue());
        return true;
    }

    /* renamed from: k */
    public final void mo55690k(int i, float f) {
        int i2;
        mo54411e();
        if (i < 0 || i > (i2 = this.f48149d)) {
            throw new IndexOutOfBoundsException(mo55695y(i));
        }
        float[] fArr = this.f48148c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f48148c, i, fArr2, i + 1, this.f48149d - i);
            this.f48148c = fArr2;
        }
        this.f48148c[i] = f;
        this.f48149d++;
        this.modCount++;
    }

    /* renamed from: r */
    public final void mo55691r(int i) {
        if (i < 0 || i >= this.f48149d) {
            throw new IndexOutOfBoundsException(mo55695y(i));
        }
    }

    public void removeRange(int i, int i2) {
        mo54411e();
        if (i2 >= i) {
            float[] fArr = this.f48148c;
            System.arraycopy(fArr, i2, fArr, i, this.f48149d - i2);
            this.f48149d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f48149d;
    }

    /* renamed from: t */
    public float mo54830t(int i, float f) {
        mo54411e();
        mo55691r(i);
        float[] fArr = this.f48148c;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    /* renamed from: w */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    /* renamed from: y */
    public final String mo55695y(int i) {
        return "Index:" + i + ", Size:" + this.f48149d;
    }

    public C18919z0(float[] fArr, int i) {
        this.f48148c = fArr;
        this.f48149d = i;
    }

    /* renamed from: c */
    public C18753i1.C18759f m88246c(int i) {
        if (i >= this.f48149d) {
            return new C18919z0(Arrays.copyOf(this.f48148c, i), this.f48149d);
        }
        throw new IllegalArgumentException();
    }

    public boolean remove(Object obj) {
        mo54411e();
        for (int i = 0; i < this.f48149d; i++) {
            if (obj.equals(Float.valueOf(this.f48148c[i]))) {
                float[] fArr = this.f48148c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f48149d - i) - 1);
                this.f48149d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
