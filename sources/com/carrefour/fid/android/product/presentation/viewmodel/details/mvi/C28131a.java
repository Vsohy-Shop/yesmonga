package com.carrefour.fid.android.product.presentation.viewmodel.details.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.product.detail.C38110e;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a */
public interface C28131a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$a */
    public static final class C28132a implements C28131a {

        /* renamed from: f */
        public static final int f68128f = 8;

        /* renamed from: a */
        public final boolean f68129a;
        @C12579k

        /* renamed from: b */
        public final OfferDetail f68130b;
        @C12579k

        /* renamed from: c */
        public final C38110e f68131c;

        /* renamed from: d */
        public final int f68132d;

        /* renamed from: e */
        public final boolean f68133e;

        public C28132a(boolean z, @C12579k OfferDetail offerDetail, @C12579k C38110e eVar, int i, boolean z2) {
            Intrinsics.checkNotNullParameter(offerDetail, "currentOfferDetail");
            Intrinsics.checkNotNullParameter(eVar, "product");
            this.f68129a = z;
            this.f68130b = offerDetail;
            this.f68131c = eVar;
            this.f68132d = i;
            this.f68133e = z2;
        }

        /* renamed from: g */
        public static /* synthetic */ C28132a m117764g(C28132a aVar, boolean z, OfferDetail offerDetail, C38110e eVar, int i, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = aVar.f68129a;
            }
            if ((i2 & 2) != 0) {
                offerDetail = aVar.f68130b;
            }
            OfferDetail offerDetail2 = offerDetail;
            if ((i2 & 4) != 0) {
                eVar = aVar.f68131c;
            }
            C38110e eVar2 = eVar;
            if ((i2 & 8) != 0) {
                i = aVar.f68132d;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                z2 = aVar.f68133e;
            }
            return aVar.mo81748f(z, offerDetail2, eVar2, i3, z2);
        }

        /* renamed from: a */
        public final boolean mo81742a() {
            return this.f68129a;
        }

        @C12579k
        /* renamed from: b */
        public final OfferDetail mo81743b() {
            return this.f68130b;
        }

        @C12579k
        /* renamed from: c */
        public final C38110e mo81744c() {
            return this.f68131c;
        }

        /* renamed from: d */
        public final int mo81745d() {
            return this.f68132d;
        }

        /* renamed from: e */
        public final boolean mo81746e() {
            return this.f68133e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28132a)) {
                return false;
            }
            C28132a aVar = (C28132a) obj;
            return this.f68129a == aVar.f68129a && Intrinsics.areEqual((Object) this.f68130b, (Object) aVar.f68130b) && Intrinsics.areEqual((Object) this.f68131c, (Object) aVar.f68131c) && this.f68132d == aVar.f68132d && this.f68133e == aVar.f68133e;
        }

        @C12579k
        /* renamed from: f */
        public final C28132a mo81748f(boolean z, @C12579k OfferDetail offerDetail, @C12579k C38110e eVar, int i, boolean z2) {
            Intrinsics.checkNotNullParameter(offerDetail, "currentOfferDetail");
            Intrinsics.checkNotNullParameter(eVar, "product");
            return new C28132a(z, offerDetail, eVar, i, z2);
        }

        @C12579k
        /* renamed from: h */
        public final OfferDetail mo81749h() {
            return this.f68130b;
        }

        public int hashCode() {
            boolean z = this.f68129a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((((((z ? 1 : 0) * true) + this.f68130b.hashCode()) * 31) + this.f68131c.hashCode()) * 31) + Integer.hashCode(this.f68132d)) * 31;
            boolean z3 = this.f68133e;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo81751i() {
            return this.f68133e;
        }

        @C12579k
        /* renamed from: j */
        public final C38110e mo81752j() {
            return this.f68131c;
        }

        /* renamed from: k */
        public final int mo81753k() {
            return this.f68132d;
        }

        /* renamed from: l */
        public final boolean mo81754l() {
            return this.f68129a;
        }

        @C12579k
        public String toString() {
            boolean z = this.f68129a;
            OfferDetail offerDetail = this.f68130b;
            C38110e eVar = this.f68131c;
            int i = this.f68132d;
            boolean z2 = this.f68133e;
            return "AddToCartSuccess(isHomeDeliveryNal=" + z + ", currentOfferDetail=" + offerDetail + ", product=" + eVar + ", quantity=" + i + ", hasMultipleOffers=" + z2 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$b */
    public static final class C28133b implements C28131a {

        /* renamed from: b */
        public static final int f68134b = 8;
        @C12580l

        /* renamed from: a */
        public final Throwable f68135a;

        public C28133b(@C12580l Throwable th) {
            this.f68135a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C28133b m117776c(C28133b bVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = bVar.f68135a;
            }
            return bVar.mo81757b(th);
        }

        @C12580l
        /* renamed from: a */
        public final Throwable mo81756a() {
            return this.f68135a;
        }

        @C12579k
        /* renamed from: b */
        public final C28133b mo81757b(@C12580l Throwable th) {
            return new C28133b(th);
        }

        @C12580l
        /* renamed from: d */
        public final Throwable mo81758d() {
            return this.f68135a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28133b) && Intrinsics.areEqual((Object) this.f68135a, (Object) ((C28133b) obj).f68135a);
        }

        public int hashCode() {
            Throwable th = this.f68135a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f68135a;
            return "Error(throwable=" + th + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$c */
    public static final class C28134c implements C28131a {
        @C12579k

        /* renamed from: a */
        public static final C28134c f68136a = new C28134c();

        /* renamed from: b */
        public static final int f68137b = 0;
    }
}
