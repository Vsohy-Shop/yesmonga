package androidx.compose.foundation.text;

import androidx.compose.p004ui.graphics.drawscope.C15187e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/drawscope/e;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/e;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$drawTextAndSelectionBehind$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,702:1\n214#2,8:703\n261#2,11:711\n245#2:722\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$drawTextAndSelectionBehind$1\n*L\n463#1:703,8\n463#1:711,11\n469#1:722\n*E\n"})
public final class TextController$drawTextAndSelectionBehind$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextController$drawTextAndSelectionBehind$1(TextController textController) {
        super(1);
        this.this$0 = textController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        r3 = r3.mo9702c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.drawscope.C15187e r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.String r1 = "$this$drawBehind"
            r12 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            androidx.compose.foundation.text.TextController r1 = r0.this$0
            androidx.compose.foundation.text.TextState r1 = r1.mo9331l()
            androidx.compose.ui.text.h0 r1 = r1.mo9469d()
            if (r1 == 0) goto L_0x011b
            androidx.compose.foundation.text.TextController r2 = r0.this$0
            androidx.compose.foundation.text.TextState r3 = r2.mo9331l()
            r3.mo9466a()
            androidx.compose.foundation.text.selection.n r3 = r2.f7170b
            if (r3 == 0) goto L_0x003d
            java.util.Map r3 = r3.mo9702c()
            if (r3 == 0) goto L_0x003d
            androidx.compose.foundation.text.TextState r4 = r2.mo9331l()
            long r4 = r4.mo9473h()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            androidx.compose.foundation.text.selection.i r3 = (androidx.compose.foundation.text.selection.C2830i) r3
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            androidx.compose.foundation.text.TextState r4 = r2.mo9331l()
            androidx.compose.foundation.text.selection.h r4 = r4.mo9472g()
            r5 = 0
            if (r4 == 0) goto L_0x004e
            int r4 = r4.mo9860g()
            goto L_0x004f
        L_0x004e:
            r4 = r5
        L_0x004f:
            if (r3 == 0) goto L_0x010e
            boolean r6 = r3.mo9871g()
            if (r6 != 0) goto L_0x0060
            androidx.compose.foundation.text.selection.i$a r6 = r3.mo9872h()
            int r6 = r6.mo9883g()
            goto L_0x0068
        L_0x0060:
            androidx.compose.foundation.text.selection.i$a r6 = r3.mo9870f()
            int r6 = r6.mo9883g()
        L_0x0068:
            int r6 = kotlin.ranges.C11479u.m44334I(r6, r5, r4)
            boolean r7 = r3.mo9871g()
            if (r7 != 0) goto L_0x007b
            androidx.compose.foundation.text.selection.i$a r3 = r3.mo9870f()
            int r3 = r3.mo9883g()
            goto L_0x0083
        L_0x007b:
            androidx.compose.foundation.text.selection.i$a r3 = r3.mo9872h()
            int r3 = r3.mo9883g()
        L_0x0083:
            int r3 = kotlin.ranges.C11479u.m44334I(r3, r5, r4)
            if (r6 == r3) goto L_0x010e
            androidx.compose.ui.text.k r4 = r1.mo47069w()
            androidx.compose.ui.graphics.i3 r3 = r4.mo47388C(r6, r3)
            androidx.compose.ui.text.g0 r4 = r1.mo47058l()
            int r4 = r4.mo47034h()
            androidx.compose.ui.text.style.r$a r5 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r5 = r5.mo47728e()
            boolean r4 = androidx.compose.p004ui.text.style.C16449r.m74263g(r4, r5)
            if (r4 == 0) goto L_0x00ba
            androidx.compose.foundation.text.TextState r2 = r2.mo9331l()
            long r4 = r2.mo9474i()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 60
            r11 = 0
            r2 = r22
            androidx.compose.p004ui.graphics.drawscope.C15187e.m65698O1(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            goto L_0x010e
        L_0x00ba:
            r14 = 0
            r15 = 0
            long r4 = r22.mo42718b()
            float r16 = androidx.compose.p004ui.geometry.C15104m.m65023t(r4)
            long r4 = r22.mo42718b()
            float r17 = androidx.compose.p004ui.geometry.C15104m.m65016m(r4)
            androidx.compose.ui.graphics.i2$a r4 = androidx.compose.p004ui.graphics.C15229i2.f37536b
            int r18 = r4.mo42798b()
            androidx.compose.ui.graphics.drawscope.d r11 = r22.mo42683q5()
            long r9 = r11.mo42704b()
            androidx.compose.ui.graphics.b2 r4 = r11.mo42705c()
            r4.mo42422E()
            androidx.compose.ui.graphics.drawscope.i r13 = r11.mo42703a()
            r13.mo42710c(r14, r15, r16, r17, r18)
            androidx.compose.foundation.text.TextState r2 = r2.mo9331l()
            long r4 = r2.mo9474i()
            r6 = 0
            r7 = 0
            r8 = 0
            r13 = 0
            r14 = 60
            r15 = 0
            r2 = r22
            r19 = r9
            r9 = r13
            r10 = r14
            r13 = r11
            r11 = r15
            androidx.compose.p004ui.graphics.drawscope.C15187e.m65698O1(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.graphics.b2 r2 = r13.mo42705c()
            r2.mo42443q()
            r2 = r19
            r13.mo42706d(r2)
        L_0x010e:
            androidx.compose.ui.graphics.drawscope.d r2 = r22.mo42683q5()
            androidx.compose.ui.graphics.b2 r2 = r2.mo42705c()
            androidx.compose.foundation.text.r$a r3 = androidx.compose.foundation.text.C2785r.f7326l
            r3.mo9585a(r2, r1)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextController$drawTextAndSelectionBehind$1.invoke(androidx.compose.ui.graphics.drawscope.e):void");
    }
}
