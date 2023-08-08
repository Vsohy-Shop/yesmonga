package com.carrefour.fid.android.domain.interactors.account.store.memo;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.repositories.C38197f;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class AddMemoListUseCase implements C37679f<C37527a, C11079d2> {

    /* renamed from: b */
    public static final int f94263b = 8;
    @C12579k

    /* renamed from: a */
    public final C38197f f94264a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase$a */
    public static final class C37527a {

        /* renamed from: b */
        public static final int f94265b = 0;
        @C12579k

        /* renamed from: a */
        public final String f94266a;

        public C37527a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "label");
            this.f94266a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C37527a m154018c(C37527a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94266a;
            }
            return aVar.mo114296b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114295a() {
            return this.f94266a;
        }

        @C12579k
        /* renamed from: b */
        public final C37527a mo114296b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "label");
            return new C37527a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo114297d() {
            return this.f94266a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37527a) && Intrinsics.areEqual((Object) this.f94266a, (Object) ((C37527a) obj).f94266a);
        }

        public int hashCode() {
            return this.f94266a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94266a;
            return "Param(label=" + str + ")";
        }
    }

    @Inject
    public AddMemoListUseCase(@C12579k C38197f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "repository");
        this.f94264a = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172933invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase.C37527a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase$invoke$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.repositories.f r6 = r4.f94264a
            java.lang.String r5 = r5.mo114297d()
            r0.label = r3
            java.lang.Object r5 = r6.mo111515b(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase.m172933invokegIAlus(com.carrefour.fid.android.domain.interactors.account.store.memo.AddMemoListUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
