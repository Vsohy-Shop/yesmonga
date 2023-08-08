package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.animation.core.e */
public final class C1960e<T, V extends C1997o> {

    /* renamed from: c */
    public static final int f5475c = 0;
    @C12579k

    /* renamed from: a */
    public final C1976i<T, V> f5476a;
    @C12579k

    /* renamed from: b */
    public final AnimationEndReason f5477b;

    public C1960e(@C12579k C1976i<T, V> iVar, @C12579k AnimationEndReason animationEndReason) {
        Intrinsics.checkNotNullParameter(iVar, "endState");
        Intrinsics.checkNotNullParameter(animationEndReason, "endReason");
        this.f5476a = iVar;
        this.f5477b = animationEndReason;
    }

    @C12579k
    /* renamed from: a */
    public final AnimationEndReason mo6810a() {
        return this.f5477b;
    }

    @C12579k
    /* renamed from: b */
    public final C1976i<T, V> mo6811b() {
        return this.f5476a;
    }

    @C12579k
    public String toString() {
        return "AnimationResult(endReason=" + this.f5477b + ", endState=" + this.f5476a + ')';
    }
}
