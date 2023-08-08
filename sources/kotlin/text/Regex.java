package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C11076d0;
import kotlin.C11097g2;
import kotlin.C11429q;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.collections.C10976s;
import kotlin.collections.C10994x;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlin.sequences.C11559m;
import kotlin.sequences.C11563q;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 42\u00060\u0001j\u0002`\u0002:\u000245B\u0011\b\u0001\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b.\u0010/B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020\u0014¢\u0006\u0004\b.\u00100B\u0019\b\u0016\u0012\u0006\u0010*\u001a\u00020\u0014\u0012\u0006\u00101\u001a\u00020%¢\u0006\u0004\b.\u00102B\u001f\b\u0016\u0012\u0006\u0010*\u001a\u00020\u0014\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\u0004\b.\u00103J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\"\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0017J\u0016\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\nJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\u0006\u0010!\u001a\u00020 R\u0014\u0010\"\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020%0$8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00066"}, mo22516d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "input", "", "k", "b", "", "startIndex", "Lkotlin/text/k;", "c", "Lkotlin/sequences/m;", "e", "j", "index", "i", "l", "", "replacement", "m", "Lkotlin/Function1;", "transform", "n", "o", "limit", "", "p", "r", "toString", "Ljava/util/regex/Pattern;", "t", "nativePattern", "Ljava/util/regex/Pattern;", "", "Lkotlin/text/RegexOption;", "_options", "Ljava/util/Set;", "h", "()Ljava/lang/String;", "pattern", "g", "()Ljava/util/Set;", "options", "<init>", "(Ljava/util/regex/Pattern;)V", "(Ljava/lang/String;)V", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "(Ljava/lang/String;Ljava/util/Set;)V", "a", "Serialized", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n22#2,3:399\n1#3:402\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n104#1:399,3\n*E\n"})
public final class Regex implements Serializable {
    @C12579k

    /* renamed from: a */
    public static final C11594a f28846a = new C11594a((DefaultConstructorMarker) null);
    @C12580l
    private Set<? extends RegexOption> _options;
    /* access modifiers changed from: private */
    @C12579k
    public final Pattern nativePattern;

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo22516d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "pattern", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "flags", "I", "a", "()I", "<init>", "(Ljava/lang/String;I)V", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Serialized implements Serializable {
        @C12579k

        /* renamed from: a */
        public static final C11593a f28847a = new C11593a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 0;
        private final int flags;
        @C12579k
        private final String pattern;

        /* renamed from: kotlin.text.Regex$Serialized$a */
        public static final class C11593a {
            public /* synthetic */ C11593a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C11593a() {
            }
        }

        public Serialized(@C12579k String str, int i) {
            Intrinsics.checkNotNullParameter(str, "pattern");
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            Intrinsics.checkNotNullExpressionValue(compile, "compile(pattern, flags)");
            return new Regex(compile);
        }

        /* renamed from: a */
        public final int mo23343a() {
            return this.flags;
        }

        @C12579k
        /* renamed from: b */
        public final String mo23344b() {
            return this.pattern;
        }
    }

    /* renamed from: kotlin.text.Regex$a */
    public static final class C11594a {
        public /* synthetic */ C11594a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final int mo23345b(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        @C12579k
        /* renamed from: c */
        public final String mo23346c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "literal");
            String quote = Pattern.quote(str);
            Intrinsics.checkNotNullExpressionValue(quote, "quote(literal)");
            return quote;
        }

        @C12579k
        /* renamed from: d */
        public final String mo23347d(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "literal");
            String quoteReplacement = Matcher.quoteReplacement(str);
            Intrinsics.checkNotNullExpressionValue(quoteReplacement, "quoteReplacement(literal)");
            return quoteReplacement;
        }

        @C12579k
        /* renamed from: e */
        public final Regex mo23348e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "literal");
            return new Regex(str, RegexOption.LITERAL);
        }

        public C11594a() {
        }
    }

    @C11532s0
    public Regex(@C12579k Pattern pattern) {
        Intrinsics.checkNotNullParameter(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    /* renamed from: d */
    public static /* synthetic */ C11611k m45042d(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.mo23328c(charSequence, i);
    }

    /* renamed from: f */
    public static /* synthetic */ C11559m m45043f(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.mo23329e(charSequence, i);
    }

    /* renamed from: q */
    public static /* synthetic */ List m45044q(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.mo23339p(charSequence, i);
    }

    /* renamed from: s */
    public static /* synthetic */ C11559m m45045s(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.mo23340r(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(pattern, "nativePattern.pattern()");
        return new Serialized(pattern, this.nativePattern.flags());
    }

    /* renamed from: b */
    public final boolean mo23327b(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    @C12580l
    /* renamed from: c */
    public final C11611k mo23328c(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher, "nativePattern.matcher(input)");
        return RegexKt.m45077f(matcher, i, charSequence);
    }

    @C12579k
    /* renamed from: e */
    public final C11559m<C11611k> mo23329e(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return SequencesKt__SequencesKt.m44597n(new Regex$findAll$1(this, charSequence, i), Regex$findAll$2.f28848a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    @C12579k
    /* renamed from: g */
    public final Set<RegexOption> mo23330g() {
        Set<? extends RegexOption> set = this._options;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet<E> allOf = EnumSet.allOf(RegexOption.class);
        Intrinsics.checkNotNullExpressionValue(allOf, "fromInt$lambda$1");
        C10994x.m42353N0(allOf, new Regex$special$$inlined$fromInt$1(flags));
        Set<? extends RegexOption> unmodifiableSet = Collections.unmodifiableSet(allOf);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    @C12579k
    /* renamed from: h */
    public final String mo23331h() {
        String pattern = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(pattern, "nativePattern.pattern()");
        return pattern;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C12580l
    @C11665v0(version = "1.7")
    /* renamed from: i */
    public final C11611k mo23332i(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        Matcher region = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (!region.lookingAt()) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(region, "this");
        return new MatcherMatchResult(region, charSequence);
    }

    @C12580l
    /* renamed from: j */
    public final C11611k mo23333j(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher, "nativePattern.matcher(input)");
        return RegexKt.m45079h(matcher, charSequence);
    }

    /* renamed from: k */
    public final boolean mo23334k(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.7")
    /* renamed from: l */
    public final boolean mo23335l(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    @C12579k
    /* renamed from: m */
    public final String mo23336m(@C12579k CharSequence charSequence, @C12579k String str) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        Intrinsics.checkNotNullParameter(str, "replacement");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @C12579k
    /* renamed from: n */
    public final String mo23337n(@C12579k CharSequence charSequence, @C12579k C11300l<? super C11611k, ? extends CharSequence> lVar) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int i = 0;
        C11611k d = m45042d(this, charSequence, 0, 2, (Object) null);
        if (d == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, d.getRange().getStart().intValue());
            sb.append((CharSequence) lVar.invoke(d));
            i = d.getRange().mo23013q().intValue() + 1;
            d = d.next();
            if (i >= length) {
                break;
            }
        } while (d != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    @C12579k
    /* renamed from: o */
    public final String mo23338o(@C12579k CharSequence charSequence, @C12579k String str) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        Intrinsics.checkNotNullParameter(str, "replacement");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        Intrinsics.checkNotNullExpressionValue(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    @C12579k
    /* renamed from: p */
    public final List<String> mo23339p(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        StringsKt__StringsKt.requireNonNegativeLimit(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return C10976s.m41419k(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0) {
            i2 = C11479u.m44313B(i, 10);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if ((i3 >= 0 && arrayList.size() == i3) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    @C11665v0(version = "1.6")
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    /* renamed from: r */
    public final C11559m<String> mo23340r(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        StringsKt__StringsKt.requireNonNegativeLimit(i);
        return C11563q.m44902b(new Regex$splitToSequence$1(this, charSequence, i, (C11045c<? super Regex$splitToSequence$1>) null));
    }

    @C12579k
    /* renamed from: t */
    public final Pattern mo23341t() {
        return this.nativePattern;
    }

    @C12579k
    public String toString() {
        String pattern = this.nativePattern.toString();
        Intrinsics.checkNotNullExpressionValue(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(@org.jetbrains.annotations.C12579k java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(@org.jetbrains.annotations.C12579k java.lang.String r2, @org.jetbrains.annotations.C12579k kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.text.Regex$a r0 = f28846a
            int r3 = r3.getValue()
            int r3 = r0.mo23345b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(@org.jetbrains.annotations.C12579k java.lang.String r2, @org.jetbrains.annotations.C12579k java.util.Set<? extends kotlin.text.RegexOption> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.text.Regex$a r0 = f28846a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            int r3 = kotlin.text.RegexKt.m45082k(r3)
            int r3 = r0.mo23345b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, java.util.Set):void");
    }
}
