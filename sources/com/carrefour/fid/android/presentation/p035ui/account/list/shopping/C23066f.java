package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f */
public interface C23066f {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$a */
    public static final class C23067a implements C23066f {

        /* renamed from: d */
        public static final int f58713d = 8;
        @C12579k

        /* renamed from: a */
        public final PlpOffer f58714a;
        @C12579k

        /* renamed from: b */
        public final C38115c f58715b;

        /* renamed from: c */
        public final int f58716c;

        public C23067a(@C12579k PlpOffer plpOffer, @C12579k C38115c cVar, int i) {
            Intrinsics.checkNotNullParameter(plpOffer, C28547h2.f69318f);
            Intrinsics.checkNotNullParameter(cVar, "plpProduct");
            this.f58714a = plpOffer;
            this.f58715b = cVar;
            this.f58716c = i;
        }

        /* renamed from: e */
        public static /* synthetic */ C23067a m103566e(C23067a aVar, PlpOffer plpOffer, C38115c cVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                plpOffer = aVar.f58714a;
            }
            if ((i2 & 2) != 0) {
                cVar = aVar.f58715b;
            }
            if ((i2 & 4) != 0) {
                i = aVar.f58716c;
            }
            return aVar.mo67733d(plpOffer, cVar, i);
        }

        @C12579k
        /* renamed from: a */
        public final PlpOffer mo67730a() {
            return this.f58714a;
        }

        @C12579k
        /* renamed from: b */
        public final C38115c mo67731b() {
            return this.f58715b;
        }

        /* renamed from: c */
        public final int mo67732c() {
            return this.f58716c;
        }

        @C12579k
        /* renamed from: d */
        public final C23067a mo67733d(@C12579k PlpOffer plpOffer, @C12579k C38115c cVar, int i) {
            Intrinsics.checkNotNullParameter(plpOffer, C28547h2.f69318f);
            Intrinsics.checkNotNullParameter(cVar, "plpProduct");
            return new C23067a(plpOffer, cVar, i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23067a)) {
                return false;
            }
            C23067a aVar = (C23067a) obj;
            return Intrinsics.areEqual((Object) this.f58714a, (Object) aVar.f58714a) && Intrinsics.areEqual((Object) this.f58715b, (Object) aVar.f58715b) && this.f58716c == aVar.f58716c;
        }

        @C12579k
        /* renamed from: f */
        public final PlpOffer mo67735f() {
            return this.f58714a;
        }

        @C12579k
        /* renamed from: g */
        public final C38115c mo67736g() {
            return this.f58715b;
        }

        /* renamed from: h */
        public final int mo67737h() {
            return this.f58716c;
        }

        public int hashCode() {
            return (((this.f58714a.hashCode() * 31) + this.f58715b.hashCode()) * 31) + Integer.hashCode(this.f58716c);
        }

        @C12579k
        public String toString() {
            PlpOffer plpOffer = this.f58714a;
            C38115c cVar = this.f58715b;
            int i = this.f58716c;
            return "AddToCart(offer=" + plpOffer + ", plpProduct=" + cVar + ", productPosition=" + i + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$b */
    public static final class C23068b implements C23066f {

        /* renamed from: b */
        public static final int f58717b = 0;
        @C12579k

        /* renamed from: a */
        public final String f58718a;

        public /* synthetic */ C23068b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* renamed from: c */
        public static /* synthetic */ C23068b m103574c(C23068b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f58718a;
            }
            return bVar.mo67741b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo67740a() {
            return this.f58718a;
        }

        @C12579k
        /* renamed from: b */
        public final C23068b mo67741b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            return new C23068b(str, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: d */
        public final String mo67742d() {
            return this.f58718a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23068b) && Gtin.m157311e(this.f58718a, ((C23068b) obj).f58718a);
        }

        public int hashCode() {
            return Gtin.m157312g(this.f58718a);
        }

        @C12579k
        public String toString() {
            String h = Gtin.m157313h(this.f58718a);
            return "OnAntiInflationClick(gtin=" + h + ")";
        }

        public C23068b(String str) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            this.f58718a = str;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$c */
    public static final class C23069c implements C23066f {

        /* renamed from: d */
        public static final int f58719d = 8;
        @C12579k

        /* renamed from: a */
        public final OfferIdentifier f58720a;
        @C12579k

        /* renamed from: b */
        public final C38115c f58721b;

        /* renamed from: c */
        public final int f58722c;

        public C23069c(@C12579k OfferIdentifier offerIdentifier, @C12579k C38115c cVar, int i) {
            Intrinsics.checkNotNullParameter(offerIdentifier, C28547h2.f69318f);
            Intrinsics.checkNotNullParameter(cVar, "plpProduct");
            this.f58720a = offerIdentifier;
            this.f58721b = cVar;
            this.f58722c = i;
        }

        /* renamed from: e */
        public static /* synthetic */ C23069c m103578e(C23069c cVar, OfferIdentifier offerIdentifier, C38115c cVar2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                offerIdentifier = cVar.f58720a;
            }
            if ((i2 & 2) != 0) {
                cVar2 = cVar.f58721b;
            }
            if ((i2 & 4) != 0) {
                i = cVar.f58722c;
            }
            return cVar.mo67749d(offerIdentifier, cVar2, i);
        }

        @C12579k
        /* renamed from: a */
        public final OfferIdentifier mo67746a() {
            return this.f58720a;
        }

        @C12579k
        /* renamed from: b */
        public final C38115c mo67747b() {
            return this.f58721b;
        }

        /* renamed from: c */
        public final int mo67748c() {
            return this.f58722c;
        }

        @C12579k
        /* renamed from: d */
        public final C23069c mo67749d(@C12579k OfferIdentifier offerIdentifier, @C12579k C38115c cVar, int i) {
            Intrinsics.checkNotNullParameter(offerIdentifier, C28547h2.f69318f);
            Intrinsics.checkNotNullParameter(cVar, "plpProduct");
            return new C23069c(offerIdentifier, cVar, i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23069c)) {
                return false;
            }
            C23069c cVar = (C23069c) obj;
            return Intrinsics.areEqual((Object) this.f58720a, (Object) cVar.f58720a) && Intrinsics.areEqual((Object) this.f58721b, (Object) cVar.f58721b) && this.f58722c == cVar.f58722c;
        }

        @C12579k
        /* renamed from: f */
        public final OfferIdentifier mo67751f() {
            return this.f58720a;
        }

        @C12579k
        /* renamed from: g */
        public final C38115c mo67752g() {
            return this.f58721b;
        }

        /* renamed from: h */
        public final int mo67753h() {
            return this.f58722c;
        }

        public int hashCode() {
            return (((this.f58720a.hashCode() * 31) + this.f58721b.hashCode()) * 31) + Integer.hashCode(this.f58722c);
        }

        @C12579k
        public String toString() {
            OfferIdentifier offerIdentifier = this.f58720a;
            C38115c cVar = this.f58721b;
            int i = this.f58722c;
            return "OnCardPressed(offer=" + offerIdentifier + ", plpProduct=" + cVar + ", position=" + i + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$d */
    public static final class C23070d implements C23066f {

        /* renamed from: d */
        public static final int f58723d = 8;
        @C12579k

        /* renamed from: a */
        public final C38115c f58724a;

        /* renamed from: b */
        public final int f58725b;

        /* renamed from: c */
        public final int f58726c;

        public C23070d(@C12579k C38115c cVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(cVar, "plpProduct");
            this.f58724a = cVar;
            this.f58725b = i;
            this.f58726c = i2;
        }

        /* renamed from: e */
        public static /* synthetic */ C23070d m103586e(C23070d dVar, C38115c cVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                cVar = dVar.f58724a;
            }
            if ((i3 & 2) != 0) {
                i = dVar.f58725b;
            }
            if ((i3 & 4) != 0) {
                i2 = dVar.f58726c;
            }
            return dVar.mo67759d(cVar, i, i2);
        }

        @C12579k
        /* renamed from: a */
        public final C38115c mo67756a() {
            return this.f58724a;
        }

        /* renamed from: b */
        public final int mo67757b() {
            return this.f58725b;
        }

        /* renamed from: c */
        public final int mo67758c() {
            return this.f58726c;
        }

        @C12579k
        /* renamed from: d */
        public final C23070d mo67759d(@C12579k C38115c cVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(cVar, "plpProduct");
            return new C23070d(cVar, i, i2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23070d)) {
                return false;
            }
            C23070d dVar = (C23070d) obj;
            return Intrinsics.areEqual((Object) this.f58724a, (Object) dVar.f58724a) && this.f58725b == dVar.f58725b && this.f58726c == dVar.f58726c;
        }

        /* renamed from: f */
        public final int mo67761f() {
            return this.f58726c;
        }

        @C12579k
        /* renamed from: g */
        public final C38115c mo67762g() {
            return this.f58724a;
        }

        /* renamed from: h */
        public final int mo67763h() {
            return this.f58725b;
        }

        public int hashCode() {
            return (((this.f58724a.hashCode() * 31) + Integer.hashCode(this.f58725b)) * 31) + Integer.hashCode(this.f58726c);
        }

        @C12579k
        public String toString() {
            C38115c cVar = this.f58724a;
            int i = this.f58725b;
            int i2 = this.f58726c;
            return "OnDismissBackDrop(plpProduct=" + cVar + ", position=" + i + ", deltaQuantity=" + i2 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$e */
    public static final class C23071e implements C23066f {

        /* renamed from: c */
        public static final int f58727c = 0;
        @C12579k

        /* renamed from: a */
        public final NotificationComponent.Variant f58728a;
        @C12579k

        /* renamed from: b */
        public final String f58729b;

        public C23071e(@C12579k NotificationComponent.Variant variant, @C12579k String str) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(str, "message");
            this.f58728a = variant;
            this.f58729b = str;
        }

        /* renamed from: d */
        public static /* synthetic */ C23071e m103594d(C23071e eVar, NotificationComponent.Variant variant, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                variant = eVar.f58728a;
            }
            if ((i & 2) != 0) {
                str = eVar.f58729b;
            }
            return eVar.mo67768c(variant, str);
        }

        @C12579k
        /* renamed from: a */
        public final NotificationComponent.Variant mo67766a() {
            return this.f58728a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo67767b() {
            return this.f58729b;
        }

        @C12579k
        /* renamed from: c */
        public final C23071e mo67768c(@C12579k NotificationComponent.Variant variant, @C12579k String str) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(str, "message");
            return new C23071e(variant, str);
        }

        @C12579k
        /* renamed from: e */
        public final String mo67769e() {
            return this.f58729b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23071e)) {
                return false;
            }
            C23071e eVar = (C23071e) obj;
            return this.f58728a == eVar.f58728a && Intrinsics.areEqual((Object) this.f58729b, (Object) eVar.f58729b);
        }

        @C12579k
        /* renamed from: f */
        public final NotificationComponent.Variant mo67771f() {
            return this.f58728a;
        }

        public int hashCode() {
            return (this.f58728a.hashCode() * 31) + this.f58729b.hashCode();
        }

        @C12579k
        public String toString() {
            NotificationComponent.Variant variant = this.f58728a;
            String str = this.f58729b;
            return "OnDisplaySnackbar(variant=" + variant + ", message=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$f */
    public static final class C23072f implements C23066f {

        /* renamed from: b */
        public static final int f58730b = 8;
        @C12579k

        /* renamed from: a */
        public final PlpOffer f58731a;

        public C23072f(@C12579k PlpOffer plpOffer) {
            Intrinsics.checkNotNullParameter(plpOffer, C28547h2.f69318f);
            this.f58731a = plpOffer;
        }

        /* renamed from: c */
        public static /* synthetic */ C23072f m103600c(C23072f fVar, PlpOffer plpOffer, int i, Object obj) {
            if ((i & 1) != 0) {
                plpOffer = fVar.f58731a;
            }
            return fVar.mo67775b(plpOffer);
        }

        @C12579k
        /* renamed from: a */
        public final PlpOffer mo67774a() {
            return this.f58731a;
        }

        @C12579k
        /* renamed from: b */
        public final C23072f mo67775b(@C12579k PlpOffer plpOffer) {
            Intrinsics.checkNotNullParameter(plpOffer, C28547h2.f69318f);
            return new C23072f(plpOffer);
        }

        @C12579k
        /* renamed from: d */
        public final PlpOffer mo67776d() {
            return this.f58731a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23072f) && Intrinsics.areEqual((Object) this.f58731a, (Object) ((C23072f) obj).f58731a);
        }

        public int hashCode() {
            return this.f58731a.hashCode();
        }

        @C12579k
        public String toString() {
            PlpOffer plpOffer = this.f58731a;
            return "OnMixingPressed(offer=" + plpOffer + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$g */
    public static final class C23073g implements C23066f {
        @C12579k

        /* renamed from: a */
        public static final C23073g f58732a = new C23073g();

        /* renamed from: b */
        public static final int f58733b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$h */
    public static final class C23074h implements C23066f {

        /* renamed from: d */
        public static final int f58734d = 8;
        @C12579k

        /* renamed from: a */
        public final C38115c f58735a;

        /* renamed from: b */
        public final int f58736b;

        /* renamed from: c */
        public final int f58737c;

        public C23074h(@C12579k C38115c cVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(cVar, "plpProduct");
            this.f58735a = cVar;
            this.f58736b = i;
            this.f58737c = i2;
        }

        /* renamed from: e */
        public static /* synthetic */ C23074h m103604e(C23074h hVar, C38115c cVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                cVar = hVar.f58735a;
            }
            if ((i3 & 2) != 0) {
                i = hVar.f58736b;
            }
            if ((i3 & 4) != 0) {
                i2 = hVar.f58737c;
            }
            return hVar.mo67783d(cVar, i, i2);
        }

        @C12579k
        /* renamed from: a */
        public final C38115c mo67780a() {
            return this.f58735a;
        }

        /* renamed from: b */
        public final int mo67781b() {
            return this.f58736b;
        }

        /* renamed from: c */
        public final int mo67782c() {
            return this.f58737c;
        }

        @C12579k
        /* renamed from: d */
        public final C23074h mo67783d(@C12579k C38115c cVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(cVar, "plpProduct");
            return new C23074h(cVar, i, i2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23074h)) {
                return false;
            }
            C23074h hVar = (C23074h) obj;
            return Intrinsics.areEqual((Object) this.f58735a, (Object) hVar.f58735a) && this.f58736b == hVar.f58736b && this.f58737c == hVar.f58737c;
        }

        /* renamed from: f */
        public final int mo67785f() {
            return this.f58737c;
        }

        @C12579k
        /* renamed from: g */
        public final C38115c mo67786g() {
            return this.f58735a;
        }

        /* renamed from: h */
        public final int mo67787h() {
            return this.f58736b;
        }

        public int hashCode() {
            return (((this.f58735a.hashCode() * 31) + Integer.hashCode(this.f58736b)) * 31) + Integer.hashCode(this.f58737c);
        }

        @C12579k
        public String toString() {
            C38115c cVar = this.f58735a;
            int i = this.f58736b;
            int i2 = this.f58737c;
            return "OnOpenBackDrop(plpProduct=" + cVar + ", position=" + i + ", currentQuantity=" + i2 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$i */
    public static final class C23075i implements C23066f {
        @C12579k

        /* renamed from: a */
        public static final C23075i f58738a = new C23075i();

        /* renamed from: b */
        public static final int f58739b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$j */
    public static final class C23076j implements C23066f {
        @C12579k

        /* renamed from: a */
        public static final C23076j f58740a = new C23076j();

        /* renamed from: b */
        public static final int f58741b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$k */
    public static final class C23077k implements C23066f {
        @C12579k

        /* renamed from: a */
        public static final C23077k f58742a = new C23077k();

        /* renamed from: b */
        public static final int f58743b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.f$l */
    public static final class C23078l implements C23066f {

        /* renamed from: b */
        public static final int f58744b = 8;
        @C12579k

        /* renamed from: a */
        public final C38115c f58745a;

        public C23078l(@C12579k C38115c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "plpProduct");
            this.f58745a = cVar;
        }

        /* renamed from: c */
        public static /* synthetic */ C23078l m103612c(C23078l lVar, C38115c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = lVar.f58745a;
            }
            return lVar.mo67791b(cVar);
        }

        @C12579k
        /* renamed from: a */
        public final C38115c mo67790a() {
            return this.f58745a;
        }

        @C12579k
        /* renamed from: b */
        public final C23078l mo67791b(@C12579k C38115c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "plpProduct");
            return new C23078l(cVar);
        }

        @C12579k
        /* renamed from: d */
        public final C38115c mo67792d() {
            return this.f58745a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23078l) && Intrinsics.areEqual((Object) this.f58745a, (Object) ((C23078l) obj).f58745a);
        }

        public int hashCode() {
            return this.f58745a.hashCode();
        }

        @C12579k
        public String toString() {
            C38115c cVar = this.f58745a;
            return "RemoveFromFavorite(plpProduct=" + cVar + ")";
        }
    }
}
