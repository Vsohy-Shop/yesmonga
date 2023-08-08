package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"T", "Landroidx/compose/runtime/saveable/f;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/f;Ljava/lang/Object;)Ljava/util/List;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,55:1\n215#2,2:56\n*S KotlinDebug\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n*L\n36#1:56,2\n*E\n"})
public final class MapSaverKt$mapSaver$1 extends Lambda implements C11304p<C8629f, T, List<? extends Object>> {
    final /* synthetic */ C11304p<C8629f, T, Map<String, Object>> $save;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapSaverKt$mapSaver$1(C11304p<? super C8629f, ? super T, ? extends Map<String, ? extends Object>> pVar) {
        super(2);
        this.$save = pVar;
    }

    @C12579k
    /* renamed from: a */
    public final List<Object> invoke(@C12579k C8629f fVar, T t) {
        Intrinsics.checkNotNullParameter(fVar, "$this$listSaver");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.$save.invoke(fVar, t).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }
}
