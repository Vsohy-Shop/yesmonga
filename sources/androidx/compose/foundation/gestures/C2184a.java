package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15491o;
import androidx.compose.p004ui.input.pointer.C15507w;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,35:1\n59#2,3:36\n62#2,2:43\n64#2:46\n33#3,4:39\n38#3:45\n154#4:47\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n33#1:36,3\n33#1:43,2\n33#1:46\n33#1:39,4\n33#1:45\n33#1:47\n*E\n"})
/* renamed from: androidx.compose.foundation.gestures.a */
public final class C2184a implements C2200k {
    @C12579k

    /* renamed from: a */
    public static final C2184a f5921a = new C2184a();

    /* renamed from: a */
    public long mo7533a(@C12579k C16479d dVar, @C12579k C15491o oVar, long j) {
        Intrinsics.checkNotNullParameter(dVar, "$this$calculateMouseWheelScroll");
        Intrinsics.checkNotNullParameter(oVar, "event");
        List<C15507w> e = oVar.mo44110e();
        C15094f d = C15094f.m64868d(C15094f.f37256b.mo42248e());
        int size = e.size();
        for (int i = 0; i < size; i++) {
            d = C15094f.m64868d(C15094f.m64886v(d.mo42242A(), e.get(i).mo44184x()));
        }
        return C15094f.m64888x(d.mo42242A(), -dVar.mo7425g5(C16483g.m74435M((float) 64)));
    }
}
