package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.datatransport.C40087h;
import com.google.android.gms.common.annotation.C40473a;
import com.google.firebase.C33033f;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32584h;
import com.google.firebase.components.C32608v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.events.C33032d;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.C33088k;
import com.google.firebase.platforminfo.C33507h;
import com.google.firebase.platforminfo.C33509i;
import java.util.Arrays;
import java.util.List;

@C40473a
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C32584h hVar) {
        return new FirebaseMessaging((C33033f) hVar.get(C33033f.class), (FirebaseInstanceIdInternal) hVar.get(FirebaseInstanceIdInternal.class), hVar.mo94710h(C33509i.class), hVar.mo94710h(HeartBeatInfo.class), (C33088k) hVar.get(C33088k.class), (C40087h) hVar.get(C40087h.class), (C33032d) hVar.get(C33032d.class));
    }

    @Keep
    public List<C32580g<?>> getComponents() {
        return Arrays.asList(new C32580g[]{C32580g.m131636h(FirebaseMessaging.class).mo94699h(LIBRARY_NAME).mo94693b(C32608v.m131747m(C33033f.class)).mo94693b(C32608v.m131743i(FirebaseInstanceIdInternal.class)).mo94693b(C32608v.m131745k(C33509i.class)).mo94693b(C32608v.m131745k(HeartBeatInfo.class)).mo94693b(C32608v.m131743i(C40087h.class)).mo94693b(C32608v.m131747m(C33088k.class)).mo94693b(C32608v.m131747m(C33032d.class)).mo94697f(new C33174d0()).mo94694c().mo94695d(), C33507h.m135086b(LIBRARY_NAME, C33166b.f80506d)});
    }
}
