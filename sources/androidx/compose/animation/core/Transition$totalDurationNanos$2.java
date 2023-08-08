package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"S", "", "a", "()Ljava/lang/Long;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1155:1\n1855#2,2:1156\n1855#2,2:1158\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n*L\n272#1:1156,2\n275#1:1158,2\n*E\n"})
public final class Transition$totalDurationNanos$2 extends Lambda implements C11289a<Long> {
    final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transition$totalDurationNanos$2(Transition<S> transition) {
        super(0);
        this.this$0 = transition;
    }

    @C12579k
    /* renamed from: a */
    public final Long invoke() {
        long j = 0;
        for (Transition.C1930d h : this.this$0.f5348h) {
            j = Math.max(j, h.mo6736h());
        }
        for (Transition p : this.this$0.f5349i) {
            j = Math.max(j, p.mo6707p());
        }
        return Long.valueOf(j);
    }
}
