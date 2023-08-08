package com.google.android.gms.common.moduleinstall.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40504h;
import com.google.android.gms.common.api.C40661k;
import com.google.android.gms.common.api.internal.C40513a0;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.common.api.internal.C40599o;
import com.google.android.gms.common.api.internal.C40629u;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.moduleinstall.C40876a;
import com.google.android.gms.common.moduleinstall.C40878c;
import com.google.android.gms.common.moduleinstall.C40879d;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.internal.base.C41085v;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.a0 */
public final class C40887a0 extends C40504h implements C40878c {

    /* renamed from: k */
    public static final C40477a.C40490g f104050k;

    /* renamed from: l */
    public static final C40477a.C40478a f104051l;

    /* renamed from: m */
    public static final C40477a f104052m;

    /* renamed from: n */
    public static final /* synthetic */ int f104053n = 0;

    static {
        C40477a.C40490g gVar = new C40477a.C40490g();
        f104050k = gVar;
        C40906s sVar = new C40906s();
        f104051l = sVar;
        f104052m = new C40477a("ModuleInstall.API", sVar, gVar);
    }

    public C40887a0(Activity activity) {
        super(activity, f104052m, C40477a.C40481d.f103198G, C40504h.C40505a.f103245c);
    }

    /* renamed from: G */
    public static final ApiFeatureRequest m166312G(boolean z, C40661k... kVarArr) {
        boolean z2;
        C40843u.m166203m(kVarArr, "Requested APIs must not be null.");
        if (r0 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166192b(z2, "Please provide at least one OptionalModuleApi.");
        for (C40661k m : kVarArr) {
            C40843u.m166203m(m, "Requested API must not be null.");
        }
        return ApiFeatureRequest.m166306W(Arrays.asList(kVarArr), z);
    }

    /* renamed from: b */
    public final C31047k<Boolean> mo134566b(C40876a aVar) {
        return mo133725s(C40599o.m165306c(aVar, C40876a.class.getSimpleName()), 27306);
    }

    /* renamed from: c */
    public final C31047k<ModuleInstallIntentResponse> mo134567c(C40661k... kVarArr) {
        ApiFeatureRequest G = m166312G(true, kVarArr);
        if (G.mo134586Q().isEmpty()) {
            return C31053n.m124525g(new ModuleInstallIntentResponse((PendingIntent) null));
        }
        C40513a0.C40514a a = C40513a0.m164879a();
        a.mo133818e(C41085v.f104375a);
        a.mo133819f(27307);
        a.mo133816c(new C40902o(this, G));
        return mo133721o(a.mo133814a());
    }

    /* renamed from: d */
    public final C31047k<Void> mo134568d(C40661k... kVarArr) {
        ApiFeatureRequest G = m166312G(false, kVarArr);
        if (G.mo134586Q().isEmpty()) {
            return C31053n.m124525g(null);
        }
        C40513a0.C40514a a = C40513a0.m164879a();
        a.mo133818e(C41085v.f104375a);
        a.mo133819f(27303);
        a.mo133817d(false);
        a.mo133816c(new C40901n(this, G));
        return mo133721o(a.mo133814a());
    }

    /* renamed from: e */
    public final C31047k<Void> mo134569e(C40661k... kVarArr) {
        ApiFeatureRequest G = m166312G(false, kVarArr);
        if (G.mo134586Q().isEmpty()) {
            return C31053n.m124525g(null);
        }
        C40513a0.C40514a a = C40513a0.m164879a();
        a.mo133818e(C41085v.f104375a);
        a.mo133819f(27302);
        a.mo133817d(false);
        a.mo133816c(new C40903p(this, G));
        return mo133721o(a.mo133814a());
    }

    /* renamed from: f */
    public final C31047k<ModuleInstallResponse> mo134570f(C40879d dVar) {
        C40592n nVar;
        ApiFeatureRequest M = ApiFeatureRequest.m166305M(dVar);
        C40876a b = dVar.mo134573b();
        Executor c = dVar.mo134574c();
        boolean e = dVar.mo134575e();
        if (M.mo134586Q().isEmpty()) {
            return C31053n.m124525g(new ModuleInstallResponse(0));
        }
        if (b == null) {
            C40513a0.C40514a a = C40513a0.m164879a();
            a.mo133818e(C41085v.f104375a);
            a.mo133817d(e);
            a.mo133819f(27304);
            a.mo133816c(new C40904q(this, M));
            return mo133721o(a.mo133814a());
        }
        C40843u.m166202l(b);
        Class<C40876a> cls = C40876a.class;
        if (c == null) {
            nVar = mo133708A(b, cls.getSimpleName());
        } else {
            nVar = C40599o.m165305b(b, c, cls.getSimpleName());
        }
        C40592n nVar2 = nVar;
        C40890c cVar = new C40890c(nVar2);
        AtomicReference atomicReference = new AtomicReference();
        C40898k kVar = new C40898k(this, atomicReference, b, M, cVar);
        C40899l lVar = new C40899l(this, cVar);
        C40629u.C40630a a2 = C40629u.m165390a();
        a2.mo134040h(nVar2);
        a2.mo134037e(C41085v.f104375a);
        a2.mo134036d(e);
        a2.mo134035c(kVar);
        a2.mo134039g(lVar);
        a2.mo134038f(27305);
        return mo133723q(a2.mo134033a()).mo87739w(new C40900m(atomicReference));
    }

    /* renamed from: g */
    public final C31047k<ModuleAvailabilityResponse> mo134571g(C40661k... kVarArr) {
        ApiFeatureRequest G = m166312G(false, kVarArr);
        if (G.mo134586Q().isEmpty()) {
            return C31053n.m124525g(new ModuleAvailabilityResponse(true, 0));
        }
        C40513a0.C40514a a = C40513a0.m164879a();
        a.mo133818e(C41085v.f104375a);
        a.mo133819f(27301);
        a.mo133817d(false);
        a.mo133816c(new C40905r(this, G));
        return mo133721o(a.mo133814a());
    }

    public C40887a0(Context context) {
        super(context, f104052m, C40477a.C40481d.f103198G, C40504h.C40505a.f103245c);
    }
}
