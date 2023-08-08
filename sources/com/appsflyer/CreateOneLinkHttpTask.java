package com.appsflyer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.appsflyer.internal.C21868ah;
import com.appsflyer.internal.C21882aj;
import com.appsflyer.internal.C22003k;
import com.appsflyer.share.LinkGenerator;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class CreateOneLinkHttpTask extends C21882aj {
    public ResponseListener AFKeystoreWrapper;
    private String AFLogger$LogLevel = "";
    private final Map<String, String> AFVersionDeclaration;
    private final String AppsFlyer2dXConversionCallback;
    public String valueOf;

    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask(@NonNull String str, @NonNull Map<String, String> map, C21868ah ahVar, @NonNull Context context) {
        super(ahVar, context, "POST");
        if (context != null) {
            this.AFLogger$LogLevel = context.getPackageName();
        } else {
            AFLogger.AppsFlyer2dXConversionCallback("CreateOneLinkHttpTask: context can't be null");
        }
        this.values = str;
        this.AppsFlyer2dXConversionCallback = "-1";
        this.AFVersionDeclaration = map;
    }

    public final void AFInAppEventParameterName(HttpsURLConnection httpsURLConnection) throws IOException {
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", this.AppsFlyer2dXConversionCallback);
        hashMap.put("uuid", this.getLevel);
        hashMap.put("data", this.AFVersionDeclaration);
        hashMap.put("meta", this.init);
        String str = this.valueOf;
        if (str != null) {
            hashMap.put("brand_domain", str);
        }
        String jSONObject = C22003k.AFKeystoreWrapper((Map<String, ?>) hashMap).toString();
        values(httpsURLConnection, this.AFInAppEventType, jSONObject);
        httpsURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(jSONObject);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    public final void AFKeystoreWrapper() {
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.values, AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN), this.AFLogger$LogLevel).addParameter("af_siteid", this.AFLogger$LogLevel).addParameters(this.AFVersionDeclaration);
        C21868ah.valueOf();
        String AFKeystoreWrapper2 = C21868ah.AFKeystoreWrapper();
        if (AFKeystoreWrapper2 != null) {
            addParameters.setReferrerCustomerId(AFKeystoreWrapper2);
        }
        this.AFKeystoreWrapper.onResponse(addParameters.generateLink());
    }

    public final String valueOf() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(C21882aj.AFInAppEventParameterName, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C21868ah.valueOf().getHostName()}));
        sb.append("/");
        sb.append(this.values);
        return sb.toString();
    }

    public final void values(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.AFKeystoreWrapper.onResponse(jSONObject.optString(keys.next()));
            }
        } catch (JSONException e) {
            this.AFKeystoreWrapper.onResponseError("Can't parse one link data");
            AFLogger.AFKeystoreWrapper("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }
}
