package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AppsFlyerLib;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.bh */
public final class C21923bh {
    @VisibleForTesting
    public static String AFInAppEventParameterName = "https://cdn-settings.appsflyersdk.com/android/v1/%s/settings";
    @VisibleForTesting
    private static String AFKeystoreWrapper = "https://%smonitorsdk.%s/remote-debug?app_id=";
    @VisibleForTesting
    public static String valueOf = "https://cdn-testsettings.appsflyersdk.com/android/v1/%s/settings";
    public final C22015x AFInAppEventType;
    public final C22010u values;

    public C21923bh(C22010u uVar, C22015x xVar) {
        this.values = uVar;
        this.AFInAppEventType = xVar;
    }

    @NonNull
    public final C21921bg<String> AFInAppEventType(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C21868ah.valueOf().getHostName()}));
        sb.append(this.AFInAppEventType.valueOf.getPackageName());
        C21846ab abVar = new C21846ab(sb.toString(), new JSONObject(map).toString().getBytes(), "POST", Collections.emptyMap(), false);
        C22010u uVar = this.values;
        return new C21921bg<>(abVar, uVar.valueOf, uVar.AFInAppEventParameterName, new C21928bm());
    }
}
