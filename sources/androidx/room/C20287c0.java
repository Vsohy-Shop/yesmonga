package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.room.c0 */
public final class C20287c0 {
    @C12579k

    /* renamed from: a */
    public final RoomDatabase f52359a;
    @C12579k

    /* renamed from: b */
    public final Set<LiveData<?>> f52360b;

    public C20287c0(@C12579k RoomDatabase roomDatabase) {
        Intrinsics.checkNotNullParameter(roomDatabase, "database");
        this.f52359a = roomDatabase;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f52360b = newSetFromMap;
    }

    @C12579k
    /* renamed from: a */
    public final <T> LiveData<T> mo60997a(@C12579k String[] strArr, boolean z, @C12579k Callable<T> callable) {
        Intrinsics.checkNotNullParameter(strArr, "tableNames");
        Intrinsics.checkNotNullParameter(callable, "computeFunction");
        return new C20415y1(this.f52359a, this, z, callable, strArr);
    }

    @C12579k
    /* renamed from: b */
    public final Set<LiveData<?>> mo60998b() {
        return this.f52360b;
    }

    /* renamed from: c */
    public final void mo60999c(@C12579k LiveData<?> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.f52360b.add(liveData);
    }

    /* renamed from: d */
    public final void mo61000d(@C12579k LiveData<?> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.f52360b.remove(liveData);
    }
}
