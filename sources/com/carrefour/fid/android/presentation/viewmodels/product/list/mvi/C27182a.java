package com.carrefour.fid.android.presentation.viewmodels.product.list.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListResultModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a */
public final class C27182a {
    @C12579k

    /* renamed from: a */
    public static final C27182a f66094a = new C27182a();

    /* renamed from: b */
    public static final int f66095b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c */
    public interface C27193c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$a */
        public static final class C27194a implements C27193c {

            /* renamed from: b */
            public static final int f66115b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66116a;

            public C27194a(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66116a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27194a m114846c(C27194a aVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = aVar.f66116a;
                }
                return aVar.mo79072b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79071a() {
                return this.f66116a;
            }

            @C12579k
            /* renamed from: b */
            public final C27194a mo79072b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27194a(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79073d() {
                return this.f66116a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27194a) && Intrinsics.areEqual((Object) this.f66116a, (Object) ((C27194a) obj).f66116a);
            }

            public int hashCode() {
                return this.f66116a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66116a;
                return "AddProductToBasket(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$b */
        public static final class C27195b implements C27193c {

            /* renamed from: b */
            public static final int f66117b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66118a;

            public C27195b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66118a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27195b m114850c(C27195b bVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = bVar.f66118a;
                }
                return bVar.mo79078b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79077a() {
                return this.f66118a;
            }

            @C12579k
            /* renamed from: b */
            public final C27195b mo79078b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27195b(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79079d() {
                return this.f66118a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27195b) && Intrinsics.areEqual((Object) this.f66118a, (Object) ((C27195b) obj).f66118a);
            }

            public int hashCode() {
                return this.f66118a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66118a;
                return "AddProductToShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$c */
        public static final class C27196c implements C27193c {

            /* renamed from: b */
            public static final int f66119b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66120a;

            public C27196c(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "product");
                this.f66120a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27196c m114854c(C27196c cVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = cVar.f66120a;
                }
                return cVar.mo79084b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79083a() {
                return this.f66120a;
            }

            @C12579k
            /* renamed from: b */
            public final C27196c mo79084b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "product");
                return new C27196c(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79085d() {
                return this.f66120a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27196c) && Intrinsics.areEqual((Object) this.f66120a, (Object) ((C27196c) obj).f66120a);
            }

            public int hashCode() {
                return this.f66120a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66120a;
                return "ClearMixingOverlay(product=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$d */
        public static final class C27197d implements C27193c {

            /* renamed from: b */
            public static final int f66121b = 0;
            @C12579k

            /* renamed from: a */
            public final String f66122a;

            public C27197d(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "url");
                this.f66122a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C27197d m114858c(C27197d dVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dVar.f66122a;
                }
                return dVar.mo79090b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo79089a() {
                return this.f66122a;
            }

            @C12579k
            /* renamed from: b */
            public final C27197d mo79090b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "url");
                return new C27197d(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo79091d() {
                return this.f66122a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27197d) && Intrinsics.areEqual((Object) this.f66122a, (Object) ((C27197d) obj).f66122a);
            }

            public int hashCode() {
                return this.f66122a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f66122a;
                return "CriteoTracking(url=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$e */
        public static final class C27198e implements C27193c {
            @C12579k

            /* renamed from: a */
            public static final C27198e f66123a = new C27198e();

            /* renamed from: b */
            public static final int f66124b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$f */
        public static final class C27199f implements C27193c {
            @C12579k

            /* renamed from: a */
            public static final C27199f f66125a = new C27199f();

            /* renamed from: b */
            public static final int f66126b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$g */
        public static final class C27200g implements C27193c {

            /* renamed from: b */
            public static final int f66127b = 8;
            @C12579k

            /* renamed from: a */
            public final ProductListSettingsModel f66128a;

            public C27200g(@C12579k ProductListSettingsModel productListSettingsModel) {
                Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
                this.f66128a = productListSettingsModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27200g m114862c(C27200g gVar, ProductListSettingsModel productListSettingsModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    productListSettingsModel = gVar.f66128a;
                }
                return gVar.mo79096b(productListSettingsModel);
            }

            @C12579k
            /* renamed from: a */
            public final ProductListSettingsModel mo79095a() {
                return this.f66128a;
            }

            @C12579k
            /* renamed from: b */
            public final C27200g mo79096b(@C12579k ProductListSettingsModel productListSettingsModel) {
                Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
                return new C27200g(productListSettingsModel);
            }

            @C12579k
            /* renamed from: d */
            public final ProductListSettingsModel mo79097d() {
                return this.f66128a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27200g) && Intrinsics.areEqual((Object) this.f66128a, (Object) ((C27200g) obj).f66128a);
            }

            public int hashCode() {
                return this.f66128a.hashCode();
            }

            @C12579k
            public String toString() {
                ProductListSettingsModel productListSettingsModel = this.f66128a;
                return "Init(settings=" + productListSettingsModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$i */
        public static final class C27202i implements C27193c {

            /* renamed from: b */
            public static final int f66132b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66133a;

            public C27202i(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66133a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27202i m114872c(C27202i iVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = iVar.f66133a;
                }
                return iVar.mo79110b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79109a() {
                return this.f66133a;
            }

            @C12579k
            /* renamed from: b */
            public final C27202i mo79110b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27202i(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79111d() {
                return this.f66133a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27202i) && Intrinsics.areEqual((Object) this.f66133a, (Object) ((C27202i) obj).f66133a);
            }

            public int hashCode() {
                return this.f66133a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66133a;
                return "RemoveProductFromShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$j */
        public static final class C27203j implements C27193c {
            @C12579k

            /* renamed from: a */
            public static final C27203j f66134a = new C27203j();

            /* renamed from: b */
            public static final int f66135b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$k */
        public static final class C27204k implements C27193c {

            /* renamed from: b */
            public static final int f66136b = 0;
            @C12580l

            /* renamed from: a */
            public final String f66137a;

            public C27204k(@C12580l String str) {
                this.f66137a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C27204k m114876c(C27204k kVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = kVar.f66137a;
                }
                return kVar.mo79116b(str);
            }

            @C12580l
            /* renamed from: a */
            public final String mo79115a() {
                return this.f66137a;
            }

            @C12579k
            /* renamed from: b */
            public final C27204k mo79116b(@C12580l String str) {
                return new C27204k(str);
            }

            @C12580l
            /* renamed from: d */
            public final String mo79117d() {
                return this.f66137a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27204k) && Intrinsics.areEqual((Object) this.f66137a, (Object) ((C27204k) obj).f66137a);
            }

            public int hashCode() {
                String str = this.f66137a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f66137a;
                return "SendAirshipEvent(promoLabel=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$l */
        public static final class C27205l implements C27193c {

            /* renamed from: c */
            public static final int f66138c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66139a;

            /* renamed from: b */
            public final int f66140b;

            public C27205l(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66139a = offerProductModel;
                this.f66140b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C27205l m114880d(C27205l lVar, OfferProductModel offerProductModel, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = lVar.f66139a;
                }
                if ((i2 & 2) != 0) {
                    i = lVar.f66140b;
                }
                return lVar.mo79123c(offerProductModel, i);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79121a() {
                return this.f66139a;
            }

            /* renamed from: b */
            public final int mo79122b() {
                return this.f66140b;
            }

            @C12579k
            /* renamed from: c */
            public final C27205l mo79123c(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27205l(offerProductModel, i);
            }

            @C12579k
            /* renamed from: e */
            public final OfferProductModel mo79124e() {
                return this.f66139a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27205l)) {
                    return false;
                }
                C27205l lVar = (C27205l) obj;
                return Intrinsics.areEqual((Object) this.f66139a, (Object) lVar.f66139a) && this.f66140b == lVar.f66140b;
            }

            /* renamed from: f */
            public final int mo79126f() {
                return this.f66140b;
            }

            public int hashCode() {
                return (this.f66139a.hashCode() * 31) + Integer.hashCode(this.f66140b);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66139a;
                int i = this.f66140b;
                return "SendBasketChangedCriteoEvent(offerProductModel=" + offerProductModel + ", quantity=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$m */
        public static final class C27206m implements C27193c {
            @C12579k

            /* renamed from: a */
            public static final C27206m f66141a = new C27206m();

            /* renamed from: b */
            public static final int f66142b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$n */
        public static final class C27207n implements C27193c {

            /* renamed from: c */
            public static final int f66143c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66144a;

            /* renamed from: b */
            public final int f66145b;

            public C27207n(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66144a = offerProductModel;
                this.f66145b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C27207n m114886d(C27207n nVar, OfferProductModel offerProductModel, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    offerProductModel = nVar.f66144a;
                }
                if ((i2 & 2) != 0) {
                    i = nVar.f66145b;
                }
                return nVar.mo79131c(offerProductModel, i);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79129a() {
                return this.f66144a;
            }

            /* renamed from: b */
            public final int mo79130b() {
                return this.f66145b;
            }

            @C12579k
            /* renamed from: c */
            public final C27207n mo79131c(@C12579k OfferProductModel offerProductModel, int i) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27207n(offerProductModel, i);
            }

            @C12579k
            /* renamed from: e */
            public final OfferProductModel mo79132e() {
                return this.f66144a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27207n)) {
                    return false;
                }
                C27207n nVar = (C27207n) obj;
                return Intrinsics.areEqual((Object) this.f66144a, (Object) nVar.f66144a) && this.f66145b == nVar.f66145b;
            }

            /* renamed from: f */
            public final int mo79134f() {
                return this.f66145b;
            }

            public int hashCode() {
                return (this.f66144a.hashCode() * 31) + Integer.hashCode(this.f66145b);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66144a;
                int i = this.f66145b;
                return "SetProductQuantity(offerProductModel=" + offerProductModel + ", quantity=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$o */
        public static final class C27208o implements C27193c {

            /* renamed from: b */
            public static final int f66146b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66147a;

            public C27208o(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66147a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27208o m114892c(C27208o oVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = oVar.f66147a;
                }
                return oVar.mo79138b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79137a() {
                return this.f66147a;
            }

            @C12579k
            /* renamed from: b */
            public final C27208o mo79138b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27208o(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79139d() {
                return this.f66147a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27208o) && Intrinsics.areEqual((Object) this.f66147a, (Object) ((C27208o) obj).f66147a);
            }

            public int hashCode() {
                return this.f66147a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66147a;
                return "ShowProductDetails(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$p */
        public static final class C27209p implements C27193c {
            @C12579k

            /* renamed from: a */
            public static final C27209p f66148a = new C27209p();

            /* renamed from: b */
            public static final int f66149b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$q */
        public static final class C27210q implements C27193c {

            /* renamed from: b */
            public static final int f66150b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66151a;

            public C27210q(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66151a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27210q m114896c(C27210q qVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = qVar.f66151a;
                }
                return qVar.mo79144b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79143a() {
                return this.f66151a;
            }

            @C12579k
            /* renamed from: b */
            public final C27210q mo79144b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27210q(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79145d() {
                return this.f66151a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27210q) && Intrinsics.areEqual((Object) this.f66151a, (Object) ((C27210q) obj).f66151a);
            }

            public int hashCode() {
                return this.f66151a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66151a;
                return "TrackProductClick(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$r */
        public static final class C27211r implements C27193c {

            /* renamed from: b */
            public static final int f66152b = 0;

            /* renamed from: a */
            public final boolean f66153a;

            public C27211r(boolean z) {
                this.f66153a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C27211r m114900c(C27211r rVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = rVar.f66153a;
                }
                return rVar.mo79150b(z);
            }

            /* renamed from: a */
            public final boolean mo79149a() {
                return this.f66153a;
            }

            @C12579k
            /* renamed from: b */
            public final C27211r mo79150b(boolean z) {
                return new C27211r(z);
            }

            /* renamed from: d */
            public final boolean mo79151d() {
                return this.f66153a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27211r) && this.f66153a == ((C27211r) obj).f66153a;
            }

            public int hashCode() {
                boolean z = this.f66153a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f66153a;
                return "UpdateScanTutorialShown(shown=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$s */
        public static final class C27212s implements C27193c {

            /* renamed from: b */
            public static final int f66154b = 8;
            @C12579k

            /* renamed from: a */
            public final ProductListSettingsModel f66155a;

            public C27212s(@C12579k ProductListSettingsModel productListSettingsModel) {
                Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
                this.f66155a = productListSettingsModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27212s m114904c(C27212s sVar, ProductListSettingsModel productListSettingsModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    productListSettingsModel = sVar.f66155a;
                }
                return sVar.mo79156b(productListSettingsModel);
            }

            @C12579k
            /* renamed from: a */
            public final ProductListSettingsModel mo79155a() {
                return this.f66155a;
            }

            @C12579k
            /* renamed from: b */
            public final C27212s mo79156b(@C12579k ProductListSettingsModel productListSettingsModel) {
                Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
                return new C27212s(productListSettingsModel);
            }

            @C12579k
            /* renamed from: d */
            public final ProductListSettingsModel mo79157d() {
                return this.f66155a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27212s) && Intrinsics.areEqual((Object) this.f66155a, (Object) ((C27212s) obj).f66155a);
            }

            public int hashCode() {
                return this.f66155a.hashCode();
            }

            @C12579k
            public String toString() {
                ProductListSettingsModel productListSettingsModel = this.f66155a;
                return "UpdateSettings(settings=" + productListSettingsModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$c$h */
        public static final class C27201h implements C27193c {

            /* renamed from: c */
            public static final int f66129c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66130a;
            @C12580l

            /* renamed from: b */
            public final Integer f66131b;

            public C27201h(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66130a = offerProductModel;
                this.f66131b = num;
            }

            /* renamed from: d */
            public static /* synthetic */ C27201h m114866d(C27201h hVar, OfferProductModel offerProductModel, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = hVar.f66130a;
                }
                if ((i & 2) != 0) {
                    num = hVar.f66131b;
                }
                return hVar.mo79103c(offerProductModel, num);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79101a() {
                return this.f66130a;
            }

            @C12580l
            /* renamed from: b */
            public final Integer mo79102b() {
                return this.f66131b;
            }

            @C12579k
            /* renamed from: c */
            public final C27201h mo79103c(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27201h(offerProductModel, num);
            }

            @C12579k
            /* renamed from: e */
            public final OfferProductModel mo79104e() {
                return this.f66130a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27201h)) {
                    return false;
                }
                C27201h hVar = (C27201h) obj;
                return Intrinsics.areEqual((Object) this.f66130a, (Object) hVar.f66130a) && Intrinsics.areEqual((Object) this.f66131b, (Object) hVar.f66131b);
            }

            @C12580l
            /* renamed from: f */
            public final Integer mo79106f() {
                return this.f66131b;
            }

            public int hashCode() {
                int hashCode = this.f66130a.hashCode() * 31;
                Integer num = this.f66131b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66130a;
                Integer num = this.f66131b;
                return "RemoveProductFromBasket(offerProductModel=" + offerProductModel + ", quantity=" + num + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C27201h(OfferProductModel offerProductModel, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(offerProductModel, (i & 2) != 0 ? null : num);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$a */
    public interface C27183a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$a$a */
        public static final class C27184a implements C27183a {

            /* renamed from: b */
            public static final int f66096b = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66097a;

            public C27184a(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66097a = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27184a m114812c(C27184a aVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = aVar.f66097a;
                }
                return aVar.mo79026b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79025a() {
                return this.f66097a;
            }

            @C12579k
            /* renamed from: b */
            public final C27184a mo79026b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27184a(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79027d() {
                return this.f66097a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27184a) && Intrinsics.areEqual((Object) this.f66097a, (Object) ((C27184a) obj).f66097a);
            }

            public int hashCode() {
                return this.f66097a.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66097a;
                return "AnnounceAccessibility(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$a$c */
        public static final class C27186c implements C27183a {

            /* renamed from: c */
            public static final int f66102c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66103a;

            /* renamed from: b */
            public final boolean f66104b;

            public C27186c(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66103a = offerProductModel;
                this.f66104b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C27186c m114824d(C27186c cVar, OfferProductModel offerProductModel, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = cVar.f66103a;
                }
                if ((i & 2) != 0) {
                    z = cVar.f66104b;
                }
                return cVar.mo79043c(offerProductModel, z);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79041a() {
                return this.f66103a;
            }

            /* renamed from: b */
            public final boolean mo79042b() {
                return this.f66104b;
            }

            @C12579k
            /* renamed from: c */
            public final C27186c mo79043c(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27186c(offerProductModel, z);
            }

            /* renamed from: e */
            public final boolean mo79044e() {
                return this.f66104b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27186c)) {
                    return false;
                }
                C27186c cVar = (C27186c) obj;
                return Intrinsics.areEqual((Object) this.f66103a, (Object) cVar.f66103a) && this.f66104b == cVar.f66104b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferProductModel mo79046f() {
                return this.f66103a;
            }

            public int hashCode() {
                int hashCode = this.f66103a.hashCode() * 31;
                boolean z = this.f66104b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66103a;
                boolean z = this.f66104b;
                return "NavigateToPdp(offerProductModel=" + offerProductModel + ", navigateToNonFoodPdp=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$a$b */
        public static final class C27185b implements C27183a {

            /* renamed from: d */
            public static final int f66098d = 8;
            @C12580l

            /* renamed from: a */
            public final Throwable f66099a;
            @C12580l

            /* renamed from: b */
            public final ProductListResultModel f66100b;
            @C12580l

            /* renamed from: c */
            public final ProductListSettingsModel f66101c;

            public C27185b(@C12580l Throwable th, @C12580l ProductListResultModel productListResultModel, @C12580l ProductListSettingsModel productListSettingsModel) {
                this.f66099a = th;
                this.f66100b = productListResultModel;
                this.f66101c = productListSettingsModel;
            }

            /* renamed from: e */
            public static /* synthetic */ C27185b m114816e(C27185b bVar, Throwable th, ProductListResultModel productListResultModel, ProductListSettingsModel productListSettingsModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = bVar.f66099a;
                }
                if ((i & 2) != 0) {
                    productListResultModel = bVar.f66100b;
                }
                if ((i & 4) != 0) {
                    productListSettingsModel = bVar.f66101c;
                }
                return bVar.mo79034d(th, productListResultModel, productListSettingsModel);
            }

            @C12580l
            /* renamed from: a */
            public final Throwable mo79031a() {
                return this.f66099a;
            }

            @C12580l
            /* renamed from: b */
            public final ProductListResultModel mo79032b() {
                return this.f66100b;
            }

            @C12580l
            /* renamed from: c */
            public final ProductListSettingsModel mo79033c() {
                return this.f66101c;
            }

            @C12579k
            /* renamed from: d */
            public final C27185b mo79034d(@C12580l Throwable th, @C12580l ProductListResultModel productListResultModel, @C12580l ProductListSettingsModel productListSettingsModel) {
                return new C27185b(th, productListResultModel, productListSettingsModel);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27185b)) {
                    return false;
                }
                C27185b bVar = (C27185b) obj;
                return Intrinsics.areEqual((Object) this.f66099a, (Object) bVar.f66099a) && Intrinsics.areEqual((Object) this.f66100b, (Object) bVar.f66100b) && Intrinsics.areEqual((Object) this.f66101c, (Object) bVar.f66101c);
            }

            @C12580l
            /* renamed from: f */
            public final ProductListResultModel mo79036f() {
                return this.f66100b;
            }

            @C12580l
            /* renamed from: g */
            public final ProductListSettingsModel mo79037g() {
                return this.f66101c;
            }

            @C12580l
            /* renamed from: h */
            public final Throwable mo79038h() {
                return this.f66099a;
            }

            public int hashCode() {
                Throwable th = this.f66099a;
                int i = 0;
                int hashCode = (th == null ? 0 : th.hashCode()) * 31;
                ProductListResultModel productListResultModel = this.f66100b;
                int hashCode2 = (hashCode + (productListResultModel == null ? 0 : productListResultModel.hashCode())) * 31;
                ProductListSettingsModel productListSettingsModel = this.f66101c;
                if (productListSettingsModel != null) {
                    i = productListSettingsModel.hashCode();
                }
                return hashCode2 + i;
            }

            @C12579k
            public String toString() {
                Throwable th = this.f66099a;
                ProductListResultModel productListResultModel = this.f66100b;
                ProductListSettingsModel productListSettingsModel = this.f66101c;
                return "Error(throwable=" + th + ", productList=" + productListResultModel + ", settings=" + productListSettingsModel + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C27185b(Throwable th, ProductListResultModel productListResultModel, ProductListSettingsModel productListSettingsModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(th, (i & 2) != 0 ? null : productListResultModel, (i & 4) != 0 ? null : productListSettingsModel);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$b */
    public interface C27187b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$b$a */
        public static final class C27188a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m114830a(@C12579k C27187b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$b$b */
        public static final class C27189b implements C27187b {
            @C12579k

            /* renamed from: b */
            public static final C27189b f66105b = new C27189b();

            /* renamed from: c */
            public static final int f66106c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27188a.m114830a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$b$c */
        public static final class C27190c implements C27187b {

            /* renamed from: c */
            public static final int f66107c = 0;

            /* renamed from: b */
            public final boolean f66108b;

            public C27190c() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C27190c m114831g(C27190c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f66108b;
                }
                return cVar.mo79051f(z);
            }

            /* renamed from: e */
            public final boolean mo79049e() {
                return this.f66108b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27190c) && this.f66108b == ((C27190c) obj).f66108b;
            }

            @C12579k
            /* renamed from: f */
            public final C27190c mo79051f(boolean z) {
                return new C27190c(z);
            }

            public int hashCode() {
                boolean z = this.f66108b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f66108b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27188a.m114830a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f66108b;
                return "Loading(isLoading=" + z + ")";
            }

            public C27190c(boolean z) {
                this.f66108b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C27190c(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$b$e */
        public static final class C27192e implements C27187b {

            /* renamed from: c */
            public static final int f66113c = 8;
            @C12579k

            /* renamed from: b */
            public final ProductListSettingsModel f66114b;

            public C27192e(@C12579k ProductListSettingsModel productListSettingsModel) {
                Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
                this.f66114b = productListSettingsModel;
            }

            /* renamed from: g */
            public static /* synthetic */ C27192e m114842g(C27192e eVar, ProductListSettingsModel productListSettingsModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    productListSettingsModel = eVar.f66114b;
                }
                return eVar.mo79067f(productListSettingsModel);
            }

            @C12579k
            /* renamed from: e */
            public final ProductListSettingsModel mo79065e() {
                return this.f66114b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27192e) && Intrinsics.areEqual((Object) this.f66114b, (Object) ((C27192e) obj).f66114b);
            }

            @C12579k
            /* renamed from: f */
            public final C27192e mo79067f(@C12579k ProductListSettingsModel productListSettingsModel) {
                Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
                return new C27192e(productListSettingsModel);
            }

            @C12579k
            /* renamed from: h */
            public final ProductListSettingsModel mo79068h() {
                return this.f66114b;
            }

            public int hashCode() {
                return this.f66114b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27188a.m114830a(this);
            }

            @C12579k
            public String toString() {
                ProductListSettingsModel productListSettingsModel = this.f66114b;
                return "Settings(settings=" + productListSettingsModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.mvi.a$b$d */
        public static final class C27191d implements C27187b {

            /* renamed from: e */
            public static final int f66109e = 8;
            @C12579k

            /* renamed from: b */
            public final ProductListResultModel f66110b;
            @C12580l

            /* renamed from: c */
            public final ProductListSettingsModel f66111c;

            /* renamed from: d */
            public final boolean f66112d;

            public C27191d(@C12579k ProductListResultModel productListResultModel, @C12580l ProductListSettingsModel productListSettingsModel, boolean z) {
                Intrinsics.checkNotNullParameter(productListResultModel, "productList");
                this.f66110b = productListResultModel;
                this.f66111c = productListSettingsModel;
                this.f66112d = z;
            }

            /* renamed from: i */
            public static /* synthetic */ C27191d m114834i(C27191d dVar, ProductListResultModel productListResultModel, ProductListSettingsModel productListSettingsModel, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    productListResultModel = dVar.f66110b;
                }
                if ((i & 2) != 0) {
                    productListSettingsModel = dVar.f66111c;
                }
                if ((i & 4) != 0) {
                    z = dVar.f66112d;
                }
                return dVar.mo79059h(productListResultModel, productListSettingsModel, z);
            }

            @C12579k
            /* renamed from: e */
            public final ProductListResultModel mo79055e() {
                return this.f66110b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27191d)) {
                    return false;
                }
                C27191d dVar = (C27191d) obj;
                return Intrinsics.areEqual((Object) this.f66110b, (Object) dVar.f66110b) && Intrinsics.areEqual((Object) this.f66111c, (Object) dVar.f66111c) && this.f66112d == dVar.f66112d;
            }

            @C12580l
            /* renamed from: f */
            public final ProductListSettingsModel mo79057f() {
                return this.f66111c;
            }

            /* renamed from: g */
            public final boolean mo79058g() {
                return this.f66112d;
            }

            @C12579k
            /* renamed from: h */
            public final C27191d mo79059h(@C12579k ProductListResultModel productListResultModel, @C12580l ProductListSettingsModel productListSettingsModel, boolean z) {
                Intrinsics.checkNotNullParameter(productListResultModel, "productList");
                return new C27191d(productListResultModel, productListSettingsModel, z);
            }

            public int hashCode() {
                int hashCode = this.f66110b.hashCode() * 31;
                ProductListSettingsModel productListSettingsModel = this.f66111c;
                int hashCode2 = (hashCode + (productListSettingsModel == null ? 0 : productListSettingsModel.hashCode())) * 31;
                boolean z = this.f66112d;
                if (z) {
                    z = true;
                }
                return hashCode2 + (z ? 1 : 0);
            }

            /* renamed from: j */
            public final boolean mo79061j() {
                return this.f66112d;
            }

            @C12579k
            /* renamed from: k */
            public final ProductListResultModel mo79062k() {
                return this.f66110b;
            }

            @C12580l
            /* renamed from: l */
            public final ProductListSettingsModel mo79063l() {
                return this.f66111c;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27188a.m114830a(this);
            }

            @C12579k
            public String toString() {
                ProductListResultModel productListResultModel = this.f66110b;
                ProductListSettingsModel productListSettingsModel = this.f66111c;
                boolean z = this.f66112d;
                return "ProductList(productList=" + productListResultModel + ", settings=" + productListSettingsModel + ", hasNextPage=" + z + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C27191d(ProductListResultModel productListResultModel, ProductListSettingsModel productListSettingsModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(productListResultModel, productListSettingsModel, (i & 4) != 0 ? false : z);
            }
        }
    }
}
