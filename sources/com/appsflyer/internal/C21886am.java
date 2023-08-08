package com.appsflyer.internal;

import android.content.pm.PackageManager;
import androidx.compose.p004ui.graphics.vector.C15369g;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.appsflyer.internal.am */
public final class C21886am {
    private static int AppsFlyer2dXConversionCallback = 0;
    private static int[] init = {288571013, -198061760, 823966964, 1320713339, 849398014, 1869020872, -1241433926, 647238314, -1244683384, -44838674, -767588914, -1112926427, 525898567, -483604094, -1206887563, -1000200165, -1979689575, 703750713};
    private static int onInstallConversionFailureNative = 1;
    private static C21886am valueOf;
    private Map<String, Object> AFInAppEventParameterName;
    private int AFInAppEventType = 0;
    private List<String> AFKeystoreWrapper = new ArrayList();
    private boolean AFLogger$LogLevel = (true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false));
    private boolean AFVersionDeclaration = false;
    private String getLevel = "-1";
    private boolean values = true;

    private C21886am() {
    }

    public static C21886am AFKeystoreWrapper() {
        int i = AppsFlyer2dXConversionCallback + 119;
        onInstallConversionFailureNative = i % 128;
        int i2 = i % 2;
        if (valueOf == null) {
            valueOf = new C21886am();
            int i3 = AppsFlyer2dXConversionCallback + 31;
            onInstallConversionFailureNative = i3 % 128;
            int i4 = i3 % 2;
        }
        return valueOf;
    }

    private synchronized void AFLogger$LogLevel() {
        this.AFKeystoreWrapper = new ArrayList();
        this.AFInAppEventType = 0;
        int i = onInstallConversionFailureNative + 95;
        AppsFlyer2dXConversionCallback = i % 128;
        int i2 = i % 2;
    }

    private synchronized Map<String, Object> AppsFlyer2dXConversionCallback() {
        boolean z;
        int i = onInstallConversionFailureNative + 107;
        AppsFlyer2dXConversionCallback = i % 128;
        if (i % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.AFInAppEventParameterName.put("data", this.AFKeystoreWrapper);
            AFLogger$LogLevel();
        } else {
            this.AFInAppEventParameterName.put("data", this.AFKeystoreWrapper);
            AFLogger$LogLevel();
            throw null;
        }
        return this.AFInAppEventParameterName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if ((!r4.AFVersionDeclaration) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean init() {
        /*
            r4 = this;
            boolean r0 = r4.AFLogger$LogLevel
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            if (r0 == r2) goto L_0x003a
            boolean r0 = r4.values
            if (r0 != 0) goto L_0x002f
            int r0 = AppsFlyer2dXConversionCallback
            int r0 = r0 + 79
            int r3 = r0 % 128
            onInstallConversionFailureNative = r3
            int r0 = r0 % 2
            r3 = 44
            if (r0 != 0) goto L_0x001f
            r0 = r3
            goto L_0x0021
        L_0x001f:
            r0 = 93
        L_0x0021:
            if (r0 == r3) goto L_0x002d
            boolean r0 = r4.AFVersionDeclaration
            if (r0 == 0) goto L_0x0029
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            goto L_0x003a
        L_0x002d:
            r0 = 0
            throw r0
        L_0x002f:
            int r0 = AppsFlyer2dXConversionCallback
            int r0 = r0 + 65
            int r1 = r0 % 128
            onInstallConversionFailureNative = r1
            int r0 = r0 % 2
            return r2
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21886am.init():boolean");
    }

    public final void AFInAppEventParameterName(String str, String str2) {
        int i = AppsFlyer2dXConversionCallback + 31;
        onInstallConversionFailureNative = i % 128;
        boolean z = false;
        if ((i % 2 == 0 ? 26 : 'G') != 26) {
            valueOf("server_request", str, str2);
        } else {
            String[] strArr = new String[0];
            strArr[0] = str2;
            valueOf("server_request", str, strArr);
        }
        int i2 = AppsFlyer2dXConversionCallback + 7;
        onInstallConversionFailureNative = i2 % 128;
        if (i2 % 2 != 0) {
            z = true;
        }
        if (!z) {
            throw null;
        }
    }

    public final synchronized void AFInAppEventType() {
        this.AFVersionDeclaration = true;
        valueOf("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        int i = onInstallConversionFailureNative + 69;
        AppsFlyer2dXConversionCallback = i % 128;
        if ((i % 2 != 0 ? 'E' : 14) == 'E') {
            throw null;
        }
    }

    public final void AFVersionDeclaration() {
        int i = AppsFlyer2dXConversionCallback + 5;
        int i2 = i % 128;
        onInstallConversionFailureNative = i2;
        if (i % 2 == 0) {
        }
        this.AFLogger$LogLevel = false;
        int i3 = i2 + 49;
        AppsFlyer2dXConversionCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public final boolean getLevel() {
        int i = onInstallConversionFailureNative;
        int i2 = i + 69;
        AppsFlyer2dXConversionCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.AFVersionDeclaration;
        int i4 = i + 69;
        AppsFlyer2dXConversionCallback = i4 % 128;
        if ((i4 % 2 != 0 ? 'R' : 'M') == 'M') {
            return z;
        }
        throw null;
    }

    public final synchronized void valueOf() {
        valueOf("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.AFVersionDeclaration = false;
        this.values = false;
        int i = AppsFlyer2dXConversionCallback + 17;
        onInstallConversionFailureNative = i % 128;
        int i2 = i % 2;
    }

    public final synchronized void values() {
        int i = onInstallConversionFailureNative + 115;
        int i2 = i % 128;
        AppsFlyer2dXConversionCallback = i2;
        int i3 = i % 2;
        this.AFInAppEventParameterName = null;
        valueOf = null;
        int i4 = i2 + 57;
        onInstallConversionFailureNative = i4 % 128;
        int i5 = i4 % 2;
    }

    public final synchronized void AFInAppEventParameterName() {
        int i = AppsFlyer2dXConversionCallback + 91;
        onInstallConversionFailureNative = i % 128;
        if (!(i % 2 == 0 ? true : false)) {
            this.values = false;
        } else {
            this.values = false;
        }
        AFLogger$LogLevel();
        int i2 = onInstallConversionFailureNative + 1;
        AppsFlyer2dXConversionCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cf, code lost:
        if (r9.length() > 0) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void AFInAppEventType(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x00e1 }
            int r0 = r0 + 29
            int r1 = r0 % 128
            onInstallConversionFailureNative = r1     // Catch:{ all -> 0x00e1 }
            r1 = 2
            int r0 = r0 % r1
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00df }
            r2 = 4
            int[] r2 = new int[r2]     // Catch:{ all -> 0x00df }
            r3 = 1889491691(0x709f5aeb, float:3.9454424E29)
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x00df }
            r3 = 1
            r5 = -1716683139(0xffffffff99ad7e7d, float:-1.7938869E-23)
            r2[r3] = r5     // Catch:{ all -> 0x00df }
            r3 = -1719306798(0xffffffff998575d2, float:-1.3799465E-23)
            r2[r1] = r3     // Catch:{ all -> 0x00df }
            r3 = 3
            r5 = 1698711110(0x65404646, float:5.6749418E22)
            r2[r3] = r5     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ""
            r5 = 48
            int r3 = android.text.TextUtils.indexOf(r3, r5, r4, r4)     // Catch:{ all -> 0x00df }
            int r3 = r3 + 6
            java.lang.String r2 = AFInAppEventType(r2, r3)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.intern()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = android.os.Build.BRAND     // Catch:{ all -> 0x00df }
            r0.put(r2, r3)     // Catch:{ all -> 0x00df }
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "model"
            java.lang.String r3 = android.os.Build.MODEL     // Catch:{ all -> 0x00df }
            r0.put(r2, r3)     // Catch:{ all -> 0x00df }
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "platform"
            java.lang.String r3 = "Android"
            r0.put(r2, r3)     // Catch:{ all -> 0x00df }
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "platform_version"
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x00df }
            r0.put(r2, r3)     // Catch:{ all -> 0x00df }
            if (r7 == 0) goto L_0x0079
            int r0 = r7.length()     // Catch:{ all -> 0x00df }
            r2 = 41
            if (r0 <= 0) goto L_0x0066
            r0 = 89
            goto L_0x0067
        L_0x0066:
            r0 = r2
        L_0x0067:
            if (r0 == r2) goto L_0x0079
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "advertiserId"
            r0.put(r2, r7)     // Catch:{ all -> 0x00df }
            int r7 = onInstallConversionFailureNative     // Catch:{ all -> 0x00e1 }
            int r7 = r7 + 7
            int r0 = r7 % 128
            AppsFlyer2dXConversionCallback = r0     // Catch:{ all -> 0x00e1 }
            int r7 = r7 % r1
        L_0x0079:
            r7 = 60
            if (r8 == 0) goto L_0x007f
            r0 = r7
            goto L_0x0081
        L_0x007f:
            r0 = 13
        L_0x0081:
            if (r0 == r7) goto L_0x0084
            goto L_0x00ac
        L_0x0084:
            int r7 = onInstallConversionFailureNative     // Catch:{ all -> 0x00e1 }
            int r7 = r7 + 65
            int r0 = r7 % 128
            AppsFlyer2dXConversionCallback = r0     // Catch:{ all -> 0x00e1 }
            int r7 = r7 % r1
            r0 = 8
            if (r7 == 0) goto L_0x0093
            r7 = r0
            goto L_0x0095
        L_0x0093:
            r7 = 36
        L_0x0095:
            if (r7 == r0) goto L_0x00da
            int r7 = r8.length()     // Catch:{ all -> 0x00df }
            r0 = 22
            if (r7 <= 0) goto L_0x00a2
            r7 = 45
            goto L_0x00a3
        L_0x00a2:
            r7 = r0
        L_0x00a3:
            if (r7 == r0) goto L_0x00ac
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "imei"
            r7.put(r0, r8)     // Catch:{ all -> 0x00df }
        L_0x00ac:
            if (r9 == 0) goto L_0x00d8
            int r7 = AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x00e1 }
            int r7 = r7 + 121
            int r8 = r7 % 128
            onInstallConversionFailureNative = r8     // Catch:{ all -> 0x00e1 }
            int r7 = r7 % r1
            if (r7 != 0) goto L_0x00cb
            int r7 = r9.length()     // Catch:{ all -> 0x00df }
            r8 = 39
            int r8 = r8 / r4
            r8 = 75
            if (r7 <= 0) goto L_0x00c7
            r7 = 87
            goto L_0x00c8
        L_0x00c7:
            r7 = r8
        L_0x00c8:
            if (r7 == r8) goto L_0x00d8
            goto L_0x00d1
        L_0x00cb:
            int r7 = r9.length()     // Catch:{ all -> 0x00df }
            if (r7 <= 0) goto L_0x00d8
        L_0x00d1:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "android_id"
            r7.put(r8, r9)     // Catch:{ all -> 0x00df }
        L_0x00d8:
            monitor-exit(r6)
            return
        L_0x00da:
            r8.length()     // Catch:{ all -> 0x00df }
            r7 = 0
            throw r7     // Catch:{ all -> 0x00df }
        L_0x00df:
            monitor-exit(r6)
            return
        L_0x00e1:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21886am.AFInAppEventType(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void valueOf(String str, PackageManager packageManager) {
        int i = onInstallConversionFailureNative + 3;
        AppsFlyer2dXConversionCallback = i % 128;
        int i2 = i % 2;
        try {
            AFKeystoreWrapper(str, packageManager);
            C21921bg<String> AFInAppEventType2 = C21868ah.valueOf().AFInAppEventType().AFInAppEventParameterName().AFInAppEventType(AppsFlyer2dXConversionCallback());
            if (!AFInAppEventType2.valueOf.getAndSet(true)) {
                AFInAppEventType2.AFInAppEventType.submit(new Runnable((C21925bj) null) {
                    private /* synthetic */ C21925bj AFKeystoreWrapper;

                    {
                        this.AFKeystoreWrapper = r2;
                    }

                    public final void run() {
                        try {
                            C21921bg bgVar = C21921bg.this;
                            C21932bq<String> valueOf = bgVar.AFInAppEventParameterName.valueOf(bgVar.AFKeystoreWrapper);
                            if (this.AFKeystoreWrapper != null) {
                                try {
                                    this.AFKeystoreWrapper.AFInAppEventParameterName(new C21932bq(C21921bg.this.values.AFInAppEventParameterName((String) valueOf.values), valueOf.AFInAppEventType, valueOf.valueOf, valueOf.AFKeystoreWrapper, valueOf.AFInAppEventParameterName));
                                } catch (JSONException e) {
                                    this.AFKeystoreWrapper.values(new ParsingException(e.getMessage(), e, valueOf));
                                }
                            }
                        } catch (IOException e2) {
                            C21925bj bjVar = this.AFKeystoreWrapper;
                            if (bjVar != null) {
                                bjVar.values(e2);
                            }
                        }
                    }
                });
                int i3 = AppsFlyer2dXConversionCallback + 109;
                onInstallConversionFailureNative = i3 % 128;
                if ((i3 % 2 == 0 ? 0 : '9') == 0) {
                    throw null;
                }
                return;
            }
            throw new IllegalStateException("Http call is already executed");
        } catch (Throwable th) {
            AFLogger.AFInAppEventType(th);
        }
    }

    public final void values(String str, String... strArr) {
        int i = onInstallConversionFailureNative + 65;
        AppsFlyer2dXConversionCallback = i % 128;
        char c = i % 2 != 0 ? C15369g.f37982h : 12;
        valueOf("public_api_call", str, strArr);
        if (c != 12) {
            throw null;
        }
    }

    public final synchronized void AFKeystoreWrapper(String str) {
        int i = onInstallConversionFailureNative;
        int i2 = i + 19;
        AppsFlyer2dXConversionCallback = i2 % 128;
        int i3 = i2 % 2;
        this.getLevel = str;
        int i4 = i + 21;
        AppsFlyer2dXConversionCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if ((r5.length() > 0 ? androidx.compose.p004ui.graphics.vector.C15369g.f37980f : 2) != 2) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void AFKeystoreWrapper(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x00a8 }
            int r1 = r0 + 31
            int r2 = r1 % 128
            onInstallConversionFailureNative = r2     // Catch:{ all -> 0x00a8 }
            r2 = 2
            int r1 = r1 % r2
            if (r1 == 0) goto L_0x00a4
            r1 = 0
            if (r5 == 0) goto L_0x0036
            int r0 = r0 + 19
            int r3 = r0 % 128
            onInstallConversionFailureNative = r3     // Catch:{ all -> 0x00a8 }
            int r0 = r0 % r2
            if (r0 != 0) goto L_0x0023
            int r0 = r5.length()     // Catch:{ all -> 0x00a6 }
            r3 = 72
            int r3 = r3 / r1
            if (r0 <= 0) goto L_0x0036
            goto L_0x002f
        L_0x0023:
            int r0 = r5.length()     // Catch:{ all -> 0x00a6 }
            if (r0 <= 0) goto L_0x002c
            r0 = 76
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            if (r0 == r2) goto L_0x0036
        L_0x002f:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.AFInAppEventParameterName     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = "app_id"
            r0.put(r3, r5)     // Catch:{ all -> 0x00a6 }
        L_0x0036:
            r5 = 1
            if (r6 == 0) goto L_0x003b
            r0 = r5
            goto L_0x003c
        L_0x003b:
            r0 = r1
        L_0x003c:
            r3 = 69
            if (r0 == r5) goto L_0x0041
            goto L_0x005e
        L_0x0041:
            int r5 = r6.length()     // Catch:{ all -> 0x00a6 }
            if (r5 <= 0) goto L_0x005e
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.AFInAppEventParameterName     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "app_version"
            r5.put(r0, r6)     // Catch:{ all -> 0x00a6 }
            int r5 = onInstallConversionFailureNative     // Catch:{ all -> 0x00a8 }
            int r5 = r5 + 35
            int r6 = r5 % 128
            AppsFlyer2dXConversionCallback = r6     // Catch:{ all -> 0x00a8 }
            int r5 = r5 % r2
            r6 = 17
            if (r5 == 0) goto L_0x005d
            r5 = r6
            goto L_0x005e
        L_0x005d:
            r5 = r3
        L_0x005e:
            if (r7 == 0) goto L_0x007f
            int r5 = r7.length()     // Catch:{ all -> 0x00a6 }
            if (r5 <= 0) goto L_0x007f
            int r5 = onInstallConversionFailureNative     // Catch:{ all -> 0x00a8 }
            int r5 = r5 + 95
            int r6 = r5 % 128
            AppsFlyer2dXConversionCallback = r6     // Catch:{ all -> 0x00a8 }
            int r5 = r5 % r2
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.AFInAppEventParameterName     // Catch:{ all -> 0x00a6 }
            java.lang.String r6 = "channel"
            r5.put(r6, r7)     // Catch:{ all -> 0x00a6 }
            int r5 = onInstallConversionFailureNative     // Catch:{ all -> 0x00a8 }
            int r5 = r5 + 119
            int r6 = r5 % 128
            AppsFlyer2dXConversionCallback = r6     // Catch:{ all -> 0x00a8 }
            int r5 = r5 % r2
        L_0x007f:
            if (r8 == 0) goto L_0x0082
            r1 = r3
        L_0x0082:
            if (r1 == 0) goto L_0x00a2
            int r5 = r8.length()     // Catch:{ all -> 0x00a6 }
            r6 = 90
            if (r5 <= 0) goto L_0x008f
            r5 = 68
            goto L_0x0090
        L_0x008f:
            r5 = r6
        L_0x0090:
            if (r5 == r6) goto L_0x00a2
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.AFInAppEventParameterName     // Catch:{ all -> 0x00a6 }
            java.lang.String r6 = "preInstall"
            r5.put(r6, r8)     // Catch:{ all -> 0x00a6 }
            int r5 = AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x00a8 }
            int r5 = r5 + 11
            int r6 = r5 % 128
            onInstallConversionFailureNative = r6     // Catch:{ all -> 0x00a8 }
            int r5 = r5 % r2
        L_0x00a2:
            monitor-exit(r4)
            return
        L_0x00a4:
            r5 = 0
            throw r5     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            monitor-exit(r4)
            return
        L_0x00a8:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21886am.AFKeystoreWrapper(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void valueOf(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        int i = AppsFlyer2dXConversionCallback + 13;
        onInstallConversionFailureNative = i % 128;
        if ((i % 2 == 0 ? ':' : 'J') != ':') {
            Throwable cause = th.getCause();
            String simpleName = th.getClass().getSimpleName();
            String message = cause == null ? th.getMessage() : cause.getMessage();
            if (!(cause == null ? true : false)) {
                stackTraceElementArr = cause.getStackTrace();
                int i2 = AppsFlyer2dXConversionCallback + 123;
                onInstallConversionFailureNative = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = AppsFlyer2dXConversionCallback + 45;
                onInstallConversionFailureNative = i4 % 128;
                int i5 = i4 % 2;
                stackTraceElementArr = th.getStackTrace();
            }
            valueOf("exception", simpleName, valueOf(message, stackTraceElementArr));
            return;
        }
        th.getCause();
        throw null;
    }

    private synchronized void AFInAppEventType(String str, String str2, String str3, String str4) {
        int i = onInstallConversionFailureNative + 71;
        AppsFlyer2dXConversionCallback = i % 128;
        int i2 = i % 2;
        try {
            this.AFInAppEventParameterName.put("sdk_version", str);
            if (str2 != null) {
                if (!(str2.length() <= 0)) {
                    int i3 = onInstallConversionFailureNative + 67;
                    AppsFlyer2dXConversionCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.AFInAppEventParameterName.put("devkey", str2);
                    } else {
                        this.AFInAppEventParameterName.put("devkey", str2);
                        throw null;
                    }
                }
            }
            if (str3 != null) {
                int i4 = AppsFlyer2dXConversionCallback + 43;
                onInstallConversionFailureNative = i4 % 128;
                if (i4 % 2 != 0) {
                    if ((str3.length() > 0 ? C15369g.f37985k : 20) != 20) {
                        this.AFInAppEventParameterName.put("originalAppsFlyerId", str3);
                        int i5 = onInstallConversionFailureNative + 33;
                        AppsFlyer2dXConversionCallback = i5 % 128;
                        int i6 = i5 % 2;
                    }
                } else {
                    throw null;
                }
            }
            if (str4 != null) {
                int i7 = onInstallConversionFailureNative + 73;
                AppsFlyer2dXConversionCallback = i7 % 128;
                int i8 = i7 % 2;
                if (str4.length() > 0) {
                    int i9 = AppsFlyer2dXConversionCallback + 53;
                    onInstallConversionFailureNative = i9 % 128;
                    if (i9 % 2 == 0) {
                        this.AFInAppEventParameterName.put("uid", str4);
                        int i10 = 36 / 0;
                    } else {
                        this.AFInAppEventParameterName.put("uid", str4);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void AFKeystoreWrapper(String str, int i, String str2) {
        int i2 = AppsFlyer2dXConversionCallback + 39;
        onInstallConversionFailureNative = i2 % 128;
        int i3 = i2 % 2;
        valueOf("server_response", str, String.valueOf(i), str2);
        int i4 = AppsFlyer2dXConversionCallback + 89;
        onInstallConversionFailureNative = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|9|10|11|12|(1:14)(1:15)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0078 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void AFKeystoreWrapper(java.lang.String r7, android.content.pm.PackageManager r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = onInstallConversionFailureNative     // Catch:{ all -> 0x00ad }
            int r0 = r0 + 97
            int r1 = r0 % 128
            AppsFlyer2dXConversionCallback = r1     // Catch:{ all -> 0x00ad }
            int r0 = r0 % 2
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "remote_debug_static_data"
            java.lang.String r2 = r0.getString(r1)     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x0023
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x0098 }
            r7.<init>(r2)     // Catch:{ all -> 0x0098 }
            java.util.Map r7 = com.appsflyer.internal.C22003k.AFKeystoreWrapper((org.json.JSONObject) r7)     // Catch:{ all -> 0x0098 }
            r6.AFInAppEventParameterName = r7     // Catch:{ all -> 0x0098 }
            goto L_0x0098
        L_0x0023:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x00ad }
            r2.<init>()     // Catch:{ all -> 0x00ad }
            r6.AFInAppEventParameterName = r2     // Catch:{ all -> 0x00ad }
            com.appsflyer.internal.ah r2 = com.appsflyer.internal.C21868ah.valueOf()     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "advertiserId"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = r2.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = r2.AFVersionDeclaration     // Catch:{ all -> 0x00ad }
            r6.AFInAppEventType(r3, r4, r2)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "6.5.2."
            r2.<init>(r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = com.appsflyer.internal.C21868ah.AFInAppEventParameterName     // Catch:{ all -> 0x00ad }
            r2.append(r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = r0.getDevKey()     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = "KSAppsFlyerId"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = "uid"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ all -> 0x00ad }
            r6.AFInAppEventType(r2, r3, r4, r5)     // Catch:{ all -> 0x00ad }
            r2 = 0
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r7, r2)     // Catch:{ all -> 0x0078 }
            int r8 = r8.versionCode     // Catch:{ all -> 0x0078 }
            java.lang.String r2 = "channel"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = "preInstallName"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x0078 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0078 }
            r6.AFKeystoreWrapper(r7, r8, r2, r3)     // Catch:{ all -> 0x0078 }
        L_0x0078:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x00ad }
            java.util.Map<java.lang.String, java.lang.Object> r8 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00ad }
            r7.<init>(r8)     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ad }
            r0.set((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ all -> 0x00ad }
            int r7 = AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x00ad }
            int r7 = r7 + 103
            int r8 = r7 % 128
            onInstallConversionFailureNative = r8     // Catch:{ all -> 0x00ad }
            int r7 = r7 % 2
            r8 = 68
            if (r7 != 0) goto L_0x0097
            r7 = 63
            goto L_0x0098
        L_0x0097:
            r7 = r8
        L_0x0098:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00ad }
            java.lang.String r8 = "launch_counter"
            java.lang.String r0 = r6.getLevel     // Catch:{ all -> 0x00ad }
            r7.put(r8, r0)     // Catch:{ all -> 0x00ad }
            int r7 = onInstallConversionFailureNative     // Catch:{ all -> 0x00ad }
            int r7 = r7 + 47
            int r8 = r7 % 128
            AppsFlyer2dXConversionCallback = r8     // Catch:{ all -> 0x00ad }
            int r7 = r7 % 2
            monitor-exit(r6)
            return
        L_0x00ad:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21886am.AFKeystoreWrapper(java.lang.String, android.content.pm.PackageManager):void");
    }

    public final void valueOf(String str, String str2) {
        int i = AppsFlyer2dXConversionCallback + 1;
        onInstallConversionFailureNative = i % 128;
        int i2 = i % 2;
        valueOf((String) null, str, str2);
        int i3 = AppsFlyer2dXConversionCallback + 63;
        onInstallConversionFailureNative = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if ((init() ? true : true) != true) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        if (init() != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        if (r5.AFInAppEventType >= 98304) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void valueOf(java.lang.String r6, java.lang.String r7, java.lang.String... r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = onInstallConversionFailureNative     // Catch:{ all -> 0x00e3 }
            int r0 = r0 + 3
            int r1 = r0 % 128
            AppsFlyer2dXConversionCallback = r1     // Catch:{ all -> 0x00e3 }
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            boolean r0 = r5.init()     // Catch:{ all -> 0x00e3 }
            r3 = 82
            int r3 = r3 / r2
            r3 = 54
            if (r0 == 0) goto L_0x001c
            r0 = r3
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == r3) goto L_0x0029
            goto L_0x00ce
        L_0x0021:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x00e3 }
        L_0x0023:
            boolean r0 = r5.init()     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x00ce
        L_0x0029:
            int r0 = onInstallConversionFailureNative     // Catch:{ all -> 0x00e3 }
            int r0 = r0 + 55
            int r3 = r0 % 128
            AppsFlyer2dXConversionCallback = r3     // Catch:{ all -> 0x00e3 }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0037
            r0 = r2
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            r3 = 98304(0x18000, float:1.37753E-40)
            if (r0 == 0) goto L_0x0043
            int r0 = r5.AFInAppEventType     // Catch:{ all -> 0x00e3 }
            if (r0 < r3) goto L_0x004c
            goto L_0x00ce
        L_0x0043:
            int r0 = r5.AFInAppEventType     // Catch:{ all -> 0x00e3 }
            r4 = 90
            int r4 = r4 / r2
            if (r0 < r3) goto L_0x004c
            goto L_0x00ce
        L_0x004c:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = ", "
            java.lang.String r8 = android.text.TextUtils.join(r0, r8)     // Catch:{ all -> 0x00ca }
            if (r6 == 0) goto L_0x008d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r0.<init>()     // Catch:{ all -> 0x00ca }
            r0.append(r2)     // Catch:{ all -> 0x00ca }
            java.lang.String r2 = " "
            r0.append(r2)     // Catch:{ all -> 0x00ca }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00ca }
            long r2 = r2.getId()     // Catch:{ all -> 0x00ca }
            r0.append(r2)     // Catch:{ all -> 0x00ca }
            java.lang.String r2 = " _/AppsFlyer_6.5.2 ["
            r0.append(r2)     // Catch:{ all -> 0x00ca }
            r0.append(r6)     // Catch:{ all -> 0x00ca }
            java.lang.String r6 = "] "
            r0.append(r6)     // Catch:{ all -> 0x00ca }
            r0.append(r7)     // Catch:{ all -> 0x00ca }
            java.lang.String r6 = " "
            r0.append(r6)     // Catch:{ all -> 0x00ca }
            r0.append(r8)     // Catch:{ all -> 0x00ca }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x00ca }
            goto L_0x00b9
        L_0x008d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r6.<init>()     // Catch:{ all -> 0x00ca }
            r6.append(r2)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = " "
            r6.append(r0)     // Catch:{ all -> 0x00ca }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00ca }
            long r2 = r0.getId()     // Catch:{ all -> 0x00ca }
            r6.append(r2)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = " "
            r6.append(r0)     // Catch:{ all -> 0x00ca }
            r6.append(r7)     // Catch:{ all -> 0x00ca }
            java.lang.String r7 = "/AppsFlyer_6.5.2 "
            r6.append(r7)     // Catch:{ all -> 0x00ca }
            r6.append(r8)     // Catch:{ all -> 0x00ca }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ca }
        L_0x00b9:
            java.util.List<java.lang.String> r7 = r5.AFKeystoreWrapper     // Catch:{ all -> 0x00ca }
            r7.add(r6)     // Catch:{ all -> 0x00ca }
            int r7 = r5.AFInAppEventType     // Catch:{ all -> 0x00ca }
            int r6 = r6.length()     // Catch:{ all -> 0x00ca }
            int r6 = r6 << r1
            int r7 = r7 + r6
            r5.AFInAppEventType = r7     // Catch:{ all -> 0x00ca }
            monitor-exit(r5)
            return
        L_0x00ca:
            monitor-exit(r5)
            return
        L_0x00cc:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x00e3 }
        L_0x00ce:
            int r6 = AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x00e3 }
            int r6 = r6 + 49
            int r7 = r6 % 128
            onInstallConversionFailureNative = r7     // Catch:{ all -> 0x00e3 }
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x00e1
            r6 = 22
            int r6 = r6 / r2
            monitor-exit(r5)
            return
        L_0x00df:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x00e3 }
        L_0x00e1:
            monitor-exit(r5)
            return
        L_0x00e3:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21886am.valueOf(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    private static String AFInAppEventType(int[] iArr, int i) {
        String str;
        synchronized (C21987dh.AFInAppEventParameterName) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[(iArr.length << 1)];
            int[] iArr2 = (int[]) init.clone();
            C21987dh.values = 0;
            while (true) {
                int i2 = C21987dh.values;
                if (i2 < iArr.length) {
                    int i3 = iArr[i2];
                    char c = (char) (i3 >> 16);
                    cArr[0] = c;
                    char c2 = (char) i3;
                    cArr[1] = c2;
                    char c3 = (char) (iArr[i2 + 1] >> 16);
                    cArr[2] = c3;
                    char c4 = (char) iArr[i2 + 1];
                    cArr[3] = c4;
                    C21987dh.valueOf = (c << 16) + c2;
                    C21987dh.AFKeystoreWrapper = (c3 << 16) + c4;
                    C21987dh.AFInAppEventType(iArr2);
                    for (int i4 = 0; i4 < 16; i4++) {
                        int i5 = C21987dh.valueOf ^ iArr2[i4];
                        C21987dh.valueOf = i5;
                        C21987dh.AFKeystoreWrapper = C21987dh.values(i5) ^ C21987dh.AFKeystoreWrapper;
                        int i6 = C21987dh.valueOf;
                        C21987dh.valueOf = C21987dh.AFKeystoreWrapper;
                        C21987dh.AFKeystoreWrapper = i6;
                    }
                    int i7 = C21987dh.valueOf;
                    C21987dh.valueOf = C21987dh.AFKeystoreWrapper;
                    C21987dh.AFKeystoreWrapper = i7;
                    C21987dh.AFKeystoreWrapper = i7 ^ iArr2[16];
                    C21987dh.valueOf ^= iArr2[17];
                    int i8 = C21987dh.AFKeystoreWrapper;
                    int i9 = C21987dh.valueOf;
                    cArr[0] = (char) (i9 >>> 16);
                    cArr[1] = (char) i9;
                    int i10 = C21987dh.AFKeystoreWrapper;
                    cArr[2] = (char) (i10 >>> 16);
                    cArr[3] = (char) i10;
                    C21987dh.AFInAppEventType(iArr2);
                    int i11 = C21987dh.values;
                    cArr2[i11 << 1] = cArr[0];
                    cArr2[(i11 << 1) + 1] = cArr[1];
                    cArr2[(i11 << 1) + 2] = cArr[2];
                    cArr2[(i11 << 1) + 3] = cArr[3];
                    C21987dh.values = i11 + 2;
                } else {
                    str = new String(cArr2, 0, i);
                }
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if ((r6 == null ? true : true) != true) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r0 = new java.lang.String[(r6.length + 1)];
        r0[0] = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r3 >= r6.length) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        r5 = onInstallConversionFailureNative + 117;
        AppsFlyer2dXConversionCallback = r5 % 128;
        r5 = r5 % 2;
        r0[r3] = r6[r3].toString();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if ((r6 != null) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] valueOf(java.lang.String r5, java.lang.StackTraceElement[] r6) {
        /*
            int r0 = onInstallConversionFailureNative
            int r0 = r0 + 39
            int r1 = r0 % 128
            AppsFlyer2dXConversionCallback = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0019
            r0 = 83
            int r0 = r0 / r2
            if (r6 != 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r3
        L_0x0016:
            if (r0 == 0) goto L_0x0022
            goto L_0x0027
        L_0x0019:
            r0 = 38
            if (r6 != 0) goto L_0x001f
            r4 = r1
            goto L_0x0020
        L_0x001f:
            r4 = r0
        L_0x0020:
            if (r4 == r0) goto L_0x0027
        L_0x0022:
            java.lang.String[] r6 = new java.lang.String[r3]
            r6[r2] = r5
            return r6
        L_0x0027:
            int r0 = r6.length
            int r0 = r0 + r3
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r2] = r5
        L_0x002d:
            int r5 = r6.length
            if (r3 >= r5) goto L_0x0044
            int r5 = onInstallConversionFailureNative
            int r5 = r5 + 117
            int r2 = r5 % 128
            AppsFlyer2dXConversionCallback = r2
            int r5 = r5 % r1
            r5 = r6[r3]
            java.lang.String r5 = r5.toString()
            r0[r3] = r5
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21886am.valueOf(java.lang.String, java.lang.StackTraceElement[]):java.lang.String[]");
    }
}
