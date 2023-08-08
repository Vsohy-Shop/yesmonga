package com.carrefour.fid.android.shared.extension;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.channels.C11760r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.ConnectivityKt$isDeviceConnected$1", mo22502f = "Connectivity.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/channels/r;", "", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ConnectivityKt$isDeviceConnected$1 extends SuspendLambda implements C11304p<C11760r<? super Boolean>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConnectivityKt$isDeviceConnected$1(Context context, C11045c<? super ConnectivityKt$isDeviceConnected$1> cVar) {
        super(2, cVar);
        this.$context = context;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ConnectivityKt$isDeviceConnected$1 connectivityKt$isDeviceConnected$1 = new ConnectivityKt$isDeviceConnected$1(this.$context, cVar);
        connectivityKt$isDeviceConnected$1.L$0 = obj;
        return connectivityKt$isDeviceConnected$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super Boolean> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ConnectivityKt$isDeviceConnected$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        ConnectivityManager connectivityManager;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11760r rVar = (C11760r) this.L$0;
            if (C12079p0.m48270k(rVar)) {
                Object systemService = this.$context.getSystemService("connectivity");
                NetworkInfo networkInfo = null;
                if (systemService instanceof ConnectivityManager) {
                    connectivityManager = (ConnectivityManager) systemService;
                } else {
                    connectivityManager = null;
                }
                if (connectivityManager != null) {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                }
                boolean z = false;
                if (networkInfo != null && (networkInfo.isConnected() || (networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED && networkInfo.getExtraInfo() == null && networkInfo.isAvailable()))) {
                    z = true;
                }
                rVar.mo23751L(C11064a.m42615a(z));
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
