package androidx.compose.p004ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.p004ui.geometry.C15088a;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15101k;
import androidx.compose.p004ui.graphics.C15266m3;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,235:1\n35#2,5:236\n35#2,5:241\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n172#1:236,5\n211#1:241,5\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.o0 */
public final class C15279o0 implements C15231i3 {
    @C12579k

    /* renamed from: b */
    public final Path f37608b;
    @C12579k

    /* renamed from: c */
    public final RectF f37609c;
    @C12579k

    /* renamed from: d */
    public final float[] f37610d;
    @C12579k

    /* renamed from: e */
    public final Matrix f37611e;

    public C15279o0() {
        this((Path) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: z */
    public static /* synthetic */ void m66338z() {
    }

    /* renamed from: a */
    public boolean mo42799a() {
        return this.f37608b.isConvex();
    }

    /* renamed from: c */
    public void mo42801c(float f, float f2) {
        this.f37608b.rMoveTo(f, f2);
    }

    public void close() {
        this.f37608b.close();
    }

    /* renamed from: d */
    public void mo42803d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f37608b.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: e */
    public void mo42804e(float f, float f2, float f3, float f4) {
        this.f37608b.quadTo(f, f2, f3, f4);
    }

    /* renamed from: f */
    public void mo42805f(float f, float f2, float f3, float f4) {
        this.f37608b.rQuadTo(f, f2, f3, f4);
    }

    /* renamed from: g */
    public void mo42806g(int i) {
        Path.FillType fillType;
        Path path = this.f37608b;
        if (C15251k3.m66153f(i, C15251k3.f37571b.mo42873a())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @C12579k
    public C15098i getBounds() {
        this.f37608b.computeBounds(this.f37609c, true);
        RectF rectF = this.f37609c;
        return new C15098i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: h */
    public void mo42808h(@C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "oval");
        this.f37609c.set(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j());
        this.f37608b.addOval(this.f37609c, Path.Direction.CCW);
    }

    public boolean isEmpty() {
        return this.f37608b.isEmpty();
    }

    /* renamed from: j */
    public void mo42810j(long j) {
        this.f37611e.reset();
        this.f37611e.setTranslate(C15094f.m64880p(j), C15094f.m64882r(j));
        this.f37608b.transform(this.f37611e);
    }

    /* renamed from: k */
    public void mo42811k(@C12579k C15098i iVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(iVar, "oval");
        mo42813n(iVar, C15281o2.m66362a(f), C15281o2.m66362a(f2));
    }

    /* renamed from: l */
    public int mo42812l() {
        if (this.f37608b.getFillType() == Path.FillType.EVEN_ODD) {
            return C15251k3.f37571b.mo42873a();
        }
        return C15251k3.f37571b.mo42874b();
    }

    /* renamed from: n */
    public void mo42813n(@C12579k C15098i iVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(iVar, "oval");
        if (mo42921x(iVar)) {
            this.f37609c.set(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j());
            this.f37608b.addArc(this.f37609c, f, f2);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: o */
    public void mo42814o(@C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        if (mo42921x(iVar)) {
            this.f37609c.set(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j());
            this.f37608b.addRect(this.f37609c, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: p */
    public void mo42815p(float f, float f2) {
        this.f37608b.moveTo(f, f2);
    }

    /* renamed from: q */
    public void mo42816q(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f37608b.cubicTo(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: r */
    public void mo42817r(@C12579k C15101k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "roundRect");
        this.f37609c.set(kVar.mo42302q(), kVar.mo42304s(), kVar.mo42303r(), kVar.mo42298m());
        this.f37610d[0] = C15088a.m64833m(kVar.mo42305t());
        this.f37610d[1] = C15088a.m64835o(kVar.mo42305t());
        this.f37610d[2] = C15088a.m64833m(kVar.mo42307u());
        this.f37610d[3] = C15088a.m64835o(kVar.mo42307u());
        this.f37610d[4] = C15088a.m64833m(kVar.mo42300o());
        this.f37610d[5] = C15088a.m64835o(kVar.mo42300o());
        this.f37610d[6] = C15088a.m64833m(kVar.mo42299n());
        this.f37610d[7] = C15088a.m64835o(kVar.mo42299n());
        this.f37608b.addRoundRect(this.f37609c, this.f37610d, Path.Direction.CCW);
    }

    public void reset() {
        this.f37608b.reset();
    }

    /* renamed from: s */
    public boolean mo42819s(@C12579k C15231i3 i3Var, @C12579k C15231i3 i3Var2, int i) {
        Path.Op op;
        Intrinsics.checkNotNullParameter(i3Var, "path1");
        Intrinsics.checkNotNullParameter(i3Var2, "path2");
        C15266m3.C15267a aVar = C15266m3.f37589b;
        if (C15266m3.m66261i(i, aVar.mo42899a())) {
            op = Path.Op.DIFFERENCE;
        } else if (C15266m3.m66261i(i, aVar.mo42900b())) {
            op = Path.Op.INTERSECT;
        } else if (C15266m3.m66261i(i, aVar.mo42901c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (C15266m3.m66261i(i, aVar.mo42902d())) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        Path path = this.f37608b;
        if (i3Var instanceof C15279o0) {
            Path y = ((C15279o0) i3Var).mo42922y();
            if (i3Var2 instanceof C15279o0) {
                return path.op(y, ((C15279o0) i3Var2).mo42922y(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: t */
    public void mo42820t(@C12579k C15098i iVar, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        this.f37609c.set(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j());
        this.f37608b.arcTo(this.f37609c, f, f2, z);
    }

    /* renamed from: u */
    public void mo42821u(float f, float f2) {
        this.f37608b.rLineTo(f, f2);
    }

    /* renamed from: v */
    public void mo42822v(@C12579k C15231i3 i3Var, long j) {
        Intrinsics.checkNotNullParameter(i3Var, "path");
        Path path = this.f37608b;
        if (i3Var instanceof C15279o0) {
            path.addPath(((C15279o0) i3Var).mo42922y(), C15094f.m64880p(j), C15094f.m64882r(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: w */
    public void mo42823w(float f, float f2) {
        this.f37608b.lineTo(f, f2);
    }

    /* renamed from: x */
    public final boolean mo42921x(C15098i iVar) {
        if (!(!Float.isNaN(iVar.mo42279t()))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        } else if (!(!Float.isNaN(iVar.mo42249B()))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        } else if (!(!Float.isNaN(iVar.mo42283x()))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        } else if (!Float.isNaN(iVar.mo42271j())) {
            return true;
        } else {
            throw new IllegalStateException("Rect.bottom is NaN".toString());
        }
    }

    @C12579k
    /* renamed from: y */
    public final Path mo42922y() {
        return this.f37608b;
    }

    public C15279o0(@C12579k Path path) {
        Intrinsics.checkNotNullParameter(path, "internalPath");
        this.f37608b = path;
        this.f37609c = new RectF();
        this.f37610d = new float[8];
        this.f37611e = new Matrix();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15279o0(Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Path() : path);
    }
}
