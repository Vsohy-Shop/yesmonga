package androidx.compose.p004ui;

import androidx.compose.p004ui.C8767m;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "acc", "Landroidx/compose/ui/m$c;", "element", "a", "(Ljava/lang/String;Landroidx/compose/ui/m$c;)Ljava/lang/String;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.CombinedModifier$toString$1 */
public final class CombinedModifier$toString$1 extends Lambda implements C11304p<String, C8767m.C8770c, String> {

    /* renamed from: f */
    public static final CombinedModifier$toString$1 f23340f = new CombinedModifier$toString$1();

    public CombinedModifier$toString$1() {
        super(2);
    }

    @C12579k
    /* renamed from: a */
    public final String invoke(@C12579k String str, @C12579k C8767m.C8770c cVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "acc");
        Intrinsics.checkNotNullParameter(cVar, "element");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return cVar.toString();
        }
        return str + ", " + cVar;
    }
}
