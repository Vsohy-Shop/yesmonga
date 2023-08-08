package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.loyalty.presentation.models.LoyaltyBenefitsModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f */
public final class C26916f {
    @C12579k

    /* renamed from: a */
    public static final C26916f f65569a = new C26916f();

    /* renamed from: b */
    public static final int f65570b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$a */
    public interface C26917a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$a$a */
        public static final class C26918a implements C26917a {

            /* renamed from: b */
            public static final int f65571b = 0;

            /* renamed from: a */
            public final int f65572a;

            public C26918a(int i) {
                this.f65572a = i;
            }

            /* renamed from: c */
            public static /* synthetic */ C26918a m114018c(C26918a aVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = aVar.f65572a;
                }
                return aVar.mo78160b(i);
            }

            /* renamed from: a */
            public final int mo78159a() {
                return this.f65572a;
            }

            @C12579k
            /* renamed from: b */
            public final C26918a mo78160b(int i) {
                return new C26918a(i);
            }

            /* renamed from: d */
            public final int mo78161d() {
                return this.f65572a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26918a) && this.f65572a == ((C26918a) obj).f65572a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f65572a);
            }

            @C12579k
            public String toString() {
                int i = this.f65572a;
                return "BasketContainAlcoholCheckboxNotChecked(basketContainAlcoholCheckboxIndex=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$a$b */
        public static final class C26919b implements C26917a {

            /* renamed from: b */
            public static final int f65573b = 0;
            @C12579k

            /* renamed from: a */
            public final String f65574a;

            public C26919b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                this.f65574a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26919b m114022c(C26919b bVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f65574a;
                }
                return bVar.mo78166b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo78165a() {
                return this.f65574a;
            }

            @C12579k
            /* renamed from: b */
            public final C26919b mo78166b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "orderId");
                return new C26919b(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo78167d() {
                return this.f65574a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26919b) && Intrinsics.areEqual((Object) this.f65574a, (Object) ((C26919b) obj).f65574a);
            }

            public int hashCode() {
                return this.f65574a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65574a;
                return "CheckoutStepTwo(orderId=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$a$c */
        public static final class C26920c implements C26917a {

            /* renamed from: b */
            public static final int f65575b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f65576a;

            public C26920c(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f65576a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26920c m114026c(C26920c cVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = cVar.f65576a;
                }
                return cVar.mo78172b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo78171a() {
                return this.f65576a;
            }

            @C12579k
            /* renamed from: b */
            public final C26920c mo78172b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26920c(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo78173d() {
                return this.f65576a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26920c) && Intrinsics.areEqual((Object) this.f65576a, (Object) ((C26920c) obj).f65576a);
            }

            public int hashCode() {
                return this.f65576a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65576a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$a$d */
        public static final class C26921d implements C26917a {

            /* renamed from: d */
            public static final int f65577d = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65578a;

            /* renamed from: b */
            public final int f65579b;
            @C12579k

            /* renamed from: c */
            public final BasketType f65580c;

            public C26921d(@C12579k OfferProductModel offerProductModel, int i, @C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                this.f65578a = offerProductModel;
                this.f65579b = i;
                this.f65580c = basketType;
            }

            /* renamed from: e */
            public static /* synthetic */ C26921d m114030e(C26921d dVar, OfferProductModel offerProductModel, int i, BasketType basketType, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = dVar.f65578a;
                }
                if ((i2 & 2) != 0) {
                    i = dVar.f65579b;
                }
                if ((i2 & 4) != 0) {
                    basketType = dVar.f65580c;
                }
                return dVar.mo78180d(offerProductModel, i, basketType);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78177a() {
                return this.f65578a;
            }

            /* renamed from: b */
            public final int mo78178b() {
                return this.f65579b;
            }

            @C12579k
            /* renamed from: c */
            public final BasketType mo78179c() {
                return this.f65580c;
            }

            @C12579k
            /* renamed from: d */
            public final C26921d mo78180d(@C12579k OfferProductModel offerProductModel, int i, @C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                return new C26921d(offerProductModel, i, basketType);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26921d)) {
                    return false;
                }
                C26921d dVar = (C26921d) obj;
                return Intrinsics.areEqual((Object) this.f65578a, (Object) dVar.f65578a) && this.f65579b == dVar.f65579b && this.f65580c == dVar.f65580c;
            }

            @C12579k
            /* renamed from: f */
            public final BasketType mo78182f() {
                return this.f65580c;
            }

            /* renamed from: g */
            public final int mo78183g() {
                return this.f65579b;
            }

            @C12579k
            /* renamed from: h */
            public final OfferProductModel mo78184h() {
                return this.f65578a;
            }

            public int hashCode() {
                return (((this.f65578a.hashCode() * 31) + Integer.hashCode(this.f65579b)) * 31) + this.f65580c.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65578a;
                int i = this.f65579b;
                BasketType basketType = this.f65580c;
                return "ShowUpdateQuantity(offerProductModel=" + offerProductModel + ", initialSelectedQuantity=" + i + ", basketType=" + basketType + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$b */
    public interface C26922b extends C28505u.C28509d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$b$a */
        public static final class C26923a implements C26922b {

            /* renamed from: d */
            public static final int f65581d = 8;
            @C12579k

            /* renamed from: b */
            public final BasketDomain f65582b;

            /* renamed from: c */
            public final boolean f65583c;

            public C26923a(@C12579k BasketDomain basketDomain, boolean z) {
                Intrinsics.checkNotNullParameter(basketDomain, "basket");
                this.f65582b = basketDomain;
                this.f65583c = z;
            }

            /* renamed from: h */
            public static /* synthetic */ C26923a m114038h(C26923a aVar, BasketDomain basketDomain, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    basketDomain = aVar.f65582b;
                }
                if ((i & 2) != 0) {
                    z = aVar.f65583c;
                }
                return aVar.mo78190g(basketDomain, z);
            }

            @C12579k
            /* renamed from: e */
            public final BasketDomain mo78187e() {
                return this.f65582b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26923a)) {
                    return false;
                }
                C26923a aVar = (C26923a) obj;
                return Intrinsics.areEqual((Object) this.f65582b, (Object) aVar.f65582b) && this.f65583c == aVar.f65583c;
            }

            /* renamed from: f */
            public final boolean mo78189f() {
                return this.f65583c;
            }

            @C12579k
            /* renamed from: g */
            public final C26923a mo78190g(@C12579k BasketDomain basketDomain, boolean z) {
                Intrinsics.checkNotNullParameter(basketDomain, "basket");
                return new C26923a(basketDomain, z);
            }

            public int hashCode() {
                int hashCode = this.f65582b.hashCode() * 31;
                boolean z = this.f65583c;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            /* renamed from: i */
            public final BasketDomain mo78192i() {
                return this.f65582b;
            }

            /* renamed from: j */
            public final boolean mo78193j() {
                return this.f65583c;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26924b.m114044a(this);
            }

            @C12579k
            public String toString() {
                BasketDomain basketDomain = this.f65582b;
                boolean z = this.f65583c;
                return "BasketAmountState(basket=" + basketDomain + ", showPreparationFees=" + z + ")";
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$b$b */
        public static final class C26924b {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m114044a(@C12579k C26922b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$b$c */
        public static final class C26925c implements C26922b {
            @C12579k

            /* renamed from: b */
            public static final C26925c f65584b = new C26925c();

            /* renamed from: c */
            public static final int f65585c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26924b.m114044a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$b$d */
        public static final class C26926d implements C26922b {
            @C12579k

            /* renamed from: b */
            public static final C26926d f65586b = new C26926d();

            /* renamed from: c */
            public static final int f65587c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26924b.m114044a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$b$e */
        public static final class C26927e implements C26922b {

            /* renamed from: c */
            public static final int f65588c = 8;
            @C12579k

            /* renamed from: b */
            public final Throwable f65589b;

            public C26927e(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f65589b = th;
            }

            /* renamed from: g */
            public static /* synthetic */ C26927e m114045g(C26927e eVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = eVar.f65589b;
                }
                return eVar.mo78197f(th);
            }

            @C12579k
            /* renamed from: e */
            public final Throwable mo78195e() {
                return this.f65589b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26927e) && Intrinsics.areEqual((Object) this.f65589b, (Object) ((C26927e) obj).f65589b);
            }

            @C12579k
            /* renamed from: f */
            public final C26927e mo78197f(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26927e(th);
            }

            @C12579k
            /* renamed from: h */
            public final Throwable mo78198h() {
                return this.f65589b;
            }

            public int hashCode() {
                return this.f65589b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26924b.m114044a(this);
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65589b;
                return "ListPrimeFidErrorState(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$b$f */
        public static final class C26928f implements C26922b {

            /* renamed from: c */
            public static final int f65590c = 8;
            @C12579k

            /* renamed from: b */
            public final List<DataPrimeCmsResponse> f65591b;

            public C26928f(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "data");
                this.f65591b = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C26928f m114049g(C26928f fVar, List<DataPrimeCmsResponse> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = fVar.f65591b;
                }
                return fVar.mo78203f(list);
            }

            @C12579k
            /* renamed from: e */
            public final List<DataPrimeCmsResponse> mo78201e() {
                return this.f65591b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26928f) && Intrinsics.areEqual((Object) this.f65591b, (Object) ((C26928f) obj).f65591b);
            }

            @C12579k
            /* renamed from: f */
            public final C26928f mo78203f(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "data");
                return new C26928f(list);
            }

            @C12579k
            /* renamed from: h */
            public final List<DataPrimeCmsResponse> mo78204h() {
                return this.f65591b;
            }

            public int hashCode() {
                return this.f65591b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26924b.m114044a(this);
            }

            @C12579k
            public String toString() {
                List<DataPrimeCmsResponse> list = this.f65591b;
                return "ListPrimeFidState(data=" + list + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$b$g */
        public static final class C26929g implements C26922b {

            /* renamed from: c */
            public static final int f65592c = 0;

            /* renamed from: b */
            public final boolean f65593b;

            public C26929g() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C26929g m114053g(C26929g gVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = gVar.f65593b;
                }
                return gVar.mo78209f(z);
            }

            /* renamed from: e */
            public final boolean mo78207e() {
                return this.f65593b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26929g) && this.f65593b == ((C26929g) obj).f65593b;
            }

            @C12579k
            /* renamed from: f */
            public final C26929g mo78209f(boolean z) {
                return new C26929g(z);
            }

            public int hashCode() {
                boolean z = this.f65593b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f65593b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26924b.m114044a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f65593b;
                return "LoadingState(isLoading=" + z + ")";
            }

            public C26929g(boolean z) {
                this.f65593b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26929g(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$b$h */
        public static final class C26930h implements C26922b {

            /* renamed from: c */
            public static final int f65594c = 8;
            @C12579k

            /* renamed from: b */
            public final Pair<LoyaltyBenefitsModel, Boolean> f65595b;

            public C26930h(@C12579k Pair<? extends LoyaltyBenefitsModel, Boolean> pair) {
                Intrinsics.checkNotNullParameter(pair, "data");
                this.f65595b = pair;
            }

            /* renamed from: g */
            public static /* synthetic */ C26930h m114056g(C26930h hVar, Pair<LoyaltyBenefitsModel, Boolean> pair, int i, Object obj) {
                if ((i & 1) != 0) {
                    pair = hVar.f65595b;
                }
                return hVar.mo78215f(pair);
            }

            @C12579k
            /* renamed from: e */
            public final Pair<LoyaltyBenefitsModel, Boolean> mo78213e() {
                return this.f65595b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26930h) && Intrinsics.areEqual((Object) this.f65595b, (Object) ((C26930h) obj).f65595b);
            }

            @C12579k
            /* renamed from: f */
            public final C26930h mo78215f(@C12579k Pair<? extends LoyaltyBenefitsModel, Boolean> pair) {
                Intrinsics.checkNotNullParameter(pair, "data");
                return new C26930h(pair);
            }

            @C12579k
            /* renamed from: h */
            public final Pair<LoyaltyBenefitsModel, Boolean> mo78216h() {
                return this.f65595b;
            }

            public int hashCode() {
                return this.f65595b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26924b.m114044a(this);
            }

            @C12579k
            public String toString() {
                Pair<LoyaltyBenefitsModel, Boolean> pair = this.f65595b;
                return "LoyaltyBenefitsState(data=" + pair + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$b$i */
        public static final class C26931i implements C26922b {

            /* renamed from: c */
            public static final int f65596c = 8;
            @C12579k

            /* renamed from: b */
            public final List<OfferModel> f65597b;

            public C26931i(@C12579k List<? extends OfferModel> list) {
                Intrinsics.checkNotNullParameter(list, "offerList");
                this.f65597b = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C26931i m114060g(C26931i iVar, List<OfferModel> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = iVar.f65597b;
                }
                return iVar.mo78221f(list);
            }

            @C12579k
            /* renamed from: e */
            public final List<OfferModel> mo78219e() {
                return this.f65597b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26931i) && Intrinsics.areEqual((Object) this.f65597b, (Object) ((C26931i) obj).f65597b);
            }

            @C12579k
            /* renamed from: f */
            public final C26931i mo78221f(@C12579k List<? extends OfferModel> list) {
                Intrinsics.checkNotNullParameter(list, "offerList");
                return new C26931i(list);
            }

            @C12579k
            /* renamed from: h */
            public final List<OfferModel> mo78222h() {
                return this.f65597b;
            }

            public int hashCode() {
                return this.f65597b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26924b.m114044a(this);
            }

            @C12579k
            public String toString() {
                List<OfferModel> list = this.f65597b;
                return "OfferListState(offerList=" + list + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c */
    public interface C26932c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c$a */
        public static final class C26933a implements C26932c {

            /* renamed from: b */
            public static final int f65598b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65599a;

            public C26933a(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65599a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26933a m114064c(C26933a aVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = aVar.f65599a;
                }
                return aVar.mo78226b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78225a() {
                return this.f65599a;
            }

            @C12579k
            /* renamed from: b */
            public final C26933a mo78226b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26933a(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo78227d() {
                return this.f65599a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26933a) && Intrinsics.areEqual((Object) this.f65599a, (Object) ((C26933a) obj).f65599a);
            }

            public int hashCode() {
                return this.f65599a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65599a;
                return "AddProductToBasket(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c$b */
        public static final class C26934b implements C26932c {

            /* renamed from: b */
            public static final int f65600b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65601a;

            public C26934b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65601a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26934b m114068c(C26934b bVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = bVar.f65601a;
                }
                return bVar.mo78232b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78231a() {
                return this.f65601a;
            }

            @C12579k
            /* renamed from: b */
            public final C26934b mo78232b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26934b(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo78233d() {
                return this.f65601a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26934b) && Intrinsics.areEqual((Object) this.f65601a, (Object) ((C26934b) obj).f65601a);
            }

            public int hashCode() {
                return this.f65601a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65601a;
                return "AddProductToShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c$c */
        public static final class C26935c implements C26932c {

            /* renamed from: b */
            public static final int f65602b = 0;

            /* renamed from: a */
            public final boolean f65603a;

            public C26935c(boolean z) {
                this.f65603a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26935c m114072c(C26935c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f65603a;
                }
                return cVar.mo78238b(z);
            }

            /* renamed from: a */
            public final boolean mo78237a() {
                return this.f65603a;
            }

            @C12579k
            /* renamed from: b */
            public final C26935c mo78238b(boolean z) {
                return new C26935c(z);
            }

            /* renamed from: d */
            public final boolean mo78239d() {
                return this.f65603a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26935c) && this.f65603a == ((C26935c) obj).f65603a;
            }

            public int hashCode() {
                boolean z = this.f65603a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f65603a;
                return "BasketContainAlcoholCheckedChange(isChecked=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c$d */
        public static final class C26936d implements C26932c {
            @C12579k

            /* renamed from: a */
            public static final C26936d f65604a = new C26936d();

            /* renamed from: b */
            public static final int f65605b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c$e */
        public static final class C26937e implements C26932c {

            /* renamed from: b */
            public static final int f65606b = 0;

            /* renamed from: a */
            public final boolean f65607a;

            public C26937e(boolean z) {
                this.f65607a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26937e m114076c(C26937e eVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = eVar.f65607a;
                }
                return eVar.mo78244b(z);
            }

            /* renamed from: a */
            public final boolean mo78243a() {
                return this.f65607a;
            }

            @C12579k
            /* renamed from: b */
            public final C26937e mo78244b(boolean z) {
                return new C26937e(z);
            }

            /* renamed from: d */
            public final boolean mo78245d() {
                return this.f65607a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26937e) && this.f65607a == ((C26937e) obj).f65607a;
            }

            public int hashCode() {
                boolean z = this.f65607a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f65607a;
                return "ExpandUnavailableProducts(isExpanded=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c$f */
        public static final class C26938f implements C26932c {

            /* renamed from: b */
            public static final int f65608b = OrderType.f70277d;
            @C12580l

            /* renamed from: a */
            public final OrderType f65609a;

            public C26938f(@C12580l OrderType orderType) {
                this.f65609a = orderType;
            }

            /* renamed from: c */
            public static /* synthetic */ C26938f m114080c(C26938f fVar, OrderType orderType, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderType = fVar.f65609a;
                }
                return fVar.mo78250b(orderType);
            }

            @C12580l
            /* renamed from: a */
            public final OrderType mo78249a() {
                return this.f65609a;
            }

            @C12579k
            /* renamed from: b */
            public final C26938f mo78250b(@C12580l OrderType orderType) {
                return new C26938f(orderType);
            }

            @C12580l
            /* renamed from: d */
            public final OrderType mo78251d() {
                return this.f65609a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26938f) && Intrinsics.areEqual((Object) this.f65609a, (Object) ((C26938f) obj).f65609a);
            }

            public int hashCode() {
                OrderType orderType = this.f65609a;
                if (orderType == null) {
                    return 0;
                }
                return orderType.hashCode();
            }

            @C12579k
            public String toString() {
                OrderType orderType = this.f65609a;
                return "NavArgument(orderType=" + orderType + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c$h */
        public static final class C26940h implements C26932c {

            /* renamed from: b */
            public static final int f65613b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65614a;

            public C26940h(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65614a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26940h m114090c(C26940h hVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = hVar.f65614a;
                }
                return hVar.mo78264b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78263a() {
                return this.f65614a;
            }

            @C12579k
            /* renamed from: b */
            public final C26940h mo78264b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26940h(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo78265d() {
                return this.f65614a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26940h) && Intrinsics.areEqual((Object) this.f65614a, (Object) ((C26940h) obj).f65614a);
            }

            public int hashCode() {
                return this.f65614a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65614a;
                return "RemoveProductFromShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c$i */
        public static final class C26941i implements C26932c {

            /* renamed from: b */
            public static final int f65615b = 0;

            /* renamed from: a */
            public final boolean f65616a;

            public C26941i() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: c */
            public static /* synthetic */ C26941i m114094c(C26941i iVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = iVar.f65616a;
                }
                return iVar.mo78270b(z);
            }

            /* renamed from: a */
            public final boolean mo78269a() {
                return this.f65616a;
            }

            @C12579k
            /* renamed from: b */
            public final C26941i mo78270b(boolean z) {
                return new C26941i(z);
            }

            /* renamed from: d */
            public final boolean mo78271d() {
                return this.f65616a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26941i) && this.f65616a == ((C26941i) obj).f65616a;
            }

            public int hashCode() {
                boolean z = this.f65616a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f65616a;
                return "Synchronize(isLoading=" + z + ")";
            }

            public C26941i(boolean z) {
                this.f65616a = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26941i(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c$j */
        public static final class C26942j implements C26932c {

            /* renamed from: c */
            public static final int f65617c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65618a;

            /* renamed from: b */
            public final int f65619b;

            public C26942j(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65618a = offerProductModel;
                this.f65619b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C26942j m114098d(C26942j jVar, OfferProductModel offerProductModel, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = jVar.f65618a;
                }
                if ((i2 & 2) != 0) {
                    i = jVar.f65619b;
                }
                return jVar.mo78277c(offerProductModel, i);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78275a() {
                return this.f65618a;
            }

            /* renamed from: b */
            public final int mo78276b() {
                return this.f65619b;
            }

            @C12579k
            /* renamed from: c */
            public final C26942j mo78277c(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26942j(offerProductModel, i);
            }

            /* renamed from: e */
            public final int mo78278e() {
                return this.f65619b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26942j)) {
                    return false;
                }
                C26942j jVar = (C26942j) obj;
                return Intrinsics.areEqual((Object) this.f65618a, (Object) jVar.f65618a) && this.f65619b == jVar.f65619b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferProductModel mo78280f() {
                return this.f65618a;
            }

            public int hashCode() {
                return (this.f65618a.hashCode() * 31) + Integer.hashCode(this.f65619b);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65618a;
                int i = this.f65619b;
                return "UpdateQuantityFromBottomSheet(offerProductModel=" + offerProductModel + ", initialSelectedQuantity=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c$k */
        public static final class C26943k implements C26932c {
            @C12579k

            /* renamed from: a */
            public static final C26943k f65620a = new C26943k();

            /* renamed from: b */
            public static final int f65621b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.f$c$g */
        public static final class C26939g implements C26932c {

            /* renamed from: c */
            public static final int f65610c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65611a;
            @C12580l

            /* renamed from: b */
            public final Integer f65612b;

            public C26939g(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65611a = offerProductModel;
                this.f65612b = num;
            }

            /* renamed from: d */
            public static /* synthetic */ C26939g m114084d(C26939g gVar, OfferProductModel offerProductModel, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = gVar.f65611a;
                }
                if ((i & 2) != 0) {
                    num = gVar.f65612b;
                }
                return gVar.mo78257c(offerProductModel, num);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78255a() {
                return this.f65611a;
            }

            @C12580l
            /* renamed from: b */
            public final Integer mo78256b() {
                return this.f65612b;
            }

            @C12579k
            /* renamed from: c */
            public final C26939g mo78257c(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26939g(offerProductModel, num);
            }

            @C12579k
            /* renamed from: e */
            public final OfferProductModel mo78258e() {
                return this.f65611a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26939g)) {
                    return false;
                }
                C26939g gVar = (C26939g) obj;
                return Intrinsics.areEqual((Object) this.f65611a, (Object) gVar.f65611a) && Intrinsics.areEqual((Object) this.f65612b, (Object) gVar.f65612b);
            }

            @C12580l
            /* renamed from: f */
            public final Integer mo78260f() {
                return this.f65612b;
            }

            public int hashCode() {
                int hashCode = this.f65611a.hashCode() * 31;
                Integer num = this.f65612b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65611a;
                Integer num = this.f65612b;
                return "RemoveProductFromBasket(offerProductModel=" + offerProductModel + ", quantity=" + num + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26939g(OfferProductModel offerProductModel, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(offerProductModel, (i & 2) != 0 ? null : num);
            }
        }
    }
}
