package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: androidx.cardview.widget.f */
public class C1862f extends Drawable {

    /* renamed from: a */
    public float f5058a;

    /* renamed from: b */
    public final Paint f5059b;

    /* renamed from: c */
    public final RectF f5060c;

    /* renamed from: d */
    public final Rect f5061d;

    /* renamed from: e */
    public float f5062e;

    /* renamed from: f */
    public boolean f5063f = false;

    /* renamed from: g */
    public boolean f5064g = true;

    /* renamed from: h */
    public ColorStateList f5065h;

    /* renamed from: i */
    public PorterDuffColorFilter f5066i;

    /* renamed from: j */
    public ColorStateList f5067j;

    /* renamed from: k */
    public PorterDuff.Mode f5068k = PorterDuff.Mode.SRC_IN;

    public C1862f(ColorStateList colorStateList, float f) {
        this.f5058a = f;
        this.f5059b = new Paint(5);
        mo6093e(colorStateList);
        this.f5060c = new RectF();
        this.f5061d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter mo6088a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public ColorStateList mo6089b() {
        return this.f5065h;
    }

    /* renamed from: c */
    public float mo6090c() {
        return this.f5062e;
    }

    /* renamed from: d */
    public float mo6091d() {
        return this.f5058a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f5059b;
        if (this.f5066i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f5066i);
            z = true;
        }
        RectF rectF = this.f5060c;
        float f = this.f5058a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: e */
    public final void mo6093e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5065h = colorStateList;
        this.f5059b.setColor(colorStateList.getColorForState(getState(), this.f5065h.getDefaultColor()));
    }

    /* renamed from: f */
    public void mo6094f(@C0363p0 ColorStateList colorStateList) {
        mo6093e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo6095g(float f, boolean z, boolean z2) {
        if (f != this.f5062e || this.f5063f != z || this.f5064g != z2) {
            this.f5062e = f;
            this.f5063f = z;
            this.f5064g = z2;
            mo6099i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f5061d, this.f5058a);
    }

    /* renamed from: h */
    public void mo6098h(float f) {
        if (f != this.f5058a) {
            this.f5058a = f;
            mo6099i((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: i */
    public final void mo6099i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f5060c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f5061d.set(rect);
        if (this.f5063f) {
            float d = C1863g.m7404d(this.f5062e, this.f5058a, this.f5064g);
            this.f5061d.inset((int) Math.ceil((double) C1863g.m7403c(this.f5062e, this.f5058a, this.f5064g)), (int) Math.ceil((double) d));
            this.f5060c.set(this.f5061d);
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f5067j;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && (((colorStateList = this.f5065h) == null || !colorStateList.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo6099i(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f5065h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f5059b.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f5059b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f5067j;
        if (colorStateList2 == null || (mode = this.f5068k) == null) {
            return z;
        }
        this.f5066i = mo6088a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f5059b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5059b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f5067j = colorStateList;
        this.f5066i = mo6088a(colorStateList, this.f5068k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f5068k = mode;
        this.f5066i = mo6088a(this.f5067j, mode);
        invalidateSelf();
    }
}
