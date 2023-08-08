package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/Listener\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,107:1\n76#2:108\n102#2,2:109\n76#2:111\n102#2,2:112\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/Listener\n*L\n81#1:108\n81#1:109,2\n82#1:111\n82#1:112,2\n*E\n"})
/* renamed from: androidx.compose.material3.g1 */
public final class C8204g1 implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    @C12579k

    /* renamed from: a */
    public final C8700z0 f20140a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f20141b;

    public C8204g1() {
        Boolean bool = Boolean.FALSE;
        this.f20140a = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f20141b = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
    }

    /* renamed from: a */
    public final boolean mo12603a() {
        return ((Boolean) this.f20140a.getValue()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo12604b() {
        return ((Boolean) this.f20141b.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo12605c() {
        return mo12603a() && mo12604b();
    }

    /* renamed from: d */
    public final void mo12606d(@C12579k AccessibilityManager accessibilityManager) {
        Intrinsics.checkNotNullParameter(accessibilityManager, "am");
        mo12607e(accessibilityManager.isEnabled());
        mo12608f(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(this);
        accessibilityManager.addAccessibilityStateChangeListener(this);
    }

    /* renamed from: e */
    public final void mo12607e(boolean z) {
        this.f20140a.setValue(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final void mo12608f(boolean z) {
        this.f20141b.setValue(Boolean.valueOf(z));
    }

    /* renamed from: g */
    public final void mo12609g(@C12579k AccessibilityManager accessibilityManager) {
        Intrinsics.checkNotNullParameter(accessibilityManager, "am");
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
        accessibilityManager.removeAccessibilityStateChangeListener(this);
    }

    public void onAccessibilityStateChanged(boolean z) {
        mo12607e(z);
    }

    public void onTouchExplorationStateChanged(boolean z) {
        mo12608f(z);
    }
}
