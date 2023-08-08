package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0366r;
import androidx.annotation.RestrictTo;
import com.google.android.material.C31076a;

/* renamed from: com.google.android.material.shape.o */
public class C31534o {

    /* renamed from: m */
    public static final C31518d f76418m = new C31532m(0.5f);

    /* renamed from: a */
    public C31519e f76419a;

    /* renamed from: b */
    public C31519e f76420b;

    /* renamed from: c */
    public C31519e f76421c;

    /* renamed from: d */
    public C31519e f76422d;

    /* renamed from: e */
    public C31518d f76423e;

    /* renamed from: f */
    public C31518d f76424f;

    /* renamed from: g */
    public C31518d f76425g;

    /* renamed from: h */
    public C31518d f76426h;

    /* renamed from: i */
    public C31521g f76427i;

    /* renamed from: j */
    public C31521g f76428j;

    /* renamed from: k */
    public C31521g f76429k;

    /* renamed from: l */
    public C31521g f76430l;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.shape.o$c */
    public interface C31537c {
        @C0359n0
        /* renamed from: a */
        C31518d mo90803a(@C0359n0 C31518d dVar);
    }

    @C0359n0
    /* renamed from: a */
    public static C31536b m127561a() {
        return new C31536b();
    }

    @C0359n0
    /* renamed from: b */
    public static C31536b m127562b(Context context, @C0327c1 int i, @C0327c1 int i2) {
        return m127563c(context, i, i2, 0);
    }

    @C0359n0
    /* renamed from: c */
    public static C31536b m127563c(Context context, @C0327c1 int i, @C0327c1 int i2, int i3) {
        return m127564d(context, i, i2, new C31515a((float) i3));
    }

    @C0359n0
    /* renamed from: d */
    public static C31536b m127564d(Context context, @C0327c1 int i, @C0327c1 int i2, @C0359n0 C31518d dVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C31076a.C31091o.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C31076a.C31091o.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C31076a.C31091o.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C31076a.C31091o.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C31076a.C31091o.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C31076a.C31091o.ShapeAppearance_cornerFamilyBottomLeft, i3);
            C31518d m = m127568m(obtainStyledAttributes, C31076a.C31091o.ShapeAppearance_cornerSize, dVar);
            C31518d m2 = m127568m(obtainStyledAttributes, C31076a.C31091o.ShapeAppearance_cornerSizeTopLeft, m);
            C31518d m3 = m127568m(obtainStyledAttributes, C31076a.C31091o.ShapeAppearance_cornerSizeTopRight, m);
            C31518d m4 = m127568m(obtainStyledAttributes, C31076a.C31091o.ShapeAppearance_cornerSizeBottomRight, m);
            return new C31536b().mo90834I(i4, m2).mo90839N(i5, m3).mo90826A(i6, m4).mo90851v(i7, m127568m(obtainStyledAttributes, C31076a.C31091o.ShapeAppearance_cornerSizeBottomLeft, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @C0359n0
    /* renamed from: e */
    public static C31536b m127565e(@C0359n0 Context context, AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        return m127566f(context, attributeSet, i, i2, 0);
    }

    @C0359n0
    /* renamed from: f */
    public static C31536b m127566f(@C0359n0 Context context, AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2, int i3) {
        return m127567g(context, attributeSet, i, i2, new C31515a((float) i3));
    }

    @C0359n0
    /* renamed from: g */
    public static C31536b m127567g(@C0359n0 Context context, AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2, @C0359n0 C31518d dVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m127564d(context, resourceId, resourceId2, dVar);
    }

    @C0359n0
    /* renamed from: m */
    public static C31518d m127568m(TypedArray typedArray, int i, @C0359n0 C31518d dVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return dVar;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C31515a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C31532m(peekValue.getFraction(1.0f, 1.0f));
        }
        return dVar;
    }

    @C0359n0
    /* renamed from: h */
    public C31521g mo90809h() {
        return this.f76429k;
    }

    @C0359n0
    /* renamed from: i */
    public C31519e mo90810i() {
        return this.f76422d;
    }

    @C0359n0
    /* renamed from: j */
    public C31518d mo90811j() {
        return this.f76426h;
    }

    @C0359n0
    /* renamed from: k */
    public C31519e mo90812k() {
        return this.f76421c;
    }

    @C0359n0
    /* renamed from: l */
    public C31518d mo90813l() {
        return this.f76425g;
    }

    @C0359n0
    /* renamed from: n */
    public C31521g mo90814n() {
        return this.f76430l;
    }

    @C0359n0
    /* renamed from: o */
    public C31521g mo90815o() {
        return this.f76428j;
    }

    @C0359n0
    /* renamed from: p */
    public C31521g mo90816p() {
        return this.f76427i;
    }

    @C0359n0
    /* renamed from: q */
    public C31519e mo90817q() {
        return this.f76419a;
    }

    @C0359n0
    /* renamed from: r */
    public C31518d mo90818r() {
        return this.f76423e;
    }

    @C0359n0
    /* renamed from: s */
    public C31519e mo90819s() {
        return this.f76420b;
    }

    @C0359n0
    /* renamed from: t */
    public C31518d mo90820t() {
        return this.f76424f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: u */
    public boolean mo90821u(@C0359n0 RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        Class<C31521g> cls = C31521g.class;
        if (!this.f76430l.getClass().equals(cls) || !this.f76428j.getClass().equals(cls) || !this.f76427i.getClass().equals(cls) || !this.f76429k.getClass().equals(cls)) {
            z = false;
        } else {
            z = true;
        }
        float a = this.f76423e.mo90693a(rectF);
        if (this.f76424f.mo90693a(rectF) == a && this.f76426h.mo90693a(rectF) == a && this.f76425g.mo90693a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(this.f76420b instanceof C31533n) || !(this.f76419a instanceof C31533n) || !(this.f76421c instanceof C31533n) || !(this.f76422d instanceof C31533n)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: v */
    public C31536b mo90822v() {
        return new C31536b(this);
    }

    @C0359n0
    /* renamed from: w */
    public C31534o mo90823w(float f) {
        return mo90822v().mo90844o(f).mo90843m();
    }

    @C0359n0
    /* renamed from: x */
    public C31534o mo90824x(@C0359n0 C31518d dVar) {
        return mo90822v().mo90845p(dVar).mo90843m();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public C31534o mo90825y(@C0359n0 C31537c cVar) {
        return mo90822v().mo90837L(cVar.mo90803a(mo90818r())).mo90842Q(cVar.mo90803a(mo90820t())).mo90854y(cVar.mo90803a(mo90811j())).mo90829D(cVar.mo90803a(mo90813l())).mo90843m();
    }

    public C31534o(@C0359n0 C31536b bVar) {
        this.f76419a = bVar.f76431a;
        this.f76420b = bVar.f76432b;
        this.f76421c = bVar.f76433c;
        this.f76422d = bVar.f76434d;
        this.f76423e = bVar.f76435e;
        this.f76424f = bVar.f76436f;
        this.f76425g = bVar.f76437g;
        this.f76426h = bVar.f76438h;
        this.f76427i = bVar.f76439i;
        this.f76428j = bVar.f76440j;
        this.f76429k = bVar.f76441k;
        this.f76430l = bVar.f76442l;
    }

    /* renamed from: com.google.android.material.shape.o$b */
    public static final class C31536b {
        @C0359n0

        /* renamed from: a */
        public C31519e f76431a = C31530k.m127551b();
        @C0359n0

        /* renamed from: b */
        public C31519e f76432b = C31530k.m127551b();
        @C0359n0

        /* renamed from: c */
        public C31519e f76433c = C31530k.m127551b();
        @C0359n0

        /* renamed from: d */
        public C31519e f76434d = C31530k.m127551b();
        @C0359n0

        /* renamed from: e */
        public C31518d f76435e = new C31515a(0.0f);
        @C0359n0

        /* renamed from: f */
        public C31518d f76436f = new C31515a(0.0f);
        @C0359n0

        /* renamed from: g */
        public C31518d f76437g = new C31515a(0.0f);
        @C0359n0

        /* renamed from: h */
        public C31518d f76438h = new C31515a(0.0f);
        @C0359n0

        /* renamed from: i */
        public C31521g f76439i = C31530k.m127552c();
        @C0359n0

        /* renamed from: j */
        public C31521g f76440j = C31530k.m127552c();
        @C0359n0

        /* renamed from: k */
        public C31521g f76441k = C31530k.m127552c();
        @C0359n0

        /* renamed from: l */
        public C31521g f76442l = C31530k.m127552c();

        public C31536b() {
        }

        /* renamed from: n */
        public static float m127598n(C31519e eVar) {
            if (eVar instanceof C31533n) {
                return ((C31533n) eVar).f76417a;
            }
            if (eVar instanceof C31520f) {
                return ((C31520f) eVar).f76350a;
            }
            return -1.0f;
        }

        @C0359n0
        /* renamed from: A */
        public C31536b mo90826A(int i, @C0359n0 C31518d dVar) {
            return mo90827B(C31530k.m127550a(i)).mo90829D(dVar);
        }

        @C0359n0
        /* renamed from: B */
        public C31536b mo90827B(@C0359n0 C31519e eVar) {
            this.f76433c = eVar;
            float n = m127598n(eVar);
            if (n != -1.0f) {
                mo90828C(n);
            }
            return this;
        }

        @C0359n0
        /* renamed from: C */
        public C31536b mo90828C(@C0366r float f) {
            this.f76437g = new C31515a(f);
            return this;
        }

        @C0359n0
        /* renamed from: D */
        public C31536b mo90829D(@C0359n0 C31518d dVar) {
            this.f76437g = dVar;
            return this;
        }

        @C0359n0
        /* renamed from: E */
        public C31536b mo90830E(@C0359n0 C31521g gVar) {
            this.f76442l = gVar;
            return this;
        }

        @C0359n0
        /* renamed from: F */
        public C31536b mo90831F(@C0359n0 C31521g gVar) {
            this.f76440j = gVar;
            return this;
        }

        @C0359n0
        /* renamed from: G */
        public C31536b mo90832G(@C0359n0 C31521g gVar) {
            this.f76439i = gVar;
            return this;
        }

        @C0359n0
        /* renamed from: H */
        public C31536b mo90833H(int i, @C0366r float f) {
            return mo90835J(C31530k.m127550a(i)).mo90836K(f);
        }

        @C0359n0
        /* renamed from: I */
        public C31536b mo90834I(int i, @C0359n0 C31518d dVar) {
            return mo90835J(C31530k.m127550a(i)).mo90837L(dVar);
        }

        @C0359n0
        /* renamed from: J */
        public C31536b mo90835J(@C0359n0 C31519e eVar) {
            this.f76431a = eVar;
            float n = m127598n(eVar);
            if (n != -1.0f) {
                mo90836K(n);
            }
            return this;
        }

        @C0359n0
        /* renamed from: K */
        public C31536b mo90836K(@C0366r float f) {
            this.f76435e = new C31515a(f);
            return this;
        }

        @C0359n0
        /* renamed from: L */
        public C31536b mo90837L(@C0359n0 C31518d dVar) {
            this.f76435e = dVar;
            return this;
        }

        @C0359n0
        /* renamed from: M */
        public C31536b mo90838M(int i, @C0366r float f) {
            return mo90840O(C31530k.m127550a(i)).mo90841P(f);
        }

        @C0359n0
        /* renamed from: N */
        public C31536b mo90839N(int i, @C0359n0 C31518d dVar) {
            return mo90840O(C31530k.m127550a(i)).mo90842Q(dVar);
        }

        @C0359n0
        /* renamed from: O */
        public C31536b mo90840O(@C0359n0 C31519e eVar) {
            this.f76432b = eVar;
            float n = m127598n(eVar);
            if (n != -1.0f) {
                mo90841P(n);
            }
            return this;
        }

        @C0359n0
        /* renamed from: P */
        public C31536b mo90841P(@C0366r float f) {
            this.f76436f = new C31515a(f);
            return this;
        }

        @C0359n0
        /* renamed from: Q */
        public C31536b mo90842Q(@C0359n0 C31518d dVar) {
            this.f76436f = dVar;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C31534o mo90843m() {
            return new C31534o(this);
        }

        @C0359n0
        /* renamed from: o */
        public C31536b mo90844o(@C0366r float f) {
            return mo90836K(f).mo90841P(f).mo90828C(f).mo90853x(f);
        }

        @C0359n0
        /* renamed from: p */
        public C31536b mo90845p(@C0359n0 C31518d dVar) {
            return mo90837L(dVar).mo90842Q(dVar).mo90829D(dVar).mo90854y(dVar);
        }

        @C0359n0
        /* renamed from: q */
        public C31536b mo90846q(int i, @C0366r float f) {
            return mo90847r(C31530k.m127550a(i)).mo90844o(f);
        }

        @C0359n0
        /* renamed from: r */
        public C31536b mo90847r(@C0359n0 C31519e eVar) {
            return mo90835J(eVar).mo90840O(eVar).mo90827B(eVar).mo90852w(eVar);
        }

        @C0359n0
        /* renamed from: s */
        public C31536b mo90848s(@C0359n0 C31521g gVar) {
            return mo90830E(gVar).mo90832G(gVar).mo90831F(gVar).mo90849t(gVar);
        }

        @C0359n0
        /* renamed from: t */
        public C31536b mo90849t(@C0359n0 C31521g gVar) {
            this.f76441k = gVar;
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public C31536b mo90850u(int i, @C0366r float f) {
            return mo90852w(C31530k.m127550a(i)).mo90853x(f);
        }

        @C0359n0
        /* renamed from: v */
        public C31536b mo90851v(int i, @C0359n0 C31518d dVar) {
            return mo90852w(C31530k.m127550a(i)).mo90854y(dVar);
        }

        @C0359n0
        /* renamed from: w */
        public C31536b mo90852w(@C0359n0 C31519e eVar) {
            this.f76434d = eVar;
            float n = m127598n(eVar);
            if (n != -1.0f) {
                mo90853x(n);
            }
            return this;
        }

        @C0359n0
        /* renamed from: x */
        public C31536b mo90853x(@C0366r float f) {
            this.f76438h = new C31515a(f);
            return this;
        }

        @C0359n0
        /* renamed from: y */
        public C31536b mo90854y(@C0359n0 C31518d dVar) {
            this.f76438h = dVar;
            return this;
        }

        @C0359n0
        /* renamed from: z */
        public C31536b mo90855z(int i, @C0366r float f) {
            return mo90827B(C31530k.m127550a(i)).mo90828C(f);
        }

        public C31536b(@C0359n0 C31534o oVar) {
            this.f76431a = oVar.f76419a;
            this.f76432b = oVar.f76420b;
            this.f76433c = oVar.f76421c;
            this.f76434d = oVar.f76422d;
            this.f76435e = oVar.f76423e;
            this.f76436f = oVar.f76424f;
            this.f76437g = oVar.f76425g;
            this.f76438h = oVar.f76426h;
            this.f76439i = oVar.f76427i;
            this.f76440j = oVar.f76428j;
            this.f76441k = oVar.f76429k;
            this.f76442l = oVar.f76430l;
        }
    }

    public C31534o() {
        this.f76419a = C31530k.m127551b();
        this.f76420b = C31530k.m127551b();
        this.f76421c = C31530k.m127551b();
        this.f76422d = C31530k.m127551b();
        this.f76423e = new C31515a(0.0f);
        this.f76424f = new C31515a(0.0f);
        this.f76425g = new C31515a(0.0f);
        this.f76426h = new C31515a(0.0f);
        this.f76427i = C31530k.m127552c();
        this.f76428j = C31530k.m127552c();
        this.f76429k = C31530k.m127552c();
        this.f76430l = C31530k.m127552c();
    }
}
