package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import com.carrefour.fid.android.data.provider.headers.C36571m;
import com.carrefour.fid.android.data.service.C36632k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.r */
public final class C36611r implements C10324h<OrderOfflineDownloadRepository> {

    /* renamed from: a */
    public final Provider<C36632k> f90511a;

    /* renamed from: b */
    public final Provider<C36571m> f90512b;

    /* renamed from: c */
    public final Provider<Context> f90513c;

    public C36611r(Provider<C36632k> provider, Provider<C36571m> provider2, Provider<Context> provider3) {
        this.f90511a = provider;
        this.f90512b = provider2;
        this.f90513c = provider3;
    }

    /* renamed from: a */
    public static C36611r m150211a(Provider<C36632k> provider, Provider<C36571m> provider2, Provider<Context> provider3) {
        return new C36611r(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static OrderOfflineDownloadRepository m150212c(C36632k kVar, C36571m mVar, Context context) {
        return new OrderOfflineDownloadRepository(kVar, mVar, context);
    }

    /* renamed from: b */
    public OrderOfflineDownloadRepository get() {
        return m150212c(this.f90511a.get(), this.f90512b.get(), this.f90513c.get());
    }
}
