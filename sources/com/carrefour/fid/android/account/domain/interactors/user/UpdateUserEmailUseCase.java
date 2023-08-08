package com.carrefour.fid.android.account.domain.interactors.user;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class UpdateUserEmailUseCase implements C37679f<C13269a, C11079d2> {
    @C12579k

    /* renamed from: a */
    public final LoginRepository f32637a;
    @C12579k

    /* renamed from: b */
    public final AccountRepository f32638b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase$a */
    public static final class C13269a {

        /* renamed from: b */
        public static final int f32639b = 0;
        @C12579k

        /* renamed from: a */
        public final String f32640a;

        public C13269a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "email");
            this.f32640a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C13269a m57478c(C13269a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f32640a;
            }
            return aVar.mo31486b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo31485a() {
            return this.f32640a;
        }

        @C12579k
        /* renamed from: b */
        public final C13269a mo31486b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "email");
            return new C13269a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo31487d() {
            return this.f32640a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13269a) && Intrinsics.areEqual((Object) this.f32640a, (Object) ((C13269a) obj).f32640a);
        }

        public int hashCode() {
            return this.f32640a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f32640a;
            return "Params(email=" + str + ")";
        }
    }

    @Inject
    public UpdateUserEmailUseCase(@C12579k LoginRepository loginRepository, @C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        this.f32637a = loginRepository;
        this.f32638b = accountRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172742invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase.C13269a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0074
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase r6 = (com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase) r6
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0057
        L_0x0042:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.account.data.repositories.AccountRepository r7 = r5.f32638b
            java.lang.String r6 = r6.mo31487d()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.mo31337w(r6, r0)
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r6 = r5
        L_0x0057:
            boolean r2 = kotlin.Result.m38710j(r7)
            if (r2 == 0) goto L_0x0080
            kotlin.Result$a r2 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.account.AccountInfo r7 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r7
            com.carrefour.fid.android.account.data.repositories.LoginRepository r7 = r6.f32637a
            r7.mo31349a()
            com.carrefour.fid.android.account.data.repositories.AccountRepository r6 = r6.f32638b
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.mo31322g(r0)
            if (r6 != r1) goto L_0x0074
            return r1
        L_0x0074:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            kotlin.Result.m38702b(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x0084
        L_0x0080:
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
        L_0x0084:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase.m172742invokegIAlus(com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
