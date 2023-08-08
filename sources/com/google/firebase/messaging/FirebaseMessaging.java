package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.Keep;
import androidx.compose.runtime.C8698y1;
import com.google.android.datatransport.C40087h;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.concurrent.C40970b;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.C32566c;
import com.google.firebase.C33033f;
import com.google.firebase.events.C33029a;
import com.google.firebase.events.C33030b;
import com.google.firebase.events.C33032d;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.C33058b;
import com.google.firebase.installations.C33088k;
import com.google.firebase.messaging.C33260z0;
import com.google.firebase.platforminfo.C33509i;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {

    /* renamed from: o */
    public static final String f80402o = "FirebaseMessaging";

    /* renamed from: p */
    public static final String f80403p = "com.google.android.gms";

    /* renamed from: q */
    public static final String f80404q = "com.google.android.gcm.intent.SEND";

    /* renamed from: r */
    public static final String f80405r = "app";
    @Deprecated

    /* renamed from: s */
    public static final String f80406s = "FCM";

    /* renamed from: t */
    public static final long f80407t = 30;

    /* renamed from: u */
    public static final long f80408u = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: v */
    public static final String f80409v = "";
    @C0323b0("FirebaseMessaging.class")

    /* renamed from: w */
    public static C33260z0 f80410w;
    @C0363p0
    @C0344h1
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: x */
    public static C40087h f80411x;
    @C0344h1
    @C0323b0("FirebaseMessaging.class")

    /* renamed from: y */
    public static ScheduledExecutorService f80412y;

    /* renamed from: a */
    public final C33033f f80413a;
    @C0363p0

    /* renamed from: b */
    public final FirebaseInstanceIdInternal f80414b;

    /* renamed from: c */
    public final C33088k f80415c;

    /* renamed from: d */
    public final Context f80416d;

    /* renamed from: e */
    public final C33188f0 f80417e;

    /* renamed from: f */
    public final C33251v0 f80418f;

    /* renamed from: g */
    public final C33154a f80419g;

    /* renamed from: h */
    public final Executor f80420h;

    /* renamed from: i */
    public final Executor f80421i;

    /* renamed from: j */
    public final Executor f80422j;

    /* renamed from: k */
    public final C31047k<C33179e1> f80423k;

    /* renamed from: l */
    public final C33206k0 f80424l;
    @C0323b0("this")

    /* renamed from: m */
    public boolean f80425m;

    /* renamed from: n */
    public final Application.ActivityLifecycleCallbacks f80426n;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    public class C33154a {

        /* renamed from: f */
        public static final String f80427f = "firebase_messaging_auto_init_enabled";

        /* renamed from: g */
        public static final String f80428g = "com.google.firebase.messaging";

        /* renamed from: h */
        public static final String f80429h = "auto_init";

        /* renamed from: a */
        public final C33032d f80430a;
        @C0323b0("this")

        /* renamed from: b */
        public boolean f80431b;
        @C0363p0
        @C0323b0("this")

        /* renamed from: c */
        public C33030b<C32566c> f80432c;
        @C0363p0
        @C0323b0("this")

        /* renamed from: d */
        public Boolean f80433d;

        public C33154a(C33032d dVar) {
            this.f80430a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m133709d(C33029a aVar) {
            if (mo95950c()) {
                FirebaseMessaging.this.mo95935W();
            }
        }

        /* renamed from: b */
        public synchronized void mo95949b() {
            if (!this.f80431b) {
                Boolean e = mo95951e();
                this.f80433d = e;
                if (e == null) {
                    C33171c0 c0Var = new C33171c0(this);
                    this.f80432c = c0Var;
                    this.f80430a.mo94755a(C32566c.class, c0Var);
                }
                this.f80431b = true;
            }
        }

        /* renamed from: c */
        public synchronized boolean mo95950c() {
            boolean z;
            mo95949b();
            Boolean bool = this.f80433d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.f80413a.mo95705A();
            }
            return z;
        }

        @C0363p0
        /* renamed from: e */
        public final Boolean mo95951e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context n = FirebaseMessaging.this.f80413a.mo95721n();
            SharedPreferences sharedPreferences = n.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(f80429h)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(f80429h, false));
            }
            try {
                PackageManager packageManager = n.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(n.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f80427f)) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(f80427f));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: f */
        public synchronized void mo95952f(boolean z) {
            mo95949b();
            C33030b<C32566c> bVar = this.f80432c;
            if (bVar != null) {
                this.f80430a.mo94757d(C32566c.class, bVar);
                this.f80432c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.f80413a.mo95721n().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean(f80429h, z);
            edit.apply();
            if (z) {
                FirebaseMessaging.this.mo95935W();
            }
            this.f80433d = Boolean.valueOf(z);
        }
    }

    public FirebaseMessaging(C33033f fVar, @C0363p0 FirebaseInstanceIdInternal firebaseInstanceIdInternal, C33058b<C33509i> bVar, C33058b<HeartBeatInfo> bVar2, C33088k kVar, @C0363p0 C40087h hVar, C33032d dVar) {
        this(fVar, firebaseInstanceIdInternal, bVar, bVar2, kVar, hVar, dVar, new C33206k0(fVar.mo95721n()));
    }

    @C0363p0
    /* renamed from: A */
    public static C40087h m133655A() {
        return f80411x;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ C31047k m133656F(String str, C33260z0.C33261a aVar) {
        return this.f80417e.mo96072f().mo87740x(this.f80422j, new C33229s(this, str, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ C31047k m133657G(String str, C33260z0.C33261a aVar, String str2) throws Exception {
        m133683v(this.f80416d).mo96243g(mo95945w(), str, str2, this.f80424l.mo96104a());
        if (aVar == null || !str2.equals(aVar.f80882a)) {
            m133661K(str2);
        }
        return C31053n.m124525g(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m133658H(C31049l lVar) {
        try {
            this.f80414b.deleteToken(C33206k0.m133948c(this.f80413a), "FCM");
            lVar.mo87743c(null);
        } catch (Exception e) {
            lVar.mo87742b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m133659I(C31049l lVar) {
        try {
            C31053n.m124519a(this.f80417e.mo96069c());
            m133683v(this.f80416d).mo96240d(mo95945w(), C33206k0.m133948c(this.f80413a));
            lVar.mo87743c(null);
        } catch (Exception e) {
            lVar.mo87742b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m133660J(C31049l lVar) {
        try {
            lVar.mo87743c(mo95940n());
        } catch (Exception e) {
            lVar.mo87742b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m133662L() {
        if (mo95926C()) {
            mo95935W();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m133663M(C33179e1 e1Var) {
        if (mo95926C()) {
            e1Var.mo96064r();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m133664N() {
        C33222q0.m134027c(this.f80416d);
    }

    @C0359n0
    @Keep
    public static synchronized FirebaseMessaging getInstance(@C0359n0 C33033f fVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) fVar.mo95720l(FirebaseMessaging.class);
            C40843u.m166203m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    @C0344h1
    /* renamed from: o */
    public static synchronized void m133680o() {
        synchronized (FirebaseMessaging.class) {
            f80410w = null;
        }
    }

    /* renamed from: p */
    public static void m133681p() {
        f80411x = null;
    }

    @C0359n0
    /* renamed from: u */
    public static synchronized FirebaseMessaging m133682u() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(C33033f.m133333p());
        }
        return instance;
    }

    @C0359n0
    /* renamed from: v */
    public static synchronized C33260z0 m133683v(Context context) {
        C33260z0 z0Var;
        synchronized (FirebaseMessaging.class) {
            if (f80410w == null) {
                f80410w = new C33260z0(context);
            }
            z0Var = f80410w;
        }
        return z0Var;
    }

    /* renamed from: B */
    public final void m133661K(String str) {
        if (C33033f.f80145l.equals(this.f80413a.mo95722r())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invoking onNewToken for app: ");
                sb.append(this.f80413a.mo95722r());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C33215n(this.f80416d).mo96144i(intent);
        }
    }

    /* renamed from: C */
    public boolean mo95926C() {
        return this.f80419g.mo95950c();
    }

    @C0344h1
    /* renamed from: D */
    public boolean mo95927D() {
        return this.f80424l.mo96109g();
    }

    /* renamed from: E */
    public boolean mo95928E() {
        return C33222q0.m134028d(this.f80416d);
    }

    /* renamed from: Q */
    public void mo95929Q(@C0359n0 RemoteMessage remoteMessage) {
        if (!TextUtils.isEmpty(remoteMessage.mo95968N0())) {
            Intent intent = new Intent(f80404q);
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra(f80405r, PendingIntent.getBroadcast(this.f80416d, 0, intent2, C8698y1.f23302n));
            intent.setPackage("com.google.android.gms");
            remoteMessage.mo95975k1(intent);
            this.f80416d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    /* renamed from: R */
    public void mo95930R(boolean z) {
        this.f80419g.mo95952f(z);
    }

    /* renamed from: S */
    public void mo95931S(boolean z) {
        C33202j0.m133913B(z);
    }

    @C0359n0
    /* renamed from: T */
    public C31047k<Void> mo95932T(boolean z) {
        return C33222q0.m134030f(this.f80420h, this.f80416d, z);
    }

    /* renamed from: U */
    public synchronized void mo95933U(boolean z) {
        this.f80425m = z;
    }

    /* renamed from: V */
    public final synchronized void mo95934V() {
        if (!this.f80425m) {
            mo95937Y(0);
        }
    }

    /* renamed from: W */
    public final void mo95935W() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f80414b;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (mo95938Z(mo95947y())) {
            mo95934V();
        }
    }

    @SuppressLint({"TaskMainThread"})
    @C0359n0
    /* renamed from: X */
    public C31047k<Void> mo95936X(@C0359n0 String str) {
        return this.f80423k.mo87739w(new C33255x(str));
    }

    /* renamed from: Y */
    public synchronized void mo95937Y(long j) {
        mo95943s(new C33164a1(this, Math.min(Math.max(30, 2 * j), f80408u)), j);
        this.f80425m = true;
    }

    @C0344h1
    /* renamed from: Z */
    public boolean mo95938Z(@C0363p0 C33260z0.C33261a aVar) {
        return aVar == null || aVar.mo96244b(this.f80424l.mo96104a());
    }

    @SuppressLint({"TaskMainThread"})
    @C0359n0
    /* renamed from: a0 */
    public C31047k<Void> mo95939a0(@C0359n0 String str) {
        return this.f80423k.mo87739w(new C33223r(str));
    }

    /* renamed from: n */
    public String mo95940n() throws IOException {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f80414b;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) C31053n.m124519a(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            C33260z0.C33261a y = mo95947y();
            if (!mo95938Z(y)) {
                return y.f80882a;
            }
            String c = C33206k0.m133948c(this.f80413a);
            try {
                return (String) C31053n.m124519a(this.f80418f.mo96208b(c, new C33257y(this, c, y)));
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    @C0359n0
    /* renamed from: q */
    public C31047k<Void> mo95941q() {
        if (this.f80414b != null) {
            C31049l lVar = new C31049l();
            this.f80420h.execute(new C33259z(this, lVar));
            return lVar.mo87741a();
        } else if (mo95947y() == null) {
            return C31053n.m124525g(null);
        } else {
            C31049l lVar2 = new C31049l();
            C33217o.m134017f().execute(new C33163a0(this, lVar2));
            return lVar2.mo87741a();
        }
    }

    @C0359n0
    /* renamed from: r */
    public boolean mo95942r() {
        return C33202j0.m133918a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: s */
    public void mo95943s(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f80412y == null) {
                f80412y = new ScheduledThreadPoolExecutor(1, new C40970b("TAG"));
            }
            f80412y.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: t */
    public Context mo95944t() {
        return this.f80416d;
    }

    /* renamed from: w */
    public final String mo95945w() {
        if (C33033f.f80145l.equals(this.f80413a.mo95722r())) {
            return "";
        }
        return this.f80413a.mo95724t();
    }

    @C0359n0
    /* renamed from: x */
    public C31047k<String> mo95946x() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f80414b;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        C31049l lVar = new C31049l();
        this.f80420h.execute(new C33167b0(this, lVar));
        return lVar.mo87741a();
    }

    @C0363p0
    @C0344h1
    /* renamed from: y */
    public C33260z0.C33261a mo95947y() {
        return m133683v(this.f80416d).mo96241e(mo95945w(), C33206k0.m133948c(this.f80413a));
    }

    /* renamed from: z */
    public C31047k<C33179e1> mo95948z() {
        return this.f80423k;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseMessaging(com.google.firebase.C33033f r12, @androidx.annotation.C0363p0 com.google.firebase.iid.internal.FirebaseInstanceIdInternal r13, com.google.firebase.inject.C33058b<com.google.firebase.platforminfo.C33509i> r14, com.google.firebase.inject.C33058b<com.google.firebase.heartbeatinfo.HeartBeatInfo> r15, com.google.firebase.installations.C33088k r16, @androidx.annotation.C0363p0 com.google.android.datatransport.C40087h r17, com.google.firebase.events.C33032d r18, com.google.firebase.messaging.C33206k0 r19) {
        /*
            r11 = this;
            com.google.firebase.messaging.f0 r7 = new com.google.firebase.messaging.f0
            r0 = r7
            r1 = r12
            r2 = r19
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = com.google.firebase.messaging.C33217o.m134019h()
            java.util.concurrent.ScheduledExecutorService r9 = com.google.firebase.messaging.C33217o.m134015d()
            java.util.concurrent.Executor r10 = com.google.firebase.messaging.C33217o.m134014c()
            r0 = r11
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(com.google.firebase.f, com.google.firebase.iid.internal.FirebaseInstanceIdInternal, com.google.firebase.inject.b, com.google.firebase.inject.b, com.google.firebase.installations.k, com.google.android.datatransport.h, com.google.firebase.events.d, com.google.firebase.messaging.k0):void");
    }

    public FirebaseMessaging(C33033f fVar, @C0363p0 FirebaseInstanceIdInternal firebaseInstanceIdInternal, C33088k kVar, @C0363p0 C40087h hVar, C33032d dVar, C33206k0 k0Var, C33188f0 f0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f80425m = false;
        f80411x = hVar;
        this.f80413a = fVar;
        this.f80414b = firebaseInstanceIdInternal;
        this.f80415c = kVar;
        this.f80419g = new C33154a(dVar);
        Context n = fVar.mo95721n();
        this.f80416d = n;
        C33221q qVar = new C33221q();
        this.f80426n = qVar;
        this.f80424l = k0Var;
        this.f80421i = executor;
        this.f80417e = f0Var;
        this.f80418f = new C33251v0(executor);
        this.f80420h = executor2;
        this.f80422j = executor3;
        Context n2 = fVar.mo95721n();
        if (n2 instanceof Application) {
            ((Application) n2).registerActivityLifecycleCallbacks(qVar);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Context ");
            sb.append(n2);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new C33242t(this));
        }
        executor2.execute(new C33248u(this));
        C31047k<C33179e1> f = C33179e1.m133837f(this, k0Var, f0Var, n, C33217o.m134020i());
        this.f80423k = f;
        f.mo87728l(executor2, new C33250v(this));
        executor2.execute(new C33253w(this));
    }
}
