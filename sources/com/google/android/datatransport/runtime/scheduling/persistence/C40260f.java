package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.C40123a;
import com.google.android.datatransport.runtime.dagger.C40132h;
import com.google.android.datatransport.runtime.dagger.C40133i;
import com.google.android.datatransport.runtime.synchronization.C40306a;
import javax.inject.Named;
import javax.inject.Singleton;

@C40132h
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.f */
public abstract class C40260f {
    @C40133i
    @Named("SQLITE_DB_NAME")
    /* renamed from: b */
    public static String m163666b() {
        return C40298u0.f102658c;
    }

    @Singleton
    @C40133i
    @Named("PACKAGE_NAME")
    /* renamed from: d */
    public static String m163667d(Context context) {
        return context.getPackageName();
    }

    @C40133i
    @Named("SCHEMA_VERSION")
    /* renamed from: e */
    public static int m163668e() {
        return C40298u0.f102648H0;
    }

    @C40133i
    /* renamed from: f */
    public static C40257e m163669f() {
        return C40257e.f102598f;
    }

    @C40123a
    /* renamed from: a */
    public abstract C40253c mo132936a(C40280n0 n0Var);

    @C40123a
    /* renamed from: c */
    public abstract C40255d mo132937c(C40280n0 n0Var);

    @C40123a
    /* renamed from: g */
    public abstract C40306a mo132938g(C40280n0 n0Var);
}
