package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import com.google.android.datatransport.runtime.dagger.internal.C40153o;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.datatransport.runtime.l */
public final class C40193l implements C40141g<Executor> {

    /* renamed from: com.google.android.datatransport.runtime.l$a */
    public static final class C40194a {

        /* renamed from: a */
        public static final C40193l f102450a = new C40193l();
    }

    /* renamed from: a */
    public static C40193l m163486a() {
        return C40194a.f102450a;
    }

    /* renamed from: b */
    public static Executor m163487b() {
        return (Executor) C40153o.m163384c(C40192k.m163485a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return m163487b();
    }
}
