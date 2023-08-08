package com.carrefour.fid.android.shared.presentation.p047ui.webview;

import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.shared.util.C28903a;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.g */
public final class C28873g implements C10158g<WebViewActivity> {

    /* renamed from: a */
    public final Provider<C28903a> f70746a;

    /* renamed from: b */
    public final Provider<C37694a> f70747b;

    /* renamed from: c */
    public final Provider<AppEnvironment> f70748c;

    public C28873g(Provider<C28903a> provider, Provider<C37694a> provider2, Provider<AppEnvironment> provider3) {
        this.f70746a = provider;
        this.f70747b = provider2;
        this.f70748c = provider3;
    }

    /* renamed from: a */
    public static C10158g<WebViewActivity> m119423a(Provider<C28903a> provider, Provider<C37694a> provider2, Provider<AppEnvironment> provider3) {
        return new C28873g(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity.activityUtil")
    /* renamed from: b */
    public static void m119424b(WebViewActivity webViewActivity, C28903a aVar) {
        webViewActivity.f70717Y0 = aVar;
    }

    @C10326j("com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity.environment")
    /* renamed from: c */
    public static void m119425c(WebViewActivity webViewActivity, AppEnvironment appEnvironment) {
        webViewActivity.f70719a1 = appEnvironment;
    }

    @C10326j("com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity.remoteLogUseCase")
    /* renamed from: e */
    public static void m119426e(WebViewActivity webViewActivity, C37694a aVar) {
        webViewActivity.f70718Z0 = aVar;
    }

    /* renamed from: d */
    public void injectMembers(WebViewActivity webViewActivity) {
        m119424b(webViewActivity, this.f70746a.get());
        m119426e(webViewActivity, this.f70747b.get());
        m119425c(webViewActivity, this.f70748c.get());
    }
}
