package androidx.compose.runtime.saveable;

import java.util.Map;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class MapSaverKt {
    @C12579k
    /* renamed from: a */
    public static final <T> C8628e<T, Object> m31337a(@C12579k C11304p<? super C8629f, ? super T, ? extends Map<String, ? extends Object>> pVar, @C12579k C11300l<? super Map<String, ? extends Object>, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(pVar, "save");
        Intrinsics.checkNotNullParameter(lVar, "restore");
        return ListSaverKt.m31335a(new MapSaverKt$mapSaver$1(pVar), new MapSaverKt$mapSaver$2(lVar));
    }
}
