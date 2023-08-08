package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import com.google.android.datatransport.runtime.dagger.internal.C40153o;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.h */
public final class C40265h implements C40141g<String> {

    /* renamed from: a */
    public final Provider<Context> f102604a;

    public C40265h(Provider<Context> provider) {
        this.f102604a = provider;
    }

    /* renamed from: a */
    public static C40265h m163677a(Provider<Context> provider) {
        return new C40265h(provider);
    }

    /* renamed from: c */
    public static String m163678c(Context context) {
        return (String) C40153o.m163384c(C40260f.m163667d(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return m163678c(this.f102604a.get());
    }
}
