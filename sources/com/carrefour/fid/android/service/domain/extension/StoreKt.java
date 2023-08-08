package com.carrefour.fid.android.service.domain.extension;

import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/service/models/l;", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "getDriveType", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Store.kt\ncom/carrefour/fid/android/service/domain/extension/StoreKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,6:1\n1#2:7\n*E\n"})
public final class StoreKt {
    @C12580l
    public static final DriveType getDriveType(@C12579k C38163l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        for (StoreService driveType : lVar.mo119367K()) {
            DriveType driveType2 = StoreServiceKt.getDriveType(driveType);
            if (driveType2 != null) {
                return driveType2;
            }
        }
        return null;
    }
}
