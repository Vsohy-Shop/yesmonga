package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.measurement.internal.ga */
public final class C30736ga implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f73471a;

    /* renamed from: b */
    public final /* synthetic */ String f73472b = "_err";

    /* renamed from: c */
    public final /* synthetic */ Bundle f73473c;

    /* renamed from: d */
    public final /* synthetic */ C30762ia f73474d;

    public C30736ga(C30762ia iaVar, String str, String str2, Bundle bundle) {
        this.f73474d = iaVar;
        this.f73471a = str;
        this.f73473c = bundle;
    }

    public final void run() {
        this.f73474d.f73615a.mo87377k((zzaw) C40843u.m166202l(this.f73474d.f73615a.mo87372h0().mo87549y0(this.f73471a, this.f73472b, this.f73473c, "auto", this.f73474d.f73615a.mo86900a().mo134768a(), false, true)), this.f73471a);
    }
}
