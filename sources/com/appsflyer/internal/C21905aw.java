package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.android.billingclient.api.BillingClient;
import com.appsflyer.AFLogger;
import java.util.concurrent.ExecutorService;

/* renamed from: com.appsflyer.internal.aw */
public final class C21905aw implements Runnable {
    @NonNull
    final C21930bo AFInAppEventParameterName;
    @NonNull
    public final ExecutorService AFInAppEventType;
    @NonNull
    public final C21920bf AFKeystoreWrapper;
    @NonNull
    private final C21923bh AFLogger$LogLevel;
    @NonNull
    private C21911az valueOf;
    BillingClient values;

    public C21905aw(@NonNull C21920bf bfVar, @NonNull C21911az azVar, @NonNull C21930bo boVar, @NonNull ExecutorService executorService, @NonNull C21923bh bhVar) {
        this.AFKeystoreWrapper = bfVar;
        this.valueOf = azVar;
        this.AFInAppEventParameterName = boVar;
        this.AFInAppEventType = executorService;
        this.AFLogger$LogLevel = bhVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f5 A[LOOP:0: B:20:0x00ef->B:22:0x00f5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void values(com.appsflyer.internal.C21905aw r12, final boolean r13, java.util.List r14) {
        /*
            com.appsflyer.internal.bf r0 = r12.AFKeystoreWrapper
            com.appsflyer.internal.aa r0 = r0.valueOf()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0017
            boolean r3 = r0.AFInAppEventParameterName
            com.appsflyer.compat.function.Function<java.util.List<com.android.billingclient.api.Purchase>, java.util.Map<java.lang.String, java.lang.String>> r4 = r0.AFInAppEventType
            if (r4 == 0) goto L_0x0018
            java.lang.Object r4 = r4.apply(r14)
            java.util.Map r4 = (java.util.Map) r4
            goto L_0x0019
        L_0x0017:
            r3 = r1
        L_0x0018:
            r4 = r2
        L_0x0019:
            com.appsflyer.internal.ak r5 = new com.appsflyer.internal.ak
            r5.<init>(r3, r13, r14, r4)
            com.appsflyer.internal.bh r14 = r12.AFLogger$LogLevel
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.appsflyer.AppsFlyerLib r4 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r4 = r4.getHostPrefix()
            r3[r1] = r4
            com.appsflyer.internal.ah r1 = com.appsflyer.internal.C21868ah.valueOf()
            java.lang.String r1 = r1.getHostName()
            r4 = 1
            r3[r4] = r1
            java.lang.String r1 = "https://%sars.%s/api/v1/android/validate_subscription"
            java.lang.String r7 = java.lang.String.format(r1, r3)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.appsflyer.internal.x r3 = r14.AFInAppEventType
            android.content.Context r3 = r3.valueOf
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r6 = "app_id"
            r1.put(r6, r3)
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r6 = "AppUserId"
            java.lang.String r3 = r3.getString(r6)
            if (r3 == 0) goto L_0x0061
            java.lang.String r6 = "cuid"
            r1.put(r6, r3)
        L_0x0061:
            com.appsflyer.internal.x r3 = r14.AFInAppEventType
            android.content.Context r3 = r3.valueOf
            java.lang.String r6 = r3.getPackageName()
            java.lang.String r3 = com.appsflyer.internal.C21845aa.values(r3, r6)
            java.lang.String r6 = "app_version_name"
            r1.put(r6, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.appsflyer.internal.x r6 = r14.AFInAppEventType
            android.content.Context r6 = r6.valueOf
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            com.appsflyer.internal.h r6 = com.appsflyer.internal.C22021z.valueOf(r6, r8)
            if (r6 == 0) goto L_0x0088
            java.lang.String r2 = r6.valueOf
        L_0x0088:
            if (r2 == 0) goto L_0x008f
            java.lang.String r6 = "advertising_id"
            r3.put(r6, r2)
        L_0x008f:
            com.appsflyer.internal.x r2 = r14.AFInAppEventType
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            android.content.Context r2 = r2.valueOf
            r6.<init>(r2)
            java.lang.String r2 = com.appsflyer.internal.C21885al.AFKeystoreWrapper(r6)
            java.lang.String r6 = "appsflyer_id"
            r3.put(r6, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r6 = android.os.Build.VERSION.SDK_INT
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "os_version"
            r3.put(r6, r2)
            java.lang.String r2 = "sdk_version"
            java.lang.String r6 = com.appsflyer.internal.C21868ah.values
            r3.put(r2, r6)
            java.lang.String r2 = "device_data"
            r1.put(r2, r3)
            boolean r2 = r5.valueOf()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "is_cached"
            r1.put(r3, r2)
            boolean r2 = r5.AFInAppEventType()
            if (r2 == 0) goto L_0x00d6
            java.lang.String r2 = "SANDBOX"
            goto L_0x00d8
        L_0x00d6:
            java.lang.String r2 = "PRODUCTION"
        L_0x00d8:
            java.lang.String r3 = "environment"
            r1.put(r3, r2)
            java.lang.String r2 = "additional_parameters"
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.valueOf
            r1.put(r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List<com.android.billingclient.api.Purchase> r3 = r5.AFInAppEventParameterName
            java.util.Iterator r3 = r3.iterator()
        L_0x00ef:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0116
            java.lang.Object r5 = r3.next()
            com.android.billingclient.api.Purchase r5 = (com.android.billingclient.api.Purchase) r5
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r8 = r5.getPurchaseToken()
            java.lang.String r9 = "token"
            r6.put(r9, r8)
            java.lang.String r8 = "subscription_id"
            java.lang.String r5 = r5.getSku()
            r6.put(r8, r5)
            r2.add(r6)
            goto L_0x00ef
        L_0x0116:
            java.lang.String r3 = "subscriptions"
            r1.put(r3, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r1)
            java.lang.String r1 = r2.toString()
            byte[] r8 = r1.getBytes()
            com.appsflyer.internal.ab r1 = new com.appsflyer.internal.ab
            java.lang.String r9 = "POST"
            java.util.Map r10 = java.util.Collections.emptyMap()
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            com.appsflyer.internal.u r14 = r14.values
            com.appsflyer.internal.bm r2 = new com.appsflyer.internal.bm
            r2.<init>()
            com.appsflyer.internal.bg r3 = new com.appsflyer.internal.bg
            java.util.concurrent.ExecutorService r5 = r14.valueOf
            com.appsflyer.internal.bl r14 = r14.AFInAppEventParameterName
            r3.<init>(r1, r5, r14, r2)
            com.appsflyer.internal.aw$4 r14 = new com.appsflyer.internal.aw$4
            r14.<init>(r13, r0)
            java.util.concurrent.atomic.AtomicBoolean r12 = r3.valueOf
            boolean r12 = r12.getAndSet(r4)
            if (r12 != 0) goto L_0x015d
            java.util.concurrent.ExecutorService r12 = r3.AFInAppEventType
            com.appsflyer.internal.bg$4 r13 = new com.appsflyer.internal.bg$4
            r13.<init>(r14)
            r12.submit(r13)
            return
        L_0x015d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Http call is already executed"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21905aw.values(com.appsflyer.internal.aw, boolean, java.util.List):void");
    }

    public final void run() {
        try {
            if (this.values == null) {
                C21911az azVar = this.valueOf;
                BillingClient build = BillingClient.newBuilder(azVar.AFInAppEventType).setListener(new C21901at(this)).enablePendingPurchases().build();
                this.values = build;
                build.startConnection(new C21902au(this));
            }
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.valueOf("Failed to setup Play billing", th);
        }
    }
}
