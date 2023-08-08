package com.urbanairship.automation;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;

@C0376v0(api = 21)
/* renamed from: com.urbanairship.automation.w */
public class C8975w {

    /* renamed from: a */
    public C8977b f24125a;

    /* renamed from: b */
    public final ConnectivityManager.NetworkCallback f24126b = new C8976a();

    /* renamed from: com.urbanairship.automation.w$a */
    public class C8976a extends ConnectivityManager.NetworkCallback {
        public C8976a() {
        }

        public void onAvailable(@C0359n0 Network network) {
            if (C8975w.this.f24125a != null) {
                C8975w.this.f24125a.mo17414a(true);
            }
        }

        public void onLost(@C0359n0 Network network) {
            if (C8975w.this.f24125a != null) {
                C8975w.this.f24125a.mo17414a(false);
            }
        }
    }

    /* renamed from: com.urbanairship.automation.w$b */
    public interface C8977b {
        /* renamed from: a */
        void mo17414a(boolean z);
    }

    /* renamed from: b */
    public void mo17726b() {
        try {
            ((ConnectivityManager) UAirship.m146200l().getSystemService("connectivity")).registerDefaultNetworkCallback(this.f24126b);
        } catch (SecurityException e) {
            C36059m.m148423s(e, "NetworkMonitor failed to register network callback!", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo17727c(C8977b bVar) {
        this.f24125a = bVar;
        mo17726b();
    }

    /* renamed from: d */
    public void mo17728d() {
        this.f24125a = null;
        mo17729e();
    }

    /* renamed from: e */
    public void mo17729e() {
        try {
            ((ConnectivityManager) UAirship.m146200l().getSystemService("connectivity")).unregisterNetworkCallback(this.f24126b);
        } catch (Exception e) {
            C36059m.m148423s(e, "NetworkMonitor failed to unregister network callback!", new Object[0]);
        }
    }
}
