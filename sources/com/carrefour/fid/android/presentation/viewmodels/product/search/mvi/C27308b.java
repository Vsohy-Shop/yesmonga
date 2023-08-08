package com.carrefour.fid.android.presentation.viewmodels.product.search.mvi;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.BasketBuilderType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.RecommendedProductsByDepartmentModel;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b */
public final class C27308b {
    @C12579k

    /* renamed from: a */
    public static final C27308b f66328a = new C27308b();

    /* renamed from: b */
    public static final int f66329b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$a */
    public interface C27309a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$a$a */
        public static final class C27310a implements C27309a {
            @C12579k

            /* renamed from: a */
            public static final C27310a f66330a = new C27310a();

            /* renamed from: b */
            public static final int f66331b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$b */
    public interface C27311b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$b$a */
        public static final class C27312a implements C27311b {

            /* renamed from: b */
            public static final int f66332b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f66333a;

            public C27312a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f66333a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C27312a m115201c(C27312a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f66333a;
                }
                return aVar.mo79448b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo79447a() {
                return this.f66333a;
            }

            @C12579k
            /* renamed from: b */
            public final C27312a mo79448b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C27312a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo79449d() {
                return this.f66333a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27312a) && Intrinsics.areEqual((Object) this.f66333a, (Object) ((C27312a) obj).f66333a);
            }

            public int hashCode() {
                return this.f66333a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f66333a;
                return "ErrorEvent(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$b$b */
        public static final class C27313b implements C27311b {

            /* renamed from: c */
            public static final int f66334c = 8;
            @C12579k

            /* renamed from: a */
            public final OfferProductModel f66335a;

            /* renamed from: b */
            public final boolean f66336b;

            public C27313b(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66335a = offerProductModel;
                this.f66336b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C27313b m115205d(C27313b bVar, OfferProductModel offerProductModel, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = bVar.f66335a;
                }
                if ((i & 2) != 0) {
                    z = bVar.f66336b;
                }
                return bVar.mo79455c(offerProductModel, z);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79453a() {
                return this.f66335a;
            }

            /* renamed from: b */
            public final boolean mo79454b() {
                return this.f66336b;
            }

            @C12579k
            /* renamed from: c */
            public final C27313b mo79455c(@C12579k OfferProductModel offerProductModel, boolean z) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27313b(offerProductModel, z);
            }

            /* renamed from: e */
            public final boolean mo79456e() {
                return this.f66336b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27313b)) {
                    return false;
                }
                C27313b bVar = (C27313b) obj;
                return Intrinsics.areEqual((Object) this.f66335a, (Object) bVar.f66335a) && this.f66336b == bVar.f66336b;
            }

            @C12579k
            /* renamed from: f */
            public final OfferProductModel mo79458f() {
                return this.f66335a;
            }

            public int hashCode() {
                int hashCode = this.f66335a.hashCode() * 31;
                boolean z = this.f66336b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66335a;
                boolean z = this.f66336b;
                return "NavigateToPdp(offerProductModel=" + offerProductModel + ", navigateToNonFoodPdp=" + z + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$c */
    public static final class C27314c implements C28505u.C28509d {

        /* renamed from: h */
        public static final int f66337h = 8;

        /* renamed from: b */
        public final boolean f66338b;
        @C12580l

        /* renamed from: c */
        public final BasketBuilderType f66339c;
        @C12580l

        /* renamed from: d */
        public final List<RecommendedProductsByDepartmentModel> f66340d;
        @C12580l

        /* renamed from: e */
        public final List<String> f66341e;

        /* renamed from: f */
        public final boolean f66342f;
        @C12580l

        /* renamed from: g */
        public final Throwable f66343g;

        public C27314c() {
            this(false, (BasketBuilderType) null, (List) null, (List) null, false, (Throwable) null, 63, (DefaultConstructorMarker) null);
        }

        /* renamed from: l */
        public static /* synthetic */ C27314c m115211l(C27314c cVar, boolean z, BasketBuilderType basketBuilderType, List<RecommendedProductsByDepartmentModel> list, List<String> list2, boolean z2, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f66338b;
            }
            if ((i & 2) != 0) {
                basketBuilderType = cVar.f66339c;
            }
            BasketBuilderType basketBuilderType2 = basketBuilderType;
            if ((i & 4) != 0) {
                list = cVar.f66340d;
            }
            List<RecommendedProductsByDepartmentModel> list3 = list;
            if ((i & 8) != 0) {
                list2 = cVar.f66341e;
            }
            List<String> list4 = list2;
            if ((i & 16) != 0) {
                z2 = cVar.f66342f;
            }
            boolean z3 = z2;
            if ((i & 32) != 0) {
                th = cVar.f66343g;
            }
            return cVar.mo79470k(z, basketBuilderType2, list3, list4, z3, th);
        }

        /* renamed from: e */
        public final boolean mo79461e() {
            return this.f66338b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27314c)) {
                return false;
            }
            C27314c cVar = (C27314c) obj;
            return this.f66338b == cVar.f66338b && this.f66339c == cVar.f66339c && Intrinsics.areEqual((Object) this.f66340d, (Object) cVar.f66340d) && Intrinsics.areEqual((Object) this.f66341e, (Object) cVar.f66341e) && this.f66342f == cVar.f66342f && Intrinsics.areEqual((Object) this.f66343g, (Object) cVar.f66343g);
        }

        @C12580l
        /* renamed from: f */
        public final BasketBuilderType mo79463f() {
            return this.f66339c;
        }

        @C12580l
        /* renamed from: g */
        public final List<RecommendedProductsByDepartmentModel> mo79464g() {
            return this.f66340d;
        }

        @C12580l
        /* renamed from: h */
        public final List<String> mo79465h() {
            return this.f66341e;
        }

        public int hashCode() {
            boolean z = this.f66338b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            BasketBuilderType basketBuilderType = this.f66339c;
            int i2 = 0;
            int hashCode = (i + (basketBuilderType == null ? 0 : basketBuilderType.hashCode())) * 31;
            List<RecommendedProductsByDepartmentModel> list = this.f66340d;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.f66341e;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            boolean z3 = this.f66342f;
            if (!z3) {
                z2 = z3;
            }
            int i3 = (hashCode3 + (z2 ? 1 : 0)) * 31;
            Throwable th = this.f66343g;
            if (th != null) {
                i2 = th.hashCode();
            }
            return i3 + i2;
        }

        /* renamed from: i */
        public final boolean mo79467i() {
            return this.f66342f;
        }

        public final boolean isLoading() {
            return this.f66338b;
        }

        @C12580l
        /* renamed from: j */
        public final Throwable mo79469j() {
            return this.f66343g;
        }

        @C12579k
        /* renamed from: k */
        public final C27314c mo79470k(boolean z, @C12580l BasketBuilderType basketBuilderType, @C12580l List<RecommendedProductsByDepartmentModel> list, @C12580l List<String> list2, boolean z2, @C12580l Throwable th) {
            return new C27314c(z, basketBuilderType, list, list2, z2, th);
        }

        @C12580l
        /* renamed from: m */
        public final BasketBuilderType mo79471m() {
            return this.f66339c;
        }

        @C12580l
        /* renamed from: n */
        public final List<RecommendedProductsByDepartmentModel> mo79472n() {
            return this.f66340d;
        }

        @C12580l
        /* renamed from: o */
        public final Throwable mo79473o() {
            return this.f66343g;
        }

        @C12580l
        /* renamed from: p */
        public final List<String> mo79474p() {
            return this.f66341e;
        }

        /* renamed from: q */
        public final boolean mo79475q() {
            return this.f66342f;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f66338b;
            BasketBuilderType basketBuilderType = this.f66339c;
            List<RecommendedProductsByDepartmentModel> list = this.f66340d;
            List<String> list2 = this.f66341e;
            boolean z2 = this.f66342f;
            Throwable th = this.f66343g;
            return "UiState(isLoading=" + z + ", basketBuilderType=" + basketBuilderType + ", departmentList=" + list + ", keywordsWithNoResult=" + list2 + ", updateDepartmentList=" + z2 + ", errorPage=" + th + ")";
        }

        public C27314c(boolean z, @C12580l BasketBuilderType basketBuilderType, @C12580l List<RecommendedProductsByDepartmentModel> list, @C12580l List<String> list2, boolean z2, @C12580l Throwable th) {
            this.f66338b = z;
            this.f66339c = basketBuilderType;
            this.f66340d = list;
            this.f66341e = list2;
            this.f66342f = z2;
            this.f66343g = th;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C27314c(boolean r6, com.carrefour.fid.android.presentation.models.BasketBuilderType r7, java.util.List r8, java.util.List r9, boolean r10, java.lang.Throwable r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r5 = this;
                r13 = r12 & 1
                r0 = 0
                if (r13 == 0) goto L_0x0007
                r13 = r0
                goto L_0x0008
            L_0x0007:
                r13 = r6
            L_0x0008:
                r6 = r12 & 2
                r1 = 0
                if (r6 == 0) goto L_0x000f
                r2 = r1
                goto L_0x0010
            L_0x000f:
                r2 = r7
            L_0x0010:
                r6 = r12 & 4
                if (r6 == 0) goto L_0x0016
                r3 = r1
                goto L_0x0017
            L_0x0016:
                r3 = r8
            L_0x0017:
                r6 = r12 & 8
                if (r6 == 0) goto L_0x001d
                r4 = r1
                goto L_0x001e
            L_0x001d:
                r4 = r9
            L_0x001e:
                r6 = r12 & 16
                if (r6 == 0) goto L_0x0023
                goto L_0x0024
            L_0x0023:
                r0 = r10
            L_0x0024:
                r6 = r12 & 32
                if (r6 == 0) goto L_0x002a
                r12 = r1
                goto L_0x002b
            L_0x002a:
                r12 = r11
            L_0x002b:
                r6 = r5
                r7 = r13
                r8 = r2
                r9 = r3
                r10 = r4
                r11 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.C27308b.C27314c.<init>(boolean, com.carrefour.fid.android.presentation.models.BasketBuilderType, java.util.List, java.util.List, boolean, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$d */
    public static abstract class C27315d implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f66344a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$d$a */
        public static final class C27316a extends C27315d {

            /* renamed from: c */
            public static final int f66345c = 8;
            @C12579k

            /* renamed from: b */
            public final OfferProductModel f66346b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27316a(@C12579k OfferProductModel offerProductModel) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66346b = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27316a m115224c(C27316a aVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = aVar.f66346b;
                }
                return aVar.mo79478b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79477a() {
                return this.f66346b;
            }

            @C12579k
            /* renamed from: b */
            public final C27316a mo79478b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27316a(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79479d() {
                return this.f66346b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27316a) && Intrinsics.areEqual((Object) this.f66346b, (Object) ((C27316a) obj).f66346b);
            }

            public int hashCode() {
                return this.f66346b.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66346b;
                return "AddProductToBasket(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$d$b */
        public static final class C27317b extends C27315d {

            /* renamed from: c */
            public static final int f66347c = 8;
            @C12579k

            /* renamed from: b */
            public final OfferProductModel f66348b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27317b(@C12579k OfferProductModel offerProductModel) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66348b = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27317b m115228c(C27317b bVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = bVar.f66348b;
                }
                return bVar.mo79484b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79483a() {
                return this.f66348b;
            }

            @C12579k
            /* renamed from: b */
            public final C27317b mo79484b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27317b(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79485d() {
                return this.f66348b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27317b) && Intrinsics.areEqual((Object) this.f66348b, (Object) ((C27317b) obj).f66348b);
            }

            public int hashCode() {
                return this.f66348b.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66348b;
                return "AddProductToShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$d$c */
        public static final class C27318c extends C27315d {

            /* renamed from: c */
            public static final int f66349c = 8;
            @C12579k

            /* renamed from: b */
            public final OfferProductModel f66350b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27318c(@C12579k OfferProductModel offerProductModel) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(offerProductModel, "product");
                this.f66350b = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27318c m115232c(C27318c cVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = cVar.f66350b;
                }
                return cVar.mo79490b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79489a() {
                return this.f66350b;
            }

            @C12579k
            /* renamed from: b */
            public final C27318c mo79490b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "product");
                return new C27318c(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79491d() {
                return this.f66350b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27318c) && Intrinsics.areEqual((Object) this.f66350b, (Object) ((C27318c) obj).f66350b);
            }

            public int hashCode() {
                return this.f66350b.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66350b;
                return "ClearMixingProductOverlayStatus(product=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$d$d */
        public static final class C27319d extends C27315d {

            /* renamed from: c */
            public static final int f66351c = 8;
            @C12580l

            /* renamed from: b */
            public final Bundle f66352b;

            public C27319d(@C12580l Bundle bundle) {
                super((DefaultConstructorMarker) null);
                this.f66352b = bundle;
            }

            /* renamed from: c */
            public static /* synthetic */ C27319d m115236c(C27319d dVar, Bundle bundle, int i, Object obj) {
                if ((i & 1) != 0) {
                    bundle = dVar.f66352b;
                }
                return dVar.mo79496b(bundle);
            }

            @C12580l
            /* renamed from: a */
            public final Bundle mo79495a() {
                return this.f66352b;
            }

            @C12579k
            /* renamed from: b */
            public final C27319d mo79496b(@C12580l Bundle bundle) {
                return new C27319d(bundle);
            }

            @C12580l
            /* renamed from: d */
            public final Bundle mo79497d() {
                return this.f66352b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27319d) && Intrinsics.areEqual((Object) this.f66352b, (Object) ((C27319d) obj).f66352b);
            }

            public int hashCode() {
                Bundle bundle = this.f66352b;
                if (bundle == null) {
                    return 0;
                }
                return bundle.hashCode();
            }

            @C12579k
            public String toString() {
                Bundle bundle = this.f66352b;
                return "LoadProducts(bundle=" + bundle + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$d$e */
        public static final class C27320e extends C27315d {

            /* renamed from: d */
            public static final int f66353d = 8;
            @C12579k

            /* renamed from: b */
            public final OfferProductModel f66354b;
            @C12580l

            /* renamed from: c */
            public final Integer f66355c;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C27320e(OfferProductModel offerProductModel, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(offerProductModel, (i & 2) != 0 ? null : num);
            }

            /* renamed from: d */
            public static /* synthetic */ C27320e m115240d(C27320e eVar, OfferProductModel offerProductModel, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = eVar.f66354b;
                }
                if ((i & 2) != 0) {
                    num = eVar.f66355c;
                }
                return eVar.mo79503c(offerProductModel, num);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79501a() {
                return this.f66354b;
            }

            @C12580l
            /* renamed from: b */
            public final Integer mo79502b() {
                return this.f66355c;
            }

            @C12579k
            /* renamed from: c */
            public final C27320e mo79503c(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27320e(offerProductModel, num);
            }

            @C12579k
            /* renamed from: e */
            public final OfferProductModel mo79504e() {
                return this.f66354b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27320e)) {
                    return false;
                }
                C27320e eVar = (C27320e) obj;
                return Intrinsics.areEqual((Object) this.f66354b, (Object) eVar.f66354b) && Intrinsics.areEqual((Object) this.f66355c, (Object) eVar.f66355c);
            }

            @C12580l
            /* renamed from: f */
            public final Integer mo79506f() {
                return this.f66355c;
            }

            public int hashCode() {
                int hashCode = this.f66354b.hashCode() * 31;
                Integer num = this.f66355c;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66354b;
                Integer num = this.f66355c;
                return "RemoveProductFromBasket(offerProductModel=" + offerProductModel + ", quantity=" + num + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27320e(@C12579k OfferProductModel offerProductModel, @C12580l Integer num) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66354b = offerProductModel;
                this.f66355c = num;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$d$f */
        public static final class C27321f extends C27315d {

            /* renamed from: c */
            public static final int f66356c = 8;
            @C12579k

            /* renamed from: b */
            public final OfferProductModel f66357b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27321f(@C12579k OfferProductModel offerProductModel) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66357b = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27321f m115246c(C27321f fVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = fVar.f66357b;
                }
                return fVar.mo79510b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79509a() {
                return this.f66357b;
            }

            @C12579k
            /* renamed from: b */
            public final C27321f mo79510b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27321f(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79511d() {
                return this.f66357b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27321f) && Intrinsics.areEqual((Object) this.f66357b, (Object) ((C27321f) obj).f66357b);
            }

            public int hashCode() {
                return this.f66357b.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66357b;
                return "RemoveProductFromShoppingList(offerProductModel=" + offerProductModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.b$d$g */
        public static final class C27322g extends C27315d {

            /* renamed from: c */
            public static final int f66358c = 8;
            @C12579k

            /* renamed from: b */
            public final OfferProductModel f66359b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27322g(@C12579k OfferProductModel offerProductModel) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                this.f66359b = offerProductModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C27322g m115250c(C27322g gVar, OfferProductModel offerProductModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    offerProductModel = gVar.f66359b;
                }
                return gVar.mo79516b(offerProductModel);
            }

            @C12579k
            /* renamed from: a */
            public final OfferProductModel mo79515a() {
                return this.f66359b;
            }

            @C12579k
            /* renamed from: b */
            public final C27322g mo79516b(@C12579k OfferProductModel offerProductModel) {
                Intrinsics.checkNotNullParameter(offerProductModel, "offerProductModel");
                return new C27322g(offerProductModel);
            }

            @C12579k
            /* renamed from: d */
            public final OfferProductModel mo79517d() {
                return this.f66359b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27322g) && Intrinsics.areEqual((Object) this.f66359b, (Object) ((C27322g) obj).f66359b);
            }

            public int hashCode() {
                return this.f66359b.hashCode();
            }

            @C12579k
            public String toString() {
                OfferProductModel offerProductModel = this.f66359b;
                return "ShowProductDetails(offerProductModel=" + offerProductModel + ")";
            }
        }

        public /* synthetic */ C27315d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C27315d() {
        }
    }
}
