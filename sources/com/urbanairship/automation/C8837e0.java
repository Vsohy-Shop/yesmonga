package com.urbanairship.automation;

import androidx.annotation.C0359n0;
import com.urbanairship.UAirship;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36039i;
import com.urbanairship.automation.C8844g;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.reactive.C9550c;
import com.urbanairship.reactive.C9551d;
import com.urbanairship.reactive.C9586e;
import com.urbanairship.reactive.C9588g;
import com.urbanairship.reactive.C9596k;
import com.urbanairship.reactive.C9597l;
import com.urbanairship.util.C9674q0;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.urbanairship.automation.e0 */
public class C8837e0 {

    /* renamed from: com.urbanairship.automation.e0$a */
    public class C8838a implements C9550c<C9586e<C9333e>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ C36030b f23706a;

        public C8838a(C36030b bVar) {
            this.f23706a = bVar;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k apply(@C0359n0 C9586e<C9333e> eVar) {
            if (this.f23706a.mo18483d()) {
                eVar.mo17490c(JsonValue.f25436b);
            }
            eVar.mo19471b();
            return C9596k.m35945c();
        }
    }

    /* renamed from: com.urbanairship.automation.e0$b */
    public class C8839b implements C9550c<C9586e<C9333e>, C9596k> {

        /* renamed from: a */
        public final /* synthetic */ C8844g.C8868l0 f23707a;

        /* renamed from: b */
        public final /* synthetic */ AtomicBoolean f23708b;

        /* renamed from: c */
        public final /* synthetic */ C36030b f23709c;

        /* renamed from: com.urbanairship.automation.e0$b$a */
        public class C8840a extends C36039i {

            /* renamed from: a */
            public final /* synthetic */ C9586e f23710a;

            public C8840a(C9586e eVar) {
                this.f23710a = eVar;
            }

            /* renamed from: a */
            public void mo17410a(long j) {
                if (C8839b.this.f23707a.mo17498b()) {
                    C8839b.this.f23708b.set(true);
                    return;
                }
                this.f23710a.mo17490c(JsonValue.f25436b);
                C8839b.this.f23708b.set(false);
            }

            /* renamed from: b */
            public void mo17411b(long j) {
                super.mo17411b(j);
                C8839b.this.f23708b.set(false);
            }
        }

        public C8839b(C8844g.C8868l0 l0Var, AtomicBoolean atomicBoolean, C36030b bVar) {
            this.f23707a = l0Var;
            this.f23708b = atomicBoolean;
            this.f23709c = bVar;
        }

        /* renamed from: d */
        public static /* synthetic */ void m32871d(AtomicBoolean atomicBoolean, C9586e eVar, Boolean bool) {
            if (!bool.booleanValue() && atomicBoolean.get()) {
                eVar.mo17490c(JsonValue.f25436b);
                atomicBoolean.set(false);
            }
        }

        @C0359n0
        /* renamed from: c */
        public C9596k apply(@C0359n0 C9586e<C9333e> eVar) {
            C8840a aVar = new C8840a(eVar);
            this.f23707a.mo17497a(new C8843f0(this.f23708b, eVar));
            this.f23709c.mo18485f(aVar);
            return C9596k.m35944b(new C8891g0(this.f23709c, aVar));
        }
    }

    /* renamed from: com.urbanairship.automation.e0$c */
    public class C8841c implements C9597l<C9551d<C9333e>> {
        @C0359n0
        /* renamed from: b */
        public C9551d<C9333e> mo17412a() {
            if (UAirship.m146188Y().mo106222m().mo107791C()) {
                return C9551d.m35860o(C9674q0.m36236a());
            }
            return C9551d.m35857j();
        }
    }

    /* renamed from: a */
    public static C9551d<C9333e> m32865a() {
        return C9551d.m35856h(new C8841c());
    }

    /* renamed from: b */
    public static C9551d<C9333e> m32866b(@C0359n0 C36030b bVar) {
        return C9551d.m35855f(new C8838a(bVar)).mo19468v(C9588g.m35927b());
    }

    /* renamed from: c */
    public static C9551d<C9333e> m32867c(@C0359n0 C36030b bVar, @C0359n0 C8844g.C8868l0 l0Var) {
        return C9551d.m35855f(new C8839b(l0Var, new AtomicBoolean(false), bVar)).mo19468v(C9588g.m35927b());
    }
}
