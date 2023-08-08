package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.internal.base.j */
public final class C41073j extends Drawable.ConstantState {

    /* renamed from: a */
    public int f104355a;

    /* renamed from: b */
    public int f104356b;

    public C41073j(@C0363p0 C41073j jVar) {
        if (jVar != null) {
            this.f104355a = jVar.f104355a;
            this.f104356b = jVar.f104356b;
        }
    }

    public final int getChangingConfigurations() {
        return this.f104355a;
    }

    public final Drawable newDrawable() {
        return new C41074k(this);
    }
}
