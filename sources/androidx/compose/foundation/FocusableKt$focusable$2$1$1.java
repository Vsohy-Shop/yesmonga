package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2234b;
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
@C11363r0({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,227:1\n62#2,5:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$1$1\n*L\n86#1:228,5\n*E\n"})
public final class FocusableKt$focusable$2$1$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C8700z0<C2234b.C2235a> $focusedInteraction;
    final /* synthetic */ C2243g $interactionSource;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$1$1\n*L\n1#1,484:1\n87#2,6:485\n*E\n"})
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$1$1$a */
    public static final class C2079a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C8700z0 f5739a;

        /* renamed from: b */
        public final /* synthetic */ C2243g f5740b;

        public C2079a(C8700z0 z0Var, C2243g gVar) {
            this.f5739a = z0Var;
            this.f5740b = gVar;
        }

        /* renamed from: g */
        public void mo791g() {
            C2234b.C2235a aVar = (C2234b.C2235a) this.f5739a.getValue();
            if (aVar != null) {
                C2234b.C2236b bVar = new C2234b.C2236b(aVar);
                C2243g gVar = this.f5740b;
                if (gVar != null) {
                    gVar.mo7605b(bVar);
                }
                this.f5739a.setValue(null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusable$2$1$1(C8700z0<C2234b.C2235a> z0Var, C2243g gVar) {
        super(1);
        this.$focusedInteraction = z0Var;
        this.$interactionSource = gVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C2079a(this.$focusedInteraction, this.$interactionSource);
    }
}
