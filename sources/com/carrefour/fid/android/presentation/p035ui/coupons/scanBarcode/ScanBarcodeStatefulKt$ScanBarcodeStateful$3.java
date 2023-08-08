package com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeStateful$3 */
public final class ScanBarcodeStatefulKt$ScanBarcodeStateful$3 extends Lambda implements C11305q<C2373k, C8592o, Integer, C11079d2> {
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ C8700z0<Boolean> $currentSheetIsDisposed$delegate;
    final /* synthetic */ C8578k2<C23962a> $currentSheetState;
    final /* synthetic */ ModalBottomSheetState $sheetState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanBarcodeStatefulKt$ScanBarcodeStateful$3(C8578k2<? extends C23962a> k2Var, C12074o0 o0Var, ModalBottomSheetState modalBottomSheetState, C8700z0<Boolean> z0Var) {
        super(3);
        this.$currentSheetState = k2Var;
        this.$coroutineScope = o0Var;
        this.$sheetState = modalBottomSheetState;
        this.$currentSheetIsDisposed$delegate = z0Var;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo70132a(@C12579k C2373k kVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(kVar, "$this$ModalBottomSheetLayout");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1766220933, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStateful.<anonymous> (ScanBarcodeStateful.kt:87)");
            }
            final C12074o0 o0Var = this.$coroutineScope;
            final ModalBottomSheetState modalBottomSheetState = this.$sheetState;
            final C8700z0<Boolean> z0Var = this.$currentSheetIsDisposed$delegate;
            ModalBottomSheetScanContentKt.m105860a(this.$currentSheetState.getValue(), new C11289a<C11079d2>() {

                @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeStateful$3$1$1", mo22502f = "ScanBarcodeStateful.kt", mo22503i = {}, mo22504l = {93}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
                @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
                /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeStateful$3$1$1 */
                public static final class C239601 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        return new C239601(modalBottomSheetState, z0Var, cVar);
                    }

                    @C12580l
                    public final Object invokeSuspend(@C12579k Object obj) {
                        Object h = C11063b.m42612h();
                        int i = this.label;
                        if (i == 0) {
                            C11661u0.m45747n(obj);
                            ModalBottomSheetState modalBottomSheetState = modalBottomSheetState;
                            this.label = 1;
                            if (modalBottomSheetState.mo10291k(this) == h) {
                                return h;
                            }
                        } else if (i == 1) {
                            C11661u0.m45747n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ScanBarcodeStatefulKt.m105875g(z0Var, true);
                        return C11079d2.f28267a;
                    }

                    @C12580l
                    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
                        return ((C239601) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                    }
                }

                public final void invoke() {
                    C12074o0 o0Var = o0Var;
                    final ModalBottomSheetState modalBottomSheetState = modalBottomSheetState;
                    final C8700z0<Boolean> z0Var = z0Var;
                    C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C239601((C11045c<? super C239601>) null), 3, (Object) null);
                }
            }, oVar, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo70132a((C2373k) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
