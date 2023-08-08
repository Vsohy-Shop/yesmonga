package com.google.firebase.crashlytics;

import com.google.firebase.C33033f;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32584h;
import com.google.firebase.components.C32608v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.internal.C32655a;
import com.google.firebase.installations.C33088k;
import com.google.firebase.platforminfo.C33507h;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final String f79192a = "fire-cls";

    /* renamed from: b */
    public final C32652i mo94806b(C32584h hVar) {
        return C32652i.m131873e((C33033f) hVar.get(C33033f.class), (C33088k) hVar.get(C33088k.class), hVar.mo94712j(C32655a.class), hVar.mo94712j(C32537a.class));
    }

    public List<C32580g<?>> getComponents() {
        return Arrays.asList(new C32580g[]{C32580g.m131636h(C32652i.class).mo94699h(f79192a).mo94693b(C32608v.m131747m(C33033f.class)).mo94693b(C32608v.m131747m(C33088k.class)).mo94693b(C32608v.m131741b(C32655a.class)).mo94693b(C32608v.m131741b(C32537a.class)).mo94697f(new C32649g(this)).mo94696e().mo94695d(), C33507h.m135086b(f79192a, "18.3.5")});
    }
}
