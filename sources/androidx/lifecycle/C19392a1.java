package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.lifecycle.a1 */
public class C19392a1 {
    @C12579k

    /* renamed from: a */
    public final Map<String, C19476v0> f49771a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo57550a() {
        for (C19476v0 clear : this.f49771a.values()) {
            clear.clear();
        }
        this.f49771a.clear();
    }

    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public final C19476v0 mo57551b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f49771a.get(str);
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public final Set<String> mo57552c() {
        return new HashSet(this.f49771a.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public final void mo57553d(@C12579k String str, @C12579k C19476v0 v0Var) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(v0Var, "viewModel");
        C19476v0 put = this.f49771a.put(str, v0Var);
        if (put != null) {
            put.onCleared();
        }
    }
}
