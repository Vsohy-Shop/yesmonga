package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.C2230a;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,461:1\n62#2,5:462\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$1$1\n*L\n224#1:462,5\n*E\n"})
public final class DraggableKt$draggable$9$1$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C8700z0<C2230a.C2232b> $draggedInteraction;
    final /* synthetic */ C2243g $interactionSource;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$1$1\n*L\n1#1,484:1\n225#2,5:485\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$1$a */
    public static final class C2151a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C8700z0 f5881a;

        /* renamed from: b */
        public final /* synthetic */ C2243g f5882b;

        public C2151a(C8700z0 z0Var, C2243g gVar) {
            this.f5881a = z0Var;
            this.f5882b = gVar;
        }

        /* renamed from: g */
        public void mo791g() {
            C2230a.C2232b bVar = (C2230a.C2232b) this.f5881a.getValue();
            if (bVar != null) {
                C2243g gVar = this.f5882b;
                if (gVar != null) {
                    gVar.mo7605b(new C2230a.C2231a(bVar));
                }
                this.f5881a.setValue(null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$9$1$1(C8700z0<C2230a.C2232b> z0Var, C2243g gVar) {
        super(1);
        this.$draggedInteraction = z0Var;
        this.$interactionSource = gVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C2151a(this.$draggedInteraction, this.$interactionSource);
    }
}
