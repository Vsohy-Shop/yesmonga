package com.urbanairship;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.UAirship;

public class Autopilot implements UAirship.C35444d {
    @C0359n0

    /* renamed from: a */
    public static final String f87243a = "com.urbanairship.autopilot";

    /* renamed from: b */
    public static final String f87244b = "Airship Autopilot";

    /* renamed from: c */
    public static boolean f87245c;

    /* renamed from: d */
    public static Autopilot f87246d;

    /* renamed from: c */
    public static synchronized void m146140c(@C0359n0 Application application) {
        synchronized (Autopilot.class) {
            m146141d(application, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006f, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m146141d(@androidx.annotation.C0359n0 android.app.Application r4, boolean r5) {
        /*
            java.lang.Class<com.urbanairship.Autopilot> r0 = com.urbanairship.Autopilot.class
            monitor-enter(r0)
            boolean r1 = com.urbanairship.UAirship.m146182M()     // Catch:{ all -> 0x0070 }
            if (r1 != 0) goto L_0x006e
            boolean r1 = com.urbanairship.UAirship.m146184O()     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x0010
            goto L_0x006e
        L_0x0010:
            com.urbanairship.C35446a.m146240a(r4)     // Catch:{ all -> 0x0070 }
            boolean r1 = f87245c     // Catch:{ all -> 0x0070 }
            if (r1 != 0) goto L_0x003a
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0038 }
            java.lang.String r2 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0038 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x0038 }
            if (r1 == 0) goto L_0x0036
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0038 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            com.urbanairship.Autopilot r1 = m146143g(r1)     // Catch:{ all -> 0x0070 }
            f87246d = r1     // Catch:{ all -> 0x0070 }
            r1 = 1
            f87245c = r1     // Catch:{ all -> 0x0070 }
            goto L_0x003a
        L_0x0036:
            monitor-exit(r0)
            return
        L_0x0038:
            monitor-exit(r0)
            return
        L_0x003a:
            com.urbanairship.Autopilot r1 = f87246d     // Catch:{ all -> 0x0070 }
            if (r1 != 0) goto L_0x0040
            monitor-exit(r0)
            return
        L_0x0040:
            if (r5 == 0) goto L_0x004a
            boolean r5 = r1.mo106195b(r4)     // Catch:{ all -> 0x0070 }
            if (r5 != 0) goto L_0x004a
            monitor-exit(r0)
            return
        L_0x004a:
            com.urbanairship.Autopilot r5 = f87246d     // Catch:{ all -> 0x0070 }
            boolean r5 = r5.mo106196h(r4)     // Catch:{ all -> 0x0070 }
            if (r5 != 0) goto L_0x0054
            monitor-exit(r0)
            return
        L_0x0054:
            com.urbanairship.Autopilot r5 = f87246d     // Catch:{ all -> 0x0070 }
            com.urbanairship.AirshipConfigOptions r5 = r5.mo32685f(r4)     // Catch:{ all -> 0x0070 }
            boolean r1 = com.urbanairship.UAirship.m146182M()     // Catch:{ all -> 0x0070 }
            if (r1 != 0) goto L_0x0064
            boolean r1 = com.urbanairship.UAirship.m146184O()     // Catch:{ all -> 0x0070 }
        L_0x0064:
            com.urbanairship.Autopilot r1 = f87246d     // Catch:{ all -> 0x0070 }
            com.urbanairship.UAirship.m146192b0(r4, r5, r1)     // Catch:{ all -> 0x0070 }
            r4 = 0
            f87246d = r4     // Catch:{ all -> 0x0070 }
            monitor-exit(r0)
            return
        L_0x006e:
            monitor-exit(r0)
            return
        L_0x0070:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.Autopilot.m146141d(android.app.Application, boolean):void");
    }

    /* renamed from: e */
    public static void m146142e(@C0359n0 Context context) {
        m146141d((Application) context.getApplicationContext(), false);
    }

    @C0363p0
    /* renamed from: g */
    public static Autopilot m146143g(@C0359n0 ApplicationInfo applicationInfo) {
        String string = applicationInfo.metaData.getString(f87243a);
        if (string == null) {
            return null;
        }
        try {
            return (Autopilot) Class.forName(string).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Class not found: ");
            sb.append(string);
            return null;
        } catch (InstantiationException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to create class: ");
            sb2.append(string);
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to access class: ");
            sb3.append(string);
            return null;
        }
    }

    /* renamed from: a */
    public void mo19438a(@C0359n0 UAirship uAirship) {
        C36059m.m148406b("Airship ready!", new Object[0]);
    }

    /* renamed from: b */
    public boolean mo106195b(@C0359n0 Context context) {
        return true;
    }

    @C0363p0
    /* renamed from: f */
    public AirshipConfigOptions mo32685f(@C0359n0 Context context) {
        return null;
    }

    /* renamed from: h */
    public boolean mo106196h(@C0359n0 Context context) {
        return true;
    }
}
