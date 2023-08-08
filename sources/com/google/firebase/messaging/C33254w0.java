package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.manager.C22509f;
import com.google.android.gms.common.annotation.C40473a;
import java.util.ArrayDeque;
import java.util.Queue;

@C40473a
/* renamed from: com.google.firebase.messaging.w0 */
public class C33254w0 {

    /* renamed from: e */
    public static final int f80846e = -1;
    @C40473a

    /* renamed from: f */
    public static final int f80847f = 500;

    /* renamed from: g */
    public static final int f80848g = 404;

    /* renamed from: h */
    public static final int f80849h = 401;

    /* renamed from: i */
    public static final int f80850i = 402;

    /* renamed from: j */
    public static final int f80851j = 403;

    /* renamed from: k */
    public static final String f80852k = "com.google.firebase.MESSAGING_EVENT";

    /* renamed from: l */
    public static final String f80853l = "wrapped_intent";

    /* renamed from: m */
    public static final String f80854m = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";

    /* renamed from: n */
    public static C33254w0 f80855n;
    @C0363p0
    @C0323b0("this")

    /* renamed from: a */
    public String f80856a = null;

    /* renamed from: b */
    public Boolean f80857b = null;

    /* renamed from: c */
    public Boolean f80858c = null;

    /* renamed from: d */
    public final Queue<Intent> f80859d = new ArrayDeque();

    /* renamed from: b */
    public static synchronized C33254w0 m134108b() {
        C33254w0 w0Var;
        synchronized (C33254w0.class) {
            if (f80855n == null) {
                f80855n = new C33254w0();
            }
            w0Var = f80855n;
        }
        return w0Var;
    }

    @C0344h1
    /* renamed from: g */
    public static void m134109g(C33254w0 w0Var) {
        f80855n = w0Var;
    }

    /* renamed from: a */
    public final int mo96211a(Context context, Intent intent) {
        ComponentName componentName;
        String f = mo96215f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Restricting intent to a specific service: ");
                sb.append(f);
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (mo96214e(context)) {
                componentName = C33196h1.m133904k(context, intent);
            } else {
                componentName = context.startService(intent);
            }
            if (componentName == null) {
                return 404;
            }
            return -1;
        } catch (SecurityException unused) {
            return 401;
        } catch (IllegalStateException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to start service while in background: ");
            sb2.append(e);
            return 402;
        }
    }

    @C0353k0
    /* renamed from: c */
    public Intent mo96212c() {
        return this.f80859d.poll();
    }

    /* renamed from: d */
    public boolean mo96213d(Context context) {
        boolean z;
        if (this.f80858c == null) {
            if (context.checkCallingOrSelfPermission(C22509f.f57696b) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f80858c = Boolean.valueOf(z);
        }
        boolean booleanValue = this.f80857b.booleanValue();
        return this.f80858c.booleanValue();
    }

    /* renamed from: e */
    public boolean mo96214e(Context context) {
        boolean z;
        if (this.f80857b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f80857b = Boolean.valueOf(z);
        }
        boolean booleanValue = this.f80857b.booleanValue();
        return this.f80857b.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        return null;
     */
    @androidx.annotation.C0363p0
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo96215f(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.f80856a     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return r0
        L_0x0007:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ all -> 0x006e }
            r1 = 0
            android.content.pm.ResolveInfo r5 = r0.resolveService(r5, r1)     // Catch:{ all -> 0x006e }
            r0 = 0
            if (r5 == 0) goto L_0x006c
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch:{ all -> 0x006e }
            if (r5 != 0) goto L_0x0018
            goto L_0x006c
        L_0x0018:
            java.lang.String r1 = r4.getPackageName()     // Catch:{ all -> 0x006e }
            java.lang.String r2 = r5.packageName     // Catch:{ all -> 0x006e }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = r5.name     // Catch:{ all -> 0x006e }
            if (r1 != 0) goto L_0x0029
            goto L_0x0051
        L_0x0029:
            java.lang.String r0 = "."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0049
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r0.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x006e }
            r0.append(r4)     // Catch:{ all -> 0x006e }
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x006e }
            r0.append(r4)     // Catch:{ all -> 0x006e }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x006e }
            r3.f80856a = r4     // Catch:{ all -> 0x006e }
            goto L_0x004d
        L_0x0049:
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x006e }
            r3.f80856a = r4     // Catch:{ all -> 0x006e }
        L_0x004d:
            java.lang.String r4 = r3.f80856a     // Catch:{ all -> 0x006e }
            monitor-exit(r3)
            return r4
        L_0x0051:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r4.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r1 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r4.append(r1)     // Catch:{ all -> 0x006e }
            java.lang.String r1 = r5.packageName     // Catch:{ all -> 0x006e }
            r4.append(r1)     // Catch:{ all -> 0x006e }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ all -> 0x006e }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x006e }
            r4.append(r5)     // Catch:{ all -> 0x006e }
            monitor-exit(r3)
            return r0
        L_0x006c:
            monitor-exit(r3)
            return r0
        L_0x006e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C33254w0.mo96215f(android.content.Context, android.content.Intent):java.lang.String");
    }

    @C0353k0
    /* renamed from: h */
    public int mo96216h(Context context, Intent intent) {
        this.f80859d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return mo96211a(context, intent2);
    }
}
