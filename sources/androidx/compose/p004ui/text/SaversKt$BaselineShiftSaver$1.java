package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.runtime.saveable.C8629f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/ui/text/style/a;", "it", "", "a", "(Landroidx/compose/runtime/saveable/f;F)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1 */
public final class SaversKt$BaselineShiftSaver$1 extends Lambda implements C11304p<C8629f, C16410a, Object> {

    /* renamed from: f */
    public static final SaversKt$BaselineShiftSaver$1 f39888f = new SaversKt$BaselineShiftSaver$1();

    public SaversKt$BaselineShiftSaver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final Object mo46242a(@C12579k C8629f fVar, float f) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        return Float.valueOf(f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo46242a((C8629f) obj, ((C16410a) obj2).mo47589k());
    }
}
