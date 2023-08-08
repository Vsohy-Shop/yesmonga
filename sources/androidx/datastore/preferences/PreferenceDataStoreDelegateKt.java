package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.C18569c;
import androidx.datastore.core.C18570d;
import androidx.datastore.core.handlers.C18576b;
import androidx.datastore.preferences.core.C18602a;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.C11427e;
import kotlinx.coroutines.C11719b3;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PreferenceDataStoreDelegateKt {
    @C12579k
    /* renamed from: a */
    public static final C11427e<Context, C18570d<C18602a>> m84091a(@C12579k String str, @C12580l C18576b<C18602a> bVar, @C12579k C11300l<? super Context, ? extends List<? extends C18569c<C18602a>>> lVar, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(lVar, "produceMigrations");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        return new PreferenceDataStoreSingletonDelegate(str, bVar, lVar, o0Var);
    }

    /* renamed from: b */
    public static /* synthetic */ C11427e m84092b(String str, C18576b bVar, C11300l lVar, C12074o0 o0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        if ((i & 4) != 0) {
            lVar = PreferenceDataStoreDelegateKt$preferencesDataStore$1.f47437f;
        }
        if ((i & 8) != 0) {
            C11768d1 d1Var = C11768d1.f29186a;
            o0Var = C12079p0.m48260a(C11768d1.m46781c().mo7443Q(C11719b3.m46155c((C11723c2) null, 1, (Object) null)));
        }
        return m84091a(str, bVar, lVar, o0Var);
    }
}
