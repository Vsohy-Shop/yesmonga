package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import androidx.camera.view.C1814q;
import com.google.android.play.core.internal.C32028a0;
import com.google.android.play.core.internal.C32035bf;
import com.google.android.play.core.internal.C32098w;
import com.google.android.play.core.internal.C32104y;
import com.google.android.play.core.splitinstall.C32179l;
import com.google.android.play.core.splitinstall.C32197s0;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.splitcompat.a */
public class C32133a {

    /* renamed from: d */
    public static final AtomicReference<C32133a> f78356d = new AtomicReference<>((Object) null);

    /* renamed from: a */
    public final C32137e f78357a;

    /* renamed from: b */
    public final Set<String> f78358b = new HashSet();

    /* renamed from: c */
    public final C32135c f78359c;

    public C32133a(Context context) {
        try {
            C32137e eVar = new C32137e(context);
            this.f78357a = eVar;
            this.f78359c = new C32135c(eVar);
        } catch (PackageManager.NameNotFoundException e) {
            throw new C32035bf((Throwable) e);
        }
    }

    /* renamed from: a */
    public static boolean m130052a(Context context) {
        return m130057g(context, true);
    }

    /* renamed from: b */
    public static boolean m130053b() {
        return f78356d.get() != null;
    }

    /* renamed from: e */
    public static boolean m130056e() {
        return false;
    }

    /* renamed from: g */
    public static boolean m130057g(Context context, boolean z) {
        if (m130056e()) {
            return false;
        }
        AtomicReference<C32133a> atomicReference = f78356d;
        boolean a = C1814q.m7242a(atomicReference, (Object) null, new C32133a(context));
        C32133a aVar = atomicReference.get();
        if (a) {
            C32179l.f78434a.mo92978b(new C32098w(context, C32150r.m130101a(), new C32104y(context, aVar.f78357a, new C32028a0(), (byte[]) null), aVar.f78357a, new C32150r()));
            C32197s0.m130249b(new C32146n(aVar));
            C32150r.m130101a().execute(new C32147o(context));
        }
        try {
            aVar.mo92882h(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m130058i(@NonNull Context context) {
        return m130057g(context, false);
    }

    /* renamed from: j */
    public static boolean m130059j(@NonNull Context context) {
        if (m130056e()) {
            return false;
        }
        C32133a aVar = f78356d.get();
        if (aVar != null) {
            return aVar.f78359c.mo92883a(context, aVar.mo92881f());
        }
        if (context.getApplicationContext() != null) {
            m130058i(context.getApplicationContext());
        }
        return m130058i(context);
    }

    /* renamed from: f */
    public final Set<String> mo92881f() {
        HashSet hashSet;
        synchronized (this.f78358b) {
            hashSet = new HashSet(this.f78358b);
        }
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0195 A[SYNTHETIC, Splitter:B:79:0x0195] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo92882h(android.content.Context r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r10 == 0) goto L_0x0009
            com.google.android.play.core.splitcompat.e r0 = r8.f78357a     // Catch:{ all -> 0x0223 }
            r0.mo92886a()     // Catch:{ all -> 0x0223 }
            goto L_0x0015
        L_0x0009:
            java.util.concurrent.Executor r0 = com.google.android.play.core.splitcompat.C32150r.m130101a()     // Catch:{ all -> 0x0223 }
            com.google.android.play.core.splitcompat.p r1 = new com.google.android.play.core.splitcompat.p     // Catch:{ all -> 0x0223 }
            r1.<init>(r8)     // Catch:{ all -> 0x0223 }
            r0.execute(r1)     // Catch:{ all -> 0x0223 }
        L_0x0015:
            java.lang.String r0 = r9.getPackageName()     // Catch:{ all -> 0x0223 }
            r1 = 0
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0211 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0211 }
            java.lang.String[] r2 = r2.splitNames     // Catch:{ NameNotFoundException -> 0x0211 }
            if (r2 != 0) goto L_0x002c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0211 }
            r2.<init>()     // Catch:{ NameNotFoundException -> 0x0211 }
            goto L_0x0030
        L_0x002c:
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ NameNotFoundException -> 0x0211 }
        L_0x0030:
            com.google.android.play.core.splitcompat.e r0 = r8.f78357a     // Catch:{ all -> 0x0223 }
            java.util.Set r0 = r0.mo92894i()     // Catch:{ all -> 0x0223 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0223 }
            r3.<init>()     // Catch:{ all -> 0x0223 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0223 }
        L_0x003f:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0223 }
            if (r5 == 0) goto L_0x0064
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0223 }
            com.google.android.play.core.splitcompat.s r5 = (com.google.android.play.core.splitcompat.C32151s) r5     // Catch:{ all -> 0x0223 }
            java.lang.String r5 = r5.mo92915b()     // Catch:{ all -> 0x0223 }
            boolean r6 = r2.contains(r5)     // Catch:{ all -> 0x0223 }
            if (r6 == 0) goto L_0x003f
            if (r10 == 0) goto L_0x005d
            com.google.android.play.core.splitcompat.e r6 = r8.f78357a     // Catch:{ all -> 0x0223 }
            r6.mo92899n(r5)     // Catch:{ all -> 0x0223 }
            goto L_0x0060
        L_0x005d:
            r3.add(r5)     // Catch:{ all -> 0x0223 }
        L_0x0060:
            r4.remove()     // Catch:{ all -> 0x0223 }
            goto L_0x003f
        L_0x0064:
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0223 }
            if (r4 != 0) goto L_0x0076
            java.util.concurrent.Executor r4 = com.google.android.play.core.splitcompat.C32150r.m130101a()     // Catch:{ all -> 0x0223 }
            com.google.android.play.core.splitcompat.q r5 = new com.google.android.play.core.splitcompat.q     // Catch:{ all -> 0x0223 }
            r5.<init>(r8, r3)     // Catch:{ all -> 0x0223 }
            r4.execute(r5)     // Catch:{ all -> 0x0223 }
        L_0x0076:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0223 }
            r3.<init>()     // Catch:{ all -> 0x0223 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0223 }
        L_0x007f:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0223 }
            if (r5 == 0) goto L_0x0099
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0223 }
            com.google.android.play.core.splitcompat.s r5 = (com.google.android.play.core.splitcompat.C32151s) r5     // Catch:{ all -> 0x0223 }
            java.lang.String r5 = r5.mo92915b()     // Catch:{ all -> 0x0223 }
            boolean r6 = com.google.android.play.core.splitinstall.C32199t0.m130252e(r5)     // Catch:{ all -> 0x0223 }
            if (r6 != 0) goto L_0x007f
            r3.add(r5)     // Catch:{ all -> 0x0223 }
            goto L_0x007f
        L_0x0099:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0223 }
        L_0x009d:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0223 }
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0223 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0223 }
            boolean r5 = com.google.android.play.core.splitinstall.C32199t0.m130252e(r4)     // Catch:{ all -> 0x0223 }
            if (r5 != 0) goto L_0x009d
            r3.add(r4)     // Catch:{ all -> 0x0223 }
            goto L_0x009d
        L_0x00b3:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0223 }
            int r4 = r0.size()     // Catch:{ all -> 0x0223 }
            r2.<init>(r4)     // Catch:{ all -> 0x0223 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0223 }
        L_0x00c0:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0223 }
            if (r4 == 0) goto L_0x00f6
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0223 }
            com.google.android.play.core.splitcompat.s r4 = (com.google.android.play.core.splitcompat.C32151s) r4     // Catch:{ all -> 0x0223 }
            java.lang.String r5 = r4.mo92915b()     // Catch:{ all -> 0x0223 }
            boolean r5 = com.google.android.play.core.splitinstall.C32199t0.m130251d(r5)     // Catch:{ all -> 0x0223 }
            if (r5 != 0) goto L_0x00f2
            java.lang.String r5 = r4.mo92915b()     // Catch:{ all -> 0x0223 }
            boolean r6 = com.google.android.play.core.splitinstall.C32199t0.m130251d(r5)     // Catch:{ all -> 0x0223 }
            if (r6 == 0) goto L_0x00e3
            java.lang.String r5 = ""
            goto L_0x00ec
        L_0x00e3:
            java.lang.String r6 = "\\.config\\."
            r7 = 2
            java.lang.String[] r5 = r5.split(r6, r7)     // Catch:{ all -> 0x0223 }
            r5 = r5[r1]     // Catch:{ all -> 0x0223 }
        L_0x00ec:
            boolean r5 = r3.contains(r5)     // Catch:{ all -> 0x0223 }
            if (r5 == 0) goto L_0x00c0
        L_0x00f2:
            r2.add(r4)     // Catch:{ all -> 0x0223 }
            goto L_0x00c0
        L_0x00f6:
            com.google.android.play.core.splitcompat.m r0 = new com.google.android.play.core.splitcompat.m     // Catch:{ all -> 0x0223 }
            com.google.android.play.core.splitcompat.e r1 = r8.f78357a     // Catch:{ all -> 0x0223 }
            r0.<init>(r1)     // Catch:{ all -> 0x0223 }
            com.google.android.play.core.internal.z r1 = com.google.android.play.core.internal.C32028a0.m129761a()     // Catch:{ all -> 0x0223 }
            java.lang.ClassLoader r3 = r9.getClassLoader()     // Catch:{ all -> 0x0223 }
            if (r10 == 0) goto L_0x010f
            java.util.Set r0 = r0.mo92907a()     // Catch:{ all -> 0x0223 }
            r1.mo92737b(r3, r0)     // Catch:{ all -> 0x0223 }
            goto L_0x012d
        L_0x010f:
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0223 }
        L_0x0113:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0223 }
            if (r5 == 0) goto L_0x012d
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0223 }
            com.google.android.play.core.splitcompat.s r5 = (com.google.android.play.core.splitcompat.C32151s) r5     // Catch:{ all -> 0x0223 }
            java.util.Set r5 = r0.mo92908b(r5)     // Catch:{ all -> 0x0223 }
            if (r5 != 0) goto L_0x0129
            r4.remove()     // Catch:{ all -> 0x0223 }
            goto L_0x0113
        L_0x0129:
            r1.mo92737b(r3, r5)     // Catch:{ all -> 0x0223 }
            goto L_0x0113
        L_0x012d:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0223 }
            r0.<init>()     // Catch:{ all -> 0x0223 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0223 }
        L_0x0136:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0223 }
            if (r5 == 0) goto L_0x019e
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0223 }
            com.google.android.play.core.splitcompat.s r5 = (com.google.android.play.core.splitcompat.C32151s) r5     // Catch:{ all -> 0x0223 }
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0191 }
            java.io.File r7 = r5.mo92914a()     // Catch:{ IOException -> 0x0191 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0191 }
            java.lang.String r7 = "classes.dex"
            java.util.zip.ZipEntry r7 = r6.getEntry(r7)     // Catch:{ IOException -> 0x018f }
            r6.close()     // Catch:{ IOException -> 0x018f }
            if (r7 == 0) goto L_0x0187
            com.google.android.play.core.splitcompat.e r6 = r8.f78357a     // Catch:{ all -> 0x0223 }
            java.lang.String r7 = r5.mo92915b()     // Catch:{ all -> 0x0223 }
            java.io.File r6 = r6.mo92893h(r7)     // Catch:{ all -> 0x0223 }
            java.io.File r7 = r5.mo92914a()     // Catch:{ all -> 0x0223 }
            boolean r6 = r1.mo92736a(r3, r6, r7, r10)     // Catch:{ all -> 0x0223 }
            if (r6 == 0) goto L_0x016b
            goto L_0x0187
        L_0x016b:
            java.io.File r5 = r5.mo92914a()     // Catch:{ all -> 0x0223 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0223 }
            int r6 = r5.length()     // Catch:{ all -> 0x0223 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0223 }
            int r6 = r6 + 24
            r7.<init>(r6)     // Catch:{ all -> 0x0223 }
            java.lang.String r6 = "split was not installed "
            r7.append(r6)     // Catch:{ all -> 0x0223 }
            r7.append(r5)     // Catch:{ all -> 0x0223 }
            goto L_0x0136
        L_0x0187:
            java.io.File r5 = r5.mo92914a()     // Catch:{ all -> 0x0223 }
            r0.add(r5)     // Catch:{ all -> 0x0223 }
            goto L_0x0136
        L_0x018f:
            r9 = move-exception
            goto L_0x0193
        L_0x0191:
            r9 = move-exception
            r6 = 0
        L_0x0193:
            if (r6 == 0) goto L_0x019d
            r6.close()     // Catch:{ IOException -> 0x0199 }
            goto L_0x019d
        L_0x0199:
            r10 = move-exception
            com.google.android.play.core.internal.C32029a1.m129765a(r9, r10)     // Catch:{ all -> 0x0223 }
        L_0x019d:
            throw r9     // Catch:{ all -> 0x0223 }
        L_0x019e:
            com.google.android.play.core.splitcompat.c r10 = r8.f78359c     // Catch:{ all -> 0x0223 }
            r10.mo92884b(r9, r0)     // Catch:{ all -> 0x0223 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0223 }
            r9.<init>()     // Catch:{ all -> 0x0223 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x0223 }
        L_0x01ac:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x0223 }
            if (r1 == 0) goto L_0x0203
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x0223 }
            com.google.android.play.core.splitcompat.s r1 = (com.google.android.play.core.splitcompat.C32151s) r1     // Catch:{ all -> 0x0223 }
            java.io.File r2 = r1.mo92914a()     // Catch:{ all -> 0x0223 }
            boolean r2 = r0.contains(r2)     // Catch:{ all -> 0x0223 }
            if (r2 == 0) goto L_0x01e6
            java.lang.String r2 = r1.mo92915b()     // Catch:{ all -> 0x0223 }
            int r3 = r2.length()     // Catch:{ all -> 0x0223 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0223 }
            int r3 = r3 + 30
            r4.<init>(r3)     // Catch:{ all -> 0x0223 }
            java.lang.String r3 = "Split '"
            r4.append(r3)     // Catch:{ all -> 0x0223 }
            r4.append(r2)     // Catch:{ all -> 0x0223 }
            java.lang.String r2 = "' installation emulated"
            r4.append(r2)     // Catch:{ all -> 0x0223 }
            java.lang.String r1 = r1.mo92915b()     // Catch:{ all -> 0x0223 }
            r9.add(r1)     // Catch:{ all -> 0x0223 }
            goto L_0x01ac
        L_0x01e6:
            java.lang.String r1 = r1.mo92915b()     // Catch:{ all -> 0x0223 }
            int r2 = r1.length()     // Catch:{ all -> 0x0223 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0223 }
            int r2 = r2 + 35
            r3.<init>(r2)     // Catch:{ all -> 0x0223 }
            java.lang.String r2 = "Split '"
            r3.append(r2)     // Catch:{ all -> 0x0223 }
            r3.append(r1)     // Catch:{ all -> 0x0223 }
            java.lang.String r1 = "' installation not emulated."
            r3.append(r1)     // Catch:{ all -> 0x0223 }
            goto L_0x01ac
        L_0x0203:
            java.util.Set<java.lang.String> r10 = r8.f78358b     // Catch:{ all -> 0x0223 }
            monitor-enter(r10)     // Catch:{ all -> 0x0223 }
            java.util.Set<java.lang.String> r0 = r8.f78358b     // Catch:{ all -> 0x020e }
            r0.addAll(r9)     // Catch:{ all -> 0x020e }
            monitor-exit(r10)     // Catch:{ all -> 0x020e }
            monitor-exit(r8)
            return
        L_0x020e:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x020e }
            throw r9     // Catch:{ all -> 0x0223 }
        L_0x0211:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x0223 }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0223 }
            r2[r1] = r0     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = "Cannot load data for application '%s'"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0223 }
            r10.<init>(r0, r9)     // Catch:{ all -> 0x0223 }
            throw r10     // Catch:{ all -> 0x0223 }
        L_0x0223:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C32133a.mo92882h(android.content.Context, boolean):void");
    }
}
