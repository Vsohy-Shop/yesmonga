package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.tasks.C31051m;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32588j;
import com.google.firebase.components.C32600s;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.j */
public class C33947j {

    /* renamed from: b */
    public static final AtomicReference<C33947j> f82366b = new AtomicReference<>();
    @C0363p0

    /* renamed from: a */
    public C32600s f82367a;

    @RecentlyNonNull
    @C40473a
    /* renamed from: c */
    public static C33947j m136584c() {
        boolean z;
        C33947j jVar = f82366b.get();
        if (jVar != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166209s(z, "MlKitContext has not been initialized");
        return jVar;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: d */
    public static C33947j m136585d(@RecentlyNonNull Context context, @RecentlyNonNull List<ComponentRegistrar> list) {
        C33947j jVar = new C33947j();
        boolean z = false;
        C32600s sVar = new C32600s(C31051m.f74312a, list, C32580g.m131628D(m136587f(context), Context.class, new Class[0]), C32580g.m131628D(jVar, C33947j.class, new Class[0]));
        jVar.f82367a = sVar;
        sVar.mo94730t(true);
        if (f82366b.getAndSet(jVar) == null) {
            z = true;
        }
        C40843u.m166209s(z, "MlKitContext is already initialized");
        return jVar;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public static C33947j m136586e(@RecentlyNonNull Context context) {
        C33947j jVar = new C33947j();
        Context f = m136587f(context);
        boolean z = false;
        C32600s e = C32600s.m131703o(C31051m.f74312a).mo94734d(C32588j.m131686d(f, MlKitComponentDiscoveryService.class).mo94715c()).mo94732b(C32580g.m131628D(f, Context.class, new Class[0])).mo94732b(C32580g.m131628D(jVar, C33947j.class, new Class[0])).mo94735e();
        jVar.f82367a = e;
        e.mo94730t(true);
        if (f82366b.getAndSet(jVar) == null) {
            z = true;
        }
        C40843u.m166209s(z, "MlKitContext is already initialized");
        return jVar;
    }

    /* renamed from: f */
    public static Context m136587f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public <T> T mo98717a(@RecentlyNonNull Class<T> cls) {
        boolean z;
        if (f82366b.get() == this) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166209s(z, "MlKitContext has been deleted");
        C40843u.m166202l(this.f82367a);
        return this.f82367a.get(cls);
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    public Context mo98718b() {
        return (Context) mo98717a(Context.class);
    }
}
