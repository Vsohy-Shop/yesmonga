package com.carrefour.fid.android.product.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.criteo.C38003e;
import com.carrefour.fid.android.domain.models.criteo.C38004f;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.models.g */
public interface C27670g {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.models.g$a */
    public static final class C27671a implements C27670g {

        /* renamed from: c */
        public static final int f67186c = 8;
        @C12579k

        /* renamed from: a */
        public final C38003e f67187a;

        /* renamed from: b */
        public final int f67188b;

        public C27671a(@C12579k C38003e eVar, int i) {
            Intrinsics.checkNotNullParameter(eVar, "butterfly");
            this.f67187a = eVar;
            this.f67188b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C27671a m116409d(C27671a aVar, C38003e eVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                eVar = aVar.f67187a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f67188b;
            }
            return aVar.mo80367c(eVar, i);
        }

        @C12579k
        /* renamed from: a */
        public final C38003e mo80365a() {
            return this.f67187a;
        }

        /* renamed from: b */
        public final int mo80366b() {
            return this.f67188b;
        }

        @C12579k
        /* renamed from: c */
        public final C27671a mo80367c(@C12579k C38003e eVar, int i) {
            Intrinsics.checkNotNullParameter(eVar, "butterfly");
            return new C27671a(eVar, i);
        }

        @C12579k
        /* renamed from: e */
        public final C38003e mo80368e() {
            return this.f67187a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27671a)) {
                return false;
            }
            C27671a aVar = (C27671a) obj;
            return Intrinsics.areEqual((Object) this.f67187a, (Object) aVar.f67187a) && this.f67188b == aVar.f67188b;
        }

        /* renamed from: f */
        public final int mo80370f() {
            return this.f67188b;
        }

        public int hashCode() {
            return (this.f67187a.hashCode() * 31) + Integer.hashCode(this.f67188b);
        }

        @C12579k
        public String toString() {
            C38003e eVar = this.f67187a;
            int i = this.f67188b;
            return "CriteoPlpButterFlyModel(butterfly=" + eVar + ", selectedProductPosition=" + i + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.models.g$b */
    public static final class C27672b implements C27670g {

        /* renamed from: c */
        public static final int f67189c = 8;
        @C12579k

        /* renamed from: a */
        public final C38004f f67190a;

        /* renamed from: b */
        public final int f67191b;

        public C27672b(@C12579k C38004f fVar, int i) {
            Intrinsics.checkNotNullParameter(fVar, "flagship");
            this.f67190a = fVar;
            this.f67191b = i;
        }

        /* renamed from: d */
        public static /* synthetic */ C27672b m116415d(C27672b bVar, C38004f fVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                fVar = bVar.f67190a;
            }
            if ((i2 & 2) != 0) {
                i = bVar.f67191b;
            }
            return bVar.mo80375c(fVar, i);
        }

        @C12579k
        /* renamed from: a */
        public final C38004f mo80373a() {
            return this.f67190a;
        }

        /* renamed from: b */
        public final int mo80374b() {
            return this.f67191b;
        }

        @C12579k
        /* renamed from: c */
        public final C27672b mo80375c(@C12579k C38004f fVar, int i) {
            Intrinsics.checkNotNullParameter(fVar, "flagship");
            return new C27672b(fVar, i);
        }

        @C12579k
        /* renamed from: e */
        public final C38004f mo80376e() {
            return this.f67190a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27672b)) {
                return false;
            }
            C27672b bVar = (C27672b) obj;
            return Intrinsics.areEqual((Object) this.f67190a, (Object) bVar.f67190a) && this.f67191b == bVar.f67191b;
        }

        /* renamed from: f */
        public final int mo80378f() {
            return this.f67191b;
        }

        public int hashCode() {
            return (this.f67190a.hashCode() * 31) + Integer.hashCode(this.f67191b);
        }

        @C12579k
        public String toString() {
            C38004f fVar = this.f67190a;
            int i = this.f67191b;
            return "CriteoPlpFlagshipModel(flagship=" + fVar + ", selectedProductPosition=" + i + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.models.g$c */
    public static final class C27673c implements C27670g {

        /* renamed from: e */
        public static final int f67192e = 0;

        /* renamed from: a */
        public final int f67193a;
        @C12579k

        /* renamed from: b */
        public final String f67194b;
        @C12579k

        /* renamed from: c */
        public final String f67195c;
        @C12579k

        /* renamed from: d */
        public final String f67196d;

        public C27673c(int i, @C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "imageUrl");
            Intrinsics.checkNotNullParameter(str2, "name");
            Intrinsics.checkNotNullParameter(str3, "query");
            this.f67193a = i;
            this.f67194b = str;
            this.f67195c = str2;
            this.f67196d = str3;
        }

        /* renamed from: f */
        public static /* synthetic */ C27673c m116421f(C27673c cVar, int i, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = cVar.f67193a;
            }
            if ((i2 & 2) != 0) {
                str = cVar.f67194b;
            }
            if ((i2 & 4) != 0) {
                str2 = cVar.f67195c;
            }
            if ((i2 & 8) != 0) {
                str3 = cVar.f67196d;
            }
            return cVar.mo80385e(i, str, str2, str3);
        }

        /* renamed from: a */
        public final int mo80381a() {
            return this.f67193a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo80382b() {
            return this.f67194b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo80383c() {
            return this.f67195c;
        }

        @C12579k
        /* renamed from: d */
        public final String mo80384d() {
            return this.f67196d;
        }

        @C12579k
        /* renamed from: e */
        public final C27673c mo80385e(int i, @C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "imageUrl");
            Intrinsics.checkNotNullParameter(str2, "name");
            Intrinsics.checkNotNullParameter(str3, "query");
            return new C27673c(i, str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27673c)) {
                return false;
            }
            C27673c cVar = (C27673c) obj;
            return this.f67193a == cVar.f67193a && Intrinsics.areEqual((Object) this.f67194b, (Object) cVar.f67194b) && Intrinsics.areEqual((Object) this.f67195c, (Object) cVar.f67195c) && Intrinsics.areEqual((Object) this.f67196d, (Object) cVar.f67196d);
        }

        /* renamed from: g */
        public final int mo80387g() {
            return this.f67193a;
        }

        @C12579k
        /* renamed from: h */
        public final String mo80388h() {
            return this.f67194b;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f67193a) * 31) + this.f67194b.hashCode()) * 31) + this.f67195c.hashCode()) * 31) + this.f67196d.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final String mo80390i() {
            return this.f67195c;
        }

        @C12579k
        /* renamed from: j */
        public final String mo80391j() {
            return this.f67196d;
        }

        @C12579k
        public String toString() {
            int i = this.f67193a;
            String str = this.f67194b;
            String str2 = this.f67195c;
            String str3 = this.f67196d;
            return "LuckyCartBannerDetailsModel(id=" + i + ", imageUrl=" + str + ", name=" + str2 + ", query=" + str3 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.models.g$d */
    public static final class C27674d implements C27670g {

        /* renamed from: c */
        public static final int f67197c = 8;
        @C12579k

        /* renamed from: a */
        public final Offer f67198a;

        /* renamed from: b */
        public final boolean f67199b;

        public C27674d(@C12579k Offer offer, boolean z) {
            Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
            this.f67198a = offer;
            this.f67199b = z;
        }

        /* renamed from: d */
        public static /* synthetic */ C27674d m116431d(C27674d dVar, Offer offer, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                offer = dVar.f67198a;
            }
            if ((i & 2) != 0) {
                z = dVar.f67199b;
            }
            return dVar.mo80395c(offer, z);
        }

        @C12579k
        /* renamed from: a */
        public final Offer mo80393a() {
            return this.f67198a;
        }

        /* renamed from: b */
        public final boolean mo80394b() {
            return this.f67199b;
        }

        @C12579k
        /* renamed from: c */
        public final C27674d mo80395c(@C12579k Offer offer, boolean z) {
            Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
            return new C27674d(offer, z);
        }

        @C12579k
        /* renamed from: e */
        public final Offer mo80396e() {
            return this.f67198a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27674d)) {
                return false;
            }
            C27674d dVar = (C27674d) obj;
            return Intrinsics.areEqual((Object) this.f67198a, (Object) dVar.f67198a) && this.f67199b == dVar.f67199b;
        }

        /* renamed from: f */
        public final boolean mo80398f() {
            return this.f67199b;
        }

        public int hashCode() {
            int hashCode = this.f67198a.hashCode() * 31;
            boolean z = this.f67199b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            Offer offer = this.f67198a;
            boolean z = this.f67199b;
            return "OfferModel(offer=" + offer + ", showMixingOverlay=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.models.g$e */
    public static final class C27675e implements C27670g {

        /* renamed from: c */
        public static final int f67200c = 0;

        /* renamed from: a */
        public final int f67201a;
        @C12579k

        /* renamed from: b */
        public final String f67202b;

        public C27675e(int i, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "textCategory");
            this.f67201a = i;
            this.f67202b = str;
        }

        /* renamed from: d */
        public static /* synthetic */ C27675e m116437d(C27675e eVar, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = eVar.f67201a;
            }
            if ((i2 & 2) != 0) {
                str = eVar.f67202b;
            }
            return eVar.mo80403c(i, str);
        }

        /* renamed from: a */
        public final int mo80401a() {
            return this.f67201a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo80402b() {
            return this.f67202b;
        }

        @C12579k
        /* renamed from: c */
        public final C27675e mo80403c(int i, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "textCategory");
            return new C27675e(i, str);
        }

        /* renamed from: e */
        public final int mo80404e() {
            return this.f67201a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27675e)) {
                return false;
            }
            C27675e eVar = (C27675e) obj;
            return this.f67201a == eVar.f67201a && Intrinsics.areEqual((Object) this.f67202b, (Object) eVar.f67202b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo80406f() {
            return this.f67202b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f67201a) * 31) + this.f67202b.hashCode();
        }

        @C12579k
        public String toString() {
            int i = this.f67201a;
            String str = this.f67202b;
            return "ProductHeaderModel(count=" + i + ", textCategory=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.models.g$f */
    public static final class C27676f implements C27670g {

        /* renamed from: c */
        public static final int f67203c = 8;
        @C12579k

        /* renamed from: a */
        public final C38114b f67204a;

        /* renamed from: b */
        public final boolean f67205b;

        public C27676f(@C12579k C38114b bVar, boolean z) {
            Intrinsics.checkNotNullParameter(bVar, "plpItemData");
            this.f67204a = bVar;
            this.f67205b = z;
        }

        /* renamed from: d */
        public static /* synthetic */ C27676f m116443d(C27676f fVar, C38114b bVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar = fVar.f67204a;
            }
            if ((i & 2) != 0) {
                z = fVar.f67205b;
            }
            return fVar.mo80411c(bVar, z);
        }

        @C12579k
        /* renamed from: a */
        public final C38114b mo80409a() {
            return this.f67204a;
        }

        /* renamed from: b */
        public final boolean mo80410b() {
            return this.f67205b;
        }

        @C12579k
        /* renamed from: c */
        public final C27676f mo80411c(@C12579k C38114b bVar, boolean z) {
            Intrinsics.checkNotNullParameter(bVar, "plpItemData");
            return new C27676f(bVar, z);
        }

        @C12579k
        /* renamed from: e */
        public final C38114b mo80412e() {
            return this.f67204a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27676f)) {
                return false;
            }
            C27676f fVar = (C27676f) obj;
            return Intrinsics.areEqual((Object) this.f67204a, (Object) fVar.f67204a) && this.f67205b == fVar.f67205b;
        }

        /* renamed from: f */
        public final boolean mo80414f() {
            return this.f67205b;
        }

        public int hashCode() {
            int hashCode = this.f67204a.hashCode() * 31;
            boolean z = this.f67205b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            C38114b bVar = this.f67204a;
            boolean z = this.f67205b;
            return "ProductModel(plpItemData=" + bVar + ", showMixingOverlay=" + z + ")";
        }
    }
}
