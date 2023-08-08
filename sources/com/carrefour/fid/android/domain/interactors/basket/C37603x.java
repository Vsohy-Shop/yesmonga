package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.models.basket.Basket;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.basket.x */
public interface C37603x extends C11304p<String, C11045c<? super C11907e<? extends Basket>>, Object>, C11074j {

    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.x$a */
    public static final class C37604a {
        @C12579k

        /* renamed from: a */
        public final String f94358a;

        public C37604a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "referenceId");
            this.f94358a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C37604a m154178c(C37604a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94358a;
            }
            return aVar.mo114448b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114447a() {
            return this.f94358a;
        }

        @C12579k
        /* renamed from: b */
        public final C37604a mo114448b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "referenceId");
            return new C37604a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo114449d() {
            return this.f94358a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37604a) && Intrinsics.areEqual((Object) this.f94358a, (Object) ((C37604a) obj).f94358a);
        }

        public int hashCode() {
            return this.f94358a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94358a;
            return "Param(referenceId=" + str + ")";
        }
    }
}
