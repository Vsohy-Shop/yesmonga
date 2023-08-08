package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.concurrent.C40970b;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.a1 */
public class C33164a1 implements Runnable {

    /* renamed from: a */
    public final long f80498a;

    /* renamed from: b */
    public final PowerManager.WakeLock f80499b;

    /* renamed from: c */
    public final FirebaseMessaging f80500c;
    @SuppressLint({"ThreadPoolCreation"})
    @C40974d0

    /* renamed from: d */
    public ExecutorService f80501d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C40970b("firebase-iid-executor"));

    @C40974d0
    /* renamed from: com.google.firebase.messaging.a1$a */
    public static class C33165a extends BroadcastReceiver {
        @C0363p0

        /* renamed from: a */
        public C33164a1 f80502a;

        public C33165a(C33164a1 a1Var) {
            this.f80502a = a1Var;
        }

        /* renamed from: a */
        public void mo96030a() {
            C33164a1.m133787d();
            this.f80502a.mo96026c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            C33164a1 a1Var = this.f80502a;
            if (a1Var != null && a1Var.mo96027e()) {
                C33164a1.m133787d();
                this.f80502a.f80500c.mo95943s(this.f80502a, 0);
                this.f80502a.mo96026c().unregisterReceiver(this);
                this.f80502a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    @C40974d0
    public C33164a1(FirebaseMessaging firebaseMessaging, long j) {
        this.f80500c = firebaseMessaging;
        this.f80498a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo96026c().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f80499b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: d */
    public static boolean m133787d() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public Context mo96026c() {
        return this.f80500c.mo95944t();
    }

    /* renamed from: e */
    public boolean mo96027e() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) mo96026c().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    @C40974d0
    /* renamed from: f */
    public boolean mo96028f() throws IOException {
        try {
            if (this.f80500c.mo95940n() == null) {
                return false;
            }
            return true;
        } catch (IOException e) {
            if (C33188f0.m133860h(e.getMessage())) {
                StringBuilder sb = new StringBuilder();
                sb.append("Token retrieval failed: ");
                sb.append(e.getMessage());
                sb.append(". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (C33254w0.m134108b().mo96214e(mo96026c())) {
            this.f80499b.acquire();
        }
        try {
            this.f80500c.mo95933U(true);
            if (!this.f80500c.mo95927D()) {
                this.f80500c.mo95933U(false);
                if (C33254w0.m134108b().mo96214e(mo96026c())) {
                    this.f80499b.release();
                }
            } else if (!C33254w0.m134108b().mo96213d(mo96026c()) || mo96027e()) {
                if (mo96028f()) {
                    this.f80500c.mo95933U(false);
                } else {
                    this.f80500c.mo95937Y(this.f80498a);
                }
                if (!C33254w0.m134108b().mo96214e(mo96026c())) {
                    return;
                }
                this.f80499b.release();
            } else {
                new C33165a(this).mo96030a();
                if (C33254w0.m134108b().mo96214e(mo96026c())) {
                    this.f80499b.release();
                }
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(e.getMessage());
            sb.append(". Won't retry the operation.");
            this.f80500c.mo95933U(false);
            if (!C33254w0.m134108b().mo96214e(mo96026c())) {
            }
        } catch (Throwable th) {
            if (C33254w0.m134108b().mo96214e(mo96026c())) {
                this.f80499b.release();
            }
            throw th;
        }
    }
}
