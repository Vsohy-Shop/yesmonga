package com.carrefour.fid.android.account.data.datasource;

import android.content.Context;
import com.google.gson.C33614e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.account.data.datasource.b */
public final class C13174b implements C10324h<LocalLoginDataSource> {

    /* renamed from: a */
    public final Provider<Context> f32349a;

    /* renamed from: b */
    public final Provider<C33614e> f32350b;

    public C13174b(Provider<Context> provider, Provider<C33614e> provider2) {
        this.f32349a = provider;
        this.f32350b = provider2;
    }

    /* renamed from: a */
    public static C13174b m57123a(Provider<Context> provider, Provider<C33614e> provider2) {
        return new C13174b(provider, provider2);
    }

    /* renamed from: c */
    public static LocalLoginDataSource m57124c(Context context, C33614e eVar) {
        return new LocalLoginDataSource(context, eVar);
    }

    /* renamed from: b */
    public LocalLoginDataSource get() {
        return m57124c(this.f32349a.get(), this.f32350b.get());
    }
}
