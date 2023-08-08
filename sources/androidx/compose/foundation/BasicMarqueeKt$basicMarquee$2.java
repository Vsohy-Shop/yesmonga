package androidx.compose.foundation;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt$basicMarquee$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,417:1\n76#2:418\n76#2:419\n83#3,3:420\n36#3:430\n1114#4,3:423\n1117#4,3:427\n1114#4,6:431\n88#5:426\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt$basicMarquee$2\n*L\n152#1:418\n153#1:419\n154#1:420,3\n173#1:430\n154#1:423,3\n154#1:427,3\n173#1:431,6\n166#1:426\n*E\n"})
public final class BasicMarqueeKt$basicMarquee$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ int $animationMode;
    final /* synthetic */ int $delayMillis;
    final /* synthetic */ int $initialDelayMillis;
    final /* synthetic */ int $iterations;
    final /* synthetic */ C2124g0 $spacing;
    final /* synthetic */ float $velocity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicMarqueeKt$basicMarquee$2(int i, int i2, int i3, float f, C2124g0 g0Var, int i4) {
        super(3);
        this.$iterations = i;
        this.$delayMillis = i2;
        this.$initialDelayMillis = i3;
        this.$velocity = f;
        this.$spacing = g0Var;
        this.$animationMode = i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.foundation.MarqueeModifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: androidx.compose.foundation.MarqueeModifier} */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0080, code lost:
        if (r12 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0082;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo7129a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r10, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r10 = -562302205(0xffffffffde7bf303, float:-4.53871446E18)
            r11.mo14918M(r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0017
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.basicMarquee.<anonymous> (BasicMarquee.kt:150)"
            androidx.compose.runtime.ComposerKt.m29845w0(r10, r12, r0, r1)
        L_0x0017:
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r11.mo15032w(r10)
            r5 = r10
            androidx.compose.ui.unit.d r5 = (androidx.compose.p004ui.unit.C16479d) r5
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r11.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            r12 = 6
            java.lang.Object[] r0 = new java.lang.Object[r12]
            int r1 = r9.$iterations
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r9.$delayMillis
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            int r1 = r9.$initialDelayMillis
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2
            r0[r3] = r1
            float r1 = r9.$velocity
            androidx.compose.ui.unit.g r1 = androidx.compose.p004ui.unit.C16483g.m74451w(r1)
            r3 = 3
            r0[r3] = r1
            r1 = 4
            r0[r1] = r5
            r1 = 5
            r0[r1] = r10
            int r1 = r9.$iterations
            int r3 = r9.$delayMillis
            int r4 = r9.$initialDelayMillis
            float r6 = r9.$velocity
            r7 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r11.mo14918M(r7)
            r7 = r2
        L_0x0068:
            if (r2 >= r12) goto L_0x0074
            r8 = r0[r2]
            boolean r8 = r11.mo15006n0(r8)
            r7 = r7 | r8
            int r2 = r2 + 1
            goto L_0x0068
        L_0x0074:
            java.lang.Object r12 = r11.mo14921N()
            if (r7 != 0) goto L_0x0082
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r12 != r0) goto L_0x009d
        L_0x0082:
            androidx.compose.foundation.MarqueeModifier r12 = new androidx.compose.foundation.MarqueeModifier
            androidx.compose.ui.unit.LayoutDirection r0 = androidx.compose.p004ui.unit.LayoutDirection.Ltr
            if (r10 != r0) goto L_0x008b
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x008d
        L_0x008b:
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x008d:
            float r6 = r6 * r10
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r6)
            r6 = 0
            r0 = r12
            r2 = r3
            r3 = r4
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.mo14893C(r12)
        L_0x009d:
            r11.mo15002m0()
            androidx.compose.foundation.MarqueeModifier r12 = (androidx.compose.foundation.MarqueeModifier) r12
            androidx.compose.foundation.g0 r10 = r9.$spacing
            r12.mo7217H(r10)
            int r10 = r9.$animationMode
            r12.mo7213D(r10)
            r10 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r10)
            boolean r10 = r11.mo15006n0(r12)
            java.lang.Object r0 = r11.mo14921N()
            if (r10 != 0) goto L_0x00c4
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r0 != r10) goto L_0x00cd
        L_0x00c4:
            androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2$1$1 r0 = new androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2$1$1
            r10 = 0
            r0.<init>(r12, r10)
            r11.mo14893C(r0)
        L_0x00cd:
            r11.mo15002m0()
            kotlin.jvm.functions.p r0 = (kotlin.jvm.functions.C11304p) r0
            r10 = 64
            androidx.compose.runtime.EffectsKt.m29896h(r12, r0, r11, r10)
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x00e0
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00e0:
            r11.mo15002m0()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2.mo7129a(androidx.compose.ui.m, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7129a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
