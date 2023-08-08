package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.h */
public final /* synthetic */ class C21006h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C21007i f54181a;

    /* renamed from: b */
    public final /* synthetic */ Set f54182b;

    public /* synthetic */ C21006h(C21007i iVar, Set set) {
        this.f54181a = iVar;
        this.f54182b = set;
    }

    public final boolean test(Object obj) {
        return C21007i.m97190n(this.f54181a, this.f54182b, (Pair) obj);
    }
}
