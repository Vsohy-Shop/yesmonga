package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appsflyer.internal.g */
public abstract class C21995g {
    @Nullable
    AppsFlyerRequestListener AFInAppEventParameterName;
    @Nullable
    public Application AFInAppEventType;
    @Nullable
    String AFKeystoreWrapper;
    public String AFLogger$LogLevel;
    byte[] AFVersionDeclaration;
    String AppsFlyer2dXConversionCallback;
    String getLevel;
    String init;
    public int onAppOpenAttributionNative;
    private final boolean onAttributionFailureNative;
    String onDeepLinkingNative;
    boolean onInstallConversionDataLoadedNative;
    public final Map<String, Object> valueOf;
    @Nullable
    Map<String, Object> values;

    public C21995g() {
        this((String) null, (String) null, (Boolean) null, (Context) null);
    }

    public final byte[] AFInAppEventParameterName() {
        return this.AFVersionDeclaration;
    }

    public final boolean AFInAppEventType() {
        return this.onInstallConversionDataLoadedNative;
    }

    public C21995g AFKeystoreWrapper(String str) {
        this.onDeepLinkingNative = str;
        return this;
    }

    public final C21995g valueOf(Map<String, ?> map) {
        this.valueOf.putAll(map);
        return this;
    }

    public C21995g(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Context context) {
        this.valueOf = new HashMap();
        this.getLevel = str;
        this.onDeepLinkingNative = str2;
        this.onAttributionFailureNative = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.AFInAppEventType = (Application) context.getApplicationContext();
        }
    }

    public final Map<String, Object> AFKeystoreWrapper() {
        return this.valueOf;
    }

    public final boolean valueOf() {
        return this.onAttributionFailureNative;
    }

    @NonNull
    public final String valueOf(String str) {
        String values2 = C21868ah.valueOf().values((Context) this.AFInAppEventType);
        return values2 != null ? Uri.parse(str).buildUpon().appendQueryParameter("channel", values2).build().toString() : str;
    }
}
