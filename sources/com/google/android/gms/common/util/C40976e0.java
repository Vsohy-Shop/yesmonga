package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.wrappers.C41008d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@C40473a
/* renamed from: com.google.android.gms.common.util.e0 */
public class C40976e0 {

    /* renamed from: a */
    public static final int f104218a = Process.myUid();

    /* renamed from: b */
    public static final Method f104219b;

    /* renamed from: c */
    public static final Method f104220c;

    /* renamed from: d */
    public static final Method f104221d;

    /* renamed from: e */
    public static final Method f104222e;

    /* renamed from: f */
    public static final Method f104223f;

    /* renamed from: g */
    public static final Method f104224g;

    /* renamed from: h */
    public static final Method f104225h;

    /* renamed from: i */
    public static final Method f104226i;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056 A[SYNTHETIC, Splitter:B:23:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009c  */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            f104218a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0018 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0018 }
            r5[r3] = r6     // Catch:{ Exception -> 0x0018 }
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r5 = r4
        L_0x0019:
            f104219b = r5
            boolean r5 = com.google.android.gms.common.util.C40996v.m166682g()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L_0x0031
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0031 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0031 }
            r5[r3] = r8     // Catch:{ Exception -> 0x0031 }
            r5[r2] = r6     // Catch:{ Exception -> 0x0031 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0032
        L_0x0031:
            r0 = r4
        L_0x0032:
            f104220c = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x003d }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x003d }
            goto L_0x003e
        L_0x003d:
            r0 = r4
        L_0x003e:
            f104221d = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x004d }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x004d }
            r0[r3] = r5     // Catch:{ Exception -> 0x004d }
            java.lang.String r5 = "get"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch:{ Exception -> 0x004d }
            goto L_0x004e
        L_0x004d:
            r0 = r4
        L_0x004e:
            f104222e = r0
            boolean r0 = com.google.android.gms.common.util.C40996v.m166682g()
            if (r0 == 0) goto L_0x0063
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0063 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0063 }
            r0[r3] = r5     // Catch:{ Exception -> 0x0063 }
            java.lang.String r5 = "getName"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0064
        L_0x0063:
            r0 = r4
        L_0x0064:
            f104223f = r0
            boolean r0 = com.google.android.gms.common.util.C40996v.m166690o()
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0075 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0076
        L_0x0075:
            r0 = r4
        L_0x0076:
            f104224g = r0
            boolean r0 = com.google.android.gms.common.util.C40996v.m166690o()
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0093 }
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0093 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0093 }
            r5[r3] = r7     // Catch:{ Exception -> 0x0093 }
            r5[r2] = r6     // Catch:{ Exception -> 0x0093 }
            java.lang.String r6 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r5)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0094
        L_0x0093:
            r0 = r4
        L_0x0094:
            f104225h = r0
            boolean r0 = com.google.android.gms.common.util.C40996v.m166690o()
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00a7 }
            java.lang.reflect.Method r4 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x00a7 }
            r4.setAccessible(r2)     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            f104226i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C40976e0.<clinit>():void");
    }

    @C40473a
    /* renamed from: a */
    public static void m166605a(@C0359n0 WorkSource workSource, int i, @C0359n0 String str) {
        Method method = f104220c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = f104219b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static WorkSource m166606b(@C0359n0 Context context, @C0359n0 String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c = C41008d.m166715a(context).mo134781c(str, 0);
                if (c == null) {
                    "Could not get applicationInfo from package: ".concat(str);
                    return null;
                }
                int i = c.uid;
                WorkSource workSource = new WorkSource();
                m166605a(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                "Could not find package: ".concat(str);
            }
        }
        return null;
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public static WorkSource m166607c(@C0359n0 Context context, @C0359n0 String str, @C0359n0 String str2) {
        Method method;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            return null;
        }
        int i = -1;
        try {
            ApplicationInfo c = C41008d.m166715a(context).mo134781c(str, 0);
            if (c == null) {
                "Could not get applicationInfo from package: ".concat(str);
            } else {
                i = c.uid;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            "Could not find package: ".concat(str);
        }
        if (i < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method2 = f104224g;
        if (method2 == null || (method = f104225h) == null) {
            m166605a(workSource, i, str);
        } else {
            try {
                Object invoke = method2.invoke(workSource, new Object[0]);
                int i2 = f104218a;
                if (i != i2) {
                    method.invoke(invoke, new Object[]{Integer.valueOf(i), str});
                }
                method.invoke(invoke, new Object[]{Integer.valueOf(i2), str2});
            } catch (Exception unused2) {
            }
        }
        return workSource;
    }

    @C40473a
    /* renamed from: d */
    public static int m166608d(@C0359n0 WorkSource workSource, int i) {
        Method method = f104222e;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[]{Integer.valueOf(i)});
                C40843u.m166202l(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public static String m166609e(@C0359n0 WorkSource workSource, int i) {
        Method method = f104223f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    @C40473a
    @C0359n0
    /* renamed from: f */
    public static List<String> m166610f(@C0359n0 WorkSource workSource) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (workSource == null) {
            i = 0;
        } else {
            i = m166613i(workSource);
        }
        if (i != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                String e = m166609e(workSource, i2);
                if (!C40966b0.m166592b(e)) {
                    C40843u.m166202l(e);
                    arrayList.add(e);
                }
            }
        }
        return arrayList;
    }

    @C40473a
    /* renamed from: g */
    public static boolean m166611g(@C0359n0 Context context) {
        if (context == null || context.getPackageManager() == null || C41008d.m166715a(context).mo134780b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    @C40473a
    /* renamed from: h */
    public static boolean m166612h(@C0359n0 WorkSource workSource) {
        Method method = f104226i;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C40843u.m166202l(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception unused) {
            }
        }
        if (m166613i(workSource) == 0) {
            return true;
        }
        return false;
    }

    @C40473a
    /* renamed from: i */
    public static int m166613i(@C0359n0 WorkSource workSource) {
        Method method = f104221d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C40843u.m166202l(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}
