package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C33033f;
import com.google.firebase.abt.component.C32517a;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.annotations.concurrent.C32562b;
import com.google.firebase.components.C32578f0;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32584h;
import com.google.firebase.components.C32608v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.C33088k;
import com.google.firebase.platforminfo.C33507h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* access modifiers changed from: private */
    public static /* synthetic */ C33584t lambda$getComponents$0(C32578f0 f0Var, C32584h hVar) {
        return new C33584t((Context) hVar.get(Context.class), (Executor) hVar.mo94707f(f0Var), (C33033f) hVar.get(C33033f.class), (C33088k) hVar.get(C33088k.class), ((C32517a) hVar.get(C32517a.class)).mo94628b("frc"), hVar.mo94710h(C32537a.class));
    }

    public List<C32580g<?>> getComponents() {
        C32578f0<Executor> a = C32578f0.m131623a(C32562b.class, Executor.class);
        return Arrays.asList(new C32580g[]{C32580g.m131636h(C33584t.class).mo94699h(LIBRARY_NAME).mo94693b(C32608v.m131747m(Context.class)).mo94693b(C32608v.m131746l(a)).mo94693b(C32608v.m131747m(C33033f.class)).mo94693b(C32608v.m131747m(C33088k.class)).mo94693b(C32608v.m131747m(C32517a.class)).mo94693b(C32608v.m131745k(C32537a.class)).mo94697f(new C33589v(a)).mo94696e().mo94695d(), C33507h.m135086b(LIBRARY_NAME, "21.2.1")});
    }
}
