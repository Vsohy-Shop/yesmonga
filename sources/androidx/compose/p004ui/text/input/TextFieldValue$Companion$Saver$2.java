package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.SaversKt;
import androidx.compose.runtime.saveable.C8628e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Landroidx/compose/ui/text/input/TextFieldValue;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/input/TextFieldValue;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTextFieldValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n55#2,2:202\n55#2,2:205\n1#3:204\n1#3:207\n*S KotlinDebug\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n*L\n168#1:202,2\n169#1:205,2\n168#1:204\n169#1:207\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2 */
public final class TextFieldValue$Companion$Saver$2 extends Lambda implements C11300l<Object, TextFieldValue> {

    /* renamed from: f */
    public static final TextFieldValue$Companion$Saver$2 f40418f = new TextFieldValue$Companion$Saver$2();

    public TextFieldValue$Companion$Saver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final TextFieldValue invoke(@C12579k Object obj) {
        C16156d dVar;
        Intrinsics.checkNotNullParameter(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C8628e<C16156d, Object> e = SaversKt.m72290e();
        Boolean bool = Boolean.FALSE;
        C16356n0 n0Var = null;
        if (!Intrinsics.areEqual(obj2, (Object) bool) && obj2 != null) {
            dVar = e.mo16407b(obj2);
        } else {
            dVar = null;
        }
        Intrinsics.checkNotNull(dVar);
        Object obj3 = list.get(1);
        C8628e<C16356n0, Object> k = SaversKt.m72296k(C16356n0.f40590b);
        if (!Intrinsics.areEqual(obj3, (Object) bool) && obj3 != null) {
            n0Var = k.mo16407b(obj3);
        }
        Intrinsics.checkNotNull(n0Var);
        return new TextFieldValue(dVar, n0Var.mo47427r(), (C16356n0) null, 4, (DefaultConstructorMarker) null);
    }
}
