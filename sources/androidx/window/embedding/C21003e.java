package androidx.window.embedding;

import android.app.Activity;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.e */
public final /* synthetic */ class C21003e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f54178a;

    public /* synthetic */ C21003e(Set set) {
        this.f54178a = set;
    }

    public final boolean test(Object obj) {
        return C21007i.m97191p(this.f54178a, (Activity) obj);
    }
}
