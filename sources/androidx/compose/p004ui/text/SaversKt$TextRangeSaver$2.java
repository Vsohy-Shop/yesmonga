package androidx.compose.p004ui.text;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Landroidx/compose/ui/text/n0;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/n0;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n*L\n329#1:422\n329#1:423\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$TextRangeSaver$2 */
public final class SaversKt$TextRangeSaver$2 extends Lambda implements C11300l<Object, C16356n0> {

    /* renamed from: f */
    public static final SaversKt$TextRangeSaver$2 f39913f = new SaversKt$TextRangeSaver$2();

    public SaversKt$TextRangeSaver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final C16356n0 invoke(@C12579k Object obj) {
        Integer num;
        Intrinsics.checkNotNullParameter(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num2 = null;
        if (obj2 != null) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            num2 = (Integer) obj3;
        }
        Intrinsics.checkNotNull(num2);
        return C16356n0.m73730b(C16359o0.m73780b(intValue, num2.intValue()));
    }
}
