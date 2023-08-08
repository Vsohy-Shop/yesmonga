package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.basket.o0 */
public interface C37591o0 extends C37679f<C37592a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.o0$a */
    public static final class C37592a {
        @C12579k

        /* renamed from: a */
        public final OfferIdentifier f94345a;

        /* renamed from: b */
        public final int f94346b;

        /* renamed from: c */
        public final boolean f94347c;
        @C12579k

        /* renamed from: d */
        public final String f94348d;

        /* renamed from: e */
        public final boolean f94349e;

        /* renamed from: f */
        public final boolean f94350f;
        @C12580l

        /* renamed from: g */
        public final String f94351g;

        public /* synthetic */ C37592a(OfferIdentifier offerIdentifier, int i, boolean z, String str, boolean z2, boolean z3, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(offerIdentifier, i, z, str, z2, z3, str2);
        }

        /* renamed from: i */
        public static /* synthetic */ C37592a m154149i(C37592a aVar, OfferIdentifier offerIdentifier, int i, boolean z, String str, boolean z2, boolean z3, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                offerIdentifier = aVar.f94345a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f94346b;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                z = aVar.f94347c;
            }
            boolean z4 = z;
            if ((i2 & 8) != 0) {
                str = aVar.f94348d;
            }
            String str3 = str;
            if ((i2 & 16) != 0) {
                z2 = aVar.f94349e;
            }
            boolean z5 = z2;
            if ((i2 & 32) != 0) {
                z3 = aVar.f94350f;
            }
            boolean z6 = z3;
            if ((i2 & 64) != 0) {
                str2 = aVar.f94351g;
            }
            return aVar.mo114427h(offerIdentifier, i3, z4, str3, z5, z6, str2);
        }

        @C12579k
        /* renamed from: a */
        public final OfferIdentifier mo114419a() {
            return this.f94345a;
        }

        /* renamed from: b */
        public final int mo114420b() {
            return this.f94346b;
        }

        /* renamed from: c */
        public final boolean mo114421c() {
            return this.f94347c;
        }

        @C12579k
        /* renamed from: d */
        public final String mo114422d() {
            return this.f94348d;
        }

        /* renamed from: e */
        public final boolean mo114423e() {
            return this.f94349e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0052 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0053 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(@org.jetbrains.annotations.C12580l java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof com.carrefour.fid.android.domain.interactors.basket.C37591o0.C37592a
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                com.carrefour.fid.android.domain.interactors.basket.o0$a r5 = (com.carrefour.fid.android.domain.interactors.basket.C37591o0.C37592a) r5
                com.carrefour.fid.android.domain.models.offer.OfferIdentifier r1 = r4.f94345a
                com.carrefour.fid.android.domain.models.offer.OfferIdentifier r3 = r5.f94345a
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
                if (r1 != 0) goto L_0x0017
                return r2
            L_0x0017:
                int r1 = r4.f94346b
                int r3 = r5.f94346b
                if (r1 == r3) goto L_0x001e
                return r2
            L_0x001e:
                boolean r1 = r4.f94347c
                boolean r3 = r5.f94347c
                if (r1 == r3) goto L_0x0025
                return r2
            L_0x0025:
                java.lang.String r1 = r4.f94348d
                java.lang.String r3 = r5.f94348d
                boolean r1 = com.carrefour.fid.android.domain.models.product.Gtin.m157311e(r1, r3)
                if (r1 != 0) goto L_0x0030
                return r2
            L_0x0030:
                boolean r1 = r4.f94349e
                boolean r3 = r5.f94349e
                if (r1 == r3) goto L_0x0037
                return r2
            L_0x0037:
                boolean r1 = r4.f94350f
                boolean r3 = r5.f94350f
                if (r1 == r3) goto L_0x003e
                return r2
            L_0x003e:
                java.lang.String r1 = r4.f94351g
                java.lang.String r5 = r5.f94351g
                if (r1 != 0) goto L_0x0048
                if (r5 != 0) goto L_0x004a
                r5 = r0
                goto L_0x0050
            L_0x0048:
                if (r5 != 0) goto L_0x004c
            L_0x004a:
                r5 = r2
                goto L_0x0050
            L_0x004c:
                boolean r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r1, r5)
            L_0x0050:
                if (r5 != 0) goto L_0x0053
                return r2
            L_0x0053:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.basket.C37591o0.C37592a.equals(java.lang.Object):boolean");
        }

        /* renamed from: f */
        public final boolean mo114425f() {
            return this.f94350f;
        }

        @C12580l
        /* renamed from: g */
        public final String mo114426g() {
            return this.f94351g;
        }

        @C12579k
        /* renamed from: h */
        public final C37592a mo114427h(@C12579k OfferIdentifier offerIdentifier, int i, boolean z, @C12579k String str, boolean z2, boolean z3, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(offerIdentifier, C28547h2.f69318f);
            Intrinsics.checkNotNullParameter(str, "gtin");
            return new C37592a(offerIdentifier, i, z, str, z2, z3, str2, (DefaultConstructorMarker) null);
        }

        public int hashCode() {
            int hashCode = ((this.f94345a.hashCode() * 31) + Integer.hashCode(this.f94346b)) * 31;
            boolean z = this.f94347c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int g = (((hashCode + (z ? 1 : 0)) * 31) + Gtin.m157312g(this.f94348d)) * 31;
            boolean z3 = this.f94349e;
            if (z3) {
                z3 = true;
            }
            int i = (g + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f94350f;
            if (!z4) {
                z2 = z4;
            }
            int i2 = (i + (z2 ? 1 : 0)) * 31;
            String str = this.f94351g;
            return i2 + (str == null ? 0 : FacilityServiceId.m157963h(str));
        }

        @C12580l
        /* renamed from: j */
        public final String mo114429j() {
            return this.f94351g;
        }

        @C12579k
        /* renamed from: k */
        public final String mo114430k() {
            return this.f94348d;
        }

        /* renamed from: l */
        public final boolean mo114431l() {
            return this.f94350f;
        }

        @C12579k
        /* renamed from: m */
        public final OfferIdentifier mo114432m() {
            return this.f94345a;
        }

        /* renamed from: n */
        public final int mo114433n() {
            return this.f94346b;
        }

        /* renamed from: o */
        public final boolean mo114434o() {
            return this.f94347c;
        }

        /* renamed from: p */
        public final boolean mo114435p() {
            return this.f94349e;
        }

        @C12579k
        public String toString() {
            OfferIdentifier offerIdentifier = this.f94345a;
            int i = this.f94346b;
            boolean z = this.f94347c;
            String h = Gtin.m157313h(this.f94348d);
            boolean z2 = this.f94349e;
            boolean z3 = this.f94350f;
            String str = this.f94351g;
            String i2 = str == null ? "null" : FacilityServiceId.m157964i(str);
            return "Params(offer=" + offerIdentifier + ", quantity=" + i + ", synchronize=" + z + ", gtin=" + h + ", isHomeDeliveryNal=" + z2 + ", hasMultipleOffers=" + z3 + ", facilityServiceId=" + i2 + ")";
        }

        public C37592a(OfferIdentifier offerIdentifier, int i, boolean z, String str, boolean z2, boolean z3, String str2) {
            Intrinsics.checkNotNullParameter(offerIdentifier, C28547h2.f69318f);
            Intrinsics.checkNotNullParameter(str, "gtin");
            this.f94345a = offerIdentifier;
            this.f94346b = i;
            this.f94347c = z;
            this.f94348d = str;
            this.f94349e = z2;
            this.f94350f = z3;
            this.f94351g = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37592a(OfferIdentifier offerIdentifier, int i, boolean z, String str, boolean z2, boolean z3, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(offerIdentifier, i, (i2 & 4) != 0 ? false : z, str, z2, z3, str2, (DefaultConstructorMarker) null);
        }
    }
}
