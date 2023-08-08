package com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode;

import androidx.compose.material.ModalBottomSheetState;
import com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.C23962a;
import com.carrefour.fid.android.presentation.p035ui.coupons.scanBarcode.C23967b;
import com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.ScanBarcodeViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeStateful$4$1$1 */
public final class ScanBarcodeStatefulKt$ScanBarcodeStateful$4$1$1 extends Lambda implements C11300l<C23967b, C11079d2> {
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onBackPressed;
    final /* synthetic */ ModalBottomSheetState $sheetState;
    final /* synthetic */ ScanBarcodeViewModel $viewModel;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeStateful$4$1$1$1", mo22502f = "ScanBarcodeStateful.kt", mo22503i = {}, mo22504l = {107}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.scanBarcode.ScanBarcodeStatefulKt$ScanBarcodeStateful$4$1$1$1 */
    public static final class C239611 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C239611(modalBottomSheetState, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                ModalBottomSheetState modalBottomSheetState = modalBottomSheetState;
                this.label = 1;
                if (modalBottomSheetState.mo10296p(this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C239611) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanBarcodeStatefulKt$ScanBarcodeStateful$4$1$1(C11300l<? super Boolean, C11079d2> lVar, ScanBarcodeViewModel scanBarcodeViewModel, C12074o0 o0Var, ModalBottomSheetState modalBottomSheetState) {
        super(1);
        this.$onBackPressed = lVar;
        this.$viewModel = scanBarcodeViewModel;
        this.$coroutineScope = o0Var;
        this.$sheetState = modalBottomSheetState;
    }

    /* renamed from: a */
    public final void mo70135a(@C12579k C23967b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "action");
        if (Intrinsics.areEqual((Object) bVar, (Object) C23967b.C23968a.f60159a)) {
            this.$onBackPressed.invoke(Boolean.FALSE);
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C23967b.C23969b.f60161a)) {
            this.$viewModel.mo76593i0(C23962a.C23963a.f60151b);
            C12074o0 o0Var = this.$coroutineScope;
            final ModalBottomSheetState modalBottomSheetState = this.$sheetState;
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C239611((C11045c<? super C239611>) null), 3, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70135a((C23967b) obj);
        return C11079d2.f28267a;
    }
}
