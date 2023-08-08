package kotlin.text;

import java.util.List;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.text.k */
public interface C11611k {

    /* renamed from: kotlin.text.k$a */
    public static final class C11612a {
        @C12579k
        /* renamed from: a */
        public static C11613b m45239a(@C12579k C11611k kVar) {
            return new C11613b(kVar);
        }
    }

    /* renamed from: kotlin.text.k$b */
    public static final class C11613b {
        @C12579k

        /* renamed from: a */
        public final C11611k f28889a;

        public C11613b(@C12579k C11611k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "match");
            this.f28889a = kVar;
        }

        @C11110f
        /* renamed from: a */
        public final String mo23397a() {
            return mo23407k().mo23313b().get(1);
        }

        @C11110f
        /* renamed from: b */
        public final String mo23398b() {
            return mo23407k().mo23313b().get(10);
        }

        @C11110f
        /* renamed from: c */
        public final String mo23399c() {
            return mo23407k().mo23313b().get(2);
        }

        @C11110f
        /* renamed from: d */
        public final String mo23400d() {
            return mo23407k().mo23313b().get(3);
        }

        @C11110f
        /* renamed from: e */
        public final String mo23401e() {
            return mo23407k().mo23313b().get(4);
        }

        @C11110f
        /* renamed from: f */
        public final String mo23402f() {
            return mo23407k().mo23313b().get(5);
        }

        @C11110f
        /* renamed from: g */
        public final String mo23403g() {
            return mo23407k().mo23313b().get(6);
        }

        @C11110f
        /* renamed from: h */
        public final String mo23404h() {
            return mo23407k().mo23313b().get(7);
        }

        @C11110f
        /* renamed from: i */
        public final String mo23405i() {
            return mo23407k().mo23313b().get(8);
        }

        @C11110f
        /* renamed from: j */
        public final String mo23406j() {
            return mo23407k().mo23313b().get(9);
        }

        @C12579k
        /* renamed from: k */
        public final C11611k mo23407k() {
            return this.f28889a;
        }

        @C12579k
        /* renamed from: l */
        public final List<String> mo23408l() {
            return this.f28889a.mo23313b().subList(1, this.f28889a.mo23313b().size());
        }
    }

    @C12579k
    /* renamed from: a */
    C11613b mo23312a();

    @C12579k
    /* renamed from: b */
    List<String> mo23313b();

    @C12579k
    /* renamed from: c */
    C11608i mo23314c();

    @C12579k
    C11466l getRange();

    @C12579k
    String getValue();

    @C12580l
    C11611k next();
}
