package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"R", "", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,132:1\n70#2:133\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n*L\n94#1:133\n*E\n"})
public final class BroadcastFrameClock$withFrameNanos$2$1 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ Ref.ObjectRef<BroadcastFrameClock.C8380a<R>> $awaiter;
    final /* synthetic */ BroadcastFrameClock this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastFrameClock$withFrameNanos$2$1(BroadcastFrameClock broadcastFrameClock, Ref.ObjectRef<BroadcastFrameClock.C8380a<R>> objectRef) {
        super(1);
        this.this$0 = broadcastFrameClock;
        this.$awaiter = objectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l Throwable th) {
        BroadcastFrameClock.C8380a aVar;
        Object p = this.this$0.f22554b;
        BroadcastFrameClock broadcastFrameClock = this.this$0;
        Ref.ObjectRef<BroadcastFrameClock.C8380a<R>> objectRef = this.$awaiter;
        synchronized (p) {
            List g = broadcastFrameClock.f22556d;
            T t = objectRef.element;
            if (t == null) {
                Intrinsics.throwUninitializedPropertyAccessException("awaiter");
                aVar = null;
            } else {
                aVar = (BroadcastFrameClock.C8380a) t;
            }
            g.remove(aVar);
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }
}
