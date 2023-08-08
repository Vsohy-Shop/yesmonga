package com.carrefour.fid.android.domain.interactors.criteo;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.criteo.C38006h;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.criteo.i */
public interface C37670i extends C37679f<C37671a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.criteo.i$a */
    public static final class C37671a {
        @C12579k

        /* renamed from: a */
        public final C38006h f94529a;

        public C37671a(@C12579k C38006h hVar) {
            Intrinsics.checkNotNullParameter(hVar, "criteoParametersModel");
            this.f94529a = hVar;
        }

        /* renamed from: c */
        public static /* synthetic */ C37671a m154427c(C37671a aVar, C38006h hVar, int i, Object obj) {
            if ((i & 1) != 0) {
                hVar = aVar.f94529a;
            }
            return aVar.mo114683b(hVar);
        }

        @C12579k
        /* renamed from: a */
        public final C38006h mo114682a() {
            return this.f94529a;
        }

        @C12579k
        /* renamed from: b */
        public final C37671a mo114683b(@C12579k C38006h hVar) {
            Intrinsics.checkNotNullParameter(hVar, "criteoParametersModel");
            return new C37671a(hVar);
        }

        @C12579k
        /* renamed from: d */
        public final C38006h mo114684d() {
            return this.f94529a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37671a) && Intrinsics.areEqual((Object) this.f94529a, (Object) ((C37671a) obj).f94529a);
        }

        public int hashCode() {
            return this.f94529a.hashCode();
        }

        @C12579k
        public String toString() {
            C38006h hVar = this.f94529a;
            return "Params(criteoParametersModel=" + hVar + ")";
        }
    }
}
