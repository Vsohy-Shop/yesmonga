package androidx.compose.p004ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.geometry.C15092d;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15112a3;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15125c2;
import androidx.compose.p004ui.graphics.C15201e0;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.C15274n2;
import androidx.compose.p004ui.graphics.C15283o4;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.p004ui.graphics.C15329u3;
import androidx.compose.p004ui.layout.C15572i;
import androidx.compose.p004ui.node.C15672b1;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.maps.android.data.kml.C33866p;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002#@B;\u0012\u0006\u0010S\u001a\u00020O\u0012\u0006\u0010X\u001a\u00020T\u0012\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00040E\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040G¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J¯\u0001\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u0016H\u0016J\u001d\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u00042\u0006\u0010'\u001a\u00020.H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010-J\u0010\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u00101\u001a\u000203H\u0014J\b\u00105\u001a\u00020\u0004H\u0016J0\u0010:\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00162\u0006\u0010/\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010#\u001a\u000207H\u0014J\b\u0010;\u001a\u00020\u0004H\u0016J\b\u0010<\u001a\u00020\u0004H\u0016J\b\u0010=\u001a\u00020\u0004H\u0016J%\u0010@\u001a\u00020&2\u0006\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u0018\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u0010?\u001a\u00020\u0016H\u0016J*\u0010I\u001a\u00020\u00042\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00040E2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040GH\u0016J\u001d\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020JH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ\u001d\u0010N\u001a\u00020\u00042\u0006\u0010K\u001a\u00020JH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010MR\u0017\u0010S\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bL\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010X\u001a\u00020T8\u0006¢\u0006\f\n\u0004\b#\u0010U\u001a\u0004\bV\u0010WR$\u0010F\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0004\u0018\u00010E8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010YR\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010ZR\u0014\u0010]\u001a\u00020[8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010\\R\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010aR*\u0010i\u001a\u00020\u00162\u0006\u0010c\u001a\u00020\u00168\u0006@BX\u000e¢\u0006\u0012\n\u0004\bd\u0010^\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010^R\u0014\u0010n\u001a\u00020l8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010mR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00010o8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010pR\u001f\u0010s\u001a\u00020\u00128\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010rR\u0016\u0010u\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010^R\u001a\u0010z\u001a\u00020v8\u0016X\u0004¢\u0006\f\n\u0004\bw\u0010r\u001a\u0004\bx\u0010yR\u0016\u0010~\u001a\u0004\u0018\u00010{8BX\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0015\u0010\u0001\u001a\u00020v8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010yR)\u0010\u0001\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u00078F@FX\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0001"}, mo22516d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/b1;", "Landroidx/compose/ui/layout/i;", "Lkotlin/d2;", "z", "y", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/o4;", "transformOrigin", "Landroidx/compose/ui/graphics/g4;", "shape", "", "clip", "Landroidx/compose/ui/graphics/u3;", "renderEffect", "Landroidx/compose/ui/graphics/j2;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/n2;", "compositingStrategy", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "b", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/g4;ZLandroidx/compose/ui/graphics/u3;JJILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/d;)V", "hasOverlappingRendering", "Landroidx/compose/ui/geometry/f;", "position", "i", "(J)Z", "Landroidx/compose/ui/unit/q;", "size", "d", "(J)V", "Landroidx/compose/ui/unit/m;", "l", "Landroidx/compose/ui/graphics/b2;", "canvas", "f", "Landroid/graphics/Canvas;", "dispatchDraw", "invalidate", "changed", "", "t", "r", "onLayout", "h", "m", "forceLayout", "point", "inverse", "c", "(JZ)J", "Landroidx/compose/ui/geometry/d;", "rect", "e", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "g", "Landroidx/compose/ui/graphics/a3;", "matrix", "a", "([F)V", "k", "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Lkotlin/jvm/functions/l;", "Lkotlin/jvm/functions/a;", "Landroidx/compose/ui/platform/g1;", "Landroidx/compose/ui/platform/g1;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "v", "x", "()Z", "setInvalidated", "(Z)V", "isInvalidated", "w", "drawnWithZ", "Landroidx/compose/ui/graphics/c2;", "Landroidx/compose/ui/graphics/c2;", "canvasHolder", "Landroidx/compose/ui/platform/z0;", "Landroidx/compose/ui/platform/z0;", "matrixCache", "J", "mTransformOrigin", "E0", "mHasOverlappingRendering", "", "F0", "getLayerId", "()J", "layerId", "Landroidx/compose/ui/graphics/i3;", "getManualClipPath", "()Landroidx/compose/ui/graphics/i3;", "manualClipPath", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/l;Lkotlin/jvm/functions/a;)V", "G0", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,476:1\n47#2,5:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n290#1:477,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.ViewLayer */
public final class ViewLayer extends View implements C15672b1, C15572i {
    @C12579k

    /* renamed from: G0 */
    public static final C15813b f39405G0 = new C15813b((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: H0 */
    public static final C11304p<View, Matrix, C11079d2> f39406H0 = ViewLayer$Companion$getMatrix$1.f39427f;
    @C12579k

    /* renamed from: I0 */
    public static final ViewOutlineProvider f39407I0 = new C15812a();
    @C12580l

    /* renamed from: J0 */
    public static Method f39408J0;
    @C12580l

    /* renamed from: K0 */
    public static Field f39409K0;

    /* renamed from: L0 */
    public static boolean f39410L0;

    /* renamed from: M0 */
    public static boolean f39411M0;

    /* renamed from: E0 */
    public boolean f39412E0 = true;

    /* renamed from: F0 */
    public final long f39413F0;
    @C12579k

    /* renamed from: a */
    public final AndroidComposeView f39414a;
    @C12579k

    /* renamed from: b */
    public final DrawChildContainer f39415b;
    @C12580l

    /* renamed from: c */
    public C11300l<? super C15118b2, C11079d2> f39416c;
    @C12580l

    /* renamed from: d */
    public C11289a<C11079d2> f39417d;
    @C12579k

    /* renamed from: e */
    public final C15886g1 f39418e;

    /* renamed from: f */
    public boolean f39419f;
    @C12580l

    /* renamed from: g */
    public Rect f39420g;

    /* renamed from: v */
    public boolean f39421v;

    /* renamed from: w */
    public boolean f39422w;
    @C12579k

    /* renamed from: x */
    public final C15125c2 f39423x = new C15125c2();
    @C12579k

    /* renamed from: y */
    public final C16004z0<View> f39424y = new C16004z0<>(f39406H0);

    /* renamed from: z */
    public long f39425z = C15283o4.f37618b.mo42933a();

    /* renamed from: androidx.compose.ui.platform.ViewLayer$a */
    public static final class C15812a extends ViewOutlineProvider {
        public void getOutline(@C12579k View view, @C12579k Outline outline) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(outline, C33866p.f82159k);
            Outline c = ((ViewLayer) view).f39418e.mo45731c();
            Intrinsics.checkNotNull(c);
            outline.set(c);
        }
    }

    @C11363r0({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,476:1\n26#2:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n*L\n431#1:477\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.ViewLayer$b */
    public static final class C15813b {
        public /* synthetic */ C15813b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo45584a() {
            return ViewLayer.f39410L0;
        }

        @C12579k
        /* renamed from: b */
        public final ViewOutlineProvider mo45585b() {
            return ViewLayer.f39407I0;
        }

        /* renamed from: c */
        public final boolean mo45586c() {
            return ViewLayer.f39411M0;
        }

        /* renamed from: d */
        public final void mo45587d(boolean z) {
            ViewLayer.f39411M0 = z;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: e */
        public final void mo45588e(@C12579k View view) {
            Class<String> cls = String.class;
            Class<Class> cls2 = Class.class;
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            try {
                if (!mo45584a()) {
                    ViewLayer.f39410L0 = true;
                    Class<View> cls3 = View.class;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f39408J0 = cls3.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f39409K0 = cls3.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f39408J0 = (Method) cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{cls, new Class[0].getClass()}).invoke(cls3, new Object[]{"updateDisplayListIfDirty", new Class[0]});
                        ViewLayer.f39409K0 = (Field) cls2.getDeclaredMethod("getDeclaredField", new Class[]{cls}).invoke(cls3, new Object[]{"mRecreateDisplayList"});
                    }
                    Method s = ViewLayer.f39408J0;
                    if (s != null) {
                        s.setAccessible(true);
                    }
                    Field q = ViewLayer.f39409K0;
                    if (q != null) {
                        q.setAccessible(true);
                    }
                }
                Field q2 = ViewLayer.f39409K0;
                if (q2 != null) {
                    q2.setBoolean(view, true);
                }
                Method s2 = ViewLayer.f39408J0;
                if (s2 != null) {
                    s2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                mo45587d(true);
            }
        }

        public C15813b() {
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.compose.ui.platform.ViewLayer$c */
    public static final class C15814c {
        @C12579k

        /* renamed from: a */
        public static final C15814c f39426a = new C15814c();

        @C0373u
        @C11384m
        /* renamed from: a */
        public static final long m71133a(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            return view.getUniqueDrawingId();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLayer(@C12579k AndroidComposeView androidComposeView, @C12579k DrawChildContainer drawChildContainer, @C12579k C11300l<? super C15118b2, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar) {
        super(androidComposeView.getContext());
        Intrinsics.checkNotNullParameter(androidComposeView, "ownerView");
        Intrinsics.checkNotNullParameter(drawChildContainer, "container");
        Intrinsics.checkNotNullParameter(lVar, "drawBlock");
        Intrinsics.checkNotNullParameter(aVar, "invalidateParentLayer");
        this.f39414a = androidComposeView;
        this.f39415b = drawChildContainer;
        this.f39416c = lVar;
        this.f39417d = aVar;
        this.f39418e = new C15886g1(androidComposeView.getDensity());
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.f39413F0 = (long) View.generateViewId();
    }

    private final C15231i3 getManualClipPath() {
        if (!getClipToOutline() || this.f39418e.mo45732d()) {
            return null;
        }
        return this.f39418e.mo45730b();
    }

    private final void setInvalidated(boolean z) {
        if (z != this.f39421v) {
            this.f39421v = z;
            this.f39414a.mo45352s0(this, z);
        }
    }

    /* renamed from: a */
    public void mo44939a(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        C15112a3.m65171u(fArr, this.f39424y.mo45984b(this));
    }

    /* renamed from: b */
    public void mo44940b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, @C12579k C15218g4 g4Var, boolean z, @C12580l C15329u3 u3Var, long j2, long j3, int i, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
        C11289a<C11079d2> aVar;
        C15218g4 g4Var2 = g4Var;
        int i2 = i;
        Intrinsics.checkNotNullParameter(g4Var2, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f39425z = j;
        setScaleX(f);
        float f11 = f2;
        setScaleY(f2);
        float f12 = f3;
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(C15283o4.m66379k(this.f39425z) * ((float) getWidth()));
        setPivotY(C15283o4.m66380l(this.f39425z) * ((float) getHeight()));
        setCameraDistancePx(f10);
        boolean z2 = true;
        this.f39419f = z && g4Var2 == C15321t3.m66567a();
        mo45581y();
        boolean z3 = getManualClipPath() != null;
        setClipToOutline(z && g4Var2 != C15321t3.m66567a());
        boolean g = this.f39418e.mo45735g(g4Var, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, dVar);
        mo45582z();
        boolean z4 = getManualClipPath() != null;
        if (z3 != z4 || (z4 && g)) {
            invalidate();
        }
        if (!this.f39422w && getElevation() > 0.0f && (aVar = this.f39417d) != null) {
            aVar.invoke();
        }
        this.f39424y.mo45985c();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            C15883f4 f4Var = C15883f4.f39531a;
            f4Var.mo45726a(this, C15258l2.m66193r(j2));
            f4Var.mo45727b(this, C15258l2.m66193r(j3));
        }
        if (i3 >= 31) {
            C15896h4.f39600a.mo45810a(this, u3Var);
        }
        C15274n2.C15275a aVar2 = C15274n2.f37602b;
        if (C15274n2.m66318g(i2, aVar2.mo42918c())) {
            setLayerType(2, (Paint) null);
        } else if (C15274n2.m66318g(i2, aVar2.mo42917b())) {
            setLayerType(0, (Paint) null);
            z2 = false;
        } else {
            setLayerType(0, (Paint) null);
        }
        this.f39412E0 = z2;
    }

    /* renamed from: c */
    public long mo44941c(long j, boolean z) {
        if (!z) {
            return C15112a3.m65160j(this.f39424y.mo45984b(this), j);
        }
        float[] a = this.f39424y.mo45983a(this);
        if (a != null) {
            return C15112a3.m65160j(a, j);
        }
        return C15094f.f37256b.mo42246a();
    }

    /* renamed from: d */
    public void mo44942d(long j) {
        int m = C16500q.m74662m(j);
        int j2 = C16500q.m74659j(j);
        if (m != getWidth() || j2 != getHeight()) {
            float f = (float) m;
            setPivotX(C15283o4.m66379k(this.f39425z) * f);
            float f2 = (float) j2;
            setPivotY(C15283o4.m66380l(this.f39425z) * f2);
            this.f39418e.mo45736h(C15106n.m65033a(f, f2));
            mo45582z();
            layout(getLeft(), getTop(), getLeft() + m, getTop() + j2);
            mo45581y();
            this.f39424y.mo45985c();
        }
    }

    public void dispatchDraw(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        C15125c2 c2Var = this.f39423x;
        Canvas T = c2Var.mo42490b().mo42733T();
        c2Var.mo42490b().mo42734V(canvas);
        C15201e0 b = c2Var.mo42490b();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            b.mo42422E();
            this.f39418e.mo45729a(b);
            z = true;
        }
        C11300l<? super C15118b2, C11079d2> lVar = this.f39416c;
        if (lVar != null) {
            lVar.invoke(b);
        }
        if (z) {
            b.mo42443q();
        }
        c2Var.mo42490b().mo42734V(T);
    }

    /* renamed from: e */
    public void mo44943e(@C12579k C15092d dVar, boolean z) {
        Intrinsics.checkNotNullParameter(dVar, "rect");
        if (z) {
            float[] a = this.f39424y.mo45983a(this);
            if (a != null) {
                C15112a3.m65162l(a, dVar);
            } else {
                dVar.mo42236k(0.0f, 0.0f, 0.0f, 0.0f);
            }
        } else {
            C15112a3.m65162l(this.f39424y.mo45984b(this), dVar);
        }
    }

    /* renamed from: f */
    public void mo44944f(@C12579k C15118b2 b2Var) {
        boolean z;
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        if (getElevation() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f39422w = z;
        if (z) {
            b2Var.mo42445u();
        }
        this.f39415b.mo45542a(b2Var, this, getDrawingTime());
        if (this.f39422w) {
            b2Var.mo42423F();
        }
    }

    public void forceLayout() {
    }

    /* renamed from: g */
    public void mo44945g(@C12579k C11300l<? super C15118b2, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(lVar, "drawBlock");
        Intrinsics.checkNotNullParameter(aVar, "invalidateParentLayer");
        this.f39415b.addView(this);
        this.f39419f = false;
        this.f39422w = false;
        this.f39425z = C15283o4.f37618b.mo42933a();
        this.f39416c = lVar;
        this.f39417d = aVar;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    @C12579k
    public final DrawChildContainer getContainer() {
        return this.f39415b;
    }

    public long getLayerId() {
        return this.f39413F0;
    }

    @C12579k
    public final AndroidComposeView getOwnerView() {
        return this.f39414a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C15814c.m71133a(this.f39414a);
        }
        return -1;
    }

    /* renamed from: h */
    public void mo44946h() {
        setInvalidated(false);
        this.f39414a.mo45362y0();
        this.f39416c = null;
        this.f39417d = null;
        this.f39414a.mo45360w0(this);
        this.f39415b.removeViewInLayout(this);
    }

    public boolean hasOverlappingRendering() {
        return this.f39412E0;
    }

    /* renamed from: i */
    public boolean mo44947i(long j) {
        float p = C15094f.m64880p(j);
        float r = C15094f.m64882r(j);
        if (this.f39419f) {
            if (0.0f > p || p >= ((float) getWidth()) || 0.0f > r || r >= ((float) getHeight())) {
                return false;
            }
            return true;
        } else if (getClipToOutline()) {
            return this.f39418e.mo45733e(j);
        } else {
            return true;
        }
    }

    public void invalidate() {
        if (!this.f39421v) {
            setInvalidated(true);
            super.invalidate();
            this.f39414a.invalidate();
        }
    }

    /* renamed from: k */
    public void mo44949k(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        float[] a = this.f39424y.mo45983a(this);
        if (a != null) {
            C15112a3.m65171u(fArr, a);
        }
    }

    /* renamed from: l */
    public void mo44950l(long j) {
        int m = C16494m.m74581m(j);
        if (m != getLeft()) {
            offsetLeftAndRight(m - getLeft());
            this.f39424y.mo45985c();
        }
        int o = C16494m.m74583o(j);
        if (o != getTop()) {
            offsetTopAndBottom(o - getTop());
            this.f39424y.mo45985c();
        }
    }

    /* renamed from: m */
    public void mo44951m() {
        if (this.f39421v && !f39411M0) {
            setInvalidated(false);
            f39405G0.mo45588e(this);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * ((float) getResources().getDisplayMetrics().densityDpi));
    }

    /* renamed from: x */
    public final boolean mo45580x() {
        return this.f39421v;
    }

    /* renamed from: y */
    public final void mo45581y() {
        Rect rect;
        if (this.f39419f) {
            Rect rect2 = this.f39420g;
            if (rect2 == null) {
                this.f39420g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f39420g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    /* renamed from: z */
    public final void mo45582z() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.f39418e.mo45731c() != null) {
            viewOutlineProvider = f39407I0;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }
}
