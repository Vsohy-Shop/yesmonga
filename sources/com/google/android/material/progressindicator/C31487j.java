package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.vectordrawable.graphics.drawable.C20715b;
import com.google.android.material.progressindicator.C31471b;

/* renamed from: com.google.android.material.progressindicator.j */
public final class C31487j<S extends C31471b> extends C31481g {

    /* renamed from: G0 */
    public C31485h<S> f76224G0;

    /* renamed from: H0 */
    public C31486i<ObjectAnimator> f76225H0;

    public C31487j(@C0359n0 Context context, @C0359n0 C31471b bVar, @C0359n0 C31485h<S> hVar, @C0359n0 C31486i<ObjectAnimator> iVar) {
        super(context, bVar);
        mo90611C(hVar);
        mo90610B(iVar);
    }

    @C0359n0
    /* renamed from: x */
    public static C31487j<C31478e> m127291x(@C0359n0 Context context, @C0359n0 C31478e eVar) {
        return new C31487j<>(context, eVar, new C31472c(eVar), new C31473d(eVar));
    }

    @C0359n0
    /* renamed from: y */
    public static C31487j<C31496n> m127292y(@C0359n0 Context context, @C0359n0 C31496n nVar) {
        C31486i iVar;
        C31488k kVar = new C31488k(nVar);
        if (nVar.f76253g == 0) {
            iVar = new C31489l(nVar);
        } else {
            iVar = new C31492m(context, nVar);
        }
        return new C31487j<>(context, nVar, kVar, iVar);
    }

    @C0359n0
    /* renamed from: A */
    public C31485h<S> mo90609A() {
        return this.f76224G0;
    }

    /* renamed from: B */
    public void mo90610B(@C0359n0 C31486i<ObjectAnimator> iVar) {
        this.f76225H0 = iVar;
        iVar.mo90608e(this);
    }

    /* renamed from: C */
    public void mo90611C(@C0359n0 C31485h<S> hVar) {
        this.f76224G0 = hVar;
        hVar.mo90605f(this);
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
            this.f76224G0.mo90606g(canvas, mo90590j());
            this.f76224G0.mo90531c(canvas, this.f76203X);
            int i = 0;
            while (true) {
                C31486i<ObjectAnimator> iVar = this.f76225H0;
                int[] iArr = iVar.f76223c;
                if (i < iArr.length) {
                    C31485h<S> hVar = this.f76224G0;
                    Paint paint = this.f76203X;
                    float[] fArr = iVar.f76222b;
                    int i2 = i * 2;
                    hVar.mo90530b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f76224G0.mo90532d();
    }

    public int getIntrinsicWidth() {
        return this.f76224G0.mo90533e();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
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
        if (!isRunning()) {
            this.f76225H0.mo90536a();
        }
        this.f76207c.mo90523a(this.f76205a.getContentResolver());
        if (z && z3) {
            this.f76225H0.mo90540g();
        }
        return w;
    }

    @C0359n0
    /* renamed from: z */
    public C31486i<ObjectAnimator> mo90615z() {
        return this.f76225H0;
    }
}
