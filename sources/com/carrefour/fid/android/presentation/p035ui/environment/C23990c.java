package com.carrefour.fid.android.presentation.p035ui.environment;

import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.environment.c */
public final class C23990c implements C10158g<AppEnvironmentSelectionFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f60197a;

    public C23990c(Provider<AppEnvironment> provider) {
        this.f60197a = provider;
    }

    /* renamed from: a */
    public static C10158g<AppEnvironmentSelectionFragment> m105923a(Provider<AppEnvironment> provider) {
        return new C23990c(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.environment.AppEnvironmentSelectionFragment.appEnvironment")
    /* renamed from: b */
    public static void m105924b(AppEnvironmentSelectionFragment appEnvironmentSelectionFragment, AppEnvironment appEnvironment) {
        appEnvironmentSelectionFragment.f60183v = appEnvironment;
    }

    /* renamed from: c */
    public void injectMembers(AppEnvironmentSelectionFragment appEnvironmentSelectionFragment) {
        m105924b(appEnvironmentSelectionFragment, this.f60197a.get());
    }
}
