package com.carrefour.fid.android.app.p021ui;

import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.airship.data.datasource.C13747e;
import com.carrefour.fid.android.utils.DeviceSecurityHelper;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.app.ui.a */
public final class C13834a<VB extends C20752b> implements C10158g<BaseActivity<VB>> {

    /* renamed from: a */
    public final Provider<C13747e> f33755a;

    /* renamed from: b */
    public final Provider<DeviceSecurityHelper> f33756b;

    public C13834a(Provider<C13747e> provider, Provider<DeviceSecurityHelper> provider2) {
        this.f33755a = provider;
        this.f33756b = provider2;
    }

    /* renamed from: a */
    public static <VB extends C20752b> C10158g<BaseActivity<VB>> m58814a(Provider<C13747e> provider, Provider<DeviceSecurityHelper> provider2) {
        return new C13834a(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.app.ui.BaseActivity.audienceTrackingManager")
    /* renamed from: b */
    public static <VB extends C20752b> void m58815b(BaseActivity<VB> baseActivity, C13747e eVar) {
        baseActivity.f33753X0 = eVar;
    }

    @C10326j("com.carrefour.fid.android.app.ui.BaseActivity.deviceSecurityHelper")
    /* renamed from: c */
    public static <VB extends C20752b> void m58816c(BaseActivity<VB> baseActivity, DeviceSecurityHelper deviceSecurityHelper) {
        baseActivity.f33754Y0 = deviceSecurityHelper;
    }

    /* renamed from: d */
    public void injectMembers(BaseActivity<VB> baseActivity) {
        m58815b(baseActivity, this.f33755a.get());
        m58816c(baseActivity, this.f33756b.get());
    }
}
