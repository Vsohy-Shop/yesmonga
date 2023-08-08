package dev.chrisbanes.snapper;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;

@C10359a
@C8567o(parameters = 0)
public final class SnapperFlingBehaviorDefaults {
    @C12579k

    /* renamed from: a */
    public static final SnapperFlingBehaviorDefaults f28007a = new SnapperFlingBehaviorDefaults();
    @C12579k

    /* renamed from: b */
    public static final C1968g<Float> f28008b = C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null);
    @C12579k

    /* renamed from: c */
    public static final C11300l<C10368f, Float> f28009c = SnapperFlingBehaviorDefaults$MaximumFlingDistance$1.f28012f;
    @C12579k

    /* renamed from: d */
    public static final C11305q<C10368f, Integer, Integer, Integer> f28010d = SnapperFlingBehaviorDefaults$SnapIndex$1.f28013f;

    /* renamed from: e */
    public static final int f28011e = 8;

    @C11395k(message = "The maximumFlingDistance parameter has been deprecated.")
    /* renamed from: b */
    public static /* synthetic */ void m38612b() {
    }

    @C12579k
    /* renamed from: a */
    public final C11300l<C10368f, Float> mo21787a() {
        return f28009c;
    }

    @C12579k
    /* renamed from: c */
    public final C11305q<C10368f, Integer, Integer, Integer> mo21788c() {
        return f28010d;
    }

    @C12579k
    /* renamed from: d */
    public final C1968g<Float> mo21789d() {
        return f28008b;
    }
}
