package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.h */
public final class C31006h {

    /* renamed from: a */
    public static volatile DynamiteModule f74278a;

    /* renamed from: b */
    public static volatile C31023w f74279b;

    /* renamed from: c */
    public static final Map<String, C30999a> f74280c = new HashMap();

    /* renamed from: d */
    public static final Map<String, C31000b> f74281d = new HashMap();

    /* renamed from: a */
    public static IBinder m124426a(Context context) {
        try {
            return C31025y.asInterface(m124432g(context).mo134842d("com.google.android.gms.tagmanager.TagManagerServiceProviderImpl")).getService(C41019f.m166811T6(context), m124433h(context), new C31005g()).asBinder();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: e */
    public static void m124430e(Context context) {
        C31023w i = m124434i(context);
        synchronized (C31006h.class) {
            try {
                i.initialize(C41019f.m166811T6(context), m124433h(context), new C31005g());
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public static void m124431f(Intent intent, Context context) {
        C31023w i = m124434i(context);
        synchronized (C31006h.class) {
            try {
                i.previewIntent(intent, C41019f.m166811T6(context), C41019f.m166811T6(f74278a.mo134841b()), m124433h(context), new C31005g());
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public static DynamiteModule m124432g(Context context) throws DynamiteModule.LoadingException {
        DynamiteModule dynamiteModule = f74278a;
        if (dynamiteModule == null) {
            synchronized (C31006h.class) {
                dynamiteModule = f74278a;
                if (f74278a == null) {
                    DynamiteModule e = DynamiteModule.m166879e(context, DynamiteModule.f104324k, ModuleDescriptor.MODULE_ID);
                    f74278a = e;
                    dynamiteModule = e;
                }
            }
        }
        return dynamiteModule;
    }

    /* renamed from: h */
    public static C31020t m124433h(Context context) {
        return new C31004f(AppMeasurement.getInstance(context));
    }

    /* renamed from: i */
    public static C31023w m124434i(Context context) {
        C31023w wVar = f74279b;
        if (wVar == null) {
            synchronized (C31006h.class) {
                wVar = f74279b;
                if (wVar == null) {
                    try {
                        C31023w asInterface = C31022v.asInterface(m124432g(context).mo134842d("com.google.android.gms.tagmanager.TagManagerApiImpl"));
                        f74279b = asInterface;
                        wVar = asInterface;
                    } catch (DynamiteModule.LoadingException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return wVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0026 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m124435j(java.lang.String r8, java.lang.Class<?> r9) {
        /*
            java.lang.String r0 = " doesn't have an accessible no-arg constructor"
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x0084 }
            java.lang.Class[] r3 = r2.getInterfaces()     // Catch:{ ClassNotFoundException -> 0x0084 }
            int r4 = r3.length     // Catch:{ ClassNotFoundException -> 0x0084 }
            r5 = 0
            r6 = r5
        L_0x000e:
            if (r6 >= r4) goto L_0x0057
            r7 = r3[r6]     // Catch:{ ClassNotFoundException -> 0x0084 }
            boolean r7 = r7.equals(r9)     // Catch:{ ClassNotFoundException -> 0x0084 }
            if (r7 == 0) goto L_0x0054
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x004a, SecurityException -> 0x0042, InvocationTargetException -> 0x0038, InstantiationException -> 0x002e, IllegalAccessException -> 0x0026 }
            java.lang.reflect.Constructor r9 = r2.getConstructor(r9)     // Catch:{ NoSuchMethodException -> 0x004a, SecurityException -> 0x0042, InvocationTargetException -> 0x0038, InstantiationException -> 0x002e, IllegalAccessException -> 0x0026 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ NoSuchMethodException -> 0x004a, SecurityException -> 0x0042, InvocationTargetException -> 0x0038, InstantiationException -> 0x002e, IllegalAccessException -> 0x0026 }
            java.lang.Object r8 = r9.newInstance(r2)     // Catch:{ NoSuchMethodException -> 0x004a, SecurityException -> 0x0042, InvocationTargetException -> 0x0038, InstantiationException -> 0x002e, IllegalAccessException -> 0x0026 }
            r1 = r8
            goto L_0x008d
        L_0x0026:
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x0084 }
            r9.concat(r0)     // Catch:{ ClassNotFoundException -> 0x0084 }
            goto L_0x008d
        L_0x002e:
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x0084 }
            java.lang.String r0 = " is an abstract class."
            r9.concat(r0)     // Catch:{ ClassNotFoundException -> 0x0084 }
            goto L_0x008d
        L_0x0038:
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x0084 }
            java.lang.String r0 = " construction threw an exception."
            r9.concat(r0)     // Catch:{ ClassNotFoundException -> 0x0084 }
            goto L_0x008d
        L_0x0042:
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x0084 }
            r9.concat(r0)     // Catch:{ ClassNotFoundException -> 0x0084 }
            goto L_0x008d
        L_0x004a:
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x0084 }
            java.lang.String r0 = " doesn't have a valid no-arg constructor"
            r9.concat(r0)     // Catch:{ ClassNotFoundException -> 0x0084 }
            goto L_0x008d
        L_0x0054:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x0057:
            java.lang.String r9 = r9.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x0084 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x0084 }
            int r0 = r0.length()     // Catch:{ ClassNotFoundException -> 0x0084 }
            int r0 = r0 + 30
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ ClassNotFoundException -> 0x0084 }
            int r2 = r2.length()     // Catch:{ ClassNotFoundException -> 0x0084 }
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0084 }
            r2.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0084 }
            r2.append(r8)     // Catch:{ ClassNotFoundException -> 0x0084 }
            java.lang.String r0 = " doesn't implement "
            r2.append(r0)     // Catch:{ ClassNotFoundException -> 0x0084 }
            r2.append(r9)     // Catch:{ ClassNotFoundException -> 0x0084 }
            java.lang.String r9 = " interface."
            r2.append(r9)     // Catch:{ ClassNotFoundException -> 0x0084 }
            goto L_0x008d
        L_0x0084:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = " can't be found in the application."
            r8.concat(r9)
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C31006h.m124435j(java.lang.String, java.lang.Class):java.lang.Object");
    }
}
