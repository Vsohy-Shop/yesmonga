package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12080p1;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "throwable", "Lkotlin/d2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1408:1\n70#2:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$effectJob$1$1\n*L\n234#1:1409\n*E\n"})
public final class Recomposer$effectJob$1$1 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l Throwable th) {
        C12072o oVar;
        C12072o oVar2;
        CancellationException a = C12080p1.m48273a("Recomposer effect job completed", th);
        Object L = this.this$0.f22715d;
        Recomposer recomposer = this.this$0;
        synchronized (L) {
            C11723c2 I = recomposer.f22716e;
            oVar = null;
            if (I != null) {
                recomposer.f22730s.setValue(Recomposer.State.ShuttingDown);
                if (!recomposer.f22728q) {
                    I.mo23621a(a);
                } else if (recomposer.f22726o != null) {
                    oVar2 = recomposer.f22726o;
                    recomposer.f22726o = null;
                    I.mo23589D(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                    oVar = oVar2;
                }
                oVar2 = null;
                recomposer.f22726o = null;
                I.mo23589D(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                oVar = oVar2;
            } else {
                recomposer.f22717f = a;
                recomposer.f22730s.setValue(Recomposer.State.ShutDown);
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
        if (oVar != null) {
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
    }
}
