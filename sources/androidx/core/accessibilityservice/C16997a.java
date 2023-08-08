package androidx.core.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.core.accessibilityservice.a */
public final class C16997a {

    /* renamed from: a */
    public static final int f44920a = 1;

    /* renamed from: b */
    public static final int f44921b = 2;

    /* renamed from: c */
    public static final int f44922c = 4;

    /* renamed from: d */
    public static final int f44923d = 8;

    /* renamed from: e */
    public static final int f44924e = 32;

    /* renamed from: f */
    public static final int f44925f = -1;

    /* renamed from: g */
    public static final int f44926g = 2;

    /* renamed from: h */
    public static final int f44927h = 4;

    /* renamed from: i */
    public static final int f44928i = 8;

    /* renamed from: j */
    public static final int f44929j = 16;

    /* renamed from: k */
    public static final int f44930k = 32;

    @C0359n0
    /* renamed from: a */
    public static String m78684a(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @C0359n0
    /* renamed from: b */
    public static String m78685b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            i &= ~numberOfTrailingZeros;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            if (numberOfTrailingZeros == 1) {
                sb.append("FEEDBACK_SPOKEN");
            } else if (numberOfTrailingZeros == 2) {
                sb.append("FEEDBACK_HAPTIC");
            } else if (numberOfTrailingZeros == 4) {
                sb.append("FEEDBACK_AUDIBLE");
            } else if (numberOfTrailingZeros == 8) {
                sb.append("FEEDBACK_VISUAL");
            } else if (numberOfTrailingZeros == 16) {
                sb.append("FEEDBACK_GENERIC");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @C0363p0
    /* renamed from: c */
    public static String m78686c(int i) {
        if (i == 1) {
            return "DEFAULT";
        }
        if (i == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    /* renamed from: d */
    public static int m78687d(@C0359n0 AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @C0363p0
    /* renamed from: e */
    public static String m78688e(@C0359n0 AccessibilityServiceInfo accessibilityServiceInfo, @C0359n0 PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
