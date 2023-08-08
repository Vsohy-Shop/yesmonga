package androidx.compose.p004ui.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.runtime.saveable.C8629f;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/ui/geometry/f;", "it", "", "a", "(Landroidx/compose/runtime/saveable/f;J)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.SaversKt$OffsetSaver$1 */
public final class SaversKt$OffsetSaver$1 extends Lambda implements C11304p<C8629f, C15094f, Object> {

    /* renamed from: f */
    public static final SaversKt$OffsetSaver$1 f39898f = new SaversKt$OffsetSaver$1();

    public SaversKt$OffsetSaver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo46252a(@C12579k C8629f fVar, long j) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        if (C15094f.m64876l(j, C15094f.f37256b.mo42247c())) {
            return Boolean.FALSE;
        }
        return CollectionsKt__CollectionsKt.m40463r((Float) SaversKt.m72310y(Float.valueOf(C15094f.m64880p(j))), (Float) SaversKt.m72310y(Float.valueOf(C15094f.m64882r(j))));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo46252a((C8629f) obj, ((C15094f) obj2).mo42242A());
    }
}
