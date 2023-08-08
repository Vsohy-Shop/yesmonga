package kotlin.text;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.C10904b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.text.C11611k;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class MatcherMatchResult implements C11611k {
    @C12579k

    /* renamed from: a */
    public final Matcher f28840a;
    @C12579k

    /* renamed from: b */
    public final CharSequence f28841b;
    @C12579k

    /* renamed from: c */
    public final C11608i f28842c = new MatcherMatchResult$groups$1(this);
    @C12580l

    /* renamed from: d */
    public List<String> f28843d;

    /* renamed from: kotlin.text.MatcherMatchResult$a */
    public static final class C11592a extends C10904b<String> {

        /* renamed from: b */
        public final /* synthetic */ MatcherMatchResult f28844b;

        public C11592a(MatcherMatchResult matcherMatchResult) {
            this.f28844b = matcherMatchResult;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return mo23319h((String) obj);
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28844b.mo23315e().groupCount() + 1;
        }

        /* renamed from: h */
        public /* bridge */ boolean mo23319h(String str) {
            return super.contains(str);
        }

        @C12579k
        /* renamed from: i */
        public String get(int i) {
            String group = this.f28844b.mo23315e().group(i);
            return group == null ? "" : group;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return mo23321q((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return mo23322r((String) obj);
        }

        /* renamed from: q */
        public /* bridge */ int mo23321q(String str) {
            return super.indexOf(str);
        }

        /* renamed from: r */
        public /* bridge */ int mo23322r(String str) {
            return super.lastIndexOf(str);
        }
    }

    public MatcherMatchResult(@C12579k Matcher matcher, @C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(charSequence, "input");
        this.f28840a = matcher;
        this.f28841b = charSequence;
    }

    @C12579k
    /* renamed from: a */
    public C11611k.C11613b mo23312a() {
        return C11611k.C11612a.m45239a(this);
    }

    @C12579k
    /* renamed from: b */
    public List<String> mo23313b() {
        if (this.f28843d == null) {
            this.f28843d = new C11592a(this);
        }
        List<String> list = this.f28843d;
        Intrinsics.checkNotNull(list);
        return list;
    }

    @C12579k
    /* renamed from: c */
    public C11608i mo23314c() {
        return this.f28842c;
    }

    /* renamed from: e */
    public final MatchResult mo23315e() {
        return this.f28840a;
    }

    @C12579k
    public C11466l getRange() {
        return RegexKt.m45080i(mo23315e());
    }

    @C12579k
    public String getValue() {
        String group = mo23315e().group();
        Intrinsics.checkNotNullExpressionValue(group, "matchResult.group()");
        return group;
    }

    @C12580l
    public C11611k next() {
        int i;
        int end = mo23315e().end();
        if (mo23315e().end() == mo23315e().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 > this.f28841b.length()) {
            return null;
        }
        Matcher matcher = this.f28840a.pattern().matcher(this.f28841b);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher.pattern().matcher(input)");
        return RegexKt.m45077f(matcher, i2, this.f28841b);
    }
}
