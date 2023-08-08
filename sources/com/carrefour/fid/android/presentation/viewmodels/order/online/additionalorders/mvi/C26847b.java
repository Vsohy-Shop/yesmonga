package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b */
public final class C26847b {
    @C12579k

    /* renamed from: a */
    public static final C26847b f65446a = new C26847b();

    /* renamed from: b */
    public static final int f65447b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$a */
    public interface C26848a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$a$a */
        public static final class C26849a implements C26848a {

            /* renamed from: b */
            public static final int f65448b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f65449a;

            public C26849a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f65449a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26849a m113851c(C26849a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f65449a;
                }
                return aVar.mo77924b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo77923a() {
                return this.f65449a;
            }

            @C12579k
            /* renamed from: b */
            public final C26849a mo77924b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26849a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo77925d() {
                return this.f65449a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26849a) && Intrinsics.areEqual((Object) this.f65449a, (Object) ((C26849a) obj).f65449a);
            }

            public int hashCode() {
                return this.f65449a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65449a;
                return "ErrorEvent(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$a$b */
        public static final class C26850b implements C26848a {

            /* renamed from: c */
            public static final int f65450c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65451a;

            /* renamed from: b */
            public final boolean f65452b;

            public C26850b(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65451a = offerProductModel;
                this.f65452b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C26850b m113855d(C26850b bVar, OfferProductModel offerProductModel, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = bVar.f65451a;
                }
                if ((i & 2) != 0) {
                    z = bVar.f65452b;
                }
                return bVar.mo77931c(offerProductModel, z);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo77929a() {
                return this.f65451a;
            }

            /* renamed from: b */
            public final boolean mo77930b() {
                return this.f65452b;
            }

            @C12579k
            /* renamed from: c */
            public final C26850b mo77931c(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26850b(offerProductModel, z);
            }

            /* renamed from: e */
            public final boolean mo77932e() {
                return this.f65452b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26850b)) {
                    return false;
                }
                C26850b bVar = (C26850b) obj;
                return Intrinsics.areEqual((Object) this.f65451a, (Object) bVar.f65451a) && this.f65452b == bVar.f65452b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferProductModel mo77934f() {
                return this.f65451a;
            }

            public int hashCode() {
                int hashCode = this.f65451a.hashCode() * 31;
                boolean z = this.f65452b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65451a;
                boolean z = this.f65452b;
                return "NavigateToPdp(offerProductModel=" + offerProductModel + ", navigateToNonFoodPdp=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$a$c */
        public static final class C26851c implements C26848a {

            /* renamed from: d */
            public static final int f65453d = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65454a;

            /* renamed from: b */
            public final int f65455b;
            @C12579k

            /* renamed from: c */
            public final BasketType f65456c;

            public C26851c(@C12579k OfferProductModel offerProductModel, int i, @C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                this.f65454a = offerProductModel;
                this.f65455b = i;
                this.f65456c = basketType;
            }

            /* renamed from: e */
            public static /* synthetic */ C26851c m113861e(C26851c cVar, OfferProductModel offerProductModel, int i, BasketType basketType, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = cVar.f65454a;
                }
                if ((i2 & 2) != 0) {
                    i = cVar.f65455b;
                }
                if ((i2 & 4) != 0) {
                    basketType = cVar.f65456c;
                }
                return cVar.mo77940d(offerProductModel, i, basketType);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo77937a() {
                return this.f65454a;
            }

            /* renamed from: b */
            public final int mo77938b() {
                return this.f65455b;
            }

            @C12579k
            /* renamed from: c */
            public final BasketType mo77939c() {
                return this.f65456c;
            }

            @C12579k
            /* renamed from: d */
            public final C26851c mo77940d(@C12579k OfferProductModel offerProductModel, int i, @C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                return new C26851c(offerProductModel, i, basketType);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26851c)) {
                    return false;
                }
                C26851c cVar = (C26851c) obj;
                return Intrinsics.areEqual((Object) this.f65454a, (Object) cVar.f65454a) && this.f65455b == cVar.f65455b && this.f65456c == cVar.f65456c;
            }

            @C12579k
            /* renamed from: f */
            public final BasketType mo77942f() {
                return this.f65456c;
            }

            /* renamed from: g */
            public final int mo77943g() {
                return this.f65455b;
            }

            @C12579k
            /* renamed from: h */
            public final OfferProductModel mo77944h() {
                return this.f65454a;
            }

            public int hashCode() {
                return (((this.f65454a.hashCode() * 31) + Integer.hashCode(this.f65455b)) * 31) + this.f65456c.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65454a;
                int i = this.f65455b;
                BasketType basketType = this.f65456c;
                return "ShowUpdateQuantity(offerProductModel=" + offerProductModel + ", initialSelectedQuantity=" + i + ", basketType=" + basketType + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$b */
    public interface C26852b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$b$a */
        public static final class C26853a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m113869a(@C12579k C26852b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$b$b */
        public static final class C26854b implements C26852b {
            @C12579k

            /* renamed from: b */
            public static final C26854b f65457b = new C26854b();

            /* renamed from: c */
            public static final int f65458c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26853a.m113869a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$b$c */
        public static final class C26855c implements C26852b {

            /* renamed from: c */
            public static final int f65459c = 0;

            /* renamed from: b */
            public final boolean f65460b;

            public C26855c(boolean z) {
                this.f65460b = z;
            }

            /* renamed from: g */
            public static /* synthetic */ C26855c m113870g(C26855c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f65460b;
                }
                return cVar.mo77949f(z);
            }

            /* renamed from: e */
            public final boolean mo77947e() {
                return this.f65460b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26855c) && this.f65460b == ((C26855c) obj).f65460b;
            }

            @C12579k
            /* renamed from: f */
            public final C26855c mo77949f(boolean z) {
                return new C26855c(z);
            }

            public int hashCode() {
                boolean z = this.f65460b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f65460b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26853a.m113869a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f65460b;
                return "Loading(isLoading=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$b$d */
        public static final class C26856d implements C26852b {

            /* renamed from: c */
            public static final int f65461c = 8;
            @C12580l

            /* renamed from: b */
            public final List<OfferModel> f65462b;

            public C26856d(@C12580l List<? extends OfferModel> list) {
                this.f65462b = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C26856d m113873g(C26856d dVar, List<OfferModel> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = dVar.f65462b;
                }
                return dVar.mo77955f(list);
            }

            @C12580l
            /* renamed from: e */
            public final List<OfferModel> mo77953e() {
                return this.f65462b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26856d) && Intrinsics.areEqual((Object) this.f65462b, (Object) ((C26856d) obj).f65462b);
            }

            @C12579k
            /* renamed from: f */
            public final C26856d mo77955f(@C12580l List<? extends OfferModel> list) {
                return new C26856d(list);
            }

            @C12580l
            /* renamed from: h */
            public final List<OfferModel> mo77956h() {
                return this.f65462b;
            }

            public int hashCode() {
                List<OfferModel> list = this.f65462b;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26853a.m113869a(this);
            }

            @C12579k
            public String toString() {
                List<OfferModel> list = this.f65462b;
                return "OfferListUIState(offerList=" + list + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$c */
    public interface C26857c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$c$a */
        public static final class C26858a implements C26857c {

            /* renamed from: b */
            public static final int f65463b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65464a;

            public C26858a(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65464a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26858a m113877c(C26858a aVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = aVar.f65464a;
                }
                return aVar.mo77960b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo77959a() {
                return this.f65464a;
            }

            @C12579k
            /* renamed from: b */
            public final C26858a mo77960b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26858a(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo77961d() {
                return this.f65464a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26858a) && Intrinsics.areEqual((Object) this.f65464a, (Object) ((C26858a) obj).f65464a);
            }

            public int hashCode() {
                return this.f65464a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65464a;
                return "AddProductToBasket(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$c$b */
        public static final class C26859b implements C26857c {

            /* renamed from: b */
            public static final int f65465b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65466a;

            public C26859b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65466a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26859b m113881c(C26859b bVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = bVar.f65466a;
                }
                return bVar.mo77966b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo77965a() {
                return this.f65466a;
            }

            @C12579k
            /* renamed from: b */
            public final C26859b mo77966b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26859b(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo77967d() {
                return this.f65466a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26859b) && Intrinsics.areEqual((Object) this.f65466a, (Object) ((C26859b) obj).f65466a);
            }

            public int hashCode() {
                return this.f65466a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65466a;
                return "AddProductToShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$c$c */
        public static final class C26860c implements C26857c {

            /* renamed from: b */
            public static final int f65467b = 8;
            @C12579k

            /* renamed from: a */
            public final List<OfferProductModel> f65468a;

            public C26860c(@C12579k List<? extends OfferProductModel> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.f65468a = list;
            }

            /* renamed from: c */
            public static /* synthetic */ C26860c m113885c(C26860c cVar, List<OfferProductModel> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = cVar.f65468a;
                }
                return cVar.mo77972b(list);
            }

            @C12579k
            /* renamed from: a */
            public final List<OfferProductModel> mo77971a() {
                return this.f65468a;
            }

            @C12579k
            /* renamed from: b */
            public final C26860c mo77972b(@C12579k List<? extends OfferProductModel> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                return new C26860c(list);
            }

            @C12579k
            /* renamed from: d */
            public final List<OfferProductModel> mo77973d() {
                return this.f65468a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26860c) && Intrinsics.areEqual((Object) this.f65468a, (Object) ((C26860c) obj).f65468a);
            }

            public int hashCode() {
                return this.f65468a.hashCode();
            }

            @C12579k
            public String toString() {
                List<OfferProductModel> list = this.f65468a;
                return "LoadProductList(list=" + list + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$c$e */
        public static final class C26862e implements C26857c {

            /* renamed from: b */
            public static final int f65472b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65473a;

            public C26862e(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65473a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26862e m113895c(C26862e eVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = eVar.f65473a;
                }
                return eVar.mo77986b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo77985a() {
                return this.f65473a;
            }

            @C12579k
            /* renamed from: b */
            public final C26862e mo77986b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26862e(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo77987d() {
                return this.f65473a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26862e) && Intrinsics.areEqual((Object) this.f65473a, (Object) ((C26862e) obj).f65473a);
            }

            public int hashCode() {
                return this.f65473a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65473a;
                return "RemoveProductFromShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$c$f */
        public static final class C26863f implements C26857c {

            /* renamed from: b */
            public static final int f65474b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65475a;

            public C26863f(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65475a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26863f m113899c(C26863f fVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = fVar.f65475a;
                }
                return fVar.mo77992b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo77991a() {
                return this.f65475a;
            }

            @C12579k
            /* renamed from: b */
            public final C26863f mo77992b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26863f(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo77993d() {
                return this.f65475a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26863f) && Intrinsics.areEqual((Object) this.f65475a, (Object) ((C26863f) obj).f65475a);
            }

            public int hashCode() {
                return this.f65475a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65475a;
                return "ShowProductDetails(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$c$g */
        public static final class C26864g implements C26857c {

            /* renamed from: b */
            public static final int f65476b = 0;

            /* renamed from: a */
            public final boolean f65477a;

            public C26864g() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: c */
            public static /* synthetic */ C26864g m113903c(C26864g gVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = gVar.f65477a;
                }
                return gVar.mo77998b(z);
            }

            /* renamed from: a */
            public final boolean mo77997a() {
                return this.f65477a;
            }

            @C12579k
            /* renamed from: b */
            public final C26864g mo77998b(boolean z) {
                return new C26864g(z);
            }

            /* renamed from: d */
            public final boolean mo77999d() {
                return this.f65477a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26864g) && this.f65477a == ((C26864g) obj).f65477a;
            }

            public int hashCode() {
                boolean z = this.f65477a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f65477a;
                return "Synchronize(withLoading=" + z + ")";
            }

            public C26864g(boolean z) {
                this.f65477a = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26864g(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$c$h */
        public static final class C26865h implements C26857c {

            /* renamed from: c */
            public static final int f65478c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65479a;

            /* renamed from: b */
            public final int f65480b;

            public C26865h(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65479a = offerProductModel;
                this.f65480b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C26865h m113907d(C26865h hVar, OfferProductModel offerProductModel, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = hVar.f65479a;
                }
                if ((i2 & 2) != 0) {
                    i = hVar.f65480b;
                }
                return hVar.mo78005c(offerProductModel, i);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78003a() {
                return this.f65479a;
            }

            /* renamed from: b */
            public final int mo78004b() {
                return this.f65480b;
            }

            @C12579k
            /* renamed from: c */
            public final C26865h mo78005c(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26865h(offerProductModel, i);
            }

            /* renamed from: e */
            public final int mo78006e() {
                return this.f65480b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26865h)) {
                    return false;
                }
                C26865h hVar = (C26865h) obj;
                return Intrinsics.areEqual((Object) this.f65479a, (Object) hVar.f65479a) && this.f65480b == hVar.f65480b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferProductModel mo78008f() {
                return this.f65479a;
            }

            public int hashCode() {
                return (this.f65479a.hashCode() * 31) + Integer.hashCode(this.f65480b);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65479a;
                int i = this.f65480b;
                return "UpdateQuantityFromBottomSheet(offerProductModel=" + offerProductModel + ", initialSelectedQuantity=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.b$c$d */
        public static final class C26861d implements C26857c {

            /* renamed from: c */
            public static final int f65469c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65470a;
            @C12580l

            /* renamed from: b */
            public final Integer f65471b;

            public C26861d(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65470a = offerProductModel;
                this.f65471b = num;
            }

            /* renamed from: d */
            public static /* synthetic */ C26861d m113889d(C26861d dVar, OfferProductModel offerProductModel, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = dVar.f65470a;
                }
                if ((i & 2) != 0) {
                    num = dVar.f65471b;
                }
                return dVar.mo77979c(offerProductModel, num);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo77977a() {
                return this.f65470a;
            }

            @C12580l
            /* renamed from: b */
            public final Integer mo77978b() {
                return this.f65471b;
            }

            @C12579k
            /* renamed from: c */
            public final C26861d mo77979c(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26861d(offerProductModel, num);
            }

            @C12579k
            /* renamed from: e */
            public final OfferProductModel mo77980e() {
                return this.f65470a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26861d)) {
                    return false;
                }
                C26861d dVar = (C26861d) obj;
                return Intrinsics.areEqual((Object) this.f65470a, (Object) dVar.f65470a) && Intrinsics.areEqual((Object) this.f65471b, (Object) dVar.f65471b);
            }

            @C12580l
            /* renamed from: f */
            public final Integer mo77982f() {
                return this.f65471b;
            }

            public int hashCode() {
                int hashCode = this.f65470a.hashCode() * 31;
                Integer num = this.f65471b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65470a;
                Integer num = this.f65471b;
                return "RemoveProductFromBasket(offerProductModel=" + offerProductModel + ", quantity=" + num + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26861d(OfferProductModel offerProductModel, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(offerProductModel, (i & 2) != 0 ? null : num);
            }
        }
    }
}
