package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.sdkinternal.C33927a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* renamed from: com.google.mlkit.common.sdkinternal.t */
public final class C33975t extends PhantomReference<Object> implements C33927a.C33928a {

    /* renamed from: a */
    public final Set<C33975t> f82477a;

    /* renamed from: b */
    public final Runnable f82478b;

    public /* synthetic */ C33975t(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, C33974s sVar) {
        super(obj, referenceQueue);
        this.f82477a = set;
        this.f82478b = runnable;
    }

    /* renamed from: a */
    public final void mo98700a() {
        if (this.f82477a.remove(this)) {
            clear();
            this.f82478b.run();
        }
    }
}
