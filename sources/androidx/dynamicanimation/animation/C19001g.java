package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.C18975b;

/* renamed from: androidx.dynamicanimation.animation.g */
public final class C19001g extends C18975b<C19001g> {

    /* renamed from: J */
    public static final float f48333J = Float.MAX_VALUE;

    /* renamed from: G */
    public C19002h f48334G = null;

    /* renamed from: H */
    public float f48335H = Float.MAX_VALUE;

    /* renamed from: I */
    public boolean f48336I = false;

    public C19001g(C18999e eVar) {
        super(eVar);
    }

    /* renamed from: A */
    public boolean mo55918A() {
        return this.f48334G.f48348b > 0.0d;
    }

    /* renamed from: B */
    public C19002h mo55919B() {
        return this.f48334G;
    }

    /* renamed from: C */
    public final void mo55920C() {
        C19002h hVar = this.f48334G;
        if (hVar != null) {
            double d = (double) hVar.mo55925d();
            if (d > ((double) this.f48314g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d < ((double) this.f48315h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* renamed from: D */
    public C19001g mo55921D(C19002h hVar) {
        this.f48334G = hVar;
        return this;
    }

    /* renamed from: E */
    public void mo55922E() {
        if (!mo55918A()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.f48313f) {
            this.f48336I = true;
        }
    }

    /* renamed from: f */
    public float mo55855f(float f, float f2) {
        return this.f48334G.mo55911b(f, f2);
    }

    /* renamed from: j */
    public boolean mo55859j(float f, float f2) {
        return this.f48334G.mo55910a(f, f2);
    }

    /* renamed from: v */
    public void mo55869v(float f) {
    }

    /* renamed from: w */
    public void mo55870w() {
        mo55920C();
        this.f48334G.mo55931j((double) mo55858i());
        super.mo55870w();
    }

    /* renamed from: y */
    public boolean mo55872y(long j) {
        if (this.f48336I) {
            float f = this.f48335H;
            if (f != Float.MAX_VALUE) {
                this.f48334G.mo55929h(f);
                this.f48335H = Float.MAX_VALUE;
            }
            this.f48309b = this.f48334G.mo55925d();
            this.f48308a = 0.0f;
            this.f48336I = false;
            return true;
        }
        if (this.f48335H != Float.MAX_VALUE) {
            this.f48334G.mo55925d();
            long j2 = j / 2;
            C18975b.C18991p k = this.f48334G.mo55932k((double) this.f48309b, (double) this.f48308a, j2);
            this.f48334G.mo55929h(this.f48335H);
            this.f48335H = Float.MAX_VALUE;
            C18975b.C18991p k2 = this.f48334G.mo55932k((double) k.f48322a, (double) k.f48323b, j2);
            this.f48309b = k2.f48322a;
            this.f48308a = k2.f48323b;
        } else {
            C18975b.C18991p k3 = this.f48334G.mo55932k((double) this.f48309b, (double) this.f48308a, j);
            this.f48309b = k3.f48322a;
            this.f48308a = k3.f48323b;
        }
        float max = Math.max(this.f48309b, this.f48315h);
        this.f48309b = max;
        float min = Math.min(max, this.f48314g);
        this.f48309b = min;
        if (!mo55859j(min, this.f48308a)) {
            return false;
        }
        this.f48309b = this.f48334G.mo55925d();
        this.f48308a = 0.0f;
        return true;
    }

    /* renamed from: z */
    public void mo55923z(float f) {
        if (mo55860k()) {
            this.f48335H = f;
            return;
        }
        if (this.f48334G == null) {
            this.f48334G = new C19002h(f);
        }
        this.f48334G.mo55929h(f);
        mo55870w();
    }

    public <K> C19001g(K k, C18997d<K> dVar) {
        super(k, dVar);
    }

    public <K> C19001g(K k, C18997d<K> dVar, float f) {
        super(k, dVar);
        this.f48334G = new C19002h(f);
    }
}
