package com.carrefour.fid.android.various.data.datastore.datatsource;

import com.carrefour.fid.android.various.domain.model.AppMessageRecurrence;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.json.C12351e;
import kotlinx.serialization.modules.C12431b;
import kotlinx.serialization.modules.C12435f;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Lkotlinx/serialization/json/e;", "Lkotlin/d2;", "invoke", "(Lkotlinx/serialization/json/e;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAppMessageDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppMessageDataStore.kt\ncom/carrefour/fid/android/various/data/datastore/datatsource/AppMessageDataStore$json$1\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n+ 3 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilderKt\n*L\n1#1,82:1\n31#2,2:83\n244#2,7:85\n251#2,2:95\n33#2:97\n110#3:92\n110#3:93\n110#3:94\n*S KotlinDebug\n*F\n+ 1 AppMessageDataStore.kt\ncom/carrefour/fid/android/various/data/datastore/datatsource/AppMessageDataStore$json$1\n*L\n32#1:83,2\n33#1:85,7\n33#1:95,2\n32#1:97\n34#1:92\n35#1:93\n36#1:94\n*E\n"})
public final class AppMessageDataStore$json$1 extends Lambda implements C11300l<C12351e, C11079d2> {

    /* renamed from: f */
    public static final AppMessageDataStore$json$1 f58292f = new AppMessageDataStore$json$1();

    public AppMessageDataStore$json$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C12351e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C12351e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Json");
        C12435f fVar = new C12435f();
        C12431b bVar = new C12431b(C11342l0.m43547d(AppMessageRecurrence.class), (C12248g) null);
        bVar.mo25577d(C11342l0.m43547d(AppMessageRecurrence.Blocker.class), AppMessageRecurrence.Blocker.INSTANCE.serializer());
        bVar.mo25577d(C11342l0.m43547d(AppMessageRecurrence.Info.class), AppMessageRecurrence.Info.INSTANCE.serializer());
        bVar.mo25577d(C11342l0.m43547d(AppMessageRecurrence.Warning.class), AppMessageRecurrence.Warning.Companion.mo67234a());
        bVar.mo25574a(fVar);
        eVar.mo25329A(fVar.mo25583g());
    }
}
