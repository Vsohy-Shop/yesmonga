package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.snapshots.C8646f;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12072o;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"", "", "changed", "Landroidx/compose/runtime/snapshots/f;", "<anonymous parameter 1>", "Lkotlin/d2;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/f;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1408:1\n70#2:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n*L\n880#1:1409\n*E\n"})
public final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends Lambda implements C11304p<Set<? extends Object>, C8646f, C11079d2> {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2$unregisterApplyObserver$1(Recomposer recomposer) {
        super(2);
        this.this$0 = recomposer;
    }

    /* renamed from: a */
    public final void mo15287a(@C12579k Set<? extends Object> set, @C12579k C8646f fVar) {
        C12072o oVar;
        Intrinsics.checkNotNullParameter(set, "changed");
        Intrinsics.checkNotNullParameter(fVar, "<anonymous parameter 1>");
        Object L = this.this$0.f22715d;
        Recomposer recomposer = this.this$0;
        synchronized (L) {
            if (((Recomposer.State) recomposer.f22730s.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                recomposer.f22719h.addAll(set);
                oVar = recomposer.mo15246m0();
            } else {
                oVar = null;
            }
        }
        if (oVar != null) {
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo15287a((Set) obj, (C8646f) obj2);
        return C11079d2.f28267a;
    }
}
