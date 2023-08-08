package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8547h2;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.t2 */
public final class C15320t2 {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m66557a(@C12579k C8767m mVar, @C12579k C11300l<? super C15327u2, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        return mVar.mo17224k3(new BlockGraphicsLayerElement(lVar));
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes shadow color parameters", replaceWith = @C11587t0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    @C8547h2
    /* renamed from: b */
    public static final /* synthetic */ C8767m m66558b(C8767m mVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, C15329u3 u3Var) {
        float f11 = f;
        Intrinsics.checkNotNullParameter(mVar, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        return m66560d(mVar, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, g4Var, z, u3Var, C15333v2.m66725b(), C15333v2.m66725b(), C15274n2.f37602b.mo42916a());
    }

    /* renamed from: c */
    public static /* synthetic */ C8767m m66559c(C8767m mVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, C15329u3 u3Var, int i, Object obj) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        long j2;
        C15218g4 g4Var2;
        boolean z2;
        C15329u3 u3Var2;
        int i2 = i;
        float f19 = 1.0f;
        if ((i2 & 1) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f;
        }
        if ((i2 & 2) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f2;
        }
        if ((i2 & 4) == 0) {
            f19 = f3;
        }
        float f20 = 0.0f;
        if ((i2 & 8) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f4;
        }
        if ((i2 & 16) != 0) {
            f14 = 0.0f;
        } else {
            f14 = f5;
        }
        if ((i2 & 32) != 0) {
            f15 = 0.0f;
        } else {
            f15 = f6;
        }
        if ((i2 & 64) != 0) {
            f16 = 0.0f;
        } else {
            f16 = f7;
        }
        if ((i2 & 128) != 0) {
            f17 = 0.0f;
        } else {
            f17 = f8;
        }
        if ((i2 & 256) == 0) {
            f20 = f9;
        }
        if ((i2 & 512) != 0) {
            f18 = 8.0f;
        } else {
            f18 = f10;
        }
        if ((i2 & 1024) != 0) {
            j2 = C15283o4.f37618b.mo42933a();
        } else {
            j2 = j;
        }
        if ((i2 & 2048) != 0) {
            g4Var2 = C15321t3.m66567a();
        } else {
            g4Var2 = g4Var;
        }
        if ((i2 & 4096) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 8192) != 0) {
            u3Var2 = null;
        } else {
            u3Var2 = u3Var;
        }
        return m66558b(mVar, f11, f12, f19, f13, f14, f15, f16, f17, f20, f18, j2, g4Var2, z2, u3Var2);
    }

    @C8547h2
    @C12579k
    /* renamed from: d */
    public static final C8767m m66560d(@C12579k C8767m mVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, @C12579k C15218g4 g4Var, boolean z, @C12580l C15329u3 u3Var, long j2, long j3, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        return mVar.mo17224k3(new GraphicsLayerModifierNodeElement(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, g4Var, z, u3Var, j2, j3, i, (DefaultConstructorMarker) null));
    }

    /* renamed from: e */
    public static /* synthetic */ C8767m m66561e(C8767m mVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, C15329u3 u3Var, long j2, long j3, int i, int i2, Object obj) {
        int i3 = i2;
        float f11 = 1.0f;
        float f12 = (i3 & 1) != 0 ? 1.0f : f;
        float f13 = (i3 & 2) != 0 ? 1.0f : f2;
        if ((i3 & 4) == 0) {
            f11 = f3;
        }
        float f14 = 0.0f;
        float f15 = (i3 & 8) != 0 ? 0.0f : f4;
        float f16 = (i3 & 16) != 0 ? 0.0f : f5;
        float f17 = (i3 & 32) != 0 ? 0.0f : f6;
        float f18 = (i3 & 64) != 0 ? 0.0f : f7;
        float f19 = (i3 & 128) != 0 ? 0.0f : f8;
        if ((i3 & 256) == 0) {
            f14 = f9;
        }
        return m66560d(mVar, f12, f13, f11, f15, f16, f17, f18, f19, f14, (i3 & 512) != 0 ? 8.0f : f10, (i3 & 1024) != 0 ? C15283o4.f37618b.mo42933a() : j, (i3 & 2048) != 0 ? C15321t3.m66567a() : g4Var, (i3 & 4096) != 0 ? false : z, (i3 & 8192) != 0 ? null : u3Var, (i3 & 16384) != 0 ? C15333v2.m66725b() : j2, (i3 & 32768) != 0 ? C15333v2.m66725b() : j3, (i3 & 65536) != 0 ? C15274n2.f37602b.mo42916a() : i);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes a compositing strategy", replaceWith = @C11587t0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor, CompositingStrategy.Auto)", imports = {"androidx.compose.ui.graphics"}))
    @C8547h2
    /* renamed from: f */
    public static final /* synthetic */ C8767m m66562f(C8767m mVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, C15329u3 u3Var, long j2, long j3) {
        float f11 = f;
        Intrinsics.checkNotNullParameter(mVar, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        return m66560d(mVar, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, g4Var, z, u3Var, j2, j3, C15274n2.f37602b.mo42916a());
    }

    /* renamed from: g */
    public static /* synthetic */ C8767m m66563g(C8767m mVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, C15329u3 u3Var, long j2, long j3, int i, Object obj) {
        int i2 = i;
        float f11 = 1.0f;
        float f12 = (i2 & 1) != 0 ? 1.0f : f;
        float f13 = (i2 & 2) != 0 ? 1.0f : f2;
        if ((i2 & 4) == 0) {
            f11 = f3;
        }
        float f14 = 0.0f;
        float f15 = (i2 & 8) != 0 ? 0.0f : f4;
        float f16 = (i2 & 16) != 0 ? 0.0f : f5;
        float f17 = (i2 & 32) != 0 ? 0.0f : f6;
        float f18 = (i2 & 64) != 0 ? 0.0f : f7;
        float f19 = (i2 & 128) != 0 ? 0.0f : f8;
        if ((i2 & 256) == 0) {
            f14 = f9;
        }
        return m66562f(mVar, f12, f13, f11, f15, f16, f17, f18, f19, f14, (i2 & 512) != 0 ? 8.0f : f10, (i2 & 1024) != 0 ? C15283o4.f37618b.mo42933a() : j, (i2 & 2048) != 0 ? C15321t3.m66567a() : g4Var, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? null : u3Var, (i2 & 16384) != 0 ? C15333v2.m66725b() : j2, (i2 & 32768) != 0 ? C15333v2.m66725b() : j3);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes an optional RenderEffect parameter and shadow color parameters", replaceWith = @C11587t0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    @C8547h2
    /* renamed from: h */
    public static final /* synthetic */ C8767m m66564h(C8767m mVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z) {
        C8767m mVar2 = mVar;
        Intrinsics.checkNotNullParameter(mVar2, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        return m66561e(mVar2, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, g4Var, z, (C15329u3) null, 0, 0, 0, 114688, (Object) null);
    }

    /* renamed from: i */
    public static /* synthetic */ C8767m m66565i(C8767m mVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, int i, Object obj) {
        int i2 = i;
        float f11 = 1.0f;
        float f12 = (i2 & 1) != 0 ? 1.0f : f;
        float f13 = (i2 & 2) != 0 ? 1.0f : f2;
        if ((i2 & 4) == 0) {
            f11 = f3;
        }
        float f14 = 0.0f;
        float f15 = (i2 & 8) != 0 ? 0.0f : f4;
        float f16 = (i2 & 16) != 0 ? 0.0f : f5;
        float f17 = (i2 & 32) != 0 ? 0.0f : f6;
        float f18 = (i2 & 64) != 0 ? 0.0f : f7;
        float f19 = (i2 & 128) != 0 ? 0.0f : f8;
        if ((i2 & 256) == 0) {
            f14 = f9;
        }
        return m66564h(mVar, f12, f13, f11, f15, f16, f17, f18, f19, f14, (i2 & 512) != 0 ? 8.0f : f10, (i2 & 1024) != 0 ? C15283o4.f37618b.mo42933a() : j, (i2 & 2048) != 0 ? C15321t3.m66567a() : g4Var, (i2 & 4096) != 0 ? false : z);
    }

    @C8547h2
    @C12579k
    /* renamed from: j */
    public static final C8767m m66566j(@C12579k C8767m mVar) {
        C8767m mVar2 = mVar;
        Intrinsics.checkNotNullParameter(mVar2, "<this>");
        if (InspectableValueKt.m71063e()) {
            return mVar2.mo17224k3(m66561e(C8767m.f23478j, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (C15218g4) null, false, (C15329u3) null, 0, 0, 0, 131071, (Object) null));
        }
        return mVar2;
    }
}
