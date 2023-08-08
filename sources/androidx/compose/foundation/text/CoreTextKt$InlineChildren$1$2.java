package androidx.compose.foundation.text;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.unit.C16476b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt$InlineChildren$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,702:1\n151#2,3:703\n33#2,4:706\n154#2,2:710\n38#2:712\n156#2:713\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt$InlineChildren$1$2\n*L\n85#1:703,3\n85#1:706,4\n85#1:710,2\n85#1:712\n85#1:713\n*E\n"})
public final class CoreTextKt$InlineChildren$1$2 implements C15560f0 {

    /* renamed from: a */
    public static final CoreTextKt$InlineChildren$1$2 f7102a = new CoreTextKt$InlineChildren$1$2();

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "children");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C15557e0) list.get(i)).mo44324t0(j));
        }
        return C15568h0.m69206r2(h0Var, C16476b.m74362p(j), C16476b.m74361o(j), (Map) null, new CoreTextKt$InlineChildren$1$2$measure$1(arrayList), 4, (Object) null);
    }
}
