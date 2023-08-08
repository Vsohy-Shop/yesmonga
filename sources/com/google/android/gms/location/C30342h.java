package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.C0380x0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.Status;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.gms.location.h */
public interface C30342h {
    @RecentlyNonNull
    @C0380x0("android.permission.ACCESS_FINE_LOCATION")
    @Deprecated
    /* renamed from: a */
    C40663m<Status> mo85708a(@RecentlyNonNull C40507i iVar, @RecentlyNonNull List<C30331f> list, @RecentlyNonNull PendingIntent pendingIntent);

    @RecentlyNonNull
    /* renamed from: b */
    C40663m<Status> mo85709b(@RecentlyNonNull C40507i iVar, @RecentlyNonNull PendingIntent pendingIntent);

    @RecentlyNonNull
    @C0380x0("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: c */
    C40663m<Status> mo85710c(@RecentlyNonNull C40507i iVar, @RecentlyNonNull GeofencingRequest geofencingRequest, @RecentlyNonNull PendingIntent pendingIntent);

    @RecentlyNonNull
    /* renamed from: d */
    C40663m<Status> mo85711d(@RecentlyNonNull C40507i iVar, @RecentlyNonNull List<String> list);
}
