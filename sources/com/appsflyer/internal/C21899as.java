package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.google.android.datatransport.cct.C40045d;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.as */
final class C21899as extends C21882aj {
    C21900d AFKeystoreWrapper;
    private String AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    boolean valueOf = false;

    /* renamed from: com.appsflyer.internal.as$d */
    public interface C21900d {
        void AFInAppEventParameterName(String str);

        void values(Map<String, String> map);
    }

    public C21899as(Uri uri, C21868ah ahVar, Context context) {
        super(ahVar, context, "GET");
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            String[] strArr = {"onelink.me", "onelnk.com", "app.aflink.com"};
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                if (uri.getHost().contains(strArr[i])) {
                    z = true;
                }
            }
            if (C21997i.AFLogger$LogLevel != null) {
                StringBuilder sb = new StringBuilder("Validate if link ");
                sb.append(uri);
                sb.append(" belongs to custom domains: ");
                sb.append(Arrays.asList(C21997i.AFLogger$LogLevel));
                AFLogger.AFInAppEventType(sb.toString());
                for (String str : C21997i.AFLogger$LogLevel) {
                    if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                        AFLogger.values("Link matches custom domain: ".concat(String.valueOf(str)));
                        this.valueOf = true;
                        z = true;
                    }
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.values = split[1];
                this.AppsFlyer2dXConversionCallback = split[2];
                this.AFVersionDeclaration = uri.toString();
            }
        }
    }

    public final void AFInAppEventParameterName(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestProperty("Af-UUID", this.getLevel);
        String valueOf2 = String.valueOf(this.init.get("build_number"));
        httpsURLConnection.setRequestProperty("Af-Meta-Sdk-Ver", valueOf2);
        httpsURLConnection.setRequestProperty("Af-Meta-Counter", String.valueOf(this.init.get("counter")));
        httpsURLConnection.setRequestProperty("Af-Meta-Model", String.valueOf(this.init.get(C40045d.f102104u)));
        httpsURLConnection.setRequestProperty("Af-Meta-Platform", String.valueOf(this.init.get("platformextension")));
        httpsURLConnection.setRequestProperty("Af-Meta-System-Version", String.valueOf(this.init.get("sdk")));
        values(httpsURLConnection, this.AFInAppEventType, this.getLevel, this.values, this.AppsFlyer2dXConversionCallback, valueOf2);
    }

    public final void AFKeystoreWrapper() {
        String str = this.AFVersionDeclaration;
        if (str == null) {
            str = "Can't get OneLink data";
        }
        this.AFKeystoreWrapper.AFInAppEventParameterName(str);
    }

    public final String valueOf() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(C21882aj.AFInAppEventParameterName, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C21868ah.valueOf().getHostName()}));
        sb.append("/");
        sb.append(this.values);
        sb.append("?id=");
        sb.append(this.AppsFlyer2dXConversionCallback);
        return sb.toString();
    }

    public final boolean values() {
        return !TextUtils.isEmpty(this.values) && !TextUtils.isEmpty(this.AppsFlyer2dXConversionCallback) && !this.values.equals(FirebaseMessaging.f80405r);
    }

    public final void values(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.AFKeystoreWrapper.values(hashMap);
        } catch (JSONException e) {
            this.AFKeystoreWrapper.AFInAppEventParameterName("Can't parse OneLink data");
            AFLogger.AFKeystoreWrapper("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }
}
