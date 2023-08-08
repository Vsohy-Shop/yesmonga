package com.google.mlkit.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.internal.mlkit_common.zzan;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32608v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.internal.model.C33913j;
import com.google.mlkit.common.model.C33921e;
import com.google.mlkit.common.sdkinternal.C33927a;
import com.google.mlkit.common.sdkinternal.C33930b;
import com.google.mlkit.common.sdkinternal.C33937e;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.common.sdkinternal.C33948k;
import com.google.mlkit.common.sdkinternal.C33970o;
import com.google.mlkit.common.sdkinternal.model.C33957d;
import java.util.List;

@C40473a
public class CommonComponentRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final /* synthetic */ int f82273a = 0;

    @RecentlyNonNull
    public final List<C32580g<?>> getComponents() {
        C32580g<?> gVar = C33970o.f82468c;
        Class<C33947j> cls = C33947j.class;
        C32580g<C33957d> d = C32580g.m131636h(C33957d.class).mo94693b(C32608v.m131747m(cls)).mo94697f(C33894a.f82274a).mo94695d();
        Class<C33948k> cls2 = C33948k.class;
        C32580g<C33948k> d2 = C32580g.m131636h(cls2).mo94697f(C33895b.f82275a).mo94695d();
        Class<C33921e.C33922a> cls3 = C33921e.C33922a.class;
        C32580g<C33921e> d3 = C32580g.m131636h(C33921e.class).mo94693b(C32608v.m131751q(cls3)).mo94697f(C33896c.f82276a).mo94695d();
        C32580g<C33937e> d4 = C32580g.m131636h(C33937e.class).mo94693b(C32608v.m131749o(cls2)).mo94697f(C33897d.f82277a).mo94695d();
        Class<C33927a> cls4 = C33927a.class;
        C32580g<C33927a> d5 = C32580g.m131636h(cls4).mo94697f(C33898e.f82278a).mo94695d();
        C32580g<C33930b.C33931a> d6 = C32580g.m131636h(C33930b.C33931a.class).mo94693b(C32608v.m131747m(cls4)).mo94697f(C33899f.f82279a).mo94695d();
        Class<C33913j> cls5 = C33913j.class;
        return zzan.m171768H(gVar, d, d2, d3, d4, d5, d6, C32580g.m131636h(cls5).mo94693b(C32608v.m131747m(cls)).mo94697f(C33900g.f82280a).mo94695d(), C32580g.m131641r(cls3).mo94693b(C32608v.m131749o(cls5)).mo94697f(C33901h.f82281a).mo94695d());
    }
}
