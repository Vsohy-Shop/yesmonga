package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: dagger.internal.t */
public final class C10340t<T> implements C10324h<Set<T>> {

    /* renamed from: c */
    public static final C10324h<Set<Object>> f27975c = C10327k.m38527a(Collections.emptySet());

    /* renamed from: a */
    public final List<Provider<T>> f27976a;

    /* renamed from: b */
    public final List<Provider<Collection<T>>> f27977b;

    /* renamed from: dagger.internal.t$b */
    public static final class C10342b<T> {

        /* renamed from: c */
        public static final /* synthetic */ boolean f27978c = false;

        /* renamed from: a */
        public final List<Provider<T>> f27979a;

        /* renamed from: b */
        public final List<Provider<Collection<T>>> f27980b;

        /* renamed from: a */
        public C10342b<T> mo21744a(Provider<? extends Collection<? extends T>> provider) {
            this.f27980b.add(provider);
            return this;
        }

        /* renamed from: b */
        public C10342b<T> mo21745b(Provider<? extends T> provider) {
            this.f27979a.add(provider);
            return this;
        }

        /* renamed from: c */
        public C10340t<T> mo21746c() {
            return new C10340t<>(this.f27979a, this.f27980b);
        }

        public C10342b(int i, int i2) {
            this.f27979a = C10320d.m38520e(i);
            this.f27980b = C10320d.m38520e(i2);
        }
    }

    /* renamed from: a */
    public static <T> C10342b<T> m38561a(int i, int i2) {
        return new C10342b<>(i, i2);
    }

    /* renamed from: b */
    public static <T> C10324h<Set<T>> m38562b() {
        return f27975c;
    }

    /* renamed from: c */
    public Set<T> get() {
        int size = this.f27976a.size();
        ArrayList arrayList = new ArrayList(this.f27977b.size());
        int size2 = this.f27977b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.f27977b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet c = C10320d.m38518c(size);
        int size3 = this.f27976a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            c.add(C10335o.m38550b(this.f27976a.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object b : (Collection) arrayList.get(i3)) {
                c.add(C10335o.m38550b(b));
            }
        }
        return Collections.unmodifiableSet(c);
    }

    public C10340t(List<Provider<T>> list, List<Provider<Collection<T>>> list2) {
        this.f27976a = list;
        this.f27977b = list2;
    }
}
