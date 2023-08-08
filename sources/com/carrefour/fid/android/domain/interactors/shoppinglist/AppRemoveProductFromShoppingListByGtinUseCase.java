package com.carrefour.fid.android.domain.interactors.shoppinglist;

import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37683d;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.repositories.ShoppingListRepository;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAppRemoveProductFromShoppingListByGtinUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRemoveProductFromShoppingListByGtinUseCase.kt\ncom/carrefour/fid/android/domain/interactors/shoppinglist/AppRemoveProductFromShoppingListByGtinUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public final class AppRemoveProductFromShoppingListByGtinUseCase implements C37683d {
    @C12579k

    /* renamed from: a */
    public final ShoppingListRepository f94925a;

    @Inject
    public AppRemoveProductFromShoppingListByGtinUseCase(@C12579k ShoppingListRepository shoppingListRepository) {
        Intrinsics.checkNotNullParameter(shoppingListRepository, "repository");
        this.f94925a = shoppingListRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo115275a(@org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListByGtinUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListByGtinUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListByGtinUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListByGtinUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListByGtinUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r7 = r0.L$0
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            r8.mo21858l()
            goto L_0x0073
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListByGtinUseCase r7 = (com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListByGtinUseCase) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x005d
        L_0x004c:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.repositories.ShoppingListRepository r8 = r6.f94925a
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r8.mo119618j(r7, r0)
            if (r7 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r8 = r6
        L_0x005d:
            boolean r2 = kotlin.Result.m38710j(r7)
            if (r2 == 0) goto L_0x0073
            r2 = r7
            kotlin.d2 r2 = (kotlin.C11079d2) r2
            com.carrefour.fid.android.domain.repositories.ShoppingListRepository r8 = r8.f94925a
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.mo119612d(r0)
            if (r8 != r1) goto L_0x0073
            return r1
        L_0x0073:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.shoppinglist.AppRemoveProductFromShoppingListByGtinUseCase.mo115275a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public /* bridge */ /* synthetic */ Object m173007invokegIAlus(Object obj, C11045c cVar) {
        return mo115275a(((Gtin) obj).mo118380i(), cVar);
    }
}
