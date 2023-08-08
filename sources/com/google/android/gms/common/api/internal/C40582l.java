package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.C0359n0;
import androidx.fragment.app.C19232h;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.l */
public class C40582l {

    /* renamed from: a */
    public final Object f103477a;

    public C40582l(@C0359n0 Activity activity) {
        C40843u.m166203m(activity, "Activity must not be null");
        this.f103477a = activity;
    }

    @C0359n0
    /* renamed from: a */
    public final Activity mo133976a() {
        return (Activity) this.f103477a;
    }

    @C0359n0
    /* renamed from: b */
    public final C19232h mo133977b() {
        return (C19232h) this.f103477a;
    }

    /* renamed from: c */
    public final boolean mo133978c() {
        return this.f103477a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean mo133979d() {
        return this.f103477a instanceof C19232h;
    }

    @C40473a
    public C40582l(@C0359n0 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
