package com.carrefour.fid.android.account.domain.interactors.address;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.Phone;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "We should not be using *Response entities in the business layer", replaceWith = @C11587t0(expression = "UpdateUserAddressUseCase", imports = {}))
public final class UpdateAccountAddressUseCase implements C37679f<C13250a, Boolean> {
    @C12579k

    /* renamed from: a */
    public final AccountRepository f32590a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.domain.interactors.address.UpdateAccountAddressUseCase$a */
    public static final class C13250a {

        /* renamed from: c */
        public static final int f32591c = 8;
        @C12579k

        /* renamed from: a */
        public final List<Address> f32592a;
        @C12580l

        /* renamed from: b */
        public final List<Phone> f32593b;

        public C13250a(@C12579k List<Address> list, @C12580l List<Phone> list2) {
            Intrinsics.checkNotNullParameter(list, "listAddress");
            this.f32592a = list;
            this.f32593b = list2;
        }

        /* renamed from: d */
        public static /* synthetic */ C13250a m57394d(C13250a aVar, List<Address> list, List<Phone> list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f32592a;
            }
            if ((i & 2) != 0) {
                list2 = aVar.f32593b;
            }
            return aVar.mo31427c(list, list2);
        }

        @C12579k
        /* renamed from: a */
        public final List<Address> mo31425a() {
            return this.f32592a;
        }

        @C12580l
        /* renamed from: b */
        public final List<Phone> mo31426b() {
            return this.f32593b;
        }

        @C12579k
        /* renamed from: c */
        public final C13250a mo31427c(@C12579k List<Address> list, @C12580l List<Phone> list2) {
            Intrinsics.checkNotNullParameter(list, "listAddress");
            return new C13250a(list, list2);
        }

        @C12579k
        /* renamed from: e */
        public final List<Address> mo31428e() {
            return this.f32592a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13250a)) {
                return false;
            }
            C13250a aVar = (C13250a) obj;
            return Intrinsics.areEqual((Object) this.f32592a, (Object) aVar.f32592a) && Intrinsics.areEqual((Object) this.f32593b, (Object) aVar.f32593b);
        }

        @C12580l
        /* renamed from: f */
        public final List<Phone> mo31430f() {
            return this.f32593b;
        }

        public int hashCode() {
            int hashCode = this.f32592a.hashCode() * 31;
            List<Phone> list = this.f32593b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @C12579k
        public String toString() {
            List<Address> list = this.f32592a;
            List<Phone> list2 = this.f32593b;
            return "Params(listAddress=" + list + ", listPhones=" + list2 + ")";
        }
    }

    @Inject
    public UpdateAccountAddressUseCase(@C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        this.f32590a = accountRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172726invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.account.domain.interactors.address.UpdateAccountAddressUseCase.C13250a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.domain.interactors.address.UpdateAccountAddressUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.domain.interactors.address.UpdateAccountAddressUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.address.UpdateAccountAddressUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.address.UpdateAccountAddressUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.address.UpdateAccountAddressUseCase$invoke$1
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
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.account.data.repositories.AccountRepository r6 = r4.f32590a
            java.util.List r2 = r5.mo31428e()
            java.util.List r5 = r5.mo31430f()
            r0.label = r3
            java.lang.Object r5 = r6.mo31333s(r2, r5, r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.address.UpdateAccountAddressUseCase.m172726invokegIAlus(com.carrefour.fid.android.account.domain.interactors.address.UpdateAccountAddressUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
