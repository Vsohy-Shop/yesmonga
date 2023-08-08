package androidx.compose.animation.core;

import androidx.compose.animation.core.C1990m0;
import androidx.compose.runtime.C8547h2;
import com.bumptech.glide.load.engine.executor.C22218a;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.animation.core.h */
public final class C1972h {
    /* renamed from: b */
    public static final <T, V extends C1997o> V m8377b(C1945a1<T, V> a1Var, T t) {
        if (t == null) {
            return null;
        }
        return (C1997o) a1Var.mo6792a().invoke(t);
    }

    @C11395k(level = DeprecationLevel.f28051c, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    @C8547h2
    /* renamed from: c */
    public static final /* synthetic */ C1984k0 m8378c(C2020y yVar, RepeatMode repeatMode) {
        Intrinsics.checkNotNullParameter(yVar, C22218a.f57069g);
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new C1984k0(yVar, repeatMode, C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C1984k0 m8379d(C2020y yVar, RepeatMode repeatMode, int i, Object obj) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return m8378c(yVar, repeatMode);
    }

    @C8547h2
    @C12579k
    /* renamed from: e */
    public static final <T> C1984k0<T> m8380e(@C12579k C2020y<T> yVar, @C12579k RepeatMode repeatMode, long j) {
        Intrinsics.checkNotNullParameter(yVar, C22218a.f57069g);
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new C1984k0((C2020y) yVar, repeatMode, j, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C1984k0 m8381f(C2020y yVar, RepeatMode repeatMode, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null);
        }
        return m8380e(yVar, repeatMode, j);
    }

    @C8547h2
    @C12579k
    /* renamed from: g */
    public static final <T> C1990m0<T> m8382g(@C12579k C11300l<? super C1990m0.C1992b<T>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "init");
        C1990m0.C1992b bVar = new C1990m0.C1992b();
        lVar.invoke(bVar);
        return new C1990m0<>(bVar);
    }

    @C11395k(level = DeprecationLevel.f28051c, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    @C8547h2
    /* renamed from: h */
    public static final /* synthetic */ C2004q0 m8383h(int i, C2020y yVar, RepeatMode repeatMode) {
        Intrinsics.checkNotNullParameter(yVar, C22218a.f57069g);
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new C2004q0(i, yVar, repeatMode, C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
    }

    /* renamed from: i */
    public static /* synthetic */ C2004q0 m8384i(int i, C2020y yVar, RepeatMode repeatMode, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return m8383h(i, yVar, repeatMode);
    }

    @C8547h2
    @C12579k
    /* renamed from: j */
    public static final <T> C2004q0<T> m8385j(int i, @C12579k C2020y<T> yVar, @C12579k RepeatMode repeatMode, long j) {
        Intrinsics.checkNotNullParameter(yVar, C22218a.f57069g);
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new C2004q0(i, (C2020y) yVar, repeatMode, j, (DefaultConstructorMarker) null);
    }

    /* renamed from: k */
    public static /* synthetic */ C2004q0 m8386k(int i, C2020y yVar, RepeatMode repeatMode, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i2 & 8) != 0) {
            j = C2016w0.m8646d(0, 0, 2, (DefaultConstructorMarker) null);
        }
        return m8385j(i, yVar, repeatMode, j);
    }

    @C8547h2
    @C12579k
    /* renamed from: l */
    public static final <T> C2006r0<T> m8387l(int i) {
        return new C2006r0<>(i);
    }

    /* renamed from: m */
    public static /* synthetic */ C2006r0 m8388m(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m8387l(i);
    }

    @C8547h2
    @C12579k
    /* renamed from: n */
    public static final <T> C2014v0<T> m8389n(float f, float f2, @C12580l T t) {
        return new C2014v0<>(f, f2, t);
    }

    /* renamed from: o */
    public static /* synthetic */ C2014v0 m8390o(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return m8389n(f, f2, obj);
    }

    @C8547h2
    @C12579k
    /* renamed from: p */
    public static final <T> C2023z0<T> m8391p(int i, int i2, @C12579k C2022z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "easing");
        return new C2023z0<>(i, i2, zVar);
    }

    /* renamed from: q */
    public static /* synthetic */ C2023z0 m8392q(int i, int i2, C2022z zVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            zVar = C1947b0.m8290b();
        }
        return m8391p(i, i2, zVar);
    }
}
