package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.analytics.C23516a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.g */
public final class C23555g implements C10158g<NonFoodCheckoutStep1Fragment> {

    /* renamed from: a */
    public final Provider<C28796c> f59516a;

    /* renamed from: b */
    public final Provider<C23516a> f59517b;

    /* renamed from: c */
    public final Provider<C38326b> f59518c;

    public C23555g(Provider<C28796c> provider, Provider<C23516a> provider2, Provider<C38326b> provider3) {
        this.f59516a = provider;
        this.f59517b = provider2;
        this.f59518c = provider3;
    }

    /* renamed from: a */
    public static C10158g<NonFoodCheckoutStep1Fragment> m104808a(Provider<C28796c> provider, Provider<C23516a> provider2, Provider<C38326b> provider3) {
        return new C23555g(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1Fragment.analytics")
    /* renamed from: b */
    public static void m104809b(NonFoodCheckoutStep1Fragment nonFoodCheckoutStep1Fragment, C23516a aVar) {
        nonFoodCheckoutStep1Fragment.f59427g = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1Fragment.navigator")
    /* renamed from: d */
    public static void m104810d(NonFoodCheckoutStep1Fragment nonFoodCheckoutStep1Fragment, C28796c cVar) {
        nonFoodCheckoutStep1Fragment.f59426f = cVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1Fragment.performance")
    /* renamed from: e */
    public static void m104811e(NonFoodCheckoutStep1Fragment nonFoodCheckoutStep1Fragment, C38326b bVar) {
        nonFoodCheckoutStep1Fragment.f59428v = bVar;
    }

    /* renamed from: c */
    public void injectMembers(NonFoodCheckoutStep1Fragment nonFoodCheckoutStep1Fragment) {
        m104810d(nonFoodCheckoutStep1Fragment, this.f59516a.get());
        m104809b(nonFoodCheckoutStep1Fragment, this.f59517b.get());
        m104811e(nonFoodCheckoutStep1Fragment, this.f59518c.get());
    }
}
