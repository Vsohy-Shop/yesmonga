package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C1976i;
import androidx.compose.animation.core.C1997o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.gestures.snapping.a */
public final class C2214a<T, V extends C1997o> {

    /* renamed from: a */
    public final T f5962a;
    @C12579k

    /* renamed from: b */
    public final C1976i<T, V> f5963b;

    public C2214a(T t, @C12579k C1976i<T, V> iVar) {
        Intrinsics.checkNotNullParameter(iVar, "currentAnimationState");
        this.f5962a = t;
        this.f5963b = iVar;
    }

    /* renamed from: a */
    public final T mo7568a() {
        return this.f5962a;
    }

    @C12579k
    /* renamed from: b */
    public final C1976i<T, V> mo7569b() {
        return this.f5963b;
    }

    @C12579k
    /* renamed from: c */
    public final C1976i<T, V> mo7570c() {
        return this.f5963b;
    }

    /* renamed from: d */
    public final T mo7571d() {
        return this.f5962a;
    }
}
