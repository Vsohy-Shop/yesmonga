package androidx.compose.p004ui.platform;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.compose.ui.platform.o */
public final /* synthetic */ class C15938o implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f39627a;

    public /* synthetic */ C15938o(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.f39627a = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        AndroidComposeViewAccessibilityDelegateCompat.m70795Q0(this.f39627a, z);
    }
}
