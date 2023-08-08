package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.manager.C22505c;
import com.bumptech.glide.util.C22625h;
import com.bumptech.glide.util.C22635o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.t */
public final class C22526t {

    /* renamed from: d */
    public static volatile C22526t f57725d = null;

    /* renamed from: e */
    public static final String f57726e = "ConnectivityMonitor";

    /* renamed from: a */
    public final C22529c f57727a;
    @C0323b0("this")

    /* renamed from: b */
    public final Set<C22505c.C22506a> f57728b = new HashSet();
    @C0323b0("this")

    /* renamed from: c */
    public boolean f57729c;

    /* renamed from: com.bumptech.glide.manager.t$a */
    public class C22527a implements C22625h.C22627b<ConnectivityManager> {

        /* renamed from: a */
        public final /* synthetic */ Context f57730a;

        public C22527a(Context context) {
            this.f57730a = context;
        }

        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f57730a.getSystemService("connectivity");
        }
    }

    /* renamed from: com.bumptech.glide.manager.t$b */
    public class C22528b implements C22505c.C22506a {
        public C22528b() {
        }

        /* renamed from: a */
        public void mo65754a(boolean z) {
            ArrayList<C22505c.C22506a> arrayList;
            synchronized (C22526t.this) {
                arrayList = new ArrayList<>(C22526t.this.f57728b);
            }
            for (C22505c.C22506a a : arrayList) {
                a.mo65754a(z);
            }
        }
    }

    /* renamed from: com.bumptech.glide.manager.t$c */
    public interface C22529c {
        /* renamed from: a */
        void mo66640a();

        /* renamed from: b */
        boolean mo66641b();
    }

    @C0376v0(24)
    /* renamed from: com.bumptech.glide.manager.t$d */
    public static final class C22530d implements C22529c {

        /* renamed from: a */
        public boolean f57733a;

        /* renamed from: b */
        public final C22505c.C22506a f57734b;

        /* renamed from: c */
        public final C22625h.C22627b<ConnectivityManager> f57735c;

        /* renamed from: d */
        public final ConnectivityManager.NetworkCallback f57736d = new C22531a();

        /* renamed from: com.bumptech.glide.manager.t$d$a */
        public class C22531a extends ConnectivityManager.NetworkCallback {

            /* renamed from: com.bumptech.glide.manager.t$d$a$a */
            public class C22532a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ boolean f57738a;

                public C22532a(boolean z) {
                    this.f57738a = z;
                }

                public void run() {
                    C22531a.this.mo66642a(this.f57738a);
                }
            }

            public C22531a() {
            }

            /* renamed from: a */
            public void mo66642a(boolean z) {
                C22635o.m102627b();
                C22530d dVar = C22530d.this;
                boolean z2 = dVar.f57733a;
                dVar.f57733a = z;
                if (z2 != z) {
                    dVar.f57734b.mo65754a(z);
                }
            }

            /* renamed from: b */
            public final void mo66643b(boolean z) {
                C22635o.m102649x(new C22532a(z));
            }

            public void onAvailable(@C0359n0 Network network) {
                mo66643b(true);
            }

            public void onLost(@C0359n0 Network network) {
                mo66643b(false);
            }
        }

        public C22530d(C22625h.C22627b<ConnectivityManager> bVar, C22505c.C22506a aVar) {
            this.f57735c = bVar;
            this.f57734b = aVar;
        }

        /* renamed from: a */
        public void mo66640a() {
            this.f57735c.get().unregisterNetworkCallback(this.f57736d);
        }

        @SuppressLint({"MissingPermission"})
        /* renamed from: b */
        public boolean mo66641b() {
            boolean z;
            if (this.f57735c.get().getActiveNetwork() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f57733a = z;
            try {
                this.f57735c.get().registerDefaultNetworkCallback(this.f57736d);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }
    }

    /* renamed from: com.bumptech.glide.manager.t$e */
    public static final class C22533e implements C22529c {

        /* renamed from: a */
        public final Context f57740a;

        /* renamed from: b */
        public final C22505c.C22506a f57741b;

        /* renamed from: c */
        public final C22625h.C22627b<ConnectivityManager> f57742c;

        /* renamed from: d */
        public boolean f57743d;

        /* renamed from: e */
        public final BroadcastReceiver f57744e = new C22534a();

        /* renamed from: com.bumptech.glide.manager.t$e$a */
        public class C22534a extends BroadcastReceiver {
            public C22534a() {
            }

            public void onReceive(@C0359n0 Context context, Intent intent) {
                C22533e eVar = C22533e.this;
                boolean z = eVar.f57743d;
                eVar.f57743d = eVar.mo66647c();
                if (z != C22533e.this.f57743d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("connectivity changed, isConnected: ");
                        sb.append(C22533e.this.f57743d);
                    }
                    C22533e eVar2 = C22533e.this;
                    eVar2.f57741b.mo65754a(eVar2.f57743d);
                }
            }
        }

        public C22533e(Context context, C22625h.C22627b<ConnectivityManager> bVar, C22505c.C22506a aVar) {
            this.f57740a = context.getApplicationContext();
            this.f57742c = bVar;
            this.f57741b = aVar;
        }

        /* renamed from: a */
        public void mo66640a() {
            this.f57740a.unregisterReceiver(this.f57744e);
        }

        /* renamed from: b */
        public boolean mo66641b() {
            this.f57743d = mo66647c();
            try {
                this.f57740a.registerReceiver(this.f57744e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }

        @SuppressLint({"MissingPermission"})
        /* renamed from: c */
        public boolean mo66647c() {
            try {
                NetworkInfo activeNetworkInfo = this.f57742c.get().getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return false;
                }
                return true;
            } catch (RuntimeException unused) {
                return true;
            }
        }
    }

    public C22526t(@C0359n0 Context context) {
        this.f57727a = new C22530d(C22625h.m102601a(new C22527a(context)), new C22528b());
    }

    /* renamed from: a */
    public static C22526t m102140a(@C0359n0 Context context) {
        if (f57725d == null) {
            synchronized (C22526t.class) {
                if (f57725d == null) {
                    f57725d = new C22526t(context.getApplicationContext());
                }
            }
        }
        return f57725d;
    }

    @C0344h1
    /* renamed from: e */
    public static void m102141e() {
        f57725d = null;
    }

    @C0323b0("this")
    /* renamed from: b */
    public final void mo66634b() {
        if (!this.f57729c && !this.f57728b.isEmpty()) {
            this.f57729c = this.f57727a.mo66641b();
        }
    }

    @C0323b0("this")
    /* renamed from: c */
    public final void mo66635c() {
        if (this.f57729c && this.f57728b.isEmpty()) {
            this.f57727a.mo66640a();
            this.f57729c = false;
        }
    }

    /* renamed from: d */
    public synchronized void mo66636d(C22505c.C22506a aVar) {
        this.f57728b.add(aVar);
        mo66634b();
    }

    /* renamed from: f */
    public synchronized void mo66637f(C22505c.C22506a aVar) {
        this.f57728b.remove(aVar);
        mo66635c();
    }
}
