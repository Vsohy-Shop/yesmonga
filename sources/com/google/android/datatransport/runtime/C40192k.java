package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.C40132h;
import com.google.android.datatransport.runtime.dagger.C40133i;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.inject.Singleton;

@C40132h
/* renamed from: com.google.android.datatransport.runtime.k */
public abstract class C40192k {
    @Singleton
    @C40133i
    /* renamed from: a */
    public static Executor m163485a() {
        return new C40199p(Executors.newSingleThreadExecutor());
    }
}
