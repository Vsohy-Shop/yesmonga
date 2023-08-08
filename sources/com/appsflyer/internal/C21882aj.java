package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.compose.p004ui.graphics.vector.C15369g;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.datatransport.cct.C40045d;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

/* renamed from: com.appsflyer.internal.aj */
public abstract class C21882aj implements Runnable {
    protected static String AFInAppEventParameterName = null;
    private static int AFLogger$LogLevel = 0;
    private static char[] AppsFlyer2dXConversionCallback = null;
    private static int onDeepLinkingNative = 1;
    private static String valueOf = "v2";
    public final String AFInAppEventType;
    private final C21868ah AFKeystoreWrapper;
    private final Context AFVersionDeclaration;
    public final String getLevel = UUID.randomUUID().toString();
    public final Map<String, Object> init = values();
    public String values;

    /* renamed from: com.appsflyer.internal.aj$a */
    public static class C21883a implements Runnable {
        private final C21951ce valueOf;

        public C21883a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r0v10, types: [java.net.URLConnection] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0171  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0174  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.net.HttpURLConnection AFInAppEventParameterName() {
            /*
                r17 = this;
                r1 = r17
                com.appsflyer.internal.ce r0 = r1.valueOf
                java.lang.String r2 = r0.onDeepLinkingNative
                java.lang.String r0 = r0.AppsFlyer2dXConversionCallback()
                com.appsflyer.internal.ce r3 = r1.valueOf
                boolean r3 = r3.AFVersionDeclaration()
                com.appsflyer.internal.ce r4 = r1.valueOf
                boolean r4 = r4.init()
                com.appsflyer.internal.ce r5 = r1.valueOf
                boolean r5 = r5.getLevel()
                com.appsflyer.internal.ce r6 = r1.valueOf
                boolean r6 = r6.valueOf()
                java.lang.String r7 = ""
                byte[] r8 = r0.getBytes()
                r9 = 0
                if (r3 == 0) goto L_0x002c
                return r9
            L_0x002c:
                r3 = 1
                java.net.URL r10 = new java.net.URL     // Catch:{ all -> 0x0159 }
                r10.<init>(r2)     // Catch:{ all -> 0x0159 }
                if (r5 == 0) goto L_0x0075
                com.appsflyer.internal.am r11 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()     // Catch:{ all -> 0x0159 }
                java.lang.String r12 = r10.toString()     // Catch:{ all -> 0x0159 }
                r11.AFInAppEventParameterName(r12, r0)     // Catch:{ all -> 0x0159 }
                java.lang.String r11 = "UTF-8"
                byte[] r11 = r0.getBytes(r11)     // Catch:{ all -> 0x0159 }
                int r11 = r11.length     // Catch:{ all -> 0x0159 }
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0159 }
                java.lang.String r13 = "call = "
                r12.<init>(r13)     // Catch:{ all -> 0x0159 }
                r12.append(r10)     // Catch:{ all -> 0x0159 }
                java.lang.String r13 = "; size = "
                r12.append(r13)     // Catch:{ all -> 0x0159 }
                r12.append(r11)     // Catch:{ all -> 0x0159 }
                java.lang.String r13 = " byte"
                r12.append(r13)     // Catch:{ all -> 0x0159 }
                if (r11 <= r3) goto L_0x0062
                java.lang.String r11 = "s"
                goto L_0x0063
            L_0x0062:
                r11 = r7
            L_0x0063:
                r12.append(r11)     // Catch:{ all -> 0x0159 }
                java.lang.String r11 = "; body = "
                r12.append(r11)     // Catch:{ all -> 0x0159 }
                r12.append(r0)     // Catch:{ all -> 0x0159 }
                java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0159 }
                com.appsflyer.internal.C21884ak.valueOf(r0)     // Catch:{ all -> 0x0159 }
            L_0x0075:
                java.lang.String r0 = "AppsFlyer"
                int r0 = r0.hashCode()     // Catch:{ all -> 0x0159 }
                android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x0159 }
                java.net.URLConnection r0 = r10.openConnection()     // Catch:{ all -> 0x0159 }
                java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ all -> 0x0159 }
                java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ all -> 0x0159 }
                r11 = r0
                java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ all -> 0x0159 }
                r0 = 30000(0x7530, float:4.2039E-41)
                r11.setReadTimeout(r0)     // Catch:{ all -> 0x0156 }
                r11.setConnectTimeout(r0)     // Catch:{ all -> 0x0156 }
                java.lang.String r0 = "POST"
                r11.setRequestMethod(r0)     // Catch:{ all -> 0x0156 }
                r11.setDoInput(r3)     // Catch:{ all -> 0x0156 }
                r11.setDoOutput(r3)     // Catch:{ all -> 0x0156 }
                java.lang.String r0 = "Content-Type"
                if (r6 == 0) goto L_0x00a5
                java.lang.String r12 = "application/octet-stream"
                goto L_0x00a7
            L_0x00a5:
                java.lang.String r12 = "application/json"
            L_0x00a7:
                r11.setRequestProperty(r0, r12)     // Catch:{ all -> 0x0156 }
                java.io.OutputStream r0 = r11.getOutputStream()     // Catch:{ all -> 0x0156 }
                r12 = 0
                if (r6 == 0) goto L_0x0127
                com.appsflyer.internal.ce r6 = r1.valueOf     // Catch:{ all -> 0x0156 }
                java.lang.String r6 = r6.AFLogger$LogLevel     // Catch:{ all -> 0x0156 }
                java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x011e }
                r13[r12] = r6     // Catch:{ all -> 0x011e }
                int r6 = android.view.ViewConfiguration.getTouchSlop()     // Catch:{ all -> 0x011e }
                int r6 = r6 >> 8
                int r6 = 24 - r6
                r14 = 0
                int r14 = android.widget.ExpandableListView.getPackedPositionGroup(r14)     // Catch:{ all -> 0x011e }
                char r14 = (char) r14     // Catch:{ all -> 0x011e }
                int r15 = android.graphics.Color.alpha(r12)     // Catch:{ all -> 0x011e }
                int r15 = 24 - r15
                java.lang.Object r6 = com.appsflyer.internal.C21979d.valueOf(r6, r14, r15)     // Catch:{ all -> 0x011e }
                java.lang.Class r6 = (java.lang.Class) r6     // Catch:{ all -> 0x011e }
                java.lang.String r14 = "AFInAppEventType"
                java.lang.Class[] r15 = new java.lang.Class[r3]     // Catch:{ all -> 0x011e }
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r15[r12] = r16     // Catch:{ all -> 0x011e }
                java.lang.reflect.Method r6 = r6.getMethod(r14, r15)     // Catch:{ all -> 0x011e }
                java.lang.Object r6 = r6.invoke(r9, r13)     // Catch:{ all -> 0x011e }
                java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x0115 }
                r9[r12] = r8     // Catch:{ all -> 0x0115 }
                int r8 = android.text.TextUtils.indexOf(r7, r7, r12)     // Catch:{ all -> 0x0115 }
                int r8 = r8 + 24
                int r13 = android.os.Process.myTid()     // Catch:{ all -> 0x0115 }
                int r13 = r13 >> 22
                char r13 = (char) r13     // Catch:{ all -> 0x0115 }
                int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r12)     // Catch:{ all -> 0x0115 }
                int r14 = r14 + 24
                java.lang.Object r8 = com.appsflyer.internal.C21979d.valueOf(r8, r13, r14)     // Catch:{ all -> 0x0115 }
                java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x0115 }
                java.lang.String r13 = "AFKeystoreWrapper"
                java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ all -> 0x0115 }
                java.lang.Class<byte[]> r15 = byte[].class
                r14[r12] = r15     // Catch:{ all -> 0x0115 }
                java.lang.reflect.Method r8 = r8.getDeclaredMethod(r13, r14)     // Catch:{ all -> 0x0115 }
                java.lang.Object r6 = r8.invoke(r6, r9)     // Catch:{ all -> 0x0115 }
                r8 = r6
                byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x0115 }
                goto L_0x0127
            L_0x0115:
                r0 = move-exception
                java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x0156 }
                if (r4 == 0) goto L_0x011d
                throw r4     // Catch:{ all -> 0x0156 }
            L_0x011d:
                throw r0     // Catch:{ all -> 0x0156 }
            L_0x011e:
                r0 = move-exception
                java.lang.Throwable r4 = r0.getCause()     // Catch:{ all -> 0x0156 }
                if (r4 == 0) goto L_0x0126
                throw r4     // Catch:{ all -> 0x0156 }
            L_0x0126:
                throw r0     // Catch:{ all -> 0x0156 }
            L_0x0127:
                r0.write(r8)     // Catch:{ all -> 0x0156 }
                r0.close()     // Catch:{ all -> 0x0156 }
                r11.connect()     // Catch:{ all -> 0x0156 }
                int r0 = r11.getResponseCode()     // Catch:{ all -> 0x0156 }
                if (r4 == 0) goto L_0x013e
                com.appsflyer.internal.C21868ah.valueOf()     // Catch:{ all -> 0x0156 }
                java.lang.String r4 = com.appsflyer.internal.C21868ah.AFKeystoreWrapper((java.net.HttpURLConnection) r11)     // Catch:{ all -> 0x0156 }
                r7 = r4
            L_0x013e:
                if (r5 == 0) goto L_0x014b
                com.appsflyer.internal.am r4 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()     // Catch:{ all -> 0x0156 }
                java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x0156 }
                r4.AFKeystoreWrapper(r5, r0, r7)     // Catch:{ all -> 0x0156 }
            L_0x014b:
                r4 = 200(0xc8, float:2.8E-43)
                if (r0 != r4) goto L_0x0168
                java.lang.String r0 = "Status 200 ok"
                com.appsflyer.AFLogger.AFKeystoreWrapper(r0)     // Catch:{ all -> 0x0156 }
                r3 = r12
                goto L_0x0168
            L_0x0156:
                r0 = move-exception
                r9 = r11
                goto L_0x015a
            L_0x0159:
                r0 = move-exception
            L_0x015a:
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r4 = "Error while calling "
                java.lang.String r2 = r4.concat(r2)
                com.appsflyer.AFLogger.AFKeystoreWrapper(r2, r0)
                r11 = r9
            L_0x0168:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Connection "
                r0.<init>(r2)
                if (r3 == 0) goto L_0x0174
                java.lang.String r2 = "error"
                goto L_0x0176
            L_0x0174:
                java.lang.String r2 = "call succeeded"
            L_0x0176:
                r0.append(r2)
                java.lang.String r2 = ": "
                r0.append(r2)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21882aj.C21883a.AFInAppEventParameterName():java.net.HttpURLConnection");
        }

        public void run() {
            HttpURLConnection AFInAppEventParameterName = AFInAppEventParameterName();
            if (AFInAppEventParameterName != null) {
                AFInAppEventParameterName.disconnect();
            }
        }

        public C21883a(C21951ce ceVar) {
            this.valueOf = ceVar;
        }
    }

    static {
        AFInAppEventParameterName();
        StringBuilder sb = new StringBuilder("https://%sonelink.%s/shortlink-sdk/");
        sb.append(valueOf);
        AFInAppEventParameterName = sb.toString();
        int i = onDeepLinkingNative + 33;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
    }

    public C21882aj(C21868ah ahVar, Context context, String str) {
        this.AFKeystoreWrapper = ahVar;
        this.AFVersionDeclaration = context;
        this.AFInAppEventType = str;
    }

    public static void AFInAppEventParameterName() {
        AppsFlyer2dXConversionCallback = new char[]{' ', C15369g.f37988n, 'I', '@', '^', C15369g.f37981g, 'j', 'g', 'j', C15369g.f37991q, C15369g.f37987m, 'k', '1', 'j', 'i', 'g', 'i'};
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventType() {
        /*
            r7 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r7.valueOf()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "oneLinkUrl: "
            java.lang.String r2 = r3.concat(r2)
            com.appsflyer.AFLogger.AFInAppEventType((java.lang.String) r2)
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0076 }
            r2.<init>(r1)     // Catch:{ all -> 0x0076 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ all -> 0x0076 }
            java.lang.Object r2 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r2)     // Catch:{ all -> 0x0076 }
            java.net.URLConnection r2 = (java.net.URLConnection) r2     // Catch:{ all -> 0x0076 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = "content-type"
            java.lang.String r4 = "application/json"
            r2.setRequestProperty(r3, r4)     // Catch:{ all -> 0x0076 }
            r3 = 3000(0xbb8, float:4.204E-42)
            r2.setReadTimeout(r3)     // Catch:{ all -> 0x0076 }
            r2.setConnectTimeout(r3)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = r7.AFInAppEventType     // Catch:{ all -> 0x0076 }
            r2.setRequestMethod(r3)     // Catch:{ all -> 0x0076 }
            r7.AFInAppEventParameterName(r2)     // Catch:{ all -> 0x0076 }
            int r3 = r2.getResponseCode()     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = com.appsflyer.internal.C21868ah.AFKeystoreWrapper((java.net.HttpURLConnection) r2)     // Catch:{ all -> 0x0076 }
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 1
            if (r3 != r4) goto L_0x004a
            r4 = r5
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            if (r4 == r5) goto L_0x0066
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = "Response code = "
            r0.<init>(r4)     // Catch:{ all -> 0x0064 }
            r0.append(r3)     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = " content = "
            r0.append(r3)     // Catch:{ all -> 0x0064 }
            r0.append(r2)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0064 }
            goto L_0x009f
        L_0x0064:
            r0 = move-exception
            goto L_0x007a
        L_0x0066:
            java.lang.String r3 = "Status 200 ok"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3)     // Catch:{ all -> 0x0064 }
            int r1 = onDeepLinkingNative
            int r1 = r1 + 53
            int r3 = r1 % 128
            AFLogger$LogLevel = r3
            int r1 = r1 % 2
            goto L_0x009f
        L_0x0076:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
        L_0x007a:
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "Error while calling "
            java.lang.String r3 = r4.concat(r3)
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " stacktrace: "
            r3.append(r1)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x009f:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r3 = 80
            if (r1 == 0) goto L_0x00aa
            r1 = 69
            goto L_0x00ab
        L_0x00aa:
            r1 = r3
        L_0x00ab:
            if (r1 == r3) goto L_0x00c8
            int r0 = AFLogger$LogLevel
            int r0 = r0 + 13
            int r1 = r0 % 128
            onDeepLinkingNative = r1
            int r0 = r0 % 2
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Connection call succeeded: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
            r7.values(r2)
            return
        L_0x00c8:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Connection error: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r0)
            r7.AFKeystoreWrapper()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21882aj.AFInAppEventType():void");
    }

    public abstract void AFInAppEventParameterName(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    public abstract void AFKeystoreWrapper();

    public void run() {
        boolean z = true;
        int i = onDeepLinkingNative + 1;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        AFInAppEventType();
        int i3 = onDeepLinkingNative + 7;
        AFLogger$LogLevel = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (!z) {
            throw null;
        }
    }

    public abstract String valueOf();

    public abstract void values(String str);

    public final void values(HttpsURLConnection httpsURLConnection, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, valueOf);
        String AFKeystoreWrapper2 = C21859ae.AFKeystoreWrapper((String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(AppsFlyerProperties.getInstance().getDevKey());
        sb.append(this.getLevel);
        sb.append(valueOf);
        httpsURLConnection.setRequestProperty(values(new int[]{0, 12, 0, 0}, false, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001").intern(), C21859ae.values(AFKeystoreWrapper2, sb.toString()));
        int i = AFLogger$LogLevel + 45;
        onDeepLinkingNative = i % 128;
        int i2 = i % 2;
    }

    private Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.5.2");
        hashMap.put("counter", Integer.valueOf(this.AFKeystoreWrapper.valueOf(C21868ah.valueOf(this.AFVersionDeclaration), false)));
        hashMap.put(C40045d.f102104u, Build.MODEL);
        hashMap.put(values(new int[]{12, 5, 0, 0}, false, "\u0000\u0000\u0001\u0001\u0000").intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        try {
            hashMap.put("app_version_name", this.AFVersionDeclaration.getPackageManager().getPackageInfo(this.AFVersionDeclaration.getPackageName(), 0).versionName);
            int i = onDeepLinkingNative + 109;
            AFLogger$LogLevel = i % 128;
            int i2 = i % 2;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("app_id", this.AFVersionDeclaration.getPackageName());
        hashMap.put("platformextension", new C21887an().AFKeystoreWrapper());
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r8v3, types: [char] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String values(int[] r12, boolean r13, java.lang.String r14) {
        /*
            if (r14 == 0) goto L_0x0008
            java.lang.String r0 = "ISO-8859-1"
            byte[] r14 = r14.getBytes(r0)
        L_0x0008:
            byte[] r14 = (byte[]) r14
            java.lang.Object r0 = com.appsflyer.internal.C21988di.values
            monitor-enter(r0)
            r1 = 0
            r2 = r12[r1]     // Catch:{ all -> 0x0089 }
            r3 = 1
            r4 = r12[r3]     // Catch:{ all -> 0x0089 }
            r5 = 2
            r6 = r12[r5]     // Catch:{ all -> 0x0089 }
            r7 = 3
            r7 = r12[r7]     // Catch:{ all -> 0x0089 }
            char[] r8 = AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0089 }
            char[] r9 = new char[r4]     // Catch:{ all -> 0x0089 }
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch:{ all -> 0x0089 }
            if (r14 == 0) goto L_0x0047
            char[] r2 = new char[r4]     // Catch:{ all -> 0x0089 }
            com.appsflyer.internal.C21988di.AFInAppEventType = r1     // Catch:{ all -> 0x0089 }
            r8 = r1
        L_0x0027:
            int r10 = com.appsflyer.internal.C21988di.AFInAppEventType     // Catch:{ all -> 0x0089 }
            if (r10 >= r4) goto L_0x0046
            byte r11 = r14[r10]     // Catch:{ all -> 0x0089 }
            if (r11 != r3) goto L_0x0038
            char r11 = r9[r10]     // Catch:{ all -> 0x0089 }
            int r11 = r11 << r3
            int r11 = r11 + r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch:{ all -> 0x0089 }
            r2[r10] = r8     // Catch:{ all -> 0x0089 }
            goto L_0x003f
        L_0x0038:
            char r11 = r9[r10]     // Catch:{ all -> 0x0089 }
            int r11 = r11 << r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch:{ all -> 0x0089 }
            r2[r10] = r8     // Catch:{ all -> 0x0089 }
        L_0x003f:
            char r8 = r2[r10]     // Catch:{ all -> 0x0089 }
            int r10 = r10 + 1
            com.appsflyer.internal.C21988di.AFInAppEventType = r10     // Catch:{ all -> 0x0089 }
            goto L_0x0027
        L_0x0046:
            r9 = r2
        L_0x0047:
            if (r7 <= 0) goto L_0x0056
            char[] r14 = new char[r4]     // Catch:{ all -> 0x0089 }
            java.lang.System.arraycopy(r9, r1, r14, r1, r4)     // Catch:{ all -> 0x0089 }
            int r2 = r4 - r7
            java.lang.System.arraycopy(r14, r1, r9, r2, r7)     // Catch:{ all -> 0x0089 }
            java.lang.System.arraycopy(r14, r7, r9, r1, r2)     // Catch:{ all -> 0x0089 }
        L_0x0056:
            if (r13 == 0) goto L_0x006d
            char[] r13 = new char[r4]     // Catch:{ all -> 0x0089 }
            com.appsflyer.internal.C21988di.AFInAppEventType = r1     // Catch:{ all -> 0x0089 }
        L_0x005c:
            int r14 = com.appsflyer.internal.C21988di.AFInAppEventType     // Catch:{ all -> 0x0089 }
            if (r14 >= r4) goto L_0x006c
            int r2 = r4 - r14
            int r2 = r2 - r3
            char r2 = r9[r2]     // Catch:{ all -> 0x0089 }
            r13[r14] = r2     // Catch:{ all -> 0x0089 }
            int r14 = r14 + 1
            com.appsflyer.internal.C21988di.AFInAppEventType = r14     // Catch:{ all -> 0x0089 }
            goto L_0x005c
        L_0x006c:
            r9 = r13
        L_0x006d:
            if (r6 <= 0) goto L_0x0082
            com.appsflyer.internal.C21988di.AFInAppEventType = r1     // Catch:{ all -> 0x0089 }
        L_0x0071:
            int r13 = com.appsflyer.internal.C21988di.AFInAppEventType     // Catch:{ all -> 0x0089 }
            if (r13 >= r4) goto L_0x0082
            char r14 = r9[r13]     // Catch:{ all -> 0x0089 }
            r1 = r12[r5]     // Catch:{ all -> 0x0089 }
            int r14 = r14 - r1
            char r14 = (char) r14     // Catch:{ all -> 0x0089 }
            r9[r13] = r14     // Catch:{ all -> 0x0089 }
            int r13 = r13 + 1
            com.appsflyer.internal.C21988di.AFInAppEventType = r13     // Catch:{ all -> 0x0089 }
            goto L_0x0071
        L_0x0082:
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x0089 }
            r12.<init>(r9)     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            return r12
        L_0x0089:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21882aj.values(int[], boolean, java.lang.String):java.lang.String");
    }
}
