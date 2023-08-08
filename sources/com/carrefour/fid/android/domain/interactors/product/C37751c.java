package com.carrefour.fid.android.domain.interactors.product;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.basket.BasketReference;
import com.carrefour.fid.android.domain.models.product.Gtin;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.product.c */
public interface C37751c extends C37679f<C37752a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.product.c$a */
    public static final class C37752a {
        @C12579k

        /* renamed from: a */
        public final String f94752a;
        @C12579k

        /* renamed from: b */
        public final String f94753b;

        public /* synthetic */ C37752a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* renamed from: d */
        public static /* synthetic */ C37752a m154759d(C37752a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94752a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94753b;
            }
            return aVar.mo115005c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115003a() {
            return this.f94752a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo115004b() {
            return this.f94753b;
        }

        @C12579k
        /* renamed from: c */
        public final C37752a mo115005c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            Intrinsics.checkNotNullParameter(str2, "basketReference");
            return new C37752a(str, str2, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: e */
        public final String mo115006e() {
            return this.f94753b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37752a)) {
                return false;
            }
            C37752a aVar = (C37752a) obj;
            return Gtin.m157311e(this.f94752a, aVar.f94752a) && BasketReference.m156097f(this.f94753b, aVar.f94753b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo115008f() {
            return this.f94752a;
        }

        public int hashCode() {
            return (Gtin.m157312g(this.f94752a) * 31) + BasketReference.m156098h(this.f94753b);
        }

        @C12579k
        public String toString() {
            String h = Gtin.m157313h(this.f94752a);
            String i = BasketReference.m156099i(this.f94753b);
            return "Param(gtin=" + h + ", basketReference=" + i + ")";
        }

        public C37752a(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            Intrinsics.checkNotNullParameter(str2, "basketReference");
            this.f94752a = str;
            this.f94753b = str2;
        }
    }
}
