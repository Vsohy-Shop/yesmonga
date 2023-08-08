package com.google.android.datatransport.runtime;

import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.C40083d;
import com.google.android.datatransport.C40085f;
import com.google.android.datatransport.C40086g;
import com.google.android.datatransport.C40088i;

/* renamed from: com.google.android.datatransport.runtime.u */
public final class C40320u<T> implements C40086g<T> {

    /* renamed from: a */
    public final C40203r f102680a;

    /* renamed from: b */
    public final String f102681b;

    /* renamed from: c */
    public final C40041c f102682c;

    /* renamed from: d */
    public final C40085f<T, byte[]> f102683d;

    /* renamed from: e */
    public final C40322v f102684e;

    public C40320u(C40203r rVar, String str, C40041c cVar, C40085f<T, byte[]> fVar, C40322v vVar) {
        this.f102680a = rVar;
        this.f102681b = str;
        this.f102682c = cVar;
        this.f102683d = fVar;
        this.f102684e = vVar;
    }

    /* renamed from: e */
    public static /* synthetic */ void m163822e(Exception exc) {
    }

    /* renamed from: a */
    public void mo132666a(C40083d<T> dVar, C40088i iVar) {
        this.f102684e.mo132982a(C40201q.m163504a().mo132735f(this.f102680a).mo132733c(dVar).mo132736g(this.f102681b).mo132734e(this.f102683d).mo132732b(this.f102682c).mo132731a(), iVar);
    }

    /* renamed from: b */
    public void mo132667b(C40083d<T> dVar) {
        mo132666a(dVar, new C40308t());
    }

    /* renamed from: d */
    public C40203r mo132981d() {
        return this.f102680a;
    }
}
