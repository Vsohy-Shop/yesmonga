package androidx.compose.p004ui.semantics;

import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "", "parentValue", "childValue", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsProperties$ContentDescription$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1195:1\n1#2:1196\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1 */
public final class SemanticsProperties$ContentDescription$1 extends Lambda implements C11304p<List<? extends String>, List<? extends String>, List<? extends String>> {

    /* renamed from: f */
    public static final SemanticsProperties$ContentDescription$1 f39751f = new SemanticsProperties$ContentDescription$1();

    public SemanticsProperties$ContentDescription$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final List<String> invoke(@C12580l List<String> list, @C12579k List<String> list2) {
        List<String> T5;
        Intrinsics.checkNotNullParameter(list2, "childValue");
        if (list == null || (T5 = CollectionsKt___CollectionsKt.m40572T5(list)) == null) {
            return list2;
        }
        T5.addAll(list2);
        return T5;
    }
}
