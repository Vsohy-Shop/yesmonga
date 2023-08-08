package androidx.compose.p004ui.autofill;

import androidx.compose.p004ui.C8761g;
import androidx.compose.runtime.internal.C8567o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8761g
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.autofill.z */
public final class C8731z {

    /* renamed from: b */
    public static final int f23404b = 8;
    @C12579k

    /* renamed from: a */
    public final Map<Integer, C8729y> f23405a = new LinkedHashMap();

    @C12579k
    /* renamed from: a */
    public final Map<Integer, C8729y> mo17055a() {
        return this.f23405a;
    }

    @C12580l
    /* renamed from: b */
    public final C11079d2 mo17056b(int i, @C12579k String str) {
        C11300l<String, C11079d2> f;
        Intrinsics.checkNotNullParameter(str, "value");
        C8729y yVar = this.f23405a.get(Integer.valueOf(i));
        if (yVar == null || (f = yVar.mo17051f()) == null) {
            return null;
        }
        f.invoke(str);
        return C11079d2.f28267a;
    }

    /* renamed from: c */
    public final void mo17057c(@C12579k C8729y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "autofillNode");
        this.f23405a.put(Integer.valueOf(yVar.mo17049e()), yVar);
    }
}
