package com.carrefour.fid.android.domain.interactors.product.list;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.core.types.RequestType;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.domain.models.ProductListFilter;
import com.carrefour.fid.android.domain.repositories.C38201i;
import com.carrefour.fid.android.presentation.models.FacetModel;
import com.carrefour.fid.android.presentation.models.ProductListResultModel;
import com.carrefour.fid.android.presentation.models.SortModel;
import com.carrefour.fid.android.presentation.models.mapper.C38514l;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetProductListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetProductListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/list/GetProductListUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class GetProductListUseCase implements C37679f<C37766a, ProductListResultModel> {

    /* renamed from: w */
    public static final int f94765w = 8;
    @C12579k

    /* renamed from: a */
    public final C38201i f94766a;
    @C12579k

    /* renamed from: b */
    public final C38514l f94767b;
    @C12579k

    /* renamed from: c */
    public final C37681b f94768c;
    @C12579k

    /* renamed from: d */
    public final C37584l0 f94769d;
    @C12579k

    /* renamed from: e */
    public final C37566e0 f94770e;
    @C12579k

    /* renamed from: f */
    public final LoginRepository f94771f;
    @C12579k

    /* renamed from: g */
    public final C37857d f94772g;
    @C12579k

    /* renamed from: v */
    public final C37823k f94773v;

    @Inject
    public GetProductListUseCase(@C12579k C38201i iVar, @C12579k C38514l lVar, @C12579k C37681b bVar, @C12579k C37584l0 l0Var, @C12579k C37566e0 e0Var, @C12579k LoginRepository loginRepository, @C12579k C37857d dVar, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(iVar, "productsRepository");
        Intrinsics.checkNotNullParameter(lVar, "productsResultModelDataMapper");
        Intrinsics.checkNotNullParameter(bVar, "getShoppingListUseCase");
        Intrinsics.checkNotNullParameter(l0Var, "synchronizeCurrentBasketUseCase");
        Intrinsics.checkNotNullParameter(e0Var, "retrieveBasketFromCacheUseCase");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(dVar, "getSlotSliceUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.f94766a = iVar;
        this.f94767b = lVar;
        this.f94768c = bVar;
        this.f94769d = l0Var;
        this.f94770e = e0Var;
        this.f94771f = loginRepository;
        this.f94772g = dVar;
        this.f94773v = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo115044d(com.carrefour.fid.android.core.types.RequestType r8, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.BasketDomain>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getBasketList$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getBasketList$1 r0 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getBasketList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getBasketList$1 r0 = new com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getBasketList$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x005b
            if (r2 == r5) goto L_0x0049
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x00b9
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003f:
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x00a1
        L_0x0049:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.core.types.RequestType r8 = (com.carrefour.fid.android.core.types.RequestType) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase r2 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x007a
        L_0x005b:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.account.data.repositories.LoginRepository r9 = r7.f94771f
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r9 = r9.mo31354f()
            boolean r9 = com.carrefour.fid.android.account.data.entities.extentions.C13181d.m57146e(r9)
            if (r9 == 0) goto L_0x00be
            com.carrefour.fid.android.domain.interactors.service.k r9 = r7.f94773v
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r2 = r7
        L_0x007a:
            boolean r5 = kotlin.Result.m38709i(r9)
            if (r5 == 0) goto L_0x0081
            r9 = r6
        L_0x0081:
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
            if (r9 == 0) goto L_0x008a
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = r9.mo119354f()
            goto L_0x008b
        L_0x008a:
            r9 = r6
        L_0x008b:
            if (r9 != 0) goto L_0x008e
            goto L_0x00be
        L_0x008e:
            com.carrefour.fid.android.core.types.RequestType r9 = com.carrefour.fid.android.core.types.RequestType.ONLINE
            if (r8 != r9) goto L_0x00a6
            com.carrefour.fid.android.domain.interactors.basket.l0 r8 = r2.f94769d
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            kotlin.Result r8 = kotlin.Result.m38701a(r8)
            goto L_0x00bf
        L_0x00a6:
            com.carrefour.fid.android.core.types.RequestType r9 = com.carrefour.fid.android.core.types.RequestType.OFFLINE
            if (r8 != r9) goto L_0x00be
            com.carrefour.fid.android.domain.interactors.basket.e0 r8 = r2.f94770e
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            kotlin.Result r8 = kotlin.Result.m38701a(r8)
            goto L_0x00bf
        L_0x00be:
            r8 = r6
        L_0x00bf:
            if (r8 == 0) goto L_0x00e9
            java.lang.Object r8 = r8.mo21858l()
            boolean r9 = kotlin.Result.m38710j(r8)
            if (r9 == 0) goto L_0x00e1
            kotlin.Result$a r9 = kotlin.Result.f28060a     // Catch:{ all -> 0x00da }
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8     // Catch:{ all -> 0x00da }
            if (r8 == 0) goto L_0x00d5
            com.carrefour.fid.android.domain.models.BasketDomain r6 = com.carrefour.fid.android.domain.extension.C37498a.m153932b(r8)     // Catch:{ all -> 0x00da }
        L_0x00d5:
            java.lang.Object r8 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x00da }
            goto L_0x00e5
        L_0x00da:
            r8 = move-exception
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
        L_0x00e1:
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00e5:
            kotlin.Result r6 = kotlin.Result.m38701a(r8)
        L_0x00e9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase.mo115044d(com.carrefour.fid.android.core.types.RequestType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo115045e(kotlin.coroutines.C11045c<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getFacilityServiceId$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getFacilityServiceId$1 r0 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getFacilityServiceId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getFacilityServiceId$1 r0 = new com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getFacilityServiceId$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.shared.util.ServiceUtil r0 = (com.carrefour.fid.android.shared.util.ServiceUtil) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0050
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.shared.util.ServiceUtil r6 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            com.carrefour.fid.android.domain.interactors.service.k r2 = r5.f94773v
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r0 = r2.m172965invokeIoAF18A(r0)
            if (r0 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0050:
            boolean r1 = kotlin.Result.m38709i(r6)
            r2 = 0
            if (r1 == 0) goto L_0x0058
            r6 = r2
        L_0x0058:
            com.carrefour.fid.android.domain.models.service.models.k r6 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r6
            if (r6 == 0) goto L_0x0060
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = r6.mo119354f()
        L_0x0060:
            java.lang.String r6 = r0.mo84123e(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase.mo115045e(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo115046f(com.carrefour.fid.android.core.types.RequestType r6, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getShoppingList$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getShoppingList$1 r0 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getShoppingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getShoppingList$1 r0 = new com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$getShoppingList$1
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
            com.carrefour.fid.android.account.data.repositories.LoginRepository r7 = r5.f94771f
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r7 = r7.mo31354f()
            boolean r7 = com.carrefour.fid.android.account.data.entities.extentions.C13181d.m57146e(r7)
            if (r7 != 0) goto L_0x0048
            goto L_0x005f
        L_0x0048:
            if (r6 == 0) goto L_0x005f
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.b r7 = r5.f94768c
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase.mo115046f(com.carrefour.fid.android.core.types.RequestType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0164 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172989invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase.C37766a r28, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.presentation.models.ProductListResultModel>> r29) {
        /*
            r27 = this;
            r1 = r27
            r0 = r29
            boolean r2 = r0 instanceof com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$invoke$1 r2 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$invoke$1 r2 = new com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$invoke$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r15 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r14 = 5
            r13 = 4
            r4 = 3
            r5 = 2
            r12 = 1
            r11 = 0
            if (r3 == 0) goto L_0x00b9
            if (r3 == r12) goto L_0x00a7
            if (r3 == r5) goto L_0x0083
            if (r3 == r4) goto L_0x006b
            if (r3 == r13) goto L_0x0051
            if (r3 != r14) goto L_0x0049
            java.lang.Object r3 = r2.L$2
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.models.w r4 = (com.carrefour.fid.android.domain.models.C38185w) r4
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase r2 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase) r2
            kotlin.C11661u0.m45747n(r0)
            r25 = r11
            goto L_0x01b0
        L_0x0049:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0051:
            java.lang.Object r3 = r2.L$2
            com.carrefour.fid.android.domain.models.w r3 = (com.carrefour.fid.android.domain.models.C38185w) r3
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$a r4 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase.C37766a) r4
            java.lang.Object r5 = r2.L$0
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase r5 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase) r5
            kotlin.C11661u0.m45747n(r0)
            r6 = r0
            r25 = r11
            r0 = r15
            r26 = r5
            r5 = r4
            r4 = r26
            goto L_0x0185
        L_0x006b:
            java.lang.Object r3 = r2.L$1
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$a r3 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase.C37766a) r3
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase r4 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase) r4
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            r5 = r3
            r25 = r11
            r3 = r0
            r0 = r15
            goto L_0x0169
        L_0x0083:
            boolean r3 = r2.Z$0
            java.lang.Object r5 = r2.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.L$2
            com.carrefour.fid.android.domain.repositories.i r6 = (com.carrefour.fid.android.domain.repositories.C38201i) r6
            java.lang.Object r7 = r2.L$1
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$a r7 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase.C37766a) r7
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase r8 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase) r8
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            r9 = r7
            r10 = r8
            r26 = r5
            r5 = r3
            r3 = r6
            r6 = r26
            goto L_0x0100
        L_0x00a7:
            boolean r3 = r2.Z$0
            java.lang.Object r6 = r2.L$2
            com.carrefour.fid.android.domain.repositories.i r6 = (com.carrefour.fid.android.domain.repositories.C38201i) r6
            java.lang.Object r7 = r2.L$1
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$a r7 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase.C37766a) r7
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase r8 = (com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase) r8
            kotlin.C11661u0.m45747n(r0)
            goto L_0x00dc
        L_0x00b9:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.domain.repositories.i r6 = r1.f94766a
            boolean r3 = r28.mo115075v()
            java.lang.String r0 = r28.mo115071s()
            if (r0 != 0) goto L_0x00df
            r2.L$0 = r1
            r7 = r28
            r2.L$1 = r7
            r2.L$2 = r6
            r2.Z$0 = r3
            r2.label = r12
            java.lang.Object r0 = r1.mo115045e(r2)
            if (r0 != r15) goto L_0x00db
            return r15
        L_0x00db:
            r8 = r1
        L_0x00dc:
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00e2
        L_0x00df:
            r7 = r28
            r8 = r1
        L_0x00e2:
            com.carrefour.fid.android.domain.interactors.slot.d r9 = r8.f94772g
            r2.L$0 = r8
            r2.L$1 = r7
            r2.L$2 = r6
            r2.L$3 = r0
            r2.Z$0 = r3
            r2.label = r5
            java.lang.Object r5 = r9.m172965invokeIoAF18A(r2)
            if (r5 != r15) goto L_0x00f7
            return r15
        L_0x00f7:
            r9 = r7
            r10 = r8
            r26 = r6
            r6 = r0
            r0 = r5
            r5 = r3
            r3 = r26
        L_0x0100:
            boolean r7 = kotlin.Result.m38709i(r0)
            if (r7 == 0) goto L_0x0107
            r0 = r11
        L_0x0107:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = "1A"
        L_0x010d:
            int r8 = r9.mo115050C()
            java.lang.Integer r16 = r9.mo115076w()
            java.lang.String r17 = r9.mo115078y()
            java.lang.String r18 = r9.mo115077x()
            java.lang.String r19 = r9.mo115079z()
            com.carrefour.fid.android.presentation.models.SortModel r20 = r9.mo115049B()
            java.util.List r21 = r9.mo115070r()
            java.util.List r7 = r9.mo115072t()
            kotlin.Pair r22 = r9.mo115074u()
            boolean r23 = r9.mo115051D()
            r2.L$0 = r10
            r2.L$1 = r9
            r2.L$2 = r11
            r2.L$3 = r11
            r2.label = r4
            r4 = r5
            r5 = r6
            r6 = r0
            r0 = r9
            r9 = r16
            r24 = r10
            r10 = r17
            r25 = r11
            r11 = r18
            r28 = r0
            r0 = r12
            r12 = r19
            r0 = r13
            r13 = r20
            r14 = r21
            r0 = r15
            r15 = r22
            r16 = r23
            r17 = r2
            java.lang.Object r3 = r3.mo111478d(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r3 != r0) goto L_0x0165
            return r0
        L_0x0165:
            r5 = r28
            r4 = r24
        L_0x0169:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r3)
            if (r6 != 0) goto L_0x01f9
            com.carrefour.fid.android.domain.models.w r3 = (com.carrefour.fid.android.domain.models.C38185w) r3
            com.carrefour.fid.android.core.types.RequestType r6 = r5.mo115048A()
            r2.L$0 = r4
            r2.L$1 = r5
            r2.L$2 = r3
            r7 = 4
            r2.label = r7
            java.lang.Object r6 = r4.mo115046f(r6, r2)
            if (r6 != r0) goto L_0x0185
            return r0
        L_0x0185:
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.a r6 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a) r6
            if (r6 == 0) goto L_0x018e
            java.util.List r11 = r6.mo117697e()
            goto L_0x0190
        L_0x018e:
            r11 = r25
        L_0x0190:
            if (r11 != 0) goto L_0x0197
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0198
        L_0x0197:
            r6 = r11
        L_0x0198:
            com.carrefour.fid.android.core.types.RequestType r5 = r5.mo115069q()
            r2.L$0 = r4
            r2.L$1 = r3
            r2.L$2 = r6
            r7 = 5
            r2.label = r7
            java.lang.Object r2 = r4.mo115044d(r5, r2)
            if (r2 != r0) goto L_0x01ac
            return r0
        L_0x01ac:
            r0 = r2
            r2 = r4
            r4 = r3
            r3 = r6
        L_0x01b0:
            kotlin.Result r0 = (kotlin.Result) r0
            r12 = 0
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r5 = r0.mo21858l()
            boolean r5 = kotlin.Result.m38709i(r5)
            r6 = 1
            if (r5 != r6) goto L_0x01c1
            r12 = r6
        L_0x01c1:
            if (r12 != 0) goto L_0x01d4
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r11 = r0.mo21858l()
            boolean r0 = kotlin.Result.m38709i(r11)
            if (r0 == 0) goto L_0x01d1
            r11 = r25
        L_0x01d1:
            com.carrefour.fid.android.domain.models.BasketDomain r11 = (com.carrefour.fid.android.domain.models.BasketDomain) r11
            goto L_0x01d6
        L_0x01d4:
            r11 = r25
        L_0x01d6:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x01ed }
            com.carrefour.fid.android.presentation.models.mapper.l r0 = r2.f94767b     // Catch:{ Exception -> 0x01ed }
            com.carrefour.fid.android.presentation.models.mapper.l$a r2 = new com.carrefour.fid.android.presentation.models.mapper.l$a     // Catch:{ Exception -> 0x01ed }
            r2.<init>(r4, r3, r11)     // Catch:{ Exception -> 0x01ed }
            com.carrefour.fid.android.presentation.models.ProductListResultModel r0 = r0.mo72340a(r2)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r2 = "null cannot be cast to non-null type com.carrefour.fid.android.presentation.models.ProductListResultModel"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)     // Catch:{ Exception -> 0x01ed }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ Exception -> 0x01ed }
            goto L_0x0203
        L_0x01ed:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            goto L_0x0203
        L_0x01f9:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0203:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase.m172989invokegIAlus(com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase$a */
    public static final class C37766a {

        /* renamed from: o */
        public static final int f94774o = 8;

        /* renamed from: a */
        public final boolean f94775a;

        /* renamed from: b */
        public final int f94776b;
        @C12580l

        /* renamed from: c */
        public final Integer f94777c;
        @C12580l

        /* renamed from: d */
        public final String f94778d;
        @C12580l

        /* renamed from: e */
        public final String f94779e;
        @C12580l

        /* renamed from: f */
        public final String f94780f;
        @C12580l

        /* renamed from: g */
        public final SortModel f94781g;
        @C12580l

        /* renamed from: h */
        public final List<FacetModel> f94782h;
        @C12579k

        /* renamed from: i */
        public final List<ProductListFilter> f94783i;
        @C12580l

        /* renamed from: j */
        public final Pair<String, String> f94784j;
        @C12580l

        /* renamed from: k */
        public final RequestType f94785k;
        @C12580l

        /* renamed from: l */
        public final RequestType f94786l;

        /* renamed from: m */
        public final boolean f94787m;
        @C12580l

        /* renamed from: n */
        public final String f94788n;

        public C37766a(boolean z, int i, @C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l SortModel sortModel, @C12580l List<FacetModel> list, @C12579k List<? extends ProductListFilter> list2, @C12580l Pair<String, String> pair, @C12580l RequestType requestType, @C12580l RequestType requestType2, boolean z2, @C12580l String str4) {
            Intrinsics.checkNotNullParameter(list2, "filter");
            this.f94775a = z;
            this.f94776b = i;
            this.f94777c = num;
            this.f94778d = str;
            this.f94779e = str2;
            this.f94780f = str3;
            this.f94781g = sortModel;
            this.f94782h = list;
            this.f94783i = list2;
            this.f94784j = pair;
            this.f94785k = requestType;
            this.f94786l = requestType2;
            this.f94787m = z2;
            this.f94788n = str4;
        }

        /* renamed from: p */
        public static /* synthetic */ C37766a m154797p(C37766a aVar, boolean z, int i, Integer num, String str, String str2, String str3, SortModel sortModel, List list, List list2, Pair pair, RequestType requestType, RequestType requestType2, boolean z2, String str4, int i2, Object obj) {
            C37766a aVar2 = aVar;
            int i3 = i2;
            return aVar.mo115068o((i3 & 1) != 0 ? aVar2.f94775a : z, (i3 & 2) != 0 ? aVar2.f94776b : i, (i3 & 4) != 0 ? aVar2.f94777c : num, (i3 & 8) != 0 ? aVar2.f94778d : str, (i3 & 16) != 0 ? aVar2.f94779e : str2, (i3 & 32) != 0 ? aVar2.f94780f : str3, (i3 & 64) != 0 ? aVar2.f94781g : sortModel, (i3 & 128) != 0 ? aVar2.f94782h : list, (i3 & 256) != 0 ? aVar2.f94783i : list2, (i3 & 512) != 0 ? aVar2.f94784j : pair, (i3 & 1024) != 0 ? aVar2.f94785k : requestType, (i3 & 2048) != 0 ? aVar2.f94786l : requestType2, (i3 & 4096) != 0 ? aVar2.f94787m : z2, (i3 & 8192) != 0 ? aVar2.f94788n : str4);
        }

        @C12580l
        /* renamed from: A */
        public final RequestType mo115048A() {
            return this.f94786l;
        }

        @C12580l
        /* renamed from: B */
        public final SortModel mo115049B() {
            return this.f94781g;
        }

        /* renamed from: C */
        public final int mo115050C() {
            return this.f94776b;
        }

        /* renamed from: D */
        public final boolean mo115051D() {
            return this.f94787m;
        }

        /* renamed from: a */
        public final boolean mo115052a() {
            return this.f94775a;
        }

        @C12580l
        /* renamed from: b */
        public final Pair<String, String> mo115053b() {
            return this.f94784j;
        }

        @C12580l
        /* renamed from: c */
        public final RequestType mo115054c() {
            return this.f94785k;
        }

        @C12580l
        /* renamed from: d */
        public final RequestType mo115055d() {
            return this.f94786l;
        }

        /* renamed from: e */
        public final boolean mo115056e() {
            return this.f94787m;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37766a)) {
                return false;
            }
            C37766a aVar = (C37766a) obj;
            return this.f94775a == aVar.f94775a && this.f94776b == aVar.f94776b && Intrinsics.areEqual((Object) this.f94777c, (Object) aVar.f94777c) && Intrinsics.areEqual((Object) this.f94778d, (Object) aVar.f94778d) && Intrinsics.areEqual((Object) this.f94779e, (Object) aVar.f94779e) && Intrinsics.areEqual((Object) this.f94780f, (Object) aVar.f94780f) && Intrinsics.areEqual((Object) this.f94781g, (Object) aVar.f94781g) && Intrinsics.areEqual((Object) this.f94782h, (Object) aVar.f94782h) && Intrinsics.areEqual((Object) this.f94783i, (Object) aVar.f94783i) && Intrinsics.areEqual((Object) this.f94784j, (Object) aVar.f94784j) && this.f94785k == aVar.f94785k && this.f94786l == aVar.f94786l && this.f94787m == aVar.f94787m && Intrinsics.areEqual((Object) this.f94788n, (Object) aVar.f94788n);
        }

        @C12580l
        /* renamed from: f */
        public final String mo115058f() {
            return this.f94788n;
        }

        /* renamed from: g */
        public final int mo115059g() {
            return this.f94776b;
        }

        @C12580l
        /* renamed from: h */
        public final Integer mo115060h() {
            return this.f94777c;
        }

        public int hashCode() {
            boolean z = this.f94775a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((z ? 1 : 0) * true) + Integer.hashCode(this.f94776b)) * 31;
            Integer num = this.f94777c;
            int i = 0;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f94778d;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f94779e;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f94780f;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            SortModel sortModel = this.f94781g;
            int hashCode6 = (hashCode5 + (sortModel == null ? 0 : sortModel.hashCode())) * 31;
            List<FacetModel> list = this.f94782h;
            int hashCode7 = (((hashCode6 + (list == null ? 0 : list.hashCode())) * 31) + this.f94783i.hashCode()) * 31;
            Pair<String, String> pair = this.f94784j;
            int hashCode8 = (hashCode7 + (pair == null ? 0 : pair.hashCode())) * 31;
            RequestType requestType = this.f94785k;
            int hashCode9 = (hashCode8 + (requestType == null ? 0 : requestType.hashCode())) * 31;
            RequestType requestType2 = this.f94786l;
            int hashCode10 = (hashCode9 + (requestType2 == null ? 0 : requestType2.hashCode())) * 31;
            boolean z3 = this.f94787m;
            if (!z3) {
                z2 = z3;
            }
            int i2 = (hashCode10 + (z2 ? 1 : 0)) * 31;
            String str4 = this.f94788n;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i2 + i;
        }

        @C12580l
        /* renamed from: i */
        public final String mo115062i() {
            return this.f94778d;
        }

        @C12580l
        /* renamed from: j */
        public final String mo115063j() {
            return this.f94779e;
        }

        @C12580l
        /* renamed from: k */
        public final String mo115064k() {
            return this.f94780f;
        }

        @C12580l
        /* renamed from: l */
        public final SortModel mo115065l() {
            return this.f94781g;
        }

        @C12580l
        /* renamed from: m */
        public final List<FacetModel> mo115066m() {
            return this.f94782h;
        }

        @C12579k
        /* renamed from: n */
        public final List<ProductListFilter> mo115067n() {
            return this.f94783i;
        }

        @C12579k
        /* renamed from: o */
        public final C37766a mo115068o(boolean z, int i, @C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l SortModel sortModel, @C12580l List<FacetModel> list, @C12579k List<? extends ProductListFilter> list2, @C12580l Pair<String, String> pair, @C12580l RequestType requestType, @C12580l RequestType requestType2, boolean z2, @C12580l String str4) {
            List<? extends ProductListFilter> list3 = list2;
            Intrinsics.checkNotNullParameter(list3, "filter");
            return new C37766a(z, i, num, str, str2, str3, sortModel, list, list3, pair, requestType, requestType2, z2, str4);
        }

        @C12580l
        /* renamed from: q */
        public final RequestType mo115069q() {
            return this.f94785k;
        }

        @C12580l
        /* renamed from: r */
        public final List<FacetModel> mo115070r() {
            return this.f94782h;
        }

        @C12580l
        /* renamed from: s */
        public final String mo115071s() {
            return this.f94788n;
        }

        @C12579k
        /* renamed from: t */
        public final List<ProductListFilter> mo115072t() {
            return this.f94783i;
        }

        @C12579k
        public String toString() {
            boolean z = this.f94775a;
            int i = this.f94776b;
            Integer num = this.f94777c;
            String str = this.f94778d;
            String str2 = this.f94779e;
            String str3 = this.f94780f;
            SortModel sortModel = this.f94781g;
            List<FacetModel> list = this.f94782h;
            List<ProductListFilter> list2 = this.f94783i;
            Pair<String, String> pair = this.f94784j;
            RequestType requestType = this.f94785k;
            RequestType requestType2 = this.f94786l;
            boolean z2 = this.f94787m;
            String str4 = this.f94788n;
            return "Params(hasFidCard=" + z + ", startResult=" + i + ", productSize=" + num + ", queryId=" + str + ", queryGroup=" + str2 + ", searchedText=" + str3 + ", sortOrder=" + sortModel + ", facets=" + list + ", filter=" + list2 + ", filterParams=" + pair + ", basketRequestType=" + requestType + ", shoppingListRequestType=" + requestType2 + ", isPromo=" + z2 + ", facilityServiceId=" + str4 + ")";
        }

        @C12580l
        /* renamed from: u */
        public final Pair<String, String> mo115074u() {
            return this.f94784j;
        }

        /* renamed from: v */
        public final boolean mo115075v() {
            return this.f94775a;
        }

        @C12580l
        /* renamed from: w */
        public final Integer mo115076w() {
            return this.f94777c;
        }

        @C12580l
        /* renamed from: x */
        public final String mo115077x() {
            return this.f94779e;
        }

        @C12580l
        /* renamed from: y */
        public final String mo115078y() {
            return this.f94778d;
        }

        @C12580l
        /* renamed from: z */
        public final String mo115079z() {
            return this.f94780f;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C37766a(boolean r19, int r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, com.carrefour.fid.android.presentation.models.SortModel r25, java.util.List r26, java.util.List r27, kotlin.Pair r28, com.carrefour.fid.android.core.types.RequestType r29, com.carrefour.fid.android.core.types.RequestType r30, boolean r31, java.lang.String r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
            /*
                r18 = this;
                r0 = r33
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r6 = r2
                goto L_0x000b
            L_0x0009:
                r6 = r21
            L_0x000b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0011
                r7 = r2
                goto L_0x0013
            L_0x0011:
                r7 = r22
            L_0x0013:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0019
                r8 = r2
                goto L_0x001b
            L_0x0019:
                r8 = r23
            L_0x001b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0021
                r9 = r2
                goto L_0x0023
            L_0x0021:
                r9 = r24
            L_0x0023:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0029
                r10 = r2
                goto L_0x002b
            L_0x0029:
                r10 = r25
            L_0x002b:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0031
                r11 = r2
                goto L_0x0033
            L_0x0031:
                r11 = r26
            L_0x0033:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0039
                r13 = r2
                goto L_0x003b
            L_0x0039:
                r13 = r28
            L_0x003b:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x0043
                com.carrefour.fid.android.core.types.RequestType r1 = com.carrefour.fid.android.core.types.RequestType.NONE
                r14 = r1
                goto L_0x0045
            L_0x0043:
                r14 = r29
            L_0x0045:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L_0x004d
                com.carrefour.fid.android.core.types.RequestType r1 = com.carrefour.fid.android.core.types.RequestType.NONE
                r15 = r1
                goto L_0x004f
            L_0x004d:
                r15 = r30
            L_0x004f:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L_0x0057
                r1 = 0
                r16 = r1
                goto L_0x0059
            L_0x0057:
                r16 = r31
            L_0x0059:
                r0 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r0 == 0) goto L_0x0060
                r17 = r2
                goto L_0x0062
            L_0x0060:
                r17 = r32
            L_0x0062:
                r3 = r18
                r4 = r19
                r5 = r20
                r12 = r27
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase.C37766a.<init>(boolean, int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.presentation.models.SortModel, java.util.List, java.util.List, kotlin.Pair, com.carrefour.fid.android.core.types.RequestType, com.carrefour.fid.android.core.types.RequestType, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
