package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p031db.C20492k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11333h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.r */
public abstract class C20361r<T> extends SharedSQLiteStatement {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20361r(@C12579k RoomDatabase roomDatabase) {
        super(roomDatabase);
        Intrinsics.checkNotNullParameter(roomDatabase, "database");
    }

    /* renamed from: i */
    public abstract void mo17583i(@C12580l C20492k kVar, T t);

    /* renamed from: j */
    public final void mo61157j(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "entities");
        C20492k b = mo60958b();
        try {
            for (Object i : iterable) {
                mo17583i(b, i);
                b.mo60797h2();
            }
        } finally {
            mo60963h(b);
        }
    }

    /* renamed from: k */
    public final void mo61158k(T t) {
        C20492k b = mo60958b();
        try {
            mo17583i(b, t);
            b.mo60797h2();
        } finally {
            mo60963h(b);
        }
    }

    /* renamed from: l */
    public final void mo61159l(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "entities");
        C20492k b = mo60958b();
        try {
            for (T i : tArr) {
                mo17583i(b, i);
                b.mo60797h2();
            }
        } finally {
            mo60963h(b);
        }
    }

    /* renamed from: m */
    public final long mo61160m(T t) {
        C20492k b = mo60958b();
        try {
            mo17583i(b, t);
            return b.mo60797h2();
        } finally {
            mo60963h(b);
        }
    }

    @C12579k
    /* renamed from: n */
    public final long[] mo61161n(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "entities");
        C20492k b = mo60958b();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (Object next : collection) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                mo17583i(b, next);
                jArr[i] = b.mo60797h2();
                i = i2;
            }
            return jArr;
        } finally {
            mo60963h(b);
        }
    }

    @C12579k
    /* renamed from: o */
    public final long[] mo61162o(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "entities");
        C20492k b = mo60958b();
        try {
            long[] jArr = new long[tArr.length];
            int length = tArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                mo17583i(b, tArr[i]);
                jArr[i2] = b.mo60797h2();
                i++;
                i2 = i3;
            }
            return jArr;
        } finally {
            mo60963h(b);
        }
    }

    @C12579k
    /* renamed from: p */
    public final Long[] mo61163p(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "entities");
        C20492k b = mo60958b();
        Iterator<? extends T> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                mo17583i(b, it.next());
                lArr[i] = Long.valueOf(b.mo60797h2());
            }
            return lArr;
        } finally {
            mo60963h(b);
        }
    }

    @C12579k
    /* renamed from: q */
    public final Long[] mo61164q(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "entities");
        C20492k b = mo60958b();
        Iterator a = C11333h.m43500a(tArr);
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                mo17583i(b, a.next());
                lArr[i] = Long.valueOf(b.mo60797h2());
            }
            return lArr;
        } finally {
            mo60963h(b);
        }
    }

    @C12579k
    /* renamed from: r */
    public final List<Long> mo61165r(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "entities");
        C20492k b = mo60958b();
        try {
            List i = C10976s.m41417i();
            for (Object i2 : collection) {
                mo17583i(b, i2);
                i.add(Long.valueOf(b.mo60797h2()));
            }
            return C10976s.m41409a(i);
        } finally {
            mo60963h(b);
        }
    }

    @C12579k
    /* renamed from: s */
    public final List<Long> mo61166s(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "entities");
        C20492k b = mo60958b();
        try {
            List i = C10976s.m41417i();
            for (T i2 : tArr) {
                mo17583i(b, i2);
                i.add(Long.valueOf(b.mo60797h2()));
            }
            return C10976s.m41409a(i);
        } finally {
            mo60963h(b);
        }
    }
}
