package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0573j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.i */
public class C31398i extends C0568g {
    public C31398i(Context context) {
        super(context);
    }

    @C0359n0
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0573j jVar = (C0573j) mo2039a(i, i2, i3, charSequence);
        C31412k kVar = new C31412k(mo2100x(), this, jVar);
        jVar.mo2111A(kVar);
        return kVar;
    }
}
