package com.google.android.gms.location;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C40501f;

/* renamed from: com.google.android.gms.location.g */
public final class C30338g extends C40501f {

    /* renamed from: t */
    public static final int f72794t = 1000;

    /* renamed from: u */
    public static final int f72795u = 1001;

    /* renamed from: v */
    public static final int f72796v = 1002;

    /* renamed from: w */
    public static final int f72797w = 1004;

    /* renamed from: x */
    public static final int f72798x = 1005;

    @RecentlyNonNull
    /* renamed from: a */
    public static String m122161a(int i) {
        switch (i) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            case 1004:
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
            default:
                return C40501f.m164764a(i);
        }
    }
}
