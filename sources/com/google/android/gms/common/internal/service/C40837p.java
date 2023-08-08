package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40504h;
import com.google.android.gms.common.api.internal.C40513a0;
import com.google.android.gms.common.internal.C40734b0;
import com.google.android.gms.common.internal.C40738c0;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.C41069f;
import com.google.android.gms.tasks.C31047k;

/* renamed from: com.google.android.gms.common.internal.service.p */
public final class C40837p extends C40504h implements C40734b0 {

    /* renamed from: k */
    public static final C40477a.C40490g f103941k;

    /* renamed from: l */
    public static final C40477a.C40478a f103942l;

    /* renamed from: m */
    public static final C40477a f103943m;

    /* renamed from: n */
    public static final /* synthetic */ int f103944n = 0;

    static {
        C40477a.C40490g gVar = new C40477a.C40490g();
        f103941k = gVar;
        C40836o oVar = new C40836o();
        f103942l = oVar;
        f103943m = new C40477a("ClientTelemetry.API", oVar, gVar);
    }

    public C40837p(Context context, C40738c0 c0Var) {
        super(context, f103943m, c0Var, C40504h.C40505a.f103245c);
    }

    /* renamed from: a */
    public final C31047k<Void> mo134307a(TelemetryData telemetryData) {
        C40513a0.C40514a a = C40513a0.m164879a();
        a.mo133818e(C41069f.f104351a);
        a.mo133817d(false);
        a.mo133816c(new C40835n(telemetryData));
        return mo133719m(a.mo133814a());
    }
}
