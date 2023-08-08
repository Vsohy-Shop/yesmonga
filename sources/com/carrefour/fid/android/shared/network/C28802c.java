package com.carrefour.fid.android.shared.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.network.c */
public final class C28802c {

    /* renamed from: c */
    public static final int f70596c = 8;
    @C12579k

    /* renamed from: a */
    public final Context f70597a;
    @C12579k

    /* renamed from: b */
    public AtomicBoolean f70598b = new AtomicBoolean(false);

    /* renamed from: com.carrefour.fid.android.shared.network.c$a */
    public static final class C28803a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ C28802c f70599a;

        public C28803a(C28802c cVar) {
            this.f70599a = cVar;
        }

        public void onAvailable(@C12579k Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            this.f70599a.f70598b = new AtomicBoolean(true);
        }

        public void onLost(@C12579k Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            this.f70599a.f70598b = new AtomicBoolean(false);
        }
    }

    @Inject
    public C28802c(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f70597a = context;
        mo83874c();
    }

    /* renamed from: b */
    public final boolean mo83873b() {
        return this.f70598b.get();
    }

    /* renamed from: c */
    public final void mo83874c() {
        Object systemService = this.f70597a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(new C28803a(this));
    }
}
