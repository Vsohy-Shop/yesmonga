package com.carrefour.fid.android.account.domain.interactors.login;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.account.domain.models.LoginDomain;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.performance.C38328d;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nGetLoginUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetLoginUseCase.kt\ncom/carrefour/fid/android/account/domain/interactors/login/GetLoginUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1#2:33\n*E\n"})
public final class GetLoginUseCase implements C37679f<C13261a, LoginDomain> {
    @C12579k

    /* renamed from: a */
    public final LoginRepository f32616a;
    @C12579k

    /* renamed from: b */
    public final C38328d f32617b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase$a */
    public static final class C13261a {

        /* renamed from: c */
        public static final int f32618c = 0;
        @C12579k

        /* renamed from: a */
        public final String f32619a;
        @C12579k

        /* renamed from: b */
        public final String f32620b;

        public C13261a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "userName");
            Intrinsics.checkNotNullParameter(str2, "password");
            this.f32619a = str;
            this.f32620b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C13261a m57451d(C13261a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f32619a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f32620b;
            }
            return aVar.mo31469c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo31467a() {
            return this.f32619a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo31468b() {
            return this.f32620b;
        }

        @C12579k
        /* renamed from: c */
        public final C13261a mo31469c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "userName");
            Intrinsics.checkNotNullParameter(str2, "password");
            return new C13261a(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo31470e() {
            return this.f32620b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13261a)) {
                return false;
            }
            C13261a aVar = (C13261a) obj;
            return Intrinsics.areEqual((Object) this.f32619a, (Object) aVar.f32619a) && Intrinsics.areEqual((Object) this.f32620b, (Object) aVar.f32620b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo31472f() {
            return this.f32619a;
        }

        public int hashCode() {
            return (this.f32619a.hashCode() * 31) + this.f32620b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f32619a;
            String str2 = this.f32620b;
            return "Param(userName=" + str + ", password=" + str2 + ")";
        }
    }

    @Inject
    public GetLoginUseCase(@C12579k LoginRepository loginRepository, @C12579k C38328d dVar) {
        Intrinsics.checkNotNullParameter(loginRepository, "repository");
        Intrinsics.checkNotNullParameter(dVar, "performance");
        this.f32616a = loginRepository;
        this.f32617b = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172734invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase.C13261a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.account.domain.models.LoginDomain>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase r5 = (com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x005b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.performance.d r6 = r4.f32617b
            java.lang.String r2 = "get_login"
            r6.mo121195d(r2)
            com.carrefour.fid.android.account.data.repositories.LoginRepository r6 = r4.f32616a
            java.lang.String r2 = r5.mo31470e()
            java.lang.String r5 = r5.mo31472f()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.mo31355g(r5, r2, r0)
            if (r6 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r5 = r4
        L_0x005b:
            boolean r0 = kotlin.Result.m38710j(r6)
            if (r0 == 0) goto L_0x0069
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r6 = (com.carrefour.fid.android.account.data.entities.AuthStateResponse) r6
            com.carrefour.fid.android.account.domain.models.LoginDomain r6 = com.carrefour.fid.android.account.domain.extension.C13245c.m57383a(r6)
        L_0x0069:
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            com.carrefour.fid.android.performance.d r5 = r5.f32617b
            r5.mo121196e()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase.m172734invokegIAlus(com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
