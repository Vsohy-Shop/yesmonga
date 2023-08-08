package androidx.compose.p004ui.platform;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.compose.ui.platform.n */
public final /* synthetic */ class C15930n implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f39621a;

    public /* synthetic */ C15930n(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.f39621a = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onAccessibilityStateChanged(boolean z) {
        AndroidComposeViewAccessibilityDelegateCompat.m70789I(this.f39621a, z);
    }
}
