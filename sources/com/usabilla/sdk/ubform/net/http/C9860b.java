package com.usabilla.sdk.ubform.net.http;

import com.android.volley.C21755g;
import com.android.volley.C21764n;
import com.google.android.gms.common.internal.C40852x;
import com.usabilla.sdk.ubform.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.net.http.b */
public class C9860b implements C9870g {
    @C12579k

    /* renamed from: a */
    public final C21764n f27006a;
    @C12579k

    /* renamed from: b */
    public final C9866f f27007b;

    /* renamed from: c */
    public final float f27008c;

    /* renamed from: d */
    public final int f27009d;

    /* renamed from: e */
    public final int f27010e = 1;

    /* renamed from: f */
    public final int f27011f = 10000;

    /* renamed from: g */
    public final int f27012g = 20000;
    @C12579k

    /* renamed from: h */
    public final C21755g f27013h = new C21755g(10000, this.f27009d, this.f27008c);
    @C12579k

    /* renamed from: i */
    public final C21755g f27014i = new C21755g(20000, 1, this.f27008c);

    public C9860b(@C12579k C21764n nVar, @C12579k C9866f fVar) {
        Intrinsics.checkNotNullParameter(nVar, "requestQueue");
        Intrinsics.checkNotNullParameter(fVar, "requestAdapter");
        this.f27006a = nVar;
        this.f27007b = fVar;
    }

    /* renamed from: a */
    public void mo20300a(@C12579k C9872i iVar, @C12579k C9871h hVar) {
        Intrinsics.checkNotNullParameter(iVar, "request");
        Intrinsics.checkNotNullParameter(hVar, C40852x.C40853a.f103958a);
        try {
            C9861c d = this.f27007b.mo20314d(iVar, hVar);
            mo20301b(d, iVar.getMethod());
            Logger.Companion companion = Logger.f26647a;
            companion.logInfo(d.mo64802i0() + ", " + d.mo64788L0() + ", " + d.mo20315W());
            this.f27006a.mo64944a(d);
        } catch (CannotConvertRequestException unused) {
            Logger.f26647a.logError("Could not convert request for usabilla internal HTTP client");
        }
    }

    /* renamed from: b */
    public final void mo20301b(C9861c cVar, String str) {
        boolean z;
        if (Intrinsics.areEqual((Object) str, (Object) UsabillaHttpRequestMethod.PATCH.name())) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) str, (Object) UsabillaHttpRequestMethod.POST.name());
        }
        if (z) {
            cVar.mo64820z1(this.f27014i);
        } else {
            cVar.mo64820z1(this.f27013h);
        }
    }
}
