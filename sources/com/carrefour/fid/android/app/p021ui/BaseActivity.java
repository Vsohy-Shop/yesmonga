package com.carrefour.fid.android.app.p021ui;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.C0475e;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19501x;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.airship.data.datasource.C13747e;
import com.carrefour.fid.android.events.LogOffBroadcastReceiver;
import com.carrefour.fid.android.utils.DeviceSecurityHelper;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.app.ui.BaseActivity */
public class BaseActivity<VB extends C20752b> extends C0475e {
    @C12579k

    /* renamed from: Z0 */
    public static final C13833a f33747Z0 = new C13833a((DefaultConstructorMarker) null);

    /* renamed from: a1 */
    public static final int f33748a1 = 8;
    @C12580l

    /* renamed from: b1 */
    public static final String f33749b1 = C11342l0.m43547d(BaseActivity.class).mo22848s();
    @C12579k

    /* renamed from: U0 */
    public final C11300l<LayoutInflater, VB> f33750U0;

    /* renamed from: V0 */
    public VB f33751V0;

    /* renamed from: W0 */
    public LogOffBroadcastReceiver f33752W0;
    @Inject

    /* renamed from: X0 */
    public C13747e f33753X0;
    @Inject

    /* renamed from: Y0 */
    public DeviceSecurityHelper f33754Y0;

    /* renamed from: com.carrefour.fid.android.app.ui.BaseActivity$a */
    public static final class C13833a {
        public /* synthetic */ C13833a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final String mo32769a() {
            return BaseActivity.f33749b1;
        }

        public C13833a() {
        }
    }

    public BaseActivity(@C12579k C11300l<? super LayoutInflater, ? extends VB> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "binder");
        this.f33750U0 = lVar;
    }

    @C12579k
    /* renamed from: U0 */
    public final C13747e mo32764U0() {
        C13747e eVar = this.f33753X0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audienceTrackingManager");
        return null;
    }

    @C12579k
    /* renamed from: V0 */
    public final VB mo32765V0() {
        VB vb = this.f33751V0;
        if (vb != null) {
            return vb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_binding");
        return null;
    }

    @C12579k
    /* renamed from: W0 */
    public final DeviceSecurityHelper mo32766W0() {
        DeviceSecurityHelper deviceSecurityHelper = this.f33754Y0;
        if (deviceSecurityHelper != null) {
            return deviceSecurityHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceSecurityHelper");
        return null;
    }

    /* renamed from: X0 */
    public final void mo32767X0(@C12579k C13747e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f33753X0 = eVar;
    }

    /* renamed from: Y0 */
    public final void mo32768Y0(@C12579k DeviceSecurityHelper deviceSecurityHelper) {
        Intrinsics.checkNotNullParameter(deviceSecurityHelper, "<set-?>");
        this.f33754Y0 = deviceSecurityHelper;
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        C11300l<LayoutInflater, VB> lVar = this.f33750U0;
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "layoutInflater");
        VB vb = (C20752b) lVar.invoke(layoutInflater);
        this.f33751V0 = vb;
        if (vb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_binding");
            vb = null;
        }
        setContentView(vb.getRoot());
        C19501x.m90847a(this).mo57477c(new BaseActivity$onCreate$1(this, (C11045c<? super BaseActivity$onCreate$1>) null));
    }

    public void onStart() {
        super.onStart();
        LogOffBroadcastReceiver logOffBroadcastReceiver = new LogOffBroadcastReceiver();
        this.f33752W0 = logOffBroadcastReceiver;
        registerReceiver(logOffBroadcastReceiver, new IntentFilter(LogOffBroadcastReceiver.f96876d));
    }

    public void onStop() {
        super.onStop();
        LogOffBroadcastReceiver logOffBroadcastReceiver = this.f33752W0;
        if (logOffBroadcastReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logOffReceiver");
            logOffBroadcastReceiver = null;
        }
        unregisterReceiver(logOffBroadcastReceiver);
    }
}
