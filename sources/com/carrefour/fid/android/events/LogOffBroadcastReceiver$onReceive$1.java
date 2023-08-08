package com.carrefour.fid.android.events;

import android.content.Context;
import android.widget.Toast;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.interactors.account.C37521g;
import com.carrefour.fid.android.shared.util.C28935i;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.events.LogOffBroadcastReceiver$onReceive$1", mo22502f = "LogOffBroadcastReceiver.kt", mo22503i = {}, mo22504l = {47}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LogOffBroadcastReceiver$onReceive$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ LogOffBroadcastReceiver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogOffBroadcastReceiver$onReceive$1(LogOffBroadcastReceiver logOffBroadcastReceiver, Context context, C11045c<? super LogOffBroadcastReceiver$onReceive$1> cVar) {
        super(2, cVar);
        this.this$0 = logOffBroadcastReceiver;
        this.$context = context;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LogOffBroadcastReceiver$onReceive$1(this.this$0, this.$context, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        String str;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C37521g m = this.this$0.mo119676b().mo34021m();
            this.label = 1;
            obj2 = m.m172965invokeIoAF18A(this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            try {
                C11661u0.m45747n(obj);
                obj2 = ((Result) obj).mo21858l();
            } catch (Exception unused) {
                C28935i.m119705e(C28935i.f70940a, "error : failed to refresh token from LogOffBroadcastReceiver", (Throwable) null, 0, 6, (Object) null);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Context context = this.$context;
        if (Result.m38705e(obj2) == null) {
            ((Boolean) obj2).booleanValue();
        } else {
            if (context != null) {
                str = context.getString(R.string.general_error_parameters_server_not_responding_02);
            } else {
                str = null;
            }
            Toast.makeText(context, str, 1).show();
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LogOffBroadcastReceiver$onReceive$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
