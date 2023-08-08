package androidx.compose.p004ui.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15240j2;
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

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Landroidx/compose/ui/graphics/e4;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/graphics/e4;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n70#2:428\n1#3:424\n1#3:427\n1#3:429\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n*L\n348#1:422,2\n349#1:425,2\n350#1:428\n348#1:424\n349#1:427\n350#1:429\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$ShadowSaver$2 */
public final class SaversKt$ShadowSaver$2 extends Lambda implements C11300l<Object, C15205e4> {

    /* renamed from: f */
    public static final SaversKt$ShadowSaver$2 f39903f = new SaversKt$ShadowSaver$2();

    public SaversKt$ShadowSaver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final C15205e4 invoke(@C12579k Object obj) {
        C15240j2 j2Var;
        C15094f fVar;
        Intrinsics.checkNotNullParameter(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C8628e<C15240j2, Object> i = SaversKt.m72294i(C15240j2.f37547b);
        Boolean bool = Boolean.FALSE;
        Float f = null;
        if (!Intrinsics.areEqual(obj2, (Object) bool) && obj2 != null) {
            j2Var = i.mo16407b(obj2);
        } else {
            j2Var = null;
        }
        Intrinsics.checkNotNull(j2Var);
        long M = j2Var.mo42833M();
        Object obj3 = list.get(1);
        C8628e<C15094f, Object> h = SaversKt.m72293h(C15094f.f37256b);
        if (!Intrinsics.areEqual(obj3, (Object) bool) && obj3 != null) {
            fVar = h.mo16407b(obj3);
        } else {
            fVar = null;
        }
        Intrinsics.checkNotNull(fVar);
        long A = fVar.mo42242A();
        Object obj4 = list.get(2);
        if (obj4 != null) {
            f = (Float) obj4;
        }
        Intrinsics.checkNotNull(f);
        return new C15205e4(M, A, f.floatValue(), (DefaultConstructorMarker) null);
    }
}
