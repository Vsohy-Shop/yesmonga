package com.carrefour.fid.android.account.domain.interactors.user;

import androidx.autofill.C0861a;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class UpdateUserPasswordUseCase implements C37679f<C13271a, Boolean> {
    @C12579k

    /* renamed from: a */
    public final LoginRepository f32646a;
    @C12579k

    /* renamed from: b */
    public final AccountRepository f32647b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase$a */
    public static final class C13271a {

        /* renamed from: c */
        public static final int f32648c = 0;
        @C12579k

        /* renamed from: a */
        public final String f32649a;
        @C12579k

        /* renamed from: b */
        public final String f32650b;

        public C13271a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "oldPassword");
            Intrinsics.checkNotNullParameter(str2, C0861a.f2694F);
            this.f32649a = str;
            this.f32650b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C13271a m57492d(C13271a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f32649a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f32650b;
            }
            return aVar.mo31505c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo31503a() {
            return this.f32649a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo31504b() {
            return this.f32650b;
        }

        @C12579k
        /* renamed from: c */
        public final C13271a mo31505c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "oldPassword");
            Intrinsics.checkNotNullParameter(str2, C0861a.f2694F);
            return new C13271a(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo31506e() {
            return this.f32650b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13271a)) {
                return false;
            }
            C13271a aVar = (C13271a) obj;
            return Intrinsics.areEqual((Object) this.f32649a, (Object) aVar.f32649a) && Intrinsics.areEqual((Object) this.f32650b, (Object) aVar.f32650b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo31508f() {
            return this.f32649a;
        }

        public int hashCode() {
            return (this.f32649a.hashCode() * 31) + this.f32650b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f32649a;
            String str2 = this.f32650b;
            return "Params(oldPassword=" + str + ", newPassword=" + str2 + ")";
        }
    }

    @Inject
    public UpdateUserPasswordUseCase(@C12579k LoginRepository loginRepository, @C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        this.f32646a = loginRepository;
        this.f32647b = accountRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172744invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase.C13271a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.account.data.repositories.AccountRepository r7 = r5.f32647b
            com.carrefour.fid.android.account.data.repositories.LoginRepository r2 = r5.f32646a
            java.lang.String r2 = r2.mo31352d()
            java.lang.String r4 = r6.mo31508f()
            java.lang.String r6 = r6.mo31506e()
            r0.label = r3
            java.lang.Object r6 = r7.mo31336v(r2, r4, r6, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase.m172744invokegIAlus(com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
