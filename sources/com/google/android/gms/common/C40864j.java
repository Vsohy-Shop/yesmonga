package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40781l;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40968c0;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40975e;
import com.google.android.gms.common.util.C40986l;
import com.google.android.gms.common.util.C40996v;
import com.google.android.gms.common.wrappers.C41008d;
import com.google.firebase.messaging.C33202j0;
import com.google.zxing.client.android.C34651e;
import java.util.concurrent.atomic.AtomicBoolean;

@C40473a
@C40858y
/* renamed from: com.google.android.gms.common.j */
public class C40864j {
    @C40473a
    @Deprecated

    /* renamed from: a */
    public static final int f103985a = 12451000;
    @C40473a
    @C0359n0
    @Deprecated

    /* renamed from: b */
    public static final String f103986b = "com.google.android.gms";
    @C40473a
    @C0359n0

    /* renamed from: c */
    public static final String f103987c = "com.google.android.play.games";
    @C40473a
    @C0359n0

    /* renamed from: d */
    public static final String f103988d = "com.android.vending";
    @C40473a

    /* renamed from: e */
    public static final int f103989e = 39789;
    @C40473a

    /* renamed from: f */
    public static final int f103990f = 10436;
    @C40473a
    @C40974d0

    /* renamed from: g */
    public static final AtomicBoolean f103991g = new AtomicBoolean();

    /* renamed from: h */
    public static boolean f103992h = false;
    @C40974d0

    /* renamed from: i */
    public static boolean f103993i = false;

    /* renamed from: j */
    public static final AtomicBoolean f103994j = new AtomicBoolean();

    @C40473a
    @Deprecated
    /* renamed from: a */
    public static void m166227a(@C0359n0 Context context) {
        if (!f103991g.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(C33202j0.f80718b);
                if (notificationManager != null) {
                    notificationManager.cancel(f103990f);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @C40473a
    @C40858y
    /* renamed from: b */
    public static void m166228b() {
        f103994j.set(true);
    }

    @C40473a
    @Deprecated
    /* renamed from: c */
    public static void m166229c(@C0359n0 Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int k = C40715h.m165670i().mo134209k(context, i);
        if (k != 0) {
            Intent e = C40715h.m165670i().mo134205e(context, k, C34651e.f83829d);
            StringBuilder sb = new StringBuilder();
            sb.append("GooglePlayServices not available due to error ");
            sb.append(k);
            if (e == null) {
                throw new GooglePlayServicesNotAvailableException(k);
            }
            throw new GooglePlayServicesRepairableException(k, "Google Play Services not available", e);
        }
    }

    @C40473a
    @C40858y
    @Deprecated
    /* renamed from: d */
    public static int m166230d(@C0359n0 Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @C40473a
    @C40858y
    @Deprecated
    /* renamed from: e */
    public static int m166231e(@C0359n0 Context context) {
        C40843u.m166208r(true);
        return C40975e.m166602a(context, context.getPackageName());
    }

    @C0363p0
    @C40473a
    @Deprecated
    /* renamed from: f */
    public static PendingIntent m166232f(int i, @C0359n0 Context context, int i2) {
        return C40715h.m165670i().mo134206f(context, i, i2);
    }

    @C40473a
    @C0359n0
    @Deprecated
    @C40974d0
    /* renamed from: g */
    public static String m166233g(int i) {
        return ConnectionResult.m164642n0(i);
    }

    @C0363p0
    @C40858y
    @C40473a
    @Deprecated
    /* renamed from: h */
    public static Intent m166234h(int i) {
        return C40715h.m165670i().mo134205e((Context) null, i, (String) null);
    }

    @C0363p0
    @C40473a
    /* renamed from: i */
    public static Context m166235i(@C0359n0 Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @C0363p0
    @C40473a
    /* renamed from: j */
    public static Resources m166236j(@C0359n0 Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @C40473a
    @C40858y
    /* renamed from: k */
    public static boolean m166237k(@C0359n0 Context context) {
        if (!f103993i) {
            try {
                PackageInfo f = C41008d.m166715a(context).mo134784f("com.google.android.gms", 64);
                C40866k.m166252a(context);
                if (f == null || C40866k.m166254f(f, false) || !C40866k.m166254f(f, true)) {
                    f103992h = false;
                } else {
                    f103992h = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                f103993i = true;
            }
        }
        if (f103992h || !C40986l.m166649j()) {
            return true;
        }
        return false;
    }

    @C40473a
    @C40781l
    @Deprecated
    /* renamed from: l */
    public static int m166238l(@C0359n0 Context context) {
        return m166239m(context, f103985a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    @com.google.android.gms.common.annotation.C40473a
    @java.lang.Deprecated
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m166239m(@androidx.annotation.C0359n0 android.content.Context r9, int r10) {
        /*
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x0009 }
            int r1 = com.google.android.gms.common.C40924q.C40926b.common_google_play_services_unknown_issue     // Catch:{ all -> 0x0009 }
            r0.getString(r1)     // Catch:{ all -> 0x0009 }
        L_0x0009:
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0035
            java.util.concurrent.atomic.AtomicBoolean r0 = f103994j
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            int r0 = com.google.android.gms.common.internal.C40783l1.m165960a(r9)
            if (r0 == 0) goto L_0x002f
            int r2 = f103985a
            if (r0 != r2) goto L_0x0029
            goto L_0x0035
        L_0x0029:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r9.<init>()
            throw r9
        L_0x0035:
            boolean r0 = com.google.android.gms.common.util.C40986l.m166651l(r9)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0045
            boolean r0 = com.google.android.gms.common.util.C40986l.m166653n(r9)
            if (r0 != 0) goto L_0x0045
            r0 = r2
            goto L_0x0046
        L_0x0045:
            r0 = r3
        L_0x0046:
            if (r10 < 0) goto L_0x004a
            r4 = r2
            goto L_0x004b
        L_0x004a:
            r4 = r3
        L_0x004b:
            com.google.android.gms.common.internal.C40843u.m166191a(r4)
            java.lang.String r4 = r9.getPackageName()
            android.content.pm.PackageManager r5 = r9.getPackageManager()
            r6 = 9
            if (r0 == 0) goto L_0x006f
            java.lang.String r7 = "com.android.vending"
            r8 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r7 = r5.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x0063 }
            goto L_0x0070
        L_0x0063:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires the Google Play Store, but it is missing."
            r9.concat(r10)
        L_0x006c:
            r2 = r6
            goto L_0x0111
        L_0x006f:
            r7 = 0
        L_0x0070:
            r8 = 64
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r1, r8)     // Catch:{ NameNotFoundException -> 0x0108 }
            com.google.android.gms.common.C40866k.m166252a(r9)
            boolean r9 = com.google.android.gms.common.C40866k.m166254f(r8, r2)
            if (r9 != 0) goto L_0x0089
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but their signature is invalid."
            r9.concat(r10)
            goto L_0x006c
        L_0x0089:
            if (r0 == 0) goto L_0x009e
            com.google.android.gms.common.internal.C40843u.m166202l(r7)
            boolean r9 = com.google.android.gms.common.C40866k.m166254f(r7, r2)
            if (r9 != 0) goto L_0x009e
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature is invalid."
            r9.concat(r10)
            goto L_0x006c
        L_0x009e:
            if (r0 == 0) goto L_0x00ba
            if (r7 == 0) goto L_0x00ba
            android.content.pm.Signature[] r9 = r7.signatures
            r9 = r9[r3]
            android.content.pm.Signature[] r0 = r8.signatures
            r0 = r0[r3]
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00ba
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            r9.concat(r10)
            goto L_0x006c
        L_0x00ba:
            int r9 = r8.versionCode
            int r9 = com.google.android.gms.common.util.C40978f0.m166615a(r9)
            int r0 = com.google.android.gms.common.util.C40978f0.m166615a(r10)
            if (r9 >= r0) goto L_0x00e7
            int r9 = r8.versionCode
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Google Play services out of date for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ".  Requires "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " but found "
            r0.append(r10)
            r0.append(r9)
            r2 = 2
            goto L_0x0111
        L_0x00e7:
            android.content.pm.ApplicationInfo r9 = r8.applicationInfo
            if (r9 != 0) goto L_0x0101
            android.content.pm.ApplicationInfo r9 = r5.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x00f0 }
            goto L_0x0101
        L_0x00f0:
            r9 = move-exception
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r10 = r10.concat(r0)
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.util.Log.wtf(r0, r10, r9)
            goto L_0x0111
        L_0x0101:
            boolean r9 = r9.enabled
            if (r9 != 0) goto L_0x0107
            r2 = 3
            goto L_0x0111
        L_0x0107:
            return r3
        L_0x0108:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but they are missing."
            r9.concat(r10)
        L_0x0111:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C40864j.m166239m(android.content.Context, int):int");
    }

    @C40473a
    @Deprecated
    /* renamed from: n */
    public static boolean m166240n(@C0359n0 Context context, int i) {
        return C40968c0.m166599a(context, i);
    }

    @C40473a
    @C40858y
    @Deprecated
    /* renamed from: o */
    public static boolean m166241o(@C0359n0 Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m166247u(context, "com.google.android.gms");
        }
        return false;
    }

    @C40473a
    @C40858y
    @Deprecated
    /* renamed from: p */
    public static boolean m166242p(@C0359n0 Context context, int i) {
        if (i == 9) {
            return m166247u(context, "com.android.vending");
        }
        return false;
    }

    @C40473a
    @TargetApi(18)
    /* renamed from: q */
    public static boolean m166243q(@C0359n0 Context context) {
        if (!C40996v.m166682g()) {
            return false;
        }
        Object systemService = context.getSystemService(C38212b.f96784D);
        C40843u.m166202l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        if (applicationRestrictions == null || !C13758b.f33436b.equals(applicationRestrictions.getString("restricted_profile"))) {
            return false;
        }
        return true;
    }

    @C40858y
    @C40473a
    @Deprecated
    @C40974d0
    /* renamed from: r */
    public static boolean m166244r(@C0359n0 Context context) {
        return C40986l.m166645f(context);
    }

    @C40473a
    @Deprecated
    /* renamed from: s */
    public static boolean m166245s(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @C40473a
    @TargetApi(19)
    @Deprecated
    /* renamed from: t */
    public static boolean m166246t(@C0359n0 Context context, int i, @C0359n0 String str) {
        return C40968c0.m166600b(context, i, str);
    }

    @TargetApi(21)
    /* renamed from: u */
    public static boolean m166247u(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C40996v.m166685j()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (!applicationInfo.enabled || m166243q(context)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
