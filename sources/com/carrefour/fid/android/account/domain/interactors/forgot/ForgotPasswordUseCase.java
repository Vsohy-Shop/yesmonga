package com.carrefour.fid.android.account.domain.interactors.forgot;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ForgotPasswordUseCase implements C37679f<C13259a, Boolean> {
    @C12579k

    /* renamed from: a */
    public final AccountRepository f32611a;

    @C11288f
    /* renamed from: com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase$a */
    public static final class C13259a {
        @C12579k

        /* renamed from: a */
        public final String f32612a;

        public /* synthetic */ C13259a(String str) {
            this.f32612a = str;
        }

        /* renamed from: a */
        public static final /* synthetic */ C13259a m57439a(String str) {
            return new C13259a(str);
        }

        @C12579k
        /* renamed from: b */
        public static String m57440b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "email");
            return str;
        }

        /* renamed from: c */
        public static boolean m57441c(String str, Object obj) {
            return (obj instanceof C13259a) && Intrinsics.areEqual((Object) str, (Object) ((C13259a) obj).mo31461h());
        }

        /* renamed from: d */
        public static final boolean m57442d(String str, String str2) {
            return Intrinsics.areEqual((Object) str, (Object) str2);
        }

        /* renamed from: f */
        public static int m57443f(String str) {
            return str.hashCode();
        }

        /* renamed from: g */
        public static String m57444g(String str) {
            return "Email(email=" + str + ")";
        }

        @C12579k
        /* renamed from: e */
        public final String mo31459e() {
            return this.f32612a;
        }

        public boolean equals(Object obj) {
            return m57441c(this.f32612a, obj);
        }

        /* renamed from: h */
        public final /* synthetic */ String mo31461h() {
            return this.f32612a;
        }

        public int hashCode() {
            return m57443f(this.f32612a);
        }

        public String toString() {
            return m57444g(this.f32612a);
        }
    }

    @Inject
    public ForgotPasswordUseCase(@C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        this.f32611a = accountRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo31458a(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase$invoke$1
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
            com.carrefour.fid.android.account.data.repositories.AccountRepository r6 = r4.f32611a
            r0.label = r3
            java.lang.Object r5 = r6.mo31325j(r5, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase.mo31458a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public /* bridge */ /* synthetic */ Object m172731invokegIAlus(Object obj, C11045c cVar) {
        return mo31458a(((C13259a) obj).mo31461h(), cVar);
    }
}
