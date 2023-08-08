package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(24)
@C11314h(name = "NetworkApi24")
/* renamed from: androidx.work.impl.utils.r */
public final class C21340r {
    @C0373u
    /* renamed from: a */
    public static final void m98457a(@C12579k ConnectivityManager connectivityManager, @C12579k ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
