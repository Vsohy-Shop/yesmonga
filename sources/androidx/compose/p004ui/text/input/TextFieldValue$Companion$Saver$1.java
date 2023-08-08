package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.SaversKt;
import androidx.compose.runtime.saveable.C8629f;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/ui/text/input/TextFieldValue;", "it", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/ui/text/input/TextFieldValue;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1 */
public final class TextFieldValue$Companion$Saver$1 extends Lambda implements C11304p<C8629f, TextFieldValue, Object> {

    /* renamed from: f */
    public static final TextFieldValue$Companion$Saver$1 f40417f = new TextFieldValue$Companion$Saver$1();

    public TextFieldValue$Companion$Saver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final Object invoke(@C12579k C8629f fVar, @C12579k TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(textFieldValue, "it");
        return CollectionsKt__CollectionsKt.m40463r(SaversKt.m72311z(textFieldValue.mo47111f(), SaversKt.m72290e(), fVar), SaversKt.m72311z(C16356n0.m73730b(textFieldValue.mo47113h()), SaversKt.m72296k(C16356n0.f40590b), fVar));
    }
}
