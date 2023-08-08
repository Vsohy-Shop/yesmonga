package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.module.e */
public final class C22542e {

    /* renamed from: b */
    public static final String f57755b = "ManifestParser";

    /* renamed from: c */
    public static final String f57756c = "GlideModule";

    /* renamed from: a */
    public final Context f57757a;

    public C22542e(Context context) {
        this.f57757a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.module.C22540c m102182b(java.lang.String r3) {
        /*
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0044 }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ InstantiationException -> 0x0021, IllegalAccessException -> 0x001c, NoSuchMethodException -> 0x0017, InvocationTargetException -> 0x0012 }
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r1)     // Catch:{ InstantiationException -> 0x0021, IllegalAccessException -> 0x001c, NoSuchMethodException -> 0x0017, InvocationTargetException -> 0x0012 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ InstantiationException -> 0x0021, IllegalAccessException -> 0x001c, NoSuchMethodException -> 0x0017, InvocationTargetException -> 0x0012 }
            java.lang.Object r3 = r1.newInstance(r0)     // Catch:{ InstantiationException -> 0x0021, IllegalAccessException -> 0x001c, NoSuchMethodException -> 0x0017, InvocationTargetException -> 0x0012 }
            goto L_0x0026
        L_0x0012:
            r0 = move-exception
            m102183c(r3, r0)
            goto L_0x0025
        L_0x0017:
            r0 = move-exception
            m102183c(r3, r0)
            goto L_0x0025
        L_0x001c:
            r0 = move-exception
            m102183c(r3, r0)
            goto L_0x0025
        L_0x0021:
            r0 = move-exception
            m102183c(r3, r0)
        L_0x0025:
            r3 = 0
        L_0x0026:
            boolean r0 = r3 instanceof com.bumptech.glide.module.C22540c
            if (r0 == 0) goto L_0x002d
            com.bumptech.glide.module.c r3 = (com.bumptech.glide.module.C22540c) r3
            return r3
        L_0x002d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected instanceof GlideModule, but found: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x0044:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find GlideModule implementation"
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.module.C22542e.m102182b(java.lang.String):com.bumptech.glide.module.c");
    }

    /* renamed from: c */
    public static void m102183c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public List<C22540c> mo66669a() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f57757a.getPackageManager().getApplicationInfo(this.f57757a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return arrayList;
            }
            if (Log.isLoggable(f57755b, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got app info metadata: ");
                sb.append(applicationInfo.metaData);
            }
            for (String next : applicationInfo.metaData.keySet()) {
                if (f57756c.equals(applicationInfo.metaData.get(next))) {
                    arrayList.add(m102182b(next));
                    if (Log.isLoggable(f57755b, 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Loaded Glide module: ");
                        sb2.append(next);
                    }
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
