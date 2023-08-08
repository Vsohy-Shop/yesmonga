package com.carrefour.fid.android.checkout.domain.extension;

import com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent;
import com.carrefour.fid.android.domain.models.slot.SlotPartOfDay;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.checkout.domain.extension.b */
public final class C39854b {

    /* renamed from: com.carrefour.fid.android.checkout.domain.extension.b$a */
    public /* synthetic */ class C39855a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent$ServiceSlotPartOfDay[] r0 = com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent.ServiceSlotPartOfDay.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent$ServiceSlotPartOfDay r2 = com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent.ServiceSlotPartOfDay.MORNING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent$ServiceSlotPartOfDay r3 = com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent.ServiceSlotPartOfDay.EVENING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent$ServiceSlotPartOfDay r4 = com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent.ServiceSlotPartOfDay.AFTERNOON     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                com.carrefour.fid.android.domain.models.slot.SlotPartOfDay[] r0 = com.carrefour.fid.android.domain.models.slot.SlotPartOfDay.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.slot.SlotPartOfDay r4 = com.carrefour.fid.android.domain.models.slot.SlotPartOfDay.MORNING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.carrefour.fid.android.domain.models.slot.SlotPartOfDay r1 = com.carrefour.fid.android.domain.models.slot.SlotPartOfDay.EVENING     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                com.carrefour.fid.android.domain.models.slot.SlotPartOfDay r1 = com.carrefour.fid.android.domain.models.slot.SlotPartOfDay.AFTERNOON     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.extension.C39854b.C39855a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final SlotPartOfDay m162474a(@C12579k ServiceSlotDayTimeComponent.ServiceSlotPartOfDay serviceSlotPartOfDay) {
        Intrinsics.checkNotNullParameter(serviceSlotPartOfDay, "<this>");
        int i = C39855a.$EnumSwitchMapping$0[serviceSlotPartOfDay.ordinal()];
        if (i == 1) {
            return SlotPartOfDay.MORNING;
        }
        if (i == 2) {
            return SlotPartOfDay.EVENING;
        }
        if (i == 3) {
            return SlotPartOfDay.AFTERNOON;
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12579k
    /* renamed from: b */
    public static final ServiceSlotDayTimeComponent.ServiceSlotPartOfDay m162475b(@C12579k SlotPartOfDay slotPartOfDay) {
        Intrinsics.checkNotNullParameter(slotPartOfDay, "<this>");
        int i = C39855a.$EnumSwitchMapping$1[slotPartOfDay.ordinal()];
        if (i == 1) {
            return ServiceSlotDayTimeComponent.ServiceSlotPartOfDay.MORNING;
        }
        if (i == 2) {
            return ServiceSlotDayTimeComponent.ServiceSlotPartOfDay.EVENING;
        }
        if (i == 3) {
            return ServiceSlotDayTimeComponent.ServiceSlotPartOfDay.AFTERNOON;
        }
        throw new NoWhenBranchMatchedException();
    }
}
