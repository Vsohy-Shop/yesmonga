package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15229i2;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$outlineCutout$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1124:1\n221#2:1125\n261#2,11:1126\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$outlineCutout$1\n*L\n1108#1:1125\n1108#1:1126,11\n*E\n"})
public final class OutlinedTextFieldKt$outlineCutout$1 extends Lambda implements C11300l<C15184c, C11079d2> {
    final /* synthetic */ long $labelSize;
    final /* synthetic */ C2366i0 $paddingValues;

    /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1$a */
    public /* synthetic */ class C8081a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$outlineCutout$1(long j, C2366i0 i0Var) {
        super(1);
        this.$labelSize = j;
        this.$paddingValues = i0Var;
    }

    /* renamed from: a */
    public final void mo11769a(@C12579k C15184c cVar) {
        float f;
        Intrinsics.checkNotNullParameter(cVar, "$this$drawWithContent");
        float t = C15104m.m65023t(this.$labelSize);
        if (t > 0.0f) {
            float g5 = cVar.mo7425g5(OutlinedTextFieldKt.f19536a);
            float g52 = cVar.mo7425g5(this.$paddingValues.mo8091b(cVar.getLayoutDirection())) - g5;
            float f2 = (float) 2;
            float f3 = t + g52 + (g5 * f2);
            LayoutDirection layoutDirection = cVar.getLayoutDirection();
            int[] iArr = C8081a.$EnumSwitchMapping$0;
            if (iArr[layoutDirection.ordinal()] == 1) {
                f = C15104m.m65023t(cVar.mo42718b()) - f3;
            } else {
                f = C11479u.m44444t(g52, 0.0f);
            }
            float f4 = f;
            if (iArr[cVar.getLayoutDirection().ordinal()] == 1) {
                f3 = C15104m.m65023t(cVar.mo42718b()) - C11479u.m44444t(g52, 0.0f);
            }
            float f5 = f3;
            float m = C15104m.m65016m(this.$labelSize);
            float f6 = (-m) / f2;
            float f7 = m / f2;
            int a = C15229i2.f37536b.mo42797a();
            C15186d q5 = cVar.mo42683q5();
            long b = q5.mo42704b();
            q5.mo42705c().mo42422E();
            q5.mo42703a().mo42710c(f4, f6, f5, f7, a);
            cVar.mo42716g6();
            q5.mo42705c().mo42443q();
            q5.mo42706d(b);
            return;
        }
        cVar.mo42716g6();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11769a((C15184c) obj);
        return C11079d2.f28267a;
    }
}
