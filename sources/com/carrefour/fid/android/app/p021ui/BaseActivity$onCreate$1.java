package com.carrefour.fid.android.app.p021ui;

import com.carrefour.fid.android.utils.DeviceSecurityHelper;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.app.ui.BaseActivity$onCreate$1", mo22502f = "BaseActivity.kt", mo22503i = {}, mo22504l = {38, 41}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, mo22516d2 = {"Landroidx/viewbinding/b;", "VB", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.app.ui.BaseActivity$onCreate$1 */
public final class BaseActivity$onCreate$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BaseActivity<VB> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseActivity$onCreate$1(BaseActivity<VB> baseActivity, C11045c<? super BaseActivity$onCreate$1> cVar) {
        super(2, cVar);
        this.this$0 = baseActivity;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new BaseActivity$onCreate$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            DeviceSecurityHelper W0 = this.this$0.mo32766W0();
            this.label = 1;
            obj = W0.mo67055g(this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            DeviceSecurityHelper deviceSecurityHelper = (DeviceSecurityHelper) this.L$0;
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            DeviceSecurityHelper W02 = this.this$0.mo32766W0();
            W02.mo67056h();
            this.L$0 = W02;
            this.label = 2;
            if (W02.mo67054f(this) == h) {
                return h;
            }
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BaseActivity$onCreate$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
