package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

/* renamed from: com.appsflyer.internal.ay */
public final class C21910ay implements C21930bo {
    private final SharedPreferences valueOf;

    public C21910ay(SharedPreferences sharedPreferences) {
        this.valueOf = sharedPreferences;
    }

    public final void AFInAppEventParameterName(String str, String str2) {
        this.valueOf.edit().putString(str, str2).apply();
    }

    public final int AFInAppEventType(String str) {
        try {
            return this.valueOf.getInt(str, 0);
        } catch (ClassCastException e) {
            AFLogger.AFKeystoreWrapper("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return 0;
        }
    }

    public final long AFKeystoreWrapper(String str) {
        try {
            return this.valueOf.getLong(str, 0);
        } catch (ClassCastException e) {
            AFLogger.AFKeystoreWrapper("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return 0;
        }
    }

    public final String valueOf(String str, String str2) {
        try {
            return this.valueOf.getString(str, str2);
        } catch (ClassCastException e) {
            AFLogger.AFKeystoreWrapper("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return str2;
        }
    }

    public final void values(String str, boolean z) {
        this.valueOf.edit().putBoolean(str, z).apply();
    }

    public final boolean AFInAppEventParameterName(String str) {
        try {
            return this.valueOf.getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLogger.AFKeystoreWrapper("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return false;
        }
    }

    public final void valueOf(String str, long j) {
        this.valueOf.edit().putLong(str, j).apply();
    }

    public final void valueOf(String str) {
        this.valueOf.edit().remove(str).apply();
    }
}
