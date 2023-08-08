package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.compose.p004ui.graphics.vector.C15369g;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.C21882aj;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.android.datatransport.cct.C40045d;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appsflyer.internal.bt */
public final class C21935bt extends C21951ce {
    private static int AppsFlyerConversionListener = 1;
    @VisibleForTesting
    private static String onAttributionFailureNative;
    private static char onConversionDataFail;
    private static char[] onResponseErrorNative;
    private static int onResponseNative;
    private final C21930bo onAppOpenAttribution;
    private final SharedPreferences onInstallConversionFailureNative;

    static {
        boolean z;
        AFLogger$LogLevel();
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(C21868ah.valueOf);
        onAttributionFailureNative = sb.toString();
        int i = onResponseNative + 111;
        AppsFlyerConversionListener = i % 128;
        if (i % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21935bt(@android.support.annotation.NonNull android.content.Context r8) {
        /*
            r7 = this;
            r1 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = onAttributionFailureNative
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.appsflyer.AppsFlyerLib r4 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r4 = r4.getHostPrefix()
            r5 = 0
            r3[r5] = r4
            com.appsflyer.internal.ah r4 = com.appsflyer.internal.C21868ah.valueOf()
            java.lang.String r4 = r4.getHostName()
            r5 = 1
            r3[r5] = r4
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r0.append(r2)
            java.lang.String r2 = r8.getPackageName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r7
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.content.SharedPreferences r0 = com.appsflyer.internal.C21868ah.valueOf((android.content.Context) r8)
            r7.onInstallConversionFailureNative = r0
            com.appsflyer.internal.ah r0 = com.appsflyer.internal.C21868ah.valueOf()
            com.appsflyer.internal.bo r8 = r0.AFKeystoreWrapper((android.content.Context) r8)
            r7.onAppOpenAttribution = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21935bt.<init>(android.content.Context):void");
    }

    public static boolean AFInAppEventParameterName(Context context) {
        int i = AppsFlyerConversionListener + 115;
        onResponseNative = i % 128;
        int i2 = i % 2;
        if (AppsFlyerLib.getInstance().isStopped()) {
            int i3 = AppsFlyerConversionListener + 93;
            onResponseNative = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
            return (C21845aa.AFInAppEventType(context, new Intent("com.google.firebase.MESSAGING_EVENT", (Uri) null, context, FirebaseMessagingServiceListener.class)) ? (char) 16 : 31) != 31;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    private void AFKeystoreWrapper(C22021z zVar) {
        int i = onResponseNative + 73;
        AppsFlyerConversionListener = i % 128;
        int i2 = i % 2;
        this.onInstallConversionFailureNative.edit().putString("afUninstallToken", zVar.AFInAppEventType).putLong("afUninstallToken_received_time", zVar.valueOf).putBoolean("afUninstallToken_queued", zVar.AFKeystoreWrapper()).apply();
        int i3 = AppsFlyerConversionListener + 95;
        onResponseNative = i3 % 128;
        int i4 = i3 % 2;
    }

    public static void AFLogger$LogLevel() {
        onResponseErrorNative = new char[]{'b', 'r', C15369g.f37993s, 'n', 'd', C15369g.f37985k, 'e', 'f', 'g'};
        onConversionDataFail = 3;
    }

    private void onAttributionFailureNative() {
        int i = onResponseNative + 85;
        AppsFlyerConversionListener = i % 128;
        int i2 = i % 2;
        this.onAppOpenAttribution.values("sentRegisterRequestToAF", true);
        AFLogger.values("Successfully registered for Uninstall Tracking");
        int i3 = onResponseNative + 63;
        AppsFlyerConversionListener = i3 % 128;
        int i4 = i3 % 2;
    }

    @Nullable
    private C22021z onInstallConversionFailureNative() {
        char c;
        int i = AppsFlyerConversionListener + 55;
        onResponseNative = i % 128;
        int i2 = i % 2;
        String string = this.onInstallConversionFailureNative.getString("afUninstallToken", (String) null);
        long j = this.onInstallConversionFailureNative.getLong("afUninstallToken_received_time", 0);
        boolean z = false;
        boolean z2 = this.onInstallConversionFailureNative.getBoolean("afUninstallToken_queued", false);
        this.onAppOpenAttribution.values("afUninstallToken_queued", false);
        if (string == null) {
            int i3 = onResponseNative + 91;
            AppsFlyerConversionListener = i3 % 128;
            int i4 = i3 % 2;
            String string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken");
            if (string2 != null) {
                z = true;
            }
            if (z) {
                String[] split = string2.split(",");
                string = split[split.length - 1];
            }
        }
        if (j == 0) {
            String string3 = AppsFlyerProperties.getInstance().getString("afUninstallToken");
            if (string3 != null) {
                c = '$';
            } else {
                c = '9';
            }
            if (c != '9') {
                String[] split2 = string3.split(",");
                if (split2.length >= 2) {
                    try {
                        j = Long.parseLong(split2[split2.length - 2]);
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        if (string != null) {
            return new C22021z(string, j, z2);
        }
        int i5 = onResponseNative + 59;
        AppsFlyerConversionListener = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ void valueOf(C21935bt btVar) {
        int i = AppsFlyerConversionListener + 21;
        onResponseNative = i % 128;
        char c = i % 2 != 0 ? '9' : '6';
        btVar.onAttributionFailureNative();
        if (c != '6') {
            throw null;
        }
    }

    public final void values(String str) {
        if (str != null) {
            AFLogger.AFKeystoreWrapper("Firebase Refreshed Token = ".concat(str));
            C22021z onInstallConversionFailureNative2 = onInstallConversionFailureNative();
            if (onInstallConversionFailureNative2 == null || !str.equals(onInstallConversionFailureNative2.AFInAppEventType)) {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = C21868ah.valueOf(this.onInstallConversionFailureNative) && (onInstallConversionFailureNative2 == null || currentTimeMillis - onInstallConversionFailureNative2.valueOf > TimeUnit.SECONDS.toMillis(2));
                AFKeystoreWrapper(new C22021z(str, currentTimeMillis, !z));
                if (z) {
                    AFInAppEventParameterName(str);
                }
            }
        }
    }

    public static boolean valueOf(@NonNull SharedPreferences sharedPreferences) {
        int i = AppsFlyerConversionListener + 115;
        onResponseNative = i % 128;
        int i2 = i % 2;
        boolean z = sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
        int i3 = AppsFlyerConversionListener + 97;
        onResponseNative = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String valueOf(int r8, java.lang.String r9, byte r10) {
        /*
            if (r9 == 0) goto L_0x0006
            char[] r9 = r9.toCharArray()
        L_0x0006:
            char[] r9 = (char[]) r9
            java.lang.Object r0 = com.appsflyer.internal.C21994dp.AppsFlyer2dXConversionCallback
            monitor-enter(r0)
            char[] r1 = onResponseErrorNative     // Catch:{ all -> 0x00e0 }
            char r2 = onConversionDataFail     // Catch:{ all -> 0x00e0 }
            char[] r3 = new char[r8]     // Catch:{ all -> 0x00e0 }
            int r4 = r8 % 2
            if (r4 == 0) goto L_0x001d
            int r8 = r8 + -1
            char r4 = r9[r8]     // Catch:{ all -> 0x00e0 }
            int r4 = r4 - r10
            char r4 = (char) r4     // Catch:{ all -> 0x00e0 }
            r3[r8] = r4     // Catch:{ all -> 0x00e0 }
        L_0x001d:
            r4 = 1
            if (r8 <= r4) goto L_0x00d9
            r5 = 0
            com.appsflyer.internal.C21994dp.AFInAppEventParameterName = r5     // Catch:{ all -> 0x00e0 }
        L_0x0023:
            int r5 = com.appsflyer.internal.C21994dp.AFInAppEventParameterName     // Catch:{ all -> 0x00e0 }
            if (r5 >= r8) goto L_0x00d9
            char r5 = r9[r5]     // Catch:{ all -> 0x00e0 }
            com.appsflyer.internal.C21994dp.values = r5     // Catch:{ all -> 0x00e0 }
            int r5 = com.appsflyer.internal.C21994dp.AFInAppEventParameterName     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + r4
            char r5 = r9[r5]     // Catch:{ all -> 0x00e0 }
            com.appsflyer.internal.C21994dp.valueOf = r5     // Catch:{ all -> 0x00e0 }
            char r5 = com.appsflyer.internal.C21994dp.values     // Catch:{ all -> 0x00e0 }
            char r6 = com.appsflyer.internal.C21994dp.valueOf     // Catch:{ all -> 0x00e0 }
            if (r5 != r6) goto L_0x004b
            int r5 = com.appsflyer.internal.C21994dp.AFInAppEventParameterName     // Catch:{ all -> 0x00e0 }
            char r6 = com.appsflyer.internal.C21994dp.values     // Catch:{ all -> 0x00e0 }
            int r6 = r6 - r10
            char r6 = (char) r6     // Catch:{ all -> 0x00e0 }
            r3[r5] = r6     // Catch:{ all -> 0x00e0 }
            int r5 = com.appsflyer.internal.C21994dp.AFInAppEventParameterName     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + r4
            char r6 = com.appsflyer.internal.C21994dp.valueOf     // Catch:{ all -> 0x00e0 }
            int r6 = r6 - r10
            char r6 = (char) r6     // Catch:{ all -> 0x00e0 }
            r3[r5] = r6     // Catch:{ all -> 0x00e0 }
            goto L_0x00d1
        L_0x004b:
            char r5 = com.appsflyer.internal.C21994dp.values     // Catch:{ all -> 0x00e0 }
            int r5 = r5 / r2
            com.appsflyer.internal.C21994dp.AFKeystoreWrapper = r5     // Catch:{ all -> 0x00e0 }
            char r5 = com.appsflyer.internal.C21994dp.values     // Catch:{ all -> 0x00e0 }
            int r5 = r5 % r2
            com.appsflyer.internal.C21994dp.AFVersionDeclaration = r5     // Catch:{ all -> 0x00e0 }
            char r5 = com.appsflyer.internal.C21994dp.valueOf     // Catch:{ all -> 0x00e0 }
            int r5 = r5 / r2
            com.appsflyer.internal.C21994dp.AFInAppEventType = r5     // Catch:{ all -> 0x00e0 }
            char r5 = com.appsflyer.internal.C21994dp.valueOf     // Catch:{ all -> 0x00e0 }
            int r5 = r5 % r2
            com.appsflyer.internal.C21994dp.getLevel = r5     // Catch:{ all -> 0x00e0 }
            int r5 = com.appsflyer.internal.C21994dp.AFVersionDeclaration     // Catch:{ all -> 0x00e0 }
            int r6 = com.appsflyer.internal.C21994dp.getLevel     // Catch:{ all -> 0x00e0 }
            if (r5 != r6) goto L_0x008c
            int r5 = com.appsflyer.internal.C21994dp.AFKeystoreWrapper     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + r2
            int r5 = r5 - r4
            int r5 = r5 % r2
            com.appsflyer.internal.C21994dp.AFKeystoreWrapper = r5     // Catch:{ all -> 0x00e0 }
            int r5 = com.appsflyer.internal.C21994dp.AFInAppEventType     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + r2
            int r5 = r5 - r4
            int r5 = r5 % r2
            com.appsflyer.internal.C21994dp.AFInAppEventType = r5     // Catch:{ all -> 0x00e0 }
            int r5 = com.appsflyer.internal.C21994dp.AFKeystoreWrapper     // Catch:{ all -> 0x00e0 }
            int r5 = r5 * r2
            int r6 = com.appsflyer.internal.C21994dp.AFVersionDeclaration     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + r6
            int r6 = com.appsflyer.internal.C21994dp.AFInAppEventType     // Catch:{ all -> 0x00e0 }
            int r6 = r6 * r2
            int r7 = com.appsflyer.internal.C21994dp.getLevel     // Catch:{ all -> 0x00e0 }
            int r6 = r6 + r7
            int r7 = com.appsflyer.internal.C21994dp.AFInAppEventParameterName     // Catch:{ all -> 0x00e0 }
            char r5 = r1[r5]     // Catch:{ all -> 0x00e0 }
            r3[r7] = r5     // Catch:{ all -> 0x00e0 }
            int r7 = r7 + 1
            char r5 = r1[r6]     // Catch:{ all -> 0x00e0 }
            r3[r7] = r5     // Catch:{ all -> 0x00e0 }
            goto L_0x00d1
        L_0x008c:
            int r5 = com.appsflyer.internal.C21994dp.AFKeystoreWrapper     // Catch:{ all -> 0x00e0 }
            int r6 = com.appsflyer.internal.C21994dp.AFInAppEventType     // Catch:{ all -> 0x00e0 }
            if (r5 != r6) goto L_0x00b9
            int r5 = com.appsflyer.internal.C21994dp.AFVersionDeclaration     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + r2
            int r5 = r5 - r4
            int r5 = r5 % r2
            com.appsflyer.internal.C21994dp.AFVersionDeclaration = r5     // Catch:{ all -> 0x00e0 }
            int r5 = com.appsflyer.internal.C21994dp.getLevel     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + r2
            int r5 = r5 - r4
            int r5 = r5 % r2
            com.appsflyer.internal.C21994dp.getLevel = r5     // Catch:{ all -> 0x00e0 }
            int r5 = com.appsflyer.internal.C21994dp.AFKeystoreWrapper     // Catch:{ all -> 0x00e0 }
            int r5 = r5 * r2
            int r6 = com.appsflyer.internal.C21994dp.AFVersionDeclaration     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + r6
            int r6 = com.appsflyer.internal.C21994dp.AFInAppEventType     // Catch:{ all -> 0x00e0 }
            int r6 = r6 * r2
            int r7 = com.appsflyer.internal.C21994dp.getLevel     // Catch:{ all -> 0x00e0 }
            int r6 = r6 + r7
            int r7 = com.appsflyer.internal.C21994dp.AFInAppEventParameterName     // Catch:{ all -> 0x00e0 }
            char r5 = r1[r5]     // Catch:{ all -> 0x00e0 }
            r3[r7] = r5     // Catch:{ all -> 0x00e0 }
            int r7 = r7 + 1
            char r5 = r1[r6]     // Catch:{ all -> 0x00e0 }
            r3[r7] = r5     // Catch:{ all -> 0x00e0 }
            goto L_0x00d1
        L_0x00b9:
            int r5 = com.appsflyer.internal.C21994dp.AFKeystoreWrapper     // Catch:{ all -> 0x00e0 }
            int r5 = r5 * r2
            int r6 = com.appsflyer.internal.C21994dp.getLevel     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + r6
            int r6 = com.appsflyer.internal.C21994dp.AFInAppEventType     // Catch:{ all -> 0x00e0 }
            int r6 = r6 * r2
            int r7 = com.appsflyer.internal.C21994dp.AFVersionDeclaration     // Catch:{ all -> 0x00e0 }
            int r6 = r6 + r7
            int r7 = com.appsflyer.internal.C21994dp.AFInAppEventParameterName     // Catch:{ all -> 0x00e0 }
            char r5 = r1[r5]     // Catch:{ all -> 0x00e0 }
            r3[r7] = r5     // Catch:{ all -> 0x00e0 }
            int r7 = r7 + 1
            char r5 = r1[r6]     // Catch:{ all -> 0x00e0 }
            r3[r7] = r5     // Catch:{ all -> 0x00e0 }
        L_0x00d1:
            int r5 = com.appsflyer.internal.C21994dp.AFInAppEventParameterName     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + 2
            com.appsflyer.internal.C21994dp.AFInAppEventParameterName = r5     // Catch:{ all -> 0x00e0 }
            goto L_0x0023
        L_0x00d9:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x00e0 }
            r8.<init>(r3)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            return r8
        L_0x00e0:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21935bt.valueOf(int, java.lang.String, byte):java.lang.String");
    }

    private void AFInAppEventParameterName(String str) {
        Application application = this.AFInAppEventType;
        final C21868ah valueOf = C21868ah.valueOf();
        if (valueOf.values()) {
            AFLogger.AFInAppEventType("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        if (devKey == null) {
            AFLogger.AppsFlyer2dXConversionCallback("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(application.getPackageName(), 0);
            this.valueOf.put("app_version_code", Integer.toString(packageInfo.versionCode));
            this.valueOf.put("app_version_name", packageInfo.versionName);
            this.valueOf.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            this.valueOf.put("installDate", C21868ah.valueOf(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
            int i = AppsFlyerConversionListener + 35;
            onResponseNative = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("Exception while collecting application version info.", th);
        }
        C21868ah.AFKeystoreWrapper((Context) application, (Map<String, ? super String>) this.valueOf);
        String AFKeystoreWrapper = C21868ah.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            int i3 = onResponseNative + 123;
            AppsFlyerConversionListener = i3 % 128;
            int i4 = i3 % 2;
            this.valueOf.put("appUserId", AFKeystoreWrapper);
        }
        try {
            this.valueOf.put(C40045d.f102104u, Build.MODEL);
            this.valueOf.put(valueOf(5 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0001\u0002\u0000\u0005o", (byte) (11 - TextUtils.indexOf("", ""))).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.AFKeystoreWrapper("Exception while collecting device brand and model.", th2);
        }
        if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false) ? '^' : 19) == '^') {
            this.valueOf.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, C13758b.f33436b);
        }
        C21996h valueOf2 = C22021z.valueOf(application.getContentResolver());
        if (!(valueOf2 == null)) {
            int i5 = onResponseNative + 77;
            AppsFlyerConversionListener = i5 % 128;
            if (!(i5 % 2 == 0)) {
                this.valueOf.put("amazon_aid", valueOf2.valueOf);
                this.valueOf.put("amazon_aid_limit", String.valueOf(valueOf2.AFInAppEventParameterName));
            } else {
                this.valueOf.put("amazon_aid", valueOf2.valueOf);
                this.valueOf.put("amazon_aid_limit", String.valueOf(valueOf2.AFInAppEventParameterName));
                int i6 = 45 / 0;
            }
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            int i7 = AppsFlyerConversionListener + 121;
            onResponseNative = i7 % 128;
            int i8 = i7 % 2;
            this.valueOf.put("advertiserId", string);
        }
        this.valueOf.put("devkey", devKey);
        this.valueOf.put("uid", C21885al.AFKeystoreWrapper(new WeakReference(application)));
        this.valueOf.put("af_gcm_token", str);
        this.valueOf.put("launch_counter", Integer.toString(valueOf.valueOf(this.onInstallConversionFailureNative, false)));
        this.valueOf.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String values = valueOf.values((Context) application);
        if (values != null) {
            int i9 = AppsFlyerConversionListener + 123;
            onResponseNative = i9 % 128;
            if (i9 % 2 == 0) {
                this.valueOf.put("channel", values);
            } else {
                this.valueOf.put("channel", values);
                throw null;
            }
        }
        new Thread(new Runnable() {
            public final void run() {
                try {
                    C21935bt btVar = C21935bt.this;
                    btVar.onConversionDataSuccess = valueOf.isStopped();
                    HttpURLConnection AFInAppEventParameterName2 = new C21882aj.C21883a(btVar).AFInAppEventParameterName();
                    if (AFInAppEventParameterName2 != null) {
                        if (AFInAppEventParameterName2.getResponseCode() == 200) {
                            C21935bt.valueOf(C21935bt.this);
                        }
                        AFInAppEventParameterName2.disconnect();
                    }
                } catch (Throwable th) {
                    AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                }
            }
        }).start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if ((r0 != null ? 6 : ',') != ',') goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void values() {
        /*
            r3 = this;
            int r0 = AppsFlyerConversionListener
            int r0 = r0 + 125
            int r1 = r0 % 128
            onResponseNative = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x000f
            r0 = r1
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 == 0) goto L_0x0019
            com.appsflyer.internal.z r0 = r3.onInstallConversionFailureNative()
            if (r0 == 0) goto L_0x0041
            goto L_0x0029
        L_0x0019:
            com.appsflyer.internal.z r0 = r3.onInstallConversionFailureNative()
            r2 = 62
            int r2 = r2 / r1
            r1 = 44
            if (r0 == 0) goto L_0x0026
            r2 = 6
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            if (r2 == r1) goto L_0x0041
        L_0x0029:
            boolean r1 = r0.AFKeystoreWrapper()
            if (r1 == 0) goto L_0x0041
            java.lang.String r0 = r0.AFInAppEventType
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Resending Uninstall token to AF servers: "
            java.lang.String r1 = r2.concat(r1)
            com.appsflyer.AFLogger.values(r1)
            r3.AFInAppEventParameterName((java.lang.String) r0)
        L_0x0041:
            int r0 = onResponseNative
            int r0 = r0 + 81
            int r1 = r0 % 128
            AppsFlyerConversionListener = r1
            int r0 = r0 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21935bt.values():void");
    }
}
