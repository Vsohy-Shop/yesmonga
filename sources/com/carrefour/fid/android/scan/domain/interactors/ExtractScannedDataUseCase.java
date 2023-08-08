package com.carrefour.fid.android.scan.domain.interactors;

import androidx.camera.core.C1353a2;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.scan.core.constants.ScanType;
import com.carrefour.fid.android.scan.presentation.p042ui.C28310g;
import com.carrefour.fid.android.shared.p045di.annotation.C28670n;
import com.google.android.gms.tasks.C31039g;
import com.google.mlkit.vision.barcode.C34001b;
import javax.inject.Inject;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ExtractScannedDataUseCase implements C37679f<C28271a, String> {
    @C12579k

    /* renamed from: a */
    public final C34001b f68431a;
    @C12579k

    /* renamed from: b */
    public final CoroutineDispatcher f68432b;

    /* renamed from: com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$a */
    public static final class C28271a {
        @C12579k

        /* renamed from: a */
        public final C1353a2 f68433a;
        @C12579k

        /* renamed from: b */
        public final ScanType f68434b;

        public C28271a(@C12579k C1353a2 a2Var, @C12579k ScanType scanType) {
            Intrinsics.checkNotNullParameter(a2Var, "imageProxyResponse");
            Intrinsics.checkNotNullParameter(scanType, C28310g.f68481a);
            this.f68433a = a2Var;
            this.f68434b = scanType;
        }

        /* renamed from: d */
        public static /* synthetic */ C28271a m118213d(C28271a aVar, C1353a2 a2Var, ScanType scanType, int i, Object obj) {
            if ((i & 1) != 0) {
                a2Var = aVar.f68433a;
            }
            if ((i & 2) != 0) {
                scanType = aVar.f68434b;
            }
            return aVar.mo82222c(a2Var, scanType);
        }

        @C12579k
        /* renamed from: a */
        public final C1353a2 mo82220a() {
            return this.f68433a;
        }

        @C12579k
        /* renamed from: b */
        public final ScanType mo82221b() {
            return this.f68434b;
        }

        @C12579k
        /* renamed from: c */
        public final C28271a mo82222c(@C12579k C1353a2 a2Var, @C12579k ScanType scanType) {
            Intrinsics.checkNotNullParameter(a2Var, "imageProxyResponse");
            Intrinsics.checkNotNullParameter(scanType, C28310g.f68481a);
            return new C28271a(a2Var, scanType);
        }

        @C12579k
        /* renamed from: e */
        public final C1353a2 mo82223e() {
            return this.f68433a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28271a)) {
                return false;
            }
            C28271a aVar = (C28271a) obj;
            return Intrinsics.areEqual((Object) this.f68433a, (Object) aVar.f68433a) && this.f68434b == aVar.f68434b;
        }

        @C12579k
        /* renamed from: f */
        public final ScanType mo82225f() {
            return this.f68434b;
        }

        public int hashCode() {
            return (this.f68433a.hashCode() * 31) + this.f68434b.hashCode();
        }

        @C12579k
        public String toString() {
            C1353a2 a2Var = this.f68433a;
            ScanType scanType = this.f68434b;
            return "Params(imageProxyResponse=" + a2Var + ", scanType=" + scanType + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$b */
    public static final class C28272b implements C31039g {

        /* renamed from: a */
        public final /* synthetic */ C11300l f68435a;

        public C28272b(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f68435a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo82228a(Object obj) {
            this.f68435a.invoke(obj);
        }
    }

    @Inject
    public ExtractScannedDataUseCase(@C12579k C34001b bVar, @C28670n @C12579k CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(bVar, "barcodeScanner");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        this.f68431a = bVar;
        this.f68432b = coroutineDispatcher;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    @android.annotation.SuppressLint({"UnsafeOptInUsageError"})
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172823invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase.C28271a r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$1 r0 = (com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$1 r0 = new com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r8)
            goto L_0x005c
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            kotlin.C11661u0.m45747n(r8)
            androidx.camera.core.a2 r8 = r7.mo82223e()
            android.media.Image r8 = r8.getImage()
            if (r8 != 0) goto L_0x004b
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.scan.core.NoImageScannedException r7 = com.carrefour.fid.android.scan.core.NoImageScannedException.f68397a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x004b:
            kotlinx.coroutines.CoroutineDispatcher r2 = r6.f68432b
            com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$2 r4 = new com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$invoke$2
            r5 = 0
            r4.<init>(r8, r7, r6, r5)
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.C11965h.m47673h(r2, r4, r0)
            if (r8 != r1) goto L_0x005c
            return r1
        L_0x005c:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.mo21858l()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase.m172823invokegIAlus(com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
