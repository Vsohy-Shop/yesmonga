package androidx.compose.p004ui.window;

import android.graphics.Outline;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.C0249p;
import androidx.compose.p004ui.platform.AbstractComposeView;
import androidx.compose.p004ui.platform.C15902i4;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8602q;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,456:1\n154#2:457\n1#3:458\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n*L\n300#1:457\n*E\n"})
/* renamed from: androidx.compose.ui.window.DialogWrapper */
public final class DialogWrapper extends C0249p implements C15902i4 {
    @C12579k

    /* renamed from: d */
    public C11289a<C11079d2> f40999d;
    @C12579k

    /* renamed from: e */
    public C16541b f41000e;
    @C12579k

    /* renamed from: f */
    public final View f41001f;
    @C12579k

    /* renamed from: g */
    public final DialogLayout f41002g;

    /* renamed from: v */
    public final float f41003v;

    /* renamed from: w */
    public final int f41004w;

    /* renamed from: androidx.compose.ui.window.DialogWrapper$a */
    public static final class C16536a extends ViewOutlineProvider {
        public void getOutline(@C12579k View view, @C12579k Outline outline) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(outline, "result");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* renamed from: androidx.compose.ui.window.DialogWrapper$b */
    public /* synthetic */ class C16537b {
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.DialogWrapper.C16537b.<clinit>():void");
        }
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DialogWrapper(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r7, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.window.C16541b r8, @org.jetbrains.annotations.C12579k android.view.View r9, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.LayoutDirection r10, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.C16479d r11, @org.jetbrains.annotations.C12579k java.util.UUID r12) {
        /*
            r6 = this;
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "layoutDirection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "dialogId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 >= r3) goto L_0x0034
            boolean r2 = r8.mo48074a()
            if (r2 == 0) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            int r2 = androidx.compose.p004ui.C8776o.C8780d.FloatingDialogWindowTheme
            goto L_0x0036
        L_0x0034:
            int r2 = androidx.compose.p004ui.C8776o.C8780d.DialogWindowTheme
        L_0x0036:
            r0.<init>(r1, r2)
            r1 = 2
            r2 = 0
            r3 = 0
            r6.<init>(r0, r2, r1, r3)
            r6.f40999d = r7
            r6.f41000e = r8
            r6.f41001f = r9
            r7 = 8
            float r7 = (float) r7
            float r7 = androidx.compose.p004ui.unit.C16483g.m74435M(r7)
            r6.f41003v = r7
            android.view.Window r8 = r6.getWindow()
            if (r8 == 0) goto L_0x00e9
            android.view.WindowManager$LayoutParams r0 = r8.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
            r6.f41004w = r0
            r0 = 1
            r8.requestFeature(r0)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r8.setBackgroundDrawableResource(r0)
            androidx.compose.ui.window.b r0 = r6.f41000e
            boolean r0 = r0.mo48074a()
            androidx.core.view.C18026a4.m81880c(r8, r0)
            androidx.compose.ui.window.DialogLayout r0 = new androidx.compose.ui.window.DialogLayout
            android.content.Context r1 = r6.getContext()
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r0.<init>(r1, r8)
            int r1 = androidx.compose.p004ui.C8776o.C8778b.compose_view_saveable_id_tag
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Dialog:"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r0.setTag(r1, r12)
            r0.setClipChildren(r2)
            float r7 = r11.mo7425g5(r7)
            r0.setElevation(r7)
            androidx.compose.ui.window.DialogWrapper$a r7 = new androidx.compose.ui.window.DialogWrapper$a
            r7.<init>()
            r0.setOutlineProvider(r7)
            r6.f41002g = r0
            android.view.View r7 = r8.getDecorView()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x00b4
            r3 = r7
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x00b4:
            if (r3 == 0) goto L_0x00b9
            m74901h(r3)
        L_0x00b9:
            r6.setContentView((android.view.View) r0)
            androidx.lifecycle.w r7 = androidx.lifecycle.ViewTreeLifecycleOwner.m90620a(r9)
            androidx.lifecycle.ViewTreeLifecycleOwner.m90621b(r0, r7)
            androidx.lifecycle.b1 r7 = androidx.lifecycle.ViewTreeViewModelStoreOwner.m90624a(r9)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.m90625b(r0, r7)
            androidx.savedstate.e r7 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.m95251a(r9)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.m95252b(r0, r7)
            kotlin.jvm.functions.a<kotlin.d2> r7 = r6.f40999d
            androidx.compose.ui.window.b r8 = r6.f41000e
            r6.mo48042o(r7, r8, r10)
            androidx.activity.OnBackPressedDispatcher r0 = r6.mo702Z()
            r2 = 0
            androidx.compose.ui.window.DialogWrapper$2 r3 = new androidx.compose.ui.window.DialogWrapper$2
            r3.<init>(r6)
            r4 = 2
            r5 = 0
            r1 = r6
            androidx.activity.C0315z.m1562b(r0, r1, r2, r3, r4, r5)
            return
        L_0x00e9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Dialog has no window"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.DialogWrapper.<init>(kotlin.jvm.functions.a, androidx.compose.ui.window.b, android.view.View, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.d, java.util.UUID):void");
    }

    /* renamed from: h */
    public static final void m74901h(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof DialogLayout)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    m74901h(viewGroup2);
                }
            }
        }
    }

    public void cancel() {
    }

    @C12579k
    public AbstractComposeView getSubCompositionView() {
        return this.f41002g;
    }

    /* renamed from: k */
    public final void mo48038k() {
        this.f41002g.mo45282g();
    }

    /* renamed from: l */
    public final void mo48039l(@C12579k C8602q qVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(qVar, "parentComposition");
        Intrinsics.checkNotNullParameter(pVar, "children");
        this.f41002g.setContent(qVar, pVar);
    }

    /* renamed from: m */
    public final void mo48040m(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.f41002g;
        int i = C16537b.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i2);
    }

    /* renamed from: n */
    public final void mo48041n(SecureFlagPolicy secureFlagPolicy) {
        int i;
        boolean a = C16548i.m74948a(secureFlagPolicy, AndroidPopup_androidKt.m74876i(this.f41001f));
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        if (a) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
    }

    /* renamed from: o */
    public final void mo48042o(@C12579k C11289a<C11079d2> aVar, @C12579k C16541b bVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(aVar, "onDismissRequest");
        Intrinsics.checkNotNullParameter(bVar, "properties");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f40999d = aVar;
        this.f41000e = bVar;
        mo48041n(bVar.mo48077d());
        mo48040m(layoutDirection);
        this.f41002g.mo48033n(bVar.mo48078e());
        if (Build.VERSION.SDK_INT >= 31) {
            return;
        }
        if (bVar.mo48074a()) {
            Window window = getWindow();
            if (window != null) {
                window.setSoftInputMode(this.f41004w);
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
    }

    public boolean onTouchEvent(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f41000e.mo48076c()) {
            this.f40999d.invoke();
        }
        return onTouchEvent;
    }
}
