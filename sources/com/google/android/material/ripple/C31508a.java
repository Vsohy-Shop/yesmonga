package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.C17567r;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31553s;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.ripple.a */
public class C31508a extends Drawable implements C31553s, C17567r {

    /* renamed from: a */
    public C31510b f76293a;

    @C0359n0
    /* renamed from: a */
    public C31508a mutate() {
        this.f76293a = new C31510b(this.f76293a);
        return this;
    }

    public void draw(Canvas canvas) {
        C31510b bVar = this.f76293a;
        if (bVar.f76295b) {
            bVar.f76294a.draw(canvas);
        }
    }

    @C0363p0
    public Drawable.ConstantState getConstantState() {
        return this.f76293a;
    }

    public int getOpacity() {
        return this.f76293a.f76294a.getOpacity();
    }

    @C0359n0
    public C31534o getShapeAppearanceModel() {
        return this.f76293a.f76294a.getShapeAppearanceModel();
    }

    public boolean isStateful() {
        return true;
    }

    public void onBoundsChange(@C0359n0 Rect rect) {
        super.onBoundsChange(rect);
        this.f76293a.f76294a.setBounds(rect);
    }

    public boolean onStateChange(@C0359n0 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f76293a.f76294a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = C31511b.m127406e(iArr);
        C31510b bVar = this.f76293a;
        if (bVar.f76295b == e) {
            return onStateChange;
        }
        bVar.f76295b = e;
        return true;
    }

    public void setAlpha(int i) {
        this.f76293a.f76294a.setAlpha(i);
    }

    public void setColorFilter(@C0363p0 ColorFilter colorFilter) {
        this.f76293a.f76294a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(@C0359n0 C31534o oVar) {
        this.f76293a.f76294a.setShapeAppearanceModel(oVar);
    }

    public void setTint(@C0354l int i) {
        this.f76293a.f76294a.setTint(i);
    }

    public void setTintList(@C0363p0 ColorStateList colorStateList) {
        this.f76293a.f76294a.setTintList(colorStateList);
    }

    public void setTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f76293a.f76294a.setTintMode(mode);
    }

    public C31508a(C31534o oVar) {
        this(new C31510b(new C31525j(oVar)));
    }

    /* renamed from: com.google.android.material.ripple.a$b */
    public static final class C31510b extends Drawable.ConstantState {
        @C0359n0

        /* renamed from: a */
        public C31525j f76294a;

        /* renamed from: b */
        public boolean f76295b;

        public C31510b(C31525j jVar) {
            this.f76294a = jVar;
            this.f76295b = false;
        }

        @C0359n0
        /* renamed from: a */
        public C31508a newDrawable() {
            return new C31508a(new C31510b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public C31510b(@C0359n0 C31510b bVar) {
            this.f76294a = (C31525j) bVar.f76294a.getConstantState().newDrawable();
            this.f76295b = bVar.f76295b;
        }
    }

    public C31508a(C31510b bVar) {
        this.f76293a = bVar;
    }
}
