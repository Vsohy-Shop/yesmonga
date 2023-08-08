package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.android.datatransport.C40087h;
import com.google.firebase.C33033f;
import com.google.firebase.C33277p;
import com.google.firebase.annotations.concurrent.C32564d;
import com.google.firebase.components.C32578f0;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32584h;
import com.google.firebase.components.C32608v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.C33088k;
import com.google.firebase.perf.injection.components.C33334a;
import com.google.firebase.perf.injection.modules.C33338a;
import com.google.firebase.platforminfo.C33507h;
import com.google.firebase.remoteconfig.C33584t;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* access modifiers changed from: private */
    public static /* synthetic */ C33285b lambda$getComponents$0(C32578f0 f0Var, C32584h hVar) {
        return new C33285b((C33033f) hVar.get(C33033f.class), hVar.mo94710h(C33277p.class).get(), (Executor) hVar.mo94707f(f0Var));
    }

    /* access modifiers changed from: private */
    public static C33314e providesFirebasePerformance(C32584h hVar) {
        hVar.get(C33285b.class);
        return C33334a.m134411b().mo96414b(new C33338a((C33033f) hVar.get(C33033f.class), (C33088k) hVar.get(C33088k.class), hVar.mo94710h(C33584t.class), hVar.mo94710h(C40087h.class))).mo96413a().mo96411a();
    }

    @Keep
    public List<C32580g<?>> getComponents() {
        C32578f0<Executor> a = C32578f0.m131623a(C32564d.class, Executor.class);
        Class<C33033f> cls = C33033f.class;
        Class<C33285b> cls2 = C33285b.class;
        return Arrays.asList(new C32580g[]{C32580g.m131636h(C33314e.class).mo94699h(LIBRARY_NAME).mo94693b(C32608v.m131747m(cls)).mo94693b(C32608v.m131749o(C33584t.class)).mo94693b(C32608v.m131747m(C33088k.class)).mo94693b(C32608v.m131749o(C40087h.class)).mo94693b(C32608v.m131747m(cls2)).mo94697f(new C33286c()).mo94695d(), C32580g.m131636h(cls2).mo94699h(EARLY_LIBRARY_NAME).mo94693b(C32608v.m131747m(cls)).mo94693b(C32608v.m131745k(C33277p.class)).mo94693b(C32608v.m131746l(a)).mo94696e().mo94697f(new C33313d(a)).mo94695d(), C33507h.m135086b(LIBRARY_NAME, "20.3.1")});
    }
}
