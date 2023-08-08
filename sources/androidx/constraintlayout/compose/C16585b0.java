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
/* renamed from: androidx.constraintlayout.compose.b0 */
public final class C16585b0 {
    @C12579k

    /* renamed from: a */
    public final Object f41205a;
    @C12579k

    /* renamed from: b */
    public final List<C11300l<C16611l0, C11079d2>> f41206b;
    @C12579k

    /* renamed from: c */
    public final C16591e f41207c;
    @C12579k

    /* renamed from: d */
    public final C16618o0 f41208d;
    @C12579k

    /* renamed from: e */
    public final C16618o0 f41209e;
    @C12579k

    /* renamed from: f */
    public final C16618o0 f41210f;
    @C12579k

    /* renamed from: g */
    public final C16618o0 f41211g;

    public C16585b0(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "id");
        this.f41205a = obj;
        ArrayList arrayList = new ArrayList();
        this.f41206b = arrayList;
        Integer num = State.f42495j;
        Intrinsics.checkNotNullExpressionValue(num, "PARENT");
        this.f41207c = new C16591e(num);
        this.f41208d = new C16589d(arrayList, obj, -2);
        this.f41209e = new C16589d(arrayList, obj, 0);
        this.f41210f = new C16589d(arrayList, obj, -1);
        this.f41211g = new C16589d(arrayList, obj, 1);
    }

    @C12579k
    /* renamed from: a */
    public final C16618o0 mo48448a() {
        return this.f41209e;
    }

    @C12579k
    /* renamed from: b */
    public final C16618o0 mo48449b() {
        return this.f41211g;
    }

    @C12579k
    /* renamed from: c */
    public final C16618o0 mo48450c() {
        return this.f41210f;
    }

    @C12579k
    /* renamed from: d */
    public final Object mo48451d() {
        return this.f41205a;
    }

    @C12579k
    /* renamed from: e */
    public final C16591e mo48452e() {
        return this.f41207c;
    }

    @C12579k
    /* renamed from: f */
    public final C16618o0 mo48453f() {
        return this.f41208d;
    }

    @C12579k
    /* renamed from: g */
    public final List<C11300l<C16611l0, C11079d2>> mo48454g() {
        return this.f41206b;
    }
}
