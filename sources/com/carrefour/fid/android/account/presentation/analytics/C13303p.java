package com.carrefour.fid.android.account.presentation.analytics;

import android.content.Context;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.account.presentation.analytics.p */
public final class C13303p implements C10324h<SignInAnalyticsInterfaceDelegate> {

    /* renamed from: a */
    public final Provider<Context> f32694a;

    /* renamed from: b */
    public final Provider<C28994a> f32695b;

    /* renamed from: c */
    public final Provider<C13814a> f32696c;

    /* renamed from: d */
    public final Provider<C13783a> f32697d;

    /* renamed from: e */
    public final Provider<LoginRepository> f32698e;

    /* renamed from: f */
    public final Provider<AccountRepository> f32699f;

    public C13303p(Provider<Context> provider, Provider<C28994a> provider2, Provider<C13814a> provider3, Provider<C13783a> provider4, Provider<LoginRepository> provider5, Provider<AccountRepository> provider6) {
        this.f32694a = provider;
        this.f32695b = provider2;
        this.f32696c = provider3;
        this.f32697d = provider4;
        this.f32698e = provider5;
        this.f32699f = provider6;
    }

    /* renamed from: a */
    public static C13303p m57602a(Provider<Context> provider, Provider<C28994a> provider2, Provider<C13814a> provider3, Provider<C13783a> provider4, Provider<LoginRepository> provider5, Provider<AccountRepository> provider6) {
        return new C13303p(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static SignInAnalyticsInterfaceDelegate m57603c(Context context, C28994a aVar, C13814a aVar2, C13783a aVar3, LoginRepository loginRepository, AccountRepository accountRepository) {
        return new SignInAnalyticsInterfaceDelegate(context, aVar, aVar2, aVar3, loginRepository, accountRepository);
    }

    /* renamed from: b */
    public SignInAnalyticsInterfaceDelegate get() {
        return m57603c(this.f32694a.get(), this.f32695b.get(), this.f32696c.get(), this.f32697d.get(), this.f32698e.get(), this.f32699f.get());
    }
}
