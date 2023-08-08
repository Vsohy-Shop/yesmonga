package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p031db.C20492k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.q */
public abstract class C20357q<T> extends SharedSQLiteStatement {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20357q(@C12579k RoomDatabase roomDatabase) {
        super(roomDatabase);
        Intrinsics.checkNotNullParameter(roomDatabase, "database");
    }

    @C12579k
    /* renamed from: e */
    public abstract String mo17582e();

    /* renamed from: i */
    public abstract void mo17586i(@C12579k C20492k kVar, T t);

    /* renamed from: j */
    public final int mo61150j(T t) {
        C20492k b = mo60958b();
        try {
            mo17586i(b, t);
            return b.mo60802y0();
        } finally {
            mo60963h(b);
        }
    }

    /* renamed from: k */
    public final int mo61151k(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "entities");
        C20492k b = mo60958b();
        try {
            int i = 0;
            for (Object i2 : iterable) {
                mo17586i(b, i2);
                i += b.mo60802y0();
            }
            return i;
        } finally {
            mo60963h(b);
        }
    }

    /* renamed from: l */
    public final int mo61152l(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "entities");
        C20492k b = mo60958b();
        try {
            int i = 0;
            for (T i2 : tArr) {
                mo17586i(b, i2);
                i += b.mo60802y0();
            }
            return i;
        } finally {
            mo60963h(b);
        }
    }
}
