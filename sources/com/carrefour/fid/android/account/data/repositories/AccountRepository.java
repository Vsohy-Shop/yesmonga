package com.carrefour.fid.android.account.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource;
import com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountRepository.kt\ncom/carrefour/fid/android/account/data/repositories/AccountRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,291:1\n1549#2:292\n1620#2,3:293\n1549#2:296\n1620#2,3:297\n288#2,2:300\n288#2,2:302\n1549#2:304\n1620#2,3:305\n53#3:308\n55#3:312\n50#4:309\n55#4:311\n106#5:310\n*S KotlinDebug\n*F\n+ 1 AccountRepository.kt\ncom/carrefour/fid/android/account/data/repositories/AccountRepository\n*L\n147#1:292\n147#1:293,3\n148#1:296\n148#1:297,3\n157#1:300,2\n158#1:302,2\n202#1:304\n202#1:305,3\n286#1:308\n286#1:312\n286#1:309\n286#1:311\n286#1:310\n*E\n"})
public final class AccountRepository {

    /* renamed from: c */
    public static final int f32373c = 8;
    @C12579k

    /* renamed from: a */
    public final LocalAccountDataSource f32374a;
    @C12579k

    /* renamed from: b */
    public final RemoteAccountDataSource f32375b;

    @Inject
    public AccountRepository(@C12579k LocalAccountDataSource localAccountDataSource, @C12579k RemoteAccountDataSource remoteAccountDataSource) {
        Intrinsics.checkNotNullParameter(localAccountDataSource, "localAccountDataSource");
        Intrinsics.checkNotNullParameter(remoteAccountDataSource, "remoteAccountDataSource");
        this.f32374a = localAccountDataSource;
        this.f32375b = remoteAccountDataSource;
    }

    /* renamed from: q */
    public static /* synthetic */ Object m57202q(AccountRepository accountRepository, List list, List list2, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = null;
        }
        return accountRepository.mo31331p(list, list2, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo31322g(@C12579k C11045c<? super C11079d2> cVar) {
        Object clear = this.f32374a.clear(cVar);
        return clear == C11063b.m42612h() ? clear : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31323h(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.account.AccountInfo>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchRemoteUserInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchRemoteUserInfo$1 r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchRemoteUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchRemoteUserInfo$1 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchRemoteUserInfo$1
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
            com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchRemoteUserInfo$2 r5 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchRemoteUserInfo$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31323h(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31324i(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.account.AccountInfo>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchUserInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchUserInfo$1 r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchUserInfo$1 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$fetchUserInfo$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0092
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003d:
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.account.data.repositories.AccountRepository r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository) r0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0069
        L_0x0045:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.account.data.repositories.AccountRepository r2 = (com.carrefour.fid.android.account.data.repositories.AccountRepository) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x005c
        L_0x004d:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.mo31327l(r0)
            if (r7 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r2 = r6
        L_0x005c:
            if (r7 == 0) goto L_0x0086
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r2.mo31327l(r0)
            if (r7 != r1) goto L_0x0069
            return r1
        L_0x0069:
            com.carrefour.fid.android.domain.models.account.AccountInfo r7 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r7
            if (r7 == 0) goto L_0x0074
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x0085
        L_0x0074:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.account.io.AccountThrowable r7 = new com.carrefour.fid.android.account.io.AccountThrowable
            java.lang.String r0 = "Unable to find user information"
            r7.<init>(r0)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x0085:
            return r7
        L_0x0086:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.mo31323h(r0)
            if (r7 != r1) goto L_0x0092
            return r1
        L_0x0092:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31324i(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31325j(@org.jetbrains.annotations.C12580l java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$forgotPassword$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.account.data.repositories.AccountRepository$forgotPassword$1 r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$forgotPassword$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$forgotPassword$1 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$forgotPassword$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x002d }
            goto L_0x0068
        L_0x002d:
            r7 = move-exception
            goto L_0x00a1
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            kotlin.C11661u0.m45747n(r8)
            if (r7 == 0) goto L_0x0046
            int r8 = r7.length()
            if (r8 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r8 = 0
            goto L_0x0047
        L_0x0046:
            r8 = r3
        L_0x0047:
            if (r8 == 0) goto L_0x005b
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.account.io.EmptyAccountThrowable r7 = new com.carrefour.fid.android.account.io.EmptyAccountThrowable
            java.lang.String r8 = "The login cannot be empty"
            r7.<init>(r8)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x005b:
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource r8 = r6.f32375b     // Catch:{ all -> 0x002d }
            r0.L$0 = r7     // Catch:{ all -> 0x002d }
            r0.label = r3     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = r8.mo31139b(r7, r0)     // Catch:{ all -> 0x002d }
            if (r8 != r1) goto L_0x0068
            return r1
        L_0x0068:
            retrofit2.w r8 = (retrofit2.C13091w) r8     // Catch:{ all -> 0x002d }
            boolean r8 = r8.mo30576g()     // Catch:{ all -> 0x002d }
            if (r8 == 0) goto L_0x007b
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x002d }
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)     // Catch:{ all -> 0x002d }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x00b9
        L_0x007b:
            kotlin.Result$a r8 = kotlin.Result.f28060a     // Catch:{ all -> 0x002d }
            com.carrefour.fid.android.account.io.LoginNotFoundThrowable r8 = new com.carrefour.fid.android.account.io.LoginNotFoundThrowable     // Catch:{ all -> 0x002d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r0.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r1 = "Problem when requesting forgot password, maybe the account does not exist for user '"
            r0.append(r1)     // Catch:{ all -> 0x002d }
            r0.append(r7)     // Catch:{ all -> 0x002d }
            java.lang.String r7 = "'"
            r0.append(r7)     // Catch:{ all -> 0x002d }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x002d }
            r8.<init>(r7)     // Catch:{ all -> 0x002d }
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r8)     // Catch:{ all -> 0x002d }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x00b9
        L_0x00a1:
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r1 = 0
            r3 = 0
            r4 = 5
            r5 = 0
            r2 = r7
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r7 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r7)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x00b9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31325j(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31326k(com.carrefour.fid.android.domain.models.account.Address r30, com.carrefour.fid.android.account.domain.models.DQEAddressDomain r31, kotlin.coroutines.C11045c<? super java.util.List<com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse>> r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = r32
            boolean r2 = r1 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$getAddresses$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.account.data.repositories.AccountRepository$getAddresses$1 r2 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$getAddresses$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$getAddresses$1 r2 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$getAddresses$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0048
            if (r4 != r5) goto L_0x0040
            java.lang.Object r3 = r2.L$3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse r3 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse) r3
            java.lang.Object r4 = r2.L$2
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r2.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.domain.models.account.Address r2 = (com.carrefour.fid.android.domain.models.account.Address) r2
            kotlin.C11661u0.m45747n(r1)
            r15 = r4
            r28 = r5
            goto L_0x0073
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            kotlin.C11661u0.m45747n(r1)
            java.util.List r4 = kotlin.collections.C10976s.m41417i()
            com.carrefour.fid.android.domain.models.account.Address r1 = com.carrefour.fid.android.account.domain.extension.C13242a.m57371a(r30, r31)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse r1 = com.carrefour.fid.android.account.domain.extension.C13242a.m57376f(r1)
            r4.add(r1)
            r6 = r30
            r2.L$0 = r6
            r2.L$1 = r4
            r2.L$2 = r4
            r2.L$3 = r1
            r2.label = r5
            java.lang.Object r2 = r0.mo31327l(r2)
            if (r2 != r3) goto L_0x006d
            return r3
        L_0x006d:
            r3 = r1
            r1 = r2
            r15 = r4
            r28 = r15
            r2 = r6
        L_0x0073:
            com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
            if (r1 != 0) goto L_0x0078
            goto L_0x00e2
        L_0x0078:
            java.util.List r1 = r1.mo116668v()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x008d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00a1
            java.lang.Object r5 = r1.next()
            com.carrefour.fid.android.domain.models.account.Address r5 = (com.carrefour.fid.android.domain.models.account.Address) r5
            com.carrefour.fid.android.domain.models.AddressCategory r5 = r5.mo116683H()
            r4.add(r5)
            goto L_0x008d
        L_0x00a1:
            com.carrefour.fid.android.domain.models.AddressCategory r1 = r2.mo116683H()
            com.carrefour.fid.android.domain.models.AddressCategory r2 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            if (r1 != r2) goto L_0x00e2
            com.carrefour.fid.android.domain.models.AddressCategory r1 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING
            boolean r2 = r4.contains(r1)
            if (r2 != 0) goto L_0x00e2
            java.lang.String r13 = r1.name()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r1 = 0
            r2 = r15
            r15 = r1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 3343615(0x3304ff, float:4.685403E-39)
            r27 = 0
            com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse r1 = com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2.add(r1)
        L_0x00e2:
            java.util.List r1 = kotlin.collections.C10976s.m41409a(r28)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31326k(com.carrefour.fid.android.domain.models.account.Address, com.carrefour.fid.android.account.domain.models.DQEAddressDomain, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31327l(kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.account.AccountInfo> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$getCachedUserInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.data.repositories.AccountRepository$getCachedUserInfo$1 r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$getCachedUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$getCachedUserInfo$1 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$getCachedUserInfo$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0051
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0046
        L_0x0038:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource r6 = r5.f32374a
            r0.label = r4
            java.lang.Object r6 = r6.mo31122b(r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C11907e) r6
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.C11909g.m47501w0(r6, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            com.carrefour.fid.android.UserInfo r6 = (com.carrefour.fid.android.UserInfo) r6
            if (r6 == 0) goto L_0x005a
            com.carrefour.fid.android.domain.models.account.AccountInfo r6 = com.carrefour.fid.android.account.data.entities.extentions.C13188k.m57161a(r6)
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31327l(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31328m(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.account.UserCards> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$getCardFid$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.account.data.repositories.AccountRepository$getCardFid$1 r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$getCardFid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$getCardFid$1 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$getCardFid$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            r0.label = r3
            java.lang.Object r5 = r4.mo31327l(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            if (r5 == 0) goto L_0x0046
            java.util.List r5 = r5.mo116669w()
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            com.carrefour.fid.android.domain.models.account.UserCards r5 = com.carrefour.fid.android.account.domain.extension.C13242a.m57372b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31328m(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: n */
    public final Object mo31329n(@C12579k C11045c<? super AccountInfo> cVar) {
        return mo31327l(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31330o(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<com.carrefour.fid.android.domain.models.account.AccountInfo>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$1 r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$1 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource r5 = r4.f32374a
            r0.label = r3
            java.lang.Object r5 = r5.mo31122b(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            kotlinx.coroutines.flow.e r5 = (kotlinx.coroutines.flow.C11907e) r5
            com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$$inlined$map$1 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$getUserUpdates$$inlined$map$1
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31330o(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.carrefour.fid.android.domain.models.account.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.carrefour.fid.android.domain.models.account.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.carrefour.fid.android.domain.models.account.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.carrefour.fid.android.domain.models.account.Address} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.carrefour.fid.android.domain.models.account.Address} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31331p(@org.jetbrains.annotations.C12580l java.util.List<com.carrefour.fid.android.domain.models.account.Address> r9, @org.jetbrains.annotations.C12580l java.util.List<com.carrefour.fid.android.domain.models.account.Phone> r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r8 = this;
            com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource r0 = r8.f32374a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r9 == 0) goto L_0x002d
            r4 = r9
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x000e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0029
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.carrefour.fid.android.domain.models.account.Address r6 = (com.carrefour.fid.android.domain.models.account.Address) r6
            com.carrefour.fid.android.domain.models.AddressCategory r6 = r6.mo116683H()
            com.carrefour.fid.android.domain.models.AddressCategory r7 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            if (r6 != r7) goto L_0x0025
            r6 = r1
            goto L_0x0026
        L_0x0025:
            r6 = r2
        L_0x0026:
            if (r6 == 0) goto L_0x000e
            goto L_0x002a
        L_0x0029:
            r5 = r3
        L_0x002a:
            com.carrefour.fid.android.domain.models.account.Address r5 = (com.carrefour.fid.android.domain.models.account.Address) r5
            goto L_0x002e
        L_0x002d:
            r5 = r3
        L_0x002e:
            if (r9 == 0) goto L_0x0053
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x0036:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0051
            java.lang.Object r4 = r9.next()
            r6 = r4
            com.carrefour.fid.android.domain.models.account.Address r6 = (com.carrefour.fid.android.domain.models.account.Address) r6
            com.carrefour.fid.android.domain.models.AddressCategory r6 = r6.mo116683H()
            com.carrefour.fid.android.domain.models.AddressCategory r7 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING
            if (r6 != r7) goto L_0x004d
            r6 = r1
            goto L_0x004e
        L_0x004d:
            r6 = r2
        L_0x004e:
            if (r6 == 0) goto L_0x0036
            r3 = r4
        L_0x0051:
            com.carrefour.fid.android.domain.models.account.Address r3 = (com.carrefour.fid.android.domain.models.account.Address) r3
        L_0x0053:
            java.lang.Object r9 = r0.mo31127f(r5, r3, r10, r11)
            java.lang.Object r10 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r9 != r10) goto L_0x005e
            return r9
        L_0x005e:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31331p(java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31332r(com.carrefour.fid.android.domain.models.account.AccountInfo r5, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.account.AccountInfo>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAccountInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAccountInfo$1 r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAccountInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAccountInfo$1 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAccountInfo$1
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
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAccountInfo$2 r6 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAccountInfo$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31332r(com.carrefour.fid.android.domain.models.account.AccountInfo, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31333s(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.account.Address> r6, @org.jetbrains.annotations.C12580l java.util.List<com.carrefour.fid.android.domain.models.account.Phone> r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddress$2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddress$2 r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddress$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddress$2 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddress$2
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.mo21858l()
            goto L_0x008e
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r8)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r4 = kotlin.collections.C10978t.m41495Y(r6, r2)
            r8.<init>(r4)
            java.util.Iterator r6 = r6.iterator()
        L_0x004b:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x005f
            java.lang.Object r4 = r6.next()
            com.carrefour.fid.android.domain.models.account.Address r4 = (com.carrefour.fid.android.domain.models.account.Address) r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse r4 = com.carrefour.fid.android.account.domain.extension.C13242a.m57376f(r4)
            r8.add(r4)
            goto L_0x004b
        L_0x005f:
            if (r7 == 0) goto L_0x0084
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            int r2 = kotlin.collections.C10978t.m41495Y(r7, r2)
            r6.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x0070:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r7.next()
            com.carrefour.fid.android.domain.models.account.Phone r2 = (com.carrefour.fid.android.domain.models.account.Phone) r2
            com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse r2 = com.carrefour.fid.android.account.domain.extension.C13242a.m57377g(r2)
            r6.add(r2)
            goto L_0x0070
        L_0x0084:
            r6 = 0
        L_0x0085:
            r0.label = r3
            java.lang.Object r6 = r5.mo31335u(r8, r6, r0)
            if (r6 != r1) goto L_0x008e
            return r1
        L_0x008e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31333s(java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31334t(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.account.Address r16, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.account.domain.models.DQEAddressDomain r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r19) {
        /*
            r15 = this;
            r0 = r15
            r1 = r19
            boolean r2 = r1 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddress$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddress$1 r2 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddress$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddress$1 r2 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddress$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x004b
            if (r4 == r6) goto L_0x003d
            if (r4 != r5) goto L_0x0035
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0094
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r2.L$0
            com.carrefour.fid.android.account.data.repositories.AccountRepository r7 = (com.carrefour.fid.android.account.data.repositories.AccountRepository) r7
            kotlin.C11661u0.m45747n(r1)
            r8 = r4
            r4 = r7
            goto L_0x0064
        L_0x004b:
            kotlin.C11661u0.m45747n(r1)
            r2.L$0 = r0
            r1 = r18
            r2.L$1 = r1
            r2.label = r6
            r4 = r16
            r7 = r17
            java.lang.Object r4 = r15.mo31326k(r4, r7, r2)
            if (r4 != r3) goto L_0x0061
            return r3
        L_0x0061:
            r8 = r1
            r1 = r4
            r4 = r0
        L_0x0064:
            java.util.List r1 = (java.util.List) r1
            int r7 = r8.length()
            if (r7 <= 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r6 = 0
        L_0x006e:
            if (r6 == 0) goto L_0x0082
            com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse r6 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 30
            r14 = 0
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            java.util.List r6 = kotlin.collections.C10976s.m41419k(r6)
            goto L_0x0086
        L_0x0082:
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0086:
            r7 = 0
            r2.L$0 = r7
            r2.L$1 = r7
            r2.label = r5
            java.lang.Object r1 = r4.mo31335u(r1, r6, r2)
            if (r1 != r3) goto L_0x0094
            return r3
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31334t(com.carrefour.fid.android.domain.models.account.Address, com.carrefour.fid.android.account.domain.models.DQEAddressDomain, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31335u(java.util.List<com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse> r5, java.util.List<com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse> r6, kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddresses$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddresses$1 r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddresses$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddresses$1 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddresses$1
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
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddresses$2 r7 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$updateAddresses$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31335u(java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31336v(@org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$updatePassword$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updatePassword$1 r0 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$updatePassword$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updatePassword$1 r0 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$updatePassword$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.mo21858l()
            goto L_0x0081
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.C11661u0.m45747n(r14)
            int r14 = r11.length()
            r2 = 0
            if (r14 != 0) goto L_0x0043
            r14 = r3
            goto L_0x0044
        L_0x0043:
            r14 = r2
        L_0x0044:
            if (r14 == 0) goto L_0x0058
            kotlin.Result$a r11 = kotlin.Result.f28060a
            com.carrefour.fid.android.account.io.EmptyAccountThrowable r11 = new com.carrefour.fid.android.account.io.EmptyAccountThrowable
            java.lang.String r12 = "The userUid cannot be empty"
            r11.<init>(r12)
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
            return r11
        L_0x0058:
            int r14 = r13.length()
            if (r14 != 0) goto L_0x0060
            r14 = r3
            goto L_0x0061
        L_0x0060:
            r14 = r2
        L_0x0061:
            if (r14 != 0) goto L_0x0082
            int r14 = r12.length()
            if (r14 != 0) goto L_0x006a
            r2 = r3
        L_0x006a:
            if (r2 == 0) goto L_0x006d
            goto L_0x0082
        L_0x006d:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updatePassword$2 r14 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$updatePassword$2
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r14, r0)
            if (r11 != r1) goto L_0x0081
            return r1
        L_0x0081:
            return r11
        L_0x0082:
            kotlin.Result$a r11 = kotlin.Result.f28060a
            com.carrefour.fid.android.account.io.EmptyAccountThrowable r11 = new com.carrefour.fid.android.account.io.EmptyAccountThrowable
            java.lang.String r12 = "The password cannot be empty"
            r11.<init>(r12)
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31336v(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31337w(@org.jetbrains.annotations.C12579k java.lang.String r23, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.account.AccountInfo>> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserEmail$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserEmail$1 r2 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserEmail$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserEmail$1 r2 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserEmail$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0051
            if (r4 == r6) goto L_0x003f
            if (r4 != r5) goto L_0x0037
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00a4
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r2.L$0
            com.carrefour.fid.android.account.data.repositories.AccountRepository r6 = (com.carrefour.fid.android.account.data.repositories.AccountRepository) r6
            kotlin.C11661u0.m45747n(r1)
            r15 = r6
            r21 = r4
            r4 = r1
            r1 = r21
            goto L_0x0064
        L_0x0051:
            kotlin.C11661u0.m45747n(r1)
            r2.L$0 = r0
            r1 = r23
            r2.L$1 = r1
            r2.label = r6
            java.lang.Object r4 = r0.mo31327l(r2)
            if (r4 != r3) goto L_0x0063
            return r3
        L_0x0063:
            r15 = r0
        L_0x0064:
            r6 = r4
            com.carrefour.fid.android.domain.models.account.AccountInfo r6 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r6
            if (r6 != 0) goto L_0x0079
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r1 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x0079:
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r4 = 0
            r16 = 0
            r18 = 0
            r19 = 2046(0x7fe, float:2.867E-42)
            r20 = 0
            r7 = r1
            r5 = r15
            r15 = r4
            com.carrefour.fid.android.domain.models.account.AccountInfo r4 = com.carrefour.fid.android.domain.models.account.AccountInfo.m155841m(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20)
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserEmail$2 r6 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserEmail$2
            r7 = 0
            r6.<init>(r5, r1, r4, r7)
            r2.L$0 = r7
            r2.L$1 = r7
            r1 = 2
            r2.label = r1
            java.lang.Object r1 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r2)
            if (r1 != r3) goto L_0x00a4
            return r3
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31337w(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31338x(@org.jetbrains.annotations.C12579k java.lang.String r23, @org.jetbrains.annotations.C12579k java.lang.String r24, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.account.CivilityTitle r25, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.account.AccountInfo>> r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r26
            boolean r2 = r1 instanceof com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserInfo$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserInfo$1 r2 = (com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserInfo$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserInfo$1 r2 = new com.carrefour.fid.android.account.data.repositories.AccountRepository$updateUserInfo$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0057
            if (r4 == r6) goto L_0x003f
            if (r4 != r5) goto L_0x0037
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00b0
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            java.lang.Object r4 = r2.L$3
            com.carrefour.fid.android.domain.models.account.CivilityTitle r4 = (com.carrefour.fid.android.domain.models.account.CivilityTitle) r4
            java.lang.Object r6 = r2.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.account.data.repositories.AccountRepository r8 = (com.carrefour.fid.android.account.data.repositories.AccountRepository) r8
            kotlin.C11661u0.m45747n(r1)
            r12 = r4
            r10 = r6
            r9 = r7
            r4 = r8
            goto L_0x0076
        L_0x0057:
            kotlin.C11661u0.m45747n(r1)
            r2.L$0 = r0
            r1 = r23
            r2.L$1 = r1
            r4 = r24
            r2.L$2 = r4
            r7 = r25
            r2.L$3 = r7
            r2.label = r6
            java.lang.Object r6 = r0.mo31327l(r2)
            if (r6 != r3) goto L_0x0071
            return r3
        L_0x0071:
            r9 = r1
            r10 = r4
            r1 = r6
            r12 = r7
            r4 = r0
        L_0x0076:
            r7 = r1
            com.carrefour.fid.android.domain.models.account.AccountInfo r7 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r7
            if (r7 != 0) goto L_0x008b
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r1 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x008b:
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 2025(0x7e9, float:2.838E-42)
            r21 = 0
            com.carrefour.fid.android.domain.models.account.AccountInfo r1 = com.carrefour.fid.android.domain.models.account.AccountInfo.m155841m(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21)
            r6 = 0
            r2.L$0 = r6
            r2.L$1 = r6
            r2.L$2 = r6
            r2.L$3 = r6
            r2.label = r5
            java.lang.Object r1 = r4.mo31332r(r1, r2)
            if (r1 != r3) goto L_0x00b0
            return r3
        L_0x00b0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.repositories.AccountRepository.mo31338x(java.lang.String, java.lang.String, com.carrefour.fid.android.domain.models.account.CivilityTitle, kotlin.coroutines.c):java.lang.Object");
    }
}
