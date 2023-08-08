package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.geometry.C15094f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "", "a", "(I)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.Vertices$outOfBounds$1 */
public final class Vertices$outOfBounds$1 extends Lambda implements C11300l<Integer, Boolean> {
    final /* synthetic */ List<C15094f> $positions;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Vertices$outOfBounds$1(List<C15094f> list) {
        super(1);
        this.$positions = list;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean mo42411a(int i) {
        return Boolean.valueOf(i < 0 || i >= this.$positions.size());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo42411a(((Number) obj).intValue());
    }
}
