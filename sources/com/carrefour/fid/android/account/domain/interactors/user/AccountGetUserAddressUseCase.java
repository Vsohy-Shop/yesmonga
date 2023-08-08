package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.user.C37875c;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.models.account.Address;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAccountGetUserAddressUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountGetUserAddressUseCase.kt\ncom/carrefour/fid/android/account/domain/interactors/user/AccountGetUserAddressUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n533#2,6:21\n*S KotlinDebug\n*F\n+ 1 AccountGetUserAddressUseCase.kt\ncom/carrefour/fid/android/account/domain/interactors/user/AccountGetUserAddressUseCase\n*L\n15#1:21,6\n*E\n"})
public final class AccountGetUserAddressUseCase implements C37679f<C37875c.C37876a, Address>, C37875c {
    @C12579k

    /* renamed from: a */
    public final C37878e f32633a;

    @Inject
    public AccountGetUserAddressUseCase(@C12579k C37878e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        this.f32633a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053 A[SYNTHETIC, Splitter:B:17:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172738invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.user.C37875c.C37876a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.account.Address>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserAddressUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserAddressUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserAddressUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserAddressUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserAddressUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.domain.interactors.user.c$a r5 = (com.carrefour.fid.android.domain.interactors.user.C37875c.C37876a) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004d
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.user.e r6 = r4.f32633a
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m172966invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            boolean r0 = kotlin.Result.m38710j(r6)
            if (r0 == 0) goto L_0x00a4
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0098 }
            com.carrefour.fid.android.domain.models.account.AccountInfo r6 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r6     // Catch:{ all -> 0x0098 }
            java.util.List r6 = r6.mo116668v()     // Catch:{ all -> 0x0098 }
            int r0 = r6.size()     // Catch:{ all -> 0x0098 }
            java.util.ListIterator r6 = r6.listIterator(r0)     // Catch:{ all -> 0x0098 }
        L_0x0063:
            boolean r0 = r6.hasPrevious()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r6.previous()     // Catch:{ all -> 0x0098 }
            r1 = r0
            com.carrefour.fid.android.domain.models.account.Address r1 = (com.carrefour.fid.android.domain.models.account.Address) r1     // Catch:{ all -> 0x0098 }
            boolean r2 = r1.mo116695T()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0082
            com.carrefour.fid.android.domain.models.AddressCategory r1 = r1.mo116683H()     // Catch:{ all -> 0x0098 }
            com.carrefour.fid.android.domain.models.AddressCategory r2 = r5.mo115360d()     // Catch:{ all -> 0x0098 }
            if (r1 != r2) goto L_0x0082
            r1 = r3
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            if (r1 == 0) goto L_0x0063
            goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            com.carrefour.fid.android.domain.models.account.Address r0 = (com.carrefour.fid.android.domain.models.account.Address) r0     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0090
            java.lang.Object r5 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0098 }
            goto L_0x00a8
        L_0x0090:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0098 }
            java.lang.String r6 = "Can't retrieve Account info or address"
            r5.<init>(r6)     // Catch:{ all -> 0x0098 }
            throw r5     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x00a8
        L_0x00a4:
            java.lang.Object r5 = kotlin.Result.m38702b(r6)
        L_0x00a8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserAddressUseCase.m172738invokegIAlus(com.carrefour.fid.android.domain.interactors.user.c$a, kotlin.coroutines.c):java.lang.Object");
    }
}
