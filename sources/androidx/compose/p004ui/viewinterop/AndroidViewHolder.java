package androidx.compose.p004ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.DrawModifierKt;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.platform.C15867d1;
import androidx.compose.p004ui.platform.WindowRecomposer_androidKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16482f;
import androidx.compose.p004ui.unit.C16511x;
import androidx.compose.runtime.C8584m;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.core.view.C18384u1;
import androidx.core.view.C18400w1;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.C20437e;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\b\u0010«\u0001\u001a\u00030ª\u0001\u0012\n\u0010­\u0001\u001a\u0005\u0018\u00010¬\u0001\u0012\u0006\u0010F\u001a\u00020C¢\u0006\u0006\b®\u0001\u0010¯\u0001J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nJ\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0014J\u0006\u0010\u0013\u001a\u00020\fJ0\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0014J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\fH\u0014J\b\u0010\u001e\u001a\u00020\fH\u0014J\u001e\u0010$\u001a\u0004\u0018\u00010#2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010'\u001a\u00020\f2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0016J\u0010\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0004H\u0014J\u0012\u0010,\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010*H\u0016J\b\u0010-\u001a\u00020\u0014H\u0016J(\u00100\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004H\u0016J\b\u00101\u001a\u00020\u0004H\u0016J(\u00102\u001a\u00020\f2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004H\u0016J\u0018\u00103\u001a\u00020\f2\u0006\u0010&\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0004H\u0016J@\u00109\u001a\u00020\f2\u0006\u0010&\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u001fH\u0016J8\u0010\u0016\u001a\u00020\f2\u0006\u0010&\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004H\u0016J0\u0010<\u001a\u00020\f2\u0006\u0010&\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u0004H\u0016J(\u0010@\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\t2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=2\u0006\u00108\u001a\u00020\u0014H\u0016J \u0010A\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\t2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=H\u0016J\b\u0010B\u001a\u00020\u0014H\u0016R\u0014\u0010F\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER.\u0010M\u001a\u0004\u0018\u00010\t2\b\u0010G\u001a\u0004\u0018\u00010\t8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR6\u0010U\u001a\b\u0012\u0004\u0012\u00020\f0N2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0N8\u0006@DX\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010WR6\u0010]\u001a\b\u0012\u0004\u0012\u00020\f0N2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\f0N8\u0006@DX\u000e¢\u0006\u0012\n\u0004\bZ\u0010P\u001a\u0004\b[\u0010R\"\u0004\b\\\u0010TR6\u0010a\u001a\b\u0012\u0004\u0012\u00020\f0N2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\f0N8\u0006@DX\u000e¢\u0006\u0012\n\u0004\b^\u0010P\u001a\u0004\b_\u0010R\"\u0004\b`\u0010TR*\u0010h\u001a\u00020b2\u0006\u0010G\u001a\u00020b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR0\u0010p\u001a\u0010\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\f\u0018\u00010i8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR*\u0010x\u001a\u00020q2\u0006\u0010G\u001a\u00020q8\u0006@FX\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR0\u0010|\u001a\u0010\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\f\u0018\u00010i8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\by\u0010k\u001a\u0004\bz\u0010m\"\u0004\b{\u0010oR3\u0010\u0001\u001a\u0004\u0018\u00010}2\b\u0010G\u001a\u0004\u0018\u00010}8\u0006@FX\u000e¢\u0006\u0016\n\u0004\b~\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R7\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010G\u001a\u0005\u0018\u00010\u00018\u0006@FX\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0i8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010kR\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\f0N8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010PR4\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f\u0018\u00010i8\u0000@\u0000X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010k\u001a\u0005\b\u0001\u0010m\"\u0005\b\u0001\u0010oR\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018\u0002X\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001d\u0010©\u0001\u001a\u00030¤\u00018\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001¨\u0006°\u0001"}, mo22516d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/u1;", "Landroidx/compose/runtime/m;", "", "min", "max", "preferred", "j", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "Lkotlin/d2;", "t", "l", "g", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "k", "", "changed", "r", "b", "onLayout", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "disallowIntercept", "requestDisallowInterceptTouchEvent", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "child", "target", "onDescendantInvalidated", "visibility", "onWindowVisibilityChanged", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "shouldDelayChildPressedState", "axes", "type", "s", "getNestedScrollAxes", "m", "n", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "q", "dx", "dy", "o", "", "velocityX", "velocityY", "onNestedFling", "onNestedPreFling", "isNestedScrollingEnabled", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "a", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "value", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView$ui_release", "(Landroid/view/View;)V", "view", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/a;", "getUpdate", "()Lkotlin/jvm/functions/a;", "setUpdate", "(Lkotlin/jvm/functions/a;)V", "update", "d", "Z", "hasUpdateBlock", "<set-?>", "e", "getReset", "setReset", "reset", "f", "getRelease", "setRelease", "release", "Landroidx/compose/ui/m;", "Landroidx/compose/ui/m;", "getModifier", "()Landroidx/compose/ui/m;", "setModifier", "(Landroidx/compose/ui/m;)V", "modifier", "Lkotlin/Function1;", "v", "Lkotlin/jvm/functions/l;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/l;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/l;)V", "onModifierChanged", "Landroidx/compose/ui/unit/d;", "w", "Landroidx/compose/ui/unit/d;", "getDensity", "()Landroidx/compose/ui/unit/d;", "setDensity", "(Landroidx/compose/ui/unit/d;)V", "density", "x", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/w;", "y", "Landroidx/lifecycle/w;", "getLifecycleOwner", "()Landroidx/lifecycle/w;", "setLifecycleOwner", "(Landroidx/lifecycle/w;)V", "lifecycleOwner", "Landroidx/savedstate/e;", "z", "Landroidx/savedstate/e;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/e;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/e;)V", "savedStateRegistryOwner", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "E0", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "snapshotObserver", "F0", "onCommitAffectingUpdate", "G0", "runUpdate", "H0", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "I0", "[I", "J0", "I", "lastWidthMeasureSpec", "K0", "lastHeightMeasureSpec", "Landroidx/core/view/w1;", "L0", "Landroidx/core/view/w1;", "nestedScrollingParentHelper", "Landroidx/compose/ui/node/LayoutNode;", "M0", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/q;", "parentContext", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/q;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder */
public class AndroidViewHolder extends ViewGroup implements C18384u1, C8584m {
    @C12579k

    /* renamed from: E0 */
    public final SnapshotStateObserver f40922E0;
    @C12579k

    /* renamed from: F0 */
    public final C11300l<AndroidViewHolder, C11079d2> f40923F0;
    @C12579k

    /* renamed from: G0 */
    public final C11289a<C11079d2> f40924G0;
    @C12580l

    /* renamed from: H0 */
    public C11300l<? super Boolean, C11079d2> f40925H0;
    @C12579k

    /* renamed from: I0 */
    public final int[] f40926I0;

    /* renamed from: J0 */
    public int f40927J0;

    /* renamed from: K0 */
    public int f40928K0;
    @C12579k

    /* renamed from: L0 */
    public final C18400w1 f40929L0;
    @C12579k

    /* renamed from: M0 */
    public final LayoutNode f40930M0;
    @C12579k

    /* renamed from: a */
    public final NestedScrollDispatcher f40931a;
    @C12580l

    /* renamed from: b */
    public View f40932b;
    @C12579k

    /* renamed from: c */
    public C11289a<C11079d2> f40933c;

    /* renamed from: d */
    public boolean f40934d;
    @C12579k

    /* renamed from: e */
    public C11289a<C11079d2> f40935e;
    @C12579k

    /* renamed from: f */
    public C11289a<C11079d2> f40936f;
    @C12579k

    /* renamed from: g */
    public C8767m f40937g;
    @C12580l

    /* renamed from: v */
    public C11300l<? super C8767m, C11079d2> f40938v;
    @C12579k

    /* renamed from: w */
    public C16479d f40939w;
    @C12580l

    /* renamed from: x */
    public C11300l<? super C16479d, C11079d2> f40940x;
    @C12580l

    /* renamed from: y */
    public C19499w f40941y;
    @C12580l

    /* renamed from: z */
    public C20437e f40942z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder(@C12579k Context context, @C12580l C8602q qVar, @C12579k NestedScrollDispatcher nestedScrollDispatcher) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "dispatcher");
        this.f40931a = nestedScrollDispatcher;
        if (qVar != null) {
            WindowRecomposer_androidKt.m71151j(this, qVar);
        }
        setSaveFromParentEnabled(false);
        this.f40933c = AndroidViewHolder$update$1.f40949f;
        this.f40935e = AndroidViewHolder$reset$1.f40948f;
        this.f40936f = AndroidViewHolder$release$1.f40947f;
        C8767m.C8768a aVar = C8767m.f23478j;
        this.f40937g = aVar;
        this.f40939w = C16482f.m74434b(1.0f, 0.0f, 2, (Object) null);
        this.f40922E0 = new SnapshotStateObserver(new AndroidViewHolder$snapshotObserver$1(this));
        this.f40923F0 = new AndroidViewHolder$onCommitAffectingUpdate$1(this);
        this.f40924G0 = new AndroidViewHolder$runUpdate$1(this);
        this.f40926I0 = new int[2];
        this.f40927J0 = Integer.MIN_VALUE;
        this.f40928K0 = Integer.MIN_VALUE;
        this.f40929L0 = new C18400w1(this);
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, (DefaultConstructorMarker) null);
        layoutNode.mo44631J1(this);
        C8767m a = OnGloballyPositionedModifierKt.m68999a(DrawModifierKt.m32436a(PointerInteropFilter_androidKt.m68374c(SemanticsModifierKt.m71867b(aVar, true, AndroidViewHolder$layoutNode$1$coreModifier$1.f40946f), this), new AndroidViewHolder$layoutNode$1$coreModifier$2(layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$3(this, layoutNode));
        layoutNode.mo44582u(this.f40937g.mo17224k3(a));
        this.f40938v = new AndroidViewHolder$layoutNode$1$1(layoutNode, a);
        layoutNode.mo44583w(this.f40939w);
        this.f40940x = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        layoutNode.mo44648Q1(new AndroidViewHolder$layoutNode$1$3(this, layoutNode, objectRef));
        layoutNode.mo44651R1(new AndroidViewHolder$layoutNode$1$4(this, objectRef));
        layoutNode.mo44581o(new AndroidViewHolder$layoutNode$1$5(this, layoutNode));
        this.f40930M0 = layoutNode;
    }

    /* renamed from: g */
    public void mo16258g() {
        this.f40936f.invoke();
    }

    public boolean gatherTransparentRegion(@C12580l Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f40926I0);
        int[] iArr = this.f40926I0;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.f40926I0[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @C12579k
    public final C16479d getDensity() {
        return this.f40939w;
    }

    @C12580l
    public final View getInteropView() {
        return this.f40932b;
    }

    @C12579k
    public final LayoutNode getLayoutNode() {
        return this.f40930M0;
    }

    @C12580l
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f40932b;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    @C12580l
    public final C19499w getLifecycleOwner() {
        return this.f40941y;
    }

    @C12579k
    public final C8767m getModifier() {
        return this.f40937g;
    }

    public int getNestedScrollAxes() {
        return this.f40929L0.mo53039a();
    }

    @C12580l
    public final C11300l<C16479d, C11079d2> getOnDensityChanged$ui_release() {
        return this.f40940x;
    }

    @C12580l
    public final C11300l<C8767m, C11079d2> getOnModifierChanged$ui_release() {
        return this.f40938v;
    }

    @C12580l
    public final C11300l<Boolean, C11079d2> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f40925H0;
    }

    @C12579k
    public final C11289a<C11079d2> getRelease() {
        return this.f40936f;
    }

    @C12579k
    public final C11289a<C11079d2> getReset() {
        return this.f40935e;
    }

    @C12580l
    public final C20437e getSavedStateRegistryOwner() {
        return this.f40942z;
    }

    @C12579k
    public final C11289a<C11079d2> getUpdate() {
        return this.f40933c;
    }

    @C12580l
    public final View getView() {
        return this.f40932b;
    }

    @C12580l
    public ViewParent invalidateChildInParent(@C12580l int[] iArr, @C12580l Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f40930M0.mo44650R0();
        return null;
    }

    public boolean isNestedScrollingEnabled() {
        View view = this.f40932b;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    /* renamed from: j */
    public final int mo47938j(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(C11479u.m44334I(i3, i, i2), 1073741824);
        }
        if (i3 == -2 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        }
        if (i3 != -1 || i2 == Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    /* renamed from: k */
    public final void mo47939k() {
        int i;
        int i2 = this.f40927J0;
        if (i2 != Integer.MIN_VALUE && (i = this.f40928K0) != Integer.MIN_VALUE) {
            measure(i2, i);
        }
    }

    /* renamed from: l */
    public void mo16259l() {
        this.f40935e.invoke();
        removeAllViewsInLayout();
    }

    /* renamed from: m */
    public void mo2389m(@C12579k View view, @C12579k View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "child");
        Intrinsics.checkNotNullParameter(view2, "target");
        this.f40929L0.mo53041c(view, view2, i, i2);
    }

    /* renamed from: n */
    public void mo2390n(@C12579k View view, int i) {
        Intrinsics.checkNotNullParameter(view, "target");
        this.f40929L0.mo53043e(view, i);
    }

    /* renamed from: o */
    public void mo2391o(@C12579k View view, int i, int i2, @C12579k int[] iArr, int i3) {
        Intrinsics.checkNotNullParameter(view, "target");
        Intrinsics.checkNotNullParameter(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            long d = this.f40931a.mo43941d(C15096g.m64898a(C16523c.m74855f(i), C16523c.m74855f(i2)), C16523c.m74857h(i3));
            iArr[0] = C15867d1.m71318f(C15094f.m64880p(d));
            iArr[1] = C15867d1.m71318f(C15094f.m64882r(d));
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40922E0.mo16509v();
    }

    public void onDescendantInvalidated(@C12579k View view, @C12579k View view2) {
        Intrinsics.checkNotNullParameter(view, "child");
        Intrinsics.checkNotNullParameter(view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.f40930M0.mo44650R0();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40922E0.mo16510w();
        this.f40922E0.mo16498k();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f40932b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onMeasure(int i, int i2) {
        ViewParent viewParent;
        int i3;
        View view = this.f40932b;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        View view2 = this.f40932b;
        if (view2 != null) {
            view2.measure(i, i2);
        }
        View view3 = this.f40932b;
        int i4 = 0;
        if (view3 != null) {
            i3 = view3.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        View view4 = this.f40932b;
        if (view4 != null) {
            i4 = view4.getMeasuredHeight();
        }
        setMeasuredDimension(i3, i4);
        this.f40927J0 = i;
        this.f40928K0 = i2;
    }

    public boolean onNestedFling(@C12579k View view, float f, float f2, boolean z) {
        View view2 = view;
        Intrinsics.checkNotNullParameter(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        long a = C16511x.m74763a(C16523c.m74856g(f), C16523c.m74856g(f2));
        C11723c2 unused = C12038j.m48061f(this.f40931a.mo43943f(), (CoroutineContext) null, (CoroutineStart) null, new AndroidViewHolder$onNestedFling$1(z, this, a, (C11045c<? super AndroidViewHolder$onNestedFling$1>) null), 3, (Object) null);
        return false;
    }

    public boolean onNestedPreFling(@C12579k View view, float f, float f2) {
        Intrinsics.checkNotNullParameter(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C11723c2 unused = C12038j.m48061f(this.f40931a.mo43943f(), (CoroutineContext) null, (CoroutineStart) null, new AndroidViewHolder$onNestedPreFling$1(this, C16511x.m74763a(C16523c.m74856g(f), C16523c.m74856g(f2)), (C11045c<? super AndroidViewHolder$onNestedPreFling$1>) null), 3, (Object) null);
        return false;
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: q */
    public void mo2407q(@C12579k View view, int i, int i2, int i3, int i4, int i5, @C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(view, "target");
        Intrinsics.checkNotNullParameter(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            long b = this.f40931a.mo43939b(C15096g.m64898a(C16523c.m74855f(i), C16523c.m74855f(i2)), C15096g.m64898a(C16523c.m74855f(i3), C16523c.m74855f(i4)), C16523c.m74857h(i5));
            iArr[0] = C15867d1.m71318f(C15094f.m64880p(b));
            iArr[1] = C15867d1.m71318f(C15094f.m64882r(b));
        }
    }

    /* renamed from: r */
    public void mo2408r(@C12579k View view, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(view, "target");
        if (isNestedScrollingEnabled()) {
            this.f40931a.mo43939b(C15096g.m64898a(C16523c.m74855f(i), C16523c.m74855f(i2)), C15096g.m64898a(C16523c.m74855f(i3), C16523c.m74855f(i4)), C16523c.m74857h(i5));
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        C11300l<? super Boolean, C11079d2> lVar = this.f40925H0;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* renamed from: s */
    public boolean mo2409s(@C12579k View view, @C12579k View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "child");
        Intrinsics.checkNotNullParameter(view2, "target");
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    public final void setDensity(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "value");
        if (dVar != this.f40939w) {
            this.f40939w = dVar;
            C11300l<? super C16479d, C11079d2> lVar = this.f40940x;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(@C12580l C19499w wVar) {
        if (wVar != this.f40941y) {
            this.f40941y = wVar;
            ViewTreeLifecycleOwner.m90621b(this, wVar);
        }
    }

    public final void setModifier(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "value");
        if (mVar != this.f40937g) {
            this.f40937g = mVar;
            C11300l<? super C8767m, C11079d2> lVar = this.f40938v;
            if (lVar != null) {
                lVar.invoke(mVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@C12580l C11300l<? super C16479d, C11079d2> lVar) {
        this.f40940x = lVar;
    }

    public final void setOnModifierChanged$ui_release(@C12580l C11300l<? super C8767m, C11079d2> lVar) {
        this.f40938v = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@C12580l C11300l<? super Boolean, C11079d2> lVar) {
        this.f40925H0 = lVar;
    }

    public final void setRelease(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f40936f = aVar;
    }

    public final void setReset(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f40935e = aVar;
    }

    public final void setSavedStateRegistryOwner(@C12580l C20437e eVar) {
        if (eVar != this.f40942z) {
            this.f40942z = eVar;
            ViewTreeSavedStateRegistryOwner.m95252b(this, eVar);
        }
    }

    public final void setUpdate(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "value");
        this.f40933c = aVar;
        this.f40934d = true;
        this.f40924G0.invoke();
    }

    public final void setView$ui_release(@C12580l View view) {
        if (view != this.f40932b) {
            this.f40932b = view;
            removeAllViewsInLayout();
            if (view != null) {
                addView(view);
                this.f40924G0.invoke();
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* renamed from: t */
    public void mo16260t() {
        View view = this.f40932b;
        Intrinsics.checkNotNull(view);
        if (view.getParent() != this) {
            addView(this.f40932b);
        } else {
            this.f40935e.invoke();
        }
    }
}
