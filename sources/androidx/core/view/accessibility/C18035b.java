package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.view.accessibility.b */
public final class C18035b {

    /* renamed from: A */
    public static final int f46549A = 128;

    /* renamed from: B */
    public static final int f46550B = 256;

    /* renamed from: C */
    public static final int f46551C = 512;

    /* renamed from: D */
    public static final int f46552D = -1;
    @Deprecated

    /* renamed from: a */
    public static final int f46553a = 128;
    @Deprecated

    /* renamed from: b */
    public static final int f46554b = 256;
    @Deprecated

    /* renamed from: c */
    public static final int f46555c = 512;
    @Deprecated

    /* renamed from: d */
    public static final int f46556d = 1024;
    @Deprecated

    /* renamed from: e */
    public static final int f46557e = 2048;
    @Deprecated

    /* renamed from: f */
    public static final int f46558f = 4096;
    @Deprecated

    /* renamed from: g */
    public static final int f46559g = 8192;

    /* renamed from: h */
    public static final int f46560h = 16384;

    /* renamed from: i */
    public static final int f46561i = 32768;

    /* renamed from: j */
    public static final int f46562j = 65536;

    /* renamed from: k */
    public static final int f46563k = 131072;

    /* renamed from: l */
    public static final int f46564l = 262144;

    /* renamed from: m */
    public static final int f46565m = 524288;

    /* renamed from: n */
    public static final int f46566n = 1048576;

    /* renamed from: o */
    public static final int f46567o = 2097152;

    /* renamed from: p */
    public static final int f46568p = 4194304;

    /* renamed from: q */
    public static final int f46569q = 8388608;

    /* renamed from: r */
    public static final int f46570r = 16777216;

    /* renamed from: s */
    public static final int f46571s = 0;

    /* renamed from: t */
    public static final int f46572t = 1;

    /* renamed from: u */
    public static final int f46573u = 2;

    /* renamed from: v */
    public static final int f46574v = 4;

    /* renamed from: w */
    public static final int f46575w = 8;

    /* renamed from: x */
    public static final int f46576x = 16;

    /* renamed from: y */
    public static final int f46577y = 32;

    /* renamed from: z */
    public static final int f46578z = 64;

    @C0376v0(16)
    /* renamed from: androidx.core.view.accessibility.b$a */
    public static class C18036a {
        @C0373u
        /* renamed from: a */
        public static int m81898a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @C0373u
        /* renamed from: b */
        public static int m81899b(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @C0373u
        /* renamed from: c */
        public static void m81900c(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setAction(i);
        }

        @C0373u
        /* renamed from: d */
        public static void m81901d(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setMovementGranularity(i);
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.core.view.accessibility.b$b */
    public static class C18037b {
        @C0373u
        /* renamed from: a */
        public static int m81902a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @C0373u
        /* renamed from: b */
        public static void m81903b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.view.accessibility.b$c */
    public @interface C18038c {
    }

    @Deprecated
    /* renamed from: a */
    public static void m81888a(AccessibilityEvent accessibilityEvent, C18094v0 v0Var) {
        accessibilityEvent.appendRecord((AccessibilityRecord) v0Var.mo52738g());
    }

    @Deprecated
    /* renamed from: b */
    public static C18094v0 m81889b(AccessibilityEvent accessibilityEvent) {
        return new C18094v0(accessibilityEvent);
    }

    /* renamed from: c */
    public static int m81890c(@C0359n0 AccessibilityEvent accessibilityEvent) {
        return C18036a.m81898a(accessibilityEvent);
    }

    /* renamed from: d */
    public static int m81891d(@C0359n0 AccessibilityEvent accessibilityEvent) {
        return C18037b.m81902a(accessibilityEvent);
    }

    /* renamed from: e */
    public static int m81892e(@C0359n0 AccessibilityEvent accessibilityEvent) {
        return C18036a.m81899b(accessibilityEvent);
    }

    @Deprecated
    /* renamed from: f */
    public static C18094v0 m81893f(AccessibilityEvent accessibilityEvent, int i) {
        return new C18094v0(accessibilityEvent.getRecord(i));
    }

    @Deprecated
    /* renamed from: g */
    public static int m81894g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    /* renamed from: h */
    public static void m81895h(@C0359n0 AccessibilityEvent accessibilityEvent, int i) {
        C18036a.m81900c(accessibilityEvent, i);
    }

    /* renamed from: i */
    public static void m81896i(@C0359n0 AccessibilityEvent accessibilityEvent, int i) {
        C18037b.m81903b(accessibilityEvent, i);
    }

    /* renamed from: j */
    public static void m81897j(@C0359n0 AccessibilityEvent accessibilityEvent, int i) {
        C18036a.m81901d(accessibilityEvent, i);
    }
}
