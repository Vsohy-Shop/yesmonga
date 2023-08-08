package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.analytics.C40379e;
import com.google.android.gms.analytics.C40397i;
import com.google.android.gms.common.internal.C40858y;

@C40858y
/* renamed from: com.google.android.gms.internal.gtm.v8 */
public final class C41639v8 {

    /* renamed from: a */
    public C40379e f105155a;

    /* renamed from: b */
    public final Context f105156b;

    /* renamed from: c */
    public C40397i f105157c;

    public C41639v8(Context context) {
        this.f105156b = context;
    }

    /* renamed from: a */
    public final C40397i mo135974a(String str) {
        mo135975b("_GTM_DEFAULT_TRACKER_");
        return this.f105157c;
    }

    /* renamed from: b */
    public final synchronized void mo135975b(String str) {
        if (this.f105155a == null) {
            C40379e k = C40379e.m164228k(this.f105156b);
            this.f105155a = k;
            k.mo133289u(new C41615u8());
            this.f105157c = this.f105155a.mo133283o("_GTM_DEFAULT_TRACKER_");
        }
    }
}
