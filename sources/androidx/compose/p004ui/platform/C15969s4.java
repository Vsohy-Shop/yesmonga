package androidx.compose.p004ui.platform;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0353k0;
import androidx.compose.p004ui.C8776o;
import androidx.compose.p004ui.node.C15715n1;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8598p;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.C8676t;
import androidx.constraintlayout.widget.C16934c;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nWrapper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wrapper.android.kt\nandroidx/compose/ui/platform/Wrapper_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
/* renamed from: androidx.compose.ui.platform.s4 */
public final class C15969s4 {
    @C12579k

    /* renamed from: a */
    public static final String f39665a = "Wrapper";
    @C12579k

    /* renamed from: b */
    public static final ViewGroup.LayoutParams f39666b = new ViewGroup.LayoutParams(-2, -2);

    @C0353k0
    @C12579k
    /* renamed from: a */
    public static final C8598p m71740a(@C12579k LayoutNode layoutNode, @C12579k C8602q qVar) {
        Intrinsics.checkNotNullParameter(layoutNode, "container");
        Intrinsics.checkNotNullParameter(qVar, C16934c.f44493V1);
        return C8676t.m31865a(new C15715n1(layoutNode), qVar);
    }

    @C8544h(scheme = "[0[0]]")
    /* renamed from: b */
    public static final C8598p m71741b(AndroidComposeView androidComposeView, C8602q qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        WrappedComposition wrappedComposition;
        if (m71743d(androidComposeView)) {
            androidComposeView.setTag(C8776o.C8778b.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            m71742c();
        }
        C8598p a = C8676t.m31865a(new C15715n1(androidComposeView.getRoot()), qVar);
        View view = androidComposeView.getView();
        int i = C8776o.C8778b.wrapped_composition_tag;
        Object tag = view.getTag(i);
        if (tag instanceof WrappedComposition) {
            wrappedComposition = (WrappedComposition) tag;
        } else {
            wrappedComposition = null;
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, a);
            androidComposeView.getView().setTag(i, wrappedComposition);
        }
        wrappedComposition.mo16286j(pVar);
        return wrappedComposition;
    }

    /* renamed from: c */
    public static final void m71742c() {
        if (!InspectableValueKt.m71063e()) {
            try {
                Field declaredField = Class.forName("androidx.compose.ui.platform.InspectableValueKt").getDeclaredField("isDebugInspectorInfoEnabled");
                declaredField.setAccessible(true);
                declaredField.setBoolean((Object) null, true);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static final boolean m71743d(AndroidComposeView androidComposeView) {
        if (Build.VERSION.SDK_INT < 29 || !(!C15961r4.f39661a.mo45949a(androidComposeView).isEmpty())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.C8544h(scheme = "[0[0]]")
    @org.jetbrains.annotations.C12579k
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.C8598p m71744e(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.platform.AbstractComposeView r3, @org.jetbrains.annotations.C12579k androidx.compose.runtime.C8602q r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.compose.ui.platform.GlobalSnapshotManager r0 = androidx.compose.p004ui.platform.GlobalSnapshotManager.f39359a
            r0.mo45547a()
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L_0x0028
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.p004ui.platform.AndroidComposeView
            if (r2 == 0) goto L_0x002b
            r1 = r0
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.p004ui.platform.AndroidComposeView) r1
            goto L_0x002b
        L_0x0028:
            r3.removeAllViews()
        L_0x002b:
            if (r1 != 0) goto L_0x0044
            androidx.compose.ui.platform.AndroidComposeView r1 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r0 = r3.getContext()
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r1.<init>(r0)
            android.view.View r0 = r1.getView()
            android.view.ViewGroup$LayoutParams r2 = f39666b
            r3.addView((android.view.View) r0, (android.view.ViewGroup.LayoutParams) r2)
        L_0x0044:
            androidx.compose.runtime.p r3 = m71741b(r1, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.C15969s4.m71744e(androidx.compose.ui.platform.AbstractComposeView, androidx.compose.runtime.q, kotlin.jvm.functions.p):androidx.compose.runtime.p");
    }
}
