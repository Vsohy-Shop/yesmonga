package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.models.logm.LogMAction;
import com.carrefour.fid.android.domain.models.logm.LogMEntry;
import com.carrefour.fid.android.domain.models.logm.LogMSeverity;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment$InternalWebViewClient$shouldOverrideUrlLoading$1", mo22502f = "CheckoutStep4Fragment.kt", mo22503i = {}, mo22504l = {263}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment$InternalWebViewClient$shouldOverrideUrlLoading$1 */
public final class C23318xe1588488 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ CheckoutStep4Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23318xe1588488(CheckoutStep4Fragment checkoutStep4Fragment, String str, C11045c<? super C23318xe1588488> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStep4Fragment;
        this.$url = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new C23318xe1588488(this.this$0, this.$url, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37694a c1 = this.this$0.mo68266c1();
            LogMEntry logMEntry = r4;
            LogMEntry logMEntry2 = new LogMEntry((String) null, LogMAction.WEBVIEW_PAYLINE, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, LogMSeverity.INFO, (String) null, (String) null, (String) null, (String) null, this.$url, (String) null, (String) null, 114173, (DefaultConstructorMarker) null);
            this.label = 1;
            if (c1.m172966invokegIAlus(logMEntry, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((C23318xe1588488) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
