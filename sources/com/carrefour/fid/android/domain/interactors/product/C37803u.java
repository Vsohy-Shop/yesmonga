package com.carrefour.fid.android.domain.interactors.product;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.basket.BasketReference;
import com.carrefour.fid.android.domain.models.product.Gtin;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.product.u */
public interface C37803u extends C37679f<C37804a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.product.u$a */
    public static final class C37804a {
        @C12579k

        /* renamed from: a */
        public final String f94892a;

        /* renamed from: b */
        public final int f94893b;
        @C12579k

        /* renamed from: c */
        public final String f94894c;

        public /* synthetic */ C37804a(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        /* renamed from: e */
        public static /* synthetic */ C37804a m154953e(C37804a aVar, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.f94892a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f94893b;
            }
            if ((i2 & 4) != 0) {
                str2 = aVar.f94894c;
            }
            return aVar.mo115187d(str, i, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115184a() {
            return this.f94892a;
        }

        /* renamed from: b */
        public final int mo115185b() {
            return this.f94893b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo115186c() {
            return this.f94894c;
        }

        @C12579k
        /* renamed from: d */
        public final C37804a mo115187d(@C12579k String str, int i, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            Intrinsics.checkNotNullParameter(str2, "basketReference");
            return new C37804a(str, i, str2, (DefaultConstructorMarker) null);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37804a)) {
                return false;
            }
            C37804a aVar = (C37804a) obj;
            return Gtin.m157311e(this.f94892a, aVar.f94892a) && this.f94893b == aVar.f94893b && BasketReference.m156097f(this.f94894c, aVar.f94894c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo115189f() {
            return this.f94894c;
        }

        @C12579k
        /* renamed from: g */
        public final String mo115190g() {
            return this.f94892a;
        }

        /* renamed from: h */
        public final int mo115191h() {
            return this.f94893b;
        }

        public int hashCode() {
            return (((Gtin.m157312g(this.f94892a) * 31) + Integer.hashCode(this.f94893b)) * 31) + BasketReference.m156098h(this.f94894c);
        }

        @C12579k
        public String toString() {
            String h = Gtin.m157313h(this.f94892a);
            int i = this.f94893b;
            String i2 = BasketReference.m156099i(this.f94894c);
            return "Param(gtin=" + h + ", newQuantity=" + i + ", basketReference=" + i2 + ")";
        }

        public C37804a(String str, int i, String str2) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            Intrinsics.checkNotNullParameter(str2, "basketReference");
            this.f94892a = str;
            this.f94893b = i;
            this.f94894c = str2;
        }
    }
}
