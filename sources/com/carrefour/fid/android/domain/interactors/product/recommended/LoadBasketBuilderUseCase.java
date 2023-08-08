package com.carrefour.fid.android.domain.interactors.product.recommended;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37540a;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.product.C37776o;
import com.carrefour.fid.android.domain.models.C37940a;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.C38064a;
import com.carrefour.fid.android.domain.repositories.C38199h;
import com.carrefour.fid.android.presentation.models.BasketBuilderParamsModel;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nLoadBasketBuilderUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadBasketBuilderUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/recommended/LoadBasketBuilderUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1549#2:107\n1620#2,3:108\n1603#2,9:111\n1855#2:120\n1856#2:122\n1612#2:123\n1#3:121\n1#3:124\n*S KotlinDebug\n*F\n+ 1 LoadBasketBuilderUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/recommended/LoadBasketBuilderUseCase\n*L\n60#1:107\n60#1:108,3\n75#1:111,9\n75#1:120\n75#1:122\n75#1:123\n75#1:121\n*E\n"})
public final class LoadBasketBuilderUseCase implements C37679f<C37782a, C37940a> {

    /* renamed from: g */
    public static final int f94816g = 8;
    @C12579k

    /* renamed from: a */
    public final C37681b f94817a;
    @C12579k

    /* renamed from: b */
    public final C37540a f94818b;
    @C12579k

    /* renamed from: c */
    public final C37776o f94819c;
    @C12579k

    /* renamed from: d */
    public final C38199h f94820d;
    @C12579k

    /* renamed from: e */
    public final LoginRepository f94821e;
    @C12579k

    /* renamed from: f */
    public final C37566e0 f94822f;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$a */
    public static final class C37782a {

        /* renamed from: b */
        public static final int f94823b = 8;
        @C12579k

        /* renamed from: a */
        public final BasketBuilderParamsModel f94824a;

        public C37782a(@C12579k BasketBuilderParamsModel basketBuilderParamsModel) {
            Intrinsics.checkNotNullParameter(basketBuilderParamsModel, "basketBuilderParamsModel");
            this.f94824a = basketBuilderParamsModel;
        }

        /* renamed from: c */
        public static /* synthetic */ C37782a m154875c(C37782a aVar, BasketBuilderParamsModel basketBuilderParamsModel, int i, Object obj) {
            if ((i & 1) != 0) {
                basketBuilderParamsModel = aVar.f94824a;
            }
            return aVar.mo115122b(basketBuilderParamsModel);
        }

        @C12579k
        /* renamed from: a */
        public final BasketBuilderParamsModel mo115121a() {
            return this.f94824a;
        }

        @C12579k
        /* renamed from: b */
        public final C37782a mo115122b(@C12579k BasketBuilderParamsModel basketBuilderParamsModel) {
            Intrinsics.checkNotNullParameter(basketBuilderParamsModel, "basketBuilderParamsModel");
            return new C37782a(basketBuilderParamsModel);
        }

        @C12579k
        /* renamed from: d */
        public final BasketBuilderParamsModel mo115123d() {
            return this.f94824a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37782a) && Intrinsics.areEqual((Object) this.f94824a, (Object) ((C37782a) obj).f94824a);
        }

        public int hashCode() {
            return this.f94824a.hashCode();
        }

        @C12579k
        public String toString() {
            BasketBuilderParamsModel basketBuilderParamsModel = this.f94824a;
            return "Param(basketBuilderParamsModel=" + basketBuilderParamsModel + ")";
        }
    }

    @Inject
    public LoadBasketBuilderUseCase(@C12579k C37681b bVar, @C12579k C37540a aVar, @C12579k C37776o oVar, @C12579k C38199h hVar, @C12579k LoginRepository loginRepository, @C12579k C37566e0 e0Var) {
        Intrinsics.checkNotNullParameter(bVar, "getShoppingListUseCase");
        Intrinsics.checkNotNullParameter(aVar, "getAdditionalOrderContextUseCase");
        Intrinsics.checkNotNullParameter(oVar, "getFrequentlyPurchasedProductsUseCase");
        Intrinsics.checkNotNullParameter(hVar, "productDetailsRepository");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(e0Var, "retrieveBasketFromCacheUseCase");
        this.f94817a = bVar;
        this.f94818b = aVar;
        this.f94819c = oVar;
        this.f94820d = hVar;
        this.f94821e = loginRepository;
        this.f94822f = e0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.util.List<com.carrefour.fid.android.domain.models.offer.a>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo115117c(com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase.C37782a r11, java.util.List<com.carrefour.fid.android.domain.models.offer.C38064a> r12, java.lang.String r13, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.C37940a>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$getBasketBuilder$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$getBasketBuilder$1 r0 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$getBasketBuilder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$getBasketBuilder$1 r0 = new com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$getBasketBuilder$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x007b
            if (r2 == r5) goto L_0x0064
            if (r2 == r4) goto L_0x004f
            if (r2 != r3) goto L_0x0047
            java.lang.Object r11 = r0.L$3
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.L$2
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r0.L$1
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase r0 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase) r0
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0123
        L_0x0047:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004f:
            java.lang.Object r11 = r0.L$2
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.L$1
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase r13 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase) r13
            kotlin.C11661u0.m45747n(r14)
            r9 = r12
            r12 = r11
            r11 = r13
            r13 = r9
            goto L_0x00fc
        L_0x0064:
            java.lang.Object r11 = r0.L$2
            r12 = r11
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r11 = r0.L$1
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$a r11 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase.C37782a) r11
            java.lang.Object r13 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase r13 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase) r13
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x00d8
        L_0x007b:
            kotlin.C11661u0.m45747n(r14)
            boolean r14 = r12.isEmpty()
            if (r14 == 0) goto L_0x0090
            kotlin.Result$a r11 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.a r11 = new com.carrefour.fid.android.domain.models.a
            r11.<init>(r6, r5, r6)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
            return r11
        L_0x0090:
            com.carrefour.fid.android.domain.repositories.h r14 = r10.f94820d
            r2 = r12
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = kotlin.collections.C10978t.m41495Y(r2, r8)
            r7.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x00a4:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00c0
            java.lang.Object r8 = r2.next()
            com.carrefour.fid.android.domain.models.offer.a r8 = (com.carrefour.fid.android.domain.models.offer.C38064a) r8
            com.carrefour.fid.android.domain.models.offer.Offer r8 = r8.mo118196j()
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r8 = r8.mo118001J()
            java.lang.String r8 = r8.mo118136f()
            r7.add(r8)
            goto L_0x00a4
        L_0x00c0:
            com.carrefour.fid.android.presentation.models.BasketBuilderParamsModel r2 = r11.mo115123d()
            boolean r2 = r2.mo121328g()
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r12
            r0.label = r5
            java.lang.Object r14 = r14.mo111474c(r7, r2, r13, r0)
            if (r14 != r1) goto L_0x00d7
            return r1
        L_0x00d7:
            r13 = r10
        L_0x00d8:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r14)
            if (r2 != 0) goto L_0x016b
            java.util.List r14 = (java.util.List) r14
            com.carrefour.fid.android.presentation.models.BasketBuilderParamsModel r11 = r11.mo115123d()
            com.carrefour.fid.android.core.types.RequestType r11 = r11.mo121329h()
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r14
            r0.label = r4
            java.lang.Object r11 = r13.mo115118d(r11, r0)
            if (r11 != r1) goto L_0x00f7
            return r1
        L_0x00f7:
            r9 = r14
            r14 = r11
            r11 = r13
            r13 = r12
            r12 = r9
        L_0x00fc:
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r14 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r14
            if (r14 == 0) goto L_0x0105
            java.util.List r14 = r14.mo117697e()
            goto L_0x0106
        L_0x0105:
            r14 = r6
        L_0x0106:
            if (r14 != 0) goto L_0x010c
            java.util.List r14 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x010c:
            com.carrefour.fid.android.domain.interactors.basket.e0 r2 = r11.f94822f
            r0.L$0 = r11
            r0.L$1 = r13
            r0.L$2 = r12
            r0.L$3 = r14
            r0.label = r3
            java.lang.Object r0 = r2.m172965invokeIoAF18A(r0)
            if (r0 != r1) goto L_0x011f
            return r1
        L_0x011f:
            r9 = r0
            r0 = r11
            r11 = r14
            r14 = r9
        L_0x0123:
            boolean r1 = kotlin.Result.m38709i(r14)
            if (r1 == 0) goto L_0x012a
            r14 = r6
        L_0x012a:
            com.carrefour.fid.android.domain.models.basket.Basket r14 = (com.carrefour.fid.android.domain.models.basket.Basket) r14
            if (r14 == 0) goto L_0x0132
            com.carrefour.fid.android.domain.models.BasketDomain r6 = com.carrefour.fid.android.domain.extension.C37498a.m153932b(r14)
        L_0x0132:
            java.util.List r12 = com.carrefour.fid.android.domain.extension.C37507h.m153949a(r12)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0141:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0157
            java.lang.Object r1 = r13.next()
            com.carrefour.fid.android.domain.models.offer.a r1 = (com.carrefour.fid.android.domain.models.offer.C38064a) r1
            com.carrefour.fid.android.domain.models.OfferProductDomain r1 = r0.mo115120f(r1, r12)
            if (r1 == 0) goto L_0x0141
            r14.add(r1)
            goto L_0x0141
        L_0x0157:
            java.util.List r11 = com.carrefour.fid.android.domain.extension.C37507h.m153954f(r14, r11)
            java.util.List r11 = com.carrefour.fid.android.domain.extension.C37507h.m153953e(r11, r6)
            kotlin.Result$a r12 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.a r12 = new com.carrefour.fid.android.domain.models.a
            r12.<init>(r11)
            java.lang.Object r11 = kotlin.Result.m38702b(r12)
            goto L_0x0175
        L_0x016b:
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r2)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
        L_0x0175:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase.mo115117c(com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$a, java.util.List, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo115118d(com.carrefour.fid.android.core.types.RequestType r6, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$getShoppingList$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$getShoppingList$1 r0 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$getShoppingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$getShoppingList$1 r0 = new com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$getShoppingList$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0055
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.account.data.repositories.LoginRepository r7 = r5.f94821e
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r7 = r7.mo31354f()
            boolean r7 = com.carrefour.fid.android.account.data.entities.extentions.C13181d.m57146e(r7)
            if (r7 != 0) goto L_0x0048
            goto L_0x005f
        L_0x0048:
            if (r6 == 0) goto L_0x005f
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.b r7 = r5.f94817a
            r0.label = r3
            java.lang.Object r6 = r7.m172966invokegIAlus(r6, r0)
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            boolean r7 = kotlin.Result.m38709i(r6)
            if (r7 == 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r4 = r6
        L_0x005d:
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r4 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r4
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase.mo115118d(com.carrefour.fid.android.core.types.RequestType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082 A[SYNTHETIC, Splitter:B:26:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3 A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c1 A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172992invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase.C37782a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.C37940a>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0069
            if (r2 == r5) goto L_0x0057
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0054 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0054 }
            java.lang.Object r8 = r9.mo21858l()     // Catch:{ all -> 0x0054 }
            goto L_0x00cb
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            java.lang.Object r8 = r0.L$2
            com.carrefour.fid.android.domain.models.additionalorder.a r8 = (com.carrefour.fid.android.domain.models.additionalorder.C37952a) r8
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$a r2 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase.C37782a) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase r4 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase) r4
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0054 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0054 }
            java.lang.Object r9 = r9.mo21858l()     // Catch:{ all -> 0x0054 }
            goto L_0x009d
        L_0x0054:
            r8 = move-exception
            goto L_0x00d5
        L_0x0057:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$a r8 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase.C37782a) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase r2 = (com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x007c
        L_0x0069:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.additionalorder.a r9 = r7.f94818b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x007b
            return r1
        L_0x007b:
            r2 = r7
        L_0x007c:
            boolean r5 = kotlin.Result.m38710j(r9)
            if (r5 == 0) goto L_0x00e0
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0054 }
            com.carrefour.fid.android.domain.models.additionalorder.a r9 = (com.carrefour.fid.android.domain.models.additionalorder.C37952a) r9     // Catch:{ all -> 0x0054 }
            com.carrefour.fid.android.domain.interactors.product.o r5 = r2.f94819c     // Catch:{ all -> 0x0054 }
            r0.L$0 = r2     // Catch:{ all -> 0x0054 }
            r0.L$1 = r8     // Catch:{ all -> 0x0054 }
            r0.L$2 = r9     // Catch:{ all -> 0x0054 }
            r0.label = r4     // Catch:{ all -> 0x0054 }
            r4 = 0
            java.lang.Object r4 = r5.mo79978a(r4, r0)     // Catch:{ all -> 0x0054 }
            if (r4 != r1) goto L_0x0098
            return r1
        L_0x0098:
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r4
            r4 = r6
        L_0x009d:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r9)     // Catch:{ all -> 0x0054 }
            if (r5 != 0) goto L_0x00c1
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x0054 }
            r5 = 0
            if (r8 == 0) goto L_0x00ad
            java.lang.String r8 = r8.mo116800g()     // Catch:{ all -> 0x0054 }
            goto L_0x00ae
        L_0x00ad:
            r8 = r5
        L_0x00ae:
            if (r8 != 0) goto L_0x00b2
            java.lang.String r8 = ""
        L_0x00b2:
            r0.L$0 = r5     // Catch:{ all -> 0x0054 }
            r0.L$1 = r5     // Catch:{ all -> 0x0054 }
            r0.L$2 = r5     // Catch:{ all -> 0x0054 }
            r0.label = r3     // Catch:{ all -> 0x0054 }
            java.lang.Object r8 = r4.mo115117c(r2, r9, r8, r0)     // Catch:{ all -> 0x0054 }
            if (r8 != r1) goto L_0x00cb
            return r1
        L_0x00c1:
            kotlin.Result$a r8 = kotlin.Result.f28060a     // Catch:{ all -> 0x0054 }
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r5)     // Catch:{ all -> 0x0054 }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x0054 }
        L_0x00cb:
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0054 }
            com.carrefour.fid.android.domain.models.a r8 = (com.carrefour.fid.android.domain.models.C37940a) r8     // Catch:{ all -> 0x0054 }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x0054 }
            goto L_0x00e4
        L_0x00d5:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x00e4
        L_0x00e0:
            java.lang.Object r8 = kotlin.Result.m38702b(r9)
        L_0x00e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase.m172992invokegIAlus(com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: f */
    public final OfferProductDomain mo115120f(C38064a aVar, List<OfferProductDomain> list) {
        Integer num;
        Object obj;
        String str;
        Iterator it = list.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String f = aVar.mo118196j().mo118001J().mo118136f();
            OfferIdentifierDomain I = ((OfferProductDomain) obj).mo116024I();
            if (I != null) {
                str = I.mo115986f();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual((Object) f, (Object) str)) {
                break;
            }
        }
        OfferProductDomain offerProductDomain = (OfferProductDomain) obj;
        if (offerProductDomain == null) {
            return null;
        }
        offerProductDomain.mo116064j0(aVar.mo118200n());
        offerProductDomain.mo116059h0(Double.valueOf(aVar.mo118198l()));
        offerProductDomain.mo116047c0(aVar.mo118195i());
        ProductCategory H = aVar.mo118196j().mo118010S().mo118407H();
        if (H != null) {
            num = Integer.valueOf(H.mo117296p());
        }
        offerProductDomain.mo116040Y(num);
        offerProductDomain.mo116041Z(Double.valueOf(aVar.mo118198l()));
        offerProductDomain.mo116062i0(Double.valueOf(aVar.mo118199m()));
        return offerProductDomain;
    }
}
