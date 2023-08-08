package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19232h;
import com.google.android.gms.common.C40713g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40538e;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40803q0;
import com.google.android.gms.common.internal.C40806r0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.service.C40822a;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40975e;
import com.urbanairship.util.RetryingExecutor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.j1 */
public final class C40572j1 extends C40507i implements C40543e2 {

    /* renamed from: A */
    public final C40574j3 f103435A;

    /* renamed from: B */
    public final C40803q0 f103436B;

    /* renamed from: e */
    public final Lock f103437e;

    /* renamed from: f */
    public final C40806r0 f103438f;
    @C0363p0

    /* renamed from: g */
    public C40555g2 f103439g = null;

    /* renamed from: h */
    public final int f103440h;

    /* renamed from: i */
    public final Context f103441i;

    /* renamed from: j */
    public final Looper f103442j;
    @C40974d0

    /* renamed from: k */
    public final Queue f103443k = new LinkedList();

    /* renamed from: l */
    public volatile boolean f103444l;

    /* renamed from: m */
    public long f103445m;

    /* renamed from: n */
    public long f103446n;

    /* renamed from: o */
    public final C40560h1 f103447o;

    /* renamed from: p */
    public final C40713g f103448p;
    @C0363p0
    @C40974d0

    /* renamed from: q */
    public C40528c2 f103449q;

    /* renamed from: r */
    public final Map f103450r;

    /* renamed from: s */
    public Set f103451s;

    /* renamed from: t */
    public final C40756f f103452t;

    /* renamed from: u */
    public final Map f103453u;

    /* renamed from: v */
    public final C40477a.C40478a f103454v;

    /* renamed from: w */
    public final C40599o f103455w;

    /* renamed from: x */
    public final ArrayList f103456x;

    /* renamed from: y */
    public Integer f103457y;
    @C0363p0

    /* renamed from: z */
    public Set f103458z;

    public C40572j1(Context context, Lock lock, Looper looper, C40756f fVar, C40713g gVar, C40477a.C40478a aVar, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        long j;
        Looper looper2 = looper;
        int i3 = i;
        if (true != C40975e.m166604c()) {
            j = RetryingExecutor.f26394v;
        } else {
            j = 10000;
        }
        this.f103445m = j;
        this.f103446n = 5000;
        this.f103451s = new HashSet();
        this.f103455w = new C40599o();
        this.f103457y = null;
        this.f103458z = null;
        C40527c1 c1Var = new C40527c1(this);
        this.f103436B = c1Var;
        this.f103441i = context;
        this.f103437e = lock;
        this.f103438f = new C40806r0(looper, c1Var);
        this.f103442j = looper2;
        this.f103447o = new C40560h1(this, looper);
        this.f103448p = gVar;
        this.f103440h = i3;
        if (i3 >= 0) {
            this.f103457y = Integer.valueOf(i2);
        }
        this.f103453u = map;
        this.f103450r = map2;
        this.f103456x = arrayList;
        this.f103435A = new C40574j3();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f103438f.mo134468f((C40507i.C40509b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f103438f.mo134469g((C40507i.C40510c) it2.next());
        }
        this.f103452t = fVar;
        this.f103454v = aVar;
    }

    /* renamed from: K */
    public static int m165147K(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            C40477a.C40489f fVar = (C40477a.C40489f) it.next();
            z2 |= fVar.mo87660m();
            z3 |= fVar.mo133671c();
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    /* renamed from: N */
    public static String m165149N(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: P */
    public static /* bridge */ /* synthetic */ void m165151P(C40572j1 j1Var) {
        j1Var.f103437e.lock();
        try {
            if (j1Var.f103444l) {
                j1Var.mo133973U();
            }
        } finally {
            j1Var.f103437e.unlock();
        }
    }

    /* renamed from: Q */
    public static /* bridge */ /* synthetic */ void m165152Q(C40572j1 j1Var) {
        j1Var.f103437e.lock();
        try {
            if (j1Var.mo133970R()) {
                j1Var.mo133973U();
            }
        } finally {
            j1Var.f103437e.unlock();
        }
    }

    /* renamed from: A */
    public final void mo133736A() {
        mo133750i();
        mo133748g();
    }

    /* renamed from: B */
    public final void mo133737B(@C0359n0 C40507i.C40509b bVar) {
        this.f103438f.mo134468f(bVar);
    }

    /* renamed from: C */
    public final void mo133738C(@C0359n0 C40507i.C40510c cVar) {
        this.f103438f.mo134469g(cVar);
    }

    /* renamed from: D */
    public final <L> C40592n<L> mo133739D(@C0359n0 L l) {
        this.f103437e.lock();
        try {
            return this.f103455w.mo134000d(l, this.f103442j, "NO_TYPE");
        } finally {
            this.f103437e.unlock();
        }
    }

    /* renamed from: E */
    public final void mo133740E(@C0359n0 C19232h hVar) {
        C40582l lVar = new C40582l((Activity) hVar);
        if (this.f103440h >= 0) {
            C40613q3.m165347u(lVar).mo134015w(this.f103440h);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    /* renamed from: F */
    public final void mo133741F(@C0359n0 C40507i.C40509b bVar) {
        this.f103438f.mo134470h(bVar);
    }

    /* renamed from: G */
    public final void mo133742G(@C0359n0 C40507i.C40510c cVar) {
        this.f103438f.mo134472i(cVar);
    }

    /* renamed from: H */
    public final void mo133743H(C40562h3 h3Var) {
        this.f103437e.lock();
        try {
            if (this.f103458z == null) {
                this.f103458z = new HashSet();
            }
            this.f103458z.add(h3Var);
        } finally {
            this.f103437e.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133744I(com.google.android.gms.common.api.internal.C40562h3 r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f103437e
            r0.lock()
            java.util.Set r0 = r2.f103458z     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L_0x0016
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0016:
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x0027
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0027:
            java.util.concurrent.locks.Lock r3 = r2.f103437e     // Catch:{ all -> 0x0057 }
            r3.lock()     // Catch:{ all -> 0x0057 }
            java.util.Set r3 = r2.f103458z     // Catch:{ all -> 0x0050 }
            if (r3 != 0) goto L_0x0036
            java.util.concurrent.locks.Lock r3 = r2.f103437e     // Catch:{ all -> 0x0057 }
            r3.unlock()     // Catch:{ all -> 0x0057 }
            goto L_0x0043
        L_0x0036:
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0050 }
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.f103437e     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x004a
        L_0x0043:
            com.google.android.gms.common.api.internal.g2 r3 = r2.f103439g     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x004a
            r3.mo133883m()     // Catch:{ all -> 0x0057 }
        L_0x004a:
            java.util.concurrent.locks.Lock r3 = r2.f103437e
            r3.unlock()
            return
        L_0x0050:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f103437e     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            throw r3     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f103437e
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C40572j1.mo133744I(com.google.android.gms.common.api.internal.h3):void");
    }

    /* renamed from: M */
    public final String mo133969M() {
        StringWriter stringWriter = new StringWriter();
        mo133751j("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    @GuardedBy("mLock")
    /* renamed from: R */
    public final boolean mo133970R() {
        if (!this.f103444l) {
            return false;
        }
        this.f103444l = false;
        this.f103447o.removeMessages(2);
        this.f103447o.removeMessages(1);
        C40528c2 c2Var = this.f103449q;
        if (c2Var != null) {
            c2Var.mo133848b();
            this.f103449q = null;
        }
        return true;
    }

    /* renamed from: S */
    public final void mo133971S(int i) {
        Integer num = this.f103457y;
        if (num == null) {
            this.f103457y = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            int intValue = this.f103457y.intValue();
            throw new IllegalStateException("Cannot use sign-in mode: " + m165149N(i) + ". Mode was already set to " + m165149N(intValue));
        }
        if (this.f103439g == null) {
            boolean z = false;
            boolean z2 = false;
            for (C40477a.C40489f fVar : this.f103450r.values()) {
                z |= fVar.mo87660m();
                z2 |= fVar.mo133671c();
            }
            int intValue2 = this.f103457y.intValue();
            if (intValue2 != 1) {
                if (intValue2 == 2 && z) {
                    this.f103439g = C40541e0.m164991g(this.f103441i, this, this.f103437e, this.f103442j, this.f103448p, this.f103450r, this.f103452t, this.f103453u, this.f103454v, this.f103456x);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.f103439g = new C40596n1(this.f103441i, this, this.f103437e, this.f103442j, this.f103448p, this.f103450r, this.f103452t, this.f103453u, this.f103454v, this.f103456x, this);
        }
    }

    /* renamed from: T */
    public final void mo133972T(C40507i iVar, C40655z zVar, boolean z) {
        C40822a.f103938d.mo134501a(iVar).mo133787h(new C40554g1(this, zVar, z, iVar));
    }

    @GuardedBy("mLock")
    /* renamed from: U */
    public final void mo133973U() {
        this.f103438f.mo134464b();
        ((C40555g2) C40843u.m166202l(this.f103439g)).mo133882l();
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo133867a(@C0363p0 Bundle bundle) {
        while (!this.f103443k.isEmpty()) {
            mo133753m((C40538e.C40539a) this.f103443k.remove());
        }
        this.f103438f.mo134466d(bundle);
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final void mo133868b(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f103444l) {
                this.f103444l = true;
                if (this.f103449q == null && !C40975e.m166604c()) {
                    try {
                        this.f103449q = this.f103448p.mo134198G(this.f103441i.getApplicationContext(), new C40566i1(this));
                    } catch (SecurityException unused) {
                    }
                }
                C40560h1 h1Var = this.f103447o;
                h1Var.sendMessageDelayed(h1Var.obtainMessage(1), this.f103445m);
                C40560h1 h1Var2 = this.f103447o;
                h1Var2.sendMessageDelayed(h1Var2.obtainMessage(2), this.f103446n);
            }
            i = 1;
        }
        for (BasePendingResult l : (BasePendingResult[]) this.f103435A.f103465a.toArray(new BasePendingResult[0])) {
            l.mo133790l(C40574j3.f103464c);
        }
        this.f103438f.mo134467e(i);
        this.f103438f.mo134463a();
        if (i == 2) {
            mo133973U();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo133869c(ConnectionResult connectionResult) {
        if (!this.f103448p.mo134224l(this.f103441i, connectionResult.mo133591M())) {
            mo133970R();
        }
        if (!this.f103444l) {
            this.f103438f.mo134465c(connectionResult);
            this.f103438f.mo134463a();
        }
    }

    /* renamed from: d */
    public final ConnectionResult mo133745d() {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166209s(z, "blockingConnect must not be called on the UI thread");
        this.f103437e.lock();
        try {
            if (this.f103440h >= 0) {
                if (this.f103457y == null) {
                    z2 = false;
                }
                C40843u.m166209s(z2, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f103457y;
                if (num == null) {
                    this.f103457y = Integer.valueOf(m165147K(this.f103450r.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            mo133971S(((Integer) C40843u.m166202l(this.f103457y)).intValue());
            this.f103438f.mo134464b();
            return ((C40555g2) C40843u.m166202l(this.f103439g)).mo133881k();
        } finally {
            this.f103437e.unlock();
        }
    }

    /* renamed from: e */
    public final ConnectionResult mo133746e(long j, @C0359n0 TimeUnit timeUnit) {
        boolean z;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166209s(z, "blockingConnect must not be called on the UI thread");
        C40843u.m166203m(timeUnit, "TimeUnit must not be null");
        this.f103437e.lock();
        try {
            Integer num = this.f103457y;
            if (num == null) {
                this.f103457y = Integer.valueOf(m165147K(this.f103450r.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo133971S(((Integer) C40843u.m166202l(this.f103457y)).intValue());
            this.f103438f.mo134464b();
            return ((C40555g2) C40843u.m166202l(this.f103439g)).mo133890t(j, timeUnit);
        } finally {
            this.f103437e.unlock();
        }
    }

    /* renamed from: f */
    public final C40663m<Status> mo133747f() {
        C40843u.m166209s(mo133760u(), "GoogleApiClient is not connected yet.");
        Integer num = this.f103457y;
        boolean z = true;
        if (num != null && num.intValue() == 2) {
            z = false;
        }
        C40843u.m166209s(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C40655z zVar = new C40655z((C40507i) this);
        if (this.f103450r.containsKey(C40822a.f103935a)) {
            mo133972T(this, zVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C40534d1 d1Var = new C40534d1(this, atomicReference, zVar);
            C40548f1 f1Var = new C40548f1(this, zVar);
            C40507i.C40508a aVar = new C40507i.C40508a(this.f103441i);
            aVar.mo133766a(C40822a.f103936b);
            aVar.mo133770e(d1Var);
            aVar.mo133771f(f1Var);
            aVar.mo133778m(this.f103447o);
            C40507i h = aVar.mo133773h();
            atomicReference.set(h);
            h.mo133748g();
        }
        return zVar;
    }

    /* renamed from: g */
    public final void mo133748g() {
        boolean z;
        this.f103437e.lock();
        try {
            int i = 2;
            boolean z2 = false;
            if (this.f103440h >= 0) {
                if (this.f103457y != null) {
                    z = true;
                } else {
                    z = false;
                }
                C40843u.m166209s(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f103457y;
                if (num == null) {
                    this.f103457y = Integer.valueOf(m165147K(this.f103450r.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) C40843u.m166202l(this.f103457y)).intValue();
            this.f103437e.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                C40843u.m166192b(z2, "Illegal sign-in mode: " + i);
                mo133971S(i);
                mo133973U();
            }
            z2 = true;
            C40843u.m166192b(z2, "Illegal sign-in mode: " + i);
            mo133971S(i);
            mo133973U();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f103437e.unlock();
        }
    }

    /* renamed from: h */
    public final void mo133749h(int i) {
        this.f103437e.lock();
        boolean z = true;
        if (!(i == 3 || i == 1)) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
            }
        }
        try {
            C40843u.m166192b(z, "Illegal sign-in mode: " + i);
            mo133971S(i);
            mo133973U();
        } finally {
            this.f103437e.unlock();
        }
    }

    /* renamed from: i */
    public final void mo133750i() {
        Lock lock;
        this.f103437e.lock();
        try {
            this.f103435A.mo133975b();
            C40555g2 g2Var = this.f103439g;
            if (g2Var != null) {
                g2Var.mo133885o();
            }
            this.f103455w.mo134001e();
            for (C40538e.C40539a aVar : this.f103443k) {
                aVar.mo133798v((C40568i3) null);
                aVar.mo133687f();
            }
            this.f103443k.clear();
            if (this.f103439g == null) {
                lock = this.f103437e;
            } else {
                mo133970R();
                this.f103438f.mo134463a();
                lock = this.f103437e;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f103437e.unlock();
            throw th;
        }
    }

    /* renamed from: j */
    public final void mo133751j(String str, @C0363p0 FileDescriptor fileDescriptor, PrintWriter printWriter, @C0363p0 String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f103441i);
        printWriter.append(str).append("mResuming=").print(this.f103444l);
        printWriter.append(" mWorkQueue.size()=").print(this.f103443k.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f103435A.f103465a.size());
        C40555g2 g2Var = this.f103439g;
        if (g2Var != null) {
            g2Var.mo133887q(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: l */
    public final <A extends C40477a.C40479b, R extends C40669r, T extends C40538e.C40539a<R, A>> T mo133752l(@C0359n0 T t) {
        String str;
        Lock lock;
        C40477a<?> x = t.mo133873x();
        boolean containsKey = this.f103450r.containsKey(t.mo133874y());
        if (x != null) {
            str = x.mo133663d();
        } else {
            str = "the API";
        }
        C40843u.m166192b(containsKey, "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.f103437e.lock();
        try {
            C40555g2 g2Var = this.f103439g;
            if (g2Var == null) {
                this.f103443k.add(t);
                lock = this.f103437e;
            } else {
                t = g2Var.mo133891u(t);
                lock = this.f103437e;
            }
            lock.unlock();
            return t;
        } catch (Throwable th) {
            this.f103437e.unlock();
            throw th;
        }
    }

    /* renamed from: m */
    public final <A extends C40477a.C40479b, T extends C40538e.C40539a<? extends C40669r, A>> T mo133753m(@C0359n0 T t) {
        String str;
        Lock lock;
        C40477a<?> x = t.mo133873x();
        boolean containsKey = this.f103450r.containsKey(t.mo133874y());
        if (x != null) {
            str = x.mo133663d();
        } else {
            str = "the API";
        }
        C40843u.m166192b(containsKey, "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.f103437e.lock();
        try {
            C40555g2 g2Var = this.f103439g;
            if (g2Var != null) {
                if (this.f103444l) {
                    this.f103443k.add(t);
                    while (!this.f103443k.isEmpty()) {
                        C40538e.C40539a aVar = (C40538e.C40539a) this.f103443k.remove();
                        this.f103435A.mo133974a(aVar);
                        aVar.mo85730b(Status.f103186w);
                    }
                    lock = this.f103437e;
                } else {
                    t = g2Var.mo133893w(t);
                    lock = this.f103437e;
                }
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f103437e.unlock();
            throw th;
        }
    }

    @C0359n0
    /* renamed from: o */
    public final <C extends C40477a.C40489f> C mo133754o(@C0359n0 C40477a.C40480c<C> cVar) {
        C c = (C40477a.C40489f) this.f103450r.get(cVar);
        C40843u.m166203m(c, "Appropriate Api was not requested.");
        return c;
    }

    @C0359n0
    /* renamed from: p */
    public final ConnectionResult mo133755p(@C0359n0 C40477a<?> aVar) {
        ConnectionResult connectionResult;
        Lock lock;
        this.f103437e.lock();
        try {
            if (!mo133760u()) {
                if (!this.f103444l) {
                    throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
                }
            }
            if (this.f103450r.containsKey(aVar.mo133661b())) {
                ConnectionResult r = ((C40555g2) C40843u.m166202l(this.f103439g)).mo133888r(aVar);
                if (r != null) {
                    return r;
                }
                if (this.f103444l) {
                    connectionResult = ConnectionResult.f103129S0;
                    lock = this.f103437e;
                } else {
                    mo133969M();
                    String d = aVar.mo133663d();
                    Log.wtf("GoogleApiClientImpl", d + " requested in getConnectionResult is not connected but is not present in the failed  connections map", new Exception());
                    connectionResult = new ConnectionResult(8, (PendingIntent) null);
                    lock = this.f103437e;
                }
                lock.unlock();
                return connectionResult;
            }
            String d2 = aVar.mo133663d();
            throw new IllegalArgumentException(d2 + " was never registered with GoogleApiClient");
        } finally {
            this.f103437e.unlock();
        }
    }

    /* renamed from: q */
    public final Context mo133756q() {
        return this.f103441i;
    }

    /* renamed from: r */
    public final Looper mo133757r() {
        return this.f103442j;
    }

    /* renamed from: s */
    public final boolean mo133758s(@C0359n0 C40477a<?> aVar) {
        return this.f103450r.containsKey(aVar.mo133661b());
    }

    /* renamed from: t */
    public final boolean mo133759t(@C0359n0 C40477a<?> aVar) {
        C40477a.C40489f fVar;
        if (mo133760u() && (fVar = (C40477a.C40489f) this.f103450r.get(aVar.mo133661b())) != null && fVar.mo133669a()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final boolean mo133760u() {
        C40555g2 g2Var = this.f103439g;
        return g2Var != null && g2Var.mo133892v();
    }

    /* renamed from: v */
    public final boolean mo133761v() {
        C40555g2 g2Var = this.f103439g;
        return g2Var != null && g2Var.mo133889s();
    }

    /* renamed from: w */
    public final boolean mo133762w(@C0359n0 C40507i.C40509b bVar) {
        return this.f103438f.mo134473j(bVar);
    }

    /* renamed from: x */
    public final boolean mo133763x(@C0359n0 C40507i.C40510c cVar) {
        return this.f103438f.mo134474k(cVar);
    }

    /* renamed from: y */
    public final boolean mo133764y(C40640w wVar) {
        C40555g2 g2Var = this.f103439g;
        return g2Var != null && g2Var.mo133886p(wVar);
    }

    /* renamed from: z */
    public final void mo133765z() {
        C40555g2 g2Var = this.f103439g;
        if (g2Var != null) {
            g2Var.mo133884n();
        }
    }
}
