package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.basket.Basket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.basket.k0 */
public interface C37581k0 extends C37679f<C37582a, Basket> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.k0$a */
    public static final class C37582a {
        @C12579k

        /* renamed from: a */
        public final String f94341a;

        public C37582a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "basketReferenceId");
            this.f94341a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C37582a m154136c(C37582a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94341a;
            }
            return aVar.mo114404b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114403a() {
            return this.f94341a;
        }

        @C12579k
        /* renamed from: b */
        public final C37582a mo114404b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "basketReferenceId");
            return new C37582a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo114405d() {
            return this.f94341a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37582a) && Intrinsics.areEqual((Object) this.f94341a, (Object) ((C37582a) obj).f94341a);
        }

        public int hashCode() {
            return this.f94341a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94341a;
            return "Params(basketReferenceId=" + str + ")";
        }
    }
}
