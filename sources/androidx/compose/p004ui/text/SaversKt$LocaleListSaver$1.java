package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.intl.C16340e;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.runtime.saveable.C8629f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/ui/text/intl/f;", "it", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/ui/text/intl/f;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2,2:429\n38#2:431\n156#2:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n*L\n404#1:422,3\n404#1:425,4\n404#1:429,2\n404#1:431\n404#1:432\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$LocaleListSaver$1 */
public final class SaversKt$LocaleListSaver$1 extends Lambda implements C11304p<C8629f, C16342f, Object> {

    /* renamed from: f */
    public static final SaversKt$LocaleListSaver$1 f39894f = new SaversKt$LocaleListSaver$1();

    public SaversKt$LocaleListSaver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final Object invoke(@C12579k C8629f fVar, @C12579k C16342f fVar2) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(fVar2, "it");
        List<C16340e> q = fVar2.mo47375q();
        ArrayList arrayList = new ArrayList(q.size());
        int size = q.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(SaversKt.m72311z(q.get(i), SaversKt.m72298m(C16340e.f40568b), fVar));
        }
        return arrayList;
    }
}
