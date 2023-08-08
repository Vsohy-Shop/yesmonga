package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.basket.n0 */
public interface C37588n0 extends C37679f<C37589a, Basket> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.n0$a */
    public static final class C37589a {
        @C12579k

        /* renamed from: a */
        public final OfferIdentifier f94342a;

        /* renamed from: b */
        public final int f94343b;

        /* renamed from: c */
        public final boolean f94344c;

        public C37589a(@C12579k OfferIdentifier offerIdentifier, int i, boolean z) {
            Intrinsics.checkNotNullParameter(offerIdentifier, C28547h2.f69318f);
            this.f94342a = offerIdentifier;
            this.f94343b = i;
            this.f94344c = z;
        }

        /* renamed from: e */
        public static /* synthetic */ C37589a m154141e(C37589a aVar, OfferIdentifier offerIdentifier, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                offerIdentifier = aVar.f94342a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f94343b;
            }
            if ((i2 & 4) != 0) {
                z = aVar.f94344c;
            }
            return aVar.mo114412d(offerIdentifier, i, z);
        }

        @C12579k
        /* renamed from: a */
        public final OfferIdentifier mo114409a() {
            return this.f94342a;
        }

        /* renamed from: b */
        public final int mo114410b() {
            return this.f94343b;
        }

        /* renamed from: c */
        public final boolean mo114411c() {
            return this.f94344c;
        }

        @C12579k
        /* renamed from: d */
        public final C37589a mo114412d(@C12579k OfferIdentifier offerIdentifier, int i, boolean z) {
            Intrinsics.checkNotNullParameter(offerIdentifier, C28547h2.f69318f);
            return new C37589a(offerIdentifier, i, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37589a)) {
                return false;
            }
            C37589a aVar = (C37589a) obj;
            return Intrinsics.areEqual((Object) this.f94342a, (Object) aVar.f94342a) && this.f94343b == aVar.f94343b && this.f94344c == aVar.f94344c;
        }

        @C12579k
        /* renamed from: f */
        public final OfferIdentifier mo114414f() {
            return this.f94342a;
        }

        /* renamed from: g */
        public final int mo114415g() {
            return this.f94343b;
        }

        /* renamed from: h */
        public final boolean mo114416h() {
            return this.f94344c;
        }

        public int hashCode() {
            int hashCode = ((this.f94342a.hashCode() * 31) + Integer.hashCode(this.f94343b)) * 31;
            boolean z = this.f94344c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            OfferIdentifier offerIdentifier = this.f94342a;
            int i = this.f94343b;
            boolean z = this.f94344c;
            return "Params(offer=" + offerIdentifier + ", quantity=" + i + ", synchronize=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37589a(OfferIdentifier offerIdentifier, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(offerIdentifier, i, (i2 & 4) != 0 ? false : z);
        }
    }
}
