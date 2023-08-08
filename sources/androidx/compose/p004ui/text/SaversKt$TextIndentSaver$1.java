package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.runtime.saveable.C8629f;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/ui/text/style/o;", "it", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/ui/text/style/o;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.SaversKt$TextIndentSaver$1 */
public final class SaversKt$TextIndentSaver$1 extends Lambda implements C11304p<C8629f, C16442o, Object> {

    /* renamed from: f */
    public static final SaversKt$TextIndentSaver$1 f39910f = new SaversKt$TextIndentSaver$1();

    public SaversKt$TextIndentSaver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final Object invoke(@C12579k C8629f fVar, @C12579k C16442o oVar) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(oVar, "it");
        C16504t c = C16504t.m74676c(oVar.mo47701d());
        C16504t.C16505a aVar = C16504t.f40903b;
        return CollectionsKt__CollectionsKt.m40463r(SaversKt.m72311z(c, SaversKt.m72304s(aVar), fVar), SaversKt.m72311z(C16504t.m74676c(oVar.mo47702e()), SaversKt.m72304s(aVar), fVar));
    }
}
