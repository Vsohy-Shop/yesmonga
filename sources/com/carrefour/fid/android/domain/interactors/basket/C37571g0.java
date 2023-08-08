package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketReference;
import com.carrefour.fid.android.domain.models.delivery.DeliveryCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.basket.g0 */
public interface C37571g0 extends C37679f<C37572a, Basket> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.g0$a */
    public static final class C37572a {
        @C12579k

        /* renamed from: a */
        public final DeliveryCode f94336a;
        @C12579k

        /* renamed from: b */
        public final String f94337b;
        @C12579k

        /* renamed from: c */
        public final String f94338c;

        public /* synthetic */ C37572a(DeliveryCode deliveryCode, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(deliveryCode, str, str2);
        }

        /* renamed from: e */
        public static /* synthetic */ C37572a m154121e(C37572a aVar, DeliveryCode deliveryCode, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                deliveryCode = aVar.f94336a;
            }
            if ((i & 2) != 0) {
                str = aVar.f94337b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f94338c;
            }
            return aVar.mo114389d(deliveryCode, str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final DeliveryCode mo114386a() {
            return this.f94336a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114387b() {
            return this.f94337b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo114388c() {
            return this.f94338c;
        }

        @C12579k
        /* renamed from: d */
        public final C37572a mo114389d(@C12579k DeliveryCode deliveryCode, @C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(deliveryCode, "deliveryCode");
            Intrinsics.checkNotNullParameter(str, "basketReference");
            Intrinsics.checkNotNullParameter(str2, "providerId");
            return new C37572a(deliveryCode, str, str2, (DefaultConstructorMarker) null);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37572a)) {
                return false;
            }
            C37572a aVar = (C37572a) obj;
            return this.f94336a == aVar.f94336a && BasketReference.m156097f(this.f94337b, aVar.f94337b) && Intrinsics.areEqual((Object) this.f94338c, (Object) aVar.f94338c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo114391f() {
            return this.f94337b;
        }

        @C12579k
        /* renamed from: g */
        public final DeliveryCode mo114392g() {
            return this.f94336a;
        }

        @C12579k
        /* renamed from: h */
        public final String mo114393h() {
            return this.f94338c;
        }

        public int hashCode() {
            return (((this.f94336a.hashCode() * 31) + BasketReference.m156098h(this.f94337b)) * 31) + this.f94338c.hashCode();
        }

        @C12579k
        public String toString() {
            DeliveryCode deliveryCode = this.f94336a;
            String i = BasketReference.m156099i(this.f94337b);
            String str = this.f94338c;
            return "Param(deliveryCode=" + deliveryCode + ", basketReference=" + i + ", providerId=" + str + ")";
        }

        public C37572a(DeliveryCode deliveryCode, String str, String str2) {
            Intrinsics.checkNotNullParameter(deliveryCode, "deliveryCode");
            Intrinsics.checkNotNullParameter(str, "basketReference");
            Intrinsics.checkNotNullParameter(str2, "providerId");
            this.f94336a = deliveryCode;
            this.f94337b = str;
            this.f94338c = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37572a(DeliveryCode deliveryCode, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(deliveryCode, str, (i & 4) != 0 ? "" : str2, (DefaultConstructorMarker) null);
        }
    }
}
