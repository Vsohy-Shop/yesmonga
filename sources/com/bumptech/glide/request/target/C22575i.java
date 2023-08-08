package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.util.C22633m;

/* renamed from: com.bumptech.glide.request.target.i */
public class C22575i extends Drawable {

    /* renamed from: a */
    public final Matrix f57924a;

    /* renamed from: b */
    public final RectF f57925b;

    /* renamed from: c */
    public final RectF f57926c;

    /* renamed from: d */
    public Drawable f57927d;

    /* renamed from: e */
    public C22576a f57928e;

    /* renamed from: f */
    public boolean f57929f;

    /* renamed from: com.bumptech.glide.request.target.i$a */
    public static final class C22576a extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f57930a;

        /* renamed from: b */
        public final int f57931b;

        /* renamed from: c */
        public final int f57932c;

        public C22576a(C22576a aVar) {
            this(aVar.f57930a, aVar.f57931b, aVar.f57932c);
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @C0359n0
        public Drawable newDrawable() {
            return new C22575i(this, this.f57930a.newDrawable());
        }

        public C22576a(Drawable.ConstantState constantState, int i, int i2) {
            this.f57930a = constantState;
            this.f57931b = i;
            this.f57932c = i2;
        }

        @C0359n0
        public Drawable newDrawable(Resources resources) {
            return new C22575i(this, this.f57930a.newDrawable(resources));
        }
    }

    public C22575i(Drawable drawable, int i, int i2) {
        this(new C22576a(drawable.getConstantState(), i, i2), drawable);
    }

    /* renamed from: a */
    public final void mo66874a() {
        this.f57924a.setRectToRect(this.f57925b, this.f57926c, Matrix.ScaleToFit.CENTER);
    }

    public void clearColorFilter() {
        this.f57927d.clearColorFilter();
    }

    public void draw(@C0359n0 Canvas canvas) {
        canvas.save();
        canvas.concat(this.f57924a);
        this.f57927d.draw(canvas);
        canvas.restore();
    }

    @C0376v0(19)
    public int getAlpha() {
        return this.f57927d.getAlpha();
    }

    public Drawable.Callback getCallback() {
        return this.f57927d.getCallback();
    }

    public int getChangingConfigurations() {
        return this.f57927d.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f57928e;
    }

    @C0359n0
    public Drawable getCurrent() {
        return this.f57927d.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f57928e.f57932c;
    }

    public int getIntrinsicWidth() {
        return this.f57928e.f57931b;
    }

    public int getMinimumHeight() {
        return this.f57927d.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f57927d.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f57927d.getOpacity();
    }

    public boolean getPadding(@C0359n0 Rect rect) {
        return this.f57927d.getPadding(rect);
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        this.f57927d.invalidateSelf();
    }

    @C0359n0
    public Drawable mutate() {
        if (!this.f57929f && super.mutate() == this) {
            this.f57927d = this.f57927d.mutate();
            this.f57928e = new C22576a(this.f57928e);
            this.f57929f = true;
        }
        return this;
    }

    public void scheduleSelf(@C0359n0 Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.f57927d.scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f57927d.setAlpha(i);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f57926c.set((float) i, (float) i2, (float) i3, (float) i4);
        mo66874a();
    }

    public void setChangingConfigurations(int i) {
        this.f57927d.setChangingConfigurations(i);
    }

    public void setColorFilter(int i, @C0359n0 PorterDuff.Mode mode) {
        this.f57927d.setColorFilter(i, mode);
    }

    @Deprecated
    public void setDither(boolean z) {
        this.f57927d.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f57927d.setFilterBitmap(z);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f57927d.setVisible(z, z2);
    }

    public void unscheduleSelf(@C0359n0 Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f57927d.unscheduleSelf(runnable);
    }

    public C22575i(C22576a aVar, Drawable drawable) {
        this.f57928e = (C22576a) C22633m.m102624d(aVar);
        this.f57927d = (Drawable) C22633m.m102624d(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f57924a = new Matrix();
        this.f57925b = new RectF(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        this.f57926c = new RectF();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f57927d.setColorFilter(colorFilter);
    }

    public void setBounds(@C0359n0 Rect rect) {
        super.setBounds(rect);
        this.f57926c.set(rect);
        mo66874a();
    }
}
