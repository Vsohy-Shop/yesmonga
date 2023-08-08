package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.urbanairship.util.C9650g;

/* renamed from: com.appsflyer.internal.z */
public final class C22021z {
    static String AFInAppEventParameterName;
    @Nullable
    static Boolean values;
    public final String AFInAppEventType;
    private final boolean AFKeystoreWrapper;
    public final long valueOf;

    public C22021z() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c A[RETURN] */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.internal.C21996h AFInAppEventType(android.content.Context r5) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = AFInAppEventParameterName
            r2 = 1
            if (r1 == 0) goto L_0x000b
            r3 = r2
            goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            r4 = 0
            if (r3 == 0) goto L_0x0011
        L_0x000f:
            r5 = r4
            goto L_0x004e
        L_0x0011:
            java.lang.Boolean r1 = values
            if (r1 == 0) goto L_0x001b
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0027
        L_0x001b:
            java.lang.Boolean r1 = values
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "collectOAID"
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L_0x004c
        L_0x0027:
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch:{ all -> 0x0045 }
            r1.<init>(r5)     // Catch:{ all -> 0x0045 }
            boolean r5 = r0.isEnableLog()     // Catch:{ all -> 0x0045 }
            r1.setLogging(r5)     // Catch:{ all -> 0x0045 }
            com.appsflyer.oaid.OaidClient$Info r5 = r1.fetch()     // Catch:{ all -> 0x0045 }
            if (r5 == 0) goto L_0x004c
            java.lang.String r0 = r5.getId()     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r5 = r5.getLat()     // Catch:{ all -> 0x0043 }
            r1 = r0
            goto L_0x004e
        L_0x0043:
            r1 = r0
            goto L_0x0046
        L_0x0045:
            r1 = r4
        L_0x0046:
            java.lang.String r5 = "No OAID library"
            com.appsflyer.AFLogger.values(r5)
            goto L_0x000f
        L_0x004c:
            r5 = r4
            r1 = r5
        L_0x004e:
            if (r1 == 0) goto L_0x005c
            com.appsflyer.internal.h r0 = new com.appsflyer.internal.h
            r0.<init>(r1, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r0.AFInAppEventType = r5
            return r0
        L_0x005c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C22021z.AFInAppEventType(android.content.Context):com.appsflyer.internal.h");
    }

    @Nullable
    public static C21996h valueOf(ContentResolver contentResolver) {
        String str;
        if (!AFInAppEventType() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new C21996h(Settings.Secure.getString(contentResolver, C9650g.f26457t), Boolean.FALSE);
        }
        if (i == 2) {
            return null;
        }
        try {
            str = Settings.Secure.getString(contentResolver, C9650g.f26457t);
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            str = "";
        }
        return new C21996h(str, Boolean.TRUE);
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFKeystoreWrapper;
    }

    public C22021z(String str, long j, boolean z) {
        this.AFInAppEventType = str;
        this.valueOf = j;
        this.AFKeystoreWrapper = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r8.length() == 0) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088 A[SYNTHETIC, Splitter:B:33:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0124  */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.internal.C21996h valueOf(android.content.Context r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            java.lang.String r0 = "advertiserIdEnabled"
            java.lang.String r1 = "advertiserId"
            boolean r2 = AFInAppEventType()
            r3 = 0
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            java.lang.String r2 = "Trying to fetch GAID.."
            com.appsflyer.AFLogger.AFKeystoreWrapper(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.common.g r4 = com.google.android.gms.common.C40713g.m165640x()     // Catch:{ all -> 0x001f }
            int r4 = r4.mo134208j(r12)     // Catch:{ all -> 0x001f }
            goto L_0x0020
        L_0x001f:
            r4 = -1
        L_0x0020:
            r5 = 1
            r6 = 0
            com.google.android.gms.ads.identifier.a$a r7 = com.google.android.gms.ads.identifier.C40365a.m164196a(r12)     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0050
            java.lang.String r8 = r7.mo133250a()     // Catch:{ all -> 0x005d }
            boolean r7 = r7.mo133251b()     // Catch:{ all -> 0x004a }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x004a }
            if (r8 == 0) goto L_0x003c
            int r6 = r8.length()     // Catch:{ all -> 0x0044 }
            if (r6 != 0) goto L_0x0041
        L_0x003c:
            java.lang.String r6 = "emptyOrNull |"
            r2.append(r6)     // Catch:{ all -> 0x0044 }
        L_0x0041:
            r6 = r5
            goto L_0x00f0
        L_0x0044:
            r6 = move-exception
            r7 = r6
            r6 = r3
            r3 = r8
            r8 = r5
            goto L_0x0060
        L_0x004a:
            r7 = move-exception
            r11 = r6
            r6 = r3
            r3 = r8
            r8 = r11
            goto L_0x0060
        L_0x0050:
            java.lang.String r7 = "gpsAdInfo-null |"
            r2.append(r7)     // Catch:{ all -> 0x005d }
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
            java.lang.String r8 = "GpsAdIndo is null"
            r7.<init>(r8)     // Catch:{ all -> 0x005d }
            throw r7     // Catch:{ all -> 0x005d }
        L_0x005d:
            r7 = move-exception
            r8 = r6
            r6 = r3
        L_0x0060:
            java.lang.String r9 = r7.getMessage()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r9, r7)
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r2.append(r7)
            java.lang.String r7 = " |"
            r2.append(r7)
            java.lang.String r9 = "WARNING: Google Play Services is missing."
            com.appsflyer.AFLogger.AFKeystoreWrapper(r9)
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r10 = "enableGpsFallback"
            boolean r9 = r9.getBoolean(r10, r5)
            if (r9 == 0) goto L_0x00ec
            com.appsflyer.internal.ab$d r3 = com.appsflyer.internal.C21846ab.AFKeystoreWrapper(r12)     // Catch:{ all -> 0x00a4 }
            java.lang.String r6 = r3.valueOf     // Catch:{ all -> 0x00a4 }
            boolean r3 = r3.AFInAppEventParameterName()     // Catch:{ all -> 0x00a4 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00a4 }
            if (r6 == 0) goto L_0x009e
            int r9 = r6.length()     // Catch:{ all -> 0x00a4 }
            if (r9 != 0) goto L_0x00e9
        L_0x009e:
            java.lang.String r9 = "emptyOrNull (bypass) |"
            r2.append(r9)     // Catch:{ all -> 0x00a4 }
            goto L_0x00e9
        L_0x00a4:
            r3 = move-exception
            java.lang.String r6 = r3.getMessage()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r6, r3)
            java.lang.Class r6 = r3.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r2.append(r6)
            r2.append(r7)
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r6 = r6.getString(r1)
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r7 = r7.getString(r0)
            boolean r7 = java.lang.Boolean.parseBoolean(r7)
            r7 = r7 ^ r5
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r9 = r3.getLocalizedMessage()
            if (r9 == 0) goto L_0x00e1
            java.lang.String r3 = r3.getLocalizedMessage()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3)
            goto L_0x00e8
        L_0x00e1:
            java.lang.String r3 = r3.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3)
        L_0x00e8:
            r3 = r7
        L_0x00e9:
            r11 = r8
            r8 = r6
            goto L_0x00ef
        L_0x00ec:
            r11 = r8
            r8 = r3
            r3 = r6
        L_0x00ef:
            r6 = r11
        L_0x00f0:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r7 = "android.app.ReceiverRestrictedContext"
            boolean r12 = r12.equals(r7)
            if (r12 == 0) goto L_0x011e
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r8 = r12.getString(r1)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r12 = r12.getString(r0)
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            r12 = r12 ^ r5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)
            java.lang.String r12 = "context = android.app.ReceiverRestrictedContext |"
            r2.append(r12)
        L_0x011e:
            int r12 = r2.length()
            if (r12 <= 0) goto L_0x013d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.String r4 = ": "
            r12.append(r4)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            java.lang.String r2 = "gaidError"
            r13.put(r2, r12)
        L_0x013d:
            if (r8 == 0) goto L_0x0170
            if (r3 == 0) goto L_0x0170
            r13.put(r1, r8)
            boolean r12 = r3.booleanValue()
            r12 = r12 ^ r5
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r13.put(r0, r12)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            r12.set((java.lang.String) r1, (java.lang.String) r8)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r1 = r3.booleanValue()
            r1 = r1 ^ r5
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r12.set((java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r12 = "isGaidWithGps"
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r13.put(r12, r0)
        L_0x0170:
            com.appsflyer.internal.h r12 = new com.appsflyer.internal.h
            r12.<init>(r8, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C22021z.valueOf(android.content.Context, java.util.Map):com.appsflyer.internal.h");
    }

    private static boolean AFInAppEventType() {
        Boolean bool = values;
        return bool == null || bool.booleanValue();
    }
}
