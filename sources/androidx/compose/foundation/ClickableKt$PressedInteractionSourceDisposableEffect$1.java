package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.input.key.C15434a;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8700z0;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,565:1\n62#2,5:566\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n*L\n416#1:566,5\n*E\n"})
public final class ClickableKt$PressedInteractionSourceDisposableEffect$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ Map<C15434a, C2245i.C2247b> $currentKeyPressInteractions;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C8700z0<C2245i.C2247b> $pressedInteraction;

    @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,484:1\n417#2,6:485\n423#2,2:492\n425#2,2:495\n1855#3:491\n1856#3:494\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n*L\n422#1:491\n422#1:494\n*E\n"})
    /* renamed from: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1$a */
    public static final class C2057a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C8700z0 f5729a;

        /* renamed from: b */
        public final /* synthetic */ Map f5730b;

        /* renamed from: c */
        public final /* synthetic */ C2243g f5731c;

        public C2057a(C8700z0 z0Var, Map map, C2243g gVar) {
            this.f5729a = z0Var;
            this.f5730b = map;
            this.f5731c = gVar;
        }

        /* renamed from: g */
        public void mo791g() {
            C2245i.C2247b bVar = (C2245i.C2247b) this.f5729a.getValue();
            if (bVar != null) {
                this.f5731c.mo7605b(new C2245i.C2246a(bVar));
                this.f5729a.setValue(null);
            }
            for (C2245i.C2247b aVar : this.f5730b.values()) {
                this.f5731c.mo7605b(new C2245i.C2246a(aVar));
            }
            this.f5730b.clear();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$PressedInteractionSourceDisposableEffect$1(C8700z0<C2245i.C2247b> z0Var, Map<C15434a, C2245i.C2247b> map, C2243g gVar) {
        super(1);
        this.$pressedInteraction = z0Var;
        this.$currentKeyPressInteractions = map;
        this.$interactionSource = gVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        return new C2057a(this.$pressedInteraction, this.$currentKeyPressInteractions, this.$interactionSource);
    }
}
