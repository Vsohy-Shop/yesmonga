package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.bz */
public final class C21943bz {
    public static Map<String, Object> AFKeystoreWrapper(String str) {
        Object obj;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!next.equals("is_cache")) {
                    if (jSONObject.isNull(next)) {
                        obj = null;
                    } else {
                        obj = jSONObject.get(next);
                    }
                    hashMap.put(next, obj);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.AFKeystoreWrapper(e.getMessage(), e);
            return null;
        }
    }

    public static void valueOf(C21868ah ahVar, C21995g gVar, String str, Context context, SharedPreferences sharedPreferences, Integer num, Throwable th) {
        C21868ah ahVar2 = ahVar;
        Context context2 = context;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (gVar.AFInAppEventType()) {
            if (C21868ah.AFKeystoreWrapper == null) {
                AFLogger.values("[GCD-E01] AppsFlyerConversionListener is null - skip gcd");
                return;
            }
            StringBuilder sb = new StringBuilder("[GCD-A01] Loading conversion data. Counter: ");
            sb.append(gVar.onAppOpenAttributionNative);
            AFLogger.values(sb.toString());
            long j = sharedPreferences2.getLong("appsflyerConversionDataCacheExpiration", 0);
            if (j != 0 && System.currentTimeMillis() - j > 5184000000L) {
                AFLogger.values("[GCD-E02] Cached conversion data expired");
                C21868ah.values(context2, "sixtyDayConversionData");
                C21868ah.AFKeystoreWrapper(context2, "attributionId", (String) null);
                ahVar.valueOf(context2, "appsflyerConversionDataCacheExpiration", 0);
            }
            if (sharedPreferences2.getString("attributionId", (String) null) != null) {
                if (ahVar.valueOf(sharedPreferences2, false) > 1) {
                    try {
                        Map<String, Object> values = values(context);
                        if (values != null) {
                            try {
                                if (!values.containsKey("is_first_launch")) {
                                    values.put("is_first_launch", Boolean.FALSE);
                                }
                                C21942by.AFInAppEventParameterName(values);
                            } catch (Throwable th2) {
                                AFLogger.AFKeystoreWrapper(th2.getLocalizedMessage(), th2);
                            }
                        }
                    } catch (C21934bs e) {
                        AFLogger.AFKeystoreWrapper(e.getMessage(), e);
                    }
                }
            } else if (th != null) {
                StringBuilder sb2 = new StringBuilder("Launch exception: ");
                sb2.append(th.getMessage());
                C21942by.AFInAppEventType(sb2.toString());
            } else if (num.intValue() != 200) {
                C21942by.AFInAppEventType("Launch status code: ".concat(String.valueOf(num)));
            } else {
                C21942by byVar = new C21942by(ahVar, (Application) context.getApplicationContext(), str);
                C21868ah.AFKeystoreWrapper(byVar.AFInAppEventType, byVar, 10, TimeUnit.MILLISECONDS);
            }
        }
    }

    public static Map<String, Object> values(Context context) throws C21934bs {
        String string = C21868ah.valueOf(context).getString("attributionId", (String) null);
        if (string != null && string.length() > 0) {
            return AFKeystoreWrapper(string);
        }
        throw new C21934bs();
    }
}
