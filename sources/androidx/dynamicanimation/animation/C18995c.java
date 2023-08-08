package androidx.dynamicanimation.animation;

import androidx.annotation.C0379x;
import androidx.dynamicanimation.animation.C18975b;

/* renamed from: androidx.dynamicanimation.animation.c */
public final class C18995c extends C18975b<C18995c> {

    /* renamed from: G */
    public final C18996a f48324G;

    /* renamed from: androidx.dynamicanimation.animation.c$a */
    public static final class C18996a implements C19000f {

        /* renamed from: d */
        public static final float f48325d = -4.2f;

        /* renamed from: e */
        public static final float f48326e = 62.5f;

        /* renamed from: a */
        public float f48327a = -4.2f;

        /* renamed from: b */
        public float f48328b;

        /* renamed from: c */
        public final C18975b.C18991p f48329c = new C18975b.C18991p();

        /* renamed from: a */
        public boolean mo55910a(float f, float f2) {
            return Math.abs(f2) < this.f48328b;
        }

        /* renamed from: b */
        public float mo55911b(float f, float f2) {
            return f2 * this.f48327a;
        }

        /* renamed from: c */
        public float mo55912c() {
            return this.f48327a / -4.2f;
        }

        /* renamed from: d */
        public void mo55913d(float f) {
            this.f48327a = f * -4.2f;
        }

        /* renamed from: e */
        public void mo55914e(float f) {
            this.f48328b = f * 62.5f;
        }

        /* renamed from: f */
        public C18975b.C18991p mo55915f(float f, float f2, long j) {
            float f3 = (float) j;
            this.f48329c.f48323b = (float) (((double) f2) * Math.exp((double) ((f3 / 1000.0f) * this.f48327a)));
            C18975b.C18991p pVar = this.f48329c;
            float f4 = this.f48327a;
            pVar.f48322a = (float) (((double) (f - (f2 / f4))) + (((double) (f2 / f4)) * Math.exp((double) ((f4 * f3) / 1000.0f))));
            C18975b.C18991p pVar2 = this.f48329c;
            if (mo55910a(pVar2.f48322a, pVar2.f48323b)) {
                this.f48329c.f48323b = 0.0f;
            }
            return this.f48329c;
        }
    }

    public C18995c(C18999e eVar) {
        super(eVar);
        C18996a aVar = new C18996a();
        this.f48324G = aVar;
        aVar.mo55914e(mo55858i());
    }

    /* renamed from: A */
    public C18995c mo55905A(@C0379x(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f48324G.mo55913d(f);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    /* renamed from: B */
    public C18995c mo55863p(float f) {
        super.mo55863p(f);
        return this;
    }

    /* renamed from: C */
    public C18995c mo55864q(float f) {
        super.mo55864q(f);
        return this;
    }

    /* renamed from: D */
    public C18995c mo55868u(float f) {
        super.mo55868u(f);
        return this;
    }

    /* renamed from: f */
    public float mo55855f(float f, float f2) {
        return this.f48324G.mo55911b(f, f2);
    }

    /* renamed from: j */
    public boolean mo55859j(float f, float f2) {
        if (f >= this.f48314g || f <= this.f48315h || this.f48324G.mo55910a(f, f2)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public void mo55869v(float f) {
        this.f48324G.mo55914e(f);
    }

    /* renamed from: y */
    public boolean mo55872y(long j) {
        C18975b.C18991p f = this.f48324G.mo55915f(this.f48309b, this.f48308a, j);
        float f2 = f.f48322a;
        this.f48309b = f2;
        float f3 = f.f48323b;
        this.f48308a = f3;
        float f4 = this.f48315h;
        if (f2 < f4) {
            this.f48309b = f4;
            return true;
        }
        float f5 = this.f48314g;
        if (f2 > f5) {
            this.f48309b = f5;
            return true;
        } else if (mo55859j(f2, f3)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: z */
    public float mo55909z() {
        return this.f48324G.mo55912c();
    }

    public <K> C18995c(K k, C18997d<K> dVar) {
        super(k, dVar);
        C18996a aVar = new C18996a();
        this.f48324G = aVar;
        aVar.mo55914e(mo55858i());
    }
}
