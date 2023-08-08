package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.C21882aj;
import com.appsflyer.internal.C21967ct;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ao */
public final class C21891ao extends C21951ce {
    public static long onAttributionFailureNative = 0;
    @VisibleForTesting
    private static String onConversionDataFail = "https://%sdlsdk.%s/v1.0/android/";
    private boolean AppsFlyerConversionListener;
    private final List<C21967ct> onAppOpenAttribution = new ArrayList();
    private int onDeepLinking;
    public final C21952cf onInstallConversionFailureNative;
    private int onResponseError;
    public int onResponseErrorNative;
    private final CountDownLatch onResponseNative = new CountDownLatch(1);

    /* renamed from: com.appsflyer.internal.ao$5 */
    public static /* synthetic */ class C218955 {
        static final /* synthetic */ int[] values;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appsflyer.internal.ct$c[] r0 = com.appsflyer.internal.C21967ct.C21969c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                values = r0
                com.appsflyer.internal.ct$c r1 = com.appsflyer.internal.C21967ct.C21969c.FINISHED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = values     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.internal.ct$c r1 = com.appsflyer.internal.C21967ct.C21969c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21891ao.C218955.<clinit>():void");
        }
    }

    public C21891ao(Context context, C21952cf cfVar) {
        super((String) null, onConversionDataFail, Boolean.FALSE, Boolean.TRUE, (Boolean) null, context);
        this.onInstallConversionFailureNative = cfVar;
    }

    public static /* synthetic */ void AFKeystoreWrapper(C21891ao aoVar) {
        ArrayList<C21967ct> arrayList = new ArrayList<>();
        for (C21967ct ctVar : C21868ah.valueOf().AFInAppEventParameterName()) {
            if (!(ctVar == null || ctVar.values == C21967ct.C21969c.NOT_STARTED)) {
                arrayList.add(ctVar);
            }
        }
        aoVar.onDeepLinking = arrayList.size();
        for (final C21967ct ctVar2 : arrayList) {
            int i = C218955.values[ctVar2.values.ordinal()];
            if (i == 1) {
                StringBuilder sb = new StringBuilder("[DDL] ");
                sb.append(ctVar2.AFInAppEventType.get("source"));
                sb.append(" referrer collected earlier");
                AFLogger.values(sb.toString());
                aoVar.values(ctVar2);
            } else if (i == 2) {
                ctVar2.addObserver(new Observer() {
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb = new StringBuilder("[DDL] ");
                        sb.append(ctVar2.AFInAppEventType.get("source"));
                        sb.append(" referrer collected via observer");
                        AFLogger.values(sb.toString());
                        C21891ao.this.values((C21967ct) observable);
                    }
                });
            }
        }
    }

    private boolean values() {
        List list = (List) this.valueOf.get("referrers");
        if ((list != null ? list.size() : 0) >= this.onDeepLinking || this.valueOf.containsKey("referrers")) {
            return false;
        }
        return true;
    }

    private static boolean AFInAppEventParameterName(C21967ct ctVar) {
        Long l = (Long) ctVar.AFInAppEventType.get("click_ts");
        if (l != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void valueOf(android.content.Context r10) {
        /*
            r9 = this;
            int r0 = r9.onResponseErrorNative
            r1 = 1
            int r0 = r0 + r1
            r9.onResponseErrorNative = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[DDL] Preparing request "
            r0.<init>(r2)
            int r2 = r9.onResponseErrorNative
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.values(r0)
            int r0 = r9.onResponseErrorNative
            java.lang.String r2 = "-"
            if (r0 != r1) goto L_0x00ae
            com.appsflyer.internal.ah r0 = com.appsflyer.internal.C21868ah.valueOf()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.valueOf
            boolean r4 = com.appsflyer.internal.C21868ah.AFInAppEventParameterName((android.content.Context) r10)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "is_first"
            r3.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.valueOf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getLanguage()
            r4.append(r5)
            r4.append(r2)
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getCountry()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "lang"
            r3.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.valueOf
            java.lang.String r4 = "os"
            java.lang.String r5 = android.os.Build.VERSION.RELEASE
            r3.put(r4, r5)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.valueOf
            java.lang.String r4 = "type"
            java.lang.String r5 = android.os.Build.MODEL
            r3.put(r4, r5)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.valueOf
            java.lang.String r4 = r0.getAppsFlyerUID(r10)
            java.lang.String r5 = "request_id"
            r3.put(r5, r4)
            com.appsflyer.internal.k r0 = r0.getLevel
            if (r0 == 0) goto L_0x0087
            java.lang.String[] r0 = r0.values
            if (r0 == 0) goto L_0x0087
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.valueOf
            java.lang.String r4 = "sharing_filter"
            r3.put(r4, r0)
        L_0x0087:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.appsflyer.internal.h r0 = com.appsflyer.internal.C22021z.valueOf(r10, r0)
            java.util.Map r0 = r9.valueOf((com.appsflyer.internal.C21996h) r0)
            com.appsflyer.internal.h r3 = com.appsflyer.internal.C22021z.AFInAppEventType(r10)
            java.util.Map r3 = r9.valueOf((com.appsflyer.internal.C21996h) r3)
            if (r0 == 0) goto L_0x00a5
            java.util.Map<java.lang.String, java.lang.Object> r4 = r9.valueOf
            java.lang.String r5 = "gaid"
            r4.put(r5, r0)
        L_0x00a5:
            if (r3 == 0) goto L_0x00ae
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.valueOf
            java.lang.String r4 = "oaid"
            r0.put(r4, r3)
        L_0x00ae:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.valueOf
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            r3.<init>(r5, r4)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "UTC"
            java.util.TimeZone r6 = p073j$.util.DesugarTimeZone.getTimeZone(r6)
            r3.setTimeZone(r6)
            java.util.Date r6 = new java.util.Date
            r6.<init>(r4)
            java.lang.String r3 = r3.format(r6)
            java.lang.String r4 = "timestamp"
            r0.put(r4, r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.valueOf
            int r3 = r9.onResponseErrorNative
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "request_count"
            r0.put(r5, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.appsflyer.internal.ct> r3 = r9.onAppOpenAttribution
            java.util.Iterator r3 = r3.iterator()
        L_0x00ec:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0129
            java.lang.Object r5 = r3.next()
            com.appsflyer.internal.ct r5 = (com.appsflyer.internal.C21967ct) r5
            com.appsflyer.internal.ct$c r6 = r5.values
            com.appsflyer.internal.ct$c r7 = com.appsflyer.internal.C21967ct.C21969c.FINISHED
            if (r6 != r7) goto L_0x0122
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r7 = r5.AFInAppEventType
            java.lang.String r8 = "referrer"
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0122
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.AFInAppEventType
            java.lang.String r8 = "source"
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            r6.put(r8, r5)
            java.lang.String r5 = "value"
            r6.put(r5, r7)
            goto L_0x0123
        L_0x0122:
            r6 = 0
        L_0x0123:
            if (r6 == 0) goto L_0x00ec
            r0.add(r6)
            goto L_0x00ec
        L_0x0129:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0136
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.valueOf
            java.lang.String r5 = "referrers"
            r3.put(r5, r0)
        L_0x0136:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getDevKey()
            com.appsflyer.internal.ah r3 = com.appsflyer.internal.C21868ah.valueOf()
            java.lang.String r3 = r3.values((android.content.Context) r10)
            if (r3 == 0) goto L_0x0157
            java.lang.String r5 = r3.trim()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0157
            java.lang.String r2 = r2.concat(r3)
            goto L_0x0159
        L_0x0157:
            java.lang.String r2 = ""
        L_0x0159:
            java.lang.String r3 = onConversionDataFail
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.appsflyer.AppsFlyerLib r6 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r6 = r6.getHostPrefix()
            r7 = 0
            r5[r7] = r6
            com.appsflyer.internal.ah r6 = com.appsflyer.internal.C21868ah.valueOf()
            java.lang.String r6 = r6.getHostName()
            r5[r1] = r6
            java.lang.String r1 = java.lang.String.format(r3, r5)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = r10.getPackageName()
            r3.append(r10)
            r3.append(r2)
            java.lang.String r10 = r3.toString()
            android.net.Uri$Builder r10 = r1.appendPath(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.valueOf
            java.lang.Object r2 = r2.get(r4)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = com.appsflyer.internal.C21859ae.values((java.lang.String) r1, (java.lang.String) r0)
            java.lang.String r1 = "af_sig"
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r1, r0)
            java.lang.String r0 = "sdk_version"
            java.lang.String r1 = com.appsflyer.internal.C21868ah.values
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r0, r1)
            android.net.Uri r10 = r10.build()
            java.lang.String r10 = r10.toString()
            r9.AFKeystoreWrapper(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21891ao.valueOf(android.content.Context):void");
    }

    public static /* synthetic */ DeepLinkResult AFInAppEventParameterName(C21891ao aoVar, Context context) throws IOException, JSONException, InterruptedException {
        DeepLink deepLink;
        while (true) {
            C21952cf cfVar = aoVar.onInstallConversionFailureNative;
            int i = aoVar.onResponseErrorNative;
            if (i <= 0 || i > 2) {
                AFLogger.AFInAppEventType((Throwable) new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            } else {
                int i2 = i - 1;
                cfVar.AppsFlyer2dXConversionCallback[i2] = System.currentTimeMillis();
                if (i2 == 0) {
                    long j = cfVar.AFVersionDeclaration;
                    if (j != 0) {
                        cfVar.AFKeystoreWrapper.put("from_fg", Long.valueOf(cfVar.AppsFlyer2dXConversionCallback[i2] - j));
                        cfVar.valueOf.AFInAppEventParameterName("ddl", new JSONObject(cfVar.AFKeystoreWrapper).toString());
                    } else {
                        AFLogger.AFKeystoreWrapper("Metrics: fg ts is missing");
                    }
                }
            }
            HttpURLConnection AFInAppEventParameterName = new C21882aj.C21883a(aoVar).AFInAppEventParameterName();
            C21952cf cfVar2 = aoVar.onInstallConversionFailureNative;
            int i3 = aoVar.onResponseErrorNative;
            if (i3 <= 0 || i3 > 2) {
                AFLogger.AFInAppEventType((Throwable) new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i3))));
            } else {
                int i4 = i3 - 1;
                cfVar2.AFLogger$LogLevel[i4] = System.currentTimeMillis();
                long j2 = cfVar2.AppsFlyer2dXConversionCallback[i4];
                if (j2 != 0) {
                    long[] jArr = cfVar2.init;
                    jArr[i4] = cfVar2.AFLogger$LogLevel[i4] - j2;
                    cfVar2.AFKeystoreWrapper.put("net", jArr);
                    cfVar2.valueOf.AFInAppEventParameterName("ddl", new JSONObject(cfVar2.AFKeystoreWrapper).toString());
                } else {
                    StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                    sb.append(i4);
                    sb.append("] ts is missing");
                    AFLogger.AFKeystoreWrapper(sb.toString());
                }
            }
            if (AFInAppEventParameterName.getResponseCode() == 200) {
                C21868ah.valueOf();
                JSONObject jSONObject = new JSONObject(C21868ah.AFKeystoreWrapper(AFInAppEventParameterName));
                aoVar.AppsFlyerConversionListener = jSONObject.optBoolean("is_second_ping", true);
                if (!jSONObject.optBoolean("found")) {
                    deepLink = null;
                } else {
                    deepLink = DeepLink.values(jSONObject.optJSONObject("click_event"));
                    deepLink.AFInAppEventParameterName.put("is_deferred", true);
                }
                if (deepLink != null) {
                    return new DeepLinkResult(deepLink, (DeepLinkResult.Error) null);
                }
                if (aoVar.onResponseErrorNative <= 1 && aoVar.values() && aoVar.AppsFlyerConversionListener) {
                    AFLogger.values("[DDL] Waiting for referrers...");
                    aoVar.onResponseNative.await();
                    C21952cf cfVar3 = aoVar.onInstallConversionFailureNative;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = cfVar3.AFLogger$LogLevel[0];
                    if (j3 != 0) {
                        cfVar3.AFKeystoreWrapper.put("rfr_wait", Long.valueOf(currentTimeMillis - j3));
                        cfVar3.valueOf.AFInAppEventParameterName("ddl", new JSONObject(cfVar3.AFKeystoreWrapper).toString());
                    } else {
                        AFLogger.AFKeystoreWrapper("Metrics: ddlEnd[0] ts is missing");
                    }
                    if (aoVar.onResponseError == aoVar.onDeepLinking) {
                        return new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null);
                    }
                    aoVar.valueOf(context);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("[DDL] Error occurred. Server response code = ");
                sb2.append(AFInAppEventParameterName.getResponseCode());
                AFLogger.values(sb2.toString());
                return new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
        }
        return new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null);
    }

    /* access modifiers changed from: private */
    public void values(C21967ct ctVar) {
        if (AFInAppEventParameterName(ctVar)) {
            this.onAppOpenAttribution.add(ctVar);
            this.onResponseNative.countDown();
            StringBuilder sb = new StringBuilder("[DDL] Added non-organic ");
            sb.append(ctVar.getClass().getSimpleName());
            AFLogger.values(sb.toString());
            return;
        }
        int i = this.onResponseError + 1;
        this.onResponseError = i;
        if (i == this.onDeepLinking) {
            this.onResponseNative.countDown();
        }
    }

    @Nullable
    private Map<String, Object> valueOf(final C21996h hVar) {
        Boolean bool;
        boolean z = false;
        if (!(hVar == null || hVar.valueOf == null || ((bool = hVar.AFInAppEventParameterName) != null && bool.booleanValue()))) {
            z = true;
        }
        if (z) {
            return new HashMap<String, Object>() {
                {
                    put("type", "unhashed");
                    put("value", C21996h.this.valueOf);
                }
            };
        }
        return null;
    }
}
