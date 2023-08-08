package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import android.content.Context;
import androidx.annotation.C0324b1;
import com.carrefour.fid.android.domain.models.delivery.C38016a;
import com.carrefour.fid.android.domain.models.delivery.DeliveryTemporalUnit;
import com.urbanairship.iam.events.C9175a;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.g */
public final class C23669g {

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.g$a */
    public /* synthetic */ class C23670a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.models.delivery.DeliveryTemporalUnit[] r0 = com.carrefour.fid.android.domain.models.delivery.DeliveryTemporalUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.delivery.DeliveryTemporalUnit r1 = com.carrefour.fid.android.domain.models.delivery.DeliveryTemporalUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.delivery.DeliveryTemporalUnit r1 = com.carrefour.fid.android.domain.models.delivery.DeliveryTemporalUnit.OTHER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.C23669g.C23670a.<clinit>():void");
        }
    }

    @C12580l
    /* renamed from: a */
    public static final String m105129a(@C12579k Context context, @C0324b1 int i, @C12579k C38016a aVar, @C12579k C38016a aVar2) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "deliveryDurationMin");
        Intrinsics.checkNotNullParameter(aVar2, "deliveryDurationMax");
        DeliveryTemporalUnit e = aVar.mo117628e();
        int[] iArr = C23670a.$EnumSwitchMapping$0;
        int i2 = iArr[e.ordinal()];
        if (i2 == 1) {
            TimeUnit timeUnit = TimeUnit.HOURS;
            long days = timeUnit.toDays((long) aVar.mo117630f());
            int i3 = iArr[aVar2.mo117628e().ordinal()];
            if (i3 == 1) {
                return context.getString(i, new Object[]{Long.valueOf(days), Long.valueOf(timeUnit.toDays((long) aVar2.mo117630f()))});
            } else if (i3 == 2) {
                return null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i2 == 2) {
            return null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
