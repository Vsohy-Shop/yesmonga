package kotlin.text;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.C11125m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class MatcherMatchResult$groups$1 extends AbstractCollection<C11607h> implements C11609j {

    /* renamed from: a */
    public final /* synthetic */ MatcherMatchResult f28845a;

    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f28845a = matcherMatchResult;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj == null ? true : obj instanceof C11607h)) {
            return false;
        }
        return mo23325h((C11607h) obj);
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f28845a.mo23315e().groupCount() + 1;
    }

    @C12580l
    public C11607h get(int i) {
        C11466l d = RegexKt.m45081j(this.f28845a.mo23315e(), i);
        if (d.getStart().intValue() < 0) {
            return null;
        }
        String group = this.f28845a.mo23315e().group(i);
        Intrinsics.checkNotNullExpressionValue(group, "matchResult.group(index)");
        return new C11607h(group, d);
    }

    /* renamed from: h */
    public /* bridge */ boolean mo23325h(C11607h hVar) {
        return super.contains(hVar);
    }

    public boolean isEmpty() {
        return false;
    }

    @C12579k
    public Iterator<C11607h> iterator() {
        return SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(CollectionsKt__CollectionsKt.m40442F(this)), new MatcherMatchResult$groups$1$iterator$1(this)).iterator();
    }

    @C12580l
    public C11607h get(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return C11125m.f28285a.mo22539c(this.f28845a.mo23315e(), str);
    }
}
