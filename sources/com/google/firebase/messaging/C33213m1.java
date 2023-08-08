package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.stats.C40954b;
import com.google.android.gms.common.util.concurrent.C40970b;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.m1 */
public class C33213m1 implements ServiceConnection {

    /* renamed from: i */
    public static final int f80748i = 9000;

    /* renamed from: c */
    public final Context f80749c;

    /* renamed from: d */
    public final Intent f80750d;

    /* renamed from: e */
    public final ScheduledExecutorService f80751e;

    /* renamed from: f */
    public final Queue<C33214a> f80752f;
    @C0363p0

    /* renamed from: g */
    public C33203j1 f80753g;
    @C0323b0("this")

    /* renamed from: h */
    public boolean f80754h;

    /* renamed from: com.google.firebase.messaging.m1$a */
    public static class C33214a {

        /* renamed from: a */
        public final Intent f80755a;

        /* renamed from: b */
        public final C31049l<Void> f80756b = new C31049l<>();

        public C33214a(Intent intent) {
            this.f80755a = intent;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m133995f() {
            StringBuilder sb = new StringBuilder();
            sb.append("Service took too long to process intent: ");
            sb.append(this.f80755a.getAction());
            sb.append(" Releasing WakeLock.");
            mo96142d();
        }

        /* renamed from: c */
        public void mo96141c(ScheduledExecutorService scheduledExecutorService) {
            boolean z;
            long j;
            if ((this.f80755a.getFlags() & 268435456) != 0) {
                z = true;
            } else {
                z = false;
            }
            C33207k1 k1Var = new C33207k1(this);
            if (z) {
                j = C33196h1.f80710b;
            } else {
                j = 9000;
            }
            mo96143e().mo87722f(scheduledExecutorService, new C33210l1(scheduledExecutorService.schedule(k1Var, j, TimeUnit.MILLISECONDS)));
        }

        /* renamed from: d */
        public void mo96142d() {
            this.f80756b.mo87745e(null);
        }

        /* renamed from: e */
        public C31047k<Void> mo96143e() {
            return this.f80756b.mo87741a();
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C33213m1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C40970b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @C0323b0("this")
    /* renamed from: a */
    public final void mo96135a() {
        while (!this.f80752f.isEmpty()) {
            this.f80752f.poll().mo96142d();
        }
    }

    /* renamed from: b */
    public final synchronized void mo96136b() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        while (!this.f80752f.isEmpty()) {
            boolean isLoggable2 = Log.isLoggable("FirebaseMessaging", 3);
            C33203j1 j1Var = this.f80753g;
            if (j1Var == null || !j1Var.isBinderAlive()) {
                mo96138d();
                return;
            }
            boolean isLoggable3 = Log.isLoggable("FirebaseMessaging", 3);
            this.f80753g.mo96102c(this.f80752f.poll());
        }
    }

    /* renamed from: c */
    public synchronized C31047k<Void> mo96137c(Intent intent) {
        C33214a aVar;
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        aVar = new C33214a(intent);
        aVar.mo96141c(this.f80751e);
        this.f80752f.add(aVar);
        mo96136b();
        return aVar.mo96143e();
    }

    @C0323b0("this")
    /* renamed from: d */
    public final void mo96138d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f80754h);
        }
        if (!this.f80754h) {
            this.f80754h = true;
            try {
                if (C40954b.m166547b().mo134751a(this.f80749c, this.f80750d, this, 65)) {
                    return;
                }
            } catch (SecurityException unused) {
            }
            this.f80754h = false;
            mo96135a();
        }
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onServiceConnected: ");
            sb.append(componentName);
        }
        this.f80754h = false;
        if (!(iBinder instanceof C33203j1)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid service connection: ");
            sb2.append(iBinder);
            mo96135a();
            return;
        }
        this.f80753g = (C33203j1) iBinder;
        mo96136b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onServiceDisconnected: ");
            sb.append(componentName);
        }
        mo96136b();
    }

    @C0344h1
    public C33213m1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f80752f = new ArrayDeque();
        this.f80754h = false;
        Context applicationContext = context.getApplicationContext();
        this.f80749c = applicationContext;
        this.f80750d = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f80751e = scheduledExecutorService;
    }
}
