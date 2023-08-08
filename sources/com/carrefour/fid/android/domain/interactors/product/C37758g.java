package com.carrefour.fid.android.domain.interactors.product;

import com.carrefour.fid.android.domain.models.criteo.C38005g;
import com.carrefour.fid.android.domain.models.criteo.C38006h;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.product.g */
public interface C37758g extends C11304p<C37759a, C11045c<? super C11907e<? extends Result<? extends C38005g>>>, Object>, C11074j {

    /* renamed from: com.carrefour.fid.android.domain.interactors.product.g$a */
    public static final class C37759a {
        @C12579k

        /* renamed from: a */
        public final C38006h f94757a;

        /* renamed from: b */
        public final int f94758b;

        public C37759a(@C12579k C38006h hVar, int i) {
            Intrinsics.checkNotNullParameter(hVar, "criteoParameters");
            this.f94757a = hVar;
            this.f94758b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C37759a m154775d(C37759a aVar, C38006h hVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                hVar = aVar.f94757a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f94758b;
            }
            return aVar.mo115027c(hVar, i);
        }

        @C12579k
        /* renamed from: a */
        public final C38006h mo115025a() {
            return this.f94757a;
        }

        /* renamed from: b */
        public final int mo115026b() {
            return this.f94758b;
        }

        @C12579k
        /* renamed from: c */
        public final C37759a mo115027c(@C12579k C38006h hVar, int i) {
            Intrinsics.checkNotNullParameter(hVar, "criteoParameters");
            return new C37759a(hVar, i);
        }

        @C12579k
        /* renamed from: e */
        public final C38006h mo115028e() {
            return this.f94757a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37759a)) {
                return false;
            }
            C37759a aVar = (C37759a) obj;
            return Intrinsics.areEqual((Object) this.f94757a, (Object) aVar.f94757a) && this.f94758b == aVar.f94758b;
        }

        /* renamed from: f */
        public final int mo115030f() {
            return this.f94758b;
        }

        public int hashCode() {
            return (this.f94757a.hashCode() * 31) + Integer.hashCode(this.f94758b);
        }

        @C12579k
        public String toString() {
            C38006h hVar = this.f94757a;
            int i = this.f94758b;
            return "Param(criteoParameters=" + hVar + ", criteoProductsCount=" + i + ")";
        }
    }
}
