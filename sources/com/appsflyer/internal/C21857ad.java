package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.C21882aj;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.urbanairship.analytics.C35557k;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ad */
public final class C21857ad implements Runnable {
    private static String AFInAppEventParameterName = "https://%ssdk-services.%s/validate-android-signature";
    private static String valueOf;
    private String AFInAppEventType;
    private String AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    /* access modifiers changed from: private */
    public Map<String, String> getLevel;
    private String init;
    /* access modifiers changed from: private */
    public WeakReference<Context> values;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(C21868ah.values);
        sb.append("/androidevent?buildnumber=6.5.2&app_id=");
        valueOf = sb.toString();
    }

    public C21857ad(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.values = new WeakReference<>(context);
        this.AFInAppEventType = str;
        this.AFKeystoreWrapper = str2;
        this.AFLogger$LogLevel = str4;
        this.init = str5;
        this.AppsFlyer2dXConversionCallback = str6;
        this.getLevel = map;
        this.AFVersionDeclaration = str3;
    }

    private static HttpURLConnection AFInAppEventParameterName(@NonNull C21955ci ciVar) {
        StringBuilder sb = new StringBuilder("Calling ");
        sb.append(ciVar.onDeepLinkingNative);
        AFLogger.values(sb.toString());
        ciVar.onConversionDataSuccess = AppsFlyerLib.getInstance().isStopped();
        return new C21882aj.C21883a(ciVar).AFInAppEventParameterName();
    }

    public static /* synthetic */ void AFInAppEventType(C21857ad adVar, Map map, Map map2, WeakReference weakReference) {
        int i;
        if (weakReference.get() != null) {
            C21850ac.AFInAppEventType((Context) weakReference.get()).values();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C21868ah.valueOf().getHostName()}));
            sb.append(((Context) weakReference.get()).getPackageName());
            String obj = sb.toString();
            String string = C21868ah.valueOf((Context) weakReference.get()).getString(C35557k.f87781a, "");
            C21961co coVar = new C21961co((Context) weakReference.get());
            coVar.AFLogger$LogLevel = adVar.AFInAppEventType;
            coVar.init = string;
            C21868ah valueOf2 = C21868ah.valueOf();
            Map<String, Object> AFInAppEventType2 = valueOf2.AFInAppEventType((C21995g) coVar);
            AFInAppEventType2.put("price", adVar.init);
            AFInAppEventType2.put(FirebaseAnalytics.C32532b.f78955i, adVar.AppsFlyer2dXConversionCallback);
            AFInAppEventType2.put("receipt_data", map);
            if (map2 != null) {
                AFInAppEventType2.put("extra_prms", map2);
            }
            AFInAppEventType2.putAll(valueOf2.init());
            C21886am.AFKeystoreWrapper().AFInAppEventParameterName(obj, new JSONObject(AFInAppEventType2).toString());
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection AFInAppEventParameterName2 = AFInAppEventParameterName((C21955ci) coVar.valueOf((Map<String, ?>) AFInAppEventType2).AFKeystoreWrapper(obj));
                if (AFInAppEventParameterName2 != null) {
                    i = AFInAppEventParameterName2.getResponseCode();
                } else {
                    i = -1;
                }
                String AFKeystoreWrapper2 = C21868ah.AFKeystoreWrapper(AFInAppEventParameterName2);
                C21886am.AFKeystoreWrapper().AFKeystoreWrapper(obj, i, AFKeystoreWrapper2);
                StringBuilder sb2 = new StringBuilder("Validate-WH response - ");
                sb2.append(i);
                sb2.append(": ");
                sb2.append(new JSONObject(AFKeystoreWrapper2).toString());
                AFLogger.AFKeystoreWrapper(sb2.toString());
                if (AFInAppEventParameterName2 != null) {
                    AFInAppEventParameterName2.disconnect();
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    public final void run() {
        int i;
        String str = this.AFInAppEventType;
        if (str != null && str.length() != 0 && !AppsFlyerLib.getInstance().isStopped()) {
            HttpURLConnection httpURLConnection = null;
            try {
                Context context = this.values.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.AFKeystoreWrapper);
                    hashMap.put("sig-data", this.AFLogger$LogLevel);
                    hashMap.put("signature", this.AFVersionDeclaration);
                    final HashMap hashMap2 = new HashMap(hashMap);
                    new Thread(new Runnable() {
                        public final void run() {
                            C21857ad adVar = C21857ad.this;
                            C21857ad.AFInAppEventType(adVar, hashMap2, adVar.getLevel, C21857ad.this.values);
                        }
                    }).start();
                    hashMap.put("dev_key", this.AFInAppEventType);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    String string = AppsFlyerProperties.getInstance().getString("advertiserId");
                    if (string != null) {
                        hashMap.put("advertiserId", string);
                    }
                    String jSONObject = new JSONObject(hashMap).toString();
                    String format = String.format(AFInAppEventParameterName, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C21868ah.valueOf().getHostName()});
                    C21886am.AFKeystoreWrapper().AFInAppEventParameterName(format, jSONObject);
                    HttpURLConnection AFInAppEventParameterName2 = AFInAppEventParameterName((C21955ci) new C21957ck().valueOf((Map<String, ?>) hashMap).AFKeystoreWrapper(format));
                    if (AFInAppEventParameterName2 != null) {
                        i = AFInAppEventParameterName2.getResponseCode();
                    } else {
                        i = -1;
                    }
                    C21868ah.valueOf();
                    String AFKeystoreWrapper2 = C21868ah.AFKeystoreWrapper(AFInAppEventParameterName2);
                    C21886am.AFKeystoreWrapper().AFKeystoreWrapper(format, i, AFKeystoreWrapper2);
                    JSONObject jSONObject2 = new JSONObject(AFKeystoreWrapper2);
                    jSONObject2.put("code", i);
                    if (i == 200) {
                        StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                        sb.append(jSONObject2.toString());
                        AFLogger.AFKeystoreWrapper(sb.toString());
                        AFInAppEventParameterName(jSONObject2.optBoolean("result"), this.AFLogger$LogLevel, this.init, this.AppsFlyer2dXConversionCallback, jSONObject2.toString());
                    } else {
                        AFLogger.AFKeystoreWrapper("Failed Validate request");
                        AFInAppEventParameterName(false, this.AFLogger$LogLevel, this.init, this.AppsFlyer2dXConversionCallback, jSONObject2.toString());
                    }
                    if (AFInAppEventParameterName2 != null) {
                        AFInAppEventParameterName2.disconnect();
                    }
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    private static void AFInAppEventParameterName(boolean z, String str, String str2, String str3, String str4) {
        if (C21868ah.AFInAppEventType != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.values(sb.toString());
            if (z) {
                AFLogger.values("Validate in app purchase success: ".concat(String.valueOf(str4)));
                C21868ah.AFInAppEventType.onValidateInApp();
                return;
            }
            AFLogger.values("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = C21868ah.AFInAppEventType;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
