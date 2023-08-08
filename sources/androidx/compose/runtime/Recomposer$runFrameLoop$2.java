package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8419d;
import androidx.compose.runtime.snapshots.C8646f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12072o;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "frameTime", "Lkotlinx/coroutines/o;", "Lkotlin/d2;", "a", "(J)Lkotlinx/coroutines/o;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n46#2,5:1409\n46#2,3:1414\n50#2:1443\n70#3:1417\n70#3:1442\n33#4,6:1418\n33#4,6:1424\n33#4,6:1430\n33#4,6:1436\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n*L\n788#1:1409,5\n798#1:1414,3\n798#1:1443\n802#1:1417\n837#1:1442\n805#1:1418,6\n807#1:1424,6\n815#1:1430,6\n830#1:1436,6\n*E\n"})
public final class Recomposer$runFrameLoop$2 extends Lambda implements C11300l<Long, C12072o<? super C11079d2>> {
    final /* synthetic */ C8542g1 $frameSignal;
    final /* synthetic */ List<C8696y> $toApply;
    final /* synthetic */ List<C8696y> $toRecompose;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runFrameLoop$2(Recomposer recomposer, List<C8696y> list, List<C8696y> list2, C8542g1 g1Var) {
        super(1);
        this.this$0 = recomposer;
        this.$toRecompose = list;
        this.$toApply = list2;
        this.$frameSignal = g1Var;
    }

    @C12580l
    /* renamed from: a */
    public final C12072o<C11079d2> mo15288a(long j) {
        int i;
        C12072o<C11079d2> u;
        if (this.this$0.f22714c.mo14874I()) {
            Recomposer recomposer = this.this$0;
            C8601p2 p2Var = C8601p2.f23036a;
            Object a = p2Var.mo16288a("Recomposer:animation");
            try {
                recomposer.f22714c.mo14875K(j);
                C8646f.f23196e.mo16631l();
                C11079d2 d2Var = C11079d2.f28267a;
                p2Var.mo16289b(a);
            } catch (Throwable th) {
                C8601p2.f23036a.mo16289b(a);
                throw th;
            }
        }
        Recomposer recomposer2 = this.this$0;
        List<C8696y> list = this.$toRecompose;
        List<C8696y> list2 = this.$toApply;
        C8542g1 g1Var = this.$frameSignal;
        Object a2 = C8601p2.f23036a.mo16288a("Recomposer:recompose");
        synchronized (recomposer2.f22715d) {
            recomposer2.mo15230G0();
            List A = recomposer2.f22721j;
            int size = A.size();
            for (int i2 = 0; i2 < size; i2++) {
                list2.add((C8696y) A.get(i2));
            }
            recomposer2.f22721j.clear();
            List y = recomposer2.f22720i;
            int size2 = y.size();
            for (int i3 = 0; i3 < size2; i3++) {
                list.add((C8696y) y.get(i3));
            }
            recomposer2.f22720i.clear();
            g1Var.mo16130e();
            C11079d2 d2Var2 = C11079d2.f28267a;
        }
        C8419d dVar = new C8419d();
        try {
            int size3 = list.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C8696y S = recomposer2.mo15226B0(list.get(i4), dVar);
                if (S != null) {
                    list2.add(S);
                }
            }
            list.clear();
            if (!list2.isEmpty()) {
                recomposer2.f22713b = recomposer2.mo15248o0() + 1;
            }
            int size4 = list2.size();
            for (i = 0; i < size4; i++) {
                list2.get(i).mo16367r();
            }
            list2.clear();
            synchronized (recomposer2.f22715d) {
                u = recomposer2.mo15246m0();
            }
            C8601p2.f23036a.mo16289b(a2);
            return u;
        } catch (Throwable th2) {
            C8601p2.f23036a.mo16289b(a2);
            throw th2;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo15288a(((Number) obj).longValue());
    }
}
