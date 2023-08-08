package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.s */
public final class C20364s<T> {
    @C12579k

    /* renamed from: a */
    public final C20361r<T> f52524a;
    @C12579k

    /* renamed from: b */
    public final C20357q<T> f52525b;

    public C20364s(@C12579k C20361r<T> rVar, @C12579k C20357q<T> qVar) {
        Intrinsics.checkNotNullParameter(rVar, "insertionAdapter");
        Intrinsics.checkNotNullParameter(qVar, "updateAdapter");
        this.f52524a = rVar;
        this.f52525b = qVar;
    }

    /* renamed from: a */
    public final void mo61168a(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null) {
            throw sQLiteConstraintException;
        } else if (!StringsKt__StringsKt.contains((CharSequence) message, (CharSequence) C20367t.f52531a, true)) {
            throw sQLiteConstraintException;
        }
    }

    /* renamed from: b */
    public final void mo61169b(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "entities");
        for (Object next : iterable) {
            try {
                this.f52524a.mo61158k(next);
            } catch (SQLiteConstraintException e) {
                mo61168a(e);
                this.f52525b.mo61150j(next);
            }
        }
    }

    /* renamed from: c */
    public final void mo61170c(T t) {
        try {
            this.f52524a.mo61158k(t);
        } catch (SQLiteConstraintException e) {
            mo61168a(e);
            this.f52525b.mo61150j(t);
        }
    }

    /* renamed from: d */
    public final void mo61171d(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "entities");
        for (T t : tArr) {
            try {
                this.f52524a.mo61158k(t);
            } catch (SQLiteConstraintException e) {
                mo61168a(e);
                this.f52525b.mo61150j(t);
            }
        }
    }

    /* renamed from: e */
    public final long mo61172e(T t) {
        try {
            return this.f52524a.mo61160m(t);
        } catch (SQLiteConstraintException e) {
            mo61168a(e);
            this.f52525b.mo61150j(t);
            return -1;
        }
    }

    @C12579k
    /* renamed from: f */
    public final long[] mo61173f(@C12579k Collection<? extends T> collection) {
        long j;
        Intrinsics.checkNotNullParameter(collection, "entities");
        Iterator<? extends T> it = collection.iterator();
        int size = collection.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            Object next = it.next();
            try {
                j = this.f52524a.mo61160m(next);
            } catch (SQLiteConstraintException e) {
                mo61168a(e);
                this.f52525b.mo61150j(next);
                j = -1;
            }
            jArr[i] = j;
        }
        return jArr;
    }

    @C12579k
    /* renamed from: g */
    public final long[] mo61174g(@C12579k T[] tArr) {
        long j;
        Intrinsics.checkNotNullParameter(tArr, "entities");
        int length = tArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                j = this.f52524a.mo61160m(tArr[i]);
            } catch (SQLiteConstraintException e) {
                mo61168a(e);
                this.f52525b.mo61150j(tArr[i]);
                j = -1;
            }
            jArr[i] = j;
        }
        return jArr;
    }

    @C12579k
    /* renamed from: h */
    public final Long[] mo61175h(@C12579k Collection<? extends T> collection) {
        long j;
        Intrinsics.checkNotNullParameter(collection, "entities");
        Iterator<? extends T> it = collection.iterator();
        int size = collection.size();
        Long[] lArr = new Long[size];
        for (int i = 0; i < size; i++) {
            Object next = it.next();
            try {
                j = this.f52524a.mo61160m(next);
            } catch (SQLiteConstraintException e) {
                mo61168a(e);
                this.f52525b.mo61150j(next);
                j = -1;
            }
            lArr[i] = Long.valueOf(j);
        }
        return lArr;
    }

    @C12579k
    /* renamed from: i */
    public final Long[] mo61176i(@C12579k T[] tArr) {
        long j;
        Intrinsics.checkNotNullParameter(tArr, "entities");
        int length = tArr.length;
        Long[] lArr = new Long[length];
        for (int i = 0; i < length; i++) {
            try {
                j = this.f52524a.mo61160m(tArr[i]);
            } catch (SQLiteConstraintException e) {
                mo61168a(e);
                this.f52525b.mo61150j(tArr[i]);
                j = -1;
            }
            lArr[i] = Long.valueOf(j);
        }
        return lArr;
    }

    @C12579k
    /* renamed from: j */
    public final List<Long> mo61177j(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "entities");
        List i = C10976s.m41417i();
        for (Object next : collection) {
            try {
                i.add(Long.valueOf(this.f52524a.mo61160m(next)));
            } catch (SQLiteConstraintException e) {
                mo61168a(e);
                this.f52525b.mo61150j(next);
                i.add(-1L);
            }
        }
        return C10976s.m41409a(i);
    }

    @C12579k
    /* renamed from: k */
    public final List<Long> mo61178k(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "entities");
        List i = C10976s.m41417i();
        for (T t : tArr) {
            try {
                i.add(Long.valueOf(this.f52524a.mo61160m(t)));
            } catch (SQLiteConstraintException e) {
                mo61168a(e);
                this.f52525b.mo61150j(t);
                i.add(-1L);
            }
        }
        return C10976s.m41409a(i);
    }
}
