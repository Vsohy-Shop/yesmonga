package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.C2429z;
import androidx.compose.runtime.C8547h2;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C2429z
@C8547h2
/* renamed from: androidx.constraintlayout.compose.q0 */
public final class C16623q0 {
    @C12579k

    /* renamed from: a */
    public final Object f41302a;
    @C12579k

    /* renamed from: b */
    public final List<C11300l<C16611l0, C11079d2>> f41303b;
    @C12579k

    /* renamed from: c */
    public final C16591e f41304c;
    @C12579k

    /* renamed from: d */
    public final C16635z f41305d;
    @C12579k

    /* renamed from: e */
    public final C16635z f41306e;

    public C16623q0(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "id");
        this.f41302a = obj;
        ArrayList arrayList = new ArrayList();
        this.f41303b = arrayList;
        Integer num = State.f42495j;
        Intrinsics.checkNotNullExpressionValue(num, "PARENT");
        this.f41304c = new C16591e(num);
        this.f41305d = new C16584b(arrayList, obj, 0);
        this.f41306e = new C16584b(arrayList, obj, 1);
    }

    @C12579k
    /* renamed from: a */
    public final C16635z mo48570a() {
        return this.f41306e;
    }

    @C12579k
    /* renamed from: b */
    public final Object mo48571b() {
        return this.f41302a;
    }

    @C12579k
    /* renamed from: c */
    public final C16591e mo48572c() {
        return this.f41304c;
    }

    @C12579k
    /* renamed from: d */
    public final List<C11300l<C16611l0, C11079d2>> mo48573d() {
        return this.f41303b;
    }

    @C12579k
    /* renamed from: e */
    public final C16635z mo48574e() {
        return this.f41305d;
    }
}
