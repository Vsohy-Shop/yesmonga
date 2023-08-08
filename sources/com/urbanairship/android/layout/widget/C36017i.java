package com.urbanairship.android.layout.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.graphics.drawable.C17549d;

/* renamed from: com.urbanairship.android.layout.widget.i */
public class C36017i extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public final C36018a f89000a;

    /* renamed from: b */
    public Drawable f89001b;

    /* renamed from: com.urbanairship.android.layout.widget.i$a */
    public static abstract class C36018a extends Drawable.ConstantState {

        /* renamed from: a */
        public int f89002a;

        /* renamed from: b */
        public Drawable.ConstantState f89003b;

        public C36018a(@C0363p0 C36018a aVar, @C0363p0 Resources resources) {
            if (aVar != null) {
                this.f89002a = aVar.f89002a;
                this.f89003b = aVar.f89003b;
            }
        }

        public int getChangingConfigurations() {
            int i;
            int i2 = this.f89002a;
            Drawable.ConstantState constantState = this.f89003b;
            if (constantState != null) {
                i = constantState.getChangingConfigurations();
            } else {
                i = 0;
            }
            return i2 | i;
        }

        @C0359n0
        public Drawable newDrawable() {
            return newDrawable((Resources) null);
        }

        @C0359n0
        public abstract Drawable newDrawable(@C0363p0 Resources resources);
    }

    public C36017i(@C0363p0 C36018a aVar, @C0363p0 Resources resources) {
        Drawable.ConstantState constantState;
        this.f89000a = aVar;
        if (aVar != null && (constantState = aVar.f89003b) != null) {
            mo107712b(constantState.newDrawable(resources));
        }
    }

    /* renamed from: a */
    public Drawable mo107711a() {
        return this.f89001b;
    }

    /* renamed from: b */
    public void mo107712b(@C0363p0 Drawable drawable) {
        Drawable drawable2 = this.f89001b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f89001b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setVisible(isVisible(), true);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            C36018a aVar = this.f89000a;
            if (aVar != null) {
                aVar.f89003b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public void draw(@C0359n0 Canvas canvas) {
        this.f89001b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f89001b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f89001b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f89001b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f89001b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f89001b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f89001b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f89001b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f89001b.getPadding(rect);
    }

    public int[] getState() {
        return this.f89001b.getState();
    }

    public Region getTransparentRegion() {
        return this.f89001b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C17549d.m80446h(this.f89001b);
    }

    public boolean isStateful() {
        return this.f89001b.isStateful();
    }

    public void jumpToCurrentState() {
        this.f89001b.jumpToCurrentState();
    }

    public void onBoundsChange(@C0359n0 Rect rect) {
        this.f89001b.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.f89001b.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f89001b.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C17549d.m80448j(this.f89001b, z);
    }

    public void setChangingConfigurations(int i) {
        this.f89001b.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f89001b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        Drawable drawable = this.f89001b;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f89001b.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C17549d.m80449k(this.f89001b, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C17549d.m80450l(this.f89001b, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f89001b.setState(iArr);
    }

    public void setTint(int i) {
        C17549d.m80452n(this.f89001b, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C17549d.m80453o(this.f89001b, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C17549d.m80454p(this.f89001b, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f89001b.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public C36017i(@C0363p0 Drawable drawable) {
        this.f89000a = null;
        mo107712b(drawable);
    }
}
