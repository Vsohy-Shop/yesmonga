package androidx.compose.p004ui.text;

import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16507v;
import androidx.compose.runtime.saveable.C8629f;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/ui/unit/t;", "it", "", "a", "(Landroidx/compose/runtime/saveable/f;J)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.SaversKt$TextUnitSaver$1 */
public final class SaversKt$TextUnitSaver$1 extends Lambda implements C11304p<C8629f, C16504t, Object> {

    /* renamed from: f */
    public static final SaversKt$TextUnitSaver$1 f39914f = new SaversKt$TextUnitSaver$1();

    public SaversKt$TextUnitSaver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo46268a(@C12579k C8629f fVar, long j) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        return CollectionsKt__CollectionsKt.m40463r(SaversKt.m72310y(Float.valueOf(C16504t.m74687n(j))), SaversKt.m72310y(C16507v.m74729d(C16504t.m74686m(j))));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo46268a((C8629f) obj, ((C16504t) obj2).mo47901w());
    }
}
