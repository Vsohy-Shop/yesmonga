package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.interpolator.view.animation.C19319b;
import androidx.vectordrawable.graphics.drawable.C20715b;
import com.google.android.material.color.C31266s;
import java.util.Arrays;

/* renamed from: com.google.android.material.progressindicator.l */
public final class C31489l extends C31486i<ObjectAnimator> {

    /* renamed from: j */
    public static final int f76229j = 667;

    /* renamed from: k */
    public static final int f76230k = 333;

    /* renamed from: l */
    public static final Property<C31489l, Float> f76231l = new C31491b(Float.class, "animationFraction");

    /* renamed from: d */
    public ObjectAnimator f76232d;

    /* renamed from: e */
    public C19319b f76233e;

    /* renamed from: f */
    public final C31471b f76234f;

    /* renamed from: g */
    public int f76235g = 1;

    /* renamed from: h */
    public boolean f76236h;

    /* renamed from: i */
    public float f76237i;

    /* renamed from: com.google.android.material.progressindicator.l$a */
    public class C31490a extends AnimatorListenerAdapter {
        public C31490a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C31489l lVar = C31489l.this;
            int unused = lVar.f76235g = (lVar.f76235g + 1) % C31489l.this.f76234f.f76157c.length;
            boolean unused2 = C31489l.this.f76236h = true;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.l$b */
    public class C31491b extends Property<C31489l, Float> {
        public C31491b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C31489l lVar) {
            return Float.valueOf(lVar.mo90616n());
        }

        /* renamed from: b */
        public void set(C31489l lVar, Float f) {
            lVar.mo90620r(f.floatValue());
        }
    }

    public C31489l(@C0359n0 C31496n nVar) {
        super(3);
        this.f76234f = nVar;
        this.f76233e = new C19319b();
    }

    /* renamed from: a */
    public void mo90536a() {
        ObjectAnimator objectAnimator = this.f76232d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo90537c() {
        mo90619q();
    }

    /* renamed from: d */
    public void mo90538d(@C0363p0 C20715b.C20716a aVar) {
    }

    /* renamed from: f */
    public void mo90539f() {
    }

    /* renamed from: g */
    public void mo90540g() {
        mo90617o();
        mo90619q();
        this.f76232d.start();
    }

    /* renamed from: h */
    public void mo90541h() {
    }

    /* renamed from: n */
    public final float mo90616n() {
        return this.f76237i;
    }

    /* renamed from: o */
    public final void mo90617o() {
        if (this.f76232d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f76231l, new float[]{0.0f, 1.0f});
            this.f76232d = ofFloat;
            ofFloat.setDuration(333);
            this.f76232d.setInterpolator((TimeInterpolator) null);
            this.f76232d.setRepeatCount(-1);
            this.f76232d.addListener(new C31490a());
        }
    }

    /* renamed from: p */
    public final void mo90618p() {
        if (this.f76236h && this.f76222b[3] < 1.0f) {
            int[] iArr = this.f76223c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = C31266s.m125950a(this.f76234f.f76157c[this.f76235g], this.f76221a.getAlpha());
            this.f76236h = false;
        }
    }

    @C0344h1
    /* renamed from: q */
    public void mo90619q() {
        this.f76236h = true;
        this.f76235g = 1;
        Arrays.fill(this.f76223c, C31266s.m125950a(this.f76234f.f76157c[0], this.f76221a.getAlpha()));
    }

    @C0344h1
    /* renamed from: r */
    public void mo90620r(float f) {
        this.f76237i = f;
        mo90621s((int) (f * 333.0f));
        mo90618p();
        this.f76221a.invalidateSelf();
    }

    /* renamed from: s */
    public final void mo90621s(int i) {
        this.f76222b[0] = 0.0f;
        float b = mo90607b(i, 0, 667);
        float[] fArr = this.f76222b;
        float interpolation = this.f76233e.getInterpolation(b);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f76222b;
        float interpolation2 = this.f76233e.getInterpolation(b + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f76222b[5] = 1.0f;
    }
}
