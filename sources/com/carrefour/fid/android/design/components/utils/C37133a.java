package com.carrefour.fid.android.design.components.utils;

import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.utils.a */
public final class C37133a {

    /* renamed from: c */
    public static final int f92972c = 8;
    @C12579k

    /* renamed from: a */
    public DebouncerValue f92973a;
    @C12579k

    /* renamed from: b */
    public final DebouncerValue f92974b;

    /* renamed from: com.carrefour.fid.android.design.components.utils.a$a */
    public /* synthetic */ class C37134a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.design.components.utils.DebouncerValue[] r0 = com.carrefour.fid.android.design.components.utils.DebouncerValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.utils.DebouncerValue r1 = com.carrefour.fid.android.design.components.utils.DebouncerValue.FORCE_DISABLED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.utils.DebouncerValue r1 = com.carrefour.fid.android.design.components.utils.DebouncerValue.DISABLED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.utils.DebouncerValue r1 = com.carrefour.fid.android.design.components.utils.DebouncerValue.ENABLED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.utils.C37133a.C37134a.<clinit>():void");
        }
    }

    public C37133a() {
        DebouncerValue debouncerValue = DebouncerValue.DISABLED;
        this.f92973a = debouncerValue;
        this.f92974b = debouncerValue;
    }

    /* renamed from: b */
    public static /* synthetic */ void m152202b(C37133a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        aVar.mo112751a(z);
    }

    /* renamed from: a */
    public final void mo112751a(boolean z) {
        if (z) {
            this.f92973a = DebouncerValue.FORCE_DISABLED;
        } else if (this.f92974b == DebouncerValue.ENABLED) {
            this.f92973a = DebouncerValue.DISABLED;
        }
    }

    /* renamed from: c */
    public final void mo112752c() {
        int i = C37134a.$EnumSwitchMapping$0[this.f92974b.ordinal()];
        if (i == 1) {
            this.f92973a = DebouncerValue.DISABLED;
        } else if (i == 2) {
            this.f92973a = DebouncerValue.ENABLED;
        }
    }

    @C12579k
    /* renamed from: d */
    public final DebouncerValue mo112753d() {
        return this.f92974b;
    }
}
