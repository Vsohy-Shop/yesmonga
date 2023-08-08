package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import androidx.vectordrawable.graphics.drawable.C20715b;
import com.google.android.material.animation.C31093a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.progressindicator.g */
public abstract class C31481g extends Drawable implements C20715b {

    /* renamed from: E0 */
    public static final int f76200E0 = 500;

    /* renamed from: F0 */
    public static final Property<C31481g, Float> f76201F0 = new C31484c(Float.class, "growFraction");

    /* renamed from: Z */
    public static final boolean f76202Z = false;

    /* renamed from: X */
    public final Paint f76203X = new Paint();

    /* renamed from: Y */
    public int f76204Y;

    /* renamed from: a */
    public final Context f76205a;

    /* renamed from: b */
    public final C31471b f76206b;

    /* renamed from: c */
    public C31470a f76207c;

    /* renamed from: d */
    public ValueAnimator f76208d;

    /* renamed from: e */
    public ValueAnimator f76209e;

    /* renamed from: f */
    public boolean f76210f;

    /* renamed from: g */
    public boolean f76211g;

    /* renamed from: v */
    public float f76212v;

    /* renamed from: w */
    public List<C20715b.C20716a> f76213w;

    /* renamed from: x */
    public C20715b.C20716a f76214x;

    /* renamed from: y */
    public boolean f76215y;

    /* renamed from: z */
    public float f76216z;

    /* renamed from: com.google.android.material.progressindicator.g$a */
    public class C31482a extends AnimatorListenerAdapter {
        public C31482a() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C31481g.this.mo90588h();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.g$b */
    public class C31483b extends AnimatorListenerAdapter {
        public C31483b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            boolean unused = C31481g.super.setVisible(false, false);
            C31481g.this.mo90587g();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.g$c */
    public class C31484c extends Property<C31481g, Float> {
        public C31484c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C31481g gVar) {
            return Float.valueOf(gVar.mo90590j());
        }

        /* renamed from: b */
        public void set(C31481g gVar, Float f) {
            gVar.mo90593p(f.floatValue());
        }
    }

    public C31481g(@C0359n0 Context context, @C0359n0 C31471b bVar) {
        this.f76205a = context;
        this.f76206b = bVar;
        this.f76207c = new C31470a();
        setAlpha(255);
    }

    /* renamed from: b */
    public void mo61949b(@C0359n0 C20715b.C20716a aVar) {
        if (this.f76213w == null) {
            this.f76213w = new ArrayList();
        }
        if (!this.f76213w.contains(aVar)) {
            this.f76213w.add(aVar);
        }
    }

    /* renamed from: c */
    public void mo61950c() {
        this.f76213w.clear();
        this.f76213w = null;
    }

    /* renamed from: d */
    public boolean mo61951d(@C0359n0 C20715b.C20716a aVar) {
        List<C20715b.C20716a> list = this.f76213w;
        if (list == null || !list.contains(aVar)) {
            return false;
        }
        this.f76213w.remove(aVar);
        if (!this.f76213w.isEmpty()) {
            return true;
        }
        this.f76213w = null;
        return true;
    }

    /* renamed from: g */
    public final void mo90587g() {
        C20715b.C20716a aVar = this.f76214x;
        if (aVar != null) {
            aVar.mo61953b(this);
        }
        List<C20715b.C20716a> list = this.f76213w;
        if (list != null && !this.f76215y) {
            for (C20715b.C20716a b : list) {
                b.mo61953b(this);
            }
        }
    }

    public int getAlpha() {
        return this.f76204Y;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void mo90588h() {
        C20715b.C20716a aVar = this.f76214x;
        if (aVar != null) {
            aVar.mo61954c(this);
        }
        List<C20715b.C20716a> list = this.f76213w;
        if (list != null && !this.f76215y) {
            for (C20715b.C20716a c : list) {
                c.mo61954c(this);
            }
        }
    }

    /* renamed from: i */
    public final void mo90589i(@C0359n0 ValueAnimator... valueAnimatorArr) {
        boolean z = this.f76215y;
        this.f76215y = true;
        for (ValueAnimator end : valueAnimatorArr) {
            end.end();
        }
        this.f76215y = z;
    }

    public boolean isRunning() {
        return mo90575n() || mo90574m();
    }

    /* renamed from: j */
    public float mo90590j() {
        if (!this.f76206b.mo90525b() && !this.f76206b.mo90524a()) {
            return 1.0f;
        }
        if (this.f76211g || this.f76210f) {
            return this.f76212v;
        }
        return this.f76216z;
    }

    @C0359n0
    /* renamed from: k */
    public ValueAnimator mo90591k() {
        return this.f76209e;
    }

    /* renamed from: l */
    public boolean mo90573l() {
        return mo90582v(false, false, false);
    }

    /* renamed from: m */
    public boolean mo90574m() {
        ValueAnimator valueAnimator = this.f76209e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f76211g;
    }

    /* renamed from: n */
    public boolean mo90575n() {
        ValueAnimator valueAnimator = this.f76208d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f76210f;
    }

    /* renamed from: o */
    public final void mo90592o() {
        if (this.f76208d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f76201F0, new float[]{0.0f, 1.0f});
            this.f76208d = ofFloat;
            ofFloat.setDuration(500);
            this.f76208d.setInterpolator(C31093a.f74426b);
            mo90598u(this.f76208d);
        }
        if (this.f76209e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f76201F0, new float[]{1.0f, 0.0f});
            this.f76209e = ofFloat2;
            ofFloat2.setDuration(500);
            this.f76209e.setInterpolator(C31093a.f74426b);
            mo90594q(this.f76209e);
        }
    }

    /* renamed from: p */
    public void mo90593p(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        if (this.f76216z != f) {
            this.f76216z = f;
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public final void mo90594q(@C0359n0 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f76209e;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f76209e = valueAnimator;
            valueAnimator.addListener(new C31483b());
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    /* renamed from: r */
    public void mo90595r(@C0359n0 C20715b.C20716a aVar) {
        this.f76214x = aVar;
    }

    @C0344h1
    /* renamed from: s */
    public void mo90596s(boolean z, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f76211g = z;
        this.f76212v = f;
    }

    public void setAlpha(int i) {
        this.f76204Y = i;
        invalidateSelf();
    }

    public void setColorFilter(@C0363p0 ColorFilter colorFilter) {
        this.f76203X.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return mo90582v(z, z2, true);
    }

    public void start() {
        mo90583w(true, true, false);
    }

    public void stop() {
        mo90583w(false, true, false);
    }

    @C0344h1
    /* renamed from: t */
    public void mo90597t(boolean z, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f76210f = z;
        this.f76212v = f;
    }

    /* renamed from: u */
    public final void mo90598u(@C0359n0 ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f76208d;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f76208d = valueAnimator;
            valueAnimator.addListener(new C31482a());
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    /* renamed from: v */
    public boolean mo90582v(boolean z, boolean z2, boolean z3) {
        boolean z4;
        float a = this.f76207c.mo90523a(this.f76205a.getContentResolver());
        if (!z3 || a <= 0.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        return mo90583w(z, z2, z4);
    }

    /* renamed from: w */
    public boolean mo90583w(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        boolean z4;
        boolean z5;
        mo90592o();
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.f76208d;
        } else {
            valueAnimator = this.f76209e;
        }
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                mo90589i(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (!z || super.setVisible(z, false)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z) {
                z5 = this.f76206b.mo90525b();
            } else {
                z5 = this.f76206b.mo90524a();
            }
            if (!z5) {
                mo90589i(valueAnimator);
                return z4;
            }
            if (z2 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z4;
        }
    }
}
