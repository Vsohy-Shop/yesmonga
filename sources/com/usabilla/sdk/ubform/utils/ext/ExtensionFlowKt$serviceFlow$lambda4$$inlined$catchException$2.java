package com.usabilla.sdk.ubform.utils.ext;

import com.usabilla.sdk.ubform.response.UbError;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONException;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$catchException$2", mo22502f = "ExtensionFlow.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H@¨\u0006\u0006"}, mo22516d2 = {"T", "R", "Lkotlinx/coroutines/flow/f;", "", "exception", "Lkotlin/d2;", "com/usabilla/sdk/ubform/utils/ext/ExtensionFlowKt$catchException$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$serviceFlow$lambda-4$$inlined$catchException$2  reason: invalid class name */
public final class ExtensionFlowKt$serviceFlow$lambda4$$inlined$catchException$2 extends SuspendLambda implements C11305q<C11908f<Object>, Throwable, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public ExtensionFlowKt$serviceFlow$lambda4$$inlined$catchException$2(C11045c cVar) {
        super(3, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<Object> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
        ExtensionFlowKt$serviceFlow$lambda4$$inlined$catchException$2 r1 = new ExtensionFlowKt$serviceFlow$lambda4$$inlined$catchException$2(cVar);
        r1.L$0 = th;
        return r1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            Throwable th = (Throwable) this.L$0;
            if (th instanceof JSONException) {
                throw new UbError.UbParseError(Intrinsics.stringPlus("Parsing exception ", (JSONException) th));
            }
            throw th;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
