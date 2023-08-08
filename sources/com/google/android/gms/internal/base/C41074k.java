package com.google.android.gms.internal.base;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0363p0;
import com.google.errorprone.annotations.C32488a;

/* renamed from: com.google.android.gms.internal.base.k */
public final class C41074k extends Drawable implements Drawable.Callback {

    /* renamed from: X */
    public boolean f104357X;

    /* renamed from: Y */
    public boolean f104358Y;

    /* renamed from: Z */
    public int f104359Z;

    /* renamed from: a */
    public int f104360a;

    /* renamed from: b */
    public long f104361b;

    /* renamed from: c */
    public int f104362c;

    /* renamed from: d */
    public int f104363d;

    /* renamed from: e */
    public int f104364e;

    /* renamed from: f */
    public int f104365f;

    /* renamed from: g */
    public boolean f104366g;

    /* renamed from: v */
    public boolean f104367v;

    /* renamed from: w */
    public C41073j f104368w;

    /* renamed from: x */
    public Drawable f104369x;

    /* renamed from: y */
    public Drawable f104370y;

    /* renamed from: z */
    public boolean f104371z;

    public C41074k(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2) {
        this((C41073j) null);
        drawable = drawable == null ? C41072i.f104353a : drawable;
        this.f104369x = drawable;
        drawable.setCallback(this);
        C41073j jVar = this.f104368w;
        jVar.f104356b = drawable.getChangingConfigurations() | jVar.f104356b;
        drawable2 = drawable2 == null ? C41072i.f104353a : drawable2;
        this.f104370y = drawable2;
        drawable2.setCallback(this);
        C41073j jVar2 = this.f104368w;
        jVar2.f104356b = drawable2.getChangingConfigurations() | jVar2.f104356b;
    }

    /* renamed from: a */
    public final Drawable mo134882a() {
        return this.f104370y;
    }

    /* renamed from: b */
    public final void mo134883b(int i) {
        this.f104362c = this.f104363d;
        this.f104365f = 0;
        this.f104364e = 250;
        this.f104360a = 1;
        invalidateSelf();
    }

    /* renamed from: c */
    public final boolean mo134884c() {
        if (!this.f104371z) {
            boolean z = false;
            if (!(this.f104369x.getConstantState() == null || this.f104370y.getConstantState() == null)) {
                z = true;
            }
            this.f104357X = z;
            this.f104371z = true;
        }
        return this.f104357X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r0 == 0) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            int r0 = r6.f104360a
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x0038
            if (r0 == r1) goto L_0x000a
            goto L_0x0041
        L_0x000a:
            long r0 = r6.f104361b
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0041
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.f104361b
            long r0 = r0 - r4
            float r0 = (float) r0
            int r1 = r6.f104364e
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r3 = r2
        L_0x0026:
            if (r3 == 0) goto L_0x002a
            r6.f104360a = r2
        L_0x002a:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r6.f104362c
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r6.f104365f = r0
            goto L_0x0041
        L_0x0038:
            long r3 = android.os.SystemClock.uptimeMillis()
            r6.f104361b = r3
            r6.f104360a = r1
            r3 = r2
        L_0x0041:
            int r0 = r6.f104365f
            boolean r1 = r6.f104366g
            android.graphics.drawable.Drawable r4 = r6.f104369x
            android.graphics.drawable.Drawable r5 = r6.f104370y
            if (r3 == 0) goto L_0x0060
            if (r1 == 0) goto L_0x0050
            if (r0 != 0) goto L_0x0055
            goto L_0x0051
        L_0x0050:
            r2 = r0
        L_0x0051:
            r4.draw(r7)
            r0 = r2
        L_0x0055:
            int r1 = r6.f104363d
            if (r0 != r1) goto L_0x005f
            r5.setAlpha(r1)
            r5.draw(r7)
        L_0x005f:
            return
        L_0x0060:
            if (r1 == 0) goto L_0x0068
            int r2 = r6.f104363d
            int r2 = r2 - r0
            r4.setAlpha(r2)
        L_0x0068:
            r4.draw(r7)
            if (r1 == 0) goto L_0x0072
            int r1 = r6.f104363d
            r4.setAlpha(r1)
        L_0x0072:
            if (r0 <= 0) goto L_0x007f
            r5.setAlpha(r0)
            r5.draw(r7)
            int r7 = r6.f104363d
            r5.setAlpha(r7)
        L_0x007f:
            r6.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.C41074k.draw(android.graphics.Canvas):void");
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C41073j jVar = this.f104368w;
        return changingConfigurations | jVar.f104355a | jVar.f104356b;
    }

    @C0363p0
    public final Drawable.ConstantState getConstantState() {
        if (!mo134884c()) {
            return null;
        }
        this.f104368w.f104355a = getChangingConfigurations();
        return this.f104368w;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.f104369x.getIntrinsicHeight(), this.f104370y.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.f104369x.getIntrinsicWidth(), this.f104370y.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.f104358Y) {
            this.f104359Z = Drawable.resolveOpacity(this.f104369x.getOpacity(), this.f104370y.getOpacity());
            this.f104358Y = true;
        }
        return this.f104359Z;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @C32488a
    public final Drawable mutate() {
        if (!this.f104367v && super.mutate() == this) {
            if (mo134884c()) {
                this.f104369x.mutate();
                this.f104370y.mutate();
                this.f104367v = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.f104369x.setBounds(rect);
        this.f104370y.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.f104365f == this.f104363d) {
            this.f104365f = i;
        }
        this.f104363d = i;
        invalidateSelf();
    }

    public final void setColorFilter(@C0363p0 ColorFilter colorFilter) {
        this.f104369x.setColorFilter(colorFilter);
        this.f104370y.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public C41074k(@C0363p0 C41073j jVar) {
        this.f104360a = 0;
        this.f104363d = 255;
        this.f104365f = 0;
        this.f104366g = true;
        this.f104368w = new C41073j(jVar);
    }
}
