package androidx.compose.foundation;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16483g;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"Landroidx/compose/ui/layout/h0;", "Landroidx/compose/ui/layout/e0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/g0;", "a", "(Landroidx/compose/ui/layout/h0;Landroidx/compose/ui/layout/e0;J)Landroidx/compose/ui/layout/g0;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,589:1\n92#2:590\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1\n*L\n563#1:590\n*E\n"})
public final class AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 extends Lambda implements C11305q<C15568h0, C15557e0, C16476b, C15564g0> {

    /* renamed from: f */
    public static final AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 f5721f = new AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1();

    public AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1() {
        super(3);
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo7121a(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$layout");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        final C15611w0 t0 = e0Var.mo44324t0(j);
        final int n2 = h0Var.mo7429n2(C16483g.m74435M(C2254l.m9704b() * ((float) 2)));
        return C15568h0.m69206r2(h0Var, t0.mo44416Z() - n2, t0.mo44418f() - n2, (Map) null, new C11300l<C15611w0.C15612a, C11079d2>() {
            /* renamed from: a */
            public final void mo7122a(@C12579k C15611w0.C15612a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$layout");
                C15611w0 w0Var = t0;
                C15611w0.C15612a.m69399D(aVar, w0Var, ((-n2) / 2) - ((w0Var.mo44471K0() - t0.mo44416Z()) / 2), ((-n2) / 2) - ((t0.mo44468G0() - t0.mo44418f()) / 2), 0.0f, (C11300l) null, 12, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo7122a((C15611w0.C15612a) obj);
                return C11079d2.f28267a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7121a((C15568h0) obj, (C15557e0) obj2, ((C16476b) obj3).mo47807x());
    }
}
