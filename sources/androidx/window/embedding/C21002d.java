package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.d */
public final /* synthetic */ class C21002d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C21007i f54176a;

    /* renamed from: b */
    public final /* synthetic */ Set f54177b;

    public /* synthetic */ C21002d(C21007i iVar, Set set) {
        this.f54176a = iVar;
        this.f54177b = set;
    }

    public final boolean test(Object obj) {
        return C21007i.m97189l(this.f54176a, this.f54177b, (Pair) obj);
    }
}
