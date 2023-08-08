package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.modifier.C15627d;
import androidx.compose.p004ui.modifier.C15636k;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,565:1\n25#2:566\n25#2:573\n25#2:580\n50#2:587\n49#2:588\n25#2:595\n83#2,3:602\n25#2:611\n25#2:622\n1114#3,6:567\n1114#3,6:574\n1114#3,6:581\n1114#3,6:589\n1114#3,6:596\n1114#3,6:605\n1114#3,6:612\n1114#3,3:623\n1117#3,3:629\n474#4,4:618\n478#4,2:626\n482#4:632\n474#5:628\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4\n*L\n138#1:566\n139#1:573\n148#1:580\n149#1:587\n149#1:588\n152#1:595\n154#1:602,3\n172#1:611\n187#1:622\n138#1:567,6\n139#1:574,6\n148#1:581,6\n149#1:589,6\n152#1:596,6\n154#1:605,6\n172#1:612,6\n187#1:623,3\n187#1:629,3\n187#1:618,4\n187#1:626,2\n187#1:632\n187#1:628\n*E\n"})
public final class ClickableKt$clickable$4 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2104a0 $indication;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ C16031g $role;

    /* renamed from: androidx.compose.foundation.ClickableKt$clickable$4$a */
    public static final class C2058a implements C15627d {

        /* renamed from: a */
        public final /* synthetic */ C8700z0<Boolean> f5732a;

        public C2058a(C8700z0<Boolean> z0Var) {
            this.f5732a = z0Var;
        }

        /* renamed from: V3 */
        public void mo7151V3(@C12579k C15636k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "scope");
            this.f5732a.setValue(kVar.mo44518a(ScrollableKt.m9382g()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$4(C11289a<C11079d2> aVar, boolean z, C2243g gVar, C2104a0 a0Var, String str, C16031g gVar2) {
        super(3);
        this.$onClick = aVar;
        this.$enabled = z;
        this.$interactionSource = gVar;
        this.$indication = a0Var;
        this.$onClickLabel = str;
        this.$role = gVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1} */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo7150a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            java.lang.String r2 = "$this$composed"
            r3 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            r2 = 92076020(0x57cf7f4, float:1.1894525E-35)
            r1.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001f
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:135)"
            r5 = r27
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r5, r3, r4)
        L_0x001f:
            kotlin.jvm.functions.a<kotlin.d2> r2 = r0.$onClick
            r3 = 0
            androidx.compose.runtime.k2 r10 = androidx.compose.runtime.C8415c2.m30251t(r2, r1, r3)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r2)
            java.lang.Object r4 = r26.mo14921N()
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r5.mo16277a()
            r7 = 2
            r8 = 0
            if (r4 != r6) goto L_0x0041
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r8, r8, r7, r8)
            r1.mo14893C(r4)
        L_0x0041:
            r26.mo15002m0()
            r9 = r4
            androidx.compose.runtime.z0 r9 = (androidx.compose.runtime.C8700z0) r9
            r1.mo14918M(r2)
            java.lang.Object r4 = r26.mo14921N()
            java.lang.Object r6 = r5.mo16277a()
            if (r4 != r6) goto L_0x005c
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r1.mo14893C(r4)
        L_0x005c:
            r26.mo15002m0()
            r15 = r4
            java.util.Map r15 = (java.util.Map) r15
            r4 = 1841981561(0x6dca6879, float:7.830284E27)
            r1.mo14918M(r4)
            boolean r4 = r0.$enabled
            if (r4 == 0) goto L_0x0073
            androidx.compose.foundation.interaction.g r4 = r0.$interactionSource
            r6 = 560(0x230, float:7.85E-43)
            androidx.compose.foundation.ClickableKt.m8874a(r4, r9, r15, r1, r6)
        L_0x0073:
            r26.mo15002m0()
            kotlin.jvm.functions.a r4 = androidx.compose.foundation.Clickable_androidKt.m8914d(r1, r3)
            r1.mo14918M(r2)
            java.lang.Object r6 = r26.mo14921N()
            java.lang.Object r11 = r5.mo16277a()
            if (r6 != r11) goto L_0x0090
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            androidx.compose.runtime.z0 r6 = androidx.compose.runtime.C8539f2.m30981g(r6, r8, r7, r8)
            r1.mo14893C(r6)
        L_0x0090:
            r26.mo15002m0()
            r12 = r6
            androidx.compose.runtime.z0 r12 = (androidx.compose.runtime.C8700z0) r12
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r6)
            boolean r6 = r1.mo15006n0(r12)
            boolean r11 = r1.mo15006n0(r4)
            r6 = r6 | r11
            java.lang.Object r11 = r26.mo14921N()
            if (r6 != 0) goto L_0x00b1
            java.lang.Object r6 = r5.mo16277a()
            if (r11 != r6) goto L_0x00b9
        L_0x00b1:
            androidx.compose.foundation.ClickableKt$clickable$4$delayPressInteraction$1$1 r11 = new androidx.compose.foundation.ClickableKt$clickable$4$delayPressInteraction$1$1
            r11.<init>(r12, r4)
            r1.mo14893C(r11)
        L_0x00b9:
            r26.mo15002m0()
            androidx.compose.runtime.k2 r11 = androidx.compose.runtime.C8415c2.m30251t(r11, r1, r3)
            r1.mo14918M(r2)
            java.lang.Object r4 = r26.mo14921N()
            java.lang.Object r5 = r5.mo16277a()
            if (r4 != r5) goto L_0x00de
            androidx.compose.ui.geometry.f$a r4 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r4 = r4.mo42248e()
            androidx.compose.ui.geometry.f r4 = androidx.compose.p004ui.geometry.C15094f.m64868d(r4)
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r4, r8, r7, r8)
            r1.mo14893C(r4)
        L_0x00de:
            r26.mo15002m0()
            r17 = r4
            androidx.compose.runtime.z0 r17 = (androidx.compose.runtime.C8700z0) r17
            androidx.compose.ui.m$a r13 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.interaction.g r14 = r0.$interactionSource
            boolean r4 = r0.$enabled
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            r4 = 6
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r17
            boolean r6 = r0.$enabled
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r16 = 1
            r5[r16] = r6
            androidx.compose.foundation.interaction.g r6 = r0.$interactionSource
            r5[r7] = r6
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r11
            r7 = 5
            r5[r7] = r10
            boolean r7 = r0.$enabled
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r1.mo14918M(r3)
            r3 = 0
            r16 = 0
        L_0x0116:
            if (r3 >= r4) goto L_0x0124
            r4 = r5[r3]
            boolean r4 = r1.mo15006n0(r4)
            r16 = r16 | r4
            int r3 = r3 + 1
            r4 = 6
            goto L_0x0116
        L_0x0124:
            java.lang.Object r3 = r26.mo14921N()
            if (r16 != 0) goto L_0x0135
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r3 != r4) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            r2 = r8
            goto L_0x014c
        L_0x0135:
            androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1 r3 = new androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1
            r16 = 0
            r4 = r3
            r5 = r17
            r18 = r6
            r6 = r7
            r7 = r18
            r2 = r8
            r8 = r9
            r9 = r11
            r11 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.mo14893C(r3)
        L_0x014c:
            r26.mo15002m0()
            kotlin.jvm.functions.p r3 = (kotlin.jvm.functions.C11304p) r3
            androidx.compose.ui.m r2 = androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt.m68436b(r13, r14, r2, r3)
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r4)
            java.lang.Object r4 = r26.mo14921N()
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r5.mo16277a()
            if (r4 != r6) goto L_0x0171
            androidx.compose.foundation.ClickableKt$clickable$4$a r4 = new androidx.compose.foundation.ClickableKt$clickable$4$a
            r4.<init>(r12)
            r1.mo14893C(r4)
        L_0x0171:
            r26.mo15002m0()
            androidx.compose.ui.m r4 = (androidx.compose.p004ui.C8767m) r4
            androidx.compose.ui.m r11 = r3.mo17224k3(r4)
            androidx.compose.foundation.interaction.g r13 = r0.$interactionSource
            androidx.compose.foundation.a0 r14 = r0.$indication
            r3 = 773894976(0x2e20b340, float:3.6538994E-11)
            r1.mo14918M(r3)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r3)
            java.lang.Object r3 = r26.mo14921N()
            java.lang.Object r4 = r5.mo16277a()
            if (r3 != r4) goto L_0x01a3
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r3 = androidx.compose.runtime.EffectsKt.m29901m(r3, r1)
            androidx.compose.runtime.w r4 = new androidx.compose.runtime.w
            r4.<init>(r3)
            r1.mo14893C(r4)
            r3 = r4
        L_0x01a3:
            r26.mo15002m0()
            androidx.compose.runtime.w r3 = (androidx.compose.runtime.C8690w) r3
            kotlinx.coroutines.o0 r3 = r3.mo16831a()
            r26.mo15002m0()
            boolean r4 = r0.$enabled
            java.lang.String r5 = r0.$onClickLabel
            androidx.compose.ui.semantics.g r6 = r0.$role
            r21 = 0
            r22 = 0
            kotlin.jvm.functions.a<kotlin.d2> r7 = r0.$onClick
            r12 = r2
            r2 = r15
            r15 = r3
            r16 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r23 = r7
            androidx.compose.ui.m r2 = androidx.compose.foundation.ClickableKt.m8883j(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x01d5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01d5:
            r26.mo15002m0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$clickable$4.mo7150a(androidx.compose.ui.m, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7150a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
