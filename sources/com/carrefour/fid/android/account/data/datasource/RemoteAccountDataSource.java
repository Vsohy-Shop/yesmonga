package com.carrefour.fid.android.account.data.datasource;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.service.C13209a;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UpdateUserAccessBody;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UserAccountResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi;
import com.carrefour.fid.android.shared.network.C28799a;
import com.carrefour.fid.android.shared.network.C28812h;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C8567o(parameters = 0)
public final class RemoteAccountDataSource {

    /* renamed from: e */
    public static final int f32340e = 8;
    @C12579k

    /* renamed from: a */
    public final C13209a f32341a;
    @C12579k

    /* renamed from: b */
    public final C28799a f32342b;
    @C12579k

    /* renamed from: c */
    public final BffCustomersManagementApi f32343c;
    @C12579k

    /* renamed from: d */
    public final C28812h f32344d;

    @Inject
    public RemoteAccountDataSource(@C12579k C13209a aVar, @C12579k C28799a aVar2, @C12579k BffCustomersManagementApi bffCustomersManagementApi, @C12579k C28812h hVar) {
        Intrinsics.checkNotNullParameter(aVar, "accountApiService");
        Intrinsics.checkNotNullParameter(aVar2, "accountHeaders");
        Intrinsics.checkNotNullParameter(bffCustomersManagementApi, "customerManagementApiService");
        Intrinsics.checkNotNullParameter(hVar, "tokenProvider");
        this.f32341a = aVar;
        this.f32342b = aVar2;
        this.f32343c = bffCustomersManagementApi;
        this.f32344d = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31138a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super retrofit2.C13091w<com.carrefour.fid.android.bff_data_shared.data.api.entities.AccountResponse>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$fetchUserInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$fetchUserInfo$1 r0 = (com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$fetchUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$fetchUserInfo$1 r0 = new com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$fetchUserInfo$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0067
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource r2 = (com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x004d
        L_0x003c:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.shared.network.h r7 = r6.f32344d
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.mo83891a(r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r6
        L_0x004d:
            com.carrefour.fid.android.shared.network.g r7 = (com.carrefour.fid.android.shared.network.C28811g) r7
            if (r7 == 0) goto L_0x0068
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi r2 = r2.f32343c
            java.lang.String r4 = r7.mo83886e()
            java.lang.String r7 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r7)
            r5 = 0
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r2.fetchUserInfo(r4, r7, r0)
            if (r7 != r1) goto L_0x0067
            return r1
        L_0x0067:
            return r7
        L_0x0068:
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r7 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource.mo31138a(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: b */
    public final Object mo31139b(@C12579k String str, @C12579k C11045c<? super C13091w<UserAccountResponse>> cVar) {
        return this.f32341a.mo31366b(str, C28799a.C28800a.m119221b(this.f32342b, false, 1, (Object) null), cVar);
    }

    /* renamed from: c */
    public final UpdateUserAccessBody mo31140c(String str, String str2) {
        UpdateUserAccessBody updateUserAccessBody = new UpdateUserAccessBody((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        updateUserAccessBody.setOldPassword(str);
        updateUserAccessBody.setNewPassword(str2);
        return updateUserAccessBody;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.List<com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31141d(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse> r9, @org.jetbrains.annotations.C12580l java.util.List<com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse> r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super retrofit2.C13091w<com.carrefour.fid.android.bff_data_shared.data.api.entities.UserAccountResponse>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateAddressesUser$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateAddressesUser$1 r0 = (com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateAddressesUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateAddressesUser$1 r0 = new com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateAddressesUser$1
            r0.<init>(r8, r11)
        L_0x0018:
            r6 = r0
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 == r3) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0090
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            java.lang.Object r9 = r6.L$2
            r10 = r9
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = r6.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r1 = r6.L$0
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource r1 = (com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource) r1
            kotlin.C11661u0.m45747n(r11)
            goto L_0x005b
        L_0x0046:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.shared.network.h r11 = r8.f32344d
            r6.L$0 = r8
            r6.L$1 = r9
            r6.L$2 = r10
            r6.label = r3
            java.lang.Object r11 = r11.mo83891a(r6)
            if (r11 != r0) goto L_0x005a
            return r0
        L_0x005a:
            r1 = r8
        L_0x005b:
            com.carrefour.fid.android.shared.network.g r11 = (com.carrefour.fid.android.shared.network.C28811g) r11
            if (r11 == 0) goto L_0x0091
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi r1 = r1.f32343c
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.UpdateAddressBody r4 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.UpdateAddressBody
            r5 = 3
            r7 = 0
            r4.<init>(r7, r7, r5, r7)
            r4.setAddresses(r9)
            if (r10 == 0) goto L_0x0074
            r4.setPhones(r10)
        L_0x0074:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            java.lang.String r9 = r11.mo83886e()
            java.lang.String r5 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r11)
            r6.L$0 = r7
            r6.L$1 = r7
            r6.L$2 = r7
            r6.label = r2
            r2 = r3
            r3 = r4
            r4 = r9
            java.lang.Object r11 = r1.updateAddresses(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L_0x0090
            return r0
        L_0x0090:
            return r11
        L_0x0091:
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r9 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource.mo31141d(java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31142e(@org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super retrofit2.C13091w<com.carrefour.fid.android.bff_data_shared.data.api.entities.UserAccountResponse>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateEmail$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateEmail$1 r0 = (com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateEmail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateEmail$1 r0 = new com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateEmail$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0073
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource r2 = (com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0053
        L_0x0040:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.shared.network.h r8 = r6.f32344d
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.mo83891a(r0)
            if (r8 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r6
        L_0x0053:
            com.carrefour.fid.android.shared.network.g r8 = (com.carrefour.fid.android.shared.network.C28811g) r8
            if (r8 == 0) goto L_0x0074
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi r2 = r2.f32343c
            com.carrefour.fid.android.bff_data_shared.data.api.entities.UpdateUserEmailBody r7 = com.carrefour.fid.android.account.data.entities.extentions.C13193o.m57174a(r7)
            java.lang.String r4 = r8.mo83886e()
            java.lang.String r8 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r8)
            r5 = 0
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r2.updateEmail(r7, r4, r8, r0)
            if (r8 != r1) goto L_0x0073
            return r1
        L_0x0073:
            return r8
        L_0x0074:
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r7 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource.mo31142e(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31143f(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.bff_data_shared.data.api.entities.AccountResponse r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super retrofit2.C13091w<com.carrefour.fid.android.bff_data_shared.data.api.entities.UserAccountResponse>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateInfoUser$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateInfoUser$1 r0 = (com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateInfoUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateInfoUser$1 r0 = new com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource$updateInfoUser$1
            r0.<init>(r7, r9)
        L_0x0018:
            r6 = r0
            java.lang.Object r9 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 == r3) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            kotlin.C11661u0.m45747n(r9)
            goto L_0x007a
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            java.lang.Object r8 = r6.L$1
            com.carrefour.fid.android.bff_data_shared.data.api.entities.AccountResponse r8 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.AccountResponse) r8
            java.lang.Object r1 = r6.L$0
            com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource r1 = (com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource) r1
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0054
        L_0x0041:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.shared.network.h r9 = r7.f32344d
            r6.L$0 = r7
            r6.L$1 = r8
            r6.label = r3
            java.lang.Object r9 = r9.mo83891a(r6)
            if (r9 != r0) goto L_0x0053
            return r0
        L_0x0053:
            r1 = r7
        L_0x0054:
            com.carrefour.fid.android.shared.network.g r9 = (com.carrefour.fid.android.shared.network.C28811g) r9
            if (r9 == 0) goto L_0x007b
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi r1 = r1.f32343c
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.UpdateAccountBody r8 = com.carrefour.fid.android.account.data.entities.extentions.C13191m.m57172a(r8)
            java.lang.String r4 = r9.mo83886e()
            java.lang.String r5 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r9)
            r9 = 0
            r6.L$0 = r9
            r6.L$1 = r9
            r6.label = r2
            r2 = r3
            r3 = r8
            java.lang.Object r9 = r1.updateInfo(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L_0x007a
            return r0
        L_0x007a:
            return r9
        L_0x007b:
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r8 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource.mo31143f(com.carrefour.fid.android.bff_data_shared.data.api.entities.AccountResponse, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: g */
    public final Object mo31144g(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k C11045c<? super C13091w<UserAccountResponse>> cVar) {
        return this.f32341a.mo31365a(str, mo31140c(str2, str3), C28799a.C28800a.m119220a(this.f32342b, true, false, 2, (Object) null), cVar);
    }
}
