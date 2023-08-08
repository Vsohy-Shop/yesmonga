package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.gtm.cj */
public final class C41193cj extends C41743zg<Float> implements RandomAccess, C41626uj, C41195cl {

    /* renamed from: d */
    public static final C41193cj f104501d;

    /* renamed from: b */
    public float[] f104502b;

    /* renamed from: c */
    public int f104503c;

    static {
        C41193cj cjVar = new C41193cj(new float[0], 0);
        f104501d = cjVar;
        cjVar.zzb();
    }

    public C41193cj() {
        this(new float[10], 0);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo136121e();
        if (i < 0 || i > (i2 = this.f104503c)) {
            throw new IndexOutOfBoundsException(mo135184i(i));
        }
        float[] fArr = this.f104502b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f104502b, i, fArr2, i + 1, this.f104503c - i);
            this.f104502b = fArr2;
        }
        this.f104502b[i] = floatValue;
        this.f104503c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo136121e();
        C41650vj.m168603e(collection);
        if (!(collection instanceof C41193cj)) {
            return super.addAll(collection);
        }
        C41193cj cjVar = (C41193cj) collection;
        int i = cjVar.f104503c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f104503c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f104502b;
            if (i3 > fArr.length) {
                this.f104502b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(cjVar.f104502b, 0, this.f104502b, this.f104503c, cjVar.f104503c);
            this.f104503c = i3;
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
        if (!(obj instanceof C41193cj)) {
            return super.equals(obj);
        }
        C41193cj cjVar = (C41193cj) obj;
        if (this.f104503c != cjVar.f104503c) {
            return false;
        }
        float[] fArr = cjVar.f104502b;
        for (int i = 0; i < this.f104503c; i++) {
            if (Float.floatToIntBits(this.f104502b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        mo135186k(i);
        return Float.valueOf(this.f104502b[i]);
    }

    /* renamed from: h */
    public final void mo135182h(float f) {
        mo136121e();
        int i = this.f104503c;
        float[] fArr = this.f104502b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f104502b = fArr2;
        }
        float[] fArr3 = this.f104502b;
        int i2 = this.f104503c;
        this.f104503c = i2 + 1;
        fArr3[i2] = f;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f104503c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f104502b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final String mo135184i(int i) {
        int i2 = this.f104503c;
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
        int i = this.f104503c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f104502b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void mo135186k(int i) {
        if (i < 0 || i >= this.f104503c) {
            throw new IndexOutOfBoundsException(mo135184i(i));
        }
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C41626uj mo135130n(int i) {
        if (i >= this.f104503c) {
            return new C41193cj(Arrays.copyOf(this.f104502b, i), this.f104503c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo136121e();
        mo135186k(i);
        float[] fArr = this.f104502b;
        float f = fArr[i];
        int i2 = this.f104503c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f104503c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo136121e();
        if (i2 >= i) {
            float[] fArr = this.f104502b;
            System.arraycopy(fArr, i2, fArr, i, this.f104503c - i2);
            this.f104503c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo136121e();
        mo135186k(i);
        float[] fArr = this.f104502b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f104503c;
    }

    public C41193cj(float[] fArr, int i) {
        this.f104502b = fArr;
        this.f104503c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo135182h(((Float) obj).floatValue());
        return true;
    }
}
