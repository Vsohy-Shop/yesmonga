package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import androidx.fragment.app.C19232h;
import androidx.lifecycle.C19501x;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.shared.constant.C28539g;
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

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutFragment$onViewCreated$2 */
public final class CheckoutFragment$onViewCreated$2 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ CheckoutFragment this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutFragment$onViewCreated$2$1", mo22502f = "CheckoutFragment.kt", mo22503i = {}, mo22504l = {56}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutFragment$onViewCreated$2$1 */
    public static final class C232481 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C232481(checkoutFragment, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                ClearAppManager S0 = checkoutFragment.mo68114S0();
                this.label = 1;
                if (S0.mo111416a(this) == h) {
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
            return ((C232481) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutFragment$onViewCreated$2(CheckoutFragment checkoutFragment) {
        super(1);
        this.this$0 = checkoutFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "it");
        if (Intrinsics.areEqual((Object) str2, (Object) C36168a.f89274b)) {
            LifecycleCoroutineScope a = C19501x.m90847a(this.this$0);
            final CheckoutFragment checkoutFragment = this.this$0;
            C11723c2 unused = C12038j.m48061f(a, (CoroutineContext) null, (CoroutineStart) null, new C232481((C11045c<? super C232481>) null), 3, (Object) null);
            C19232h requireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            C13825a.m58791t(requireActivity, false, (Bundle) null, 3, (Object) null);
            FragmentExtensionKt.m58770u(this.this$0, false, R.anim.slide_in_up, R.anim.no_change, C28539g.f69230F, (Bundle) null, 16, (Object) null);
        }
    }
}
