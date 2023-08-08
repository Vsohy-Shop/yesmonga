package androidx.compose.p004ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
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

@C0376v0(23)
@C11363r0({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,417:1\n47#2,5:418\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:418,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.h1 */
public final class C15892h1 implements C15939o0 {
    @C12579k

    /* renamed from: j */
    public static final C15893a f39588j = new C15893a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public static boolean f39589k;

    /* renamed from: l */
    public static boolean f39590l = true;
    @C12579k

    /* renamed from: a */
    public final AndroidComposeView f39591a;
    @C12579k

    /* renamed from: b */
    public final RenderNode f39592b;

    /* renamed from: c */
    public int f39593c = C15274n2.f37602b.mo42916a();

    /* renamed from: d */
    public int f39594d;

    /* renamed from: e */
    public int f39595e;

    /* renamed from: f */
    public int f39596f;

    /* renamed from: g */
    public int f39597g;
    @C12580l

    /* renamed from: h */
    public C15329u3 f39598h;

    /* renamed from: i */
    public boolean f39599i;

    /* renamed from: androidx.compose.ui.platform.h1$a */
    public static final class C15893a {
        public /* synthetic */ C15893a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo45808a() {
            return C15892h1.f39589k;
        }

        /* renamed from: b */
        public final void mo45809b(boolean z) {
            C15892h1.f39589k = z;
        }

        public C15893a() {
        }
    }

    public C15892h1(@C12579k AndroidComposeView androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, "ownerView");
        this.f39591a = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        Intrinsics.checkNotNullExpressionValue(create, "create(\"Compose\", ownerView)");
        this.f39592b = create;
        if (f39590l) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            mo45792k0(create);
            mo45773c0();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f39590l = false;
        }
        if (f39589k) {
            throw new NoClassDefFoundError();
        }
    }

    /* renamed from: A */
    public boolean mo45744A(boolean z) {
        return this.f39592b.setHasOverlappingRendering(z);
    }

    /* renamed from: B */
    public void mo45745B(@C12580l C15329u3 u3Var) {
        this.f39598h = u3Var;
    }

    /* renamed from: C */
    public void mo45746C(@C12579k Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f39592b.getMatrix(matrix);
    }

    /* renamed from: D */
    public void mo45747D(float f) {
        this.f39592b.setCameraDistance(-f);
    }

    /* renamed from: E */
    public void mo45748E(float f) {
        this.f39592b.setRotationX(f);
    }

    /* renamed from: F */
    public void mo45749F(float f) {
        this.f39592b.setRotationY(f);
    }

    /* renamed from: G */
    public float mo45750G() {
        return this.f39592b.getScaleX();
    }

    /* renamed from: H */
    public int mo45751H() {
        return this.f39593c;
    }

    /* renamed from: I */
    public void mo45752I(float f) {
        this.f39592b.setRotation(f);
    }

    /* renamed from: J */
    public void mo45753J(float f) {
        this.f39592b.setScaleY(f);
    }

    /* renamed from: K */
    public void mo45754K(int i) {
        mo45786h0(mo45770a() + i);
        mo45788i0(mo45771b() + i);
        this.f39592b.offsetLeftAndRight(i);
    }

    /* renamed from: L */
    public int mo45755L() {
        return this.f39597g;
    }

    /* renamed from: M */
    public void mo45756M(float f) {
        this.f39592b.setPivotX(f);
    }

    /* renamed from: N */
    public int mo45757N() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C15968s3.f39664a.mo45952b(this.f39592b);
        }
        return -16777216;
    }

    /* renamed from: O */
    public void mo45758O(float f) {
        this.f39592b.setPivotY(f);
    }

    /* renamed from: P */
    public float mo45759P() {
        return this.f39592b.getTranslationY();
    }

    /* renamed from: Q */
    public float mo45760Q() {
        return this.f39592b.getTranslationX();
    }

    /* renamed from: R */
    public float mo45761R() {
        return this.f39592b.getRotationX();
    }

    /* renamed from: S */
    public void mo45762S(float f) {
        this.f39592b.setTranslationX(f);
    }

    /* renamed from: T */
    public void mo45763T(@C12580l Outline outline) {
        this.f39592b.setOutline(outline);
    }

    /* renamed from: U */
    public void mo45764U(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C15968s3.f39664a.mo45953c(this.f39592b, i);
        }
    }

    /* renamed from: V */
    public void mo45765V(boolean z) {
        this.f39592b.setClipToOutline(z);
    }

    /* renamed from: W */
    public void mo45766W(@C12579k C15125c2 c2Var, @C12580l C15231i3 i3Var, @C12579k C11300l<? super C15118b2, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c2Var, "canvasHolder");
        Intrinsics.checkNotNullParameter(lVar, "drawBlock");
        Canvas start = this.f39592b.start(getWidth(), getHeight());
        Intrinsics.checkNotNullExpressionValue(start, "renderNode.start(width, height)");
        Canvas T = c2Var.mo42490b().mo42733T();
        c2Var.mo42490b().mo42734V(start);
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
        this.f39592b.end(start);
    }

    /* renamed from: X */
    public float mo45767X() {
        return this.f39592b.getScaleY();
    }

    /* renamed from: Y */
    public void mo45768Y(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C15968s3.f39664a.mo45954d(this.f39592b, i);
        }
    }

    /* renamed from: Z */
    public float mo45769Z() {
        return this.f39592b.getElevation();
    }

    /* renamed from: a */
    public int mo45770a() {
        return this.f39594d;
    }

    /* renamed from: b */
    public int mo45771b() {
        return this.f39596f;
    }

    /* renamed from: c */
    public long mo45772c() {
        return 0;
    }

    /* renamed from: c0 */
    public final void mo45773c0() {
        C15960r3.f39660a.mo45948a(this.f39592b);
    }

    /* renamed from: d */
    public void mo45774d(@C12579k Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f39592b.getInverseMatrix(matrix);
    }

    /* renamed from: d0 */
    public final int mo45775d0() {
        if (C15274n2.m66318g(this.f39593c, C15274n2.f37602b.mo42918c())) {
            return 2;
        }
        return 0;
    }

    /* renamed from: e */
    public void mo45776e(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f39592b);
    }

    @C12579k
    /* renamed from: e0 */
    public final AndroidComposeView mo45777e0() {
        return this.f39591a;
    }

    /* renamed from: f */
    public void mo45778f(boolean z) {
        this.f39599i = z;
        this.f39592b.setClipToBounds(z);
    }

    /* renamed from: f0 */
    public final boolean mo45779f0() {
        return this.f39592b.hasOverlappingRendering();
    }

    /* renamed from: g */
    public void mo45780g(float f) {
        this.f39592b.setAlpha(f);
    }

    /* renamed from: g0 */
    public void mo45781g0(int i) {
        this.f39597g = i;
    }

    public float getAlpha() {
        return this.f39592b.getAlpha();
    }

    public int getHeight() {
        return mo45755L() - mo45801t();
    }

    public int getWidth() {
        return mo45771b() - mo45770a();
    }

    /* renamed from: h */
    public boolean mo45785h(int i, int i2, int i3, int i4) {
        mo45786h0(i);
        mo45790j0(i2);
        mo45788i0(i3);
        mo45781g0(i4);
        return this.f39592b.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: h0 */
    public void mo45786h0(int i) {
        this.f39594d = i;
    }

    /* renamed from: i */
    public void mo45787i() {
        mo45773c0();
    }

    /* renamed from: i0 */
    public void mo45788i0(int i) {
        this.f39596f = i;
    }

    /* renamed from: j */
    public void mo45789j(float f) {
        this.f39592b.setElevation(f);
    }

    /* renamed from: j0 */
    public void mo45790j0(int i) {
        this.f39595e = i;
    }

    /* renamed from: k */
    public void mo45791k(int i) {
        mo45790j0(mo45801t() + i);
        mo45781g0(mo45755L() + i);
        this.f39592b.offsetTopAndBottom(i);
    }

    /* renamed from: k0 */
    public final void mo45792k0(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            C15968s3 s3Var = C15968s3.f39664a;
            s3Var.mo45953c(renderNode, s3Var.mo45951a(renderNode));
            s3Var.mo45954d(renderNode, s3Var.mo45952b(renderNode));
        }
    }

    @C12580l
    /* renamed from: l */
    public C15329u3 mo45793l() {
        return this.f39598h;
    }

    /* renamed from: m */
    public boolean mo45794m() {
        return this.f39592b.isValid();
    }

    /* renamed from: n */
    public int mo45795n() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C15968s3.f39664a.mo45951a(this.f39592b);
        }
        return -16777216;
    }

    /* renamed from: o */
    public void mo45796o(float f) {
        this.f39592b.setTranslationY(f);
    }

    /* renamed from: p */
    public float mo45797p() {
        return this.f39592b.getPivotX();
    }

    /* renamed from: q */
    public boolean mo45798q() {
        return this.f39599i;
    }

    /* renamed from: r */
    public void mo45799r(int i) {
        C15274n2.C15275a aVar = C15274n2.f37602b;
        if (C15274n2.m66318g(i, aVar.mo42918c())) {
            this.f39592b.setLayerType(2);
            this.f39592b.setHasOverlappingRendering(true);
        } else if (C15274n2.m66318g(i, aVar.mo42917b())) {
            this.f39592b.setLayerType(0);
            this.f39592b.setHasOverlappingRendering(false);
        } else {
            this.f39592b.setLayerType(0);
            this.f39592b.setHasOverlappingRendering(true);
        }
        this.f39593c = i;
    }

    /* renamed from: s */
    public float mo45800s() {
        return this.f39592b.getRotationY();
    }

    /* renamed from: t */
    public int mo45801t() {
        return this.f39595e;
    }

    /* renamed from: u */
    public float mo45802u() {
        return this.f39592b.getPivotY();
    }

    /* renamed from: v */
    public float mo45803v() {
        return this.f39592b.getRotation();
    }

    @C12579k
    /* renamed from: w */
    public C15945p0 mo45804w() {
        return new C15945p0(0, 0, 0, 0, 0, 0, 0, this.f39592b.getScaleX(), this.f39592b.getScaleY(), this.f39592b.getTranslationX(), this.f39592b.getTranslationY(), this.f39592b.getElevation(), mo45795n(), mo45757N(), this.f39592b.getRotation(), this.f39592b.getRotationX(), this.f39592b.getRotationY(), this.f39592b.getCameraDistance(), this.f39592b.getPivotX(), this.f39592b.getPivotY(), this.f39592b.getClipToOutline(), mo45798q(), this.f39592b.getAlpha(), mo45793l(), this.f39593c, (DefaultConstructorMarker) null);
    }

    /* renamed from: x */
    public void mo45805x(float f) {
        this.f39592b.setScaleX(f);
    }

    /* renamed from: y */
    public boolean mo45806y() {
        return this.f39592b.getClipToOutline();
    }

    /* renamed from: z */
    public float mo45807z() {
        return -this.f39592b.getCameraDistance();
    }
}
