package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.node.C15696j;
import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.node.C15750z;
import androidx.compose.p004ui.platform.C15983v0;
import com.urbanairship.iam.C9168d0;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001d\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0018\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u00105R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010*¨\u0006="}, mo22516d2 = {"Landroidx/compose/ui/draw/PainterModifierNodeElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/draw/PainterModifierNode;", "E", "node", "M", "Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "r", "Landroidx/compose/ui/graphics/painter/Painter;", "t", "", "u", "Landroidx/compose/ui/c;", "v", "Landroidx/compose/ui/layout/c;", "x", "", "y", "Landroidx/compose/ui/graphics/k2;", "z", "painter", "sizeToIntrinsics", "alignment", "contentScale", "alpha", "colorFilter", "B", "", "toString", "", "hashCode", "", "other", "equals", "c", "Landroidx/compose/ui/graphics/painter/Painter;", "J", "()Landroidx/compose/ui/graphics/painter/Painter;", "d", "Z", "L", "()Z", "e", "Landroidx/compose/ui/c;", "F", "()Landroidx/compose/ui/c;", "f", "Landroidx/compose/ui/layout/c;", "I", "()Landroidx/compose/ui/layout/c;", "g", "G", "()F", "Landroidx/compose/ui/graphics/k2;", "H", "()Landroidx/compose/ui/graphics/k2;", "m", "autoInvalidate", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/c;Landroidx/compose/ui/layout/c;FLandroidx/compose/ui/graphics/k2;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8761g
/* renamed from: androidx.compose.ui.draw.PainterModifierNodeElement */
final class PainterModifierNodeElement extends C15723p0<PainterModifierNode> {
    @C12579k

    /* renamed from: c */
    public final Painter f23439c;

    /* renamed from: d */
    public final boolean f23440d;
    @C12579k

    /* renamed from: e */
    public final C8734c f23441e;
    @C12579k

    /* renamed from: f */
    public final C15541c f23442f;

    /* renamed from: g */
    public final float f23443g;
    @C12580l

    /* renamed from: v */
    public final C15249k2 f23444v;

    public PainterModifierNodeElement(@C12579k Painter painter, boolean z, @C12579k C8734c cVar, @C12579k C15541c cVar2, float f, @C12580l C15249k2 k2Var) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        Intrinsics.checkNotNullParameter(cVar2, "contentScale");
        this.f23439c = painter;
        this.f23440d = z;
        this.f23441e = cVar;
        this.f23442f = cVar2;
        this.f23443g = f;
        this.f23444v = k2Var;
    }

    /* renamed from: D */
    public static /* synthetic */ PainterModifierNodeElement m32474D(PainterModifierNodeElement painterModifierNodeElement, Painter painter, boolean z, C8734c cVar, C15541c cVar2, float f, C15249k2 k2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            painter = painterModifierNodeElement.f23439c;
        }
        if ((i & 2) != 0) {
            z = painterModifierNodeElement.f23440d;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            cVar = painterModifierNodeElement.f23441e;
        }
        C8734c cVar3 = cVar;
        if ((i & 8) != 0) {
            cVar2 = painterModifierNodeElement.f23442f;
        }
        C15541c cVar4 = cVar2;
        if ((i & 16) != 0) {
            f = painterModifierNodeElement.f23443g;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            k2Var = painterModifierNodeElement.f23444v;
        }
        return painterModifierNodeElement.mo17142B(painter, z2, cVar3, cVar4, f2, k2Var);
    }

    @C12579k
    /* renamed from: B */
    public final PainterModifierNodeElement mo17142B(@C12579k Painter painter, boolean z, @C12579k C8734c cVar, @C12579k C15541c cVar2, float f, @C12580l C15249k2 k2Var) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        Intrinsics.checkNotNullParameter(cVar2, "contentScale");
        return new PainterModifierNodeElement(painter, z, cVar, cVar2, f, k2Var);
    }

    @C12579k
    /* renamed from: E */
    public PainterModifierNode mo17098a() {
        return new PainterModifierNode(this.f23439c, this.f23440d, this.f23441e, this.f23442f, this.f23443g, this.f23444v);
    }

    @C12579k
    /* renamed from: F */
    public final C8734c mo17144F() {
        return this.f23441e;
    }

    /* renamed from: G */
    public final float mo17145G() {
        return this.f23443g;
    }

    @C12580l
    /* renamed from: H */
    public final C15249k2 mo17146H() {
        return this.f23444v;
    }

    @C12579k
    /* renamed from: I */
    public final C15541c mo17147I() {
        return this.f23442f;
    }

    @C12579k
    /* renamed from: J */
    public final Painter mo17148J() {
        return this.f23439c;
    }

    /* renamed from: L */
    public final boolean mo17149L() {
        return this.f23440d;
    }

    @C12579k
    /* renamed from: M */
    public PainterModifierNode mo17102s(@C12579k PainterModifierNode painterModifierNode) {
        boolean z;
        Intrinsics.checkNotNullParameter(painterModifierNode, "node");
        boolean p0 = painterModifierNode.mo17129p0();
        boolean z2 = this.f23440d;
        if (p0 != z2 || (z2 && !C15104m.m65014k(painterModifierNode.mo17128o0().mo42949l(), this.f23439c.mo42949l()))) {
            z = true;
        } else {
            z = false;
        }
        painterModifierNode.mo17139y0(this.f23439c);
        painterModifierNode.mo17140z0(this.f23440d);
        painterModifierNode.mo17135u0(this.f23441e);
        painterModifierNode.mo17138x0(this.f23442f);
        painterModifierNode.mo17136v0(this.f23443g);
        painterModifierNode.mo17137w0(this.f23444v);
        if (z) {
            C15750z.m70685c(painterModifierNode);
        }
        C15696j.m70310a(painterModifierNode);
        return painterModifierNode;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterModifierNodeElement)) {
            return false;
        }
        PainterModifierNodeElement painterModifierNodeElement = (PainterModifierNodeElement) obj;
        return Intrinsics.areEqual((Object) this.f23439c, (Object) painterModifierNodeElement.f23439c) && this.f23440d == painterModifierNodeElement.f23440d && Intrinsics.areEqual((Object) this.f23441e, (Object) painterModifierNodeElement.f23441e) && Intrinsics.areEqual((Object) this.f23442f, (Object) painterModifierNodeElement.f23442f) && Float.compare(this.f23443g, painterModifierNodeElement.f23443g) == 0 && Intrinsics.areEqual((Object) this.f23444v, (Object) painterModifierNodeElement.f23444v);
    }

    public int hashCode() {
        int hashCode = this.f23439c.hashCode() * 31;
        boolean z = this.f23440d;
        if (z) {
            z = true;
        }
        int hashCode2 = (((((((hashCode + (z ? 1 : 0)) * 31) + this.f23441e.hashCode()) * 31) + this.f23442f.hashCode()) * 31) + Float.hashCode(this.f23443g)) * 31;
        C15249k2 k2Var = this.f23444v;
        return hashCode2 + (k2Var == null ? 0 : k2Var.hashCode());
    }

    /* renamed from: m */
    public boolean mo17151m() {
        return false;
    }

    /* renamed from: r */
    public void mo17101r(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.mo45973d("paint");
        v0Var.mo45971b().mo45707c("painter", this.f23439c);
        v0Var.mo45971b().mo45707c("sizeToIntrinsics", Boolean.valueOf(this.f23440d));
        v0Var.mo45971b().mo45707c(C9168d0.f24891y, this.f23441e);
        v0Var.mo45971b().mo45707c("contentScale", this.f23442f);
        v0Var.mo45971b().mo45707c("alpha", Float.valueOf(this.f23443g));
        v0Var.mo45971b().mo45707c("colorFilter", this.f23444v);
    }

    @C12579k
    /* renamed from: t */
    public final Painter mo17152t() {
        return this.f23439c;
    }

    @C12579k
    public String toString() {
        return "PainterModifierNodeElement(painter=" + this.f23439c + ", sizeToIntrinsics=" + this.f23440d + ", alignment=" + this.f23441e + ", contentScale=" + this.f23442f + ", alpha=" + this.f23443g + ", colorFilter=" + this.f23444v + ')';
    }

    /* renamed from: u */
    public final boolean mo17154u() {
        return this.f23440d;
    }

    @C12579k
    /* renamed from: v */
    public final C8734c mo17155v() {
        return this.f23441e;
    }

    @C12579k
    /* renamed from: x */
    public final C15541c mo17156x() {
        return this.f23442f;
    }

    /* renamed from: y */
    public final float mo17157y() {
        return this.f23443g;
    }

    @C12580l
    /* renamed from: z */
    public final C15249k2 mo17158z() {
        return this.f23444v;
    }
}
