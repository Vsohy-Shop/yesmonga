package com.carrefour.fid.android.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.carrefour.fid.android.shared.data.datastore.pref.C28627a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.core.datastore.AppPreferencesStorage$saveDisplaySubscribeToNewsNotificationLastDate$2", mo22502f = "AppPreferencesStorage.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.core.datastore.AppPreferencesStorage$saveDisplaySubscribeToNewsNotificationLastDate$2 */
public final class C36192xea35d910 extends SuspendLambda implements C11304p<MutablePreferences, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public C36192xea35d910(C11045c<? super C36192xea35d910> cVar) {
        super(2, cVar);
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        C36192xea35d910 appPreferencesStorage$saveDisplaySubscribeToNewsNotificationLastDate$2 = new C36192xea35d910(cVar);
        appPreferencesStorage$saveDisplaySubscribeToNewsNotificationLastDate$2.L$0 = obj;
        return appPreferencesStorage$saveDisplaySubscribeToNewsNotificationLastDate$2;
    }

    @C12580l
    public final Object invoke(@C12579k MutablePreferences mutablePreferences, @C12580l C11045c<? super C11079d2> cVar) {
        return ((C36192xea35d910) create(mutablePreferences, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            ((MutablePreferences) this.L$0).mo53706o(C28627a.f70161a.mo83514o(), C11064a.m42621g(System.currentTimeMillis()));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
