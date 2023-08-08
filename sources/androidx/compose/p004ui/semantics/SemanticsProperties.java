package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.state.ToggleableState;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.C16310p;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties */
public final class SemanticsProperties {
    @C12579k

    /* renamed from: A */
    public static final SemanticsPropertyKey<C11079d2> f39721A = new SemanticsPropertyKey<>("Password", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: B */
    public static final SemanticsPropertyKey<String> f39722B = new SemanticsPropertyKey<>("Error", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: C */
    public static final SemanticsPropertyKey<C11300l<Object, Integer>> f39723C = new SemanticsPropertyKey<>("IndexForKey", (C11304p) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: D */
    public static final int f39724D = 0;
    @C12579k

    /* renamed from: a */
    public static final SemanticsProperties f39725a = new SemanticsProperties();
    @C12579k

    /* renamed from: b */
    public static final SemanticsPropertyKey<List<String>> f39726b = new SemanticsPropertyKey<>("ContentDescription", SemanticsProperties$ContentDescription$1.f39751f);
    @C12579k

    /* renamed from: c */
    public static final SemanticsPropertyKey<String> f39727c = new SemanticsPropertyKey<>("StateDescription", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public static final SemanticsPropertyKey<C16029f> f39728d = new SemanticsPropertyKey<>("ProgressBarRangeInfo", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final SemanticsPropertyKey<String> f39729e = new SemanticsPropertyKey<>("PaneTitle", SemanticsProperties$PaneTitle$1.f39755f);
    @C12579k

    /* renamed from: f */
    public static final SemanticsPropertyKey<C11079d2> f39730f = new SemanticsPropertyKey<>("SelectableGroup", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: g */
    public static final SemanticsPropertyKey<C16024b> f39731g = new SemanticsPropertyKey<>("CollectionInfo", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: h */
    public static final SemanticsPropertyKey<C16025c> f39732h = new SemanticsPropertyKey<>("CollectionItemInfo", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: i */
    public static final SemanticsPropertyKey<C11079d2> f39733i = new SemanticsPropertyKey<>("Heading", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: j */
    public static final SemanticsPropertyKey<C11079d2> f39734j = new SemanticsPropertyKey<>("Disabled", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: k */
    public static final SemanticsPropertyKey<C16027e> f39735k = new SemanticsPropertyKey<>("LiveRegion", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: l */
    public static final SemanticsPropertyKey<Boolean> f39736l = new SemanticsPropertyKey<>("Focused", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: m */
    public static final SemanticsPropertyKey<Boolean> f39737m = new SemanticsPropertyKey<>("IsContainer", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: n */
    public static final SemanticsPropertyKey<C11079d2> f39738n = new SemanticsPropertyKey<>("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.f39752f);
    @C12579k

    /* renamed from: o */
    public static final SemanticsPropertyKey<C16033h> f39739o = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: p */
    public static final SemanticsPropertyKey<C16033h> f39740p = new SemanticsPropertyKey<>("VerticalScrollAxisRange", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: q */
    public static final SemanticsPropertyKey<C11079d2> f39741q = new SemanticsPropertyKey<>("IsPopup", SemanticsProperties$IsPopup$1.f39754f);
    @C12579k

    /* renamed from: r */
    public static final SemanticsPropertyKey<C11079d2> f39742r = new SemanticsPropertyKey<>("IsDialog", SemanticsProperties$IsDialog$1.f39753f);
    @C12579k

    /* renamed from: s */
    public static final SemanticsPropertyKey<C16031g> f39743s = new SemanticsPropertyKey<>("Role", SemanticsProperties$Role$1.f39756f);
    @C12579k

    /* renamed from: t */
    public static final SemanticsPropertyKey<String> f39744t = new SemanticsPropertyKey<>("TestTag", SemanticsProperties$TestTag$1.f39757f);
    @C12579k

    /* renamed from: u */
    public static final SemanticsPropertyKey<List<C16156d>> f39745u = new SemanticsPropertyKey<>("Text", SemanticsProperties$Text$1.f39758f);
    @C12579k

    /* renamed from: v */
    public static final SemanticsPropertyKey<C16156d> f39746v = new SemanticsPropertyKey<>("EditableText", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: w */
    public static final SemanticsPropertyKey<C16356n0> f39747w = new SemanticsPropertyKey<>("TextSelectionRange", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: x */
    public static final SemanticsPropertyKey<C16310p> f39748x = new SemanticsPropertyKey<>("ImeAction", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: y */
    public static final SemanticsPropertyKey<Boolean> f39749y = new SemanticsPropertyKey<>("Selected", (C11304p) null, 2, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: z */
    public static final SemanticsPropertyKey<ToggleableState> f39750z = new SemanticsPropertyKey<>("ToggleableState", (C11304p) null, 2, (DefaultConstructorMarker) null);

    @C8761g
    /* renamed from: m */
    public static /* synthetic */ void m71906m() {
    }

    @C12579k
    /* renamed from: A */
    public final SemanticsPropertyKey<C16356n0> mo46043A() {
        return f39747w;
    }

    @C12579k
    /* renamed from: B */
    public final SemanticsPropertyKey<ToggleableState> mo46044B() {
        return f39750z;
    }

    @C12579k
    /* renamed from: C */
    public final SemanticsPropertyKey<C16033h> mo46045C() {
        return f39740p;
    }

    @C12579k
    /* renamed from: a */
    public final SemanticsPropertyKey<C16024b> mo46046a() {
        return f39731g;
    }

    @C12579k
    /* renamed from: b */
    public final SemanticsPropertyKey<C16025c> mo46047b() {
        return f39732h;
    }

    @C12579k
    /* renamed from: c */
    public final SemanticsPropertyKey<List<String>> mo46048c() {
        return f39726b;
    }

    @C12579k
    /* renamed from: d */
    public final SemanticsPropertyKey<C11079d2> mo46049d() {
        return f39734j;
    }

    @C12579k
    /* renamed from: e */
    public final SemanticsPropertyKey<C16156d> mo46050e() {
        return f39746v;
    }

    @C12579k
    /* renamed from: f */
    public final SemanticsPropertyKey<String> mo46051f() {
        return f39722B;
    }

    @C12579k
    /* renamed from: g */
    public final SemanticsPropertyKey<Boolean> mo46052g() {
        return f39736l;
    }

    @C12579k
    /* renamed from: h */
    public final SemanticsPropertyKey<C11079d2> mo46053h() {
        return f39733i;
    }

    @C12579k
    /* renamed from: i */
    public final SemanticsPropertyKey<C16033h> mo46054i() {
        return f39739o;
    }

    @C12579k
    /* renamed from: j */
    public final SemanticsPropertyKey<C16310p> mo46055j() {
        return f39748x;
    }

    @C12579k
    /* renamed from: k */
    public final SemanticsPropertyKey<C11300l<Object, Integer>> mo46056k() {
        return f39723C;
    }

    @C12579k
    /* renamed from: l */
    public final SemanticsPropertyKey<C11079d2> mo46057l() {
        return f39738n;
    }

    @C12579k
    /* renamed from: n */
    public final SemanticsPropertyKey<Boolean> mo46058n() {
        return f39737m;
    }

    @C12579k
    /* renamed from: o */
    public final SemanticsPropertyKey<C11079d2> mo46059o() {
        return f39742r;
    }

    @C12579k
    /* renamed from: p */
    public final SemanticsPropertyKey<C11079d2> mo46060p() {
        return f39741q;
    }

    @C12579k
    /* renamed from: q */
    public final SemanticsPropertyKey<C16027e> mo46061q() {
        return f39735k;
    }

    @C12579k
    /* renamed from: r */
    public final SemanticsPropertyKey<String> mo46062r() {
        return f39729e;
    }

    @C12579k
    /* renamed from: s */
    public final SemanticsPropertyKey<C11079d2> mo46063s() {
        return f39721A;
    }

    @C12579k
    /* renamed from: t */
    public final SemanticsPropertyKey<C16029f> mo46064t() {
        return f39728d;
    }

    @C12579k
    /* renamed from: u */
    public final SemanticsPropertyKey<C16031g> mo46065u() {
        return f39743s;
    }

    @C12579k
    /* renamed from: v */
    public final SemanticsPropertyKey<C11079d2> mo46066v() {
        return f39730f;
    }

    @C12579k
    /* renamed from: w */
    public final SemanticsPropertyKey<Boolean> mo46067w() {
        return f39749y;
    }

    @C12579k
    /* renamed from: x */
    public final SemanticsPropertyKey<String> mo46068x() {
        return f39727c;
    }

    @C12579k
    /* renamed from: y */
    public final SemanticsPropertyKey<String> mo46069y() {
        return f39744t;
    }

    @C12579k
    /* renamed from: z */
    public final SemanticsPropertyKey<List<C16156d>> mo46070z() {
        return f39745u;
    }
}
