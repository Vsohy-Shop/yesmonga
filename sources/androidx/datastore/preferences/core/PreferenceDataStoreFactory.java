package androidx.datastore.preferences.core;

import androidx.datastore.core.C18569c;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.C18571e;
import androidx.datastore.core.handlers.C18576b;
import java.io.File;
import java.util.List;
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

public final class PreferenceDataStoreFactory {
    @C12579k

    /* renamed from: a */
    public static final PreferenceDataStoreFactory f47461a = new PreferenceDataStoreFactory();

    /* renamed from: e */
    public static /* synthetic */ C18570d m84339e(PreferenceDataStoreFactory preferenceDataStoreFactory, C18576b bVar, List list, C12074o0 o0Var, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        if ((i & 2) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        if ((i & 4) != 0) {
            C11768d1 d1Var = C11768d1.f29186a;
            o0Var = C12079p0.m48260a(C11768d1.m46781c().mo7443Q(C11719b3.m46155c((C11723c2) null, 1, (Object) null)));
        }
        return preferenceDataStoreFactory.mo53712b(bVar, list, o0Var, aVar);
    }

    @C12579k
    @C11315i
    /* renamed from: a */
    public final C18570d<C18602a> mo53711a(@C12580l C18576b<C18602a> bVar, @C12579k List<? extends C18569c<C18602a>> list, @C12579k C11289a<? extends File> aVar) {
        Intrinsics.checkNotNullParameter(list, "migrations");
        Intrinsics.checkNotNullParameter(aVar, "produceFile");
        return m84339e(this, bVar, list, (C12074o0) null, aVar, 4, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: b */
    public final C18570d<C18602a> mo53712b(@C12580l C18576b<C18602a> bVar, @C12579k List<? extends C18569c<C18602a>> list, @C12579k C12074o0 o0Var, @C12579k C11289a<? extends File> aVar) {
        Intrinsics.checkNotNullParameter(list, "migrations");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        Intrinsics.checkNotNullParameter(aVar, "produceFile");
        return new PreferenceDataStore(C18571e.f47422a.mo53583b(C18607d.f47465a, bVar, list, o0Var, new PreferenceDataStoreFactory$create$delegate$1(aVar)));
    }

    @C12579k
    @C11315i
    /* renamed from: c */
    public final C18570d<C18602a> mo53713c(@C12580l C18576b<C18602a> bVar, @C12579k C11289a<? extends File> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "produceFile");
        return m84339e(this, bVar, (List) null, (C12074o0) null, aVar, 6, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: d */
    public final C18570d<C18602a> mo53714d(@C12579k C11289a<? extends File> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "produceFile");
        return m84339e(this, (C18576b) null, (List) null, (C12074o0) null, aVar, 7, (Object) null);
    }
}
