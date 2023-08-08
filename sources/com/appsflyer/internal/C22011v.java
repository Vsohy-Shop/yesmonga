package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.urbanairship.AirshipConfigOptions;

/* renamed from: com.appsflyer.internal.v */
final class C22011v {

    /* renamed from: com.appsflyer.internal.v$c */
    public static final class C22012c {
        static final C22011v valueOf = new C22011v();
    }

    private static boolean AFInAppEventParameterName(@NonNull Context context, @NonNull String[] strArr) {
        for (String valueOf : strArr) {
            if (C21845aa.valueOf(context, valueOf)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final Location AFKeystoreWrapper(@NonNull Context context) {
        Location location;
        Location location2;
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (AFInAppEventParameterName(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
                location = locationManager.getLastKnownLocation("network");
            } else {
                location = null;
            }
            if (AFInAppEventParameterName(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
                location2 = locationManager.getLastKnownLocation("gps");
            } else {
                location2 = null;
            }
            if (location2 == null && location == null) {
                location = null;
            } else if (location2 != null || location == null) {
                if ((location == null && location2 != null) || AirshipConfigOptions.f87111Y >= location.getTime() - location2.getTime()) {
                    location = location2;
                }
            }
            if (location != null) {
                return location;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
