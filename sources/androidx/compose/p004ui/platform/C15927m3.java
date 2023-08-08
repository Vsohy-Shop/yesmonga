package androidx.compose.p004ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15125c2;
import androidx.compose.p004ui.graphics.C15201e0;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15274n2;
import androidx.compose.p004ui.graphics.C15329u3;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(29)
@C11363r0({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,274:1\n47#2,5:275\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n204#1:275,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.m3 */
public final class C15927m3 implements C15939o0 {
    @C12579k

    /* renamed from: a */
    public final AndroidComposeView f39614a;
    @C12579k

    /* renamed from: b */
    public final RenderNode f39615b = C15882f3.m71346a("Compose");
    @C12580l

    /* renamed from: c */
    public C15329u3 f39616c;

    /* renamed from: d */
    public int f39617d = C15274n2.f37602b.mo42916a();

    public C15927m3(@C12579k AndroidComposeView androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, "ownerView");
        this.f39614a = androidComposeView;
        C15888g3.m71365a();
    }

    /* renamed from: A */
    public boolean mo45744A(boolean z) {
        return this.f39615b.setHasOverlappingRendering(z);
    }

    /* renamed from: B */
    public void mo45745B(@C12580l C15329u3 u3Var) {
        this.f39616c = u3Var;
        if (Build.VERSION.SDK_INT >= 31) {
            C15942o3.f39628a.mo45854a(this.f39615b, u3Var);
        }
    }

    /* renamed from: C */
    public void mo45746C(@C12579k Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f39615b.getMatrix(matrix);
    }

    /* renamed from: D */
    public void mo45747D(float f) {
        boolean unused = this.f39615b.setCameraDistance(f);
    }

    /* renamed from: E */
    public void mo45748E(float f) {
        boolean unused = this.f39615b.setRotationX(f);
    }

    /* renamed from: F */
    public void mo45749F(float f) {
        boolean unused = this.f39615b.setRotationY(f);
    }

    /* renamed from: G */
    public float mo45750G() {
        return this.f39615b.getScaleX();
    }

    /* renamed from: H */
    public int mo45751H() {
        return this.f39617d;
    }

    /* renamed from: I */
    public void mo45752I(float f) {
        boolean unused = this.f39615b.setRotationZ(f);
    }

    /* renamed from: J */
    public void mo45753J(float f) {
        boolean unused = this.f39615b.setScaleY(f);
    }

    /* renamed from: K */
    public void mo45754K(int i) {
        boolean unused = this.f39615b.offsetLeftAndRight(i);
    }

    /* renamed from: L */
    public int mo45755L() {
        return this.f39615b.getBottom();
    }

    /* renamed from: M */
    public void mo45756M(float f) {
        boolean unused = this.f39615b.setPivotX(f);
    }

    /* renamed from: N */
    public int mo45757N() {
        return this.f39615b.getSpotShadowColor();
    }

    /* renamed from: O */
    public void mo45758O(float f) {
        boolean unused = this.f39615b.setPivotY(f);
    }

    /* renamed from: P */
    public float mo45759P() {
        return this.f39615b.getTranslationY();
    }

    /* renamed from: Q */
    public float mo45760Q() {
        return this.f39615b.getTranslationX();
    }

    /* renamed from: R */
    public float mo45761R() {
        return this.f39615b.getRotationX();
    }

    /* renamed from: S */
    public void mo45762S(float f) {
        boolean unused = this.f39615b.setTranslationX(f);
    }

    /* renamed from: T */
    public void mo45763T(@C12580l Outline outline) {
        boolean unused = this.f39615b.setOutline(outline);
    }

    /* renamed from: U */
    public void mo45764U(int i) {
        boolean unused = this.f39615b.setAmbientShadowColor(i);
    }

    /* renamed from: V */
    public void mo45765V(boolean z) {
        boolean unused = this.f39615b.setClipToOutline(z);
    }

    /* renamed from: W */
    public void mo45766W(@C12579k C15125c2 c2Var, @C12580l C15231i3 i3Var, @C12579k C11300l<? super C15118b2, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c2Var, "canvasHolder");
        Intrinsics.checkNotNullParameter(lVar, "drawBlock");
        RecordingCanvas a = this.f39615b.beginRecording();
        Intrinsics.checkNotNullExpressionValue(a, "renderNode.beginRecording()");
        Canvas T = c2Var.mo42490b().mo42733T();
        c2Var.mo42490b().mo42734V(a);
        C15201e0 b = c2Var.mo42490b();
        if (i3Var != null) {
            b.mo42422E();
            C15118b2.m65190r(b, i3Var, 0, 2, (Object) null);
        }
        lVar.invoke(b);
        if (i3Var != null) {
            b.mo42443q();
        }
        c2Var.mo42490b().mo42734V(T);
        this.f39615b.endRecording();
    }

    /* renamed from: X */
    public float mo45767X() {
        return this.f39615b.getScaleY();
    }

    /* renamed from: Y */
    public void mo45768Y(int i) {
        boolean unused = this.f39615b.setSpotShadowColor(i);
    }

    /* renamed from: Z */
    public float mo45769Z() {
        return this.f39615b.getElevation();
    }

    /* renamed from: a */
    public int mo45770a() {
        return this.f39615b.getLeft();
    }

    @C12579k
    /* renamed from: a0 */
    public final AndroidComposeView mo45841a0() {
        return this.f39614a;
    }

    /* renamed from: b */
    public int mo45771b() {
        return this.f39615b.getRight();
    }

    /* renamed from: b0 */
    public final boolean mo45842b0() {
        return this.f39615b.hasOverlappingRendering();
    }

    /* renamed from: c */
    public long mo45772c() {
        return this.f39615b.getUniqueId();
    }

    /* renamed from: c0 */
    public final boolean mo45843c0() {
        return this.f39615b.getUseCompositingLayer();
    }

    /* renamed from: d */
    public void mo45774d(@C12579k Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f39615b.getInverseMatrix(matrix);
    }

    /* renamed from: e */
    public void mo45776e(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRenderNode(this.f39615b);
    }

    /* renamed from: f */
    public void mo45778f(boolean z) {
        boolean unused = this.f39615b.setClipToBounds(z);
    }

    /* renamed from: g */
    public void mo45780g(float f) {
        boolean unused = this.f39615b.setAlpha(f);
    }

    public float getAlpha() {
        return this.f39615b.getAlpha();
    }

    public int getHeight() {
        return this.f39615b.getHeight();
    }

    public int getWidth() {
        return this.f39615b.getWidth();
    }

    /* renamed from: h */
    public boolean mo45785h(int i, int i2, int i3, int i4) {
        return this.f39615b.setPosition(i, i2, i3, i4);
    }

    /* renamed from: i */
    public void mo45787i() {
        this.f39615b.discardDisplayList();
    }

    /* renamed from: j */
    public void mo45789j(float f) {
        boolean unused = this.f39615b.setElevation(f);
    }

    /* renamed from: k */
    public void mo45791k(int i) {
        boolean unused = this.f39615b.offsetTopAndBottom(i);
    }

    @C12580l
    /* renamed from: l */
    public C15329u3 mo45793l() {
        return this.f39616c;
    }

    /* renamed from: m */
    public boolean mo45794m() {
        return this.f39615b.hasDisplayList();
    }

    /* renamed from: n */
    public int mo45795n() {
        return this.f39615b.getAmbientShadowColor();
    }

    /* renamed from: o */
    public void mo45796o(float f) {
        boolean unused = this.f39615b.setTranslationY(f);
    }

    /* renamed from: p */
    public float mo45797p() {
        return this.f39615b.getPivotX();
    }

    /* renamed from: q */
    public boolean mo45798q() {
        return this.f39615b.getClipToBounds();
    }

    /* renamed from: r */
    public void mo45799r(int i) {
        RenderNode renderNode = this.f39615b;
        C15274n2.C15275a aVar = C15274n2.f37602b;
        if (C15274n2.m66318g(i, aVar.mo42918c())) {
            boolean unused = renderNode.setUseCompositingLayer(true, (Paint) null);
            boolean unused2 = renderNode.setHasOverlappingRendering(true);
        } else if (C15274n2.m66318g(i, aVar.mo42917b())) {
            boolean unused3 = renderNode.setUseCompositingLayer(false, (Paint) null);
            boolean unused4 = renderNode.setHasOverlappingRendering(false);
        } else {
            boolean unused5 = renderNode.setUseCompositingLayer(false, (Paint) null);
            boolean unused6 = renderNode.setHasOverlappingRendering(true);
        }
        this.f39617d = i;
    }

    /* renamed from: s */
    public float mo45800s() {
        return this.f39615b.getRotationY();
    }

    /* renamed from: t */
    public int mo45801t() {
        return this.f39615b.getTop();
    }

    /* renamed from: u */
    public float mo45802u() {
        return this.f39615b.getPivotY();
    }

    /* renamed from: v */
    public float mo45803v() {
        return this.f39615b.getRotationZ();
    }

    @C12579k
    /* renamed from: w */
    public C15945p0 mo45804w() {
        return new C15945p0(this.f39615b.getUniqueId(), this.f39615b.getLeft(), this.f39615b.getTop(), this.f39615b.getRight(), this.f39615b.getBottom(), this.f39615b.getWidth(), this.f39615b.getHeight(), this.f39615b.getScaleX(), this.f39615b.getScaleY(), this.f39615b.getTranslationX(), this.f39615b.getTranslationY(), this.f39615b.getElevation(), this.f39615b.getAmbientShadowColor(), this.f39615b.getSpotShadowColor(), this.f39615b.getRotationZ(), this.f39615b.getRotationX(), this.f39615b.getRotationY(), this.f39615b.getCameraDistance(), this.f39615b.getPivotX(), this.f39615b.getPivotY(), this.f39615b.getClipToOutline(), this.f39615b.getClipToBounds(), this.f39615b.getAlpha(), this.f39616c, this.f39617d, (DefaultConstructorMarker) null);
    }

    /* renamed from: x */
    public void mo45805x(float f) {
        boolean unused = this.f39615b.setScaleX(f);
    }

    /* renamed from: y */
    public boolean mo45806y() {
        return this.f39615b.getClipToOutline();
    }

    /* renamed from: z */
    public float mo45807z() {
        return this.f39615b.getCameraDistance();
    }
}
