package com.carrefour.fid.android.navigation;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.airship.data.datasource.C13747e;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.app.p021ui.C13834a;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.viewmodels.criteo.CriteoTrackingViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.C26380a;
import com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.utils.DeviceSecurityHelper;
import com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener;
import com.google.android.play.core.review.C32121c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.navigation.d */
public final class C38321d implements C10158g<BottomNavActivity> {

    /* renamed from: a */
    public final Provider<C13747e> f97057a;

    /* renamed from: b */
    public final Provider<DeviceSecurityHelper> f97058b;

    /* renamed from: c */
    public final Provider<LoginRepository> f97059c;

    /* renamed from: d */
    public final Provider<CriteoTrackingViewModel> f97060d;

    /* renamed from: e */
    public final Provider<LoyaltyPreferencesStorage> f97061e;

    /* renamed from: f */
    public final Provider<HomeAnalyticsViewModel> f97062f;

    /* renamed from: g */
    public final Provider<C26380a> f97063g;

    /* renamed from: v */
    public final Provider<C13783a> f97064v;

    /* renamed from: w */
    public final Provider<ForegroundBackgroundApplicationListener> f97065w;

    /* renamed from: x */
    public final Provider<C32121c> f97066x;

    /* renamed from: y */
    public final Provider<C13814a> f97067y;

    /* renamed from: z */
    public final Provider<C28796c> f97068z;

    public C38321d(Provider<C13747e> provider, Provider<DeviceSecurityHelper> provider2, Provider<LoginRepository> provider3, Provider<CriteoTrackingViewModel> provider4, Provider<LoyaltyPreferencesStorage> provider5, Provider<HomeAnalyticsViewModel> provider6, Provider<C26380a> provider7, Provider<C13783a> provider8, Provider<ForegroundBackgroundApplicationListener> provider9, Provider<C32121c> provider10, Provider<C13814a> provider11, Provider<C28796c> provider12) {
        this.f97057a = provider;
        this.f97058b = provider2;
        this.f97059c = provider3;
        this.f97060d = provider4;
        this.f97061e = provider5;
        this.f97062f = provider6;
        this.f97063g = provider7;
        this.f97064v = provider8;
        this.f97065w = provider9;
        this.f97066x = provider10;
        this.f97067y = provider11;
        this.f97068z = provider12;
    }

    /* renamed from: a */
    public static C10158g<BottomNavActivity> m158766a(Provider<C13747e> provider, Provider<DeviceSecurityHelper> provider2, Provider<LoginRepository> provider3, Provider<CriteoTrackingViewModel> provider4, Provider<LoyaltyPreferencesStorage> provider5, Provider<HomeAnalyticsViewModel> provider6, Provider<C26380a> provider7, Provider<C13783a> provider8, Provider<ForegroundBackgroundApplicationListener> provider9, Provider<C32121c> provider10, Provider<C13814a> provider11, Provider<C28796c> provider12) {
        return new C38321d(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @C10326j("com.carrefour.fid.android.navigation.BottomNavActivity.analyticManager")
    /* renamed from: b */
    public static void m158767b(BottomNavActivity bottomNavActivity, C13783a aVar) {
        bottomNavActivity.f97037m1 = aVar;
    }

    @C10326j("com.carrefour.fid.android.navigation.BottomNavActivity.appsFlyerTrackingManager")
    /* renamed from: c */
    public static void m158768c(BottomNavActivity bottomNavActivity, C13814a aVar) {
        bottomNavActivity.f97040p1 = aVar;
    }

    @C10326j("com.carrefour.fid.android.navigation.BottomNavActivity.bottomNavAnalyticsViewModel")
    /* renamed from: d */
    public static void m158769d(BottomNavActivity bottomNavActivity, C26380a aVar) {
        bottomNavActivity.f97036l1 = aVar;
    }

    @C10326j("com.carrefour.fid.android.navigation.BottomNavActivity.criteoViewModel")
    /* renamed from: e */
    public static void m158770e(BottomNavActivity bottomNavActivity, CriteoTrackingViewModel criteoTrackingViewModel) {
        bottomNavActivity.f97033i1 = criteoTrackingViewModel;
    }

    @C10326j("com.carrefour.fid.android.navigation.BottomNavActivity.foregroundBackgroundApplicationListener")
    /* renamed from: f */
    public static void m158771f(BottomNavActivity bottomNavActivity, ForegroundBackgroundApplicationListener foregroundBackgroundApplicationListener) {
        bottomNavActivity.f97038n1 = foregroundBackgroundApplicationListener;
    }

    @C10326j("com.carrefour.fid.android.navigation.BottomNavActivity.homeAnalyticsViewModel")
    /* renamed from: g */
    public static void m158772g(BottomNavActivity bottomNavActivity, HomeAnalyticsViewModel homeAnalyticsViewModel) {
        bottomNavActivity.f97035k1 = homeAnalyticsViewModel;
    }

    @C10326j("com.carrefour.fid.android.navigation.BottomNavActivity.loginRepository")
    /* renamed from: h */
    public static void m158773h(BottomNavActivity bottomNavActivity, LoginRepository loginRepository) {
        bottomNavActivity.f97032h1 = loginRepository;
    }

    @C10326j("com.carrefour.fid.android.navigation.BottomNavActivity.loyaltyPreferencesStorage")
    /* renamed from: i */
    public static void m158774i(BottomNavActivity bottomNavActivity, LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        bottomNavActivity.f97034j1 = loyaltyPreferencesStorage;
    }

    @C10326j("com.carrefour.fid.android.navigation.BottomNavActivity.navigator")
    /* renamed from: k */
    public static void m158775k(BottomNavActivity bottomNavActivity, C28796c cVar) {
        bottomNavActivity.f97048x1 = cVar;
    }

    @C10326j("com.carrefour.fid.android.navigation.BottomNavActivity.reviewManager")
    /* renamed from: l */
    public static void m158776l(BottomNavActivity bottomNavActivity, C32121c cVar) {
        bottomNavActivity.f97039o1 = cVar;
    }

    /* renamed from: j */
    public void injectMembers(BottomNavActivity bottomNavActivity) {
        C13834a.m58815b(bottomNavActivity, this.f97057a.get());
        C13834a.m58816c(bottomNavActivity, this.f97058b.get());
        m158773h(bottomNavActivity, this.f97059c.get());
        m158770e(bottomNavActivity, this.f97060d.get());
        m158774i(bottomNavActivity, this.f97061e.get());
        m158772g(bottomNavActivity, this.f97062f.get());
        m158769d(bottomNavActivity, this.f97063g.get());
        m158767b(bottomNavActivity, this.f97064v.get());
        m158771f(bottomNavActivity, this.f97065w.get());
        m158776l(bottomNavActivity, this.f97066x.get());
        m158768c(bottomNavActivity, this.f97067y.get());
        m158775k(bottomNavActivity, this.f97068z.get());
    }
}
