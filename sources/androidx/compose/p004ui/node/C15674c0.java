package androidx.compose.p004ui.node;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15179a;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16489j;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import com.urbanairship.iam.C9127a0;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,114:1\n245#2:115\n71#3:116\n71#3:117\n558#4,17:118\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n46#1:115\n59#1:116\n71#1:117\n85#1:118,17\n*E\n"})
/* renamed from: androidx.compose.ui.node.c0 */
public final class C15674c0 implements C15187e, C15184c {
    @C12579k

    /* renamed from: a */
    public final C15179a f38991a;
    @C12580l

    /* renamed from: b */
    public C15693i f38992b;

    public C15674c0() {
        this((C15179a) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: A2 */
    public void mo42657A2(long j, long j2, long j3, long j4, @C12579k C15192h hVar, float f, @C12580l C15249k2 k2Var, int i) {
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42657A2(j, j2, j3, j4, hVar2, f, k2Var, i);
    }

    @C8547h2
    /* renamed from: C2 */
    public float mo7415C2(long j) {
        return this.f38991a.mo7415C2(j);
    }

    /* renamed from: D3 */
    public void mo42658D3(long j, long j2, long j3, float f, int i, @C12580l C15242j3 j3Var, float f2, @C12580l C15249k2 k2Var, int i2) {
        this.f38991a.mo42658D3(j, j2, j3, f, i, j3Var, f2, k2Var, i2);
    }

    /* renamed from: F1 */
    public void mo42659F1(@C12579k C15231i3 i3Var, @C12579k C15421z1 z1Var, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        Intrinsics.checkNotNullParameter(i3Var, "path");
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        Intrinsics.checkNotNullParameter(hVar, "style");
        this.f38991a.mo42659F1(i3Var, z1Var, f, hVar, k2Var, i);
    }

    /* renamed from: F3 */
    public void mo42660F3(@C12579k C15421z1 z1Var, float f, float f2, boolean z, long j, long j2, float f3, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42660F3(z1Var, f, f2, z, j, j2, f3, hVar2, k2Var, i);
    }

    /* renamed from: G3 */
    public void mo42661G3(@C12579k C15231i3 i3Var, long j, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        Intrinsics.checkNotNullParameter(i3Var, "path");
        Intrinsics.checkNotNullParameter(hVar, "style");
        this.f38991a.mo42661G3(i3Var, j, f, hVar, k2Var, i);
    }

    /* renamed from: I5 */
    public void mo42662I5(@C12579k C15421z1 z1Var, float f, long j, float f2, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42662I5(z1Var, f, j, f2, hVar2, k2Var, i);
    }

    /* renamed from: J3 */
    public void mo42663J3(long j, long j2, long j3, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42663J3(j, j2, j3, f, hVar2, k2Var, i);
    }

    /* renamed from: K5 */
    public void mo42665K5(@C12579k C15403w2 w2Var, long j, long j2, long j3, long j4, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i, int i2) {
        C15403w2 w2Var2 = w2Var;
        Intrinsics.checkNotNullParameter(w2Var2, C9127a0.f24709d);
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42665K5(w2Var2, j, j2, j3, j4, f, hVar2, k2Var, i, i2);
    }

    @C8547h2
    /* renamed from: L */
    public float mo7416L(int i) {
        return this.f38991a.mo7416L(i);
    }

    @C8547h2
    @C12579k
    /* renamed from: L4 */
    public C15098i mo7417L4(@C12579k C16489j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return this.f38991a.mo7417L4(jVar);
    }

    @C8547h2
    /* renamed from: M */
    public float mo7418M(float f) {
        return this.f38991a.mo7418M(f);
    }

    /* renamed from: O4 */
    public void mo42668O4(@C12579k C15421z1 z1Var, long j, long j2, long j3, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42668O4(z1Var, j, j2, j3, f, hVar2, k2Var, i);
    }

    /* renamed from: R4 */
    public float mo7419R4() {
        return this.f38991a.mo7419R4();
    }

    /* renamed from: U */
    public long mo42717U() {
        return this.f38991a.mo42717U();
    }

    @C8547h2
    /* renamed from: V */
    public long mo7420V(long j) {
        return this.f38991a.mo7420V(j);
    }

    /* renamed from: Z3 */
    public void mo42670Z3(long j, float f, long j2, float f2, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42670Z3(j, f, j2, f2, hVar2, k2Var, i);
    }

    /* renamed from: b */
    public long mo42718b() {
        return this.f38991a.mo42718b();
    }

    /* renamed from: b5 */
    public void mo42671b5(@C12579k C15421z1 z1Var, long j, long j2, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42671b5(z1Var, j, j2, f, hVar2, k2Var, i);
    }

    /* renamed from: c */
    public final void mo44956c(@C12579k C15118b2 b2Var, long j, @C12579k NodeCoordinator nodeCoordinator, @C12579k C15693i iVar) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        Intrinsics.checkNotNullParameter(nodeCoordinator, "coordinator");
        Intrinsics.checkNotNullParameter(iVar, "drawNode");
        C15693i iVar2 = this.f38992b;
        this.f38992b = iVar;
        C15179a aVar = this.f38991a;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        C15179a.C15180a A = aVar.mo42656A();
        C16479d a = A.mo42687a();
        LayoutDirection b = A.mo42688b();
        C15118b2 c = A.mo42689c();
        long d = A.mo42690d();
        C15179a.C15180a A2 = aVar.mo42656A();
        A2.mo42699l(nodeCoordinator);
        A2.mo42700m(layoutDirection);
        A2.mo42698k(b2Var);
        A2.mo42701n(j);
        b2Var.mo42422E();
        iVar.mo17117C(this);
        b2Var.mo42443q();
        C15179a.C15180a A3 = aVar.mo42656A();
        A3.mo42699l(a);
        A3.mo42700m(b);
        A3.mo42698k(c);
        A3.mo42701n(d);
        this.f38992b = iVar2;
    }

    /* renamed from: d */
    public final void mo44957d(@C12579k C15693i iVar, @C12579k C15118b2 b2Var) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        NodeCoordinator o = C15681e.m70234o(iVar, C15739v0.m70597b(4));
        o.mo44836H5().mo44699q0().mo44956c(b2Var, C16502r.m74673f(o.mo44434a()), o, iVar);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @C11587t0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: e3 */
    public /* synthetic */ void mo42673e3(C15403w2 w2Var, long j, long j2, long j3, long j4, float f, C15192h hVar, C15249k2 k2Var, int i) {
        C15403w2 w2Var2 = w2Var;
        Intrinsics.checkNotNullParameter(w2Var2, C9127a0.f24709d);
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42673e3(w2Var2, j, j2, j3, j4, f, hVar2, k2Var, i);
    }

    /* renamed from: g4 */
    public void mo42675g4(long j, long j2, long j3, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42675g4(j, j2, j3, f, hVar2, k2Var, i);
    }

    @C8547h2
    /* renamed from: g5 */
    public float mo7425g5(float f) {
        return this.f38991a.mo7425g5(f);
    }

    /* renamed from: g6 */
    public void mo42716g6() {
        C15118b2 c = mo42683q5().mo42705c();
        C15693i iVar = this.f38992b;
        Intrinsics.checkNotNull(iVar);
        C15693i a = C15679d0.m70215b(iVar);
        if (a != null) {
            mo44957d(a, c);
            return;
        }
        NodeCoordinator o = C15681e.m70234o(iVar, C15739v0.m70597b(4));
        if (o.mo44883s4() == iVar) {
            o = o.mo44887v4();
            Intrinsics.checkNotNull(o);
        }
        o.mo44845O5(c);
    }

    public float getDensity() {
        return this.f38991a.getDensity();
    }

    @C12579k
    public LayoutDirection getLayoutDirection() {
        return this.f38991a.getLayoutDirection();
    }

    /* renamed from: l5 */
    public void mo42679l5(@C12579k List<C15094f> list, int i, long j, float f, int i2, @C12580l C15242j3 j3Var, float f2, @C12580l C15249k2 k2Var, int i3) {
        Intrinsics.checkNotNullParameter(list, "points");
        this.f38991a.mo42679l5(list, i, j, f, i2, j3Var, f2, k2Var, i3);
    }

    @C8547h2
    /* renamed from: m */
    public long mo7427m(float f) {
        return this.f38991a.mo7427m(f);
    }

    @C8547h2
    /* renamed from: n */
    public long mo7428n(long j) {
        return this.f38991a.mo7428n(j);
    }

    /* renamed from: n1 */
    public void mo42680n1(@C12579k List<C15094f> list, int i, @C12579k C15421z1 z1Var, float f, int i2, @C12580l C15242j3 j3Var, float f2, @C12580l C15249k2 k2Var, int i3) {
        Intrinsics.checkNotNullParameter(list, "points");
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        this.f38991a.mo42680n1(list, i, z1Var, f, i2, j3Var, f2, k2Var, i3);
    }

    @C8547h2
    /* renamed from: n2 */
    public int mo7429n2(float f) {
        return this.f38991a.mo7429n2(f);
    }

    /* renamed from: n3 */
    public void mo42681n3(@C12579k C15403w2 w2Var, long j, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        Intrinsics.checkNotNullParameter(w2Var, C9127a0.f24709d);
        Intrinsics.checkNotNullParameter(hVar, "style");
        this.f38991a.mo42681n3(w2Var, j, f, hVar, k2Var, i);
    }

    /* renamed from: p4 */
    public void mo42682p4(long j, float f, float f2, boolean z, long j2, long j3, float f3, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42682p4(j, f, f2, z, j2, j3, f3, hVar2, k2Var, i);
    }

    @C8547h2
    /* renamed from: q */
    public float mo7430q(long j) {
        return this.f38991a.mo7430q(j);
    }

    @C12579k
    /* renamed from: q5 */
    public C15186d mo42683q5() {
        return this.f38991a.mo42683q5();
    }

    @C8547h2
    /* renamed from: t */
    public long mo7431t(int i) {
        return this.f38991a.mo7431t(i);
    }

    /* renamed from: t5 */
    public void mo42684t5(@C12579k C15421z1 z1Var, long j, long j2, float f, int i, @C12580l C15242j3 j3Var, float f2, @C12580l C15249k2 k2Var, int i2) {
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        this.f38991a.mo42684t5(z1Var, j, j2, f, i, j3Var, f2, k2Var, i2);
    }

    @C8547h2
    /* renamed from: u */
    public long mo7432u(float f) {
        return this.f38991a.mo7432u(f);
    }

    @C8547h2
    /* renamed from: u5 */
    public int mo7433u5(long j) {
        return this.f38991a.mo7433u5(j);
    }

    /* renamed from: y3 */
    public void mo42686y3(@C12579k C15421z1 z1Var, long j, long j2, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f38991a.mo42686y3(z1Var, j, j2, f, hVar2, k2Var, i);
    }

    public C15674c0(@C12579k C15179a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "canvasDrawScope");
        this.f38991a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15674c0(C15179a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C15179a() : aVar);
    }
}
