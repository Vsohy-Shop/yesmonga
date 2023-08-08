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
@C11363r0({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,565:1\n25#2:566\n25#2:573\n50#2:580\n49#2:581\n25#2:588\n50#2:595\n49#2:596\n25#2:603\n83#2,3:610\n25#2:619\n25#2:630\n1114#3,6:567\n1114#3,6:574\n1114#3,6:582\n1114#3,6:589\n1114#3,6:597\n1114#3,6:604\n1114#3,6:613\n1114#3,6:620\n1114#3,3:631\n1117#3,3:637\n474#4,4:626\n478#4,2:634\n482#4:640\n474#5:636\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$4\n*L\n313#1:566\n314#1:573\n318#1:580\n318#1:581\n334#1:588\n335#1:595\n335#1:596\n338#1:603\n341#1:610,3\n369#1:619\n384#1:630\n313#1:567,6\n314#1:574,6\n318#1:582,6\n334#1:589,6\n335#1:597,6\n338#1:604,6\n341#1:613,6\n369#1:620,6\n384#1:631,3\n384#1:637,3\n384#1:626,4\n384#1:634,2\n384#1:640\n384#1:636\n*E\n"})
public final class ClickableKt$combinedClickable$4 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2104a0 $indication;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ C11289a<C11079d2> $onDoubleClick;
    final /* synthetic */ C11289a<C11079d2> $onLongClick;
    final /* synthetic */ String $onLongClickLabel;
    final /* synthetic */ C16031g $role;

    /* renamed from: androidx.compose.foundation.ClickableKt$combinedClickable$4$a */
    public static final class C2061a implements C15627d {

        /* renamed from: a */
        public final /* synthetic */ C8700z0<Boolean> f5733a;

        public C2061a(C8700z0<Boolean> z0Var) {
            this.f5733a = z0Var;
        }

        /* renamed from: V3 */
        public void mo7151V3(@C12579k C15636k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "scope");
            this.f5733a.setValue(kVar.mo44518a(ScrollableKt.m9382g()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$combinedClickable$4(C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, boolean z, C2243g gVar, C2104a0 a0Var, String str, C16031g gVar2, String str2) {
        super(3);
        this.$onClick = aVar;
        this.$onLongClick = aVar2;
        this.$onDoubleClick = aVar3;
        this.$enabled = z;
        this.$interactionSource = gVar;
        this.$indication = a0Var;
        this.$onClickLabel = str;
        this.$role = gVar2;
        this.$onLongClickLabel = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1} */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo7156a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r31, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r32, int r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r32
            java.lang.String r2 = "$this$composed"
            r3 = r31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            r2 = 1841718000(0x6dc662f0, float:7.674705E27)
            r1.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001f
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:306)"
            r5 = r33
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r5, r3, r4)
        L_0x001f:
            kotlin.jvm.functions.a<kotlin.d2> r2 = r0.$onClick
            r3 = 0
            androidx.compose.runtime.k2 r14 = androidx.compose.runtime.C8415c2.m30251t(r2, r1, r3)
            kotlin.jvm.functions.a<kotlin.d2> r2 = r0.$onLongClick
            androidx.compose.runtime.k2 r10 = androidx.compose.runtime.C8415c2.m30251t(r2, r1, r3)
            kotlin.jvm.functions.a<kotlin.d2> r2 = r0.$onDoubleClick
            androidx.compose.runtime.k2 r9 = androidx.compose.runtime.C8415c2.m30251t(r2, r1, r3)
            kotlin.jvm.functions.a<kotlin.d2> r2 = r0.$onLongClick
            if (r2 == 0) goto L_0x0038
            r8 = 1
            goto L_0x0039
        L_0x0038:
            r8 = r3
        L_0x0039:
            kotlin.jvm.functions.a<kotlin.d2> r2 = r0.$onDoubleClick
            if (r2 == 0) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = r3
        L_0x0040:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r2)
            java.lang.Object r5 = r32.mo14921N()
            androidx.compose.runtime.o$a r7 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r7.mo16277a()
            r12 = 2
            r13 = 0
            if (r5 != r11) goto L_0x005b
            androidx.compose.runtime.z0 r5 = androidx.compose.runtime.C8539f2.m30981g(r13, r13, r12, r13)
            r1.mo14893C(r5)
        L_0x005b:
            r32.mo15002m0()
            r15 = r5
            androidx.compose.runtime.z0 r15 = (androidx.compose.runtime.C8700z0) r15
            r1.mo14918M(r2)
            java.lang.Object r5 = r32.mo14921N()
            java.lang.Object r11 = r7.mo16277a()
            if (r5 != r11) goto L_0x0076
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r1.mo14893C(r5)
        L_0x0076:
            r32.mo15002m0()
            r11 = r5
            java.util.Map r11 = (java.util.Map) r11
            r5 = 1321107720(0x4ebe8108, float:1.59806362E9)
            r1.mo14918M(r5)
            boolean r5 = r0.$enabled
            r4 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            if (r5 == 0) goto L_0x00bf
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            androidx.compose.foundation.interaction.g r12 = r0.$interactionSource
            r1.mo14918M(r4)
            boolean r16 = r1.mo15006n0(r15)
            boolean r17 = r1.mo15006n0(r12)
            r16 = r16 | r17
            java.lang.Object r4 = r32.mo14921N()
            if (r16 != 0) goto L_0x00a8
            java.lang.Object r13 = r7.mo16277a()
            if (r4 != r13) goto L_0x00b0
        L_0x00a8:
            androidx.compose.foundation.ClickableKt$combinedClickable$4$1$1 r4 = new androidx.compose.foundation.ClickableKt$combinedClickable$4$1$1
            r4.<init>(r15, r12)
            r1.mo14893C(r4)
        L_0x00b0:
            r32.mo15002m0()
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            androidx.compose.runtime.EffectsKt.m29891c(r5, r4, r1, r3)
            androidx.compose.foundation.interaction.g r4 = r0.$interactionSource
            r5 = 560(0x230, float:7.85E-43)
            androidx.compose.foundation.ClickableKt.m8874a(r4, r15, r11, r1, r5)
        L_0x00bf:
            r32.mo15002m0()
            kotlin.jvm.functions.a r4 = androidx.compose.foundation.Clickable_androidKt.m8914d(r1, r3)
            r1.mo14918M(r2)
            java.lang.Object r5 = r32.mo14921N()
            java.lang.Object r12 = r7.mo16277a()
            if (r5 != r12) goto L_0x00de
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r12 = 2
            r13 = 0
            androidx.compose.runtime.z0 r5 = androidx.compose.runtime.C8539f2.m30981g(r5, r13, r12, r13)
            r1.mo14893C(r5)
        L_0x00de:
            r32.mo15002m0()
            r13 = r5
            androidx.compose.runtime.z0 r13 = (androidx.compose.runtime.C8700z0) r13
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.mo14918M(r5)
            boolean r5 = r1.mo15006n0(r13)
            boolean r12 = r1.mo15006n0(r4)
            r5 = r5 | r12
            java.lang.Object r12 = r32.mo14921N()
            if (r5 != 0) goto L_0x00ff
            java.lang.Object r5 = r7.mo16277a()
            if (r12 != r5) goto L_0x0107
        L_0x00ff:
            androidx.compose.foundation.ClickableKt$combinedClickable$4$delayPressInteraction$1$1 r12 = new androidx.compose.foundation.ClickableKt$combinedClickable$4$delayPressInteraction$1$1
            r12.<init>(r13, r4)
            r1.mo14893C(r12)
        L_0x0107:
            r32.mo15002m0()
            androidx.compose.runtime.k2 r17 = androidx.compose.runtime.C8415c2.m30251t(r12, r1, r3)
            r1.mo14918M(r2)
            java.lang.Object r4 = r32.mo14921N()
            java.lang.Object r5 = r7.mo16277a()
            if (r4 != r5) goto L_0x012e
            androidx.compose.ui.geometry.f$a r4 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r4 = r4.mo42248e()
            androidx.compose.ui.geometry.f r4 = androidx.compose.p004ui.geometry.C15094f.m64868d(r4)
            r5 = 2
            r7 = 0
            androidx.compose.runtime.z0 r4 = androidx.compose.runtime.C8539f2.m30981g(r4, r7, r5, r7)
            r1.mo14893C(r4)
        L_0x012e:
            r32.mo15002m0()
            r22 = r4
            androidx.compose.runtime.z0 r22 = (androidx.compose.runtime.C8700z0) r22
            androidx.compose.ui.m$a r12 = androidx.compose.p004ui.C8767m.f23478j
            r4 = 4
            java.lang.Object[] r7 = new java.lang.Object[r4]
            androidx.compose.foundation.interaction.g r5 = r0.$interactionSource
            r7[r3] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            r16 = 1
            r7[r16] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r18 = 2
            r7[r18] = r5
            boolean r5 = r0.$enabled
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r18 = 3
            r7[r18] = r5
            r5 = 10
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r22
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r6)
            r2[r16] = r19
            boolean r3 = r0.$enabled
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r19 = 2
            r2[r19] = r3
            r2[r18] = r9
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            r2[r4] = r3
            r3 = 5
            r2[r3] = r10
            androidx.compose.foundation.interaction.g r3 = r0.$interactionSource
            r4 = 6
            r2[r4] = r3
            r4 = 7
            r2[r4] = r15
            r4 = 8
            r2[r4] = r17
            r4 = 9
            r2[r4] = r14
            boolean r4 = r0.$enabled
            r5 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r1.mo14918M(r5)
            r18 = r4
            r4 = 10
            r5 = 0
            r16 = 0
        L_0x0198:
            if (r5 >= r4) goto L_0x01a7
            r4 = r2[r5]
            boolean r4 = r1.mo15006n0(r4)
            r16 = r16 | r4
            int r5 = r5 + 1
            r4 = 10
            goto L_0x0198
        L_0x01a7:
            java.lang.Object r2 = r32.mo14921N()
            if (r16 != 0) goto L_0x01bd
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r2 != r4) goto L_0x01b6
            goto L_0x01bd
        L_0x01b6:
            r0 = r7
            r21 = r11
            r3 = r12
            r29 = r13
            goto L_0x01d9
        L_0x01bd:
            androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1 r2 = new androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1
            r16 = 0
            r4 = r2
            r5 = r22
            r0 = r7
            r7 = r18
            r21 = r11
            r11 = r3
            r3 = r12
            r12 = r15
            r15 = r13
            r13 = r17
            r29 = r15
            r15 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.mo14893C(r2)
        L_0x01d9:
            r32.mo15002m0()
            kotlin.jvm.functions.p r2 = (kotlin.jvm.functions.C11304p) r2
            androidx.compose.ui.m r17 = androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt.m68439e(r3, r0, r2)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r2)
            java.lang.Object r2 = r32.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r3.mo16277a()
            if (r2 != r4) goto L_0x0200
            androidx.compose.foundation.ClickableKt$combinedClickable$4$a r2 = new androidx.compose.foundation.ClickableKt$combinedClickable$4$a
            r5 = r29
            r2.<init>(r5)
            r1.mo14893C(r2)
        L_0x0200:
            r32.mo15002m0()
            androidx.compose.ui.m r2 = (androidx.compose.p004ui.C8767m) r2
            androidx.compose.ui.m r16 = r0.mo17224k3(r2)
            r0 = r30
            androidx.compose.foundation.interaction.g r2 = r0.$interactionSource
            androidx.compose.foundation.a0 r4 = r0.$indication
            r5 = 773894976(0x2e20b340, float:3.6538994E-11)
            r1.mo14918M(r5)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r5)
            java.lang.Object r5 = r32.mo14921N()
            java.lang.Object r3 = r3.mo16277a()
            if (r5 != r3) goto L_0x0233
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r3 = androidx.compose.runtime.EffectsKt.m29901m(r3, r1)
            androidx.compose.runtime.w r5 = new androidx.compose.runtime.w
            r5.<init>(r3)
            r1.mo14893C(r5)
        L_0x0233:
            r32.mo15002m0()
            androidx.compose.runtime.w r5 = (androidx.compose.runtime.C8690w) r5
            kotlinx.coroutines.o0 r20 = r5.mo16831a()
            r32.mo15002m0()
            boolean r3 = r0.$enabled
            java.lang.String r5 = r0.$onClickLabel
            androidx.compose.ui.semantics.g r6 = r0.$role
            java.lang.String r7 = r0.$onLongClickLabel
            kotlin.jvm.functions.a<kotlin.d2> r8 = r0.$onLongClick
            kotlin.jvm.functions.a<kotlin.d2> r9 = r0.$onClick
            r18 = r2
            r19 = r4
            r23 = r3
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r9
            androidx.compose.ui.m r2 = androidx.compose.foundation.ClickableKt.m8883j(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0268
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0268:
            r32.mo15002m0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$combinedClickable$4.mo7156a(androidx.compose.ui.m, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7156a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
