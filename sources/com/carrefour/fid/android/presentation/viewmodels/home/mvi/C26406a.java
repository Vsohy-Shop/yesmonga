package com.carrefour.fid.android.presentation.viewmodels.home.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.cms.presentation.models.MiniHubBlocksModel;
import com.carrefour.fid.android.cms.presentation.models.SlideFooterCellModel;
import com.carrefour.fid.android.cms.presentation.models.SlideOfferCellModel;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.design.components.widgets.C37396r1;
import com.carrefour.fid.android.domain.models.ArsenalGenericBanner;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.presentation.models.C38456d;
import com.carrefour.fid.android.presentation.models.C38492i;
import com.carrefour.fid.android.presentation.models.LuckyCartBannerModel;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a */
public final class C26406a {
    @C12579k

    /* renamed from: a */
    public static final C26406a f64599a = new C26406a();

    /* renamed from: b */
    public static final int f64600b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a */
    public interface C26407a extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$a */
        public static final class C26408a implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26408a f64601a = new C26408a();

            /* renamed from: b */
            public static final int f64602b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$a0 */
        public static final class C26409a0 implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26409a0 f64603a = new C26409a0();

            /* renamed from: b */
            public static final int f64604b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$b */
        public static final class C26410b implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26410b f64605a = new C26410b();

            /* renamed from: b */
            public static final int f64606b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$b0 */
        public static final class C26411b0 implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26411b0 f64607a = new C26411b0();

            /* renamed from: b */
            public static final int f64608b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$c */
        public static final class C26412c implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26412c f64609a = new C26412c();

            /* renamed from: b */
            public static final int f64610b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$c0 */
        public static final class C26413c0 implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26413c0 f64611a = new C26413c0();

            /* renamed from: b */
            public static final int f64612b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$d */
        public static final class C26414d implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26414d f64613a = new C26414d();

            /* renamed from: b */
            public static final int f64614b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$d0 */
        public static final class C26415d0 implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26415d0 f64615a = new C26415d0();

            /* renamed from: b */
            public static final int f64616b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$e */
        public static final class C26416e implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26416e f64617a = new C26416e();

            /* renamed from: b */
            public static final int f64618b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$e0 */
        public static final class C26417e0 implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26417e0 f64619a = new C26417e0();

            /* renamed from: b */
            public static final int f64620b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$f */
        public static final class C26418f implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26418f f64621a = new C26418f();

            /* renamed from: b */
            public static final int f64622b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$g */
        public static final class C26419g implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26419g f64623a = new C26419g();

            /* renamed from: b */
            public static final int f64624b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$h */
        public static final class C26420h implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26420h f64625a = new C26420h();

            /* renamed from: b */
            public static final int f64626b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$i */
        public static final class C26421i implements C26407a {

            /* renamed from: d */
            public static final int f64627d = 0;
            @C12579k

            /* renamed from: a */
            public final String f64628a;
            @C12579k

            /* renamed from: b */
            public final String f64629b;
            @C12579k

            /* renamed from: c */
            public final String f64630c;

            public C26421i(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                Intrinsics.checkNotNullParameter(str, "id");
                Intrinsics.checkNotNullParameter(str2, "gameUrl");
                Intrinsics.checkNotNullParameter(str3, "webViewTitle");
                this.f64628a = str;
                this.f64629b = str2;
                this.f64630c = str3;
            }

            /* renamed from: e */
            public static /* synthetic */ C26421i m112764e(C26421i iVar, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = iVar.f64628a;
                }
                if ((i & 2) != 0) {
                    str2 = iVar.f64629b;
                }
                if ((i & 4) != 0) {
                    str3 = iVar.f64630c;
                }
                return iVar.mo76871d(str, str2, str3);
            }

            @C12579k
            /* renamed from: a */
            public final String mo76868a() {
                return this.f64628a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo76869b() {
                return this.f64629b;
            }

            @C12579k
            /* renamed from: c */
            public final String mo76870c() {
                return this.f64630c;
            }

            @C12579k
            /* renamed from: d */
            public final C26421i mo76871d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                Intrinsics.checkNotNullParameter(str, "id");
                Intrinsics.checkNotNullParameter(str2, "gameUrl");
                Intrinsics.checkNotNullParameter(str3, "webViewTitle");
                return new C26421i(str, str2, str3);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26421i)) {
                    return false;
                }
                C26421i iVar = (C26421i) obj;
                return Intrinsics.areEqual((Object) this.f64628a, (Object) iVar.f64628a) && Intrinsics.areEqual((Object) this.f64629b, (Object) iVar.f64629b) && Intrinsics.areEqual((Object) this.f64630c, (Object) iVar.f64630c);
            }

            @C12579k
            /* renamed from: f */
            public final String mo76873f() {
                return this.f64629b;
            }

            @C12579k
            /* renamed from: g */
            public final String mo76874g() {
                return this.f64628a;
            }

            @C12579k
            /* renamed from: h */
            public final String mo76875h() {
                return this.f64630c;
            }

            public int hashCode() {
                return (((this.f64628a.hashCode() * 31) + this.f64629b.hashCode()) * 31) + this.f64630c.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f64628a;
                String str2 = this.f64629b;
                String str3 = this.f64630c;
                return "HandleArsenalClick(id=" + str + ", gameUrl=" + str2 + ", webViewTitle=" + str3 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$j */
        public static final class C26422j implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26422j f64631a = new C26422j();

            /* renamed from: b */
            public static final int f64632b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$k */
        public static final class C26423k implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26423k f64633a = new C26423k();

            /* renamed from: b */
            public static final int f64634b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$l */
        public static final class C26424l implements C26407a {

            /* renamed from: b */
            public static final int f64635b = 0;
            @C12579k

            /* renamed from: a */
            public final String f64636a;

            public C26424l(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "contentId");
                this.f64636a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26424l m112772c(C26424l lVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = lVar.f64636a;
                }
                return lVar.mo76879b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo76878a() {
                return this.f64636a;
            }

            @C12579k
            /* renamed from: b */
            public final C26424l mo76879b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "contentId");
                return new C26424l(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo76880d() {
                return this.f64636a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26424l) && Intrinsics.areEqual((Object) this.f64636a, (Object) ((C26424l) obj).f64636a);
            }

            public int hashCode() {
                return this.f64636a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f64636a;
                return "HandleCmsMiniHubBlockClick(contentId=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$m */
        public static final class C26425m implements C26407a {

            /* renamed from: b */
            public static final int f64637b = 0;

            /* renamed from: a */
            public final int f64638a;

            public C26425m(int i) {
                this.f64638a = i;
            }

            /* renamed from: c */
            public static /* synthetic */ C26425m m112776c(C26425m mVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = mVar.f64638a;
                }
                return mVar.mo76885b(i);
            }

            /* renamed from: a */
            public final int mo76884a() {
                return this.f64638a;
            }

            @C12579k
            /* renamed from: b */
            public final C26425m mo76885b(int i) {
                return new C26425m(i);
            }

            /* renamed from: d */
            public final int mo76886d() {
                return this.f64638a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26425m) && this.f64638a == ((C26425m) obj).f64638a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f64638a);
            }

            @C12579k
            public String toString() {
                int i = this.f64638a;
                return "HandleCmsOffersCarouselItemClick(itemIndex=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$n */
        public static final class C26426n implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26426n f64639a = new C26426n();

            /* renamed from: b */
            public static final int f64640b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$o */
        public static final class C26427o implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26427o f64641a = new C26427o();

            /* renamed from: b */
            public static final int f64642b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$p */
        public static final class C26428p implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26428p f64643a = new C26428p();

            /* renamed from: b */
            public static final int f64644b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$q */
        public static final class C26429q implements C26407a {

            /* renamed from: b */
            public static final int f64645b = 0;
            @C12579k

            /* renamed from: a */
            public final String f64646a;

            public C26429q(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "onClickBeacon");
                this.f64646a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26429q m112780c(C26429q qVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = qVar.f64646a;
                }
                return qVar.mo76891b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo76890a() {
                return this.f64646a;
            }

            @C12579k
            /* renamed from: b */
            public final C26429q mo76891b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "onClickBeacon");
                return new C26429q(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo76892d() {
                return this.f64646a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26429q) && Intrinsics.areEqual((Object) this.f64646a, (Object) ((C26429q) obj).f64646a);
            }

            public int hashCode() {
                return this.f64646a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f64646a;
                return "HandleCriteoBannerBeaconClick(onClickBeacon=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$r */
        public static final class C26430r implements C26407a {

            /* renamed from: b */
            public static final int f64647b = 0;
            @C12579k

            /* renamed from: a */
            public final String f64648a;

            public C26430r(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "onViewBeacon");
                this.f64648a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26430r m112784c(C26430r rVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = rVar.f64648a;
                }
                return rVar.mo76897b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo76896a() {
                return this.f64648a;
            }

            @C12579k
            /* renamed from: b */
            public final C26430r mo76897b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "onViewBeacon");
                return new C26430r(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo76898d() {
                return this.f64648a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26430r) && Intrinsics.areEqual((Object) this.f64648a, (Object) ((C26430r) obj).f64648a);
            }

            public int hashCode() {
                return this.f64648a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f64648a;
                return "HandleCriteoBannerDisplay(onViewBeacon=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$s */
        public static final class C26431s implements C26407a {

            /* renamed from: b */
            public static final int f64649b = 0;

            /* renamed from: a */
            public final boolean f64650a;

            public C26431s(boolean z) {
                this.f64650a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26431s m112788c(C26431s sVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = sVar.f64650a;
                }
                return sVar.mo76903b(z);
            }

            /* renamed from: a */
            public final boolean mo76902a() {
                return this.f64650a;
            }

            @C12579k
            /* renamed from: b */
            public final C26431s mo76903b(boolean z) {
                return new C26431s(z);
            }

            /* renamed from: d */
            public final boolean mo76904d() {
                return this.f64650a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26431s) && this.f64650a == ((C26431s) obj).f64650a;
            }

            public int hashCode() {
                boolean z = this.f64650a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f64650a;
                return "HandleFavoriteStoreClick(isFavoriteStoreSet=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$t */
        public static final class C26432t implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26432t f64651a = new C26432t();

            /* renamed from: b */
            public static final int f64652b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$u */
        public static final class C26433u implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26433u f64653a = new C26433u();

            /* renamed from: b */
            public static final int f64654b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$v */
        public static final class C26434v implements C26407a {

            /* renamed from: b */
            public static final int f64655b = 0;
            @C12579k

            /* renamed from: a */
            public final LoyaltyCardType f64656a;

            public C26434v(@C12579k LoyaltyCardType loyaltyCardType) {
                Intrinsics.checkNotNullParameter(loyaltyCardType, "loyaltyCardType");
                this.f64656a = loyaltyCardType;
            }

            /* renamed from: c */
            public static /* synthetic */ C26434v m112792c(C26434v vVar, LoyaltyCardType loyaltyCardType, int i, Object obj) {
                if ((i & 1) != 0) {
                    loyaltyCardType = vVar.f64656a;
                }
                return vVar.mo76909b(loyaltyCardType);
            }

            @C12579k
            /* renamed from: a */
            public final LoyaltyCardType mo76908a() {
                return this.f64656a;
            }

            @C12579k
            /* renamed from: b */
            public final C26434v mo76909b(@C12579k LoyaltyCardType loyaltyCardType) {
                Intrinsics.checkNotNullParameter(loyaltyCardType, "loyaltyCardType");
                return new C26434v(loyaltyCardType);
            }

            @C12579k
            /* renamed from: d */
            public final LoyaltyCardType mo76910d() {
                return this.f64656a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26434v) && this.f64656a == ((C26434v) obj).f64656a;
            }

            public int hashCode() {
                return this.f64656a.hashCode();
            }

            @C12579k
            public String toString() {
                LoyaltyCardType loyaltyCardType = this.f64656a;
                return "HandleLoyaltyCardButtonClick(loyaltyCardType=" + loyaltyCardType + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$w */
        public static final class C26435w implements C26407a {

            /* renamed from: b */
            public static final int f64657b = 0;
            @C12579k

            /* renamed from: a */
            public final LuckyCartBannerModel f64658a;

            public C26435w(@C12579k LuckyCartBannerModel luckyCartBannerModel) {
                Intrinsics.checkNotNullParameter(luckyCartBannerModel, "luckyCartBanner");
                this.f64658a = luckyCartBannerModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26435w m112796c(C26435w wVar, LuckyCartBannerModel luckyCartBannerModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    luckyCartBannerModel = wVar.f64658a;
                }
                return wVar.mo76915b(luckyCartBannerModel);
            }

            @C12579k
            /* renamed from: a */
            public final LuckyCartBannerModel mo76914a() {
                return this.f64658a;
            }

            @C12579k
            /* renamed from: b */
            public final C26435w mo76915b(@C12579k LuckyCartBannerModel luckyCartBannerModel) {
                Intrinsics.checkNotNullParameter(luckyCartBannerModel, "luckyCartBanner");
                return new C26435w(luckyCartBannerModel);
            }

            @C12579k
            /* renamed from: d */
            public final LuckyCartBannerModel mo76916d() {
                return this.f64658a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26435w) && Intrinsics.areEqual((Object) this.f64658a, (Object) ((C26435w) obj).f64658a);
            }

            public int hashCode() {
                return this.f64658a.hashCode();
            }

            @C12579k
            public String toString() {
                LuckyCartBannerModel luckyCartBannerModel = this.f64658a;
                return "HandleLuckyCartProductsBannerClick(luckyCartBanner=" + luckyCartBannerModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$x */
        public static final class C26436x implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26436x f64659a = new C26436x();

            /* renamed from: b */
            public static final int f64660b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$y */
        public static final class C26437y implements C26407a {
            @C12579k

            /* renamed from: a */
            public static final C26437y f64661a = new C26437y();

            /* renamed from: b */
            public static final int f64662b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$a$z */
        public static final class C26438z implements C26407a {

            /* renamed from: c */
            public static final int f64663c = 0;
            @C12579k

            /* renamed from: a */
            public final String f64664a;
            @C12579k

            /* renamed from: b */
            public final String f64665b;

            public C26438z(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "stickersTitle");
                Intrinsics.checkNotNullParameter(str2, "stickersUrl");
                this.f64664a = str;
                this.f64665b = str2;
            }

            /* renamed from: d */
            public static /* synthetic */ C26438z m112800d(C26438z zVar, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = zVar.f64664a;
                }
                if ((i & 2) != 0) {
                    str2 = zVar.f64665b;
                }
                return zVar.mo76922c(str, str2);
            }

            @C12579k
            /* renamed from: a */
            public final String mo76920a() {
                return this.f64664a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo76921b() {
                return this.f64665b;
            }

            @C12579k
            /* renamed from: c */
            public final C26438z mo76922c(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "stickersTitle");
                Intrinsics.checkNotNullParameter(str2, "stickersUrl");
                return new C26438z(str, str2);
            }

            @C12579k
            /* renamed from: e */
            public final String mo76923e() {
                return this.f64664a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26438z)) {
                    return false;
                }
                C26438z zVar = (C26438z) obj;
                return Intrinsics.areEqual((Object) this.f64664a, (Object) zVar.f64664a) && Intrinsics.areEqual((Object) this.f64665b, (Object) zVar.f64665b);
            }

            @C12579k
            /* renamed from: f */
            public final String mo76925f() {
                return this.f64665b;
            }

            public int hashCode() {
                return (this.f64664a.hashCode() * 31) + this.f64665b.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f64664a;
                String str2 = this.f64665b;
                return "HandleMyStickersClick(stickersTitle=" + str + ", stickersUrl=" + str2 + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b */
    public interface C26439b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$a */
        public static final class C26440a implements C26439b {
            @C12579k

            /* renamed from: a */
            public static final C26440a f64666a = new C26440a();

            /* renamed from: b */
            public static final int f64667b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$b */
        public static final class C26441b implements C26439b {

            /* renamed from: b */
            public static final int f64668b = 0;

            /* renamed from: a */
            public final boolean f64669a;

            public C26441b(boolean z) {
                this.f64669a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26441b m112806c(C26441b bVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = bVar.f64669a;
                }
                return bVar.mo76929b(z);
            }

            /* renamed from: a */
            public final boolean mo76928a() {
                return this.f64669a;
            }

            @C12579k
            /* renamed from: b */
            public final C26441b mo76929b(boolean z) {
                return new C26441b(z);
            }

            /* renamed from: d */
            public final boolean mo76930d() {
                return this.f64669a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26441b) && this.f64669a == ((C26441b) obj).f64669a;
            }

            public int hashCode() {
                boolean z = this.f64669a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f64669a;
                return "NavigationToCouponPage(isInStoreOnly=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$c */
        public static final class C26442c implements C26439b {

            /* renamed from: d */
            public static final int f64670d = 0;
            @C12579k

            /* renamed from: a */
            public final String f64671a;
            @C12579k

            /* renamed from: b */
            public final String f64672b;
            @C12579k

            /* renamed from: c */
            public final String f64673c;

            public C26442c(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                Intrinsics.checkNotNullParameter(str, "gameUrl");
                Intrinsics.checkNotNullParameter(str2, "webViewTitle");
                Intrinsics.checkNotNullParameter(str3, "secureTokenValue");
                this.f64671a = str;
                this.f64672b = str2;
                this.f64673c = str3;
            }

            /* renamed from: e */
            public static /* synthetic */ C26442c m112810e(C26442c cVar, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f64671a;
                }
                if ((i & 2) != 0) {
                    str2 = cVar.f64672b;
                }
                if ((i & 4) != 0) {
                    str3 = cVar.f64673c;
                }
                return cVar.mo76937d(str, str2, str3);
            }

            @C12579k
            /* renamed from: a */
            public final String mo76934a() {
                return this.f64671a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo76935b() {
                return this.f64672b;
            }

            @C12579k
            /* renamed from: c */
            public final String mo76936c() {
                return this.f64673c;
            }

            @C12579k
            /* renamed from: d */
            public final C26442c mo76937d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                Intrinsics.checkNotNullParameter(str, "gameUrl");
                Intrinsics.checkNotNullParameter(str2, "webViewTitle");
                Intrinsics.checkNotNullParameter(str3, "secureTokenValue");
                return new C26442c(str, str2, str3);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26442c)) {
                    return false;
                }
                C26442c cVar = (C26442c) obj;
                return Intrinsics.areEqual((Object) this.f64671a, (Object) cVar.f64671a) && Intrinsics.areEqual((Object) this.f64672b, (Object) cVar.f64672b) && Intrinsics.areEqual((Object) this.f64673c, (Object) cVar.f64673c);
            }

            @C12579k
            /* renamed from: f */
            public final String mo76939f() {
                return this.f64671a;
            }

            @C12579k
            /* renamed from: g */
            public final String mo76940g() {
                return this.f64673c;
            }

            @C12579k
            /* renamed from: h */
            public final String mo76941h() {
                return this.f64672b;
            }

            public int hashCode() {
                return (((this.f64671a.hashCode() * 31) + this.f64672b.hashCode()) * 31) + this.f64673c.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f64671a;
                String str2 = this.f64672b;
                String str3 = this.f64673c;
                return "OpenArsenalWebView(gameUrl=" + str + ", webViewTitle=" + str2 + ", secureTokenValue=" + str3 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$d */
        public static final class C26443d implements C26439b {
            @C12579k

            /* renamed from: a */
            public static final C26443d f64674a = new C26443d();

            /* renamed from: b */
            public static final int f64675b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$e */
        public static final class C26444e implements C26439b {

            /* renamed from: b */
            public static final int f64676b = 0;
            @C12579k

            /* renamed from: a */
            public final String f64677a;

            public C26444e(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "url");
                this.f64677a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26444e m112818c(C26444e eVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = eVar.f64677a;
                }
                return eVar.mo76945b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo76944a() {
                return this.f64677a;
            }

            @C12579k
            /* renamed from: b */
            public final C26444e mo76945b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "url");
                return new C26444e(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo76946d() {
                return this.f64677a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26444e) && Intrinsics.areEqual((Object) this.f64677a, (Object) ((C26444e) obj).f64677a);
            }

            public int hashCode() {
                return this.f64677a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f64677a;
                return "OpenWebviewAction(url=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$f */
        public static final class C26445f implements C26439b {
            @C12579k

            /* renamed from: a */
            public static final C26445f f64678a = new C26445f();

            /* renamed from: b */
            public static final int f64679b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$g */
        public static final class C26446g implements C26439b {
            @C12579k

            /* renamed from: a */
            public static final C26446g f64680a = new C26446g();

            /* renamed from: b */
            public static final int f64681b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$h */
        public static final class C26447h implements C26439b {
            @C12579k

            /* renamed from: a */
            public static final C26447h f64682a = new C26447h();

            /* renamed from: b */
            public static final int f64683b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$b$i */
        public static final class C26448i implements C26439b {
            @C12579k

            /* renamed from: a */
            public static final C26448i f64684a = new C26448i();

            /* renamed from: b */
            public static final int f64685b = 0;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c */
    public static final class C26449c implements C28505u.C28509d {

        /* renamed from: r */
        public static final int f64686r = 8;
        @C12579k

        /* renamed from: b */
        public final C26476i f64687b;
        @C12580l

        /* renamed from: c */
        public final StoreServiceType f64688c;

        /* renamed from: d */
        public final boolean f64689d;
        @C12579k

        /* renamed from: e */
        public final C26456c f64690e;
        @C12579k

        /* renamed from: f */
        public final List<SlideFooterCellModel> f64691f;
        @C12579k

        /* renamed from: g */
        public final List<SlideOfferCellModel> f64692g;
        @C12579k

        /* renamed from: h */
        public final List<MiniHubBlocksModel> f64693h;
        @C12579k

        /* renamed from: i */
        public final C26469g f64694i;
        @C12579k

        /* renamed from: j */
        public final C26472h f64695j;
        @C12579k

        /* renamed from: k */
        public final C26460d f64696k;
        @C12579k

        /* renamed from: l */
        public final C26453b f64697l;
        @C12579k

        /* renamed from: m */
        public final C26466f f64698m;
        @C12579k

        /* renamed from: n */
        public final C26463e f64699n;
        @C12579k

        /* renamed from: o */
        public final List<C38456d> f64700o;
        @C12579k

        /* renamed from: p */
        public final List<ProductCategory> f64701p;
        @C12579k

        /* renamed from: q */
        public final List<Product> f64702q;

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$a */
        public interface C26450a {

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$a$a */
            public static final class C26451a implements C26450a {

                /* renamed from: b */
                public static final int f64703b = 8;
                @C12579k

                /* renamed from: a */
                public final List<ArsenalGenericBanner> f64704a;

                public C26451a(@C12579k List<ArsenalGenericBanner> list) {
                    Intrinsics.checkNotNullParameter(list, "banners");
                    this.f64704a = list;
                }

                /* renamed from: c */
                public static /* synthetic */ C26451a m112856c(C26451a aVar, List<ArsenalGenericBanner> list, int i, Object obj) {
                    if ((i & 1) != 0) {
                        list = aVar.f64704a;
                    }
                    return aVar.mo76987b(list);
                }

                @C12579k
                /* renamed from: a */
                public final List<ArsenalGenericBanner> mo76986a() {
                    return this.f64704a;
                }

                @C12579k
                /* renamed from: b */
                public final C26451a mo76987b(@C12579k List<ArsenalGenericBanner> list) {
                    Intrinsics.checkNotNullParameter(list, "banners");
                    return new C26451a(list);
                }

                @C12579k
                /* renamed from: d */
                public final List<ArsenalGenericBanner> mo76988d() {
                    return this.f64704a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C26451a) && Intrinsics.areEqual((Object) this.f64704a, (Object) ((C26451a) obj).f64704a);
                }

                public int hashCode() {
                    return this.f64704a.hashCode();
                }

                @C12579k
                public String toString() {
                    List<ArsenalGenericBanner> list = this.f64704a;
                    return "Available(banners=" + list + ")";
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$a$b */
            public static final class C26452b implements C26450a {
                @C12579k

                /* renamed from: a */
                public static final C26452b f64705a = new C26452b();

                /* renamed from: b */
                public static final int f64706b = 0;
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$b */
        public interface C26453b {

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$b$a */
            public static final class C26454a implements C26453b {
                @C12579k

                /* renamed from: a */
                public static final C26454a f64707a = new C26454a();

                /* renamed from: b */
                public static final int f64708b = 0;
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$b$b */
            public static final class C26455b implements C26453b {
                @C12579k

                /* renamed from: a */
                public static final C26455b f64709a = new C26455b();

                /* renamed from: b */
                public static final int f64710b = 0;
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c */
        public interface C26456c {

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c$a */
            public static final class C26457a implements C26456c {
                @C12579k

                /* renamed from: a */
                public static final C26457a f64711a = new C26457a();

                /* renamed from: b */
                public static final int f64712b = 0;
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c$b */
            public static final class C26458b implements C26456c {
                @C12579k

                /* renamed from: a */
                public static final C26458b f64713a = new C26458b();

                /* renamed from: b */
                public static final int f64714b = 0;
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c$c */
            public static final class C26459c implements C26456c {
                @C12579k

                /* renamed from: a */
                public static final C26459c f64715a = new C26459c();

                /* renamed from: b */
                public static final int f64716b = 0;
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$d */
        public interface C26460d {

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$d$a */
            public static final class C26461a implements C26460d {
                @C12579k

                /* renamed from: a */
                public static final C26461a f64717a = new C26461a();

                /* renamed from: b */
                public static final int f64718b = 0;
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$d$b */
            public static final class C26462b implements C26460d {

                /* renamed from: b */
                public static final int f64719b = C37396r1.f93965d;
                @C12579k

                /* renamed from: a */
                public final C37396r1 f64720a;

                public C26462b(@C12579k C37396r1 r1Var) {
                    Intrinsics.checkNotNullParameter(r1Var, "storeInfo");
                    this.f64720a = r1Var;
                }

                /* renamed from: c */
                public static /* synthetic */ C26462b m112860c(C26462b bVar, C37396r1 r1Var, int i, Object obj) {
                    if ((i & 1) != 0) {
                        r1Var = bVar.f64720a;
                    }
                    return bVar.mo76993b(r1Var);
                }

                @C12579k
                /* renamed from: a */
                public final C37396r1 mo76992a() {
                    return this.f64720a;
                }

                @C12579k
                /* renamed from: b */
                public final C26462b mo76993b(@C12579k C37396r1 r1Var) {
                    Intrinsics.checkNotNullParameter(r1Var, "storeInfo");
                    return new C26462b(r1Var);
                }

                @C12579k
                /* renamed from: d */
                public final C37396r1 mo76994d() {
                    return this.f64720a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C26462b) && Intrinsics.areEqual((Object) this.f64720a, (Object) ((C26462b) obj).f64720a);
                }

                public int hashCode() {
                    return this.f64720a.hashCode();
                }

                @C12579k
                public String toString() {
                    C37396r1 r1Var = this.f64720a;
                    return "FavoritePhysicalStore(storeInfo=" + r1Var + ")";
                }
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$e */
        public interface C26463e {

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$e$a */
            public static final class C26464a implements C26463e {

                /* renamed from: b */
                public static final int f64721b = 0;
                @C12579k

                /* renamed from: a */
                public final String f64722a;

                public C26464a(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "url");
                    this.f64722a = str;
                }

                /* renamed from: c */
                public static /* synthetic */ C26464a m112864c(C26464a aVar, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.f64722a;
                    }
                    return aVar.mo76999b(str);
                }

                @C12579k
                /* renamed from: a */
                public final String mo76998a() {
                    return this.f64722a;
                }

                @C12579k
                /* renamed from: b */
                public final C26464a mo76999b(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "url");
                    return new C26464a(str);
                }

                @C12579k
                /* renamed from: d */
                public final String mo77000d() {
                    return this.f64722a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C26464a) && Intrinsics.areEqual((Object) this.f64722a, (Object) ((C26464a) obj).f64722a);
                }

                public int hashCode() {
                    return this.f64722a.hashCode();
                }

                @C12579k
                public String toString() {
                    String str = this.f64722a;
                    return "Available(url=" + str + ")";
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$e$b */
            public static final class C26465b implements C26463e {
                @C12579k

                /* renamed from: a */
                public static final C26465b f64723a = new C26465b();

                /* renamed from: b */
                public static final int f64724b = 0;
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$f */
        public interface C26466f {

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$f$a */
            public static final class C26467a implements C26466f {

                /* renamed from: b */
                public static final int f64725b = 0;
                @C12579k

                /* renamed from: a */
                public final LuckyCartBannerModel f64726a;

                public C26467a(@C12579k LuckyCartBannerModel luckyCartBannerModel) {
                    Intrinsics.checkNotNullParameter(luckyCartBannerModel, "luckyCartBanner");
                    this.f64726a = luckyCartBannerModel;
                }

                /* renamed from: c */
                public static /* synthetic */ C26467a m112868c(C26467a aVar, LuckyCartBannerModel luckyCartBannerModel, int i, Object obj) {
                    if ((i & 1) != 0) {
                        luckyCartBannerModel = aVar.f64726a;
                    }
                    return aVar.mo77005b(luckyCartBannerModel);
                }

                @C12579k
                /* renamed from: a */
                public final LuckyCartBannerModel mo77004a() {
                    return this.f64726a;
                }

                @C12579k
                /* renamed from: b */
                public final C26467a mo77005b(@C12579k LuckyCartBannerModel luckyCartBannerModel) {
                    Intrinsics.checkNotNullParameter(luckyCartBannerModel, "luckyCartBanner");
                    return new C26467a(luckyCartBannerModel);
                }

                @C12579k
                /* renamed from: d */
                public final LuckyCartBannerModel mo77006d() {
                    return this.f64726a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C26467a) && Intrinsics.areEqual((Object) this.f64726a, (Object) ((C26467a) obj).f64726a);
                }

                public int hashCode() {
                    return this.f64726a.hashCode();
                }

                @C12579k
                public String toString() {
                    LuckyCartBannerModel luckyCartBannerModel = this.f64726a;
                    return "Available(luckyCartBanner=" + luckyCartBannerModel + ")";
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$f$b */
            public static final class C26468b implements C26466f {
                @C12579k

                /* renamed from: a */
                public static final C26468b f64727a = new C26468b();

                /* renamed from: b */
                public static final int f64728b = 0;
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$g */
        public interface C26469g {

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$g$a */
            public static final class C26470a implements C26469g {
                @C12579k

                /* renamed from: a */
                public static final C26470a f64729a = new C26470a();

                /* renamed from: b */
                public static final int f64730b = 0;
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$g$b */
            public static final class C26471b implements C26469g {

                /* renamed from: b */
                public static final int f64731b = 8;
                @C12579k

                /* renamed from: a */
                public final C38492i f64732a;

                public C26471b(@C12579k C38492i iVar) {
                    Intrinsics.checkNotNullParameter(iVar, "homeOrderModel");
                    this.f64732a = iVar;
                }

                /* renamed from: c */
                public static /* synthetic */ C26471b m112872c(C26471b bVar, C38492i iVar, int i, Object obj) {
                    if ((i & 1) != 0) {
                        iVar = bVar.f64732a;
                    }
                    return bVar.mo77011b(iVar);
                }

                @C12579k
                /* renamed from: a */
                public final C38492i mo77010a() {
                    return this.f64732a;
                }

                @C12579k
                /* renamed from: b */
                public final C26471b mo77011b(@C12579k C38492i iVar) {
                    Intrinsics.checkNotNullParameter(iVar, "homeOrderModel");
                    return new C26471b(iVar);
                }

                @C12579k
                /* renamed from: d */
                public final C38492i mo77012d() {
                    return this.f64732a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C26471b) && Intrinsics.areEqual((Object) this.f64732a, (Object) ((C26471b) obj).f64732a);
                }

                public int hashCode() {
                    return this.f64732a.hashCode();
                }

                @C12579k
                public String toString() {
                    C38492i iVar = this.f64732a;
                    return "Order(homeOrderModel=" + iVar + ")";
                }
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$h */
        public interface C26472h {

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$h$a */
            public static final class C26473a implements C26472h {
                @C12579k

                /* renamed from: a */
                public static final C26473a f64733a = new C26473a();

                /* renamed from: b */
                public static final int f64734b = 0;
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$h$b */
            public static final class C26474b implements C26472h {
                @C12579k

                /* renamed from: a */
                public static final C26474b f64735a = new C26474b();

                /* renamed from: b */
                public static final int f64736b = 0;
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$h$c */
            public static final class C26475c implements C26472h {
                @C12579k

                /* renamed from: a */
                public static final C26475c f64737a = new C26475c();

                /* renamed from: b */
                public static final int f64738b = 0;
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$i */
        public interface C26476i {

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$i$a */
            public static final class C26477a implements C26476i {

                /* renamed from: b */
                public static final int f64739b = 0;
                @C12579k

                /* renamed from: a */
                public final String f64740a;

                public C26477a() {
                    this((String) null, 1, (DefaultConstructorMarker) null);
                }

                /* renamed from: c */
                public static /* synthetic */ C26477a m112876c(C26477a aVar, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.f64740a;
                    }
                    return aVar.mo77017b(str);
                }

                @C12579k
                /* renamed from: a */
                public final String mo77016a() {
                    return this.f64740a;
                }

                @C12579k
                /* renamed from: b */
                public final C26477a mo77017b(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "accountName");
                    return new C26477a(str);
                }

                @C12579k
                /* renamed from: d */
                public final String mo77018d() {
                    return this.f64740a;
                }

                public boolean equals(@C12580l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C26477a) && Intrinsics.areEqual((Object) this.f64740a, (Object) ((C26477a) obj).f64740a);
                }

                public int hashCode() {
                    return this.f64740a.hashCode();
                }

                @C12579k
                public String toString() {
                    String str = this.f64740a;
                    return "UserConnected(accountName=" + str + ")";
                }

                public C26477a(@C12579k String str) {
                    Intrinsics.checkNotNullParameter(str, "accountName");
                    this.f64740a = str;
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C26477a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str);
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$i$b */
            public static final class C26478b implements C26476i {
                @C12579k

                /* renamed from: a */
                public static final C26478b f64741a = new C26478b();

                /* renamed from: b */
                public static final int f64742b = 0;
            }
        }

        public C26449c() {
            this((C26476i) null, (StoreServiceType) null, false, (C26456c) null, (List) null, (List) null, (List) null, (C26469g) null, (C26472h) null, (C26460d) null, (C26453b) null, (C26466f) null, (C26463e) null, (List) null, (List) null, (List) null, 65535, (DefaultConstructorMarker) null);
        }

        /* renamed from: v */
        public static /* synthetic */ C26449c m112822v(C26449c cVar, C26476i iVar, StoreServiceType storeServiceType, boolean z, C26456c cVar2, List list, List list2, List list3, C26469g gVar, C26472h hVar, C26460d dVar, C26453b bVar, C26466f fVar, C26463e eVar, List list4, List list5, List list6, int i, Object obj) {
            C26449c cVar3 = cVar;
            int i2 = i;
            return cVar.mo76981u((i2 & 1) != 0 ? cVar3.f64687b : iVar, (i2 & 2) != 0 ? cVar3.f64688c : storeServiceType, (i2 & 4) != 0 ? cVar3.f64689d : z, (i2 & 8) != 0 ? cVar3.f64690e : cVar2, (i2 & 16) != 0 ? cVar3.f64691f : list, (i2 & 32) != 0 ? cVar3.f64692g : list2, (i2 & 64) != 0 ? cVar3.f64693h : list3, (i2 & 128) != 0 ? cVar3.f64694i : gVar, (i2 & 256) != 0 ? cVar3.f64695j : hVar, (i2 & 512) != 0 ? cVar3.f64696k : dVar, (i2 & 1024) != 0 ? cVar3.f64697l : bVar, (i2 & 2048) != 0 ? cVar3.f64698m : fVar, (i2 & 4096) != 0 ? cVar3.f64699n : eVar, (i2 & 8192) != 0 ? cVar3.f64700o : list4, (i2 & 16384) != 0 ? cVar3.f64701p : list5, (i2 & 32768) != 0 ? cVar3.f64702q : list6);
        }

        @C12579k
        /* renamed from: A */
        public final List<MiniHubBlocksModel> mo76950A() {
            return this.f64693h;
        }

        @C12579k
        /* renamed from: B */
        public final List<C38456d> mo76951B() {
            return this.f64700o;
        }

        @C12579k
        /* renamed from: C */
        public final List<ProductCategory> mo76952C() {
            return this.f64701p;
        }

        @C12579k
        /* renamed from: D */
        public final C26460d mo76953D() {
            return this.f64696k;
        }

        @C12579k
        /* renamed from: E */
        public final List<Product> mo76954E() {
            return this.f64702q;
        }

        /* renamed from: F */
        public final boolean mo76955F() {
            return this.f64689d;
        }

        @C12579k
        /* renamed from: G */
        public final C26463e mo76956G() {
            return this.f64699n;
        }

        @C12579k
        /* renamed from: H */
        public final C26466f mo76957H() {
            return this.f64698m;
        }

        @C12579k
        /* renamed from: I */
        public final C26469g mo76958I() {
            return this.f64694i;
        }

        @C12579k
        /* renamed from: J */
        public final C26472h mo76959J() {
            return this.f64695j;
        }

        @C12580l
        /* renamed from: K */
        public final StoreServiceType mo76960K() {
            return this.f64688c;
        }

        @C12579k
        /* renamed from: L */
        public final C26476i mo76961L() {
            return this.f64687b;
        }

        @C12579k
        /* renamed from: e */
        public final C26476i mo76962e() {
            return this.f64687b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26449c)) {
                return false;
            }
            C26449c cVar = (C26449c) obj;
            return Intrinsics.areEqual((Object) this.f64687b, (Object) cVar.f64687b) && Intrinsics.areEqual((Object) this.f64688c, (Object) cVar.f64688c) && this.f64689d == cVar.f64689d && Intrinsics.areEqual((Object) this.f64690e, (Object) cVar.f64690e) && Intrinsics.areEqual((Object) this.f64691f, (Object) cVar.f64691f) && Intrinsics.areEqual((Object) this.f64692g, (Object) cVar.f64692g) && Intrinsics.areEqual((Object) this.f64693h, (Object) cVar.f64693h) && Intrinsics.areEqual((Object) this.f64694i, (Object) cVar.f64694i) && Intrinsics.areEqual((Object) this.f64695j, (Object) cVar.f64695j) && Intrinsics.areEqual((Object) this.f64696k, (Object) cVar.f64696k) && Intrinsics.areEqual((Object) this.f64697l, (Object) cVar.f64697l) && Intrinsics.areEqual((Object) this.f64698m, (Object) cVar.f64698m) && Intrinsics.areEqual((Object) this.f64699n, (Object) cVar.f64699n) && Intrinsics.areEqual((Object) this.f64700o, (Object) cVar.f64700o) && Intrinsics.areEqual((Object) this.f64701p, (Object) cVar.f64701p) && Intrinsics.areEqual((Object) this.f64702q, (Object) cVar.f64702q);
        }

        @C12579k
        /* renamed from: f */
        public final C26460d mo76964f() {
            return this.f64696k;
        }

        @C12579k
        /* renamed from: g */
        public final C26453b mo76965g() {
            return this.f64697l;
        }

        @C12579k
        /* renamed from: h */
        public final C26466f mo76966h() {
            return this.f64698m;
        }

        public int hashCode() {
            int hashCode = this.f64687b.hashCode() * 31;
            StoreServiceType storeServiceType = this.f64688c;
            int hashCode2 = (hashCode + (storeServiceType == null ? 0 : storeServiceType.hashCode())) * 31;
            boolean z = this.f64689d;
            if (z) {
                z = true;
            }
            return ((((((((((((((((((((((((((hashCode2 + (z ? 1 : 0)) * 31) + this.f64690e.hashCode()) * 31) + this.f64691f.hashCode()) * 31) + this.f64692g.hashCode()) * 31) + this.f64693h.hashCode()) * 31) + this.f64694i.hashCode()) * 31) + this.f64695j.hashCode()) * 31) + this.f64696k.hashCode()) * 31) + this.f64697l.hashCode()) * 31) + this.f64698m.hashCode()) * 31) + this.f64699n.hashCode()) * 31) + this.f64700o.hashCode()) * 31) + this.f64701p.hashCode()) * 31) + this.f64702q.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final C26463e mo76968i() {
            return this.f64699n;
        }

        @C12579k
        /* renamed from: j */
        public final List<C38456d> mo76969j() {
            return this.f64700o;
        }

        @C12579k
        /* renamed from: k */
        public final List<ProductCategory> mo76970k() {
            return this.f64701p;
        }

        @C12579k
        /* renamed from: l */
        public final List<Product> mo76971l() {
            return this.f64702q;
        }

        @C12580l
        /* renamed from: m */
        public final StoreServiceType mo76972m() {
            return this.f64688c;
        }

        /* renamed from: n */
        public final boolean mo76973n() {
            return this.f64689d;
        }

        @C12579k
        /* renamed from: o */
        public final C26456c mo76974o() {
            return this.f64690e;
        }

        @C12579k
        /* renamed from: p */
        public final List<SlideFooterCellModel> mo76975p() {
            return this.f64691f;
        }

        @C12579k
        /* renamed from: q */
        public final List<SlideOfferCellModel> mo76976q() {
            return this.f64692g;
        }

        @C12579k
        /* renamed from: r */
        public final List<MiniHubBlocksModel> mo76977r() {
            return this.f64693h;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        /* renamed from: s */
        public final C26469g mo76978s() {
            return this.f64694i;
        }

        @C12579k
        /* renamed from: t */
        public final C26472h mo76979t() {
            return this.f64695j;
        }

        @C12579k
        public String toString() {
            C26476i iVar = this.f64687b;
            StoreServiceType storeServiceType = this.f64688c;
            boolean z = this.f64689d;
            C26456c cVar = this.f64690e;
            List<SlideFooterCellModel> list = this.f64691f;
            List<SlideOfferCellModel> list2 = this.f64692g;
            List<MiniHubBlocksModel> list3 = this.f64693h;
            C26469g gVar = this.f64694i;
            C26472h hVar = this.f64695j;
            C26460d dVar = this.f64696k;
            C26453b bVar = this.f64697l;
            C26466f fVar = this.f64698m;
            C26463e eVar = this.f64699n;
            List<C38456d> list4 = this.f64700o;
            List<ProductCategory> list5 = this.f64701p;
            List<Product> list6 = this.f64702q;
            return "UiState(userStatus=" + iVar + ", storeServiceType=" + storeServiceType + ", hasNotification=" + z + ", basketState=" + cVar + ", cmsCarouselList=" + list + ", cmsCarouselOfferList=" + list2 + ", cmsMiniHubBlocksList=" + list3 + ", orderState=" + gVar + ", servicesState=" + hVar + ", favoritePhysicalStoreState=" + dVar + ", basketBuilderState=" + bVar + ", luckyCartProductsBannerState=" + fVar + ", luckyCartGameBannerState=" + eVar + ", criteoBannerList=" + list4 + ", departments=" + list5 + ", frequentPurchases=" + list6 + ")";
        }

        @C12579k
        /* renamed from: u */
        public final C26449c mo76981u(@C12579k C26476i iVar, @C12580l StoreServiceType storeServiceType, boolean z, @C12579k C26456c cVar, @C12579k List<SlideFooterCellModel> list, @C12579k List<SlideOfferCellModel> list2, @C12579k List<MiniHubBlocksModel> list3, @C12579k C26469g gVar, @C12579k C26472h hVar, @C12579k C26460d dVar, @C12579k C26453b bVar, @C12579k C26466f fVar, @C12579k C26463e eVar, @C12579k List<C38456d> list4, @C12579k List<ProductCategory> list5, @C12579k List<Product> list6) {
            C26476i iVar2 = iVar;
            Intrinsics.checkNotNullParameter(iVar2, "userStatus");
            Intrinsics.checkNotNullParameter(cVar, "basketState");
            Intrinsics.checkNotNullParameter(list, "cmsCarouselList");
            Intrinsics.checkNotNullParameter(list2, "cmsCarouselOfferList");
            Intrinsics.checkNotNullParameter(list3, "cmsMiniHubBlocksList");
            Intrinsics.checkNotNullParameter(gVar, "orderState");
            Intrinsics.checkNotNullParameter(hVar, "servicesState");
            Intrinsics.checkNotNullParameter(dVar, "favoritePhysicalStoreState");
            Intrinsics.checkNotNullParameter(bVar, "basketBuilderState");
            Intrinsics.checkNotNullParameter(fVar, "luckyCartProductsBannerState");
            Intrinsics.checkNotNullParameter(eVar, "luckyCartGameBannerState");
            Intrinsics.checkNotNullParameter(list4, "criteoBannerList");
            Intrinsics.checkNotNullParameter(list5, "departments");
            Intrinsics.checkNotNullParameter(list6, "frequentPurchases");
            return new C26449c(iVar2, storeServiceType, z, cVar, list, list2, list3, gVar, hVar, dVar, bVar, fVar, eVar, list4, list5, list6);
        }

        @C12579k
        /* renamed from: w */
        public final C26453b mo76982w() {
            return this.f64697l;
        }

        @C12579k
        /* renamed from: x */
        public final C26456c mo76983x() {
            return this.f64690e;
        }

        @C12579k
        /* renamed from: y */
        public final List<SlideFooterCellModel> mo76984y() {
            return this.f64691f;
        }

        @C12579k
        /* renamed from: z */
        public final List<SlideOfferCellModel> mo76985z() {
            return this.f64692g;
        }

        public C26449c(@C12579k C26476i iVar, @C12580l StoreServiceType storeServiceType, boolean z, @C12579k C26456c cVar, @C12579k List<SlideFooterCellModel> list, @C12579k List<SlideOfferCellModel> list2, @C12579k List<MiniHubBlocksModel> list3, @C12579k C26469g gVar, @C12579k C26472h hVar, @C12579k C26460d dVar, @C12579k C26453b bVar, @C12579k C26466f fVar, @C12579k C26463e eVar, @C12579k List<C38456d> list4, @C12579k List<ProductCategory> list5, @C12579k List<Product> list6) {
            C26476i iVar2 = iVar;
            C26456c cVar2 = cVar;
            List<SlideFooterCellModel> list7 = list;
            List<SlideOfferCellModel> list8 = list2;
            List<MiniHubBlocksModel> list9 = list3;
            C26469g gVar2 = gVar;
            C26472h hVar2 = hVar;
            C26460d dVar2 = dVar;
            C26453b bVar2 = bVar;
            C26466f fVar2 = fVar;
            C26463e eVar2 = eVar;
            List<C38456d> list10 = list4;
            List<ProductCategory> list11 = list5;
            List<Product> list12 = list6;
            Intrinsics.checkNotNullParameter(iVar2, "userStatus");
            Intrinsics.checkNotNullParameter(cVar2, "basketState");
            Intrinsics.checkNotNullParameter(list7, "cmsCarouselList");
            Intrinsics.checkNotNullParameter(list8, "cmsCarouselOfferList");
            Intrinsics.checkNotNullParameter(list9, "cmsMiniHubBlocksList");
            Intrinsics.checkNotNullParameter(gVar2, "orderState");
            Intrinsics.checkNotNullParameter(hVar2, "servicesState");
            Intrinsics.checkNotNullParameter(dVar2, "favoritePhysicalStoreState");
            Intrinsics.checkNotNullParameter(bVar2, "basketBuilderState");
            Intrinsics.checkNotNullParameter(fVar2, "luckyCartProductsBannerState");
            Intrinsics.checkNotNullParameter(eVar2, "luckyCartGameBannerState");
            Intrinsics.checkNotNullParameter(list10, "criteoBannerList");
            Intrinsics.checkNotNullParameter(list11, "departments");
            Intrinsics.checkNotNullParameter(list12, "frequentPurchases");
            this.f64687b = iVar2;
            this.f64688c = storeServiceType;
            this.f64689d = z;
            this.f64690e = cVar2;
            this.f64691f = list7;
            this.f64692g = list8;
            this.f64693h = list9;
            this.f64694i = gVar2;
            this.f64695j = hVar2;
            this.f64696k = dVar2;
            this.f64697l = bVar2;
            this.f64698m = fVar2;
            this.f64699n = eVar2;
            this.f64700o = list10;
            this.f64701p = list11;
            this.f64702q = list12;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C26449c(com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26476i r18, com.carrefour.fid.android.domain.models.service.models.StoreServiceType r19, boolean r20, com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26456c r21, java.util.List r22, java.util.List r23, java.util.List r24, com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26469g r25, com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26472h r26, com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26460d r27, com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26453b r28, com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26466f r29, com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26463e r30, java.util.List r31, java.util.List r32, java.util.List r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
            /*
                r17 = this;
                r0 = r34
                r1 = r0 & 1
                if (r1 == 0) goto L_0x0009
                com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$i$b r1 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26476i.C26478b.f64741a
                goto L_0x000b
            L_0x0009:
                r1 = r18
            L_0x000b:
                r2 = r0 & 2
                if (r2 == 0) goto L_0x0011
                r2 = 0
                goto L_0x0013
            L_0x0011:
                r2 = r19
            L_0x0013:
                r3 = r0 & 4
                if (r3 == 0) goto L_0x0019
                r3 = 0
                goto L_0x001b
            L_0x0019:
                r3 = r20
            L_0x001b:
                r4 = r0 & 8
                if (r4 == 0) goto L_0x0022
                com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c$a r4 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26456c.C26457a.f64711a
                goto L_0x0024
            L_0x0022:
                r4 = r21
            L_0x0024:
                r5 = r0 & 16
                if (r5 == 0) goto L_0x002d
                java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                goto L_0x002f
            L_0x002d:
                r5 = r22
            L_0x002f:
                r6 = r0 & 32
                if (r6 == 0) goto L_0x0038
                java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                goto L_0x003a
            L_0x0038:
                r6 = r23
            L_0x003a:
                r7 = r0 & 64
                if (r7 == 0) goto L_0x0043
                java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                goto L_0x0045
            L_0x0043:
                r7 = r24
            L_0x0045:
                r8 = r0 & 128(0x80, float:1.794E-43)
                if (r8 == 0) goto L_0x004c
                com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$g$a r8 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26469g.C26470a.f64729a
                goto L_0x004e
            L_0x004c:
                r8 = r25
            L_0x004e:
                r9 = r0 & 256(0x100, float:3.59E-43)
                if (r9 == 0) goto L_0x0055
                com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$h$b r9 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26472h.C26474b.f64735a
                goto L_0x0057
            L_0x0055:
                r9 = r26
            L_0x0057:
                r10 = r0 & 512(0x200, float:7.175E-43)
                if (r10 == 0) goto L_0x005e
                com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$d$a r10 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26460d.C26461a.f64717a
                goto L_0x0060
            L_0x005e:
                r10 = r27
            L_0x0060:
                r11 = r0 & 1024(0x400, float:1.435E-42)
                if (r11 == 0) goto L_0x0067
                com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$b$b r11 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26453b.C26455b.f64709a
                goto L_0x0069
            L_0x0067:
                r11 = r28
            L_0x0069:
                r12 = r0 & 2048(0x800, float:2.87E-42)
                if (r12 == 0) goto L_0x0070
                com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$f$b r12 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26466f.C26468b.f64727a
                goto L_0x0072
            L_0x0070:
                r12 = r29
            L_0x0072:
                r13 = r0 & 4096(0x1000, float:5.74E-42)
                if (r13 == 0) goto L_0x0079
                com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$e$b r13 = com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.C26463e.C26465b.f64723a
                goto L_0x007b
            L_0x0079:
                r13 = r30
            L_0x007b:
                r14 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r14 == 0) goto L_0x0084
                java.util.List r14 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                goto L_0x0086
            L_0x0084:
                r14 = r31
            L_0x0086:
                r15 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r15 == 0) goto L_0x008f
                java.util.List r15 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                goto L_0x0091
            L_0x008f:
                r15 = r32
            L_0x0091:
                r16 = 32768(0x8000, float:4.5918E-41)
                r0 = r0 & r16
                if (r0 == 0) goto L_0x009d
                java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                goto L_0x009f
            L_0x009d:
                r0 = r33
            L_0x009f:
                r18 = r17
                r19 = r1
                r20 = r2
                r21 = r3
                r22 = r4
                r23 = r5
                r24 = r6
                r25 = r7
                r26 = r8
                r27 = r9
                r28 = r10
                r29 = r11
                r30 = r12
                r31 = r13
                r32 = r14
                r33 = r15
                r34 = r0
                r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a.C26449c.<init>(com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$i, com.carrefour.fid.android.domain.models.service.models.StoreServiceType, boolean, com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$c, java.util.List, java.util.List, java.util.List, com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$g, com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$h, com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$d, com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$b, com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$f, com.carrefour.fid.android.presentation.viewmodels.home.mvi.a$c$e, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
