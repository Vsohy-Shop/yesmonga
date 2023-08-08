package com.google.mlkit.common.sdkinternal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.mlkit.common.sdkinternal.a */
public class C33927a {

    /* renamed from: a */
    public final ReferenceQueue<Object> f82333a = new ReferenceQueue<>();

    /* renamed from: b */
    public final Set<C33975t> f82334b = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.google.mlkit.common.sdkinternal.a$a */
    public interface C33928a {
        @C40473a
        /* renamed from: a */
        void mo98700a();
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public static C33927a m136564a() {
        C33927a aVar = new C33927a();
        aVar.mo98699b(aVar, C33973r.f82476a);
        Thread thread = new Thread(new C33972q(aVar.f82333a, aVar.f82334b), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    public C33928a mo98699b(@RecentlyNonNull Object obj, @RecentlyNonNull Runnable runnable) {
        C33975t tVar = new C33975t(obj, this.f82333a, this.f82334b, runnable, (C33974s) null);
        this.f82334b.add(tVar);
        return tVar;
    }
}
