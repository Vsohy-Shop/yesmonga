package com.carrefour.fid.android.scan.domain.interactors;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.scan.data.repositories.C28267a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class UpdateScanTutorialHasBeenShownUseCase implements C37679f<C28276a, Boolean> {
    @C12579k

    /* renamed from: a */
    public final C28267a f68439a;

    /* renamed from: com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase$a */
    public static final class C28276a {

        /* renamed from: a */
        public final boolean f68440a;

        public C28276a(boolean z) {
            this.f68440a = z;
        }

        /* renamed from: c */
        public static /* synthetic */ C28276a m118222c(C28276a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f68440a;
            }
            return aVar.mo82235b(z);
        }

        /* renamed from: a */
        public final boolean mo82234a() {
            return this.f68440a;
        }

        @C12579k
        /* renamed from: b */
        public final C28276a mo82235b(boolean z) {
            return new C28276a(z);
        }

        /* renamed from: d */
        public final boolean mo82236d() {
            return this.f68440a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28276a) && this.f68440a == ((C28276a) obj).f68440a;
        }

        public int hashCode() {
            boolean z = this.f68440a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f68440a;
            return "Param(hasBeenShown=" + z + ")";
        }
    }

    @Inject
    public UpdateScanTutorialHasBeenShownUseCase(@C12579k C28267a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "repository");
        this.f68439a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172825invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase.C28276a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase$invoke$1 r0 = (com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase$invoke$1 r0 = new com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase$invoke$1
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
            com.carrefour.fid.android.scan.data.repositories.a r6 = r4.f68439a
            boolean r5 = r5.mo82236d()
            r0.label = r3
            java.lang.Object r5 = r6.mo82215b(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase.m172825invokegIAlus(com.carrefour.fid.android.scan.domain.interactors.UpdateScanTutorialHasBeenShownUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
