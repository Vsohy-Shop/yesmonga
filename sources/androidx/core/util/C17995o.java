package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.util.o */
public final class C17995o {
    @SuppressLint({"UnknownNullness"})
    /* renamed from: a */
    public static final <F, S> F m81749a(@C12579k Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: b */
    public static final <F, S> F m81750b(@C12579k C17994n<F, S> nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar.f46482a;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: c */
    public static final <F, S> S m81751c(@C12579k Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.second;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: d */
    public static final <F, S> S m81752d(@C12579k C17994n<F, S> nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar.f46483b;
    }

    @C12579k
    /* renamed from: e */
    public static final <F, S> Pair<F, S> m81753e(@C12579k kotlin.Pair<? extends F, ? extends S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return new Pair<>(pair.mo21849e(), pair.mo21851f());
    }

    @C12579k
    /* renamed from: f */
    public static final <F, S> C17994n<F, S> m81754f(@C12579k kotlin.Pair<? extends F, ? extends S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return new C17994n<>(pair.mo21849e(), pair.mo21851f());
    }

    @C12579k
    /* renamed from: g */
    public static final <F, S> kotlin.Pair<F, S> m81755g(@C12579k Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return new kotlin.Pair<>(pair.first, pair.second);
    }

    @C12579k
    /* renamed from: h */
    public static final <F, S> kotlin.Pair<F, S> m81756h(@C12579k C17994n<F, S> nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return new kotlin.Pair<>(nVar.f46482a, nVar.f46483b);
    }
}
