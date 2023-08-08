package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.util.List;

/* renamed from: androidx.core.view.accessibility.c */
public final class C18040c {

    @Deprecated
    /* renamed from: androidx.core.view.accessibility.c$a */
    public interface C18041a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.core.view.accessibility.c$b */
    public static abstract class C18042b implements C18041a {
    }

    /* renamed from: androidx.core.view.accessibility.c$c */
    public static class C18043c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: a */
        public C18041a f46579a;

        public C18043c(@C0359n0 C18041a aVar) {
            this.f46579a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18043c)) {
                return false;
            }
            return this.f46579a.equals(((C18043c) obj).f46579a);
        }

        public int hashCode() {
            return this.f46579a.hashCode();
        }

        public void onAccessibilityStateChanged(boolean z) {
            this.f46579a.onAccessibilityStateChanged(z);
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.core.view.accessibility.c$d */
    public static class C18044d {
        @C0373u
        /* renamed from: a */
        public static boolean m81912a(AccessibilityManager accessibilityManager, C18045e eVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new C18046f(eVar));
        }

        @C0373u
        /* renamed from: b */
        public static boolean m81913b(AccessibilityManager accessibilityManager, C18045e eVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new C18046f(eVar));
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$e */
    public interface C18045e {
        void onTouchExplorationStateChanged(boolean z);
    }

    @C0376v0(19)
    /* renamed from: androidx.core.view.accessibility.c$f */
    public static final class C18046f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        public final C18045e f46580a;

        public C18046f(@C0359n0 C18045e eVar) {
            this.f46580a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18046f)) {
                return false;
            }
            return this.f46580a.equals(((C18046f) obj).f46580a);
        }

        public int hashCode() {
            return this.f46580a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.f46580a.onTouchExplorationStateChanged(z);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m81905a(AccessibilityManager accessibilityManager, C18041a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new C18043c(aVar));
    }

    /* renamed from: b */
    public static boolean m81906b(@C0359n0 AccessibilityManager accessibilityManager, @C0359n0 C18045e eVar) {
        return C18044d.m81912a(accessibilityManager, eVar);
    }

    @Deprecated
    /* renamed from: c */
    public static List<AccessibilityServiceInfo> m81907c(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    @Deprecated
    /* renamed from: d */
    public static List<AccessibilityServiceInfo> m81908d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    /* renamed from: e */
    public static boolean m81909e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    /* renamed from: f */
    public static boolean m81910f(AccessibilityManager accessibilityManager, C18041a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new C18043c(aVar));
    }

    /* renamed from: g */
    public static boolean m81911g(@C0359n0 AccessibilityManager accessibilityManager, @C0359n0 C18045e eVar) {
        return C18044d.m81913b(accessibilityManager, eVar);
    }
}
