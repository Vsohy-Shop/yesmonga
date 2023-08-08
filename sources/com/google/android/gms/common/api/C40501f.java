package com.google.android.gms.common.api;

import androidx.annotation.C0359n0;
import com.google.zxing.client.android.C34659k;

/* renamed from: com.google.android.gms.common.api.f */
public class C40501f {

    /* renamed from: a */
    public static final int f103216a = -1;

    /* renamed from: b */
    public static final int f103217b = 0;
    @Deprecated

    /* renamed from: c */
    public static final int f103218c = 2;
    @Deprecated

    /* renamed from: d */
    public static final int f103219d = 3;

    /* renamed from: e */
    public static final int f103220e = 4;

    /* renamed from: f */
    public static final int f103221f = 5;

    /* renamed from: g */
    public static final int f103222g = 6;

    /* renamed from: h */
    public static final int f103223h = 7;

    /* renamed from: i */
    public static final int f103224i = 8;

    /* renamed from: j */
    public static final int f103225j = 10;

    /* renamed from: k */
    public static final int f103226k = 13;

    /* renamed from: l */
    public static final int f103227l = 14;

    /* renamed from: m */
    public static final int f103228m = 15;

    /* renamed from: n */
    public static final int f103229n = 16;

    /* renamed from: o */
    public static final int f103230o = 17;

    /* renamed from: p */
    public static final int f103231p = 19;

    /* renamed from: q */
    public static final int f103232q = 20;

    /* renamed from: r */
    public static final int f103233r = 21;

    /* renamed from: s */
    public static final int f103234s = 22;

    @C0359n0
    /* renamed from: a */
    public static String m164764a(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return C34659k.C34660a.f83884o;
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
            default:
                return "unknown status code: " + i;
        }
    }
}
