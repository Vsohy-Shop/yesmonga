package androidx.collection;

/* renamed from: androidx.collection.f */
public final class C1873f {

    /* renamed from: a */
    public int[] f5116a;

    /* renamed from: b */
    public int f5117b;

    /* renamed from: c */
    public int f5118c;

    /* renamed from: d */
    public int f5119d;

    public C1873f() {
        this(8);
    }

    /* renamed from: a */
    public void mo6195a(int i) {
        int i2 = (this.f5117b - 1) & this.f5119d;
        this.f5117b = i2;
        this.f5116a[i2] = i;
        if (i2 == this.f5118c) {
            mo6198d();
        }
    }

    /* renamed from: b */
    public void mo6196b(int i) {
        int[] iArr = this.f5116a;
        int i2 = this.f5118c;
        iArr[i2] = i;
        int i3 = this.f5119d & (i2 + 1);
        this.f5118c = i3;
        if (i3 == this.f5117b) {
            mo6198d();
        }
    }

    /* renamed from: c */
    public void mo6197c() {
        this.f5118c = this.f5117b;
    }

    /* renamed from: d */
    public final void mo6198d() {
        int[] iArr = this.f5116a;
        int length = iArr.length;
        int i = this.f5117b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            int[] iArr2 = new int[i3];
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f5116a, 0, iArr2, i2, this.f5117b);
            this.f5116a = iArr2;
            this.f5117b = 0;
            this.f5118c = length;
            this.f5119d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: e */
    public int mo6199e(int i) {
        if (i < 0 || i >= mo6207m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f5116a[this.f5119d & (this.f5117b + i)];
    }

    /* renamed from: f */
    public int mo6200f() {
        int i = this.f5117b;
        if (i != this.f5118c) {
            return this.f5116a[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int mo6201g() {
        int i = this.f5117b;
        int i2 = this.f5118c;
        if (i != i2) {
            return this.f5116a[(i2 - 1) & this.f5119d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: h */
    public boolean mo6202h() {
        return this.f5117b == this.f5118c;
    }

    /* renamed from: i */
    public int mo6203i() {
        int i = this.f5117b;
        if (i != this.f5118c) {
            int i2 = this.f5116a[i];
            this.f5117b = (i + 1) & this.f5119d;
            return i2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: j */
    public int mo6204j() {
        int i = this.f5117b;
        int i2 = this.f5118c;
        if (i != i2) {
            int i3 = this.f5119d & (i2 - 1);
            int i4 = this.f5116a[i3];
            this.f5118c = i3;
            return i4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: k */
    public void mo6205k(int i) {
        if (i > 0) {
            if (i <= mo6207m()) {
                this.f5118c = this.f5119d & (this.f5118c - i);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: l */
    public void mo6206l(int i) {
        if (i > 0) {
            if (i <= mo6207m()) {
                this.f5117b = this.f5119d & (this.f5117b + i);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: m */
    public int mo6207m() {
        return (this.f5118c - this.f5117b) & this.f5119d;
    }

    public C1873f(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.f5119d = i - 1;
            this.f5116a = new int[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }
}
