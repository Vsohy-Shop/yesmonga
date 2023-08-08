package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0363p0;
import androidx.core.graphics.drawable.C17549d;

/* renamed from: androidx.appcompat.graphics.drawable.c */
public class C0521c extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public Drawable f1368a;

    public C0521c(Drawable drawable) {
        mo1674b(drawable);
    }

    @C0363p0
    /* renamed from: a */
    public Drawable mo1673a() {
        return this.f1368a;
    }

    /* renamed from: b */
    public void mo1674b(@C0363p0 Drawable drawable) {
        Drawable drawable2 = this.f1368a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1368a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f1368a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f1368a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f1368a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1368a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1368a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1368a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1368a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1368a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1368a.getPadding(rect);
    }

    public int[] getState() {
        return this.f1368a.getState();
    }

    public Region getTransparentRegion() {
        return this.f1368a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C17549d.m80446h(this.f1368a);
    }

    public boolean isStateful() {
        return this.f1368a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f1368a.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f1368a.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.f1368a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1368a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C17549d.m80448j(this.f1368a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f1368a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1368a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1368a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1368a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C17549d.m80449k(this.f1368a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C17549d.m80450l(this.f1368a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f1368a.setState(iArr);
    }

    public void setTint(int i) {
        C17549d.m80452n(this.f1368a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C17549d.m80453o(this.f1368a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C17549d.m80454p(this.f1368a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1368a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
