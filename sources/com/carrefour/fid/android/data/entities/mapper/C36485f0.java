package com.carrefour.fid.android.data.entities.mapper;

import com.carrefour.fid.android.data.entities.dlv.DlvCode;
import com.carrefour.fid.android.data.entities.dlv.DlvDuration;
import com.carrefour.fid.android.data.entities.dlv.DlvOption;
import com.carrefour.fid.android.data.entities.dlv.GtinWithQty;
import com.carrefour.fid.android.domain.models.delivery.C38016a;
import com.carrefour.fid.android.domain.models.delivery.C38017b;
import com.carrefour.fid.android.domain.models.delivery.C38019d;
import com.carrefour.fid.android.domain.models.delivery.C38020e;
import com.carrefour.fid.android.domain.models.delivery.C38021f;
import com.carrefour.fid.android.domain.models.delivery.C38022g;
import com.carrefour.fid.android.domain.models.delivery.C38023h;
import com.carrefour.fid.android.domain.models.delivery.C38024i;
import com.carrefour.fid.android.domain.models.delivery.DeliveryCode;
import com.carrefour.fid.android.domain.models.delivery.DeliveryTemporalUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.mapper.f0 */
public final class C36485f0 {

    /* renamed from: com.carrefour.fid.android.data.entities.mapper.f0$a */
    public /* synthetic */ class C36486a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.data.entities.dlv.DlvCode[] r0 = com.carrefour.fid.android.data.entities.dlv.DlvCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.data.entities.dlv.DlvCode r1 = com.carrefour.fid.android.data.entities.dlv.DlvCode.AXS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.data.entities.dlv.DlvCode r1 = com.carrefour.fid.android.data.entities.dlv.DlvCode.AXL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.data.entities.dlv.DlvCode r1 = com.carrefour.fid.android.data.entities.dlv.DlvCode.XXL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.data.entities.dlv.DlvCode r1 = com.carrefour.fid.android.data.entities.dlv.DlvCode.PRC     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.data.entities.dlv.DlvCode r1 = com.carrefour.fid.android.data.entities.dlv.DlvCode.PRE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.carrefour.fid.android.data.entities.dlv.DlvCode r1 = com.carrefour.fid.android.data.entities.dlv.DlvCode.EXS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.mapper.C36485f0.C36486a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final GtinWithQty m149650a(@C12579k C38020e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return new GtinWithQty(eVar.mo117648e(), eVar.mo117650f());
    }

    /* renamed from: b */
    public static final DeliveryCode m149651b(DlvCode dlvCode) {
        switch (C36486a.$EnumSwitchMapping$0[dlvCode.ordinal()]) {
            case 1:
                return DeliveryCode.AXS;
            case 2:
                return DeliveryCode.AXL;
            case 3:
                return DeliveryCode.XXL;
            case 4:
                return DeliveryCode.PRC;
            case 5:
                return DeliveryCode.PRE;
            case 6:
                return DeliveryCode.EXS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public static final C38016a m149652c(DlvDuration dlvDuration) {
        return new C38016a(m149654e(dlvDuration.getTemporalUnit()), dlvDuration.getValue());
    }

    @C12579k
    /* renamed from: d */
    public static final C38017b m149653d(@C12579k DlvOption dlvOption) {
        Intrinsics.checkNotNullParameter(dlvOption, "<this>");
        switch (C36486a.$EnumSwitchMapping$0[dlvOption.getCode().ordinal()]) {
            case 1:
                return new C38024i(dlvOption.getFee().getUnscaledAmount(), m149651b(dlvOption.getCode()), m149652c(dlvOption.getMinDuration()), m149652c(dlvOption.getMaxDuration()));
            case 2:
                return new C38019d(dlvOption.getFee().getUnscaledAmount(), m149651b(dlvOption.getCode()), m149652c(dlvOption.getMinDuration()), m149652c(dlvOption.getMaxDuration()));
            case 3:
                return new C38024i(dlvOption.getFee().getUnscaledAmount(), m149651b(dlvOption.getCode()), m149652c(dlvOption.getMinDuration()), m149652c(dlvOption.getMaxDuration()));
            case 4:
                return new C38022g(dlvOption.getFee().getUnscaledAmount(), m149651b(dlvOption.getCode()), m149652c(dlvOption.getMinDuration()), m149652c(dlvOption.getMaxDuration()));
            case 5:
                return new C38023h(dlvOption.getFee().getUnscaledAmount(), m149651b(dlvOption.getCode()), m149652c(dlvOption.getMinDuration()), m149652c(dlvOption.getMaxDuration()));
            case 6:
                return new C38021f(dlvOption.getFee().getUnscaledAmount(), m149651b(dlvOption.getCode()), m149652c(dlvOption.getMinDuration()), m149652c(dlvOption.getMaxDuration()));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: e */
    public static final DeliveryTemporalUnit m149654e(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "HOURS")) {
            return DeliveryTemporalUnit.HOURS;
        }
        return DeliveryTemporalUnit.OTHER;
    }
}
