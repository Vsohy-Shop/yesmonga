package androidx.datastore;

import android.content.Context;
import androidx.annotation.C0323b0;
import androidx.datastore.core.C18569c;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.C18571e;
import androidx.datastore.core.C18577i;
import androidx.datastore.core.handlers.C18576b;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.C11427e;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class DataStoreSingletonDelegate<T> implements C11427e<Context, C18570d<T>> {
    @C12579k

    /* renamed from: a */
    public final String f47382a;
    @C12579k

    /* renamed from: b */
    public final C18577i<T> f47383b;
    @C12580l

    /* renamed from: c */
    public final C18576b<T> f47384c;
    @C12579k

    /* renamed from: d */
    public final C11300l<Context, List<C18569c<T>>> f47385d;
    @C12579k

    /* renamed from: e */
    public final C12074o0 f47386e;
    @C12579k

    /* renamed from: f */
    public final Object f47387f = new Object();
    @C12580l
    @C0323b0("lock")

    /* renamed from: g */
    public volatile C18570d<T> f47388g;

    public DataStoreSingletonDelegate(@C12579k String str, @C12579k C18577i<T> iVar, @C12580l C18576b<T> bVar, @C12579k C11300l<? super Context, ? extends List<? extends C18569c<T>>> lVar, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(str, "fileName");
        Intrinsics.checkNotNullParameter(iVar, "serializer");
        Intrinsics.checkNotNullParameter(lVar, "produceMigrations");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        this.f47382a = str;
        this.f47383b = iVar;
        this.f47384c = bVar;
        this.f47385d = lVar;
        this.f47386e = o0Var;
    }

    @C12579k
    /* renamed from: d */
    public C18570d<T> mo22938a(@C12579k Context context, @C12579k C11510n<?> nVar) {
        C18570d<T> dVar;
        Intrinsics.checkNotNullParameter(context, "thisRef");
        Intrinsics.checkNotNullParameter(nVar, "property");
        C18570d<T> dVar2 = this.f47388g;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f47387f) {
            if (this.f47388g == null) {
                Context applicationContext = context.getApplicationContext();
                C18577i<T> iVar = this.f47383b;
                C18576b<T> bVar = this.f47384c;
                C11300l<Context, List<C18569c<T>>> lVar = this.f47385d;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                C12074o0 o0Var = this.f47386e;
                this.f47388g = C18571e.f47422a.mo53583b(iVar, bVar, lVar.invoke(applicationContext), o0Var, new DataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
            }
            dVar = this.f47388g;
            Intrinsics.checkNotNull(dVar);
        }
        return dVar;
    }
}
