package com.google.mlkit.common.model;

import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.inject.C33058b;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.common.sdkinternal.model.C33964k;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.mlkit.common.model.e */
public class C33921e {

    /* renamed from: a */
    public final Map<Class<? extends C33920d>, C33058b<? extends C33964k<? extends C33920d>>> f82322a = new HashMap();

    @C40473a
    /* renamed from: com.google.mlkit.common.model.e$a */
    public static class C33922a {

        /* renamed from: a */
        public final Class<? extends C33920d> f82323a;

        /* renamed from: b */
        public final C33058b<? extends C33964k<? extends C33920d>> f82324b;

        @C40473a
        public <RemoteT extends C33920d> C33922a(@RecentlyNonNull Class<RemoteT> cls, @RecentlyNonNull C33058b<? extends C33964k<RemoteT>> bVar) {
            this.f82323a = cls;
            this.f82324b = bVar;
        }

        /* renamed from: a */
        public final C33058b<? extends C33964k<? extends C33920d>> mo98693a() {
            return this.f82324b;
        }

        /* renamed from: b */
        public final Class<? extends C33920d> mo98694b() {
            return this.f82323a;
        }
    }

    @C40473a
    public C33921e(@RecentlyNonNull Set<C33922a> set) {
        for (C33922a next : set) {
            this.f82322a.put(next.mo98694b(), next.mo98693a());
        }
    }

    @C0359n0
    /* renamed from: d */
    public static synchronized C33921e m136555d() {
        C33921e eVar;
        synchronized (C33921e.class) {
            eVar = (C33921e) C33947j.m136584c().mo98717a(C33921e.class);
        }
        return eVar;
    }

    @C0359n0
    /* renamed from: a */
    public C31047k<Void> mo98688a(@RecentlyNonNull C33920d dVar) {
        C40843u.m166203m(dVar, "RemoteModel cannot be null");
        return mo98692f(dVar.getClass()).mo98648c(dVar);
    }

    @C0359n0
    /* renamed from: b */
    public C31047k<Void> mo98689b(@RecentlyNonNull C33920d dVar, @RecentlyNonNull C33916b bVar) {
        C40843u.m166203m(dVar, "RemoteModel cannot be null");
        C40843u.m166203m(bVar, "DownloadConditions cannot be null");
        if (this.f82322a.containsKey(dVar.getClass())) {
            return mo98692f(dVar.getClass()).mo98646a(dVar, bVar);
        }
        String simpleName = dVar.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(simpleName.length() + 70);
        sb.append("Feature model '");
        sb.append(simpleName);
        sb.append("' doesn't have a corresponding modelmanager registered.");
        return C31053n.m124524f(new MlKitException(sb.toString(), 13));
    }

    @C0359n0
    /* renamed from: c */
    public <T extends C33920d> C31047k<Set<T>> mo98690c(@RecentlyNonNull Class<T> cls) {
        return ((C33964k) ((C33058b) C40843u.m166202l(this.f82322a.get(cls))).get()).mo98647b();
    }

    @C0359n0
    /* renamed from: e */
    public C31047k<Boolean> mo98691e(@RecentlyNonNull C33920d dVar) {
        C40843u.m166203m(dVar, "RemoteModel cannot be null");
        return mo98692f(dVar.getClass()).mo98649d(dVar);
    }

    /* renamed from: f */
    public final C33964k<C33920d> mo98692f(Class<? extends C33920d> cls) {
        return (C33964k) ((C33058b) C40843u.m166202l(this.f82322a.get(cls))).get();
    }
}
