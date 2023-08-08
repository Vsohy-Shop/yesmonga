package com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet;

import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel$onAddToFavorites$1", mo22502f = "AlternativeProductsBottomSheetViewModel.kt", mo22503i = {}, mo22504l = {74, 75, 77, 78}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAlternativeProductsBottomSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlternativeProductsBottomSheetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/bottomsheet/AlternativeProductsBottomSheetViewModel$onAddToFavorites$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class AlternativeProductsBottomSheetViewModel$onAddToFavorites$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ boolean $isInShoppingList;
    final /* synthetic */ C38115c $product;
    Object L$0;
    int label;
    final /* synthetic */ AlternativeProductsBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlternativeProductsBottomSheetViewModel$onAddToFavorites$1(boolean z, AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel, C38115c cVar, C11045c<? super AlternativeProductsBottomSheetViewModel$onAddToFavorites$1> cVar2) {
        super(2, cVar2);
        this.$isInShoppingList = z;
        this.this$0 = alternativeProductsBottomSheetViewModel;
        this.$product = cVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AlternativeProductsBottomSheetViewModel$onAddToFavorites$1(this.$isInShoppingList, this.this$0, this.$product, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r5) goto L_0x002b
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            goto L_0x0027
        L_0x0015:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001d:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0079
        L_0x0027:
            kotlin.C11661u0.m45747n(r7)
            goto L_0x008c
        L_0x002b:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0051
        L_0x0035:
            kotlin.C11661u0.m45747n(r7)
            boolean r7 = r6.$isInShoppingList
            if (r7 == 0) goto L_0x0064
            com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel r7 = r6.this$0
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.e r7 = r7.f68068c
            com.carrefour.fid.android.domain.models.product.plp.c r1 = r6.$product
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r1 = com.carrefour.fid.android.domain.models.favorites.shoppinglist.extensions.C38036a.m156828b(r1)
            r6.label = r5
            java.lang.Object r7 = r7.m172966invokegIAlus(r1, r6)
            if (r7 != r0) goto L_0x0051
            return r0
        L_0x0051:
            com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel r1 = r6.this$0
            java.lang.Throwable r2 = kotlin.Result.m38705e(r7)
            if (r2 == 0) goto L_0x008c
            r6.L$0 = r7
            r6.label = r4
            java.lang.Object r7 = r1.mo81689n0(r2, r6)
            if (r7 != r0) goto L_0x008c
            return r0
        L_0x0064:
            com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel r7 = r6.this$0
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.a r7 = r7.f68067b
            com.carrefour.fid.android.domain.models.product.plp.c r1 = r6.$product
            com.carrefour.fid.android.domain.models.favorites.shoppinglist.c r1 = com.carrefour.fid.android.domain.models.favorites.shoppinglist.extensions.C38036a.m156828b(r1)
            r6.label = r3
            java.lang.Object r7 = r7.m172966invokegIAlus(r1, r6)
            if (r7 != r0) goto L_0x0079
            return r0
        L_0x0079:
            com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel r1 = r6.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r7)
            if (r3 == 0) goto L_0x008c
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r7 = r1.mo81689n0(r3, r6)
            if (r7 != r0) goto L_0x008c
            return r0
        L_0x008c:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel$onAddToFavorites$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AlternativeProductsBottomSheetViewModel$onAddToFavorites$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
