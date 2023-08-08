package com.carrefour.fid.android.utils;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.utils.DeviceSecurityHelper", mo22502f = "DeviceSecurityHelper.kt", mo22503i = {0}, mo22504l = {34}, mo22505m = "shouldShowSecurityAlert", mo22506n = {"currentTime"}, mo22507s = {"J$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DeviceSecurityHelper$shouldShowSecurityAlert$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceSecurityHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceSecurityHelper$shouldShowSecurityAlert$1(DeviceSecurityHelper deviceSecurityHelper, C11045c<? super DeviceSecurityHelper$shouldShowSecurityAlert$1> cVar) {
        super(cVar);
        this.this$0 = deviceSecurityHelper;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo67055g(this);
    }
}
