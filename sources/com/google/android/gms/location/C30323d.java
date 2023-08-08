package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.C0380x0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.d */
public interface C30323d {
    @RecentlyNonNull
    @Deprecated

    /* renamed from: a */
    public static final String f72772a = "com.google.android.location.LOCATION";
    @RecentlyNonNull

    /* renamed from: b */
    public static final String f72773b = "mockLocation";

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    C40663m<Status> mo85656a(@RecentlyNonNull C40507i iVar, @RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull PendingIntent pendingIntent);

    @RecentlyNonNull
    /* renamed from: b */
    C40663m<Status> mo85657b(@RecentlyNonNull C40507i iVar, @RecentlyNonNull C30354k kVar);

    @RecentlyNonNull
    /* renamed from: c */
    C40663m<Status> mo85658c(@RecentlyNonNull C40507i iVar, @RecentlyNonNull PendingIntent pendingIntent);

    @RecentlyNonNull
    /* renamed from: d */
    C40663m<Status> mo85659d(@RecentlyNonNull C40507i iVar, @RecentlyNonNull C30358l lVar);

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: e */
    C40663m<Status> mo85660e(@RecentlyNonNull C40507i iVar, boolean z);

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: f */
    C40663m<Status> mo85661f(@RecentlyNonNull C40507i iVar, @RecentlyNonNull Location location);

    @RecentlyNonNull
    /* renamed from: g */
    C40663m<Status> mo85662g(@RecentlyNonNull C40507i iVar);

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: h */
    Location mo85663h(@RecentlyNonNull C40507i iVar);

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: i */
    C40663m<Status> mo85664i(@RecentlyNonNull C40507i iVar, @RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull C30354k kVar, @RecentlyNonNull Looper looper);

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: j */
    C40663m<Status> mo85665j(@RecentlyNonNull C40507i iVar, @RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull C30358l lVar);

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: k */
    C40663m<Status> mo85666k(@RecentlyNonNull C40507i iVar, @RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull C30358l lVar, @RecentlyNonNull Looper looper);

    @RecentlyNonNull
    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: l */
    LocationAvailability mo85667l(@RecentlyNonNull C40507i iVar);
}
