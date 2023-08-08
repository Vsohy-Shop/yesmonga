package kotlin.text;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements C11300l<C11611k, C11611k> {

    /* renamed from: a */
    public static final Regex$findAll$2 f28848a = new Regex$findAll$2();

    public Regex$findAll$2() {
        super(1, C11611k.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @C12580l
    /* renamed from: d */
    public final C11611k invoke(@C12579k C11611k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "p0");
        return kVar.next();
    }
}
