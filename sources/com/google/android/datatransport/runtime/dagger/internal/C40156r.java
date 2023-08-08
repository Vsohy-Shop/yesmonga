package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.r */
public final class C40156r<T> implements C40141g<Set<T>> {

    /* renamed from: c */
    public static final C40141g<Set<Object>> f102380c = C40144j.m163360a(Collections.emptySet());

    /* renamed from: a */
    public final List<Provider<T>> f102381a;

    /* renamed from: b */
    public final List<Provider<Collection<T>>> f102382b;

    /* renamed from: com.google.android.datatransport.runtime.dagger.internal.r$b */
    public static final class C40158b<T> {

        /* renamed from: c */
        public static final /* synthetic */ boolean f102383c = false;

        /* renamed from: a */
        public final List<Provider<T>> f102384a;

        /* renamed from: b */
        public final List<Provider<Collection<T>>> f102385b;

        /* renamed from: a */
        public C40158b<T> mo132776a(Provider<? extends Collection<? extends T>> provider) {
            this.f102385b.add(provider);
            return this;
        }

        /* renamed from: b */
        public C40158b<T> mo132777b(Provider<? extends T> provider) {
            this.f102384a.add(provider);
            return this;
        }

        /* renamed from: c */
        public C40156r<T> mo132778c() {
            return new C40156r<>(this.f102384a, this.f102385b);
        }

        public C40158b(int i, int i2) {
            this.f102384a = C40138d.m163353e(i);
            this.f102385b = C40138d.m163353e(i2);
        }
    }

    /* renamed from: a */
    public static <T> C40158b<T> m163392a(int i, int i2) {
        return new C40158b<>(i, i2);
    }

    /* renamed from: b */
    public static <T> C40141g<Set<T>> m163393b() {
        return f102380c;
    }

    /* renamed from: c */
    public Set<T> get() {
        int size = this.f102381a.size();
        ArrayList arrayList = new ArrayList(this.f102382b.size());
        int size2 = this.f102382b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.f102382b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet c = C40138d.m163351c(size);
        int size3 = this.f102381a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            c.add(C40153o.m163383b(this.f102381a.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object b : (Collection) arrayList.get(i3)) {
                c.add(C40153o.m163383b(b));
            }
        }
        return Collections.unmodifiableSet(c);
    }

    public C40156r(List<Provider<T>> list, List<Provider<Collection<T>>> list2) {
        this.f102381a = list;
        this.f102382b = list2;
    }
}
