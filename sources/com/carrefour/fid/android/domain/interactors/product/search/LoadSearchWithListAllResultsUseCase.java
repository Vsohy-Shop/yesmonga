package com.carrefour.fid.android.domain.interactors.product.search;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.core.types.RequestType;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.repositories.C38199h;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nLoadSearchWithListAllResultsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadSearchWithListAllResultsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/search/LoadSearchWithListAllResultsUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public final class LoadSearchWithListAllResultsUseCase implements C37679f<C37789a, List<? extends OfferProductDomain>> {

    /* renamed from: e */
    public static final int f94851e = 8;
    @C12579k

    /* renamed from: a */
    public final C38199h f94852a;
    @C12579k

    /* renamed from: b */
    public final LoginRepository f94853b;
    @C12579k

    /* renamed from: c */
    public final C37681b f94854c;
    @C12579k

    /* renamed from: d */
    public final C37584l0 f94855d;

    @Inject
    public LoadSearchWithListAllResultsUseCase(@C12579k C38199h hVar, @C12579k LoginRepository loginRepository, @C12579k C37681b bVar, @C12579k C37584l0 l0Var) {
        Intrinsics.checkNotNullParameter(hVar, "productsRepository");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(bVar, "getShoppingListUseCase");
        Intrinsics.checkNotNullParameter(l0Var, "synchronizeCurrentBasketUseCase");
        this.f94852a = hVar;
        this.f94853b = loginRepository;
        this.f94854c = bVar;
        this.f94855d = l0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo115144b(com.carrefour.fid.android.core.types.RequestType r6, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$getShoppingList$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$getShoppingList$1 r0 = (com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$getShoppingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$getShoppingList$1 r0 = new com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$getShoppingList$1
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
            com.carrefour.fid.android.account.data.repositories.LoginRepository r7 = r5.f94853b
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r7 = r7.mo31354f()
            boolean r7 = com.carrefour.fid.android.account.data.entities.extentions.C13181d.m57146e(r7)
            if (r7 != 0) goto L_0x0048
            goto L_0x005f
        L_0x0048:
            if (r6 == 0) goto L_0x005f
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.b r7 = r5.f94854c
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase.mo115144b(com.carrefour.fid.android.core.types.RequestType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172999invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase.C37789a r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.OfferProductDomain>>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$invoke$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r0.label
            r9 = 3
            r10 = 2
            r2 = 1
            r11 = 0
            if (r1 == 0) goto L_0x006a
            if (r1 == r2) goto L_0x0057
            if (r1 == r10) goto L_0x0047
            if (r1 != r9) goto L_0x003f
            java.lang.Object r14 = r0.L$1
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x00d4
        L_0x003f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0047:
            java.lang.Object r14 = r0.L$2
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$a r1 = (com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase.C37789a) r1
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase r2 = (com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase) r2
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00a9
        L_0x0057:
            java.lang.Object r14 = r0.L$1
            com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$a r14 = (com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase.C37789a) r14
            java.lang.Object r1 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase r1 = (com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase) r1
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            r2 = r1
            goto L_0x008a
        L_0x006a:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.domain.repositories.h r1 = r13.f94852a
            java.util.List r15 = r14.mo115153h()
            boolean r3 = r14.mo115155i()
            r4 = 0
            r6 = 4
            r7 = 0
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r2
            r2 = r15
            r5 = r0
            java.lang.Object r15 = com.carrefour.fid.android.domain.repositories.C38199h.C38200a.m158424a(r1, r2, r3, r4, r5, r6, r7)
            if (r15 != r8) goto L_0x0089
            return r8
        L_0x0089:
            r2 = r13
        L_0x008a:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r15)
            if (r1 != 0) goto L_0x0101
            java.util.List r15 = (java.util.List) r15
            com.carrefour.fid.android.core.types.RequestType r1 = r14.mo115156j()
            r0.L$0 = r2
            r0.L$1 = r14
            r0.L$2 = r15
            r0.label = r10
            java.lang.Object r1 = r2.mo115144b(r1, r0)
            if (r1 != r8) goto L_0x00a5
            return r8
        L_0x00a5:
            r12 = r1
            r1 = r14
            r14 = r15
            r15 = r12
        L_0x00a9:
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r15 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r15
            if (r15 == 0) goto L_0x00b2
            java.util.List r15 = r15.mo117697e()
            goto L_0x00b3
        L_0x00b2:
            r15 = r11
        L_0x00b3:
            if (r15 != 0) goto L_0x00b9
            java.util.List r15 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00b9:
            com.carrefour.fid.android.domain.models.BasketDomain r1 = r1.mo115152g()
            if (r1 != 0) goto L_0x00ed
            com.carrefour.fid.android.domain.interactors.basket.l0 r1 = r2.f94855d
            r0.L$0 = r14
            r0.L$1 = r15
            r0.L$2 = r11
            r0.label = r9
            java.lang.Object r0 = r1.m172965invokeIoAF18A(r0)
            if (r0 != r8) goto L_0x00d0
            return r8
        L_0x00d0:
            r12 = r0
            r0 = r14
            r14 = r15
            r15 = r12
        L_0x00d4:
            boolean r1 = kotlin.Result.m38709i(r15)
            if (r1 == 0) goto L_0x00dd
        L_0x00da:
            r15 = r14
            r14 = r0
            goto L_0x00ee
        L_0x00dd:
            boolean r1 = kotlin.Result.m38709i(r15)
            if (r1 == 0) goto L_0x00e4
            r15 = r11
        L_0x00e4:
            com.carrefour.fid.android.domain.models.basket.Basket r15 = (com.carrefour.fid.android.domain.models.basket.Basket) r15
            if (r15 == 0) goto L_0x00da
            com.carrefour.fid.android.domain.models.BasketDomain r11 = com.carrefour.fid.android.domain.extension.C37498a.m153932b(r15)
            goto L_0x00da
        L_0x00ed:
            r11 = r1
        L_0x00ee:
            java.util.List r14 = com.carrefour.fid.android.domain.extension.C37507h.m153949a(r14)
            java.util.List r14 = com.carrefour.fid.android.domain.extension.C37507h.m153954f(r14, r15)
            java.util.List r14 = com.carrefour.fid.android.domain.extension.C37507h.m153953e(r14, r11)
            kotlin.Result$a r15 = kotlin.Result.f28060a
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            goto L_0x010b
        L_0x0101:
            kotlin.Result$a r14 = kotlin.Result.f28060a
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
        L_0x010b:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase.m172999invokegIAlus(com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase$a */
    public static final class C37789a {

        /* renamed from: e */
        public static final int f94856e = 8;
        @C12579k

        /* renamed from: a */
        public final List<String> f94857a;

        /* renamed from: b */
        public final boolean f94858b;
        @C12580l

        /* renamed from: c */
        public final BasketDomain f94859c;
        @C12580l

        /* renamed from: d */
        public final RequestType f94860d;

        public C37789a(@C12579k List<String> list, boolean z, @C12580l BasketDomain basketDomain, @C12580l RequestType requestType) {
            Intrinsics.checkNotNullParameter(list, "gtinList");
            this.f94857a = list;
            this.f94858b = z;
            this.f94859c = basketDomain;
            this.f94860d = requestType;
        }

        /* renamed from: f */
        public static /* synthetic */ C37789a m154900f(C37789a aVar, List<String> list, boolean z, BasketDomain basketDomain, RequestType requestType, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f94857a;
            }
            if ((i & 2) != 0) {
                z = aVar.f94858b;
            }
            if ((i & 4) != 0) {
                basketDomain = aVar.f94859c;
            }
            if ((i & 8) != 0) {
                requestType = aVar.f94860d;
            }
            return aVar.mo115150e(list, z, basketDomain, requestType);
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo115146a() {
            return this.f94857a;
        }

        /* renamed from: b */
        public final boolean mo115147b() {
            return this.f94858b;
        }

        @C12580l
        /* renamed from: c */
        public final BasketDomain mo115148c() {
            return this.f94859c;
        }

        @C12580l
        /* renamed from: d */
        public final RequestType mo115149d() {
            return this.f94860d;
        }

        @C12579k
        /* renamed from: e */
        public final C37789a mo115150e(@C12579k List<String> list, boolean z, @C12580l BasketDomain basketDomain, @C12580l RequestType requestType) {
            Intrinsics.checkNotNullParameter(list, "gtinList");
            return new C37789a(list, z, basketDomain, requestType);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37789a)) {
                return false;
            }
            C37789a aVar = (C37789a) obj;
            return Intrinsics.areEqual((Object) this.f94857a, (Object) aVar.f94857a) && this.f94858b == aVar.f94858b && Intrinsics.areEqual((Object) this.f94859c, (Object) aVar.f94859c) && this.f94860d == aVar.f94860d;
        }

        @C12580l
        /* renamed from: g */
        public final BasketDomain mo115152g() {
            return this.f94859c;
        }

        @C12579k
        /* renamed from: h */
        public final List<String> mo115153h() {
            return this.f94857a;
        }

        public int hashCode() {
            int hashCode = this.f94857a.hashCode() * 31;
            boolean z = this.f94858b;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            BasketDomain basketDomain = this.f94859c;
            int i2 = 0;
            int hashCode2 = (i + (basketDomain == null ? 0 : basketDomain.hashCode())) * 31;
            RequestType requestType = this.f94860d;
            if (requestType != null) {
                i2 = requestType.hashCode();
            }
            return hashCode2 + i2;
        }

        /* renamed from: i */
        public final boolean mo115155i() {
            return this.f94858b;
        }

        @C12580l
        /* renamed from: j */
        public final RequestType mo115156j() {
            return this.f94860d;
        }

        @C12579k
        public String toString() {
            List<String> list = this.f94857a;
            boolean z = this.f94858b;
            BasketDomain basketDomain = this.f94859c;
            RequestType requestType = this.f94860d;
            return "Param(gtinList=" + list + ", hasFidCard=" + z + ", basket=" + basketDomain + ", shoppingListRequestType=" + requestType + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37789a(List list, boolean z, BasketDomain basketDomain, RequestType requestType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, z, (i & 4) != 0 ? null : basketDomain, (i & 8) != 0 ? RequestType.NONE : requestType);
        }
    }
}
