package com.carrefour.fid.android.data.repositories.datasource.memos;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.datasource.memos.a */
public final class C36595a implements C10324h<MemoDataStoreSource> {

    /* renamed from: a */
    public final Provider<Context> f90471a;

    public C36595a(Provider<Context> provider) {
        this.f90471a = provider;
    }

    /* renamed from: a */
    public static C36595a m150164a(Provider<Context> provider) {
        return new C36595a(provider);
    }

    /* renamed from: c */
    public static MemoDataStoreSource m150165c(Context context) {
        return new MemoDataStoreSource(context);
    }

    /* renamed from: b */
    public MemoDataStoreSource get() {
        return m150165c(this.f90471a.get());
    }
}
