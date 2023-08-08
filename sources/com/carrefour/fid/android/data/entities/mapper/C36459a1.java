package com.carrefour.fid.android.data.entities.mapper;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.core.constants.C36181l;
import com.carrefour.fid.android.data.entities.InitPaymentResponse;
import com.carrefour.fid.android.data.entities.OrderV3;
import com.carrefour.fid.android.data.entities.mapper.C36531u0;
import com.carrefour.fid.android.data.entities.mapper.C36546y0;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.domain.models.OrderDomain;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.presentation.models.PaymentConfirmationModel;
import com.carrefour.fid.android.shared.base.C28486g;
import com.carrefour.fid.android.shared.constant.C28559l;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.a1 */
public final class C36459a1 extends C28486g<C36460a, PaymentConfirmationModel> {

    /* renamed from: f */
    public static final int f90134f = 0;
    @C12579k

    /* renamed from: b */
    public final C36531u0 f90135b;
    @C12579k

    /* renamed from: c */
    public final C36540w0 f90136c;
    @C12579k

    /* renamed from: d */
    public final C36546y0 f90137d;
    @C12579k

    /* renamed from: e */
    public final C36465b0 f90138e;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.a1$a */
    public static abstract class C36460a {

        /* renamed from: a */
        public static final int f90139a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.data.entities.mapper.a1$a$a */
        public static final class C36461a extends C36460a {

            /* renamed from: g */
            public static final int f90140g = 8;
            @C12579k

            /* renamed from: b */
            public final OrderV3 f90141b;
            @C12580l

            /* renamed from: c */
            public final BasketDomain f90142c;
            @C12580l

            /* renamed from: d */
            public final StoreService f90143d;

            /* renamed from: e */
            public final boolean f90144e;

            /* renamed from: f */
            public final boolean f90145f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C36461a(@C12579k OrderV3 orderV3, @C12580l BasketDomain basketDomain, @C12580l StoreService storeService, boolean z, boolean z2) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(orderV3, "orderV3");
                this.f90141b = orderV3;
                this.f90142c = basketDomain;
                this.f90143d = storeService;
                this.f90144e = z;
                this.f90145f = z2;
            }

            /* renamed from: g */
            public static /* synthetic */ C36461a m149556g(C36461a aVar, OrderV3 orderV3, BasketDomain basketDomain, StoreService storeService, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderV3 = aVar.f90141b;
                }
                if ((i & 2) != 0) {
                    basketDomain = aVar.f90142c;
                }
                BasketDomain basketDomain2 = basketDomain;
                if ((i & 4) != 0) {
                    storeService = aVar.f90143d;
                }
                StoreService storeService2 = storeService;
                if ((i & 8) != 0) {
                    z = aVar.f90144e;
                }
                boolean z3 = z;
                if ((i & 16) != 0) {
                    z2 = aVar.f90145f;
                }
                return aVar.mo111193f(orderV3, basketDomain2, storeService2, z3, z2);
            }

            @C12579k
            /* renamed from: a */
            public final OrderV3 mo111187a() {
                return this.f90141b;
            }

            @C12580l
            /* renamed from: b */
            public final BasketDomain mo111188b() {
                return this.f90142c;
            }

            @C12580l
            /* renamed from: c */
            public final StoreService mo111189c() {
                return this.f90143d;
            }

            /* renamed from: d */
            public final boolean mo111190d() {
                return this.f90144e;
            }

            /* renamed from: e */
            public final boolean mo111191e() {
                return this.f90145f;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C36461a)) {
                    return false;
                }
                C36461a aVar = (C36461a) obj;
                return Intrinsics.areEqual((Object) this.f90141b, (Object) aVar.f90141b) && Intrinsics.areEqual((Object) this.f90142c, (Object) aVar.f90142c) && Intrinsics.areEqual((Object) this.f90143d, (Object) aVar.f90143d) && this.f90144e == aVar.f90144e && this.f90145f == aVar.f90145f;
            }

            @C12579k
            /* renamed from: f */
            public final C36461a mo111193f(@C12579k OrderV3 orderV3, @C12580l BasketDomain basketDomain, @C12580l StoreService storeService, boolean z, boolean z2) {
                Intrinsics.checkNotNullParameter(orderV3, "orderV3");
                return new C36461a(orderV3, basketDomain, storeService, z, z2);
            }

            @C12580l
            /* renamed from: h */
            public final BasketDomain mo111194h() {
                return this.f90142c;
            }

            public int hashCode() {
                int hashCode = this.f90141b.hashCode() * 31;
                BasketDomain basketDomain = this.f90142c;
                int i = 0;
                int hashCode2 = (hashCode + (basketDomain == null ? 0 : basketDomain.hashCode())) * 31;
                StoreService storeService = this.f90143d;
                if (storeService != null) {
                    i = storeService.hashCode();
                }
                int i2 = (hashCode2 + i) * 31;
                boolean z = this.f90144e;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i3 = (i2 + (z ? 1 : 0)) * 31;
                boolean z3 = this.f90145f;
                if (!z3) {
                    z2 = z3;
                }
                return i3 + (z2 ? 1 : 0);
            }

            @C12579k
            /* renamed from: i */
            public final OrderV3 mo111196i() {
                return this.f90141b;
            }

            @C12580l
            /* renamed from: j */
            public final StoreService mo111197j() {
                return this.f90143d;
            }

            /* renamed from: k */
            public final boolean mo111198k() {
                return this.f90144e;
            }

            /* renamed from: l */
            public final boolean mo111199l() {
                return this.f90145f;
            }

            @C12579k
            public String toString() {
                OrderV3 orderV3 = this.f90141b;
                BasketDomain basketDomain = this.f90142c;
                StoreService storeService = this.f90143d;
                boolean z = this.f90144e;
                boolean z2 = this.f90145f;
                return "FullFidPaymentParams(orderV3=" + orderV3 + ", basket=" + basketDomain + ", storeService=" + storeService + ", isExpressPickup=" + z + ", isPostOrderSubstitutionEnabled=" + z2 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.data.entities.mapper.a1$a$b */
        public static final class C36462b extends C36460a {

            /* renamed from: h */
            public static final int f90146h = 8;
            @C12580l

            /* renamed from: b */
            public final InitPaymentResponse f90147b;
            @C12580l

            /* renamed from: c */
            public final BasketDomain f90148c;
            @C12580l

            /* renamed from: d */
            public final String f90149d;
            @C12579k

            /* renamed from: e */
            public final String f90150e;

            /* renamed from: f */
            public final boolean f90151f;

            /* renamed from: g */
            public final boolean f90152g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C36462b(@C12580l InitPaymentResponse initPaymentResponse, @C12580l BasketDomain basketDomain, @C12580l String str, @C12579k String str2, boolean z, boolean z2) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str2, "userLoyaltyAmount");
                this.f90147b = initPaymentResponse;
                this.f90148c = basketDomain;
                this.f90149d = str;
                this.f90150e = str2;
                this.f90151f = z;
                this.f90152g = z2;
            }

            /* renamed from: h */
            public static /* synthetic */ C36462b m149568h(C36462b bVar, InitPaymentResponse initPaymentResponse, BasketDomain basketDomain, String str, String str2, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    initPaymentResponse = bVar.f90147b;
                }
                if ((i & 2) != 0) {
                    basketDomain = bVar.f90148c;
                }
                BasketDomain basketDomain2 = basketDomain;
                if ((i & 4) != 0) {
                    str = bVar.f90149d;
                }
                String str3 = str;
                if ((i & 8) != 0) {
                    str2 = bVar.f90150e;
                }
                String str4 = str2;
                if ((i & 16) != 0) {
                    z = bVar.f90151f;
                }
                boolean z3 = z;
                if ((i & 32) != 0) {
                    z2 = bVar.f90152g;
                }
                return bVar.mo111208g(initPaymentResponse, basketDomain2, str3, str4, z3, z2);
            }

            @C12580l
            /* renamed from: a */
            public final InitPaymentResponse mo111201a() {
                return this.f90147b;
            }

            @C12580l
            /* renamed from: b */
            public final BasketDomain mo111202b() {
                return this.f90148c;
            }

            @C12580l
            /* renamed from: c */
            public final String mo111203c() {
                return this.f90149d;
            }

            @C12579k
            /* renamed from: d */
            public final String mo111204d() {
                return this.f90150e;
            }

            /* renamed from: e */
            public final boolean mo111205e() {
                return this.f90151f;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C36462b)) {
                    return false;
                }
                C36462b bVar = (C36462b) obj;
                return Intrinsics.areEqual((Object) this.f90147b, (Object) bVar.f90147b) && Intrinsics.areEqual((Object) this.f90148c, (Object) bVar.f90148c) && Intrinsics.areEqual((Object) this.f90149d, (Object) bVar.f90149d) && Intrinsics.areEqual((Object) this.f90150e, (Object) bVar.f90150e) && this.f90151f == bVar.f90151f && this.f90152g == bVar.f90152g;
            }

            /* renamed from: f */
            public final boolean mo111207f() {
                return this.f90152g;
            }

            @C12579k
            /* renamed from: g */
            public final C36462b mo111208g(@C12580l InitPaymentResponse initPaymentResponse, @C12580l BasketDomain basketDomain, @C12580l String str, @C12579k String str2, boolean z, boolean z2) {
                Intrinsics.checkNotNullParameter(str2, "userLoyaltyAmount");
                return new C36462b(initPaymentResponse, basketDomain, str, str2, z, z2);
            }

            public int hashCode() {
                InitPaymentResponse initPaymentResponse = this.f90147b;
                int i = 0;
                int hashCode = (initPaymentResponse == null ? 0 : initPaymentResponse.hashCode()) * 31;
                BasketDomain basketDomain = this.f90148c;
                int hashCode2 = (hashCode + (basketDomain == null ? 0 : basketDomain.hashCode())) * 31;
                String str = this.f90149d;
                if (str != null) {
                    i = str.hashCode();
                }
                int hashCode3 = (((hashCode2 + i) * 31) + this.f90150e.hashCode()) * 31;
                boolean z = this.f90151f;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
                boolean z3 = this.f90152g;
                if (!z3) {
                    z2 = z3;
                }
                return i2 + (z2 ? 1 : 0);
            }

            @C12580l
            /* renamed from: i */
            public final BasketDomain mo111210i() {
                return this.f90148c;
            }

            @C12580l
            /* renamed from: j */
            public final InitPaymentResponse mo111211j() {
                return this.f90147b;
            }

            @C12580l
            /* renamed from: k */
            public final String mo111212k() {
                return this.f90149d;
            }

            @C12579k
            /* renamed from: l */
            public final String mo111213l() {
                return this.f90150e;
            }

            /* renamed from: m */
            public final boolean mo111214m() {
                return this.f90151f;
            }

            /* renamed from: n */
            public final boolean mo111215n() {
                return this.f90152g;
            }

            @C12579k
            public String toString() {
                InitPaymentResponse initPaymentResponse = this.f90147b;
                BasketDomain basketDomain = this.f90148c;
                String str = this.f90149d;
                String str2 = this.f90150e;
                boolean z = this.f90151f;
                boolean z2 = this.f90152g;
                return "SdpPaymentParams(order=" + initPaymentResponse + ", basket=" + basketDomain + ", storeName=" + str + ", userLoyaltyAmount=" + str2 + ", isExpressPickup=" + z + ", isPostOrderSubstitutionEnabled=" + z2 + ")";
            }
        }

        public /* synthetic */ C36460a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C36460a() {
        }
    }

    @Inject
    public C36459a1(@C12579k C36531u0 u0Var, @C12579k C36540w0 w0Var, @C12579k C36546y0 y0Var, @C12579k C36465b0 b0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "mapper");
        Intrinsics.checkNotNullParameter(w0Var, "orderConfirmationModelMapper");
        Intrinsics.checkNotNullParameter(y0Var, "orderV3Mapper");
        Intrinsics.checkNotNullParameter(b0Var, "bundleMapper");
        this.f90135b = u0Var;
        this.f90136c = w0Var;
        this.f90137d = y0Var;
        this.f90138e = b0Var;
    }

    @C12579k
    /* renamed from: d */
    public PaymentConfirmationModel mo72340a(@C12579k C36460a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "entity");
        if (aVar instanceof C36460a.C36461a) {
            Bundle bundle = new Bundle();
            C36460a.C36461a aVar2 = (C36460a.C36461a) aVar;
            bundle.putParcelable("orderKey", mo111185e(aVar2));
            bundle.putBoolean(C36178i.f89313h, false);
            bundle.putBoolean(C28559l.f69485a, aVar2.mo111198k());
            bundle.putBoolean(C36181l.f89333a, aVar2.mo111199l());
            return new PaymentConfirmationModel.FullFidPayment(bundle);
        } else if (aVar instanceof C36460a.C36462b) {
            C36460a.C36462b bVar = (C36460a.C36462b) aVar;
            Bundle d = this.f90138e.mo72340a(C10977s0.m41456W(C11078d1.m42659a("MF_PAYMENT_TRANSACTION_DATA_EXTRA", mo111186f(bVar.mo111211j(), bVar.mo111210i(), bVar.mo111212k()).mo116178d().mo116467b()), C11078d1.m42659a("LOYALTY_AMOUNT_DATA", bVar.mo111213l())));
            d.putBoolean(C28559l.f69485a, bVar.mo111214m());
            d.putBoolean(C36181l.f89333a, bVar.mo111215n());
            return new PaymentConfirmationModel.SdpPayment(d);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: e */
    public final OrderConfirmationModel mo111185e(C36460a.C36461a aVar) {
        C36540w0 w0Var = this.f90136c;
        OrderConfirmationDomain f = this.f90135b.mo72340a(new C36531u0.C36532a(aVar.mo111196i(), aVar.mo111194h(), aVar.mo111197j()));
        Intrinsics.checkNotNull(f, "null cannot be cast to non-null type com.carrefour.fid.android.domain.models.OrderConfirmationDomain");
        return w0Var.mo72340a(f);
    }

    /* renamed from: f */
    public final OrderDomain mo111186f(InitPaymentResponse initPaymentResponse, BasketDomain basketDomain, String str) {
        return this.f90137d.mo72340a(new C36546y0.C36547a(initPaymentResponse, basketDomain, str));
    }
}
