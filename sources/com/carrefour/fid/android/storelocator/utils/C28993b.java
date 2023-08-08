package com.carrefour.fid.android.storelocator.utils;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreAddress;
import com.carrefour.fid.android.domain.models.service.models.StoreCoordinates;
import com.google.android.material.badge.C31132a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.storelocator.utils.b */
public final class C28993b {
    @C12579k

    /* renamed from: a */
    public static final C28993b f71084a = new C28993b();

    /* renamed from: b */
    public static final int f71085b = 0;

    @C12579k
    /* renamed from: a */
    public final String mo84428a(@C12580l Location location, @C12579k C38163l lVar) {
        boolean z;
        double d;
        StoreCoordinates k;
        String f;
        StoreCoordinates k2;
        String e;
        Intrinsics.checkNotNullParameter(lVar, "store");
        if (location != null) {
            double d2 = 0.0d;
            boolean z2 = true;
            if (location.getLatitude() == 0.0d) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (location.getLongitude() != 0.0d) {
                    z2 = false;
                }
                if (!z2) {
                    Location location2 = new Location("");
                    StoreAddress v = lVar.mo119392v();
                    if (v == null || (k2 = v.mo119130k()) == null || (e = k2.mo119145e()) == null) {
                        d = 0.0d;
                    } else {
                        d = Double.parseDouble(e);
                    }
                    location2.setLatitude(d);
                    StoreAddress v2 = lVar.mo119392v();
                    if (!(v2 == null || (k = v2.mo119130k()) == null || (f = k.mo119147f()) == null)) {
                        d2 = Double.parseDouble(f);
                    }
                    location2.setLongitude(d2);
                    Location location3 = new Location("");
                    location3.setLatitude(location.getLatitude());
                    location3.setLongitude(location.getLongitude());
                    float f2 = (float) 1000;
                    if (((int) (location2.distanceTo(location3) / f2)) == 0) {
                        return ((int) location2.distanceTo(location3)) + " m";
                    }
                    return ((int) (location2.distanceTo(location3) / f2)) + " km";
                }
            }
        }
        return "";
    }

    @C12580l
    /* renamed from: b */
    public final Intent mo84429b(@C12579k C38163l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "mStore");
        StoreAddress v = lVar.mo119392v();
        if (v != null) {
            return f71084a.mo84430c(v);
        }
        return null;
    }

    @C12579k
    /* renamed from: c */
    public final Intent mo84430c(@C12579k StoreAddress storeAddress) {
        String str;
        Intrinsics.checkNotNullParameter(storeAddress, "address");
        StoreCoordinates k = storeAddress.mo119130k();
        String str2 = null;
        if (k != null) {
            str = k.mo119145e();
        } else {
            str = null;
        }
        StoreCoordinates k2 = storeAddress.mo119130k();
        if (k2 != null) {
            str2 = k2.mo119147f();
        }
        return new Intent("android.intent.action.VIEW", Uri.parse("geo:" + str + "," + str2 + "?q=" + storeAddress.mo119126h() + C31132a.f74628J0 + storeAddress.mo119131l() + C31132a.f74628J0 + storeAddress.mo119129j()));
    }
}
