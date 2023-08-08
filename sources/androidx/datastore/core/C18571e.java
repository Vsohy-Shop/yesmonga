package androidx.datastore.core;

import androidx.datastore.core.handlers.C18575a;
import androidx.datastore.core.handlers.C18576b;
import java.io.File;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11719b3;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.datastore.core.e */
public final class C18571e {
    @C12579k

    /* renamed from: a */
    public static final C18571e f47422a = new C18571e();

    /* renamed from: e */
    public static /* synthetic */ C18570d m84056e(C18571e eVar, C18577i iVar, C18576b bVar, List list, C12074o0 o0Var, C11289a aVar, int i, Object obj) {
        C18576b bVar2;
        if ((i & 2) != 0) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list2 = list;
        if ((i & 8) != 0) {
            C11768d1 d1Var = C11768d1.f29186a;
            o0Var = C12079p0.m48260a(C11768d1.m46781c().mo7443Q(C11719b3.m46155c((C11723c2) null, 1, (Object) null)));
        }
        return eVar.mo53583b(iVar, bVar2, list2, o0Var, aVar);
    }

    @C12579k
    @C11315i
    /* renamed from: a */
    public final <T> C18570d<T> mo53582a(@C12579k C18577i<T> iVar, @C12580l C18576b<T> bVar, @C12579k List<? extends C18569c<T>> list, @C12579k C11289a<? extends File> aVar) {
        Intrinsics.checkNotNullParameter(iVar, "serializer");
        Intrinsics.checkNotNullParameter(list, "migrations");
        Intrinsics.checkNotNullParameter(aVar, "produceFile");
        return m84056e(this, iVar, bVar, list, (C12074o0) null, aVar, 8, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: b */
    public final <T> C18570d<T> mo53583b(@C12579k C18577i<T> iVar, @C12580l C18576b<T> bVar, @C12579k List<? extends C18569c<T>> list, @C12579k C12074o0 o0Var, @C12579k C11289a<? extends File> aVar) {
        Intrinsics.checkNotNullParameter(iVar, "serializer");
        Intrinsics.checkNotNullParameter(list, "migrations");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        Intrinsics.checkNotNullParameter(aVar, "produceFile");
        C18567a aVar2 = bVar;
        if (bVar == null) {
            aVar2 = new C18575a();
        }
        return new SingleProcessDataStore(aVar, iVar, C10976s.m41419k(DataMigrationInitializer.f47389a.mo53534b(list)), aVar2, o0Var);
    }

    @C12579k
    @C11315i
    /* renamed from: c */
    public final <T> C18570d<T> mo53584c(@C12579k C18577i<T> iVar, @C12580l C18576b<T> bVar, @C12579k C11289a<? extends File> aVar) {
        Intrinsics.checkNotNullParameter(iVar, "serializer");
        Intrinsics.checkNotNullParameter(aVar, "produceFile");
        return m84056e(this, iVar, bVar, (List) null, (C12074o0) null, aVar, 12, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: d */
    public final <T> C18570d<T> mo53585d(@C12579k C18577i<T> iVar, @C12579k C11289a<? extends File> aVar) {
        Intrinsics.checkNotNullParameter(iVar, "serializer");
        Intrinsics.checkNotNullParameter(aVar, "produceFile");
        return m84056e(this, iVar, (C18576b) null, (List) null, (C12074o0) null, aVar, 14, (Object) null);
    }
}
