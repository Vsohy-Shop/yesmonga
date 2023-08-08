package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.y0 */
public final class C33258y0 {

    /* renamed from: a */
    public final SharedPreferences f80865a;

    /* renamed from: b */
    public final String f80866b;

    /* renamed from: c */
    public final String f80867c;
    @C0344h1
    @C0323b0("internalQueue")

    /* renamed from: d */
    public final ArrayDeque<String> f80868d = new ArrayDeque<>();

    /* renamed from: e */
    public final Executor f80869e;
    @C0323b0("internalQueue")

    /* renamed from: f */
    public boolean f80870f = false;

    public C33258y0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f80865a = sharedPreferences;
        this.f80866b = str;
        this.f80867c = str2;
        this.f80869e = executor;
    }

    @C0348i1
    /* renamed from: j */
    public static C33258y0 m134118j(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C33258y0 y0Var = new C33258y0(sharedPreferences, str, str2, executor);
        y0Var.mo96226k();
        return y0Var;
    }

    /* renamed from: b */
    public boolean mo96218b(@C0359n0 String str) {
        boolean f;
        if (TextUtils.isEmpty(str) || str.contains(this.f80867c)) {
            return false;
        }
        synchronized (this.f80868d) {
            f = mo96222f(this.f80868d.add(str));
        }
        return f;
    }

    @C0323b0("internalQueue")
    /* renamed from: c */
    public void mo96219c() {
        this.f80870f = true;
    }

    @C0344h1
    /* renamed from: d */
    public void mo96220d() {
        synchronized (this.f80868d) {
            mo96219c();
        }
    }

    @C0323b0("internalQueue")
    /* renamed from: e */
    public final String mo96221e(String str) {
        mo96222f(str != null);
        return str;
    }

    @C0323b0("internalQueue")
    /* renamed from: f */
    public final boolean mo96222f(boolean z) {
        if (z && !this.f80870f) {
            mo96234s();
        }
        return z;
    }

    /* renamed from: g */
    public void mo96223g() {
        synchronized (this.f80868d) {
            this.f80868d.clear();
            mo96222f(true);
        }
    }

    @C0323b0("internalQueue")
    /* renamed from: h */
    public void mo96224h() {
        this.f80870f = false;
        mo96234s();
    }

    @C0344h1
    /* renamed from: i */
    public void mo96225i() {
        synchronized (this.f80868d) {
            mo96224h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        return;
     */
    @androidx.annotation.C0348i1
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96226k() {
        /*
            r6 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r6.f80868d
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.String> r1 = r6.f80868d     // Catch:{ all -> 0x0041 }
            r1.clear()     // Catch:{ all -> 0x0041 }
            android.content.SharedPreferences r1 = r6.f80865a     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = r6.f80866b     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x0041 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x003f
            java.lang.String r2 = r6.f80867c     // Catch:{ all -> 0x0041 }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x0021
            goto L_0x003f
        L_0x0021:
            java.lang.String r2 = r6.f80867c     // Catch:{ all -> 0x0041 }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x0041 }
            int r2 = r1.length     // Catch:{ all -> 0x0041 }
            int r2 = r1.length     // Catch:{ all -> 0x0041 }
            r3 = 0
        L_0x002b:
            if (r3 >= r2) goto L_0x003d
            r4 = r1[r3]     // Catch:{ all -> 0x0041 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0041 }
            if (r5 != 0) goto L_0x003a
            java.util.ArrayDeque<java.lang.String> r5 = r6.f80868d     // Catch:{ all -> 0x0041 }
            r5.add(r4)     // Catch:{ all -> 0x0041 }
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C33258y0.mo96226k():void");
    }

    @C0363p0
    /* renamed from: l */
    public String mo96227l() {
        String peek;
        synchronized (this.f80868d) {
            peek = this.f80868d.peek();
        }
        return peek;
    }

    /* renamed from: m */
    public String mo96228m() {
        String e;
        synchronized (this.f80868d) {
            e = mo96221e(this.f80868d.remove());
        }
        return e;
    }

    /* renamed from: n */
    public boolean mo96229n(@C0363p0 Object obj) {
        boolean f;
        synchronized (this.f80868d) {
            f = mo96222f(this.f80868d.remove(obj));
        }
        return f;
    }

    @C0323b0("internalQueue")
    @C0359n0
    /* renamed from: o */
    public String mo96230o() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f80868d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f80867c);
        }
        return sb.toString();
    }

    @C0344h1
    /* renamed from: p */
    public String mo96231p() {
        String o;
        synchronized (this.f80868d) {
            o = mo96230o();
        }
        return o;
    }

    /* renamed from: q */
    public int mo96232q() {
        int size;
        synchronized (this.f80868d) {
            size = this.f80868d.size();
        }
        return size;
    }

    @C0348i1
    /* renamed from: r */
    public final void mo96233r() {
        synchronized (this.f80868d) {
            this.f80865a.edit().putString(this.f80866b, mo96230o()).commit();
        }
    }

    /* renamed from: s */
    public final void mo96234s() {
        this.f80869e.execute(new C33256x0(this));
    }

    @C0359n0
    /* renamed from: t */
    public List<String> mo96235t() {
        ArrayList arrayList;
        synchronized (this.f80868d) {
            arrayList = new ArrayList(this.f80868d);
        }
        return arrayList;
    }
}
