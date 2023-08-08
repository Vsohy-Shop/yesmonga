package com.carrefour.fid.android.account.domain.interactors.user;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.CivilityTitle;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class UpdateUserInfoUseCase implements C37679f<C13270a, AccountInfo> {
    @C12579k

    /* renamed from: a */
    public final AccountRepository f32641a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase$a */
    public static final class C13270a {

        /* renamed from: d */
        public static final int f32642d = 0;
        @C12579k

        /* renamed from: a */
        public final String f32643a;
        @C12579k

        /* renamed from: b */
        public final String f32644b;
        @C12579k

        /* renamed from: c */
        public final CivilityTitle f32645c;

        public C13270a(@C12579k String str, @C12579k String str2, @C12579k CivilityTitle civilityTitle) {
            Intrinsics.checkNotNullParameter(str, "firstName");
            Intrinsics.checkNotNullParameter(str2, "lastName");
            Intrinsics.checkNotNullParameter(civilityTitle, "civilityTitle");
            this.f32643a = str;
            this.f32644b = str2;
            this.f32645c = civilityTitle;
        }

        /* renamed from: e */
        public static /* synthetic */ C13270a m57483e(C13270a aVar, String str, String str2, CivilityTitle civilityTitle, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f32643a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f32644b;
            }
            if ((i & 4) != 0) {
                civilityTitle = aVar.f32645c;
            }
            return aVar.mo31495d(str, str2, civilityTitle);
        }

        @C12579k
        /* renamed from: a */
        public final String mo31492a() {
            return this.f32643a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo31493b() {
            return this.f32644b;
        }

        @C12579k
        /* renamed from: c */
        public final CivilityTitle mo31494c() {
            return this.f32645c;
        }

        @C12579k
        /* renamed from: d */
        public final C13270a mo31495d(@C12579k String str, @C12579k String str2, @C12579k CivilityTitle civilityTitle) {
            Intrinsics.checkNotNullParameter(str, "firstName");
            Intrinsics.checkNotNullParameter(str2, "lastName");
            Intrinsics.checkNotNullParameter(civilityTitle, "civilityTitle");
            return new C13270a(str, str2, civilityTitle);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13270a)) {
                return false;
            }
            C13270a aVar = (C13270a) obj;
            return Intrinsics.areEqual((Object) this.f32643a, (Object) aVar.f32643a) && Intrinsics.areEqual((Object) this.f32644b, (Object) aVar.f32644b) && this.f32645c == aVar.f32645c;
        }

        @C12579k
        /* renamed from: f */
        public final CivilityTitle mo31497f() {
            return this.f32645c;
        }

        @C12579k
        /* renamed from: g */
        public final String mo31498g() {
            return this.f32643a;
        }

        @C12579k
        /* renamed from: h */
        public final String mo31499h() {
            return this.f32644b;
        }

        public int hashCode() {
            return (((this.f32643a.hashCode() * 31) + this.f32644b.hashCode()) * 31) + this.f32645c.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f32643a;
            String str2 = this.f32644b;
            CivilityTitle civilityTitle = this.f32645c;
            return "Params(firstName=" + str + ", lastName=" + str2 + ", civilityTitle=" + civilityTitle + ")";
        }
    }

    @Inject
    public UpdateUserInfoUseCase(@C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        this.f32641a = accountRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172743invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase.C13270a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.account.AccountInfo>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase$invoke$1
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
            goto L_0x0051
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.account.data.repositories.AccountRepository r7 = r5.f32641a
            java.lang.String r2 = r6.mo31498g()
            java.lang.String r4 = r6.mo31499h()
            com.carrefour.fid.android.domain.models.account.CivilityTitle r6 = r6.mo31497f()
            r0.label = r3
            java.lang.Object r6 = r7.mo31338x(r2, r4, r6, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase.m172743invokegIAlus(com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
