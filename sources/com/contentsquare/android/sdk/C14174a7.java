package com.contentsquare.android.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.core.content.C17318d;
import com.google.android.gms.common.internal.C40852x;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.a7 */
public final class C14174a7 {

    /* renamed from: a */
    public WeakHashMap<C14176b, Boolean> f35048a = new WeakHashMap<>();

    /* renamed from: com.contentsquare.android.sdk.a7$a */
    public static final class C14175a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ C14174a7 f35049a;

        public C14175a(C14174a7 a7Var) {
            this.f35049a = a7Var;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            for (Map.Entry key : this.f35049a.f35048a.entrySet()) {
                ((C14176b) key.getKey()).mo34499a();
            }
        }
    }

    /* renamed from: com.contentsquare.android.sdk.a7$b */
    public interface C14176b {
        /* renamed from: a */
        void mo34499a();
    }

    public C14174a7(Context context) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        if (C17318d.m79718a(context, "android.permission.CHANGE_NETWORK_STATE") == 0) {
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                ((ConnectivityManager) systemService).requestNetwork(new NetworkRequest.Builder().build(), new C14175a(this));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
    }

    /* renamed from: b */
    public final void mo34497b(C14176b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40852x.C40853a.f103958a);
        this.f35048a.put(bVar, Boolean.TRUE);
    }
}
