package com.carrefour.fid.android.catalogs.p064di;

import com.carrefour.fid.android.catalogs.data.api.services.C39401a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import retrofit2.C13092x;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.CatalogApiGateway"})
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.di.b */
public final class C39432b implements C10324h<C39401a> {

    /* renamed from: a */
    public final C39431a f100910a;

    /* renamed from: b */
    public final Provider<C13092x> f100911b;

    public C39432b(C39431a aVar, Provider<C13092x> provider) {
        this.f100910a = aVar;
        this.f100911b = provider;
    }

    /* renamed from: a */
    public static C39432b m161614a(C39431a aVar, Provider<C13092x> provider) {
        return new C39432b(aVar, provider);
    }

    /* renamed from: c */
    public static C39401a m161615c(C39431a aVar, C13092x xVar) {
        return (C39401a) C10335o.m38554f(aVar.mo130487a(xVar));
    }

    /* renamed from: b */
    public C39401a get() {
        return m161615c(this.f100910a, this.f100911b.get());
    }
}
