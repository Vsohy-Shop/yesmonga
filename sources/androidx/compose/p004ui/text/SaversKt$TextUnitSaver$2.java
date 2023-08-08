package androidx.compose.p004ui.text;

import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.C16507v;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Landroidx/compose/ui/unit/t;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/unit/t;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n*L\n374#1:422\n374#1:423\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$TextUnitSaver$2 */
public final class SaversKt$TextUnitSaver$2 extends Lambda implements C11300l<Object, C16504t> {

    /* renamed from: f */
    public static final SaversKt$TextUnitSaver$2 f39915f = new SaversKt$TextUnitSaver$2();

    public SaversKt$TextUnitSaver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final C16504t invoke(@C12579k Object obj) {
        Float f;
        Intrinsics.checkNotNullParameter(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C16507v vVar = null;
        if (obj2 != null) {
            f = (Float) obj2;
        } else {
            f = null;
        }
        Intrinsics.checkNotNull(f);
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            vVar = (C16507v) obj3;
        }
        Intrinsics.checkNotNull(vVar);
        return C16504t.m74676c(C16506u.m74700a(floatValue, vVar.mo47906j()));
    }
}
