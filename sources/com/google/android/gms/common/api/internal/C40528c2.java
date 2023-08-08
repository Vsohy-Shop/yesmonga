package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.common.api.internal.c2 */
public final class C40528c2 extends BroadcastReceiver {
    @C0363p0

    /* renamed from: a */
    public Context f103331a;

    /* renamed from: b */
    public final C40522b2 f103332b;

    public C40528c2(C40522b2 b2Var) {
        this.f103332b = b2Var;
    }

    /* renamed from: a */
    public final void mo133847a(Context context) {
        this.f103331a = context;
    }

    /* renamed from: b */
    public final synchronized void mo133848b() {
        Context context = this.f103331a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f103331a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f103332b.mo133839a();
            mo133848b();
        }
    }
}
