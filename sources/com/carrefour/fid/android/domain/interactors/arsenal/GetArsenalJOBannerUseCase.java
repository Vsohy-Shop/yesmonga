package com.carrefour.fid.android.domain.interactors.arsenal;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.repositories.ArsenalGameRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.ArsenalJOBanner;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class GetArsenalJOBannerUseCase implements C37679f<C37547a, ArsenalJOBanner> {

    /* renamed from: d */
    public static final int f94295d = 8;
    @C12579k

    /* renamed from: a */
    public final C37807b f94296a;
    @C12579k

    /* renamed from: b */
    public final ArsenalGameRepository f94297b;
    @C12579k

    /* renamed from: c */
    public final LoginRepository f94298c;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$a */
    public static final class C37547a {

        /* renamed from: b */
        public static final int f94299b = 0;
        @C12579k

        /* renamed from: a */
        public final String f94300a;

        public C37547a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "fidCardNumber");
            this.f94300a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C37547a m154062c(C37547a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94300a;
            }
            return aVar.mo114327b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114326a() {
            return this.f94300a;
        }

        @C12579k
        /* renamed from: b */
        public final C37547a mo114327b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "fidCardNumber");
            return new C37547a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo114328d() {
            return this.f94300a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37547a) && Intrinsics.areEqual((Object) this.f94300a, (Object) ((C37547a) obj).f94300a);
        }

        public int hashCode() {
            return this.f94300a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94300a;
            return "Params(fidCardNumber=" + str + ")";
        }
    }

    @Inject
    public GetArsenalJOBannerUseCase(@C12579k C37807b bVar, @C12579k ArsenalGameRepository arsenalGameRepository, @C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(arsenalGameRepository, "arsenalGameRepository");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f94296a = bVar;
        this.f94297b = arsenalGameRepository;
        this.f94298c = loginRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172940invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase.C37547a r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.ArsenalJOBanner>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$invoke$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0051
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r14 = r0.L$0
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x0094
        L_0x0034:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003c:
            java.lang.Object r14 = r0.L$1
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$a r14 = (com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase.C37547a) r14
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase r2 = (com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase) r2
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
        L_0x004d:
            r12 = r15
            r15 = r14
            r14 = r12
            goto L_0x0074
        L_0x0051:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.account.data.repositories.LoginRepository r15 = r13.f94298c
            boolean r15 = com.carrefour.fid.android.account.data.extension.C13195a.m57177a(r15)
            if (r15 == 0) goto L_0x0102
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r15 = r13.f94296a
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.ArsenalJOBanner
            r2.<init>(r5)
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r4
            java.lang.Object r15 = r15.m172966invokegIAlus(r2, r0)
            if (r15 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r2 = r13
            goto L_0x004d
        L_0x0074:
            boolean r5 = kotlin.Result.m38710j(r14)
            if (r5 == 0) goto L_0x00ea
            r5 = r14
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            com.carrefour.fid.android.data.repositories.ArsenalGameRepository r2 = r2.f94297b
            java.lang.String r15 = r15.mo114328d()
            r0.L$0 = r14
            r5 = 0
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r15 = r2.mo111481a(r15, r0)
            if (r15 != r1) goto L_0x0094
            return r1
        L_0x0094:
            boolean r0 = kotlin.Result.m38710j(r15)
            if (r0 == 0) goto L_0x00d2
            com.carrefour.fid.android.data.entities.ArsenalJOContentResponse r15 = (com.carrefour.fid.android.data.entities.ArsenalJOContentResponse) r15
            kotlin.Result$a r14 = kotlin.Result.f28060a
            com.carrefour.fid.android.data.entities.ArsenalJOBannerResponse r14 = r15.getBanner()
            java.lang.String r6 = r14.getOpCode()
            com.carrefour.fid.android.data.entities.ArsenalJOBannerResponse r14 = r15.getBanner()
            java.lang.String r8 = r14.getOpName()
            com.carrefour.fid.android.data.entities.ArsenalJOBannerResponse r14 = r15.getBanner()
            java.lang.String r7 = r14.getGameUrl()
            java.lang.String r9 = r15.getAccountBalance()
            int r14 = r15.getAssociationClientClub()
            if (r14 != r4) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r4 = 0
        L_0x00c2:
            r10 = r4
            java.lang.String r11 = r15.getAssociationClubName()
            com.carrefour.fid.android.domain.models.ArsenalJOBanner r14 = new com.carrefour.fid.android.domain.models.ArsenalJOBanner
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            return r14
        L_0x00d2:
            java.lang.Throwable r15 = kotlin.Result.m38705e(r15)
            if (r15 == 0) goto L_0x00ea
            kotlin.Result$a r14 = kotlin.Result.f28060a
            java.lang.Throwable r14 = new java.lang.Throwable
            java.lang.String r15 = "Could not fetch Arsenal."
            r14.<init>(r15)
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            return r14
        L_0x00ea:
            java.lang.Throwable r14 = kotlin.Result.m38705e(r14)
            if (r14 == 0) goto L_0x0102
            kotlin.Result$a r14 = kotlin.Result.f28060a
            java.lang.Throwable r14 = new java.lang.Throwable
            java.lang.String r15 = "Could not fetch remote config for Arsenal JO game."
            r14.<init>(r15)
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            return r14
        L_0x0102:
            kotlin.Result$a r14 = kotlin.Result.f28060a
            java.lang.Throwable r14 = new java.lang.Throwable
            java.lang.String r15 = "No Arsenal banner JO available"
            r14.<init>(r15)
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase.m172940invokegIAlus(com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
