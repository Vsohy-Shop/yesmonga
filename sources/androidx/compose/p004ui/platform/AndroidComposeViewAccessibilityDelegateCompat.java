package androidx.compose.p004ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.C0337f0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.collection.C1869c;
import androidx.collection.C1887m;
import androidx.compose.p004ui.C8776o;
import androidx.compose.p004ui.C8781p;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.node.C15675c1;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15703k1;
import androidx.compose.p004ui.node.C15706l1;
import androidx.compose.p004ui.node.C15707m;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.platform.C15829a;
import androidx.compose.p004ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.p004ui.semantics.C16023a;
import androidx.compose.p004ui.semantics.C16026d;
import androidx.compose.p004ui.semantics.C16027e;
import androidx.compose.p004ui.semantics.C16029f;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.semantics.C16033h;
import androidx.compose.p004ui.semantics.C16034i;
import androidx.compose.p004ui.semantics.C16035j;
import androidx.compose.p004ui.semantics.C16040m;
import androidx.compose.p004ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p004ui.semantics.SemanticsNode;
import androidx.compose.p004ui.semantics.SemanticsProperties;
import androidx.compose.p004ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.p004ui.state.ToggleableState;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.platform.C16363a;
import androidx.compose.p004ui.viewinterop.AndroidViewHolder;
import androidx.core.view.C18019a;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.accessibility.C18089u0;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10977s0;
import kotlin.collections.C10992w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,3169:1\n1747#2,3:3170\n33#3,4:3173\n33#3,6:3177\n38#3:3183\n33#3,6:3184\n33#3,6:3190\n33#3,6:3196\n69#3,6:3202\n69#3,6:3208\n33#3,6:3215\n33#3,6:3223\n33#3,6:3229\n33#3,6:3235\n33#3,6:3241\n33#3,6:3247\n1#4:3214\n37#5,2:3221\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n451#1:3170,3\n616#1:3173,4\n619#1:3177,6\n616#1:3183\n662#1:3184,6\n752#1:3190,6\n1200#1:3196,6\n1211#1:3202,6\n1218#1:3208,6\n1748#1:3215,6\n2432#1:3223,6\n2436#1:3229,6\n2595#1:3235,6\n2613#1:3241,6\n656#1:3247,6\n1813#1:3221,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat */
public final class AndroidComposeViewAccessibilityDelegateCompat extends C18019a {
    @C12579k

    /* renamed from: H */
    public static final C15761e f39193H = new C15761e((DefaultConstructorMarker) null);

    /* renamed from: I */
    public static final int f39194I = Integer.MIN_VALUE;
    @C12579k

    /* renamed from: J */
    public static final String f39195J = "android.view.View";
    @C12579k

    /* renamed from: K */
    public static final String f39196K = "android.widget.EditText";
    @C12579k

    /* renamed from: L */
    public static final String f39197L = "android.widget.TextView";
    @C12579k

    /* renamed from: M */
    public static final String f39198M = "AccessibilityDelegate";
    @C12579k

    /* renamed from: N */
    public static final String f39199N = "androidx.compose.ui.semantics.testTag";

    /* renamed from: O */
    public static final int f39200O = 100000;

    /* renamed from: P */
    public static final int f39201P = -1;

    /* renamed from: Q */
    public static final int f39202Q = 20;

    /* renamed from: R */
    public static final long f39203R = 100;

    /* renamed from: S */
    public static final long f39204S = 1000;
    @C12579k

    /* renamed from: T */
    public static final int[] f39205T = {C8776o.C8778b.accessibility_custom_action_0, C8776o.C8778b.accessibility_custom_action_1, C8776o.C8778b.accessibility_custom_action_2, C8776o.C8778b.accessibility_custom_action_3, C8776o.C8778b.accessibility_custom_action_4, C8776o.C8778b.accessibility_custom_action_5, C8776o.C8778b.accessibility_custom_action_6, C8776o.C8778b.accessibility_custom_action_7, C8776o.C8778b.accessibility_custom_action_8, C8776o.C8778b.accessibility_custom_action_9, C8776o.C8778b.accessibility_custom_action_10, C8776o.C8778b.accessibility_custom_action_11, C8776o.C8778b.accessibility_custom_action_12, C8776o.C8778b.accessibility_custom_action_13, C8776o.C8778b.accessibility_custom_action_14, C8776o.C8778b.accessibility_custom_action_15, C8776o.C8778b.accessibility_custom_action_16, C8776o.C8778b.accessibility_custom_action_17, C8776o.C8778b.accessibility_custom_action_18, C8776o.C8778b.accessibility_custom_action_19, C8776o.C8778b.accessibility_custom_action_20, C8776o.C8778b.accessibility_custom_action_21, C8776o.C8778b.accessibility_custom_action_22, C8776o.C8778b.accessibility_custom_action_23, C8776o.C8778b.accessibility_custom_action_24, C8776o.C8778b.accessibility_custom_action_25, C8776o.C8778b.accessibility_custom_action_26, C8776o.C8778b.accessibility_custom_action_27, C8776o.C8778b.accessibility_custom_action_28, C8776o.C8778b.accessibility_custom_action_29, C8776o.C8778b.accessibility_custom_action_30, C8776o.C8778b.accessibility_custom_action_31};
    @C12579k

    /* renamed from: A */
    public final String f39206A;
    @C12579k

    /* renamed from: B */
    public Map<Integer, C15764h> f39207B;
    @C12579k

    /* renamed from: C */
    public C15764h f39208C;

    /* renamed from: D */
    public boolean f39209D;
    @C12579k

    /* renamed from: E */
    public final Runnable f39210E;
    @C12579k

    /* renamed from: F */
    public final List<C15975t3> f39211F;
    @C12579k

    /* renamed from: G */
    public final C11300l<C15975t3, C11079d2> f39212G;
    @C12579k

    /* renamed from: d */
    public final AndroidComposeView f39213d;

    /* renamed from: e */
    public int f39214e = Integer.MIN_VALUE;
    @C12579k

    /* renamed from: f */
    public final AccessibilityManager f39215f;

    /* renamed from: g */
    public boolean f39216g;
    @C12579k

    /* renamed from: h */
    public final AccessibilityManager.AccessibilityStateChangeListener f39217h;
    @C12579k

    /* renamed from: i */
    public final AccessibilityManager.TouchExplorationStateChangeListener f39218i;

    /* renamed from: j */
    public List<AccessibilityServiceInfo> f39219j;
    @C12579k

    /* renamed from: k */
    public final Handler f39220k;
    @C12579k

    /* renamed from: l */
    public C18089u0 f39221l;

    /* renamed from: m */
    public int f39222m;
    @C12579k

    /* renamed from: n */
    public C1887m<C1887m<CharSequence>> f39223n;
    @C12579k

    /* renamed from: o */
    public C1887m<Map<CharSequence, Integer>> f39224o;

    /* renamed from: p */
    public int f39225p;
    @C12580l

    /* renamed from: q */
    public Integer f39226q;
    @C12579k

    /* renamed from: r */
    public final C1869c<LayoutNode> f39227r;
    @C12579k

    /* renamed from: s */
    public final C11744g<C11079d2> f39228s;

    /* renamed from: t */
    public boolean f39229t;
    @C12580l

    /* renamed from: u */
    public C15763g f39230u;
    @C12579k

    /* renamed from: v */
    public Map<Integer, C15981u3> f39231v;
    @C12579k

    /* renamed from: w */
    public C1869c<Integer> f39232w;
    @C12579k

    /* renamed from: x */
    public HashMap<Integer, Integer> f39233x;
    @C12579k

    /* renamed from: y */
    public HashMap<Integer, Integer> f39234y;
    @C12579k

    /* renamed from: z */
    public final String f39235z;

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$a */
    public static final class C15757a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f39236a;

        public C15757a(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
            this.f39236a = androidComposeViewAccessibilityDelegateCompat;
        }

        public void onViewAttachedToWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            this.f39236a.mo45396K().addAccessibilityStateChangeListener(this.f39236a.mo45402P());
            this.f39236a.mo45396K().addTouchExplorationStateChangeListener(this.f39236a.mo45413X());
        }

        public void onViewDetachedFromWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            this.f39236a.f39220k.removeCallbacks(this.f39236a.f39210E);
            this.f39236a.mo45396K().removeAccessibilityStateChangeListener(this.f39236a.mo45402P());
            this.f39236a.mo45396K().removeTouchExplorationStateChangeListener(this.f39236a.mo45413X());
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$b */
    public static final class C15758b {
        @C12579k

        /* renamed from: a */
        public static final C15758b f39237a = new C15758b();

        @C0373u
        @C11384m
        /* renamed from: a */
        public static final void m70876a(@C12579k C18065l0 l0Var, @C12579k SemanticsNode semanticsNode) {
            C16023a aVar;
            Intrinsics.checkNotNullParameter(l0Var, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(semanticsNode) && (aVar = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), C16034i.f39806a.mo46149r())) != null) {
                l0Var.mo52598b(new C18065l0.C18066a(16908349, aVar.mo46089b()));
            }
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$c */
    public static final class C15759c {
        @C12579k

        /* renamed from: a */
        public static final C15759c f39238a = new C15759c();

        @C0373u
        @C11384m
        /* renamed from: a */
        public static final void m70877a(@C12579k AccessibilityEvent accessibilityEvent, int i, int i2) {
            Intrinsics.checkNotNullParameter(accessibilityEvent, "event");
            accessibilityEvent.setScrollDeltaX(i);
            accessibilityEvent.setScrollDeltaY(i2);
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$d */
    public static final class C15760d {
        @C12579k

        /* renamed from: a */
        public static final C15760d f39239a = new C15760d();

        @C0373u
        @C11384m
        /* renamed from: a */
        public static final void m70878a(@C12579k C18065l0 l0Var, @C12579k SemanticsNode semanticsNode) {
            Intrinsics.checkNotNullParameter(l0Var, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(semanticsNode)) {
                C16035j x = semanticsNode.mo46036x();
                C16034i iVar = C16034i.f39806a;
                C16023a aVar = (C16023a) SemanticsConfigurationKt.m71865a(x, iVar.mo46144m());
                if (aVar != null) {
                    l0Var.mo52598b(new C18065l0.C18066a(16908358, aVar.mo46089b()));
                }
                C16023a aVar2 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46141j());
                if (aVar2 != null) {
                    l0Var.mo52598b(new C18065l0.C18066a(16908359, aVar2.mo46089b()));
                }
                C16023a aVar3 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46142k());
                if (aVar3 != null) {
                    l0Var.mo52598b(new C18065l0.C18066a(16908360, aVar3.mo46089b()));
                }
                C16023a aVar4 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46143l());
                if (aVar4 != null) {
                    l0Var.mo52598b(new C18065l0.C18066a(16908361, aVar4.mo46089b()));
                }
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$e */
    public static final class C15761e {
        public /* synthetic */ C15761e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15761e() {
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$f */
    public final class C15762f extends AccessibilityNodeProvider {
        public C15762f() {
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, @C12579k AccessibilityNodeInfo accessibilityNodeInfo, @C12579k String str, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(str, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.mo45433y(i, accessibilityNodeInfo, str, bundle);
        }

        @C12580l
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.mo45387F(i);
        }

        public boolean performAction(int i, int i2, @C12580l Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.mo45424j0(i, i2, bundle);
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g */
    public static final class C15763g {
        @C12579k

        /* renamed from: a */
        public final SemanticsNode f39241a;

        /* renamed from: b */
        public final int f39242b;

        /* renamed from: c */
        public final int f39243c;

        /* renamed from: d */
        public final int f39244d;

        /* renamed from: e */
        public final int f39245e;

        /* renamed from: f */
        public final long f39246f;

        public C15763g(@C12579k SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            Intrinsics.checkNotNullParameter(semanticsNode, "node");
            this.f39241a = semanticsNode;
            this.f39242b = i;
            this.f39243c = i2;
            this.f39244d = i3;
            this.f39245e = i4;
            this.f39246f = j;
        }

        /* renamed from: a */
        public final int mo45442a() {
            return this.f39242b;
        }

        /* renamed from: b */
        public final int mo45443b() {
            return this.f39244d;
        }

        /* renamed from: c */
        public final int mo45444c() {
            return this.f39243c;
        }

        @C12579k
        /* renamed from: d */
        public final SemanticsNode mo45445d() {
            return this.f39241a;
        }

        /* renamed from: e */
        public final int mo45446e() {
            return this.f39245e;
        }

        /* renamed from: f */
        public final long mo45447f() {
            return this.f39246f;
        }
    }

    @C0344h1
    @C11363r0({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,3169:1\n33#2,6:3170\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n*L\n380#1:3170,6\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h */
    public static final class C15764h {
        @C12579k

        /* renamed from: a */
        public final SemanticsNode f39247a;
        @C12579k

        /* renamed from: b */
        public final C16035j f39248b;
        @C12579k

        /* renamed from: c */
        public final Set<Integer> f39249c = new LinkedHashSet();

        public C15764h(@C12579k SemanticsNode semanticsNode, @C12579k Map<Integer, C15981u3> map) {
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            Intrinsics.checkNotNullParameter(map, "currentSemanticsNodes");
            this.f39247a = semanticsNode;
            this.f39248b = semanticsNode.mo46036x();
            List<SemanticsNode> t = semanticsNode.mo46032t();
            int size = t.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = t.get(i);
                if (map.containsKey(Integer.valueOf(semanticsNode2.mo46024l()))) {
                    this.f39249c.add(Integer.valueOf(semanticsNode2.mo46024l()));
                }
            }
        }

        @C12579k
        /* renamed from: a */
        public final Set<Integer> mo45448a() {
            return this.f39249c;
        }

        @C12579k
        /* renamed from: b */
        public final SemanticsNode mo45449b() {
            return this.f39247a;
        }

        @C12579k
        /* renamed from: c */
        public final C16035j mo45450c() {
            return this.f39248b;
        }

        /* renamed from: d */
        public final boolean mo45451d() {
            return this.f39248b.mo46161i(SemanticsProperties.f39725a.mo46062r());
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$i */
    public /* synthetic */ class C15765i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.state.ToggleableState[] r0 = androidx.compose.p004ui.state.ToggleableState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p004ui.state.ToggleableState.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p004ui.state.ToggleableState.Off     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.p004ui.state.ToggleableState.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C15765i.<clinit>():void");
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n1#1,328:1\n542#2:329\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$j */
    public static final class C15766j<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator f39250a;

        /* renamed from: b */
        public final /* synthetic */ Comparator f39251b;

        public C15766j(Comparator comparator, Comparator comparator2) {
            this.f39250a = comparator;
            this.f39251b = comparator2;
        }

        public final int compare(T t, T t2) {
            int compare = this.f39250a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return this.f39251b.compare(((SemanticsNode) t).mo46026n(), ((SemanticsNode) t2).mo46026n());
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n1#1,328:1\n544#2:329\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$k */
    public static final class C15767k<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator f39252a;

        public C15767k(Comparator comparator) {
            this.f39252a = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.f39252a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return C11006g.m42424l(Integer.valueOf(((SemanticsNode) t).mo46024l()), Integer.valueOf(((SemanticsNode) t2).mo46024l()));
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(@C12579k AndroidComposeView androidComposeView) {
        Intrinsics.checkNotNullParameter(androidComposeView, C40383c.f102945c);
        this.f39213d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f39215f = accessibilityManager;
        this.f39217h = new C15930n(this);
        this.f39218i = new C15938o(this);
        this.f39219j = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f39220k = new Handler(Looper.getMainLooper());
        this.f39221l = new C18089u0(new C15762f());
        this.f39222m = Integer.MIN_VALUE;
        this.f39223n = new C1887m<>();
        this.f39224o = new C1887m<>();
        this.f39225p = -1;
        this.f39227r = new C1869c<>();
        this.f39228s = C11748i.m46625d(-1, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f39229t = true;
        this.f39231v = C10977s0.m41492z();
        this.f39232w = new C1869c<>();
        this.f39233x = new HashMap<>();
        this.f39234y = new HashMap<>();
        this.f39235z = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f39206A = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f39207B = new LinkedHashMap();
        this.f39208C = new C15764h(androidComposeView.getSemanticsOwner().mo46174b(), C10977s0.m41492z());
        androidComposeView.addOnAttachStateChangeListener(new C15757a(this));
        this.f39210E = new C15944p(this);
        this.f39211F = new ArrayList();
        this.f39212G = new C15779x168b1034(this);
    }

    /* renamed from: I */
    public static final void m70789I(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        List<AccessibilityServiceInfo> list;
        Intrinsics.checkNotNullParameter(androidComposeViewAccessibilityDelegateCompat, "this$0");
        if (z) {
            list = androidComposeViewAccessibilityDelegateCompat.f39215f.getEnabledAccessibilityServiceList(-1);
        } else {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        androidComposeViewAccessibilityDelegateCompat.f39219j = list;
    }

    @C0344h1
    /* renamed from: L */
    public static /* synthetic */ void m70790L() {
    }

    /* renamed from: L0 */
    public static /* synthetic */ List m70791L0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z, List list, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        return androidComposeViewAccessibilityDelegateCompat.mo45397K0(z, list, map);
    }

    /* renamed from: M0 */
    public static final boolean m70792M0(List<Pair<C15098i, List<SemanticsNode>>> list, SemanticsNode semanticsNode) {
        float B = semanticsNode.mo46020h().mo42249B();
        float j = semanticsNode.mo46020h().mo42271j();
        C15880f1<Float> F = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70908F(B, j);
        int G = CollectionsKt__CollectionsKt.m40443G(list);
        if (G >= 0) {
            int i = 0;
            while (true) {
                C15098i iVar = (C15098i) list.get(i).mo21849e();
                if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70906D(AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70908F(iVar.mo42249B(), iVar.mo42271j()), F)) {
                    if (i == G) {
                        break;
                    }
                    i++;
                } else {
                    list.set(i, new Pair(iVar.mo42255J(new C15098i(0.0f, B, Float.POSITIVE_INFINITY, j)), list.get(i).mo21851f()));
                    ((List) list.get(i).mo21851f()).add(semanticsNode);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: O0 */
    public static final void m70793O0(List<SemanticsNode> list, Map<Integer, List<SemanticsNode>> map, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z, SemanticsNode semanticsNode) {
        list.add(semanticsNode);
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70929u(semanticsNode)) {
            map.put(Integer.valueOf(semanticsNode.mo46024l()), androidComposeViewAccessibilityDelegateCompat.mo45400N0(z, CollectionsKt___CollectionsKt.m40572T5(semanticsNode.mo46021i())));
            return;
        }
        List<SemanticsNode> i = semanticsNode.mo46021i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            m70793O0(list, map, androidComposeViewAccessibilityDelegateCompat, z, i.get(i2));
        }
    }

    @C0344h1
    /* renamed from: Q */
    public static /* synthetic */ void m70794Q() {
    }

    /* renamed from: Q0 */
    public static final void m70795Q0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        Intrinsics.checkNotNullParameter(androidComposeViewAccessibilityDelegateCompat, "this$0");
        androidComposeViewAccessibilityDelegateCompat.f39219j = androidComposeViewAccessibilityDelegateCompat.f39215f.getEnabledAccessibilityServiceList(-1);
    }

    @C0344h1
    /* renamed from: V */
    public static /* synthetic */ void m70796V() {
    }

    @C0344h1
    /* renamed from: Y */
    public static /* synthetic */ void m70797Y() {
    }

    @C0344h1
    /* renamed from: e0 */
    public static /* synthetic */ void m70798e0() {
    }

    /* renamed from: k0 */
    public static final boolean m70799k0(C16033h hVar, float f) {
        return (f < 0.0f && hVar.mo46130c().invoke().floatValue() > 0.0f) || (f > 0.0f && hVar.mo46130c().invoke().floatValue() < hVar.mo46128a().invoke().floatValue());
    }

    /* renamed from: l0 */
    public static final float m70800l0(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* renamed from: n0 */
    public static final boolean m70802n0(C16033h hVar) {
        return (hVar.mo46130c().invoke().floatValue() > 0.0f && !hVar.mo46129b()) || (hVar.mo46130c().invoke().floatValue() < hVar.mo46128a().invoke().floatValue() && hVar.mo46129b());
    }

    /* renamed from: o0 */
    public static final boolean m70804o0(C16033h hVar) {
        return (hVar.mo46130c().invoke().floatValue() < hVar.mo46128a().invoke().floatValue() && !hVar.mo46129b()) || (hVar.mo46130c().invoke().floatValue() > 0.0f && hVar.mo46129b());
    }

    /* renamed from: s0 */
    public static final void m70809s0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Intrinsics.checkNotNullParameter(androidComposeViewAccessibilityDelegateCompat, "this$0");
        C15675c1.m70188b(androidComposeViewAccessibilityDelegateCompat.f39213d, false, 1, (Object) null);
        androidComposeViewAccessibilityDelegateCompat.mo45381C();
        androidComposeViewAccessibilityDelegateCompat.f39209D = false;
    }

    /* renamed from: w0 */
    public static /* synthetic */ boolean m70814w0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.mo45431v0(i, i2, num, list);
    }

    /* renamed from: A */
    public final boolean mo45377A(boolean z, int i, long j) {
        return mo45379B(mo45401O().values(), z, i, j);
    }

    /* JADX WARNING: type inference failed for: r1v30, types: [androidx.compose.ui.text.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.C0344h1
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45378A0(@org.jetbrains.annotations.C12579k java.util.Map<java.lang.Integer, androidx.compose.p004ui.platform.C15981u3> r28) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            java.lang.String r0 = "newSemanticsNodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List<androidx.compose.ui.platform.t3> r0 = r7.f39211F
            java.util.Collection r0 = (java.util.Collection) r0
            r9.<init>(r0)
            java.util.List<androidx.compose.ui.platform.t3> r0 = r7.f39211F
            r0.clear()
            java.util.Set r0 = r28.keySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x001f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0552
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h> r0 = r7.f39207B
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r0.get(r1)
            r12 = r0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h r12 = (androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C15764h) r12
            if (r12 != 0) goto L_0x003f
            goto L_0x001f
        L_0x003f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r8.get(r0)
            androidx.compose.ui.platform.u3 r0 = (androidx.compose.p004ui.platform.C15981u3) r0
            if (r0 == 0) goto L_0x0051
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.mo45969b()
            r14 = r0
            goto L_0x0052
        L_0x0051:
            r14 = 0
        L_0x0052:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            androidx.compose.ui.semantics.j r0 = r14.mo46036x()
            java.util.Iterator r15 = r0.iterator()
            r16 = 0
            r17 = r16
        L_0x0061:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0533
            java.lang.Object r0 = r15.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsProperties r2 = androidx.compose.p004ui.semantics.SemanticsProperties.f39725a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46054i()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x008f
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46045C()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 == 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r1 = r16
            goto L_0x0093
        L_0x008f:
            boolean r1 = r7.mo45426p0(r11, r9)
        L_0x0093:
            if (r1 != 0) goto L_0x00af
            java.lang.Object r1 = r0.getValue()
            androidx.compose.ui.semantics.j r3 = r12.mo45450c()
            java.lang.Object r4 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = (androidx.compose.p004ui.semantics.SemanticsPropertyKey) r4
            java.lang.Object r3 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r3, r4)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 == 0) goto L_0x00af
            goto L_0x0502
        L_0x00af:
            java.lang.Object r1 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = (androidx.compose.p004ui.semantics.SemanticsPropertyKey) r1
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46062r()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            r4 = 8
            if (r3 == 0) goto L_0x00d7
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r12.mo45451d()
            if (r1 == 0) goto L_0x0502
            r7.mo45432x0(r11, r4, r0)
            goto L_0x0502
        L_0x00d7:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46068x()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x00e3
            r3 = 1
            goto L_0x00eb
        L_0x00e3:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46044B()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
        L_0x00eb:
            r6 = 64
            if (r3 == 0) goto L_0x010f
            int r1 = r7.mo45429t0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            m70814w0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.mo45429t0(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            m70814w0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x010f:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46064t()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x0139
            int r1 = r7.mo45429t0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            m70814w0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.mo45429t0(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            m70814w0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x0139:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46067w()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            r13 = 4
            if (r3 == 0) goto L_0x022e
            androidx.compose.ui.semantics.j r0 = r14.mo46023k()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.mo46065u()
            java.lang.Object r0 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r0, r1)
            androidx.compose.ui.semantics.g r0 = (androidx.compose.p004ui.semantics.C16031g) r0
            androidx.compose.ui.semantics.g$a r1 = androidx.compose.p004ui.semantics.C16031g.f39793b
            int r1 = r1.mo46127g()
            if (r0 != 0) goto L_0x015d
            r0 = r16
            goto L_0x0165
        L_0x015d:
            int r0 = r0.mo46119n()
            boolean r0 = androidx.compose.p004ui.semantics.C16031g.m72096k(r0, r1)
        L_0x0165:
            if (r0 == 0) goto L_0x020e
            androidx.compose.ui.semantics.j r0 = r14.mo46023k()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.mo46067w()
            java.lang.Object r0 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x01f9
            int r0 = r7.mo45429t0(r11)
            android.view.accessibility.AccessibilityEvent r0 = r7.mo45385E(r0, r13)
            androidx.compose.ui.semantics.SemanticsNode r1 = new androidx.compose.ui.semantics.SemanticsNode
            androidx.compose.ui.node.k1 r19 = r14.mo46028p()
            r20 = 1
            r21 = 0
            r22 = 4
            r23 = 0
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23)
            androidx.compose.ui.semantics.j r3 = r1.mo46023k()
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = r2.mo46048c()
            java.lang.Object r3 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r3, r4)
            r18 = r3
            java.util.List r18 = (java.util.List) r18
            if (r18 == 0) goto L_0x01bd
            java.lang.String r19 = ","
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 62
            r26 = 0
            java.lang.String r3 = androidx.compose.p004ui.C8781p.m32651f(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01be
        L_0x01bd:
            r3 = 0
        L_0x01be:
            androidx.compose.ui.semantics.j r1 = r1.mo46023k()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.mo46070z()
            java.lang.Object r1 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r1, r2)
            r18 = r1
            java.util.List r18 = (java.util.List) r18
            if (r18 == 0) goto L_0x01e5
            java.lang.String r19 = ","
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 62
            r26 = 0
            java.lang.String r1 = androidx.compose.p004ui.C8781p.m32651f(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01e6
        L_0x01e5:
            r1 = 0
        L_0x01e6:
            if (r3 == 0) goto L_0x01eb
            r0.setContentDescription(r3)
        L_0x01eb:
            if (r1 == 0) goto L_0x01f4
            java.util.List r2 = r0.getText()
            r2.add(r1)
        L_0x01f4:
            r7.mo45430u0(r0)
            goto L_0x0502
        L_0x01f9:
            int r1 = r7.mo45429t0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            m70814w0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x020e:
            int r1 = r7.mo45429t0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            m70814w0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.mo45429t0(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            m70814w0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x022e:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46048c()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x0252
            int r1 = r7.mo45429t0(r11)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)
            java.util.List r0 = (java.util.List) r0
            r3 = 2048(0x800, float:2.87E-42)
            r7.mo45431v0(r1, r3, r2, r0)
            goto L_0x0502
        L_0x0252:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46050e()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            r6 = 100000(0x186a0, float:1.4013E-40)
            java.lang.String r13 = ""
            if (r3 == 0) goto L_0x0389
            boolean r0 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70903A(r14)
            if (r0 == 0) goto L_0x0373
            androidx.compose.ui.semantics.j r0 = r12.mo45450c()
            androidx.compose.ui.text.d r0 = r7.mo45412W(r0)
            if (r0 == 0) goto L_0x0272
            goto L_0x0273
        L_0x0272:
            r0 = r13
        L_0x0273:
            androidx.compose.ui.semantics.j r1 = r14.mo46036x()
            androidx.compose.ui.text.d r1 = r7.mo45412W(r1)
            if (r1 == 0) goto L_0x027e
            r13 = r1
        L_0x027e:
            java.lang.CharSequence r6 = r7.mo45407S0(r13, r6)
            int r1 = r0.length()
            int r2 = r13.length()
            int r3 = kotlin.ranges.C11479u.m44313B(r1, r2)
            r4 = r16
        L_0x0290:
            if (r4 >= r3) goto L_0x02a2
            char r5 = r0.charAt(r4)
            char r8 = r13.charAt(r4)
            if (r5 == r8) goto L_0x029d
            goto L_0x02a2
        L_0x029d:
            int r4 = r4 + 1
            r8 = r28
            goto L_0x0290
        L_0x02a2:
            r5 = r16
        L_0x02a4:
            int r8 = r3 - r4
            if (r5 >= r8) goto L_0x02c1
            int r8 = r1 + -1
            int r8 = r8 - r5
            char r8 = r0.charAt(r8)
            int r19 = r2 + -1
            r20 = r3
            int r3 = r19 - r5
            char r3 = r13.charAt(r3)
            if (r8 == r3) goto L_0x02bc
            goto L_0x02c1
        L_0x02bc:
            int r5 = r5 + 1
            r3 = r20
            goto L_0x02a4
        L_0x02c1:
            int r1 = r1 - r5
            int r1 = r1 - r4
            int r3 = r2 - r5
            int r3 = r3 - r4
            androidx.compose.ui.semantics.SemanticsNode r5 = r12.mo45449b()
            boolean r5 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70903A(r5)
            if (r5 == 0) goto L_0x02e2
            androidx.compose.ui.semantics.SemanticsNode r5 = r12.mo45449b()
            boolean r5 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70932x(r5)
            if (r5 != 0) goto L_0x02e2
            boolean r5 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70932x(r14)
            if (r5 == 0) goto L_0x02e2
            r8 = 1
            goto L_0x02e4
        L_0x02e2:
            r8 = r16
        L_0x02e4:
            androidx.compose.ui.semantics.SemanticsNode r5 = r12.mo45449b()
            boolean r5 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70903A(r5)
            if (r5 == 0) goto L_0x0301
            androidx.compose.ui.semantics.SemanticsNode r5 = r12.mo45449b()
            boolean r5 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70932x(r5)
            if (r5 == 0) goto L_0x0301
            boolean r5 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70932x(r14)
            if (r5 != 0) goto L_0x0301
            r18 = 1
            goto L_0x0303
        L_0x0301:
            r18 = r16
        L_0x0303:
            if (r8 != 0) goto L_0x0326
            if (r18 == 0) goto L_0x0308
            goto L_0x0326
        L_0x0308:
            int r2 = r7.mo45429t0(r11)
            r5 = 16
            android.view.accessibility.AccessibilityEvent r2 = r7.mo45385E(r2, r5)
            r2.setFromIndex(r4)
            r2.setRemovedCount(r1)
            r2.setAddedCount(r3)
            r2.setBeforeText(r0)
            java.util.List r0 = r2.getText()
            r0.add(r6)
            goto L_0x0340
        L_0x0326:
            int r1 = r7.mo45429t0(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r0 = r27
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            android.view.accessibility.AccessibilityEvent r2 = r0.mo45389G(r1, r2, r3, r4, r5)
        L_0x0340:
            java.lang.String r0 = "android.widget.EditText"
            r2.setClassName(r0)
            r7.mo45430u0(r2)
            if (r8 != 0) goto L_0x034c
            if (r18 == 0) goto L_0x0502
        L_0x034c:
            androidx.compose.ui.semantics.j r0 = r14.mo46036x()
            androidx.compose.ui.semantics.SemanticsProperties r1 = androidx.compose.p004ui.semantics.SemanticsProperties.f39725a
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.mo46043A()
            java.lang.Object r0 = r0.mo46164r(r1)
            androidx.compose.ui.text.n0 r0 = (androidx.compose.p004ui.text.C16356n0) r0
            long r0 = r0.mo47427r()
            int r3 = androidx.compose.p004ui.text.C16356n0.m73742n(r0)
            r2.setFromIndex(r3)
            int r0 = androidx.compose.p004ui.text.C16356n0.m73737i(r0)
            r2.setToIndex(r0)
            r7.mo45430u0(r2)
            goto L_0x0502
        L_0x0373:
            int r1 = r7.mo45429t0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            r0 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            m70814w0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x0389:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46043A()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x03ee
            androidx.compose.ui.semantics.j r0 = r14.mo46036x()
            androidx.compose.ui.text.d r0 = r7.mo45412W(r0)
            if (r0 == 0) goto L_0x03a5
            java.lang.String r0 = r0.mo46683j()
            if (r0 != 0) goto L_0x03a4
            goto L_0x03a5
        L_0x03a4:
            r13 = r0
        L_0x03a5:
            androidx.compose.ui.semantics.j r0 = r14.mo46036x()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.mo46043A()
            java.lang.Object r0 = r0.mo46164r(r1)
            androidx.compose.ui.text.n0 r0 = (androidx.compose.p004ui.text.C16356n0) r0
            long r0 = r0.mo47427r()
            int r2 = r7.mo45429t0(r11)
            int r3 = androidx.compose.p004ui.text.C16356n0.m73742n(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = androidx.compose.p004ui.text.C16356n0.m73737i(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r0 = r13.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.CharSequence r6 = r7.mo45407S0(r13, r6)
            r0 = r27
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            android.view.accessibility.AccessibilityEvent r0 = r0.mo45389G(r1, r2, r3, r4, r5)
            r7.mo45430u0(r0)
            int r0 = r14.mo46024l()
            r7.mo45434y0(r0)
            goto L_0x0502
        L_0x03ee:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46054i()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x03fa
            r3 = 1
            goto L_0x0402
        L_0x03fa:
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46045C()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
        L_0x0402:
            if (r3 == 0) goto L_0x043b
            androidx.compose.ui.node.LayoutNode r0 = r14.mo46026n()
            r7.mo45421g0(r0)
            java.util.List<androidx.compose.ui.platform.t3> r0 = r7.f39211F
            androidx.compose.ui.platform.t3 r0 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70924p(r0, r11)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.compose.ui.semantics.j r1 = r14.mo46036x()
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46054i()
            java.lang.Object r1 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r1, r3)
            androidx.compose.ui.semantics.h r1 = (androidx.compose.p004ui.semantics.C16033h) r1
            r0.mo45963g(r1)
            androidx.compose.ui.semantics.j r1 = r14.mo46036x()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.mo46045C()
            java.lang.Object r1 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r1, r2)
            androidx.compose.ui.semantics.h r1 = (androidx.compose.p004ui.semantics.C16033h) r1
            r0.mo45966j(r1)
            r7.mo45436z0(r0)
            goto L_0x0502
        L_0x043b:
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.mo46052g()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x047e
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0465
            int r0 = r14.mo46024l()
            int r0 = r7.mo45429t0(r0)
            android.view.accessibility.AccessibilityEvent r0 = r7.mo45385E(r0, r4)
            r7.mo45430u0(r0)
        L_0x0465:
            int r0 = r14.mo46024l()
            int r1 = r7.mo45429t0(r0)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            m70814w0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0502
        L_0x047e:
            androidx.compose.ui.semantics.i r2 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r2.mo46134c()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 == 0) goto L_0x0506
            androidx.compose.ui.semantics.j r0 = r14.mo46036x()
            androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r2.mo46134c()
            java.lang.Object r0 = r0.mo46164r(r1)
            java.util.List r0 = (java.util.List) r0
            androidx.compose.ui.semantics.j r1 = r12.mo45450c()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.mo46134c()
            java.lang.Object r1 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r1, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x04f2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            int r3 = r0.size()
            r4 = r16
        L_0x04b3:
            if (r4 >= r3) goto L_0x04c5
            java.lang.Object r5 = r0.get(r4)
            androidx.compose.ui.semantics.d r5 = (androidx.compose.p004ui.semantics.C16026d) r5
            java.lang.String r5 = r5.mo46100b()
            r2.add(r5)
            int r4 = r4 + 1
            goto L_0x04b3
        L_0x04c5:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r3 = r1.size()
            r4 = r16
        L_0x04d0:
            if (r4 >= r3) goto L_0x04e2
            java.lang.Object r5 = r1.get(r4)
            androidx.compose.ui.semantics.d r5 = (androidx.compose.p004ui.semantics.C16026d) r5
            java.lang.String r5 = r5.mo46100b()
            r0.add(r5)
            int r4 = r4 + 1
            goto L_0x04d0
        L_0x04e2:
            boolean r1 = r2.containsAll(r0)
            if (r1 == 0) goto L_0x0530
            boolean r0 = r0.containsAll(r2)
            if (r0 != 0) goto L_0x04ef
            goto L_0x0530
        L_0x04ef:
            r17 = r16
            goto L_0x0502
        L_0x04f2:
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0502
            r8 = r28
            r17 = 1
            goto L_0x0061
        L_0x0502:
            r8 = r28
            goto L_0x0061
        L_0x0506:
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof androidx.compose.p004ui.semantics.C16023a
            if (r1 == 0) goto L_0x0530
            java.lang.Object r1 = r0.getValue()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            androidx.compose.ui.semantics.a r1 = (androidx.compose.p004ui.semantics.C16023a) r1
            androidx.compose.ui.semantics.j r2 = r12.mo45450c()
            java.lang.Object r0 = r0.getKey()
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = (androidx.compose.p004ui.semantics.SemanticsPropertyKey) r0
            java.lang.Object r0 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r2, r0)
            boolean r0 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70921m(r1, r0)
            r17 = 1
            r17 = r0 ^ 1
            goto L_0x0502
        L_0x0530:
            r17 = 1
            goto L_0x0502
        L_0x0533:
            if (r17 != 0) goto L_0x0539
            boolean r17 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70907E(r14, r12)
        L_0x0539:
            if (r17 == 0) goto L_0x054e
            int r1 = r7.mo45429t0(r11)
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r27
            m70814w0(r0, r1, r2, r3, r4, r5, r6)
        L_0x054e:
            r8 = r28
            goto L_0x001f
        L_0x0552:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo45378A0(java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5 A[SYNTHETIC] */
    @androidx.annotation.C0344h1(otherwise = 2)
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45379B(@org.jetbrains.annotations.C12579k java.util.Collection<androidx.compose.p004ui.platform.C15981u3> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            java.lang.String r0 = "currentSemanticsNodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.compose.ui.geometry.f$a r0 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r0 = r0.mo42247c()
            boolean r0 = androidx.compose.p004ui.geometry.C15094f.m64876l(r9, r0)
            r1 = 0
            if (r0 != 0) goto L_0x00bd
            boolean r0 = androidx.compose.p004ui.geometry.C15094f.m64884t(r9)
            if (r0 != 0) goto L_0x001a
            goto L_0x00bd
        L_0x001a:
            r0 = 1
            if (r7 != r0) goto L_0x0024
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.p004ui.semantics.SemanticsProperties.f39725a
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.mo46045C()
            goto L_0x002c
        L_0x0024:
            if (r7 != 0) goto L_0x00b7
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.p004ui.semantics.SemanticsProperties.f39725a
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.mo46054i()
        L_0x002c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0039
            goto L_0x00b6
        L_0x0039:
            java.util.Iterator r6 = r6.iterator()
        L_0x003d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.u3 r2 = (androidx.compose.p004ui.platform.C15981u3) r2
            android.graphics.Rect r3 = r2.mo45968a()
            androidx.compose.ui.geometry.i r3 = androidx.compose.p004ui.graphics.C15315s3.m66547e(r3)
            boolean r3 = r3.mo42267f(r9)
            if (r3 != 0) goto L_0x0059
        L_0x0057:
            r2 = r1
            goto L_0x00b3
        L_0x0059:
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.mo45969b()
            androidx.compose.ui.semantics.j r2 = r2.mo46023k()
            java.lang.Object r2 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r2, r7)
            androidx.compose.ui.semantics.h r2 = (androidx.compose.p004ui.semantics.C16033h) r2
            if (r2 != 0) goto L_0x006a
            goto L_0x0057
        L_0x006a:
            boolean r3 = r2.mo46129b()
            if (r3 == 0) goto L_0x0072
            int r3 = -r8
            goto L_0x0073
        L_0x0072:
            r3 = r8
        L_0x0073:
            if (r8 != 0) goto L_0x007c
            boolean r4 = r2.mo46129b()
            if (r4 == 0) goto L_0x007c
            r3 = -1
        L_0x007c:
            if (r3 >= 0) goto L_0x0092
            kotlin.jvm.functions.a r2 = r2.mo46130c()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0057
            goto L_0x00b2
        L_0x0092:
            kotlin.jvm.functions.a r3 = r2.mo46130c()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            kotlin.jvm.functions.a r2 = r2.mo46128a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0057
        L_0x00b2:
            r2 = r0
        L_0x00b3:
            if (r2 == 0) goto L_0x003d
            r1 = r0
        L_0x00b6:
            return r1
        L_0x00b7:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x00bd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo45379B(java.util.Collection, boolean, int, long):boolean");
    }

    /* renamed from: B0 */
    public final void mo45380B0(SemanticsNode semanticsNode, C15764h hVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> t = semanticsNode.mo46032t();
        int size = t.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = t.get(i);
            if (mo45401O().containsKey(Integer.valueOf(semanticsNode2.mo46024l()))) {
                if (!hVar.mo45448a().contains(Integer.valueOf(semanticsNode2.mo46024l()))) {
                    mo45421g0(semanticsNode.mo46026n());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.mo46024l()));
            }
        }
        for (Integer intValue : hVar.mo45448a()) {
            if (!linkedHashSet.contains(Integer.valueOf(intValue.intValue()))) {
                mo45421g0(semanticsNode.mo46026n());
                return;
            }
        }
        List<SemanticsNode> t2 = semanticsNode.mo46032t();
        int size2 = t2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode3 = t2.get(i2);
            if (mo45401O().containsKey(Integer.valueOf(semanticsNode3.mo46024l()))) {
                C15764h hVar2 = this.f39207B.get(Integer.valueOf(semanticsNode3.mo46024l()));
                Intrinsics.checkNotNull(hVar2);
                mo45380B0(semanticsNode3, hVar2);
            }
        }
    }

    /* renamed from: C */
    public final void mo45381C() {
        mo45380B0(this.f39213d.getSemanticsOwner().mo46174b(), this.f39208C);
        mo45378A0(mo45401O());
        mo45411U0();
    }

    /* renamed from: C0 */
    public final void mo45382C0(LayoutNode layoutNode, C1869c<Integer> cVar) {
        LayoutNode d;
        C15703k1 j;
        if (layoutNode.mo44455k() && !this.f39213d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            C15703k1 j2 = C16040m.m72168j(layoutNode);
            if (j2 == null) {
                LayoutNode d2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70925q(layoutNode, C15781xdb31af5f.f39263f);
                if (d2 != null) {
                    j2 = C16040m.m72168j(d2);
                } else {
                    j2 = null;
                }
                if (j2 == null) {
                    return;
                }
            }
            if (!(C15706l1.m70387a(j2).mo46153M() || (d = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70925q(layoutNode, C15780x7245ac5.f39262f)) == null || (j = C16040m.m72168j(d)) == null)) {
                j2 = j;
            }
            int q = C15681e.m70235p(j2).mo44457q();
            if (cVar.add(Integer.valueOf(q))) {
                m70814w0(this, mo45429t0(q), 2048, 1, (List) null, 8, (Object) null);
            }
        }
    }

    /* renamed from: D */
    public final boolean mo45383D(int i) {
        if (!mo45417b0(i)) {
            return false;
        }
        this.f39222m = Integer.MIN_VALUE;
        this.f39213d.invalidate();
        m70814w0(this, i, 65536, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    /* renamed from: D0 */
    public final void mo45384D0(boolean z) {
        this.f39216g = z;
    }

    @C0344h1
    @C12579k
    /* renamed from: E */
    public final AccessibilityEvent mo45385E(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f39213d.getContext().getPackageName());
        obtain.setSource(this.f39213d, i);
        C15981u3 u3Var = mo45401O().get(Integer.valueOf(i));
        if (u3Var != null) {
            obtain.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70932x(u3Var.mo45969b()));
        }
        return obtain;
    }

    /* renamed from: E0 */
    public final boolean mo45386E0(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String S;
        Integer num;
        Integer num2;
        C16035j x = semanticsNode.mo46036x();
        C16034i iVar = C16034i.f39806a;
        boolean z2 = false;
        if (x.mo46161i(iVar.mo46150s()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(semanticsNode)) {
            C11305q qVar = (C11305q) ((C16023a) semanticsNode.mo46036x().mo46164r(iVar.mo46150s())).mo46088a();
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
            return false;
        } else if ((i == i2 && i2 == this.f39225p) || (S = mo45406S(semanticsNode)) == null) {
            return false;
        } else {
            if (i < 0 || i != i2 || i2 > S.length()) {
                i = -1;
            }
            this.f39225p = i;
            if (S.length() > 0) {
                z2 = true;
            }
            int t0 = mo45429t0(semanticsNode.mo46024l());
            Integer num3 = null;
            if (z2) {
                num = Integer.valueOf(this.f39225p);
            } else {
                num = null;
            }
            if (z2) {
                num2 = Integer.valueOf(this.f39225p);
            } else {
                num2 = null;
            }
            if (z2) {
                num3 = Integer.valueOf(S.length());
            }
            mo45430u0(mo45389G(t0, num, num2, num3, S));
            mo45434y0(semanticsNode.mo46024l());
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.accessibility.AccessibilityNodeInfo mo45387F(int r11) {
        /*
            r10 = this;
            androidx.compose.ui.platform.AndroidComposeView r0 = r10.f39213d
            androidx.compose.ui.platform.AndroidComposeView$b r0 = r0.getViewTreeOwners()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.w r0 = r0.mo45365a()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.Lifecycle$State r0 = r0.mo57465b()
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r2) goto L_0x0020
            return r1
        L_0x0020:
            androidx.core.view.accessibility.l0 r0 = androidx.core.view.accessibility.C18065l0.m81932F0()
            java.lang.String r2 = "obtain()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.util.Map r2 = r10.mo45401O()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Object r2 = r2.get(r3)
            androidx.compose.ui.platform.u3 r2 = (androidx.compose.p004ui.platform.C15981u3) r2
            if (r2 != 0) goto L_0x003a
            return r1
        L_0x003a:
            androidx.compose.ui.semantics.SemanticsNode r3 = r2.mo45969b()
            r4 = -1
            if (r11 != r4) goto L_0x0052
            androidx.compose.ui.platform.AndroidComposeView r4 = r10.f39213d
            android.view.ViewParent r4 = androidx.core.view.C18196h2.m82601l0(r4)
            boolean r5 = r4 instanceof android.view.View
            if (r5 == 0) goto L_0x004e
            r1 = r4
            android.view.View r1 = (android.view.View) r1
        L_0x004e:
            r0.mo52528C1(r1)
            goto L_0x007a
        L_0x0052:
            androidx.compose.ui.semantics.SemanticsNode r1 = r3.mo46029q()
            if (r1 == 0) goto L_0x00df
            androidx.compose.ui.semantics.SemanticsNode r1 = r3.mo46029q()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.mo46024l()
            androidx.compose.ui.platform.AndroidComposeView r5 = r10.f39213d
            androidx.compose.ui.semantics.n r5 = r5.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r5 = r5.mo46174b()
            int r5 = r5.mo46024l()
            if (r1 != r5) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r4 = r1
        L_0x0075:
            androidx.compose.ui.platform.AndroidComposeView r1 = r10.f39213d
            r0.mo52531D1(r1, r4)
        L_0x007a:
            androidx.compose.ui.platform.AndroidComposeView r1 = r10.f39213d
            r0.mo52554M1(r1, r11)
            android.graphics.Rect r1 = r2.mo45968a()
            androidx.compose.ui.platform.AndroidComposeView r2 = r10.f39213d
            int r4 = r1.left
            float r4 = (float) r4
            int r5 = r1.top
            float r5 = (float) r5
            long r4 = androidx.compose.p004ui.geometry.C15096g.m64898a(r4, r5)
            long r4 = r2.mo44077E(r4)
            androidx.compose.ui.platform.AndroidComposeView r2 = r10.f39213d
            int r6 = r1.right
            float r6 = (float) r6
            int r1 = r1.bottom
            float r1 = (float) r1
            long r6 = androidx.compose.p004ui.geometry.C15096g.m64898a(r6, r1)
            long r1 = r2.mo44077E(r6)
            android.graphics.Rect r6 = new android.graphics.Rect
            float r7 = androidx.compose.p004ui.geometry.C15094f.m64880p(r4)
            double r7 = (double) r7
            double r7 = java.lang.Math.floor(r7)
            float r7 = (float) r7
            int r7 = (int) r7
            float r4 = androidx.compose.p004ui.geometry.C15094f.m64882r(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            float r5 = androidx.compose.p004ui.geometry.C15094f.m64880p(r1)
            double r8 = (double) r5
            double r8 = java.lang.Math.ceil(r8)
            float r5 = (float) r8
            int r5 = (int) r5
            float r1 = androidx.compose.p004ui.geometry.C15094f.m64882r(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            r6.<init>(r7, r4, r5, r1)
            r0.mo52580V0(r6)
            r10.mo45425m0(r11, r0, r3)
            android.view.accessibility.AccessibilityNodeInfo r11 = r0.mo52601b2()
            return r11
        L_0x00df:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "semanticsNode "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " has null parent"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo45387F(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* renamed from: F0 */
    public final void mo45388F0(SemanticsNode semanticsNode, C18065l0 l0Var) {
        C16035j x = semanticsNode.mo46036x();
        SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
        if (x.mo46161i(semanticsProperties.mo46051f())) {
            l0Var.mo52610e1(true);
            l0Var.mo52630k1((CharSequence) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties.mo46051f()));
        }
    }

    /* renamed from: G */
    public final AccessibilityEvent mo45389G(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent E = mo45385E(i, 8192);
        if (num != null) {
            E.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            E.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            E.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            E.getText().add(charSequence);
        }
        return E;
    }

    /* renamed from: G0 */
    public final void mo45390G0(int i) {
        this.f39214e = i;
    }

    /* renamed from: H */
    public final boolean mo45391H(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (!mo45420f0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int a0 = mo45415a0(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.f39213d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            mo45409T0(a0);
            if (a0 == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        } else if (action != 10) {
            return false;
        } else {
            if (this.f39214e == Integer.MIN_VALUE) {
                return this.f39213d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            }
            mo45409T0(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: H0 */
    public final void mo45392H0(@C12579k Map<Integer, C15764h> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f39207B = map;
    }

    /* renamed from: I0 */
    public final void mo45393I0(SemanticsNode semanticsNode, C18065l0 l0Var) {
        SpannableString spannableString;
        C16156d dVar;
        C16242u.C16244b fontFamilyResolver = this.f39213d.getFontFamilyResolver();
        C16156d W = mo45412W(semanticsNode.mo46036x());
        SpannableString spannableString2 = null;
        if (W != null) {
            spannableString = C16363a.m73866c(W, this.f39213d.getDensity(), fontFamilyResolver);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) mo45407S0(spannableString, 100000);
        List list = (List) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), SemanticsProperties.f39725a.mo46070z());
        if (!(list == null || (dVar = (C16156d) CollectionsKt___CollectionsKt.m40479B2(list)) == null)) {
            spannableString2 = C16363a.m73866c(dVar, this.f39213d.getDensity(), fontFamilyResolver);
        }
        SpannableString spannableString4 = (SpannableString) mo45407S0(spannableString2, 100000);
        if (spannableString3 == null) {
            spannableString3 = spannableString4;
        }
        l0Var.mo52560O1(spannableString3);
    }

    /* renamed from: J */
    public final boolean mo45394J() {
        return this.f39216g;
    }

    /* renamed from: J0 */
    public final void mo45395J0() {
        SemanticsNode semanticsNode;
        this.f39233x.clear();
        this.f39234y.clear();
        C15981u3 u3Var = mo45401O().get(-1);
        if (u3Var != null) {
            semanticsNode = u3Var.mo45969b();
        } else {
            semanticsNode = null;
        }
        Intrinsics.checkNotNull(semanticsNode);
        List<SemanticsNode> N0 = mo45400N0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70933y(semanticsNode), CollectionsKt___CollectionsKt.m40572T5(semanticsNode.mo46021i()));
        int G = CollectionsKt__CollectionsKt.m40443G(N0);
        int i = 1;
        if (1 <= G) {
            while (true) {
                int l = N0.get(i - 1).mo46024l();
                int l2 = N0.get(i).mo46024l();
                this.f39233x.put(Integer.valueOf(l), Integer.valueOf(l2));
                this.f39234y.put(Integer.valueOf(l2), Integer.valueOf(l));
                if (i != G) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @C12579k
    /* renamed from: K */
    public final AccessibilityManager mo45396K() {
        return this.f39215f;
    }

    /* renamed from: K0 */
    public final List<SemanticsNode> mo45397K0(boolean z, List<SemanticsNode> list, Map<Integer, List<SemanticsNode>> map) {
        ArrayList arrayList = new ArrayList();
        int G = CollectionsKt__CollectionsKt.m40443G(list);
        if (G >= 0) {
            int i = 0;
            while (true) {
                SemanticsNode semanticsNode = list.get(i);
                if (i == 0 || !m70792M0(arrayList, semanticsNode)) {
                    arrayList.add(new Pair(semanticsNode.mo46020h(), CollectionsKt__CollectionsKt.m40452P(semanticsNode)));
                }
                if (i == G) {
                    break;
                }
                i++;
            }
        }
        C10992w.m42338m0(arrayList, C11006g.m42420h(C15782xa214d57f.f39264f, C15783xa214d580.f39265f));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            C10992w.m42338m0((List) pair.mo21851f(), mo45428r0(z));
            List list2 = (List) pair.mo21851f();
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) list2.get(i3);
                List list3 = map.get(Integer.valueOf(semanticsNode2.mo46024l()));
                if (list3 == null) {
                    list3 = CollectionsKt__CollectionsKt.m40452P(semanticsNode2);
                }
                arrayList2.addAll(list3);
            }
        }
        return arrayList2;
    }

    /* renamed from: M */
    public final int mo45398M(SemanticsNode semanticsNode) {
        C16035j x = semanticsNode.mo46036x();
        SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
        if (x.mo46161i(semanticsProperties.mo46048c()) || !semanticsNode.mo46036x().mo46161i(semanticsProperties.mo46043A())) {
            return this.f39225p;
        }
        return C16356n0.m73737i(((C16356n0) semanticsNode.mo46036x().mo46164r(semanticsProperties.mo46043A())).mo47427r());
    }

    /* renamed from: N */
    public final int mo45399N(SemanticsNode semanticsNode) {
        C16035j x = semanticsNode.mo46036x();
        SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
        if (x.mo46161i(semanticsProperties.mo46048c()) || !semanticsNode.mo46036x().mo46161i(semanticsProperties.mo46043A())) {
            return this.f39225p;
        }
        return C16356n0.m73742n(((C16356n0) semanticsNode.mo46036x().mo46164r(semanticsProperties.mo46043A())).mo47427r());
    }

    /* renamed from: N0 */
    public final List<SemanticsNode> mo45400N0(boolean z, List<SemanticsNode> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m70793O0(arrayList, linkedHashMap, this, z, list.get(i));
        }
        return mo45397K0(z, arrayList, linkedHashMap);
    }

    /* renamed from: O */
    public final Map<Integer, C15981u3> mo45401O() {
        if (this.f39229t) {
            this.f39229t = false;
            this.f39231v = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70926r(this.f39213d.getSemanticsOwner());
            mo45395J0();
        }
        return this.f39231v;
    }

    @C12579k
    /* renamed from: P */
    public final AccessibilityManager.AccessibilityStateChangeListener mo45402P() {
        return this.f39217h;
    }

    /* renamed from: P0 */
    public final RectF mo45403P0(SemanticsNode semanticsNode, C15098i iVar) {
        C15098i iVar2;
        if (semanticsNode == null) {
            return null;
        }
        C15098i S = iVar.mo42261S(semanticsNode.mo46030r());
        C15098i g = semanticsNode.mo46019g();
        if (S.mo42259Q(g)) {
            iVar2 = S.mo42255J(g);
        } else {
            iVar2 = null;
        }
        if (iVar2 == null) {
            return null;
        }
        long E = this.f39213d.mo44077E(C15096g.m64898a(iVar2.mo42279t(), iVar2.mo42249B()));
        long E2 = this.f39213d.mo44077E(C15096g.m64898a(iVar2.mo42283x(), iVar2.mo42271j()));
        return new RectF(C15094f.m64880p(E), C15094f.m64882r(E), C15094f.m64880p(E2), C15094f.m64882r(E2));
    }

    /* renamed from: R */
    public final int mo45404R() {
        return this.f39214e;
    }

    /* renamed from: R0 */
    public final boolean mo45405R0(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
        boolean z3;
        C15829a.C15839f T;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int l = semanticsNode.mo46024l();
        Integer num = this.f39226q;
        if (num == null || l != num.intValue()) {
            this.f39225p = -1;
            this.f39226q = Integer.valueOf(semanticsNode.mo46024l());
        }
        String S = mo45406S(semanticsNode);
        if (S == null || S.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || (T = mo45408T(semanticsNode, i)) == null) {
            return false;
        }
        int M = mo45398M(semanticsNode);
        if (M == -1) {
            if (z) {
                M = 0;
            } else {
                M = S.length();
            }
        }
        if (z) {
            iArr = T.mo45619a(M);
        } else {
            iArr = T.mo45620b(M);
        }
        if (iArr == null) {
            return false;
        }
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (!z2 || !mo45418c0(semanticsNode)) {
            if (z) {
                i5 = i7;
            } else {
                i5 = i6;
            }
            i2 = i3;
        } else {
            i3 = mo45399N(semanticsNode);
            if (i3 == -1) {
                if (z) {
                    i3 = i6;
                } else {
                    i3 = i7;
                }
            }
            if (z) {
                i2 = i7;
            } else {
                i2 = i6;
            }
        }
        if (z) {
            i4 = 256;
        } else {
            i4 = 512;
        }
        this.f39230u = new C15763g(semanticsNode, i4, i, i6, i7, SystemClock.uptimeMillis());
        SemanticsNode semanticsNode2 = semanticsNode;
        mo45386E0(semanticsNode, i3, i2, true);
        return true;
    }

    /* renamed from: S */
    public final String mo45406S(SemanticsNode semanticsNode) {
        C16156d dVar;
        if (semanticsNode == null) {
            return null;
        }
        C16035j x = semanticsNode.mo46036x();
        SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
        if (x.mo46161i(semanticsProperties.mo46048c())) {
            return C8781p.m32651f((List) semanticsNode.mo46036x().mo46164r(semanticsProperties.mo46048c()), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null);
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70903A(semanticsNode)) {
            C16156d W = mo45412W(semanticsNode.mo46036x());
            if (W != null) {
                return W.mo46683j();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties.mo46070z());
        if (list == null || (dVar = (C16156d) CollectionsKt___CollectionsKt.m40479B2(list)) == null) {
            return null;
        }
        return dVar.mo46683j();
    }

    /* renamed from: S0 */
    public final <T extends CharSequence> T mo45407S0(T t, @C0337f0(from = 1) int i) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!(t == null || t.length() == 0)) {
                z2 = false;
            }
            if (z2 || t.length() <= i) {
                return t;
            }
            int i2 = i - 1;
            if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
                i = i2;
            }
            T subSequence = t.subSequence(0, i);
            Intrinsics.checkNotNull(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
            return subSequence;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: T */
    public final C15829a.C15839f mo45408T(SemanticsNode semanticsNode, int i) {
        boolean z;
        Boolean bool;
        if (semanticsNode == null) {
            return null;
        }
        String S = mo45406S(semanticsNode);
        if (S == null || S.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (i == 1) {
            C15829a.C15831b.C15832a aVar = C15829a.C15831b.f39451e;
            Locale locale = this.f39213d.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale, "view.context.resources.configuration.locale");
            C15829a.C15831b a = aVar.mo45622a(locale);
            a.mo45617e(S);
            return a;
        } else if (i != 2) {
            if (i != 4) {
                if (i == 8) {
                    C15829a.C15837e a2 = C15829a.C15837e.f39469d.mo45631a();
                    a2.mo45617e(S);
                    return a2;
                } else if (i != 16) {
                    return null;
                }
            }
            C16035j x = semanticsNode.mo46036x();
            C16034i iVar = C16034i.f39806a;
            if (!x.mo46161i(iVar.mo46138g())) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            C11300l lVar = (C11300l) ((C16023a) semanticsNode.mo46036x().mo46164r(iVar.mo46138g())).mo46088a();
            if (lVar != null) {
                bool = (Boolean) lVar.invoke(arrayList);
            } else {
                bool = null;
            }
            if (!Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
                return null;
            }
            C16260h0 h0Var = (C16260h0) arrayList.get(0);
            if (i == 4) {
                C15829a.C15833c a3 = C15829a.C15833c.f39455e.mo45625a();
                a3.mo45624j(S, h0Var);
                return a3;
            }
            C15829a.C15835d a4 = C15829a.C15835d.f39461g.mo45628a();
            a4.mo45627j(S, h0Var, semanticsNode);
            return a4;
        } else {
            C15829a.C15840g.C15841a aVar2 = C15829a.C15840g.f39472e;
            Locale locale2 = this.f39213d.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale2, "view.context.resources.configuration.locale");
            C15829a.C15840g a5 = aVar2.mo45636a(locale2);
            a5.mo45617e(S);
            return a5;
        }
    }

    /* renamed from: T0 */
    public final void mo45409T0(int i) {
        int i2 = this.f39214e;
        if (i2 != i) {
            this.f39214e = i;
            m70814w0(this, i, 128, (Integer) null, (List) null, 12, (Object) null);
            m70814w0(this, i2, 256, (Integer) null, (List) null, 12, (Object) null);
        }
    }

    @C12579k
    /* renamed from: U */
    public final Map<Integer, C15764h> mo45410U() {
        return this.f39207B;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: U0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45411U0() {
        /*
            r6 = this;
            androidx.collection.c r0 = new androidx.collection.c
            r0.<init>()
            androidx.collection.c<java.lang.Integer> r1 = r6.f39232w
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0061
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.Map r3 = r6.mo45401O()
            java.lang.Object r3 = r3.get(r2)
            androidx.compose.ui.platform.u3 r3 = (androidx.compose.p004ui.platform.C15981u3) r3
            r4 = 0
            if (r3 == 0) goto L_0x0029
            androidx.compose.ui.semantics.SemanticsNode r3 = r3.mo45969b()
            goto L_0x002a
        L_0x0029:
            r3 = r4
        L_0x002a:
            if (r3 == 0) goto L_0x0032
            boolean r3 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70930v(r3)
            if (r3 != 0) goto L_0x000b
        L_0x0032:
            r0.add(r2)
            java.lang.String r3 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            int r3 = r2.intValue()
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h> r5 = r6.f39207B
            java.lang.Object r2 = r5.get(r2)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h r2 = (androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C15764h) r2
            if (r2 == 0) goto L_0x005b
            androidx.compose.ui.semantics.j r2 = r2.mo45450c()
            if (r2 == 0) goto L_0x005b
            androidx.compose.ui.semantics.SemanticsProperties r4 = androidx.compose.p004ui.semantics.SemanticsProperties.f39725a
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = r4.mo46062r()
            java.lang.Object r2 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r2, r4)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
        L_0x005b:
            r2 = 32
            r6.mo45432x0(r3, r2, r4)
            goto L_0x000b
        L_0x0061:
            androidx.collection.c<java.lang.Integer> r1 = r6.f39232w
            r1.mo6181y(r0)
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h> r0 = r6.f39207B
            r0.clear()
            java.util.Map r0 = r6.mo45401O()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0077:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e5
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.compose.ui.platform.u3 r2 = (androidx.compose.p004ui.platform.C15981u3) r2
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.mo45969b()
            boolean r2 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70930v(r2)
            if (r2 == 0) goto L_0x00c8
            androidx.collection.c<java.lang.Integer> r2 = r6.f39232w
            java.lang.Object r3 = r1.getKey()
            boolean r2 = r2.add(r3)
            if (r2 == 0) goto L_0x00c8
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r1.getValue()
            androidx.compose.ui.platform.u3 r3 = (androidx.compose.p004ui.platform.C15981u3) r3
            androidx.compose.ui.semantics.SemanticsNode r3 = r3.mo45969b()
            androidx.compose.ui.semantics.j r3 = r3.mo46036x()
            androidx.compose.ui.semantics.SemanticsProperties r4 = androidx.compose.p004ui.semantics.SemanticsProperties.f39725a
            androidx.compose.ui.semantics.SemanticsPropertyKey r4 = r4.mo46062r()
            java.lang.Object r3 = r3.mo46164r(r4)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 16
            r6.mo45432x0(r2, r4, r3)
        L_0x00c8:
            java.util.Map<java.lang.Integer, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h> r2 = r6.f39207B
            java.lang.Object r3 = r1.getKey()
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h r4 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.platform.u3 r1 = (androidx.compose.p004ui.platform.C15981u3) r1
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.mo45969b()
            java.util.Map r5 = r6.mo45401O()
            r4.<init>(r1, r5)
            r2.put(r3, r4)
            goto L_0x0077
        L_0x00e5:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h
            androidx.compose.ui.platform.AndroidComposeView r1 = r6.f39213d
            androidx.compose.ui.semantics.n r1 = r1.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.mo46174b()
            java.util.Map r2 = r6.mo45401O()
            r0.<init>(r1, r2)
            r6.f39208C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo45411U0():void");
    }

    /* renamed from: W */
    public final C16156d mo45412W(C16035j jVar) {
        return (C16156d) SemanticsConfigurationKt.m71865a(jVar, SemanticsProperties.f39725a.mo46050e());
    }

    @C12579k
    /* renamed from: X */
    public final AccessibilityManager.TouchExplorationStateChangeListener mo45413X() {
        return this.f39218i;
    }

    @C12579k
    /* renamed from: Z */
    public final AndroidComposeView mo45414Z() {
        return this.f39213d;
    }

    @C0344h1
    /* renamed from: a0 */
    public final int mo45415a0(float f, float f2) {
        LayoutNode p;
        C15703k1 k1Var = null;
        C15675c1.m70188b(this.f39213d, false, 1, (Object) null);
        C15707m mVar = new C15707m();
        LayoutNode.m69653M0(this.f39213d.getRoot(), C15096g.m64898a(f, f2), mVar, false, false, 12, (Object) null);
        C15703k1 k1Var2 = (C15703k1) CollectionsKt___CollectionsKt.m40677q3(mVar);
        if (!(k1Var2 == null || (p = C15681e.m70235p(k1Var2)) == null)) {
            k1Var = C16040m.m72168j(p);
        }
        if (k1Var != null && AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70904B(new SemanticsNode(k1Var, false, (LayoutNode) null, 4, (DefaultConstructorMarker) null))) {
            LayoutNode p2 = C15681e.m70235p(k1Var);
            if (this.f39213d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(p2) == null) {
                return mo45429t0(p2.mo44457q());
            }
        }
        return Integer.MIN_VALUE;
    }

    @C12579k
    /* renamed from: b */
    public C18089u0 mo45416b(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "host");
        return this.f39221l;
    }

    /* renamed from: b0 */
    public final boolean mo45417b0(int i) {
        return this.f39222m == i;
    }

    /* renamed from: c0 */
    public final boolean mo45418c0(SemanticsNode semanticsNode) {
        C16035j x = semanticsNode.mo46036x();
        SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
        if (x.mo46161i(semanticsProperties.mo46048c()) || !semanticsNode.mo46036x().mo46161i(semanticsProperties.mo46050e())) {
            return false;
        }
        return true;
    }

    /* renamed from: d0 */
    public final boolean mo45419d0() {
        if (this.f39216g) {
            return true;
        }
        if (this.f39215f.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.f39219j;
            Intrinsics.checkNotNullExpressionValue(list, "enabledServices");
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f0 */
    public final boolean mo45420f0() {
        if (this.f39216g || (this.f39215f.isEnabled() && this.f39215f.isTouchExplorationEnabled())) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    public final void mo45421g0(LayoutNode layoutNode) {
        if (this.f39227r.add(layoutNode)) {
            this.f39228s.mo23751L(C11079d2.f28267a);
        }
    }

    /* renamed from: h0 */
    public final void mo45422h0(@C12579k LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f39229t = true;
        if (mo45419d0()) {
            mo45421g0(layoutNode);
        }
    }

    /* renamed from: i0 */
    public final void mo45423i0() {
        this.f39229t = true;
        if (mo45419d0() && !this.f39209D) {
            this.f39209D = true;
            this.f39220k.post(this.f39210E);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r4v14, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019f  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45424j0(int r13, int r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.util.Map r0 = r12.mo45401O()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r0.get(r1)
            androidx.compose.ui.platform.u3 r0 = (androidx.compose.p004ui.platform.C15981u3) r0
            r1 = 0
            if (r0 == 0) goto L_0x05fc
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.mo45969b()
            if (r0 != 0) goto L_0x0019
            goto L_0x05fc
        L_0x0019:
            r2 = 64
            if (r14 == r2) goto L_0x05f7
            r2 = 128(0x80, float:1.794E-43)
            if (r14 == r2) goto L_0x05f2
            r2 = 256(0x100, float:3.59E-43)
            r3 = 1
            if (r14 == r2) goto L_0x05db
            r4 = 512(0x200, float:7.175E-43)
            if (r14 == r4) goto L_0x05db
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r14 == r2) goto L_0x05b6
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r14 == r2) goto L_0x058a
            boolean r2 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(r0)
            if (r2 != 0) goto L_0x0039
            return r1
        L_0x0039:
            if (r14 == r3) goto L_0x0565
            r2 = 2
            r4 = 0
            if (r14 == r2) goto L_0x0544
            switch(r14) {
                case 16: goto L_0x0511;
                case 32: goto L_0x04ec;
                case 4096: goto L_0x0356;
                case 8192: goto L_0x0356;
                case 32768: goto L_0x0331;
                case 65536: goto L_0x030c;
                case 262144: goto L_0x02e7;
                case 524288: goto L_0x02c2;
                case 1048576: goto L_0x029d;
                case 2097152: goto L_0x0261;
                case 16908342: goto L_0x0164;
                case 16908349: goto L_0x012c;
                default: goto L_0x0042;
            }
        L_0x0042:
            switch(r14) {
                case 16908344: goto L_0x0356;
                case 16908345: goto L_0x0356;
                case 16908346: goto L_0x0356;
                case 16908347: goto L_0x0356;
                default: goto L_0x0045;
            }
        L_0x0045:
            switch(r14) {
                case 16908358: goto L_0x0107;
                case 16908359: goto L_0x00e2;
                case 16908360: goto L_0x00bd;
                case 16908361: goto L_0x0098;
                default: goto L_0x0048;
            }
        L_0x0048:
            androidx.collection.m<androidx.collection.m<java.lang.CharSequence>> r15 = r12.f39223n
            java.lang.Object r13 = r15.mo6363k(r13)
            androidx.collection.m r13 = (androidx.collection.C1887m) r13
            if (r13 == 0) goto L_0x0097
            java.lang.Object r13 = r13.mo6363k(r14)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            if (r13 != 0) goto L_0x005b
            goto L_0x0097
        L_0x005b:
            androidx.compose.ui.semantics.j r14 = r0.mo46036x()
            androidx.compose.ui.semantics.i r15 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.mo46134c()
            java.lang.Object r14 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r14, r15)
            java.util.List r14 = (java.util.List) r14
            if (r14 != 0) goto L_0x006e
            return r1
        L_0x006e:
            int r15 = r14.size()
            r0 = r1
        L_0x0073:
            if (r0 >= r15) goto L_0x0097
            java.lang.Object r2 = r14.get(r0)
            androidx.compose.ui.semantics.d r2 = (androidx.compose.p004ui.semantics.C16026d) r2
            java.lang.String r3 = r2.mo46100b()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r13)
            if (r3 == 0) goto L_0x0094
            kotlin.jvm.functions.a r13 = r2.mo46099a()
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L_0x0094:
            int r0 = r0 + 1
            goto L_0x0073
        L_0x0097:
            return r1
        L_0x0098:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46143l()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x00bc
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x00bc
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x00bc:
            return r1
        L_0x00bd:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46142k()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x00e1
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x00e1
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x00e1:
            return r1
        L_0x00e2:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46141j()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x0106
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x0106
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0106:
            return r1
        L_0x0107:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46144m()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x012b
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x012b
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x012b:
            return r1
        L_0x012c:
            if (r15 == 0) goto L_0x0163
            java.lang.String r13 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r14 = r15.containsKey(r13)
            if (r14 != 0) goto L_0x0137
            goto L_0x0163
        L_0x0137:
            androidx.compose.ui.semantics.j r14 = r0.mo46036x()
            androidx.compose.ui.semantics.i r0 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.mo46149r()
            java.lang.Object r14 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r14, r0)
            androidx.compose.ui.semantics.a r14 = (androidx.compose.p004ui.semantics.C16023a) r14
            if (r14 == 0) goto L_0x0163
            kotlin.u r14 = r14.mo46088a()
            kotlin.jvm.functions.l r14 = (kotlin.jvm.functions.C11300l) r14
            if (r14 == 0) goto L_0x0163
            float r13 = r15.getFloat(r13)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r14.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0163:
            return r1
        L_0x0164:
            androidx.compose.ui.semantics.SemanticsNode r13 = r0.mo46029q()
            if (r13 == 0) goto L_0x017d
            androidx.compose.ui.semantics.j r14 = r13.mo46023k()
            if (r14 == 0) goto L_0x017d
            androidx.compose.ui.semantics.i r15 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.mo46147p()
            java.lang.Object r14 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r14, r15)
            androidx.compose.ui.semantics.a r14 = (androidx.compose.p004ui.semantics.C16023a) r14
            goto L_0x017e
        L_0x017d:
            r14 = r4
        L_0x017e:
            if (r13 == 0) goto L_0x019c
            if (r14 == 0) goto L_0x0183
            goto L_0x019c
        L_0x0183:
            androidx.compose.ui.semantics.SemanticsNode r13 = r13.mo46029q()
            if (r13 == 0) goto L_0x017d
            androidx.compose.ui.semantics.j r14 = r13.mo46023k()
            if (r14 == 0) goto L_0x017d
            androidx.compose.ui.semantics.i r15 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.mo46147p()
            java.lang.Object r14 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r14, r15)
            androidx.compose.ui.semantics.a r14 = (androidx.compose.p004ui.semantics.C16023a) r14
            goto L_0x017e
        L_0x019c:
            if (r13 != 0) goto L_0x019f
            return r1
        L_0x019f:
            androidx.compose.ui.layout.t r15 = r13.mo46025m()
            androidx.compose.ui.layout.o r15 = r15.mo44460v()
            androidx.compose.ui.geometry.i r15 = androidx.compose.p004ui.layout.C15591p.m69299a(r15)
            androidx.compose.ui.layout.t r2 = r13.mo46025m()
            androidx.compose.ui.layout.o r2 = r2.mo44460v()
            androidx.compose.ui.layout.o r2 = r2.mo44438w0()
            if (r2 == 0) goto L_0x01be
            long r4 = androidx.compose.p004ui.layout.C15591p.m69304f(r2)
            goto L_0x01c4
        L_0x01be:
            androidx.compose.ui.geometry.f$a r2 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r4 = r2.mo42248e()
        L_0x01c4:
            androidx.compose.ui.geometry.i r15 = r15.mo42261S(r4)
            long r4 = r0.mo46030r()
            long r6 = r0.mo46034v()
            long r6 = androidx.compose.p004ui.unit.C16502r.m74673f(r6)
            androidx.compose.ui.geometry.i r2 = androidx.compose.p004ui.geometry.C15100j.m64956c(r4, r6)
            androidx.compose.ui.semantics.j r4 = r13.mo46036x()
            androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.p004ui.semantics.SemanticsProperties.f39725a
            androidx.compose.ui.semantics.SemanticsPropertyKey r6 = r5.mo46054i()
            java.lang.Object r4 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r4, r6)
            androidx.compose.ui.semantics.h r4 = (androidx.compose.p004ui.semantics.C16033h) r4
            androidx.compose.ui.semantics.j r13 = r13.mo46036x()
            androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.mo46045C()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r5)
            androidx.compose.ui.semantics.h r13 = (androidx.compose.p004ui.semantics.C16033h) r13
            float r5 = r2.mo42279t()
            float r6 = r15.mo42279t()
            float r5 = r5 - r6
            float r6 = r2.mo42283x()
            float r7 = r15.mo42283x()
            float r6 = r6 - r7
            float r5 = m70800l0(r5, r6)
            if (r4 == 0) goto L_0x0216
            boolean r4 = r4.mo46129b()
            if (r4 != r3) goto L_0x0216
            r4 = r3
            goto L_0x0217
        L_0x0216:
            r4 = r1
        L_0x0217:
            if (r4 == 0) goto L_0x021a
            float r5 = -r5
        L_0x021a:
            boolean r0 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70933y(r0)
            if (r0 == 0) goto L_0x0221
            float r5 = -r5
        L_0x0221:
            float r0 = r2.mo42249B()
            float r4 = r15.mo42249B()
            float r0 = r0 - r4
            float r2 = r2.mo42271j()
            float r15 = r15.mo42271j()
            float r2 = r2 - r15
            float r15 = m70800l0(r0, r2)
            if (r13 == 0) goto L_0x0240
            boolean r13 = r13.mo46129b()
            if (r13 != r3) goto L_0x0240
            goto L_0x0241
        L_0x0240:
            r3 = r1
        L_0x0241:
            if (r3 == 0) goto L_0x0244
            float r15 = -r15
        L_0x0244:
            if (r14 == 0) goto L_0x0260
            kotlin.u r13 = r14.mo46088a()
            kotlin.jvm.functions.p r13 = (kotlin.jvm.functions.C11304p) r13
            if (r13 == 0) goto L_0x0260
            java.lang.Float r14 = java.lang.Float.valueOf(r5)
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            java.lang.Object r13 = r13.invoke(r14, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0260:
            return r1
        L_0x0261:
            if (r15 == 0) goto L_0x0269
            java.lang.String r13 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r4 = r15.getString(r13)
        L_0x0269:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46151t()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x029c
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.l r13 = (kotlin.jvm.functions.C11300l) r13
            if (r13 == 0) goto L_0x029c
            androidx.compose.ui.text.d r14 = new androidx.compose.ui.text.d
            if (r4 != 0) goto L_0x0289
            java.lang.String r4 = ""
        L_0x0289:
            r6 = r4
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r13 = r13.invoke(r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x029c:
            return r1
        L_0x029d:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46136e()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x02c1
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x02c1
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x02c1:
            return r1
        L_0x02c2:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46132a()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x02e6
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x02e6
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x02e6:
            return r1
        L_0x02e7:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46137f()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x030b
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x030b
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x030b:
            return r1
        L_0x030c:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46135d()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x0330
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x0330
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0330:
            return r1
        L_0x0331:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46145n()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x0355
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x0355
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0355:
            return r1
        L_0x0356:
            r13 = 4096(0x1000, float:5.74E-42)
            if (r14 != r13) goto L_0x035c
            r13 = r3
            goto L_0x035d
        L_0x035c:
            r13 = r1
        L_0x035d:
            r15 = 8192(0x2000, float:1.14794E-41)
            if (r14 != r15) goto L_0x0363
            r15 = r3
            goto L_0x0364
        L_0x0363:
            r15 = r1
        L_0x0364:
            r2 = 16908345(0x1020039, float:2.387739E-38)
            if (r14 != r2) goto L_0x036b
            r2 = r3
            goto L_0x036c
        L_0x036b:
            r2 = r1
        L_0x036c:
            r4 = 16908347(0x102003b, float:2.3877394E-38)
            if (r14 != r4) goto L_0x0373
            r4 = r3
            goto L_0x0374
        L_0x0373:
            r4 = r1
        L_0x0374:
            r5 = 16908344(0x1020038, float:2.3877386E-38)
            if (r14 != r5) goto L_0x037b
            r5 = r3
            goto L_0x037c
        L_0x037b:
            r5 = r1
        L_0x037c:
            r6 = 16908346(0x102003a, float:2.3877392E-38)
            if (r14 != r6) goto L_0x0383
            r14 = r3
            goto L_0x0384
        L_0x0383:
            r14 = r1
        L_0x0384:
            if (r2 != 0) goto L_0x038f
            if (r4 != 0) goto L_0x038f
            if (r13 != 0) goto L_0x038f
            if (r15 == 0) goto L_0x038d
            goto L_0x038f
        L_0x038d:
            r6 = r1
            goto L_0x0390
        L_0x038f:
            r6 = r3
        L_0x0390:
            if (r5 != 0) goto L_0x039b
            if (r14 != 0) goto L_0x039b
            if (r13 != 0) goto L_0x039b
            if (r15 == 0) goto L_0x0399
            goto L_0x039b
        L_0x0399:
            r14 = r1
            goto L_0x039c
        L_0x039b:
            r14 = r3
        L_0x039c:
            if (r13 != 0) goto L_0x03a0
            if (r15 == 0) goto L_0x0435
        L_0x03a0:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.p004ui.semantics.SemanticsProperties.f39725a
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.mo46064t()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r7)
            androidx.compose.ui.semantics.f r13 = (androidx.compose.p004ui.semantics.C16029f) r13
            androidx.compose.ui.semantics.j r7 = r0.mo46036x()
            androidx.compose.ui.semantics.i r8 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r8 = r8.mo46149r()
            java.lang.Object r7 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r7, r8)
            androidx.compose.ui.semantics.a r7 = (androidx.compose.p004ui.semantics.C16023a) r7
            if (r13 == 0) goto L_0x0435
            if (r7 == 0) goto L_0x0435
            kotlin.ranges.f r14 = r13.mo46111c()
            java.lang.Comparable r14 = r14.mo23013q()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            kotlin.ranges.f r0 = r13.mo46111c()
            java.lang.Comparable r0 = r0.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r14 = kotlin.ranges.C11479u.m44444t(r14, r0)
            kotlin.ranges.f r0 = r13.mo46111c()
            java.lang.Comparable r0 = r0.getStart()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            kotlin.ranges.f r2 = r13.mo46111c()
            java.lang.Comparable r2 = r2.mo23013q()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r0 = kotlin.ranges.C11479u.m44310A(r0, r2)
            int r2 = r13.mo46112d()
            if (r2 <= 0) goto L_0x0411
            float r14 = r14 - r0
            int r0 = r13.mo46112d()
            int r0 = r0 + r3
            goto L_0x0414
        L_0x0411:
            float r14 = r14 - r0
            r0 = 20
        L_0x0414:
            float r0 = (float) r0
            float r14 = r14 / r0
            if (r15 == 0) goto L_0x0419
            float r14 = -r14
        L_0x0419:
            kotlin.u r15 = r7.mo46088a()
            kotlin.jvm.functions.l r15 = (kotlin.jvm.functions.C11300l) r15
            if (r15 == 0) goto L_0x0434
            float r13 = r13.mo46110b()
            float r13 = r13 + r14
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r15.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0434:
            return r1
        L_0x0435:
            androidx.compose.ui.layout.t r13 = r0.mo46025m()
            androidx.compose.ui.layout.o r13 = r13.mo44460v()
            androidx.compose.ui.geometry.i r13 = androidx.compose.p004ui.layout.C15591p.m69299a(r13)
            long r7 = r13.mo42284z()
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r3 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.mo46147p()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r3)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 != 0) goto L_0x0458
            return r1
        L_0x0458:
            androidx.compose.ui.semantics.j r3 = r0.mo46036x()
            androidx.compose.ui.semantics.SemanticsProperties r9 = androidx.compose.p004ui.semantics.SemanticsProperties.f39725a
            androidx.compose.ui.semantics.SemanticsPropertyKey r10 = r9.mo46054i()
            java.lang.Object r3 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r3, r10)
            androidx.compose.ui.semantics.h r3 = (androidx.compose.p004ui.semantics.C16033h) r3
            r10 = 0
            if (r3 == 0) goto L_0x04a9
            if (r6 == 0) goto L_0x04a9
            float r6 = androidx.compose.p004ui.geometry.C15104m.m65023t(r7)
            if (r2 != 0) goto L_0x0475
            if (r15 == 0) goto L_0x0476
        L_0x0475:
            float r6 = -r6
        L_0x0476:
            boolean r11 = r3.mo46129b()
            if (r11 == 0) goto L_0x047d
            float r6 = -r6
        L_0x047d:
            boolean r11 = androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70933y(r0)
            if (r11 == 0) goto L_0x0488
            if (r2 != 0) goto L_0x0487
            if (r4 == 0) goto L_0x0488
        L_0x0487:
            float r6 = -r6
        L_0x0488:
            boolean r2 = m70799k0(r3, r6)
            if (r2 == 0) goto L_0x04a9
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.p r13 = (kotlin.jvm.functions.C11304p) r13
            if (r13 == 0) goto L_0x04a8
            java.lang.Float r14 = java.lang.Float.valueOf(r6)
            java.lang.Float r15 = java.lang.Float.valueOf(r10)
            java.lang.Object r13 = r13.invoke(r14, r15)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x04a8:
            return r1
        L_0x04a9:
            androidx.compose.ui.semantics.j r0 = r0.mo46036x()
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r9.mo46045C()
            java.lang.Object r0 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r0, r2)
            androidx.compose.ui.semantics.h r0 = (androidx.compose.p004ui.semantics.C16033h) r0
            if (r0 == 0) goto L_0x04eb
            if (r14 == 0) goto L_0x04eb
            float r14 = androidx.compose.p004ui.geometry.C15104m.m65016m(r7)
            if (r5 != 0) goto L_0x04c3
            if (r15 == 0) goto L_0x04c4
        L_0x04c3:
            float r14 = -r14
        L_0x04c4:
            boolean r15 = r0.mo46129b()
            if (r15 == 0) goto L_0x04cb
            float r14 = -r14
        L_0x04cb:
            boolean r15 = m70799k0(r0, r14)
            if (r15 == 0) goto L_0x04eb
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.p r13 = (kotlin.jvm.functions.C11304p) r13
            if (r13 == 0) goto L_0x04eb
            java.lang.Float r15 = java.lang.Float.valueOf(r10)
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            java.lang.Object r13 = r13.invoke(r15, r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x04eb:
            return r1
        L_0x04ec:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46140i()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x0510
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x0510
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0510:
            return r1
        L_0x0511:
            androidx.compose.ui.semantics.j r14 = r0.mo46036x()
            androidx.compose.ui.semantics.i r15 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r15 = r15.mo46139h()
            java.lang.Object r14 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r14, r15)
            androidx.compose.ui.semantics.a r14 = (androidx.compose.p004ui.semantics.C16023a) r14
            if (r14 == 0) goto L_0x0532
            kotlin.u r14 = r14.mo46088a()
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            if (r14 == 0) goto L_0x0532
            java.lang.Object r14 = r14.invoke()
            r4 = r14
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L_0x0532:
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            r5 = r12
            r6 = r13
            m70814w0(r5, r6, r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x0543
            boolean r1 = r4.booleanValue()
        L_0x0543:
            return r1
        L_0x0544:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.SemanticsProperties r14 = androidx.compose.p004ui.semantics.SemanticsProperties.f39725a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46052g()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x0564
            androidx.compose.ui.platform.AndroidComposeView r13 = r12.f39213d
            androidx.compose.ui.focus.p r13 = r13.getFocusOwner()
            androidx.compose.p004ui.focus.C15068j.m64745h(r13, r1, r3, r4)
            r1 = r3
        L_0x0564:
            return r1
        L_0x0565:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46146o()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x0589
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x0589
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x0589:
            return r1
        L_0x058a:
            r13 = -1
            if (r15 == 0) goto L_0x0594
            java.lang.String r14 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r14 = r15.getInt(r14, r13)
            goto L_0x0595
        L_0x0594:
            r14 = r13
        L_0x0595:
            if (r15 == 0) goto L_0x059d
            java.lang.String r2 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r13 = r15.getInt(r2, r13)
        L_0x059d:
            boolean r13 = r12.mo45386E0(r0, r14, r13, r1)
            if (r13 == 0) goto L_0x05b5
            int r14 = r0.mo46024l()
            int r1 = r12.mo45429t0(r14)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r12
            m70814w0(r0, r1, r2, r3, r4, r5, r6)
        L_0x05b5:
            return r13
        L_0x05b6:
            androidx.compose.ui.semantics.j r13 = r0.mo46036x()
            androidx.compose.ui.semantics.i r14 = androidx.compose.p004ui.semantics.C16034i.f39806a
            androidx.compose.ui.semantics.SemanticsPropertyKey r14 = r14.mo46133b()
            java.lang.Object r13 = androidx.compose.p004ui.semantics.SemanticsConfigurationKt.m71865a(r13, r14)
            androidx.compose.ui.semantics.a r13 = (androidx.compose.p004ui.semantics.C16023a) r13
            if (r13 == 0) goto L_0x05da
            kotlin.u r13 = r13.mo46088a()
            kotlin.jvm.functions.a r13 = (kotlin.jvm.functions.C11289a) r13
            if (r13 == 0) goto L_0x05da
            java.lang.Object r13 = r13.invoke()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r1 = r13.booleanValue()
        L_0x05da:
            return r1
        L_0x05db:
            if (r15 == 0) goto L_0x05f1
            java.lang.String r13 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r13 = r15.getInt(r13)
            java.lang.String r4 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r15 = r15.getBoolean(r4)
            if (r14 != r2) goto L_0x05ec
            r1 = r3
        L_0x05ec:
            boolean r13 = r12.mo45405R0(r0, r13, r1, r15)
            return r13
        L_0x05f1:
            return r1
        L_0x05f2:
            boolean r13 = r12.mo45383D(r13)
            return r13
        L_0x05f7:
            boolean r13 = r12.mo45427q0(r13)
            return r13
        L_0x05fc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo45424j0(int, int, android.os.Bundle):boolean");
    }

    @C0344h1
    /* renamed from: m0 */
    public final void mo45425m0(int i, @C12579k C18065l0 l0Var, @C12579k SemanticsNode semanticsNode) {
        Map map;
        C18065l0.C18066a aVar;
        C18065l0.C18066a aVar2;
        float f;
        int i2;
        boolean z;
        String str;
        String str2;
        int i3 = i;
        C18065l0 l0Var2 = l0Var;
        SemanticsNode semanticsNode2 = semanticsNode;
        Intrinsics.checkNotNullParameter(l0Var2, C28531e0.f69094x);
        Intrinsics.checkNotNullParameter(semanticsNode2, "semanticsNode");
        boolean z2 = !semanticsNode.mo46037y() && semanticsNode.mo46032t().isEmpty() && AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70925q(semanticsNode.mo46026n(), C15769x54deba10.f39253f) == null;
        l0Var2.mo52592Z0("android.view.View");
        C16035j x = semanticsNode.mo46036x();
        SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
        C16031g gVar = (C16031g) SemanticsConfigurationKt.m71865a(x, semanticsProperties.mo46065u());
        if (gVar != null) {
            int n = gVar.mo46119n();
            if (semanticsNode.mo46037y() || semanticsNode.mo46032t().isEmpty()) {
                C16031g.C16032a aVar3 = C16031g.f39793b;
                if (C16031g.m72096k(gVar.mo46119n(), aVar3.mo46127g())) {
                    l0Var2.mo52538G1(this.f39213d.getContext().getResources().getString(C8776o.C8779c.tab));
                } else {
                    if (C16031g.m72096k(gVar.mo46119n(), aVar3.mo46126f())) {
                        l0Var2.mo52538G1(this.f39213d.getContext().getResources().getString(C8776o.C8779c.switch_role));
                    } else {
                        if (C16031g.m72096k(n, aVar3.mo46121a())) {
                            str2 = Chip.f75003Y0;
                        } else if (C16031g.m72096k(n, aVar3.mo46122b())) {
                            str2 = "android.widget.CheckBox";
                        } else if (C16031g.m72096k(n, aVar3.mo46125e())) {
                            str2 = Chip.f75005a1;
                        } else if (C16031g.m72096k(n, aVar3.mo46124d())) {
                            str2 = "android.widget.ImageView";
                        } else {
                            str2 = C16031g.m72096k(n, aVar3.mo46123c()) ? "android.widget.Spinner" : null;
                        }
                        if (!C16031g.m72096k(gVar.mo46119n(), aVar3.mo46124d()) || z2 || semanticsNode.mo46036x().mo46153M()) {
                            l0Var2.mo52592Z0(str2);
                        }
                    }
                }
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70903A(semanticsNode)) {
            l0Var2.mo52592Z0(f39196K);
        }
        if (semanticsNode.mo46023k().mo46161i(semanticsProperties.mo46070z())) {
            l0Var2.mo52592Z0(f39197L);
        }
        l0Var2.mo52522A1(this.f39213d.getContext().getPackageName());
        l0Var2.mo52644p1(true);
        List<SemanticsNode> t = semanticsNode.mo46032t();
        int size = t.size();
        for (int i4 = 0; i4 < size; i4++) {
            SemanticsNode semanticsNode3 = t.get(i4);
            if (mo45401O().containsKey(Integer.valueOf(semanticsNode3.mo46024l()))) {
                AndroidViewHolder androidViewHolder = this.f39213d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode3.mo46026n());
                if (androidViewHolder != null) {
                    l0Var2.mo52602c(androidViewHolder);
                } else {
                    l0Var2.mo52605d(this.f39213d, semanticsNode3.mo46024l());
                }
            }
        }
        if (this.f39222m == i3) {
            l0Var2.mo52568R0(true);
            l0Var2.mo52598b(C18065l0.C18066a.f46676m);
        } else {
            l0Var2.mo52568R0(false);
            l0Var2.mo52598b(C18065l0.C18066a.f46675l);
        }
        mo45393I0(semanticsNode2, l0Var2);
        mo45388F0(semanticsNode2, l0Var2);
        C16035j x2 = semanticsNode.mo46036x();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.f39725a;
        l0Var2.mo52557N1((CharSequence) SemanticsConfigurationKt.m71865a(x2, semanticsProperties2.mo46068x()));
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties2.mo46044B());
        int i5 = 2;
        if (toggleableState != null) {
            l0Var2.mo52586X0(true);
            int i6 = C15765i.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i6 == 1) {
                l0Var2.mo52589Y0(true);
                if ((gVar == null ? false : C16031g.m72096k(gVar.mo46119n(), C16031g.f39793b.mo46126f())) && l0Var.mo52576U() == null) {
                    l0Var2.mo52557N1(this.f39213d.getContext().getResources().getString(C8776o.C8779c.f23493on));
                }
            } else if (i6 == 2) {
                l0Var2.mo52589Y0(false);
                if ((gVar == null ? false : C16031g.m72096k(gVar.mo46119n(), C16031g.f39793b.mo46126f())) && l0Var.mo52576U() == null) {
                    l0Var2.mo52557N1(this.f39213d.getContext().getResources().getString(C8776o.C8779c.off));
                }
            } else if (i6 == 3 && l0Var.mo52576U() == null) {
                l0Var2.mo52557N1(this.f39213d.getContext().getResources().getString(C8776o.C8779c.indeterminate));
            }
            C11079d2 d2Var2 = C11079d2.f28267a;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties2.mo46067w());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (gVar == null ? false : C16031g.m72096k(gVar.mo46119n(), C16031g.f39793b.mo46127g())) {
                l0Var2.mo52545J1(booleanValue);
            } else {
                l0Var2.mo52586X0(true);
                l0Var2.mo52589Y0(booleanValue);
                if (l0Var.mo52576U() == null) {
                    if (booleanValue) {
                        str = this.f39213d.getContext().getResources().getString(C8776o.C8779c.selected);
                    } else {
                        str = this.f39213d.getContext().getResources().getString(C8776o.C8779c.not_selected);
                    }
                    l0Var2.mo52557N1(str);
                }
            }
            C11079d2 d2Var3 = C11079d2.f28267a;
        }
        if (!semanticsNode.mo46036x().mo46153M() || semanticsNode.mo46032t().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties2.mo46048c());
            l0Var2.mo52607d1(list != null ? (String) CollectionsKt___CollectionsKt.m40479B2(list) : null);
        }
        String str3 = (String) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties2.mo46069y());
        if (str3 != null) {
            SemanticsNode semanticsNode4 = semanticsNode2;
            while (true) {
                if (semanticsNode4 == null) {
                    z = false;
                    break;
                }
                C16035j x3 = semanticsNode4.mo46036x();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.f39759a;
                if (x3.mo46161i(semanticsPropertiesAndroid.mo46079a())) {
                    z = ((Boolean) semanticsNode4.mo46036x().mo46164r(semanticsPropertiesAndroid.mo46079a())).booleanValue();
                    break;
                }
                semanticsNode4 = semanticsNode4.mo46029q();
            }
            if (z) {
                l0Var2.mo52593Z1(str3);
            }
        }
        C16035j x4 = semanticsNode.mo46036x();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.f39725a;
        if (((C11079d2) SemanticsConfigurationKt.m71865a(x4, semanticsProperties3.mo46053h())) != null) {
            l0Var2.mo52639n1(true);
            C11079d2 d2Var4 = C11079d2.f28267a;
        }
        l0Var2.mo52534E1(AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70932x(semanticsNode));
        l0Var2.mo52624i1(AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70903A(semanticsNode));
        l0Var2.mo52627j1(AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(semanticsNode));
        l0Var2.mo52633l1(semanticsNode.mo46036x().mo46161i(semanticsProperties3.mo46052g()));
        if (l0Var.mo52649r0()) {
            l0Var2.mo52636m1(((Boolean) semanticsNode.mo46036x().mo46164r(semanticsProperties3.mo46052g())).booleanValue());
            if (l0Var.mo52652s0()) {
                l0Var2.mo52594a(2);
            } else {
                l0Var2.mo52594a(1);
            }
        }
        l0Var2.mo52597a2(AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70904B(semanticsNode));
        C16027e eVar = (C16027e) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties3.mo46061q());
        if (eVar != null) {
            int i7 = eVar.mo46106i();
            C16027e.C16028a aVar4 = C16027e.f39783b;
            if (C16027e.m72075f(i7, aVar4.mo46109b()) || !C16027e.m72075f(i7, aVar4.mo46108a())) {
                i5 = 1;
            }
            l0Var2.mo52663v1(i5);
            C11079d2 d2Var5 = C11079d2.f28267a;
        }
        l0Var2.mo52596a1(false);
        C16035j x5 = semanticsNode.mo46036x();
        C16034i iVar = C16034i.f39806a;
        C16023a aVar5 = (C16023a) SemanticsConfigurationKt.m71865a(x5, iVar.mo46139h());
        if (aVar5 != null) {
            boolean areEqual = Intrinsics.areEqual(SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties3.mo46067w()), (Object) Boolean.TRUE);
            l0Var2.mo52596a1(!areEqual);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(semanticsNode) && !areEqual) {
                l0Var2.mo52598b(new C18065l0.C18066a(16, aVar5.mo46089b()));
            }
            C11079d2 d2Var6 = C11079d2.f28267a;
        }
        l0Var2.mo52666w1(false);
        C16023a aVar6 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46140i());
        if (aVar6 != null) {
            l0Var2.mo52666w1(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(semanticsNode)) {
                l0Var2.mo52598b(new C18065l0.C18066a(32, aVar6.mo46089b()));
            }
            C11079d2 d2Var7 = C11079d2.f28267a;
        }
        C16023a aVar7 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46133b());
        if (aVar7 != null) {
            l0Var2.mo52598b(new C18065l0.C18066a(16384, aVar7.mo46089b()));
            C11079d2 d2Var8 = C11079d2.f28267a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(semanticsNode)) {
            C16023a aVar8 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46151t());
            if (aVar8 != null) {
                l0Var2.mo52598b(new C18065l0.C18066a(2097152, aVar8.mo46089b()));
                C11079d2 d2Var9 = C11079d2.f28267a;
            }
            C16023a aVar9 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46135d());
            if (aVar9 != null) {
                l0Var2.mo52598b(new C18065l0.C18066a(65536, aVar9.mo46089b()));
                C11079d2 d2Var10 = C11079d2.f28267a;
            }
            C16023a aVar10 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46145n());
            if (aVar10 != null) {
                if (l0Var.mo52652s0() && this.f39213d.getClipboardManager().mo45723b()) {
                    l0Var2.mo52598b(new C18065l0.C18066a(32768, aVar10.mo46089b()));
                }
                C11079d2 d2Var11 = C11079d2.f28267a;
            }
        }
        String S = mo45406S(semanticsNode2);
        if (!(S == null || S.length() == 0)) {
            l0Var2.mo52569R1(mo45399N(semanticsNode2), mo45398M(semanticsNode2));
            C16023a aVar11 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46150s());
            l0Var2.mo52598b(new C18065l0.C18066a(131072, aVar11 != null ? aVar11.mo46089b() : null));
            l0Var2.mo52594a(256);
            l0Var2.mo52594a(512);
            l0Var2.mo52671y1(11);
            Collection collection = (List) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties3.mo46048c());
            if ((collection == null || collection.isEmpty()) && semanticsNode.mo46036x().mo46161i(iVar.mo46138g()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70923o(semanticsNode)) {
                l0Var2.mo52671y1(l0Var.mo52552M() | 4 | 16);
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence V = l0Var.mo52579V();
            if (!(V == null || V.length() == 0) && semanticsNode.mo46036x().mo46161i(iVar.mo46138g())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.mo46036x().mo46161i(semanticsProperties3.mo46069y())) {
                arrayList.add(f39199N);
            }
            if (!arrayList.isEmpty()) {
                C15865d dVar = C15865d.f39518a;
                AccessibilityNodeInfo b2 = l0Var.mo52601b2();
                Intrinsics.checkNotNullExpressionValue(b2, "info.unwrap()");
                dVar.mo45710a(b2, arrayList);
            }
        }
        C16029f fVar = (C16029f) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties3.mo46064t());
        if (fVar != null) {
            if (semanticsNode.mo46036x().mo46161i(iVar.mo46149r())) {
                l0Var2.mo52592Z0("android.widget.SeekBar");
            } else {
                l0Var2.mo52592Z0("android.widget.ProgressBar");
            }
            if (fVar != C16029f.f39787d.mo46116a()) {
                l0Var2.mo52536F1(C18065l0.C18070e.m82113e(1, fVar.mo46111c().getStart().floatValue(), fVar.mo46111c().mo23013q().floatValue(), fVar.mo46110b()));
                if (l0Var.mo52576U() == null) {
                    C11457f<Float> c = fVar.mo46111c();
                    if (c.mo23013q().floatValue() - c.getStart().floatValue() == 0.0f) {
                        f = 0.0f;
                    } else {
                        f = (fVar.mo46110b() - c.getStart().floatValue()) / (c.mo23013q().floatValue() - c.getStart().floatValue());
                    }
                    float H = C11479u.m44331H(f, 0.0f, 1.0f);
                    if (H == 0.0f) {
                        i2 = 0;
                    } else {
                        i2 = 100;
                        if (!(H == 1.0f)) {
                            i2 = C11479u.m44334I(C11409d.m43851L0(H * ((float) 100)), 1, 99);
                        }
                    }
                    l0Var2.mo52557N1(this.f39213d.getContext().getResources().getString(C8776o.C8779c.template_percent, new Object[]{Integer.valueOf(i2)}));
                }
            } else if (l0Var.mo52576U() == null) {
                l0Var2.mo52557N1(this.f39213d.getContext().getResources().getString(C8776o.C8779c.in_progress));
            }
            if (semanticsNode.mo46036x().mo46161i(iVar.mo46149r()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(semanticsNode)) {
                if (fVar.mo46110b() < C11479u.m44444t(fVar.mo46111c().mo23013q().floatValue(), fVar.mo46111c().getStart().floatValue())) {
                    l0Var2.mo52598b(C18065l0.C18066a.f46681r);
                }
                if (fVar.mo46110b() > C11479u.m44310A(fVar.mo46111c().getStart().floatValue(), fVar.mo46111c().mo23013q().floatValue())) {
                    l0Var2.mo52598b(C18065l0.C18066a.f46682s);
                }
            }
        }
        C15758b.m70876a(l0Var, semanticsNode);
        CollectionInfoKt.m71229d(semanticsNode2, l0Var2);
        CollectionInfoKt.m71230e(semanticsNode2, l0Var2);
        C16033h hVar = (C16033h) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties3.mo46054i());
        C16023a aVar12 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46147p());
        if (!(hVar == null || aVar12 == null)) {
            if (!CollectionInfoKt.m71227b(semanticsNode)) {
                l0Var2.mo52592Z0("android.widget.HorizontalScrollView");
            }
            if (hVar.mo46128a().invoke().floatValue() > 0.0f) {
                l0Var2.mo52542I1(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(semanticsNode)) {
                if (m70804o0(hVar)) {
                    l0Var2.mo52598b(C18065l0.C18066a.f46681r);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70933y(semanticsNode)) {
                        aVar2 = C18065l0.C18066a.f46652G;
                    } else {
                        aVar2 = C18065l0.C18066a.f46650E;
                    }
                    l0Var2.mo52598b(aVar2);
                }
                if (m70802n0(hVar)) {
                    l0Var2.mo52598b(C18065l0.C18066a.f46682s);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70933y(semanticsNode)) {
                        aVar = C18065l0.C18066a.f46650E;
                    } else {
                        aVar = C18065l0.C18066a.f46652G;
                    }
                    l0Var2.mo52598b(aVar);
                }
            }
        }
        C16033h hVar2 = (C16033h) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties3.mo46045C());
        if (!(hVar2 == null || aVar12 == null)) {
            if (!CollectionInfoKt.m71227b(semanticsNode)) {
                l0Var2.mo52592Z0("android.widget.ScrollView");
            }
            if (hVar2.mo46128a().invoke().floatValue() > 0.0f) {
                l0Var2.mo52542I1(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(semanticsNode)) {
                if (m70804o0(hVar2)) {
                    l0Var2.mo52598b(C18065l0.C18066a.f46681r);
                    l0Var2.mo52598b(C18065l0.C18066a.f46651F);
                }
                if (m70802n0(hVar2)) {
                    l0Var2.mo52598b(C18065l0.C18066a.f46682s);
                    l0Var2.mo52598b(C18065l0.C18066a.f46649D);
                }
            }
        }
        if (i8 >= 29) {
            C15760d.m70878a(l0Var, semanticsNode);
        }
        l0Var2.mo52525B1((CharSequence) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), semanticsProperties3.mo46062r()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70922n(semanticsNode)) {
            C16023a aVar13 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46137f());
            if (aVar13 != null) {
                l0Var2.mo52598b(new C18065l0.C18066a(262144, aVar13.mo46089b()));
                C11079d2 d2Var12 = C11079d2.f28267a;
            }
            C16023a aVar14 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46132a());
            if (aVar14 != null) {
                l0Var2.mo52598b(new C18065l0.C18066a(524288, aVar14.mo46089b()));
                C11079d2 d2Var13 = C11079d2.f28267a;
            }
            C16023a aVar15 = (C16023a) SemanticsConfigurationKt.m71865a(semanticsNode.mo46036x(), iVar.mo46136e());
            if (aVar15 != null) {
                l0Var2.mo52598b(new C18065l0.C18066a(1048576, aVar15.mo46089b()));
                C11079d2 d2Var14 = C11079d2.f28267a;
            }
            if (semanticsNode.mo46036x().mo46161i(iVar.mo46134c())) {
                List list2 = (List) semanticsNode.mo46036x().mo46164r(iVar.mo46134c());
                int size2 = list2.size();
                int[] iArr = f39205T;
                if (size2 < iArr.length) {
                    C1887m mVar = new C1887m();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.f39224o.mo6359f(i3)) {
                        Map k = this.f39224o.mo6363k(i3);
                        List<Integer> sz = ArraysKt___ArraysKt.m40203sz(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list2.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            C16026d dVar2 = (C16026d) list2.get(i9);
                            Intrinsics.checkNotNull(k);
                            if (k.containsKey(dVar2.mo46100b())) {
                                Integer num = (Integer) k.get(dVar2.mo46100b());
                                Intrinsics.checkNotNull(num);
                                map = k;
                                mVar.mo6369t(num.intValue(), dVar2.mo46100b());
                                linkedHashMap.put(dVar2.mo46100b(), num);
                                sz.remove(num);
                                l0Var2.mo52598b(new C18065l0.C18066a(num.intValue(), dVar2.mo46100b()));
                            } else {
                                map = k;
                                arrayList2.add(dVar2);
                            }
                            i9++;
                            SemanticsNode semanticsNode5 = semanticsNode;
                            k = map;
                        }
                        int size4 = arrayList2.size();
                        for (int i10 = 0; i10 < size4; i10++) {
                            C16026d dVar3 = (C16026d) arrayList2.get(i10);
                            int intValue = sz.get(i10).intValue();
                            mVar.mo6369t(intValue, dVar3.mo46100b());
                            linkedHashMap.put(dVar3.mo46100b(), Integer.valueOf(intValue));
                            l0Var2.mo52598b(new C18065l0.C18066a(intValue, dVar3.mo46100b()));
                        }
                    } else {
                        int size5 = list2.size();
                        for (int i11 = 0; i11 < size5; i11++) {
                            C16026d dVar4 = (C16026d) list2.get(i11);
                            int i12 = f39205T[i11];
                            mVar.mo6369t(i12, dVar4.mo46100b());
                            linkedHashMap.put(dVar4.mo46100b(), Integer.valueOf(i12));
                            l0Var2.mo52598b(new C18065l0.C18066a(i12, dVar4.mo46100b()));
                        }
                    }
                    this.f39223n.mo6369t(i3, mVar);
                    this.f39224o.mo6369t(i3, linkedHashMap);
                } else {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
            }
        }
        l0Var2.mo52540H1(semanticsNode.mo46036x().mo46153M() || (z2 && (l0Var.mo52520A() != null || l0Var.mo52579V() != null || l0Var.mo52535F() != null || l0Var.mo52576U() != null || l0Var.mo52626j0())));
        if (this.f39233x.get(Integer.valueOf(i)) != null) {
            Integer num2 = this.f39233x.get(Integer.valueOf(i));
            if (num2 != null) {
                l0Var2.mo52587X1(this.f39213d, num2.intValue());
                C11079d2 d2Var15 = C11079d2.f28267a;
            }
            AccessibilityNodeInfo b22 = l0Var.mo52601b2();
            Intrinsics.checkNotNullExpressionValue(b22, "info.unwrap()");
            mo45433y(i3, b22, this.f39235z, (Bundle) null);
        }
        if (this.f39234y.get(Integer.valueOf(i)) != null) {
            Integer num3 = this.f39234y.get(Integer.valueOf(i));
            if (num3 != null) {
                l0Var2.mo52581V1(this.f39213d, num3.intValue());
                C11079d2 d2Var16 = C11079d2.f28267a;
            }
            AccessibilityNodeInfo b23 = l0Var.mo52601b2();
            Intrinsics.checkNotNullExpressionValue(b23, "info.unwrap()");
            mo45433y(i3, b23, this.f39206A, (Bundle) null);
        }
    }

    /* renamed from: p0 */
    public final boolean mo45426p0(int i, List<C15975t3> list) {
        boolean z;
        C15975t3 p = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m70924p(list, i);
        if (p != null) {
            z = false;
        } else {
            p = new C15975t3(i, this.f39211F, (Float) null, (Float) null, (C16033h) null, (C16033h) null);
            z = true;
        }
        this.f39211F.add(p);
        return z;
    }

    /* renamed from: q0 */
    public final boolean mo45427q0(int i) {
        if (!mo45420f0() || mo45417b0(i)) {
            return false;
        }
        int i2 = this.f39222m;
        if (i2 != Integer.MIN_VALUE) {
            m70814w0(this, i2, 65536, (Integer) null, (List) null, 12, (Object) null);
        }
        this.f39222m = i;
        this.f39213d.invalidate();
        m70814w0(this, i, 32768, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    /* renamed from: r0 */
    public final Comparator<SemanticsNode> mo45428r0(boolean z) {
        Comparator h = C11006g.m42420h(C15774xc1aab54.f39258f, C15775xc1aab55.f39259f, C15776xc1aab56.f39260f, C15777xc1aab57.f39261f);
        if (z) {
            h = C11006g.m42420h(C15770x4da50560.f39254f, C15771x4da50561.f39255f, C15772x4da50562.f39256f, C15773x4da50563.f39257f);
        }
        return new C15767k(new C15766j(h, LayoutNode.f38817e1.mo44726c()));
    }

    /* renamed from: t0 */
    public final int mo45429t0(int i) {
        if (i == this.f39213d.getSemanticsOwner().mo46174b().mo46024l()) {
            return -1;
        }
        return i;
    }

    /* renamed from: u0 */
    public final boolean mo45430u0(AccessibilityEvent accessibilityEvent) {
        if (!mo45419d0()) {
            return false;
        }
        return this.f39213d.getParent().requestSendAccessibilityEvent(this.f39213d, accessibilityEvent);
    }

    /* renamed from: v0 */
    public final boolean mo45431v0(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !mo45419d0()) {
            return false;
        }
        AccessibilityEvent E = mo45385E(i, i2);
        if (num != null) {
            E.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            E.setContentDescription(C8781p.m32651f(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null));
        }
        return mo45430u0(E);
    }

    /* renamed from: x0 */
    public final void mo45432x0(int i, int i2, String str) {
        AccessibilityEvent E = mo45385E(mo45429t0(i), 32);
        E.setContentChangeTypes(i2);
        if (str != null) {
            E.getText().add(str);
        }
        mo45430u0(E);
    }

    /* renamed from: y */
    public final void mo45433y(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode b;
        String str2;
        int i2;
        Boolean bool;
        C15981u3 u3Var = mo45401O().get(Integer.valueOf(i));
        if (u3Var != null && (b = u3Var.mo45969b()) != null) {
            String S = mo45406S(b);
            if (Intrinsics.areEqual((Object) str, (Object) this.f39235z)) {
                Integer num = this.f39233x.get(Integer.valueOf(i));
                if (num != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                }
            } else if (Intrinsics.areEqual((Object) str, (Object) this.f39206A)) {
                Integer num2 = this.f39234y.get(Integer.valueOf(i));
                if (num2 != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                }
            } else {
                C16035j x = b.mo46036x();
                C16034i iVar = C16034i.f39806a;
                if (!x.mo46161i(iVar.mo46138g()) || bundle == null || !Intrinsics.areEqual((Object) str, (Object) "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    C16035j x2 = b.mo46036x();
                    SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
                    if (x2.mo46161i(semanticsProperties.mo46069y()) && bundle != null && Intrinsics.areEqual((Object) str, (Object) f39199N) && (str2 = (String) SemanticsConfigurationKt.m71865a(b.mo46036x(), semanticsProperties.mo46069y())) != null) {
                        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                        return;
                    }
                    return;
                }
                int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i4 > 0 && i3 >= 0) {
                    if (S != null) {
                        i2 = S.length();
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i3 < i2) {
                        ArrayList arrayList = new ArrayList();
                        C11300l lVar = (C11300l) ((C16023a) b.mo46036x().mo46164r(iVar.mo46138g())).mo46088a();
                        if (lVar != null) {
                            bool = (Boolean) lVar.invoke(arrayList);
                        } else {
                            bool = null;
                        }
                        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
                            C16260h0 h0Var = (C16260h0) arrayList.get(0);
                            ArrayList arrayList2 = new ArrayList();
                            for (int i5 = 0; i5 < i4; i5++) {
                                int i6 = i3 + i5;
                                if (i6 >= h0Var.mo47058l().mo47040n().length()) {
                                    arrayList2.add((Object) null);
                                } else {
                                    arrayList2.add(mo45403P0(b, h0Var.mo47048d(i6)));
                                }
                            }
                            accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: y0 */
    public final void mo45434y0(int i) {
        C15763g gVar = this.f39230u;
        if (gVar != null) {
            if (i == gVar.mo45445d().mo46024l()) {
                if (SystemClock.uptimeMillis() - gVar.mo45447f() <= 1000) {
                    AccessibilityEvent E = mo45385E(mo45429t0(gVar.mo45445d().mo46024l()), 131072);
                    E.setFromIndex(gVar.mo45443b());
                    E.setToIndex(gVar.mo45446e());
                    E.setAction(gVar.mo45442a());
                    E.setMovementGranularity(gVar.mo45444c());
                    E.getText().add(mo45406S(gVar.mo45445d()));
                    mo45430u0(E);
                }
            } else {
                return;
            }
        }
        this.f39230u = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[Catch:{ all -> 0x0051 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45435z(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.p004ui.platform.C15768x3d3eeeed
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = (androidx.compose.p004ui.platform.C15768x3d3eeeed) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.L$1
            androidx.collection.c r5 = (androidx.collection.C1869c) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            kotlin.C11661u0.m45747n(r11)     // Catch:{ all -> 0x0051 }
        L_0x0037:
            r11 = r5
            goto L_0x0063
        L_0x0039:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0041:
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.L$1
            androidx.collection.c r5 = (androidx.collection.C1869c) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            kotlin.C11661u0.m45747n(r11)     // Catch:{ all -> 0x0051 }
            goto L_0x0075
        L_0x0051:
            r11 = move-exception
            goto L_0x00d0
        L_0x0054:
            kotlin.C11661u0.m45747n(r11)
            androidx.collection.c r11 = new androidx.collection.c     // Catch:{ all -> 0x00ce }
            r11.<init>()     // Catch:{ all -> 0x00ce }
            kotlinx.coroutines.channels.g<kotlin.d2> r2 = r10.f39228s     // Catch:{ all -> 0x00ce }
            kotlinx.coroutines.channels.ChannelIterator r2 = r2.iterator()     // Catch:{ all -> 0x00ce }
            r6 = r10
        L_0x0063:
            r0.L$0 = r6     // Catch:{ all -> 0x0051 }
            r0.L$1 = r11     // Catch:{ all -> 0x0051 }
            r0.L$2 = r2     // Catch:{ all -> 0x0051 }
            r0.label = r4     // Catch:{ all -> 0x0051 }
            java.lang.Object r5 = r2.mo23863c(r0)     // Catch:{ all -> 0x0051 }
            if (r5 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r9 = r5
            r5 = r11
            r11 = r9
        L_0x0075:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0051 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0051 }
            if (r11 == 0) goto L_0x00c6
            r2.next()     // Catch:{ all -> 0x0051 }
            boolean r11 = r6.mo45419d0()     // Catch:{ all -> 0x0051 }
            if (r11 == 0) goto L_0x00b0
            androidx.collection.c<androidx.compose.ui.node.LayoutNode> r11 = r6.f39227r     // Catch:{ all -> 0x0051 }
            int r11 = r11.size()     // Catch:{ all -> 0x0051 }
            r7 = 0
        L_0x008d:
            if (r7 >= r11) goto L_0x00a0
            androidx.collection.c<androidx.compose.ui.node.LayoutNode> r8 = r6.f39227r     // Catch:{ all -> 0x0051 }
            java.lang.Object r8 = r8.mo6157H(r7)     // Catch:{ all -> 0x0051 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch:{ all -> 0x0051 }
            androidx.compose.ui.node.LayoutNode r8 = (androidx.compose.p004ui.node.LayoutNode) r8     // Catch:{ all -> 0x0051 }
            r6.mo45382C0(r8, r5)     // Catch:{ all -> 0x0051 }
            int r7 = r7 + 1
            goto L_0x008d
        L_0x00a0:
            r5.clear()     // Catch:{ all -> 0x0051 }
            boolean r11 = r6.f39209D     // Catch:{ all -> 0x0051 }
            if (r11 != 0) goto L_0x00b0
            r6.f39209D = r4     // Catch:{ all -> 0x0051 }
            android.os.Handler r11 = r6.f39220k     // Catch:{ all -> 0x0051 }
            java.lang.Runnable r7 = r6.f39210E     // Catch:{ all -> 0x0051 }
            r11.post(r7)     // Catch:{ all -> 0x0051 }
        L_0x00b0:
            androidx.collection.c<androidx.compose.ui.node.LayoutNode> r11 = r6.f39227r     // Catch:{ all -> 0x0051 }
            r11.clear()     // Catch:{ all -> 0x0051 }
            r0.L$0 = r6     // Catch:{ all -> 0x0051 }
            r0.L$1 = r5     // Catch:{ all -> 0x0051 }
            r0.L$2 = r2     // Catch:{ all -> 0x0051 }
            r0.label = r3     // Catch:{ all -> 0x0051 }
            r7 = 100
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.m45925b(r7, r0)     // Catch:{ all -> 0x0051 }
            if (r11 != r1) goto L_0x0037
            return r1
        L_0x00c6:
            androidx.collection.c<androidx.compose.ui.node.LayoutNode> r11 = r6.f39227r
            r11.clear()
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        L_0x00ce:
            r11 = move-exception
            r6 = r10
        L_0x00d0:
            androidx.collection.c<androidx.compose.ui.node.LayoutNode> r0 = r6.f39227r
            r0.clear()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat.mo45435z(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: z0 */
    public final void mo45436z0(C15975t3 t3Var) {
        if (t3Var.mo44553e0()) {
            this.f39213d.getSnapshotObserver().mo44918i(t3Var, this.f39212G, new C15778x595e4e0d(t3Var, this));
        }
    }
}
