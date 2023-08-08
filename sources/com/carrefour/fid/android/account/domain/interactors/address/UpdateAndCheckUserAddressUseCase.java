package com.carrefour.fid.android.account.domain.interactors.address;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.account.Address;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class UpdateAndCheckUserAddressUseCase implements C37679f<C13251a, Boolean> {
    @C12579k

    /* renamed from: a */
    public final AccountRepository f32594a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$a */
    public static final class C13251a {

        /* renamed from: d */
        public static final int f32595d = 8;
        @C12579k

        /* renamed from: a */
        public final Address f32596a;
        @C12580l

        /* renamed from: b */
        public final DQEAddressModel f32597b;
        @C12579k

        /* renamed from: c */
        public final String f32598c;

        public C13251a(@C12579k Address address, @C12580l DQEAddressModel dQEAddressModel, @C12579k String str) {
            Intrinsics.checkNotNullParameter(address, "addressModel");
            Intrinsics.checkNotNullParameter(str, "telephone");
            this.f32596a = address;
            this.f32597b = dQEAddressModel;
            this.f32598c = str;
        }

        /* renamed from: e */
        public static /* synthetic */ C13251a m57401e(C13251a aVar, Address address, DQEAddressModel dQEAddressModel, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                address = aVar.f32596a;
            }
            if ((i & 2) != 0) {
                dQEAddressModel = aVar.f32597b;
            }
            if ((i & 4) != 0) {
                str = aVar.f32598c;
            }
            return aVar.mo31437d(address, dQEAddressModel, str);
        }

        @C12579k
        /* renamed from: a */
        public final Address mo31434a() {
            return this.f32596a;
        }

        @C12580l
        /* renamed from: b */
        public final DQEAddressModel mo31435b() {
            return this.f32597b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo31436c() {
            return this.f32598c;
        }

        @C12579k
        /* renamed from: d */
        public final C13251a mo31437d(@C12579k Address address, @C12580l DQEAddressModel dQEAddressModel, @C12579k String str) {
            Intrinsics.checkNotNullParameter(address, "addressModel");
            Intrinsics.checkNotNullParameter(str, "telephone");
            return new C13251a(address, dQEAddressModel, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13251a)) {
                return false;
            }
            C13251a aVar = (C13251a) obj;
            return Intrinsics.areEqual((Object) this.f32596a, (Object) aVar.f32596a) && Intrinsics.areEqual((Object) this.f32597b, (Object) aVar.f32597b) && Intrinsics.areEqual((Object) this.f32598c, (Object) aVar.f32598c);
        }

        @C12579k
        /* renamed from: f */
        public final Address mo31439f() {
            return this.f32596a;
        }

        @C12580l
        /* renamed from: g */
        public final DQEAddressModel mo31440g() {
            return this.f32597b;
        }

        @C12579k
        /* renamed from: h */
        public final String mo31441h() {
            return this.f32598c;
        }

        public int hashCode() {
            int hashCode = this.f32596a.hashCode() * 31;
            DQEAddressModel dQEAddressModel = this.f32597b;
            return ((hashCode + (dQEAddressModel == null ? 0 : dQEAddressModel.hashCode())) * 31) + this.f32598c.hashCode();
        }

        @C12579k
        public String toString() {
            Address address = this.f32596a;
            DQEAddressModel dQEAddressModel = this.f32597b;
            String str = this.f32598c;
            return "Params(addressModel=" + address + ", dqeAddressModel=" + dQEAddressModel + ", telephone=" + str + ")";
        }
    }

    @Inject
    public UpdateAndCheckUserAddressUseCase(@C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        this.f32594a = accountRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172727invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase.C13251a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$invoke$1
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
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.account.data.repositories.AccountRepository r7 = r5.f32594a
            com.carrefour.fid.android.domain.models.account.Address r2 = r6.mo31439f()
            com.carrefour.fid.android.account.presentation.models.DQEAddressModel r4 = r6.mo31440g()
            if (r4 == 0) goto L_0x004b
            com.carrefour.fid.android.account.domain.models.DQEAddressDomain r4 = com.carrefour.fid.android.account.presentation.models.extension.C13317b.m57654a(r4)
            goto L_0x004c
        L_0x004b:
            r4 = 0
        L_0x004c:
            java.lang.String r6 = r6.mo31441h()
            r0.label = r3
            java.lang.Object r6 = r7.mo31334t(r2, r4, r6, r0)
            if (r6 != r1) goto L_0x0059
            return r1
        L_0x0059:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase.m172727invokegIAlus(com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
