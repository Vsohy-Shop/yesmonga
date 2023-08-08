package androidx.compose.foundation;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$excludeFromSystemGestureQ$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,162:1\n62#2,5:163\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$excludeFromSystemGestureQ$1\n*L\n83#1:163,5\n*E\n"})
public final class SystemGestureExclusionKt$excludeFromSystemGestureQ$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C2695t $modifier;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$excludeFromSystemGestureQ$1\n*L\n1#1,484:1\n84#2,2:485\n*E\n"})
    /* renamed from: androidx.compose.foundation.SystemGestureExclusionKt$excludeFromSystemGestureQ$1$a */
    public static final class C2102a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C2695t f5795a;

        public C2102a(C2695t tVar) {
            this.f5795a = tVar;
        }

        /* renamed from: g */
        public void mo791g() {
            this.f5795a.mo9210m();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SystemGestureExclusionKt$excludeFromSystemGestureQ$1(C2695t tVar) {
        super(1);
        this.$modifier = tVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C2102a(this.$modifier);
    }
}
