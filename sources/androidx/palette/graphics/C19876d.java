package androidx.palette.graphics;

import androidx.annotation.C0359n0;
import androidx.annotation.C0379x;

/* renamed from: androidx.palette.graphics.d */
public final class C19876d {

    /* renamed from: A */
    public static final C19876d f50782A;

    /* renamed from: B */
    public static final C19876d f50783B;

    /* renamed from: C */
    public static final C19876d f50784C;

    /* renamed from: D */
    public static final C19876d f50785D;

    /* renamed from: e */
    public static final float f50786e = 0.26f;

    /* renamed from: f */
    public static final float f50787f = 0.45f;

    /* renamed from: g */
    public static final float f50788g = 0.55f;

    /* renamed from: h */
    public static final float f50789h = 0.74f;

    /* renamed from: i */
    public static final float f50790i = 0.3f;

    /* renamed from: j */
    public static final float f50791j = 0.5f;

    /* renamed from: k */
    public static final float f50792k = 0.7f;

    /* renamed from: l */
    public static final float f50793l = 0.3f;

    /* renamed from: m */
    public static final float f50794m = 0.4f;

    /* renamed from: n */
    public static final float f50795n = 1.0f;

    /* renamed from: o */
    public static final float f50796o = 0.35f;

    /* renamed from: p */
    public static final float f50797p = 0.24f;

    /* renamed from: q */
    public static final float f50798q = 0.52f;

    /* renamed from: r */
    public static final float f50799r = 0.24f;

    /* renamed from: s */
    public static final int f50800s = 0;

    /* renamed from: t */
    public static final int f50801t = 1;

    /* renamed from: u */
    public static final int f50802u = 2;

    /* renamed from: v */
    public static final int f50803v = 0;

    /* renamed from: w */
    public static final int f50804w = 1;

    /* renamed from: x */
    public static final int f50805x = 2;

    /* renamed from: y */
    public static final C19876d f50806y;

    /* renamed from: z */
    public static final C19876d f50807z;

    /* renamed from: a */
    public final float[] f50808a;

    /* renamed from: b */
    public final float[] f50809b;

    /* renamed from: c */
    public final float[] f50810c;

    /* renamed from: d */
    public boolean f50811d;

    static {
        C19876d dVar = new C19876d();
        f50806y = dVar;
        m92316m(dVar);
        m92319p(dVar);
        C19876d dVar2 = new C19876d();
        f50807z = dVar2;
        m92318o(dVar2);
        m92319p(dVar2);
        C19876d dVar3 = new C19876d();
        f50782A = dVar3;
        m92315l(dVar3);
        m92319p(dVar3);
        C19876d dVar4 = new C19876d();
        f50783B = dVar4;
        m92316m(dVar4);
        m92317n(dVar4);
        C19876d dVar5 = new C19876d();
        f50784C = dVar5;
        m92318o(dVar5);
        m92317n(dVar5);
        C19876d dVar6 = new C19876d();
        f50785D = dVar6;
        m92315l(dVar6);
        m92317n(dVar6);
    }

    public C19876d() {
        float[] fArr = new float[3];
        this.f50808a = fArr;
        float[] fArr2 = new float[3];
        this.f50809b = fArr2;
        this.f50810c = new float[3];
        this.f50811d = true;
        m92320r(fArr);
        m92320r(fArr2);
        mo58727q();
    }

    /* renamed from: l */
    public static void m92315l(C19876d dVar) {
        float[] fArr = dVar.f50809b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: m */
    public static void m92316m(C19876d dVar) {
        float[] fArr = dVar.f50809b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: n */
    public static void m92317n(C19876d dVar) {
        float[] fArr = dVar.f50808a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: o */
    public static void m92318o(C19876d dVar) {
        float[] fArr = dVar.f50809b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: p */
    public static void m92319p(C19876d dVar) {
        float[] fArr = dVar.f50808a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: r */
    public static void m92320r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: a */
    public float mo58716a() {
        return this.f50810c[1];
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: b */
    public float mo58717b() {
        return this.f50809b[2];
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: c */
    public float mo58718c() {
        return this.f50808a[2];
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: d */
    public float mo58719d() {
        return this.f50809b[0];
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: e */
    public float mo58720e() {
        return this.f50808a[0];
    }

    /* renamed from: f */
    public float mo58721f() {
        return this.f50810c[2];
    }

    /* renamed from: g */
    public float mo58722g() {
        return this.f50810c[0];
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: h */
    public float mo58723h() {
        return this.f50809b[1];
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: i */
    public float mo58724i() {
        return this.f50808a[1];
    }

    /* renamed from: j */
    public boolean mo58725j() {
        return this.f50811d;
    }

    /* renamed from: k */
    public void mo58726k() {
        float f = 0.0f;
        for (float f2 : this.f50810c) {
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length = this.f50810c.length;
            for (int i = 0; i < length; i++) {
                float[] fArr = this.f50810c;
                float f3 = fArr[i];
                if (f3 > 0.0f) {
                    fArr[i] = f3 / f;
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo58727q() {
        float[] fArr = this.f50810c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    /* renamed from: androidx.palette.graphics.d$a */
    public static final class C19877a {

        /* renamed from: a */
        public final C19876d f50812a;

        public C19877a() {
            this.f50812a = new C19876d();
        }

        @C0359n0
        /* renamed from: a */
        public C19876d mo58728a() {
            return this.f50812a;
        }

        @C0359n0
        /* renamed from: b */
        public C19877a mo58729b(boolean z) {
            this.f50812a.f50811d = z;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C19877a mo58730c(@C0379x(from = 0.0d) float f) {
            this.f50812a.f50810c[1] = f;
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C19877a mo58731d(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
            this.f50812a.f50809b[2] = f;
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C19877a mo58732e(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
            this.f50812a.f50808a[2] = f;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C19877a mo58733f(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
            this.f50812a.f50809b[0] = f;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C19877a mo58734g(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
            this.f50812a.f50808a[0] = f;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C19877a mo58735h(@C0379x(from = 0.0d) float f) {
            this.f50812a.f50810c[2] = f;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C19877a mo58736i(@C0379x(from = 0.0d) float f) {
            this.f50812a.f50810c[0] = f;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C19877a mo58737j(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
            this.f50812a.f50809b[1] = f;
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C19877a mo58738k(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
            this.f50812a.f50808a[1] = f;
            return this;
        }

        public C19877a(@C0359n0 C19876d dVar) {
            this.f50812a = new C19876d(dVar);
        }
    }

    public C19876d(@C0359n0 C19876d dVar) {
        float[] fArr = new float[3];
        this.f50808a = fArr;
        float[] fArr2 = new float[3];
        this.f50809b = fArr2;
        float[] fArr3 = new float[3];
        this.f50810c = fArr3;
        this.f50811d = true;
        System.arraycopy(dVar.f50808a, 0, fArr, 0, fArr.length);
        System.arraycopy(dVar.f50809b, 0, fArr2, 0, fArr2.length);
        System.arraycopy(dVar.f50810c, 0, fArr3, 0, fArr3.length);
    }
}
