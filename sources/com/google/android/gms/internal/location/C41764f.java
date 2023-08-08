package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C30331f;
import com.google.android.gms.location.C30342h;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.zzbq;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.f */
public final class C41764f implements C30342h {
    @Deprecated
    /* renamed from: a */
    public final C40663m<Status> mo85708a(C40507i iVar, List<C30331f> list, PendingIntent pendingIntent) {
        GeofencingRequest.C30308a aVar = new GeofencingRequest.C30308a();
        aVar.mo85563b(list);
        aVar.mo85565d(5);
        return iVar.mo133753m(new C41755c(this, iVar, aVar.mo85564c(), pendingIntent));
    }

    /* renamed from: b */
    public final C40663m<Status> mo85709b(C40507i iVar, PendingIntent pendingIntent) {
        return mo136191e(iVar, zzbq.m122235Q(pendingIntent));
    }

    /* renamed from: c */
    public final C40663m<Status> mo85710c(C40507i iVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return iVar.mo133753m(new C41755c(this, iVar, geofencingRequest, pendingIntent));
    }

    /* renamed from: d */
    public final C40663m<Status> mo85711d(C40507i iVar, List<String> list) {
        return mo136191e(iVar, zzbq.m122234M(list));
    }

    /* renamed from: e */
    public final C40663m<Status> mo136191e(C40507i iVar, zzbq zzbq) {
        return iVar.mo133753m(new C41758d(this, iVar, zzbq));
    }
}
