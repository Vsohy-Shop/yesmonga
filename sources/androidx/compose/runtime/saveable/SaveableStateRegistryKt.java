package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.CompositionLocalKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SaveableStateRegistryKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C8624c> f23103a = CompositionLocalKt.m29859e(SaveableStateRegistryKt$LocalSaveableStateRegistry$1.f23104f);

    @C12579k
    /* renamed from: a */
    public static final C8624c m31372a(@C12580l Map<String, ? extends List<? extends Object>> map, @C12579k C11300l<Object, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "canBeSaved");
        return new C8626d(map, lVar);
    }

    @C12579k
    /* renamed from: b */
    public static final C8550i1<C8624c> m31373b() {
        return f23103a;
    }
}
