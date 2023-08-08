package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.cf */
public final class C21952cf {
    public final Map<String, Object> AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper;
    public final long[] AFLogger$LogLevel = new long[2];
    public long AFVersionDeclaration = 0;
    public final long[] AppsFlyer2dXConversionCallback = new long[2];
    public long getLevel = 0;
    public final long[] init = new long[2];
    private long onAttributionFailureNative = 0;
    public long onInstallConversionDataLoadedNative;
    public final C21930bo valueOf;
    public long values = 0;

    public C21952cf(C21930bo boVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.AFInAppEventType = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.AFKeystoreWrapper = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.AFInAppEventParameterName = concurrentHashMap3;
        this.valueOf = boVar;
        concurrentHashMap.putAll(values("first_launch"));
        concurrentHashMap2.putAll(values("ddl"));
        concurrentHashMap3.putAll(values("gcd"));
        this.onInstallConversionDataLoadedNative = (long) boVar.AFInAppEventType("prev_session_dur");
    }

    public final void AFInAppEventParameterName(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            long j = this.onAttributionFailureNative;
            if (j != 0) {
                this.AFInAppEventType.put("net", Long.valueOf(currentTimeMillis - j));
                this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject(this.AFInAppEventType).toString());
                return;
            }
            AFLogger.AFKeystoreWrapper("Metrics: launch start ts is missing");
        }
    }

    public final void AFInAppEventType() {
        this.AFVersionDeclaration = System.currentTimeMillis();
        if (valueOf()) {
            long j = this.values;
            if (j != 0) {
                this.AFInAppEventType.put("init_to_fg", Long.valueOf(this.AFVersionDeclaration - j));
                this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject(this.AFInAppEventType).toString());
                return;
            }
            AFLogger.AFKeystoreWrapper("Metrics: init ts is missing");
        }
    }

    public final void valueOf(C21948cb cbVar) {
        if (valueOf()) {
            this.AFInAppEventType.put("start_with", cbVar.toString());
            this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject(this.AFInAppEventType).toString());
        }
    }

    public final void values(DeepLinkResult deepLinkResult, long j) {
        this.AFKeystoreWrapper.put("status", deepLinkResult.getStatus().toString());
        this.AFKeystoreWrapper.put("timeout_value", Long.valueOf(j));
        this.valueOf.AFInAppEventParameterName("ddl", new JSONObject(this.AFKeystoreWrapper).toString());
    }

    private Map<String, Object> values(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String valueOf2 = this.valueOf.valueOf(str, (String) null);
        if (valueOf2 == null) {
            return emptyMap;
        }
        try {
            return C22003k.AFKeystoreWrapper(new JSONObject(valueOf2));
        } catch (Exception e) {
            AFLogger.valueOf("Error while parsing cached json data", (Throwable) e);
            return emptyMap;
        }
    }

    public final void valueOf(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.onAttributionFailureNative = currentTimeMillis;
        if (i == 1) {
            long j = this.AFVersionDeclaration;
            if (j != 0) {
                this.AFInAppEventType.put("from_fg", Long.valueOf(currentTimeMillis - j));
                this.valueOf.AFInAppEventParameterName("first_launch", new JSONObject(this.AFInAppEventType).toString());
                return;
            }
            AFLogger.AFKeystoreWrapper("Metrics: fg ts is missing");
        }
    }

    public final boolean valueOf() {
        return this.valueOf.AFInAppEventType("appsFlyerCount") == 0;
    }
}
