package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import java.util.Map;

/* renamed from: com.appsflyer.internal.ce */
public abstract class C21951ce extends C21995g {
    private final boolean onAttributionFailureNative;
    public boolean onConversionDataSuccess;
    private final boolean onInstallConversionFailureNative;

    public C21951ce() {
        this((String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Context) null);
    }

    public final boolean AFVersionDeclaration() {
        return this.onConversionDataSuccess;
    }

    public final String AppsFlyer2dXConversionCallback() {
        return C22003k.AFKeystoreWrapper((Map<String, ?>) AFKeystoreWrapper()).toString();
    }

    public final boolean getLevel() {
        return this.onInstallConversionFailureNative;
    }

    public final boolean init() {
        return this.onAttributionFailureNative;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21951ce(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        boolean z = true;
        this.onAttributionFailureNative = bool != null ? bool.booleanValue() : true;
        this.onInstallConversionFailureNative = bool2 != null ? bool2.booleanValue() : z;
    }
}
