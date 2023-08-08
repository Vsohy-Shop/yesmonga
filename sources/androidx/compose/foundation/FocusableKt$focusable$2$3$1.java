package androidx.compose.foundation;

import androidx.compose.p004ui.layout.C15608v0;
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
@C11363r0({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,227:1\n62#2,5:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$3$1\n*L\n123#1:228,5\n*E\n"})
public final class FocusableKt$focusable$2$3$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C8700z0<Boolean> $isFocused$delegate;
    final /* synthetic */ C8700z0<C15608v0.C15609a> $pinHandle$delegate;
    final /* synthetic */ C15608v0 $pinnableContainer;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$3$1\n*L\n1#1,484:1\n124#2,3:485\n*E\n"})
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$3$1$a */
    public static final class C2080a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C8700z0 f5741a;

        public C2080a(C8700z0 z0Var) {
            this.f5741a = z0Var;
        }

        /* renamed from: g */
        public void mo791g() {
            C15608v0.C15609a d = FocusableKt$focusable$2.m8933i(this.f5741a);
            if (d != null) {
                d.release();
            }
            FocusableKt$focusable$2.m8930f(this.f5741a, (C15608v0.C15609a) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusable$2$3$1(C15608v0 v0Var, C8700z0<Boolean> z0Var, C8700z0<C15608v0.C15609a> z0Var2) {
        super(1);
        this.$pinnableContainer = v0Var;
        this.$isFocused$delegate = z0Var;
        this.$pinHandle$delegate = z0Var2;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        C15608v0.C15609a aVar;
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        if (FocusableKt$focusable$2.m8931g(this.$isFocused$delegate)) {
            C8700z0<C15608v0.C15609a> z0Var = this.$pinHandle$delegate;
            C15608v0 v0Var = this.$pinnableContainer;
            if (v0Var != null) {
                aVar = v0Var.mo8743a();
            } else {
                aVar = null;
            }
            FocusableKt$focusable$2.m8930f(z0Var, aVar);
        }
        return new C2080a(this.$pinHandle$delegate);
    }
}
