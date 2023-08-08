package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.p004ui.node.C15740w;
import androidx.compose.p004ui.node.NodeCoordinator;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,661:1\n69#2:662\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n*L\n625#1:662\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier */
public final class SimpleGraphicsLayerModifier extends C8767m.C8772d implements C15740w {

    /* renamed from: E0 */
    public float f37303E0;

    /* renamed from: F0 */
    public float f37304F0;

    /* renamed from: G0 */
    public float f37305G0;

    /* renamed from: H0 */
    public float f37306H0;

    /* renamed from: I0 */
    public float f37307I0;

    /* renamed from: J0 */
    public float f37308J0;

    /* renamed from: K0 */
    public long f37309K0;
    @C12579k

    /* renamed from: L0 */
    public C15218g4 f37310L0;

    /* renamed from: M0 */
    public boolean f37311M0;
    @C12580l

    /* renamed from: N0 */
    public C15329u3 f37312N0;

    /* renamed from: O0 */
    public long f37313O0;

    /* renamed from: P0 */
    public long f37314P0;

    /* renamed from: Q0 */
    public int f37315Q0;
    @C12579k

    /* renamed from: R0 */
    public C11300l<? super C15327u2, C11079d2> f37316R0;

    /* renamed from: X */
    public float f37317X;

    /* renamed from: Y */
    public float f37318Y;

    /* renamed from: Z */
    public float f37319Z;

    /* renamed from: z */
    public float f37320z;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, C15329u3 u3Var, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, g4Var, z, u3Var, j2, j3, i);
    }

    /* renamed from: A0 */
    public final float mo42366A0() {
        return this.f37303E0;
    }

    /* renamed from: B0 */
    public final void mo42367B0() {
        NodeCoordinator v4 = C15681e.m70234o(this, C15739v0.m70597b(2)).mo44887v4();
        if (v4 != null) {
            v4.mo44823B6(this.f37316R0, true);
        }
    }

    /* renamed from: C0 */
    public final void mo42368C0(float f) {
        this.f37318Y = f;
    }

    /* renamed from: D0 */
    public final void mo42369D0(long j) {
        this.f37313O0 = j;
    }

    /* renamed from: E0 */
    public final void mo42370E0(float f) {
        this.f37308J0 = f;
    }

    /* renamed from: F0 */
    public final void mo42371F0(boolean z) {
        this.f37311M0 = z;
    }

    /* renamed from: G0 */
    public final void mo42372G0(int i) {
        this.f37315Q0 = i;
    }

    /* renamed from: H0 */
    public final void mo42373H0(@C12580l C15329u3 u3Var) {
        this.f37312N0 = u3Var;
    }

    /* renamed from: I0 */
    public final void mo42374I0(float f) {
        this.f37305G0 = f;
    }

    /* renamed from: J0 */
    public final void mo42375J0(float f) {
        this.f37306H0 = f;
    }

    /* renamed from: K0 */
    public final void mo42376K0(float f) {
        this.f37307I0 = f;
    }

    /* renamed from: L0 */
    public final void mo42377L0(float f) {
        this.f37320z = f;
    }

    /* renamed from: M0 */
    public final void mo42378M0(float f) {
        this.f37317X = f;
    }

    /* renamed from: N0 */
    public final void mo42379N0(float f) {
        this.f37304F0 = f;
    }

    /* renamed from: O0 */
    public final void mo42380O0(@C12579k C15218g4 g4Var) {
        Intrinsics.checkNotNullParameter(g4Var, "<set-?>");
        this.f37310L0 = g4Var;
    }

    /* renamed from: P0 */
    public final void mo42381P0(long j) {
        this.f37314P0 = j;
    }

    /* renamed from: Q0 */
    public final void mo42382Q0(long j) {
        this.f37309K0 = j;
    }

    /* renamed from: R0 */
    public final void mo42383R0(float f) {
        this.f37319Z = f;
    }

    /* renamed from: S0 */
    public final void mo42384S0(float f) {
        this.f37303E0 = f;
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo17122i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(j);
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new SimpleGraphicsLayerModifier$measure$1(t0, this), 4, (Object) null);
    }

    /* renamed from: k0 */
    public final float mo42385k0() {
        return this.f37318Y;
    }

    /* renamed from: l0 */
    public final long mo42386l0() {
        return this.f37313O0;
    }

    /* renamed from: m0 */
    public final float mo42387m0() {
        return this.f37308J0;
    }

    /* renamed from: n0 */
    public final boolean mo42388n0() {
        return this.f37311M0;
    }

    /* renamed from: o0 */
    public final int mo42389o0() {
        return this.f37315Q0;
    }

    @C12580l
    /* renamed from: p0 */
    public final C15329u3 mo42390p0() {
        return this.f37312N0;
    }

    /* renamed from: q0 */
    public final float mo42391q0() {
        return this.f37305G0;
    }

    /* renamed from: r0 */
    public final float mo42392r0() {
        return this.f37306H0;
    }

    /* renamed from: s0 */
    public final float mo42393s0() {
        return this.f37307I0;
    }

    /* renamed from: t0 */
    public final float mo42394t0() {
        return this.f37320z;
    }

    @C12579k
    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f37320z + ", scaleY=" + this.f37317X + ", alpha = " + this.f37318Y + ", translationX=" + this.f37319Z + ", translationY=" + this.f37303E0 + ", shadowElevation=" + this.f37304F0 + ", rotationX=" + this.f37305G0 + ", rotationY=" + this.f37306H0 + ", rotationZ=" + this.f37307I0 + ", cameraDistance=" + this.f37308J0 + ", transformOrigin=" + C15283o4.m66382n(this.f37309K0) + ", shape=" + this.f37310L0 + ", clip=" + this.f37311M0 + ", renderEffect=" + this.f37312N0 + ", ambientShadowColor=" + C15240j2.m66057L(this.f37313O0) + ", spotShadowColor=" + C15240j2.m66057L(this.f37314P0) + ", compositingStrategy=" + C15274n2.m66320i(this.f37315Q0) + ')';
    }

    /* renamed from: u0 */
    public final float mo42396u0() {
        return this.f37317X;
    }

    /* renamed from: v0 */
    public final float mo42397v0() {
        return this.f37304F0;
    }

    @C12579k
    /* renamed from: w0 */
    public final C15218g4 mo42398w0() {
        return this.f37310L0;
    }

    /* renamed from: x0 */
    public final long mo42399x0() {
        return this.f37314P0;
    }

    /* renamed from: y0 */
    public final long mo42400y0() {
        return this.f37309K0;
    }

    /* renamed from: z0 */
    public final float mo42401z0() {
        return this.f37319Z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, C15329u3 u3Var, long j2, long j3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, g4Var, z, u3Var, j2, j3, (i2 & 65536) != 0 ? C15274n2.f37602b.mo42916a() : i, (DefaultConstructorMarker) null);
    }

    public SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, C15329u3 u3Var, long j2, long j3, int i) {
        this.f37320z = f;
        this.f37317X = f2;
        this.f37318Y = f3;
        this.f37319Z = f4;
        this.f37303E0 = f5;
        this.f37304F0 = f6;
        this.f37305G0 = f7;
        this.f37306H0 = f8;
        this.f37307I0 = f9;
        this.f37308J0 = f10;
        this.f37309K0 = j;
        this.f37310L0 = g4Var;
        this.f37311M0 = z;
        this.f37312N0 = u3Var;
        this.f37313O0 = j2;
        this.f37314P0 = j3;
        this.f37315Q0 = i;
        this.f37316R0 = new SimpleGraphicsLayerModifier$layerBlock$1(this);
    }
}
