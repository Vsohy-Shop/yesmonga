package androidx.compose.p004ui.window;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.C0344h1;
import androidx.compose.p004ui.C8776o;
import androidx.compose.p004ui.C8782q;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.p004ui.platform.AbstractComposeView;
import androidx.compose.p004ui.platform.C15902i4;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16497o;
import androidx.compose.p004ui.unit.C16499p;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.C16934c;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"ViewConstructor"})
@C11076d0(mo22515d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BX\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010J\u001a\u00020G\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\u0007\u0010\u0001\u001a\u00020Y\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\b\u0002\u0010N\u001a\u00020K¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\u0005J(\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0010¢\u0006\u0004\b \u0010!J7\u0010'\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)H\u0016J.\u00101\u001a\u00020\u00052\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u000202J\u0006\u00105\u001a\u00020\u0005J\u000f\u00106\u001a\u00020\u0005H\u0001¢\u0006\u0004\b6\u00107J\u0006\u00108\u001a\u00020\u0005J\u0006\u00109\u001a\u00020\u0005J\u0012\u0010;\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\"\u00100\u001a\u00020/8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010X\u001a\u00020\u00128\u0000X\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u00107\u001a\u0004\bU\u0010VR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010g\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR8\u0010p\u001a\u0004\u0018\u00010h2\b\u0010i\u001a\u0004\u0018\u00010h8F@FX\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR/\u00103\u001a\u0004\u0018\u0001022\b\u0010i\u001a\u0004\u0018\u0001028B@BX\u0002¢\u0006\u0012\n\u0004\bq\u0010k\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u001b\u0010~\u001a\u00020\u00038FX\u0002¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R \u0010\u0001\u001a\u000208\u0002X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001RE\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u00182\u0011\u0010i\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u00188B@BX\u0002¢\u0006\u0016\n\u0005\b\u0001\u0010k\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b\u001a\u0010\u0001R(\u0010\u0001\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u00038\u0014@RX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010}R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\f8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\f8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¢\u0001"}, mo22516d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/i4;", "", "isFocusable", "Lkotlin/d2;", "setIsFocusable", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "clippingEnabled", "setClippingEnabled", "", "flags", "n", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "s", "Landroid/view/WindowManager$LayoutParams;", "o", "r", "Landroidx/compose/runtime/q;", "parent", "Lkotlin/Function0;", "Landroidx/compose/runtime/g;", "content", "setContent", "(Landroidx/compose/runtime/q;Lkotlin/jvm/functions/p;)V", "c", "(Landroidx/compose/runtime/o;I)V", "widthMeasureSpec", "heightMeasureSpec", "j", "(II)V", "changed", "left", "top", "right", "bottom", "i", "(ZIIII)V", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "onDismissRequest", "Landroidx/compose/ui/window/h;", "properties", "", "testTag", "t", "Landroidx/compose/ui/layout/o;", "parentLayoutCoordinates", "v", "q", "u", "()V", "w", "p", "Landroid/view/MotionEvent;", "onTouchEvent", "setLayoutDirection", "x", "Lkotlin/jvm/functions/a;", "y", "Landroidx/compose/ui/window/h;", "z", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "E0", "Landroid/view/View;", "composeView", "Landroidx/compose/ui/window/d;", "F0", "Landroidx/compose/ui/window/d;", "popupLayoutHelper", "Landroid/view/WindowManager;", "G0", "Landroid/view/WindowManager;", "windowManager", "H0", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "params", "Landroidx/compose/ui/window/g;", "I0", "Landroidx/compose/ui/window/g;", "getPositionProvider", "()Landroidx/compose/ui/window/g;", "setPositionProvider", "(Landroidx/compose/ui/window/g;)V", "positionProvider", "J0", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "parentLayoutDirection", "Landroidx/compose/ui/unit/q;", "<set-?>", "K0", "Landroidx/compose/runtime/z0;", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/q;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/q;)V", "popupContentSize", "L0", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/o;", "setParentLayoutCoordinates", "(Landroidx/compose/ui/layout/o;)V", "Landroidx/compose/ui/unit/o;", "M0", "Landroidx/compose/ui/unit/o;", "parentBounds", "N0", "Landroidx/compose/runtime/k2;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Landroidx/compose/ui/unit/g;", "O0", "F", "maxSupportedElevation", "Landroid/graphics/Rect;", "P0", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "Q0", "getContent", "()Lkotlin/jvm/functions/p;", "(Lkotlin/jvm/functions/p;)V", "R0", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "", "S0", "[I", "locationOnScreen", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Landroidx/compose/ui/unit/d;", "density", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "<init>", "(Lkotlin/jvm/functions/a;Landroidx/compose/ui/window/h;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/window/g;Ljava/util/UUID;Landroidx/compose/ui/window/d;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,824:1\n154#2:825\n1#3:826\n76#4:827\n102#4,2:828\n76#4:830\n102#4,2:831\n76#4:833\n76#4:834\n102#4,2:835\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n413#1:825\n402#1:827\n402#1:828,2\n403#1:830\n403#1:831,2\n407#1:833\n447#1:834\n447#1:835,2\n*E\n"})
/* renamed from: androidx.compose.ui.window.PopupLayout */
public final class PopupLayout extends AbstractComposeView implements C15902i4 {
    @C12579k

    /* renamed from: E0 */
    public final View f41005E0;
    @C12579k

    /* renamed from: F0 */
    public final C16543d f41006F0;
    @C12579k

    /* renamed from: G0 */
    public final WindowManager f41007G0;
    @C12579k

    /* renamed from: H0 */
    public final WindowManager.LayoutParams f41008H0;
    @C12579k

    /* renamed from: I0 */
    public C16546g f41009I0;
    @C12579k

    /* renamed from: J0 */
    public LayoutDirection f41010J0;
    @C12579k

    /* renamed from: K0 */
    public final C8700z0 f41011K0;
    @C12579k

    /* renamed from: L0 */
    public final C8700z0 f41012L0;
    @C12580l

    /* renamed from: M0 */
    public C16497o f41013M0;
    @C12579k

    /* renamed from: N0 */
    public final C8578k2 f41014N0;

    /* renamed from: O0 */
    public final float f41015O0;
    @C12579k

    /* renamed from: P0 */
    public final Rect f41016P0;
    @C12579k

    /* renamed from: Q0 */
    public final C8700z0 f41017Q0;

    /* renamed from: R0 */
    public boolean f41018R0;
    @C12579k

    /* renamed from: S0 */
    public final int[] f41019S0;
    @C12580l

    /* renamed from: x */
    public C11289a<C11079d2> f41020x;
    @C12579k

    /* renamed from: y */
    public C16547h f41021y;
    @C12579k

    /* renamed from: z */
    public String f41022z;

    /* renamed from: androidx.compose.ui.window.PopupLayout$a */
    public static final class C16538a extends ViewOutlineProvider {
        public void getOutline(@C12579k View view, @C12579k Outline outline) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(outline, "result");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* renamed from: androidx.compose.ui.window.PopupLayout$b */
    public /* synthetic */ class C16539b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.p004ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p004ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p004ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.PopupLayout.C16539b.<clinit>():void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupLayout(kotlin.jvm.functions.C11289a r11, androidx.compose.p004ui.window.C16547h r12, java.lang.String r13, android.view.View r14, androidx.compose.p004ui.unit.C16479d r15, androidx.compose.p004ui.window.C16546g r16, java.util.UUID r17, androidx.compose.p004ui.window.C16543d r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0012
            androidx.compose.ui.window.e r0 = new androidx.compose.ui.window.e
            r0.<init>()
            goto L_0x0017
        L_0x0012:
            androidx.compose.ui.window.f r0 = new androidx.compose.ui.window.f
            r0.<init>()
        L_0x0017:
            r9 = r0
            goto L_0x001b
        L_0x0019:
            r9 = r18
        L_0x001b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.PopupLayout.<init>(kotlin.jvm.functions.a, androidx.compose.ui.window.h, java.lang.String, android.view.View, androidx.compose.ui.unit.d, androidx.compose.ui.window.g, java.util.UUID, androidx.compose.ui.window.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final C11304p<C8592o, Integer, C11079d2> getContent() {
        return (C11304p) this.f41017Q0.getValue();
    }

    private final int getDisplayHeight() {
        return C11409d.m43851L0(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return C11409d.m43851L0(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    @C0344h1(otherwise = 2)
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final C15588o getParentLayoutCoordinates() {
        return (C15588o) this.f41012L0.getValue();
    }

    private final void setClippingEnabled(boolean z) {
        int i;
        if (z) {
            i = this.f41008H0.flags & -513;
        } else {
            i = this.f41008H0.flags | 512;
        }
        mo48053n(i);
    }

    private final void setContent(C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        this.f41017Q0.setValue(pVar);
    }

    private final void setIsFocusable(boolean z) {
        int i;
        if (!z) {
            i = this.f41008H0.flags | 8;
        } else {
            i = this.f41008H0.flags & -9;
        }
        mo48053n(i);
    }

    private final void setParentLayoutCoordinates(C15588o oVar) {
        this.f41012L0.setValue(oVar);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        int i;
        if (C16548i.m74948a(secureFlagPolicy, AndroidPopup_androidKt.m74876i(this.f41005E0))) {
            i = this.f41008H0.flags | 8192;
        } else {
            i = this.f41008H0.flags & -8193;
        }
        mo48053n(i);
    }

    @C8540g
    @C8782q
    /* renamed from: c */
    public void mo10810c(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-857613600);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-857613600, i, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:463)");
        }
        getContent().invoke(o, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PopupLayout$Content$4(this, i));
        }
    }

    public boolean dispatchKeyEvent(@C12579k KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && this.f41021y.mo48085b()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                C11289a<C11079d2> aVar = this.f41020x;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f41014N0.getValue()).booleanValue();
    }

    @C12579k
    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f41008H0;
    }

    @C12579k
    public final LayoutDirection getParentLayoutDirection() {
        return this.f41010J0;
    }

    @C12580l
    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final C16500q m172800getPopupContentSizebOM6tXw() {
        return (C16500q) this.f41011K0.getValue();
    }

    @C12579k
    public final C16546g getPositionProvider() {
        return this.f41009I0;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f41018R0;
    }

    @C12579k
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @C12579k
    public final String getTestTag() {
        return this.f41022z;
    }

    /* renamed from: i */
    public void mo45286i(boolean z, int i, int i2, int i3, int i4) {
        super.mo45286i(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.f41008H0.width = childAt.getMeasuredWidth();
            this.f41008H0.height = childAt.getMeasuredHeight();
            this.f41006F0.mo48082b(this.f41007G0, this, this.f41008H0);
        }
    }

    /* renamed from: j */
    public void mo45288j(int i, int i2) {
        if (this.f41021y.mo48091g()) {
            super.mo45288j(i, i2);
        } else {
            super.mo45288j(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    /* renamed from: n */
    public final void mo48053n(int i) {
        WindowManager.LayoutParams layoutParams = this.f41008H0;
        layoutParams.flags = i;
        this.f41006F0.mo48082b(this.f41007G0, this, layoutParams);
    }

    /* renamed from: o */
    public final WindowManager.LayoutParams mo48054o() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & -8552473) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = this.f41005E0.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f41005E0.getContext().getResources().getString(C8776o.C8779c.default_popup_window_title));
        return layoutParams;
    }

    public boolean onTouchEvent(@C12580l MotionEvent motionEvent) {
        boolean z;
        if (!this.f41021y.mo48086c()) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z2 = false;
        if (motionEvent == null || motionEvent.getAction() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z || (motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) getHeight()))) {
            if (motionEvent != null && motionEvent.getAction() == 4) {
                z2 = true;
            }
            if (!z2) {
                return super.onTouchEvent(motionEvent);
            }
            C11289a<C11079d2> aVar = this.f41020x;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        C11289a<C11079d2> aVar2 = this.f41020x;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    /* renamed from: p */
    public final void mo48056p() {
        ViewTreeLifecycleOwner.m90621b(this, (C19499w) null);
        this.f41007G0.removeViewImmediate(this);
    }

    /* renamed from: q */
    public final void mo48057q() {
        int[] iArr = this.f41019S0;
        int i = iArr[0];
        int i2 = iArr[1];
        this.f41005E0.getLocationOnScreen(iArr);
        int[] iArr2 = this.f41019S0;
        if (i != iArr2[0] || i2 != iArr2[1]) {
            mo48067u();
        }
    }

    /* renamed from: r */
    public final void mo48058r() {
        this.f41007G0.addView(this, this.f41008H0);
    }

    /* renamed from: s */
    public final void mo48059s(LayoutDirection layoutDirection) {
        int i = C16539b.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.f41010J0 = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m172801setPopupContentSizefhxjrPA(@C12580l C16500q qVar) {
        this.f41011K0.setValue(qVar);
    }

    public final void setPositionProvider(@C12579k C16546g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f41009I0 = gVar;
    }

    public final void setTestTag(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f41022z = str;
    }

    /* renamed from: t */
    public final void mo48066t(@C12580l C11289a<C11079d2> aVar, @C12579k C16547h hVar, @C12579k String str, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(hVar, "properties");
        Intrinsics.checkNotNullParameter(str, "testTag");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f41020x = aVar;
        this.f41021y = hVar;
        this.f41022z = str;
        setIsFocusable(hVar.mo48088e());
        setSecurePolicy(hVar.mo48090f());
        setClippingEnabled(hVar.mo48084a());
        mo48059s(layoutDirection);
    }

    @C0344h1(otherwise = 2)
    /* renamed from: u */
    public final void mo48067u() {
        C15588o parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            long a = parentLayoutCoordinates.mo44434a();
            long g = C15591p.m69305g(parentLayoutCoordinates);
            C16497o b = C16499p.m74645b(C16496n.m74593a(C11409d.m43851L0(C15094f.m64880p(g)), C11409d.m43851L0(C15094f.m64882r(g))), a);
            if (!Intrinsics.areEqual((Object) b, (Object) this.f41013M0)) {
                this.f41013M0 = b;
                mo48069w();
            }
        }
    }

    /* renamed from: v */
    public final void mo48068v(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "parentLayoutCoordinates");
        setParentLayoutCoordinates(oVar);
        mo48067u();
    }

    /* renamed from: w */
    public final void mo48069w() {
        C16500q r0;
        C16497o oVar = this.f41013M0;
        if (oVar != null && (r0 = m172800getPopupContentSizebOM6tXw()) != null) {
            long q = r0.mo47895q();
            Rect rect = this.f41016P0;
            this.f41006F0.mo48081a(this.f41005E0, rect);
            C16497o g = AndroidPopup_androidKt.m74879l(rect);
            long a = C16502r.m74668a(g.mo47862G(), g.mo47885r());
            long a2 = this.f41009I0.mo9854a(oVar, a, this.f41010J0, q);
            this.f41008H0.x = C16494m.m74581m(a2);
            this.f41008H0.y = C16494m.m74583o(a2);
            if (this.f41021y.mo48087d()) {
                this.f41006F0.mo48083c(this, C16500q.m74662m(a), C16500q.m74659j(a));
            }
            this.f41006F0.mo48082b(this.f41007G0, this, this.f41008H0);
        }
    }

    public final void setContent(@C12579k C8602q qVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(qVar, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(pVar, "content");
        setParentCompositionContext(qVar);
        setContent(pVar);
        this.f41018R0 = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PopupLayout(@org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r8, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.window.C16547h r9, @org.jetbrains.annotations.C12579k java.lang.String r10, @org.jetbrains.annotations.C12579k android.view.View r11, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.C16479d r12, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.window.C16546g r13, @org.jetbrains.annotations.C12579k java.util.UUID r14, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.window.C16543d r15) {
        /*
            r7 = this;
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "testTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "initialPositionProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "popupId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "popupLayoutHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            android.content.Context r2 = r11.getContext()
            java.lang.String r0 = "composeView.context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f41020x = r8
            r7.f41021y = r9
            r7.f41022z = r10
            r7.f41005E0 = r11
            r7.f41006F0 = r15
            android.content.Context r8 = r11.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.f41007G0 = r8
            android.view.WindowManager$LayoutParams r8 = r7.mo48054o()
            r7.f41008H0 = r8
            r7.f41009I0 = r13
            androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.p004ui.unit.LayoutDirection.Ltr
            r7.f41010J0 = r8
            r8 = 0
            r9 = 2
            androidx.compose.runtime.z0 r10 = androidx.compose.runtime.C8539f2.m30981g(r8, r8, r9, r8)
            r7.f41011K0 = r10
            androidx.compose.runtime.z0 r10 = androidx.compose.runtime.C8539f2.m30981g(r8, r8, r9, r8)
            r7.f41012L0 = r10
            androidx.compose.ui.window.PopupLayout$canCalculatePosition$2 r10 = new androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            r10.<init>(r7)
            androidx.compose.runtime.k2 r10 = androidx.compose.runtime.C8415c2.m30235d(r10)
            r7.f41014N0 = r10
            r10 = 8
            float r10 = (float) r10
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            r7.f41015O0 = r10
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            r7.f41016P0 = r13
            r13 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r13)
            androidx.lifecycle.w r13 = androidx.lifecycle.ViewTreeLifecycleOwner.m90620a(r11)
            androidx.lifecycle.ViewTreeLifecycleOwner.m90621b(r7, r13)
            androidx.lifecycle.b1 r13 = androidx.lifecycle.ViewTreeViewModelStoreOwner.m90624a(r11)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.m90625b(r7, r13)
            androidx.savedstate.e r11 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.m95251a(r11)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.m95252b(r7, r11)
            int r11 = androidx.compose.p004ui.C8776o.C8778b.compose_view_saveable_id_tag
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "Popup:"
            r13.append(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r7.setTag(r11, r13)
            r11 = 0
            r7.setClipChildren(r11)
            float r10 = r12.mo7425g5(r10)
            r7.setElevation(r10)
            androidx.compose.ui.window.PopupLayout$a r10 = new androidx.compose.ui.window.PopupLayout$a
            r10.<init>()
            r7.setOutlineProvider(r10)
            androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt r10 = androidx.compose.p004ui.window.ComposableSingletons$AndroidPopup_androidKt.f40992a
            kotlin.jvm.functions.p r10 = r10.mo48026a()
            androidx.compose.runtime.z0 r8 = androidx.compose.runtime.C8539f2.m30981g(r10, r8, r9, r8)
            r7.f41017Q0 = r8
            int[] r8 = new int[r9]
            r7.f41019S0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.PopupLayout.<init>(kotlin.jvm.functions.a, androidx.compose.ui.window.h, java.lang.String, android.view.View, androidx.compose.ui.unit.d, androidx.compose.ui.window.g, java.util.UUID, androidx.compose.ui.window.d):void");
    }
}
