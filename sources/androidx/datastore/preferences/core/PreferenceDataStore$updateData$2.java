package androidx.datastore.preferences.core;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", mo22502f = "PreferenceDataStoreFactory.kt", mo22503i = {}, mo22504l = {85}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Landroidx/datastore/preferences/core/a;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class PreferenceDataStore$updateData$2 extends SuspendLambda implements C11304p<C18602a, C11045c<? super C18602a>, Object> {
    final /* synthetic */ C11304p<C18602a, C11045c<? super C18602a>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceDataStore$updateData$2(C11304p<? super C18602a, ? super C11045c<? super C18602a>, ? extends Object> pVar, C11045c<? super PreferenceDataStore$updateData$2> cVar) {
        super(2, cVar);
        this.$transform = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.$transform, cVar);
        preferenceDataStore$updateData$2.L$0 = obj;
        return preferenceDataStore$updateData$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C18602a aVar, @C12580l C11045c<? super C18602a> cVar) {
        return ((PreferenceDataStore$updateData$2) create(aVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11304p<C18602a, C11045c<? super C18602a>, Object> pVar = this.$transform;
            this.label = 1;
            obj = pVar.invoke((C18602a) this.L$0, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C18602a aVar = (C18602a) obj;
        ((MutablePreferences) aVar).mo53698h();
        return aVar;
    }
}
