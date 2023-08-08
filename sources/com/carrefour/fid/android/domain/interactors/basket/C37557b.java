package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.basket.Basket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.basket.b */
public interface C37557b extends C37679f<C37558a, Basket> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.b$a */
    public static final class C37558a {
        @C12579k

        /* renamed from: a */
        public final String f94326a;
        @C12579k

        /* renamed from: b */
        public final String f94327b;

        public C37558a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            Intrinsics.checkNotNullParameter(str2, "promotionCode");
            this.f94326a = str;
            this.f94327b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C37558a m154095d(C37558a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94326a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94327b;
            }
            return aVar.mo114354c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114352a() {
            return this.f94326a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114353b() {
            return this.f94327b;
        }

        @C12579k
        /* renamed from: c */
        public final C37558a mo114354c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            Intrinsics.checkNotNullParameter(str2, "promotionCode");
            return new C37558a(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo114355e() {
            return this.f94327b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37558a)) {
                return false;
            }
            C37558a aVar = (C37558a) obj;
            return Intrinsics.areEqual((Object) this.f94326a, (Object) aVar.f94326a) && Intrinsics.areEqual((Object) this.f94327b, (Object) aVar.f94327b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo114357f() {
            return this.f94326a;
        }

        public int hashCode() {
            return (this.f94326a.hashCode() * 31) + this.f94327b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94326a;
            String str2 = this.f94327b;
            return "Param(subBasketId=" + str + ", promotionCode=" + str2 + ")";
        }
    }
}
