package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.focus.C15059d;
import androidx.compose.p004ui.layout.C15535b;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.focus.a */
public final class C15053a {
    @C12580l
    @C8761g
    /* renamed from: a */
    public static final <T> T m64680a(@C12579k FocusTargetModifierNode focusTargetModifierNode, int i, @C12579k C11300l<? super C15535b.C15536a, ? extends T> lVar) {
        int i2;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "$this$searchBeyondBounds");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15535b q0 = focusTargetModifierNode.mo42162q0();
        if (q0 == null) {
            return null;
        }
        C15059d.C15060a aVar = C15059d.f37228b;
        if (C15059d.m64709n(i, aVar.mo42193n())) {
            i2 = C15535b.C15537b.f38688b.mo44361a();
        } else if (C15059d.m64709n(i, aVar.mo42184a())) {
            i2 = C15535b.C15537b.f38688b.mo44364d();
        } else if (C15059d.m64709n(i, aVar.mo42188h())) {
            i2 = C15535b.C15537b.f38688b.mo44365e();
        } else if (C15059d.m64709n(i, aVar.mo42192m())) {
            i2 = C15535b.C15537b.f38688b.mo44366f();
        } else if (C15059d.m64709n(i, aVar.mo42189i())) {
            i2 = C15535b.C15537b.f38688b.mo44362b();
        } else if (C15059d.m64709n(i, aVar.mo42191l())) {
            i2 = C15535b.C15537b.f38688b.mo44363c();
        } else {
            throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
        }
        return q0.mo8732a(i2, lVar);
    }
}
