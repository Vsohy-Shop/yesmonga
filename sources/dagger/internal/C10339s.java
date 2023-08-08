package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: dagger.internal.s */
public final class C10339s<T> {

    /* renamed from: b */
    public static final String f27973b = "Set contributions cannot be null";

    /* renamed from: a */
    public final List<T> f27974a;

    public C10339s(int i) {
        this.f27974a = new ArrayList(i);
    }

    /* renamed from: d */
    public static <T> C10339s<T> m38557d(int i) {
        return new C10339s<>(i);
    }

    /* renamed from: a */
    public C10339s<T> mo21740a(T t) {
        this.f27974a.add(C10335o.m38551c(t, "Set contributions cannot be null"));
        return this;
    }

    /* renamed from: b */
    public C10339s<T> mo21741b(Collection<? extends T> collection) {
        for (Object c : collection) {
            C10335o.m38551c(c, "Set contributions cannot be null");
        }
        this.f27974a.addAll(collection);
        return this;
    }

    /* renamed from: c */
    public Set<T> mo21742c() {
        if (this.f27974a.isEmpty()) {
            return Collections.emptySet();
        }
        if (this.f27974a.size() == 1) {
            return Collections.singleton(this.f27974a.get(0));
        }
        return Collections.unmodifiableSet(new HashSet(this.f27974a));
    }
}
