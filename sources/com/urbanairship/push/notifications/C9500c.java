package com.urbanairship.push.notifications;

import android.content.Context;
import android.widget.RemoteViews;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.core.app.C17075f2;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushMessage;

/* renamed from: com.urbanairship.push.notifications.c */
public class C9500c extends C9499b {

    /* renamed from: h */
    public final int f25934h;

    public C9500c(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions, @C0347i0 int i) {
        super(context, airshipConfigOptions);
        this.f25934h = i;
    }

    @C0359n0
    /* renamed from: l */
    public C17075f2.C17092g mo19275l(@C0359n0 Context context, @C0359n0 C17075f2.C17092g gVar, @C0359n0 C9510g gVar2) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), this.f25934h);
        mo19281r(remoteViews, gVar2);
        return gVar.mo51366R(remoteViews);
    }

    /* renamed from: r */
    public void mo19281r(@C0359n0 RemoteViews remoteViews, @C0359n0 C9510g gVar) {
        String str;
        PushMessage a = gVar.mo19313a();
        if (a.mo19155B() != null) {
            str = a.mo19155B();
        } else {
            str = UAirship.m146198j();
        }
        remoteViews.setTextViewText(16908310, str);
        remoteViews.setTextViewText(16908299, a.mo19171f());
        remoteViews.setTextViewText(16908304, a.mo19154A());
        remoteViews.setImageViewResource(16908294, mo19273j());
    }
}
