package androidx.compose.runtime;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,90:1\n70#2:91\n70#2:92\n70#2:93\n70#2:103\n314#3,9:94\n323#3,2:104\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n39#1:91\n51#1:92\n57#1:93\n79#1:103\n78#1:94,9\n78#1:104,2\n*E\n"})
public final class Latch {
    @C12579k

    /* renamed from: a */
    public final Object f22682a = new Object();
    @C12579k

    /* renamed from: b */
    public List<C11045c<C11079d2>> f22683b = new ArrayList();
    @C12579k

    /* renamed from: c */
    public List<C11045c<C11079d2>> f22684c = new ArrayList();

    /* renamed from: d */
    public boolean f22685d = true;

    @C12580l
    /* renamed from: c */
    public final Object mo15138c(@C12579k C11045c<? super C11079d2> cVar) {
        if (mo15140e()) {
            return C11079d2.f28267a;
        }
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        synchronized (this.f22682a) {
            this.f22683b.add(pVar);
        }
        pVar.mo24529C(new Latch$await$2$2(this, pVar));
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: d */
    public final void mo15139d() {
        synchronized (this.f22682a) {
            this.f22685d = false;
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: e */
    public final boolean mo15140e() {
        boolean z;
        synchronized (this.f22682a) {
            z = this.f22685d;
        }
        return z;
    }

    /* renamed from: f */
    public final void mo15141f() {
        synchronized (this.f22682a) {
            if (!mo15140e()) {
                List<C11045c<C11079d2>> list = this.f22683b;
                this.f22683b = this.f22684c;
                this.f22684c = list;
                this.f22685d = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Result.C10852a aVar = Result.f28060a;
                    list.get(i).resumeWith(Result.m38702b(C11079d2.f28267a));
                }
                list.clear();
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    /* renamed from: g */
    public final <R> R mo15142g(@C12579k C11289a<? extends R> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        mo15139d();
        try {
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            mo15141f();
            C11322b0.m43480c(1);
        }
    }
}
