package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.counter.CustomCountDownTimer;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.RecommendedProductsByDepartmentModel;
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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d */
public final class C26875d {
    @C12579k

    /* renamed from: a */
    public static final C26875d f65496a = new C26875d();

    /* renamed from: b */
    public static final int f65497b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$a */
    public interface C26876a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$a$a */
        public static final class C26877a implements C26876a {

            /* renamed from: b */
            public static final int f65498b = 8;
            @C12580l

            /* renamed from: a */
            public final Throwable f65499a;

            public C26877a(@C12580l Throwable th) {
                this.f65499a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26877a m113931c(C26877a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f65499a;
                }
                return aVar.mo78038b(th);
            }

            @C12580l
            /* renamed from: a */
            public final Throwable mo78037a() {
                return this.f65499a;
            }

            @C12579k
            /* renamed from: b */
            public final C26877a mo78038b(@C12580l Throwable th) {
                return new C26877a(th);
            }

            @C12580l
            /* renamed from: d */
            public final Throwable mo78039d() {
                return this.f65499a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26877a) && Intrinsics.areEqual((Object) this.f65499a, (Object) ((C26877a) obj).f65499a);
            }

            public int hashCode() {
                Throwable th = this.f65499a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65499a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$a$b */
        public static final class C26878b implements C26876a {
            @C12579k

            /* renamed from: a */
            public static final C26878b f65500a = new C26878b();

            /* renamed from: b */
            public static final int f65501b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$a$c */
        public static final class C26879c implements C26876a {

            /* renamed from: b */
            public static final int f65502b = OrderType.f70277d;
            @C12580l

            /* renamed from: a */
            public final OrderType f65503a;

            public C26879c() {
                this((OrderType) null, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: c */
            public static /* synthetic */ C26879c m113935c(C26879c cVar, OrderType orderType, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderType = cVar.f65503a;
                }
                return cVar.mo78044b(orderType);
            }

            @C12580l
            /* renamed from: a */
            public final OrderType mo78043a() {
                return this.f65503a;
            }

            @C12579k
            /* renamed from: b */
            public final C26879c mo78044b(@C12580l OrderType orderType) {
                return new C26879c(orderType);
            }

            @C12580l
            /* renamed from: d */
            public final OrderType mo78045d() {
                return this.f65503a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26879c) && Intrinsics.areEqual((Object) this.f65503a, (Object) ((C26879c) obj).f65503a);
            }

            public int hashCode() {
                OrderType orderType = this.f65503a;
                if (orderType == null) {
                    return 0;
                }
                return orderType.hashCode();
            }

            @C12579k
            public String toString() {
                OrderType orderType = this.f65503a;
                return "NavigateToBasketAdditionalOrder(orderType=" + orderType + ")";
            }

            public C26879c(@C12580l OrderType orderType) {
                this.f65503a = orderType;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26879c(OrderType orderType, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : orderType);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$a$d */
        public static final class C26880d implements C26876a {

            /* renamed from: c */
            public static final int f65504c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65505a;

            /* renamed from: b */
            public final boolean f65506b;

            public C26880d(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65505a = offerProductModel;
                this.f65506b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C26880d m113939d(C26880d dVar, OfferProductModel offerProductModel, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = dVar.f65505a;
                }
                if ((i & 2) != 0) {
                    z = dVar.f65506b;
                }
                return dVar.mo78051c(offerProductModel, z);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78049a() {
                return this.f65505a;
            }

            /* renamed from: b */
            public final boolean mo78050b() {
                return this.f65506b;
            }

            @C12579k
            /* renamed from: c */
            public final C26880d mo78051c(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26880d(offerProductModel, z);
            }

            /* renamed from: e */
            public final boolean mo78052e() {
                return this.f65506b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26880d)) {
                    return false;
                }
                C26880d dVar = (C26880d) obj;
                return Intrinsics.areEqual((Object) this.f65505a, (Object) dVar.f65505a) && this.f65506b == dVar.f65506b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferProductModel mo78054f() {
                return this.f65505a;
            }

            public int hashCode() {
                int hashCode = this.f65505a.hashCode() * 31;
                boolean z = this.f65506b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65505a;
                boolean z = this.f65506b;
                return "NavigateToPdp(offerProductModel=" + offerProductModel + ", navigateToNonFoodPdp=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$a$e */
        public static final class C26881e implements C26876a {
            @C12579k

            /* renamed from: a */
            public static final C26881e f65507a = new C26881e();

            /* renamed from: b */
            public static final int f65508b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$a$f */
        public static final class C26882f implements C26876a {
            @C12579k

            /* renamed from: a */
            public static final C26882f f65509a = new C26882f();

            /* renamed from: b */
            public static final int f65510b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$a$g */
        public static final class C26883g implements C26876a {

            /* renamed from: b */
            public static final int f65511b = 8;
            @C12579k

            /* renamed from: a */
            public final RecommendedProductsByDepartmentModel f65512a;

            public C26883g(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
                Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "department");
                this.f65512a = recommendedProductsByDepartmentModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26883g m113945c(C26883g gVar, RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    recommendedProductsByDepartmentModel = gVar.f65512a;
                }
                return gVar.mo78058b(recommendedProductsByDepartmentModel);
            }

            @C12579k
            /* renamed from: a */
            public final RecommendedProductsByDepartmentModel mo78057a() {
                return this.f65512a;
            }

            @C12579k
            /* renamed from: b */
            public final C26883g mo78058b(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
                Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "department");
                return new C26883g(recommendedProductsByDepartmentModel);
            }

            @C12579k
            /* renamed from: d */
            public final RecommendedProductsByDepartmentModel mo78059d() {
                return this.f65512a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26883g) && Intrinsics.areEqual((Object) this.f65512a, (Object) ((C26883g) obj).f65512a);
            }

            public int hashCode() {
                return this.f65512a.hashCode();
            }

            @C12579k
            public String toString() {
                RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f65512a;
                return "ShowListByDepartment(department=" + recommendedProductsByDepartmentModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$a$h */
        public static final class C26884h implements C26876a {

            /* renamed from: d */
            public static final int f65513d = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65514a;

            /* renamed from: b */
            public final int f65515b;
            @C12579k

            /* renamed from: c */
            public final BasketType f65516c;

            public C26884h(@C12579k OfferProductModel offerProductModel, int i, @C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                this.f65514a = offerProductModel;
                this.f65515b = i;
                this.f65516c = basketType;
            }

            /* renamed from: e */
            public static /* synthetic */ C26884h m113949e(C26884h hVar, OfferProductModel offerProductModel, int i, BasketType basketType, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = hVar.f65514a;
                }
                if ((i2 & 2) != 0) {
                    i = hVar.f65515b;
                }
                if ((i2 & 4) != 0) {
                    basketType = hVar.f65516c;
                }
                return hVar.mo78066d(offerProductModel, i, basketType);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78063a() {
                return this.f65514a;
            }

            /* renamed from: b */
            public final int mo78064b() {
                return this.f65515b;
            }

            @C12579k
            /* renamed from: c */
            public final BasketType mo78065c() {
                return this.f65516c;
            }

            @C12579k
            /* renamed from: d */
            public final C26884h mo78066d(@C12579k OfferProductModel offerProductModel, int i, @C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                return new C26884h(offerProductModel, i, basketType);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26884h)) {
                    return false;
                }
                C26884h hVar = (C26884h) obj;
                return Intrinsics.areEqual((Object) this.f65514a, (Object) hVar.f65514a) && this.f65515b == hVar.f65515b && this.f65516c == hVar.f65516c;
            }

            @C12579k
            /* renamed from: f */
            public final BasketType mo78068f() {
                return this.f65516c;
            }

            /* renamed from: g */
            public final int mo78069g() {
                return this.f65515b;
            }

            @C12579k
            /* renamed from: h */
            public final OfferProductModel mo78070h() {
                return this.f65514a;
            }

            public int hashCode() {
                return (((this.f65514a.hashCode() * 31) + Integer.hashCode(this.f65515b)) * 31) + this.f65516c.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65514a;
                int i = this.f65515b;
                BasketType basketType = this.f65516c;
                return "ShowUpdateQuantity(offerProductModel=" + offerProductModel + ", initialSelectedQuantity=" + i + ", basketType=" + basketType + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c */
    public interface C26892c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$a */
        public static final class C26893a implements C26892c {

            /* renamed from: b */
            public static final int f65529b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65530a;

            public C26893a(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65530a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26893a m113973c(C26893a aVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = aVar.f65530a;
                }
                return aVar.mo78096b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78095a() {
                return this.f65530a;
            }

            @C12579k
            /* renamed from: b */
            public final C26893a mo78096b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26893a(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo78097d() {
                return this.f65530a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26893a) && Intrinsics.areEqual((Object) this.f65530a, (Object) ((C26893a) obj).f65530a);
            }

            public int hashCode() {
                return this.f65530a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65530a;
                return "AddProductToBasket(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$b */
        public static final class C26894b implements C26892c {

            /* renamed from: b */
            public static final int f65531b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65532a;

            public C26894b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "product");
                this.f65532a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26894b m113977c(C26894b bVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = bVar.f65532a;
                }
                return bVar.mo78102b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78101a() {
                return this.f65532a;
            }

            @C12579k
            /* renamed from: b */
            public final C26894b mo78102b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "product");
                return new C26894b(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo78103d() {
                return this.f65532a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26894b) && Intrinsics.areEqual((Object) this.f65532a, (Object) ((C26894b) obj).f65532a);
            }

            public int hashCode() {
                return this.f65532a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65532a;
                return "ClearMixingProductOverlayStatus(product=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$c */
        public static final class C26895c implements C26892c {

            /* renamed from: b */
            public static final int f65533b = 0;
            @C12579k

            /* renamed from: a */
            public final CustomCountDownTimer.CountDownState f65534a;

            public C26895c(@C12579k CustomCountDownTimer.CountDownState countDownState) {
                Intrinsics.checkNotNullParameter(countDownState, "state");
                this.f65534a = countDownState;
            }

            /* renamed from: c */
            public static /* synthetic */ C26895c m113981c(C26895c cVar, CustomCountDownTimer.CountDownState countDownState, int i, Object obj) {
                if ((i & 1) != 0) {
                    countDownState = cVar.f65534a;
                }
                return cVar.mo78108b(countDownState);
            }

            @C12579k
            /* renamed from: a */
            public final CustomCountDownTimer.CountDownState mo78107a() {
                return this.f65534a;
            }

            @C12579k
            /* renamed from: b */
            public final C26895c mo78108b(@C12579k CustomCountDownTimer.CountDownState countDownState) {
                Intrinsics.checkNotNullParameter(countDownState, "state");
                return new C26895c(countDownState);
            }

            @C12579k
            /* renamed from: d */
            public final CustomCountDownTimer.CountDownState mo78109d() {
                return this.f65534a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26895c) && this.f65534a == ((C26895c) obj).f65534a;
            }

            public int hashCode() {
                return this.f65534a.hashCode();
            }

            @C12579k
            public String toString() {
                CustomCountDownTimer.CountDownState countDownState = this.f65534a;
                return "ExpiredAdditionalOrder(state=" + countDownState + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$d */
        public static final class C26896d implements C26892c {
            @C12579k

            /* renamed from: a */
            public static final C26896d f65535a = new C26896d();

            /* renamed from: b */
            public static final int f65536b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$e */
        public static final class C26897e implements C26892c {

            /* renamed from: b */
            public static final int f65537b = 0;

            /* renamed from: a */
            public final boolean f65538a;

            public C26897e() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: c */
            public static /* synthetic */ C26897e m113985c(C26897e eVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = eVar.f65538a;
                }
                return eVar.mo78114b(z);
            }

            /* renamed from: a */
            public final boolean mo78113a() {
                return this.f65538a;
            }

            @C12579k
            /* renamed from: b */
            public final C26897e mo78114b(boolean z) {
                return new C26897e(z);
            }

            /* renamed from: d */
            public final boolean mo78115d() {
                return this.f65538a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26897e) && this.f65538a == ((C26897e) obj).f65538a;
            }

            public int hashCode() {
                boolean z = this.f65538a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f65538a;
                return "Load(loading=" + z + ")";
            }

            public C26897e(boolean z) {
                this.f65538a = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26897e(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$f */
        public static final class C26898f implements C26892c {
            @C12579k

            /* renamed from: a */
            public static final C26898f f65539a = new C26898f();

            /* renamed from: b */
            public static final int f65540b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$g */
        public static final class C26899g implements C26892c {
            @C12579k

            /* renamed from: a */
            public static final C26899g f65541a = new C26899g();

            /* renamed from: b */
            public static final int f65542b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$h */
        public static final class C26900h implements C26892c {

            /* renamed from: b */
            public static final int f65543b = 8;
            @C12579k

            /* renamed from: a */
            public final RecommendedProductsByDepartmentModel f65544a;

            public C26900h(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
                Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "department");
                this.f65544a = recommendedProductsByDepartmentModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26900h m113989c(C26900h hVar, RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    recommendedProductsByDepartmentModel = hVar.f65544a;
                }
                return hVar.mo78120b(recommendedProductsByDepartmentModel);
            }

            @C12579k
            /* renamed from: a */
            public final RecommendedProductsByDepartmentModel mo78119a() {
                return this.f65544a;
            }

            @C12579k
            /* renamed from: b */
            public final C26900h mo78120b(@C12579k RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel) {
                Intrinsics.checkNotNullParameter(recommendedProductsByDepartmentModel, "department");
                return new C26900h(recommendedProductsByDepartmentModel);
            }

            @C12579k
            /* renamed from: d */
            public final RecommendedProductsByDepartmentModel mo78121d() {
                return this.f65544a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26900h) && Intrinsics.areEqual((Object) this.f65544a, (Object) ((C26900h) obj).f65544a);
            }

            public int hashCode() {
                return this.f65544a.hashCode();
            }

            @C12579k
            public String toString() {
                RecommendedProductsByDepartmentModel recommendedProductsByDepartmentModel = this.f65544a;
                return "NavigateToListByDepartment(department=" + recommendedProductsByDepartmentModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$i */
        public static final class C26901i implements C26892c {
            @C12579k

            /* renamed from: a */
            public static final C26901i f65545a = new C26901i();

            /* renamed from: b */
            public static final int f65546b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$k */
        public static final class C26903k implements C26892c {

            /* renamed from: b */
            public static final int f65550b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65551a;

            public C26903k(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65551a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26903k m113999c(C26903k kVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = kVar.f65551a;
                }
                return kVar.mo78134b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78133a() {
                return this.f65551a;
            }

            @C12579k
            /* renamed from: b */
            public final C26903k mo78134b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26903k(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo78135d() {
                return this.f65551a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26903k) && Intrinsics.areEqual((Object) this.f65551a, (Object) ((C26903k) obj).f65551a);
            }

            public int hashCode() {
                return this.f65551a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65551a;
                return "ShowProductDetails(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$l */
        public static final class C26904l implements C26892c {

            /* renamed from: b */
            public static final int f65552b = 0;
            @C12579k

            /* renamed from: a */
            public final BasketType f65553a;

            public C26904l(@C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                this.f65553a = basketType;
            }

            /* renamed from: c */
            public static /* synthetic */ C26904l m114003c(C26904l lVar, BasketType basketType, int i, Object obj) {
                if ((i & 1) != 0) {
                    basketType = lVar.f65553a;
                }
                return lVar.mo78140b(basketType);
            }

            @C12579k
            /* renamed from: a */
            public final BasketType mo78139a() {
                return this.f65553a;
            }

            @C12579k
            /* renamed from: b */
            public final C26904l mo78140b(@C12579k BasketType basketType) {
                Intrinsics.checkNotNullParameter(basketType, "basketType");
                return new C26904l(basketType);
            }

            @C12579k
            /* renamed from: d */
            public final BasketType mo78141d() {
                return this.f65553a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26904l) && this.f65553a == ((C26904l) obj).f65553a;
            }

            public int hashCode() {
                return this.f65553a.hashCode();
            }

            @C12579k
            public String toString() {
                BasketType basketType = this.f65553a;
                return "UpdateBasketType(basketType=" + basketType + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$m */
        public static final class C26905m implements C26892c {

            /* renamed from: c */
            public static final int f65554c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65555a;

            /* renamed from: b */
            public final int f65556b;

            public C26905m(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65555a = offerProductModel;
                this.f65556b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C26905m m114007d(C26905m mVar, OfferProductModel offerProductModel, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = mVar.f65555a;
                }
                if ((i2 & 2) != 0) {
                    i = mVar.f65556b;
                }
                return mVar.mo78147c(offerProductModel, i);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78145a() {
                return this.f65555a;
            }

            /* renamed from: b */
            public final int mo78146b() {
                return this.f65556b;
            }

            @C12579k
            /* renamed from: c */
            public final C26905m mo78147c(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26905m(offerProductModel, i);
            }

            /* renamed from: e */
            public final int mo78148e() {
                return this.f65556b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26905m)) {
                    return false;
                }
                C26905m mVar = (C26905m) obj;
                return Intrinsics.areEqual((Object) this.f65555a, (Object) mVar.f65555a) && this.f65556b == mVar.f65556b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferProductModel mo78150f() {
                return this.f65555a;
            }

            public int hashCode() {
                return (this.f65555a.hashCode() * 31) + Integer.hashCode(this.f65556b);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65555a;
                int i = this.f65556b;
                return "UpdateQuantityFromBottomSheet(offerProductModel=" + offerProductModel + ", initialSelectedQuantity=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$c$j */
        public static final class C26902j implements C26892c {

            /* renamed from: c */
            public static final int f65547c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f65548a;
            @C12580l

            /* renamed from: b */
            public final Integer f65549b;

            public C26902j(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f65548a = offerProductModel;
                this.f65549b = num;
            }

            /* renamed from: d */
            public static /* synthetic */ C26902j m113993d(C26902j jVar, OfferProductModel offerProductModel, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = jVar.f65548a;
                }
                if ((i & 2) != 0) {
                    num = jVar.f65549b;
                }
                return jVar.mo78127c(offerProductModel, num);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo78125a() {
                return this.f65548a;
            }

            @C12580l
            /* renamed from: b */
            public final Integer mo78126b() {
                return this.f65549b;
            }

            @C12579k
            /* renamed from: c */
            public final C26902j mo78127c(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C26902j(offerProductModel, num);
            }

            @C12579k
            /* renamed from: e */
            public final OfferProductModel mo78128e() {
                return this.f65548a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26902j)) {
                    return false;
                }
                C26902j jVar = (C26902j) obj;
                return Intrinsics.areEqual((Object) this.f65548a, (Object) jVar.f65548a) && Intrinsics.areEqual((Object) this.f65549b, (Object) jVar.f65549b);
            }

            @C12580l
            /* renamed from: f */
            public final Integer mo78130f() {
                return this.f65549b;
            }

            public int hashCode() {
                int hashCode = this.f65548a.hashCode() * 31;
                Integer num = this.f65549b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f65548a;
                Integer num = this.f65549b;
                return "RemoveProductFromBasket(offerProductModel=" + offerProductModel + ", quantity=" + num + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26902j(OfferProductModel offerProductModel, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(offerProductModel, (i & 2) != 0 ? null : num);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$b */
    public interface C26885b extends C28505u.C28509d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$b$a */
        public static final class C26886a implements C26885b {

            /* renamed from: c */
            public static final int f65517c = 0;

            /* renamed from: b */
            public final boolean f65518b;

            public C26886a(boolean z) {
                this.f65518b = z;
            }

            /* renamed from: g */
            public static /* synthetic */ C26886a m113957g(C26886a aVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = aVar.f65518b;
                }
                return aVar.mo78075f(z);
            }

            /* renamed from: e */
            public final boolean mo78073e() {
                return this.f65518b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26886a) && this.f65518b == ((C26886a) obj).f65518b;
            }

            @C12579k
            /* renamed from: f */
            public final C26886a mo78075f(boolean z) {
                return new C26886a(z);
            }

            /* renamed from: h */
            public final boolean mo78076h() {
                return this.f65518b;
            }

            public int hashCode() {
                boolean z = this.f65518b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26887b.m113961a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f65518b;
                return "BasketContainsAtLeastOneProduct(isBasketContainsAtLeastOneProduct=" + z + ")";
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$b$b */
        public static final class C26887b {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m113961a(@C12579k C26885b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$b$c */
        public static final class C26888c implements C26885b {
            @C12579k

            /* renamed from: b */
            public static final C26888c f65519b = new C26888c();

            /* renamed from: c */
            public static final int f65520c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26887b.m113961a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$b$d */
        public static final class C26889d implements C26885b {
            @C12579k

            /* renamed from: b */
            public static final C26889d f65521b = new C26889d();

            /* renamed from: c */
            public static final int f65522c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26887b.m113961a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$b$e */
        public static final class C26890e implements C26885b {

            /* renamed from: c */
            public static final int f65523c = 0;

            /* renamed from: b */
            public final boolean f65524b;

            public C26890e() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C26890e m113962g(C26890e eVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = eVar.f65524b;
                }
                return eVar.mo78081f(z);
            }

            /* renamed from: e */
            public final boolean mo78079e() {
                return this.f65524b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26890e) && this.f65524b == ((C26890e) obj).f65524b;
            }

            @C12579k
            /* renamed from: f */
            public final C26890e mo78081f(boolean z) {
                return new C26890e(z);
            }

            public int hashCode() {
                boolean z = this.f65524b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f65524b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26887b.m113961a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f65524b;
                return "Loading(isLoading=" + z + ")";
            }

            public C26890e(boolean z) {
                this.f65524b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26890e(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.d$b$f */
        public static final class C26891f implements C26885b {

            /* renamed from: e */
            public static final int f65525e = 8;
            @C12580l

            /* renamed from: b */
            public final List<RecommendedProductsByDepartmentModel> f65526b;
            @C12579k

            /* renamed from: c */
            public final List<OfferProductModel> f65527c;

            /* renamed from: d */
            public final boolean f65528d;

            public C26891f(@C12580l List<RecommendedProductsByDepartmentModel> list, @C12579k List<? extends OfferProductModel> list2, boolean z) {
                Intrinsics.checkNotNullParameter(list2, "offerList");
                this.f65526b = list;
                this.f65527c = list2;
                this.f65528d = z;
            }

            /* renamed from: i */
            public static /* synthetic */ C26891f m113965i(C26891f fVar, List<RecommendedProductsByDepartmentModel> list, List<OfferProductModel> list2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = fVar.f65526b;
                }
                if ((i & 2) != 0) {
                    list2 = fVar.f65527c;
                }
                if ((i & 4) != 0) {
                    z = fVar.f65528d;
                }
                return fVar.mo78089h(list, list2, z);
            }

            @C12580l
            /* renamed from: e */
            public final List<RecommendedProductsByDepartmentModel> mo78085e() {
                return this.f65526b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26891f)) {
                    return false;
                }
                C26891f fVar = (C26891f) obj;
                return Intrinsics.areEqual((Object) this.f65526b, (Object) fVar.f65526b) && Intrinsics.areEqual((Object) this.f65527c, (Object) fVar.f65527c) && this.f65528d == fVar.f65528d;
            }

            @C12579k
            /* renamed from: f */
            public final List<OfferProductModel> mo78087f() {
                return this.f65527c;
            }

            /* renamed from: g */
            public final boolean mo78088g() {
                return this.f65528d;
            }

            @C12579k
            /* renamed from: h */
            public final C26891f mo78089h(@C12580l List<RecommendedProductsByDepartmentModel> list, @C12579k List<? extends OfferProductModel> list2, boolean z) {
                Intrinsics.checkNotNullParameter(list2, "offerList");
                return new C26891f(list, list2, z);
            }

            public int hashCode() {
                List<RecommendedProductsByDepartmentModel> list = this.f65526b;
                int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.f65527c.hashCode()) * 31;
                boolean z = this.f65528d;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12580l
            /* renamed from: j */
            public final List<RecommendedProductsByDepartmentModel> mo78091j() {
                return this.f65526b;
            }

            @C12579k
            /* renamed from: k */
            public final List<OfferProductModel> mo78092k() {
                return this.f65527c;
            }

            /* renamed from: l */
            public final boolean mo78093l() {
                return this.f65528d;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26887b.m113961a(this);
            }

            @C12579k
            public String toString() {
                List<RecommendedProductsByDepartmentModel> list = this.f65526b;
                List<OfferProductModel> list2 = this.f65527c;
                boolean z = this.f65528d;
                return "OfferListState(departmentList=" + list + ", offerList=" + list2 + ", updateDepartmentList=" + z + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26891f(List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, list2, (i & 4) != 0 ? false : z);
            }
        }
    }
}
