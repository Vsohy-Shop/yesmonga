package com.appsflyer.internal;

import android.app.Application;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.appsflyer.internal.by */
public final class C21942by implements Runnable {
    @VisibleForTesting
    private static String AFKeystoreWrapper = "https://%sgcdsdk.%s/install_data/v4.0/";
    private static final List<String> valueOf = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});
    private final String AFInAppEventParameterName;
    final ScheduledExecutorService AFInAppEventType;
    private final C21868ah AFLogger$LogLevel;
    private final AtomicInteger AppsFlyer2dXConversionCallback;
    private final int init;
    private final Application values;

    public C21942by(C21868ah ahVar, Application application, String str) {
        if (C22004m.AFInAppEventType == null) {
            C22004m.AFInAppEventType = new C22004m();
        }
        this.AFInAppEventType = C22004m.AFInAppEventType.values();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.AFLogger$LogLevel = ahVar;
        this.values = application;
        this.AFInAppEventParameterName = str;
        this.init = 0;
    }

    public static void AFInAppEventParameterName(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
        sb.append(map.toString());
        AFLogger.values(sb.toString());
        C21868ah.AFKeystoreWrapper.onConversionDataSuccess(map);
    }

    public static void AFInAppEventType(String str) {
        if (C21868ah.AFKeystoreWrapper != null) {
            AFLogger.values("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            C21868ah.AFKeystoreWrapper.onConversionDataFail(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0122 A[Catch:{ bs -> 0x026d, all -> 0x0296 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015c A[Catch:{ bs -> 0x026d, all -> 0x0296 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0169 A[Catch:{ bs -> 0x026d, all -> 0x0296 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019e A[Catch:{ bs -> 0x026d, all -> 0x0296 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x029f A[Catch:{ all -> 0x02d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02ae A[Catch:{ all -> 0x02d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02c3 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "is_first_launch"
            java.lang.String r2 = "af_siteid"
            java.lang.String r3 = r1.AFInAppEventParameterName
            if (r3 == 0) goto L_0x02dd
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0012
            goto L_0x02dd
        L_0x0012:
            com.appsflyer.internal.ah r3 = r1.AFLogger$LogLevel
            boolean r3 = r3.isStopped()
            if (r3 == 0) goto L_0x0025
            java.lang.String r0 = "[GCD-E03] 'isStopTracking' enabled"
            com.appsflyer.AFLogger.values(r0)
            java.lang.String r0 = "'isStopTracking' enabled"
            AFInAppEventType(r0)
            return
        L_0x0025:
            java.util.concurrent.atomic.AtomicInteger r3 = r1.AppsFlyer2dXConversionCallback
            r3.incrementAndGet()
            r3 = 10
            r5 = 2
            r6 = 0
            android.app.Application r7 = r1.values     // Catch:{ all -> 0x0299 }
            if (r7 != 0) goto L_0x0042
            java.lang.String r0 = "[GCD-E06] Context null"
            com.appsflyer.AFLogger.values(r0)     // Catch:{ all -> 0x0299 }
            java.lang.String r0 = "Context null"
            AFInAppEventType(r0)     // Catch:{ all -> 0x0299 }
            java.util.concurrent.atomic.AtomicInteger r0 = r1.AppsFlyer2dXConversionCallback
            r0.decrementAndGet()
            return
        L_0x0042:
            com.appsflyer.internal.ah r8 = r1.AFLogger$LogLevel     // Catch:{ all -> 0x0299 }
            java.lang.String r9 = r8.values((android.content.Context) r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = r8.valueOf((android.content.Context) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0299 }
            java.lang.String r8 = ""
            r9 = 1
            r10 = 0
            if (r7 == 0) goto L_0x0072
            java.util.List<java.lang.String> r11 = valueOf     // Catch:{ all -> 0x0299 }
            java.lang.String r12 = r7.toLowerCase()     // Catch:{ all -> 0x0299 }
            boolean r11 = r11.contains(r12)     // Catch:{ all -> 0x0299 }
            if (r11 != 0) goto L_0x0065
            java.lang.String r11 = "-"
            java.lang.String r7 = r11.concat(r7)     // Catch:{ all -> 0x0299 }
            goto L_0x0073
        L_0x0065:
            java.lang.String r11 = "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ all -> 0x0299 }
            r12[r10] = r7     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = java.lang.String.format(r11, r12)     // Catch:{ all -> 0x0299 }
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r7)     // Catch:{ all -> 0x0299 }
        L_0x0072:
            r7 = r8
        L_0x0073:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0299 }
            r11.<init>()     // Catch:{ all -> 0x0299 }
            java.lang.String r12 = AFKeystoreWrapper     // Catch:{ all -> 0x0299 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ all -> 0x0299 }
            com.appsflyer.AppsFlyerLib r14 = com.appsflyer.AppsFlyerLib.getInstance()     // Catch:{ all -> 0x0299 }
            java.lang.String r14 = r14.getHostPrefix()     // Catch:{ all -> 0x0299 }
            r13[r10] = r14     // Catch:{ all -> 0x0299 }
            com.appsflyer.internal.ah r14 = com.appsflyer.internal.C21868ah.valueOf()     // Catch:{ all -> 0x0299 }
            java.lang.String r14 = r14.getHostName()     // Catch:{ all -> 0x0299 }
            r13[r9] = r14     // Catch:{ all -> 0x0299 }
            java.lang.String r12 = java.lang.String.format(r12, r13)     // Catch:{ all -> 0x0299 }
            r11.append(r12)     // Catch:{ all -> 0x0299 }
            android.app.Application r12 = r1.values     // Catch:{ all -> 0x0299 }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ all -> 0x0299 }
            r11.append(r12)     // Catch:{ all -> 0x0299 }
            r11.append(r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = "?devkey="
            r11.append(r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = r1.AFInAppEventParameterName     // Catch:{ all -> 0x0299 }
            r11.append(r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = "&device_id="
            r11.append(r7)     // Catch:{ all -> 0x0299 }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0299 }
            android.app.Application r12 = r1.values     // Catch:{ all -> 0x0299 }
            r7.<init>(r12)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = com.appsflyer.internal.C21885al.AFKeystoreWrapper(r7)     // Catch:{ all -> 0x0299 }
            r11.append(r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x0299 }
            com.appsflyer.internal.am r11 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()     // Catch:{ all -> 0x0299 }
            r11.AFInAppEventParameterName(r7, r8)     // Catch:{ all -> 0x0299 }
            java.lang.String r8 = "[GCD-B01] URL: "
            java.lang.String r11 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0299 }
            java.lang.String r8 = r8.concat(r11)     // Catch:{ all -> 0x0299 }
            com.appsflyer.internal.C21884ak.valueOf(r8)     // Catch:{ all -> 0x0299 }
            com.appsflyer.internal.ah r8 = r1.AFLogger$LogLevel     // Catch:{ all -> 0x0299 }
            com.appsflyer.internal.bd r8 = r8.AFInAppEventType()     // Catch:{ all -> 0x0299 }
            com.appsflyer.internal.cf r8 = r8.init()     // Catch:{ all -> 0x0299 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0299 }
            r8.getLevel = r11     // Catch:{ all -> 0x0299 }
            java.net.URL r11 = new java.net.URL     // Catch:{ all -> 0x0299 }
            r11.<init>(r7)     // Catch:{ all -> 0x0299 }
            java.net.URLConnection r11 = r11.openConnection()     // Catch:{ all -> 0x0299 }
            java.lang.Object r11 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r11)     // Catch:{ all -> 0x0299 }
            java.net.URLConnection r11 = (java.net.URLConnection) r11     // Catch:{ all -> 0x0299 }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ all -> 0x0299 }
            java.lang.String r6 = "GET"
            r11.setRequestMethod(r6)     // Catch:{ all -> 0x0296 }
            r6 = 10000(0x2710, float:1.4013E-41)
            r11.setConnectTimeout(r6)     // Catch:{ all -> 0x0296 }
            java.lang.String r6 = "Connection"
            java.lang.String r12 = "close"
            r11.setRequestProperty(r6, r12)     // Catch:{ all -> 0x0296 }
            r11.connect()     // Catch:{ all -> 0x0296 }
            int r6 = r11.getResponseCode()     // Catch:{ all -> 0x0296 }
            java.lang.String r12 = com.appsflyer.internal.C21868ah.AFKeystoreWrapper((java.net.HttpURLConnection) r11)     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.am r13 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()     // Catch:{ all -> 0x0296 }
            r13.AFKeystoreWrapper(r7, r6, r12)     // Catch:{ all -> 0x0296 }
            r7 = 200(0xc8, float:2.8E-43)
            r13 = 404(0x194, float:5.66E-43)
            if (r6 == r7) goto L_0x014e
            if (r6 != r13) goto L_0x0125
            goto L_0x014e
        L_0x0125:
            r0 = 403(0x193, float:5.65E-43)
            if (r6 == r0) goto L_0x012d
            r0 = 500(0x1f4, float:7.0E-43)
            if (r6 < r0) goto L_0x013f
        L_0x012d:
            int r0 = r1.init     // Catch:{ all -> 0x0296 }
            if (r0 >= r5) goto L_0x013f
            com.appsflyer.internal.by r0 = new com.appsflyer.internal.by     // Catch:{ all -> 0x0296 }
            r0.<init>(r1)     // Catch:{ all -> 0x0296 }
            java.util.concurrent.ScheduledExecutorService r2 = r0.AFInAppEventType     // Catch:{ all -> 0x0296 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.C21868ah.AFKeystoreWrapper(r2, r0, r3, r6)     // Catch:{ all -> 0x0296 }
            goto L_0x028d
        L_0x013f:
            java.lang.String r0 = "Error connection to server: "
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0296 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x0296 }
            AFInAppEventType(r0)     // Catch:{ all -> 0x0296 }
            goto L_0x028d
        L_0x014e:
            int r7 = r1.init     // Catch:{ all -> 0x0296 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0296 }
            long r3 = r8.getLevel     // Catch:{ all -> 0x0296 }
            r16 = 0
            int r16 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r16 == 0) goto L_0x0169
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.AFInAppEventParameterName     // Catch:{ all -> 0x0296 }
            java.lang.String r10 = "net"
            long r14 = r14 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0296 }
            r5.put(r10, r3)     // Catch:{ all -> 0x0296 }
            goto L_0x016e
        L_0x0169:
            java.lang.String r3 = "Metrics: gcdStart ts is missing"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3)     // Catch:{ all -> 0x0296 }
        L_0x016e:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.AFInAppEventParameterName     // Catch:{ all -> 0x0296 }
            java.lang.String r4 = "retries"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0296 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0296 }
            java.lang.String r3 = "gcd"
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.AFInAppEventParameterName     // Catch:{ all -> 0x0296 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0296 }
            r5.<init>(r4)     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.bo r4 = r8.valueOf     // Catch:{ all -> 0x0296 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0296 }
            r4.AFInAppEventParameterName(r3, r5)     // Catch:{ all -> 0x0296 }
            java.lang.String r3 = "Attribution data: "
            java.lang.String r4 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0296 }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.C21884ak.valueOf(r3)     // Catch:{ all -> 0x0296 }
            int r3 = r12.length()     // Catch:{ all -> 0x0296 }
            if (r3 <= 0) goto L_0x028d
            java.util.Map r3 = com.appsflyer.internal.C21943bz.AFKeystoreWrapper(r12)     // Catch:{ all -> 0x0296 }
            java.lang.String r4 = "iscache"
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x0296 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0296 }
            if (r6 != r13) goto L_0x01c4
            java.lang.String r5 = "error_reason"
            r3.remove(r5)     // Catch:{ all -> 0x0296 }
            java.lang.String r5 = "status_code"
            r3.remove(r5)     // Catch:{ all -> 0x0296 }
            java.lang.String r5 = "af_status"
            java.lang.String r6 = "Organic"
            r3.put(r5, r6)     // Catch:{ all -> 0x0296 }
            java.lang.String r5 = "af_message"
            java.lang.String r6 = "organic install"
            r3.put(r5, r6)     // Catch:{ all -> 0x0296 }
        L_0x01c4:
            if (r4 == 0) goto L_0x01d9
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0296 }
            if (r4 != 0) goto L_0x01d9
            com.appsflyer.internal.ah r4 = r1.AFLogger$LogLevel     // Catch:{ all -> 0x0296 }
            android.app.Application r5 = r1.values     // Catch:{ all -> 0x0296 }
            java.lang.String r6 = "appsflyerConversionDataCacheExpiration"
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0296 }
            r4.valueOf((android.content.Context) r5, (java.lang.String) r6, (long) r7)     // Catch:{ all -> 0x0296 }
        L_0x01d9:
            boolean r4 = r3.containsKey(r2)     // Catch:{ all -> 0x0296 }
            java.lang.String r5 = "[Invite] Detected App-Invite via channel: "
            java.lang.String r6 = "af_channel"
            if (r4 == 0) goto L_0x020f
            boolean r4 = r3.containsKey(r6)     // Catch:{ all -> 0x0296 }
            if (r4 == 0) goto L_0x01fd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0296 }
            r4.<init>(r5)     // Catch:{ all -> 0x0296 }
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0296 }
            r4.append(r7)     // Catch:{ all -> 0x0296 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0296 }
            com.appsflyer.AFLogger.values(r4)     // Catch:{ all -> 0x0296 }
            goto L_0x020f
        L_0x01fd:
            java.lang.String r4 = "[CrossPromotion] App was installed via %s's Cross Promotion"
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch:{ all -> 0x0296 }
            java.lang.Object r8 = r3.get(r2)     // Catch:{ all -> 0x0296 }
            r10 = 0
            r7[r10] = r8     // Catch:{ all -> 0x0296 }
            java.lang.String r4 = java.lang.String.format(r4, r7)     // Catch:{ all -> 0x0296 }
            com.appsflyer.AFLogger.values(r4)     // Catch:{ all -> 0x0296 }
        L_0x020f:
            boolean r2 = r3.containsKey(r2)     // Catch:{ all -> 0x0296 }
            if (r2 == 0) goto L_0x0228
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0296 }
            r2.<init>(r5)     // Catch:{ all -> 0x0296 }
            java.lang.Object r4 = r3.get(r6)     // Catch:{ all -> 0x0296 }
            r2.append(r4)     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0296 }
            com.appsflyer.AFLogger.values(r2)     // Catch:{ all -> 0x0296 }
        L_0x0228:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0296 }
            r3.put(r0, r2)     // Catch:{ all -> 0x0296 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0296 }
            r2.<init>(r3)     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0296 }
            java.lang.String r4 = "attributionId"
            if (r2 == 0) goto L_0x0240
            android.app.Application r5 = r1.values     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.C21868ah.AFKeystoreWrapper(r5, r4, r2)     // Catch:{ all -> 0x0296 }
            goto L_0x0245
        L_0x0240:
            android.app.Application r2 = r1.values     // Catch:{ all -> 0x0296 }
            com.appsflyer.internal.C21868ah.AFKeystoreWrapper(r2, r4, r12)     // Catch:{ all -> 0x0296 }
        L_0x0245:
            com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.internal.C21868ah.AFKeystoreWrapper     // Catch:{ all -> 0x0296 }
            if (r2 == 0) goto L_0x028d
            java.util.concurrent.atomic.AtomicInteger r2 = r1.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0296 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0296 }
            if (r2 > r9) goto L_0x028d
            android.app.Application r2 = r1.values     // Catch:{ bs -> 0x026d }
            java.util.Map r2 = com.appsflyer.internal.C21943bz.values(r2)     // Catch:{ bs -> 0x026d }
            android.app.Application r4 = r1.values     // Catch:{ bs -> 0x026d }
            android.content.SharedPreferences r4 = com.appsflyer.internal.C21868ah.valueOf((android.content.Context) r4)     // Catch:{ bs -> 0x026d }
            java.lang.String r5 = "sixtyDayConversionData"
            r6 = 0
            boolean r4 = r4.getBoolean(r5, r6)     // Catch:{ bs -> 0x026d }
            if (r4 != 0) goto L_0x026b
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ bs -> 0x026d }
            r2.put(r0, r4)     // Catch:{ bs -> 0x026d }
        L_0x026b:
            r3 = r2
            goto L_0x0273
        L_0x026d:
            r0 = move-exception
            java.lang.String r2 = "Exception while trying to fetch attribution data. "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r2, r0)     // Catch:{ all -> 0x0296 }
        L_0x0273:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = "[GCD-A02] Calling onConversionDataSuccess with:\n"
            r0.<init>(r2)     // Catch:{ all -> 0x0296 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0296 }
            r0.append(r2)     // Catch:{ all -> 0x0296 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0296 }
            com.appsflyer.AFLogger.values(r0)     // Catch:{ all -> 0x0296 }
            com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.internal.C21868ah.AFKeystoreWrapper     // Catch:{ all -> 0x0296 }
            r0.onConversionDataSuccess(r3)     // Catch:{ all -> 0x0296 }
        L_0x028d:
            java.util.concurrent.atomic.AtomicInteger r0 = r1.AppsFlyer2dXConversionCallback
            r0.decrementAndGet()
            r11.disconnect()
            goto L_0x02c6
        L_0x0296:
            r0 = move-exception
            r6 = r11
            goto L_0x029a
        L_0x0299:
            r0 = move-exception
        L_0x029a:
            int r2 = r1.init     // Catch:{ all -> 0x02d1 }
            r3 = 2
            if (r2 >= r3) goto L_0x02ae
            com.appsflyer.internal.by r2 = new com.appsflyer.internal.by     // Catch:{ all -> 0x02d1 }
            r2.<init>(r1)     // Catch:{ all -> 0x02d1 }
            java.util.concurrent.ScheduledExecutorService r3 = r2.AFInAppEventType     // Catch:{ all -> 0x02d1 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x02d1 }
            r7 = 10
            com.appsflyer.internal.C21868ah.AFKeystoreWrapper(r3, r2, r7, r4)     // Catch:{ all -> 0x02d1 }
            goto L_0x02b5
        L_0x02ae:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02d1 }
            AFInAppEventType(r2)     // Catch:{ all -> 0x02d1 }
        L_0x02b5:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x02d1 }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r2, r0)     // Catch:{ all -> 0x02d1 }
            java.util.concurrent.atomic.AtomicInteger r0 = r1.AppsFlyer2dXConversionCallback
            r0.decrementAndGet()
            if (r6 == 0) goto L_0x02c6
            r6.disconnect()
        L_0x02c6:
            java.util.concurrent.ScheduledExecutorService r0 = r1.AFInAppEventType
            r0.shutdown()
            java.lang.String r0 = "[GCD-A03] Server retrieving attempt finished"
            com.appsflyer.AFLogger.values(r0)
            return
        L_0x02d1:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicInteger r2 = r1.AppsFlyer2dXConversionCallback
            r2.decrementAndGet()
            if (r6 == 0) goto L_0x02dc
            r6.disconnect()
        L_0x02dc:
            throw r0
        L_0x02dd:
            java.lang.String r0 = "[GCD-E05] AppsFlyer dev key is missing"
            com.appsflyer.AFLogger.values(r0)
            java.lang.String r0 = "AppsFlyer dev key is missing"
            AFInAppEventType(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21942by.run():void");
    }

    private C21942by(C21942by byVar) {
        if (C22004m.AFInAppEventType == null) {
            C22004m.AFInAppEventType = new C22004m();
        }
        this.AFInAppEventType = C22004m.AFInAppEventType.values();
        this.AppsFlyer2dXConversionCallback = new AtomicInteger(0);
        this.AFLogger$LogLevel = byVar.AFLogger$LogLevel;
        this.values = byVar.values;
        this.AFInAppEventParameterName = byVar.AFInAppEventParameterName;
        this.init = byVar.init + 1;
    }
}
