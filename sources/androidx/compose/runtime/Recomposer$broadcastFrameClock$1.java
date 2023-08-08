package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12080p1;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1408:1\n70#2:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n*L\n138#1:1409\n*E\n"})
public final class Recomposer$broadcastFrameClock$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.this$0 = recomposer;
    }

    public final void invoke() {
        C12072o u;
        Object L = this.this$0.f22715d;
        Recomposer recomposer = this.this$0;
        synchronized (L) {
            u = recomposer.mo15246m0();
            if (((Recomposer.State) recomposer.f22730s.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                throw C12080p1.m48273a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.f22717f);
            }
        }
        if (u != null) {
            Result.C10852a aVar = Result.f28060a;
            u.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
    }
}
