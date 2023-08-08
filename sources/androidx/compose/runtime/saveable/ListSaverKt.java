package androidx.compose.runtime.saveable;

import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ListSaverKt {
    @C12579k
    /* renamed from: a */
    public static final <Original, Saveable> C8628e<Original, Object> m31335a(@C12579k C11304p<? super C8629f, ? super Original, ? extends List<? extends Saveable>> pVar, @C12579k C11300l<? super List<? extends Saveable>, ? extends Original> lVar) {
        Intrinsics.checkNotNullParameter(pVar, "save");
        Intrinsics.checkNotNullParameter(lVar, "restore");
        return SaverKt.m31375a(new ListSaverKt$listSaver$1(pVar), (C11300l) C11370u0.m43701q(lVar, 1));
    }
}
