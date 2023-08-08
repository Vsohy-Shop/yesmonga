package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.motion.widget.C16881f;
import androidx.core.view.C18196h2;
import androidx.dynamicanimation.animation.C18967a;
import androidx.dynamicanimation.animation.C18975b;
import java.util.ArrayList;

/* renamed from: androidx.dynamicanimation.animation.b */
public abstract class C18975b<T extends C18975b<T>> implements C18967a.C18969b {

    /* renamed from: A */
    public static final float f48288A = 1.0f;

    /* renamed from: B */
    public static final float f48289B = 0.1f;

    /* renamed from: C */
    public static final float f48290C = 0.00390625f;

    /* renamed from: D */
    public static final float f48291D = 0.002f;

    /* renamed from: E */
    public static final float f48292E = Float.MAX_VALUE;

    /* renamed from: F */
    public static final float f48293F = 0.75f;

    /* renamed from: m */
    public static final C18994s f48294m = new C18982g("translationX");

    /* renamed from: n */
    public static final C18994s f48295n = new C18983h("translationY");

    /* renamed from: o */
    public static final C18994s f48296o = new C18984i("translationZ");

    /* renamed from: p */
    public static final C18994s f48297p = new C18985j("scaleX");

    /* renamed from: q */
    public static final C18994s f48298q = new C18986k("scaleY");

    /* renamed from: r */
    public static final C18994s f48299r = new C18987l(C16881f.f43375i);

    /* renamed from: s */
    public static final C18994s f48300s = new C18988m("rotationX");

    /* renamed from: t */
    public static final C18994s f48301t = new C18989n("rotationY");

    /* renamed from: u */
    public static final C18994s f48302u = new C18990o("x");

    /* renamed from: v */
    public static final C18994s f48303v = new C18976a("y");

    /* renamed from: w */
    public static final C18994s f48304w = new C18977b("z");

    /* renamed from: x */
    public static final C18994s f48305x = new C18978c("alpha");

    /* renamed from: y */
    public static final C18994s f48306y = new C18979d("scrollX");

    /* renamed from: z */
    public static final C18994s f48307z = new C18980e("scrollY");

    /* renamed from: a */
    public float f48308a;

    /* renamed from: b */
    public float f48309b;

    /* renamed from: c */
    public boolean f48310c;

    /* renamed from: d */
    public final Object f48311d;

    /* renamed from: e */
    public final C18997d f48312e;

    /* renamed from: f */
    public boolean f48313f;

    /* renamed from: g */
    public float f48314g;

    /* renamed from: h */
    public float f48315h;

    /* renamed from: i */
    public long f48316i;

    /* renamed from: j */
    public float f48317j;

    /* renamed from: k */
    public final ArrayList<C18992q> f48318k;

    /* renamed from: l */
    public final ArrayList<C18993r> f48319l;

    /* renamed from: androidx.dynamicanimation.animation.b$a */
    public static class C18976a extends C18994s {
        public C18976a(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return view.getY();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$b */
    public static class C18977b extends C18994s {
        public C18977b(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return C18196h2.m82489F0(view);
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            C18196h2.m82475B2(view, f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$c */
    public static class C18978c extends C18994s {
        public C18978c(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return view.getAlpha();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$d */
    public static class C18979d extends C18994s {
        public C18979d(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return (float) view.getScrollX();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$e */
    public static class C18980e extends C18994s {
        public C18980e(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return (float) view.getScrollY();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$f */
    public class C18981f extends C18997d {

        /* renamed from: b */
        public final /* synthetic */ C18999e f48320b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18981f(String str, C18999e eVar) {
            super(str);
            this.f48320b = eVar;
        }

        /* renamed from: b */
        public float mo55873b(Object obj) {
            return this.f48320b.mo55916a();
        }

        /* renamed from: c */
        public void mo55874c(Object obj, float f) {
            this.f48320b.mo55917b(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$g */
    public static class C18982g extends C18994s {
        public C18982g(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return view.getTranslationX();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$h */
    public static class C18983h extends C18994s {
        public C18983h(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return view.getTranslationY();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$i */
    public static class C18984i extends C18994s {
        public C18984i(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return C18196h2.m82469A0(view);
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            C18196h2.m82647w2(view, f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$j */
    public static class C18985j extends C18994s {
        public C18985j(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return view.getScaleX();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$k */
    public static class C18986k extends C18994s {
        public C18986k(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return view.getScaleY();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$l */
    public static class C18987l extends C18994s {
        public C18987l(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return view.getRotation();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$m */
    public static class C18988m extends C18994s {
        public C18988m(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return view.getRotationX();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$n */
    public static class C18989n extends C18994s {
        public C18989n(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return view.getRotationY();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$o */
    public static class C18990o extends C18994s {
        public C18990o(String str) {
            super(str, (C18982g) null);
        }

        /* renamed from: d */
        public float mo55873b(View view) {
            return view.getX();
        }

        /* renamed from: e */
        public void mo55874c(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$p */
    public static class C18991p {

        /* renamed from: a */
        public float f48322a;

        /* renamed from: b */
        public float f48323b;
    }

    /* renamed from: androidx.dynamicanimation.animation.b$q */
    public interface C18992q {
        /* renamed from: a */
        void mo55903a(C18975b bVar, boolean z, float f, float f2);
    }

    /* renamed from: androidx.dynamicanimation.animation.b$r */
    public interface C18993r {
        /* renamed from: a */
        void mo55904a(C18975b bVar, float f, float f2);
    }

    /* renamed from: androidx.dynamicanimation.animation.b$s */
    public static abstract class C18994s extends C18997d<View> {
        public /* synthetic */ C18994s(String str, C18982g gVar) {
            this(str);
        }

        public C18994s(String str) {
            super(str);
        }
    }

    public C18975b(C18999e eVar) {
        this.f48308a = 0.0f;
        this.f48309b = Float.MAX_VALUE;
        this.f48310c = false;
        this.f48313f = false;
        this.f48314g = Float.MAX_VALUE;
        this.f48315h = -Float.MAX_VALUE;
        this.f48316i = 0;
        this.f48318k = new ArrayList<>();
        this.f48319l = new ArrayList<>();
        this.f48311d = null;
        this.f48312e = new C18981f("FloatValueHolder", eVar);
        this.f48317j = 1.0f;
    }

    /* renamed from: m */
    public static <T> void m88691m(ArrayList<T> arrayList, T t) {
        int indexOf = arrayList.indexOf(t);
        if (indexOf >= 0) {
            arrayList.set(indexOf, (Object) null);
        }
    }

    /* renamed from: n */
    public static <T> void m88692n(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public boolean mo55847a(long j) {
        long j2 = this.f48316i;
        if (j2 == 0) {
            this.f48316i = j;
            mo55866s(this.f48309b);
            return false;
        }
        this.f48316i = j;
        boolean y = mo55872y(j - j2);
        float min = Math.min(this.f48309b, this.f48314g);
        this.f48309b = min;
        float max = Math.max(min, this.f48315h);
        this.f48309b = max;
        mo55866s(max);
        if (y) {
            mo55854e(false);
        }
        return y;
    }

    /* renamed from: b */
    public T mo55851b(C18992q qVar) {
        if (!this.f48318k.contains(qVar)) {
            this.f48318k.add(qVar);
        }
        return this;
    }

    /* renamed from: c */
    public T mo55852c(C18993r rVar) {
        if (!mo55860k()) {
            if (!this.f48319l.contains(rVar)) {
                this.f48319l.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    /* renamed from: d */
    public void mo55853d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f48313f) {
            mo55854e(true);
        }
    }

    /* renamed from: e */
    public final void mo55854e(boolean z) {
        this.f48313f = false;
        C18967a.m88678e().mo55844h(this);
        this.f48316i = 0;
        this.f48310c = false;
        for (int i = 0; i < this.f48318k.size(); i++) {
            if (this.f48318k.get(i) != null) {
                this.f48318k.get(i).mo55903a(this, z, this.f48309b, this.f48308a);
            }
        }
        m88692n(this.f48318k);
    }

    /* renamed from: f */
    public abstract float mo55855f(float f, float f2);

    /* renamed from: g */
    public float mo55856g() {
        return this.f48317j;
    }

    /* renamed from: h */
    public final float mo55857h() {
        return this.f48312e.mo55873b(this.f48311d);
    }

    /* renamed from: i */
    public float mo55858i() {
        return this.f48317j * 0.75f;
    }

    /* renamed from: j */
    public abstract boolean mo55859j(float f, float f2);

    /* renamed from: k */
    public boolean mo55860k() {
        return this.f48313f;
    }

    /* renamed from: l */
    public void mo55861l(C18992q qVar) {
        m88691m(this.f48318k, qVar);
    }

    /* renamed from: o */
    public void mo55862o(C18993r rVar) {
        m88691m(this.f48319l, rVar);
    }

    /* renamed from: p */
    public T mo55863p(float f) {
        this.f48314g = f;
        return this;
    }

    /* renamed from: q */
    public T mo55864q(float f) {
        this.f48315h = f;
        return this;
    }

    /* renamed from: r */
    public T mo55865r(@C0379x(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f48317j = f;
            mo55869v(f * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    /* renamed from: s */
    public void mo55866s(float f) {
        this.f48312e.mo55874c(this.f48311d, f);
        for (int i = 0; i < this.f48319l.size(); i++) {
            if (this.f48319l.get(i) != null) {
                this.f48319l.get(i).mo55904a(this, this.f48309b, this.f48308a);
            }
        }
        m88692n(this.f48319l);
    }

    /* renamed from: t */
    public T mo55867t(float f) {
        this.f48309b = f;
        this.f48310c = true;
        return this;
    }

    /* renamed from: u */
    public T mo55868u(float f) {
        this.f48308a = f;
        return this;
    }

    /* renamed from: v */
    public abstract void mo55869v(float f);

    /* renamed from: w */
    public void mo55870w() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f48313f) {
            mo55871x();
        }
    }

    /* renamed from: x */
    public final void mo55871x() {
        if (!this.f48313f) {
            this.f48313f = true;
            if (!this.f48310c) {
                this.f48309b = mo55857h();
            }
            float f = this.f48309b;
            if (f > this.f48314g || f < this.f48315h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            C18967a.m88678e().mo55839a(this, 0);
        }
    }

    /* renamed from: y */
    public abstract boolean mo55872y(long j);

    public <K> C18975b(K k, C18997d<K> dVar) {
        this.f48308a = 0.0f;
        this.f48309b = Float.MAX_VALUE;
        this.f48310c = false;
        this.f48313f = false;
        this.f48314g = Float.MAX_VALUE;
        this.f48315h = -Float.MAX_VALUE;
        this.f48316i = 0;
        this.f48318k = new ArrayList<>();
        this.f48319l = new ArrayList<>();
        this.f48311d = k;
        this.f48312e = dVar;
        if (dVar == f48299r || dVar == f48300s || dVar == f48301t) {
            this.f48317j = 0.1f;
        } else if (dVar == f48305x) {
            this.f48317j = 0.00390625f;
        } else if (dVar == f48297p || dVar == f48298q) {
            this.f48317j = 0.00390625f;
        } else {
            this.f48317j = 1.0f;
        }
    }
}
