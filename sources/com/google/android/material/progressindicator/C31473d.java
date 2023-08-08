package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.interpolator.view.animation.C19319b;
import androidx.vectordrawable.graphics.drawable.C20715b;
import com.google.android.material.animation.C31095c;
import com.google.android.material.color.C31266s;

/* renamed from: com.google.android.material.progressindicator.d */
public final class C31473d extends C31486i<ObjectAnimator> {

    /* renamed from: l */
    public static final int f76165l = 4;

    /* renamed from: m */
    public static final int f76166m = 5400;

    /* renamed from: n */
    public static final int f76167n = 667;

    /* renamed from: o */
    public static final int f76168o = 667;

    /* renamed from: p */
    public static final int f76169p = 333;

    /* renamed from: q */
    public static final int f76170q = 333;

    /* renamed from: r */
    public static final int[] f76171r = {0, 1350, 2700, 4050};

    /* renamed from: s */
    public static final int[] f76172s = {667, 2017, 3367, 4717};

    /* renamed from: t */
    public static final int[] f76173t = {1000, 2350, 3700, 5050};

    /* renamed from: u */
    public static final int f76174u = -20;

    /* renamed from: v */
    public static final int f76175v = 250;

    /* renamed from: w */
    public static final int f76176w = 1520;

    /* renamed from: x */
    public static final Property<C31473d, Float> f76177x;

    /* renamed from: y */
    public static final Property<C31473d, Float> f76178y;

    /* renamed from: d */
    public ObjectAnimator f76179d;

    /* renamed from: e */
    public ObjectAnimator f76180e;

    /* renamed from: f */
    public final C19319b f76181f;

    /* renamed from: g */
    public final C31471b f76182g;

    /* renamed from: h */
    public int f76183h = 0;

    /* renamed from: i */
    public float f76184i;

    /* renamed from: j */
    public float f76185j;

    /* renamed from: k */
    public C20715b.C20716a f76186k = null;

    /* renamed from: com.google.android.material.progressindicator.d$a */
    public class C31474a extends AnimatorListenerAdapter {
        public C31474a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C31473d dVar = C31473d.this;
            int unused = dVar.f76183h = (dVar.f76183h + 4) % C31473d.this.f76182g.f76157c.length;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$b */
    public class C31475b extends AnimatorListenerAdapter {
        public C31475b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C31473d.this.mo90536a();
            C31473d dVar = C31473d.this;
            C20715b.C20716a aVar = dVar.f76186k;
            if (aVar != null) {
                aVar.mo61953b(dVar.f76221a);
            }
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$c */
    public class C31476c extends Property<C31473d, Float> {
        public C31476c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C31473d dVar) {
            return Float.valueOf(dVar.mo90542o());
        }

        /* renamed from: b */
        public void set(C31473d dVar, Float f) {
            dVar.mo90547t(f.floatValue());
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$d */
    public class C31477d extends Property<C31473d, Float> {
        public C31477d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C31473d dVar) {
            return Float.valueOf(dVar.mo90543p());
        }

        /* renamed from: b */
        public void set(C31473d dVar, Float f) {
            dVar.mo90548u(f.floatValue());
        }
    }

    static {
        Class<Float> cls = Float.class;
        f76177x = new C31476c(cls, "animationFraction");
        f76178y = new C31477d(cls, "completeEndFraction");
    }

    public C31473d(@C0359n0 C31478e eVar) {
        super(1);
        this.f76182g = eVar;
        this.f76181f = new C19319b();
    }

    /* renamed from: a */
    public void mo90536a() {
        ObjectAnimator objectAnimator = this.f76179d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo90537c() {
        mo90546s();
    }

    /* renamed from: d */
    public void mo90538d(@C0359n0 C20715b.C20716a aVar) {
        this.f76186k = aVar;
    }

    /* renamed from: f */
    public void mo90539f() {
        ObjectAnimator objectAnimator = this.f76180e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f76221a.isVisible()) {
                this.f76180e.start();
            } else {
                mo90536a();
            }
        }
    }

    /* renamed from: g */
    public void mo90540g() {
        mo90544q();
        mo90546s();
        this.f76179d.start();
    }

    /* renamed from: h */
    public void mo90541h() {
        this.f76186k = null;
    }

    /* renamed from: o */
    public final float mo90542o() {
        return this.f76184i;
    }

    /* renamed from: p */
    public final float mo90543p() {
        return this.f76185j;
    }

    /* renamed from: q */
    public final void mo90544q() {
        if (this.f76179d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f76177x, new float[]{0.0f, 1.0f});
            this.f76179d = ofFloat;
            ofFloat.setDuration(5400);
            this.f76179d.setInterpolator((TimeInterpolator) null);
            this.f76179d.setRepeatCount(-1);
            this.f76179d.addListener(new C31474a());
        }
        if (this.f76180e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f76178y, new float[]{0.0f, 1.0f});
            this.f76180e = ofFloat2;
            ofFloat2.setDuration(333);
            this.f76180e.setInterpolator(this.f76181f);
            this.f76180e.addListener(new C31475b());
        }
    }

    /* renamed from: r */
    public final void mo90545r(int i) {
        int i2 = 0;
        while (i2 < 4) {
            float b = mo90607b(i, f76173t[i2], 333);
            if (b < 0.0f || b > 1.0f) {
                i2++;
            } else {
                int i3 = i2 + this.f76183h;
                int[] iArr = this.f76182g.f76157c;
                int length = i3 % iArr.length;
                this.f76223c[0] = C31095c.m124651b().evaluate(this.f76181f.getInterpolation(b), Integer.valueOf(C31266s.m125950a(iArr[length], this.f76221a.getAlpha())), Integer.valueOf(C31266s.m125950a(this.f76182g.f76157c[(length + 1) % iArr.length], this.f76221a.getAlpha()))).intValue();
                return;
            }
        }
    }

    @C0344h1
    /* renamed from: s */
    public void mo90546s() {
        this.f76183h = 0;
        this.f76223c[0] = C31266s.m125950a(this.f76182g.f76157c[0], this.f76221a.getAlpha());
        this.f76185j = 0.0f;
    }

    @C0344h1
    /* renamed from: t */
    public void mo90547t(float f) {
        this.f76184i = f;
        int i = (int) (f * 5400.0f);
        mo90549v(i);
        mo90545r(i);
        this.f76221a.invalidateSelf();
    }

    /* renamed from: u */
    public final void mo90548u(float f) {
        this.f76185j = f;
    }

    /* renamed from: v */
    public final void mo90549v(int i) {
        float[] fArr = this.f76222b;
        float f = this.f76184i;
        fArr[0] = (f * 1520.0f) - 0.21875f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float b = mo90607b(i, f76171r[i2], 667);
            float[] fArr2 = this.f76222b;
            fArr2[1] = fArr2[1] + (this.f76181f.getInterpolation(b) * 250.0f);
            float b2 = mo90607b(i, f76172s[i2], 667);
            float[] fArr3 = this.f76222b;
            fArr3[0] = fArr3[0] + (this.f76181f.getInterpolation(b2) * 250.0f);
        }
        float[] fArr4 = this.f76222b;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = f2 + ((f3 - f2) * this.f76185j);
        fArr4[0] = f4;
        fArr4[0] = f4 / 360.0f;
        fArr4[1] = f3 / 360.0f;
    }
}
