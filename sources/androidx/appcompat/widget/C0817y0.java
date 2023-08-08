package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.y0 */
public class C0817y0 {

    /* renamed from: i */
    public static final int f2620i = Integer.MIN_VALUE;

    /* renamed from: a */
    public int f2621a = 0;

    /* renamed from: b */
    public int f2622b = 0;

    /* renamed from: c */
    public int f2623c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f2624d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f2625e = 0;

    /* renamed from: f */
    public int f2626f = 0;

    /* renamed from: g */
    public boolean f2627g = false;

    /* renamed from: h */
    public boolean f2628h = false;

    /* renamed from: a */
    public int mo3759a() {
        return this.f2627g ? this.f2621a : this.f2622b;
    }

    /* renamed from: b */
    public int mo3760b() {
        return this.f2621a;
    }

    /* renamed from: c */
    public int mo3761c() {
        return this.f2622b;
    }

    /* renamed from: d */
    public int mo3762d() {
        return this.f2627g ? this.f2622b : this.f2621a;
    }

    /* renamed from: e */
    public void mo3763e(int i, int i2) {
        this.f2628h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2625e = i;
            this.f2621a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2626f = i2;
            this.f2622b = i2;
        }
    }

    /* renamed from: f */
    public void mo3764f(boolean z) {
        if (z != this.f2627g) {
            this.f2627g = z;
            if (!this.f2628h) {
                this.f2621a = this.f2625e;
                this.f2622b = this.f2626f;
            } else if (z) {
                int i = this.f2624d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f2625e;
                }
                this.f2621a = i;
                int i2 = this.f2623c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f2626f;
                }
                this.f2622b = i2;
            } else {
                int i3 = this.f2623c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f2625e;
                }
                this.f2621a = i3;
                int i4 = this.f2624d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f2626f;
                }
                this.f2622b = i4;
            }
        }
    }

    /* renamed from: g */
    public void mo3765g(int i, int i2) {
        this.f2623c = i;
        this.f2624d = i2;
        this.f2628h = true;
        if (this.f2627g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2621a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2622b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2621a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2622b = i2;
        }
    }
}
