package com.google.android.gms.common.moduleinstall;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.C40661k;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.errorprone.annotations.C32488a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.moduleinstall.d */
public final class C40879d {

    /* renamed from: a */
    public final List f104032a;
    @C0363p0

    /* renamed from: b */
    public final C40876a f104033b;
    @C0363p0

    /* renamed from: c */
    public final Executor f104034c;

    /* renamed from: d */
    public final boolean f104035d;

    /* renamed from: com.google.android.gms.common.moduleinstall.d$a */
    public static class C40880a {

        /* renamed from: a */
        public final List f104036a = new ArrayList();

        /* renamed from: b */
        public boolean f104037b = true;
        @C0363p0

        /* renamed from: c */
        public C40876a f104038c;
        @C0363p0

        /* renamed from: d */
        public Executor f104039d;

        @C0359n0
        @C32488a
        /* renamed from: a */
        public C40880a mo134576a(@C0359n0 C40661k kVar) {
            this.f104036a.add(kVar);
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C40879d mo134577b() {
            return new C40879d(this.f104036a, this.f104038c, this.f104039d, this.f104037b, (C40884h) null);
        }

        @C0359n0
        /* renamed from: c */
        public C40880a mo134578c(@C0359n0 C40876a aVar) {
            return mo134579d(aVar, (Executor) null);
        }

        @C0359n0
        @C32488a
        /* renamed from: d */
        public C40880a mo134579d(@C0359n0 C40876a aVar, @C0363p0 Executor executor) {
            this.f104038c = aVar;
            this.f104039d = executor;
            return this;
        }
    }

    public /* synthetic */ C40879d(List list, C40876a aVar, Executor executor, boolean z, C40884h hVar) {
        C40843u.m166203m(list, "APIs must not be null.");
        C40843u.m166192b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            C40843u.m166203m(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f104032a = list;
        this.f104033b = aVar;
        this.f104034c = executor;
        this.f104035d = z;
    }

    @C0359n0
    /* renamed from: d */
    public static C40880a m166295d() {
        return new C40880a();
    }

    @C0359n0
    /* renamed from: a */
    public List<C40661k> mo134572a() {
        return this.f104032a;
    }

    @C0363p0
    /* renamed from: b */
    public C40876a mo134573b() {
        return this.f104033b;
    }

    @C0363p0
    /* renamed from: c */
    public Executor mo134574c() {
        return this.f104034c;
    }

    @C40858y
    /* renamed from: e */
    public final boolean mo134575e() {
        return this.f104035d;
    }
}
