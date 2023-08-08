package com.carrefour.fid.android.account.domain.interactors.address.dqe;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository;
import com.carrefour.fid.android.account.domain.models.DQEAddressDomain;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class GetDQEAddressSuggestionsUseCase implements C37679f<C13255a, List<? extends DQEAddressDomain>> {

    /* renamed from: b */
    public static final int f32603b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final DQEAddressesRepository f32604a;

    @C11288f
    /* renamed from: com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase$a */
    public static final class C13255a {
        @C12579k

        /* renamed from: a */
        public final String f32605a;

        public /* synthetic */ C13255a(String str) {
            this.f32605a = str;
        }

        /* renamed from: a */
        public static final /* synthetic */ C13255a m57420a(String str) {
            return new C13255a(str);
        }

        @C12579k
        /* renamed from: b */
        public static String m57421b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "address");
            return str;
        }

        /* renamed from: c */
        public static boolean m57422c(String str, Object obj) {
            return (obj instanceof C13255a) && Intrinsics.areEqual((Object) str, (Object) ((C13255a) obj).mo31451h());
        }

        /* renamed from: d */
        public static final boolean m57423d(String str, String str2) {
            return Intrinsics.areEqual((Object) str, (Object) str2);
        }

        /* renamed from: f */
        public static int m57424f(String str) {
            return str.hashCode();
        }

        /* renamed from: g */
        public static String m57425g(String str) {
            return "Address(address=" + str + ")";
        }

        @C12579k
        /* renamed from: e */
        public final String mo31449e() {
            return this.f32605a;
        }

        public boolean equals(Object obj) {
            return m57422c(this.f32605a, obj);
        }

        /* renamed from: h */
        public final /* synthetic */ String mo31451h() {
            return this.f32605a;
        }

        public int hashCode() {
            return m57424f(this.f32605a);
        }

        public String toString() {
            return m57425g(this.f32605a);
        }
    }

    @Inject
    public GetDQEAddressSuggestionsUseCase(@C12579k DQEAddressesRepository dQEAddressesRepository) {
        Intrinsics.checkNotNullParameter(dQEAddressesRepository, "dqeAddressesRepository");
        this.f32604a = dQEAddressesRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo31448a(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.account.domain.models.DQEAddressDomain>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase$invoke$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository r6 = r4.f32604a
            r0.label = r3
            java.lang.Object r5 = r6.mo31347e(r5, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase.mo31448a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public /* bridge */ /* synthetic */ Object m172729invokegIAlus(Object obj, C11045c cVar) {
        return mo31448a(((C13255a) obj).mo31451h(), cVar);
    }
}
