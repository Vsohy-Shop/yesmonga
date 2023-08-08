package kotlin.text;

import androidx.exifinterface.media.C19135a;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.C10994x;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;

@C11363r0({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,398:1\n1789#2,3:399\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:399,3\n*E\n"})
public final class RegexKt {
    /* renamed from: f */
    public static final C11611k m45077f(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    /* renamed from: g */
    public static final /* synthetic */ <T extends Enum<T> & C11606g> Set<T> m45078g(int i) {
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        EnumSet<E> allOf = EnumSet.allOf(Enum.class);
        Intrinsics.checkNotNullExpressionValue(allOf, "fromInt$lambda$1");
        Intrinsics.needClassReification();
        C10994x.m42353N0(allOf, new RegexKt$fromInt$1$1(i));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return unmodifiableSet;
    }

    /* renamed from: h */
    public static final C11611k m45079h(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    /* renamed from: i */
    public static final C11466l m45080i(MatchResult matchResult) {
        return C11479u.m44378W1(matchResult.start(), matchResult.end());
    }

    /* renamed from: j */
    public static final C11466l m45081j(MatchResult matchResult, int i) {
        return C11479u.m44378W1(matchResult.start(i), matchResult.end(i));
    }

    /* renamed from: k */
    public static final int m45082k(Iterable<? extends C11606g> iterable) {
        int i = 0;
        for (C11606g value : iterable) {
            i |= value.getValue();
        }
        return i;
    }
}
