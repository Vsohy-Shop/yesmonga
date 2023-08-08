package androidx.navigation;

import android.os.Bundle;
import androidx.core.p027os.C17779d;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.C10983u0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C19691a0
/* renamed from: androidx.navigation.k */
public final class C19760k {

    /* renamed from: a */
    public int f50582a;
    @C12579k

    /* renamed from: b */
    public final Map<String, Object> f50583b = new LinkedHashMap();
    @C12580l

    /* renamed from: c */
    public C19761k0 f50584c;

    @C12579k
    /* renamed from: a */
    public final C19757j mo58445a() {
        Bundle bundle;
        int i = this.f50582a;
        C19761k0 k0Var = this.f50584c;
        if (this.f50583b.isEmpty()) {
            bundle = null;
        } else {
            Object[] array = C10983u0.m41513J1(this.f50583b).toArray(new Pair[0]);
            if (array != null) {
                Pair[] pairArr = (Pair[]) array;
                bundle = C17779d.m81164b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        return new C19757j(i, k0Var, bundle);
    }

    @C12579k
    /* renamed from: b */
    public final Map<String, Object> mo58446b() {
        return this.f50583b;
    }

    /* renamed from: c */
    public final int mo58447c() {
        return this.f50582a;
    }

    /* renamed from: d */
    public final void mo58448d(@C12579k C11300l<? super NavOptionsBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        lVar.invoke(navOptionsBuilder);
        this.f50584c = navOptionsBuilder.mo58296b();
    }

    /* renamed from: e */
    public final void mo58449e(int i) {
        this.f50582a = i;
    }
}
