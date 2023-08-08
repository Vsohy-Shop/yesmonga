package com.appsflyer;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import androidx.exifinterface.media.C19135a;
import com.appsflyer.internal.C21868ah;
import com.appsflyer.internal.C21886am;
import com.appsflyer.internal.C21916bb;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.EnergyLabelKt;
import com.urbanairship.AirshipConfigOptions;

public final class AFLogger {
    private static final long AFInAppEventParameterName = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private int AFKeystoreWrapper;

        private LogLevel(int i) {
            this.AFKeystoreWrapper = i;
        }

        public final int getLevel() {
            return this.AFKeystoreWrapper;
        }
    }

    public static void AFInAppEventParameterName(String str) {
        if (valueOf(LogLevel.WARNING)) {
            valueOf(str, false);
        }
        C21886am.AFKeystoreWrapper().valueOf(C19135a.f48841T4, valueOf(str, true));
    }

    public static void AFInAppEventType(String str, boolean z) {
        if (valueOf(LogLevel.INFO)) {
            valueOf(str, false);
        }
        if (z) {
            C21886am.AFKeystoreWrapper().valueOf("I", valueOf(str, true));
        }
    }

    public static void AFKeystoreWrapper(String str) {
        AFInAppEventType(str, true);
    }

    public static void AppsFlyer2dXConversionCallback(String str) {
        AFInAppEventParameterName(str);
    }

    @NonNull
    private static String valueOf(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt(AirshipConfigOptions.C35437b.f87191o0, LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - AFInAppEventParameterName);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public static void values(String str) {
        if (valueOf(LogLevel.DEBUG)) {
            valueOf(str, false);
        }
        C21886am.AFKeystoreWrapper().valueOf(EnergyLabelKt.f67709g, valueOf(str, true));
    }

    public static void AFKeystoreWrapper(String str, Throwable th) {
        valueOf(str, th, true, false);
    }

    public static void AFInAppEventType(String str) {
        if (valueOf(LogLevel.VERBOSE)) {
            valueOf(str, false);
        }
        C21886am.AFKeystoreWrapper().valueOf(C19135a.f48877X4, valueOf(str, true));
    }

    private static void valueOf(String str, Throwable th, boolean z, boolean z2) {
        long j;
        if (valueOf(LogLevel.ERROR)) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getClass().getSimpleName());
                sb.append(" at ");
                sb.append(th.getStackTrace()[0].toString());
                str = sb.toString();
            }
            valueOf(str, false);
        }
        C21886am.AFKeystoreWrapper().valueOf(th);
        Application application = C21916bb.AFInAppEventType;
        if (application != null) {
            SharedPreferences.Editor edit = C21868ah.valueOf((Context) application).edit();
            Application application2 = C21916bb.AFInAppEventType;
            if (application2 == null) {
                j = -1;
            } else {
                j = C21868ah.valueOf((Context) application2).getLong("exception_number", 0);
            }
            edit.putLong("exception_number", j + 1).apply();
        }
    }

    private static boolean AFInAppEventType() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void AFInAppEventType(Throwable th) {
        valueOf((String) null, th, false, false);
    }

    private static boolean valueOf(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt(AirshipConfigOptions.C35437b.f87191o0, LogLevel.NONE.getLevel());
    }

    public static void valueOf(String str) {
        if (!AFInAppEventType()) {
            valueOf(str, false);
        }
        C21886am.AFKeystoreWrapper().valueOf(EnergyLabelKt.f67711i, str);
    }

    public static void valueOf(String str, Throwable th) {
        valueOf(str, th, true, true);
    }
}
