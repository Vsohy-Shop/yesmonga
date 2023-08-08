package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.node.C15723p0;
import androidx.compose.p004ui.platform.C15983v0;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b'\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010$\u001a\u00020\t\u0012\u0006\u0010%\u001a\u00020\t\u0012\u0006\u0010&\u001a\u00020\t\u0012\u0006\u0010'\u001a\u00020\t\u0012\u0006\u0010(\u001a\u00020\t\u0012\u0006\u0010)\u001a\u00020\t\u0012\u0006\u0010*\u001a\u00020\t\u0012\u0006\u0010+\u001a\u00020\t\u0012\u0006\u0010,\u001a\u00020\t\u0012\u0006\u0010-\u001a\u00020\u0014\u0012\u0006\u0010.\u001a\u00020\u0017\u0012\u0006\u0010/\u001a\u00020\u0019\u0012\b\u00100\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u00101\u001a\u00020\u001d\u0012\u0006\u00102\u001a\u00020\u001d\u0012\u0006\u00103\u001a\u00020 ø\u0001\u0002¢\u0006\u0004\b_\u0010`J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J\u0019\u0010\u0015\u001a\u00020\u0014HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0018\u001a\u00020\u0017HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0019\u0010\u001e\u001a\u00020\u001dHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u0016J\u0019\u0010\u001f\u001a\u00020\u001dHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u0019\u0010!\u001a\u00020 HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"JÂ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\u00142\b\b\u0002\u0010.\u001a\u00020\u00172\b\b\u0002\u0010/\u001a\u00020\u00192\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u00101\u001a\u00020\u001d2\b\b\u0002\u00102\u001a\u00020\u001d2\b\b\u0002\u00103\u001a\u00020 HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u00105J\t\u00107\u001a\u000206HÖ\u0001J\t\u00109\u001a\u000208HÖ\u0001J\u0013\u0010<\u001a\u00020\u00192\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003R\u0017\u0010#\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b=\u0010\u000b\u001a\u0004\b>\u0010?R\u0017\u0010$\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b@\u0010\u000b\u001a\u0004\bA\u0010?R\u0017\u0010%\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bB\u0010\u000b\u001a\u0004\bC\u0010?R\u0017\u0010&\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bD\u0010\u000b\u001a\u0004\bE\u0010?R\u0017\u0010'\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bF\u0010\u000b\u001a\u0004\bG\u0010?R\u0017\u0010(\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\bH\u0010?R\u0017\u0010)\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bI\u0010\u000b\u001a\u0004\bJ\u0010?R\u0017\u0010*\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\bK\u0010?R\u0017\u0010+\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\bL\u0010?R\u0017\u0010,\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\bM\u0010?R \u0010-\u001a\u00020\u00148\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bM\u0010\u000f\u001a\u0004\bN\u0010\u0016R\u0017\u0010.\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010/\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bS\u0010S\u001a\u0004\bT\u0010UR\u0019\u00100\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u00101\u001a\u00020\u001d8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\bZ\u0010\u0016R \u00102\u001a\u00020\u001d8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b[\u0010\u000f\u001a\u0004\b\\\u0010\u0016R \u00103\u001a\u00020 8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b]\u0010\u000e\u001a\u0004\b^\u0010\"\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006a"}, mo22516d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerModifierNodeElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "S", "node", "F0", "Landroidx/compose/ui/platform/v0;", "Lkotlin/d2;", "r", "", "t", "F", "G", "H", "I", "J", "L", "M", "P", "u", "Landroidx/compose/ui/graphics/o4;", "v", "()J", "Landroidx/compose/ui/graphics/g4;", "x", "", "y", "Landroidx/compose/ui/graphics/u3;", "z", "Landroidx/compose/ui/graphics/j2;", "B", "D", "Landroidx/compose/ui/graphics/n2;", "E", "()I", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "shape", "clip", "renderEffect", "ambientShadowColor", "spotShadowColor", "compositingStrategy", "Q", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/g4;ZLandroidx/compose/ui/graphics/u3;JJI)Landroidx/compose/ui/graphics/GraphicsLayerModifierNodeElement;", "", "toString", "", "hashCode", "", "other", "equals", "c", "l0", "()F", "d", "m0", "e", "U", "f", "v0", "g", "D0", "q0", "w", "h0", "j0", "k0", "X", "u0", "Y", "Landroidx/compose/ui/graphics/g4;", "r0", "()Landroidx/compose/ui/graphics/g4;", "Z", "c0", "()Z", "E0", "Landroidx/compose/ui/graphics/u3;", "f0", "()Landroidx/compose/ui/graphics/u3;", "V", "G0", "s0", "H0", "d0", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/g4;ZLandroidx/compose/ui/graphics/u3;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8761g
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement */
final class GraphicsLayerModifierNodeElement extends C15723p0<SimpleGraphicsLayerModifier> {
    @C12580l

    /* renamed from: E0 */
    public final C15329u3 f37286E0;

    /* renamed from: F0 */
    public final long f37287F0;

    /* renamed from: G0 */
    public final long f37288G0;

    /* renamed from: H0 */
    public final int f37289H0;

    /* renamed from: X */
    public final long f37290X;
    @C12579k

    /* renamed from: Y */
    public final C15218g4 f37291Y;

    /* renamed from: Z */
    public final boolean f37292Z;

    /* renamed from: c */
    public final float f37293c;

    /* renamed from: d */
    public final float f37294d;

    /* renamed from: e */
    public final float f37295e;

    /* renamed from: f */
    public final float f37296f;

    /* renamed from: g */
    public final float f37297g;

    /* renamed from: v */
    public final float f37298v;

    /* renamed from: w */
    public final float f37299w;

    /* renamed from: x */
    public final float f37300x;

    /* renamed from: y */
    public final float f37301y;

    /* renamed from: z */
    public final float f37302z;

    public /* synthetic */ GraphicsLayerModifierNodeElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, C15329u3 u3Var, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, g4Var, z, u3Var, j2, j3, i);
    }

    /* renamed from: R */
    public static /* synthetic */ GraphicsLayerModifierNodeElement m65059R(GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, C15329u3 u3Var, long j2, long j3, int i, int i2, Object obj) {
        GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement2 = graphicsLayerModifierNodeElement;
        int i3 = i2;
        return graphicsLayerModifierNodeElement.mo42341Q((i3 & 1) != 0 ? graphicsLayerModifierNodeElement2.f37293c : f, (i3 & 2) != 0 ? graphicsLayerModifierNodeElement2.f37294d : f2, (i3 & 4) != 0 ? graphicsLayerModifierNodeElement2.f37295e : f3, (i3 & 8) != 0 ? graphicsLayerModifierNodeElement2.f37296f : f4, (i3 & 16) != 0 ? graphicsLayerModifierNodeElement2.f37297g : f5, (i3 & 32) != 0 ? graphicsLayerModifierNodeElement2.f37298v : f6, (i3 & 64) != 0 ? graphicsLayerModifierNodeElement2.f37299w : f7, (i3 & 128) != 0 ? graphicsLayerModifierNodeElement2.f37300x : f8, (i3 & 256) != 0 ? graphicsLayerModifierNodeElement2.f37301y : f9, (i3 & 512) != 0 ? graphicsLayerModifierNodeElement2.f37302z : f10, (i3 & 1024) != 0 ? graphicsLayerModifierNodeElement2.f37290X : j, (i3 & 2048) != 0 ? graphicsLayerModifierNodeElement2.f37291Y : g4Var, (i3 & 4096) != 0 ? graphicsLayerModifierNodeElement2.f37292Z : z, (i3 & 8192) != 0 ? graphicsLayerModifierNodeElement2.f37286E0 : u3Var, (i3 & 16384) != 0 ? graphicsLayerModifierNodeElement2.f37287F0 : j2, (i3 & 32768) != 0 ? graphicsLayerModifierNodeElement2.f37288G0 : j3, (i3 & 65536) != 0 ? graphicsLayerModifierNodeElement2.f37289H0 : i);
    }

    /* renamed from: B */
    public final long mo42328B() {
        return this.f37287F0;
    }

    /* renamed from: D */
    public final long mo42329D() {
        return this.f37288G0;
    }

    /* renamed from: D0 */
    public final float mo42330D0() {
        return this.f37297g;
    }

    /* renamed from: E */
    public final int mo42331E() {
        return this.f37289H0;
    }

    /* renamed from: F */
    public final float mo42332F() {
        return this.f37294d;
    }

    @C12579k
    /* renamed from: F0 */
    public SimpleGraphicsLayerModifier mo17102s(@C12579k SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        Intrinsics.checkNotNullParameter(simpleGraphicsLayerModifier, "node");
        simpleGraphicsLayerModifier.mo42377L0(this.f37293c);
        simpleGraphicsLayerModifier.mo42378M0(this.f37294d);
        simpleGraphicsLayerModifier.mo42368C0(this.f37295e);
        simpleGraphicsLayerModifier.mo42383R0(this.f37296f);
        simpleGraphicsLayerModifier.mo42384S0(this.f37297g);
        simpleGraphicsLayerModifier.mo42379N0(this.f37298v);
        simpleGraphicsLayerModifier.mo42374I0(this.f37299w);
        simpleGraphicsLayerModifier.mo42375J0(this.f37300x);
        simpleGraphicsLayerModifier.mo42376K0(this.f37301y);
        simpleGraphicsLayerModifier.mo42370E0(this.f37302z);
        simpleGraphicsLayerModifier.mo42382Q0(this.f37290X);
        simpleGraphicsLayerModifier.mo42380O0(this.f37291Y);
        simpleGraphicsLayerModifier.mo42371F0(this.f37292Z);
        simpleGraphicsLayerModifier.mo42373H0(this.f37286E0);
        simpleGraphicsLayerModifier.mo42369D0(this.f37287F0);
        simpleGraphicsLayerModifier.mo42381P0(this.f37288G0);
        simpleGraphicsLayerModifier.mo42372G0(this.f37289H0);
        simpleGraphicsLayerModifier.mo42367B0();
        return simpleGraphicsLayerModifier;
    }

    /* renamed from: G */
    public final float mo42334G() {
        return this.f37295e;
    }

    /* renamed from: H */
    public final float mo42335H() {
        return this.f37296f;
    }

    /* renamed from: I */
    public final float mo42336I() {
        return this.f37297g;
    }

    /* renamed from: J */
    public final float mo42337J() {
        return this.f37298v;
    }

    /* renamed from: L */
    public final float mo42338L() {
        return this.f37299w;
    }

    /* renamed from: M */
    public final float mo42339M() {
        return this.f37300x;
    }

    /* renamed from: P */
    public final float mo42340P() {
        return this.f37301y;
    }

    @C12579k
    /* renamed from: Q */
    public final GraphicsLayerModifierNodeElement mo42341Q(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, @C12579k C15218g4 g4Var, boolean z, @C12580l C15329u3 u3Var, long j2, long j3, int i) {
        float f11 = f;
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        return new GraphicsLayerModifierNodeElement(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, g4Var, z, u3Var, j2, j3, i, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: S */
    public SimpleGraphicsLayerModifier mo17098a() {
        return new SimpleGraphicsLayerModifier(this.f37293c, this.f37294d, this.f37295e, this.f37296f, this.f37297g, this.f37298v, this.f37299w, this.f37300x, this.f37301y, this.f37302z, this.f37290X, this.f37291Y, this.f37292Z, this.f37286E0, this.f37287F0, this.f37288G0, this.f37289H0, (DefaultConstructorMarker) null);
    }

    /* renamed from: U */
    public final float mo42343U() {
        return this.f37295e;
    }

    /* renamed from: V */
    public final long mo42344V() {
        return this.f37287F0;
    }

    /* renamed from: X */
    public final float mo42345X() {
        return this.f37302z;
    }

    /* renamed from: c0 */
    public final boolean mo42346c0() {
        return this.f37292Z;
    }

    /* renamed from: d0 */
    public final int mo42347d0() {
        return this.f37289H0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerModifierNodeElement)) {
            return false;
        }
        GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement = (GraphicsLayerModifierNodeElement) obj;
        return Float.compare(this.f37293c, graphicsLayerModifierNodeElement.f37293c) == 0 && Float.compare(this.f37294d, graphicsLayerModifierNodeElement.f37294d) == 0 && Float.compare(this.f37295e, graphicsLayerModifierNodeElement.f37295e) == 0 && Float.compare(this.f37296f, graphicsLayerModifierNodeElement.f37296f) == 0 && Float.compare(this.f37297g, graphicsLayerModifierNodeElement.f37297g) == 0 && Float.compare(this.f37298v, graphicsLayerModifierNodeElement.f37298v) == 0 && Float.compare(this.f37299w, graphicsLayerModifierNodeElement.f37299w) == 0 && Float.compare(this.f37300x, graphicsLayerModifierNodeElement.f37300x) == 0 && Float.compare(this.f37301y, graphicsLayerModifierNodeElement.f37301y) == 0 && Float.compare(this.f37302z, graphicsLayerModifierNodeElement.f37302z) == 0 && C15283o4.m66377i(this.f37290X, graphicsLayerModifierNodeElement.f37290X) && Intrinsics.areEqual((Object) this.f37291Y, (Object) graphicsLayerModifierNodeElement.f37291Y) && this.f37292Z == graphicsLayerModifierNodeElement.f37292Z && Intrinsics.areEqual((Object) this.f37286E0, (Object) graphicsLayerModifierNodeElement.f37286E0) && C15240j2.m66082y(this.f37287F0, graphicsLayerModifierNodeElement.f37287F0) && C15240j2.m66082y(this.f37288G0, graphicsLayerModifierNodeElement.f37288G0) && C15274n2.m66318g(this.f37289H0, graphicsLayerModifierNodeElement.f37289H0);
    }

    @C12580l
    /* renamed from: f0 */
    public final C15329u3 mo42348f0() {
        return this.f37286E0;
    }

    /* renamed from: h0 */
    public final float mo42349h0() {
        return this.f37299w;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((Float.hashCode(this.f37293c) * 31) + Float.hashCode(this.f37294d)) * 31) + Float.hashCode(this.f37295e)) * 31) + Float.hashCode(this.f37296f)) * 31) + Float.hashCode(this.f37297g)) * 31) + Float.hashCode(this.f37298v)) * 31) + Float.hashCode(this.f37299w)) * 31) + Float.hashCode(this.f37300x)) * 31) + Float.hashCode(this.f37301y)) * 31) + Float.hashCode(this.f37302z)) * 31) + C15283o4.m66381m(this.f37290X)) * 31) + this.f37291Y.hashCode()) * 31;
        boolean z = this.f37292Z;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        C15329u3 u3Var = this.f37286E0;
        return ((((((i + (u3Var == null ? 0 : u3Var.hashCode())) * 31) + C15240j2.m66056K(this.f37287F0)) * 31) + C15240j2.m66056K(this.f37288G0)) * 31) + C15274n2.m66319h(this.f37289H0);
    }

    /* renamed from: j0 */
    public final float mo42350j0() {
        return this.f37300x;
    }

    /* renamed from: k0 */
    public final float mo42351k0() {
        return this.f37301y;
    }

    /* renamed from: l0 */
    public final float mo42352l0() {
        return this.f37293c;
    }

    /* renamed from: m0 */
    public final float mo42353m0() {
        return this.f37294d;
    }

    /* renamed from: q0 */
    public final float mo42354q0() {
        return this.f37298v;
    }

    /* renamed from: r */
    public void mo17101r(@C12579k C15983v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.mo45973d("graphicsLayer");
        v0Var.mo45971b().mo45707c("scaleX", Float.valueOf(this.f37293c));
        v0Var.mo45971b().mo45707c("scaleY", Float.valueOf(this.f37294d));
        v0Var.mo45971b().mo45707c("alpha", Float.valueOf(this.f37295e));
        v0Var.mo45971b().mo45707c("translationX", Float.valueOf(this.f37296f));
        v0Var.mo45971b().mo45707c("translationY", Float.valueOf(this.f37297g));
        v0Var.mo45971b().mo45707c("shadowElevation", Float.valueOf(this.f37298v));
        v0Var.mo45971b().mo45707c("rotationX", Float.valueOf(this.f37299w));
        v0Var.mo45971b().mo45707c("rotationY", Float.valueOf(this.f37300x));
        v0Var.mo45971b().mo45707c("rotationZ", Float.valueOf(this.f37301y));
        v0Var.mo45971b().mo45707c("cameraDistance", Float.valueOf(this.f37302z));
        v0Var.mo45971b().mo45707c("transformOrigin", C15283o4.m66370b(this.f37290X));
        v0Var.mo45971b().mo45707c("shape", this.f37291Y);
        v0Var.mo45971b().mo45707c("clip", Boolean.valueOf(this.f37292Z));
        v0Var.mo45971b().mo45707c("renderEffect", this.f37286E0);
        v0Var.mo45971b().mo45707c("ambientShadowColor", C15240j2.m66071n(this.f37287F0));
        v0Var.mo45971b().mo45707c("spotShadowColor", C15240j2.m66071n(this.f37288G0));
        v0Var.mo45971b().mo45707c("compositingStrategy", C15274n2.m66315d(this.f37289H0));
    }

    @C12579k
    /* renamed from: r0 */
    public final C15218g4 mo42355r0() {
        return this.f37291Y;
    }

    /* renamed from: s0 */
    public final long mo42356s0() {
        return this.f37288G0;
    }

    /* renamed from: t */
    public final float mo42357t() {
        return this.f37293c;
    }

    @C12579k
    public String toString() {
        return "GraphicsLayerModifierNodeElement(scaleX=" + this.f37293c + ", scaleY=" + this.f37294d + ", alpha=" + this.f37295e + ", translationX=" + this.f37296f + ", translationY=" + this.f37297g + ", shadowElevation=" + this.f37298v + ", rotationX=" + this.f37299w + ", rotationY=" + this.f37300x + ", rotationZ=" + this.f37301y + ", cameraDistance=" + this.f37302z + ", transformOrigin=" + C15283o4.m66382n(this.f37290X) + ", shape=" + this.f37291Y + ", clip=" + this.f37292Z + ", renderEffect=" + this.f37286E0 + ", ambientShadowColor=" + C15240j2.m66057L(this.f37287F0) + ", spotShadowColor=" + C15240j2.m66057L(this.f37288G0) + ", compositingStrategy=" + C15274n2.m66320i(this.f37289H0) + ')';
    }

    /* renamed from: u */
    public final float mo42359u() {
        return this.f37302z;
    }

    /* renamed from: u0 */
    public final long mo42360u0() {
        return this.f37290X;
    }

    /* renamed from: v */
    public final long mo42361v() {
        return this.f37290X;
    }

    /* renamed from: v0 */
    public final float mo42362v0() {
        return this.f37296f;
    }

    @C12579k
    /* renamed from: x */
    public final C15218g4 mo42363x() {
        return this.f37291Y;
    }

    /* renamed from: y */
    public final boolean mo42364y() {
        return this.f37292Z;
    }

    @C12580l
    /* renamed from: z */
    public final C15329u3 mo42365z() {
        return this.f37286E0;
    }

    public GraphicsLayerModifierNodeElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C15218g4 g4Var, boolean z, C15329u3 u3Var, long j2, long j3, int i) {
        this.f37293c = f;
        this.f37294d = f2;
        this.f37295e = f3;
        this.f37296f = f4;
        this.f37297g = f5;
        this.f37298v = f6;
        this.f37299w = f7;
        this.f37300x = f8;
        this.f37301y = f9;
        this.f37302z = f10;
        this.f37290X = j;
        this.f37291Y = g4Var;
        this.f37292Z = z;
        this.f37286E0 = u3Var;
        this.f37287F0 = j2;
        this.f37288G0 = j3;
        this.f37289H0 = i;
    }
}
