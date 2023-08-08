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
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.bumptech.glide.manager.C22509f;
import java.io.IOException;

/* renamed from: com.google.firebase.messaging.f1 */
public class C33189f1 implements Runnable {

    /* renamed from: f */
    public static final Object f80685f = new Object();
    @C0323b0("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: g */
    public static Boolean f80686g;
    @C0323b0("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: v */
    public static Boolean f80687v;

    /* renamed from: a */
    public final Context f80688a;

    /* renamed from: b */
    public final C33206k0 f80689b;

    /* renamed from: c */
    public final PowerManager.WakeLock f80690c;

    /* renamed from: d */
    public final C33179e1 f80691d;

    /* renamed from: e */
    public final long f80692e;

    @C0344h1
    /* renamed from: com.google.firebase.messaging.f1$a */
    public class C33190a extends BroadcastReceiver {
        @C0363p0
        @C0323b0("this")

        /* renamed from: a */
        public C33189f1 f80693a;

        public C33190a(C33189f1 f1Var) {
            this.f80693a = f1Var;
        }

        /* renamed from: a */
        public void mo96080a() {
            boolean unused = C33189f1.m133879k();
            C33189f1.this.f80688a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            C33189f1 f1Var = this.f80693a;
            if (f1Var != null) {
                if (f1Var.mo96078j()) {
                    boolean c = C33189f1.m133879k();
                    this.f80693a.f80691d.mo96060n(this.f80693a, 0);
                    context.unregisterReceiver(this);
                    this.f80693a = null;
                }
            }
        }
    }

    public C33189f1(C33179e1 e1Var, Context context, C33206k0 k0Var, long j) {
        this.f80691d = e1Var;
        this.f80688a = context;
        this.f80692e = j;
        this.f80689b = k0Var;
        this.f80690c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, C33180f.f80561b);
    }

    /* renamed from: f */
    public static String m133875f(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: g */
    public static boolean m133876g(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f80685f) {
            Boolean bool = f80687v;
            if (bool == null) {
                z = m133877h(context, C22509f.f57696b, bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f80687v = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: h */
    public static boolean m133877h(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            m133875f(str);
        }
        return z;
    }

    /* renamed from: i */
    public static boolean m133878i(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f80685f) {
            Boolean bool = f80686g;
            if (bool == null) {
                z = m133877h(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f80686g = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: k */
    public static boolean m133879k() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final synchronized boolean mo96078j() {
        NetworkInfo networkInfo;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f80688a.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        if (m133878i(this.f80688a)) {
            this.f80690c.acquire(C33180f.f80562c);
        }
        try {
            this.f80691d.mo96062p(true);
            if (!this.f80689b.mo96109g()) {
                this.f80691d.mo96062p(false);
                if (m133878i(this.f80688a)) {
                    try {
                        this.f80690c.release();
                    } catch (RuntimeException unused) {
                    }
                }
            } else if (!m133876g(this.f80688a) || mo96078j()) {
                if (this.f80691d.mo96066t()) {
                    this.f80691d.mo96062p(false);
                } else {
                    this.f80691d.mo96067u(this.f80692e);
                }
                if (!m133878i(this.f80688a)) {
                    return;
                }
                try {
                    this.f80690c.release();
                } catch (RuntimeException unused2) {
                }
            } else {
                new C33190a(this).mo96080a();
                if (m133878i(this.f80688a)) {
                    try {
                        this.f80690c.release();
                    } catch (RuntimeException unused3) {
                    }
                }
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to sync topics. Won't retry sync. ");
            sb.append(e.getMessage());
            this.f80691d.mo96062p(false);
            if (!m133878i(this.f80688a)) {
            }
        } catch (Throwable th) {
            if (m133878i(this.f80688a)) {
                try {
                    this.f80690c.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th;
        }
    }
}
