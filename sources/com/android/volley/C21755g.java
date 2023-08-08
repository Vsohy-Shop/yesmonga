package com.android.volley;

/* renamed from: com.android.volley.g */
public class C21755g implements C21775r {

    /* renamed from: e */
    public static final int f56277e = 2500;

    /* renamed from: f */
    public static final int f56278f = 1;

    /* renamed from: g */
    public static final float f56279g = 1.0f;

    /* renamed from: a */
    public int f56280a;

    /* renamed from: b */
    public int f56281b;

    /* renamed from: c */
    public final int f56282c;

    /* renamed from: d */
    public final float f56283d;

    public C21755g() {
        this(f56277e, 1, 1.0f);
    }

    /* renamed from: a */
    public int mo64924a() {
        return this.f56281b;
    }

    /* renamed from: b */
    public void mo64925b(VolleyError volleyError) throws VolleyError {
        this.f56281b++;
        int i = this.f56280a;
        this.f56280a = i + ((int) (((float) i) * this.f56283d));
        if (!mo64928e()) {
            throw volleyError;
        }
    }

    /* renamed from: c */
    public int mo64926c() {
        return this.f56280a;
    }

    /* renamed from: d */
    public float mo64927d() {
        return this.f56283d;
    }

    /* renamed from: e */
    public boolean mo64928e() {
        return this.f56281b <= this.f56282c;
    }

    public C21755g(int i, int i2, float f) {
        this.f56280a = i;
        this.f56282c = i2;
        this.f56283d = f;
    }
}
