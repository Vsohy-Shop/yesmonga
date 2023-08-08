package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.C32514b;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32584h;
import com.google.firebase.components.C32608v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.C33507h;
import java.util.Arrays;
import java.util.List;

@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* access modifiers changed from: private */
    public static /* synthetic */ C32517a lambda$getComponents$0(C32584h hVar) {
        return new C32517a((Context) hVar.get(Context.class), hVar.mo94710h(C32537a.class));
    }

    public List<C32580g<?>> getComponents() {
        return Arrays.asList(new C32580g[]{C32580g.m131636h(C32517a.class).mo94699h(LIBRARY_NAME).mo94693b(C32608v.m131747m(Context.class)).mo94693b(C32608v.m131745k(C32537a.class)).mo94697f(new C32518b()).mo94695d(), C33507h.m135086b(LIBRARY_NAME, C32514b.f78858d)});
    }
}
