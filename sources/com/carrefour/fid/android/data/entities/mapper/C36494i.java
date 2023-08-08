package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.APIMAvailability;
import com.carrefour.fid.android.data.entities.Offer;
import com.carrefour.fid.android.data.entities.extension.C36443b;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.i */
public final class C36494i extends C28486g<C36495a, OfferAvailability> {

    /* renamed from: b */
    public static final int f90182b = 0;

    @C12579k
    /* renamed from: d */
    public OfferAvailability mo72340a(@C12579k C36495a aVar) {
        APIMAvailability availability;
        boolean z;
        boolean z2;
        OfferAvailability offerAvailability;
        Intrinsics.checkNotNullParameter(aVar, "entity");
        Offer e = aVar.mo111281e();
        if (!(e == null || (availability = e.getAvailability()) == null)) {
            boolean a = C36443b.m149512a(availability, aVar.mo111283f());
            boolean z3 = true;
            if (aVar.mo111281e().isInAssortment() || a) {
                z = false;
            } else {
                z = true;
            }
            if (!aVar.mo111281e().isEligible() || !a) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                z3 = false;
            }
            if (z2) {
                offerAvailability = OfferAvailability.AVAILABLE;
            } else if (z3) {
                offerAvailability = OfferAvailability.NOT_IN_STORE;
            } else if (z) {
                offerAvailability = OfferAvailability.UNAVAILABLE;
            } else {
                offerAvailability = OfferAvailability.NOT_IN_STORE;
            }
            if (offerAvailability != null) {
                return offerAvailability;
            }
        }
        return OfferAvailability.UNKNOWN;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.i$a */
    public static final class C36495a {

        /* renamed from: c */
        public static final int f90183c = 8;
        @C12580l

        /* renamed from: a */
        public final Offer f90184a;
        @C12579k

        /* renamed from: b */
        public final String f90185b;

        public C36495a(@C12580l Offer offer, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
            this.f90184a = offer;
            this.f90185b = str;
        }

        /* renamed from: d */
        public static /* synthetic */ C36495a m149677d(C36495a aVar, Offer offer, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                offer = aVar.f90184a;
            }
            if ((i & 2) != 0) {
                str = aVar.f90185b;
            }
            return aVar.mo111280c(offer, str);
        }

        @C12580l
        /* renamed from: a */
        public final Offer mo111278a() {
            return this.f90184a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo111279b() {
            return this.f90185b;
        }

        @C12579k
        /* renamed from: c */
        public final C36495a mo111280c(@C12580l Offer offer, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
            return new C36495a(offer, str);
        }

        @C12580l
        /* renamed from: e */
        public final Offer mo111281e() {
            return this.f90184a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36495a)) {
                return false;
            }
            C36495a aVar = (C36495a) obj;
            return Intrinsics.areEqual((Object) this.f90184a, (Object) aVar.f90184a) && Intrinsics.areEqual((Object) this.f90185b, (Object) aVar.f90185b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo111283f() {
            return this.f90185b;
        }

        public int hashCode() {
            Offer offer = this.f90184a;
            return ((offer == null ? 0 : offer.hashCode()) * 31) + this.f90185b.hashCode();
        }

        @C12579k
        public String toString() {
            Offer offer = this.f90184a;
            String str = this.f90185b;
            return "Param(offer=" + offer + ", slotId=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C36495a(Offer offer, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(offer, (i & 2) != 0 ? new String() : str);
        }
    }
}
