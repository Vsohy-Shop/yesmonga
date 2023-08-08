package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.basket.a */
public interface C37554a extends C37679f<C37555a, Basket> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.a$a */
    public static final class C37555a {
        @C12579k

        /* renamed from: a */
        public final String f94324a;
        @C12580l

        /* renamed from: b */
        public final String f94325b;

        public /* synthetic */ C37555a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* renamed from: d */
        public static /* synthetic */ C37555a m154089d(C37555a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94324a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94325b;
            }
            return aVar.mo114346c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114344a() {
            return this.f94324a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo114345b() {
            return this.f94325b;
        }

        @C12579k
        /* renamed from: c */
        public final C37555a mo114346c(@C12579k String str, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            return new C37555a(str, str2, (DefaultConstructorMarker) null);
        }

        @C12580l
        /* renamed from: e */
        public final String mo114347e() {
            return this.f94325b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x002c A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(@org.jetbrains.annotations.C12580l java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof com.carrefour.fid.android.domain.interactors.basket.C37554a.C37555a
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                com.carrefour.fid.android.domain.interactors.basket.a$a r5 = (com.carrefour.fid.android.domain.interactors.basket.C37554a.C37555a) r5
                java.lang.String r1 = r4.f94324a
                java.lang.String r3 = r5.f94324a
                boolean r1 = com.carrefour.fid.android.domain.models.product.Gtin.m157311e(r1, r3)
                if (r1 != 0) goto L_0x0017
                return r2
            L_0x0017:
                java.lang.String r1 = r4.f94325b
                java.lang.String r5 = r5.f94325b
                if (r1 != 0) goto L_0x0021
                if (r5 != 0) goto L_0x0023
                r5 = r0
                goto L_0x0029
            L_0x0021:
                if (r5 != 0) goto L_0x0025
            L_0x0023:
                r5 = r2
                goto L_0x0029
            L_0x0025:
                boolean r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r1, r5)
            L_0x0029:
                if (r5 != 0) goto L_0x002c
                return r2
            L_0x002c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.basket.C37554a.C37555a.equals(java.lang.Object):boolean");
        }

        @C12579k
        /* renamed from: f */
        public final String mo114349f() {
            return this.f94324a;
        }

        public int hashCode() {
            int g = Gtin.m157312g(this.f94324a) * 31;
            String str = this.f94325b;
            return g + (str == null ? 0 : FacilityServiceId.m157963h(str));
        }

        @C12579k
        public String toString() {
            String h = Gtin.m157313h(this.f94324a);
            String str = this.f94325b;
            String i = str == null ? "null" : FacilityServiceId.m157964i(str);
            return "Params(gtin=" + h + ", facilityServiceId=" + i + ")";
        }

        public C37555a(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            this.f94324a = str;
            this.f94325b = str2;
        }
    }
}
