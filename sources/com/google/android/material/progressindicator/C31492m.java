package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.vectordrawable.graphics.drawable.C20715b;
import androidx.vectordrawable.graphics.drawable.C20723d;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;
import java.util.Arrays;

/* renamed from: com.google.android.material.progressindicator.m */
public final class C31492m extends C31486i<ObjectAnimator> {

    /* renamed from: l */
    public static final int f76239l = 1800;

    /* renamed from: m */
    public static final int[] f76240m = {533, 567, 850, 750};

    /* renamed from: n */
    public static final int[] f76241n = {1267, 1000, 333, 0};

    /* renamed from: o */
    public static final Property<C31492m, Float> f76242o = new C31495c(Float.class, "animationFraction");

    /* renamed from: d */
    public ObjectAnimator f76243d;

    /* renamed from: e */
    public ObjectAnimator f76244e;

    /* renamed from: f */
    public final Interpolator[] f76245f;

    /* renamed from: g */
    public final C31471b f76246g;

    /* renamed from: h */
    public int f76247h = 0;

    /* renamed from: i */
    public boolean f76248i;

    /* renamed from: j */
    public float f76249j;

    /* renamed from: k */
    public C20715b.C20716a f76250k = null;

    /* renamed from: com.google.android.material.progressindicator.m$a */
    public class C31493a extends AnimatorListenerAdapter {
        public C31493a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C31492m mVar = C31492m.this;
            int unused = mVar.f76247h = (mVar.f76247h + 1) % C31492m.this.f76246g.f76157c.length;
            boolean unused2 = C31492m.this.f76248i = true;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.m$b */
    public class C31494b extends AnimatorListenerAdapter {
        public C31494b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C31492m.this.mo90536a();
            C31492m mVar = C31492m.this;
            C20715b.C20716a aVar = mVar.f76250k;
            if (aVar != null) {
                aVar.mo61953b(mVar.f76221a);
            }
        }
    }

    /* renamed from: com.google.android.material.progressindicator.m$c */
    public class C31495c extends Property<C31492m, Float> {
        public C31495c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C31492m mVar) {
            return Float.valueOf(mVar.mo90627n());
        }

        /* renamed from: b */
        public void set(C31492m mVar, Float f) {
            mVar.mo90631r(f.floatValue());
        }
    }

    public C31492m(@C0359n0 Context context, @C0359n0 C31496n nVar) {
        super(2);
        this.f76246g = nVar;
        this.f76245f = new Interpolator[]{C20723d.m96191b(context, C31076a.C31078b.linear_indeterminate_line1_head_interpolator), C20723d.m96191b(context, C31076a.C31078b.linear_indeterminate_line1_tail_interpolator), C20723d.m96191b(context, C31076a.C31078b.linear_indeterminate_line2_head_interpolator), C20723d.m96191b(context, C31076a.C31078b.linear_indeterminate_line2_tail_interpolator)};
    }

    /* renamed from: a */
    public void mo90536a() {
        ObjectAnimator objectAnimator = this.f76243d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo90537c() {
        mo90630q();
    }

    /* renamed from: d */
    public void mo90538d(@C0359n0 C20715b.C20716a aVar) {
        this.f76250k = aVar;
    }

    /* renamed from: f */
    public void mo90539f() {
        ObjectAnimator objectAnimator = this.f76244e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            mo90536a();
            if (this.f76221a.isVisible()) {
                this.f76244e.setFloatValues(new float[]{this.f76249j, 1.0f});
                this.f76244e.setDuration((long) ((1.0f - this.f76249j) * 1800.0f));
                this.f76244e.start();
            }
        }
    }

    /* renamed from: g */
    public void mo90540g() {
        mo90628o();
        mo90630q();
        this.f76243d.start();
    }

    /* renamed from: h */
    public void mo90541h() {
        this.f76250k = null;
    }

    /* renamed from: n */
    public final float mo90627n() {
        return this.f76249j;
    }

    /* renamed from: o */
    public final void mo90628o() {
        if (this.f76243d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f76242o, new float[]{0.0f, 1.0f});
            this.f76243d = ofFloat;
            ofFloat.setDuration(1800);
            this.f76243d.setInterpolator((TimeInterpolator) null);
            this.f76243d.setRepeatCount(-1);
            this.f76243d.addListener(new C31493a());
        }
        if (this.f76244e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f76242o, new float[]{1.0f});
            this.f76244e = ofFloat2;
            ofFloat2.setDuration(1800);
            this.f76244e.setInterpolator((TimeInterpolator) null);
            this.f76244e.addListener(new C31494b());
        }
    }

    /* renamed from: p */
    public final void mo90629p() {
        if (this.f76248i) {
            Arrays.fill(this.f76223c, C31266s.m125950a(this.f76246g.f76157c[this.f76247h], this.f76221a.getAlpha()));
            this.f76248i = false;
        }
    }

    @C0344h1
    /* renamed from: q */
    public void mo90630q() {
        this.f76247h = 0;
        int a = C31266s.m125950a(this.f76246g.f76157c[0], this.f76221a.getAlpha());
        int[] iArr = this.f76223c;
        iArr[0] = a;
        iArr[1] = a;
    }

    @C0344h1
    /* renamed from: r */
    public void mo90631r(float f) {
        this.f76249j = f;
        mo90632s((int) (f * 1800.0f));
        mo90629p();
        this.f76221a.invalidateSelf();
    }

    /* renamed from: s */
    public final void mo90632s(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f76222b[i2] = Math.max(0.0f, Math.min(1.0f, this.f76245f[i2].getInterpolation(mo90607b(i, f76241n[i2], f76240m[i2]))));
        }
    }
}
