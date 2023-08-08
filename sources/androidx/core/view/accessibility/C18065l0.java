package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.C16986a;
import androidx.core.p027os.C17772a;
import androidx.core.view.accessibility.C18098w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.view.accessibility.l0 */
public class C18065l0 {

    /* renamed from: A */
    public static final int f46581A = 128;

    /* renamed from: B */
    public static final int f46582B = 256;

    /* renamed from: C */
    public static final int f46583C = 512;

    /* renamed from: D */
    public static final int f46584D = 1024;

    /* renamed from: E */
    public static final int f46585E = 2048;

    /* renamed from: F */
    public static final int f46586F = 4096;

    /* renamed from: G */
    public static final int f46587G = 8192;

    /* renamed from: H */
    public static final int f46588H = 16384;

    /* renamed from: I */
    public static final int f46589I = 32768;

    /* renamed from: J */
    public static final int f46590J = 65536;

    /* renamed from: K */
    public static final int f46591K = 131072;

    /* renamed from: L */
    public static final int f46592L = 262144;

    /* renamed from: M */
    public static final int f46593M = 524288;

    /* renamed from: N */
    public static final int f46594N = 1048576;

    /* renamed from: O */
    public static final int f46595O = 2097152;

    /* renamed from: P */
    public static final String f46596P = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";

    /* renamed from: Q */
    public static final String f46597Q = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";

    /* renamed from: R */
    public static final String f46598R = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";

    /* renamed from: S */
    public static final String f46599S = "ACTION_ARGUMENT_SELECTION_START_INT";

    /* renamed from: T */
    public static final String f46600T = "ACTION_ARGUMENT_SELECTION_END_INT";

    /* renamed from: U */
    public static final String f46601U = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";

    /* renamed from: V */
    public static final String f46602V = "android.view.accessibility.action.ARGUMENT_ROW_INT";

    /* renamed from: W */
    public static final String f46603W = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";

    /* renamed from: X */
    public static final String f46604X = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* renamed from: Y */
    public static final String f46605Y = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* renamed from: Z */
    public static final String f46606Z = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    @SuppressLint({"ActionValue"})

    /* renamed from: a0 */
    public static final String f46607a0 = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* renamed from: b0 */
    public static final int f46608b0 = 1;

    /* renamed from: c0 */
    public static final int f46609c0 = 2;

    /* renamed from: d */
    public static final String f46610d = "AccessibilityNodeInfo.roleDescription";

    /* renamed from: d0 */
    public static final int f46611d0 = 1;

    /* renamed from: e */
    public static final String f46612e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* renamed from: e0 */
    public static final int f46613e0 = 2;

    /* renamed from: f */
    public static final String f46614f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* renamed from: f0 */
    public static final int f46615f0 = 4;

    /* renamed from: g */
    public static final String f46616g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* renamed from: g0 */
    public static final int f46617g0 = 8;

    /* renamed from: h */
    public static final String f46618h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* renamed from: h0 */
    public static final int f46619h0 = 16;

    /* renamed from: i */
    public static final String f46620i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* renamed from: i0 */
    public static final String f46621i0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";

    /* renamed from: j */
    public static final String f46622j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* renamed from: j0 */
    public static final String f46623j0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";

    /* renamed from: k */
    public static final String f46624k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* renamed from: k0 */
    public static final String f46625k0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";

    /* renamed from: l */
    public static final String f46626l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* renamed from: l0 */
    public static final int f46627l0 = 20000;

    /* renamed from: m */
    public static final String f46628m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* renamed from: m0 */
    public static int f46629m0 = 0;

    /* renamed from: n */
    public static final String f46630n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* renamed from: o */
    public static final String f46631o = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";

    /* renamed from: p */
    public static final int f46632p = 1;

    /* renamed from: q */
    public static final int f46633q = 2;

    /* renamed from: r */
    public static final int f46634r = 4;

    /* renamed from: s */
    public static final int f46635s = 8;

    /* renamed from: t */
    public static final int f46636t = 1;

    /* renamed from: u */
    public static final int f46637u = 2;

    /* renamed from: v */
    public static final int f46638v = 4;

    /* renamed from: w */
    public static final int f46639w = 8;

    /* renamed from: x */
    public static final int f46640x = 16;

    /* renamed from: y */
    public static final int f46641y = 32;

    /* renamed from: z */
    public static final int f46642z = 64;

    /* renamed from: a */
    public final AccessibilityNodeInfo f46643a;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

    /* renamed from: b */
    public int f46644b = -1;

    /* renamed from: c */
    public int f46645c = -1;

    /* renamed from: androidx.core.view.accessibility.l0$a */
    public static class C18066a {

        /* renamed from: A */
        public static final C18066a f46646A = new C18066a(2097152, (CharSequence) null, (Class<? extends C18098w0.C18099a>) C18098w0.C18106h.class);

        /* renamed from: B */
        public static final C18066a f46647B = new C18066a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);

        /* renamed from: C */
        public static final C18066a f46648C = new C18066a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (C18098w0) null, C18098w0.C18103e.class);

        /* renamed from: D */
        public static final C18066a f46649D = new C18066a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);

        /* renamed from: E */
        public static final C18066a f46650E = new C18066a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);

        /* renamed from: F */
        public static final C18066a f46651F = new C18066a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);

        /* renamed from: G */
        public static final C18066a f46652G = new C18066a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
        @C0359n0

        /* renamed from: H */
        public static final C18066a f46653H;
        @C0359n0

        /* renamed from: I */
        public static final C18066a f46654I;
        @C0359n0

        /* renamed from: J */
        public static final C18066a f46655J;
        @C0359n0

        /* renamed from: K */
        public static final C18066a f46656K;

        /* renamed from: L */
        public static final C18066a f46657L = new C18066a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);

        /* renamed from: M */
        public static final C18066a f46658M = new C18066a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence) null, (C18098w0) null, C18098w0.C18104f.class);

        /* renamed from: N */
        public static final C18066a f46659N;

        /* renamed from: O */
        public static final C18066a f46660O;

        /* renamed from: P */
        public static final C18066a f46661P;
        @C0359n0

        /* renamed from: Q */
        public static final C18066a f46662Q;
        @C0359n0

        /* renamed from: R */
        public static final C18066a f46663R;
        @C0359n0

        /* renamed from: S */
        public static final C18066a f46664S;
        @C0359n0

        /* renamed from: T */
        public static final C18066a f46665T;
        @C0359n0

        /* renamed from: U */
        public static final C18066a f46666U;
        @C0359n0

        /* renamed from: V */
        public static final C18066a f46667V;

        /* renamed from: e */
        public static final String f46668e = "A11yActionCompat";

        /* renamed from: f */
        public static final C18066a f46669f = new C18066a(1, (CharSequence) null);

        /* renamed from: g */
        public static final C18066a f46670g = new C18066a(2, (CharSequence) null);

        /* renamed from: h */
        public static final C18066a f46671h = new C18066a(4, (CharSequence) null);

        /* renamed from: i */
        public static final C18066a f46672i = new C18066a(8, (CharSequence) null);

        /* renamed from: j */
        public static final C18066a f46673j = new C18066a(16, (CharSequence) null);

        /* renamed from: k */
        public static final C18066a f46674k = new C18066a(32, (CharSequence) null);

        /* renamed from: l */
        public static final C18066a f46675l = new C18066a(64, (CharSequence) null);

        /* renamed from: m */
        public static final C18066a f46676m = new C18066a(128, (CharSequence) null);

        /* renamed from: n */
        public static final C18066a f46677n;

        /* renamed from: o */
        public static final C18066a f46678o;

        /* renamed from: p */
        public static final C18066a f46679p;

        /* renamed from: q */
        public static final C18066a f46680q;

        /* renamed from: r */
        public static final C18066a f46681r = new C18066a(4096, (CharSequence) null);

        /* renamed from: s */
        public static final C18066a f46682s = new C18066a(8192, (CharSequence) null);

        /* renamed from: t */
        public static final C18066a f46683t = new C18066a(16384, (CharSequence) null);

        /* renamed from: u */
        public static final C18066a f46684u = new C18066a(32768, (CharSequence) null);

        /* renamed from: v */
        public static final C18066a f46685v = new C18066a(65536, (CharSequence) null);

        /* renamed from: w */
        public static final C18066a f46686w = new C18066a(131072, (CharSequence) null, (Class<? extends C18098w0.C18099a>) C18098w0.C18105g.class);

        /* renamed from: x */
        public static final C18066a f46687x = new C18066a(262144, (CharSequence) null);

        /* renamed from: y */
        public static final C18066a f46688y = new C18066a(524288, (CharSequence) null);

        /* renamed from: z */
        public static final C18066a f46689z = new C18066a(1048576, (CharSequence) null);

        /* renamed from: a */
        public final Object f46690a;

        /* renamed from: b */
        public final int f46691b;

        /* renamed from: c */
        public final Class<? extends C18098w0.C18099a> f46692c;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})

        /* renamed from: d */
        public final C18098w0 f46693d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13 = null;
            Class<C18098w0.C18100b> cls = C18098w0.C18100b.class;
            f46677n = new C18066a(256, (CharSequence) null, (Class<? extends C18098w0.C18099a>) cls);
            f46678o = new C18066a(512, (CharSequence) null, (Class<? extends C18098w0.C18099a>) cls);
            Class<C18098w0.C18101c> cls2 = C18098w0.C18101c.class;
            f46679p = new C18066a(1024, (CharSequence) null, (Class<? extends C18098w0.C18099a>) cls2);
            f46680q = new C18066a(2048, (CharSequence) null, (Class<? extends C18098w0.C18099a>) cls2);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction = null;
            }
            f46653H = new C18066a(accessibilityAction, 16908358, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
            if (i >= 29) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                accessibilityAction2 = null;
            }
            f46654I = new C18066a(accessibilityAction2, 16908359, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
            if (i >= 29) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction3 = null;
            }
            f46655J = new C18066a(accessibilityAction3, 16908360, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
            if (i >= 29) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            } else {
                accessibilityAction4 = null;
            }
            f46656K = new C18066a(accessibilityAction4, 16908361, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
            if (i >= 26) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityAction5 = null;
            }
            f46659N = new C18066a(accessibilityAction5, 16908354, (CharSequence) null, (C18098w0) null, C18098w0.C18102d.class);
            if (i >= 28) {
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                accessibilityAction6 = null;
            }
            f46660O = new C18066a(accessibilityAction6, 16908356, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
            if (i >= 28) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            } else {
                accessibilityAction7 = null;
            }
            f46661P = new C18066a(accessibilityAction7, 16908357, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
            if (i >= 30) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityAction8 = null;
            }
            f46662Q = new C18066a(accessibilityAction8, 16908362, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
            if (i >= 30) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            } else {
                accessibilityAction9 = null;
            }
            f46663R = new C18066a(accessibilityAction9, 16908372, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
            if (i >= 32) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            } else {
                accessibilityAction10 = null;
            }
            f46664S = new C18066a(accessibilityAction10, 16908373, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
            if (i >= 32) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            } else {
                accessibilityAction11 = null;
            }
            f46665T = new C18066a(accessibilityAction11, 16908374, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
            if (i >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            } else {
                accessibilityAction12 = null;
            }
            f46666U = new C18066a(accessibilityAction12, 16908375, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
            if (i >= 33) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            f46667V = new C18066a(accessibilityAction13, 16908376, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
        }

        public C18066a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public C18066a mo52675a(CharSequence charSequence, C18098w0 w0Var) {
            return new C18066a((Object) null, this.f46691b, charSequence, w0Var, this.f46692c);
        }

        /* renamed from: b */
        public int mo52676b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f46690a).getId();
        }

        /* renamed from: c */
        public CharSequence mo52677c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f46690a).getLabel();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo52678d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.view.accessibility.w0 r0 = r4.f46693d
                r1 = 0
                if (r0 == 0) goto L_0x003d
                java.lang.Class<? extends androidx.core.view.accessibility.w0$a> r0 = r4.f46692c
                r2 = 0
                if (r0 == 0) goto L_0x0036
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x001e }
                java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x001e }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x001e }
                java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ Exception -> 0x001e }
                androidx.core.view.accessibility.w0$a r0 = (androidx.core.view.accessibility.C18098w0.C18099a) r0     // Catch:{ Exception -> 0x001e }
                r0.mo52756a(r6)     // Catch:{ Exception -> 0x001d }
                r2 = r0
                goto L_0x0036
            L_0x001d:
                r2 = r0
            L_0x001e:
                java.lang.Class<? extends androidx.core.view.accessibility.w0$a> r6 = r4.f46692c
                if (r6 != 0) goto L_0x0025
                java.lang.String r6 = "null"
                goto L_0x0029
            L_0x0025:
                java.lang.String r6 = r6.getName()
            L_0x0029:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to execute command with argument class ViewCommandArgument: "
                r0.append(r1)
                r0.append(r6)
            L_0x0036:
                androidx.core.view.accessibility.w0 r6 = r4.f46693d
                boolean r5 = r6.mo19056a(r5, r2)
                return r5
            L_0x003d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.C18065l0.C18066a.mo52678d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(@C0363p0 Object obj) {
            if (obj == null || !(obj instanceof C18066a)) {
                return false;
            }
            C18066a aVar = (C18066a) obj;
            Object obj2 = this.f46690a;
            if (obj2 == null) {
                if (aVar.f46690a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f46690a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f46690a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public C18066a(int i, CharSequence charSequence, C18098w0 w0Var) {
            this((Object) null, i, charSequence, w0Var, (Class<? extends C18098w0.C18099a>) null);
        }

        public C18066a(Object obj) {
            this(obj, 0, (CharSequence) null, (C18098w0) null, (Class<? extends C18098w0.C18099a>) null);
        }

        public C18066a(int i, CharSequence charSequence, Class<? extends C18098w0.C18099a> cls) {
            this((Object) null, i, charSequence, (C18098w0) null, cls);
        }

        public C18066a(Object obj, int i, CharSequence charSequence, C18098w0 w0Var, Class<? extends C18098w0.C18099a> cls) {
            this.f46691b = i;
            this.f46693d = w0Var;
            if (obj == null) {
                this.f46690a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f46690a = obj;
            }
            this.f46692c = cls;
        }
    }

    @C0376v0(33)
    /* renamed from: androidx.core.view.accessibility.l0$b */
    public static class C18067b {
        @C0373u
        /* renamed from: a */
        public static AccessibilityNodeInfo.ExtraRenderingInfo m82096a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        @C0373u
        /* renamed from: b */
        public static boolean m82097b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        @C0373u
        /* renamed from: c */
        public static void m82098c(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }
    }

    /* renamed from: androidx.core.view.accessibility.l0$c */
    public static class C18068c {

        /* renamed from: b */
        public static final int f46694b = 0;

        /* renamed from: c */
        public static final int f46695c = 1;

        /* renamed from: d */
        public static final int f46696d = 2;

        /* renamed from: a */
        public final Object f46697a;

        public C18068c(Object obj) {
            this.f46697a = obj;
        }

        /* renamed from: e */
        public static C18068c m82099e(int i, int i2, boolean z) {
            return new C18068c(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        /* renamed from: f */
        public static C18068c m82100f(int i, int i2, boolean z, int i3) {
            return new C18068c(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        /* renamed from: a */
        public int mo52681a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f46697a).getColumnCount();
        }

        /* renamed from: b */
        public int mo52682b() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f46697a).getRowCount();
        }

        /* renamed from: c */
        public int mo52683c() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f46697a).getSelectionMode();
        }

        /* renamed from: d */
        public boolean mo52684d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f46697a).isHierarchical();
        }
    }

    /* renamed from: androidx.core.view.accessibility.l0$d */
    public static class C18069d {

        /* renamed from: a */
        public final Object f46698a;

        public C18069d(Object obj) {
            this.f46698a = obj;
        }

        /* renamed from: g */
        public static C18069d m82105g(int i, int i2, int i3, int i4, boolean z) {
            return new C18069d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        /* renamed from: h */
        public static C18069d m82106h(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C18069d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        /* renamed from: a */
        public int mo52685a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f46698a).getColumnIndex();
        }

        /* renamed from: b */
        public int mo52686b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f46698a).getColumnSpan();
        }

        /* renamed from: c */
        public int mo52687c() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f46698a).getRowIndex();
        }

        /* renamed from: d */
        public int mo52688d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f46698a).getRowSpan();
        }

        @Deprecated
        /* renamed from: e */
        public boolean mo52689e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f46698a).isHeading();
        }

        /* renamed from: f */
        public boolean mo52690f() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f46698a).isSelected();
        }
    }

    /* renamed from: androidx.core.view.accessibility.l0$e */
    public static class C18070e {

        /* renamed from: b */
        public static final int f46699b = 0;

        /* renamed from: c */
        public static final int f46700c = 1;

        /* renamed from: d */
        public static final int f46701d = 2;

        /* renamed from: a */
        public final Object f46702a;

        public C18070e(Object obj) {
            this.f46702a = obj;
        }

        /* renamed from: e */
        public static C18070e m82113e(int i, float f, float f2, float f3) {
            return new C18070e(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        /* renamed from: a */
        public float mo52691a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f46702a).getCurrent();
        }

        /* renamed from: b */
        public float mo52692b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f46702a).getMax();
        }

        /* renamed from: c */
        public float mo52693c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f46702a).getMin();
        }

        /* renamed from: d */
        public int mo52694d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f46702a).getType();
        }
    }

    @Deprecated
    public C18065l0(Object obj) {
        this.f46643a = (AccessibilityNodeInfo) obj;
    }

    /* renamed from: F0 */
    public static C18065l0 m81932F0() {
        return m81936c2(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: G0 */
    public static C18065l0 m81933G0(View view) {
        return m81936c2(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: H0 */
    public static C18065l0 m81934H0(View view, int i) {
        return m81937d2(AccessibilityNodeInfo.obtain(view, i));
    }

    /* renamed from: I0 */
    public static C18065l0 m81935I0(C18065l0 l0Var) {
        return m81936c2(AccessibilityNodeInfo.obtain(l0Var.f46643a));
    }

    /* renamed from: c2 */
    public static C18065l0 m81936c2(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C18065l0(accessibilityNodeInfo);
    }

    /* renamed from: d2 */
    public static C18065l0 m81937d2(Object obj) {
        if (obj != null) {
            return new C18065l0(obj);
        }
        return null;
    }

    /* renamed from: o */
    public static String m81938o(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: x */
    public static ClickableSpan[] m81939x(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: A */
    public CharSequence mo52520A() {
        return this.f46643a.getContentDescription();
    }

    /* renamed from: A0 */
    public boolean mo52521A0() {
        return this.f46643a.isSelected();
    }

    /* renamed from: A1 */
    public void mo52522A1(CharSequence charSequence) {
        this.f46643a.setPackageName(charSequence);
    }

    /* renamed from: B */
    public int mo52523B() {
        return this.f46643a.getDrawingOrder();
    }

    /* renamed from: B0 */
    public boolean mo52524B0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f46643a.isShowingHintText();
        }
        return mo52648r(4);
    }

    /* renamed from: B1 */
    public void mo52525B1(@C0363p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f46643a.setPaneTitle(charSequence);
        } else {
            this.f46643a.getExtras().putCharSequence(f46612e, charSequence);
        }
    }

    /* renamed from: C */
    public CharSequence mo52526C() {
        return this.f46643a.getError();
    }

    /* renamed from: C0 */
    public boolean mo52527C0() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f46643a.isTextEntryKey();
        }
        return mo52648r(8);
    }

    /* renamed from: C1 */
    public void mo52528C1(View view) {
        this.f46644b = -1;
        this.f46643a.setParent(view);
    }

    @C0363p0
    /* renamed from: D */
    public AccessibilityNodeInfo.ExtraRenderingInfo mo52529D() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C18067b.m82096a(this.f46643a);
        }
        return null;
    }

    /* renamed from: D0 */
    public boolean mo52530D0() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C18067b.m82097b(this.f46643a);
        }
        return false;
    }

    /* renamed from: D1 */
    public void mo52531D1(View view, int i) {
        this.f46644b = i;
        this.f46643a.setParent(view, i);
    }

    /* renamed from: E */
    public Bundle mo52532E() {
        return this.f46643a.getExtras();
    }

    /* renamed from: E0 */
    public boolean mo52533E0() {
        return this.f46643a.isVisibleToUser();
    }

    /* renamed from: E1 */
    public void mo52534E1(boolean z) {
        this.f46643a.setPassword(z);
    }

    @C0363p0
    /* renamed from: F */
    public CharSequence mo52535F() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f46643a.getHintText();
        }
        return this.f46643a.getExtras().getCharSequence(f46616g);
    }

    /* renamed from: F1 */
    public void mo52536F1(C18070e eVar) {
        this.f46643a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) eVar.f46702a);
    }

    @Deprecated
    /* renamed from: G */
    public Object mo52537G() {
        return this.f46643a;
    }

    /* renamed from: G1 */
    public void mo52538G1(@C0363p0 CharSequence charSequence) {
        this.f46643a.getExtras().putCharSequence(f46610d, charSequence);
    }

    /* renamed from: H */
    public int mo52539H() {
        return this.f46643a.getInputType();
    }

    /* renamed from: H1 */
    public void mo52540H1(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f46643a.setScreenReaderFocusable(z);
        } else {
            mo52574T0(1, z);
        }
    }

    /* renamed from: I */
    public C18065l0 mo52541I() {
        return m81937d2(this.f46643a.getLabelFor());
    }

    /* renamed from: I1 */
    public void mo52542I1(boolean z) {
        this.f46643a.setScrollable(z);
    }

    /* renamed from: J */
    public C18065l0 mo52543J() {
        return m81937d2(this.f46643a.getLabeledBy());
    }

    /* renamed from: J0 */
    public boolean mo52544J0(int i) {
        return this.f46643a.performAction(i);
    }

    /* renamed from: J1 */
    public void mo52545J1(boolean z) {
        this.f46643a.setSelected(z);
    }

    /* renamed from: K */
    public int mo52546K() {
        return this.f46643a.getLiveRegion();
    }

    /* renamed from: K0 */
    public boolean mo52547K0(int i, Bundle bundle) {
        return this.f46643a.performAction(i, bundle);
    }

    /* renamed from: K1 */
    public void mo52548K1(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f46643a.setShowingHintText(z);
        } else {
            mo52574T0(4, z);
        }
    }

    /* renamed from: L */
    public int mo52549L() {
        return this.f46643a.getMaxTextLength();
    }

    /* renamed from: L0 */
    public void mo52550L0() {
        this.f46643a.recycle();
    }

    /* renamed from: L1 */
    public void mo52551L1(View view) {
        this.f46645c = -1;
        this.f46643a.setSource(view);
    }

    /* renamed from: M */
    public int mo52552M() {
        return this.f46643a.getMovementGranularities();
    }

    /* renamed from: M0 */
    public boolean mo52553M0() {
        return this.f46643a.refresh();
    }

    /* renamed from: M1 */
    public void mo52554M1(View view, int i) {
        this.f46645c = i;
        this.f46643a.setSource(view, i);
    }

    /* renamed from: N */
    public final SparseArray<WeakReference<ClickableSpan>> mo52555N(View view) {
        SparseArray<WeakReference<ClickableSpan>> T = mo52573T(view);
        if (T != null) {
            return T;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C16986a.C16991e.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: N0 */
    public boolean mo52556N0(C18066a aVar) {
        return this.f46643a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f46690a);
    }

    /* renamed from: N1 */
    public void mo52557N1(@C0363p0 CharSequence charSequence) {
        if (C17772a.m81152h()) {
            this.f46643a.setStateDescription(charSequence);
        } else {
            this.f46643a.getExtras().putCharSequence(f46630n, charSequence);
        }
    }

    /* renamed from: O */
    public CharSequence mo52558O() {
        return this.f46643a.getPackageName();
    }

    /* renamed from: O0 */
    public boolean mo52559O0(View view) {
        return this.f46643a.removeChild(view);
    }

    /* renamed from: O1 */
    public void mo52560O1(CharSequence charSequence) {
        this.f46643a.setText(charSequence);
    }

    @C0363p0
    /* renamed from: P */
    public CharSequence mo52561P() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f46643a.getPaneTitle();
        }
        return this.f46643a.getExtras().getCharSequence(f46612e);
    }

    /* renamed from: P0 */
    public boolean mo52562P0(View view, int i) {
        return this.f46643a.removeChild(view, i);
    }

    /* renamed from: P1 */
    public void mo52563P1(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f46643a.setTextEntryKey(z);
        } else {
            mo52574T0(8, z);
        }
    }

    /* renamed from: Q */
    public C18065l0 mo52564Q() {
        return m81937d2(this.f46643a.getParent());
    }

    /* renamed from: Q0 */
    public final void mo52565Q0(View view) {
        SparseArray<WeakReference<ClickableSpan>> T = mo52573T(view);
        if (T != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < T.size(); i++) {
                if (T.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                T.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: Q1 */
    public void mo52566Q1(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            C18067b.m82098c(this.f46643a, z);
        }
    }

    /* renamed from: R */
    public C18070e mo52567R() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f46643a.getRangeInfo();
        if (rangeInfo != null) {
            return new C18070e(rangeInfo);
        }
        return null;
    }

    /* renamed from: R0 */
    public void mo52568R0(boolean z) {
        this.f46643a.setAccessibilityFocused(z);
    }

    /* renamed from: R1 */
    public void mo52569R1(int i, int i2) {
        this.f46643a.setTextSelection(i, i2);
    }

    @C0363p0
    /* renamed from: S */
    public CharSequence mo52570S() {
        return this.f46643a.getExtras().getCharSequence(f46610d);
    }

    /* renamed from: S0 */
    public void mo52571S0(@C0359n0 List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f46643a.setAvailableExtraData(list);
        }
    }

    /* renamed from: S1 */
    public void mo52572S1(@C0363p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f46643a.setTooltipText(charSequence);
        } else {
            this.f46643a.getExtras().putCharSequence(f46614f, charSequence);
        }
    }

    /* renamed from: T */
    public final SparseArray<WeakReference<ClickableSpan>> mo52573T(View view) {
        return (SparseArray) view.getTag(C16986a.C16991e.tag_accessibility_clickable_spans);
    }

    /* renamed from: T0 */
    public final void mo52574T0(int i, boolean z) {
        Bundle E = mo52532E();
        if (E != null) {
            int i2 = E.getInt(f46618h, 0) & (~i);
            if (!z) {
                i = 0;
            }
            E.putInt(f46618h, i | i2);
        }
    }

    /* renamed from: T1 */
    public void mo52575T1(@C0359n0 C18071f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f46643a.setTouchDelegateInfo(fVar.f46703a);
        }
    }

    @C0363p0
    /* renamed from: U */
    public CharSequence mo52576U() {
        if (C17772a.m81152h()) {
            return this.f46643a.getStateDescription();
        }
        return this.f46643a.getExtras().getCharSequence(f46630n);
    }

    @Deprecated
    /* renamed from: U0 */
    public void mo52577U0(Rect rect) {
        this.f46643a.setBoundsInParent(rect);
    }

    /* renamed from: U1 */
    public void mo52578U1(View view) {
        this.f46643a.setTraversalAfter(view);
    }

    /* renamed from: V */
    public CharSequence mo52579V() {
        if (!mo52616g0()) {
            return this.f46643a.getText();
        }
        List<Integer> i = mo52622i(f46622j);
        List<Integer> i2 = mo52622i(f46624k);
        List<Integer> i3 = mo52622i(f46626l);
        List<Integer> i4 = mo52622i(f46620i);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f46643a.getText(), 0, this.f46643a.getText().length()));
        for (int i5 = 0; i5 < i.size(); i5++) {
            spannableString.setSpan(new C18032a(i4.get(i5).intValue(), this, mo52532E().getInt(f46628m)), i.get(i5).intValue(), i2.get(i5).intValue(), i3.get(i5).intValue());
        }
        return spannableString;
    }

    /* renamed from: V0 */
    public void mo52580V0(Rect rect) {
        this.f46643a.setBoundsInScreen(rect);
    }

    /* renamed from: V1 */
    public void mo52581V1(View view, int i) {
        this.f46643a.setTraversalAfter(view, i);
    }

    /* renamed from: W */
    public int mo52582W() {
        return this.f46643a.getTextSelectionEnd();
    }

    /* renamed from: W0 */
    public void mo52583W0(boolean z) {
        this.f46643a.setCanOpenPopup(z);
    }

    /* renamed from: W1 */
    public void mo52584W1(View view) {
        this.f46643a.setTraversalBefore(view);
    }

    /* renamed from: X */
    public int mo52585X() {
        return this.f46643a.getTextSelectionStart();
    }

    /* renamed from: X0 */
    public void mo52586X0(boolean z) {
        this.f46643a.setCheckable(z);
    }

    /* renamed from: X1 */
    public void mo52587X1(View view, int i) {
        this.f46643a.setTraversalBefore(view, i);
    }

    @C0363p0
    /* renamed from: Y */
    public CharSequence mo52588Y() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f46643a.getTooltipText();
        }
        return this.f46643a.getExtras().getCharSequence(f46614f);
    }

    /* renamed from: Y0 */
    public void mo52589Y0(boolean z) {
        this.f46643a.setChecked(z);
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: Y1 */
    public void mo52590Y1(@C0363p0 String str) {
        if (C17772a.m81155k()) {
            this.f46643a.setUniqueId(str);
        } else {
            this.f46643a.getExtras().putString(f46631o, str);
        }
    }

    @C0363p0
    /* renamed from: Z */
    public C18071f mo52591Z() {
        AccessibilityNodeInfo.TouchDelegateInfo a;
        if (Build.VERSION.SDK_INT < 29 || (a = this.f46643a.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new C18071f(a);
    }

    /* renamed from: Z0 */
    public void mo52592Z0(CharSequence charSequence) {
        this.f46643a.setClassName(charSequence);
    }

    /* renamed from: Z1 */
    public void mo52593Z1(String str) {
        this.f46643a.setViewIdResourceName(str);
    }

    /* renamed from: a */
    public void mo52594a(int i) {
        this.f46643a.addAction(i);
    }

    /* renamed from: a0 */
    public C18065l0 mo52595a0() {
        return m81937d2(this.f46643a.getTraversalAfter());
    }

    /* renamed from: a1 */
    public void mo52596a1(boolean z) {
        this.f46643a.setClickable(z);
    }

    /* renamed from: a2 */
    public void mo52597a2(boolean z) {
        this.f46643a.setVisibleToUser(z);
    }

    /* renamed from: b */
    public void mo52598b(C18066a aVar) {
        this.f46643a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f46690a);
    }

    /* renamed from: b0 */
    public C18065l0 mo52599b0() {
        return m81937d2(this.f46643a.getTraversalBefore());
    }

    /* renamed from: b1 */
    public void mo52600b1(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46643a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C18068c) obj).f46697a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    /* renamed from: b2 */
    public AccessibilityNodeInfo mo52601b2() {
        return this.f46643a;
    }

    /* renamed from: c */
    public void mo52602c(View view) {
        this.f46643a.addChild(view);
    }

    @C0363p0
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: c0 */
    public String mo52603c0() {
        if (C17772a.m81155k()) {
            return this.f46643a.getUniqueId();
        }
        return this.f46643a.getExtras().getString(f46631o);
    }

    /* renamed from: c1 */
    public void mo52604c1(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46643a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C18069d) obj).f46698a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    /* renamed from: d */
    public void mo52605d(View view, int i) {
        this.f46643a.addChild(view, i);
    }

    /* renamed from: d0 */
    public String mo52606d0() {
        return this.f46643a.getViewIdResourceName();
    }

    /* renamed from: d1 */
    public void mo52607d1(CharSequence charSequence) {
        this.f46643a.setContentDescription(charSequence);
    }

    /* renamed from: e */
    public final void mo52608e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        mo52622i(f46622j).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        mo52622i(f46624k).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        mo52622i(f46626l).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        mo52622i(f46620i).add(Integer.valueOf(i));
    }

    /* renamed from: e0 */
    public C18108x0 mo52609e0() {
        return C18108x0.m82220v(this.f46643a.getWindow());
    }

    /* renamed from: e1 */
    public void mo52610e1(boolean z) {
        this.f46643a.setContentInvalid(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C18065l0)) {
            return false;
        }
        C18065l0 l0Var = (C18065l0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46643a;
        if (accessibilityNodeInfo == null) {
            if (l0Var.f46643a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(l0Var.f46643a)) {
            return false;
        }
        if (this.f46645c == l0Var.f46645c && this.f46644b == l0Var.f46644b) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: f */
    public void mo52612f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            mo52618h();
            mo52565Q0(view);
            ClickableSpan[] x = m81939x(charSequence);
            if (x != null && x.length > 0) {
                mo52532E().putInt(f46628m, C16986a.C16991e.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> N = mo52555N(view);
                for (int i = 0; i < x.length; i++) {
                    int h0 = mo52619h0(x[i], N);
                    N.put(h0, new WeakReference(x[i]));
                    mo52608e(x[i], (Spanned) charSequence, h0);
                }
            }
        }
    }

    /* renamed from: f0 */
    public int mo52613f0() {
        return this.f46643a.getWindowId();
    }

    /* renamed from: f1 */
    public void mo52614f1(boolean z) {
        this.f46643a.setContextClickable(z);
    }

    /* renamed from: g */
    public boolean mo52615g() {
        return this.f46643a.canOpenPopup();
    }

    /* renamed from: g0 */
    public final boolean mo52616g0() {
        return !mo52622i(f46622j).isEmpty();
    }

    /* renamed from: g1 */
    public void mo52617g1(boolean z) {
        this.f46643a.setDismissable(z);
    }

    /* renamed from: h */
    public final void mo52618h() {
        this.f46643a.getExtras().remove(f46622j);
        this.f46643a.getExtras().remove(f46624k);
        this.f46643a.getExtras().remove(f46626l);
        this.f46643a.getExtras().remove(f46620i);
    }

    /* renamed from: h0 */
    public final int mo52619h0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f46629m0;
        f46629m0 = i2 + 1;
        return i2;
    }

    /* renamed from: h1 */
    public void mo52620h1(int i) {
        this.f46643a.setDrawingOrder(i);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f46643a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public final List<Integer> mo52622i(String str) {
        ArrayList<Integer> integerArrayList = this.f46643a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f46643a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: i0 */
    public boolean mo52623i0() {
        return this.f46643a.isAccessibilityFocused();
    }

    /* renamed from: i1 */
    public void mo52624i1(boolean z) {
        this.f46643a.setEditable(z);
    }

    /* renamed from: j */
    public List<C18065l0> mo52625j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.f46643a.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(m81936c2(findAccessibilityNodeInfosByText.get(i)));
        }
        return arrayList;
    }

    /* renamed from: j0 */
    public boolean mo52626j0() {
        return this.f46643a.isCheckable();
    }

    /* renamed from: j1 */
    public void mo52627j1(boolean z) {
        this.f46643a.setEnabled(z);
    }

    /* renamed from: k */
    public List<C18065l0> mo52628k(String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.f46643a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        for (AccessibilityNodeInfo c2 : findAccessibilityNodeInfosByViewId) {
            arrayList.add(m81936c2(c2));
        }
        return arrayList;
    }

    /* renamed from: k0 */
    public boolean mo52629k0() {
        return this.f46643a.isChecked();
    }

    /* renamed from: k1 */
    public void mo52630k1(CharSequence charSequence) {
        this.f46643a.setError(charSequence);
    }

    /* renamed from: l */
    public C18065l0 mo52631l(int i) {
        return m81937d2(this.f46643a.findFocus(i));
    }

    /* renamed from: l0 */
    public boolean mo52632l0() {
        return this.f46643a.isClickable();
    }

    /* renamed from: l1 */
    public void mo52633l1(boolean z) {
        this.f46643a.setFocusable(z);
    }

    /* renamed from: m */
    public C18065l0 mo52634m(int i) {
        return m81937d2(this.f46643a.focusSearch(i));
    }

    /* renamed from: m0 */
    public boolean mo52635m0() {
        return this.f46643a.isContentInvalid();
    }

    /* renamed from: m1 */
    public void mo52636m1(boolean z) {
        this.f46643a.setFocused(z);
    }

    /* renamed from: n */
    public List<C18066a> mo52637n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f46643a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C18066a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: n0 */
    public boolean mo52638n0() {
        return this.f46643a.isContextClickable();
    }

    /* renamed from: n1 */
    public void mo52639n1(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f46643a.setHeading(z);
        } else {
            mo52574T0(2, z);
        }
    }

    /* renamed from: o0 */
    public boolean mo52640o0() {
        return this.f46643a.isDismissable();
    }

    /* renamed from: o1 */
    public void mo52641o1(@C0363p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f46643a.setHintText(charSequence);
        } else {
            this.f46643a.getExtras().putCharSequence(f46616g, charSequence);
        }
    }

    @Deprecated
    /* renamed from: p */
    public int mo52642p() {
        return this.f46643a.getActions();
    }

    /* renamed from: p0 */
    public boolean mo52643p0() {
        return this.f46643a.isEditable();
    }

    /* renamed from: p1 */
    public void mo52644p1(boolean z) {
        this.f46643a.setImportantForAccessibility(z);
    }

    @C0359n0
    /* renamed from: q */
    public List<String> mo52645q() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f46643a.getAvailableExtraData();
        }
        return Collections.emptyList();
    }

    /* renamed from: q0 */
    public boolean mo52646q0() {
        return this.f46643a.isEnabled();
    }

    /* renamed from: q1 */
    public void mo52647q1(int i) {
        this.f46643a.setInputType(i);
    }

    /* renamed from: r */
    public final boolean mo52648r(int i) {
        Bundle E = mo52532E();
        if (E != null && (E.getInt(f46618h, 0) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public boolean mo52649r0() {
        return this.f46643a.isFocusable();
    }

    /* renamed from: r1 */
    public void mo52650r1(View view) {
        this.f46643a.setLabelFor(view);
    }

    @Deprecated
    /* renamed from: s */
    public void mo52651s(Rect rect) {
        this.f46643a.getBoundsInParent(rect);
    }

    /* renamed from: s0 */
    public boolean mo52652s0() {
        return this.f46643a.isFocused();
    }

    /* renamed from: s1 */
    public void mo52653s1(View view, int i) {
        this.f46643a.setLabelFor(view, i);
    }

    /* renamed from: t */
    public void mo52654t(Rect rect) {
        this.f46643a.getBoundsInScreen(rect);
    }

    /* renamed from: t0 */
    public boolean mo52655t0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f46643a.isHeading();
        }
        if (mo52648r(2)) {
            return true;
        }
        C18069d z = mo52672z();
        if (z == null || !z.mo52689e()) {
            return false;
        }
        return true;
    }

    /* renamed from: t1 */
    public void mo52656t1(View view) {
        this.f46643a.setLabeledBy(view);
    }

    @C0359n0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo52651s(rect);
        sb.append("; boundsInParent: " + rect);
        mo52654t(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo52558O());
        sb.append("; className: ");
        sb.append(mo52664w());
        sb.append("; text: ");
        sb.append(mo52579V());
        sb.append("; contentDescription: ");
        sb.append(mo52520A());
        sb.append("; viewId: ");
        sb.append(mo52606d0());
        sb.append("; uniqueId: ");
        sb.append(mo52603c0());
        sb.append("; checkable: ");
        sb.append(mo52626j0());
        sb.append("; checked: ");
        sb.append(mo52629k0());
        sb.append("; focusable: ");
        sb.append(mo52649r0());
        sb.append("; focused: ");
        sb.append(mo52652s0());
        sb.append("; selected: ");
        sb.append(mo52521A0());
        sb.append("; clickable: ");
        sb.append(mo52632l0());
        sb.append("; longClickable: ");
        sb.append(mo52662v0());
        sb.append("; enabled: ");
        sb.append(mo52646q0());
        sb.append("; password: ");
        sb.append(mo52667x0());
        sb.append("; scrollable: " + mo52673z0());
        sb.append("; [");
        List<C18066a> n = mo52637n();
        for (int i = 0; i < n.size(); i++) {
            C18066a aVar = n.get(i);
            String o = m81938o(aVar.mo52676b());
            if (o.equals("ACTION_UNKNOWN") && aVar.mo52677c() != null) {
                o = aVar.mo52677c().toString();
            }
            sb.append(o);
            if (i != n.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public C18065l0 mo52658u(int i) {
        return m81937d2(this.f46643a.getChild(i));
    }

    /* renamed from: u0 */
    public boolean mo52659u0() {
        return this.f46643a.isImportantForAccessibility();
    }

    /* renamed from: u1 */
    public void mo52660u1(View view, int i) {
        this.f46643a.setLabeledBy(view, i);
    }

    /* renamed from: v */
    public int mo52661v() {
        return this.f46643a.getChildCount();
    }

    /* renamed from: v0 */
    public boolean mo52662v0() {
        return this.f46643a.isLongClickable();
    }

    /* renamed from: v1 */
    public void mo52663v1(int i) {
        this.f46643a.setLiveRegion(i);
    }

    /* renamed from: w */
    public CharSequence mo52664w() {
        return this.f46643a.getClassName();
    }

    /* renamed from: w0 */
    public boolean mo52665w0() {
        return this.f46643a.isMultiLine();
    }

    /* renamed from: w1 */
    public void mo52666w1(boolean z) {
        this.f46643a.setLongClickable(z);
    }

    /* renamed from: x0 */
    public boolean mo52667x0() {
        return this.f46643a.isPassword();
    }

    /* renamed from: x1 */
    public void mo52668x1(int i) {
        this.f46643a.setMaxTextLength(i);
    }

    /* renamed from: y */
    public C18068c mo52669y() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f46643a.getCollectionInfo();
        if (collectionInfo != null) {
            return new C18068c(collectionInfo);
        }
        return null;
    }

    /* renamed from: y0 */
    public boolean mo52670y0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f46643a.isScreenReaderFocusable();
        }
        return mo52648r(1);
    }

    /* renamed from: y1 */
    public void mo52671y1(int i) {
        this.f46643a.setMovementGranularities(i);
    }

    /* renamed from: z */
    public C18069d mo52672z() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f46643a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new C18069d(collectionItemInfo);
        }
        return null;
    }

    /* renamed from: z0 */
    public boolean mo52673z0() {
        return this.f46643a.isScrollable();
    }

    /* renamed from: z1 */
    public void mo52674z1(boolean z) {
        this.f46643a.setMultiLine(z);
    }

    /* renamed from: androidx.core.view.accessibility.l0$f */
    public static final class C18071f {

        /* renamed from: a */
        public final AccessibilityNodeInfo.TouchDelegateInfo f46703a;

        public C18071f(@C0359n0 Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                C18087t0.m82136a();
                this.f46703a = C18085s0.m82134a(map);
                return;
            }
            this.f46703a = null;
        }

        @C0363p0
        /* renamed from: a */
        public Region mo52695a(@C0337f0(from = 0) int i) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f46703a.getRegionAt(i);
            }
            return null;
        }

        @C0337f0(from = 0)
        /* renamed from: b */
        public int mo52696b() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f46703a.getRegionCount();
            }
            return 0;
        }

        @C0363p0
        /* renamed from: c */
        public C18065l0 mo52697c(@C0359n0 Region region) {
            AccessibilityNodeInfo a;
            if (Build.VERSION.SDK_INT < 29 || (a = this.f46703a.getTargetForRegion(region)) == null) {
                return null;
            }
            return C18065l0.m81936c2(a);
        }

        public C18071f(@C0359n0 AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f46703a = touchDelegateInfo;
        }
    }

    public C18065l0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f46643a = accessibilityNodeInfo;
    }
}
