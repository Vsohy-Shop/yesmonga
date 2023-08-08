package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.annotations.C32558a;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.analytics.C32656a;
import com.google.firebase.crashlytics.internal.analytics.C32658c;
import com.google.firebase.crashlytics.internal.analytics.C32659d;
import com.google.firebase.crashlytics.internal.analytics.C32660e;
import com.google.firebase.crashlytics.internal.analytics.C32661f;
import com.google.firebase.crashlytics.internal.breadcrumbs.C32663a;
import com.google.firebase.crashlytics.internal.breadcrumbs.C32664b;
import com.google.firebase.crashlytics.internal.breadcrumbs.C32665c;
import com.google.firebase.inject.C33056a;
import com.google.firebase.inject.C33058b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.crashlytics.d */
public class C32646d {

    /* renamed from: a */
    public final C33056a<C32537a> f79196a;

    /* renamed from: b */
    public volatile C32656a f79197b;

    /* renamed from: c */
    public volatile C32664b f79198c;
    @C0323b0("this")

    /* renamed from: d */
    public final List<C32663a> f79199d;

    public C32646d(C33056a<C32537a> aVar) {
        this(aVar, new C32665c(), new C32661f());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m131851g(String str, Bundle bundle) {
        this.f79197b.mo94808a(str, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m131852h(C32663a aVar) {
        synchronized (this) {
            if (this.f79198c instanceof C32665c) {
                this.f79199d.add(aVar);
            }
            this.f79198c.mo94807a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m131853i(C33058b bVar) {
        C32741f.m132248f().mo95052b("AnalyticsConnector now available.");
        C32537a aVar = (C32537a) bVar.get();
        C32660e eVar = new C32660e(aVar);
        C32648f fVar = new C32648f();
        if (m131854j(aVar, fVar) != null) {
            C32741f.m132248f().mo95052b("Registered Firebase Analytics listener.");
            C32659d dVar = new C32659d();
            C32658c cVar = new C32658c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (C32663a a : this.f79199d) {
                    dVar.mo94807a(a);
                }
                fVar.mo94813d(dVar);
                fVar.mo94814e(cVar);
                this.f79198c = dVar;
                this.f79197b = cVar;
            }
            return;
        }
        C32741f.m132248f().mo95062m("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    @C32558a
    /* renamed from: j */
    public static C32537a.C32538a m131854j(@C0359n0 C32537a aVar, @C0359n0 C32648f fVar) {
        C32537a.C32538a g = aVar.mo94652g("clx", fVar);
        if (g == null) {
            C32741f.m132248f().mo95052b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            g = aVar.mo94652g("crash", fVar);
            if (g != null) {
                C32741f.m132248f().mo95062m("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return g;
    }

    /* renamed from: d */
    public C32656a mo94809d() {
        return new C32644b(this);
    }

    /* renamed from: e */
    public C32664b mo94810e() {
        return new C32643a(this);
    }

    /* renamed from: f */
    public final void mo94811f() {
        this.f79196a.mo94677a(new C32645c(this));
    }

    public C32646d(C33056a<C32537a> aVar, @C0359n0 C32664b bVar, @C0359n0 C32656a aVar2) {
        this.f79196a = aVar;
        this.f79198c = bVar;
        this.f79199d = new ArrayList();
        this.f79197b = aVar2;
        mo94811f();
    }
}
