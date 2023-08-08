package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.C40087h;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32608v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.C33507h;
import java.util.Arrays;
import java.util.List;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<C32580g<?>> getComponents() {
        return Arrays.asList(new C32580g[]{C32580g.m131636h(C40087h.class).mo94699h(LIBRARY_NAME).mo94693b(C32608v.m131747m(Context.class)).mo94697f(new C32990c()).mo94695d(), C33507h.m135086b(LIBRARY_NAME, C32977a.f80081d)});
    }
}
