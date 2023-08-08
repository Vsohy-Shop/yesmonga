package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.internal.ak */
public final class C21884ak {
    @VisibleForTesting
    private static String AFInAppEventType;
    @VisibleForTesting
    private static String AFKeystoreWrapper;
    @NonNull
    public final List<Purchase> AFInAppEventParameterName;
    private final boolean AFVersionDeclaration;
    @Nullable
    public final Map<String, String> valueOf;
    private final boolean values;

    public C21884ak() {
    }

    public static void valueOf(String str) {
        if (AFInAppEventType == null) {
            values(AppsFlyerProperties.getInstance().getDevKey());
        }
        String str2 = AFInAppEventType;
        if (str2 != null) {
            AFLogger.AFKeystoreWrapper(str.replace(str2, AFKeystoreWrapper));
        }
    }

    public static void values(String str) {
        AFInAppEventType = str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        AFKeystoreWrapper = sb.toString();
    }

    public final boolean AFInAppEventType() {
        return this.values;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21884ak.class == obj.getClass()) {
            C21884ak akVar = (C21884ak) obj;
            if (this.values != akVar.values || this.AFVersionDeclaration != akVar.AFVersionDeclaration || !this.AFInAppEventParameterName.equals(akVar.AFInAppEventParameterName)) {
                return false;
            }
            Map<String, String> map = this.valueOf;
            Map<String, String> map2 = akVar.valueOf;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.values ? 1 : 0) * true) + (this.AFVersionDeclaration ? 1 : 0)) * 31) + this.AFInAppEventParameterName.hashCode()) * 31;
        Map<String, String> map = this.valueOf;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public C21884ak(boolean z, boolean z2, List<Purchase> list, Map<String, String> map) {
        this.values = z;
        this.AFVersionDeclaration = z2;
        this.AFInAppEventParameterName = list;
        this.valueOf = map;
    }

    public final boolean valueOf() {
        return this.AFVersionDeclaration;
    }
}
