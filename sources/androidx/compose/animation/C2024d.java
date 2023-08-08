package androidx.compose.animation;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2031i
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,780:1\n76#2:781\n102#2,2:782\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n219#1:781\n219#1:782,2\n*E\n"})
/* renamed from: androidx.compose.animation.d */
public final class C2024d {

    /* renamed from: e */
    public static final int f5657e = 8;
    @C12579k

    /* renamed from: a */
    public final C2025e f5658a;
    @C12579k

    /* renamed from: b */
    public final C2028g f5659b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f5660c;
    @C12580l

    /* renamed from: d */
    public C2041q f5661d;

    public C2024d(@C12579k C2025e eVar, @C12579k C2028g gVar, float f, @C12580l C2041q qVar) {
        Intrinsics.checkNotNullParameter(eVar, "targetContentEnter");
        Intrinsics.checkNotNullParameter(gVar, "initialContentExit");
        this.f5658a = eVar;
        this.f5659b = gVar;
        this.f5660c = C8539f2.m30981g(Float.valueOf(f), (C8410b2) null, 2, (Object) null);
        this.f5661d = qVar;
    }

    @C12579k
    /* renamed from: a */
    public final C2028g mo7016a() {
        return this.f5659b;
    }

    @C12580l
    /* renamed from: b */
    public final C2041q mo7017b() {
        return this.f5661d;
    }

    @C12579k
    /* renamed from: c */
    public final C2025e mo7018c() {
        return this.f5658a;
    }

    /* renamed from: d */
    public final float mo7019d() {
        return ((Number) this.f5660c.getValue()).floatValue();
    }

    /* renamed from: e */
    public final void mo7020e(@C12580l C2041q qVar) {
        this.f5661d = qVar;
    }

    /* renamed from: f */
    public final void mo7021f(float f) {
        this.f5660c.setValue(Float.valueOf(f));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2024d(C2025e eVar, C2028g gVar, float f, C2041q qVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, gVar, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? AnimatedContentKt.m7635e(false, (C11304p) null, 3, (Object) null) : qVar);
    }
}
