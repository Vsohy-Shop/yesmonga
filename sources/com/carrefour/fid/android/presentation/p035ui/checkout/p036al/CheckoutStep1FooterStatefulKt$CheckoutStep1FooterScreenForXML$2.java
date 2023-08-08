package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C8700z0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$2", mo22502f = "CheckoutStep1FooterStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$2 */
public final class CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ BottomSheetBehavior<ViewGroup> $bottomSheetBehavior;
    final /* synthetic */ C8700z0<Boolean> $isExpanded;
    int label;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$2$a */
    public static final class C23265a extends BottomSheetBehavior.C31172f {

        /* renamed from: a */
        public final /* synthetic */ C8700z0<Boolean> f58973a;

        public C23265a(C8700z0<Boolean> z0Var) {
            this.f58973a = z0Var;
        }

        /* renamed from: b */
        public void mo68139b(@C12579k View view, float f) {
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
        }

        /* renamed from: c */
        public void mo68140c(@C12579k View view, int i) {
            boolean z;
            Intrinsics.checkNotNullParameter(view, "bottomSheet");
            C8700z0<Boolean> z0Var = this.f58973a;
            if (i != 4) {
                z = true;
            } else {
                z = false;
            }
            z0Var.setValue(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$2(BottomSheetBehavior<ViewGroup> bottomSheetBehavior, C8700z0<Boolean> z0Var, C11045c<? super CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$2> cVar) {
        super(2, cVar);
        this.$bottomSheetBehavior = bottomSheetBehavior;
        this.$isExpanded = z0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$2(this.$bottomSheetBehavior, this.$isExpanded, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.$bottomSheetBehavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo88421Y(new C23265a(this.$isExpanded));
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
