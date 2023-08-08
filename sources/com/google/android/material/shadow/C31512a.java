package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.content.C17318d;
import com.google.android.material.C31076a;

@Deprecated
/* renamed from: com.google.android.material.shadow.a */
public class C31512a extends DrawableWrapper {

    /* renamed from: q */
    public static final double f76309q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    public static final float f76310r = 1.5f;

    /* renamed from: s */
    public static final float f76311s = 0.25f;

    /* renamed from: t */
    public static final float f76312t = 0.5f;

    /* renamed from: u */
    public static final float f76313u = 1.0f;
    @C0359n0

    /* renamed from: a */
    public final Paint f76314a;
    @C0359n0

    /* renamed from: b */
    public final Paint f76315b;
    @C0359n0

    /* renamed from: c */
    public final RectF f76316c;

    /* renamed from: d */
    public float f76317d;

    /* renamed from: e */
    public Path f76318e;

    /* renamed from: f */
    public float f76319f;

    /* renamed from: g */
    public float f76320g;

    /* renamed from: h */
    public float f76321h;

    /* renamed from: i */
    public float f76322i;

    /* renamed from: j */
    public boolean f76323j = true;

    /* renamed from: k */
    public final int f76324k;

    /* renamed from: l */
    public final int f76325l;

    /* renamed from: m */
    public final int f76326m;

    /* renamed from: n */
    public boolean f76327n = true;

    /* renamed from: o */
    public float f76328o;

    /* renamed from: p */
    public boolean f76329p = false;

    public C31512a(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f76324k = C17318d.m79723f(context, C31076a.C31081e.design_fab_shadow_start_color);
        this.f76325l = C17318d.m79723f(context, C31076a.C31081e.design_fab_shadow_mid_color);
        this.f76326m = C17318d.m79723f(context, C31076a.C31081e.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.f76314a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f76317d = (float) Math.round(f);
        this.f76316c = new RectF();
        Paint paint2 = new Paint(paint);
        this.f76315b = paint2;
        paint2.setAntiAlias(false);
        mo90688u(f2, f3);
    }

    /* renamed from: c */
    public static float m127407c(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f76309q) * ((double) f2))) : f;
    }

    /* renamed from: d */
    public static float m127408d(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f76309q) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: v */
    public static int m127409v(float f) {
        int round = Math.round(f);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    /* renamed from: a */
    public final void mo90670a(@C0359n0 Rect rect) {
        float f = this.f76320g;
        float f2 = 1.5f * f;
        this.f76316c.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        Drawable wrappedDrawable = getWrappedDrawable();
        RectF rectF = this.f76316c;
        wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        mo90671b();
    }

    /* renamed from: b */
    public final void mo90671b() {
        float f = this.f76317d;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f76321h;
        rectF2.inset(-f2, -f2);
        Path path = this.f76318e;
        if (path == null) {
            this.f76318e = new Path();
        } else {
            path.reset();
        }
        this.f76318e.setFillType(Path.FillType.EVEN_ODD);
        this.f76318e.moveTo(-this.f76317d, 0.0f);
        this.f76318e.rLineTo(-this.f76321h, 0.0f);
        this.f76318e.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f76318e.arcTo(rectF, 270.0f, -90.0f, false);
        this.f76318e.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.f76317d / f3;
            Paint paint = this.f76314a;
            RadialGradient radialGradient = r8;
            float[] fArr = {0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f};
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f76324k, this.f76325l, this.f76326m}, fArr, Shader.TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        Paint paint2 = this.f76315b;
        float f5 = rectF.top;
        float f6 = rectF2.top;
        paint2.setShader(new LinearGradient(0.0f, f5, 0.0f, f6, new int[]{this.f76324k, this.f76325l, this.f76326m}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f76315b.setAntiAlias(false);
    }

    /* renamed from: e */
    public void mo90672e(@C0359n0 Canvas canvas) {
        if (this.f76323j) {
            mo90670a(getBounds());
            this.f76323j = false;
        }
        mo90673f(canvas);
        C31512a.super.draw(canvas);
    }

    /* renamed from: f */
    public final void mo90673f(@C0359n0 Canvas canvas) {
        boolean z;
        boolean z2;
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f76328o, this.f76316c.centerX(), this.f76316c.centerY());
        float f5 = this.f76317d;
        float f6 = (-f5) - this.f76321h;
        float f7 = f5 * 2.0f;
        if (this.f76316c.width() - f7 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f76316c.height() - f7 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f8 = this.f76322i;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (0.25f * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        RectF rectF = this.f76316c;
        canvas2.translate(rectF.left + f5, rectF.top + f5);
        canvas2.scale(f9, f10);
        canvas2.drawPath(this.f76318e, this.f76314a);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.f76316c.width() - f7, -this.f76317d, this.f76315b);
        } else {
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        RectF rectF2 = this.f76316c;
        canvas2.translate(rectF2.right - f5, rectF2.bottom - f5);
        float f12 = f;
        canvas2.scale(f9, f12);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f76318e, this.f76314a);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.f76316c.width() - f7, (-this.f76317d) + this.f76321h, this.f76315b);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f76316c;
        canvas2.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas2.scale(f9, f4);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f76318e, this.f76314a);
        if (z2) {
            canvas2.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.f76316c.height() - f7, -this.f76317d, this.f76315b);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f76316c;
        canvas2.translate(rectF4.right - f5, rectF4.top + f5);
        float f13 = f3;
        canvas2.scale(f9, f13);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f76318e, this.f76314a);
        if (z2) {
            canvas2.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.f76316c.height() - f7, -this.f76317d, this.f76315b);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
    }

    /* renamed from: g */
    public float mo90674g() {
        return this.f76317d;
    }

    /* renamed from: h */
    public float mo90675h() {
        return this.f76320g;
    }

    /* renamed from: i */
    public float mo90676i() {
        float f = this.f76320g;
        return (Math.max(f, this.f76317d + ((f * 1.5f) / 2.0f)) * 2.0f) + (this.f76320g * 1.5f * 2.0f);
    }

    /* renamed from: j */
    public float mo90677j() {
        float f = this.f76320g;
        return (Math.max(f, this.f76317d + (f / 2.0f)) * 2.0f) + (this.f76320g * 2.0f);
    }

    /* renamed from: k */
    public int mo90678k() {
        return -3;
    }

    /* renamed from: l */
    public boolean mo90679l(@C0359n0 Rect rect) {
        int ceil = (int) Math.ceil((double) m127408d(this.f76320g, this.f76317d, this.f76327n));
        int ceil2 = (int) Math.ceil((double) m127407c(this.f76320g, this.f76317d, this.f76327n));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: m */
    public float mo90680m() {
        return this.f76322i;
    }

    /* renamed from: n */
    public void mo90681n(Rect rect) {
        this.f76323j = true;
    }

    /* renamed from: o */
    public void mo90682o(boolean z) {
        this.f76327n = z;
        invalidateSelf();
    }

    /* renamed from: p */
    public void mo90683p(int i) {
        C31512a.super.setAlpha(i);
        this.f76314a.setAlpha(i);
        this.f76315b.setAlpha(i);
    }

    /* renamed from: q */
    public void mo90684q(float f) {
        float round = (float) Math.round(f);
        if (this.f76317d != round) {
            this.f76317d = round;
            this.f76323j = true;
            invalidateSelf();
        }
    }

    /* renamed from: r */
    public void mo90685r(float f) {
        mo90688u(this.f76322i, f);
    }

    /* renamed from: s */
    public final void mo90686s(float f) {
        if (this.f76328o != f) {
            this.f76328o = f;
            invalidateSelf();
        }
    }

    /* renamed from: t */
    public void mo90687t(float f) {
        mo90688u(f, this.f76320g);
    }

    /* renamed from: u */
    public void mo90688u(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float v = (float) m127409v(f);
        float v2 = (float) m127409v(f2);
        if (v > v2) {
            if (!this.f76329p) {
                this.f76329p = true;
            }
            v = v2;
        }
        if (this.f76322i != v || this.f76320g != v2) {
            this.f76322i = v;
            this.f76320g = v2;
            this.f76321h = (float) Math.round(v * 1.5f);
            this.f76319f = v2;
            this.f76323j = true;
            invalidateSelf();
        }
    }
}
