package com.google.android.gms.maps.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.C40717i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.MapsInitializer;

/* renamed from: com.google.android.gms.maps.internal.p1 */
public final class C30519p1 {

    /* renamed from: a */
    public static final String f72971a = "p1";
    @C0363p0
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    public static Context f72972b;

    /* renamed from: c */
    public static C30528s1 f72973c;

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.maps.internal.C30528s1 m122785a(android.content.Context r3, @androidx.annotation.C0363p0 com.google.android.gms.maps.MapsInitializer.Renderer r4) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            com.google.android.gms.common.internal.C40843u.m166202l(r3)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "preferredRenderer: "
            r1.concat(r0)
            com.google.android.gms.maps.internal.s1 r0 = f72973c
            if (r0 != 0) goto L_0x0079
            r0 = 13400000(0xcc77c0, float:1.87774E-38)
            int r0 = com.google.android.gms.common.C40717i.m165693m(r3, r0)
            if (r0 != 0) goto L_0x0073
            android.content.Context r0 = m122787c(r3, r4)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.Object r0 = com.google.android.gms.common.internal.C40843u.m166202l(r0)     // Catch:{ ClassNotFoundException -> 0x006b }
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch:{ ClassNotFoundException -> 0x006b }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x006b }
            java.lang.Object r0 = m122788d(r0)     // Catch:{ ClassNotFoundException -> 0x006b }
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x0037
            r0 = 0
            goto L_0x004b
        L_0x0037:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.C30528s1
            if (r2 == 0) goto L_0x0045
            r0 = r1
            com.google.android.gms.maps.internal.s1 r0 = (com.google.android.gms.maps.internal.C30528s1) r0
            goto L_0x004b
        L_0x0045:
            com.google.android.gms.maps.internal.r1 r1 = new com.google.android.gms.maps.internal.r1
            r1.<init>(r0)
            r0 = r1
        L_0x004b:
            f72973c = r0
            android.content.Context r3 = m122787c(r3, r4)     // Catch:{ RemoteException -> 0x0064 }
            r3.getClass()     // Catch:{ RemoteException -> 0x0064 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x0064 }
            com.google.android.gms.dynamic.d r3 = com.google.android.gms.dynamic.C41019f.m166811T6(r3)     // Catch:{ RemoteException -> 0x0064 }
            int r4 = com.google.android.gms.common.C40717i.f103702l     // Catch:{ RemoteException -> 0x0064 }
            r0.mo86225w5(r3, r4)     // Catch:{ RemoteException -> 0x0064 }
            com.google.android.gms.maps.internal.s1 r3 = f72973c
            return r3
        L_0x0064:
            r3 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r4 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r4.<init>(r3)
            throw r4
        L_0x006b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"
            r3.<init>(r4)
            throw r3
        L_0x0073:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r3 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r3.<init>(r0)
            throw r3
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.C30519p1.m122785a(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer):com.google.android.gms.maps.internal.s1");
    }

    /* renamed from: b */
    public static Context m122786b(Exception exc, Context context) {
        return C40717i.m165690i(context);
    }

    @C0363p0
    /* renamed from: c */
    public static Context m122787c(Context context, @C0363p0 MapsInitializer.Renderer renderer) {
        String str;
        Context context2;
        Context context3 = f72972b;
        if (context3 != null) {
            return context3;
        }
        context.getApplicationContext();
        if (renderer != null) {
            int ordinal = renderer.ordinal();
            if (ordinal == 0) {
                str = "com.google.android.gms.maps_legacy_dynamite";
            } else if (ordinal == 1) {
                str = "com.google.android.gms.maps_core_dynamite";
            }
            context2 = DynamiteModule.m166879e(context, DynamiteModule.f104319f, str).mo134841b();
            f72972b = context2;
            return context2;
        }
        str = "com.google.android.gms.maps_dynamite";
        try {
            context2 = DynamiteModule.m166879e(context, DynamiteModule.f104319f, str).mo134841b();
        } catch (Exception e) {
            if (!str.equals("com.google.android.gms.maps_dynamite")) {
                try {
                    context2 = DynamiteModule.m166879e(context, DynamiteModule.f104319f, "com.google.android.gms.maps_dynamite").mo134841b();
                } catch (Exception e2) {
                    context2 = m122786b(e2, context);
                }
            } else {
                context2 = m122786b(e, context);
            }
        }
        f72972b = context2;
        return context2;
    }

    /* renamed from: d */
    public static <T> T m122788d(Class cls) {
        String str;
        String str2;
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String name = cls.getName();
            if (name.length() != 0) {
                str = "Unable to instantiate the dynamic class ".concat(name);
            } else {
                str = new String("Unable to instantiate the dynamic class ");
            }
            throw new IllegalStateException(str);
        } catch (IllegalAccessException unused2) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str2 = "Unable to call the default constructor of ".concat(name2);
            } else {
                str2 = new String("Unable to call the default constructor of ");
            }
            throw new IllegalStateException(str2);
        }
    }
}
