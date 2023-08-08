package androidx.activity.result;

import androidx.activity.result.contract.C0268b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.activity.result.j */
public final class C0305j {
    @C12579k

    /* renamed from: a */
    public C0268b.C0280j.C0286f f824a = C0268b.C0280j.C0282b.f809a;

    /* renamed from: androidx.activity.result.j$a */
    public static final class C0306a {
        @C12579k

        /* renamed from: a */
        public C0268b.C0280j.C0286f f825a = C0268b.C0280j.C0282b.f809a;

        @C12579k
        /* renamed from: a */
        public final C0305j mo963a() {
            C0305j jVar = new C0305j();
            jVar.mo962b(this.f825a);
            return jVar;
        }

        @C12579k
        /* renamed from: b */
        public final C0306a mo964b(@C12579k C0268b.C0280j.C0286f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "mediaType");
            this.f825a = fVar;
            return this;
        }
    }

    @C12579k
    /* renamed from: a */
    public final C0268b.C0280j.C0286f mo961a() {
        return this.f824a;
    }

    /* renamed from: b */
    public final void mo962b(@C12579k C0268b.C0280j.C0286f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f824a = fVar;
    }
}
