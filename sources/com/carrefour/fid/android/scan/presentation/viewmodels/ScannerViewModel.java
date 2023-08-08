package com.carrefour.fid.android.scan.presentation.viewmodels;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase;
import com.carrefour.fid.android.scan.presentation.viewmodels.mvi.C28318a;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/scan/presentation/viewmodels/ScannerViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/scan/presentation/viewmodels/mvi/a$b;", "Lcom/carrefour/fid/android/scan/presentation/viewmodels/mvi/a$c;", "intent", "Lkotlin/d2;", "e0", "(Lcom/carrefour/fid/android/scan/presentation/viewmodels/mvi/a$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/camera/core/a2;", "imageProxyResponse", "Lcom/carrefour/fid/android/scan/core/constants/ScanType;", "scanType", "f0", "(Landroidx/camera/core/a2;Lcom/carrefour/fid/android/scan/core/constants/ScanType;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/scan/domain/interactors/ExtractScannedDataUseCase;", "a", "Lcom/carrefour/fid/android/scan/domain/interactors/ExtractScannedDataUseCase;", "extractScannedDataUseCase", "<init>", "(Lcom/carrefour/fid/android/scan/domain/interactors/ExtractScannedDataUseCase;)V", "scan_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
public final class ScannerViewModel extends BaseMVIViewModel<C28318a.C28322b, C28318a.C28328c> {
    @C12579k

    /* renamed from: a */
    public final ExtractScannedDataUseCase f68482a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ScannerViewModel(@C12579k ExtractScannedDataUseCase extractScannedDataUseCase) {
        super(C28318a.C28322b.C28324b.f68488b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(extractScannedDataUseCase, "extractScannedDataUseCase");
        this.f68482a = extractScannedDataUseCase;
    }

    @C12580l
    /* renamed from: e0 */
    public Object processIntent(@C12579k C28318a.C28328c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (!(cVar instanceof C28318a.C28328c.C28329a)) {
            return C11079d2.f28267a;
        }
        C28318a.C28328c.C28329a aVar = (C28318a.C28328c.C28329a) cVar;
        Object f0 = mo82284f0(aVar.mo82303e(), aVar.mo82305f(), cVar2);
        if (f0 == C11063b.m42612h()) {
            return f0;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo82284f0(androidx.camera.core.C1353a2 r5, com.carrefour.fid.android.scan.core.constants.ScanType r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel$processScannedImage$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel$processScannedImage$1 r0 = (com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel$processScannedImage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel$processScannedImage$1 r0 = new com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel$processScannedImage$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel r5 = (com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel) r5
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0051
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase r7 = r4.f68482a
            com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$a r2 = new com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase$a
            r2.<init>(r5, r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r7.m172823invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r5 = r4
        L_0x0051:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r6)
            if (r7 == 0) goto L_0x0064
            com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$b$c r0 = com.carrefour.fid.android.scan.presentation.viewmodels.mvi.C28318a.C28322b.C28325c.f68489b
            r5.publishState(r0)
            com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$a$a r0 = new com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$a$a
            r0.<init>(r7)
            r5.emitEvent(r0)
        L_0x0064:
            boolean r7 = kotlin.Result.m38710j(r6)
            if (r7 == 0) goto L_0x0080
            java.lang.String r6 = (java.lang.String) r6
            com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$b$d r7 = com.carrefour.fid.android.scan.presentation.viewmodels.mvi.C28318a.C28322b.C28326d.f68490b
            r5.publishState(r7)
            if (r6 == 0) goto L_0x007b
            com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$a$b r7 = new com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$a$b
            r7.<init>(r6)
            r5.emitEvent(r7)
        L_0x007b:
            com.carrefour.fid.android.scan.presentation.viewmodels.mvi.a$b$e r6 = com.carrefour.fid.android.scan.presentation.viewmodels.mvi.C28318a.C28322b.C28327e.f68491b
            r5.publishState(r6)
        L_0x0080:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel.mo82284f0(androidx.camera.core.a2, com.carrefour.fid.android.scan.core.constants.ScanType, kotlin.coroutines.c):java.lang.Object");
    }
}
