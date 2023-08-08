package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.style.C16415e;
import androidx.compose.p004ui.text.style.C16417f;
import androidx.compose.p004ui.text.style.C16426h;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16436k;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.runtime.saveable.C8628e;
import com.urbanairship.push.notifications.C9527p;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Landroidx/compose/ui/text/t;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/t;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n70#2:424\n55#2,2:426\n55#2,2:429\n1#3:423\n1#3:425\n1#3:428\n1#3:431\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n*L\n213#1:422\n214#1:424\n215#1:426,2\n216#1:429,2\n213#1:423\n214#1:425\n215#1:428\n216#1:431\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2 */
public final class SaversKt$ParagraphStyleSaver$2 extends Lambda implements C11300l<Object, C16451t> {

    /* renamed from: f */
    public static final SaversKt$ParagraphStyleSaver$2 f39901f = new SaversKt$ParagraphStyleSaver$2();

    public SaversKt$ParagraphStyleSaver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final C16451t invoke(@C12579k Object obj) {
        C16432i iVar;
        C16436k kVar;
        C16504t tVar;
        C16442o oVar;
        Intrinsics.checkNotNullParameter(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        if (obj2 != null) {
            iVar = (C16432i) obj2;
        } else {
            iVar = null;
        }
        Object obj3 = list.get(1);
        if (obj3 != null) {
            kVar = (C16436k) obj3;
        } else {
            kVar = null;
        }
        Object obj4 = list.get(2);
        C8628e<C16504t, Object> s = SaversKt.m72304s(C16504t.f40903b);
        Boolean bool = Boolean.FALSE;
        if (!Intrinsics.areEqual(obj4, (Object) bool) && obj4 != null) {
            tVar = s.mo16407b(obj4);
        } else {
            tVar = null;
        }
        Intrinsics.checkNotNull(tVar);
        long w = tVar.mo47901w();
        Object obj5 = list.get(3);
        C8628e<C16442o, Object> r = SaversKt.m72303r(C16442o.f40744c);
        if (!Intrinsics.areEqual(obj5, (Object) bool) && obj5 != null) {
            oVar = r.mo16407b(obj5);
        } else {
            oVar = null;
        }
        return new C16451t(iVar, kVar, w, oVar, (C16457x) null, (C16426h) null, (C16417f) null, (C16415e) null, (int) C9527p.f26031b, (DefaultConstructorMarker) null);
    }
}
