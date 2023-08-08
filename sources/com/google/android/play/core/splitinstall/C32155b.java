package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.play.core.internal.C32062k;
import java.io.File;

/* renamed from: com.google.android.play.core.splitinstall.b */
public class C32155b {

    /* renamed from: a */
    public static final C32062k f78393a = new C32062k("SplitInstallHelper");

    /* renamed from: a */
    public static void m130111a(@NonNull Context context, @NonNull String str) throws UnsatisfiedLinkError {
        synchronized (C32191p0.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e) {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                String mapLibraryName = System.mapLibraryName(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(mapLibraryName).length());
                sb.append(str2);
                sb.append("/");
                sb.append(mapLibraryName);
                String sb2 = sb.toString();
                if (new File(sb2).exists()) {
                    System.load(sb2);
                } else {
                    throw e;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m130112b(@android.support.annotation.NonNull android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 <= r1) goto L_0x0078
            r1 = 28
            if (r0 < r1) goto L_0x000b
            goto L_0x0078
        L_0x000b:
            com.google.android.play.core.internal.k r0 = f78393a
            java.lang.String r1 = "Calling dispatchPackageBroadcast"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.mo92778d(r1, r3)
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x006e }
            java.lang.String r3 = "currentActivityThread"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x006e }
            java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch:{ Exception -> 0x006e }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006e }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x006e }
            r6 = 0
            java.lang.Object r3 = r3.invoke(r6, r5)     // Catch:{ Exception -> 0x006e }
            java.lang.String r5 = "mAppThread"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r5)     // Catch:{ Exception -> 0x006e }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x006e }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x006e }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Exception -> 0x006e }
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x006e }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006e }
            r6[r2] = r7     // Catch:{ Exception -> 0x006e }
            java.lang.Class<java.lang.String[]> r7 = java.lang.String[].class
            r6[r4] = r7     // Catch:{ Exception -> 0x006e }
            java.lang.String r7 = "dispatchPackageBroadcast"
            java.lang.reflect.Method r3 = r3.getMethod(r7, r6)     // Catch:{ Exception -> 0x006e }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x006e }
            r6 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x006e }
            r5[r2] = r6     // Catch:{ Exception -> 0x006e }
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ Exception -> 0x006e }
            java.lang.String r8 = r8.getPackageName()     // Catch:{ Exception -> 0x006e }
            r6[r2] = r8     // Catch:{ Exception -> 0x006e }
            r5[r4] = r6     // Catch:{ Exception -> 0x006e }
            r3.invoke(r1, r5)     // Catch:{ Exception -> 0x006e }
            java.lang.String r8 = "Called dispatchPackageBroadcast"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x006e }
            r0.mo92778d(r8, r1)     // Catch:{ Exception -> 0x006e }
            return
        L_0x006e:
            r8 = move-exception
            com.google.android.play.core.internal.k r0 = f78393a
            java.lang.String r1 = "Update app info with dispatchPackageBroadcast failed!"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.mo92777c(r8, r1, r2)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.C32155b.m130112b(android.content.Context):void");
    }
}
