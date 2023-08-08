package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.intl.C16340e;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.runtime.saveable.C8628e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Landroidx/compose/ui/text/intl/f;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/intl/f;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2:429\n155#2:433\n38#2:434\n156#2:435\n55#3,2:430\n1#4:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n*L\n411#1:422,3\n411#1:425,4\n411#1:429\n411#1:433\n411#1:434\n411#1:435\n411#1:430,2\n411#1:432\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$LocaleListSaver$2 */
public final class SaversKt$LocaleListSaver$2 extends Lambda implements C11300l<Object, C16342f> {

    /* renamed from: f */
    public static final SaversKt$LocaleListSaver$2 f39895f = new SaversKt$LocaleListSaver$2();

    public SaversKt$LocaleListSaver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final C16342f invoke(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "it");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            C8628e<C16340e, Object> m = SaversKt.m72298m(C16340e.f40568b);
            C16340e eVar = null;
            if (!Intrinsics.areEqual(obj2, (Object) Boolean.FALSE) && obj2 != null) {
                eVar = m.mo16407b(obj2);
            }
            Intrinsics.checkNotNull(eVar);
            arrayList.add(eVar);
        }
        return new C16342f((List<C16340e>) arrayList);
    }
}
