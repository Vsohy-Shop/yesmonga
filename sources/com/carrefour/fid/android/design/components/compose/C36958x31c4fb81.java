package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.runtime.C8592o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"T", "Landroidx/compose/foundation/lazy/e;", "", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/lazy/e;ILandroidx/compose/runtime/o;I)V", "androidx/compose/foundation/lazy/LazyDslKt$items$4"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 ListQuantityComponent.kt\ncom/carrefour/fid/android/design/components/compose/ListQuantityComponentKt$ListQuantityComponent$3$1\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,423:1\n61#2:424\n60#2,4:432\n65#2,6:443\n71#2,2:457\n67#2:460\n64#2,11:461\n25#3:425\n25#3:436\n50#3:449\n49#3:450\n1114#4,6:426\n1114#4,6:437\n1114#4,6:451\n154#5:459\n*S KotlinDebug\n*F\n+ 1 ListQuantityComponent.kt\ncom/carrefour/fid/android/design/components/compose/ListQuantityComponentKt$ListQuantityComponent$3$1\n*L\n61#1:425\n63#1:436\n70#1:449\n70#1:450\n61#1:426,6\n63#1:437,6\n70#1:451,6\n72#1:459\n*E\n"})
/* renamed from: com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$ListQuantityComponent$3$1$invoke$$inlined$items$default$4 */
public final class C36958x31c4fb81 extends Lambda implements C11306r<C2455e, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ C11300l $onClick$inlined;
    final /* synthetic */ int $selectedQuantity$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36958x31c4fb81(List list, C11300l lVar, int i, int i2) {
        super(4);
        this.$items = list;
        this.$onClick$inlined = lVar;
        this.$$dirty$inlined = i;
        this.$selectedQuantity$inlined = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112213a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2455e r29, int r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            java.lang.String r4 = "$this$items"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            r4 = r32 & 14
            if (r4 != 0) goto L_0x001d
            boolean r1 = r3.mo15006n0(r1)
            if (r1 == 0) goto L_0x0019
            r1 = 4
            goto L_0x001a
        L_0x0019:
            r1 = 2
        L_0x001a:
            r1 = r32 | r1
            goto L_0x001f
        L_0x001d:
            r1 = r32
        L_0x001f:
            r4 = r32 & 112(0x70, float:1.57E-43)
            r5 = 16
            if (r4 != 0) goto L_0x0030
            boolean r4 = r3.mo14976f(r2)
            if (r4 == 0) goto L_0x002e
            r4 = 32
            goto L_0x002f
        L_0x002e:
            r4 = r5
        L_0x002f:
            r1 = r1 | r4
        L_0x0030:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r4 != r6) goto L_0x0042
            boolean r4 = r31.mo15011p()
            if (r4 != 0) goto L_0x003d
            goto L_0x0042
        L_0x003d:
            r31.mo14958a0()
            goto L_0x014f
        L_0x0042:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x0051
            r4 = -1
            java.lang.String r6 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)"
            r7 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
            androidx.compose.runtime.ComposerKt.m29845w0(r7, r1, r4, r6)
        L_0x0051:
            java.util.List r1 = r0.$items
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r2)
            java.lang.Object r4 = r31.mo14921N()
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r7 = r6.mo16277a()
            if (r4 != r7) goto L_0x0087
            int r4 = r0.$selectedQuantity$inlined
            if (r1 != r4) goto L_0x007a
            com.carrefour.fid.android.design.theme.b r4 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r7 = r4.mo114219P()
            goto L_0x0080
        L_0x007a:
            com.carrefour.fid.android.design.theme.b r4 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r7 = r4.mo114231a0()
        L_0x0080:
            androidx.compose.ui.graphics.j2 r4 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r7)
            r3.mo14893C(r4)
        L_0x0087:
            r31.mo15002m0()
            androidx.compose.ui.graphics.j2 r4 = (androidx.compose.p004ui.graphics.C15240j2) r4
            long r8 = r4.mo42833M()
            r3.mo14918M(r2)
            java.lang.Object r2 = r31.mo14921N()
            java.lang.Object r4 = r6.mo16277a()
            if (r2 != r4) goto L_0x00b5
            int r2 = r0.$selectedQuantity$inlined
            if (r1 != r2) goto L_0x00a8
            com.carrefour.fid.android.design.theme.b r2 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r10 = r2.mo114231a0()
            goto L_0x00ae
        L_0x00a8:
            com.carrefour.fid.android.design.theme.b r2 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r10 = r2.mo114205B()
        L_0x00ae:
            androidx.compose.ui.graphics.j2 r2 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r10)
            r3.mo14893C(r2)
        L_0x00b5:
            r31.mo15002m0()
            androidx.compose.ui.graphics.j2 r2 = (androidx.compose.p004ui.graphics.C15240j2) r2
            long r26 = r2.mo42833M()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            androidx.compose.ui.text.style.i$a r2 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r13 = r2.mo47667a()
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r7 = 1
            r10 = 0
            r11 = 0
            androidx.compose.ui.m r14 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r11, r7, r10)
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.mo14918M(r7)
            kotlin.jvm.functions.l r7 = r0.$onClick$inlined
            boolean r7 = r3.mo15006n0(r7)
            boolean r2 = r3.mo15006n0(r2)
            r2 = r2 | r7
            java.lang.Object r7 = r31.mo14921N()
            if (r2 != 0) goto L_0x00f7
            java.lang.Object r2 = r6.mo16277a()
            if (r7 != r2) goto L_0x0101
        L_0x00f7:
            com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$ListQuantityComponent$3$1$2$1$1 r7 = new com.carrefour.fid.android.design.components.compose.ListQuantityComponentKt$ListQuantityComponent$3$1$2$1$1
            kotlin.jvm.functions.l r2 = r0.$onClick$inlined
            r7.<init>(r2, r1)
            r3.mo14893C(r7)
        L_0x0101:
            r31.mo15002m0()
            r18 = r7
            kotlin.jvm.functions.a r18 = (kotlin.jvm.functions.C11289a) r18
            r19 = 7
            r20 = 0
            androidx.compose.ui.m r7 = androidx.compose.foundation.ClickableKt.m8878e(r14, r15, r16, r17, r18, r19, r20)
            r10 = 0
            r11 = 2
            r12 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.BackgroundKt.m8825d(r7, r8, r10, r11, r12)
            float r2 = (float) r5
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10024k(r1, r2)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            androidx.compose.ui.text.style.i r13 = androidx.compose.p004ui.text.style.C16432i.m74172g(r13)
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 384(0x180, float:5.38E-43)
            r24 = 0
            r25 = 130552(0x1fdf8, float:1.82942E-40)
            r1 = r4
            r3 = r26
            r22 = r31
            androidx.compose.material.TextKt.m14196c(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x014f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.C36958x31c4fb81.mo112213a(androidx.compose.foundation.lazy.e, int, androidx.compose.runtime.o, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo112213a((C2455e) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
