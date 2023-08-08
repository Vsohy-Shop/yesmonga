package androidx.window.embedding;

import android.content.Intent;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.g */
public final /* synthetic */ class C21005g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f54180a;

    public /* synthetic */ C21005g(Set set) {
        this.f54180a = set;
    }

    public final boolean test(Object obj) {
        return C21007i.m97192r(this.f54180a, (Intent) obj);
    }
}
