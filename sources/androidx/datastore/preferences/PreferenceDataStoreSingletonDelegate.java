package androidx.datastore.preferences;

import android.content.Context;
import androidx.annotation.C0323b0;
import androidx.datastore.core.C18569c;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.handlers.C18576b;
import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.C11427e;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PreferenceDataStoreSingletonDelegate implements C11427e<Context, C18570d<C18602a>> {
    @C12579k

    /* renamed from: a */
    public final String f47438a;
    @C12580l

    /* renamed from: b */
    public final C18576b<C18602a> f47439b;
    @C12579k

    /* renamed from: c */
    public final C11300l<Context, List<C18569c<C18602a>>> f47440c;
    @C12579k

    /* renamed from: d */
    public final C12074o0 f47441d;
    @C12579k

    /* renamed from: e */
    public final Object f47442e = new Object();
    @C12580l
    @C0323b0("lock")

    /* renamed from: f */
    public volatile C18570d<C18602a> f47443f;

    public PreferenceDataStoreSingletonDelegate(@C12579k String str, @C12580l C18576b<C18602a> bVar, @C12579k C11300l<? super Context, ? extends List<? extends C18569c<C18602a>>> lVar, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(lVar, "produceMigrations");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        this.f47438a = str;
        this.f47439b = bVar;
        this.f47440c = lVar;
        this.f47441d = o0Var;
    }

    @C12579k
    /* renamed from: d */
    public C18570d<C18602a> mo22938a(@C12579k Context context, @C12579k C11510n<?> nVar) {
        C18570d<C18602a> dVar;
        Intrinsics.checkNotNullParameter(context, "thisRef");
        Intrinsics.checkNotNullParameter(nVar, "property");
        C18570d<C18602a> dVar2 = this.f47443f;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f47442e) {
            if (this.f47443f == null) {
                Context applicationContext = context.getApplicationContext();
                PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.f47461a;
                C18576b<C18602a> bVar = this.f47439b;
                C11300l<Context, List<C18569c<C18602a>>> lVar = this.f47440c;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                this.f47443f = preferenceDataStoreFactory.mo53712b(bVar, lVar.invoke(applicationContext), this.f47441d, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
            }
            dVar = this.f47443f;
            Intrinsics.checkNotNull(dVar);
        }
        return dVar;
    }
}
