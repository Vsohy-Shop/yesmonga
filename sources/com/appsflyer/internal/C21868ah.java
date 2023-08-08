package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.compose.p004ui.graphics.vector.C15369g;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.C21860af;
import com.appsflyer.internal.C21882aj;
import com.appsflyer.internal.C21899as;
import com.appsflyer.internal.C21912b;
import com.appsflyer.internal.C21967ct;
import com.appsflyer.internal.C22007o;
import com.appsflyer.internal.C22011v;
import com.appsflyer.internal.C22015x;
import com.appsflyer.internal.C22018y;
import com.carrefour.fid.android.account.core.constants.C13167a;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.constant.C28607x;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.zxing.maxicode.decoder.C34766b;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.analytics.C35557k;
import com.urbanairship.analytics.location.C35560b;
import com.usabilla.sdk.ubform.p007db.telemetry.TelemetryTable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.text.C11626x;
import kotlinx.serialization.json.internal.C12361b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p073j$.util.DesugarTimeZone;

/* renamed from: com.appsflyer.internal.ah */
public final class C21868ah extends AppsFlyerLib {
    static final String AFInAppEventParameterName = "158";
    static AppsFlyerInAppPurchaseValidatorListener AFInAppEventType = null;
    public static AppsFlyerConversionListener AFKeystoreWrapper = null;
    private static String init = "https://%sstats.%s/stats";
    @VisibleForTesting
    private static C21868ah onAppOpenAttribution = new C21868ah();
    private static String onAppOpenAttributionNative = null;
    private static String onAttributionFailureNative = null;
    @VisibleForTesting
    private static String onConversionDataFail = null;
    private static final String onDeepLinkingNative;
    private static String onInstallConversionDataLoadedNative = null;
    private static String onInstallConversionFailureNative = null;
    private static int setCustomerIdAndLogSession = 0;
    private static char[] setOutOfStore = null;
    private static long setPhoneNumber = 0;
    private static int setUserEmails = 1;
    public static final String valueOf;
    public static final String values;
    @VisibleForTesting
    long AFLogger$LogLevel;
    String AFVersionDeclaration;
    String AppsFlyer2dXConversionCallback;
    private Map<Long, String> AppsFlyerConversionListener;
    private boolean AppsFlyerInAppPurchaseValidatorListener;
    private boolean AppsFlyerLib = false;
    private final Executor enableLocationCollection = Executors.newSingleThreadExecutor();
    private boolean getInstance;
    public C22003k getLevel;
    @Nullable
    private C21974cw getOutOfStore;
    private boolean getSdkVersion = false;
    private ScheduledExecutorService onAttributionFailure = null;
    private long onConversionDataSuccess = -1;
    private String onDeepLinking;
    private Application onPause;
    private boolean onResponse = false;
    private boolean onResponseError = false;
    private long onResponseErrorNative = -1;
    private long onResponseNative = TimeUnit.SECONDS.toMillis(5);
    private final C21887an onValidateInApp = new C21887an();
    private boolean onValidateInAppFailure = false;
    @Nullable
    private C21967ct[] setAndroidIdData;
    private C21915ba setCustomerUserId;
    private boolean setDebugLog = false;
    private SharedPreferences setImeiData;
    private String setOaidData;
    private Map<String, Object> stop;
    private Map<String, Object> updateServerUninstallToken;
    @NonNull
    private final C21919be waitForCustomerUserId;

    /* renamed from: com.appsflyer.internal.ah$6 */
    public static /* synthetic */ class C218756 {
        static final /* synthetic */ int[] AFInAppEventParameterName;
        static final /* synthetic */ int[] values;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                com.appsflyer.internal.ct$c[] r0 = com.appsflyer.internal.C21967ct.C21969c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                AFInAppEventParameterName = r0
                r1 = 1
                com.appsflyer.internal.ct$c r2 = com.appsflyer.internal.C21967ct.C21969c.FINISHED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = AFInAppEventParameterName     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.internal.ct$c r3 = com.appsflyer.internal.C21967ct.C21969c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.appsflyer.AppsFlyerProperties$EmailsCryptType[] r2 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                values = r2
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r3 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA256     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = values     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r2 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.C218756.<clinit>():void");
        }
    }

    /* renamed from: com.appsflyer.internal.ah$a */
    public class C21878a implements Runnable {
        private final C21995g AFInAppEventType;

        public /* synthetic */ C21878a(C21868ah ahVar, C21995g gVar, byte b) {
            this(gVar);
        }

        public final void run() {
            C21868ah.AFKeystoreWrapper(C21868ah.this, this.AFInAppEventType);
        }

        private C21878a(C21995g gVar) {
            this.AFInAppEventType = gVar;
        }
    }

    /* renamed from: com.appsflyer.internal.ah$b */
    public class C21879b implements Runnable {
        private final Application valueOf;

        public C21879b(Context context) {
            this.valueOf = (Application) context.getApplicationContext();
        }

        public final void run() {
            if (!C21868ah.AppsFlyer2dXConversionCallback(C21868ah.this)) {
                C21868ah.this.AFLogger$LogLevel = System.currentTimeMillis();
                C21868ah.AFInAppEventType(C21868ah.this, true);
                try {
                    String devKey = AppsFlyerProperties.getInstance().getDevKey();
                    C21881ai.AFKeystoreWrapper();
                    for (C22007o next : C21881ai.AFInAppEventParameterName(this.valueOf)) {
                        StringBuilder sb = new StringBuilder("resending request: ");
                        sb.append(next.AFInAppEventType);
                        AFLogger.AFKeystoreWrapper(sb.toString());
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            long parseLong = Long.parseLong(next.AFKeystoreWrapper, 10);
                            C21868ah ahVar = C21868ah.this;
                            C21954ch chVar = new C21954ch();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(next.AFInAppEventType);
                            sb2.append("&isCachedRequest=true&timeincache=");
                            sb2.append((currentTimeMillis - parseLong) / 1000);
                            C21995g AFKeystoreWrapper = chVar.AFKeystoreWrapper(sb2.toString());
                            AFKeystoreWrapper.AFVersionDeclaration = next.values();
                            AFKeystoreWrapper.AFLogger$LogLevel = devKey;
                            Application application = this.valueOf;
                            if (application != null) {
                                AFKeystoreWrapper.AFInAppEventType = (Application) application.getApplicationContext();
                            }
                            AFKeystoreWrapper.AppsFlyer2dXConversionCallback = next.AFKeystoreWrapper;
                            AFKeystoreWrapper.onInstallConversionDataLoadedNative = false;
                            C21868ah.AFInAppEventParameterName(ahVar, AFKeystoreWrapper);
                        } catch (Exception e) {
                            AFLogger.AFKeystoreWrapper("Failed to resend cached request", e);
                        }
                    }
                } catch (Exception e2) {
                    AFLogger.AFKeystoreWrapper("failed to check cache. ", e2);
                } catch (Throwable th) {
                    C21868ah.AFInAppEventType(C21868ah.this, false);
                    throw th;
                }
                C21868ah.AFInAppEventType(C21868ah.this, false);
                C21868ah.getLevel(C21868ah.this).shutdown();
                C21868ah.valueOf(C21868ah.this, (ScheduledExecutorService) null);
            }
        }
    }

    /* renamed from: com.appsflyer.internal.ah$e */
    public class C21880e implements Runnable {
        private final C21995g values;

        public /* synthetic */ C21880e(C21868ah ahVar, C21995g gVar, byte b) {
            this(gVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte[]} */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x023b, code lost:
            r2 = r0;
            r3 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x023e, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x023f, code lost:
            r3 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0250, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0251, code lost:
            com.appsflyer.AFLogger.AFInAppEventType((java.lang.Throwable) r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x026f, code lost:
            r0.onError(com.appsflyer.attribution.RequestError.NETWORK_FAILURE, r12.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0187, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0188, code lost:
            com.appsflyer.AFLogger.valueOf(r0.getMessage(), r0);
            r2 = r1.values.AFInAppEventParameterName;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0193, code lost:
            if (r2 != null) goto L_0x0195;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0195, code lost:
            r2.onError(com.appsflyer.attribution.RequestError.NETWORK_FAILURE, r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x019f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a0, code lost:
            r12 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c6, code lost:
            r2.mkdir();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01cb, code lost:
            r2 = r2.listFiles();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cf, code lost:
            if (r2 == null) goto L_0x01dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d6, code lost:
            com.appsflyer.AFLogger.AFKeystoreWrapper("reached cache limit, not caching request");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x01dd, code lost:
            com.appsflyer.AFLogger.AFKeystoreWrapper("caching request...");
            r2 = new java.io.File(com.appsflyer.internal.C21881ai.valueOf(r9), java.lang.Long.toString(java.lang.System.currentTimeMillis()));
            r2.createNewFile();
            r4 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(r2.getPath(), true));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
            r4.write("version=");
            r4.write(r0.values);
            r4.write(10);
            r4.write("url=");
            r4.write(r0.AFInAppEventType);
            r4.write(10);
            r4.write("data=");
            r4.write(android.util.Base64.encodeToString(r0.values(), 2));
            r4.write(10);
            r4.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x023a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x024c A[SYNTHETIC, Splitter:B:110:0x024c] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x025f A[SYNTHETIC, Splitter:B:116:0x025f] */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x026f  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0187 A[ExcHandler: all (r0v23 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:42:0x0115] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01c6 A[Catch:{ Exception -> 0x0244 }] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01cb A[Catch:{ Exception -> 0x0244 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r16 = this;
                r1 = r16
                com.appsflyer.internal.g r0 = r1.values
                java.util.Map r2 = r0.AFKeystoreWrapper()
                com.appsflyer.internal.g r0 = r1.values
                boolean r0 = r0.AFInAppEventType()
                com.appsflyer.internal.g r3 = r1.values
                java.lang.String r4 = r3.onDeepLinkingNative
                int r5 = r3.onAppOpenAttributionNative
                android.app.Application r9 = r3.AFInAppEventType
                com.appsflyer.internal.ah r3 = com.appsflyer.internal.C21868ah.this
                boolean r3 = r3.isStopped()
                if (r3 == 0) goto L_0x002c
                com.appsflyer.internal.g r0 = r1.values
                com.appsflyer.attribution.AppsFlyerRequestListener r0 = r0.AFInAppEventParameterName
                if (r0 == 0) goto L_0x002b
                int r2 = com.appsflyer.attribution.RequestError.STOP_TRACKING
                java.lang.String r3 = com.appsflyer.internal.C21917bc.AFKeystoreWrapper
                r0.onError(r2, r3)
            L_0x002b:
                return
            L_0x002c:
                r3 = 0
                byte[] r6 = new byte[r3]
                r7 = 2
                r8 = 1
                if (r0 == 0) goto L_0x00fd
                if (r5 > r7) goto L_0x00fd
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.appsflyer.internal.ah r10 = com.appsflyer.internal.C21868ah.this
                com.appsflyer.internal.ct[] r10 = com.appsflyer.internal.C21868ah.AFInAppEventType((com.appsflyer.internal.C21868ah) r10)
                if (r10 == 0) goto L_0x00a8
                com.appsflyer.internal.ah r10 = com.appsflyer.internal.C21868ah.this
                com.appsflyer.internal.ct[] r10 = com.appsflyer.internal.C21868ah.AFInAppEventType((com.appsflyer.internal.C21868ah) r10)
                int r11 = r10.length
                r12 = r3
            L_0x004a:
                if (r12 >= r11) goto L_0x00a8
                r13 = r10[r12]
                boolean r14 = r13 instanceof com.appsflyer.internal.C21972cv
                int[] r15 = com.appsflyer.internal.C21868ah.C218756.AFInAppEventParameterName
                com.appsflyer.internal.ct$c r3 = r13.values
                int r3 = r3.ordinal()
                r3 = r15[r3]
                if (r3 == r8) goto L_0x0082
                if (r3 == r7) goto L_0x005f
                goto L_0x00a4
            L_0x005f:
                if (r5 != r7) goto L_0x00a4
                if (r14 != 0) goto L_0x00a4
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.lang.String r14 = "source"
                java.lang.String r13 = r13.AFInAppEventParameterName
                r3.put(r14, r13)
                java.lang.String r13 = "response"
                java.lang.String r14 = "TIMEOUT"
                r3.put(r13, r14)
                com.appsflyer.internal.cr r13 = new com.appsflyer.internal.cr
                r13.<init>()
                r3.putAll(r13)
                r0.add(r3)
                goto L_0x00a4
            L_0x0082:
                if (r14 == 0) goto L_0x009f
                java.lang.String r3 = "rfr"
                r14 = r13
                com.appsflyer.internal.cv r14 = (com.appsflyer.internal.C21972cv) r14
                java.util.Map<java.lang.String, java.lang.Object> r14 = r14.AFKeystoreWrapper
                r2.put(r3, r14)
                android.content.SharedPreferences r3 = com.appsflyer.internal.C21868ah.valueOf((android.content.Context) r9)
                android.content.SharedPreferences$Editor r3 = r3.edit()
                java.lang.String r14 = "newGPReferrerSent"
                android.content.SharedPreferences$Editor r3 = r3.putBoolean(r14, r8)
                r3.apply()
            L_0x009f:
                java.util.Map<java.lang.String, java.lang.Object> r3 = r13.AFInAppEventType
                r0.add(r3)
            L_0x00a4:
                int r12 = r12 + 1
                r3 = 0
                goto L_0x004a
            L_0x00a8:
                boolean r3 = r0.isEmpty()
                if (r3 != 0) goto L_0x00b3
                java.lang.String r3 = "referrers"
                r2.put(r3, r0)
            L_0x00b3:
                com.appsflyer.internal.ah r0 = com.appsflyer.internal.C21868ah.this
                java.util.Map r0 = com.appsflyer.internal.C21868ah.values((com.appsflyer.internal.C21868ah) r0)
                if (r0 == 0) goto L_0x00c6
                java.lang.String r0 = "fb_ddl"
                com.appsflyer.internal.ah r3 = com.appsflyer.internal.C21868ah.this
                java.util.Map r3 = com.appsflyer.internal.C21868ah.values((com.appsflyer.internal.C21868ah) r3)
                r2.put(r0, r3)
            L_0x00c6:
                com.appsflyer.internal.ah r0 = com.appsflyer.internal.C21868ah.this
                com.appsflyer.internal.cw r0 = com.appsflyer.internal.C21868ah.init((com.appsflyer.internal.C21868ah) r0)
                if (r0 == 0) goto L_0x00fd
                com.appsflyer.internal.ah r0 = com.appsflyer.internal.C21868ah.this
                com.appsflyer.internal.cw r0 = com.appsflyer.internal.C21868ah.init((com.appsflyer.internal.C21868ah) r0)
                boolean r0 = r0.AFKeystoreWrapper()
                if (r0 == 0) goto L_0x00f2
                com.appsflyer.internal.ah r0 = com.appsflyer.internal.C21868ah.this
                com.appsflyer.internal.cw r0 = com.appsflyer.internal.C21868ah.init((com.appsflyer.internal.C21868ah) r0)
                java.util.List r0 = r0.values()
                if (r0 == 0) goto L_0x00fd
                boolean r3 = r0.isEmpty()
                if (r3 != 0) goto L_0x00fd
                java.lang.String r3 = "preload_id"
                r2.put(r3, r0)
                goto L_0x00fd
            L_0x00f2:
                java.lang.String r0 = "preload_id"
                java.lang.String r3 = "timeout"
                java.util.List r3 = java.util.Collections.singletonList(r3)
                r2.put(r0, r3)
            L_0x00fd:
                com.appsflyer.internal.g r0 = r1.values
                boolean r0 = r0 instanceof com.appsflyer.internal.C21949cc
                if (r0 != 0) goto L_0x0114
                com.appsflyer.internal.c$e r0 = new com.appsflyer.internal.c$e
                r0.<init>(r2, r9)
                r2.putAll(r0)
                com.appsflyer.internal.ah r0 = com.appsflyer.internal.C21868ah.this
                java.util.Map r0 = r0.init()
                r2.putAll(r0)
            L_0x0114:
                r3 = 0
                com.appsflyer.internal.g r0 = r1.values     // Catch:{ IOException -> 0x019f, all -> 0x0187 }
                boolean r5 = r0 instanceof com.appsflyer.internal.C21949cc     // Catch:{ IOException -> 0x019f, all -> 0x0187 }
                if (r5 == 0) goto L_0x0124
                java.lang.String r5 = "af_key"
                java.lang.Object r5 = r2.get(r5)     // Catch:{ IOException -> 0x019f, all -> 0x0187 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x019f, all -> 0x0187 }
                goto L_0x012c
            L_0x0124:
                java.lang.String r5 = "appsflyerKey"
                java.lang.Object r5 = r2.get(r5)     // Catch:{ IOException -> 0x019f, all -> 0x0187 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x019f, all -> 0x0187 }
            L_0x012c:
                r0.AFLogger$LogLevel = r5     // Catch:{ IOException -> 0x019f, all -> 0x0187 }
                monitor-enter(r2)     // Catch:{ IOException -> 0x019f, all -> 0x0187 }
                com.appsflyer.internal.g r0 = r1.values     // Catch:{ all -> 0x0184 }
                java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x017b }
                r10 = 0
                r5[r10] = r0     // Catch:{ all -> 0x017b }
                int r0 = android.graphics.drawable.Drawable.resolveOpacity(r10, r10)     // Catch:{ all -> 0x017b }
                int r0 = r0 + 48
                long r11 = android.widget.ExpandableListView.getPackedPositionForGroup(r10)     // Catch:{ all -> 0x017b }
                r13 = 0
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                r12 = 63493(0xf805, float:8.8973E-41)
                int r11 = r11 + r12
                char r11 = (char) r11     // Catch:{ all -> 0x017b }
                int r12 = android.view.KeyEvent.normalizeMetaState(r10)     // Catch:{ all -> 0x017b }
                int r12 = r12 + 24
                java.lang.Object r0 = com.appsflyer.internal.C21979d.valueOf(r0, r11, r12)     // Catch:{ all -> 0x017b }
                java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x017b }
                java.lang.String r10 = "valueOf"
                java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x017b }
                java.lang.Class<com.appsflyer.internal.g> r12 = com.appsflyer.internal.C21995g.class
                r13 = 0
                r11[r13] = r12     // Catch:{ all -> 0x017b }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r10, r11)     // Catch:{ all -> 0x017b }
                java.lang.Object r0 = r0.invoke(r3, r5)     // Catch:{ all -> 0x017b }
                r5 = r0
                byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x017b }
                monitor-exit(r2)     // Catch:{ all -> 0x0178 }
                com.appsflyer.internal.ah r0 = com.appsflyer.internal.C21868ah.this     // Catch:{ IOException -> 0x0174, all -> 0x0187 }
                com.appsflyer.internal.g r2 = r1.values     // Catch:{ IOException -> 0x0174, all -> 0x0187 }
                r2.AFVersionDeclaration = r5     // Catch:{ IOException -> 0x0174, all -> 0x0187 }
                com.appsflyer.internal.C21868ah.AFInAppEventParameterName((com.appsflyer.internal.C21868ah) r0, (com.appsflyer.internal.C21995g) r2)     // Catch:{ IOException -> 0x0174, all -> 0x0187 }
                return
            L_0x0174:
                r0 = move-exception
                r12 = r0
                r6 = r5
                goto L_0x01a1
            L_0x0178:
                r0 = move-exception
                r6 = r5
                goto L_0x0185
            L_0x017b:
                r0 = move-exception
                java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x0184 }
                if (r5 == 0) goto L_0x0183
                throw r5     // Catch:{ all -> 0x0184 }
            L_0x0183:
                throw r0     // Catch:{ all -> 0x0184 }
            L_0x0184:
                r0 = move-exception
            L_0x0185:
                monitor-exit(r2)     // Catch:{ IOException -> 0x019f, all -> 0x0187 }
                throw r0     // Catch:{ IOException -> 0x019f, all -> 0x0187 }
            L_0x0187:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                com.appsflyer.AFLogger.valueOf((java.lang.String) r2, (java.lang.Throwable) r0)
                com.appsflyer.internal.g r2 = r1.values
                com.appsflyer.attribution.AppsFlyerRequestListener r2 = r2.AFInAppEventParameterName
                if (r2 == 0) goto L_0x019e
                int r3 = com.appsflyer.attribution.RequestError.NETWORK_FAILURE
                java.lang.String r0 = r0.getMessage()
                r2.onError(r3, r0)
            L_0x019e:
                return
            L_0x019f:
                r0 = move-exception
                r12 = r0
            L_0x01a1:
                java.lang.String r0 = "Exception while sending request to server. "
                com.appsflyer.AFLogger.AFKeystoreWrapper(r0, r12)
                if (r6 == 0) goto L_0x0269
                if (r9 == 0) goto L_0x0269
                java.lang.String r0 = "&isCachedRequest=true&timeincache="
                boolean r0 = r4.contains(r0)
                if (r0 != 0) goto L_0x0269
                com.appsflyer.internal.C21881ai.AFKeystoreWrapper()
                com.appsflyer.internal.o r0 = new com.appsflyer.internal.o
                java.lang.String r2 = "6.5.2"
                r0.<init>(r4, r6, r2)
                java.io.File r2 = com.appsflyer.internal.C21881ai.valueOf(r9)     // Catch:{ Exception -> 0x0244 }
                boolean r4 = r2.exists()     // Catch:{ Exception -> 0x0244 }
                if (r4 != 0) goto L_0x01cb
                r2.mkdir()     // Catch:{ Exception -> 0x0244 }
                goto L_0x0255
            L_0x01cb:
                java.io.File[] r2 = r2.listFiles()     // Catch:{ Exception -> 0x0244 }
                if (r2 == 0) goto L_0x01dd
                int r2 = r2.length     // Catch:{ Exception -> 0x0244 }
                r4 = 40
                if (r2 <= r4) goto L_0x01dd
                java.lang.String r0 = "reached cache limit, not caching request"
                com.appsflyer.AFLogger.AFKeystoreWrapper(r0)     // Catch:{ Exception -> 0x0244 }
                goto L_0x0255
            L_0x01dd:
                java.lang.String r2 = "caching request..."
                com.appsflyer.AFLogger.AFKeystoreWrapper(r2)     // Catch:{ Exception -> 0x0244 }
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0244 }
                java.io.File r4 = com.appsflyer.internal.C21881ai.valueOf(r9)     // Catch:{ Exception -> 0x0244 }
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0244 }
                java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ Exception -> 0x0244 }
                r2.<init>(r4, r5)     // Catch:{ Exception -> 0x0244 }
                r2.createNewFile()     // Catch:{ Exception -> 0x0244 }
                java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0244 }
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0244 }
                java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x0244 }
                r5.<init>(r2, r8)     // Catch:{ Exception -> 0x0244 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0244 }
                java.lang.String r2 = "version="
                r4.write(r2)     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                java.lang.String r2 = r0.values     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                r4.write(r2)     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                r2 = 10
                r4.write(r2)     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                java.lang.String r3 = "url="
                r4.write(r3)     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                java.lang.String r3 = r0.AFInAppEventType     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                r4.write(r3)     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                r4.write(r2)     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                java.lang.String r3 = "data="
                r4.write(r3)     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                byte[] r0 = r0.values()     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                java.lang.String r0 = android.util.Base64.encodeToString(r0, r7)     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                r4.write(r0)     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                r4.write(r2)     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                r4.flush()     // Catch:{ Exception -> 0x023e, all -> 0x023a }
                r4.close()     // Catch:{ IOException -> 0x0250 }
                goto L_0x0255
            L_0x023a:
                r0 = move-exception
                r2 = r0
                r3 = r4
                goto L_0x025d
            L_0x023e:
                r0 = move-exception
                r3 = r4
                goto L_0x0245
            L_0x0241:
                r0 = move-exception
                r2 = r0
                goto L_0x025d
            L_0x0244:
                r0 = move-exception
            L_0x0245:
                java.lang.String r2 = "Could not cache request"
                com.appsflyer.AFLogger.AFKeystoreWrapper(r2, r0)     // Catch:{ all -> 0x0241 }
                if (r3 == 0) goto L_0x0255
                r3.close()     // Catch:{ IOException -> 0x0250 }
                goto L_0x0255
            L_0x0250:
                r0 = move-exception
                r2 = r0
                com.appsflyer.AFLogger.AFInAppEventType((java.lang.Throwable) r2)
            L_0x0255:
                java.lang.String r0 = r12.getMessage()
                com.appsflyer.AFLogger.AFKeystoreWrapper(r0, r12)
                goto L_0x0269
            L_0x025d:
                if (r3 == 0) goto L_0x0268
                r3.close()     // Catch:{ IOException -> 0x0263 }
                goto L_0x0268
            L_0x0263:
                r0 = move-exception
                r3 = r0
                com.appsflyer.AFLogger.AFInAppEventType((java.lang.Throwable) r3)
            L_0x0268:
                throw r2
            L_0x0269:
                com.appsflyer.internal.g r0 = r1.values
                com.appsflyer.attribution.AppsFlyerRequestListener r0 = r0.AFInAppEventParameterName
                if (r0 == 0) goto L_0x0278
                int r2 = com.appsflyer.attribution.RequestError.NETWORK_FAILURE
                java.lang.String r3 = r12.getMessage()
                r0.onError(r2, r3)
            L_0x0278:
                com.appsflyer.internal.ah r6 = com.appsflyer.internal.C21868ah.this
                com.appsflyer.internal.g r7 = r1.values
                java.lang.String r8 = r7.AFLogger$LogLevel
                android.content.SharedPreferences r10 = com.appsflyer.internal.C21868ah.valueOf((android.content.Context) r9)
                r11 = 0
                com.appsflyer.internal.C21943bz.valueOf(r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.C21880e.run():void");
        }

        private C21880e(C21995g gVar) {
            this.values = gVar;
        }
    }

    static {
        AFLogger$LogLevel();
        String substring = "6.5.2".substring(0, "6.5.2".lastIndexOf(AFInAppEventType(1 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 33, (char) ((SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 64089)).intern()));
        values = substring;
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append("/androidevent?buildnumber=6.5.2&app_id=");
        valueOf = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://%sadrevenue.%s/api/v");
        sb2.append(substring);
        sb2.append("/android?buildnumber=6.5.2&app_id=");
        onAttributionFailureNative = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(substring);
        sb3.append("/androidevent?app_id=");
        String obj = sb3.toString();
        onDeepLinkingNative = obj;
        StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(obj);
        onInstallConversionDataLoadedNative = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(obj);
        onInstallConversionFailureNative = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(obj);
        onAppOpenAttributionNative = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sattr.%s/api/v");
        sb7.append(obj);
        onConversionDataFail = sb7.toString();
        int i = setCustomerIdAndLogSession + 7;
        setUserEmails = i % 128;
        int i2 = i % 2;
    }

    @VisibleForTesting
    public C21868ah() {
        AFVersionDeclaration.init();
        this.waitForCustomerUserId = new C21919be();
    }

    public static /* synthetic */ Map AFInAppEventParameterName(C21868ah ahVar) {
        int i = setCustomerIdAndLogSession + 89;
        int i2 = i % 128;
        setUserEmails = i2;
        int i3 = i % 2;
        Map<String, Object> map = ahVar.updateServerUninstallToken;
        int i4 = i2 + 121;
        setCustomerIdAndLogSession = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return map;
        }
        throw null;
    }

    public static /* synthetic */ boolean AFInAppEventType(C21868ah ahVar, boolean z) {
        int i = setCustomerIdAndLogSession + 71;
        int i2 = i % 128;
        setUserEmails = i2;
        int i3 = i % 2;
        ahVar.onResponseError = z;
        int i4 = i2 + 47;
        setCustomerIdAndLogSession = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static /* synthetic */ C21919be AFKeystoreWrapper(C21868ah ahVar) {
        int i = setCustomerIdAndLogSession + 53;
        int i2 = i % 128;
        setUserEmails = i2;
        boolean z = i % 2 == 0 ? true : true;
        C21919be beVar = ahVar.waitForCustomerUserId;
        if (!z) {
            int i3 = i2 + 57;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
            return beVar;
        }
        throw null;
    }

    public static void AFLogger$LogLevel() {
        setOutOfStore = new char[]{30299, 50024, 7181, 27090, 41603, 64595, 18791, 33317, 57326, 10383, 25183, 49014, 60868, 'b', 46406, 27145, 8178, 54452, 2134, 48493, 25130, 6111, 56468, 33400, 14185, 64553, 41470, 22151, 7248, 49480, 30241, 15328, 57485, 64116};
        setPhoneNumber = -2201700898335509196L;
    }

    private boolean AFVersionDeclaration() {
        String str;
        int i = setUserEmails + 57;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        if (this.onConversionDataSuccess > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.onConversionDataSuccess;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String valueOf2 = valueOf(simpleDateFormat, this.onConversionDataSuccess);
            String valueOf3 = valueOf(simpleDateFormat, this.onResponseErrorNative);
            if ((currentTimeMillis < this.onResponseNative ? 16 : '=') != '=') {
                int i3 = setCustomerIdAndLogSession + 109;
                setUserEmails = i3 % 128;
                int i4 = i3 % 2;
                if (!isStopped()) {
                    int i5 = setUserEmails + 41;
                    setCustomerIdAndLogSession = i5 % 128;
                    if (i5 % 2 == 0) {
                        str = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{valueOf2, valueOf3, Long.valueOf(currentTimeMillis), Long.valueOf(this.onResponseNative)});
                    } else {
                        Object[] objArr = new Object[3];
                        objArr[1] = valueOf2;
                        objArr[1] = valueOf3;
                        objArr[5] = Long.valueOf(currentTimeMillis);
                        objArr[2] = Long.valueOf(this.onResponseNative);
                        str = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr);
                    }
                    AFLogger.AFKeystoreWrapper(str);
                    return true;
                }
            }
            if (!(isStopped())) {
                AFLogger.AFKeystoreWrapper(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{valueOf2, valueOf3, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!isStopped()) {
            AFLogger.AFKeystoreWrapper("Sending first launch for this session!");
        }
        return false;
    }

    public static /* synthetic */ boolean AppsFlyer2dXConversionCallback(C21868ah ahVar) {
        int i = setCustomerIdAndLogSession + 83;
        setUserEmails = i % 128;
        char c = i % 2 == 0 ? ',' : 27;
        boolean z = ahVar.onResponseError;
        if (c != ',') {
            return z;
        }
        throw null;
    }

    public static /* synthetic */ ScheduledExecutorService getLevel(C21868ah ahVar) {
        int i = setCustomerIdAndLogSession + 103;
        int i2 = i % 128;
        setUserEmails = i2;
        int i3 = i % 2;
        ScheduledExecutorService scheduledExecutorService = ahVar.onAttributionFailure;
        int i4 = i2 + 21;
        setCustomerIdAndLogSession = i4 % 128;
        if ((i4 % 2 != 0 ? 'R' : 'W') != 'R') {
            return scheduledExecutorService;
        }
        throw null;
    }

    public static /* synthetic */ C21974cw init(C21868ah ahVar) {
        int i = setUserEmails + 71;
        int i2 = i % 128;
        setCustomerIdAndLogSession = i2;
        int i3 = i % 2;
        C21974cw cwVar = ahVar.getOutOfStore;
        int i4 = i2 + 3;
        setUserEmails = i4 % 128;
        int i5 = i4 % 2;
        return cwVar;
    }

    private static boolean onAppOpenAttribution(Context context) {
        boolean z;
        NetworkCapabilities networkCapabilities;
        boolean z2;
        char c;
        if (context != null) {
            int i = setUserEmails + 77;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i3 = setUserEmails + 45;
                setCustomerIdAndLogSession = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = setCustomerIdAndLogSession + 39;
                    setUserEmails = i6 % 128;
                    if (i6 % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i5]);
                        if (networkCapabilities.hasTransport(4)) {
                            c = '.';
                        } else {
                            c = 25;
                        }
                        if (c != '.') {
                        }
                    } else {
                        networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i5]);
                        if (!networkCapabilities.hasTransport(4)) {
                            continue;
                        }
                    }
                    if (!networkCapabilities.hasCapability(15)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                AFLogger.AFKeystoreWrapper("Failed collecting ivc data", e);
            }
        }
        return false;
    }

    private String onAppOpenAttributionNative(Context context) {
        boolean z;
        char c;
        int i = setCustomerIdAndLogSession + 41;
        setUserEmails = i % 128;
        int i2 = i % 2;
        SharedPreferences valueOf2 = valueOf(context);
        if (valueOf2.contains("INSTALL_STORE")) {
            z = false;
        } else {
            z = true;
        }
        String str = null;
        if (!z) {
            int i3 = setUserEmails + 25;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
            String string = valueOf2.getString("INSTALL_STORE", (String) null);
            int i5 = setUserEmails + 93;
            setCustomerIdAndLogSession = i5 % 128;
            int i6 = i5 % 2;
            return string;
        }
        if (AFInAppEventParameterName(context)) {
            c = 19;
        } else {
            c = '#';
        }
        if (c == 19) {
            str = onDeepLinkingNative(context);
        }
        AFKeystoreWrapper(context, "INSTALL_STORE", str);
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean onAttributionFailureNative(android.content.Context r5) {
        /*
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 41
            int r1 = r0 % 128
            setUserEmails = r1
            int r0 = r0 % 2
            r1 = 84
            if (r0 != 0) goto L_0x0011
            r0 = 25
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            r2 = 1
            java.lang.String r3 = "collectAndroidIdForceByUser"
            r4 = 0
            if (r0 == r1) goto L_0x0023
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r3, r4)
            if (r0 != 0) goto L_0x0044
            goto L_0x002d
        L_0x0023:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r3, r4)
            if (r0 != 0) goto L_0x0044
        L_0x002d:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "collectIMEIForceByUser"
            boolean r0 = r0.getBoolean(r1, r4)
            r1 = 32
            if (r0 == 0) goto L_0x003e
            r0 = 98
            goto L_0x003f
        L_0x003e:
            r0 = r1
        L_0x003f:
            if (r0 == r1) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r0 = r4
            goto L_0x0045
        L_0x0044:
            r0 = r2
        L_0x0045:
            r1 = 65
            if (r0 != 0) goto L_0x004c
            r0 = 55
            goto L_0x004d
        L_0x004c:
            r0 = r1
        L_0x004d:
            if (r0 == r1) goto L_0x0061
            int r0 = setUserEmails
            int r0 = r0 + 121
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            boolean r5 = AFVersionDeclaration(r5)
            if (r5 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            return r4
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.onAttributionFailureNative(android.content.Context):boolean");
    }

    private long onConversionDataFail(Context context) {
        char c;
        int i = setCustomerIdAndLogSession + 19;
        setUserEmails = i % 128;
        int i2 = i % 2;
        long j = valueOf(context).getLong("AppsFlyerTimePassedSincePrevLaunch", 0);
        long currentTimeMillis = System.currentTimeMillis();
        valueOf(context, "AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if (j > 0) {
            c = C15369g.f37980f;
        } else {
            c = '$';
        }
        if (c == '$') {
            return -1;
        }
        int i3 = setCustomerIdAndLogSession + 49;
        setUserEmails = i3 % 128;
        int i4 = i3 % 2;
        return (currentTimeMillis - j) / 1000;
    }

    private String onDeepLinkingNative(Context context) {
        boolean z;
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return AFKeystoreWrapper(context, "AF_STORE");
        }
        int i = setUserEmails;
        int i2 = i + 123;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        int i4 = i + 123;
        setCustomerIdAndLogSession = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private boolean onInstallConversionDataLoadedNative() {
        Map<String, Object> map = this.updateServerUninstallToken;
        boolean z = false;
        if ((map != null ? '0' : 26) == 26 || map.isEmpty()) {
            int i = setCustomerIdAndLogSession + 49;
            setUserEmails = i % 128;
            int i2 = i % 2;
            return false;
        }
        int i3 = setUserEmails + 5;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
        }
        if (z) {
            return true;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r1 != '?') goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (AFInAppEventParameterName(r0) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String onInstallConversionFailureNative(android.content.Context r5) {
        /*
            r4 = this;
            int r0 = setUserEmails
            r1 = 91
            int r0 = r0 + r1
            int r2 = r0 % 128
            setCustomerIdAndLogSession = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0010
            r0 = 26
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            r2 = 0
            java.lang.String r3 = "ro.appsflyer.preinstall.path"
            if (r0 == r1) goto L_0x0030
            java.lang.String r0 = AFKeystoreWrapper((java.lang.String) r3)
            java.io.File r0 = init((java.lang.String) r0)
            boolean r1 = AFInAppEventParameterName((java.io.File) r0)
            r3 = 23
            int r3 = r3 / r2
            r3 = 63
            if (r1 == 0) goto L_0x002c
            r1 = 20
            goto L_0x002d
        L_0x002c:
            r1 = r3
        L_0x002d:
            if (r1 == r3) goto L_0x0052
            goto L_0x003e
        L_0x0030:
            java.lang.String r0 = AFKeystoreWrapper((java.lang.String) r3)
            java.io.File r0 = init((java.lang.String) r0)
            boolean r1 = AFInAppEventParameterName((java.io.File) r0)
            if (r1 == 0) goto L_0x0052
        L_0x003e:
            java.lang.String r0 = "AF_PRE_INSTALL_PATH"
            java.lang.String r0 = r4.AFKeystoreWrapper((android.content.Context) r5, (java.lang.String) r0)
            java.io.File r0 = init((java.lang.String) r0)
            int r1 = setCustomerIdAndLogSession
            int r1 = r1 + 77
            int r3 = r1 % 128
            setUserEmails = r3
            int r1 = r1 % 2
        L_0x0052:
            boolean r1 = AFInAppEventParameterName((java.io.File) r0)
            r3 = 0
            if (r1 == 0) goto L_0x0070
            int r0 = setUserEmails
            int r0 = r0 + 43
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            java.lang.String r1 = "/data/local/tmp/pre_install.appsflyer"
            if (r0 != 0) goto L_0x006c
            java.io.File r0 = init((java.lang.String) r1)
            goto L_0x0070
        L_0x006c:
            init((java.lang.String) r1)
            throw r3
        L_0x0070:
            boolean r1 = AFInAppEventParameterName((java.io.File) r0)
            if (r1 == 0) goto L_0x007c
            java.lang.String r0 = "/etc/pre_install.appsflyer"
            java.io.File r0 = init((java.lang.String) r0)
        L_0x007c:
            boolean r1 = AFInAppEventParameterName((java.io.File) r0)
            if (r1 == 0) goto L_0x0083
            r2 = 1
        L_0x0083:
            if (r2 == 0) goto L_0x0093
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 69
            int r0 = r5 % 128
            setUserEmails = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0092
            return r3
        L_0x0092:
            throw r3
        L_0x0093:
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r5 = AFInAppEventParameterName((java.io.File) r0, (java.lang.String) r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.onInstallConversionFailureNative(android.content.Context):java.lang.String");
    }

    private void onResponseErrorNative(Context context) {
        char c;
        boolean z;
        int i = setCustomerIdAndLogSession;
        int i2 = i + 55;
        setUserEmails = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onResponseError) {
            c = 5;
        } else {
            c = 4;
        }
        if (c != 4) {
            int i4 = i + 41;
            setUserEmails = i4 % 128;
            if (i4 % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (System.currentTimeMillis() / this.AFLogger$LogLevel < 15000) {
                    return;
                }
            } else if (System.currentTimeMillis() - this.AFLogger$LogLevel < 15000) {
                return;
            }
            if (this.onAttributionFailure == null) {
                if (C22004m.AFInAppEventType == null) {
                    C22004m.AFInAppEventType = new C22004m();
                }
                this.onAttributionFailure = C22004m.AFInAppEventType.values();
                AFKeystoreWrapper(this.onAttributionFailure, new C21879b(context), 1, TimeUnit.SECONDS);
            }
        }
    }

    private static float onResponseNative(Context context) {
        float f;
        char c;
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra(FirebaseAnalytics.C32532b.f78971t, -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra != -1) {
                c = '\'';
            } else {
                c = 29;
            }
            if (c == 29) {
                return 50.0f;
            }
            int i = setCustomerIdAndLogSession;
            int i2 = i + 101;
            setUserEmails = i2 % 128;
            int i3 = i2 % 2;
            if (intExtra2 == -1) {
                return 50.0f;
            }
            f = (((float) intExtra) / ((float) intExtra2)) * 100.0f;
            int i4 = i + 43;
            setUserEmails = i4 % 128;
            int i5 = i4 % 2;
            int i6 = setCustomerIdAndLogSession + 9;
            setUserEmails = i6 % 128;
            int i7 = i6 % 2;
            return f;
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper(th.getMessage(), th);
            f = 1.0f;
        }
    }

    public static /* synthetic */ Application valueOf(C21868ah ahVar) {
        int i = setCustomerIdAndLogSession;
        int i2 = i + 111;
        setUserEmails = i2 % 128;
        int i3 = i2 % 2;
        Application application = ahVar.onPause;
        int i4 = i + 83;
        setUserEmails = i4 % 128;
        int i5 = i4 % 2;
        return application;
    }

    public static /* synthetic */ Map values(C21868ah ahVar) {
        int i = setUserEmails + 87;
        int i2 = i % 128;
        setCustomerIdAndLogSession = i2;
        char c = i % 2 != 0 ? '[' : 'J';
        Map<String, Object> map = ahVar.stop;
        if (c != '[') {
            int i3 = i2 + 109;
            setUserEmails = i3 % 128;
            if (i3 % 2 != 0) {
                return map;
            }
            throw null;
        }
        throw null;
    }

    public final void addPushNotificationDeepLinkPath(String... strArr) {
        char c;
        List list;
        List<List<String>> list2;
        char c2;
        int i = setUserEmails + 49;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 != 0) {
            c = 'F';
        } else {
            c = '<';
        }
        if (c != '<') {
            list = Arrays.asList(strArr);
            list2 = C21997i.AFKeystoreWrapper().init;
            int i2 = 91 / 0;
            if (!list2.contains(list)) {
                c2 = ',';
            } else {
                c2 = 10;
            }
            if (c2 != ',') {
                return;
            }
        } else {
            list = Arrays.asList(strArr);
            list2 = C21997i.AFKeystoreWrapper().init;
            if (list2.contains(list)) {
                return;
            }
        }
        int i3 = setUserEmails + 97;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
        list2.add(list);
    }

    public final void anonymizeUser(boolean z) {
        boolean z2;
        int i = setUserEmails + 109;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C21886am.AFKeystoreWrapper().values("anonymizeUser", String.valueOf(z));
        } else {
            C21886am AFKeystoreWrapper2 = C21886am.AFKeystoreWrapper();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            AFKeystoreWrapper2.values("anonymizeUser", strArr);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
    }

    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        char c;
        int i = setUserEmails + 73;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        C21997i AFKeystoreWrapper2 = C21997i.AFKeystoreWrapper();
        AFKeystoreWrapper2.getLevel = str;
        AFKeystoreWrapper2.AFVersionDeclaration = map;
        int i3 = setCustomerIdAndLogSession + 59;
        setUserEmails = i3 % 128;
        if (i3 % 2 == 0) {
            c = C15369g.f37980f;
        } else {
            c = 18;
        }
        if (c != 18) {
            throw null;
        }
    }

    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = setCustomerIdAndLogSession + 19;
        int i2 = i % 128;
        setUserEmails = i2;
        int i3 = i % 2;
        this.getSdkVersion = z;
        int i4 = i2 + 113;
        setCustomerIdAndLogSession = i4 % 128;
        if ((i4 % 2 != 0 ? 27 : 'P') != 'P') {
            throw null;
        }
    }

    public final AppsFlyerLib enableLocationCollection(boolean z) {
        int i = setCustomerIdAndLogSession;
        int i2 = i + 67;
        setUserEmails = i2 % 128;
        int i3 = i2 % 2;
        this.onResponse = z;
        int i4 = i + 115;
        setUserEmails = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r0 != true) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r6 = setUserEmails + 123;
        setCustomerIdAndLogSession = r6 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if ((r6 % 2) == 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r6 == true) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r6 = 35 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r2 != 27) goto L_0x0032;
     */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getAppsFlyerUID(@android.support.annotation.NonNull android.content.Context r6) {
        /*
            r5 = this;
            int r0 = setUserEmails
            int r0 = r0 + 55
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            java.lang.String r1 = "getAppsFlyerUID"
            r2 = 71
            r3 = 0
            if (r0 == 0) goto L_0x0022
            com.appsflyer.internal.am r0 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()
            java.lang.String[] r4 = new java.lang.String[r3]
            r0.values(r1, r4)
            r0 = 27
            if (r6 != 0) goto L_0x001f
            r2 = r0
        L_0x001f:
            if (r2 == r0) goto L_0x0043
            goto L_0x0032
        L_0x0022:
            com.appsflyer.internal.am r0 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()
            java.lang.String[] r4 = new java.lang.String[r3]
            r0.values(r1, r4)
            if (r6 != 0) goto L_0x002f
            r0 = r2
            goto L_0x0030
        L_0x002f:
            r0 = r3
        L_0x0030:
            if (r0 == r2) goto L_0x0043
        L_0x0032:
            com.appsflyer.internal.x r0 = new com.appsflyer.internal.x
            r0.<init>(r6)
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            android.content.Context r0 = r0.valueOf
            r6.<init>(r0)
            java.lang.String r6 = com.appsflyer.internal.C21885al.AFKeystoreWrapper(r6)
            return r6
        L_0x0043:
            int r6 = setUserEmails
            int r6 = r6 + 123
            int r0 = r6 % 128
            setCustomerIdAndLogSession = r0
            int r6 = r6 % 2
            r0 = 1
            if (r6 == 0) goto L_0x0052
            r6 = r3
            goto L_0x0053
        L_0x0052:
            r6 = r0
        L_0x0053:
            r1 = 0
            if (r6 == r0) goto L_0x0059
            r6 = 35
            int r6 = r6 / r3
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.getAppsFlyerUID(android.content.Context):java.lang.String");
    }

    public final String getAttributionId(Context context) {
        boolean z;
        try {
            String values2 = new C21867ag(context).values();
            int i = setUserEmails + 27;
            setCustomerIdAndLogSession = i % 128;
            if (i % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                int i2 = 44 / 0;
            }
            return values2;
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    public final String getHostName() {
        boolean z;
        char c;
        String valueOf2 = valueOf("custom_host");
        if (valueOf2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i = setCustomerIdAndLogSession + 109;
            setUserEmails = i % 128;
            if (i % 2 != 0) {
                return "appsflyer.com";
            }
            throw null;
        }
        int i2 = setUserEmails + 99;
        setCustomerIdAndLogSession = i2 % 128;
        if (i2 % 2 != 0) {
            c = '7';
        } else {
            c = 11;
        }
        if (c != '7') {
            return valueOf2;
        }
        throw null;
    }

    public final String getHostPrefix() {
        boolean z;
        char c;
        int i = setUserEmails + 57;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        String valueOf2 = valueOf("custom_host_prefix");
        if (valueOf2 != null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        int i3 = setCustomerIdAndLogSession + 101;
        setUserEmails = i3 % 128;
        if (i3 % 2 == 0) {
            c = C12361b.f30257h;
        } else {
            c = 14;
        }
        if (c != 14) {
            int i4 = 48 / 0;
        }
        return valueOf2;
    }

    public final String getOutOfStore(Context context) {
        char c;
        char c2;
        int i = setCustomerIdAndLogSession + 67;
        setUserEmails = i % 128;
        int i2 = i % 2;
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            int i3 = setCustomerIdAndLogSession + 89;
            setUserEmails = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }
        String AFKeystoreWrapper2 = AFKeystoreWrapper(context, "AF_STORE");
        if (AFKeystoreWrapper2 != null) {
            c = 17;
        } else {
            c = 'G';
        }
        if (c != 17) {
            AFLogger.AFKeystoreWrapper("No out-of-store value set");
            return null;
        }
        int i5 = setCustomerIdAndLogSession + 1;
        setUserEmails = i5 % 128;
        if (i5 % 2 == 0) {
            c2 = '8';
        } else {
            c2 = 'P';
        }
        if (c2 != '8') {
            return AFKeystoreWrapper2;
        }
        int i6 = 55 / 0;
        return AFKeystoreWrapper2;
    }

    public final String getSdkVersion() {
        char c;
        C21886am.AFKeystoreWrapper().values("getSdkVersion", new String[0]);
        StringBuilder sb = new StringBuilder("version: 6.5.2 (build ");
        sb.append(AFInAppEventParameterName);
        sb.append(")");
        String obj = sb.toString();
        int i = setCustomerIdAndLogSession + 101;
        setUserEmails = i % 128;
        if (i % 2 == 0) {
            c = '7';
        } else {
            c = 'G';
        }
        if (c != '7') {
            return obj;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r4 != true) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isPreInstalledApp(android.content.Context r4) {
        /*
            r3 = this;
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 61
            int r1 = r0 % 128
            setUserEmails = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            if (r0 == 0) goto L_0x002a
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x005e }
            android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo(r4, r1)     // Catch:{ NameNotFoundException -> 0x005e }
            int r4 = r4.flags     // Catch:{ NameNotFoundException -> 0x005e }
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0026
            r4 = r2
            goto L_0x0027
        L_0x0026:
            r4 = r1
        L_0x0027:
            if (r4 == r2) goto L_0x0040
            goto L_0x0053
        L_0x002a:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x005e }
            android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo(r4, r1)     // Catch:{ NameNotFoundException -> 0x005e }
            int r4 = r4.flags     // Catch:{ NameNotFoundException -> 0x005e }
            r4 = r4 | r2
            if (r4 == 0) goto L_0x003d
            r4 = r1
            goto L_0x003e
        L_0x003d:
            r4 = r2
        L_0x003e:
            if (r4 == r2) goto L_0x0053
        L_0x0040:
            int r4 = setUserEmails
            int r0 = r4 + 69
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            int r4 = r4 + 13
            int r0 = r4 % 128
            setCustomerIdAndLogSession = r0
            int r4 = r4 % 2
            return r2
        L_0x0053:
            int r4 = setCustomerIdAndLogSession
            int r4 = r4 + 69
            int r0 = r4 % 128
            setUserEmails = r0
            int r4 = r4 % 2
            goto L_0x0064
        L_0x005e:
            r4 = move-exception
            java.lang.String r0 = "Could not check if app is pre installed"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0, r4)
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.isPreInstalledApp(android.content.Context):boolean");
    }

    public final boolean isStopped() {
        int i = setUserEmails;
        int i2 = i + 9;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onValidateInAppFailure;
        int i4 = i + 87;
        setCustomerIdAndLogSession = i4 % 128;
        if ((i4 % 2 != 0 ? (char) 13 : 26) == 26) {
            return z;
        }
        throw null;
    }

    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap;
        C21958cl clVar = new C21958cl();
        if (context != null) {
            clVar.AFInAppEventType = (Application) context.getApplicationContext();
        }
        clVar.getLevel = str;
        Activity activity = null;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(map);
        }
        clVar.values = hashMap;
        clVar.AFInAppEventParameterName = appsFlyerRequestListener;
        C21886am AFKeystoreWrapper2 = C21886am.AFKeystoreWrapper();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map2 = clVar.values;
        if (map2 == null) {
            map2 = new HashMap();
        }
        strArr[1] = new JSONObject(map2).toString();
        AFKeystoreWrapper2.values("logEvent", strArr);
        if (str != null) {
            C21850ac.AFInAppEventType(context).values();
        } else {
            valueOf(context, C21941bx.logEvent);
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        AFKeystoreWrapper((C21995g) clVar, activity);
    }

    public final void logLocation(Context context, double d, double d2) {
        C21886am.AFKeystoreWrapper().values("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        AFInAppEventParameterName(context, AFInAppEventType.LOCATION_COORDINATES, (Map<String, Object>) hashMap);
        int i = setUserEmails + 125;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
    }

    public final void logSession(Context context) {
        boolean z;
        int i = setUserEmails + 115;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        C21886am.AFKeystoreWrapper().values("logSession", new String[0]);
        C21886am.AFKeystoreWrapper().AFVersionDeclaration();
        valueOf(context, C21941bx.logSession);
        AFInAppEventParameterName(context, (String) null, (Map<String, Object>) null);
        int i3 = setCustomerIdAndLogSession + 125;
        setUserEmails = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i4 = 48 / 0;
        }
    }

    public final void onPause(Context context) {
        boolean z;
        int i = setCustomerIdAndLogSession + 113;
        setUserEmails = i % 128;
        int i2 = i % 2;
        C21860af.C21866d dVar = C21860af.valueOf;
        if (dVar != null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            dVar.AFInAppEventParameterName(context);
            int i3 = setCustomerIdAndLogSession + 13;
            setUserEmails = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        char c;
        int i = setCustomerIdAndLogSession + 41;
        setUserEmails = i % 128;
        int i2 = i % 2;
        if (uri != null) {
            c = C15369g.f37980f;
        } else {
            c = '\"';
        }
        if (c == '\"' || uri.toString().isEmpty()) {
            StringBuilder sb = new StringBuilder("Link is \"");
            sb.append(uri);
            sb.append("\"");
            C21897aq.AFInAppEventParameterName(sb.toString(), DeepLinkResult.Error.NETWORK);
        } else if (context == null) {
            StringBuilder sb2 = new StringBuilder("Context is \"");
            sb2.append(context);
            sb2.append("\"");
            C21897aq.AFInAppEventParameterName(sb2.toString(), DeepLinkResult.Error.NETWORK);
        } else {
            C21997i.AFKeystoreWrapper().AFInAppEventParameterName(context, (Map<String, Object>) new HashMap(), Uri.parse(uri.toString()));
            int i3 = setCustomerIdAndLogSession + 43;
            setUserEmails = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final void performOnDeepLinking(@NonNull final Intent intent, @NonNull Context context) {
        boolean z;
        int i = setUserEmails;
        int i2 = i + 79;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        boolean z2 = false;
        if (intent == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i4 = i + 81;
            setCustomerIdAndLogSession = i4 % 128;
            int i5 = i4 % 2;
            C21897aq.AFInAppEventParameterName("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            z2 = true;
        }
        if (!z2) {
            final Context applicationContext = context.getApplicationContext();
            this.waitForCustomerUserId.AFInAppEventType = applicationContext.getApplicationContext();
            final C21952cf init2 = AFInAppEventType().init();
            this.enableLocationCollection.execute(new Runnable() {
                public final void run() {
                    boolean z;
                    C21997i.AFKeystoreWrapper();
                    Intent intent = intent;
                    Context context = applicationContext;
                    C21952cf cfVar = init2;
                    Context context2 = C21868ah.AFKeystoreWrapper(C21868ah.this).AFInAppEventType;
                    if (context2 != null) {
                        C21910ay ayVar = new C21910ay(C21868ah.valueOf(context2));
                        Uri values2 = C21997i.values(intent);
                        if (values2 == null || values2.toString().isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!C21868ah.valueOf(context).getBoolean("ddl_sent", false) || z) {
                            C21997i.AFKeystoreWrapper().AFKeystoreWrapper(new HashMap(), cfVar, intent, ayVar, context);
                        } else {
                            C21897aq.AFInAppEventParameterName("No direct deep link", (DeepLinkResult.Error) null);
                        }
                    } else {
                        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                    }
                }
            });
            return;
        }
        C21897aq.AFInAppEventParameterName("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        int i6 = setUserEmails + 101;
        setCustomerIdAndLogSession = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        boolean z;
        int i = setUserEmails + 75;
        setCustomerIdAndLogSession = i % 128;
        boolean z2 = true;
        if (i % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C21886am.AFKeystoreWrapper().values("registerConversionListener", new String[0]);
        } else {
            C21886am.AFKeystoreWrapper().values("registerConversionListener", new String[1]);
        }
        AFInAppEventType(appsFlyerConversionListener);
        int i2 = setCustomerIdAndLogSession + 57;
        setUserEmails = i2 % 128;
        if (i2 % 2 != 0) {
            z2 = false;
        }
        if (z2) {
            int i3 = 30 / 0;
        }
    }

    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        boolean z;
        C21886am.AFKeystoreWrapper().values("registerValidatorListener", new String[0]);
        AFLogger.values("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            int i = setUserEmails + 121;
            setCustomerIdAndLogSession = i % 128;
            boolean z2 = true;
            if (i % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            AFLogger.values("registerValidatorListener null listener");
            if (z) {
                int i2 = 26 / 0;
            }
            int i3 = setCustomerIdAndLogSession + 107;
            setUserEmails = i3 % 128;
            if (i3 % 2 != 0) {
                z2 = false;
            }
            if (z2) {
                int i4 = 86 / 0;
                return;
            }
            return;
        }
        AFInAppEventType = appsFlyerInAppPurchaseValidatorListener;
    }

    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        char c;
        C21949cc ccVar = new C21949cc();
        if (context != null) {
            int i = setCustomerIdAndLogSession + 115;
            setUserEmails = i % 128;
            if (i % 2 == 0) {
                c = C15369g.f37978d;
            } else {
                c = '6';
            }
            if (c != '6') {
                ccVar.AFInAppEventType = (Application) context.getApplicationContext();
                int i2 = 46 / 0;
            } else {
                ccVar.AFInAppEventType = (Application) context.getApplicationContext();
            }
            int i3 = setCustomerIdAndLogSession + 15;
            setUserEmails = i3 % 128;
            int i4 = i3 % 2;
        }
        ccVar.values = map;
        values((C21995g) ccVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void sendPushNotificationData(@android.support.annotation.NonNull android.app.Activity r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "c"
            java.lang.String r2 = "pid"
            r3 = 28
            if (r17 == 0) goto L_0x000d
            r4 = 95
            goto L_0x000e
        L_0x000d:
            r4 = r3
        L_0x000e:
            r5 = 0
            java.lang.String r6 = "sendPushNotificationData"
            r7 = 1
            r8 = 2
            if (r4 == r3) goto L_0x0043
            android.content.Intent r3 = r17.getIntent()
            if (r3 == 0) goto L_0x0043
            com.appsflyer.internal.am r3 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()
            java.lang.String[] r4 = new java.lang.String[r8]
            java.lang.String r9 = r17.getLocalClassName()
            r4[r5] = r9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "activity_intent_"
            r5.<init>(r9)
            android.content.Intent r9 = r17.getIntent()
            java.lang.String r9 = r9.toString()
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            r4[r7] = r5
            r3.values(r6, r4)
            goto L_0x0080
        L_0x0043:
            r3 = 31
            if (r17 == 0) goto L_0x0049
            r4 = r3
            goto L_0x004b
        L_0x0049:
            r4 = 39
        L_0x004b:
            if (r4 == r3) goto L_0x005b
            com.appsflyer.internal.am r3 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()
            java.lang.String r4 = "activity_null"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r3.values(r6, r4)
            goto L_0x0080
        L_0x005b:
            int r3 = setUserEmails
            int r3 = r3 + 93
            int r4 = r3 % 128
            setCustomerIdAndLogSession = r4
            int r3 = r3 % r8
            com.appsflyer.internal.am r3 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()
            java.lang.String[] r4 = new java.lang.String[r8]
            java.lang.String r9 = r17.getLocalClassName()
            r4[r5] = r9
            java.lang.String r5 = "activity_intent_null"
            r4[r7] = r5
            r3.values(r6, r4)
            int r3 = setUserEmails
            int r3 = r3 + 75
            int r4 = r3 % 128
            setCustomerIdAndLogSession = r4
            int r3 = r3 % r8
        L_0x0080:
            java.lang.String r3 = AFInAppEventType((android.app.Activity) r17)
            r1.onDeepLinking = r3
            if (r3 == 0) goto L_0x008a
            r3 = r7
            goto L_0x008c
        L_0x008a:
            r3 = 38
        L_0x008c:
            if (r3 == r7) goto L_0x0090
            goto L_0x01b3
        L_0x0090:
            long r3 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.Long, java.lang.String> r5 = r1.AppsFlyerConversionListener
            java.lang.String r6 = ")"
            if (r5 != 0) goto L_0x00a9
            java.lang.String r0 = "pushes: initializing pushes history.."
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.AppsFlyerConversionListener = r0
            r11 = r3
            goto L_0x016b
        L_0x00a9:
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0150 }
            java.lang.String r7 = "pushPayloadMaxAging"
            r9 = 1800000(0x1b7740, double:8.89318E-318)
            long r9 = r5.getLong(r7, r9)     // Catch:{ all -> 0x0150 }
            java.util.Map<java.lang.Long, java.lang.String> r5 = r1.AppsFlyerConversionListener     // Catch:{ all -> 0x0150 }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x0150 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0150 }
            r11 = r3
        L_0x00c1:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x014e }
            if (r7 == 0) goto L_0x016b
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x014e }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x014e }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x014e }
            java.lang.String r14 = r1.onDeepLinking     // Catch:{ all -> 0x014e }
            r13.<init>(r14)     // Catch:{ all -> 0x014e }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x014e }
            java.util.Map<java.lang.Long, java.lang.String> r15 = r1.AppsFlyerConversionListener     // Catch:{ all -> 0x014e }
            java.lang.Object r15 = r15.get(r7)     // Catch:{ all -> 0x014e }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x014e }
            r14.<init>(r15)     // Catch:{ all -> 0x014e }
            java.lang.Object r15 = r13.opt(r2)     // Catch:{ all -> 0x014e }
            java.lang.Object r8 = r14.opt(r2)     // Catch:{ all -> 0x014e }
            boolean r8 = r15.equals(r8)     // Catch:{ all -> 0x014e }
            if (r8 == 0) goto L_0x0127
            int r8 = setUserEmails
            int r8 = r8 + 33
            int r15 = r8 % 128
            setCustomerIdAndLogSession = r15
            r15 = 2
            int r8 = r8 % r15
            java.lang.Object r8 = r13.opt(r0)     // Catch:{ all -> 0x014e }
            java.lang.Object r15 = r14.opt(r0)     // Catch:{ all -> 0x014e }
            boolean r8 = r8.equals(r15)     // Catch:{ all -> 0x014e }
            if (r8 == 0) goto L_0x0127
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x014e }
            java.lang.String r2 = "PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: "
            r0.<init>(r2)     // Catch:{ all -> 0x014e }
            r0.append(r14)     // Catch:{ all -> 0x014e }
            java.lang.String r2 = ", new: "
            r0.append(r2)     // Catch:{ all -> 0x014e }
            r0.append(r13)     // Catch:{ all -> 0x014e }
            r0.append(r6)     // Catch:{ all -> 0x014e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x014e }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0)     // Catch:{ all -> 0x014e }
            r0 = 0
            r1.onDeepLinking = r0     // Catch:{ all -> 0x014e }
            return
        L_0x0127:
            long r13 = r7.longValue()     // Catch:{ all -> 0x014e }
            long r13 = r3 - r13
            int r8 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            r13 = 91
            if (r8 <= 0) goto L_0x0135
            r8 = r13
            goto L_0x0137
        L_0x0135:
            r8 = 59
        L_0x0137:
            if (r8 == r13) goto L_0x013a
            goto L_0x013f
        L_0x013a:
            java.util.Map<java.lang.Long, java.lang.String> r8 = r1.AppsFlyerConversionListener     // Catch:{ all -> 0x014e }
            r8.remove(r7)     // Catch:{ all -> 0x014e }
        L_0x013f:
            long r13 = r7.longValue()     // Catch:{ all -> 0x014e }
            int r8 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r8 > 0) goto L_0x014b
            long r11 = r7.longValue()     // Catch:{ all -> 0x014e }
        L_0x014b:
            r8 = 2
            goto L_0x00c1
        L_0x014e:
            r0 = move-exception
            goto L_0x0152
        L_0x0150:
            r0 = move-exception
            r11 = r3
        L_0x0152:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Error while handling push notification measurement: "
            r2.<init>(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r2, r0)
        L_0x016b:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "pushPayloadHistorySize"
            r5 = 2
            int r0 = r0.getInt(r2, r5)
            java.util.Map<java.lang.Long, java.lang.String> r2 = r1.AppsFlyerConversionListener
            int r2 = r2.size()
            if (r2 != r0) goto L_0x019b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "pushes: removing oldest overflowing push (oldest push:"
            r0.<init>(r2)
            r0.append(r11)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.AppsFlyerConversionListener
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r0.remove(r2)
        L_0x019b:
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.AppsFlyerConversionListener
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = r1.onDeepLinking
            r0.put(r2, r3)
            r16.start(r17)
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 79
            int r2 = r0 % 128
            setUserEmails = r2
            r2 = 2
            int r0 = r0 % r2
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.sendPushNotificationData(android.app.Activity):void");
    }

    public final void setAdditionalData(Map<String, Object> map) {
        int i = setUserEmails + 107;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        if (map != null) {
            C21886am.AFKeystoreWrapper().values("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            int i3 = setUserEmails + 21;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final void setAndroidIdData(String str) {
        char c;
        int i = setCustomerIdAndLogSession + 21;
        setUserEmails = i % 128;
        if (i % 2 == 0) {
            c = 'L';
        } else {
            c = C15369g.f37976b;
        }
        if (c != 'L') {
            C21886am.AFKeystoreWrapper().values("setAndroidIdData", str);
        } else {
            C21886am AFKeystoreWrapper2 = C21886am.AFKeystoreWrapper();
            String[] strArr = new String[1];
            strArr[1] = str;
            AFKeystoreWrapper2.values("setAndroidIdData", strArr);
        }
        this.AFVersionDeclaration = str;
    }

    public final void setAppId(String str) {
        char c;
        int i = setCustomerIdAndLogSession + 5;
        setUserEmails = i % 128;
        if (i % 2 == 0) {
            c = 'Z';
        } else {
            c = 'J';
        }
        if (c != 'Z') {
            C21886am.AFKeystoreWrapper().values("setAppId", str);
        } else {
            C21886am AFKeystoreWrapper2 = C21886am.AFKeystoreWrapper();
            String[] strArr = new String[1];
            strArr[1] = str;
            AFKeystoreWrapper2.values("setAppId", strArr);
        }
        AFInAppEventParameterName("appid", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r0 != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (r8 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (r5 != true) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_DOMAIN);
        com.appsflyer.AppsFlyerProperties.getInstance().remove("onelinkVersion");
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_SCHEME);
        r0 = setCustomerIdAndLogSession + 9;
        setUserEmails = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        AFInAppEventParameterName(com.appsflyer.AppsFlyerProperties.ONELINK_ID, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setAppInviteOneLink(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 13
            int r1 = r0 % 128
            setUserEmails = r1
            int r0 = r0 % 2
            r1 = 6
            if (r0 != 0) goto L_0x0010
            r0 = 58
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            java.lang.String r2 = "oneLinkSlug"
            java.lang.String r3 = "setAppInviteOneLink = "
            java.lang.String r4 = "setAppInviteOneLink"
            r5 = 0
            r6 = 1
            if (r0 == r1) goto L_0x0039
            com.appsflyer.internal.am r0 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()
            java.lang.String[] r1 = new java.lang.String[r6]
            r1[r5] = r8
            r0.values(r4, r1)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r0 = r3.concat(r0)
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
            if (r8 == 0) goto L_0x0035
            r0 = r6
            goto L_0x0036
        L_0x0035:
            r0 = r5
        L_0x0036:
            if (r0 == 0) goto L_0x0063
            goto L_0x0051
        L_0x0039:
            com.appsflyer.internal.am r0 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()
            java.lang.String[] r1 = new java.lang.String[r6]
            r1[r5] = r8
            r0.values(r4, r1)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r0 = r3.concat(r0)
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
            if (r8 == 0) goto L_0x0063
        L_0x0051:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r2)
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r5 = r6
        L_0x0061:
            if (r5 == r6) goto L_0x0088
        L_0x0063:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkDomain"
            r0.remove(r1)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkVersion"
            r0.remove(r1)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkScheme"
            r0.remove(r1)
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 9
            int r1 = r0 % 128
            setUserEmails = r1
            int r0 = r0 % 2
        L_0x0088:
            AFInAppEventParameterName((java.lang.String) r2, (java.lang.String) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.setAppInviteOneLink(java.lang.String):void");
    }

    public final void setCollectAndroidID(boolean z) {
        int i = setUserEmails + 93;
        setCustomerIdAndLogSession = i % 128;
        char c = 2;
        int i2 = i % 2;
        C21886am.AFKeystoreWrapper().values("setCollectAndroidID", String.valueOf(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i3 = setUserEmails + 91;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 != 0) {
            c = 'L';
        }
        if (c == 'L') {
            int i4 = 65 / 0;
        }
    }

    public final void setCollectIMEI(boolean z) {
        char c;
        int i = setCustomerIdAndLogSession + 15;
        setUserEmails = i % 128;
        int i2 = i % 2;
        C21886am.AFKeystoreWrapper().values("setCollectIMEI", String.valueOf(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i3 = setCustomerIdAndLogSession + 41;
        setUserEmails = i3 % 128;
        if (i3 % 2 == 0) {
            c = 21;
        } else {
            c = 16;
        }
        if (c != 16) {
            throw null;
        }
    }

    @Deprecated
    public final void setCollectOaid(boolean z) {
        char c;
        int i = setUserEmails + 9;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        C21886am.AFKeystoreWrapper().values("setCollectOaid", String.valueOf(z));
        AFInAppEventParameterName(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i3 = setCustomerIdAndLogSession + 57;
        setUserEmails = i3 % 128;
        if (i3 % 2 == 0) {
            c = 26;
        } else {
            c = '\\';
        }
        if (c == 26) {
            throw null;
        }
    }

    public final void setCurrencyCode(String str) {
        char c;
        int i = setUserEmails + 109;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 != 0) {
            c = 5;
        } else {
            c = '9';
        }
        if (c != 5) {
            C21886am.AFKeystoreWrapper().values("setCurrencyCode", str);
        } else {
            C21886am AFKeystoreWrapper2 = C21886am.AFKeystoreWrapper();
            String[] strArr = new String[1];
            strArr[1] = str;
            AFKeystoreWrapper2.values("setCurrencyCode", strArr);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i2 = setUserEmails + 37;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        char c;
        boolean z;
        if (context != null) {
            c = 27;
        } else {
            c = '(';
        }
        if (c != '(') {
            int i = setCustomerIdAndLogSession + 97;
            setUserEmails = i % 128;
            if (i % 2 == 0) {
                values();
                throw null;
            } else if (values()) {
                setCustomerUserId(str);
                StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                sb.append(str);
                sb.append(" - Initializing AppsFlyer Tacking");
                AFLogger.AFInAppEventType(sb.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                valueOf(context, C21941bx.setCustomerIdAndLogSession);
                String devKey = AppsFlyerProperties.getInstance().getDevKey();
                if (referrer == null) {
                    z = true;
                } else {
                    z = true;
                }
                if (!z) {
                    referrer = "";
                } else {
                    int i2 = setUserEmails + 53;
                    setCustomerIdAndLogSession = i2 % 128;
                    int i3 = i2 % 2;
                }
                String str2 = referrer;
                if (context instanceof Activity) {
                    ((Activity) context).getIntent();
                }
                AFInAppEventType(context, devKey, (String) null, (Map<String, Object>) null, str2, (String) null);
                int i4 = setUserEmails + 55;
                setCustomerIdAndLogSession = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 76 / 0;
                }
            } else {
                setCustomerUserId(str);
                AFLogger.AFInAppEventType("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                int i6 = setUserEmails + 85;
                setCustomerIdAndLogSession = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    public final void setCustomerUserId(String str) {
        int i = setUserEmails + 105;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        boolean z = true;
        C21886am.AFKeystoreWrapper().values("setCustomerUserId", str);
        AFLogger.AFKeystoreWrapper("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventParameterName(AppsFlyerProperties.APP_USER_ID, str);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i3 = setUserEmails + 83;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (!z) {
            int i4 = 98 / 0;
        }
    }

    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i;
        int i2 = setCustomerIdAndLogSession + 41;
        setUserEmails = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(!z)) {
                logLevel = AFLogger.LogLevel.DEBUG;
                i = setUserEmails + 15;
                setCustomerIdAndLogSession = i % 128;
            } else {
                logLevel = AFLogger.LogLevel.NONE;
                i = setCustomerIdAndLogSession + 15;
                setUserEmails = i % 128;
            }
            int i3 = i % 2;
            setLogLevel(logLevel);
            int i4 = setUserEmails + 37;
            setCustomerIdAndLogSession = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        throw null;
    }

    public final void setDisableAdvertisingIdentifiers(boolean z) {
        boolean z2;
        AFLogger.values("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        boolean z3 = false;
        if (!z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            int i = setUserEmails + 23;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            z3 = true;
        }
        C22021z.values = Boolean.valueOf(z3);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
        int i3 = setCustomerIdAndLogSession + 87;
        setUserEmails = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setExtension(String str) {
        char c;
        int i = setUserEmails + 97;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        C21886am.AFKeystoreWrapper().values("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i3 = setUserEmails + 39;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 != 0) {
            c = 27;
        } else {
            c = 'I';
        }
        if (c == 27) {
            int i4 = 97 / 0;
        }
    }

    public final void setHost(String str, String str2) {
        char c;
        boolean z;
        boolean z2;
        char c2;
        int i = setCustomerIdAndLogSession;
        int i2 = i + 53;
        setUserEmails = i2 % 128;
        int i3 = i2 % 2;
        if (str != null) {
            c = 9;
        } else {
            c = 'D';
        }
        if (c == 9) {
            int i4 = i + 89;
            setUserEmails = i4 % 128;
            int i5 = i4 % 2;
            AFInAppEventParameterName("custom_host_prefix", str);
        }
        if (str2 != null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int i6 = setUserEmails + 43;
            setCustomerIdAndLogSession = i6 % 128;
            if (i6 % 2 == 0) {
                if (!str2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    AFInAppEventParameterName("custom_host", str2);
                    int i7 = setCustomerIdAndLogSession + 89;
                    setUserEmails = i7 % 128;
                    if (i7 % 2 == 0) {
                        c2 = C11626x.f28913d;
                    } else {
                        c2 = 30;
                    }
                    if (c2 != 30) {
                        int i8 = 92 / 0;
                        return;
                    }
                    return;
                }
            } else {
                str2.isEmpty();
                throw null;
            }
        }
        AFLogger.AppsFlyer2dXConversionCallback("hostName cannot be null or empty");
        int i9 = setUserEmails + 51;
        setCustomerIdAndLogSession = i9 % 128;
        int i10 = i9 % 2;
    }

    public final void setImeiData(String str) {
        char c;
        int i = setUserEmails + 19;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        C21886am.AFKeystoreWrapper().values("setImeiData", str);
        this.AppsFlyer2dXConversionCallback = str;
        int i3 = setUserEmails + 97;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 != 0) {
            c = 'E';
        } else {
            c = 3;
        }
        if (c == 'E') {
            throw null;
        }
    }

    public final void setIsUpdate(boolean z) {
        int i = setCustomerIdAndLogSession + 41;
        setUserEmails = i % 128;
        int i2 = i % 2;
        C21886am.AFKeystoreWrapper().values("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i3 = setCustomerIdAndLogSession + 33;
        setUserEmails = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = setCustomerIdAndLogSession + 89;
        setUserEmails = i % 128;
        int i2 = i % 2;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = setUserEmails + 67;
            setCustomerIdAndLogSession = i3 % 128;
            if (i3 % 2 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                z2 = true;
                C21886am.AFKeystoreWrapper().values(TelemetryTable.f26835g, String.valueOf(z2));
                AppsFlyerProperties.getInstance().set(AirshipConfigOptions.C35437b.f87191o0, logLevel.getLevel());
            }
        }
        z2 = false;
        C21886am.AFKeystoreWrapper().values(TelemetryTable.f26835g, String.valueOf(z2));
        AppsFlyerProperties.getInstance().set(AirshipConfigOptions.C35437b.f87191o0, logLevel.getLevel());
    }

    public final void setMinTimeBetweenSessions(int i) {
        int i2 = setUserEmails + 95;
        setCustomerIdAndLogSession = i2 % 128;
        boolean z = false;
        if ((i2 % 2 != 0 ? '\\' : 'V') != 'V') {
            this.onResponseNative = TimeUnit.SECONDS.toMillis((long) i);
            int i3 = 37 / 0;
        } else {
            this.onResponseNative = TimeUnit.SECONDS.toMillis((long) i);
        }
        int i4 = setCustomerIdAndLogSession + 111;
        setUserEmails = i4 % 128;
        if (i4 % 2 == 0) {
            z = true;
        }
        if (z) {
            throw null;
        }
    }

    public final void setOaidData(String str) {
        boolean z;
        int i = setUserEmails + 89;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C21886am AFKeystoreWrapper2 = C21886am.AFKeystoreWrapper();
            String[] strArr = new String[0];
            strArr[1] = str;
            AFKeystoreWrapper2.values("setOaidData", strArr);
        } else {
            C21886am.AFKeystoreWrapper().values("setOaidData", str);
        }
        C22021z.AFInAppEventParameterName = str;
    }

    public final void setOneLinkCustomDomain(String... strArr) {
        boolean z;
        String str;
        int i = setCustomerIdAndLogSession + 67;
        setUserEmails = i % 128;
        if (i % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str = String.format("setOneLinkCustomDomain %s", new Object[]{Arrays.toString(strArr)});
        } else {
            Object[] objArr = new Object[0];
            objArr[1] = Arrays.toString(strArr);
            str = String.format("setOneLinkCustomDomain %s", objArr);
        }
        AFLogger.values(str);
        C21997i.AFLogger$LogLevel = strArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r1 != '*') goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r3 != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r5 = r5.toLowerCase();
        com.appsflyer.AppsFlyerProperties.getInstance().set("api_store_value", r5);
        com.appsflyer.AFLogger.AFInAppEventType("Store API set with value: ".concat(java.lang.String.valueOf(r5)), true);
        r5 = setCustomerIdAndLogSession + 119;
        setUserEmails = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setOutOfStore(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = setUserEmails
            int r0 = r0 + 33
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            r1 = 9
            if (r0 == 0) goto L_0x0011
            r0 = 25
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0024
            r0 = 82
            int r0 = r0 / r3
            r0 = 42
            if (r5 == 0) goto L_0x001f
            r1 = r0
            goto L_0x0021
        L_0x001f:
            r1 = 31
        L_0x0021:
            if (r1 == r0) goto L_0x0030
            goto L_0x002a
        L_0x0024:
            if (r5 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r3 = r2
        L_0x0028:
            if (r3 == 0) goto L_0x0030
        L_0x002a:
            java.lang.String r5 = "Cannot set setOutOfStore with null"
            com.appsflyer.AFLogger.AFInAppEventParameterName(r5)
            return
        L_0x0030:
            java.lang.String r5 = r5.toLowerCase()
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "api_store_value"
            r0.set((java.lang.String) r1, (java.lang.String) r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "Store API set with value: "
            java.lang.String r5 = r0.concat(r5)
            com.appsflyer.AFLogger.AFInAppEventType(r5, r2)
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 119
            int r0 = r5 % 128
            setUserEmails = r0
            int r5 = r5 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.setOutOfStore(java.lang.String):void");
    }

    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        char c;
        boolean z;
        String str2;
        int i = setUserEmails + 87;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        if (this.setCustomerUserId == null) {
            this.setCustomerUserId = new C21915ba();
        }
        C21915ba baVar = this.setCustomerUserId;
        if (str != null) {
            c = '\'';
        } else {
            c = 'P';
        }
        if (c == 'P' || str.isEmpty()) {
            AFLogger.AppsFlyer2dXConversionCallback("Partner ID is missing or `null`");
            return;
        }
        if (map != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = setUserEmails + 41;
            setCustomerIdAndLogSession = i3 % 128;
            if (i3 % 2 != 0) {
                map.isEmpty();
                throw null;
            } else if (!map.isEmpty()) {
                StringBuilder sb = new StringBuilder("Setting partner data for ");
                sb.append(str);
                sb.append(": ");
                sb.append(map);
                AFLogger.values(sb.toString());
                int length = new JSONObject(map).toString().length();
                if (length > 1000) {
                    AFLogger.AppsFlyer2dXConversionCallback("Partner data 1000 characters limit exceeded");
                    HashMap hashMap = new HashMap();
                    hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                    baVar.AFInAppEventType.put(str, hashMap);
                    return;
                }
                baVar.values.put(str, map);
                baVar.AFInAppEventType.remove(str);
                return;
            }
        }
        if (baVar.values.remove(str) == null) {
            str2 = "Partner data is missing or `null`";
        } else {
            str2 = "Cleared partner data for ".concat(str);
            int i4 = setUserEmails + 33;
            setCustomerIdAndLogSession = i4 % 128;
            int i5 = i4 % 2;
        }
        AFLogger.AppsFlyer2dXConversionCallback(str2);
    }

    public final void setPhoneNumber(String str) {
        int i = setCustomerIdAndLogSession + 119;
        setUserEmails = i % 128;
        int i2 = i % 2;
        this.setOaidData = C21859ae.values(str);
        int i3 = setCustomerIdAndLogSession + 7;
        setUserEmails = i3 % 128;
        if ((i3 % 2 == 0 ? C15369g.f37984j : 0) != 0) {
            int i4 = 54 / 0;
        }
    }

    public final void setPreinstallAttribution(String str, String str2, String str3) {
        char c;
        char c2;
        boolean z;
        AFLogger.values("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
                int i = setUserEmails + 47;
                setCustomerIdAndLogSession = i % 128;
                int i2 = i % 2;
            } catch (JSONException e) {
                AFLogger.AFKeystoreWrapper(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            c = 'R';
        } else {
            c = 30;
        }
        if (c != 30) {
            int i3 = setCustomerIdAndLogSession + 105;
            setUserEmails = i3 % 128;
            int i4 = i3 % 2;
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            c2 = 29;
        } else {
            c2 = '8';
        }
        if (c2 == 29) {
            int i5 = setUserEmails + 45;
            setCustomerIdAndLogSession = i5 % 128;
            if (i5 % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                jSONObject.put("af_siteid", str3);
            } else {
                jSONObject.put("af_siteid", str3);
                throw null;
            }
        }
        if (jSONObject.has("pid")) {
            AFInAppEventParameterName("preInstallName", jSONObject.toString());
        } else {
            AFLogger.AppsFlyer2dXConversionCallback("Cannot set preinstall attribution data without a media source");
        }
    }

    public final void setResolveDeepLinkURLs(String... strArr) {
        boolean z;
        String format;
        char c;
        int i = setCustomerIdAndLogSession + 105;
        setUserEmails = i % 128;
        if (i % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            format = String.format("setResolveDeepLinkURLs %s", new Object[]{Arrays.toString(strArr)});
        } else {
            format = String.format("setResolveDeepLinkURLs %s", new Object[]{Arrays.toString(strArr)});
        }
        AFLogger.values(format);
        C21997i.AFInAppEventType = strArr;
        int i2 = setUserEmails + 37;
        setCustomerIdAndLogSession = i2 % 128;
        if (i2 % 2 != 0) {
            c = 21;
        } else {
            c = 17;
        }
        if (c == 21) {
            int i3 = 94 / 0;
        }
    }

    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        int i = setCustomerIdAndLogSession + 55;
        setUserEmails = i % 128;
        boolean z = i % 2 == 0;
        setSharingFilterForPartners(strArr);
        if (z) {
            int i2 = 88 / 0;
        }
        int i3 = setCustomerIdAndLogSession + 65;
        setUserEmails = i3 % 128;
        int i4 = i3 % 2;
    }

    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = setCustomerIdAndLogSession + 71;
        setUserEmails = i % 128;
        if ((i % 2 == 0 ? 5 : '1') != '1') {
            String[] strArr = new String[0];
            strArr[0] = "all";
            setSharingFilterForPartners(strArr);
            return;
        }
        setSharingFilterForPartners("all");
    }

    public final void setSharingFilterForPartners(String... strArr) {
        this.getLevel = new C22003k(strArr);
        int i = setUserEmails + 105;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
    }

    public final void setUserEmails(String... strArr) {
        int i = setUserEmails + 7;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        C21886am.AFKeystoreWrapper().values("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        int i3 = setUserEmails + 101;
        setCustomerIdAndLogSession = i3 % 128;
        if ((i3 % 2 != 0 ? 0 : '/') == 0) {
            throw null;
        }
    }

    public final void start(@NonNull Context context) {
        int i = setCustomerIdAndLogSession + 47;
        setUserEmails = i % 128;
        boolean z = i % 2 == 0;
        start(context, (String) null);
        if (z) {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r0 != 9) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r7.mkdir();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r7.exists() == false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void stop(boolean r7, android.content.Context r8) {
        /*
            r6 = this;
            int r0 = setUserEmails
            int r0 = r0 + 73
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x0022
            r6.onValidateInAppFailure = r7
            com.appsflyer.internal.C21881ai.AFKeystoreWrapper()
            java.io.File r7 = com.appsflyer.internal.C21881ai.valueOf(r8)     // Catch:{ Exception -> 0x0072 }
            boolean r0 = r7.exists()     // Catch:{ Exception -> 0x0072 }
            r2 = 68
            int r2 = r2 / r1
            if (r0 != 0) goto L_0x0039
            goto L_0x006e
        L_0x0020:
            r7 = move-exception
            throw r7
        L_0x0022:
            r6.onValidateInAppFailure = r7
            com.appsflyer.internal.C21881ai.AFKeystoreWrapper()
            java.io.File r7 = com.appsflyer.internal.C21881ai.valueOf(r8)     // Catch:{ Exception -> 0x0072 }
            boolean r0 = r7.exists()     // Catch:{ Exception -> 0x0072 }
            r2 = 9
            if (r0 != 0) goto L_0x0035
            r0 = r2
            goto L_0x0037
        L_0x0035:
            r0 = 47
        L_0x0037:
            if (r0 == r2) goto L_0x006e
        L_0x0039:
            java.io.File[] r7 = r7.listFiles()     // Catch:{ Exception -> 0x0072 }
            int r0 = r7.length     // Catch:{ Exception -> 0x0072 }
            int r2 = setUserEmails
            int r2 = r2 + 11
            int r3 = r2 % 128
            setCustomerIdAndLogSession = r3
            int r2 = r2 % 2
            r2 = r1
        L_0x0049:
            if (r2 >= r0) goto L_0x0078
            r3 = r7[r2]     // Catch:{ Exception -> 0x0072 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            java.lang.String r5 = "Found cached request"
            r4.<init>(r5)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r5 = r3.getName()     // Catch:{ Exception -> 0x0072 }
            r4.append(r5)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0072 }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r4)     // Catch:{ Exception -> 0x0072 }
            com.appsflyer.internal.o r3 = com.appsflyer.internal.C21881ai.values(r3)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r3 = r3.AFKeystoreWrapper     // Catch:{ Exception -> 0x0072 }
            com.appsflyer.internal.C21881ai.AFInAppEventParameterName(r3, r8)     // Catch:{ Exception -> 0x0072 }
            int r2 = r2 + 1
            goto L_0x0049
        L_0x006e:
            r7.mkdir()     // Catch:{ Exception -> 0x0072 }
            goto L_0x0078
        L_0x0072:
            r7 = move-exception
            java.lang.String r0 = "Could not cache request"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0, r7)
        L_0x0078:
            boolean r7 = r6.onValidateInAppFailure
            if (r7 == 0) goto L_0x007e
            r7 = 1
            goto L_0x007f
        L_0x007e:
            r7 = r1
        L_0x007f:
            if (r7 == 0) goto L_0x0095
            int r7 = setCustomerIdAndLogSession
            int r7 = r7 + 71
            int r0 = r7 % 128
            setUserEmails = r0
            int r7 = r7 % 2
            java.lang.String r0 = "is_stop_tracking_used"
            values((android.content.Context) r8, (java.lang.String) r0)
            if (r7 != 0) goto L_0x0095
            r7 = 69
            int r7 = r7 / r1
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.stop(boolean, android.content.Context):void");
    }

    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        boolean z = true;
        int i = setUserEmails + 1;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 == 0) {
            z = false;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (z) {
            subscribeForDeepLink(deepLinkListener, timeUnit.toMillis(3));
            int i2 = 62 / 0;
        } else {
            subscribeForDeepLink(deepLinkListener, timeUnit.toMillis(3));
        }
        int i3 = setCustomerIdAndLogSession + 59;
        setUserEmails = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void unregisterConversionListener() {
        boolean z;
        int i = setUserEmails + 65;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C21886am.AFKeystoreWrapper().values("unregisterConversionListener", new String[0]);
        } else {
            C21886am.AFKeystoreWrapper().values("unregisterConversionListener", new String[0]);
        }
        AFKeystoreWrapper = null;
    }

    public final void updateServerUninstallToken(Context context, String str) {
        new C21935bt(context).values(str);
        int i = setCustomerIdAndLogSession + 23;
        setUserEmails = i % 128;
        int i2 = i % 2;
    }

    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String str6;
        Context context2 = context;
        String str7 = str3;
        String str8 = str4;
        String str9 = str5;
        C21886am AFKeystoreWrapper2 = C21886am.AFKeystoreWrapper();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str7;
        strArr[3] = str8;
        strArr[4] = str9;
        if (map == null) {
            str6 = "";
        } else {
            str6 = map.toString();
        }
        strArr[5] = str6;
        AFKeystoreWrapper2.values("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str8);
            sb.append(" ");
            sb.append(str9);
            AFLogger.AFKeystoreWrapper(sb.toString());
        }
        if (str == null || str8 == null || str2 == null || str9 == null || str7 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFInAppEventType;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        if (context2 instanceof Activity) {
            ((Activity) context2).getIntent();
        }
        new Thread(new C21857ad(applicationContext, devKey, str, str2, str3, str4, str5, map)).start();
    }

    public final void waitForCustomerUserId(boolean z) {
        int i = setCustomerIdAndLogSession + 51;
        setUserEmails = i % 128;
        if (i % 2 == 0) {
        }
        AFLogger.AFInAppEventType("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
    }

    public static /* synthetic */ void AFInAppEventParameterName(C21868ah ahVar, C21995g gVar) throws IOException {
        int i = setUserEmails + 3;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        ahVar.AFInAppEventParameterName(gVar);
        int i3 = setUserEmails + 33;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ C21967ct[] AFInAppEventType(C21868ah ahVar) {
        int i = setUserEmails + 111;
        int i2 = i % 128;
        setCustomerIdAndLogSession = i2;
        int i3 = i % 2;
        C21967ct[] ctVarArr = ahVar.setAndroidIdData;
        int i4 = i2 + 99;
        setUserEmails = i4 % 128;
        int i5 = i4 % 2;
        return ctVarArr;
    }

    public static /* synthetic */ void AFKeystoreWrapper(C21868ah ahVar, C21995g gVar) {
        int i = setCustomerIdAndLogSession + 17;
        setUserEmails = i % 128;
        boolean z = i % 2 != 0;
        ahVar.AFKeystoreWrapper(gVar);
        if (z) {
            int i2 = setCustomerIdAndLogSession + 57;
            setUserEmails = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        throw null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private static void AFLogger$LogLevel(android.content.Context r4) {
        /*
            boolean r0 = com.appsflyer.internal.C21845aa.AFInAppEventType()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "OPPO device found"
            com.appsflyer.AFLogger.AFInAppEventType((java.lang.String) r0)
            r0 = 23
            goto L_0x0010
        L_0x000e:
            r0 = 18
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x00b7
            java.lang.String r0 = "keyPropDisableAFKeystore"
            r2 = 1
            boolean r0 = AFInAppEventParameterName((java.lang.String) r0, (boolean) r2)
            if (r0 != 0) goto L_0x00b7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "OS SDK is="
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = "; use KeyStore"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.AFInAppEventType((java.lang.String) r0)
            com.appsflyer.AFKeystoreWrapper r0 = new com.appsflyer.AFKeystoreWrapper
            r0.<init>(r4)
            boolean r1 = r0.AFInAppEventParameterName()
            if (r1 != 0) goto L_0x0054
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            java.lang.String r4 = com.appsflyer.internal.C21885al.AFKeystoreWrapper(r1)
            r0.values = r4
            r4 = 0
            r0.AFInAppEventType = r4
            java.lang.String r4 = r0.AFKeystoreWrapper()
            r0.values(r4)
            goto L_0x009d
        L_0x0054:
            java.lang.String r4 = r0.AFKeystoreWrapper()
            java.lang.Object r1 = r0.valueOf
            monitor-enter(r1)
            int r3 = r0.AFInAppEventType     // Catch:{ all -> 0x00b4 }
            int r3 = r3 + r2
            r0.AFInAppEventType = r3     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = "Deleting key with alias: "
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00b4 }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.Object r2 = r0.valueOf     // Catch:{ KeyStoreException -> 0x007a }
            monitor-enter(r2)     // Catch:{ KeyStoreException -> 0x007a }
            java.security.KeyStore r3 = r0.AFKeystoreWrapper     // Catch:{ all -> 0x0077 }
            r3.deleteEntry(r4)     // Catch:{ all -> 0x0077 }
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            goto L_0x0095
        L_0x0077:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ KeyStoreException -> 0x007a }
            throw r4     // Catch:{ KeyStoreException -> 0x007a }
        L_0x007a:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "Exception "
            r2.<init>(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x00b4 }
            r2.append(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = " occurred"
            r2.append(r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b4 }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r2, r4)     // Catch:{ all -> 0x00b4 }
        L_0x0095:
            monitor-exit(r1)     // Catch:{ all -> 0x00b4 }
            java.lang.String r4 = r0.AFKeystoreWrapper()
            r0.values(r4)
        L_0x009d:
            java.lang.String r4 = "KSAppsFlyerId"
            java.lang.String r1 = r0.valueOf()
            AFInAppEventParameterName((java.lang.String) r4, (java.lang.String) r1)
            java.lang.String r4 = "KSAppsFlyerRICounter"
            int r0 = r0.AFInAppEventType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            AFInAppEventParameterName((java.lang.String) r4, (java.lang.String) r0)
            return
        L_0x00b4:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L_0x00b7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "OS SDK is="
            r4.<init>(r0)
            r4.append(r1)
            java.lang.String r0 = "; no KeyStore usage"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.appsflyer.AFLogger.AFInAppEventType((java.lang.String) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.AFLogger$LogLevel(android.content.Context):void");
    }

    private static String AppsFlyer2dXConversionCallback() {
        String str;
        int i = setUserEmails + 77;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 != 0)) {
            str = valueOf("appid");
        } else {
            str = valueOf("appid");
            int i2 = 45 / 0;
        }
        int i3 = setUserEmails + 7;
        setCustomerIdAndLogSession = i3 % 128;
        if ((i3 % 2 != 0 ? 'D' : C11626x.f28914e) != 'D') {
            return str;
        }
        int i4 = 25 / 0;
        return str;
    }

    private static void getLevel(Context context) {
        try {
            if (((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0 ? ';' : '2') != '2') {
                if ((context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0 ? C15369g.f37990p : 28) != 28) {
                    int i = setUserEmails + 7;
                    setCustomerIdAndLogSession = i % 128;
                    if ((i % 2 != 0 ? '.' : 22) != '.') {
                        AFLogger.AFInAppEventType("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    } else {
                        AFLogger.AFInAppEventType("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    }
                } else {
                    AFLogger.AFInAppEventParameterName("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                }
            }
            int i2 = setUserEmails + 9;
            setCustomerIdAndLogSession = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("checkBackupRules Exception: ");
            sb.append(e.toString());
            AFLogger.AFInAppEventType(sb.toString());
        }
    }

    private String onInstallConversionDataLoadedNative(Context context) {
        String str;
        int i;
        int i2 = setUserEmails + 109;
        setCustomerIdAndLogSession = i2 % 128;
        if (i2 % 2 == 0) {
            SharedPreferences valueOf2 = valueOf(context);
            String valueOf3 = valueOf("preInstallName");
            boolean z = false;
            if (valueOf3 != null) {
                int i3 = setCustomerIdAndLogSession + 19;
                setUserEmails = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 75 / 0;
                }
                return valueOf3;
            }
            if (valueOf2.contains("preInstallName")) {
                int i5 = setCustomerIdAndLogSession + 95;
                setUserEmails = i5 % 128;
                if (i5 % 2 == 0) {
                    z = true;
                }
                if (!z) {
                    str = valueOf2.getString("preInstallName", (String) null);
                } else {
                    valueOf2.getString("preInstallName", (String) null);
                    throw null;
                }
            } else {
                if (AFInAppEventParameterName(context)) {
                    valueOf3 = onInstallConversionFailureNative(context);
                    if (valueOf3 != null) {
                        z = true;
                    }
                    if (!z) {
                        valueOf3 = AFKeystoreWrapper(context, "AF_PRE_INSTALL_NAME");
                        i = setCustomerIdAndLogSession + 71;
                    } else {
                        i = setCustomerIdAndLogSession + 59;
                    }
                    setUserEmails = i % 128;
                    int i6 = i % 2;
                }
                if (valueOf3 != null) {
                    int i7 = setCustomerIdAndLogSession + 83;
                    setUserEmails = i7 % 128;
                    if (i7 % 2 != 0) {
                        AFKeystoreWrapper(context, "preInstallName", valueOf3);
                    } else {
                        AFKeystoreWrapper(context, "preInstallName", valueOf3);
                        throw null;
                    }
                }
                str = valueOf3;
            }
            if ((str != null ? '2' : '?') == '2') {
                AFInAppEventParameterName("preInstallName", str);
            }
            return str;
        }
        valueOf(context);
        valueOf("preInstallName");
        throw null;
    }

    public static /* synthetic */ ScheduledExecutorService valueOf(C21868ah ahVar, ScheduledExecutorService scheduledExecutorService) {
        int i = setUserEmails;
        int i2 = i + 63;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        ahVar.onAttributionFailure = scheduledExecutorService;
        int i4 = i + 37;
        setCustomerIdAndLogSession = i4 % 128;
        int i5 = i4 % 2;
        return scheduledExecutorService;
    }

    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        int i;
        String str2;
        int i2 = setCustomerIdAndLogSession + 121;
        setUserEmails = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        } else if (this.AppsFlyerInAppPurchaseValidatorListener) {
            return this;
        } else {
            this.AppsFlyerInAppPurchaseValidatorListener = true;
            AppsFlyerProperties.getInstance().setDevKey(str);
            C21884ak.values(str);
            if (context != null) {
                this.onPause = (Application) context.getApplicationContext();
                this.waitForCustomerUserId.AFInAppEventType = context.getApplicationContext();
                AFInAppEventType().init().values = System.currentTimeMillis();
                C21938bv values2 = AFInAppEventType().values();
                values2.valueOf.execute(new Runnable((C21930bo) null) {
                    public final void run(
/*
Method generation error in method: com.appsflyer.internal.bv.1.run():void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.bv.1.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
                final C21972cv cvVar = new C21972cv(new Runnable() {
                    public final void run() {
                        if (C22004m.AFInAppEventType == null) {
                            C22004m.AFInAppEventType = new C22004m();
                        }
                        C21868ah.AFKeystoreWrapper(C22004m.AFInAppEventType.values(), new Runnable() {
                            public final void run() {
                                try {
                                    C21953cg cgVar = new C21953cg();
                                    Application valueOf2 = C21868ah.valueOf(C21868ah.this);
                                    if (valueOf2 != null) {
                                        cgVar.AFInAppEventType = (Application) valueOf2.getApplicationContext();
                                    }
                                    C21868ah ahVar = C21868ah.this;
                                    if (C21868ah.AFInAppEventParameterName(ahVar, (C21995g) cgVar, C21868ah.valueOf((Context) C21868ah.valueOf(ahVar)))) {
                                        C21868ah.AFKeystoreWrapper(C21868ah.this, (C21995g) cgVar);
                                    }
                                } catch (Throwable th) {
                                    AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                                }
                            }
                        }, 0, TimeUnit.MILLISECONDS);
                    }
                });
                C218734 r5 = new Runnable() {
                    public final void run() {
                        SharedPreferences valueOf = C21868ah.valueOf((Context) C21868ah.valueOf(C21868ah.this));
                        boolean z = false;
                        int valueOf2 = C21868ah.this.valueOf(valueOf, false);
                        boolean z2 = valueOf.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false);
                        if (cvVar.values == C21967ct.C21969c.NOT_STARTED) {
                            z = true;
                        }
                        if (valueOf2 != 1) {
                            return;
                        }
                        if (z || z2) {
                            C21868ah ahVar = C21868ah.this;
                            C21953cg cgVar = new C21953cg();
                            Application valueOf3 = C21868ah.valueOf(C21868ah.this);
                            if (valueOf3 != null) {
                                cgVar.AFInAppEventType = (Application) valueOf3.getApplicationContext();
                            }
                            C21868ah.AFKeystoreWrapper(ahVar, (C21995g) cgVar);
                        }
                    }
                };
                C21967ct[] ctVarArr = {cvVar, new C21965cs(r5), new C21970cu(r5)};
                this.setAndroidIdData = ctVarArr;
                int i3 = setCustomerIdAndLogSession + 101;
                setUserEmails = i3 % 128;
                int i4 = i3 % 2;
                for (C21967ct AFInAppEventParameterName2 : ctVarArr) {
                    AFInAppEventParameterName2.AFInAppEventParameterName(this.onPause);
                }
                this.setDebugLog = AFInAppEventType(context);
                C21916bb.AFInAppEventType = this.onPause;
                if (valueOf(valueOf(context), false) == 0 && Build.VERSION.SDK_INT >= 29) {
                    C21974cw cwVar = new C21974cw(context);
                    this.getOutOfStore = cwVar;
                    new Thread(cwVar.AFInAppEventType).start();
                }
                i = setUserEmails + 115;
            } else {
                AFLogger.AppsFlyer2dXConversionCallback("context is null, Google Install Referrer will be not initialized");
                i = setUserEmails + 57;
            }
            setCustomerIdAndLogSession = i % 128;
            int i5 = i % 2;
            C21886am AFKeystoreWrapper2 = C21886am.AFKeystoreWrapper();
            String[] strArr = new String[2];
            strArr[0] = str;
            if (appsFlyerConversionListener == null) {
                int i6 = setCustomerIdAndLogSession + 119;
                int i7 = i6 % 128;
                setUserEmails = i7;
                if (!(i6 % 2 == 0)) {
                    int i8 = i7 + 99;
                    setCustomerIdAndLogSession = i8 % 128;
                    int i9 = i8 % 2;
                    str2 = "null";
                } else {
                    throw null;
                }
            } else {
                str2 = "conversionDataListener";
            }
            strArr[1] = str2;
            AFKeystoreWrapper2.values("init", strArr);
            AFLogger.valueOf(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{"6.5.2", AFInAppEventParameterName}));
            AFKeystoreWrapper = appsFlyerConversionListener;
            return this;
        }
    }

    public final void start(@NonNull Context context, String str) {
        int i = setCustomerIdAndLogSession + 65;
        setUserEmails = i % 128;
        boolean z = true;
        boolean z2 = i % 2 == 0;
        start(context, str, (AppsFlyerRequestListener) null);
        if (z2) {
            int i2 = 63 / 0;
        }
        int i3 = setUserEmails + 115;
        setCustomerIdAndLogSession = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (!z) {
            throw null;
        }
    }

    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j) {
        int i = setCustomerIdAndLogSession + 69;
        setUserEmails = i % 128;
        if ((i % 2 == 0 ? 7 : '@') != 7) {
            C21997i.AFKeystoreWrapper().AFInAppEventParameterName = deepLinkListener;
            C21891ao.onAttributionFailureNative = j;
            return;
        }
        C21997i.AFKeystoreWrapper().AFInAppEventParameterName = deepLinkListener;
        C21891ao.onAttributionFailureNative = j;
        throw null;
    }

    public final void values(Context context, Intent intent) {
        int i = setCustomerIdAndLogSession + 125;
        setUserEmails = i % 128;
        boolean z = false;
        if (!(i % 2 == 0)) {
            if (intent.getStringExtra("appsflyer_preinstall") == null) {
                z = true;
            }
            if (!z) {
                AFInAppEventType(intent.getStringExtra("appsflyer_preinstall"));
                int i2 = setUserEmails + 113;
                setCustomerIdAndLogSession = i2 % 128;
                int i3 = i2 % 2;
            }
            AFLogger.AFKeystoreWrapper("****** onReceive called *******");
            AppsFlyerProperties.getInstance();
            String stringExtra = intent.getStringExtra(C35557k.f87781a);
            AFLogger.AFKeystoreWrapper("Play store referrer: ".concat(String.valueOf(stringExtra)));
            if (stringExtra != null) {
                int i4 = setUserEmails + 43;
                setCustomerIdAndLogSession = i4 % 128;
                int i5 = i4 % 2;
                AFKeystoreWrapper(context, C35557k.f87781a, stringExtra);
                AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
                instance.set("AF_REFERRER", stringExtra);
                instance.valueOf = stringExtra;
                if ((AppsFlyerProperties.getInstance().AFKeystoreWrapper() ? ')' : '^') != '^') {
                    int i6 = setUserEmails + 83;
                    setCustomerIdAndLogSession = i6 % 128;
                    int i7 = i6 % 2;
                    AFLogger.AFKeystoreWrapper("onReceive: isLaunchCalled");
                    valueOf(context, C21941bx.onReceive);
                    AFInAppEventParameterName(context, stringExtra);
                    return;
                }
                return;
            }
            return;
        }
        intent.getStringExtra("appsflyer_preinstall");
        throw null;
    }

    public static /* synthetic */ boolean AFInAppEventParameterName(C21868ah ahVar, C21995g gVar, SharedPreferences sharedPreferences) {
        int i = setCustomerIdAndLogSession + 37;
        setUserEmails = i % 128;
        if (!(i % 2 == 0)) {
            return ahVar.AFInAppEventType(gVar, sharedPreferences);
        }
        ahVar.AFInAppEventType(gVar, sharedPreferences);
        throw null;
    }

    private static void AFKeystoreWrapper(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (keys2.hasNext()) {
                int i2 = setUserEmails + 5;
                setCustomerIdAndLogSession = i2 % 128;
                int i3 = i2 % 2;
                if (str != null) {
                    break loop2;
                }
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i4 = setUserEmails + 83;
                    setCustomerIdAndLogSession = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 0;
                    while (true) {
                        if (i6 < jSONArray2.length()) {
                            if (jSONArray2.getLong(i6) == ((Long) arrayList.get(0)).longValue()) {
                                break;
                            }
                            int i7 = setCustomerIdAndLogSession + 25;
                            setUserEmails = i7 % 128;
                            int i8 = i7 % 2;
                            if (jSONArray2.getLong(i6) == ((Long) arrayList.get(1)).longValue()) {
                                break;
                            }
                            int i9 = setUserEmails + 83;
                            setCustomerIdAndLogSession = i9 % 128;
                            if (i9 % 2 != 0) {
                                if (jSONArray2.getLong(i6) == ((Long) arrayList.get(arrayList.size() + 0)).longValue()) {
                                    break;
                                }
                            } else if (jSONArray2.getLong(i6) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i6++;
                            str = next;
                        } else {
                            break;
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
        }
        if (str != null) {
            int i10 = setCustomerIdAndLogSession + 55;
            setUserEmails = i10 % 128;
            int i11 = i10 % 2;
            jSONObject.remove(str);
        }
    }

    @Nullable
    private static Map<String, Object> AppsFlyer2dXConversionCallback(Context context) {
        Location AFKeystoreWrapper2 = C22011v.C22012c.valueOf.AFKeystoreWrapper(context);
        HashMap hashMap = new HashMap(3);
        if ((AFKeystoreWrapper2 != null ? '1' : 20) != 20) {
            int i = setCustomerIdAndLogSession + 1;
            setUserEmails = i % 128;
            int i2 = i % 2;
            hashMap.put(C35560b.f87803V0, String.valueOf(AFKeystoreWrapper2.getLatitude()));
            hashMap.put("lon", String.valueOf(AFKeystoreWrapper2.getLongitude()));
            hashMap.put("ts", String.valueOf(AFKeystoreWrapper2.getTime()));
            int i3 = setCustomerIdAndLogSession + 39;
            setUserEmails = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = setCustomerIdAndLogSession + 71;
        setUserEmails = i5 % 128;
        int i6 = i5 % 2;
        return hashMap;
    }

    public static C21868ah valueOf() {
        int i = setCustomerIdAndLogSession + 113;
        int i2 = i % 128;
        setUserEmails = i2;
        int i3 = i % 2;
        C21868ah ahVar = onAppOpenAttribution;
        int i4 = i2 + 63;
        setCustomerIdAndLogSession = i4 % 128;
        int i5 = i4 % 2;
        return ahVar;
    }

    public final C21918bd AFInAppEventType() {
        int i = setCustomerIdAndLogSession + 5;
        setUserEmails = i % 128;
        if (!(i % 2 == 0)) {
            return this.waitForCustomerUserId;
        }
        int i2 = 48 / 0;
        return this.waitForCustomerUserId;
    }

    public final void start(@NonNull Context context, final String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        int i = setUserEmails + 75;
        setCustomerIdAndLogSession = i % 128;
        boolean z = false;
        if (!(i % 2 == 0)) {
            int i2 = 53 / 0;
            if (C21860af.valueOf != null) {
                return;
            }
        } else if (C21860af.valueOf != null) {
            return;
        }
        if (!this.AppsFlyerInAppPurchaseValidatorListener) {
            AFLogger.AppsFlyer2dXConversionCallback("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                int i3 = setUserEmails + 115;
                setCustomerIdAndLogSession = i3 % 128;
                int i4 = i3 % 2;
                if ((appsFlyerRequestListener != null ? '7' : '%') == '7') {
                    appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, C21917bc.AFInAppEventType);
                    int i5 = setCustomerIdAndLogSession + 117;
                    setUserEmails = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                return;
            }
        }
        this.waitForCustomerUserId.AFInAppEventType = context.getApplicationContext();
        final C21952cf init2 = AFInAppEventType().init();
        init2.valueOf(C22003k.AFInAppEventParameterName(context));
        this.onPause = (Application) context.getApplicationContext();
        C21886am.AFKeystoreWrapper().values("start", str);
        String str2 = AFInAppEventParameterName;
        AFLogger.AFKeystoreWrapper(String.format("Starting AppsFlyer: (v%s.%s)", new Object[]{"6.5.2", str2}));
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        AFLogger.AFKeystoreWrapper(sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(this.onPause.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            AppsFlyerProperties.getInstance().setDevKey(str);
            C21884ak.values(str);
        } else {
            if (!TextUtils.isEmpty(AppsFlyerProperties.getInstance().getDevKey())) {
                z = true;
            }
            if (!z) {
                AFLogger.AppsFlyer2dXConversionCallback("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, C21917bc.AFInAppEventType);
                    return;
                }
                return;
            }
        }
        C21938bv values2 = AFInAppEventType().values();
        values2.valueOf.execute(new Runnable((C21930bo) null) {
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.bv.1.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                */
            /*  JADX ERROR: Method generation error: Method args not loaded: com.appsflyer.internal.bv.1.run():void, class status: UNLOADED
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.bv.1.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                */
            public final void run(
/*
Method generation error in method: com.appsflyer.internal.bv.1.run():void, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.bv.1.run():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
        getLevel(this.onPause.getBaseContext());
        if (this.getSdkVersion) {
            init(this.onPause.getApplicationContext());
        }
        C21860af.AFKeystoreWrapper(context, new C21860af.C21866d() {
            public final void AFInAppEventParameterName(Activity activity) {
                init2.AFInAppEventType();
                C21938bv values2 = C21868ah.this.AFInAppEventType().values();
                values2.valueOf.execute(new Runnable((C21930bo) null) {
                    /*  JADX ERROR: Method generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.bv.1.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: Method args not loaded: com.appsflyer.internal.bv.1.run():void, class status: UNLOADED
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.bv.1.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    public final void run(
/*
Method generation error in method: com.appsflyer.internal.bv.1.run():void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.bv.1.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
                int valueOf = C21868ah.this.valueOf(C21868ah.valueOf((Context) activity), false);
                AFLogger.AFKeystoreWrapper("onBecameForeground");
                if (valueOf < 2) {
                    C21850ac AFInAppEventType2 = C21850ac.AFInAppEventType((Context) activity);
                    AFInAppEventType2.AFInAppEventParameterName.post(AFInAppEventType2.init);
                    AFInAppEventType2.AFInAppEventParameterName.post(AFInAppEventType2.AFKeystoreWrapper);
                }
                C21956cj cjVar = new C21956cj();
                C21997i.AFKeystoreWrapper().AFKeystoreWrapper(cjVar.AFKeystoreWrapper(), init2, activity.getIntent(), C21868ah.this.AFInAppEventType().AFKeystoreWrapper(), activity.getApplication());
                C21868ah ahVar = C21868ah.this;
                cjVar.AFInAppEventType = (Application) activity.getApplicationContext();
                cjVar.AFLogger$LogLevel = str;
                cjVar.AFInAppEventParameterName = appsFlyerRequestListener;
                ahVar.AFKeystoreWrapper((C21995g) cjVar, activity);
            }

            public final void AFInAppEventParameterName(Context context) {
                AFLogger.AFKeystoreWrapper("onBecameBackground");
                C21952cf cfVar = init2;
                long currentTimeMillis = System.currentTimeMillis();
                long j = cfVar.AFVersionDeclaration;
                if (j != 0) {
                    long j2 = currentTimeMillis - j;
                    if (j2 > 0 && j2 < 1000) {
                        j2 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
                    cfVar.onInstallConversionDataLoadedNative = seconds;
                    cfVar.valueOf.valueOf("prev_session_dur", seconds);
                } else {
                    AFLogger.AFKeystoreWrapper("Metrics: fg ts is missing");
                }
                AFLogger.AFKeystoreWrapper("callStatsBackground background call");
                C21868ah.this.AFInAppEventType((WeakReference<Context>) new WeakReference(context));
                C21886am AFKeystoreWrapper2 = C21886am.AFKeystoreWrapper();
                if (AFKeystoreWrapper2.getLevel()) {
                    AFKeystoreWrapper2.valueOf();
                    if (context != null && !AppsFlyerLib.getInstance().isStopped()) {
                        AFKeystoreWrapper2.valueOf(context.getPackageName(), context.getPackageManager());
                    }
                    AFKeystoreWrapper2.values();
                } else {
                    AFLogger.values("RD status is OFF");
                }
                if (C22004m.AFInAppEventType == null) {
                    C22004m.AFInAppEventType = new C22004m();
                }
                C22004m mVar = C22004m.AFInAppEventType;
                try {
                    C22004m.AFKeystoreWrapper(mVar.values);
                    Executor executor = mVar.AFInAppEventParameterName;
                    if (executor instanceof ThreadPoolExecutor) {
                        C22004m.AFKeystoreWrapper((ThreadPoolExecutor) executor);
                    }
                } catch (Throwable th) {
                    AFLogger.AFKeystoreWrapper("failed to stop Executors", th);
                }
                C21850ac AFInAppEventType2 = C21850ac.AFInAppEventType(context);
                AFInAppEventType2.AFInAppEventParameterName.post(AFInAppEventType2.init);
            }
        }, this.enableLocationCollection);
        int i7 = setCustomerIdAndLogSession + 19;
        setUserEmails = i7 % 128;
        int i8 = i7 % 2;
    }

    private static void AFInAppEventParameterName(String str, String str2) {
        int i = setUserEmails + 113;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i3 = setCustomerIdAndLogSession + 25;
        setUserEmails = i3 % 128;
        int i4 = i3 % 2;
    }

    @SuppressLint({"CommitPrefEdits"})
    private static void valueOf(SharedPreferences.Editor editor) {
        int i = setUserEmails + 41;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        editor.apply();
        int i3 = setCustomerIdAndLogSession + 7;
        setUserEmails = i3 % 128;
        if (!(i3 % 2 != 0)) {
            throw null;
        }
    }

    public final void AFInAppEventType(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        AFLogger.values("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = valueOf(context).getString("extraReferrers", (String) null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.has(str)) {
                    jSONArray2 = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray2 = new JSONArray();
                }
                JSONObject jSONObject3 = jSONObject2;
                jSONArray = jSONArray2;
                jSONObject = jSONObject3;
            }
            if ((((long) jSONArray.length()) < 5 ? ' ' : 'J') == ' ') {
                jSONArray.put(currentTimeMillis);
            }
            if (!(((long) jSONObject.length()) < 4)) {
                int i = setCustomerIdAndLogSession + 79;
                setUserEmails = i % 128;
                int i2 = i % 2;
                AFKeystoreWrapper(jSONObject);
                int i3 = setUserEmails + 73;
                setCustomerIdAndLogSession = i3 % 128;
                int i4 = i3 % 2;
            }
            jSONObject.put(str, jSONArray.toString());
            AFKeystoreWrapper(context, "extraReferrers", jSONObject.toString());
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.AFKeystoreWrapper(sb.toString(), th);
        }
    }

    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        C21886am.AFKeystoreWrapper().values("setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        int i = 0;
        while (true) {
            if ((i < length ? 'R' : '%') != '%') {
                String str2 = strArr[i];
                if (C218756.values[emailsCryptType.ordinal()] != 2) {
                    arrayList2.add(C21859ae.values(str2));
                    int i2 = setCustomerIdAndLogSession + 51;
                    setUserEmails = i2 % 128;
                    int i3 = i2 % 2;
                    str = "sha256_el_arr";
                } else {
                    arrayList2.add(str2);
                    str = "plain_el_arr";
                }
                i++;
            } else {
                hashMap.put(str, arrayList2);
                AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
                int i4 = setUserEmails + 83;
                setCustomerIdAndLogSession = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
    }

    private static boolean AFInAppEventParameterName(String str, boolean z) {
        int i = setCustomerIdAndLogSession + 63;
        setUserEmails = i % 128;
        int i2 = i % 2;
        boolean z2 = AppsFlyerProperties.getInstance().getBoolean(str, z);
        int i3 = setCustomerIdAndLogSession + 11;
        setUserEmails = i3 % 128;
        int i4 = i3 % 2;
        return z2;
    }

    public final void valueOf(Context context, String str, long j) {
        int i = setCustomerIdAndLogSession + 101;
        setUserEmails = i % 128;
        char c = i % 2 == 0 ? (char) 18 : 27;
        AFInAppEventType(valueOf(context), str, j);
        if (c == 18) {
            throw null;
        }
    }

    private void AFInAppEventParameterName(Context context, String str, Map<String, Object> map) {
        Activity activity;
        C21958cl clVar = new C21958cl();
        if (context != null) {
            int i = setCustomerIdAndLogSession + 107;
            setUserEmails = i % 128;
            if (i % 2 == 0) {
                clVar.AFInAppEventType = (Application) context.getApplicationContext();
                int i2 = 87 / 0;
            } else {
                clVar.AFInAppEventType = (Application) context.getApplicationContext();
            }
        }
        clVar.getLevel = str;
        clVar.values = map;
        if ((context instanceof Activity ? C15369g.f37980f : '%') != '%') {
            int i3 = setCustomerIdAndLogSession + 73;
            setUserEmails = i3 % 128;
            if ((i3 % 2 == 0 ? C15369g.f37988n : 24) != 24) {
                activity = (Activity) context;
                int i4 = 1 / 0;
            } else {
                activity = (Activity) context;
            }
        } else {
            activity = null;
        }
        AFKeystoreWrapper((C21995g) clVar, activity);
    }

    private static String valueOf(String str) {
        int i = setCustomerIdAndLogSession + 83;
        setUserEmails = i % 128;
        if ((i % 2 == 0 ? '6' : 17) != '6') {
            String string = AppsFlyerProperties.getInstance().getString(str);
            int i2 = setUserEmails + 27;
            setCustomerIdAndLogSession = i2 % 128;
            if ((i2 % 2 != 0 ? (char) 3 : 4) == 4) {
                return string;
            }
            throw null;
        }
        AppsFlyerProperties.getInstance().getString(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        if ((r0.valueOf() ? 24 : '0') != 24) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r1 != true) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void valueOf(android.content.Context r6, com.appsflyer.internal.C21941bx r7) {
        /*
            r5 = this;
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 89
            int r1 = r0 % 128
            setUserEmails = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            if (r0 == r2) goto L_0x0035
            com.appsflyer.internal.be r0 = r5.waitForCustomerUserId
            android.content.Context r3 = r6.getApplicationContext()
            r0.AFInAppEventType = r3
            com.appsflyer.internal.bd r0 = r5.AFInAppEventType()
            com.appsflyer.internal.cf r0 = r0.init()
            com.appsflyer.internal.cb r6 = com.appsflyer.internal.C22003k.AFInAppEventParameterName(r6)
            boolean r3 = r0.valueOf()
            r4 = 21
            int r4 = r4 / r1
            if (r3 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            if (r1 == r2) goto L_0x0066
            goto L_0x0058
        L_0x0035:
            com.appsflyer.internal.be r0 = r5.waitForCustomerUserId
            android.content.Context r1 = r6.getApplicationContext()
            r0.AFInAppEventType = r1
            com.appsflyer.internal.bd r0 = r5.AFInAppEventType()
            com.appsflyer.internal.cf r0 = r0.init()
            com.appsflyer.internal.cb r6 = com.appsflyer.internal.C22003k.AFInAppEventParameterName(r6)
            boolean r1 = r0.valueOf()
            r2 = 24
            if (r1 == 0) goto L_0x0053
            r1 = r2
            goto L_0x0055
        L_0x0053:
            r1 = 48
        L_0x0055:
            if (r1 == r2) goto L_0x0058
            goto L_0x0066
        L_0x0058:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.AFInAppEventType
            java.lang.String r2 = "api_name"
            java.lang.String r7 = r7.toString()
            r1.put(r2, r7)
            r0.valueOf((com.appsflyer.internal.C21948cb) r6)
        L_0x0066:
            r0.AFInAppEventType()
            int r6 = setUserEmails
            int r6 = r6 + 125
            int r7 = r6 % 128
            setCustomerIdAndLogSession = r7
            int r6 = r6 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.valueOf(android.content.Context, com.appsflyer.internal.bx):void");
    }

    private boolean getLevel() {
        int i = setCustomerIdAndLogSession + 97;
        int i2 = i % 128;
        setUserEmails = i2;
        int i3 = i % 2;
        Map<String, Object> map = this.stop;
        if (map != null) {
            int i4 = i2 + 5;
            setCustomerIdAndLogSession = i4 % 128;
            int i5 = i4 % 2;
            return (!map.isEmpty() ? '/' : '+') == '/';
        }
    }

    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = setCustomerIdAndLogSession + 39;
        setUserEmails = i % 128;
        char c = i % 2 == 0 ? '$' : 'O';
        logEvent(context, str, map, (AppsFlyerRequestListener) null);
        if (c != 'O') {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        if (com.appsflyer.internal.C22004m.AFInAppEventType == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (com.appsflyer.internal.C22004m.AFInAppEventType == null) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventParameterName(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            com.appsflyer.internal.cd r0 = new com.appsflyer.internal.cd
            r0.<init>()
            if (r6 == 0) goto L_0x0023
            int r1 = setCustomerIdAndLogSession
            int r1 = r1 + 123
            int r2 = r1 % 128
            setUserEmails = r2
            int r1 = r1 % 2
            android.content.Context r1 = r6.getApplicationContext()
            android.app.Application r1 = (android.app.Application) r1
            r0.AFInAppEventType = r1
            int r1 = setUserEmails
            int r1 = r1 + 93
            int r2 = r1 % 128
            setCustomerIdAndLogSession = r2
            int r1 = r1 % 2
        L_0x0023:
            r0.init = r7
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L_0x002b
            r3 = r2
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            if (r3 == 0) goto L_0x002f
            goto L_0x007f
        L_0x002f:
            int r3 = setUserEmails
            int r3 = r3 + 9
            int r4 = r3 % 128
            setCustomerIdAndLogSession = r4
            int r3 = r3 % 2
            int r7 = r7.length()
            r3 = 5
            if (r7 <= r3) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r1 = r2
        L_0x0042:
            if (r1 == 0) goto L_0x007f
            android.content.SharedPreferences r6 = valueOf((android.content.Context) r6)
            boolean r6 = r5.AFInAppEventType((com.appsflyer.internal.C21995g) r0, (android.content.SharedPreferences) r6)
            if (r6 == 0) goto L_0x007f
            int r6 = setCustomerIdAndLogSession
            int r6 = r6 + 15
            int r7 = r6 % 128
            setUserEmails = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x0062
            com.appsflyer.internal.m r6 = com.appsflyer.internal.C22004m.AFInAppEventType
            r7 = 71
            int r7 = r7 / r2
            if (r6 != 0) goto L_0x006d
            goto L_0x0066
        L_0x0062:
            com.appsflyer.internal.m r6 = com.appsflyer.internal.C22004m.AFInAppEventType
            if (r6 != 0) goto L_0x006d
        L_0x0066:
            com.appsflyer.internal.m r6 = new com.appsflyer.internal.m
            r6.<init>()
            com.appsflyer.internal.C22004m.AFInAppEventType = r6
        L_0x006d:
            com.appsflyer.internal.m r6 = com.appsflyer.internal.C22004m.AFInAppEventType
            java.util.concurrent.ScheduledThreadPoolExecutor r6 = r6.values()
            com.appsflyer.internal.ah$a r7 = new com.appsflyer.internal.ah$a
            r7.<init>(r5, r0, r2)
            r0 = 5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            AFKeystoreWrapper(r6, r7, r0, r2)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.AFInAppEventParameterName(android.content.Context, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if ((com.google.android.gms.common.C40713g.m165640x().mo134208j(r4) != 0) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean AFVersionDeclaration(android.content.Context r4) {
        /*
            int r0 = setUserEmails
            int r0 = r0 + 19
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            r1 = 36
            if (r0 == 0) goto L_0x0010
            r0 = r1
            goto L_0x0012
        L_0x0010:
            r0 = 53
        L_0x0012:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0029
            com.google.android.gms.common.g r0 = com.google.android.gms.common.C40713g.m165640x()     // Catch:{ all -> 0x0046 }
            int r0 = r0.mo134208j(r4)     // Catch:{ all -> 0x0046 }
            r1 = 31
            if (r0 != 0) goto L_0x0025
            r0 = 99
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            if (r0 == r1) goto L_0x004c
            goto L_0x003b
        L_0x0029:
            com.google.android.gms.common.g r0 = com.google.android.gms.common.C40713g.m165640x()     // Catch:{ all -> 0x0046 }
            int r0 = r0.mo134208j(r4)     // Catch:{ all -> 0x0046 }
            int r1 = r3 / r3
            if (r0 != 0) goto L_0x0037
            r0 = r3
            goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            if (r0 == 0) goto L_0x003b
            goto L_0x004c
        L_0x003b:
            int r4 = setUserEmails
            int r4 = r4 + 37
            int r0 = r4 % 128
            setCustomerIdAndLogSession = r0
            int r4 = r4 % 2
            return r2
        L_0x0046:
            r0 = move-exception
            java.lang.String r1 = "WARNING:  Google play services is unavailable. "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r1, r0)
        L_0x004c:
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r0 = "com.google.android.gms"
            r4.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x0056 }
            return r2
        L_0x0056:
            r4 = move-exception
            java.lang.String r0 = "WARNING:  Google Play Services is unavailable. "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.AFVersionDeclaration(android.content.Context):boolean");
    }

    public static void values(Context context, String str) {
        int i = setCustomerIdAndLogSession + 9;
        setUserEmails = i % 128;
        int i2 = i % 2;
        SharedPreferences.Editor edit = valueOf(context).edit();
        edit.putBoolean(str, true);
        valueOf(edit);
        int i3 = setUserEmails + 125;
        setCustomerIdAndLogSession = i3 % 128;
        if ((i3 % 2 != 0 ? 11 : 'c') != 'c') {
            int i4 = 54 / 0;
        }
    }

    public static String valueOf(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i = setCustomerIdAndLogSession + 37;
        setUserEmails = i % 128;
        if ((i % 2 == 0 ? 'T' : C11626x.f28914e) != 'T') {
            return format;
        }
        int i2 = 12 / 0;
        return format;
    }

    private static void AFInAppEventType(Context context, String str, int i) {
        int i2 = setCustomerIdAndLogSession + 117;
        setUserEmails = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences.Editor edit = valueOf(context).edit();
        edit.putInt(str, i);
        valueOf(edit);
        int i4 = setCustomerIdAndLogSession + 11;
        setUserEmails = i4 % 128;
        if (!(i4 % 2 != 0)) {
            throw null;
        }
    }

    public static void AFKeystoreWrapper(Context context, String str, String str2) {
        int i = setCustomerIdAndLogSession + 63;
        setUserEmails = i % 128;
        if (!(i % 2 == 0)) {
            SharedPreferences.Editor edit = valueOf(context).edit();
            edit.putString(str, str2);
            valueOf(edit);
            return;
        }
        SharedPreferences.Editor edit2 = valueOf(context).edit();
        edit2.putString(str, str2);
        valueOf(edit2);
        throw null;
    }

    private void valueOf(C21995g gVar) {
        boolean z;
        int i = setUserEmails;
        int i2 = i + 55;
        setCustomerIdAndLogSession = i2 % 128;
        int i3 = i2 % 2;
        if ((gVar.getLevel == null ? '-' : '(') != '(') {
            z = true;
        } else {
            int i4 = i + 69;
            setCustomerIdAndLogSession = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (values()) {
            int i6 = setCustomerIdAndLogSession + 49;
            setUserEmails = i6 % 128;
            int i7 = i6 % 2;
            AFLogger.AFInAppEventType("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if ((z ? 'T' : 24) == 'T') {
            int i8 = setUserEmails + 95;
            setCustomerIdAndLogSession = i8 % 128;
            int i9 = i8 % 2;
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.AFKeystoreWrapper("Allowing multiple launches within a 5 second time window.");
            } else if (AFVersionDeclaration()) {
                AppsFlyerRequestListener appsFlyerRequestListener = gVar.AFInAppEventParameterName;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(RequestError.EVENT_TIMEOUT, C21917bc.values);
                    return;
                }
                return;
            }
            this.onConversionDataSuccess = System.currentTimeMillis();
        }
        if (C22004m.AFInAppEventType == null) {
            C22004m.AFInAppEventType = new C22004m();
        }
        AFKeystoreWrapper(C22004m.AFInAppEventType.values(), new C21878a(this, gVar, (byte) 0), 0, TimeUnit.MILLISECONDS);
    }

    private static void values(String str, boolean z) {
        int i = setUserEmails + 29;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        AppsFlyerProperties.getInstance().set(str, z);
        int i3 = setCustomerIdAndLogSession + 55;
        setUserEmails = i3 % 128;
        int i4 = i3 % 2;
    }

    public final boolean values() {
        if (AFInAppEventParameterName(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            int i = setUserEmails + 113;
            setCustomerIdAndLogSession = i % 128;
            if ((i % 2 != 0 ? '(' : C15369g.f37990p) != '(') {
                if (!(AFKeystoreWrapper() != null)) {
                    int i2 = setUserEmails + 45;
                    setCustomerIdAndLogSession = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
            } else {
                AFKeystoreWrapper();
                throw null;
            }
        }
        return false;
    }

    private static void AFInAppEventType(SharedPreferences sharedPreferences, String str, long j) {
        int i = setUserEmails + 3;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(str, j);
        valueOf(edit);
        int i3 = setUserEmails + 43;
        setCustomerIdAndLogSession = i3 % 128;
        if ((i3 % 2 != 0 ? ',' : 'F') == ',') {
            throw null;
        }
    }

    private static String values(@Nullable String str) {
        boolean z = false;
        if (str == null) {
            int i = setCustomerIdAndLogSession + 43;
            setUserEmails = i % 128;
            if (i % 2 == 0) {
                z = true;
            }
            if (!z) {
                return null;
            }
            throw null;
        } else if (!str.matches("fb\\d*?://authorize.*") || !str.contains(C13167a.f32306a)) {
            return str;
        } else {
            String AFInAppEventParameterName2 = AFInAppEventParameterName(str);
            if (AFInAppEventParameterName2.length() == 0) {
                int i2 = setCustomerIdAndLogSession + 113;
                setUserEmails = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
            ArrayList arrayList = new ArrayList();
            if (AFInAppEventParameterName2.contains("&")) {
                arrayList = new ArrayList(Arrays.asList(AFInAppEventParameterName2.split("&")));
            } else {
                arrayList.add(AFInAppEventParameterName2);
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.contains(C13167a.f32306a)) {
                    int i4 = setCustomerIdAndLogSession + 47;
                    setUserEmails = i4 % 128;
                    int i5 = i4 % 2;
                    it.remove();
                } else {
                    if ((sb.length() != 0 ? (char) 16 : 18) == 16) {
                        sb.append("&");
                    } else if (!str2.startsWith("?")) {
                        sb.append("?");
                    }
                    sb.append(str2);
                    int i6 = setUserEmails + 41;
                    setCustomerIdAndLogSession = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            return str.replace(AFInAppEventParameterName2, sb.toString());
        }
    }

    private static void AFInAppEventParameterName(Map<String, Object> map) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
        boolean z = true;
        if (string != null) {
            int i = setUserEmails + 63;
            setCustomerIdAndLogSession = i % 128;
            if (!(i % 2 != 0)) {
                map.put("onelink_id", string);
            } else {
                map.put("onelink_id", string);
                int i2 = 70 / 0;
            }
            int i3 = setUserEmails + 95;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((string2 != null ? (char) 29 : 26) == 29) {
            int i5 = setUserEmails + 25;
            setCustomerIdAndLogSession = i5 % 128;
            if (i5 % 2 == 0) {
                z = false;
            }
            map.put("onelink_ver", string2);
            if (z) {
                throw null;
            }
        }
    }

    private boolean AFInAppEventType(Context context) {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            this.updateServerUninstallToken = new ConcurrentHashMap();
            C218745 r4 = new C22015x.C22017d() {
                public final void AFInAppEventType(String str, Exception exc) {
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    C21868ah.AFInAppEventParameterName(C21868ah.this).put("error", message);
                    AFLogger.valueOf(str, (Throwable) exc);
                }

                public final void valueOf(@NonNull String str, @NonNull String str2) {
                    C21868ah.AFInAppEventParameterName(C21868ah.this).put("signedData", str);
                    C21868ah.AFInAppEventParameterName(C21868ah.this).put("signature", str2);
                    C21868ah.AFInAppEventParameterName(C21868ah.this).put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.AFKeystoreWrapper("Successfully retrieved Google LVL data.");
                }
            };
            try {
                Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                Method method = cls.getMethod("checkLicense", new Class[]{Long.TYPE, Context.class, cls2});
                C22015x.C220163 r7 = new InvocationHandler() {
                    public final java.lang.Object invoke(
/*
Method generation error in method: com.appsflyer.internal.x.3.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.x.3.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
                method.invoke((Object) null, new Object[]{Long.valueOf(currentTimeMillis), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, r7)});
                int i = setCustomerIdAndLogSession + 49;
                setUserEmails = i % 128;
                int i2 = i % 2;
            } catch (ClassNotFoundException e) {
                r4.AFInAppEventType(e.getClass().getSimpleName(), e);
            } catch (NoSuchMethodException e2) {
                r4.AFInAppEventType(e2.getClass().getSimpleName(), e2);
            } catch (IllegalAccessException e3) {
                r4.AFInAppEventType(e3.getClass().getSimpleName(), e3);
            } catch (InvocationTargetException e4) {
                r4.AFInAppEventType(e4.getClass().getSimpleName(), e4);
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static String AFKeystoreWrapper() {
        int i = setUserEmails + 1;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        String valueOf2 = valueOf(AppsFlyerProperties.APP_USER_ID);
        int i3 = setUserEmails + 49;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
        return valueOf2;
    }

    public static Map<String, Object> AFKeystoreWrapper(Map<String, Object> map) {
        int i = setUserEmails + 99;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 == 0) {
            if ((map.containsKey("meta") ? 4 : 'T') != 'T') {
                Map<String, Object> map2 = (Map) map.get("meta");
                int i2 = setCustomerIdAndLogSession + 21;
                setUserEmails = i2 % 128;
                int i3 = i2 % 2;
                return map2;
            }
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            return hashMap;
        }
        map.containsKey("meta");
        throw null;
    }

    private static String AFInAppEventParameterName(String str) {
        int indexOf = str.indexOf(63);
        if (!(indexOf == -1)) {
            return str.substring(indexOf);
        }
        int i = setUserEmails + 91;
        int i2 = i % 128;
        setCustomerIdAndLogSession = i2;
        if ((i % 2 != 0 ? 21 : 'P') == 'P') {
            int i3 = i2 + 17;
            setUserEmails = i3 % 128;
            int i4 = i3 % 2;
            return "";
        }
        throw null;
    }

    private void init(Context context) {
        Class<Context> cls = Context.class;
        this.stop = new HashMap();
        final long currentTimeMillis = System.currentTimeMillis();
        C218691 r3 = new C22007o.C22009e() {
            public final void AFInAppEventType(String str) {
                C21868ah.values(C21868ah.this).put("error", str);
            }

            public final void valueOf(String str, String str2, String str3) {
                if (str != null) {
                    AFLogger.AFKeystoreWrapper("Facebook Deferred AppLink data received: ".concat(str));
                    C21868ah.values(C21868ah.this).put("link", str);
                    if (str2 != null) {
                        C21868ah.values(C21868ah.this).put("target_url", str2);
                    }
                    if (str3 != null) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("promo_code", str3);
                        hashMap.put("deeplink_context", hashMap2);
                        C21868ah.values(C21868ah.this).put("extras", hashMap);
                    }
                } else {
                    C21868ah.values(C21868ah.this).put("link", "");
                }
                C21868ah.values(C21868ah.this).put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        };
        try {
            boolean z = false;
            Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", new Class[]{cls}).invoke((Object) null, new Object[]{context});
            Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData");
            Class<?> cls3 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls2.getMethod("fetchDeferredAppLinkData", new Class[]{cls, String.class, cls3});
            Object newProxyInstance = Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new InvocationHandler(cls2, r3) {
                private /* synthetic */ C22009e AFInAppEventType;
                private /* synthetic */ Class valueOf;

                public final java.lang.Object invoke(
/*
Method generation error in method: com.appsflyer.internal.o.1.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, dex: classes4.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.o.1.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", C16717v.C16719b.f42182e, context.getPackageName()));
            if ((TextUtils.isEmpty(string) ? '@' : '5') != '@') {
                method.invoke((Object) null, new Object[]{context, string, newProxyInstance});
                int i = setUserEmails + 59;
                setCustomerIdAndLogSession = i % 128;
                if (i % 2 != 0) {
                    z = true;
                }
                if (z) {
                    throw null;
                }
                return;
            }
            int i2 = setCustomerIdAndLogSession + 47;
            setUserEmails = i2 % 128;
            if (i2 % 2 != 0) {
                r3.AFInAppEventType("Facebook app id not defined in resources");
            } else {
                r3.AFInAppEventType("Facebook app id not defined in resources");
                throw null;
            }
        } catch (NoSuchMethodException e) {
            r3.AFInAppEventType(e.toString());
        } catch (InvocationTargetException e2) {
            r3.AFInAppEventType(e2.toString());
        } catch (ClassNotFoundException e3) {
            r3.AFInAppEventType(e3.toString());
        } catch (IllegalAccessException e4) {
            r3.AFInAppEventType(e4.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r5 = valueOf(r14);
        r6 = r2.getBoolean(com.appsflyer.AppsFlyerProperties.COLLECT_IMEI, false);
        r8 = null;
        r9 = r5.getString("imeiCached", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r6 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (android.text.TextUtils.isEmpty(r13.AppsFlyer2dXConversionCallback) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r6 == true) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (onAttributionFailureNative(r14) == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6 = (android.telephony.TelephonyManager) r14.getSystemService(androidx.autofill.C0861a.f2705e);
        r6 = (java.lang.String) r6.getClass().getMethod("getDeviceId", new java.lang.Class[0]).invoke(r6, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        if (r6 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        r10 = setCustomerIdAndLogSession + 115;
        setUserEmails = r10 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if ((r10 % 2) == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        if (r9 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        com.appsflyer.AFLogger.values("use cached IMEI: ".concat(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009b, code lost:
        if (r9 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
        com.appsflyer.AFLogger.values("use cached IMEI: ".concat(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        r9 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        r1 = new java.lang.StringBuilder("WARNING: Can't collect IMEI: other reason: ");
        r1.append(r10.getMessage());
        com.appsflyer.AFLogger.AFKeystoreWrapper(r1.toString(), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        if (r9 != null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        com.appsflyer.AFLogger.values("use cached IMEI: ".concat(r9));
        r1 = setCustomerIdAndLogSession + 61;
        setUserEmails = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d2, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d3, code lost:
        r1 = new java.lang.StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
        r1.append(r6.getMessage());
        com.appsflyer.AFLogger.AFKeystoreWrapper(r1.toString(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e9, code lost:
        r6 = r13.AppsFlyer2dXConversionCallback;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00eb, code lost:
        if (r6 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ee, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0164, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0165, code lost:
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r2.getBoolean(com.appsflyer.AppsFlyerProperties.DEVICE_TRACKING_DISABLED, true) != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r2.getBoolean(com.appsflyer.AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false) != false) goto L_0x002e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventParameterName(android.content.Context r14, java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
            r13 = this;
            java.lang.String r0 = "use cached AndroidId: "
            java.lang.String r1 = "use cached IMEI: "
            int r2 = setCustomerIdAndLogSession
            int r2 = r2 + 117
            int r3 = r2 % 128
            setUserEmails = r3
            int r2 = r2 % 2
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0014
            r2 = r3
            goto L_0x0015
        L_0x0014:
            r2 = r4
        L_0x0015:
            java.lang.String r5 = "deviceTrackingDisabled"
            if (r2 == 0) goto L_0x0024
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r6 = r2.getBoolean(r5, r3)
            if (r6 == 0) goto L_0x0034
            goto L_0x002e
        L_0x0024:
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r6 = r2.getBoolean(r5, r4)
            if (r6 == 0) goto L_0x0034
        L_0x002e:
            java.lang.String r14 = "true"
            r15.put(r5, r14)
            return
        L_0x0034:
            android.content.SharedPreferences r5 = valueOf((android.content.Context) r14)
            java.lang.String r6 = "collectIMEI"
            boolean r6 = r2.getBoolean(r6, r4)
            java.lang.String r7 = "imeiCached"
            r8 = 0
            java.lang.String r9 = r5.getString(r7, r8)
            if (r6 == 0) goto L_0x00e9
            java.lang.String r6 = r13.AppsFlyer2dXConversionCallback
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0051
            r6 = r3
            goto L_0x0052
        L_0x0051:
            r6 = r4
        L_0x0052:
            if (r6 == r3) goto L_0x0056
            goto L_0x00e9
        L_0x0056:
            boolean r6 = onAttributionFailureNative(r14)
            if (r6 == 0) goto L_0x00ee
            java.lang.String r6 = "phone"
            java.lang.Object r6 = r14.getSystemService(r6)     // Catch:{ InvocationTargetException -> 0x00bd, Exception -> 0x0099 }
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch:{ InvocationTargetException -> 0x00bd, Exception -> 0x0099 }
            java.lang.Class r10 = r6.getClass()     // Catch:{ InvocationTargetException -> 0x00bd, Exception -> 0x0099 }
            java.lang.String r11 = "getDeviceId"
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ InvocationTargetException -> 0x00bd, Exception -> 0x0099 }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ InvocationTargetException -> 0x00bd, Exception -> 0x0099 }
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ InvocationTargetException -> 0x00bd, Exception -> 0x0099 }
            java.lang.Object r6 = r10.invoke(r6, r11)     // Catch:{ InvocationTargetException -> 0x00bd, Exception -> 0x0099 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ InvocationTargetException -> 0x00bd, Exception -> 0x0099 }
            if (r6 == 0) goto L_0x008d
            int r10 = setCustomerIdAndLogSession
            int r10 = r10 + 115
            int r11 = r10 % 128
            setUserEmails = r11
            int r10 = r10 % 2
            if (r10 == 0) goto L_0x0088
            goto L_0x00ef
        L_0x0088:
            throw r8     // Catch:{ Exception -> 0x008b, all -> 0x0089 }
        L_0x0089:
            r14 = move-exception
            throw r14
        L_0x008b:
            r10 = move-exception
            goto L_0x009b
        L_0x008d:
            if (r9 == 0) goto L_0x0097
            java.lang.String r6 = r1.concat(r9)     // Catch:{ InvocationTargetException -> 0x00bd, Exception -> 0x0099 }
            com.appsflyer.AFLogger.values(r6)     // Catch:{ InvocationTargetException -> 0x00bd, Exception -> 0x0099 }
            goto L_0x00bb
        L_0x0097:
            r9 = r8
            goto L_0x00bb
        L_0x0099:
            r10 = move-exception
            r6 = r8
        L_0x009b:
            if (r9 == 0) goto L_0x00a5
            java.lang.String r1 = r1.concat(r9)
            com.appsflyer.AFLogger.values(r1)
            goto L_0x00a6
        L_0x00a5:
            r9 = r6
        L_0x00a6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "WARNING: Can't collect IMEI: other reason: "
            r1.<init>(r6)
            java.lang.String r6 = r10.getMessage()
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r1, r10)
        L_0x00bb:
            r6 = r9
            goto L_0x00ef
        L_0x00bd:
            r6 = move-exception
            if (r9 == 0) goto L_0x00d2
            java.lang.String r1 = r1.concat(r9)
            com.appsflyer.AFLogger.values(r1)
            int r1 = setCustomerIdAndLogSession
            int r1 = r1 + 61
            int r10 = r1 % 128
            setUserEmails = r10
            int r1 = r1 % 2
            goto L_0x00d3
        L_0x00d2:
            r9 = r8
        L_0x00d3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r10 = "WARNING: Can't collect IMEI because of missing permissions: "
            r1.<init>(r10)
            java.lang.String r10 = r6.getMessage()
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r1, r6)
            goto L_0x00bb
        L_0x00e9:
            java.lang.String r6 = r13.AppsFlyer2dXConversionCallback
            if (r6 == 0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r6 = r8
        L_0x00ef:
            if (r6 == 0) goto L_0x00fa
            AFKeystoreWrapper(r14, r7, r6)
            java.lang.String r1 = "imei"
            r15.put(r1, r6)
            goto L_0x00ff
        L_0x00fa:
            java.lang.String r1 = "IMEI was not collected."
            com.appsflyer.AFLogger.AFKeystoreWrapper(r1)
        L_0x00ff:
            java.lang.String r1 = "collectAndroidId"
            boolean r1 = r2.getBoolean(r1, r4)
            java.lang.String r2 = "androidIdCached"
            java.lang.String r5 = r5.getString(r2, r8)
            if (r1 == 0) goto L_0x010f
            r1 = r4
            goto L_0x0110
        L_0x010f:
            r1 = r3
        L_0x0110:
            java.lang.String r6 = "android_id"
            if (r1 == 0) goto L_0x0115
            goto L_0x017a
        L_0x0115:
            int r1 = setCustomerIdAndLogSession
            int r1 = r1 + 49
            int r7 = r1 % 128
            setUserEmails = r7
            int r1 = r1 % 2
            java.lang.String r1 = r13.AFVersionDeclaration
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x017a
            int r1 = setUserEmails
            int r1 = r1 + 101
            int r7 = r1 % 128
            setCustomerIdAndLogSession = r7
            int r1 = r1 % 2
            boolean r1 = onAttributionFailureNative(r14)
            if (r1 == 0) goto L_0x0189
            android.content.ContentResolver r1 = r14.getContentResolver()     // Catch:{ Exception -> 0x0167 }
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r6)     // Catch:{ Exception -> 0x0167 }
            if (r1 == 0) goto L_0x0143
            r8 = r1
            goto L_0x0189
        L_0x0143:
            if (r5 == 0) goto L_0x0189
            int r1 = setUserEmails
            int r1 = r1 + 119
            int r7 = r1 % 128
            setCustomerIdAndLogSession = r7
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x015a
            java.lang.String r1 = r0.concat(r5)     // Catch:{ Exception -> 0x0167 }
            com.appsflyer.AFLogger.values(r1)     // Catch:{ Exception -> 0x0167 }
            r8 = r5
            goto L_0x0189
        L_0x015a:
            java.lang.String r1 = r0.concat(r5)     // Catch:{ Exception -> 0x0167 }
            com.appsflyer.AFLogger.values(r1)     // Catch:{ Exception -> 0x0167 }
            throw r8     // Catch:{ Exception -> 0x0164, all -> 0x0162 }
        L_0x0162:
            r14 = move-exception
            throw r14
        L_0x0164:
            r1 = move-exception
            r8 = r5
            goto L_0x0168
        L_0x0167:
            r1 = move-exception
        L_0x0168:
            if (r5 == 0) goto L_0x0172
            java.lang.String r0 = r0.concat(r5)
            com.appsflyer.AFLogger.values(r0)
            r8 = r5
        L_0x0172:
            java.lang.String r0 = r1.getMessage()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0, r1)
            goto L_0x0189
        L_0x017a:
            java.lang.String r0 = r13.AFVersionDeclaration
            if (r0 == 0) goto L_0x0189
            int r1 = setCustomerIdAndLogSession
            int r1 = r1 + 117
            int r5 = r1 % 128
            setUserEmails = r5
            int r1 = r1 % 2
            r8 = r0
        L_0x0189:
            if (r8 == 0) goto L_0x018c
            goto L_0x018d
        L_0x018c:
            r4 = r3
        L_0x018d:
            if (r4 == r3) goto L_0x0196
            AFKeystoreWrapper(r14, r2, r8)
            r15.put(r6, r8)
            goto L_0x019b
        L_0x0196:
            java.lang.String r0 = "Android ID was not collected."
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
        L_0x019b:
            com.appsflyer.internal.h r14 = com.appsflyer.internal.C22021z.AFInAppEventType(r14)
            if (r14 == 0) goto L_0x01c2
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "isManual"
            java.lang.Boolean r2 = r14.AFInAppEventType
            r0.put(r1, r2)
            java.lang.String r1 = "val"
            java.lang.String r2 = r14.valueOf
            r0.put(r1, r2)
            java.lang.Boolean r14 = r14.AFInAppEventParameterName
            if (r14 == 0) goto L_0x01bd
            java.lang.String r1 = "isLat"
            r0.put(r1, r14)
        L_0x01bd:
            java.lang.String r14 = "oaid"
            r15.put(r14, r0)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.AFInAppEventParameterName(android.content.Context, java.util.Map):void");
    }

    private static String AFKeystoreWrapper(String str) {
        int i = setUserEmails + 37;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
            int i3 = setUserEmails + 71;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
            return str2;
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper(th.getMessage(), th);
            return null;
        }
    }

    @Nullable
    @VisibleForTesting
    private String AFKeystoreWrapper(Context context, String str) {
        int i = setCustomerIdAndLogSession + 9;
        int i2 = i % 128;
        setUserEmails = i2;
        if ((i % 2 == 0 ? ',' : 'Z') == 'Z') {
            if ((context == null ? '3' : '+') != '+') {
                int i3 = i2 + 117;
                setCustomerIdAndLogSession = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            this.waitForCustomerUserId.AFInAppEventType = context.getApplicationContext();
            return AFInAppEventType().valueOf().valueOf(str);
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if ((!com.appsflyer.AppsFlyerProperties.getInstance().getBoolean(com.appsflyer.AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) ? '\'' : 4) != '\'') goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (com.appsflyer.AppsFlyerProperties.getInstance().getBoolean(com.appsflyer.AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) == false) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void valueOf(java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r4 = this;
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 7
            int r1 = r0 % 128
            setUserEmails = r1
            int r0 = r0 % 2
            java.lang.String r1 = "collectAndroidIdForceByUser"
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0022
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r1, r3)
            r1 = 39
            if (r0 != 0) goto L_0x001e
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = 4
        L_0x001f:
            if (r0 == r1) goto L_0x002c
            goto L_0x003b
        L_0x0022:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 != 0) goto L_0x003b
        L_0x002c:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "collectIMEIForceByUser"
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r0 = r3
            goto L_0x003c
        L_0x003b:
            r0 = r2
        L_0x003c:
            r1 = 15
            if (r0 != 0) goto L_0x0042
            r0 = r1
            goto L_0x0044
        L_0x0042:
            r0 = 65
        L_0x0044:
            if (r0 == r1) goto L_0x0047
            goto L_0x009d
        L_0x0047:
            java.lang.String r0 = "advertiserId"
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0051
            r0 = r2
            goto L_0x0052
        L_0x0051:
            r0 = r3
        L_0x0052:
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = r4.AFVersionDeclaration     // Catch:{ Exception -> 0x0097 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r3 = r2
        L_0x005e:
            if (r3 == r2) goto L_0x006d
            java.lang.String r0 = "android_id"
            java.lang.Object r0 = r5.remove(r0)     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "validateGaidAndIMEI :: removing: android_id"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0)     // Catch:{ Exception -> 0x0097 }
        L_0x006d:
            java.lang.String r0 = r4.AppsFlyer2dXConversionCallback     // Catch:{ Exception -> 0x0097 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "imei"
            java.lang.Object r5 = r5.remove(r0)     // Catch:{ Exception -> 0x0097 }
            if (r5 == 0) goto L_0x008c
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 69
            int r0 = r5 % 128
            setUserEmails = r0
            int r5 = r5 % 2
            java.lang.String r5 = "validateGaidAndIMEI :: removing: imei"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r5)     // Catch:{ Exception -> 0x0097 }
        L_0x008c:
            int r5 = setUserEmails
            int r5 = r5 + 77
            int r0 = r5 % 128
            setCustomerIdAndLogSession = r0
            int r5 = r5 % 2
            return
        L_0x0097:
            r5 = move-exception
            java.lang.String r0 = "failed to remove IMEI or AndroidID key from params; "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0, r5)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.valueOf(java.util.Map):void");
    }

    public final void AFInAppEventType(WeakReference<Context> weakReference) {
        int i = setUserEmails + 95;
        setCustomerIdAndLogSession = i % 128;
        if ((i % 2 != 0 ? ' ' : C15369g.f37988n) == ' ') {
            weakReference.get();
            throw null;
        } else if (weakReference.get() != null) {
            AFLogger.AFKeystoreWrapper("app went to background");
            SharedPreferences valueOf2 = valueOf(weakReference.get());
            AppsFlyerProperties.getInstance().saveProperties(valueOf2);
            long j = AFInAppEventType().init().onInstallConversionDataLoadedNative;
            HashMap hashMap = new HashMap();
            String devKey = AppsFlyerProperties.getInstance().getDevKey();
            if (devKey != null) {
                String valueOf3 = valueOf("KSAppsFlyerId");
                if (!(!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false))) {
                    hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, C13758b.f33436b);
                }
                C21996h valueOf4 = C22021z.valueOf(weakReference.get().getContentResolver());
                if (valueOf4 != null) {
                    int i2 = setCustomerIdAndLogSession + 59;
                    setUserEmails = i2 % 128;
                    int i3 = i2 % 2;
                    hashMap.put("amazon_aid", valueOf4.valueOf);
                    hashMap.put("amazon_aid_limit", String.valueOf(valueOf4.AFInAppEventParameterName));
                }
                String string = AppsFlyerProperties.getInstance().getString("advertiserId");
                if (string != null) {
                    hashMap.put("advertiserId", string);
                }
                hashMap.put("app_id", weakReference.get().getPackageName());
                hashMap.put("devkey", devKey);
                hashMap.put("uid", C21885al.AFKeystoreWrapper(weakReference));
                hashMap.put("time_in_app", String.valueOf(j));
                hashMap.put("statType", "user_closed_app");
                hashMap.put("platform", C28534f.f69145b0);
                hashMap.put("launch_counter", Integer.toString(valueOf(valueOf2, false)));
                hashMap.put("channel", values(weakReference.get()));
                if (valueOf3 == null) {
                    valueOf3 = "";
                }
                hashMap.put("originalAppsflyerId", valueOf3);
                if (this.AppsFlyerLib) {
                    try {
                        AFLogger.values("Running callStats task");
                        C21959cm cmVar = new C21959cm();
                        cmVar.onConversionDataSuccess = isStopped();
                        new Thread(new C21882aj.C21883a((C21951ce) cmVar.valueOf((Map<String, ?>) hashMap).AFKeystoreWrapper(String.format(init, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), valueOf().getHostName()})))).start();
                    } catch (Throwable th) {
                        AFLogger.AFKeystoreWrapper("Could not send callStats request", th);
                    }
                } else {
                    AFLogger.values("Stats call is disabled, ignore ...");
                }
            } else {
                AFLogger.AppsFlyer2dXConversionCallback("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                int i4 = setCustomerIdAndLogSession + 29;
                setUserEmails = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    public final C21930bo AFKeystoreWrapper(Context context) {
        this.waitForCustomerUserId.AFInAppEventType = context.getApplicationContext();
        Context context2 = this.waitForCustomerUserId.AFInAppEventType;
        if (context2 != null) {
            return new C21910ay(valueOf(context2));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    private C21899as.C21900d values(final Map<String, String> map) {
        C218779 r0 = new C21899as.C21900d() {
            public final void AFInAppEventParameterName(String str) {
                C21897aq.AFInAppEventParameterName(str, DeepLinkResult.Error.NETWORK);
            }

            public final void values(Map<String, String> map) {
                for (String next : map.keySet()) {
                    map.put(next, map.get(next));
                }
                C21897aq.AFKeystoreWrapper((Map<String, String>) map);
            }
        };
        int i = setCustomerIdAndLogSession + 5;
        setUserEmails = i % 128;
        int i2 = i % 2;
        return r0;
    }

    private static void values(Context context, Map<String, Object> map, String str) {
        boolean z = true;
        int i = setUserEmails + 1;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        SharedPreferences valueOf2 = valueOf(context);
        SharedPreferences.Editor edit = valueOf2.edit();
        try {
            String string = valueOf2.getString("prev_event_name", (String) null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", valueOf2.getLong("prev_event_timestamp", -1));
                jSONObject.put("prev_event_name", string);
                map.put("prev_event", jSONObject);
            }
            edit.putString("prev_event_name", str);
            edit.putLong("prev_event_timestamp", System.currentTimeMillis());
            valueOf(edit);
            int i3 = setCustomerIdAndLogSession + 81;
            setUserEmails = i3 % 128;
            if (i3 % 2 == 0) {
                z = false;
            }
            if (!z) {
                throw null;
            }
        } catch (Exception e) {
            AFLogger.AFKeystoreWrapper("Error while processing previous event.", e);
        }
    }

    public static void AFKeystoreWrapper(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        boolean z = false;
        if (scheduledExecutorService != null) {
            int i = setCustomerIdAndLogSession + 49;
            setUserEmails = i % 128;
            if (i % 2 != 0) {
                try {
                    if (!scheduledExecutorService.isShutdown()) {
                        if (!scheduledExecutorService.isTerminated()) {
                            int i2 = setUserEmails + 123;
                            setCustomerIdAndLogSession = i2 % 128;
                            int i3 = i2 % 2;
                            scheduledExecutorService.schedule(runnable, j, timeUnit);
                            return;
                        }
                    }
                } catch (RejectedExecutionException e) {
                    AFLogger.AFKeystoreWrapper("scheduleJob failed with RejectedExecutionException Exception", e);
                    return;
                }
            } else {
                scheduledExecutorService.isShutdown();
                try {
                    throw null;
                } catch (Throwable th) {
                    AFLogger.AFKeystoreWrapper("scheduleJob failed with Exception", th);
                    return;
                }
            }
        }
        AFLogger.AppsFlyer2dXConversionCallback("scheduler is null, shut downed or terminated");
        int i4 = setUserEmails + 11;
        setCustomerIdAndLogSession = i4 % 128;
        if (i4 % 2 != 0) {
            z = true;
        }
        if (z) {
            throw null;
        }
    }

    private static File init(String str) {
        int i = setCustomerIdAndLogSession + 17;
        int i2 = i % 128;
        setUserEmails = i2;
        if ((i % 2 == 0 ? C12361b.f30261l : 'R') != 'R') {
            try {
                int i3 = 36 / 0;
                if (str == null) {
                    return null;
                }
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                return null;
            }
        } else {
            if ((str != null ? '8' : '9') != '8') {
                return null;
            }
        }
        int i4 = i2 + 105;
        setCustomerIdAndLogSession = i4 % 128;
        int i5 = i4 % 2;
        if (str.trim().length() > 0) {
            return new File(str.trim());
        }
        return null;
    }

    public static boolean valueOf(@NonNull SharedPreferences sharedPreferences) {
        int i = setUserEmails + 89;
        setCustomerIdAndLogSession = i % 128;
        char c = i % 2 != 0 ? 11 : '4';
        String string = sharedPreferences.getString("sentSuccessfully", (String) null);
        if (c != 11) {
            return Boolean.parseBoolean(string);
        }
        Boolean.parseBoolean(string);
        throw null;
    }

    private static void valueOf(Context context, Map<String, Object> map) {
        int i = setUserEmails + 55;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 == 0) {
            C21912b.C21914e AFInAppEventParameterName2 = C21912b.C21913c.AFInAppEventType.AFInAppEventParameterName(context);
            map.put("btl", Float.toString(AFInAppEventParameterName2.AFKeystoreWrapper));
            String str = AFInAppEventParameterName2.AFInAppEventType;
            if ((str != null ? '(' : '*') != '*') {
                map.put("btch", str);
            }
            int i2 = setCustomerIdAndLogSession + 39;
            setUserEmails = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        map.put("btl", Float.toString(C21912b.C21913c.AFInAppEventType.AFInAppEventParameterName(context).AFKeystoreWrapper));
        throw null;
    }

    public final Map<String, Object> init() {
        HashMap hashMap = new HashMap();
        if ((onInstallConversionDataLoadedNative() ? '8' : 13) == '8') {
            int i = setUserEmails + 33;
            setCustomerIdAndLogSession = i % 128;
            if ((i % 2 != 0 ? '(' : 'W') == 'W') {
                hashMap.put("lvl", this.updateServerUninstallToken);
            } else {
                hashMap.put("lvl", this.updateServerUninstallToken);
                throw null;
            }
        } else if (this.setDebugLog) {
            HashMap hashMap2 = new HashMap();
            this.updateServerUninstallToken = hashMap2;
            hashMap2.put("error", "operation timed out.");
            hashMap.put("lvl", this.updateServerUninstallToken);
            int i2 = setUserEmails + 101;
            setCustomerIdAndLogSession = i2 % 128;
            int i3 = i2 % 2;
        }
        return hashMap;
    }

    @Nullable
    public final String values(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if ((string == null ? 29 : C34766b.f84299n) == 29) {
            string = AFKeystoreWrapper(context, "CHANNEL");
        }
        if (string != null) {
            int i = setUserEmails + 89;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            if (!(!string.equals(""))) {
                int i3 = setUserEmails + 107;
                setCustomerIdAndLogSession = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
        }
        int i5 = setUserEmails + 21;
        setCustomerIdAndLogSession = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[SYNTHETIC, Splitter:B:30:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f  */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String AFKeystoreWrapper(java.net.HttpURLConnection r9) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 1
            java.io.InputStream r4 = r9.getErrorStream()     // Catch:{ all -> 0x0056 }
            r5 = 93
            if (r4 != 0) goto L_0x0013
            r6 = 44
            goto L_0x0014
        L_0x0013:
            r6 = r5
        L_0x0014:
            if (r6 == r5) goto L_0x001a
            java.io.InputStream r4 = r9.getInputStream()     // Catch:{ all -> 0x0056 }
        L_0x001a:
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x0056 }
            r5.<init>(r4)     // Catch:{ all -> 0x0056 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x0054 }
            r4.<init>(r5)     // Catch:{ all -> 0x0054 }
            int r2 = setUserEmails
            int r2 = r2 + 53
            int r6 = r2 % 128
            setCustomerIdAndLogSession = r6
            int r2 = r2 % 2
            r2 = r1
        L_0x002f:
            java.lang.String r6 = r4.readLine()     // Catch:{ all -> 0x004f }
            if (r6 == 0) goto L_0x0048
            if (r2 == 0) goto L_0x003e
            r2 = 10
            java.lang.Character r2 = java.lang.Character.valueOf(r2)     // Catch:{ all -> 0x004f }
            goto L_0x0040
        L_0x003e:
            java.lang.String r2 = ""
        L_0x0040:
            r0.append(r2)     // Catch:{ all -> 0x004f }
            r0.append(r6)     // Catch:{ all -> 0x004f }
            r2 = r3
            goto L_0x002f
        L_0x0048:
            r4.close()     // Catch:{ all -> 0x0077 }
            r5.close()     // Catch:{ all -> 0x0077 }
            goto L_0x0090
        L_0x004f:
            r2 = move-exception
            r8 = r4
            r4 = r2
            r2 = r8
            goto L_0x0058
        L_0x0054:
            r4 = move-exception
            goto L_0x0058
        L_0x0056:
            r4 = move-exception
            r5 = r2
        L_0x0058:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            java.lang.String r7 = "Could not read connection response from: "
            r6.<init>(r7)     // Catch:{ all -> 0x00b3 }
            java.net.URL r9 = r9.getURL()     // Catch:{ all -> 0x00b3 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00b3 }
            r6.append(r9)     // Catch:{ all -> 0x00b3 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x00b3 }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r9, r4)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0079
            r2.close()     // Catch:{ all -> 0x0077 }
            goto L_0x0079
        L_0x0077:
            r9 = move-exception
            goto L_0x008d
        L_0x0079:
            if (r5 == 0) goto L_0x007c
            r1 = r3
        L_0x007c:
            if (r1 == r3) goto L_0x007f
            goto L_0x0090
        L_0x007f:
            int r9 = setUserEmails
            int r9 = r9 + 81
            int r1 = r9 % 128
            setCustomerIdAndLogSession = r1
            int r9 = r9 % 2
            r5.close()     // Catch:{ all -> 0x0077 }
            goto L_0x0090
        L_0x008d:
            com.appsflyer.AFLogger.AFInAppEventType((java.lang.Throwable) r9)
        L_0x0090:
            java.lang.String r9 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a }
            r0.<init>(r9)     // Catch:{ JSONException -> 0x009a }
            return r9
        L_0x009a:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "string_response"
            r0.put(r1, r9)     // Catch:{ JSONException -> 0x00a9 }
            java.lang.String r9 = r0.toString()     // Catch:{ JSONException -> 0x00a9 }
            return r9
        L_0x00a9:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r9 = r9.toString()
            return r9
        L_0x00b3:
            r9 = move-exception
            if (r2 == 0) goto L_0x00bc
            r2.close()     // Catch:{ all -> 0x00ba }
            goto L_0x00bc
        L_0x00ba:
            r0 = move-exception
            goto L_0x00c2
        L_0x00bc:
            if (r5 == 0) goto L_0x00c5
            r5.close()     // Catch:{ all -> 0x00ba }
            goto L_0x00c5
        L_0x00c2:
            com.appsflyer.AFLogger.AFInAppEventType((java.lang.Throwable) r0)
        L_0x00c5:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.AFKeystoreWrapper(java.net.HttpURLConnection):java.lang.String");
    }

    private String values(SimpleDateFormat simpleDateFormat, Context context) {
        String str;
        int i = setUserEmails + 121;
        setCustomerIdAndLogSession = i % 128;
        if (!(i % 2 != 0)) {
            String string = valueOf(context).getString("appsFlyerFirstInstall", (String) null);
            if ((string == null ? 18 : '?') == 18) {
                if (AFInAppEventParameterName(context)) {
                    AFLogger.values("AppsFlyer: first launch detected");
                    str = simpleDateFormat.format(new Date());
                } else {
                    str = "";
                }
                string = str;
                AFKeystoreWrapper(context, "appsFlyerFirstInstall", string);
                int i2 = setUserEmails + 59;
                setCustomerIdAndLogSession = i2 % 128;
                int i3 = i2 % 2;
            }
            AFLogger.AFKeystoreWrapper("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
            return string;
        }
        valueOf(context).getString("appsFlyerFirstInstall", (String) null);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0190 A[SYNTHETIC, Splitter:B:68:0x0190] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void init(com.appsflyer.internal.C21995g r17) throws java.io.IOException {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            java.net.URL r1 = new java.net.URL
            java.lang.String r2 = r0.onDeepLinkingNative
            r1.<init>(r2)
            byte[] r2 = r17.AFInAppEventParameterName()
            java.lang.String r3 = r0.AFLogger$LogLevel
            java.lang.String r4 = r0.AppsFlyer2dXConversionCallback
            boolean r5 = r17.AFInAppEventType()
            android.app.Application r6 = r0.AFInAppEventType
            com.appsflyer.attribution.AppsFlyerRequestListener r7 = r0.AFInAppEventParameterName
            com.appsflyer.internal.bd r9 = r16.AFInAppEventType()
            com.appsflyer.internal.cf r9 = r9.init()
            int r10 = r0.onAppOpenAttributionNative
            r9.valueOf((int) r10)
            r10 = 0
            java.net.URLConnection r11 = r1.openConnection()     // Catch:{ all -> 0x0197 }
            java.lang.Object r11 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r11)     // Catch:{ all -> 0x0197 }
            java.net.URLConnection r11 = (java.net.URLConnection) r11     // Catch:{ all -> 0x0197 }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ all -> 0x0197 }
            java.lang.String r12 = "POST"
            r11.setRequestMethod(r12)     // Catch:{ all -> 0x0194 }
            int r12 = r2.length     // Catch:{ all -> 0x0194 }
            java.lang.String r13 = "Content-Length"
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0194 }
            r11.setRequestProperty(r13, r12)     // Catch:{ all -> 0x0194 }
            java.lang.String r12 = "Content-Type"
            boolean r13 = r17.valueOf()     // Catch:{ all -> 0x0194 }
            r14 = 76
            if (r13 == 0) goto L_0x0051
            r13 = 96
            goto L_0x0052
        L_0x0051:
            r13 = r14
        L_0x0052:
            if (r13 == r14) goto L_0x0064
            int r13 = setUserEmails
            int r13 = r13 + 93
            int r14 = r13 % 128
            setCustomerIdAndLogSession = r14
            int r13 = r13 % 2
            if (r13 != 0) goto L_0x0063
            java.lang.String r13 = "application/octet-stream"
            goto L_0x0066
        L_0x0063:
            throw r10     // Catch:{ all -> 0x0194 }
        L_0x0064:
            java.lang.String r13 = "application/json"
        L_0x0066:
            r11.setRequestProperty(r12, r13)     // Catch:{ all -> 0x0194 }
            r12 = 10000(0x2710, float:1.4013E-41)
            r11.setConnectTimeout(r12)     // Catch:{ all -> 0x0194 }
            r12 = 1
            r11.setDoOutput(r12)     // Catch:{ all -> 0x0194 }
            com.appsflyer.AppsFlyerProperties r13 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0194 }
            java.lang.String r14 = "http_cache"
            boolean r13 = r13.getBoolean(r14, r12)     // Catch:{ all -> 0x0194 }
            r14 = 0
            if (r13 != 0) goto L_0x0081
            r13 = r14
            goto L_0x0082
        L_0x0081:
            r13 = r12
        L_0x0082:
            if (r13 == r12) goto L_0x009b
            int r13 = setUserEmails
            int r13 = r13 + 113
            int r15 = r13 % 128
            setCustomerIdAndLogSession = r15
            int r13 = r13 % 2
            r11.setUseCaches(r14)     // Catch:{ all -> 0x0194 }
            int r13 = setCustomerIdAndLogSession
            int r13 = r13 + 121
            int r15 = r13 % 128
            setUserEmails = r15
            int r13 = r13 % 2
        L_0x009b:
            java.io.DataOutputStream r13 = new java.io.DataOutputStream     // Catch:{ all -> 0x018d }
            java.io.OutputStream r15 = r11.getOutputStream()     // Catch:{ all -> 0x018d }
            r13.<init>(r15)     // Catch:{ all -> 0x018d }
            r13.write(r2)     // Catch:{ all -> 0x018a }
            r13.close()     // Catch:{ all -> 0x0194 }
            int r2 = r11.getResponseCode()     // Catch:{ all -> 0x0194 }
            int r13 = r0.onAppOpenAttributionNative     // Catch:{ all -> 0x0194 }
            r9.AFInAppEventParameterName(r13)     // Catch:{ all -> 0x0194 }
            java.lang.String r9 = AFKeystoreWrapper((java.net.HttpURLConnection) r11)     // Catch:{ all -> 0x0194 }
            com.appsflyer.internal.am r13 = com.appsflyer.internal.C21886am.AFKeystoreWrapper()     // Catch:{ all -> 0x0194 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0194 }
            r13.AFKeystoreWrapper(r1, r2, r9)     // Catch:{ all -> 0x0194 }
            java.lang.String r1 = "response code: "
            java.lang.String r13 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0194 }
            java.lang.String r1 = r1.concat(r13)     // Catch:{ all -> 0x0194 }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r1)     // Catch:{ all -> 0x0194 }
            android.content.SharedPreferences r13 = valueOf((android.content.Context) r6)     // Catch:{ all -> 0x0194 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 != r1) goto L_0x0145
            if (r6 == 0) goto L_0x00e8
            if (r5 == 0) goto L_0x00e8
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0194 }
            r8.onResponseErrorNative = r14     // Catch:{ all -> 0x0194 }
            com.appsflyer.internal.bd r1 = r16.AFInAppEventType()     // Catch:{ all -> 0x0194 }
            r1.AFInAppEventType()     // Catch:{ all -> 0x0194 }
        L_0x00e8:
            if (r7 == 0) goto L_0x0106
            int r1 = setUserEmails
            int r1 = r1 + 119
            int r5 = r1 % 128
            setCustomerIdAndLogSession = r5
            int r1 = r1 % 2
            r5 = 10
            if (r1 == 0) goto L_0x00fb
            r1 = 86
            goto L_0x00fc
        L_0x00fb:
            r1 = r5
        L_0x00fc:
            if (r1 != r5) goto L_0x0102
            r7.onSuccess()     // Catch:{ all -> 0x0194 }
            goto L_0x0106
        L_0x0102:
            r7.onSuccess()     // Catch:{ all -> 0x0194 }
            throw r10     // Catch:{ all -> 0x0194 }
        L_0x0106:
            if (r4 == 0) goto L_0x0125
            int r1 = setCustomerIdAndLogSession
            int r1 = r1 + r12
            int r5 = r1 % 128
            setUserEmails = r5
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x011e
            com.appsflyer.internal.C21881ai.AFKeystoreWrapper()     // Catch:{ all -> 0x0194 }
            com.appsflyer.internal.C21881ai.AFInAppEventParameterName(r4, r6)     // Catch:{ all -> 0x0194 }
            r1 = 63
            r4 = 0
            int r1 = r1 / r4
            goto L_0x012f
        L_0x011e:
            com.appsflyer.internal.C21881ai.AFKeystoreWrapper()     // Catch:{ all -> 0x0194 }
            com.appsflyer.internal.C21881ai.AFInAppEventParameterName(r4, r6)     // Catch:{ all -> 0x0194 }
            goto L_0x012f
        L_0x0125:
            java.lang.String r1 = "sentSuccessfully"
            java.lang.String r4 = "true"
            AFKeystoreWrapper(r6, r1, r4)     // Catch:{ all -> 0x0194 }
            r8.onResponseErrorNative(r6)     // Catch:{ all -> 0x0194 }
        L_0x012f:
            com.appsflyer.internal.bt r1 = new com.appsflyer.internal.bt     // Catch:{ all -> 0x0194 }
            r1.<init>(r6)     // Catch:{ all -> 0x0194 }
            r1.values()     // Catch:{ all -> 0x0194 }
            org.json.JSONObject r1 = com.appsflyer.internal.C21896ap.AFKeystoreWrapper(r9)     // Catch:{ all -> 0x0194 }
            java.lang.String r4 = "send_background"
            r5 = 0
            boolean r1 = r1.optBoolean(r4, r5)     // Catch:{ all -> 0x0194 }
            r8.AppsFlyerLib = r1     // Catch:{ all -> 0x0194 }
            goto L_0x0162
        L_0x0145:
            if (r7 == 0) goto L_0x0162
            int r1 = com.appsflyer.attribution.RequestError.RESPONSE_CODE_FAILURE     // Catch:{ all -> 0x0194 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0194 }
            r4.<init>()     // Catch:{ all -> 0x0194 }
            java.lang.String r5 = com.appsflyer.internal.C21917bc.AFInAppEventParameterName     // Catch:{ all -> 0x0194 }
            r4.append(r5)     // Catch:{ all -> 0x0194 }
            java.lang.String r5 = " "
            r4.append(r5)     // Catch:{ all -> 0x0194 }
            r4.append(r2)     // Catch:{ all -> 0x0194 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0194 }
            r7.onError(r1, r4)     // Catch:{ all -> 0x0194 }
        L_0x0162:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0194 }
            r9 = 0
            r1 = r16
            r2 = r17
            r4 = r6
            r5 = r13
            r6 = r7
            r7 = r9
            com.appsflyer.internal.C21943bz.valueOf(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0194 }
            int r0 = setUserEmails
            int r0 = r0 + 3
            int r1 = r0 % 128
            setCustomerIdAndLogSession = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0186
            r11.disconnect()
            r0 = 64
            r1 = 0
            int r0 = r0 / r1
            return
        L_0x0186:
            r11.disconnect()
            return
        L_0x018a:
            r0 = move-exception
            r10 = r13
            goto L_0x018e
        L_0x018d:
            r0 = move-exception
        L_0x018e:
            if (r10 == 0) goto L_0x0193
            r10.close()     // Catch:{ all -> 0x0194 }
        L_0x0193:
            throw r0     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r0 = move-exception
            r10 = r11
            goto L_0x0198
        L_0x0197:
            r0 = move-exception
        L_0x0198:
            if (r10 == 0) goto L_0x019d
            r10.disconnect()
        L_0x019d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.init(com.appsflyer.internal.g):void");
    }

    public final void valueOf(Context context, Map<String, Object> map, Uri uri) {
        if (!map.containsKey("af_deeplink")) {
            String values2 = values(uri.toString());
            C21997i AFKeystoreWrapper2 = C21997i.AFKeystoreWrapper();
            String str = AFKeystoreWrapper2.getLevel;
            if (str != null) {
                int i = setCustomerIdAndLogSession + 101;
                setUserEmails = i % 128;
                int i2 = i % 2;
                if (AFKeystoreWrapper2.AFVersionDeclaration != null && values2.contains(str)) {
                    int i3 = setCustomerIdAndLogSession + 1;
                    setUserEmails = i3 % 128;
                    int i4 = i3 % 2;
                    Uri.Builder buildUpon = Uri.parse(values2).buildUpon();
                    Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                    Iterator<Map.Entry<String, String>> it = AFKeystoreWrapper2.AFVersionDeclaration.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i5 = setCustomerIdAndLogSession + 29;
                        setUserEmails = i5 % 128;
                        int i6 = i5 % 2;
                        Map.Entry next = it.next();
                        buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                        buildUpon2.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                    }
                    values2 = buildUpon.build().toString();
                    map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
                }
            }
            map.put("af_deeplink", values2);
            int i7 = setUserEmails + 21;
            setCustomerIdAndLogSession = i7 % 128;
            int i8 = i7 % 2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        C21899as asVar = new C21899as(uri, this, context);
        if ((asVar.valueOf ? 'Q' : C12361b.f30261l) == 'Q') {
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        C21845aa.AFInAppEventParameterName(context, hashMap, uri);
        if (asVar.values()) {
            asVar.AFKeystoreWrapper = values((Map<String, String>) hashMap);
            if (C22004m.AFInAppEventType == null) {
                C22004m.AFInAppEventType = new C22004m();
            }
            C22004m.AFInAppEventType.AFKeystoreWrapper().execute(asVar);
            return;
        }
        C21897aq.AFKeystoreWrapper((Map<String, String>) hashMap);
    }

    private int values(SharedPreferences sharedPreferences, boolean z) {
        int i = setCustomerIdAndLogSession + 39;
        setUserEmails = i % 128;
        char c = i % 2 == 0 ? '#' : '4';
        int values2 = values(sharedPreferences, "appsFlyerInAppEventCount", z);
        if (c != '4') {
            int i2 = 6 / 0;
        }
        return values2;
    }

    private int values(SharedPreferences sharedPreferences) {
        int i = setUserEmails + 7;
        setCustomerIdAndLogSession = i % 128;
        return !(i % 2 != 0 ? true : false) ? values(sharedPreferences, "appsFlyerAdRevenueCount", true) : values(sharedPreferences, "appsFlyerAdRevenueCount", false);
    }

    private static int values(SharedPreferences sharedPreferences, String str, boolean z) {
        boolean z2 = false;
        int i = sharedPreferences.getInt(str, 0);
        if (z) {
            int i2 = setUserEmails + 87;
            setCustomerIdAndLogSession = i2 % 128;
            if (i2 % 2 != 0) {
                z2 = true;
            }
            i = z2 ? i + 127 : i + 1;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            valueOf(edit);
        }
        if ((C21886am.AFKeystoreWrapper().getLevel() ? 22 : '9') == 22) {
            int i3 = setCustomerIdAndLogSession + 17;
            setUserEmails = i3 % 128;
            int i4 = i3 % 2;
            C21886am.AFKeystoreWrapper().AFKeystoreWrapper(String.valueOf(i));
            int i5 = setCustomerIdAndLogSession + 73;
            setUserEmails = i5 % 128;
            int i6 = i5 % 2;
        }
        return i;
    }

    private static void AFInAppEventType(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = setUserEmails;
        int i2 = i + 23;
        setCustomerIdAndLogSession = i2 % 128;
        if ((i2 % 2 != 0 ? '_' : 9) == '_') {
            throw null;
        } else if (appsFlyerConversionListener != null) {
            AFKeystoreWrapper = appsFlyerConversionListener;
            int i3 = i + 27;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    @android.support.annotation.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AFKeystoreWrapper(@android.support.annotation.NonNull com.appsflyer.internal.C21995g r5, @android.support.annotation.Nullable android.app.Activity r6) {
        /*
            r4 = this;
            android.app.Application r0 = r5.AFInAppEventType
            r1 = 25
            if (r6 == 0) goto L_0x0009
            r2 = 75
            goto L_0x000a
        L_0x0009:
            r2 = r1
        L_0x000a:
            java.lang.String r3 = ""
            if (r2 == r1) goto L_0x0029
            int r1 = setUserEmails
            int r1 = r1 + 61
            int r2 = r1 % 128
            setCustomerIdAndLogSession = r2
            int r1 = r1 % 2
            android.content.Intent r1 = r6.getIntent()
            if (r1 == 0) goto L_0x0029
            android.net.Uri r6 = com.appsflyer.internal.C21898ar.values(r6)
            if (r6 == 0) goto L_0x0029
            java.lang.String r6 = r6.toString()
            goto L_0x002a
        L_0x0029:
            r6 = r3
        L_0x002a:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = r1.getDevKey()
            if (r1 != 0) goto L_0x0064
            java.lang.String r6 = "[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey."
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r6)
            com.appsflyer.attribution.AppsFlyerRequestListener r5 = r5.AFInAppEventParameterName
            r6 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0041
            r1 = r6
            goto L_0x0042
        L_0x0041:
            r1 = r0
        L_0x0042:
            if (r1 == r6) goto L_0x0045
            goto L_0x0063
        L_0x0045:
            int r6 = setUserEmails
            int r6 = r6 + 91
            int r1 = r6 % 128
            setCustomerIdAndLogSession = r1
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x005c
            int r6 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r1 = com.appsflyer.internal.C21917bc.AFInAppEventType
            r5.onError(r6, r1)
            r5 = 17
            int r5 = r5 / r0
            goto L_0x0063
        L_0x005c:
            int r6 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r0 = com.appsflyer.internal.C21917bc.AFInAppEventType
            r5.onError(r6, r0)
        L_0x0063:
            return
        L_0x0064:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r1.getReferrer(r0)
            if (r0 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r3 = r0
        L_0x0070:
            r5.init = r3
            r5.AFKeystoreWrapper = r6
            r4.valueOf((com.appsflyer.internal.C21995g) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.AFKeystoreWrapper(com.appsflyer.internal.g, android.app.Activity):void");
    }

    public static boolean AFInAppEventParameterName(Context context) {
        boolean z = false;
        if ((!valueOf(context).contains("appsFlyerCount") ? C15369g.f37992r : 28) == 28) {
            return false;
        }
        int i = setCustomerIdAndLogSession + 21;
        int i2 = i % 128;
        setUserEmails = i2;
        if (i % 2 == 0) {
            z = true;
        }
        boolean z2 = !z;
        int i3 = i2 + 117;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
        return z2;
    }

    private void AFInAppEventType(Context context, String str, String str2, Map<String, Object> map, String str3, String str4) {
        C21956cj cjVar = new C21956cj();
        if (context != null) {
            int i = setCustomerIdAndLogSession + 111;
            setUserEmails = i % 128;
            int i2 = i % 2;
            cjVar.AFInAppEventType = (Application) context.getApplicationContext();
            int i3 = setUserEmails + 55;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
        }
        cjVar.getLevel = str2;
        cjVar.AFLogger$LogLevel = str;
        cjVar.values = map;
        cjVar.init = str3;
        cjVar.AFKeystoreWrapper = str4;
        valueOf((C21995g) cjVar);
    }

    private void values(C21995g gVar) {
        C21995g gVar2 = gVar;
        Application application = gVar2.AFInAppEventType;
        String format = String.format(onAttributionFailureNative, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), valueOf().getHostName()});
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(application.getPackageName());
        String obj = sb.toString();
        SharedPreferences valueOf2 = valueOf((Context) application);
        int valueOf3 = valueOf(valueOf2, false);
        int values2 = values(valueOf2);
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", gVar2.values);
        hashMap.put("adrevenue_counter", Integer.valueOf(values2));
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        hashMap.put("af_key", devKey);
        hashMap.put("launch_counter", Integer.valueOf(valueOf3));
        hashMap.put(AFInAppEventType((SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 11, Process.myTid() >> 22, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 30266)).intern(), Long.toString(new Date().getTime()));
        hashMap.put("uid", C21885al.AFKeystoreWrapper(new WeakReference(application)));
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
        if (!(string2 == null)) {
            hashMap.put("advertiserIdEnabled", string2);
        }
        if (string != null) {
            int i = setUserEmails + 41;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            hashMap.put("advertiserId", string);
        }
        hashMap.put("device", Build.DEVICE);
        AFInAppEventType((Context) application, (Map<String, Object>) hashMap);
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            hashMap.put("install_date", valueOf(simpleDateFormat, packageInfo.firstInstallTime));
            String string3 = valueOf2.getString("appsFlyerFirstInstall", (String) null);
            if (string3 == null) {
                string3 = values(simpleDateFormat, (Context) application);
            }
            hashMap.put("first_launch_date", string3);
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("AdRevenue - Exception while collecting app version data ", th);
        }
        C21995g valueOf4 = gVar2.AFKeystoreWrapper(obj).valueOf((Map<String, ?>) hashMap);
        valueOf4.onAppOpenAttributionNative = valueOf3;
        valueOf4.AFLogger$LogLevel = devKey;
        C21880e eVar = new C21880e(this, valueOf4, (byte) 0);
        if (C22004m.AFInAppEventType == null) {
            C22004m.AFInAppEventType = new C22004m();
            int i3 = setUserEmails + 21;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
        }
        AFKeystoreWrapper(C22004m.AFInAppEventType.values(), eVar, 1, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0054 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC, Splitter:B:16:0x0031] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0054=Splitter:B:24:0x0054, B:13:0x0028=Splitter:B:13:0x0028} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFInAppEventParameterName(java.io.File r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ FileNotFoundException -> 0x0053, all -> 0x0026 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0053, all -> 0x0026 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x0053, all -> 0x0026 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0053, all -> 0x0026 }
            r1.load(r2)     // Catch:{ FileNotFoundException -> 0x0054, all -> 0x0024 }
            java.lang.String r3 = "Found PreInstall property!"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3)     // Catch:{ FileNotFoundException -> 0x0054, all -> 0x0024 }
            java.lang.String r4 = r1.getProperty(r5)     // Catch:{ FileNotFoundException -> 0x0054, all -> 0x0024 }
            r2.close()     // Catch:{ all -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0, r5)
        L_0x0023:
            return r4
        L_0x0024:
            r4 = move-exception
            goto L_0x0028
        L_0x0026:
            r4 = move-exception
            r2 = r0
        L_0x0028:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x006f }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r5, r4)     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ all -> 0x003f }
            int r4 = setUserEmails
            int r4 = r4 + 25
            int r5 = r4 % 128
            setCustomerIdAndLogSession = r5
            int r4 = r4 % 2
            goto L_0x0048
        L_0x003f:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r5, r4)
            goto L_0x006e
        L_0x0048:
            int r4 = setCustomerIdAndLogSession
            int r4 = r4 + 109
            int r5 = r4 % 128
            setUserEmails = r5
            int r4 = r4 % 2
            goto L_0x006e
        L_0x0053:
            r2 = r0
        L_0x0054:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "PreInstall file wasn't found: "
            r5.<init>(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x006f }
            r5.append(r4)     // Catch:{ all -> 0x006f }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x006f }
            com.appsflyer.AFLogger.values(r4)     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x006e
            r2.close()     // Catch:{ all -> 0x003f }
        L_0x006e:
            return r0
        L_0x006f:
            r4 = move-exception
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007e
        L_0x0076:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0, r5)
        L_0x007e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.AFInAppEventParameterName(java.io.File, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean AFInAppEventType(com.appsflyer.internal.C21995g r5, android.content.SharedPreferences r6) {
        /*
            r4 = this;
            int r0 = setCustomerIdAndLogSession
            int r0 = r0 + 111
            int r1 = r0 % 128
            setUserEmails = r1
            int r0 = r0 % 2
            r0 = 0
            int r1 = r4.valueOf((android.content.SharedPreferences) r6, (boolean) r0)
            r2 = 1
            if (r1 != r2) goto L_0x0014
            r3 = r0
            goto L_0x0015
        L_0x0014:
            r3 = r2
        L_0x0015:
            if (r3 == r2) goto L_0x002a
            boolean r5 = r5 instanceof com.appsflyer.internal.C21953cg
            if (r5 != 0) goto L_0x002a
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 77
            int r3 = r5 % 128
            setUserEmails = r3
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x0028
            goto L_0x0034
        L_0x0028:
            r5 = r2
            goto L_0x0035
        L_0x002a:
            int r5 = setCustomerIdAndLogSession
            int r5 = r5 + 61
            int r3 = r5 % 128
            setUserEmails = r3
            int r5 = r5 % 2
        L_0x0034:
            r5 = r0
        L_0x0035:
            java.lang.String r3 = "newGPReferrerSent"
            boolean r6 = r6.getBoolean(r3, r0)
            if (r6 != 0) goto L_0x003f
            r6 = r2
            goto L_0x0040
        L_0x003f:
            r6 = r0
        L_0x0040:
            if (r6 == r2) goto L_0x0043
            goto L_0x004f
        L_0x0043:
            r6 = 23
            if (r1 != r2) goto L_0x004a
            r1 = 26
            goto L_0x004b
        L_0x004a:
            r1 = r6
        L_0x004b:
            if (r1 == r6) goto L_0x004f
            r6 = r2
            goto L_0x0050
        L_0x004f:
            r6 = r0
        L_0x0050:
            r1 = 70
            if (r6 != 0) goto L_0x0057
            r6 = 20
            goto L_0x0058
        L_0x0057:
            r6 = r1
        L_0x0058:
            if (r6 == r1) goto L_0x006d
            int r6 = setUserEmails
            int r6 = r6 + 121
            int r1 = r6 % 128
            setCustomerIdAndLogSession = r1
            int r6 = r6 % 2
            if (r5 == 0) goto L_0x0068
            r5 = r2
            goto L_0x0069
        L_0x0068:
            r5 = r0
        L_0x0069:
            if (r5 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            return r0
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.AFInAppEventType(com.appsflyer.internal.g, android.content.SharedPreferences):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01da, code lost:
        if (onInstallConversionDataLoadedNative() == false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e4, code lost:
        if (r5 != true) goto L_0x01e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0249  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFKeystoreWrapper(com.appsflyer.internal.C21995g r13) {
        /*
            r12 = this;
            android.app.Application r0 = r13.AFInAppEventType
            java.lang.String r1 = r13.getLevel
            if (r0 != 0) goto L_0x000c
            java.lang.String r13 = "sendWithEvent - got null context. skipping event/launch."
            com.appsflyer.AFLogger.values(r13)
            return
        L_0x000c:
            android.content.SharedPreferences r2 = valueOf((android.content.Context) r0)
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()
            r3.saveProperties(r2)
            boolean r3 = r12.isStopped()
            if (r3 != 0) goto L_0x0036
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "sendWithEvent from activity: "
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3)
        L_0x0036:
            r3 = 89
            if (r1 != 0) goto L_0x003c
            r1 = 5
            goto L_0x003d
        L_0x003c:
            r1 = r3
        L_0x003d:
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == r3) goto L_0x004d
            int r1 = setCustomerIdAndLogSession
            int r1 = r1 + 27
            int r3 = r1 % 128
            setUserEmails = r3
            int r1 = r1 % r4
            r1 = r6
            goto L_0x004e
        L_0x004d:
            r1 = r5
        L_0x004e:
            boolean r3 = r13 instanceof com.appsflyer.internal.C21950cd
            boolean r7 = r13 instanceof com.appsflyer.internal.C21953cg
            r13.onInstallConversionDataLoadedNative = r1
            java.util.Map r8 = r12.AFInAppEventType((com.appsflyer.internal.C21995g) r13)
            java.lang.String r9 = "appsflyerKey"
            java.lang.Object r9 = r8.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r10 = 88
            if (r9 == 0) goto L_0x0066
            r11 = r10
            goto L_0x0068
        L_0x0066:
            r11 = 28
        L_0x0068:
            if (r11 == r10) goto L_0x006c
            goto L_0x0254
        L_0x006c:
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0074
            r9 = r5
            goto L_0x0075
        L_0x0074:
            r9 = r6
        L_0x0075:
            if (r9 == 0) goto L_0x0254
            boolean r9 = r12.isStopped()
            if (r9 != 0) goto L_0x0082
            java.lang.String r9 = "AppsFlyerLib.sendWithEvent"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r9)
        L_0x0082:
            int r2 = r12.valueOf((android.content.SharedPreferences) r2, (boolean) r5)
            if (r7 != 0) goto L_0x00ff
            if (r3 == 0) goto L_0x008c
            r3 = r6
            goto L_0x008d
        L_0x008c:
            r3 = r5
        L_0x008d:
            if (r3 == r6) goto L_0x00ff
            if (r1 == 0) goto L_0x0093
            r3 = r5
            goto L_0x0094
        L_0x0093:
            r3 = r6
        L_0x0094:
            if (r3 == 0) goto L_0x00b3
            java.lang.String r3 = onAppOpenAttributionNative
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.appsflyer.AppsFlyerLib r9 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r9 = r9.getHostPrefix()
            r7[r5] = r9
            com.appsflyer.internal.ah r9 = valueOf()
            java.lang.String r9 = r9.getHostName()
            r7[r6] = r9
            java.lang.String r3 = java.lang.String.format(r3, r7)
            goto L_0x011b
        L_0x00b3:
            int r3 = setUserEmails
            int r3 = r3 + 85
            int r7 = r3 % 128
            setCustomerIdAndLogSession = r7
            int r3 = r3 % r4
            if (r2 >= r4) goto L_0x00e2
            int r7 = r7 + 107
            int r3 = r7 % 128
            setUserEmails = r3
            int r7 = r7 % r4
            java.lang.String r3 = onInstallConversionDataLoadedNative
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.appsflyer.AppsFlyerLib r9 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r9 = r9.getHostPrefix()
            r7[r5] = r9
            com.appsflyer.internal.ah r9 = valueOf()
            java.lang.String r9 = r9.getHostName()
            r7[r6] = r9
            java.lang.String r3 = java.lang.String.format(r3, r7)
            goto L_0x011b
        L_0x00e2:
            java.lang.String r3 = onInstallConversionFailureNative
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.appsflyer.AppsFlyerLib r9 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r9 = r9.getHostPrefix()
            r7[r5] = r9
            com.appsflyer.internal.ah r9 = valueOf()
            java.lang.String r9 = r9.getHostName()
            r7[r6] = r9
            java.lang.String r3 = java.lang.String.format(r3, r7)
            goto L_0x011b
        L_0x00ff:
            java.lang.String r3 = onConversionDataFail
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.appsflyer.AppsFlyerLib r9 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r9 = r9.getHostPrefix()
            r7[r5] = r9
            com.appsflyer.internal.ah r9 = valueOf()
            java.lang.String r9 = r9.getHostName()
            r7[r6] = r9
            java.lang.String r3 = java.lang.String.format(r3, r7)
        L_0x011b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = r0.getPackageName()
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = "&buildnumber=6.5.2"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.String r0 = r12.values((android.content.Context) r0)
            if (r0 == 0) goto L_0x0159
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = "&channel="
            r7.append(r3)
            r7.append(r0)
            java.lang.String r3 = r7.toString()
        L_0x0159:
            r12.valueOf((java.util.Map<java.lang.String, java.lang.Object>) r8)
            com.appsflyer.internal.ah$e r0 = new com.appsflyer.internal.ah$e
            com.appsflyer.internal.g r13 = r13.AFKeystoreWrapper(r3)
            com.appsflyer.internal.g r13 = r13.valueOf((java.util.Map<java.lang.String, ?>) r8)
            r13.onAppOpenAttributionNative = r2
            r0.<init>(r12, r13, r5)
            if (r1 == 0) goto L_0x016f
            r13 = r5
            goto L_0x0170
        L_0x016f:
            r13 = r6
        L_0x0170:
            if (r13 == 0) goto L_0x0174
            goto L_0x01ea
        L_0x0174:
            com.appsflyer.internal.ct[] r13 = r12.setAndroidIdData
            if (r13 == 0) goto L_0x01aa
            int r1 = r13.length
            int r2 = setUserEmails
            int r2 = r2 + 97
            int r3 = r2 % 128
            setCustomerIdAndLogSession = r3
            int r2 = r2 % r4
            r2 = r5
            r3 = r2
        L_0x0184:
            if (r2 >= r1) goto L_0x01ab
            r7 = r13[r2]
            com.appsflyer.internal.ct$c r8 = r7.values
            com.appsflyer.internal.ct$c r9 = com.appsflyer.internal.C21967ct.C21969c.STARTED
            if (r8 != r9) goto L_0x01a7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to get "
            r3.<init>(r8)
            java.lang.String r7 = r7.AFInAppEventParameterName
            r3.append(r7)
            java.lang.String r7 = " referrer, wait ..."
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.appsflyer.AFLogger.values(r3)
            r3 = r6
        L_0x01a7:
            int r2 = r2 + 1
            goto L_0x0184
        L_0x01aa:
            r3 = r5
        L_0x01ab:
            boolean r13 = r12.getSdkVersion
            if (r13 == 0) goto L_0x01c4
            boolean r13 = r12.getLevel()
            if (r13 != 0) goto L_0x01c4
            int r13 = setUserEmails
            int r13 = r13 + 101
            int r1 = r13 % 128
            setCustomerIdAndLogSession = r1
            int r13 = r13 % r4
            java.lang.String r13 = "fetching Facebook deferred AppLink data, wait ..."
            com.appsflyer.AFLogger.values(r13)
            r3 = r6
        L_0x01c4:
            boolean r13 = r12.setDebugLog
            if (r13 == 0) goto L_0x01e9
            int r13 = setUserEmails
            int r13 = r13 + 77
            int r1 = r13 % 128
            setCustomerIdAndLogSession = r1
            int r13 = r13 % r4
            if (r13 == 0) goto L_0x01dd
            boolean r13 = r12.onInstallConversionDataLoadedNative()
            r1 = 38
            int r1 = r1 / r5
            if (r13 != 0) goto L_0x01e9
            goto L_0x01e7
        L_0x01dd:
            boolean r13 = r12.onInstallConversionDataLoadedNative()
            if (r13 != 0) goto L_0x01e4
            r5 = r6
        L_0x01e4:
            if (r5 == r6) goto L_0x01e7
            goto L_0x01e9
        L_0x01e7:
            r5 = r6
            goto L_0x01ea
        L_0x01e9:
            r5 = r3
        L_0x01ea:
            boolean r13 = com.appsflyer.internal.C21997i.values
            if (r13 == 0) goto L_0x0236
            java.lang.String r13 = "ESP deeplink: execute launch on SerialExecutor"
            com.appsflyer.AFLogger.AFInAppEventType((java.lang.String) r13)
            com.appsflyer.internal.m r13 = com.appsflyer.internal.C22004m.AFInAppEventType
            if (r13 != 0) goto L_0x01fe
            com.appsflyer.internal.m r13 = new com.appsflyer.internal.m
            r13.<init>()
            com.appsflyer.internal.C22004m.AFInAppEventType = r13
        L_0x01fe:
            com.appsflyer.internal.m r13 = com.appsflyer.internal.C22004m.AFInAppEventType
            java.util.concurrent.ScheduledExecutorService r1 = r13.AFKeystoreWrapper
            r2 = 35
            if (r1 != 0) goto L_0x0209
            r1 = 34
            goto L_0x020a
        L_0x0209:
            r1 = r2
        L_0x020a:
            if (r1 == r2) goto L_0x022a
            int r1 = setUserEmails
            int r1 = r1 + 27
            int r2 = r1 % 128
            setCustomerIdAndLogSession = r2
            int r1 = r1 % r4
            if (r1 != 0) goto L_0x0220
            java.util.concurrent.ThreadFactory r1 = r13.valueOf
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r1)
            r13.AFKeystoreWrapper = r1
            goto L_0x022a
        L_0x0220:
            java.util.concurrent.ThreadFactory r0 = r13.valueOf
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            r13.AFKeystoreWrapper = r0
            r13 = 0
            throw r13
        L_0x022a:
            java.util.concurrent.ScheduledExecutorService r13 = r13.AFKeystoreWrapper
            int r1 = setUserEmails
            int r1 = r1 + 61
            int r2 = r1 % 128
            setCustomerIdAndLogSession = r2
            int r1 = r1 % r4
            goto L_0x0247
        L_0x0236:
            com.appsflyer.internal.m r13 = com.appsflyer.internal.C22004m.AFInAppEventType
            if (r13 != 0) goto L_0x0241
            com.appsflyer.internal.m r13 = new com.appsflyer.internal.m
            r13.<init>()
            com.appsflyer.internal.C22004m.AFInAppEventType = r13
        L_0x0241:
            com.appsflyer.internal.m r13 = com.appsflyer.internal.C22004m.AFInAppEventType
            java.util.concurrent.ScheduledThreadPoolExecutor r13 = r13.values()
        L_0x0247:
            if (r5 == 0) goto L_0x024c
            r1 = 500(0x1f4, double:2.47E-321)
            goto L_0x024e
        L_0x024c:
            r1 = 0
        L_0x024e:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            AFKeystoreWrapper(r13, r0, r1, r3)
            return
        L_0x0254:
            java.lang.String r0 = "Not sending data yet, waiting for dev key"
            com.appsflyer.AFLogger.values(r0)
            com.appsflyer.attribution.AppsFlyerRequestListener r13 = r13.AFInAppEventParameterName
            if (r13 == 0) goto L_0x0264
            int r0 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r1 = com.appsflyer.internal.C21917bc.AFInAppEventType
            r13.onError(r0, r1)
        L_0x0264:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.AFKeystoreWrapper(com.appsflyer.internal.g):void");
    }

    private void AFInAppEventType(Map<String, Object> map) {
        int i = setCustomerIdAndLogSession + 97;
        setUserEmails = i % 128;
        int i2 = i % 2;
        C21938bv values2 = AFInAppEventType().values();
        C21897aq aqVar = values2.AFInAppEventParameterName;
        values2.AFInAppEventParameterName = null;
        if (!(aqVar == null)) {
            map.put("rc", aqVar.valueOf());
        }
        int i3 = setUserEmails + 93;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String valueOf(Context context, String str) {
        SharedPreferences valueOf2 = valueOf(context);
        if ((valueOf2.contains("CACHED_CHANNEL") ? (char) 11 : 18) != 11) {
            AFKeystoreWrapper(context, "CACHED_CHANNEL", str);
            int i = setCustomerIdAndLogSession + 25;
            setUserEmails = i % 128;
            if (!(i % 2 == 0)) {
                return str;
            }
            throw null;
        }
        int i2 = setCustomerIdAndLogSession + 31;
        setUserEmails = i2 % 128;
        int i3 = i2 % 2;
        return valueOf2.getString("CACHED_CHANNEL", (String) null);
    }

    private static boolean AFInAppEventParameterName(File file) {
        int i = setUserEmails + 111;
        setCustomerIdAndLogSession = i % 128;
        int i2 = i % 2;
        if (!(file != null) || !file.exists()) {
            int i3 = setUserEmails + 25;
            setCustomerIdAndLogSession = i3 % 128;
            if (!(i3 % 2 == 0)) {
                int i4 = 76 / 0;
            }
            return true;
        }
        int i5 = setCustomerIdAndLogSession + 41;
        setUserEmails = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private void AFInAppEventParameterName(C21995g gVar) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(gVar.onDeepLinkingNative);
        AFLogger.AFKeystoreWrapper(sb.toString());
        boolean z = true;
        if ((gVar.AppsFlyer2dXConversionCallback != null ? '`' : 22) != 22) {
            int i = setUserEmails + 77;
            setCustomerIdAndLogSession = i % 128;
            if (i % 2 == 0) {
                z = false;
            }
            str = z ? Base64.encodeToString(gVar.AFInAppEventParameterName(), 3) : Base64.encodeToString(gVar.AFInAppEventParameterName(), 2);
            AFLogger.AFKeystoreWrapper("cached data: ".concat(String.valueOf(str)));
        } else {
            String jSONObject = new JSONObject(gVar.AFKeystoreWrapper()).toString();
            String replaceAll = jSONObject.replaceAll("\\p{C}", "*Non-printing character*");
            if (!(!replaceAll.equals(jSONObject))) {
                replaceAll = jSONObject;
            } else {
                int i2 = setCustomerIdAndLogSession + 107;
                setUserEmails = i2 % 128;
                if ((i2 % 2 == 0 ? 'A' : '^') != 'A') {
                    AFLogger.AppsFlyer2dXConversionCallback("Payload contains non-printing characters");
                } else {
                    AFLogger.AppsFlyer2dXConversionCallback("Payload contains non-printing characters");
                    throw null;
                }
            }
            C21884ak.valueOf("data: ".concat(str));
        }
        C21886am.AFKeystoreWrapper().AFInAppEventParameterName(gVar.onDeepLinkingNative, str);
        try {
            init(gVar);
        } catch (IOException e) {
            AFLogger.AFKeystoreWrapper("Exception in sendRequestToServer. ", e);
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                init(gVar.AFKeystoreWrapper(gVar.onDeepLinkingNative.replace(C28607x.f70006z, "http:")));
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send request to server. ");
            sb2.append(e.getLocalizedMessage());
            AFLogger.AFKeystoreWrapper(sb2.toString());
            throw e;
        }
    }

    private static void AFInAppEventType(Context context, Map<String, Object> map) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            int i = setUserEmails + 1;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            int rotation = windowManager.getDefaultDisplay().getRotation();
            map.put("sc_o", rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? "" : "lr" : "pr" : "l" : "p");
            int i3 = setUserEmails + 69;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static SharedPreferences valueOf(Context context) {
        int i = setUserEmails + 57;
        setCustomerIdAndLogSession = i % 128;
        if (i % 2 == 0) {
            if (!(valueOf().setImeiData != null)) {
                int i2 = setCustomerIdAndLogSession + 101;
                setUserEmails = i2 % 128;
                int i3 = i2 % 2;
                valueOf().setImeiData = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                int i4 = setCustomerIdAndLogSession + 65;
                setUserEmails = i4 % 128;
                int i5 = i4 % 2;
            }
            return valueOf().setImeiData;
        }
        SharedPreferences sharedPreferences = valueOf().setImeiData;
        throw null;
    }

    private void AFInAppEventType(Context context, boolean z, Map<String, Object> map, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", AFKeystoreWrapper("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", AFKeystoreWrapper("ro.product.cpu.abi2"));
        hashMap.put("arch", AFKeystoreWrapper("os.arch"));
        hashMap.put("build_display_id", AFKeystoreWrapper("ro.build.display.id"));
        if (z ? true : true) {
            int i2 = setCustomerIdAndLogSession + 29;
            int i3 = i2 % 128;
            setUserEmails = i3;
            int i4 = i2 % 2;
            if (this.onResponse) {
                int i5 = i3 + 51;
                setCustomerIdAndLogSession = i5 % 128;
                if (i5 % 2 != 0 ? true : true) {
                    Map<String, Object> AppsFlyer2dXConversionCallback2 = AppsFlyer2dXConversionCallback(context);
                    if (!AppsFlyer2dXConversionCallback2.isEmpty()) {
                        hashMap.put("loc", AppsFlyer2dXConversionCallback2);
                    }
                } else {
                    AppsFlyer2dXConversionCallback(context).isEmpty();
                    throw null;
                }
            }
            valueOf(context, (Map<String, Object>) hashMap);
            if (i <= 2) {
                int i6 = setCustomerIdAndLogSession + 67;
                setUserEmails = i6 % 128;
                if (i6 % 2 == 0) {
                    hashMap.putAll(C21850ac.AFInAppEventType(context).AFKeystoreWrapper());
                    int i7 = 63 / 0;
                } else {
                    hashMap.putAll(C21850ac.AFInAppEventType(context).AFKeystoreWrapper());
                }
            }
        }
        hashMap.put("dim", C22010u.AFKeystoreWrapper(context));
        map.put("deviceData", hashMap);
    }

    public final int valueOf(SharedPreferences sharedPreferences, boolean z) {
        int i = setCustomerIdAndLogSession + 65;
        setUserEmails = i % 128;
        if ((i % 2 == 0 ? '9' : 28) == 28) {
            return values(sharedPreferences, "appsFlyerCount", z);
        }
        values(sharedPreferences, "appsFlyerCount", z);
        throw null;
    }

    private static String AFInAppEventType(Activity activity) {
        Intent intent;
        boolean z = true;
        String str = null;
        if ((activity != null) && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    z = false;
                }
                if (!z) {
                    int i = setCustomerIdAndLogSession + 103;
                    setUserEmails = i % 128;
                    int i2 = i % 2;
                    String string = extras.getString("af");
                    if (string != null) {
                        try {
                            AFLogger.AFKeystoreWrapper("Push Notification received af payload = ".concat(string));
                            extras.remove("af");
                            activity.setIntent(intent.putExtras(extras));
                            int i3 = setUserEmails + 87;
                            setCustomerIdAndLogSession = i3 % 128;
                            int i4 = i3 % 2;
                        } catch (Throwable th) {
                            th = th;
                            str = string;
                            AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                            return str;
                        }
                    }
                    str = string;
                }
                int i5 = setCustomerIdAndLogSession + 97;
                setUserEmails = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th2) {
                th = th2;
                AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                return str;
            }
        }
        return str;
    }

    public final C21967ct[] AFInAppEventParameterName() {
        int i = setUserEmails;
        int i2 = i + 121;
        setCustomerIdAndLogSession = i2 % 128;
        if ((i2 % 2 != 0 ? '?' : 'b') != '?') {
            C21967ct[] ctVarArr = this.setAndroidIdData;
            int i3 = i + 55;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
            return ctVarArr;
        }
        throw null;
    }

    private static void values(Map<String, Object> map, C21952cf cfVar) {
        HashMap hashMap = new HashMap(cfVar.AFInAppEventParameterName);
        cfVar.AFInAppEventParameterName.clear();
        cfVar.valueOf.valueOf("gcd");
        if ((!hashMap.isEmpty() ? 10 : 'P') != 'P') {
            int i = setUserEmails + 91;
            setCustomerIdAndLogSession = i % 128;
            if ((i % 2 != 0 ? 'R' : ' ') != ' ') {
                AFKeystoreWrapper(map).put("gcd", hashMap);
                int i2 = 44 / 0;
            } else {
                AFKeystoreWrapper(map).put("gcd", hashMap);
            }
        }
        int i3 = setUserEmails + 33;
        setCustomerIdAndLogSession = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void AFInAppEventType(String str) {
        try {
            if (!(new JSONObject(str).has("pid"))) {
                AFLogger.AppsFlyer2dXConversionCallback("Cannot set preinstall attribution data without a media source");
                return;
            }
            int i = setUserEmails + 83;
            setCustomerIdAndLogSession = i % 128;
            int i2 = i % 2;
            AFInAppEventParameterName("preInstallName", str);
            int i3 = setUserEmails + 121;
            setCustomerIdAndLogSession = i3 % 128;
            int i4 = i3 % 2;
        } catch (JSONException e) {
            AFLogger.AFKeystoreWrapper("Error parsing JSON for preinstall", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x0363 A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0370 A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0376 A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0389 A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x039b A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03ac A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03d6 A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03f2 A[SYNTHETIC, Splitter:B:169:0x03f2] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0411 A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0424 A[Catch:{ Exception -> 0x042a }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04cf A[Catch:{ all -> 0x055c }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0594 A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x059d A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x05d0 A[SYNTHETIC, Splitter:B:269:0x05d0] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x061a A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0639 A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x066b A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x066d A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x067b A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x06f2 A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x06fb A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x06fc A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0738 A[Catch:{ Exception -> 0x00e9, all -> 0x07fd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> AFInAppEventType(com.appsflyer.internal.C21995g r30) {
        /*
            r29 = this;
            r1 = r29
            r2 = r30
            java.lang.String r3 = "af_deeplink"
            java.lang.String r4 = "advertiserId"
            java.lang.String r5 = "versionCode"
            java.lang.String r6 = "Exception while collecting facebook's attribution ID. "
            java.lang.String r7 = "appid"
            java.lang.String r8 = "sdkExtension"
            java.lang.String r9 = "extraReferrers"
            java.lang.String r10 = "yyyy-MM-dd_HHmmssZ"
            java.lang.String r11 = ""
            android.app.Application r12 = r2.AFInAppEventType
            java.lang.String r13 = r2.AFLogger$LogLevel
            java.lang.String r14 = r2.getLevel
            org.json.JSONObject r15 = new org.json.JSONObject
            r16 = r4
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.values
            if (r4 != 0) goto L_0x0029
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x0029:
            r15.<init>(r4)
            java.lang.String r4 = r15.toString()
            java.lang.String r15 = r2.init
            r17 = r3
            android.content.SharedPreferences r3 = valueOf((android.content.Context) r12)
            r18 = r5
            boolean r5 = r30.AFInAppEventType()
            r19 = r10
            java.lang.String r10 = r2.AFKeystoreWrapper
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.valueOf
            com.appsflyer.internal.C22021z.valueOf(r12, r2)
            java.lang.Boolean r20 = com.appsflyer.internal.C22021z.values
            r21 = r10
            if (r20 == 0) goto L_0x006d
            boolean r22 = r20.booleanValue()
            if (r22 != 0) goto L_0x006d
            java.util.Map r10 = AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.Object>) r2)
            boolean r20 = r20.booleanValue()
            r22 = 1
            r20 = r20 ^ 1
            r22 = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r20)
            r20 = r7
            java.lang.String r7 = "ad_ids_disabled"
            r10.put(r7, r6)
            goto L_0x0071
        L_0x006d:
            r22 = r6
            r20 = r7
        L_0x0071:
            java.util.Date r6 = new java.util.Date
            r6.<init>()
            long r6 = r6.getTime()
            int r10 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r10 = r10 >> 16
            int r10 = 12 - r10
            float r23 = android.media.AudioTrack.getMinVolume()
            r24 = 0
            r25 = r4
            int r4 = (r23 > r24 ? 1 : (r23 == r24 ? 0 : -1))
            float r23 = android.view.ViewConfiguration.getScrollFriction()
            r26 = r13
            int r13 = (r23 > r24 ? 1 : (r23 == r24 ? 0 : -1))
            int r13 = r13 + 30265
            char r13 = (char) r13
            java.lang.String r4 = AFInAppEventType((int) r10, (int) r4, (char) r13)
            java.lang.String r4 = r4.intern()
            java.lang.String r10 = java.lang.Long.toString(r6)
            r2.put(r4, r10)
            java.lang.String r4 = com.appsflyer.internal.C21944c.values(r12, r6)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r6 = "cksm_v1"
            r2.put(r6, r4)
        L_0x00b1:
            boolean r4 = r29.isStopped()     // Catch:{ all -> 0x07fd }
            if (r4 != 0) goto L_0x00cf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = "******* sendTrackingWithEvent: "
            r4.<init>(r6)     // Catch:{ all -> 0x07fd }
            if (r5 == 0) goto L_0x00c3
            java.lang.String r6 = "Launch"
            goto L_0x00c4
        L_0x00c3:
            r6 = r14
        L_0x00c4:
            r4.append(r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x07fd }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r4)     // Catch:{ all -> 0x07fd }
            goto L_0x00d4
        L_0x00cf:
            java.lang.String r4 = "Reporting has been stopped"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r4)     // Catch:{ all -> 0x07fd }
        L_0x00d4:
            com.appsflyer.internal.C21881ai.AFKeystoreWrapper()     // Catch:{ all -> 0x07fd }
            java.io.File r4 = com.appsflyer.internal.C21881ai.valueOf(r12)     // Catch:{ Exception -> 0x00e9 }
            boolean r4 = r4.exists()     // Catch:{ Exception -> 0x00e9 }
            if (r4 != 0) goto L_0x00f0
            java.io.File r4 = com.appsflyer.internal.C21881ai.valueOf(r12)     // Catch:{ Exception -> 0x00e9 }
            r4.mkdir()     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00f0
        L_0x00e9:
            r0 = move-exception
            r4 = r0
            java.lang.String r6 = "Could not create cache directory"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r6, r4)     // Catch:{ all -> 0x07fd }
        L_0x00f0:
            android.content.pm.PackageManager r4 = r12.getPackageManager()     // Catch:{ Exception -> 0x012c }
            java.lang.String r6 = r12.getPackageName()     // Catch:{ Exception -> 0x012c }
            r7 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r6, r7)     // Catch:{ Exception -> 0x012c }
            java.lang.String[] r4 = r4.requestedPermissions     // Catch:{ Exception -> 0x012c }
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ Exception -> 0x012c }
            java.lang.String r6 = "android.permission.INTERNET"
            boolean r6 = r4.contains(r6)     // Catch:{ Exception -> 0x012c }
            if (r6 != 0) goto L_0x0111
            java.lang.String r6 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r6)     // Catch:{ Exception -> 0x012c }
        L_0x0111:
            java.lang.String r6 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = r4.contains(r6)     // Catch:{ Exception -> 0x012c }
            if (r6 != 0) goto L_0x011e
            java.lang.String r6 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r6)     // Catch:{ Exception -> 0x012c }
        L_0x011e:
            java.lang.String r6 = "android.permission.ACCESS_WIFI_STATE"
            boolean r4 = r4.contains(r6)     // Catch:{ Exception -> 0x012c }
            if (r4 != 0) goto L_0x0133
            java.lang.String r4 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r4)     // Catch:{ Exception -> 0x012c }
            goto L_0x0133
        L_0x012c:
            r0 = move-exception
            r4 = r0
            java.lang.String r6 = "Exception while validation permissions. "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r6, r4)     // Catch:{ all -> 0x07fd }
        L_0x0133:
            java.lang.String r4 = "af_events_api"
            long r6 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ all -> 0x07fd }
            r23 = -1
            int r6 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            int r7 = android.view.ViewConfiguration.getPressedStateDuration()     // Catch:{ all -> 0x07fd }
            int r7 = r7 >> 16
            int r7 = 12 - r7
            int r10 = android.view.ViewConfiguration.getLongPressTimeout()     // Catch:{ all -> 0x07fd }
            int r10 = r10 >> 16
            r13 = 60917(0xedf5, float:8.5363E-41)
            int r10 = r10 + r13
            char r10 = (char) r10     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = AFInAppEventType((int) r6, (int) r7, (char) r10)     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = r6.intern()     // Catch:{ all -> 0x07fd }
            r2.put(r4, r6)     // Catch:{ all -> 0x07fd }
            int r4 = android.text.TextUtils.indexOf(r11, r11)     // Catch:{ all -> 0x07fd }
            int r4 = r4 + 5
            int r6 = android.text.TextUtils.indexOf(r11, r11)     // Catch:{ all -> 0x07fd }
            int r6 = r6 + 13
            int r7 = android.view.ViewConfiguration.getScrollBarSize()     // Catch:{ all -> 0x07fd }
            int r7 = r7 >> 8
            char r7 = (char) r7     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = AFInAppEventType((int) r4, (int) r6, (char) r7)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = r4.intern()     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ all -> 0x07fd }
            r2.put(r4, r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "device"
            java.lang.String r6 = android.os.Build.DEVICE     // Catch:{ all -> 0x07fd }
            r2.put(r4, r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "product"
            java.lang.String r6 = android.os.Build.PRODUCT     // Catch:{ all -> 0x07fd }
            r2.put(r4, r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "sdk"
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x07fd }
            r2.put(r4, r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "model"
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ all -> 0x07fd }
            r2.put(r4, r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "deviceType"
            java.lang.String r6 = android.os.Build.TYPE     // Catch:{ all -> 0x07fd }
            r2.put(r4, r6)     // Catch:{ all -> 0x07fd }
            AFInAppEventType((android.content.Context) r12, (java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x07fd }
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x07fd }
            com.appsflyer.internal.ax r6 = new com.appsflyer.internal.ax     // Catch:{ all -> 0x07fd }
            r6.<init>(r12)     // Catch:{ all -> 0x07fd }
            com.appsflyer.internal.bd r7 = r29.AFInAppEventType()     // Catch:{ all -> 0x07fd }
            com.appsflyer.internal.cf r7 = r7.init()     // Catch:{ all -> 0x07fd }
            if (r5 == 0) goto L_0x0294
            boolean r13 = AFInAppEventParameterName((android.content.Context) r12)     // Catch:{ all -> 0x07fd }
            if (r13 == 0) goto L_0x01f9
            boolean r13 = r4.isOtherSdkStringDisabled()     // Catch:{ all -> 0x07fd }
            if (r13 != 0) goto L_0x01d1
            float r13 = onResponseNative(r12)     // Catch:{ all -> 0x07fd }
            java.lang.String r10 = "batteryLevel"
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x07fd }
            r2.put(r10, r13)     // Catch:{ all -> 0x07fd }
        L_0x01d1:
            AFLogger$LogLevel(r12)     // Catch:{ all -> 0x07fd }
            java.lang.Class<android.app.UiModeManager> r10 = android.app.UiModeManager.class
            java.lang.Object r10 = r12.getSystemService(r10)     // Catch:{ all -> 0x07fd }
            android.app.UiModeManager r10 = (android.app.UiModeManager) r10     // Catch:{ all -> 0x07fd }
            if (r10 == 0) goto L_0x01ec
            int r10 = r10.getCurrentModeType()     // Catch:{ all -> 0x07fd }
            r13 = 4
            if (r10 != r13) goto L_0x01ec
            java.lang.String r10 = "tv"
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x07fd }
            r2.put(r10, r13)     // Catch:{ all -> 0x07fd }
        L_0x01ec:
            boolean r10 = com.appsflyer.internal.C21947ca.AFInAppEventType(r12)     // Catch:{ all -> 0x07fd }
            if (r10 == 0) goto L_0x01f9
            java.lang.String r10 = "inst_app"
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x07fd }
            r2.put(r10, r13)     // Catch:{ all -> 0x07fd }
        L_0x01f9:
            java.lang.String r10 = "timepassedsincelastlaunch"
            long r27 = r1.onConversionDataFail(r12)     // Catch:{ all -> 0x07fd }
            java.lang.String r13 = java.lang.Long.toString(r27)     // Catch:{ all -> 0x07fd }
            r2.put(r10, r13)     // Catch:{ all -> 0x07fd }
            AFInAppEventParameterName((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x07fd }
            values((java.util.Map<java.lang.String, java.lang.Object>) r2, (com.appsflyer.internal.C21952cf) r7)     // Catch:{ all -> 0x07fd }
            java.lang.String r10 = r1.setOaidData     // Catch:{ all -> 0x07fd }
            if (r10 == 0) goto L_0x0215
            java.lang.String r13 = "phone"
            r2.put(r13, r10)     // Catch:{ all -> 0x07fd }
        L_0x0215:
            boolean r10 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x07fd }
            java.lang.String r13 = "referrer"
            if (r10 != 0) goto L_0x0220
            r2.put(r13, r15)     // Catch:{ all -> 0x07fd }
        L_0x0220:
            r10 = 0
            java.lang.String r15 = r3.getString(r9, r10)     // Catch:{ all -> 0x07fd }
            if (r15 == 0) goto L_0x022a
            r2.put(r9, r15)     // Catch:{ all -> 0x07fd }
        L_0x022a:
            java.lang.String r9 = r4.getReferrer(r12)     // Catch:{ all -> 0x07fd }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x07fd }
            if (r10 != 0) goto L_0x023d
            java.lang.Object r10 = r2.get(r13)     // Catch:{ all -> 0x07fd }
            if (r10 != 0) goto L_0x023d
            r2.put(r13, r9)     // Catch:{ all -> 0x07fd }
        L_0x023d:
            long r9 = r7.onInstallConversionDataLoadedNative     // Catch:{ all -> 0x07fd }
            r13 = r6
            r15 = r7
            r6 = 0
            int r27 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r27 == 0) goto L_0x0250
            java.lang.String r6 = "prev_session_dur"
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x07fd }
            r2.put(r6, r7)     // Catch:{ all -> 0x07fd }
        L_0x0250:
            android.app.Application r6 = com.appsflyer.internal.C21916bb.AFInAppEventType     // Catch:{ all -> 0x07fd }
            java.lang.String r7 = "exception_number"
            if (r6 != 0) goto L_0x0257
            goto L_0x0261
        L_0x0257:
            android.content.SharedPreferences r6 = valueOf((android.content.Context) r6)     // Catch:{ all -> 0x07fd }
            r9 = 0
            long r23 = r6.getLong(r7, r9)     // Catch:{ all -> 0x07fd }
        L_0x0261:
            java.lang.Long r6 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x07fd }
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
            com.appsflyer.internal.ba r6 = r1.setCustomerUserId     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x0299
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.values     // Catch:{ all -> 0x07fd }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x07fd }
            java.lang.String r9 = "partner_data"
            if (r7 != 0) goto L_0x027b
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.values     // Catch:{ all -> 0x07fd }
            r2.put(r9, r7)     // Catch:{ all -> 0x07fd }
        L_0x027b:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r6.AFInAppEventType     // Catch:{ all -> 0x07fd }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x07fd }
            if (r7 != 0) goto L_0x0299
            java.util.Map r7 = AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x07fd }
            java.util.Map<java.lang.String, java.lang.Object> r10 = r6.AFInAppEventType     // Catch:{ all -> 0x07fd }
            r7.put(r9, r10)     // Catch:{ all -> 0x07fd }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x07fd }
            r7.<init>()     // Catch:{ all -> 0x07fd }
            r6.AFInAppEventType = r7     // Catch:{ all -> 0x07fd }
            goto L_0x0299
        L_0x0294:
            r13 = r6
            r15 = r7
            values((android.content.Context) r12, (java.util.Map<java.lang.String, java.lang.Object>) r2, (java.lang.String) r14)     // Catch:{ all -> 0x07fd }
        L_0x0299:
            java.lang.String r6 = "KSAppsFlyerId"
            java.lang.String r6 = valueOf((java.lang.String) r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r7 = "KSAppsFlyerRICounter"
            java.lang.String r7 = valueOf((java.lang.String) r7)     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x02bd
            if (r7 == 0) goto L_0x02bd
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x07fd }
            int r9 = r9.intValue()     // Catch:{ all -> 0x07fd }
            if (r9 <= 0) goto L_0x02bd
            java.lang.String r9 = "reinstallCounter"
            r2.put(r9, r7)     // Catch:{ all -> 0x07fd }
            java.lang.String r7 = "originalAppsflyerId"
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x02bd:
            java.lang.String r6 = "additionalCustomData"
            java.lang.String r6 = valueOf((java.lang.String) r6)     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x02ca
            java.lang.String r7 = "customData"
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x02ca:
            android.content.pm.PackageManager r6 = r12.getPackageManager()     // Catch:{ Exception -> 0x02de }
            java.lang.String r7 = r12.getPackageName()     // Catch:{ Exception -> 0x02de }
            java.lang.String r6 = r6.getInstallerPackageName(r7)     // Catch:{ Exception -> 0x02de }
            if (r6 == 0) goto L_0x02e5
            java.lang.String r7 = "installer_package"
            r2.put(r7, r6)     // Catch:{ Exception -> 0x02de }
            goto L_0x02e5
        L_0x02de:
            r0 = move-exception
            r6 = r0
            java.lang.String r7 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x02e5:
            java.lang.String r6 = r4.getString(r8)     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x02f4
            int r7 = r6.length()     // Catch:{ all -> 0x07fd }
            if (r7 <= 0) goto L_0x02f4
            r2.put(r8, r6)     // Catch:{ all -> 0x07fd }
        L_0x02f4:
            java.lang.String r6 = r1.values((android.content.Context) r12)     // Catch:{ all -> 0x07fd }
            java.lang.String r7 = r1.valueOf((android.content.Context) r12, (java.lang.String) r6)     // Catch:{ all -> 0x07fd }
            if (r7 == 0) goto L_0x0304
            boolean r8 = r7.equals(r6)     // Catch:{ all -> 0x07fd }
            if (r8 == 0) goto L_0x0308
        L_0x0304:
            if (r7 != 0) goto L_0x030d
            if (r6 == 0) goto L_0x030d
        L_0x0308:
            java.lang.String r7 = "af_latestchannel"
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x030d:
            java.lang.String r6 = r1.onAppOpenAttributionNative(r12)     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x031c
            java.lang.String r7 = "af_installstore"
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x07fd }
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x031c:
            java.lang.String r6 = r1.onInstallConversionDataLoadedNative(r12)     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x032b
            java.lang.String r7 = "af_preinstall_name"
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x07fd }
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x032b:
            java.lang.String r6 = r1.onDeepLinkingNative(r12)     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x033a
            java.lang.String r7 = "af_currentstore"
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x07fd }
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x033a:
            java.lang.String r6 = "appsflyerKey"
            if (r26 == 0) goto L_0x034a
            int r7 = r26.length()     // Catch:{ all -> 0x07fd }
            if (r7 <= 0) goto L_0x034a
            r7 = r26
            r2.put(r6, r7)     // Catch:{ all -> 0x07fd }
            goto L_0x035d
        L_0x034a:
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x07fd }
            java.lang.String r7 = r7.getDevKey()     // Catch:{ all -> 0x07fd }
            if (r7 == 0) goto L_0x07f1
            int r8 = r7.length()     // Catch:{ all -> 0x07fd }
            if (r8 <= 0) goto L_0x07f1
            r2.put(r6, r7)     // Catch:{ all -> 0x07fd }
        L_0x035d:
            java.lang.String r6 = AFKeystoreWrapper()     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x0368
            java.lang.String r7 = "appUserId"
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x0368:
            java.lang.String r6 = "userEmails"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x0376
            java.lang.String r7 = "user_emails"
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
            goto L_0x0387
        L_0x0376:
            java.lang.String r6 = "userEmail"
            java.lang.String r6 = valueOf((java.lang.String) r6)     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x0387
            java.lang.String r7 = "sha1_el"
            java.lang.String r6 = com.appsflyer.internal.C21859ae.AFKeystoreWrapper((java.lang.String) r6)     // Catch:{ all -> 0x07fd }
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x0387:
            if (r14 == 0) goto L_0x0395
            java.lang.String r6 = "eventName"
            r2.put(r6, r14)     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = "eventValue"
            r7 = r25
            r2.put(r6, r7)     // Catch:{ all -> 0x07fd }
        L_0x0395:
            java.lang.String r6 = AppsFlyer2dXConversionCallback()     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x03a4
            java.lang.String r6 = valueOf((java.lang.String) r20)     // Catch:{ all -> 0x07fd }
            r7 = r20
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x03a4:
            java.lang.String r6 = "currencyCode"
            java.lang.String r6 = valueOf((java.lang.String) r6)     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x03ce
            int r7 = r6.length()     // Catch:{ all -> 0x07fd }
            r8 = 3
            if (r7 == r8) goto L_0x03c9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x07fd }
            java.lang.String r8 = "WARNING: currency code should be 3 characters!!! '"
            r7.<init>(r8)     // Catch:{ all -> 0x07fd }
            r7.append(r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r8 = "' is not a legal value."
            r7.append(r8)     // Catch:{ all -> 0x07fd }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x07fd }
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r7)     // Catch:{ all -> 0x07fd }
        L_0x03c9:
            java.lang.String r7 = "currency"
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x03ce:
            java.lang.String r6 = "IS_UPDATE"
            java.lang.String r6 = valueOf((java.lang.String) r6)     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x03db
            java.lang.String r7 = "isUpdate"
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
        L_0x03db:
            boolean r6 = r1.isPreInstalledApp(r12)     // Catch:{ all -> 0x07fd }
            java.lang.String r7 = "af_preinstalled"
            java.lang.String r6 = java.lang.Boolean.toString(r6)     // Catch:{ all -> 0x07fd }
            r2.put(r7, r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = "collectFacebookAttrId"
            r7 = 1
            boolean r6 = r4.getBoolean(r6, r7)     // Catch:{ all -> 0x07fd }
            r7 = 0
            if (r6 == 0) goto L_0x0416
            android.content.pm.PackageManager r6 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0409, all -> 0x0400 }
            java.lang.String r8 = "com.facebook.katana"
            r6.getApplicationInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x0409, all -> 0x0400 }
            java.lang.String r6 = r1.getAttributionId(r12)     // Catch:{ NameNotFoundException -> 0x0409, all -> 0x0400 }
            goto L_0x040f
        L_0x0400:
            r0 = move-exception
            r6 = r0
            r8 = r22
            com.appsflyer.AFLogger.AFKeystoreWrapper(r8, r6)     // Catch:{ all -> 0x07fd }
        L_0x0407:
            r6 = 0
            goto L_0x040f
        L_0x0409:
            r8 = r22
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r8)     // Catch:{ all -> 0x07fd }
            goto L_0x0407
        L_0x040f:
            if (r6 == 0) goto L_0x0416
            java.lang.String r8 = "fb"
            r2.put(r8, r6)     // Catch:{ all -> 0x07fd }
        L_0x0416:
            r1.AFInAppEventParameterName((android.content.Context) r12, (java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x07fd }
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x042a }
            r6.<init>(r12)     // Catch:{ Exception -> 0x042a }
            java.lang.String r6 = com.appsflyer.internal.C21885al.AFKeystoreWrapper(r6)     // Catch:{ Exception -> 0x042a }
            if (r6 == 0) goto L_0x0441
            java.lang.String r8 = "uid"
            r2.put(r8, r6)     // Catch:{ Exception -> 0x042a }
            goto L_0x0441
        L_0x042a:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x07fd }
            java.lang.String r9 = "ERROR: could not get uid "
            r8.<init>(r9)     // Catch:{ all -> 0x07fd }
            java.lang.String r9 = r6.getMessage()     // Catch:{ all -> 0x07fd }
            r8.append(r9)     // Catch:{ all -> 0x07fd }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x07fd }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r8, r6)     // Catch:{ all -> 0x07fd }
        L_0x0441:
            java.lang.String r6 = "lang"
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x044f }
            java.lang.String r8 = r8.getDisplayLanguage()     // Catch:{ Exception -> 0x044f }
            r2.put(r6, r8)     // Catch:{ Exception -> 0x044f }
            goto L_0x0456
        L_0x044f:
            r0 = move-exception
            r6 = r0
            java.lang.String r8 = "Exception while collecting display language name. "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r8, r6)     // Catch:{ all -> 0x07fd }
        L_0x0456:
            java.lang.String r6 = "lang_code"
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0464 }
            java.lang.String r8 = r8.getLanguage()     // Catch:{ Exception -> 0x0464 }
            r2.put(r6, r8)     // Catch:{ Exception -> 0x0464 }
            goto L_0x046b
        L_0x0464:
            r0 = move-exception
            r6 = r0
            java.lang.String r8 = "Exception while collecting display language code. "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r8, r6)     // Catch:{ all -> 0x07fd }
        L_0x046b:
            java.lang.String r6 = "country"
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0479 }
            java.lang.String r8 = r8.getCountry()     // Catch:{ Exception -> 0x0479 }
            r2.put(r6, r8)     // Catch:{ Exception -> 0x0479 }
            goto L_0x0480
        L_0x0479:
            r0 = move-exception
            r6 = r0
            java.lang.String r8 = "Exception while collecting country name. "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r8, r6)     // Catch:{ all -> 0x07fd }
        L_0x0480:
            java.lang.String r6 = "platformextension"
            com.appsflyer.internal.an r8 = r1.onValidateInApp     // Catch:{ all -> 0x07fd }
            java.lang.String r8 = r8.AFKeystoreWrapper()     // Catch:{ all -> 0x07fd }
            r2.put(r6, r8)     // Catch:{ all -> 0x07fd }
            AFKeystoreWrapper((android.content.Context) r12, (java.util.Map<java.lang.String, ? super java.lang.String>) r2)     // Catch:{ all -> 0x07fd }
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x07fd }
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x07fd }
            r9 = r19
            r6.<init>(r9, r8)     // Catch:{ all -> 0x07fd }
            android.content.pm.PackageManager r8 = r12.getPackageManager()     // Catch:{ Exception -> 0x04af }
            java.lang.String r10 = r12.getPackageName()     // Catch:{ Exception -> 0x04af }
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r10, r7)     // Catch:{ Exception -> 0x04af }
            long r7 = r8.firstInstallTime     // Catch:{ Exception -> 0x04af }
            java.lang.String r10 = "installDate"
            java.lang.String r7 = valueOf((java.text.SimpleDateFormat) r6, (long) r7)     // Catch:{ Exception -> 0x04af }
            r2.put(r10, r7)     // Catch:{ Exception -> 0x04af }
            goto L_0x04b6
        L_0x04af:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "Exception while collecting install date. "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r8, r7)     // Catch:{ all -> 0x07fd }
        L_0x04b6:
            android.content.pm.PackageManager r7 = r12.getPackageManager()     // Catch:{ all -> 0x0566 }
            java.lang.String r8 = r12.getPackageName()     // Catch:{ all -> 0x0566 }
            r10 = 0
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r10)     // Catch:{ all -> 0x0566 }
            r8 = r18
            r18 = r15
            int r15 = r3.getInt(r8, r10)     // Catch:{ all -> 0x055c }
            int r10 = r7.versionCode     // Catch:{ all -> 0x055c }
            if (r10 <= r15) goto L_0x04d2
            AFInAppEventType((android.content.Context) r12, (java.lang.String) r8, (int) r10)     // Catch:{ all -> 0x055c }
        L_0x04d2:
            java.lang.String r8 = "app_version_code"
            int r10 = r7.versionCode     // Catch:{ all -> 0x055c }
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ all -> 0x055c }
            r2.put(r8, r10)     // Catch:{ all -> 0x055c }
            java.lang.String r8 = "app_version_name"
            java.lang.String r10 = r7.versionName     // Catch:{ all -> 0x055c }
            r2.put(r8, r10)     // Catch:{ all -> 0x055c }
            r15 = r13
            r8 = r14
            long r13 = r7.firstInstallTime     // Catch:{ all -> 0x0552 }
            r20 = r8
            long r7 = r7.lastUpdateTime     // Catch:{ all -> 0x054c }
            java.lang.String r10 = "date1"
            r22 = r15
            java.text.SimpleDateFormat r15 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0546 }
            r23 = r4
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x0542 }
            r15.<init>(r9, r4)     // Catch:{ all -> 0x0542 }
            r24 = r3
            java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x0540 }
            r3.<init>(r13)     // Catch:{ all -> 0x0540 }
            java.lang.String r3 = r15.format(r3)     // Catch:{ all -> 0x0540 }
            r2.put(r10, r3)     // Catch:{ all -> 0x0540 }
            java.lang.String r3 = "date2"
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0540 }
            r10.<init>(r9, r4)     // Catch:{ all -> 0x0540 }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x0540 }
            r4.<init>(r7)     // Catch:{ all -> 0x0540 }
            java.lang.String r4 = r10.format(r4)     // Catch:{ all -> 0x0540 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0540 }
            java.lang.String r3 = r1.values((java.text.SimpleDateFormat) r6, (android.content.Context) r12)     // Catch:{ all -> 0x0540 }
            r4 = 0
            int r6 = android.view.KeyEvent.normalizeMetaState(r4)     // Catch:{ all -> 0x0540 }
            int r6 = r6 + 15
            int r4 = android.text.TextUtils.indexOf(r11, r11)     // Catch:{ all -> 0x0540 }
            int r4 = 18 - r4
            int r7 = android.view.ViewConfiguration.getKeyRepeatTimeout()     // Catch:{ all -> 0x0540 }
            int r7 = r7 >> 16
            int r7 = 2096 - r7
            char r7 = (char) r7     // Catch:{ all -> 0x0540 }
            java.lang.String r4 = AFInAppEventType((int) r6, (int) r4, (char) r7)     // Catch:{ all -> 0x0540 }
            java.lang.String r4 = r4.intern()     // Catch:{ all -> 0x0540 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0540 }
            goto L_0x0577
        L_0x0540:
            r0 = move-exception
            goto L_0x0571
        L_0x0542:
            r0 = move-exception
            r24 = r3
            goto L_0x0571
        L_0x0546:
            r0 = move-exception
            r24 = r3
            r23 = r4
            goto L_0x0571
        L_0x054c:
            r0 = move-exception
            r24 = r3
            r23 = r4
            goto L_0x0559
        L_0x0552:
            r0 = move-exception
            r24 = r3
            r23 = r4
            r20 = r8
        L_0x0559:
            r22 = r15
            goto L_0x0571
        L_0x055c:
            r0 = move-exception
            r24 = r3
            r23 = r4
            r22 = r13
            r20 = r14
            goto L_0x0571
        L_0x0566:
            r0 = move-exception
            r24 = r3
            r23 = r4
            r22 = r13
            r20 = r14
            r18 = r15
        L_0x0571:
            r3 = r0
            java.lang.String r4 = "Exception while collecting app version data "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r4, r3)     // Catch:{ all -> 0x07fd }
        L_0x0577:
            boolean r3 = com.appsflyer.internal.C21935bt.AFInAppEventParameterName((android.content.Context) r12)     // Catch:{ all -> 0x07fd }
            r1.getInstance = r3     // Catch:{ all -> 0x07fd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "didConfigureTokenRefreshService="
            r3.<init>(r4)     // Catch:{ all -> 0x07fd }
            boolean r4 = r1.getInstance     // Catch:{ all -> 0x07fd }
            r3.append(r4)     // Catch:{ all -> 0x07fd }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x07fd }
            com.appsflyer.AFLogger.values(r3)     // Catch:{ all -> 0x07fd }
            boolean r3 = r1.getInstance     // Catch:{ all -> 0x07fd }
            if (r3 != 0) goto L_0x059b
            java.lang.String r3 = "tokenRefreshConfigured"
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x07fd }
            r2.put(r3, r4)     // Catch:{ all -> 0x07fd }
        L_0x059b:
            if (r5 == 0) goto L_0x05ce
            java.lang.String r3 = r1.onDeepLinking     // Catch:{ all -> 0x07fd }
            if (r3 == 0) goto L_0x05c4
            r3 = r17
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x07fd }
            if (r4 == 0) goto L_0x05af
            java.lang.String r3 = "Skip 'af' payload as deeplink was found by path"
            com.appsflyer.AFLogger.values(r3)     // Catch:{ all -> 0x07fd }
            goto L_0x05c4
        L_0x05af:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = r1.onDeepLinking     // Catch:{ all -> 0x07fd }
            r4.<init>(r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = "isPush"
            java.lang.String r7 = "true"
            r4.put(r6, r7)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x07fd }
            r2.put(r3, r4)     // Catch:{ all -> 0x07fd }
        L_0x05c4:
            r3 = 0
            r1.onDeepLinking = r3     // Catch:{ all -> 0x07fd }
            java.lang.String r3 = "open_referrer"
            r4 = r21
            r2.put(r3, r4)     // Catch:{ all -> 0x07fd }
        L_0x05ce:
            if (r5 != 0) goto L_0x0614
            com.appsflyer.internal.ac r3 = com.appsflyer.internal.C21850ac.AFInAppEventType((android.content.Context) r12)     // Catch:{ Exception -> 0x05fd }
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x05fd }
            r4.<init>()     // Catch:{ Exception -> 0x05fd }
            java.util.List r3 = r3.valueOf()     // Catch:{ Exception -> 0x05fd }
            boolean r6 = r3.isEmpty()     // Catch:{ Exception -> 0x05fd }
            if (r6 != 0) goto L_0x05f2
            com.appsflyer.internal.j r6 = new com.appsflyer.internal.j     // Catch:{ Exception -> 0x05fd }
            r6.<init>()     // Catch:{ Exception -> 0x05fd }
            java.util.Map r3 = r6.AFInAppEventParameterName(r3)     // Catch:{ Exception -> 0x05fd }
            java.lang.String r6 = "sensors"
            r4.put(r6, r3)     // Catch:{ Exception -> 0x05fd }
            goto L_0x05f9
        L_0x05f2:
            java.lang.String r3 = "sensors"
            java.lang.String r6 = "na"
            r4.put(r3, r6)     // Catch:{ Exception -> 0x05fd }
        L_0x05f9:
            r2.putAll(r4)     // Catch:{ Exception -> 0x05fd }
            goto L_0x0614
        L_0x05fd:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = "Unexpected exception from AFSensorManager: "
            r4.<init>(r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x07fd }
            r4.append(r3)     // Catch:{ all -> 0x07fd }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x07fd }
            com.appsflyer.AFLogger.AFInAppEventType((java.lang.String) r3)     // Catch:{ all -> 0x07fd }
        L_0x0614:
            java.lang.String r3 = valueOf((java.lang.String) r16)     // Catch:{ all -> 0x07fd }
            if (r3 != 0) goto L_0x062f
            com.appsflyer.internal.C22021z.valueOf(r12, r2)     // Catch:{ all -> 0x07fd }
            java.lang.String r3 = "GAID_retry"
            java.lang.String r4 = valueOf((java.lang.String) r16)     // Catch:{ all -> 0x07fd }
            if (r4 == 0) goto L_0x0627
            r4 = 1
            goto L_0x0628
        L_0x0627:
            r4 = 0
        L_0x0628:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x07fd }
            r2.put(r3, r4)     // Catch:{ all -> 0x07fd }
        L_0x062f:
            android.content.ContentResolver r3 = r12.getContentResolver()     // Catch:{ all -> 0x07fd }
            com.appsflyer.internal.h r3 = com.appsflyer.internal.C22021z.valueOf(r3)     // Catch:{ all -> 0x07fd }
            if (r3 == 0) goto L_0x064b
            java.lang.String r4 = "amazon_aid"
            java.lang.String r6 = r3.valueOf     // Catch:{ all -> 0x07fd }
            r2.put(r4, r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "amazon_aid_limit"
            java.lang.Boolean r3 = r3.AFInAppEventParameterName     // Catch:{ all -> 0x07fd }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x07fd }
            r2.put(r4, r3)     // Catch:{ all -> 0x07fd }
        L_0x064b:
            boolean r3 = com.appsflyer.internal.C21935bt.valueOf((android.content.SharedPreferences) r24)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "registeredUninstall"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x07fd }
            r2.put(r4, r3)     // Catch:{ all -> 0x07fd }
            r3 = r24
            int r4 = r1.valueOf((android.content.SharedPreferences) r3, (boolean) r5)     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = "counter"
            java.lang.String r7 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x07fd }
            r2.put(r6, r7)     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = "iaecounter"
            if (r20 == 0) goto L_0x066d
            r7 = 1
            goto L_0x066e
        L_0x066d:
            r7 = 0
        L_0x066e:
            int r7 = r1.values((android.content.SharedPreferences) r3, (boolean) r7)     // Catch:{ all -> 0x07fd }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x07fd }
            r2.put(r6, r7)     // Catch:{ all -> 0x07fd }
            if (r5 == 0) goto L_0x06f2
            java.util.Map r6 = AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x07fd }
            r1.AFInAppEventType((java.util.Map<java.lang.String, java.lang.Object>) r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r7 = "first_launch"
            r8 = 1
            if (r4 == r8) goto L_0x06a4
            r8 = 2
            if (r4 == r8) goto L_0x068c
        L_0x068a:
            r11 = 1
            goto L_0x06e6
        L_0x068c:
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x07fd }
            r9 = r18
            java.util.Map<java.lang.String, java.lang.Object> r11 = r9.AFInAppEventType     // Catch:{ all -> 0x07fd }
            r8.<init>(r11)     // Catch:{ all -> 0x07fd }
            boolean r11 = r8.isEmpty()     // Catch:{ all -> 0x07fd }
            if (r11 != 0) goto L_0x069e
            r6.put(r7, r8)     // Catch:{ all -> 0x07fd }
        L_0x069e:
            com.appsflyer.internal.bo r8 = r9.valueOf     // Catch:{ all -> 0x07fd }
            r8.valueOf(r7)     // Catch:{ all -> 0x07fd }
            goto L_0x068a
        L_0x06a4:
            r11 = r8
            r9 = r18
            r8 = r23
            r8.values = r11     // Catch:{ all -> 0x07fd }
            java.lang.String r8 = "waitForCustomerId"
            r10 = 0
            boolean r8 = AFInAppEventParameterName((java.lang.String) r8, (boolean) r10)     // Catch:{ all -> 0x07fd }
            if (r8 == 0) goto L_0x06bd
            java.lang.String r8 = "wait_cid"
            java.lang.String r13 = java.lang.Boolean.toString(r11)     // Catch:{ all -> 0x07fd }
            r2.put(r8, r13)     // Catch:{ all -> 0x07fd }
        L_0x06bd:
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x07fd }
            java.util.Map<java.lang.String, java.lang.Object> r13 = r9.AFKeystoreWrapper     // Catch:{ all -> 0x07fd }
            r8.<init>(r13)     // Catch:{ all -> 0x07fd }
            java.lang.String r13 = "ddl"
            com.appsflyer.internal.bo r14 = r9.valueOf     // Catch:{ all -> 0x07fd }
            r14.valueOf(r13)     // Catch:{ all -> 0x07fd }
            boolean r13 = r8.isEmpty()     // Catch:{ all -> 0x07fd }
            if (r13 != 0) goto L_0x06d6
            java.lang.String r13 = "ddl"
            r6.put(r13, r8)     // Catch:{ all -> 0x07fd }
        L_0x06d6:
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x07fd }
            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.AFInAppEventType     // Catch:{ all -> 0x07fd }
            r8.<init>(r9)     // Catch:{ all -> 0x07fd }
            boolean r9 = r8.isEmpty()     // Catch:{ all -> 0x07fd }
            if (r9 != 0) goto L_0x06e6
            r6.put(r7, r8)     // Catch:{ all -> 0x07fd }
        L_0x06e6:
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x07fd }
            if (r6 == 0) goto L_0x06f3
            java.lang.String r6 = "meta"
            r2.remove(r6)     // Catch:{ all -> 0x07fd }
            goto L_0x06f3
        L_0x06f2:
            r11 = 1
        L_0x06f3:
            java.lang.String r6 = "isFirstCall"
            boolean r7 = valueOf((android.content.SharedPreferences) r3)     // Catch:{ all -> 0x07fd }
            if (r7 != 0) goto L_0x06fc
            goto L_0x06fd
        L_0x06fc:
            r11 = 0
        L_0x06fd:
            java.lang.String r7 = java.lang.Boolean.toString(r11)     // Catch:{ all -> 0x07fd }
            r2.put(r6, r7)     // Catch:{ all -> 0x07fd }
            r1.AFInAppEventType(r12, r5, r2, r4)     // Catch:{ all -> 0x07fd }
            com.appsflyer.internal.ae r4 = new com.appsflyer.internal.ae     // Catch:{ all -> 0x07fd }
            r4.<init>()     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = com.appsflyer.internal.C21859ae.AFInAppEventType((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x07fd }
            java.lang.String r5 = "af_v"
            r2.put(r5, r4)     // Catch:{ all -> 0x07fd }
            com.appsflyer.internal.ae r4 = new com.appsflyer.internal.ae     // Catch:{ all -> 0x07fd }
            r4.<init>()     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = com.appsflyer.internal.C21859ae.AFInAppEventParameterName(r2)     // Catch:{ all -> 0x07fd }
            java.lang.String r5 = "af_v2"
            r2.put(r5, r4)     // Catch:{ all -> 0x07fd }
            boolean r4 = onAppOpenAttribution(r12)     // Catch:{ all -> 0x07fd }
            java.lang.String r5 = "ivc"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x07fd }
            r2.put(r5, r4)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "is_stop_tracking_used"
            boolean r4 = r3.contains(r4)     // Catch:{ all -> 0x07fd }
            if (r4 == 0) goto L_0x0748
            java.lang.String r4 = "istu"
            java.lang.String r5 = "is_stop_tracking_used"
            r6 = 0
            boolean r3 = r3.getBoolean(r5, r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x07fd }
            r2.put(r4, r3)     // Catch:{ all -> 0x07fd }
        L_0x0748:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x07fd }
            r3.<init>()     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "mcc"
            android.content.res.Resources r5 = r12.getResources()     // Catch:{ all -> 0x07fd }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x07fd }
            int r5 = r5.mcc     // Catch:{ all -> 0x07fd }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x07fd }
            r3.put(r4, r5)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "mnc"
            android.content.res.Resources r5 = r12.getResources()     // Catch:{ all -> 0x07fd }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x07fd }
            int r5 = r5.mnc     // Catch:{ all -> 0x07fd }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x07fd }
            r3.put(r4, r5)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = "cell"
            r2.put(r4, r3)     // Catch:{ all -> 0x07fd }
            java.lang.String r3 = "sig"
            r4 = r22
            android.app.Application r5 = r4.valueOf     // Catch:{ all -> 0x07fd }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x07fd }
            android.app.Application r4 = r4.valueOf     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = com.appsflyer.internal.C21845aa.AFInAppEventParameterName((android.content.pm.PackageManager) r5, (java.lang.String) r4)     // Catch:{ all -> 0x07fd }
            r2.put(r3, r4)     // Catch:{ all -> 0x07fd }
            java.lang.String r3 = "last_boot_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x07fd }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x07fd }
            long r4 = r4 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07fd }
            r2.put(r3, r4)     // Catch:{ all -> 0x07fd }
            java.lang.String r3 = "disk"
            android.os.StatFs r4 = new android.os.StatFs     // Catch:{ all -> 0x07fd }
            java.io.File r5 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x07fd }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x07fd }
            r4.<init>(r5)     // Catch:{ all -> 0x07fd }
            long r5 = r4.getBlockSizeLong()     // Catch:{ all -> 0x07fd }
            long r7 = r4.getAvailableBlocksLong()     // Catch:{ all -> 0x07fd }
            long r7 = r7 * r5
            long r9 = r4.getBlockCountLong()     // Catch:{ all -> 0x07fd }
            long r9 = r9 * r5
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            r11 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r4 = java.lang.Math.pow(r4, r11)     // Catch:{ all -> 0x07fd }
            double r6 = (double) r7     // Catch:{ all -> 0x07fd }
            double r6 = r6 / r4
            long r6 = (long) r6     // Catch:{ all -> 0x07fd }
            double r8 = (double) r9     // Catch:{ all -> 0x07fd }
            double r8 = r8 / r4
            long r4 = (long) r8     // Catch:{ all -> 0x07fd }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x07fd }
            r8.<init>()     // Catch:{ all -> 0x07fd }
            r8.append(r6)     // Catch:{ all -> 0x07fd }
            java.lang.String r6 = "/"
            r8.append(r6)     // Catch:{ all -> 0x07fd }
            r8.append(r4)     // Catch:{ all -> 0x07fd }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x07fd }
            r2.put(r3, r4)     // Catch:{ all -> 0x07fd }
            com.appsflyer.internal.k r3 = r1.getLevel     // Catch:{ all -> 0x07fd }
            if (r3 == 0) goto L_0x0806
            java.lang.String[] r3 = r3.values     // Catch:{ all -> 0x07fd }
            if (r3 == 0) goto L_0x0806
            java.lang.String r4 = "sharing_filter"
            r2.put(r4, r3)     // Catch:{ all -> 0x07fd }
            goto L_0x0806
        L_0x07f1:
            java.lang.String r3 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3)     // Catch:{ all -> 0x07fd }
            java.lang.String r3 = "AppsFlyer will not track this event."
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3)     // Catch:{ all -> 0x07fd }
            r2 = 0
            return r2
        L_0x07fd:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = r3.getLocalizedMessage()
            com.appsflyer.AFLogger.valueOf((java.lang.String) r4, (java.lang.Throwable) r3)
        L_0x0806:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21868ah.AFInAppEventType(com.appsflyer.internal.g):java.util.Map");
    }

    public static void AFKeystoreWrapper(Context context, Map<String, ? super String> map) {
        C22018y yVar = C22018y.C22019b.AFInAppEventType;
        C22018y.C22020d AFInAppEventParameterName2 = C22018y.AFInAppEventParameterName(context);
        map.put("network", AFInAppEventParameterName2.AFKeystoreWrapper);
        String str = AFInAppEventParameterName2.AFInAppEventParameterName;
        if (str != null) {
            int i = setUserEmails + 47;
            setCustomerIdAndLogSession = i % 128;
            if (!(i % 2 != 0)) {
                map.put("operator", str);
            } else {
                map.put("operator", str);
                throw null;
            }
        }
        String str2 = AFInAppEventParameterName2.valueOf;
        if (str2 != null) {
            int i2 = setCustomerIdAndLogSession + 27;
            setUserEmails = i2 % 128;
            char c = i2 % 2 == 0 ? '=' : 'Q';
            map.put("carrier", str2);
            if (c != 'Q') {
                throw null;
            }
        }
    }

    private static String AFInAppEventType(int i, int i2, char c) {
        String str;
        synchronized (C21986dg.AFInAppEventParameterName) {
            char[] cArr = new char[i];
            C21986dg.values = 0;
            while (true) {
                int i3 = C21986dg.values;
                if (i3 < i) {
                    cArr[i3] = (char) ((int) ((((long) setOutOfStore[i2 + i3]) ^ (((long) i3) * setPhoneNumber)) ^ ((long) c)));
                    C21986dg.values = i3 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }
}
