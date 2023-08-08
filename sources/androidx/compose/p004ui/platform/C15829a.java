package androidx.compose.p004ui.platform;

import android.graphics.Rect;
import androidx.compose.p004ui.semantics.SemanticsNode;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.C8567o;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.a */
public final class C15829a {

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.a$a */
    public static abstract class C15830a implements C15839f {

        /* renamed from: c */
        public static final int f39448c = 8;

        /* renamed from: a */
        public String f39449a;
        @C12579k

        /* renamed from: b */
        public final int[] f39450b = new int[2];

        @C12580l
        /* renamed from: c */
        public final int[] mo45615c(int i, int i2) {
            if (i < 0 || i2 < 0 || i == i2) {
                return null;
            }
            int[] iArr = this.f39450b;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }

        @C12579k
        /* renamed from: d */
        public final String mo45616d() {
            String str = this.f39449a;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("text");
            return null;
        }

        /* renamed from: e */
        public void mo45617e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "text");
            mo45618f(str);
        }

        /* renamed from: f */
        public final void mo45618f(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f39449a = str;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.a$b */
    public static class C15831b extends C15830a {
        @C12579k

        /* renamed from: e */
        public static final C15832a f39451e = new C15832a((DefaultConstructorMarker) null);

        /* renamed from: f */
        public static final int f39452f = 8;
        @C12580l

        /* renamed from: g */
        public static C15831b f39453g;

        /* renamed from: d */
        public BreakIterator f39454d;

        /* renamed from: androidx.compose.ui.platform.a$b$a */
        public static final class C15832a {
            public /* synthetic */ C15832a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C15831b mo45622a(@C12579k Locale locale) {
                Intrinsics.checkNotNullParameter(locale, "locale");
                if (C15831b.f39453g == null) {
                    C15831b.f39453g = new C15831b(locale, (DefaultConstructorMarker) null);
                }
                C15831b g = C15831b.f39453g;
                Intrinsics.checkNotNull(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return g;
            }

            public C15832a() {
            }
        }

        public /* synthetic */ C15831b(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        @C12580l
        /* renamed from: a */
        public int[] mo45619a(int i) {
            int length = mo45616d().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            do {
                BreakIterator breakIterator = this.f39454d;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.f39454d;
                    if (breakIterator2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    i = breakIterator2.following(i);
                } else {
                    BreakIterator breakIterator3 = this.f39454d;
                    if (breakIterator3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator3 = null;
                    }
                    int following = breakIterator3.following(i);
                    if (following == -1) {
                        return null;
                    }
                    return mo45615c(i, following);
                }
            } while (i != -1);
            return null;
        }

        @C12580l
        /* renamed from: b */
        public int[] mo45620b(int i) {
            int length = mo45616d().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            do {
                BreakIterator breakIterator = this.f39454d;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.f39454d;
                    if (breakIterator2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    i = breakIterator2.preceding(i);
                } else {
                    BreakIterator breakIterator3 = this.f39454d;
                    if (breakIterator3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator3 = null;
                    }
                    int preceding = breakIterator3.preceding(i);
                    if (preceding == -1) {
                        return null;
                    }
                    return mo45615c(preceding, i);
                }
            } while (i != -1);
            return null;
        }

        /* renamed from: e */
        public void mo45617e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "text");
            super.mo45617e(str);
            BreakIterator breakIterator = this.f39454d;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        /* renamed from: i */
        public final void mo45621i(Locale locale) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
            Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(locale)");
            this.f39454d = characterInstance;
        }

        public C15831b(Locale locale) {
            mo45621i(locale);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.a$c */
    public static final class C15833c extends C15830a {
        @C12579k

        /* renamed from: e */
        public static final C15834a f39455e = new C15834a((DefaultConstructorMarker) null);

        /* renamed from: f */
        public static final int f39456f = 8;
        @C12580l

        /* renamed from: g */
        public static C15833c f39457g;
        @C12579k

        /* renamed from: h */
        public static final ResolvedTextDirection f39458h = ResolvedTextDirection.Rtl;
        @C12579k

        /* renamed from: i */
        public static final ResolvedTextDirection f39459i = ResolvedTextDirection.Ltr;

        /* renamed from: d */
        public C16260h0 f39460d;

        /* renamed from: androidx.compose.ui.platform.a$c$a */
        public static final class C15834a {
            public /* synthetic */ C15834a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C15833c mo45625a() {
                if (C15833c.f39457g == null) {
                    C15833c.f39457g = new C15833c((DefaultConstructorMarker) null);
                }
                C15833c g = C15833c.f39457g;
                Intrinsics.checkNotNull(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return g;
            }

            public C15834a() {
            }
        }

        public /* synthetic */ C15833c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public int[] mo45619a(int i) {
            int i2;
            if (mo45616d().length() <= 0 || i >= mo45616d().length()) {
                return null;
            }
            if (i < 0) {
                C16260h0 h0Var = this.f39460d;
                if (h0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    h0Var = null;
                }
                i2 = h0Var.mo47062q(0);
            } else {
                C16260h0 h0Var2 = this.f39460d;
                if (h0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    h0Var2 = null;
                }
                int q = h0Var2.mo47062q(i);
                if (mo45623i(q, f39458h) == i) {
                    i2 = q;
                } else {
                    i2 = q + 1;
                }
            }
            C16260h0 h0Var3 = this.f39460d;
            if (h0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                h0Var3 = null;
            }
            if (i2 >= h0Var3.mo47060n()) {
                return null;
            }
            return mo45615c(mo45623i(i2, f39458h), mo45623i(i2, f39459i) + 1);
        }

        @C12580l
        /* renamed from: b */
        public int[] mo45620b(int i) {
            int i2;
            if (mo45616d().length() <= 0 || i <= 0) {
                return null;
            }
            if (i > mo45616d().length()) {
                C16260h0 h0Var = this.f39460d;
                if (h0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    h0Var = null;
                }
                i2 = h0Var.mo47062q(mo45616d().length());
            } else {
                C16260h0 h0Var2 = this.f39460d;
                if (h0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    h0Var2 = null;
                }
                int q = h0Var2.mo47062q(i);
                if (mo45623i(q, f39459i) + 1 == i) {
                    i2 = q;
                } else {
                    i2 = q - 1;
                }
            }
            if (i2 < 0) {
                return null;
            }
            return mo45615c(mo45623i(i2, f39458h), mo45623i(i2, f39459i) + 1);
        }

        /* renamed from: i */
        public final int mo45623i(int i, ResolvedTextDirection resolvedTextDirection) {
            C16260h0 h0Var = this.f39460d;
            C16260h0 h0Var2 = null;
            if (h0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                h0Var = null;
            }
            int u = h0Var.mo47067u(i);
            C16260h0 h0Var3 = this.f39460d;
            if (h0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                h0Var3 = null;
            }
            if (resolvedTextDirection != h0Var3.mo47071y(u)) {
                C16260h0 h0Var4 = this.f39460d;
                if (h0Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    h0Var2 = h0Var4;
                }
                return h0Var2.mo47067u(i);
            }
            C16260h0 h0Var5 = this.f39460d;
            if (h0Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                h0Var5 = null;
            }
            return C16260h0.m73233p(h0Var5, i, false, 2, (Object) null) - 1;
        }

        /* renamed from: j */
        public final void mo45624j(@C12579k String str, @C12579k C16260h0 h0Var) {
            Intrinsics.checkNotNullParameter(str, "text");
            Intrinsics.checkNotNullParameter(h0Var, "layoutResult");
            mo45618f(str);
            this.f39460d = h0Var;
        }

        public C15833c() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.a$d */
    public static final class C15835d extends C15830a {
        @C12579k

        /* renamed from: g */
        public static final C15836a f39461g = new C15836a((DefaultConstructorMarker) null);

        /* renamed from: h */
        public static final int f39462h = 8;
        @C12580l

        /* renamed from: i */
        public static C15835d f39463i;
        @C12579k

        /* renamed from: j */
        public static final ResolvedTextDirection f39464j = ResolvedTextDirection.Rtl;
        @C12579k

        /* renamed from: k */
        public static final ResolvedTextDirection f39465k = ResolvedTextDirection.Ltr;

        /* renamed from: d */
        public C16260h0 f39466d;

        /* renamed from: e */
        public SemanticsNode f39467e;
        @C12579k

        /* renamed from: f */
        public Rect f39468f;

        /* renamed from: androidx.compose.ui.platform.a$d$a */
        public static final class C15836a {
            public /* synthetic */ C15836a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C15835d mo45628a() {
                if (C15835d.f39463i == null) {
                    C15835d.f39463i = new C15835d((DefaultConstructorMarker) null);
                }
                C15835d g = C15835d.f39463i;
                Intrinsics.checkNotNull(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return g;
            }

            public C15836a() {
            }
        }

        public /* synthetic */ C15835d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public int[] mo45619a(int i) {
            int i2;
            C16260h0 h0Var = null;
            if (mo45616d().length() <= 0 || i >= mo45616d().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.f39467e;
                if (semanticsNode == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    semanticsNode = null;
                }
                int L0 = C11409d.m43851L0(semanticsNode.mo46019g().mo42278r());
                int u = C11479u.m44447u(0, i);
                C16260h0 h0Var2 = this.f39466d;
                if (h0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    h0Var2 = null;
                }
                int q = h0Var2.mo47062q(u);
                C16260h0 h0Var3 = this.f39466d;
                if (h0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    h0Var3 = null;
                }
                float v = h0Var3.mo47068v(q) + ((float) L0);
                C16260h0 h0Var4 = this.f39466d;
                if (h0Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    h0Var4 = null;
                }
                C16260h0 h0Var5 = this.f39466d;
                if (h0Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    h0Var5 = null;
                }
                if (v < h0Var4.mo47068v(h0Var5.mo47060n() - 1)) {
                    C16260h0 h0Var6 = this.f39466d;
                    if (h0Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        h0Var = h0Var6;
                    }
                    i2 = h0Var.mo47063r(v);
                } else {
                    C16260h0 h0Var7 = this.f39466d;
                    if (h0Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        h0Var = h0Var7;
                    }
                    i2 = h0Var.mo47060n();
                }
                return mo45615c(u, mo45626i(i2 - 1, f39465k) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        @C12580l
        /* renamed from: b */
        public int[] mo45620b(int i) {
            int i2;
            C16260h0 h0Var = null;
            if (mo45616d().length() <= 0 || i <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.f39467e;
                if (semanticsNode == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    semanticsNode = null;
                }
                int L0 = C11409d.m43851L0(semanticsNode.mo46019g().mo42278r());
                int B = C11479u.m44313B(mo45616d().length(), i);
                C16260h0 h0Var2 = this.f39466d;
                if (h0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    h0Var2 = null;
                }
                int q = h0Var2.mo47062q(B);
                C16260h0 h0Var3 = this.f39466d;
                if (h0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    h0Var3 = null;
                }
                float v = h0Var3.mo47068v(q) - ((float) L0);
                if (v > 0.0f) {
                    C16260h0 h0Var4 = this.f39466d;
                    if (h0Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        h0Var = h0Var4;
                    }
                    i2 = h0Var.mo47063r(v);
                } else {
                    i2 = 0;
                }
                if (B == mo45616d().length() && i2 < q) {
                    i2++;
                }
                return mo45615c(mo45626i(i2, f39464j), B);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        /* renamed from: i */
        public final int mo45626i(int i, ResolvedTextDirection resolvedTextDirection) {
            C16260h0 h0Var = this.f39466d;
            C16260h0 h0Var2 = null;
            if (h0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                h0Var = null;
            }
            int u = h0Var.mo47067u(i);
            C16260h0 h0Var3 = this.f39466d;
            if (h0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                h0Var3 = null;
            }
            if (resolvedTextDirection != h0Var3.mo47071y(u)) {
                C16260h0 h0Var4 = this.f39466d;
                if (h0Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    h0Var2 = h0Var4;
                }
                return h0Var2.mo47067u(i);
            }
            C16260h0 h0Var5 = this.f39466d;
            if (h0Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                h0Var5 = null;
            }
            return C16260h0.m73233p(h0Var5, i, false, 2, (Object) null) - 1;
        }

        /* renamed from: j */
        public final void mo45627j(@C12579k String str, @C12579k C16260h0 h0Var, @C12579k SemanticsNode semanticsNode) {
            Intrinsics.checkNotNullParameter(str, "text");
            Intrinsics.checkNotNullParameter(h0Var, "layoutResult");
            Intrinsics.checkNotNullParameter(semanticsNode, "node");
            mo45618f(str);
            this.f39466d = h0Var;
            this.f39467e = semanticsNode;
        }

        public C15835d() {
            this.f39468f = new Rect();
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.a$e */
    public static final class C15837e extends C15830a {
        @C12579k

        /* renamed from: d */
        public static final C15838a f39469d = new C15838a((DefaultConstructorMarker) null);

        /* renamed from: e */
        public static final int f39470e = 0;
        @C12580l

        /* renamed from: f */
        public static C15837e f39471f;

        /* renamed from: androidx.compose.ui.platform.a$e$a */
        public static final class C15838a {
            public /* synthetic */ C15838a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C15837e mo45631a() {
                if (C15837e.f39471f == null) {
                    C15837e.f39471f = new C15837e((DefaultConstructorMarker) null);
                }
                C15837e g = C15837e.f39471f;
                Intrinsics.checkNotNull(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return g;
            }

            public C15838a() {
            }
        }

        public /* synthetic */ C15837e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public int[] mo45619a(int i) {
            int length = mo45616d().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            while (i < length && mo45616d().charAt(i) == 10 && !mo45630j(i)) {
                i++;
            }
            if (i >= length) {
                return null;
            }
            int i2 = i + 1;
            while (i2 < length && !mo45629i(i2)) {
                i2++;
            }
            return mo45615c(i, i2);
        }

        @C12580l
        /* renamed from: b */
        public int[] mo45620b(int i) {
            int length = mo45616d().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            while (i > 0 && mo45616d().charAt(i - 1) == 10 && !mo45629i(i)) {
                i--;
            }
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            while (i2 > 0 && !mo45630j(i2)) {
                i2--;
            }
            return mo45615c(i2, i);
        }

        /* renamed from: i */
        public final boolean mo45629i(int i) {
            if (i <= 0 || mo45616d().charAt(i - 1) == 10 || (i != mo45616d().length() && mo45616d().charAt(i) != 10)) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public final boolean mo45630j(int i) {
            if (mo45616d().charAt(i) == 10 || (i != 0 && mo45616d().charAt(i - 1) != 10)) {
                return false;
            }
            return true;
        }

        public C15837e() {
        }
    }

    /* renamed from: androidx.compose.ui.platform.a$f */
    public interface C15839f {
        @C12580l
        /* renamed from: a */
        int[] mo45619a(int i);

        @C12580l
        /* renamed from: b */
        int[] mo45620b(int i);
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.platform.a$g */
    public static final class C15840g extends C15830a {
        @C12579k

        /* renamed from: e */
        public static final C15841a f39472e = new C15841a((DefaultConstructorMarker) null);

        /* renamed from: f */
        public static final int f39473f = 8;
        @C12580l

        /* renamed from: g */
        public static C15840g f39474g;

        /* renamed from: d */
        public BreakIterator f39475d;

        /* renamed from: androidx.compose.ui.platform.a$g$a */
        public static final class C15841a {
            public /* synthetic */ C15841a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C15840g mo45636a(@C12579k Locale locale) {
                Intrinsics.checkNotNullParameter(locale, "locale");
                if (C15840g.f39474g == null) {
                    C15840g.f39474g = new C15840g(locale, (DefaultConstructorMarker) null);
                }
                C15840g g = C15840g.f39474g;
                Intrinsics.checkNotNull(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return g;
            }

            public C15841a() {
            }
        }

        public /* synthetic */ C15840g(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        @C12580l
        /* renamed from: a */
        public int[] mo45619a(int i) {
            if (mo45616d().length() <= 0 || i >= mo45616d().length()) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            while (!mo45633j(i) && !mo45634k(i)) {
                BreakIterator breakIterator = this.f39475d;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f39475d;
            if (breakIterator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(i);
            if (following == -1 || !mo45632i(following)) {
                return null;
            }
            return mo45615c(i, following);
        }

        @C12580l
        /* renamed from: b */
        public int[] mo45620b(int i) {
            int length = mo45616d().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            while (i > 0 && !mo45633j(i - 1) && !mo45632i(i)) {
                BreakIterator breakIterator = this.f39475d;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f39475d;
            if (breakIterator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(i);
            if (preceding == -1 || !mo45634k(preceding)) {
                return null;
            }
            return mo45615c(preceding, i);
        }

        /* renamed from: e */
        public void mo45617e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "text");
            super.mo45617e(str);
            BreakIterator breakIterator = this.f39475d;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        /* renamed from: i */
        public final boolean mo45632i(int i) {
            if (i <= 0 || !mo45633j(i - 1) || (i != mo45616d().length() && mo45633j(i))) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public final boolean mo45633j(int i) {
            if (i < 0 || i >= mo45616d().length()) {
                return false;
            }
            return Character.isLetterOrDigit(mo45616d().codePointAt(i));
        }

        /* renamed from: k */
        public final boolean mo45634k(int i) {
            if (!mo45633j(i) || (i != 0 && mo45633j(i - 1))) {
                return false;
            }
            return true;
        }

        /* renamed from: l */
        public final void mo45635l(Locale locale) {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            Intrinsics.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
            this.f39475d = wordInstance;
        }

        public C15840g(Locale locale) {
            mo45635l(locale);
        }
    }
}
