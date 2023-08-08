package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ap */
public final class C21896ap {
    @NonNull
    public final C21963cq AFInAppEventParameterName;
    private final boolean AFInAppEventType;
    @NonNull
    public final String AFKeystoreWrapper;
    @NonNull
    public final String values;

    public C21896ap() {
    }

    @Nullable
    public static JSONObject AFKeystoreWrapper(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            try {
                boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                if (!jSONObject2.optBoolean("monitor", false) || z) {
                    C21886am.AFKeystoreWrapper().AFInAppEventParameterName();
                    C21886am.AFKeystoreWrapper().valueOf();
                } else {
                    C21886am.AFKeystoreWrapper().AFInAppEventType();
                }
                if (!jSONObject2.has("ol_id")) {
                    return jSONObject2;
                }
                String optString = jSONObject2.optString("ol_scheme", (String) null);
                String optString2 = jSONObject2.optString("ol_domain", (String) null);
                String optString3 = jSONObject2.optString("ol_ver", (String) null);
                if (optString != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                }
                if (optString2 != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                }
                if (optString3 == null) {
                    return jSONObject2;
                }
                AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                return jSONObject2;
            } catch (Throwable th) {
                th = th;
                jSONObject = jSONObject2;
                AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                C21886am.AFKeystoreWrapper().AFInAppEventParameterName();
                C21886am.AFKeystoreWrapper().valueOf();
                return jSONObject;
            }
        } catch (Throwable th2) {
            th = th2;
            AFLogger.AFKeystoreWrapper(th.getMessage(), th);
            C21886am.AFKeystoreWrapper().AFInAppEventParameterName();
            C21886am.AFKeystoreWrapper().valueOf();
            return jSONObject;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21896ap.class != obj.getClass()) {
            return false;
        }
        C21896ap apVar = (C21896ap) obj;
        if (this.AFInAppEventType == apVar.AFInAppEventType && this.AFKeystoreWrapper.equals(apVar.AFKeystoreWrapper)) {
            return this.values.equals(apVar.values);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.AFInAppEventType ? 1 : 0) * true) + this.AFKeystoreWrapper.hashCode()) * 31) + this.values.hashCode();
    }

    public C21896ap(String str) throws JSONException {
        C21963cq cqVar;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("ver");
                this.AFKeystoreWrapper = string;
                this.AFInAppEventType = jSONObject.optBoolean("test_mode");
                this.values = str;
                if (string.startsWith("default")) {
                    cqVar = C21963cq.DEFAULT;
                } else {
                    cqVar = C21963cq.CUSTOM;
                }
                this.AFInAppEventParameterName = cqVar;
            } catch (JSONException unused) {
                throw new JSONException("Failed to parse remote configuration JSON");
            }
        } else {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
    }
}
