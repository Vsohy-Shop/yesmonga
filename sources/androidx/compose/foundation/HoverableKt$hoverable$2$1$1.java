package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2237c;
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
@C11363r0({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,116:1\n62#2,5:117\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$1$1\n*L\n84#1:117,5\n*E\n"})
public final class HoverableKt$hoverable$2$1$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C8700z0<C2237c.C2238a> $hoverInteraction$delegate;
    final /* synthetic */ C2243g $interactionSource;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$1$1\n*L\n1#1,484:1\n84#2:485\n*E\n"})
    /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$1$1$a */
    public static final class C2088a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C8700z0 f5744a;

        /* renamed from: b */
        public final /* synthetic */ C2243g f5745b;

        public C2088a(C8700z0 z0Var, C2243g gVar) {
            this.f5744a = z0Var;
            this.f5745b = gVar;
        }

        /* renamed from: g */
        public void mo791g() {
            HoverableKt$hoverable$2.m8960i(this.f5744a, this.f5745b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverableKt$hoverable$2$1$1(C8700z0<C2237c.C2238a> z0Var, C2243g gVar) {
        super(1);
        this.$hoverInteraction$delegate = z0Var;
        this.$interactionSource = gVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C2088a(this.$hoverInteraction$delegate, this.$interactionSource);
    }
}
