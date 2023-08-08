package com.google.firebase.perf.injection.modules;

import androidx.annotation.C0359n0;
import com.google.android.datatransport.C40087h;
import com.google.firebase.C33033f;
import com.google.firebase.inject.C33058b;
import com.google.firebase.installations.C33088k;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.C33584t;
import dagger.C10159h;
import dagger.C10315i;

@C10159h
/* renamed from: com.google.firebase.perf.injection.modules.a */
public class C33338a {

    /* renamed from: a */
    public final C33033f f81024a;

    /* renamed from: b */
    public final C33088k f81025b;

    /* renamed from: c */
    public final C33058b<C33584t> f81026c;

    /* renamed from: d */
    public final C33058b<C40087h> f81027d;

    public C33338a(@C0359n0 C33033f fVar, @C0359n0 C33088k kVar, @C0359n0 C33058b<C33584t> bVar, @C0359n0 C33058b<C40087h> bVar2) {
        this.f81024a = fVar;
        this.f81025b = kVar;
        this.f81026c = bVar;
        this.f81027d = bVar2;
    }

    @C10315i
    /* renamed from: a */
    public C33307a mo96415a() {
        return C33307a.m134328h();
    }

    @C10315i
    /* renamed from: b */
    public C33033f mo96416b() {
        return this.f81024a;
    }

    @C10315i
    /* renamed from: c */
    public C33088k mo96417c() {
        return this.f81025b;
    }

    @C10315i
    /* renamed from: d */
    public C33058b<C33584t> mo96418d() {
        return this.f81026c;
    }

    @C10315i
    /* renamed from: e */
    public RemoteConfigManager mo96419e() {
        return RemoteConfigManager.getInstance();
    }

    @C10315i
    /* renamed from: f */
    public SessionManager mo96420f() {
        return SessionManager.getInstance();
    }

    @C10315i
    /* renamed from: g */
    public C33058b<C40087h> mo96421g() {
        return this.f81027d;
    }
}
