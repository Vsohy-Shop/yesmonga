package com.carrefour.fid.android.domain.interactors.slot;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.slot.ServiceSlot;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.slot.f */
public interface C37859f extends C37679f<C37860a, ServiceSlot> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.slot.f$a */
    public static final class C37860a {
        @C12579k

        /* renamed from: a */
        public final String f94949a;
        @C12580l

        /* renamed from: b */
        public final Double f94950b;
        @C12580l

        /* renamed from: c */
        public final Double f94951c;
        @C12580l

        /* renamed from: d */
        public final Double f94952d;
        @C12580l

        /* renamed from: e */
        public final String f94953e;
        @C12580l

        /* renamed from: f */
        public final Double f94954f;
        @C12580l

        /* renamed from: g */
        public final Integer f94955g;

        public C37860a(@C12579k String str, @C12580l Double d, @C12580l Double d2, @C12580l Double d3, @C12580l String str2, @C12580l Double d4, @C12580l Integer num) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            this.f94949a = str;
            this.f94950b = d;
            this.f94951c = d2;
            this.f94952d = d3;
            this.f94953e = str2;
            this.f94954f = d4;
            this.f94955g = num;
        }

        /* renamed from: i */
        public static /* synthetic */ C37860a m155064i(C37860a aVar, String str, Double d, Double d2, Double d3, String str2, Double d4, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94949a;
            }
            if ((i & 2) != 0) {
                d = aVar.f94950b;
            }
            Double d5 = d;
            if ((i & 4) != 0) {
                d2 = aVar.f94951c;
            }
            Double d6 = d2;
            if ((i & 8) != 0) {
                d3 = aVar.f94952d;
            }
            Double d7 = d3;
            if ((i & 16) != 0) {
                str2 = aVar.f94953e;
            }
            String str3 = str2;
            if ((i & 32) != 0) {
                d4 = aVar.f94954f;
            }
            Double d8 = d4;
            if ((i & 64) != 0) {
                num = aVar.f94955g;
            }
            return aVar.mo115298h(str, d5, d6, d7, str3, d8, num);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115290a() {
            return this.f94949a;
        }

        @C12580l
        /* renamed from: b */
        public final Double mo115291b() {
            return this.f94950b;
        }

        @C12580l
        /* renamed from: c */
        public final Double mo115292c() {
            return this.f94951c;
        }

        @C12580l
        /* renamed from: d */
        public final Double mo115293d() {
            return this.f94952d;
        }

        @C12580l
        /* renamed from: e */
        public final String mo115294e() {
            return this.f94953e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37860a)) {
                return false;
            }
            C37860a aVar = (C37860a) obj;
            return Intrinsics.areEqual((Object) this.f94949a, (Object) aVar.f94949a) && Intrinsics.areEqual((Object) this.f94950b, (Object) aVar.f94950b) && Intrinsics.areEqual((Object) this.f94951c, (Object) aVar.f94951c) && Intrinsics.areEqual((Object) this.f94952d, (Object) aVar.f94952d) && Intrinsics.areEqual((Object) this.f94953e, (Object) aVar.f94953e) && Intrinsics.areEqual((Object) this.f94954f, (Object) aVar.f94954f) && Intrinsics.areEqual((Object) this.f94955g, (Object) aVar.f94955g);
        }

        @C12580l
        /* renamed from: f */
        public final Double mo115296f() {
            return this.f94954f;
        }

        @C12580l
        /* renamed from: g */
        public final Integer mo115297g() {
            return this.f94955g;
        }

        @C12579k
        /* renamed from: h */
        public final C37860a mo115298h(@C12579k String str, @C12580l Double d, @C12580l Double d2, @C12580l Double d3, @C12580l String str2, @C12580l Double d4, @C12580l Integer num) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            return new C37860a(str, d, d2, d3, str2, d4, num);
        }

        public int hashCode() {
            int hashCode = this.f94949a.hashCode() * 31;
            Double d = this.f94950b;
            int i = 0;
            int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.f94951c;
            int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.f94952d;
            int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
            String str = this.f94953e;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            Double d4 = this.f94954f;
            int hashCode6 = (hashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
            Integer num = this.f94955g;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode6 + i;
        }

        @C12580l
        /* renamed from: j */
        public final Double mo115300j() {
            return this.f94952d;
        }

        @C12579k
        /* renamed from: k */
        public final String mo115301k() {
            return this.f94949a;
        }

        @C12580l
        /* renamed from: l */
        public final String mo115302l() {
            return this.f94953e;
        }

        @C12580l
        /* renamed from: m */
        public final Double mo115303m() {
            return this.f94950b;
        }

        @C12580l
        /* renamed from: n */
        public final Double mo115304n() {
            return this.f94951c;
        }

        @C12580l
        /* renamed from: o */
        public final Double mo115305o() {
            return this.f94954f;
        }

        @C12580l
        /* renamed from: p */
        public final Integer mo115306p() {
            return this.f94955g;
        }

        @C12579k
        public String toString() {
            String str = this.f94949a;
            Double d = this.f94950b;
            Double d2 = this.f94951c;
            Double d3 = this.f94952d;
            String str2 = this.f94953e;
            Double d4 = this.f94954f;
            Integer num = this.f94955g;
            return "Params(facilityServiceId=" + str + ", latitude=" + d + ", longitude=" + d2 + ", cartTotalAmount=" + d3 + ", id=" + str2 + ", maxDeliveryCost=" + d4 + ", productCount=" + num + ")";
        }
    }
}
