package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.dynamicanimation.animation.C18975b;
import androidx.dynamicanimation.animation.C18997d;
import androidx.dynamicanimation.animation.C19001g;
import androidx.dynamicanimation.animation.C19002h;
import androidx.vectordrawable.graphics.drawable.C20715b;
import com.google.android.material.color.C31266s;
import com.google.android.material.progressindicator.C31471b;

/* renamed from: com.google.android.material.progressindicator.f */
public final class C31479f<S extends C31471b> extends C31481g {

    /* renamed from: L0 */
    public static final int f76192L0 = 10000;

    /* renamed from: M0 */
    public static final float f76193M0 = 50.0f;

    /* renamed from: N0 */
    public static final C18997d<C31479f> f76194N0 = new C31480a("indicatorLevel");

    /* renamed from: G0 */
    public C31485h<S> f76195G0;

    /* renamed from: H0 */
    public final C19002h f76196H0;

    /* renamed from: I0 */
    public final C19001g f76197I0;

    /* renamed from: J0 */
    public float f76198J0;

    /* renamed from: K0 */
    public boolean f76199K0 = false;

    /* renamed from: com.google.android.material.progressindicator.f$a */
    public class C31480a extends C18997d<C31479f> {
        public C31480a(String str) {
            super(str);
        }

        /* renamed from: d */
        public float mo55873b(C31479f fVar) {
            return fVar.mo90561D() * 10000.0f;
        }

        /* renamed from: e */
        public void mo55874c(C31479f fVar, float f) {
            fVar.mo90564G(f / 10000.0f);
        }
    }

    public C31479f(@C0359n0 Context context, @C0359n0 C31471b bVar, @C0359n0 C31485h<S> hVar) {
        super(context, bVar);
        mo90563F(hVar);
        C19002h hVar2 = new C19002h();
        this.f76196H0 = hVar2;
        hVar2.mo55928g(1.0f);
        hVar2.mo55930i(50.0f);
        C19001g gVar = new C19001g(this, f76194N0);
        this.f76197I0 = gVar;
        gVar.mo55921D(hVar2);
        mo90593p(1.0f);
    }

    @C0359n0
    /* renamed from: A */
    public static C31479f<C31478e> m127228A(@C0359n0 Context context, @C0359n0 C31478e eVar) {
        return new C31479f<>(context, eVar, new C31472c(eVar));
    }

    @C0359n0
    /* renamed from: B */
    public static C31479f<C31496n> m127229B(@C0359n0 Context context, @C0359n0 C31496n nVar) {
        return new C31479f<>(context, nVar, new C31488k(nVar));
    }

    @C0359n0
    /* renamed from: C */
    public C31485h<S> mo90560C() {
        return this.f76195G0;
    }

    /* renamed from: D */
    public final float mo90561D() {
        return this.f76198J0;
    }

    /* renamed from: E */
    public void mo90562E(@C0359n0 C18975b.C18992q qVar) {
        this.f76197I0.mo55861l(qVar);
    }

    /* renamed from: F */
    public void mo90563F(@C0359n0 C31485h<S> hVar) {
        this.f76195G0 = hVar;
        hVar.mo90605f(this);
    }

    /* renamed from: G */
    public final void mo90564G(float f) {
        this.f76198J0 = f;
        invalidateSelf();
    }

    /* renamed from: H */
    public void mo90565H(float f) {
        setLevel((int) (f * 10000.0f));
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo61949b(@C0359n0 C20715b.C20716a aVar) {
        super.mo61949b(aVar);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo61950c() {
        super.mo61950c();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo61951d(@C0359n0 C20715b.C20716a aVar) {
        return super.mo61951d(aVar);
    }

    public void draw(@C0359n0 Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f76195G0.mo90606g(canvas, mo90590j());
            this.f76195G0.mo90531c(canvas, this.f76203X);
            Canvas canvas2 = canvas;
            this.f76195G0.mo90530b(canvas2, this.f76203X, 0.0f, mo90561D(), C31266s.m125950a(this.f76206b.f76157c[0], getAlpha()));
            canvas.restore();
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f76195G0.mo90532d();
    }

    public int getIntrinsicWidth() {
        return this.f76195G0.mo90533e();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    public void jumpToCurrentState() {
        this.f76197I0.mo55922E();
        mo90564G(((float) getLevel()) / 10000.0f);
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo90573l() {
        return super.mo90573l();
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo90574m() {
        return super.mo90574m();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ boolean mo90575n() {
        return super.mo90575n();
    }

    public boolean onLevelChange(int i) {
        if (this.f76199K0) {
            this.f76197I0.mo55922E();
            mo90564G(((float) i) / 10000.0f);
            return true;
        }
        this.f76197I0.mo55867t(mo90561D() * 10000.0f);
        this.f76197I0.mo55923z((float) i);
        return true;
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(@C0363p0 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* renamed from: v */
    public /* bridge */ /* synthetic */ boolean mo90582v(boolean z, boolean z2, boolean z3) {
        return super.mo90582v(z, z2, z3);
    }

    /* renamed from: w */
    public boolean mo90583w(boolean z, boolean z2, boolean z3) {
        boolean w = super.mo90583w(z, z2, z3);
        float a = this.f76207c.mo90523a(this.f76205a.getContentResolver());
        if (a == 0.0f) {
            this.f76199K0 = true;
        } else {
            this.f76199K0 = false;
            this.f76196H0.mo55930i(50.0f / a);
        }
        return w;
    }

    /* renamed from: z */
    public void mo90584z(@C0359n0 C18975b.C18992q qVar) {
        this.f76197I0.mo55851b(qVar);
    }
}
