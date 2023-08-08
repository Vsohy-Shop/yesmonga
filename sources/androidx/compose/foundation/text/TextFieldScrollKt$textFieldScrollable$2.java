package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,369:1\n76#2:370\n36#3:371\n50#3:378\n49#3:379\n1114#4,6:372\n1114#4,6:380\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n*L\n68#1:370\n70#1:371\n83#1:378\n83#1:379\n70#1:372,6\n83#1:380,6\n*E\n"})
public final class TextFieldScrollKt$textFieldScrollable$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2(TextFieldScrollerPosition textFieldScrollerPosition, boolean z, C2243g gVar) {
        super(3);
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$enabled = z;
        this.$interactionSource = gVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo9413a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r13, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r13 = 805428266(0x3001dc2a, float:4.72428E-10)
            r14.mo14918M(r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0017
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:65)"
            androidx.compose.runtime.ComposerKt.m29845w0(r13, r15, r0, r1)
        L_0x0017:
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r13 = r14.mo15032w(r13)
            androidx.compose.ui.unit.LayoutDirection r15 = androidx.compose.p004ui.unit.LayoutDirection.Rtl
            r0 = 1
            r1 = 0
            if (r13 != r15) goto L_0x0027
            r13 = r0
            goto L_0x0028
        L_0x0027:
            r13 = r1
        L_0x0028:
            androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r12.$scrollerPosition
            androidx.compose.foundation.gestures.Orientation r15 = r15.mo9419f()
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r15 == r2) goto L_0x0037
            if (r13 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r7 = r1
            goto L_0x0038
        L_0x0037:
            r7 = r0
        L_0x0038:
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.$scrollerPosition
            r15 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r15)
            boolean r15 = r14.mo15006n0(r13)
            java.lang.Object r2 = r14.mo14921N()
            if (r15 != 0) goto L_0x0052
            androidx.compose.runtime.o$a r15 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r15 = r15.mo16277a()
            if (r2 != r15) goto L_0x005a
        L_0x0052:
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1 r2 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
            r2.<init>(r13)
            r14.mo14893C(r2)
        L_0x005a:
            r14.mo15002m0()
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            androidx.compose.foundation.gestures.n r13 = androidx.compose.foundation.gestures.ScrollableStateKt.m9406b(r2, r14, r1)
            androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r12.$scrollerPosition
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.mo14918M(r2)
            boolean r2 = r14.mo15006n0(r13)
            boolean r3 = r14.mo15006n0(r15)
            r2 = r2 | r3
            java.lang.Object r3 = r14.mo14921N()
            if (r2 != 0) goto L_0x0082
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x008a
        L_0x0082:
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r3 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
            r3.<init>(r13, r15)
            r14.mo14893C(r3)
        L_0x008a:
            r14.mo15002m0()
            r4 = r3
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r4 = (androidx.compose.foundation.text.C2752x4ee6fee2) r4
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.$scrollerPosition
            androidx.compose.foundation.gestures.Orientation r5 = r13.mo9419f()
            boolean r13 = r12.$enabled
            if (r13 == 0) goto L_0x00ae
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.$scrollerPosition
            float r13 = r13.mo9416c()
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x00a9
            r13 = r0
            goto L_0x00aa
        L_0x00a9:
            r13 = r1
        L_0x00aa:
            if (r13 != 0) goto L_0x00ae
            r6 = r0
            goto L_0x00af
        L_0x00ae:
            r6 = r1
        L_0x00af:
            r8 = 0
            androidx.compose.foundation.interaction.g r9 = r12.$interactionSource
            r10 = 16
            r11 = 0
            androidx.compose.ui.m r13 = androidx.compose.foundation.gestures.ScrollableKt.m9388m(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r15 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r15 == 0) goto L_0x00c2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00c2:
            r14.mo15002m0()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2.mo9413a(androidx.compose.ui.m, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo9413a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
