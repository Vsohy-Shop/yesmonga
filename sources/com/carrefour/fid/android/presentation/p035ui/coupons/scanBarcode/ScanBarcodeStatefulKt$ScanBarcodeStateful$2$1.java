package com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.C23962a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nScanBarcodeStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanBarcodeStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/scanBarcode/ScanBarcodeStatefulKt$ScanBarcodeStateful$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,172:1\n62#2,5:173\n*S KotlinDebug\n*F\n+ 1 ScanBarcodeStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/scanBarcode/ScanBarcodeStatefulKt$ScanBarcodeStateful$2$1\n*L\n81#1:173,5\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeStateful$2$1 */
public final class ScanBarcodeStatefulKt$ScanBarcodeStateful$2$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C8578k2<C23962a> $currentSheetState;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onBackPressed;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ScanBarcodeStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/scanBarcode/ScanBarcodeStatefulKt$ScanBarcodeStateful$2$1\n*L\n1#1,484:1\n81#2:485\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeStateful$2$1$a */
    public static final class C23958a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C11300l f60148a;

        /* renamed from: b */
        public final /* synthetic */ C8578k2 f60149b;

        public C23958a(C11300l lVar, C8578k2 k2Var) {
            this.f60148a = lVar;
            this.f60149b = k2Var;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f60148a.invoke(Boolean.valueOf(Intrinsics.areEqual(this.f60149b.getValue(), (Object) C23962a.C23966d.f60157b)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanBarcodeStatefulKt$ScanBarcodeStateful$2$1(C11300l<? super Boolean, C11079d2> lVar, C8578k2<? extends C23962a> k2Var) {
        super(1);
        this.$onBackPressed = lVar;
        this.$currentSheetState = k2Var;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C23958a(this.$onBackPressed, this.$currentSheetState);
    }
}
