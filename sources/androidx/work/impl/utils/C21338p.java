package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(21)
@C11314h(name = "NetworkApi21")
/* renamed from: androidx.work.impl.utils.p */
public final class C21338p {
    @C12580l
    @C0373u
    /* renamed from: a */
    public static final NetworkCapabilities m98453a(@C12579k ConnectivityManager connectivityManager, @C12580l Network network) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    @C0373u
    /* renamed from: b */
    public static final boolean m98454b(@C12579k NetworkCapabilities networkCapabilities, int i) {
        Intrinsics.checkNotNullParameter(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i);
    }

    @C0373u
    /* renamed from: c */
    public static final void m98455c(@C12579k ConnectivityManager connectivityManager, @C12579k ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
