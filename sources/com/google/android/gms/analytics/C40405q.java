package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@C40974d0
/* renamed from: com.google.android.gms.analytics.q */
public final class C40405q {

    /* renamed from: a */
    public final C40408t f102974a;

    /* renamed from: b */
    public final C40979g f102975b;

    /* renamed from: c */
    public boolean f102976c;

    /* renamed from: d */
    public long f102977d;

    /* renamed from: e */
    public long f102978e;

    /* renamed from: f */
    public long f102979f;

    /* renamed from: g */
    public long f102980g;

    /* renamed from: h */
    public long f102981h;

    /* renamed from: i */
    public boolean f102982i;

    /* renamed from: j */
    public final Map<Class<? extends C40407s>, C40407s> f102983j;

    /* renamed from: k */
    public final List<C40376c0> f102984k;

    public C40405q(C40405q qVar) {
        this.f102974a = qVar.f102974a;
        this.f102975b = qVar.f102975b;
        this.f102977d = qVar.f102977d;
        this.f102978e = qVar.f102978e;
        this.f102979f = qVar.f102979f;
        this.f102980g = qVar.f102980g;
        this.f102981h = qVar.f102981h;
        this.f102984k = new ArrayList(qVar.f102984k);
        this.f102983j = new HashMap(qVar.f102983j.size());
        for (Map.Entry next : qVar.f102983j.entrySet()) {
            C40407s n = m164489n((Class) next.getKey());
            ((C40407s) next.getValue()).mo133444c(n);
            this.f102983j.put((Class) next.getKey(), n);
        }
    }

    @TargetApi(19)
    /* renamed from: n */
    public static <T extends C40407s> T m164489n(Class<T> cls) {
        try {
            return (C40407s) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            } else if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            } else if (e instanceof ReflectiveOperationException) {
                throw new IllegalArgumentException("Linkage exception", e);
            } else {
                throw new RuntimeException(e);
            }
        }
    }

    @C40974d0
    /* renamed from: a */
    public final long mo133430a() {
        return this.f102977d;
    }

    @C40974d0
    /* renamed from: b */
    public final <T extends C40407s> T mo133431b(Class<T> cls) {
        T t = (C40407s) this.f102983j.get(cls);
        if (t != null) {
            return t;
        }
        T n = m164489n(cls);
        this.f102983j.put(cls, n);
        return n;
    }

    @C0363p0
    @C40974d0
    /* renamed from: c */
    public final <T extends C40407s> T mo133432c(Class<T> cls) {
        return (C40407s) this.f102983j.get(cls);
    }

    /* renamed from: d */
    public final C40408t mo133433d() {
        return this.f102974a;
    }

    @C40974d0
    /* renamed from: e */
    public final Collection<C40407s> mo133434e() {
        return this.f102983j.values();
    }

    /* renamed from: f */
    public final List<C40376c0> mo133435f() {
        return this.f102984k;
    }

    @C40974d0
    /* renamed from: g */
    public final void mo133436g(C40407s sVar) {
        C40843u.m166202l(sVar);
        Class cls = sVar.getClass();
        if (cls.getSuperclass() == C40407s.class) {
            sVar.mo133444c(mo133431b(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    @C40974d0
    /* renamed from: h */
    public final void mo133437h() {
        this.f102982i = true;
    }

    @C40974d0
    /* renamed from: i */
    public final void mo133438i() {
        this.f102979f = this.f102975b.mo134770c();
        long j = this.f102978e;
        if (j != 0) {
            this.f102977d = j;
        } else {
            this.f102977d = this.f102975b.mo134768a();
        }
        this.f102976c = true;
    }

    @C40974d0
    /* renamed from: j */
    public final void mo133439j(long j) {
        this.f102978e = j;
    }

    @C40974d0
    /* renamed from: k */
    public final void mo133440k() {
        this.f102974a.mo133445b().mo133264k(this);
    }

    @C40974d0
    /* renamed from: l */
    public final boolean mo133441l() {
        return this.f102982i;
    }

    @C40974d0
    /* renamed from: m */
    public final boolean mo133442m() {
        return this.f102976c;
    }

    @C40974d0
    public C40405q(C40408t tVar, C40979g gVar) {
        C40843u.m166202l(tVar);
        C40843u.m166202l(gVar);
        this.f102974a = tVar;
        this.f102975b = gVar;
        this.f102980g = 1800000;
        this.f102981h = 3024000000L;
        this.f102983j = new HashMap();
        this.f102984k = new ArrayList();
    }
}
