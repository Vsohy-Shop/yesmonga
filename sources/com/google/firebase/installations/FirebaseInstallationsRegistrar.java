package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.C33033f;
import com.google.firebase.annotations.concurrent.C32561a;
import com.google.firebase.annotations.concurrent.C32562b;
import com.google.firebase.components.C32578f0;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32584h;
import com.google.firebase.components.C32608v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.heartbeatinfo.C33048i;
import com.google.firebase.heartbeatinfo.C33050j;
import com.google.firebase.platforminfo.C33507h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static /* synthetic */ C33088k lambda$getComponents$0(C32584h hVar) {
        return new C33084j((C33033f) hVar.get(C33033f.class), hVar.mo94710h(C33050j.class), (ExecutorService) hVar.mo94707f(C32578f0.m131623a(C32561a.class, ExecutorService.class)), FirebaseExecutors.m131794b((Executor) hVar.mo94707f(C32578f0.m131623a(C32562b.class, Executor.class))));
    }

    public List<C32580g<?>> getComponents() {
        return Arrays.asList(new C32580g[]{C32580g.m131636h(C33088k.class).mo94699h(LIBRARY_NAME).mo94693b(C32608v.m131747m(C33033f.class)).mo94693b(C32608v.m131745k(C33050j.class)).mo94693b(C32608v.m131746l(C32578f0.m131623a(C32561a.class, ExecutorService.class))).mo94693b(C32608v.m131746l(C32578f0.m131623a(C32562b.class, Executor.class))).mo94697f(new C33089l()).mo94695d(), C33048i.m133387a(), C33507h.m135086b(LIBRARY_NAME, C33063c.f80202d)});
    }
}
