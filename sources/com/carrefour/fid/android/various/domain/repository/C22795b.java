package com.carrefour.fid.android.various.domain.repository;

import com.google.firebase.remoteconfig.C33563l;
import com.google.firebase.remoteconfig.C33568o;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFirebaseRemoteConfigExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseRemoteConfigExt.kt\ncom/carrefour/fid/android/various/domain/repository/FirebaseRemoteConfigExtKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,8:1\n125#2:9\n152#2,3:10\n*S KotlinDebug\n*F\n+ 1 FirebaseRemoteConfigExt.kt\ncom/carrefour/fid/android/various/domain/repository/FirebaseRemoteConfigExtKt\n*L\n5#1:9\n5#1:10,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.various.domain.repository.b */
public final class C22795b {
    @C12579k
    /* renamed from: a */
    public static final Map<String, String> m103040a(@C12579k C33563l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Map<String, C33568o> o = lVar.mo97398o();
        Intrinsics.checkNotNullExpressionValue(o, "all");
        ArrayList arrayList = new ArrayList(o.size());
        for (Map.Entry next : o.entrySet()) {
            arrayList.add(C11078d1.m42659a(next.getKey(), ((C33568o) next.getValue()).mo97377b()));
        }
        return C10977s0.m41426B0(arrayList);
    }
}
