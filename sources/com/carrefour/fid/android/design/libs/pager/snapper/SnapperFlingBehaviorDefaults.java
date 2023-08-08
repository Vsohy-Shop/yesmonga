package com.carrefour.fid.android.design.libs.pager.snapper;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class SnapperFlingBehaviorDefaults {
    @C12579k

    /* renamed from: a */
    public static final SnapperFlingBehaviorDefaults f94117a = new SnapperFlingBehaviorDefaults();
    @C12579k

    /* renamed from: b */
    public static final C1968g<Float> f94118b = C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null);
    @C12579k

    /* renamed from: c */
    public static final C11300l<C37472d, Float> f94119c = SnapperFlingBehaviorDefaults$MaximumFlingDistance$1.f94122f;
    @C12579k

    /* renamed from: d */
    public static final C11305q<C37472d, Integer, Integer, Integer> f94120d = SnapperFlingBehaviorDefaults$SnapIndex$1.f94123f;

    /* renamed from: e */
    public static final int f94121e = 8;

    @C11395k(message = "The maximumFlingDistance parameter has been deprecated.")
    /* renamed from: b */
    public static /* synthetic */ void m153764b() {
    }

    @C12579k
    /* renamed from: a */
    public final C11300l<C37472d, Float> mo114165a() {
        return f94119c;
    }

    @C12579k
    /* renamed from: c */
    public final C11305q<C37472d, Integer, Integer, Integer> mo114166c() {
        return f94120d;
    }

    @C12579k
    /* renamed from: d */
    public final C1968g<Float> mo114167d() {
        return f94118b;
    }
}
