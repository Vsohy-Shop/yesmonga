package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.usabilla.sdk.ubform.sdk.passiveForm.C10087a;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.C12580l;
import org.json.JSONException;

/* renamed from: com.appsflyer.internal.aq */
public final class C21897aq {
    private long AFInAppEventParameterName;
    private int AFInAppEventType;
    @C12580l
    private String AFKeystoreWrapper;
    @C12580l
    private C21960cn AppsFlyer2dXConversionCallback;
    @C12580l
    private Throwable getLevel;
    @NonNull
    private String valueOf;
    private long values;

    public C21897aq() {
    }

    public static void AFInAppEventParameterName(String str, DeepLinkResult.Error error) {
        if (C21997i.AFKeystoreWrapper().AFInAppEventParameterName != null) {
            AFLogger.values("[DDL] Error occurred: ".concat(String.valueOf(str)));
            valueOf(new DeepLinkResult((DeepLink) null, error));
            return;
        }
        AFKeystoreWrapper(str);
    }

    public static void AFKeystoreWrapper(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (C21997i.AFKeystoreWrapper().AFInAppEventParameterName != null) {
            try {
                DeepLink AFInAppEventParameterName2 = DeepLink.AFInAppEventParameterName(map);
                AFInAppEventParameterName2.AFInAppEventParameterName.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(AFInAppEventParameterName2, (DeepLinkResult.Error) null);
            } catch (JSONException e) {
                AFLogger.valueOf("[DDL] Error occurred", (Throwable) e);
                deepLinkResult = new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.UNEXPECTED);
            } catch (Throwable th) {
                valueOf(new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null));
                throw th;
            }
            valueOf(deepLinkResult);
            return;
        }
        valueOf(map);
    }

    public static void valueOf(DeepLinkResult deepLinkResult) {
        if (C21997i.AFKeystoreWrapper().AFInAppEventParameterName != null) {
            StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            AFLogger.values(sb.toString());
            try {
                C21997i.AFKeystoreWrapper().AFInAppEventParameterName.onDeepLinking(deepLinkResult);
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper(th.getLocalizedMessage(), th);
            }
        } else {
            AFLogger.values("[DDL] skipping, no callback registered");
        }
    }

    public C21897aq(String str, String str2, long j, long j2, int i, C21960cn cnVar, Throwable th) {
        this.AFKeystoreWrapper = str;
        this.valueOf = str2;
        this.AFInAppEventParameterName = j;
        this.values = j2;
        this.AFInAppEventType = i;
        this.AppsFlyer2dXConversionCallback = cnVar;
        this.getLevel = th;
    }

    private static void valueOf(Map<String, String> map) {
        if (C21868ah.AFKeystoreWrapper != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.values(sb.toString());
                C21868ah.AFKeystoreWrapper.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper(th.getLocalizedMessage(), th);
            }
        }
    }

    private static void AFKeystoreWrapper(String str) {
        if (C21868ah.AFKeystoreWrapper != null) {
            try {
                AFLogger.values("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                C21868ah.AFKeystoreWrapper.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper(th.getLocalizedMessage(), th);
            }
        }
    }

    public final Map<String, Object> valueOf() {
        HashMap hashMap = new HashMap();
        hashMap.put("cdn_token", this.valueOf);
        String str = this.AFKeystoreWrapper;
        if (str != null) {
            hashMap.put("c_ver", str);
        }
        long j = this.AFInAppEventParameterName;
        if (j > 0) {
            hashMap.put("latency", Long.valueOf(j));
        }
        long j2 = this.values;
        if (j2 > 0) {
            hashMap.put("delay", Long.valueOf(j2));
        }
        int i = this.AFInAppEventType;
        if (i > 0) {
            hashMap.put("res_code", Integer.valueOf(i));
        }
        if (this.getLevel != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.getLevel.getClass().getSimpleName());
            sb.append(": ");
            sb.append(this.getLevel.getMessage());
            hashMap.put("error", sb.toString());
        }
        C21960cn cnVar = this.AppsFlyer2dXConversionCallback;
        if (cnVar != null) {
            hashMap.put(C10087a.f27734e, cnVar.toString());
        }
        return hashMap;
    }
}
