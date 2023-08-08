package com.carrefour.fid.android.presentation.viewmodels.product.search.mvi;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.BasketErrorType;
import com.carrefour.fid.android.domain.models.CategoryLimitDomain;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import java.util.Map;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d */
public final class C27336d {
    @C12579k

    /* renamed from: a */
    public static final C27336d f66381a = new C27336d();

    /* renamed from: b */
    public static final int f66382b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$a */
    public static final class C27337a implements C27344h {
        @C12579k

        /* renamed from: a */
        public static final C27337a f66383a = new C27337a();

        /* renamed from: b */
        public static final int f66384b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$b */
    public static final class C27338b implements C27344h {

        /* renamed from: b */
        public static final int f66385b = 0;
        @C12579k

        /* renamed from: a */
        public final BasketErrorType f66386a;

        public C27338b(@C12579k BasketErrorType basketErrorType) {
            Intrinsics.checkNotNullParameter(basketErrorType, "errorType");
            this.f66386a = basketErrorType;
        }

        /* renamed from: c */
        public static /* synthetic */ C27338b m115277c(C27338b bVar, BasketErrorType basketErrorType, int i, Object obj) {
            if ((i & 1) != 0) {
                basketErrorType = bVar.f66386a;
            }
            return bVar.mo79558b(basketErrorType);
        }

        @C12579k
        /* renamed from: a */
        public final BasketErrorType mo79557a() {
            return this.f66386a;
        }

        @C12579k
        /* renamed from: b */
        public final C27338b mo79558b(@C12579k BasketErrorType basketErrorType) {
            Intrinsics.checkNotNullParameter(basketErrorType, "errorType");
            return new C27338b(basketErrorType);
        }

        @C12579k
        /* renamed from: d */
        public final BasketErrorType mo79559d() {
            return this.f66386a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27338b) && this.f66386a == ((C27338b) obj).f66386a;
        }

        public int hashCode() {
            return this.f66386a.hashCode();
        }

        @C12579k
        public String toString() {
            BasketErrorType basketErrorType = this.f66386a;
            return "BasketError(errorType=" + basketErrorType + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$c */
    public static final class C27339c implements C27344h {

        /* renamed from: b */
        public static final int f66387b = 8;
        @C12579k

        /* renamed from: a */
        public final Throwable f66388a;

        public C27339c(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, C10108c.f27801d);
            this.f66388a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C27339c m115281c(C27339c cVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = cVar.f66388a;
            }
            return cVar.mo79564b(th);
        }

        @C12579k
        /* renamed from: a */
        public final Throwable mo79563a() {
            return this.f66388a;
        }

        @C12579k
        /* renamed from: b */
        public final C27339c mo79564b(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, C10108c.f27801d);
            return new C27339c(th);
        }

        @C12579k
        /* renamed from: d */
        public final Throwable mo79565d() {
            return this.f66388a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27339c) && Intrinsics.areEqual((Object) this.f66388a, (Object) ((C27339c) obj).f66388a);
        }

        public int hashCode() {
            return this.f66388a.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f66388a;
            return "BasketMaxQtyError(t=" + th + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$d */
    public static final class C27340d implements C27344h {

        /* renamed from: b */
        public static final int f66389b = 8;
        @C12580l

        /* renamed from: a */
        public final Throwable f66390a;

        public C27340d(@C12580l Throwable th) {
            this.f66390a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C27340d m115285c(C27340d dVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = dVar.f66390a;
            }
            return dVar.mo79570b(th);
        }

        @C12580l
        /* renamed from: a */
        public final Throwable mo79569a() {
            return this.f66390a;
        }

        @C12579k
        /* renamed from: b */
        public final C27340d mo79570b(@C12580l Throwable th) {
            return new C27340d(th);
        }

        @C12580l
        /* renamed from: d */
        public final Throwable mo79571d() {
            return this.f66390a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27340d) && Intrinsics.areEqual((Object) this.f66390a, (Object) ((C27340d) obj).f66390a);
        }

        public int hashCode() {
            Throwable th = this.f66390a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f66390a;
            return "BasketUpdateError(cause=" + th + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$e */
    public static final class C27341e implements C27344h {

        /* renamed from: b */
        public static final int f66391b = 0;
        @C12580l

        /* renamed from: a */
        public final CategoryLimitDomain f66392a;

        public C27341e(@C12580l CategoryLimitDomain categoryLimitDomain) {
            this.f66392a = categoryLimitDomain;
        }

        /* renamed from: c */
        public static /* synthetic */ C27341e m115289c(C27341e eVar, CategoryLimitDomain categoryLimitDomain, int i, Object obj) {
            if ((i & 1) != 0) {
                categoryLimitDomain = eVar.f66392a;
            }
            return eVar.mo79576b(categoryLimitDomain);
        }

        @C12580l
        /* renamed from: a */
        public final CategoryLimitDomain mo79575a() {
            return this.f66392a;
        }

        @C12579k
        /* renamed from: b */
        public final C27341e mo79576b(@C12580l CategoryLimitDomain categoryLimitDomain) {
            return new C27341e(categoryLimitDomain);
        }

        @C12580l
        /* renamed from: d */
        public final CategoryLimitDomain mo79577d() {
            return this.f66392a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27341e) && Intrinsics.areEqual((Object) this.f66392a, (Object) ((C27341e) obj).f66392a);
        }

        public int hashCode() {
            CategoryLimitDomain categoryLimitDomain = this.f66392a;
            if (categoryLimitDomain == null) {
                return 0;
            }
            return categoryLimitDomain.hashCode();
        }

        @C12579k
        public String toString() {
            CategoryLimitDomain categoryLimitDomain = this.f66392a;
            return "CategoryLimitationError(categoryLimitDomain=" + categoryLimitDomain + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$f */
    public static final class C27342f implements C27344h {
        @C12579k

        /* renamed from: a */
        public static final C27342f f66393a = new C27342f();

        /* renamed from: b */
        public static final int f66394b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$g */
    public static final class C27343g implements C27344h {
        @C12579k

        /* renamed from: a */
        public static final C27343g f66395a = new C27343g();

        /* renamed from: b */
        public static final int f66396b = 0;
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$h */
    public interface C27344h {
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$i */
    public static final class C27345i implements C27344h {

        /* renamed from: b */
        public static final int f66397b = 8;
        @C12580l

        /* renamed from: a */
        public final Throwable f66398a;

        public C27345i(@C12580l Throwable th) {
            this.f66398a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C27345i m115293c(C27345i iVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = iVar.f66398a;
            }
            return iVar.mo79582b(th);
        }

        @C12580l
        /* renamed from: a */
        public final Throwable mo79581a() {
            return this.f66398a;
        }

        @C12579k
        /* renamed from: b */
        public final C27345i mo79582b(@C12580l Throwable th) {
            return new C27345i(th);
        }

        @C12580l
        /* renamed from: d */
        public final Throwable mo79583d() {
            return this.f66398a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27345i) && Intrinsics.areEqual((Object) this.f66398a, (Object) ((C27345i) obj).f66398a);
        }

        public int hashCode() {
            Throwable th = this.f66398a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f66398a;
            return "ShoppingListError(cause=" + th + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$j */
    public interface C27346j extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$j$a */
        public static final class C27347a implements C27346j {

            /* renamed from: b */
            public static final int f66399b = 8;
            @C12579k

            /* renamed from: a */
            public final List<OfferProductModel> f66400a;

            public C27347a(@C12579k List<? extends OfferProductModel> list) {
                Intrinsics.checkNotNullParameter(list, "productList");
                this.f66400a = list;
            }

            /* renamed from: c */
            public static /* synthetic */ C27347a m115297c(C27347a aVar, List<OfferProductModel> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = aVar.f66400a;
                }
                return aVar.mo79588b(list);
            }

            @C12579k
            /* renamed from: a */
            public final List<OfferProductModel> mo79587a() {
                return this.f66400a;
            }

            @C12579k
            /* renamed from: b */
            public final C27347a mo79588b(@C12579k List<? extends OfferProductModel> list) {
                Intrinsics.checkNotNullParameter(list, "productList");
                return new C27347a(list);
            }

            @C12579k
            /* renamed from: d */
            public final List<OfferProductModel> mo79589d() {
                return this.f66400a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27347a) && Intrinsics.areEqual((Object) this.f66400a, (Object) ((C27347a) obj).f66400a);
            }

            public int hashCode() {
                return this.f66400a.hashCode();
            }

            @C12579k
            public String toString() {
                List<OfferProductModel> list = this.f66400a;
                return "AddAllProductToBasketSuccess(productList=" + list + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$j$b */
        public static final class C27348b implements C27346j {

            /* renamed from: b */
            public static final int f66401b = 8;
            @C12579k

            /* renamed from: a */
            public final C27344h f66402a;

            public C27348b(@C12579k C27344h hVar) {
                Intrinsics.checkNotNullParameter(hVar, "error");
                this.f66402a = hVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C27348b m115301c(C27348b bVar, C27344h hVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    hVar = bVar.f66402a;
                }
                return bVar.mo79594b(hVar);
            }

            @C12579k
            /* renamed from: a */
            public final C27344h mo79593a() {
                return this.f66402a;
            }

            @C12579k
            /* renamed from: b */
            public final C27348b mo79594b(@C12579k C27344h hVar) {
                Intrinsics.checkNotNullParameter(hVar, "error");
                return new C27348b(hVar);
            }

            @C12579k
            /* renamed from: d */
            public final C27344h mo79595d() {
                return this.f66402a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27348b) && Intrinsics.areEqual((Object) this.f66402a, (Object) ((C27348b) obj).f66402a);
            }

            public int hashCode() {
                return this.f66402a.hashCode();
            }

            @C12579k
            public String toString() {
                C27344h hVar = this.f66402a;
                return "Error(error=" + hVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$j$c */
        public static final class C27349c implements C27346j {

            /* renamed from: c */
            public static final int f66403c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66404a;

            /* renamed from: b */
            public final boolean f66405b;

            public C27349c(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66404a = offerProductModel;
                this.f66405b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C27349c m115305d(C27349c cVar, OfferProductModel offerProductModel, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = cVar.f66404a;
                }
                if ((i & 2) != 0) {
                    z = cVar.f66405b;
                }
                return cVar.mo79601c(offerProductModel, z);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79599a() {
                return this.f66404a;
            }

            /* renamed from: b */
            public final boolean mo79600b() {
                return this.f66405b;
            }

            @C12579k
            /* renamed from: c */
            public final C27349c mo79601c(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27349c(offerProductModel, z);
            }

            /* renamed from: e */
            public final boolean mo79602e() {
                return this.f66405b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27349c)) {
                    return false;
                }
                C27349c cVar = (C27349c) obj;
                return Intrinsics.areEqual((Object) this.f66404a, (Object) cVar.f66404a) && this.f66405b == cVar.f66405b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferProductModel mo79604f() {
                return this.f66404a;
            }

            public int hashCode() {
                int hashCode = this.f66404a.hashCode() * 31;
                boolean z = this.f66405b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66404a;
                boolean z = this.f66405b;
                return "NavigateToPdp(offerProductModel=" + offerProductModel + ", navigateToNonFoodPdp=" + z + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$k */
    public static final class C27350k implements C28505u.C28509d {

        /* renamed from: f */
        public static final int f66406f = 8;

        /* renamed from: b */
        public final boolean f66407b;
        @C12580l

        /* renamed from: c */
        public final Map<String, List<OfferProductModel>> f66408c;
        @C12580l

        /* renamed from: d */
        public final List<String> f66409d;
        @C12580l

        /* renamed from: e */
        public final Throwable f66410e;

        public C27350k() {
            this(false, (Map) null, (List) null, (Throwable) null, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: j */
        public static /* synthetic */ C27350k m115311j(C27350k kVar, boolean z, Map<String, List<OfferProductModel>> map, List<String> list, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                z = kVar.f66407b;
            }
            if ((i & 2) != 0) {
                map = kVar.f66408c;
            }
            if ((i & 4) != 0) {
                list = kVar.f66409d;
            }
            if ((i & 8) != 0) {
                th = kVar.f66410e;
            }
            return kVar.mo79613i(z, map, list, th);
        }

        /* renamed from: e */
        public final boolean mo79607e() {
            return this.f66407b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27350k)) {
                return false;
            }
            C27350k kVar = (C27350k) obj;
            return this.f66407b == kVar.f66407b && Intrinsics.areEqual((Object) this.f66408c, (Object) kVar.f66408c) && Intrinsics.areEqual((Object) this.f66409d, (Object) kVar.f66409d) && Intrinsics.areEqual((Object) this.f66410e, (Object) kVar.f66410e);
        }

        @C12580l
        /* renamed from: f */
        public final Map<String, List<OfferProductModel>> mo79609f() {
            return this.f66408c;
        }

        @C12580l
        /* renamed from: g */
        public final List<String> mo79610g() {
            return this.f66409d;
        }

        @C12580l
        /* renamed from: h */
        public final Throwable mo79611h() {
            return this.f66410e;
        }

        public int hashCode() {
            boolean z = this.f66407b;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            Map<String, List<OfferProductModel>> map = this.f66408c;
            int i2 = 0;
            int hashCode = (i + (map == null ? 0 : map.hashCode())) * 31;
            List<String> list = this.f66409d;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Throwable th = this.f66410e;
            if (th != null) {
                i2 = th.hashCode();
            }
            return hashCode2 + i2;
        }

        @C12579k
        /* renamed from: i */
        public final C27350k mo79613i(boolean z, @C12580l Map<String, ? extends List<? extends OfferProductModel>> map, @C12580l List<String> list, @C12580l Throwable th) {
            return new C27350k(z, map, list, th);
        }

        public final boolean isLoading() {
            return this.f66407b;
        }

        @C12580l
        /* renamed from: k */
        public final Throwable mo79615k() {
            return this.f66410e;
        }

        @C12580l
        /* renamed from: l */
        public final List<String> mo79616l() {
            return this.f66409d;
        }

        @C12580l
        /* renamed from: m */
        public final Map<String, List<OfferProductModel>> mo79617m() {
            return this.f66408c;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f66407b;
            Map<String, List<OfferProductModel>> map = this.f66408c;
            List<String> list = this.f66409d;
            Throwable th = this.f66410e;
            return "UiState(isLoading=" + z + ", productsByCategories=" + map + ", keywordsWithNoResult=" + list + ", errorEvent=" + th + ")";
        }

        public C27350k(boolean z, @C12580l Map<String, ? extends List<? extends OfferProductModel>> map, @C12580l List<String> list, @C12580l Throwable th) {
            this.f66407b = z;
            this.f66408c = map;
            this.f66409d = list;
            this.f66410e = th;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27350k(boolean z, Map map, List list, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : th);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$l */
    public static abstract class C27351l implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f66411a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$l$a */
        public static final class C27352a extends C27351l {
            @C12579k

            /* renamed from: b */
            public static final C27352a f66412b = new C27352a();

            /* renamed from: c */
            public static final int f66413c = 0;

            public C27352a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$l$b */
        public static final class C27353b extends C27351l {

            /* renamed from: c */
            public static final int f66414c = 8;
            @C12579k

            /* renamed from: b */
            public final OfferProductModel f66415b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27353b(@C12579k OfferProductModel offerProductModel) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66415b = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27353b m115320c(C27353b bVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = bVar.f66415b;
                }
                return bVar.mo79620b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79619a() {
                return this.f66415b;
            }

            @C12579k
            /* renamed from: b */
            public final C27353b mo79620b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27353b(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79621d() {
                return this.f66415b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27353b) && Intrinsics.areEqual((Object) this.f66415b, (Object) ((C27353b) obj).f66415b);
            }

            public int hashCode() {
                return this.f66415b.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66415b;
                return "AddProductToBasket(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$l$c */
        public static final class C27354c extends C27351l {

            /* renamed from: c */
            public static final int f66416c = 8;
            @C12579k

            /* renamed from: b */
            public final OfferProductModel f66417b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27354c(@C12579k OfferProductModel offerProductModel) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66417b = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27354c m115324c(C27354c cVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = cVar.f66417b;
                }
                return cVar.mo79626b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79625a() {
                return this.f66417b;
            }

            @C12579k
            /* renamed from: b */
            public final C27354c mo79626b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27354c(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79627d() {
                return this.f66417b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27354c) && Intrinsics.areEqual((Object) this.f66417b, (Object) ((C27354c) obj).f66417b);
            }

            public int hashCode() {
                return this.f66417b.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66417b;
                return "AddProductToShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$l$d */
        public static final class C27355d extends C27351l {

            /* renamed from: c */
            public static final int f66418c = 8;
            @C12580l

            /* renamed from: b */
            public final Bundle f66419b;

            public C27355d(@C12580l Bundle bundle) {
                super((DefaultConstructorMarker) null);
                this.f66419b = bundle;
            }

            /* renamed from: c */
            public static /* synthetic */ C27355d m115328c(C27355d dVar, Bundle bundle, int i, Object obj) {
                if ((i & 1) != 0) {
                    bundle = dVar.f66419b;
                }
                return dVar.mo79632b(bundle);
            }

            @C12580l
            /* renamed from: a */
            public final Bundle mo79631a() {
                return this.f66419b;
            }

            @C12579k
            /* renamed from: b */
            public final C27355d mo79632b(@C12580l Bundle bundle) {
                return new C27355d(bundle);
            }

            @C12580l
            /* renamed from: d */
            public final Bundle mo79633d() {
                return this.f66419b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27355d) && Intrinsics.areEqual((Object) this.f66419b, (Object) ((C27355d) obj).f66419b);
            }

            public int hashCode() {
                Bundle bundle = this.f66419b;
                if (bundle == null) {
                    return 0;
                }
                return bundle.hashCode();
            }

            @C12579k
            public String toString() {
                Bundle bundle = this.f66419b;
                return "LoadProducts(bundle=" + bundle + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$l$e */
        public static final class C27356e extends C27351l {

            /* renamed from: d */
            public static final int f66420d = 8;
            @C12579k

            /* renamed from: b */
            public final OfferProductModel f66421b;
            @C12580l

            /* renamed from: c */
            public final Integer f66422c;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C27356e(OfferProductModel offerProductModel, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(offerProductModel, (i & 2) != 0 ? null : num);
            }

            /* renamed from: d */
            public static /* synthetic */ C27356e m115332d(C27356e eVar, OfferProductModel offerProductModel, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = eVar.f66421b;
                }
                if ((i & 2) != 0) {
                    num = eVar.f66422c;
                }
                return eVar.mo79639c(offerProductModel, num);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79637a() {
                return this.f66421b;
            }

            @C12580l
            /* renamed from: b */
            public final Integer mo79638b() {
                return this.f66422c;
            }

            @C12579k
            /* renamed from: c */
            public final C27356e mo79639c(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27356e(offerProductModel, num);
            }

            @C12579k
            /* renamed from: e */
            public final OfferProductModel mo79640e() {
                return this.f66421b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27356e)) {
                    return false;
                }
                C27356e eVar = (C27356e) obj;
                return Intrinsics.areEqual((Object) this.f66421b, (Object) eVar.f66421b) && Intrinsics.areEqual((Object) this.f66422c, (Object) eVar.f66422c);
            }

            @C12580l
            /* renamed from: f */
            public final Integer mo79642f() {
                return this.f66422c;
            }

            public int hashCode() {
                int hashCode = this.f66421b.hashCode() * 31;
                Integer num = this.f66422c;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66421b;
                Integer num = this.f66422c;
                return "RemoveProductFromBasket(offerProductModel=" + offerProductModel + ", quantity=" + num + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27356e(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66421b = offerProductModel;
                this.f66422c = num;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$l$f */
        public static final class C27357f extends C27351l {

            /* renamed from: c */
            public static final int f66423c = 8;
            @C12579k

            /* renamed from: b */
            public final OfferProductModel f66424b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27357f(@C12579k OfferProductModel offerProductModel) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66424b = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27357f m115338c(C27357f fVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = fVar.f66424b;
                }
                return fVar.mo79646b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79645a() {
                return this.f66424b;
            }

            @C12579k
            /* renamed from: b */
            public final C27357f mo79646b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27357f(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79647d() {
                return this.f66424b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27357f) && Intrinsics.areEqual((Object) this.f66424b, (Object) ((C27357f) obj).f66424b);
            }

            public int hashCode() {
                return this.f66424b.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66424b;
                return "RemoveProductFromShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$l$g */
        public static final class C27358g extends C27351l {

            /* renamed from: c */
            public static final int f66425c = 8;
            @C12579k

            /* renamed from: b */
            public final OfferProductModel f66426b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27358g(@C12579k OfferProductModel offerProductModel) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66426b = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27358g m115342c(C27358g gVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = gVar.f66426b;
                }
                return gVar.mo79652b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79651a() {
                return this.f66426b;
            }

            @C12579k
            /* renamed from: b */
            public final C27358g mo79652b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27358g(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79653d() {
                return this.f66426b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27358g) && Intrinsics.areEqual((Object) this.f66426b, (Object) ((C27358g) obj).f66426b);
            }

            public int hashCode() {
                return this.f66426b.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66426b;
                return "ShowProductDetails(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.d$l$h */
        public static final class C27359h extends C27351l {
            @C12579k

            /* renamed from: b */
            public static final C27359h f66427b = new C27359h();

            /* renamed from: c */
            public static final int f66428c = 0;

            public C27359h() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C27351l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C27351l() {
        }
    }
}
