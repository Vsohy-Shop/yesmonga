package com.carrefour.fid.android.account.data.datasource;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.account.data.datasource.a */
public final class C13173a implements C10324h<LocalAccountDataSource> {

    /* renamed from: a */
    public final Provider<Context> f32348a;

    public C13173a(Provider<Context> provider) {
        this.f32348a = provider;
    }

    /* renamed from: a */
    public static C13173a m57120a(Provider<Context> provider) {
        return new C13173a(provider);
    }

    /* renamed from: c */
    public static LocalAccountDataSource m57121c(Context context) {
        return new LocalAccountDataSource(context);
    }

    /* renamed from: b */
    public LocalAccountDataSource get() {
        return m57121c(this.f32348a.get());
    }
}
