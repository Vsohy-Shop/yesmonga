package androidx.constraintlayout.compose;

import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8567o;
import java.util.HashMap;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.constraintlayout.compose.q */
public final class C16622q {
    @C12579k

    /* renamed from: a */
    public static final C16622q f41299a = new C16622q();
    @C12579k

    /* renamed from: b */
    public static HashMap<String, C11306r<String, HashMap<String, String>, C8592o, Integer, C11079d2>> f41300b = new HashMap<>();

    /* renamed from: c */
    public static final int f41301c = 8;

    /* renamed from: a */
    public final void mo48567a(@C12579k String str, @C12579k C11306r<? super String, ? super HashMap<String, String>, ? super C8592o, ? super Integer, C11079d2> rVar) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(rVar, "function");
        f41300b.put(str, rVar);
    }

    @C12579k
    /* renamed from: b */
    public final HashMap<String, C11306r<String, HashMap<String, String>, C8592o, Integer, C11079d2>> mo48568b() {
        return f41300b;
    }

    /* renamed from: c */
    public final void mo48569c(@C12579k HashMap<String, C11306r<String, HashMap<String, String>, C8592o, Integer, C11079d2>> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        f41300b = hashMap;
    }
}
