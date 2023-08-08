package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.c1 */
public final class C33172c1 {
    @C0344h1

    /* renamed from: d */
    public static final String f80522d = "com.google.android.gms.appid";
    @C0344h1

    /* renamed from: e */
    public static final String f80523e = "topic_operation_queue";

    /* renamed from: f */
    public static final String f80524f = ",";
    @C0323b0("TopicsStore.class")

    /* renamed from: g */
    public static WeakReference<C33172c1> f80525g;

    /* renamed from: a */
    public final SharedPreferences f80526a;

    /* renamed from: b */
    public C33258y0 f80527b;

    /* renamed from: c */
    public final Executor f80528c;

    public C33172c1(SharedPreferences sharedPreferences, Executor executor) {
        this.f80528c = executor;
        this.f80526a = sharedPreferences;
    }

    @C0344h1
    /* renamed from: b */
    public static synchronized void m133806b() {
        synchronized (C33172c1.class) {
            WeakReference<C33172c1> weakReference = f80525g;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
    }

    @C0348i1
    /* renamed from: d */
    public static synchronized C33172c1 m133807d(Context context, Executor executor) {
        C33172c1 c1Var;
        synchronized (C33172c1.class) {
            WeakReference<C33172c1> weakReference = f80525g;
            if (weakReference != null) {
                c1Var = weakReference.get();
            } else {
                c1Var = null;
            }
            if (c1Var == null) {
                c1Var = new C33172c1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c1Var.mo96048g();
                f80525g = new WeakReference<>(c1Var);
            }
        }
        return c1Var;
    }

    /* renamed from: a */
    public synchronized boolean mo96044a(C33168b1 b1Var) {
        return this.f80527b.mo96218b(b1Var.mo96035e());
    }

    /* renamed from: c */
    public synchronized void mo96045c() {
        this.f80527b.mo96223g();
    }

    @C0363p0
    /* renamed from: e */
    public synchronized C33168b1 mo96046e() {
        return C33168b1.m133792a(this.f80527b.mo96227l());
    }

    @C0359n0
    /* renamed from: f */
    public synchronized List<C33168b1> mo96047f() {
        ArrayList arrayList;
        List<String> t = this.f80527b.mo96235t();
        arrayList = new ArrayList(t.size());
        for (String a : t) {
            arrayList.add(C33168b1.m133792a(a));
        }
        return arrayList;
    }

    @C0348i1
    /* renamed from: g */
    public final synchronized void mo96048g() {
        this.f80527b = C33258y0.m134118j(this.f80526a, f80523e, ",", this.f80528c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @androidx.annotation.C0363p0
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.firebase.messaging.C33168b1 mo96049h() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.firebase.messaging.y0 r0 = r1.f80527b     // Catch:{ NoSuchElementException -> 0x0010, all -> 0x000d }
            java.lang.String r0 = r0.mo96228m()     // Catch:{ NoSuchElementException -> 0x0010, all -> 0x000d }
            com.google.firebase.messaging.b1 r0 = com.google.firebase.messaging.C33168b1.m133792a(r0)     // Catch:{ NoSuchElementException -> 0x0010, all -> 0x000d }
            monitor-exit(r1)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0010:
            monitor-exit(r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C33172c1.mo96049h():com.google.firebase.messaging.b1");
    }

    /* renamed from: i */
    public synchronized boolean mo96050i(C33168b1 b1Var) {
        return this.f80527b.mo96229n(b1Var.mo96035e());
    }
}
