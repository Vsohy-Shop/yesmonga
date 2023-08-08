package com.carrefour.fid.android.shared.extension;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.C0349j;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class ConnectivityKt {

    /* renamed from: com.carrefour.fid.android.shared.extension.ConnectivityKt$a */
    public static final class C28706a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f70326a;

        public C28706a(C11289a<C11079d2> aVar) {
            this.f70326a = aVar;
        }

        public void onAvailable(@C12579k Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            this.f70326a.invoke();
        }
    }

    @C12579k
    /* renamed from: a */
    public static final ConnectivityManager.NetworkCallback m118749a(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "onInternetAvailable");
        return new C28706a(aVar);
    }

    @C0349j
    @C12579k
    /* renamed from: b */
    public static final C11907e<Boolean> m118750b(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return C11909g.m47500w(new ConnectivityKt$isDeviceConnected$1(context, (C11045c<? super ConnectivityKt$isDeviceConnected$1>) null));
    }

    /* renamed from: c */
    public static final void m118751c(@C12579k Activity activity, @C12579k ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        Object systemService = activity.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(networkCallback);
    }

    /* renamed from: d */
    public static final void m118752d(@C12579k Activity activity, @C12579k ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        Object systemService = activity.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).unregisterNetworkCallback(networkCallback);
    }
}
