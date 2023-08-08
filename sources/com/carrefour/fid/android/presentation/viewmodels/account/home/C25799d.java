package com.carrefour.fid.android.presentation.viewmodels.account.home;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.consent.domain.interactors.ClearConsentUserCase;
import com.carrefour.fid.android.domain.interactors.account.C37522h;
import com.carrefour.fid.android.domain.interactors.accountmenu.C37539c;
import com.carrefour.fid.android.domain.interactors.airship.C37545b;
import com.carrefour.fid.android.domain.interactors.basket.C37573h;
import com.carrefour.fid.android.domain.interactors.feedback.C37688c;
import com.carrefour.fid.android.domain.interactors.product.C37786s;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.domain.interactors.slot.C37854a;
import com.carrefour.fid.android.domain.interactors.user.C37883f;
import com.carrefour.fid.android.domain.interactors.user.C37885h;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.home.d */
public final class C25799d implements C10324h<AccountMenuViewModel> {

    /* renamed from: a */
    public final Provider<LoginRepository> f63192a;

    /* renamed from: b */
    public final Provider<AccountRepository> f63193b;

    /* renamed from: c */
    public final Provider<LoyaltyPreferencesStorage> f63194c;

    /* renamed from: d */
    public final Provider<C37854a> f63195d;

    /* renamed from: e */
    public final Provider<C37522h> f63196e;

    /* renamed from: f */
    public final Provider<C37883f> f63197f;

    /* renamed from: g */
    public final Provider<C37811a> f63198g;

    /* renamed from: h */
    public final Provider<C37688c> f63199h;

    /* renamed from: i */
    public final Provider<C37545b> f63200i;

    /* renamed from: j */
    public final Provider<C37573h> f63201j;

    /* renamed from: k */
    public final Provider<ClearConsentUserCase> f63202k;

    /* renamed from: l */
    public final Provider<C37539c> f63203l;

    /* renamed from: m */
    public final Provider<C37885h> f63204m;

    /* renamed from: n */
    public final Provider<C37786s> f63205n;

    public C25799d(Provider<LoginRepository> provider, Provider<AccountRepository> provider2, Provider<LoyaltyPreferencesStorage> provider3, Provider<C37854a> provider4, Provider<C37522h> provider5, Provider<C37883f> provider6, Provider<C37811a> provider7, Provider<C37688c> provider8, Provider<C37545b> provider9, Provider<C37573h> provider10, Provider<ClearConsentUserCase> provider11, Provider<C37539c> provider12, Provider<C37885h> provider13, Provider<C37786s> provider14) {
        this.f63192a = provider;
        this.f63193b = provider2;
        this.f63194c = provider3;
        this.f63195d = provider4;
        this.f63196e = provider5;
        this.f63197f = provider6;
        this.f63198g = provider7;
        this.f63199h = provider8;
        this.f63200i = provider9;
        this.f63201j = provider10;
        this.f63202k = provider11;
        this.f63203l = provider12;
        this.f63204m = provider13;
        this.f63205n = provider14;
    }

    /* renamed from: a */
    public static C25799d m110667a(Provider<LoginRepository> provider, Provider<AccountRepository> provider2, Provider<LoyaltyPreferencesStorage> provider3, Provider<C37854a> provider4, Provider<C37522h> provider5, Provider<C37883f> provider6, Provider<C37811a> provider7, Provider<C37688c> provider8, Provider<C37545b> provider9, Provider<C37573h> provider10, Provider<ClearConsentUserCase> provider11, Provider<C37539c> provider12, Provider<C37885h> provider13, Provider<C37786s> provider14) {
        return new C25799d(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    /* renamed from: c */
    public static AccountMenuViewModel m110668c(LoginRepository loginRepository, AccountRepository accountRepository, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C37854a aVar, C37522h hVar, C37883f fVar, C37811a aVar2, C37688c cVar, C37545b bVar, C37573h hVar2, ClearConsentUserCase clearConsentUserCase, C37539c cVar2, C37885h hVar3, C37786s sVar) {
        return new AccountMenuViewModel(loginRepository, accountRepository, loyaltyPreferencesStorage, aVar, hVar, fVar, aVar2, cVar, bVar, hVar2, clearConsentUserCase, cVar2, hVar3, sVar);
    }

    /* renamed from: b */
    public AccountMenuViewModel get() {
        return m110668c(this.f63192a.get(), this.f63193b.get(), this.f63194c.get(), this.f63195d.get(), this.f63196e.get(), this.f63197f.get(), this.f63198g.get(), this.f63199h.get(), this.f63200i.get(), this.f63201j.get(), this.f63202k.get(), this.f63203l.get(), this.f63204m.get(), this.f63205n.get());
    }
}
