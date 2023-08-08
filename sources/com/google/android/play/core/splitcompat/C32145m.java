package com.google.android.play.core.splitcompat;

import android.support.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.m */
public final class C32145m {

    /* renamed from: b */
    public static final Pattern f78377b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: c */
    public static final /* synthetic */ int f78378c = 0;

    /* renamed from: a */
    public final C32137e f78379a;

    public C32145m(C32137e eVar) throws IOException {
        this.f78379a = eVar;
    }

    /* renamed from: d */
    public static /* synthetic */ Set m130095d(C32145m mVar, Set set, C32151s sVar, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        mVar.mo92909f(sVar, set, new C32141i(hashSet, sVar, zipFile));
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e1 A[SYNTHETIC, Splitter:B:31:0x00e1] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m130096e(com.google.android.play.core.splitcompat.C32151s r12, com.google.android.play.core.splitcompat.C32142j r13) throws java.io.IOException {
        /*
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00dd }
            java.io.File r1 = r12.mo92914a()     // Catch:{ IOException -> 0x00dd }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00dd }
            java.lang.String r12 = r12.mo92915b()     // Catch:{ IOException -> 0x00db }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IOException -> 0x00db }
            r1.<init>()     // Catch:{ IOException -> 0x00db }
            java.util.Enumeration r2 = r0.entries()     // Catch:{ IOException -> 0x00db }
        L_0x0016:
            boolean r3 = r2.hasMoreElements()     // Catch:{ IOException -> 0x00db }
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.nextElement()     // Catch:{ IOException -> 0x00db }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ IOException -> 0x00db }
            java.lang.String r7 = r3.getName()     // Catch:{ IOException -> 0x00db }
            java.util.regex.Pattern r8 = f78377b     // Catch:{ IOException -> 0x00db }
            java.util.regex.Matcher r7 = r8.matcher(r7)     // Catch:{ IOException -> 0x00db }
            boolean r8 = r7.matches()     // Catch:{ IOException -> 0x00db }
            if (r8 == 0) goto L_0x0016
            java.lang.String r8 = r7.group(r6)     // Catch:{ IOException -> 0x00db }
            java.lang.String r7 = r7.group(r4)     // Catch:{ IOException -> 0x00db }
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x00db }
            r9[r5] = r12     // Catch:{ IOException -> 0x00db }
            r9[r6] = r7     // Catch:{ IOException -> 0x00db }
            r9[r4] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r4 = "NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'"
            java.lang.String.format(r4, r9)     // Catch:{ IOException -> 0x00db }
            java.lang.Object r4 = r1.get(r8)     // Catch:{ IOException -> 0x00db }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ IOException -> 0x00db }
            if (r4 != 0) goto L_0x005b
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ IOException -> 0x00db }
            r4.<init>()     // Catch:{ IOException -> 0x00db }
            r1.put(r8, r4)     // Catch:{ IOException -> 0x00db }
        L_0x005b:
            com.google.android.play.core.splitcompat.l r5 = new com.google.android.play.core.splitcompat.l     // Catch:{ IOException -> 0x00db }
            r5.<init>(r3, r7)     // Catch:{ IOException -> 0x00db }
            r4.add(r5)     // Catch:{ IOException -> 0x00db }
            goto L_0x0016
        L_0x0064:
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ IOException -> 0x00db }
            r12.<init>()     // Catch:{ IOException -> 0x00db }
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch:{ IOException -> 0x00db }
            int r3 = r2.length     // Catch:{ IOException -> 0x00db }
            r7 = r5
        L_0x006d:
            if (r7 >= r3) goto L_0x00cb
            r8 = r2[r7]     // Catch:{ IOException -> 0x00db }
            boolean r9 = r1.containsKey(r8)     // Catch:{ IOException -> 0x00db }
            if (r9 == 0) goto L_0x00bf
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x00db }
            r9[r5] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI"
            java.lang.String.format(r10, r9)     // Catch:{ IOException -> 0x00db }
            java.lang.Object r9 = r1.get(r8)     // Catch:{ IOException -> 0x00db }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ IOException -> 0x00db }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x00db }
        L_0x008a:
            boolean r10 = r9.hasNext()     // Catch:{ IOException -> 0x00db }
            if (r10 == 0) goto L_0x00c8
            java.lang.Object r10 = r9.next()     // Catch:{ IOException -> 0x00db }
            com.google.android.play.core.splitcompat.l r10 = (com.google.android.play.core.splitcompat.C32144l) r10     // Catch:{ IOException -> 0x00db }
            java.lang.String r11 = r10.f78375a     // Catch:{ IOException -> 0x00db }
            boolean r11 = r12.containsKey(r11)     // Catch:{ IOException -> 0x00db }
            if (r11 == 0) goto L_0x00ac
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = r10.f78375a     // Catch:{ IOException -> 0x00db }
            r11[r5] = r10     // Catch:{ IOException -> 0x00db }
            r11[r6] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI"
            java.lang.String.format(r10, r11)     // Catch:{ IOException -> 0x00db }
            goto L_0x008a
        L_0x00ac:
            java.lang.String r11 = r10.f78375a     // Catch:{ IOException -> 0x00db }
            r12.put(r11, r10)     // Catch:{ IOException -> 0x00db }
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = r10.f78375a     // Catch:{ IOException -> 0x00db }
            r11[r5] = r10     // Catch:{ IOException -> 0x00db }
            r11[r6] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: using library %s for ABI %s"
            java.lang.String.format(r10, r11)     // Catch:{ IOException -> 0x00db }
            goto L_0x008a
        L_0x00bf:
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x00db }
            r9[r5] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r8 = "NativeLibraryExtractor: there are no native libraries for supported ABI %s"
            java.lang.String.format(r8, r9)     // Catch:{ IOException -> 0x00db }
        L_0x00c8:
            int r7 = r7 + 1
            goto L_0x006d
        L_0x00cb:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ IOException -> 0x00db }
            java.util.Collection r12 = r12.values()     // Catch:{ IOException -> 0x00db }
            r1.<init>(r12)     // Catch:{ IOException -> 0x00db }
            r13.mo92906a(r0, r1)     // Catch:{ IOException -> 0x00db }
            r0.close()     // Catch:{ IOException -> 0x00db }
            return
        L_0x00db:
            r12 = move-exception
            goto L_0x00df
        L_0x00dd:
            r12 = move-exception
            r0 = 0
        L_0x00df:
            if (r0 == 0) goto L_0x00e9
            r0.close()     // Catch:{ IOException -> 0x00e5 }
            goto L_0x00e9
        L_0x00e5:
            r13 = move-exception
            com.google.android.play.core.internal.C32029a1.m129765a(r12, r13)
        L_0x00e9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C32145m.m130096e(com.google.android.play.core.splitcompat.s, com.google.android.play.core.splitcompat.j):void");
    }

    /* renamed from: a */
    public final Set<File> mo92907a() throws IOException {
        Set<C32151s> i = this.f78379a.mo92894i();
        for (String next : this.f78379a.mo92895j()) {
            Iterator<C32151s> it = i.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo92915b().equals(next)) {
                        break;
                    }
                } else {
                    String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", new Object[]{next});
                    this.f78379a.mo92896k(next);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (C32151s next2 : i) {
            HashSet hashSet2 = new HashSet();
            m130096e(next2, new C32140h(this, hashSet2, next2));
            for (File next3 : this.f78379a.mo92898m(next2.mo92915b())) {
                if (!hashSet2.contains(next3)) {
                    String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", new Object[]{next3.getAbsolutePath(), next2.mo92915b(), next2.mo92914a().getAbsolutePath()});
                    this.f78379a.mo92897l(next3);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    @Nullable
    /* renamed from: b */
    public final Set<File> mo92908b(C32151s sVar) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        m130096e(sVar, new C32139g(this, sVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    /* renamed from: f */
    public final void mo92909f(C32151s sVar, Set<C32144l> set, C32143k kVar) throws IOException {
        for (C32144l next : set) {
            File e = this.f78379a.mo92890e(sVar.mo92915b(), next.f78375a);
            boolean z = false;
            if (e.exists() && e.length() == next.f78376b.getSize()) {
                z = true;
            }
            kVar.mo92905a(next, e, z);
        }
    }
}
