package androidx.compose.material3.internal;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.p004ui.C8776o;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.platform.AbstractComposeView;
import androidx.compose.p004ui.platform.C15902i4;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16497o;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.p004ui.window.C16546g;
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
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"ViewConstructor"})
@C11363r0({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,476:1\n154#2:477\n1#3:478\n76#4:479\n102#4,2:480\n76#4:482\n102#4,2:483\n76#4:485\n76#4:486\n102#4,2:487\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material3/internal/PopupLayout\n*L\n242#1:477\n234#1:479\n234#1:480,2\n235#1:482\n235#1:483,2\n238#1:485\n287#1:486\n287#1:487,2\n*E\n"})
public final class PopupLayout extends AbstractComposeView implements C15902i4, ViewTreeObserver.OnGlobalLayoutListener {
    @C12579k

    /* renamed from: E0 */
    public final WindowManager f20205E0;
    @C12579k

    /* renamed from: F0 */
    public final WindowManager.LayoutParams f20206F0 = mo12682m();
    @C12579k

    /* renamed from: G0 */
    public C16546g f20207G0;
    @C12579k

    /* renamed from: H0 */
    public LayoutDirection f20208H0;
    @C12579k

    /* renamed from: I0 */
    public final C8700z0 f20209I0;
    @C12579k

    /* renamed from: J0 */
    public final C8700z0 f20210J0;
    @C12579k

    /* renamed from: K0 */
    public final C8578k2 f20211K0;

    /* renamed from: L0 */
    public final float f20212L0;
    @C12579k

    /* renamed from: M0 */
    public final Rect f20213M0;
    @C12579k

    /* renamed from: N0 */
    public final Rect f20214N0;
    @C12579k

    /* renamed from: O0 */
    public final C11304p<C15094f, C16497o, Boolean> f20215O0;
    @C12579k

    /* renamed from: P0 */
    public final C8700z0 f20216P0;

    /* renamed from: Q0 */
    public boolean f20217Q0;
    @C12580l

    /* renamed from: x */
    public C11289a<C11079d2> f20218x;
    @C12579k

    /* renamed from: y */
    public String f20219y;
    @C12579k

    /* renamed from: z */
    public final View f20220z;

    /* renamed from: androidx.compose.material3.internal.PopupLayout$a */
    public static final class C8224a extends ViewOutlineProvider {
        public void getOutline(@C12579k View view, @C12579k Outline outline) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(outline, "result");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* renamed from: androidx.compose.material3.internal.PopupLayout$b */
    public /* synthetic */ class C8225b {
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.PopupLayout.C8225b.<clinit>():void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PopupLayout(@org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r8, @org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12579k android.view.View r10, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.C16479d r11, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.window.C16546g r12, @org.jetbrains.annotations.C12579k java.util.UUID r13) {
        /*
            r7 = this;
            java.lang.String r0 = "testTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "initialPositionProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "popupId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            android.content.Context r2 = r10.getContext()
            java.lang.String r0 = "composeView.context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f20218x = r8
            r7.f20219y = r9
            r7.f20220z = r10
            android.content.Context r8 = r10.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.f20205E0 = r8
            android.view.WindowManager$LayoutParams r8 = r7.mo12682m()
            r7.f20206F0 = r8
            r7.f20207G0 = r12
            androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.p004ui.unit.LayoutDirection.Ltr
            r7.f20208H0 = r8
            r8 = 0
            r9 = 2
            androidx.compose.runtime.z0 r12 = androidx.compose.runtime.C8539f2.m30981g(r8, r8, r9, r8)
            r7.f20209I0 = r12
            androidx.compose.runtime.z0 r12 = androidx.compose.runtime.C8539f2.m30981g(r8, r8, r9, r8)
            r7.f20210J0 = r12
            androidx.compose.material3.internal.PopupLayout$canCalculatePosition$2 r12 = new androidx.compose.material3.internal.PopupLayout$canCalculatePosition$2
            r12.<init>(r7)
            androidx.compose.runtime.k2 r12 = androidx.compose.runtime.C8415c2.m30235d(r12)
            r7.f20211K0 = r12
            r12 = 8
            float r12 = (float) r12
            float r12 = androidx.compose.p004ui.unit.C16483g.m74435M(r12)
            r7.f20212L0 = r12
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f20213M0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f20214N0 = r0
            androidx.compose.material3.internal.PopupLayout$dismissOnOutsideClick$1 r0 = androidx.compose.material3.internal.PopupLayout$dismissOnOutsideClick$1.f20221f
            r7.f20215O0 = r0
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r0)
            androidx.lifecycle.w r0 = androidx.lifecycle.ViewTreeLifecycleOwner.m90620a(r10)
            androidx.lifecycle.ViewTreeLifecycleOwner.m90621b(r7, r0)
            androidx.lifecycle.b1 r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner.m90624a(r10)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.m90625b(r7, r0)
            androidx.savedstate.e r0 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.m95251a(r10)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.m95252b(r7, r0)
            android.view.ViewTreeObserver r10 = r10.getViewTreeObserver()
            r10.addOnGlobalLayoutListener(r7)
            int r10 = androidx.compose.p004ui.C8776o.C8778b.compose_view_saveable_id_tag
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Popup:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r7.setTag(r10, r13)
            r10 = 0
            r7.setClipChildren(r10)
            float r10 = r11.mo7425g5(r12)
            r7.setElevation(r10)
            androidx.compose.material3.internal.PopupLayout$a r10 = new androidx.compose.material3.internal.PopupLayout$a
            r10.<init>()
            r7.setOutlineProvider(r10)
            androidx.compose.material3.internal.ComposableSingletons$ExposedDropdownMenuPopupKt r10 = androidx.compose.material3.internal.ComposableSingletons$ExposedDropdownMenuPopupKt.f20191a
            kotlin.jvm.functions.p r10 = r10.mo12660a()
            androidx.compose.runtime.z0 r8 = androidx.compose.runtime.C8539f2.m30981g(r10, r8, r9, r8)
            r7.f20216P0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.PopupLayout.<init>(kotlin.jvm.functions.a, java.lang.String, android.view.View, androidx.compose.ui.unit.d, androidx.compose.ui.window.g, java.util.UUID):void");
    }

    @C8540g
    /* renamed from: c */
    public void mo10810c(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-797839545);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-797839545, i, -1, "androidx.compose.material3.internal.PopupLayout.Content (ExposedDropdownMenuPopup.kt:302)");
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
        if (keyEvent.getKeyCode() == 4) {
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
                C11289a<C11079d2> aVar = this.f20218x;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f20211K0.getValue()).booleanValue();
    }

    public final C11304p<C8592o, Integer, C11079d2> getContent() {
        return (C11304p) this.f20216P0.getValue();
    }

    @C12579k
    public final LayoutDirection getParentLayoutDirection() {
        return this.f20208H0;
    }

    @C12580l
    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final C16500q m172587getPopupContentSizebOM6tXw() {
        return (C16500q) this.f20210J0.getValue();
    }

    @C12579k
    public final C16546g getPositionProvider() {
        return this.f20207G0;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f20217Q0;
    }

    @C12579k
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @C12579k
    public final String getTestTag() {
        return this.f20219y;
    }

    /* renamed from: m */
    public final WindowManager.LayoutParams mo12682m() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.f20220z.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f20220z.getContext().getResources().getString(C8776o.C8779c.default_popup_window_title));
        return layoutParams;
    }

    /* renamed from: n */
    public final void mo12683n() {
        ViewTreeLifecycleOwner.m90621b(this, (C19499w) null);
        this.f20220z.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f20205E0.removeViewImmediate(this);
    }

    @C12580l
    /* renamed from: o */
    public final C16497o mo12684o() {
        return (C16497o) this.f20209I0.getValue();
    }

    public void onGlobalLayout() {
        this.f20220z.getWindowVisibleDisplayFrame(this.f20214N0);
        if (!Intrinsics.areEqual((Object) this.f20214N0, (Object) this.f20213M0)) {
            mo12699u();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r3.invoke(r1, r0).booleanValue() == false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@org.jetbrains.annotations.C12580l android.view.MotionEvent r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0007
            boolean r9 = super.onTouchEvent(r9)
            return r9
        L_0x0007:
            int r0 = r9.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0038
            float r0 = r9.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003f
            float r0 = r9.getX()
            int r2 = r8.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            float r0 = r9.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003f
            float r0 = r9.getY()
            int r2 = r8.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
        L_0x0038:
            int r0 = r9.getAction()
            r2 = 4
            if (r0 != r2) goto L_0x0099
        L_0x003f:
            androidx.compose.ui.unit.o r0 = r8.mo12684o()
            r2 = 1
            if (r0 == 0) goto L_0x008e
            kotlin.jvm.functions.p<androidx.compose.ui.geometry.f, androidx.compose.ui.unit.o, java.lang.Boolean> r3 = r8.f20215O0
            float r4 = r9.getX()
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L_0x0053
            r4 = r2
            goto L_0x0054
        L_0x0053:
            r4 = r5
        L_0x0054:
            if (r4 == 0) goto L_0x0066
            float r4 = r9.getY()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0060
            r1 = r2
            goto L_0x0061
        L_0x0060:
            r1 = r5
        L_0x0061:
            if (r1 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r1 = 0
            goto L_0x0082
        L_0x0066:
            android.view.WindowManager$LayoutParams r1 = r8.f20206F0
            int r1 = r1.x
            float r1 = (float) r1
            float r4 = r9.getX()
            float r1 = r1 + r4
            android.view.WindowManager$LayoutParams r4 = r8.f20206F0
            int r4 = r4.y
            float r4 = (float) r4
            float r6 = r9.getY()
            float r4 = r4 + r6
            long r6 = androidx.compose.p004ui.geometry.C15096g.m64898a(r1, r4)
            androidx.compose.ui.geometry.f r1 = androidx.compose.p004ui.geometry.C15094f.m64868d(r6)
        L_0x0082:
            java.lang.Object r0 = r3.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x008f
        L_0x008e:
            r5 = r2
        L_0x008f:
            if (r5 == 0) goto L_0x0099
            kotlin.jvm.functions.a<kotlin.d2> r9 = r8.f20218x
            if (r9 == 0) goto L_0x0098
            r9.invoke()
        L_0x0098:
            return r2
        L_0x0099:
            boolean r9 = super.onTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.PopupLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void mo12687p(@C12580l C16497o oVar) {
        this.f20209I0.setValue(oVar);
    }

    /* renamed from: q */
    public final void mo12688q() {
        this.f20205E0.addView(this, this.f20206F0);
    }

    /* renamed from: r */
    public final void mo12689r(LayoutDirection layoutDirection) {
        int i = C8225b.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    /* renamed from: s */
    public final C16497o mo12690s(Rect rect) {
        return new C16497o(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void setContent(C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        this.f20216P0.setValue(pVar);
    }

    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.f20208H0 = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m172588setPopupContentSizefhxjrPA(@C12580l C16500q qVar) {
        this.f20210J0.setValue(qVar);
    }

    public final void setPositionProvider(@C12579k C16546g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f20207G0 = gVar;
    }

    public final void setTestTag(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f20219y = str;
    }

    /* renamed from: t */
    public final void mo12698t(@C12580l C11289a<C11079d2> aVar, @C12579k String str, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(str, "testTag");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f20218x = aVar;
        this.f20219y = str;
        mo12689r(layoutDirection);
    }

    /* renamed from: u */
    public final void mo12699u() {
        C16500q r0;
        C16497o o = mo12684o();
        if (o != null && (r0 = m172587getPopupContentSizebOM6tXw()) != null) {
            long q = r0.mo47895q();
            Rect rect = this.f20213M0;
            this.f20220z.getWindowVisibleDisplayFrame(rect);
            C16497o s = mo12690s(rect);
            long a = this.f20207G0.mo9854a(o, C16502r.m74668a(s.mo47862G(), s.mo47885r()), this.f20208H0, q);
            this.f20206F0.x = C16494m.m74581m(a);
            this.f20206F0.y = C16494m.m74583o(a);
            this.f20205E0.updateViewLayout(this, this.f20206F0);
        }
    }

    public final void setContent(@C12579k C8602q qVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(qVar, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(pVar, "content");
        setParentCompositionContext(qVar);
        setContent(pVar);
        this.f20217Q0 = true;
    }
}
