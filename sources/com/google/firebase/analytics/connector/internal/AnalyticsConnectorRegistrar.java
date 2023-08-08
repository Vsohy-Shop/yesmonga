package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.C40473a;
import com.google.firebase.C33033f;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32608v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.events.C33032d;
import com.google.firebase.platforminfo.C33507h;
import java.util.Arrays;
import java.util.List;

@C40473a
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @SuppressLint({"MissingPermission"})
    @Keep
    @C40473a
    @C0359n0
    public List<C32580g<?>> getComponents() {
        return Arrays.asList(new C32580g[]{C32580g.m131636h(C32537a.class).mo94693b(C32608v.m131747m(C33033f.class)).mo94693b(C32608v.m131747m(Context.class)).mo94693b(C32608v.m131747m(C33032d.class)).mo94697f(C32547b.f79004a).mo94696e().mo94695d(), C33507h.m135086b("fire-analytics", "21.2.1")});
    }
}
