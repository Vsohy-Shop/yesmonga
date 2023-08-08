package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.C40678b;
import com.google.android.gms.common.C40715h;
import com.google.android.gms.common.C40864j;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.annotation.C40475c;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.stats.C40954b;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.ads_identifier.C41059e;
import com.google.android.gms.internal.ads_identifier.C41060f;
import com.google.firebase.installations.local.C33093b;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@C40473a
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.ads.identifier.a */
public class C40365a {
    @C0363p0
    @GuardedBy("this")

    /* renamed from: a */
    public C40678b f102885a;
    @C0363p0
    @GuardedBy("this")

    /* renamed from: b */
    public C41060f f102886b;
    @GuardedBy("this")

    /* renamed from: c */
    public boolean f102887c;

    /* renamed from: d */
    public final Object f102888d;
    @C0363p0
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e */
    public C40368c f102889e;
    @GuardedBy("this")

    /* renamed from: f */
    public final Context f102890f;

    /* renamed from: g */
    public final long f102891g;

    @C40475c
    /* renamed from: com.google.android.gms.ads.identifier.a$a */
    public static final class C40366a {
        @C0363p0

        /* renamed from: a */
        public final String f102892a;

        /* renamed from: b */
        public final boolean f102893b;

        @Deprecated
        public C40366a(@C0363p0 String str, boolean z) {
            this.f102892a = str;
            this.f102893b = z;
        }

        @C0363p0
        /* renamed from: a */
        public String mo133250a() {
            return this.f102892a;
        }

        /* renamed from: b */
        public boolean mo133251b() {
            return this.f102893b;
        }

        @C0359n0
        public String toString() {
            String str = this.f102892a;
            boolean z = this.f102893b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append(C33093b.f80281i);
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @C40473a
    public C40365a(@C0359n0 Context context) {
        this(context, 30000, false, false);
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static C40366a m164196a(@C0359n0 Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C40365a aVar = new C40365a(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.mo133246g(false);
            C40366a i = aVar.mo133248i(-1);
            aVar.mo133247h(i, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            aVar.mo133244f();
            return i;
        } catch (Throwable th) {
            aVar.mo133244f();
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:42|43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0068, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0061 */
    @com.google.android.gms.common.annotation.C40473a
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m164197c(@androidx.annotation.C0359n0 android.content.Context r7) throws java.io.IOException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, com.google.android.gms.common.GooglePlayServicesRepairableException {
        /*
            com.google.android.gms.ads.identifier.a r6 = new com.google.android.gms.ads.identifier.a
            r2 = -1
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r4, r5)
            r7 = 0
            r6.mo133246g(r7)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C40843u.m166201k(r0)     // Catch:{ all -> 0x006c }
            monitor-enter(r6)     // Catch:{ all -> 0x006c }
            boolean r0 = r6.f102887c     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0049
            java.lang.Object r0 = r6.f102888d     // Catch:{ all -> 0x0069 }
            monitor-enter(r0)     // Catch:{ all -> 0x0069 }
            com.google.android.gms.ads.identifier.c r1 = r6.f102889e     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x003e
            boolean r1 = r1.f102898d     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x003e
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            r6.mo133246g(r7)     // Catch:{ Exception -> 0x0035 }
            boolean r7 = r6.f102887c     // Catch:{ all -> 0x0069 }
            if (r7 == 0) goto L_0x002d
            goto L_0x0049
        L_0x002d:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "AdvertisingIdClient cannot reconnect."
            r7.<init>(r0)     // Catch:{ all -> 0x0069 }
            throw r7     // Catch:{ all -> 0x0069 }
        L_0x0035:
            r7 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x003e:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "AdvertisingIdClient is not connected."
            r7.<init>(r1)     // Catch:{ all -> 0x0046 }
            throw r7     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r7     // Catch:{ all -> 0x0069 }
        L_0x0049:
            com.google.android.gms.common.b r7 = r6.f102885a     // Catch:{ all -> 0x0069 }
            com.google.android.gms.common.internal.C40843u.m166202l(r7)     // Catch:{ all -> 0x0069 }
            com.google.android.gms.internal.ads_identifier.f r7 = r6.f102886b     // Catch:{ all -> 0x0069 }
            com.google.android.gms.common.internal.C40843u.m166202l(r7)     // Catch:{ all -> 0x0069 }
            com.google.android.gms.internal.ads_identifier.f r7 = r6.f102886b     // Catch:{ RemoteException -> 0x0061 }
            boolean r7 = r7.mo134865e()     // Catch:{ RemoteException -> 0x0061 }
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            r6.mo133249j()     // Catch:{ all -> 0x006c }
            r6.mo133244f()
            return r7
        L_0x0061:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "Remote exception"
            r7.<init>(r0)     // Catch:{ all -> 0x0069 }
            throw r7     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            throw r7     // Catch:{ all -> 0x006c }
        L_0x006c:
            r7 = move-exception
            r6.mo133244f()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.C40365a.m164197c(android.content.Context):boolean");
    }

    @C40473a
    @C40858y
    /* renamed from: d */
    public static void m164198d(boolean z) {
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public C40366a mo133242b() throws IOException {
        return mo133248i(-1);
    }

    @C40473a
    /* renamed from: e */
    public void mo133243e() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        mo133246g(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133244f() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C40843u.m166201k(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f102890f     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            com.google.android.gms.common.b r0 = r3.f102885a     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            boolean r0 = r3.f102887c     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001e
            com.google.android.gms.common.stats.b r0 = com.google.android.gms.common.stats.C40954b.m166547b()     // Catch:{ all -> 0x001e }
            android.content.Context r1 = r3.f102890f     // Catch:{ all -> 0x001e }
            com.google.android.gms.common.b r2 = r3.f102885a     // Catch:{ all -> 0x001e }
            r0.mo134752c(r1, r2)     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = 0
            r3.f102887c = r0     // Catch:{ all -> 0x002a }
            r0 = 0
            r3.f102886b = r0     // Catch:{ all -> 0x002a }
            r3.f102885a = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.C40365a.mo133244f():void");
    }

    public final void finalize() throws Throwable {
        mo133244f();
        super.finalize();
    }

    @C40974d0
    /* renamed from: g */
    public final void mo133246g(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        C40843u.m166201k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f102887c) {
                mo133244f();
            }
            Context context = this.f102890f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int k = C40715h.m165670i().mo134209k(context, C40864j.f103985a);
                if (k != 0) {
                    if (k != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C40678b bVar = new C40678b();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (C40954b.m166547b().mo134751a(context, intent, bVar, 1)) {
                    this.f102885a = bVar;
                    this.f102886b = C41059e.m166924m0(bVar.mo134107b(10000, TimeUnit.MILLISECONDS));
                    this.f102887c = true;
                    if (z) {
                        mo133249j();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new GooglePlayServicesNotAvailableException(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    @C40974d0
    /* renamed from: h */
    public final boolean mo133247h(@C0363p0 C40366a aVar, boolean z, float f, long j, String str, @C0363p0 Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (aVar != null) {
            if (true != aVar.mo133251b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String a = aVar.mo133250a();
            if (a != null) {
                hashMap.put("ad_id_size", Integer.toString(a.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C40367b(this, hashMap).start();
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0063, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005c */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.identifier.C40365a.C40366a mo133248i(int r4) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r4 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C40843u.m166201k(r4)
            monitor-enter(r3)
            boolean r4 = r3.f102887c     // Catch:{ all -> 0x0064 }
            if (r4 != 0) goto L_0x003b
            java.lang.Object r4 = r3.f102888d     // Catch:{ all -> 0x0064 }
            monitor-enter(r4)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.ads.identifier.c r0 = r3.f102889e     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.f102898d     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0030
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            r4 = 0
            r3.mo133246g(r4)     // Catch:{ Exception -> 0x0027 }
            boolean r4 = r3.f102887c     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x001f
            goto L_0x003b
        L_0x001f:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "AdvertisingIdClient cannot reconnect."
            r4.<init>(r0)     // Catch:{ all -> 0x0064 }
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x0027:
            r4 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0030:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "AdvertisingIdClient is not connected."
            r0.<init>(r1)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x003b:
            com.google.android.gms.common.b r4 = r3.f102885a     // Catch:{ all -> 0x0064 }
            com.google.android.gms.common.internal.C40843u.m166202l(r4)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.internal.ads_identifier.f r4 = r3.f102886b     // Catch:{ all -> 0x0064 }
            com.google.android.gms.common.internal.C40843u.m166202l(r4)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.ads.identifier.a$a r4 = new com.google.android.gms.ads.identifier.a$a     // Catch:{ RemoteException -> 0x005c }
            com.google.android.gms.internal.ads_identifier.f r0 = r3.f102886b     // Catch:{ RemoteException -> 0x005c }
            java.lang.String r0 = r0.mo134864d()     // Catch:{ RemoteException -> 0x005c }
            com.google.android.gms.internal.ads_identifier.f r1 = r3.f102886b     // Catch:{ RemoteException -> 0x005c }
            r2 = 1
            boolean r1 = r1.mo134863J1(r2)     // Catch:{ RemoteException -> 0x005c }
            r4.<init>(r0, r1)     // Catch:{ RemoteException -> 0x005c }
            monitor-exit(r3)     // Catch:{ all -> 0x0064 }
            r3.mo133249j()
            return r4
        L_0x005c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "Remote exception"
            r4.<init>(r0)     // Catch:{ all -> 0x0064 }
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0064 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.C40365a.mo133248i(int):com.google.android.gms.ads.identifier.a$a");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133249j() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f102888d
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.c r1 = r5.f102889e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f102897c     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            com.google.android.gms.ads.identifier.c r1 = r5.f102889e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r5.f102891g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0020
            com.google.android.gms.ads.identifier.c r3 = new com.google.android.gms.ads.identifier.c     // Catch:{ all -> 0x0022 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0022 }
            r5.f102889e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.C40365a.mo133249j():void");
    }

    @C40974d0
    public C40365a(@C0359n0 Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.f102888d = new Object();
        C40843u.m166202l(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f102890f = context;
        this.f102887c = false;
        this.f102891g = j;
    }
}
