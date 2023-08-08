package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/ui/unit/q;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/m;", "a", "(JLandroidx/compose/ui/unit/LayoutDirection;)J"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SizeKt$createWrapContentWidthModifier$1 extends Lambda implements C11304p<C16500q, LayoutDirection, C16494m> {
    final /* synthetic */ C8734c.C8736b $align;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$createWrapContentWidthModifier$1(C8734c.C8736b bVar) {
        super(2);
        this.$align = bVar;
    }

    /* renamed from: a */
    public final long mo7872a(long j, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return C16496n.m74593a(this.$align.mo17075a(0, C16500q.m74662m(j), layoutDirection), 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C16494m.m74570b(mo7872a(((C16500q) obj).mo47895q(), (LayoutDirection) obj2));
    }
}
