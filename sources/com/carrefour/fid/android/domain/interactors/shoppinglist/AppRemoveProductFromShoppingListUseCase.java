package com.carrefour.fid.android.domain.interactors.shoppinglist;

import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37684e;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import com.carrefour.fid.android.domain.repositories.ShoppingListRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAppRemoveProductFromShoppingListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRemoveProductFromShoppingListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/shoppinglist/AppRemoveProductFromShoppingListUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class AppRemoveProductFromShoppingListUseCase implements C37684e {
    @C12579k

    /* renamed from: a */
    public final ShoppingListRepository f94926a;
    @C12579k

    /* renamed from: b */
    public final C37886i f94927b;

    @Inject
    public AppRemoveProductFromShoppingListUseCase(@C12579k ShoppingListRepository shoppingListRepository, @C12579k C37886i iVar) {
        Intrinsics.checkNotNullParameter(shoppingListRepository, "repository");
        Intrinsics.checkNotNullParameter(iVar, "isUserConnectedUseCase");
        this.f94926a = shoppingListRepository;
        this.f94927b = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173008invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0066
            if (r2 == r5) goto L_0x0050
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r8 = r0.L$0
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            r9.mo21858l()
            goto L_0x00b3
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003f:
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase r8 = (com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
        L_0x004c:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x0093
        L_0x0050:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r8 = (com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase r2 = (com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L_0x007b
        L_0x0066:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.user.i r9 = r7.f94927b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r2 = r9
            r9 = r8
            r8 = r7
        L_0x007b:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r2)
            if (r5 != 0) goto L_0x00a9
            kotlin.d2 r2 = (kotlin.C11079d2) r2
            com.carrefour.fid.android.domain.repositories.ShoppingListRepository r2 = r8.f94926a
            r0.L$0 = r8
            r5 = 0
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r9 = r2.mo119619k(r9, r0)
            if (r9 != r1) goto L_0x004c
            return r1
        L_0x0093:
            boolean r2 = kotlin.Result.m38710j(r8)
            if (r2 == 0) goto L_0x00b3
            r2 = r8
            kotlin.d2 r2 = (kotlin.C11079d2) r2
            com.carrefour.fid.android.domain.repositories.ShoppingListRepository r9 = r9.f94926a
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.mo119612d(r0)
            if (r9 != r1) goto L_0x00b3
            return r1
        L_0x00a9:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00b3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListUseCase.m173008invokegIAlus(com.carrefour.fid.android.domain.models.favorites.shoppinglist.c, kotlin.coroutines.c):java.lang.Object");
    }
}
