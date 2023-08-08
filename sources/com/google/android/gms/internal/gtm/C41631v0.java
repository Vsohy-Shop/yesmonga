package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.v0 */
public final class C41631v0 {

    /* renamed from: a */
    public final Context f105089a;

    /* renamed from: b */
    public final Context f105090b;

    public C41631v0(Context context) {
        C40843u.m166202l(context);
        Context applicationContext = context.getApplicationContext();
        C40843u.m166203m(applicationContext, "Application context can't be null");
        this.f105089a = applicationContext;
        this.f105090b = applicationContext;
    }

    /* renamed from: a */
    public final Context mo135952a() {
        return this.f105089a;
    }

    /* renamed from: b */
    public final Context mo135953b() {
        return this.f105090b;
    }
}
