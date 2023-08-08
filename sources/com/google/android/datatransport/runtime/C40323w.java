package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.C40087h;
import com.google.android.datatransport.C40088i;
import com.google.android.datatransport.runtime.scheduling.C40213e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40240r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40244v;
import com.google.android.datatransport.runtime.time.C40309a;
import com.google.android.datatransport.runtime.time.C40310b;
import com.google.android.datatransport.runtime.time.C40318h;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.google.android.datatransport.runtime.w */
public class C40323w implements C40322v {

    /* renamed from: e */
    public static volatile C40324x f102687e;

    /* renamed from: a */
    public final C40309a f102688a;

    /* renamed from: b */
    public final C40309a f102689b;

    /* renamed from: c */
    public final C40213e f102690c;

    /* renamed from: d */
    public final C40240r f102691d;

    @Inject
    public C40323w(@C40318h C40309a aVar, @C40310b C40309a aVar2, C40213e eVar, C40240r rVar, C40244v vVar) {
        this.f102688a = aVar;
        this.f102689b = aVar2;
        this.f102690c = eVar;
        this.f102691d = rVar;
        vVar.mo132900c();
    }

    /* renamed from: c */
    public static C40323w m163829c() {
        C40324x xVar = f102687e;
        if (xVar != null) {
            return xVar.mo132785b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    public static Set<C40041c> m163830d(C40187g gVar) {
        if (gVar instanceof C40188h) {
            return Collections.unmodifiableSet(((C40188h) gVar).mo132554a());
        }
        return Collections.singleton(C40041c.m163048b("proto"));
    }

    /* renamed from: f */
    public static void m163831f(Context context) {
        if (f102687e == null) {
            synchronized (C40323w.class) {
                if (f102687e == null) {
                    f102687e = C40173f.m163399c().mo132787a(context).mo132789g();
                }
            }
        }
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: i */
    public static void m163832i(C40324x xVar, Callable<Void> callable) throws Throwable {
        C40324x xVar2;
        synchronized (C40323w.class) {
            xVar2 = f102687e;
            f102687e = xVar;
        }
        try {
            callable.call();
            synchronized (C40323w.class) {
                f102687e = xVar2;
            }
        } catch (Throwable th) {
            synchronized (C40323w.class) {
                f102687e = xVar2;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo132982a(C40201q qVar, C40088i iVar) {
        this.f102690c.mo132855a(qVar.mo132727f().mo132851f(qVar.mo132724c().mo132545c()), mo132983b(qVar), iVar);
    }

    /* renamed from: b */
    public final C40190j mo132983b(C40201q qVar) {
        return C40190j.m163460a().mo132691i(this.f102688a.getTime()).mo132693k(this.f102689b.getTime()).mo132692j(qVar.mo132728g()).mo132690h(new C40189i(qVar.mo132723b(), qVar.mo132848d())).mo132689g(qVar.mo132724c().mo132543a()).mo132686d();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public C40240r mo132984e() {
        return this.f102691d;
    }

    /* renamed from: g */
    public C40087h mo132985g(C40187g gVar) {
        return new C40208s(m163830d(gVar), C40203r.m163518a().mo132743b(gVar.getName()).mo132744c(gVar.getExtras()).mo132742a(), this);
    }

    @Deprecated
    /* renamed from: h */
    public C40087h mo132986h(String str) {
        return new C40208s(m163830d((C40187g) null), C40203r.m163518a().mo132743b(str).mo132742a(), this);
    }
}
