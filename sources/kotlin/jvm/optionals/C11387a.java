package kotlin.jvm.optionals;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.C11097g2;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.collections.C10927c1;
import kotlin.collections.C10930d1;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.jvm.optionals.a */
public final class C11387a {
    @C11665v0(version = "1.8")
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    /* renamed from: a */
    public static final <T> C11559m<T> m43739a(@C12579k Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        if (!optional.isPresent()) {
            return SequencesKt__SequencesKt.m44590g();
        }
        return SequencesKt__SequencesKt.m44600q(optional.get());
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.8")
    /* renamed from: b */
    public static final <T> T m43740b(@C12579k Optional<? extends T> optional, T t) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        if (optional.isPresent()) {
            return optional.get();
        }
        return t;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.8")
    /* renamed from: c */
    public static final <T> T m43741c(@C12579k Optional<? extends T> optional, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        if (optional.isPresent()) {
            return optional.get();
        }
        return aVar.invoke();
    }

    @C12580l
    @C11665v0(version = "1.8")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: d */
    public static final <T> T m43742d(@C12579k Optional<T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.orElse((Object) null);
    }

    @C11665v0(version = "1.8")
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    /* renamed from: e */
    public static final <T, C extends Collection<? super T>> C m43743e(@C12579k Optional<T> optional, @C12579k C c) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        if (optional.isPresent()) {
            T t = optional.get();
            Intrinsics.checkNotNullExpressionValue(t, "get()");
            c.add(t);
        }
        return c;
    }

    @C11665v0(version = "1.8")
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    /* renamed from: f */
    public static final <T> List<T> m43744f(@C12579k Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        if (optional.isPresent()) {
            return C10976s.m41419k(optional.get());
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    @C11665v0(version = "1.8")
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    /* renamed from: g */
    public static final <T> Set<T> m43745g(@C12579k Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        if (optional.isPresent()) {
            return C10927c1.m40883f(optional.get());
        }
        return C10930d1.m40892k();
    }
}
