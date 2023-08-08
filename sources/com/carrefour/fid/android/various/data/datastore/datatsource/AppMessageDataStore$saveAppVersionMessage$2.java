package com.carrefour.fid.android.various.data.datastore.datatsource;

import androidx.datastore.preferences.core.C18602a;
import androidx.datastore.preferences.core.MutablePreferences;
import com.carrefour.fid.android.various.domain.model.AppMessage;
import com.carrefour.fid.android.various.domain.model.AppMessageRecurrence;
import com.carrefour.fid.android.various.domain.model.AppMessageType;
import com.contentsquare.android.api.C14092c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.serialization.C12442r;
import kotlinx.serialization.json.C12341a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.Instant;

@C11067d(mo22501c = "com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore$saveAppVersionMessage$2", mo22502f = "AppMessageDataStore.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "store", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAppMessageDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppMessageDataStore.kt\ncom/carrefour/fid/android/various/data/datastore/datatsource/AppMessageDataStore$saveAppVersionMessage$2\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,82:1\n89#2:83\n32#3:84\n80#4:85\n*S KotlinDebug\n*F\n+ 1 AppMessageDataStore.kt\ncom/carrefour/fid/android/various/data/datastore/datatsource/AppMessageDataStore$saveAppVersionMessage$2\n*L\n74#1:83\n74#1:84\n74#1:85\n*E\n"})
public final class AppMessageDataStore$saveAppVersionMessage$2 extends SuspendLambda implements C11304p<MutablePreferences, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ AppMessage $message;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppMessageDataStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppMessageDataStore$saveAppVersionMessage$2(AppMessageDataStore appMessageDataStore, AppMessage appMessage, C11045c<? super AppMessageDataStore$saveAppVersionMessage$2> cVar) {
        super(2, cVar);
        this.this$0 = appMessageDataStore;
        this.$message = appMessage;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        AppMessageDataStore$saveAppVersionMessage$2 appMessageDataStore$saveAppVersionMessage$2 = new AppMessageDataStore$saveAppVersionMessage$2(this.this$0, this.$message, cVar);
        appMessageDataStore$saveAppVersionMessage$2.L$0 = obj;
        return appMessageDataStore$saveAppVersionMessage$2;
    }

    @C12580l
    public final Object invoke(@C12579k MutablePreferences mutablePreferences, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AppMessageDataStore$saveAppVersionMessage$2) create(mutablePreferences, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C18602a.C18603a b = this.this$0.f58282d;
            C12341a c = this.this$0.f58283e;
            ((MutablePreferences) this.L$0).mo53706o(b, c.mo25279d(C12442r.m50317h(c.mo25277a(), C11342l0.m43538A(AppMessage.class)), AppMessage.copy$default(this.$message, (String) null, (String) null, (String) null, (String) null, (String) null, (AppMessageRecurrence) null, C11064a.m42621g(Instant.m51507H1().mo27912k()), (AppMessageType) null, C14092c.f34557T, (Object) null)));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
