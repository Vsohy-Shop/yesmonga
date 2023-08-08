package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.C0380x0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.b */
public interface C30315b {
    @RecentlyNonNull
    @C0380x0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    C40663m<Status> mo85642a(@RecentlyNonNull C40507i iVar, @RecentlyNonNull PendingIntent pendingIntent);

    @RecentlyNonNull
    @C0380x0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: b */
    C40663m<Status> mo85643b(@RecentlyNonNull C40507i iVar, long j, @RecentlyNonNull PendingIntent pendingIntent);
}
