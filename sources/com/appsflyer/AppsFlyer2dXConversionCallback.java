package com.appsflyer;

import android.support.annotation.NonNull;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;

public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, CreateOneLinkHttpTask.ResponseListener, DeepLinkListener {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[Catch:{ JSONException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f A[Catch:{ JSONException -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void values(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0043 }
            r0.<init>()     // Catch:{ JSONException -> 0x0043 }
            java.lang.String r1 = "status"
            java.lang.String r2 = "failure"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0043 }
            java.lang.String r1 = "data"
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0043 }
            int r5 = r4.hashCode()     // Catch:{ JSONException -> 0x0043 }
            r1 = -1390007222(0xffffffffad262c4a, float:-9.445842E-12)
            r2 = 1
            if (r5 == r1) goto L_0x002b
            r1 = 1050716216(0x3ea0a838, float:0.3137834)
            if (r5 == r1) goto L_0x0021
            goto L_0x0035
        L_0x0021:
            java.lang.String r5 = "onInstallConversionFailure"
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x0043 }
            if (r4 == 0) goto L_0x0035
            r4 = 0
            goto L_0x0036
        L_0x002b:
            java.lang.String r5 = "onAttributionFailure"
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x0043 }
            if (r4 == 0) goto L_0x0035
            r4 = r2
            goto L_0x0036
        L_0x0035:
            r4 = -1
        L_0x0036:
            if (r4 == 0) goto L_0x003f
            if (r4 == r2) goto L_0x003b
            goto L_0x003e
        L_0x003b:
            r3.onAttributionFailureNative(r0)     // Catch:{ JSONException -> 0x0043 }
        L_0x003e:
            return
        L_0x003f:
            r3.onInstallConversionFailureNative(r0)     // Catch:{ JSONException -> 0x0043 }
            return
        L_0x0043:
            r4 = move-exception
            r4.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyer2dXConversionCallback.values(java.lang.String, java.lang.String):void");
    }

    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    public void onAttributionFailure(String str) {
        values("onInstallConversionFailure", str);
    }

    public native void onAttributionFailureNative(Object obj);

    public void onConversionDataFail(String str) {
        values("onAttributionFailure", str);
    }

    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    public void onDeepLinking(@NonNull DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(@NonNull DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    public void onResponse(String str) {
        onResponseNative(str);
    }

    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);
}
