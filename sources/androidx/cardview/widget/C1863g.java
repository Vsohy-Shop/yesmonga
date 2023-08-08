package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0363p0;
import androidx.cardview.C1848a;

/* renamed from: androidx.cardview.widget.g */
public class C1863g extends Drawable {

    /* renamed from: q */
    public static final double f5069q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    public static final float f5070r = 1.5f;

    /* renamed from: s */
    public static C1864a f5071s;

    /* renamed from: a */
    public final int f5072a;

    /* renamed from: b */
    public Paint f5073b;

    /* renamed from: c */
    public Paint f5074c;

    /* renamed from: d */
    public Paint f5075d;

    /* renamed from: e */
    public final RectF f5076e;

    /* renamed from: f */
    public float f5077f;

    /* renamed from: g */
    public Path f5078g;

    /* renamed from: h */
    public float f5079h;

    /* renamed from: i */
    public float f5080i;

    /* renamed from: j */
    public float f5081j;

    /* renamed from: k */
    public ColorStateList f5082k;

    /* renamed from: l */
    public boolean f5083l = true;

    /* renamed from: m */
    public final int f5084m;

    /* renamed from: n */
    public final int f5085n;

    /* renamed from: o */
    public boolean f5086o = true;

    /* renamed from: p */
    public boolean f5087p = false;

    /* renamed from: androidx.cardview.widget.g$a */
    public interface C1864a {
        /* renamed from: a */
        void mo6070a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public C1863g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f5084m = resources.getColor(C1848a.C1850b.cardview_shadow_start_color);
        this.f5085n = resources.getColor(C1848a.C1850b.cardview_shadow_end_color);
        this.f5072a = resources.getDimensionPixelSize(C1848a.C1851c.cardview_compat_inset_shadow);
        this.f5073b = new Paint(5);
        mo6122n(colorStateList);
        Paint paint = new Paint(5);
        this.f5074c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f5077f = (float) ((int) (f + 0.5f));
        this.f5076e = new RectF();
        Paint paint2 = new Paint(this.f5074c);
        this.f5075d = paint2;
        paint2.setAntiAlias(false);
        mo6129s(f2, f3);
    }

    /* renamed from: c */
    public static float m7403c(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f5069q) * ((double) f2))) : f;
    }

    /* renamed from: d */
    public static float m7404d(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f5069q) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: a */
    public final void mo6107a(Rect rect) {
        float f = this.f5079h;
        float f2 = 1.5f * f;
        this.f5076e.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        mo6108b();
    }

    /* renamed from: b */
    public final void mo6108b() {
        float f = this.f5077f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f5080i;
        rectF2.inset(-f2, -f2);
        Path path = this.f5078g;
        if (path == null) {
            this.f5078g = new Path();
        } else {
            path.reset();
        }
        this.f5078g.setFillType(Path.FillType.EVEN_ODD);
        this.f5078g.moveTo(-this.f5077f, 0.0f);
        this.f5078g.rLineTo(-this.f5080i, 0.0f);
        this.f5078g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f5078g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f5078g.close();
        float f3 = this.f5077f;
        float f4 = f3 / (this.f5080i + f3);
        Paint paint = this.f5074c;
        float f5 = this.f5077f + this.f5080i;
        int i = this.f5084m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f5085n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f5075d;
        float f6 = this.f5077f;
        float f7 = this.f5080i;
        int i2 = this.f5084m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f5085n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f5075d.setAntiAlias(false);
    }

    public void draw(Canvas canvas) {
        if (this.f5083l) {
            mo6107a(getBounds());
            this.f5083l = false;
        }
        canvas.translate(0.0f, this.f5081j / 2.0f);
        mo6110e(canvas);
        canvas.translate(0.0f, (-this.f5081j) / 2.0f);
        f5071s.mo6070a(canvas, this.f5076e, this.f5077f, this.f5073b);
    }

    /* renamed from: e */
    public final void mo6110e(Canvas canvas) {
        boolean z;
        boolean z2;
        float f = this.f5077f;
        float f2 = (-f) - this.f5080i;
        float f3 = f + ((float) this.f5072a) + (this.f5081j / 2.0f);
        float f4 = f3 * 2.0f;
        if (this.f5076e.width() - f4 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f5076e.height() - f4 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        int save = canvas.save();
        RectF rectF = this.f5076e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f5078g, this.f5074c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f5076e.width() - f4, -this.f5077f, this.f5075d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f5076e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f5078g, this.f5074c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f5076e.width() - f4, (-this.f5077f) + this.f5080i, this.f5075d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f5076e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f5078g, this.f5074c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f5076e.height() - f4, -this.f5077f, this.f5075d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f5076e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f5078g, this.f5074c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f5076e.height() - f4, -this.f5077f, this.f5075d);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: f */
    public ColorStateList mo6111f() {
        return this.f5082k;
    }

    /* renamed from: g */
    public float mo6112g() {
        return this.f5077f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m7404d(this.f5079h, this.f5077f, this.f5086o));
        int ceil2 = (int) Math.ceil((double) m7403c(this.f5079h, this.f5077f, this.f5086o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: h */
    public void mo6115h(Rect rect) {
        getPadding(rect);
    }

    /* renamed from: i */
    public float mo6116i() {
        return this.f5079h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f5082k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* renamed from: j */
    public float mo6118j() {
        float f = this.f5079h;
        return (Math.max(f, this.f5077f + ((float) this.f5072a) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f5079h * 1.5f) + ((float) this.f5072a)) * 2.0f);
    }

    /* renamed from: k */
    public float mo6119k() {
        float f = this.f5079h;
        return (Math.max(f, this.f5077f + ((float) this.f5072a) + (f / 2.0f)) * 2.0f) + ((this.f5079h + ((float) this.f5072a)) * 2.0f);
    }

    /* renamed from: l */
    public float mo6120l() {
        return this.f5081j;
    }

    /* renamed from: m */
    public void mo6121m(boolean z) {
        this.f5086o = z;
        invalidateSelf();
    }

    /* renamed from: n */
    public final void mo6122n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5082k = colorStateList;
        this.f5073b.setColor(colorStateList.getColorForState(getState(), this.f5082k.getDefaultColor()));
    }

    /* renamed from: o */
    public void mo6123o(@C0363p0 ColorStateList colorStateList) {
        mo6122n(colorStateList);
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5083l = true;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f5082k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f5073b.getColor() == colorForState) {
            return false;
        }
        this.f5073b.setColor(colorForState);
        this.f5083l = true;
        invalidateSelf();
        return true;
    }

    /* renamed from: p */
    public void mo6126p(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f5077f != f2) {
                this.f5077f = f2;
                this.f5083l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* renamed from: q */
    public void mo6127q(float f) {
        mo6129s(this.f5081j, f);
    }

    /* renamed from: r */
    public void mo6128r(float f) {
        mo6129s(f, this.f5079h);
    }

    /* renamed from: s */
    public final void mo6129s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float t = (float) mo6132t(f);
            float t2 = (float) mo6132t(f2);
            if (t > t2) {
                if (!this.f5087p) {
                    this.f5087p = true;
                }
                t = t2;
            }
            if (this.f5081j != t || this.f5079h != t2) {
                this.f5081j = t;
                this.f5079h = t2;
                this.f5080i = (float) ((int) ((t * 1.5f) + ((float) this.f5072a) + 0.5f));
                this.f5083l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    public void setAlpha(int i) {
        this.f5073b.setAlpha(i);
        this.f5074c.setAlpha(i);
        this.f5075d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5073b.setColorFilter(colorFilter);
    }

    /* renamed from: t */
    public final int mo6132t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }
}
