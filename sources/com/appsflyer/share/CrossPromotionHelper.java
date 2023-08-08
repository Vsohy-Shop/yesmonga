package com.appsflyer.share;

import android.content.Context;
import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.C21868ah;
import com.appsflyer.internal.C21978cz;
import com.appsflyer.internal.C21980da;
import com.urbanairship.util.C9650g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class CrossPromotionHelper {
    private static String valueOf = "https://%simpression.%s";

    /* renamed from: com.appsflyer.share.CrossPromotionHelper$a */
    public static class C22030a implements Runnable {
        private final String AFInAppEventParameterName;
        private final C21978cz AFKeystoreWrapper;
        private final WeakReference<Context> valueOf;
        private final boolean values;

        public C22030a(String str, C21978cz czVar, Context context, boolean z) {
            this.AFInAppEventParameterName = str;
            this.AFKeystoreWrapper = czVar;
            this.valueOf = new WeakReference<>(context);
            this.values = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2 A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                boolean r0 = r6.values
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x00b5 }
                java.lang.String r2 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00b5 }
                r1.<init>(r2)     // Catch:{ all -> 0x00b5 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ all -> 0x00b5 }
                java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch:{ all -> 0x00b5 }
                java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ all -> 0x00b5 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x00b5 }
                r0 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r0)     // Catch:{ all -> 0x00b3 }
                r0 = 0
                r1.setInstanceFollowRedirects(r0)     // Catch:{ all -> 0x00b3 }
                int r2 = r1.getResponseCode()     // Catch:{ all -> 0x00b3 }
                r3 = 200(0xc8, float:2.8E-43)
                if (r2 == r3) goto L_0x009c
                r3 = 301(0x12d, float:4.22E-43)
                if (r2 == r3) goto L_0x004e
                r3 = 302(0x12e, float:4.23E-43)
                if (r2 == r3) goto L_0x004e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = "call to "
                r0.<init>(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00b3 }
                r0.append(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = " failed: "
                r0.append(r3)     // Catch:{ all -> 0x00b3 }
                r0.append(r2)     // Catch:{ all -> 0x00b3 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b3 }
                com.appsflyer.AFLogger.AFKeystoreWrapper(r0)     // Catch:{ all -> 0x00b3 }
                goto L_0x00af
            L_0x004e:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = "Cross promotion redirection success: "
                r2.<init>(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00b3 }
                r2.append(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b3 }
                com.appsflyer.AFLogger.AFInAppEventType(r2, r0)     // Catch:{ all -> 0x00b3 }
                com.appsflyer.internal.cz r0 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x00b3 }
                if (r0 == 0) goto L_0x00af
                java.lang.ref.WeakReference<android.content.Context> r0 = r6.valueOf     // Catch:{ all -> 0x00b3 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00b3 }
                if (r0 == 0) goto L_0x00af
                com.appsflyer.internal.cz r0 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x00b3 }
                java.lang.String r2 = "Location"
                java.lang.String r2 = r1.getHeaderField(r2)     // Catch:{ all -> 0x00b3 }
                r0.valueOf = r2     // Catch:{ all -> 0x00b3 }
                com.appsflyer.internal.cz r0 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x00b3 }
                java.lang.ref.WeakReference<android.content.Context> r2 = r6.valueOf     // Catch:{ all -> 0x00b3 }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00b3 }
                android.content.Context r2 = (android.content.Context) r2     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = r0.valueOf     // Catch:{ all -> 0x00b3 }
                if (r3 == 0) goto L_0x00af
                android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x00b3 }
                java.lang.String r4 = "android.intent.action.VIEW"
                java.lang.String r0 = r0.valueOf     // Catch:{ all -> 0x00b3 }
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x00b3 }
                r3.<init>(r4, r0)     // Catch:{ all -> 0x00b3 }
                r0 = 268435456(0x10000000, float:2.5243549E-29)
                android.content.Intent r0 = r3.setFlags(r0)     // Catch:{ all -> 0x00b3 }
                r2.startActivity(r0)     // Catch:{ all -> 0x00b3 }
                goto L_0x00af
            L_0x009c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = "Cross promotion impressions success: "
                r2.<init>(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00b3 }
                r2.append(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b3 }
                com.appsflyer.AFLogger.AFInAppEventType(r2, r0)     // Catch:{ all -> 0x00b3 }
            L_0x00af:
                r1.disconnect()
                return
            L_0x00b3:
                r0 = move-exception
                goto L_0x00b9
            L_0x00b5:
                r1 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
            L_0x00b9:
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x00c6 }
                com.appsflyer.AFLogger.valueOf((java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00c6 }
                if (r1 == 0) goto L_0x00c5
                r1.disconnect()
            L_0x00c5:
                return
            L_0x00c6:
                r0 = move-exception
                if (r1 == 0) goto L_0x00cc
                r1.disconnect()
            L_0x00cc:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.C22030a.run():void");
        }
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, (Map<String, String>) null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, (Map<String, String>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setUrl(java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0008:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = 96801(0x17a21, float:1.35647E-40)
            r4 = 1
            if (r2 == r3) goto L_0x003a
            r3 = 120623625(0x7309209, float:1.3283684E-34)
            if (r2 == r3) goto L_0x0030
            goto L_0x0044
        L_0x0030:
            java.lang.String r2 = "impression"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0044
            r0 = r4
            goto L_0x0045
        L_0x003a:
            java.lang.String r2 = "app"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0044
            r0 = 0
            goto L_0x0045
        L_0x0044:
            r0 = -1
        L_0x0045:
            if (r0 == 0) goto L_0x004d
            if (r0 == r4) goto L_0x004a
            goto L_0x0008
        L_0x004a:
            valueOf = r1
            goto L_0x0008
        L_0x004d:
            com.appsflyer.internal.C21980da.AFKeystoreWrapper = r1
            goto L_0x0008
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.setUrl(java.util.Map):void");
    }

    @NonNull
    private static LinkGenerator valueOf(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventParameterName = str3;
        linkGenerator.AFInAppEventType = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter(C9650g.f26457t, string);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator valueOf2 = valueOf(context, str, str2, map, String.format(C21980da.AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C21868ah.valueOf().getHostName()}));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventType("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        new Thread(new C22030a(valueOf2.generateLink(), new C21978cz(), context, AppsFlyerLib.getInstance().isStopped())).start();
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventType("CustomerUserId not set, Promote Impression is disabled", true);
            return;
        }
        new Thread(new C22030a(valueOf(context, str, str2, map, String.format(valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C21868ah.valueOf().getHostName()})).generateLink(), (C21978cz) null, (Context) null, AppsFlyerLib.getInstance().isStopped())).start();
    }
}
