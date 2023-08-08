package com.urbanairship.push.notifications;

import android.app.Notification;
import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import com.urbanairship.push.PushMessage;

/* renamed from: com.urbanairship.push.notifications.n */
public interface C9524n {
    @C0359n0

    /* renamed from: a */
    public static final String f26024a = "com.urbanairship.default";

    @C0348i1
    /* renamed from: a */
    void mo19264a(@C0359n0 Context context, @C0359n0 Notification notification, @C0359n0 C9510g gVar);

    @C0348i1
    @C0359n0
    /* renamed from: b */
    C9525o mo19265b(@C0359n0 Context context, @C0359n0 C9510g gVar);

    @C0348i1
    @C0359n0
    /* renamed from: c */
    C9510g mo19266c(@C0359n0 Context context, @C0359n0 PushMessage pushMessage);
}
