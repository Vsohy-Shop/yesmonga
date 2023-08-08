package com.carrefour.fid.android.domain.interactors.shoppinglist;

import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.repositories.ShoppingListRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class AppGetShoppingListUseCase implements C37681b {
    @C12579k

    /* renamed from: a */
    public final ShoppingListRepository f94921a;

    /* renamed from: com.carrefour.fid.android.domain.interactors.shoppinglist.AppGetShoppingListUseCase$a */
    public /* synthetic */ class C37843a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.core.types.RequestType[] r0 = com.carrefour.fid.android.core.types.RequestType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.core.types.RequestType r1 = com.carrefour.fid.android.core.types.RequestType.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.core.types.RequestType r1 = com.carrefour.fid.android.core.types.RequestType.OFFLINE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.core.types.RequestType r1 = com.carrefour.fid.android.core.types.RequestType.ONLINE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.shoppinglist.AppGetShoppingListUseCase.C37843a.<clinit>():void");
        }
    }

    @Inject
    public AppGetShoppingListUseCase(@C12579k ShoppingListRepository shoppingListRepository) {
        Intrinsics.checkNotNullParameter(shoppingListRepository, "repository");
        this.f94921a = shoppingListRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173006invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.core.types.RequestType r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.shoppinglist.AppGetShoppingListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.shoppinglist.AppGetShoppingListUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.shoppinglist.AppGetShoppingListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.shoppinglist.AppGetShoppingListUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.shoppinglist.AppGetShoppingListUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0061
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0073
        L_0x0044:
            kotlin.C11661u0.m45747n(r7)
            int[] r7 = com.carrefour.fid.android.domain.interactors.shoppinglist.AppGetShoppingListUseCase.C37843a.$EnumSwitchMapping$0
            int r2 = r6.ordinal()
            r7 = r7[r2]
            if (r7 == r4) goto L_0x0074
            if (r7 == r3) goto L_0x0068
            r6 = 3
            if (r7 != r6) goto L_0x0062
            com.carrefour.fid.android.domain.repositories.ShoppingListRepository r6 = r5.f94921a
            r0.label = r3
            java.lang.Object r6 = r6.mo119612d(r0)
            if (r6 != r1) goto L_0x0061
            return r1
        L_0x0061:
            return r6
        L_0x0062:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x0068:
            com.carrefour.fid.android.domain.repositories.ShoppingListRepository r6 = r5.f94921a
            r0.label = r4
            java.lang.Object r6 = r6.mo119615g(r0)
            if (r6 != r1) goto L_0x0073
            return r1
        L_0x0073:
            return r6
        L_0x0074:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Throwable r7 = new java.lang.Throwable
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot retrieve ShoppingList for "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.shoppinglist.AppGetShoppingListUseCase.m173006invokegIAlus(com.carrefour.fid.android.core.types.RequestType, kotlin.coroutines.c):java.lang.Object");
    }
}
