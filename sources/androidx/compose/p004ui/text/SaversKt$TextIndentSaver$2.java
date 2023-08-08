package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.unit.C16504t;
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

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Landroidx/compose/ui/text/style/o;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/style/o;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n1#3:424\n1#3:427\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n*L\n295#1:422,2\n296#1:425,2\n295#1:424\n296#1:427\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$TextIndentSaver$2 */
public final class SaversKt$TextIndentSaver$2 extends Lambda implements C11300l<Object, C16442o> {

    /* renamed from: f */
    public static final SaversKt$TextIndentSaver$2 f39911f = new SaversKt$TextIndentSaver$2();

    public SaversKt$TextIndentSaver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final C16442o invoke(@C12579k Object obj) {
        C16504t tVar;
        Intrinsics.checkNotNullParameter(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C16504t.C16505a aVar = C16504t.f40903b;
        C8628e<C16504t, Object> s = SaversKt.m72304s(aVar);
        Boolean bool = Boolean.FALSE;
        C16504t tVar2 = null;
        if (!Intrinsics.areEqual(obj2, (Object) bool) && obj2 != null) {
            tVar = s.mo16407b(obj2);
        } else {
            tVar = null;
        }
        Intrinsics.checkNotNull(tVar);
        long w = tVar.mo47901w();
        Object obj3 = list.get(1);
        C8628e<C16504t, Object> s2 = SaversKt.m72304s(aVar);
        if (!Intrinsics.areEqual(obj3, (Object) bool) && obj3 != null) {
            tVar2 = s2.mo16407b(obj3);
        }
        Intrinsics.checkNotNull(tVar2);
        return new C16442o(w, tVar2.mo47901w(), (DefaultConstructorMarker) null);
    }
}
