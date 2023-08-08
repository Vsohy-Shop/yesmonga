package com.contentsquare.android.sdk;

import android.content.Context;
import android.os.Build;

/* renamed from: com.contentsquare.android.sdk.cb */
public class C14252cb {

    /* renamed from: a */
    public final C14709se f35202a;

    /* renamed from: b */
    public final C14213b7 f35203b;

    /* renamed from: c */
    public int f35204c = Build.VERSION.SDK_INT;

    public C14252cb(Context context) {
        this.f35202a = C14549na.m62703a(context).mo35984e();
        this.f35203b = C14549na.m62703a(context).mo35986g();
    }

    /* renamed from: a */
    public C14893yb mo34855a() {
        return (!mo34856b() || this.f35204c < 26) ? new C14425ia() : new C14619pc(new C14438j2(), this.f35202a);
    }

    /* renamed from: b */
    public boolean mo34856b() {
        return this.f35203b.mo34676h(C14477k8.CLIENT_MODE_STATIC_SNAPSHOT_MODE, false);
    }
}
