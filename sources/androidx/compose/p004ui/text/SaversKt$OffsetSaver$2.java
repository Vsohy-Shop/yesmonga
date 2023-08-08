package androidx.compose.p004ui.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Landroidx/compose/ui/geometry/f;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/geometry/f;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n*L\n394#1:422\n394#1:423\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$OffsetSaver$2 */
public final class SaversKt$OffsetSaver$2 extends Lambda implements C11300l<Object, C15094f> {

    /* renamed from: f */
    public static final SaversKt$OffsetSaver$2 f39899f = new SaversKt$OffsetSaver$2();

    public SaversKt$OffsetSaver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final C15094f invoke(@C12579k Object obj) {
        Float f;
        Intrinsics.checkNotNullParameter(obj, "it");
        if (Intrinsics.areEqual(obj, (Object) Boolean.FALSE)) {
            return C15094f.m64868d(C15094f.f37256b.mo42247c());
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f2 = null;
        if (obj2 != null) {
            f = (Float) obj2;
        } else {
            f = null;
        }
        Intrinsics.checkNotNull(f);
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            f2 = (Float) obj3;
        }
        Intrinsics.checkNotNull(f2);
        return C15094f.m64868d(C15096g.m64898a(floatValue, f2.floatValue()));
    }
}
