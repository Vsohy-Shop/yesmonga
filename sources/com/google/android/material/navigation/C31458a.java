package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0573j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.navigation.a */
public final class C31458a extends C0568g {
    @C0359n0

    /* renamed from: Q */
    public final Class<?> f76103Q;

    /* renamed from: R */
    public final int f76104R;

    public C31458a(@C0359n0 Context context, @C0359n0 Class<?> cls, int i) {
        super(context);
        this.f76103Q = cls;
        this.f76104R = i;
    }

    @C0359n0
    /* renamed from: a */
    public MenuItem mo2039a(int i, int i2, int i3, @C0359n0 CharSequence charSequence) {
        if (size() + 1 <= this.f76104R) {
            mo2080m0();
            MenuItem a = super.mo2039a(i, i2, i3, charSequence);
            if (a instanceof C0573j) {
                ((C0573j) a).mo2167w(true);
            }
            mo2078l0();
            return a;
        }
        String simpleName = this.f76103Q.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f76104R + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @C0359n0
    public SubMenu addSubMenu(int i, int i2, int i3, @C0359n0 CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f76103Q.getSimpleName() + " does not support submenus");
    }

    /* renamed from: n0 */
    public int mo90437n0() {
        return this.f76104R;
    }
}
