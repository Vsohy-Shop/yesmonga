package androidx.compose.runtime.saveable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "", "", "list", "a", "(Ljava/util/List;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MapSaverKt$mapSaver$2 extends Lambda implements C11300l<List<? extends Object>, T> {
    final /* synthetic */ C11300l<Map<String, ? extends Object>, T> $restore;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapSaverKt$mapSaver$2(C11300l<? super Map<String, ? extends Object>, ? extends T> lVar) {
        super(1);
        this.$restore = lVar;
    }

    @C12580l
    /* renamed from: a */
    public final T invoke(@C12579k List<? extends Object> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "list");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i = 0; i < list.size(); i += 2) {
                Object obj = list.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, list.get(i + 1));
            }
            return this.$restore.invoke(linkedHashMap);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
