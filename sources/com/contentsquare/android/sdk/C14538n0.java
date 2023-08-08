package com.contentsquare.android.sdk;

import android.app.Application;
import java.util.Collections;

/* renamed from: com.contentsquare.android.sdk.n0 */
public class C14538n0 {

    /* renamed from: e */
    public static C14538n0 f35980e;

    /* renamed from: a */
    public final C14454k f35981a;

    /* renamed from: b */
    public final C14837wc f35982b;

    /* renamed from: c */
    public final C14861xd f35983c;

    /* renamed from: d */
    public final C14699s7 f35984d;

    public C14538n0(Application application) {
        C14454k kVar = new C14454k(application, C14600oe.m62881b(application).mo36125t());
        this.f35981a = kVar;
        C14837wc wcVar = new C14837wc(application, C14600oe.m62881b(application).mo36113g(), C14600oe.m62881b(application).mo36114h(), C14600oe.m62881b(application).mo36117l(), C14600oe.m62881b(application).mo36111e(), C14600oe.m62881b(application).mo36119n(), C14600oe.m62881b(application).mo36112f());
        this.f35982b = wcVar;
        C14861xd xdVar = r2;
        C14861xd xdVar2 = new C14861xd(application, new C14431ie(new C14772u7()), kVar, wcVar, C14600oe.m62881b(application).mo36113g(), C14600oe.m62881b(application).mo36116j().mo35542a(), new C14173a6(C14600oe.m62881b(application).mo36110d(), new C14326f6(), C14600oe.m62881b(application).mo36111e()), C14600oe.m62881b(application).mo36111e(), Collections.singletonList(C14312ef.m61521b(application).mo35091a().mo34380a()), C14760u2.m63605e(), C14600oe.m62881b(application).mo36110d(), C14600oe.m62881b(application).mo36115i());
        this.f35983c = xdVar;
        this.f35984d = new C14699s7(wcVar, new C14290e2(application, C14600oe.m62881b(application).mo36121p(), C14600oe.m62881b(application).mo36123r(), C14600oe.m62881b(application).mo36113g(), wcVar), C14600oe.m62881b(application).mo36120o());
    }

    /* renamed from: a */
    public static C14538n0 m62671a(Application application) {
        if (f35980e == null) {
            f35980e = new C14538n0(application);
        }
        return f35980e;
    }

    /* renamed from: c */
    public static C14538n0 m62672c() {
        return f35980e;
    }

    /* renamed from: b */
    public C14861xd mo35954b() {
        return this.f35983c;
    }

    /* renamed from: d */
    public C14837wc mo35955d() {
        return this.f35982b;
    }

    /* renamed from: e */
    public C14699s7 mo35956e() {
        return this.f35984d;
    }
}
