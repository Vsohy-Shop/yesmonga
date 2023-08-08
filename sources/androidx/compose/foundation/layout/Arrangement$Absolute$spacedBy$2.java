package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "<anonymous parameter 1>", "a", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class Arrangement$Absolute$spacedBy$2 extends Lambda implements C11304p<Integer, LayoutDirection, Integer> {
    final /* synthetic */ C8734c.C8737c $alignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Arrangement$Absolute$spacedBy$2(C8734c.C8737c cVar) {
        super(2);
        this.$alignment = cVar;
    }

    @C12579k
    /* renamed from: a */
    public final Integer mo7678a(int i, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
        return Integer.valueOf(this.$alignment.mo17076a(0, i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo7678a(((Number) obj).intValue(), (LayoutDirection) obj2);
    }
}
