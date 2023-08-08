package com.carrefour.fid.android.data.datasource;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.provider.headers.C36581w;
import com.carrefour.fid.android.data.service.C36636o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class ShoppingListDataSource {

    /* renamed from: c */
    public static final int f90025c = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C36636o f90026a;
    @C12579k

    /* renamed from: b */
    public final C36581w f90027b;

    @Inject
    public ShoppingListDataSource(@C12579k C36636o oVar, @C12579k C36581w wVar) {
        Intrinsics.checkNotNullParameter(oVar, "service");
        Intrinsics.checkNotNullParameter(wVar, "shoppingListsHeaders");
        this.f90026a = oVar;
        this.f90027b = wVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108683e(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.data.entities.ShoppingListItemToAddRequest r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.datasource.ShoppingListDataSource$add$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$add$1 r0 = (com.carrefour.fid.android.data.datasource.ShoppingListDataSource$add$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$add$1 r0 = new com.carrefour.fid.android.data.datasource.ShoppingListDataSource$add$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$add$2 r7 = new com.carrefour.fid.android.data.datasource.ShoppingListDataSource$add$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.ShoppingListDataSource.mo108683e(java.lang.String, com.carrefour.fid.android.data.entities.ShoppingListItemToAddRequest, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108684f(kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.datasource.ShoppingListDataSource$createShoppingList$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$createShoppingList$1 r0 = (com.carrefour.fid.android.data.datasource.ShoppingListDataSource$createShoppingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$createShoppingList$1 r0 = new com.carrefour.fid.android.data.datasource.ShoppingListDataSource$createShoppingList$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$createShoppingList$2 r5 = new com.carrefour.fid.android.data.datasource.ShoppingListDataSource$createShoppingList$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.ShoppingListDataSource.mo108684f(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108685g(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingList$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingList$1 r0 = (com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingList$1 r0 = new com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingList$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingList$2 r5 = new com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingList$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.ShoppingListDataSource.mo108685g(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108686h(java.lang.String r5, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingListContent$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingListContent$1 r0 = (com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingListContent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingListContent$1 r0 = new com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingListContent$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingListContent$2 r6 = new com.carrefour.fid.android.data.datasource.ShoppingListDataSource$getShoppingListContent$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.ShoppingListDataSource.mo108686h(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108687i(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.datasource.ShoppingListDataSource$remove$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$remove$1 r0 = (com.carrefour.fid.android.data.datasource.ShoppingListDataSource$remove$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$remove$1 r0 = new com.carrefour.fid.android.data.datasource.ShoppingListDataSource$remove$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.datasource.ShoppingListDataSource$remove$2 r7 = new com.carrefour.fid.android.data.datasource.ShoppingListDataSource$remove$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.ShoppingListDataSource.mo108687i(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
