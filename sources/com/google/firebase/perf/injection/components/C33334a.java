package com.google.firebase.perf.injection.components;

import com.google.android.datatransport.C40087h;
import com.google.firebase.C33033f;
import com.google.firebase.inject.C33058b;
import com.google.firebase.installations.C33088k;
import com.google.firebase.perf.C33314e;
import com.google.firebase.perf.C33318h;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.injection.modules.C33338a;
import com.google.firebase.perf.injection.modules.C33339b;
import com.google.firebase.perf.injection.modules.C33340c;
import com.google.firebase.perf.injection.modules.C33341d;
import com.google.firebase.perf.injection.modules.C33342e;
import com.google.firebase.perf.injection.modules.C33343f;
import com.google.firebase.perf.injection.modules.C33344g;
import com.google.firebase.perf.injection.modules.C33345h;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.C33584t;
import dagger.internal.C10323g;
import dagger.internal.C10335o;
import javax.inject.Provider;

/* renamed from: com.google.firebase.perf.injection.components.a */
public final class C33334a implements C33337b {

    /* renamed from: a */
    public Provider<C33033f> f81015a;

    /* renamed from: b */
    public Provider<C33058b<C33584t>> f81016b;

    /* renamed from: c */
    public Provider<C33088k> f81017c;

    /* renamed from: d */
    public Provider<C33058b<C40087h>> f81018d;

    /* renamed from: e */
    public Provider<RemoteConfigManager> f81019e;

    /* renamed from: f */
    public Provider<C33307a> f81020f;

    /* renamed from: g */
    public Provider<SessionManager> f81021g;

    /* renamed from: h */
    public Provider<C33314e> f81022h;

    /* renamed from: com.google.firebase.perf.injection.components.a$b */
    public static final class C33336b {

        /* renamed from: a */
        public C33338a f81023a;

        /* renamed from: a */
        public C33337b mo96413a() {
            C10335o.m38549a(this.f81023a, C33338a.class);
            return new C33334a(this.f81023a);
        }

        /* renamed from: b */
        public C33336b mo96414b(C33338a aVar) {
            this.f81023a = (C33338a) C10335o.m38550b(aVar);
            return this;
        }

        public C33336b() {
        }
    }

    /* renamed from: b */
    public static C33336b m134411b() {
        return new C33336b();
    }

    /* renamed from: a */
    public C33314e mo96411a() {
        return this.f81022h.get();
    }

    /* renamed from: c */
    public final void mo96412c(C33338a aVar) {
        this.f81015a = C33340c.m134427a(aVar);
        this.f81016b = C33342e.m134433a(aVar);
        this.f81017c = C33341d.m134430a(aVar);
        this.f81018d = C33345h.m134442a(aVar);
        this.f81019e = C33343f.m134436a(aVar);
        this.f81020f = C33339b.m134424a(aVar);
        C33344g a = C33344g.m134439a(aVar);
        this.f81021g = a;
        this.f81022h = C10323g.m38525b(C33318h.m134408a(this.f81015a, this.f81016b, this.f81017c, this.f81018d, this.f81019e, this.f81020f, a));
    }

    public C33334a(C33338a aVar) {
        mo96412c(aVar);
    }
}
