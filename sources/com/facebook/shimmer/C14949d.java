package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: com.facebook.shimmer.d */
public final class C14949d extends Drawable {

    /* renamed from: a */
    public final ValueAnimator.AnimatorUpdateListener f37063a = new C14950a();

    /* renamed from: b */
    public final Paint f37064b;

    /* renamed from: c */
    public final Rect f37065c;

    /* renamed from: d */
    public final Matrix f37066d;
    @C0363p0

    /* renamed from: e */
    public ValueAnimator f37067e;
    @C0363p0

    /* renamed from: f */
    public C14943c f37068f;

    /* renamed from: com.facebook.shimmer.d$a */
    public class C14950a implements ValueAnimator.AnimatorUpdateListener {
        public C14950a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C14949d.this.invalidateSelf();
        }
    }

    public C14949d() {
        Paint paint = new Paint();
        this.f37064b = paint;
        this.f37065c = new Rect();
        this.f37066d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* renamed from: a */
    public boolean mo37034a() {
        ValueAnimator valueAnimator = this.f37067e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* renamed from: b */
    public void mo37035b() {
        C14943c cVar;
        ValueAnimator valueAnimator = this.f37067e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (cVar = this.f37068f) != null && cVar.f37050p && getCallback() != null) {
            this.f37067e.start();
        }
    }

    /* renamed from: c */
    public final float mo37036c(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: d */
    public void mo37037d(@C0363p0 C14943c cVar) {
        PorterDuff.Mode mode;
        this.f37068f = cVar;
        if (cVar != null) {
            Paint paint = this.f37064b;
            if (this.f37068f.f37051q) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        mo37041g();
        mo37043h();
        invalidateSelf();
    }

    public void draw(@C0359n0 Canvas canvas) {
        float f;
        float f2;
        float c;
        if (this.f37068f != null && this.f37064b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians((double) this.f37068f.f37048n));
            float height = ((float) this.f37065c.height()) + (((float) this.f37065c.width()) * tan);
            float width = ((float) this.f37065c.width()) + (tan * ((float) this.f37065c.height()));
            ValueAnimator valueAnimator = this.f37067e;
            float f3 = 0.0f;
            if (valueAnimator != null) {
                f = valueAnimator.getAnimatedFraction();
            } else {
                f = 0.0f;
            }
            int i = this.f37068f.f37038d;
            if (i != 1) {
                if (i == 2) {
                    c = mo37036c(width, -width, f);
                } else if (i != 3) {
                    c = mo37036c(-width, width, f);
                } else {
                    f2 = mo37036c(height, -height, f);
                }
                f3 = c;
                f2 = 0.0f;
            } else {
                f2 = mo37036c(-height, height, f);
            }
            this.f37066d.reset();
            this.f37066d.setRotate(this.f37068f.f37048n, ((float) this.f37065c.width()) / 2.0f, ((float) this.f37065c.height()) / 2.0f);
            this.f37066d.postTranslate(f3, f2);
            this.f37064b.getShader().setLocalMatrix(this.f37066d);
            canvas.drawRect(this.f37065c, this.f37064b);
        }
    }

    /* renamed from: e */
    public void mo37039e() {
        if (this.f37067e != null && !mo37034a() && getCallback() != null) {
            this.f37067e.start();
        }
    }

    /* renamed from: f */
    public void mo37040f() {
        if (this.f37067e != null && mo37034a()) {
            this.f37067e.cancel();
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r12v1, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37041g() {
        /*
            r19 = this;
            r0 = r19
            android.graphics.Rect r1 = r19.getBounds()
            int r2 = r1.width()
            int r1 = r1.height()
            if (r2 == 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            com.facebook.shimmer.c r3 = r0.f37068f
            if (r3 != 0) goto L_0x0017
            goto L_0x0078
        L_0x0017:
            int r2 = r3.mo37006e(r2)
            com.facebook.shimmer.c r3 = r0.f37068f
            int r1 = r3.mo37002a(r1)
            com.facebook.shimmer.c r3 = r0.f37068f
            int r4 = r3.f37041g
            r5 = 1
            if (r4 == r5) goto L_0x004c
            int r3 = r3.f37038d
            r4 = 0
            if (r3 == r5) goto L_0x0032
            r6 = 3
            if (r3 != r6) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            if (r5 == 0) goto L_0x0035
            r2 = r4
        L_0x0035:
            if (r5 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r1 = r4
        L_0x0039:
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r4 = 0
            r5 = 0
            float r6 = (float) r2
            float r7 = (float) r1
            com.facebook.shimmer.c r1 = r0.f37068f
            int[] r8 = r1.f37036b
            float[] r9 = r1.f37035a
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0073
        L_0x004c:
            android.graphics.RadialGradient r11 = new android.graphics.RadialGradient
            float r3 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r13 = r3 / r4
            float r3 = (float) r1
            float r14 = r3 / r4
            int r1 = java.lang.Math.max(r2, r1)
            double r1 = (double) r1
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.sqrt(r3)
            double r1 = r1 / r3
            float r15 = (float) r1
            com.facebook.shimmer.c r1 = r0.f37068f
            int[] r2 = r1.f37036b
            float[] r1 = r1.f37035a
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
            r12 = r11
            r16 = r2
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0073:
            android.graphics.Paint r1 = r0.f37064b
            r1.setShader(r11)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.C14949d.mo37041g():void");
    }

    public int getOpacity() {
        C14943c cVar = this.f37068f;
        return (cVar == null || (!cVar.f37049o && !cVar.f37051q)) ? -1 : -3;
    }

    /* renamed from: h */
    public final void mo37043h() {
        boolean z;
        if (this.f37068f != null) {
            ValueAnimator valueAnimator = this.f37067e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                this.f37067e.cancel();
                this.f37067e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            C14943c cVar = this.f37068f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (cVar.f37055u / cVar.f37054t)) + 1.0f});
            this.f37067e = ofFloat;
            ofFloat.setRepeatMode(this.f37068f.f37053s);
            this.f37067e.setRepeatCount(this.f37068f.f37052r);
            ValueAnimator valueAnimator2 = this.f37067e;
            C14943c cVar2 = this.f37068f;
            valueAnimator2.setDuration(cVar2.f37054t + cVar2.f37055u);
            this.f37067e.addUpdateListener(this.f37063a);
            if (z) {
                this.f37067e.start();
            }
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f37065c.set(0, 0, rect.width(), rect.height());
        mo37041g();
        mo37035b();
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(@C0363p0 ColorFilter colorFilter) {
    }
}
