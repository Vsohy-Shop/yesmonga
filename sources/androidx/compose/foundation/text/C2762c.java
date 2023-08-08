package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.C16454v;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8585m0
/* renamed from: androidx.compose.foundation.text.c */
public final class C2762c {

    /* renamed from: c */
    public static final int f7263c = 0;
    @C12579k

    /* renamed from: a */
    public final C16454v f7264a;
    @C12579k

    /* renamed from: b */
    public final C11305q<String, C8592o, Integer, C11079d2> f7265b;

    public C2762c(@C12579k C16454v vVar, @C12579k C11305q<? super String, ? super C8592o, ? super Integer, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(vVar, "placeholder");
        Intrinsics.checkNotNullParameter(qVar, "children");
        this.f7264a = vVar;
        this.f7265b = qVar;
    }

    @C12579k
    /* renamed from: a */
    public final C11305q<String, C8592o, Integer, C11079d2> mo9500a() {
        return this.f7265b;
    }

    @C12579k
    /* renamed from: b */
    public final C16454v mo9501b() {
        return this.f7264a;
    }
}
