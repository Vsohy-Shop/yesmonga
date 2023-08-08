package com.carrefour.fid.android.product.presentation.viewmodel.details.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductReference;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.presentation.models.ProductImagesModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b */
public final class C28135b {

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a */
    public interface C28136a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$a */
        public static final class C28137a implements C28136a {

            /* renamed from: b */
            public static final int f68138b = 8;
            @C12580l

            /* renamed from: a */
            public final Throwable f68139a;

            public C28137a(@C12580l Throwable th) {
                this.f68139a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C28137a m117780c(C28137a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f68139a;
                }
                return aVar.mo81763b(th);
            }

            @C12580l
            /* renamed from: a */
            public final Throwable mo81762a() {
                return this.f68139a;
            }

            @C12579k
            /* renamed from: b */
            public final C28137a mo81763b(@C12580l Throwable th) {
                return new C28137a(th);
            }

            @C12580l
            /* renamed from: d */
            public final Throwable mo81764d() {
                return this.f68139a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28137a) && Intrinsics.areEqual((Object) this.f68139a, (Object) ((C28137a) obj).f68139a);
            }

            public int hashCode() {
                Throwable th = this.f68139a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f68139a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$b */
        public static final class C28138b implements C28136a {

            /* renamed from: b */
            public static final int f68140b = 8;
            @C12579k

            /* renamed from: a */
            public final ProductImagesModel f68141a;

            public C28138b(@C12579k ProductImagesModel productImagesModel) {
                Intrinsics.checkNotNullParameter(productImagesModel, "productImagesModel");
                this.f68141a = productImagesModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C28138b m117784c(C28138b bVar, ProductImagesModel productImagesModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    productImagesModel = bVar.f68141a;
                }
                return bVar.mo81769b(productImagesModel);
            }

            @C12579k
            /* renamed from: a */
            public final ProductImagesModel mo81768a() {
                return this.f68141a;
            }

            @C12579k
            /* renamed from: b */
            public final C28138b mo81769b(@C12579k ProductImagesModel productImagesModel) {
                Intrinsics.checkNotNullParameter(productImagesModel, "productImagesModel");
                return new C28138b(productImagesModel);
            }

            @C12579k
            /* renamed from: d */
            public final ProductImagesModel mo81770d() {
                return this.f68141a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28138b) && Intrinsics.areEqual((Object) this.f68141a, (Object) ((C28138b) obj).f68141a);
            }

            public int hashCode() {
                return this.f68141a.hashCode();
            }

            @C12579k
            public String toString() {
                ProductImagesModel productImagesModel = this.f68141a;
                return "NavigateToImageProduct(productImagesModel=" + productImagesModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$a$c */
        public static final class C28139c implements C28136a {

            /* renamed from: c */
            public static final int f68142c = 8;
            @C12579k

            /* renamed from: a */
            public final List<Gtin> f68143a;
            @C12579k

            /* renamed from: b */
            public final String f68144b;

            public C28139c(@C12579k List<Gtin> list, @C12579k String str) {
                Intrinsics.checkNotNullParameter(list, "gtins");
                Intrinsics.checkNotNullParameter(str, "title");
                this.f68143a = list;
                this.f68144b = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C28139c m117788d(C28139c cVar, List<Gtin> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = cVar.f68143a;
                }
                if ((i & 2) != 0) {
                    str = cVar.f68144b;
                }
                return cVar.mo81776c(list, str);
            }

            @C12579k
            /* renamed from: a */
            public final List<Gtin> mo81774a() {
                return this.f68143a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo81775b() {
                return this.f68144b;
            }

            @C12579k
            /* renamed from: c */
            public final C28139c mo81776c(@C12579k List<Gtin> list, @C12579k String str) {
                Intrinsics.checkNotNullParameter(list, "gtins");
                Intrinsics.checkNotNullParameter(str, "title");
                return new C28139c(list, str);
            }

            @C12579k
            /* renamed from: e */
            public final List<Gtin> mo81777e() {
                return this.f68143a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28139c)) {
                    return false;
                }
                C28139c cVar = (C28139c) obj;
                return Intrinsics.areEqual((Object) this.f68143a, (Object) cVar.f68143a) && Intrinsics.areEqual((Object) this.f68144b, (Object) cVar.f68144b);
            }

            @C12579k
            /* renamed from: f */
            public final String mo81779f() {
                return this.f68144b;
            }

            public int hashCode() {
                return (this.f68143a.hashCode() * 31) + this.f68144b.hashCode();
            }

            @C12579k
            public String toString() {
                List<Gtin> list = this.f68143a;
                String str = this.f68144b;
                return "ShowMoreMixingProduct(gtins=" + list + ", title=" + str + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b */
    public interface C28140b extends C28505u.C28509d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$a */
        public static final class C28141a implements C28140b {

            /* renamed from: d */
            public static final int f68145d = 8;
            @C12579k

            /* renamed from: b */
            public final List<C38114b> f68146b;
            @C12580l

            /* renamed from: c */
            public final String f68147c;

            public C28141a(@C12579k List<C38114b> list, @C12580l String str) {
                Intrinsics.checkNotNullParameter(list, "criteoProducts");
                this.f68146b = list;
                this.f68147c = str;
            }

            /* renamed from: h */
            public static /* synthetic */ C28141a m117794h(C28141a aVar, List<C38114b> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = aVar.f68146b;
                }
                if ((i & 2) != 0) {
                    str = aVar.f68147c;
                }
                return aVar.mo81785g(list, str);
            }

            @C12579k
            /* renamed from: e */
            public final List<C38114b> mo81782e() {
                return this.f68146b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28141a)) {
                    return false;
                }
                C28141a aVar = (C28141a) obj;
                return Intrinsics.areEqual((Object) this.f68146b, (Object) aVar.f68146b) && Intrinsics.areEqual((Object) this.f68147c, (Object) aVar.f68147c);
            }

            @C12580l
            /* renamed from: f */
            public final String mo81784f() {
                return this.f68147c;
            }

            @C12579k
            /* renamed from: g */
            public final C28141a mo81785g(@C12579k List<C38114b> list, @C12580l String str) {
                Intrinsics.checkNotNullParameter(list, "criteoProducts");
                return new C28141a(list, str);
            }

            public int hashCode() {
                int hashCode = this.f68146b.hashCode() * 31;
                String str = this.f68147c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @C12580l
            /* renamed from: i */
            public final String mo81787i() {
                return this.f68147c;
            }

            @C12579k
            /* renamed from: j */
            public final List<C38114b> mo81788j() {
                return this.f68146b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28142b.m117800a(this);
            }

            @C12579k
            public String toString() {
                List<C38114b> list = this.f68146b;
                String str = this.f68147c;
                return "CriteoProducts(criteoProducts=" + list + ", criteoBasketChangeUrl=" + str + ")";
            }
        }

        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$b */
        public static final class C28142b {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m117800a(@C12579k C28140b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$c */
        public static final class C28143c implements C28140b {
            @C12579k

            /* renamed from: b */
            public static final C28143c f68148b = new C28143c();

            /* renamed from: c */
            public static final int f68149c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28142b.m117800a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$d */
        public static final class C28144d implements C28140b {

            /* renamed from: d */
            public static final int f68150d = 8;
            @C12579k

            /* renamed from: b */
            public final List<C38115c> f68151b;

            /* renamed from: c */
            public final boolean f68152c;

            public C28144d(@C12579k List<C38115c> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "mixingProducts");
                this.f68151b = list;
                this.f68152c = z;
            }

            /* renamed from: h */
            public static /* synthetic */ C28144d m117801h(C28144d dVar, List<C38115c> list, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = dVar.f68151b;
                }
                if ((i & 2) != 0) {
                    z = dVar.f68152c;
                }
                return dVar.mo81793g(list, z);
            }

            @C12579k
            /* renamed from: e */
            public final List<C38115c> mo81790e() {
                return this.f68151b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28144d)) {
                    return false;
                }
                C28144d dVar = (C28144d) obj;
                return Intrinsics.areEqual((Object) this.f68151b, (Object) dVar.f68151b) && this.f68152c == dVar.f68152c;
            }

            /* renamed from: f */
            public final boolean mo81792f() {
                return this.f68152c;
            }

            @C12579k
            /* renamed from: g */
            public final C28144d mo81793g(@C12579k List<C38115c> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, "mixingProducts");
                return new C28144d(list, z);
            }

            public int hashCode() {
                int hashCode = this.f68151b.hashCode() * 31;
                boolean z = this.f68152c;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            /* renamed from: i */
            public final List<C38115c> mo81795i() {
                return this.f68151b;
            }

            /* renamed from: j */
            public final boolean mo81796j() {
                return this.f68152c;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28142b.m117800a(this);
            }

            @C12579k
            public String toString() {
                List<C38115c> list = this.f68151b;
                boolean z = this.f68152c;
                return "MixingProducts(mixingProducts=" + list + ", isSyncingInBasket=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$e */
        public static final class C28145e implements C28140b {

            /* renamed from: c */
            public static final int f68153c = 8;
            @C12579k

            /* renamed from: b */
            public final Offer f68154b;

            public C28145e(@C12579k Offer offer) {
                Intrinsics.checkNotNullParameter(offer, "offerProductDetails");
                this.f68154b = offer;
            }

            /* renamed from: g */
            public static /* synthetic */ C28145e m117807g(C28145e eVar, Offer offer, int i, Object obj) {
                if ((i & 1) != 0) {
                    offer = eVar.f68154b;
                }
                return eVar.mo81800f(offer);
            }

            @C12579k
            /* renamed from: e */
            public final Offer mo81798e() {
                return this.f68154b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28145e) && Intrinsics.areEqual((Object) this.f68154b, (Object) ((C28145e) obj).f68154b);
            }

            @C12579k
            /* renamed from: f */
            public final C28145e mo81800f(@C12579k Offer offer) {
                Intrinsics.checkNotNullParameter(offer, "offerProductDetails");
                return new C28145e(offer);
            }

            @C12579k
            /* renamed from: h */
            public final Offer mo81801h() {
                return this.f68154b;
            }

            public int hashCode() {
                return this.f68154b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28142b.m117800a(this);
            }

            @C12579k
            public String toString() {
                Offer offer = this.f68154b;
                return "OfferProductDetails(offerProductDetails=" + offer + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$f */
        public static abstract class C28146f implements C28140b {

            /* renamed from: b */
            public static final int f68155b = 0;

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$f$a */
            public static final class C28147a extends C28146f {
                @C12579k

                /* renamed from: c */
                public static final C28147a f68156c = new C28147a();

                /* renamed from: d */
                public static final int f68157d = 0;

                public C28147a() {
                    super((DefaultConstructorMarker) null);
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$f$b */
            public static final class C28148b extends C28146f {
                @C12579k

                /* renamed from: c */
                public static final C28148b f68158c = new C28148b();

                /* renamed from: d */
                public static final int f68159d = 0;

                public C28148b() {
                    super((DefaultConstructorMarker) null);
                }
            }

            @C8567o(parameters = 0)
            /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$f$c */
            public static final class C28149c extends C28146f {
                @C12579k

                /* renamed from: c */
                public static final C28149c f68160c = new C28149c();

                /* renamed from: d */
                public static final int f68161d = 0;

                public C28149c() {
                    super((DefaultConstructorMarker) null);
                }
            }

            public /* synthetic */ C28146f(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28142b.m117800a(this);
            }

            public C28146f() {
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$b$g */
        public static final class C28150g implements C28140b {

            /* renamed from: c */
            public static final int f68162c = 8;
            @C12579k

            /* renamed from: b */
            public final Offer f68163b;

            public C28150g(@C12579k Offer offer) {
                Intrinsics.checkNotNullParameter(offer, "offerProductDetails");
                this.f68163b = offer;
            }

            /* renamed from: g */
            public static /* synthetic */ C28150g m117811g(C28150g gVar, Offer offer, int i, Object obj) {
                if ((i & 1) != 0) {
                    offer = gVar.f68163b;
                }
                return gVar.mo81806f(offer);
            }

            @C12579k
            /* renamed from: e */
            public final Offer mo81804e() {
                return this.f68163b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28150g) && Intrinsics.areEqual((Object) this.f68163b, (Object) ((C28150g) obj).f68163b);
            }

            @C12579k
            /* renamed from: f */
            public final C28150g mo81806f(@C12579k Offer offer) {
                Intrinsics.checkNotNullParameter(offer, "offerProductDetails");
                return new C28150g(offer);
            }

            @C12579k
            /* renamed from: h */
            public final Offer mo81807h() {
                return this.f68163b;
            }

            public int hashCode() {
                return this.f68163b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C28142b.m117800a(this);
            }

            @C12579k
            public String toString() {
                Offer offer = this.f68163b;
                return "UpdateOfferProductDetails(offerProductDetails=" + offer + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$c */
    public interface C28151c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$c$a */
        public static final class C28152a implements C28151c {

            /* renamed from: h */
            public static final int f68164h = 0;
            @C12579k

            /* renamed from: a */
            public final String f68165a;
            @C12579k

            /* renamed from: b */
            public final String f68166b;

            /* renamed from: c */
            public final int f68167c;

            /* renamed from: d */
            public final int f68168d;

            /* renamed from: e */
            public final double f68169e;

            /* renamed from: f */
            public final boolean f68170f;

            /* renamed from: g */
            public final boolean f68171g;

            public /* synthetic */ C28152a(String str, String str2, int i, int i2, double d, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, i, i2, d, z, z2);
            }

            /* renamed from: i */
            public static /* synthetic */ C28152a m117815i(C28152a aVar, String str, String str2, int i, int i2, double d, boolean z, boolean z2, int i3, Object obj) {
                C28152a aVar2 = aVar;
                return aVar.mo81818h((i3 & 1) != 0 ? aVar2.f68165a : str, (i3 & 2) != 0 ? aVar2.f68166b : str2, (i3 & 4) != 0 ? aVar2.f68167c : i, (i3 & 8) != 0 ? aVar2.f68168d : i2, (i3 & 16) != 0 ? aVar2.f68169e : d, (i3 & 32) != 0 ? aVar2.f68170f : z, (i3 & 64) != 0 ? aVar2.f68171g : z2);
            }

            @C12579k
            /* renamed from: a */
            public final String mo81810a() {
                return this.f68165a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo81811b() {
                return this.f68166b;
            }

            /* renamed from: c */
            public final int mo81812c() {
                return this.f68167c;
            }

            /* renamed from: d */
            public final int mo81813d() {
                return this.f68168d;
            }

            /* renamed from: e */
            public final double mo81814e() {
                return this.f68169e;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28152a)) {
                    return false;
                }
                C28152a aVar = (C28152a) obj;
                return Gtin.m157311e(this.f68165a, aVar.f68165a) && ProductReference.m157469e(this.f68166b, aVar.f68166b) && this.f68167c == aVar.f68167c && this.f68168d == aVar.f68168d && Double.compare(this.f68169e, aVar.f68169e) == 0 && this.f68170f == aVar.f68170f && this.f68171g == aVar.f68171g;
            }

            /* renamed from: f */
            public final boolean mo81816f() {
                return this.f68170f;
            }

            /* renamed from: g */
            public final boolean mo81817g() {
                return this.f68171g;
            }

            @C12579k
            /* renamed from: h */
            public final C28152a mo81818h(@C12579k String str, @C12579k String str2, int i, int i2, double d, boolean z, boolean z2) {
                Intrinsics.checkNotNullParameter(str, "gtin");
                Intrinsics.checkNotNullParameter(str2, "ref");
                return new C28152a(str, str2, i, i2, d, z, z2, (DefaultConstructorMarker) null);
            }

            public int hashCode() {
                int g = ((((((((Gtin.m157312g(this.f68165a) * 31) + ProductReference.m157470g(this.f68166b)) * 31) + Integer.hashCode(this.f68167c)) * 31) + Integer.hashCode(this.f68168d)) * 31) + Double.hashCode(this.f68169e)) * 31;
                boolean z = this.f68170f;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (g + (z ? 1 : 0)) * 31;
                boolean z3 = this.f68171g;
                if (!z3) {
                    z2 = z3;
                }
                return i + (z2 ? 1 : 0);
            }

            /* renamed from: j */
            public final double mo81820j() {
                return this.f68169e;
            }

            @C12579k
            /* renamed from: k */
            public final String mo81821k() {
                return this.f68165a;
            }

            /* renamed from: l */
            public final int mo81822l() {
                return this.f68168d;
            }

            /* renamed from: m */
            public final int mo81823m() {
                return this.f68167c;
            }

            @C12579k
            /* renamed from: n */
            public final String mo81824n() {
                return this.f68166b;
            }

            /* renamed from: o */
            public final boolean mo81825o() {
                return this.f68171g;
            }

            /* renamed from: p */
            public final boolean mo81826p() {
                return this.f68170f;
            }

            @C12579k
            public String toString() {
                String h = Gtin.m157313h(this.f68165a);
                String h2 = ProductReference.m157471h(this.f68166b);
                int i = this.f68167c;
                int i2 = this.f68168d;
                double d = this.f68169e;
                boolean z = this.f68170f;
                boolean z2 = this.f68171g;
                return "AddToBasket(gtin=" + h + ", ref=" + h2 + ", oldQuantity=" + i + ", newQuantity=" + i2 + ", displayablePrice=" + d + ", isMaxQuantityReached=" + z + ", isCriteoProduct=" + z2 + ")";
            }

            public C28152a(String str, String str2, int i, int i2, double d, boolean z, boolean z2) {
                Intrinsics.checkNotNullParameter(str, "gtin");
                Intrinsics.checkNotNullParameter(str2, "ref");
                this.f68165a = str;
                this.f68166b = str2;
                this.f68167c = i;
                this.f68168d = i2;
                this.f68169e = d;
                this.f68170f = z;
                this.f68171g = z2;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C28152a(String str, String str2, int i, int i2, double d, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, i, i2, d, z, (i3 & 64) != 0 ? false : z2, (DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$c$c */
        public static final class C28154c implements C28151c {

            /* renamed from: b */
            public static final int f68176b = 8;
            @C12579k

            /* renamed from: a */
            public final Offer f68177a;

            public C28154c(@C12579k Offer offer) {
                Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
                this.f68177a = offer;
            }

            /* renamed from: c */
            public static /* synthetic */ C28154c m117839c(C28154c cVar, Offer offer, int i, Object obj) {
                if ((i & 1) != 0) {
                    offer = cVar.f68177a;
                }
                return cVar.mo81839b(offer);
            }

            @C12579k
            /* renamed from: a */
            public final Offer mo81838a() {
                return this.f68177a;
            }

            @C12579k
            /* renamed from: b */
            public final C28154c mo81839b(@C12579k Offer offer) {
                Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
                return new C28154c(offer);
            }

            @C12579k
            /* renamed from: d */
            public final Offer mo81840d() {
                return this.f68177a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28154c) && Intrinsics.areEqual((Object) this.f68177a, (Object) ((C28154c) obj).f68177a);
            }

            public int hashCode() {
                return this.f68177a.hashCode();
            }

            @C12579k
            public String toString() {
                Offer offer = this.f68177a;
                return "GetCriteoProducts(offer=" + offer + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$c$d */
        public static final class C28155d implements C28151c {

            /* renamed from: c */
            public static final int f68178c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferIdentifier f68179a;

            /* renamed from: b */
            public final boolean f68180b;

            public C28155d(@C12579k OfferIdentifier offerIdentifier, boolean z) {
                Intrinsics.checkNotNullParameter(offerIdentifier, "id");
                this.f68179a = offerIdentifier;
                this.f68180b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C28155d m117843d(C28155d dVar, OfferIdentifier offerIdentifier, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerIdentifier = dVar.f68179a;
                }
                if ((i & 2) != 0) {
                    z = dVar.f68180b;
                }
                return dVar.mo81846c(offerIdentifier, z);
            }

            @C12579k
            /* renamed from: a */
            public final OfferIdentifier mo81844a() {
                return this.f68179a;
            }

            /* renamed from: b */
            public final boolean mo81845b() {
                return this.f68180b;
            }

            @C12579k
            /* renamed from: c */
            public final C28155d mo81846c(@C12579k OfferIdentifier offerIdentifier, boolean z) {
                Intrinsics.checkNotNullParameter(offerIdentifier, "id");
                return new C28155d(offerIdentifier, z);
            }

            @C12579k
            /* renamed from: e */
            public final OfferIdentifier mo81847e() {
                return this.f68179a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28155d)) {
                    return false;
                }
                C28155d dVar = (C28155d) obj;
                return Intrinsics.areEqual((Object) this.f68179a, (Object) dVar.f68179a) && this.f68180b == dVar.f68180b;
            }

            /* renamed from: f */
            public final boolean mo81849f() {
                return this.f68180b;
            }

            public int hashCode() {
                int hashCode = this.f68179a.hashCode() * 31;
                boolean z = this.f68180b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                OfferIdentifier offerIdentifier = this.f68179a;
                boolean z = this.f68180b;
                return "GetProductOffer(id=" + offerIdentifier + ", shouldUpdateOffer=" + z + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C28155d(OfferIdentifier offerIdentifier, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(offerIdentifier, (i & 2) != 0 ? false : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$c$e */
        public static final class C28156e implements C28151c {
            @C12579k

            /* renamed from: a */
            public static final C28156e f68181a = new C28156e();

            /* renamed from: b */
            public static final int f68182b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$c$f */
        public static final class C28157f implements C28151c {

            /* renamed from: b */
            public static final int f68183b = 0;

            /* renamed from: a */
            public final int f68184a;

            public C28157f(int i) {
                this.f68184a = i;
            }

            /* renamed from: c */
            public static /* synthetic */ C28157f m117849c(C28157f fVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = fVar.f68184a;
                }
                return fVar.mo81853b(i);
            }

            /* renamed from: a */
            public final int mo81852a() {
                return this.f68184a;
            }

            @C12579k
            /* renamed from: b */
            public final C28157f mo81853b(int i) {
                return new C28157f(i);
            }

            /* renamed from: d */
            public final int mo81854d() {
                return this.f68184a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28157f) && this.f68184a == ((C28157f) obj).f68184a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f68184a);
            }

            @C12579k
            public String toString() {
                int i = this.f68184a;
                return "NavigateToProductImage(imagePosition=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$c$g */
        public static final class C28158g implements C28151c {

            /* renamed from: g */
            public static final int f68185g = 0;
            @C12579k

            /* renamed from: a */
            public final String f68186a;
            @C12579k

            /* renamed from: b */
            public final String f68187b;

            /* renamed from: c */
            public final int f68188c;

            /* renamed from: d */
            public final int f68189d;

            /* renamed from: e */
            public final double f68190e;

            /* renamed from: f */
            public final boolean f68191f;

            public /* synthetic */ C28158g(String str, String str2, int i, int i2, double d, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, i, i2, d, z);
            }

            /* renamed from: h */
            public static /* synthetic */ C28158g m117853h(C28158g gVar, String str, String str2, int i, int i2, double d, boolean z, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = gVar.f68186a;
                }
                if ((i3 & 2) != 0) {
                    str2 = gVar.f68187b;
                }
                String str3 = str2;
                if ((i3 & 4) != 0) {
                    i = gVar.f68188c;
                }
                int i4 = i;
                if ((i3 & 8) != 0) {
                    i2 = gVar.f68189d;
                }
                int i5 = i2;
                if ((i3 & 16) != 0) {
                    d = gVar.f68190e;
                }
                double d2 = d;
                if ((i3 & 32) != 0) {
                    z = gVar.f68191f;
                }
                return gVar.mo81865g(str, str3, i4, i5, d2, z);
            }

            @C12579k
            /* renamed from: a */
            public final String mo81858a() {
                return this.f68186a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo81859b() {
                return this.f68187b;
            }

            /* renamed from: c */
            public final int mo81860c() {
                return this.f68188c;
            }

            /* renamed from: d */
            public final int mo81861d() {
                return this.f68189d;
            }

            /* renamed from: e */
            public final double mo81862e() {
                return this.f68190e;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28158g)) {
                    return false;
                }
                C28158g gVar = (C28158g) obj;
                return Gtin.m157311e(this.f68186a, gVar.f68186a) && ProductReference.m157469e(this.f68187b, gVar.f68187b) && this.f68188c == gVar.f68188c && this.f68189d == gVar.f68189d && Double.compare(this.f68190e, gVar.f68190e) == 0 && this.f68191f == gVar.f68191f;
            }

            /* renamed from: f */
            public final boolean mo81864f() {
                return this.f68191f;
            }

            @C12579k
            /* renamed from: g */
            public final C28158g mo81865g(@C12579k String str, @C12579k String str2, int i, int i2, double d, boolean z) {
                Intrinsics.checkNotNullParameter(str, "gtin");
                Intrinsics.checkNotNullParameter(str2, "ref");
                return new C28158g(str, str2, i, i2, d, z, (DefaultConstructorMarker) null);
            }

            public int hashCode() {
                int g = ((((((((Gtin.m157312g(this.f68186a) * 31) + ProductReference.m157470g(this.f68187b)) * 31) + Integer.hashCode(this.f68188c)) * 31) + Integer.hashCode(this.f68189d)) * 31) + Double.hashCode(this.f68190e)) * 31;
                boolean z = this.f68191f;
                if (z) {
                    z = true;
                }
                return g + (z ? 1 : 0);
            }

            /* renamed from: i */
            public final double mo81867i() {
                return this.f68190e;
            }

            @C12579k
            /* renamed from: j */
            public final String mo81868j() {
                return this.f68186a;
            }

            /* renamed from: k */
            public final int mo81869k() {
                return this.f68189d;
            }

            /* renamed from: l */
            public final int mo81870l() {
                return this.f68188c;
            }

            @C12579k
            /* renamed from: m */
            public final String mo81871m() {
                return this.f68187b;
            }

            /* renamed from: n */
            public final boolean mo81872n() {
                return this.f68191f;
            }

            @C12579k
            public String toString() {
                String h = Gtin.m157313h(this.f68186a);
                String h2 = ProductReference.m157471h(this.f68187b);
                int i = this.f68188c;
                int i2 = this.f68189d;
                double d = this.f68190e;
                boolean z = this.f68191f;
                return "RemoveFromBasket(gtin=" + h + ", ref=" + h2 + ", oldQuantity=" + i + ", newQuantity=" + i2 + ", displayablePrice=" + d + ", isCriteoProduct=" + z + ")";
            }

            public C28158g(String str, String str2, int i, int i2, double d, boolean z) {
                Intrinsics.checkNotNullParameter(str, "gtin");
                Intrinsics.checkNotNullParameter(str2, "ref");
                this.f68186a = str;
                this.f68187b = str2;
                this.f68188c = i;
                this.f68189d = i2;
                this.f68190e = d;
                this.f68191f = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C28158g(String str, String str2, int i, int i2, double d, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, i, i2, d, (i3 & 32) != 0 ? false : z, (DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$c$h */
        public static final class C28159h implements C28151c {

            /* renamed from: b */
            public static final int f68192b = 0;
            @C12580l

            /* renamed from: a */
            public final String f68193a;

            public C28159h(@C12580l String str) {
                this.f68193a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C28159h m117867c(C28159h hVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = hVar.f68193a;
                }
                return hVar.mo81875b(str);
            }

            @C12580l
            /* renamed from: a */
            public final String mo81874a() {
                return this.f68193a;
            }

            @C12579k
            /* renamed from: b */
            public final C28159h mo81875b(@C12580l String str) {
                return new C28159h(str);
            }

            @C12580l
            /* renamed from: d */
            public final String mo81876d() {
                return this.f68193a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28159h) && Intrinsics.areEqual((Object) this.f68193a, (Object) ((C28159h) obj).f68193a);
            }

            public int hashCode() {
                String str = this.f68193a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f68193a;
                return "SendCriteoProductClick(trackingUrl=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.b$c$b */
        public static final class C28153b implements C28151c {

            /* renamed from: d */
            public static final int f68172d = 8;

            /* renamed from: a */
            public final boolean f68173a;
            @C12579k

            /* renamed from: b */
            public final C38032c f68174b;

            /* renamed from: c */
            public final boolean f68175c;

            public C28153b(boolean z, @C12579k C38032c cVar, boolean z2) {
                Intrinsics.checkNotNullParameter(cVar, "shoppingListParam");
                this.f68173a = z;
                this.f68174b = cVar;
                this.f68175c = z2;
            }

            /* renamed from: e */
            public static /* synthetic */ C28153b m117831e(C28153b bVar, boolean z, C38032c cVar, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = bVar.f68173a;
                }
                if ((i & 2) != 0) {
                    cVar = bVar.f68174b;
                }
                if ((i & 4) != 0) {
                    z2 = bVar.f68175c;
                }
                return bVar.mo81831d(z, cVar, z2);
            }

            /* renamed from: a */
            public final boolean mo81828a() {
                return this.f68173a;
            }

            @C12579k
            /* renamed from: b */
            public final C38032c mo81829b() {
                return this.f68174b;
            }

            /* renamed from: c */
            public final boolean mo81830c() {
                return this.f68175c;
            }

            @C12579k
            /* renamed from: d */
            public final C28153b mo81831d(boolean z, @C12579k C38032c cVar, boolean z2) {
                Intrinsics.checkNotNullParameter(cVar, "shoppingListParam");
                return new C28153b(z, cVar, z2);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28153b)) {
                    return false;
                }
                C28153b bVar = (C28153b) obj;
                return this.f68173a == bVar.f68173a && Intrinsics.areEqual((Object) this.f68174b, (Object) bVar.f68174b) && this.f68175c == bVar.f68175c;
            }

            @C12579k
            /* renamed from: f */
            public final C38032c mo81833f() {
                return this.f68174b;
            }

            /* renamed from: g */
            public final boolean mo81834g() {
                return this.f68175c;
            }

            /* renamed from: h */
            public final boolean mo81835h() {
                return this.f68173a;
            }

            public int hashCode() {
                boolean z = this.f68173a;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int hashCode = (((z ? 1 : 0) * true) + this.f68174b.hashCode()) * 31;
                boolean z3 = this.f68175c;
                if (!z3) {
                    z2 = z3;
                }
                return hashCode + (z2 ? 1 : 0);
            }

            @C12579k
            public String toString() {
                boolean z = this.f68173a;
                C38032c cVar = this.f68174b;
                boolean z2 = this.f68175c;
                return "EditShoppingList(isInShoppingList=" + z + ", shoppingListParam=" + cVar + ", isCriteoProduct=" + z2 + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C28153b(boolean z, C38032c cVar, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, cVar, (i & 4) != 0 ? false : z2);
            }
        }
    }
}
