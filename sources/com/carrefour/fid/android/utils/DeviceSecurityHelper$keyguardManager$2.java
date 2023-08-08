package com.carrefour.fid.android.utils;

import android.app.KeyguardManager;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroid/app/KeyguardManager;", "a", "()Landroid/app/KeyguardManager;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DeviceSecurityHelper$keyguardManager$2 extends Lambda implements C11289a<KeyguardManager> {
    final /* synthetic */ DeviceSecurityHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceSecurityHelper$keyguardManager$2(DeviceSecurityHelper deviceSecurityHelper) {
        super(0);
        this.this$0 = deviceSecurityHelper;
    }

    @C12579k
    /* renamed from: a */
    public final KeyguardManager invoke() {
        Object systemService = this.this$0.f58133a.getSystemService("keyguard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return (KeyguardManager) systemService;
    }
}
