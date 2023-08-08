package com.carrefour.fid.android.presentation.viewmodels.product.search.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.PageModel;
import com.carrefour.fid.android.presentation.models.ProductListResultModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a */
public final class C27283a {
    @C12579k

    /* renamed from: a */
    public static final C27283a f66270a = new C27283a();

    /* renamed from: b */
    public static final int f66271b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$a */
    public interface C27284a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$a$a */
        public static final class C27285a implements C27284a {
            @C12579k

            /* renamed from: a */
            public static final C27285a f66272a = new C27285a();

            /* renamed from: b */
            public static final int f66273b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$a$b */
        public static final class C27286b implements C27284a {

            /* renamed from: d */
            public static final int f66274d = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f66275a;
            @C12580l

            /* renamed from: b */
            public final ProductListSettingsModel f66276b;
            @C12580l

            /* renamed from: c */
            public final ProductListResultModel f66277c;

            public C27286b(@C12579k Throwable th, @C12580l ProductListSettingsModel productListSettingsModel, @C12580l ProductListResultModel productListResultModel) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f66275a = th;
                this.f66276b = productListSettingsModel;
                this.f66277c = productListResultModel;
            }

            /* renamed from: e */
            public static /* synthetic */ C27286b m115113e(C27286b bVar, Throwable th, ProductListSettingsModel productListSettingsModel, ProductListResultModel productListResultModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = bVar.f66275a;
                }
                if ((i & 2) != 0) {
                    productListSettingsModel = bVar.f66276b;
                }
                if ((i & 4) != 0) {
                    productListResultModel = bVar.f66277c;
                }
                return bVar.mo79329d(th, productListSettingsModel, productListResultModel);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo79326a() {
                return this.f66275a;
            }

            @C12580l
            /* renamed from: b */
            public final ProductListSettingsModel mo79327b() {
                return this.f66276b;
            }

            @C12580l
            /* renamed from: c */
            public final ProductListResultModel mo79328c() {
                return this.f66277c;
            }

            @C12579k
            /* renamed from: d */
            public final C27286b mo79329d(@C12579k Throwable th, @C12580l ProductListSettingsModel productListSettingsModel, @C12580l ProductListResultModel productListResultModel) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C27286b(th, productListSettingsModel, productListResultModel);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27286b)) {
                    return false;
                }
                C27286b bVar = (C27286b) obj;
                return Intrinsics.areEqual((Object) this.f66275a, (Object) bVar.f66275a) && Intrinsics.areEqual((Object) this.f66276b, (Object) bVar.f66276b) && Intrinsics.areEqual((Object) this.f66277c, (Object) bVar.f66277c);
            }

            @C12580l
            /* renamed from: f */
            public final ProductListResultModel mo79331f() {
                return this.f66277c;
            }

            @C12580l
            /* renamed from: g */
            public final ProductListSettingsModel mo79332g() {
                return this.f66276b;
            }

            @C12579k
            /* renamed from: h */
            public final Throwable mo79333h() {
                return this.f66275a;
            }

            public int hashCode() {
                int hashCode = this.f66275a.hashCode() * 31;
                ProductListSettingsModel productListSettingsModel = this.f66276b;
                int i = 0;
                int hashCode2 = (hashCode + (productListSettingsModel == null ? 0 : productListSettingsModel.hashCode())) * 31;
                ProductListResultModel productListResultModel = this.f66277c;
                if (productListResultModel != null) {
                    i = productListResultModel.hashCode();
                }
                return hashCode2 + i;
            }

            @C12579k
            public String toString() {
                Throwable th = this.f66275a;
                ProductListSettingsModel productListSettingsModel = this.f66276b;
                ProductListResultModel productListResultModel = this.f66277c;
                return "Error(throwable=" + th + ", settings=" + productListSettingsModel + ", productList=" + productListResultModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$a$c */
        public static final class C27287c implements C27284a {

            /* renamed from: b */
            public static final int f66278b = OrderType.f70277d;
            @C12580l

            /* renamed from: a */
            public final OrderType f66279a;

            public C27287c() {
                this((OrderType) null, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: c */
            public static /* synthetic */ C27287c m115121c(C27287c cVar, OrderType orderType, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderType = cVar.f66279a;
                }
                return cVar.mo79337b(orderType);
            }

            @C12580l
            /* renamed from: a */
            public final OrderType mo79336a() {
                return this.f66279a;
            }

            @C12579k
            /* renamed from: b */
            public final C27287c mo79337b(@C12580l OrderType orderType) {
                return new C27287c(orderType);
            }

            @C12580l
            /* renamed from: d */
            public final OrderType mo79338d() {
                return this.f66279a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27287c) && Intrinsics.areEqual((Object) this.f66279a, (Object) ((C27287c) obj).f66279a);
            }

            public int hashCode() {
                OrderType orderType = this.f66279a;
                if (orderType == null) {
                    return 0;
                }
                return orderType.hashCode();
            }

            @C12579k
            public String toString() {
                OrderType orderType = this.f66279a;
                return "NavigateToBasketAdditionalOrder(orderType=" + orderType + ")";
            }

            public C27287c(@C12580l OrderType orderType) {
                this.f66279a = orderType;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C27287c(OrderType orderType, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : orderType);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$a$d */
        public static final class C27288d implements C27284a {

            /* renamed from: c */
            public static final int f66280c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66281a;

            /* renamed from: b */
            public final boolean f66282b;

            public C27288d(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66281a = offerProductModel;
                this.f66282b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C27288d m115125d(C27288d dVar, OfferProductModel offerProductModel, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = dVar.f66281a;
                }
                if ((i & 2) != 0) {
                    z = dVar.f66282b;
                }
                return dVar.mo79344c(offerProductModel, z);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79342a() {
                return this.f66281a;
            }

            /* renamed from: b */
            public final boolean mo79343b() {
                return this.f66282b;
            }

            @C12579k
            /* renamed from: c */
            public final C27288d mo79344c(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27288d(offerProductModel, z);
            }

            /* renamed from: e */
            public final boolean mo79345e() {
                return this.f66282b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27288d)) {
                    return false;
                }
                C27288d dVar = (C27288d) obj;
                return Intrinsics.areEqual((Object) this.f66281a, (Object) dVar.f66281a) && this.f66282b == dVar.f66282b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferProductModel mo79347f() {
                return this.f66281a;
            }

            public int hashCode() {
                int hashCode = this.f66281a.hashCode() * 31;
                boolean z = this.f66282b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66281a;
                boolean z = this.f66282b;
                return "NavigateToPdp(offerProductModel=" + offerProductModel + ", navigateToNonFoodPdp=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$a$e */
        public static final class C27289e implements C27284a {

            /* renamed from: b */
            public static final int f66283b = 8;
            @C12579k

            /* renamed from: a */
            public final ProductListSettingsModel f66284a;

            public C27289e(@C12579k ProductListSettingsModel productListSettingsModel) {
                Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
                this.f66284a = productListSettingsModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27289e m115131c(C27289e eVar, ProductListSettingsModel productListSettingsModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    productListSettingsModel = eVar.f66284a;
                }
                return eVar.mo79351b(productListSettingsModel);
            }

            @C12579k
            /* renamed from: a */
            public final ProductListSettingsModel mo79350a() {
                return this.f66284a;
            }

            @C12579k
            /* renamed from: b */
            public final C27289e mo79351b(@C12579k ProductListSettingsModel productListSettingsModel) {
                Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
                return new C27289e(productListSettingsModel);
            }

            @C12579k
            /* renamed from: d */
            public final ProductListSettingsModel mo79352d() {
                return this.f66284a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27289e) && Intrinsics.areEqual((Object) this.f66284a, (Object) ((C27289e) obj).f66284a);
            }

            public int hashCode() {
                return this.f66284a.hashCode();
            }

            @C12579k
            public String toString() {
                ProductListSettingsModel productListSettingsModel = this.f66284a;
                return "OpenFiltersDialog(settings=" + productListSettingsModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$a$f */
        public static final class C27290f implements C27284a {

            /* renamed from: d */
            public static final int f66285d = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66286a;

            /* renamed from: b */
            public final int f66287b;
            @C12579k

            /* renamed from: c */
            public final BasketType f66288c;

            public C27290f(@C12579k OfferProductModel offerProductModel, int i, @C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                this.f66286a = offerProductModel;
                this.f66287b = i;
                this.f66288c = basketType;
            }

            /* renamed from: e */
            public static /* synthetic */ C27290f m115135e(C27290f fVar, OfferProductModel offerProductModel, int i, BasketType basketType, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = fVar.f66286a;
                }
                if ((i2 & 2) != 0) {
                    i = fVar.f66287b;
                }
                if ((i2 & 4) != 0) {
                    basketType = fVar.f66288c;
                }
                return fVar.mo79359d(offerProductModel, i, basketType);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79356a() {
                return this.f66286a;
            }

            /* renamed from: b */
            public final int mo79357b() {
                return this.f66287b;
            }

            @C12579k
            /* renamed from: c */
            public final BasketType mo79358c() {
                return this.f66288c;
            }

            @C12579k
            /* renamed from: d */
            public final C27290f mo79359d(@C12579k OfferProductModel offerProductModel, int i, @C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                return new C27290f(offerProductModel, i, basketType);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27290f)) {
                    return false;
                }
                C27290f fVar = (C27290f) obj;
                return Intrinsics.areEqual((Object) this.f66286a, (Object) fVar.f66286a) && this.f66287b == fVar.f66287b && this.f66288c == fVar.f66288c;
            }

            @C12579k
            /* renamed from: f */
            public final BasketType mo79361f() {
                return this.f66288c;
            }

            /* renamed from: g */
            public final int mo79362g() {
                return this.f66287b;
            }

            @C12579k
            /* renamed from: h */
            public final OfferProductModel mo79363h() {
                return this.f66286a;
            }

            public int hashCode() {
                return (((this.f66286a.hashCode() * 31) + Integer.hashCode(this.f66287b)) * 31) + this.f66288c.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66286a;
                int i = this.f66287b;
                BasketType basketType = this.f66288c;
                return "UpdateProductQuantity(offerProductModel=" + offerProductModel + ", initialSelectedQuantity=" + i + ", basketType=" + basketType + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$b */
    public static final class C27291b implements C28505u.C28509d {

        /* renamed from: h */
        public static final int f66289h = 8;

        /* renamed from: b */
        public final boolean f66290b;

        /* renamed from: c */
        public final int f66291c;

        /* renamed from: d */
        public final boolean f66292d;

        /* renamed from: e */
        public final boolean f66293e;
        @C12580l

        /* renamed from: f */
        public final PageModel f66294f;
        @C12580l

        /* renamed from: g */
        public final List<OfferProductModel> f66295g;

        public C27291b() {
            this(false, 0, false, false, (PageModel) null, (List) null, 63, (DefaultConstructorMarker) null);
        }

        /* renamed from: l */
        public static /* synthetic */ C27291b m115143l(C27291b bVar, boolean z, int i, boolean z2, boolean z3, PageModel pageModel, List<OfferProductModel> list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = bVar.f66290b;
            }
            if ((i2 & 2) != 0) {
                i = bVar.f66291c;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                z2 = bVar.f66292d;
            }
            boolean z4 = z2;
            if ((i2 & 8) != 0) {
                z3 = bVar.f66293e;
            }
            boolean z5 = z3;
            if ((i2 & 16) != 0) {
                pageModel = bVar.f66294f;
            }
            PageModel pageModel2 = pageModel;
            if ((i2 & 32) != 0) {
                list = bVar.f66295g;
            }
            return bVar.mo79375k(z, i3, z4, z5, pageModel2, list);
        }

        /* renamed from: e */
        public final boolean mo79366e() {
            return this.f66290b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27291b)) {
                return false;
            }
            C27291b bVar = (C27291b) obj;
            return this.f66290b == bVar.f66290b && this.f66291c == bVar.f66291c && this.f66292d == bVar.f66292d && this.f66293e == bVar.f66293e && Intrinsics.areEqual((Object) this.f66294f, (Object) bVar.f66294f) && Intrinsics.areEqual((Object) this.f66295g, (Object) bVar.f66295g);
        }

        /* renamed from: f */
        public final int mo79368f() {
            return this.f66291c;
        }

        /* renamed from: g */
        public final boolean mo79369g() {
            return this.f66292d;
        }

        /* renamed from: h */
        public final boolean mo79370h() {
            return this.f66293e;
        }

        public int hashCode() {
            boolean z = this.f66290b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((z ? 1 : 0) * true) + Integer.hashCode(this.f66291c)) * 31;
            boolean z3 = this.f66292d;
            if (z3) {
                z3 = true;
            }
            int i = (hashCode + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f66293e;
            if (!z4) {
                z2 = z4;
            }
            int i2 = (i + (z2 ? 1 : 0)) * 31;
            PageModel pageModel = this.f66294f;
            int i3 = 0;
            int hashCode2 = (i2 + (pageModel == null ? 0 : pageModel.hashCode())) * 31;
            List<OfferProductModel> list = this.f66295g;
            if (list != null) {
                i3 = list.hashCode();
            }
            return hashCode2 + i3;
        }

        @C12580l
        /* renamed from: i */
        public final PageModel mo79372i() {
            return this.f66294f;
        }

        public final boolean isLoading() {
            return this.f66292d;
        }

        @C12580l
        /* renamed from: j */
        public final List<OfferProductModel> mo79374j() {
            return this.f66295g;
        }

        @C12579k
        /* renamed from: k */
        public final C27291b mo79375k(boolean z, int i, boolean z2, boolean z3, @C12580l PageModel pageModel, @C12580l List<? extends OfferProductModel> list) {
            return new C27291b(z, i, z2, z3, pageModel, list);
        }

        /* renamed from: m */
        public final int mo79376m() {
            return this.f66291c;
        }

        /* renamed from: n */
        public final boolean mo79377n() {
            return this.f66290b;
        }

        /* renamed from: o */
        public final boolean mo79378o() {
            return this.f66293e;
        }

        @C12580l
        /* renamed from: p */
        public final PageModel mo79379p() {
            return this.f66294f;
        }

        @C12580l
        /* renamed from: q */
        public final List<OfferProductModel> mo79380q() {
            return this.f66295g;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f66290b;
            int i = this.f66291c;
            boolean z2 = this.f66292d;
            boolean z3 = this.f66293e;
            PageModel pageModel = this.f66294f;
            List<OfferProductModel> list = this.f66295g;
            return "UiState(basketContainsAtLeastOneProduct=" + z + ", appliedFacetCount=" + i + ", isLoading=" + z2 + ", hasNextPage=" + z3 + ", pageModel=" + pageModel + ", productList=" + list + ")";
        }

        public C27291b(boolean z, int i, boolean z2, boolean z3, @C12580l PageModel pageModel, @C12580l List<? extends OfferProductModel> list) {
            this.f66290b = z;
            this.f66291c = i;
            this.f66292d = z2;
            this.f66293e = z3;
            this.f66294f = pageModel;
            this.f66295g = list;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C27291b(boolean r5, int r6, boolean r7, boolean r8, com.carrefour.fid.android.presentation.models.PageModel r9, java.util.List r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r4 = this;
                r12 = r11 & 1
                r0 = 0
                if (r12 == 0) goto L_0x0007
                r12 = r0
                goto L_0x0008
            L_0x0007:
                r12 = r5
            L_0x0008:
                r5 = r11 & 2
                if (r5 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r6
            L_0x000f:
                r5 = r11 & 4
                if (r5 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r7
            L_0x0016:
                r5 = r11 & 8
                if (r5 == 0) goto L_0x001b
                goto L_0x001c
            L_0x001b:
                r0 = r8
            L_0x001c:
                r5 = r11 & 16
                r6 = 0
                if (r5 == 0) goto L_0x0023
                r3 = r6
                goto L_0x0024
            L_0x0023:
                r3 = r9
            L_0x0024:
                r5 = r11 & 32
                if (r5 == 0) goto L_0x002a
                r11 = r6
                goto L_0x002b
            L_0x002a:
                r11 = r10
            L_0x002b:
                r5 = r4
                r6 = r12
                r7 = r1
                r8 = r2
                r9 = r0
                r10 = r3
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27283a.C27291b.<init>(boolean, int, boolean, boolean, com.carrefour.fid.android.presentation.models.PageModel, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c */
    public interface C27292c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$a */
        public static final class C27293a implements C27292c {

            /* renamed from: b */
            public static final int f66296b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66297a;

            public C27293a(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66297a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27293a m115156c(C27293a aVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = aVar.f66297a;
                }
                return aVar.mo79383b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79382a() {
                return this.f66297a;
            }

            @C12579k
            /* renamed from: b */
            public final C27293a mo79383b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27293a(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79384d() {
                return this.f66297a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27293a) && Intrinsics.areEqual((Object) this.f66297a, (Object) ((C27293a) obj).f66297a);
            }

            public int hashCode() {
                return this.f66297a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66297a;
                return "AddProductToBasket(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$b */
        public static final class C27294b implements C27292c {

            /* renamed from: b */
            public static final int f66298b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66299a;

            public C27294b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66299a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27294b m115160c(C27294b bVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = bVar.f66299a;
                }
                return bVar.mo79389b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79388a() {
                return this.f66299a;
            }

            @C12579k
            /* renamed from: b */
            public final C27294b mo79389b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27294b(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79390d() {
                return this.f66299a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27294b) && Intrinsics.areEqual((Object) this.f66299a, (Object) ((C27294b) obj).f66299a);
            }

            public int hashCode() {
                return this.f66299a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66299a;
                return "AddProductToShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$c */
        public static final class C27295c implements C27292c {

            /* renamed from: b */
            public static final int f66300b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66301a;

            public C27295c(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "product");
                this.f66301a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27295c m115164c(C27295c cVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = cVar.f66301a;
                }
                return cVar.mo79395b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79394a() {
                return this.f66301a;
            }

            @C12579k
            /* renamed from: b */
            public final C27295c mo79395b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "product");
                return new C27295c(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79396d() {
                return this.f66301a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27295c) && Intrinsics.areEqual((Object) this.f66301a, (Object) ((C27295c) obj).f66301a);
            }

            public int hashCode() {
                return this.f66301a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66301a;
                return "ClearMixingProductOverlayStatus(product=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$d */
        public static final class C27296d implements C27292c {

            /* renamed from: b */
            public static final int f66302b = 0;
            @C12579k

            /* renamed from: a */
            public final CustomCountDownTimer.CountDownState f66303a;

            public C27296d(@C12579k CustomCountDownTimer.CountDownState countDownState) {
                Intrinsics.checkNotNullParameter(countDownState, "state");
                this.f66303a = countDownState;
            }

            /* renamed from: c */
            public static /* synthetic */ C27296d m115168c(C27296d dVar, CustomCountDownTimer.CountDownState countDownState, int i, Object obj) {
                if ((i & 1) != 0) {
                    countDownState = dVar.f66303a;
                }
                return dVar.mo79401b(countDownState);
            }

            @C12579k
            /* renamed from: a */
            public final CustomCountDownTimer.CountDownState mo79400a() {
                return this.f66303a;
            }

            @C12579k
            /* renamed from: b */
            public final C27296d mo79401b(@C12579k CustomCountDownTimer.CountDownState countDownState) {
                Intrinsics.checkNotNullParameter(countDownState, "state");
                return new C27296d(countDownState);
            }

            @C12579k
            /* renamed from: d */
            public final CustomCountDownTimer.CountDownState mo79402d() {
                return this.f66303a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27296d) && this.f66303a == ((C27296d) obj).f66303a;
            }

            public int hashCode() {
                return this.f66303a.hashCode();
            }

            @C12579k
            public String toString() {
                CustomCountDownTimer.CountDownState countDownState = this.f66303a;
                return "ExpiredAdditionalOrder(state=" + countDownState + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$e */
        public static final class C27297e implements C27292c {
            @C12579k

            /* renamed from: a */
            public static final C27297e f66304a = new C27297e();

            /* renamed from: b */
            public static final int f66305b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$f */
        public static final class C27298f implements C27292c {
            @C12579k

            /* renamed from: a */
            public static final C27298f f66306a = new C27298f();

            /* renamed from: b */
            public static final int f66307b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$g */
        public static final class C27299g implements C27292c {
            @C12579k

            /* renamed from: a */
            public static final C27299g f66308a = new C27299g();

            /* renamed from: b */
            public static final int f66309b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$i */
        public static final class C27301i implements C27292c {

            /* renamed from: b */
            public static final int f66313b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66314a;

            public C27301i(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66314a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27301i m115178c(C27301i iVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = iVar.f66314a;
                }
                return iVar.mo79415b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79414a() {
                return this.f66314a;
            }

            @C12579k
            /* renamed from: b */
            public final C27301i mo79415b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27301i(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79416d() {
                return this.f66314a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27301i) && Intrinsics.areEqual((Object) this.f66314a, (Object) ((C27301i) obj).f66314a);
            }

            public int hashCode() {
                return this.f66314a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66314a;
                return "RemoveProductFromShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$j */
        public static final class C27302j implements C27292c {

            /* renamed from: b */
            public static final int f66315b = 0;
            @C12580l

            /* renamed from: a */
            public final String f66316a;

            public C27302j(@C12580l String str) {
                this.f66316a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C27302j m115182c(C27302j jVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = jVar.f66316a;
                }
                return jVar.mo79421b(str);
            }

            @C12580l
            /* renamed from: a */
            public final String mo79420a() {
                return this.f66316a;
            }

            @C12579k
            /* renamed from: b */
            public final C27302j mo79421b(@C12580l String str) {
                return new C27302j(str);
            }

            @C12580l
            /* renamed from: d */
            public final String mo79422d() {
                return this.f66316a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27302j) && Intrinsics.areEqual((Object) this.f66316a, (Object) ((C27302j) obj).f66316a);
            }

            public int hashCode() {
                String str = this.f66316a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f66316a;
                return "Search(searchTerms=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$k */
        public static final class C27303k implements C27292c {

            /* renamed from: b */
            public static final int f66317b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66318a;

            public C27303k(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66318a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27303k m115186c(C27303k kVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = kVar.f66318a;
                }
                return kVar.mo79427b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79426a() {
                return this.f66318a;
            }

            @C12579k
            /* renamed from: b */
            public final C27303k mo79427b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27303k(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79428d() {
                return this.f66318a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27303k) && Intrinsics.areEqual((Object) this.f66318a, (Object) ((C27303k) obj).f66318a);
            }

            public int hashCode() {
                return this.f66318a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66318a;
                return "ShowProductDetails(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$l */
        public static final class C27304l implements C27292c {
            @C12579k

            /* renamed from: a */
            public static final C27304l f66319a = new C27304l();

            /* renamed from: b */
            public static final int f66320b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$m */
        public static final class C27305m implements C27292c {

            /* renamed from: b */
            public static final int f66321b = 0;
            @C12579k

            /* renamed from: a */
            public final BasketType f66322a;

            public C27305m(@C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                this.f66322a = basketType;
            }

            /* renamed from: c */
            public static /* synthetic */ C27305m m115190c(C27305m mVar, BasketType basketType, int i, Object obj) {
                if ((i & 1) != 0) {
                    basketType = mVar.f66322a;
                }
                return mVar.mo79433b(basketType);
            }

            @C12579k
            /* renamed from: a */
            public final BasketType mo79432a() {
                return this.f66322a;
            }

            @C12579k
            /* renamed from: b */
            public final C27305m mo79433b(@C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                return new C27305m(basketType);
            }

            @C12579k
            /* renamed from: d */
            public final BasketType mo79434d() {
                return this.f66322a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27305m) && this.f66322a == ((C27305m) obj).f66322a;
            }

            public int hashCode() {
                return this.f66322a.hashCode();
            }

            @C12579k
            public String toString() {
                BasketType basketType = this.f66322a;
                return "UpdateBasketType(basketType=" + basketType + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$n */
        public static final class C27306n implements C27292c {

            /* renamed from: c */
            public static final int f66323c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66324a;

            /* renamed from: b */
            public final int f66325b;

            public C27306n(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66324a = offerProductModel;
                this.f66325b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C27306n m115194d(C27306n nVar, OfferProductModel offerProductModel, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = nVar.f66324a;
                }
                if ((i2 & 2) != 0) {
                    i = nVar.f66325b;
                }
                return nVar.mo79440c(offerProductModel, i);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79438a() {
                return this.f66324a;
            }

            /* renamed from: b */
            public final int mo79439b() {
                return this.f66325b;
            }

            @C12579k
            /* renamed from: c */
            public final C27306n mo79440c(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27306n(offerProductModel, i);
            }

            /* renamed from: e */
            public final int mo79441e() {
                return this.f66325b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27306n)) {
                    return false;
                }
                C27306n nVar = (C27306n) obj;
                return Intrinsics.areEqual((Object) this.f66324a, (Object) nVar.f66324a) && this.f66325b == nVar.f66325b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferProductModel mo79443f() {
                return this.f66324a;
            }

            public int hashCode() {
                return (this.f66324a.hashCode() * 31) + Integer.hashCode(this.f66325b);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66324a;
                int i = this.f66325b;
                return "UpdateQuantityFromBottomSheet(offerProductModel=" + offerProductModel + ", initialSelectedQuantity=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$o */
        public static final class C27307o implements C27292c {

            /* renamed from: b */
            public static final int f66326b = 8;
            @C12579k

            /* renamed from: a */
            public final ProductListSettingsModel f66327a;

            public C27307o(@C12579k ProductListSettingsModel productListSettingsModel) {
                Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
                this.f66327a = productListSettingsModel;
            }

            @C12579k
            /* renamed from: a */
            public final ProductListSettingsModel mo79446a() {
                return this.f66327a;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.a$c$h */
        public static final class C27300h implements C27292c {

            /* renamed from: c */
            public static final int f66310c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66311a;
            @C12580l

            /* renamed from: b */
            public final Integer f66312b;

            public C27300h(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66311a = offerProductModel;
                this.f66312b = num;
            }

            /* renamed from: d */
            public static /* synthetic */ C27300h m115172d(C27300h hVar, OfferProductModel offerProductModel, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = hVar.f66311a;
                }
                if ((i & 2) != 0) {
                    num = hVar.f66312b;
                }
                return hVar.mo79408c(offerProductModel, num);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79406a() {
                return this.f66311a;
            }

            @C12580l
            /* renamed from: b */
            public final Integer mo79407b() {
                return this.f66312b;
            }

            @C12579k
            /* renamed from: c */
            public final C27300h mo79408c(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27300h(offerProductModel, num);
            }

            @C12579k
            /* renamed from: e */
            public final OfferProductModel mo79409e() {
                return this.f66311a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27300h)) {
                    return false;
                }
                C27300h hVar = (C27300h) obj;
                return Intrinsics.areEqual((Object) this.f66311a, (Object) hVar.f66311a) && Intrinsics.areEqual((Object) this.f66312b, (Object) hVar.f66312b);
            }

            @C12580l
            /* renamed from: f */
            public final Integer mo79411f() {
                return this.f66312b;
            }

            public int hashCode() {
                int hashCode = this.f66311a.hashCode() * 31;
                Integer num = this.f66312b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66311a;
                Integer num = this.f66312b;
                return "RemoveProductFromBasket(offerProductModel=" + offerProductModel + ", quantity=" + num + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C27300h(OfferProductModel offerProductModel, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(offerProductModel, (i & 2) != 0 ? null : num);
            }
        }
    }
}
