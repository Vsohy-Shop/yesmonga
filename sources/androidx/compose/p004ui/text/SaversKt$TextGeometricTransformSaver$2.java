package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.style.C16439m;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Landroidx/compose/ui/text/style/m;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/style/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2 */
public final class SaversKt$TextGeometricTransformSaver$2 extends Lambda implements C11300l<Object, C16439m> {

    /* renamed from: f */
    public static final SaversKt$TextGeometricTransformSaver$2 f39909f = new SaversKt$TextGeometricTransformSaver$2();

    public SaversKt$TextGeometricTransformSaver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final C16439m invoke(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "it");
        List list = (List) obj;
        return new C16439m(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }
}
