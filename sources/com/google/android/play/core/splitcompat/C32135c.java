package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.play.core.internal.C32063k0;
import java.io.File;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitcompat.c */
public final class C32135c {

    /* renamed from: a */
    public final C32137e f78360a;

    public C32135c(C32137e eVar) {
        this.f78360a = eVar;
    }

    /* renamed from: c */
    public static final int m130062c(AssetManager assetManager, File file) {
        int intValue = ((Integer) C32063k0.m129848a(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        StringBuilder sb = new StringBuilder(39);
        sb.append("addAssetPath completed with ");
        sb.append(intValue);
        return intValue;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000f */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[Catch:{ Exception -> 0x0041, all -> 0x0039 }, LOOP:0: B:10:0x0018->B:12:0x001e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo92883a(android.content.Context r5, java.util.Set<java.lang.String> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()     // Catch:{ Exception -> 0x000e }
            android.os.StrictMode.allowThreadDiskReads()     // Catch:{ Exception -> 0x000f }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ Exception -> 0x000f }
            goto L_0x000f
        L_0x000c:
            r5 = move-exception
            goto L_0x0047
        L_0x000e:
            r0 = 0
        L_0x000f:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            r1.<init>()     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
        L_0x0018:
            boolean r2 = r6.hasNext()     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r6.next()     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            com.google.android.play.core.splitcompat.e r3 = r4.f78360a     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            java.io.File r2 = r3.mo92888c(r2)     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            r1.add(r2)     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            goto L_0x0018
        L_0x002e:
            r4.mo92884b(r5, r1)     // Catch:{ Exception -> 0x0041, all -> 0x0039 }
            if (r0 == 0) goto L_0x0036
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000c }
        L_0x0036:
            monitor-exit(r4)
            r5 = 1
            return r5
        L_0x0039:
            r5 = move-exception
            if (r0 != 0) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000c }
        L_0x0040:
            throw r5     // Catch:{ all -> 0x000c }
        L_0x0041:
            if (r0 == 0) goto L_0x0049
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x000c }
            goto L_0x0049
        L_0x0047:
            monitor-exit(r4)
            throw r5
        L_0x0049:
            monitor-exit(r4)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C32135c.mo92883a(android.content.Context, java.util.Set):boolean");
    }

    /* renamed from: b */
    public final synchronized void mo92884b(Context context, Set<File> set) {
        AssetManager assets = context.getAssets();
        for (File c : set) {
            m130062c(assets, c);
        }
    }
}
