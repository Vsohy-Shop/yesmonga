package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;

/* renamed from: com.urbanairship.android.layout.property.s */
public abstract class C35852s {
    @C0359n0

    /* renamed from: a */
    public final ToggleType f88631a;

    /* renamed from: com.urbanairship.android.layout.property.s$a */
    public static /* synthetic */ class C35853a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f88632a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.urbanairship.android.layout.property.ToggleType[] r0 = com.urbanairship.android.layout.property.ToggleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f88632a = r0
                com.urbanairship.android.layout.property.ToggleType r1 = com.urbanairship.android.layout.property.ToggleType.SWITCH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f88632a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.urbanairship.android.layout.property.ToggleType r1 = com.urbanairship.android.layout.property.ToggleType.CHECKBOX     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.property.C35852s.C35853a.<clinit>():void");
        }
    }

    public C35852s(@C0359n0 ToggleType toggleType) {
        this.f88631a = toggleType;
    }

    @C0359n0
    /* renamed from: a */
    public static C35852s m147813a(@C0359n0 C9323b bVar) throws JsonException {
        String B = bVar.mo18801A("type").mo18750B();
        int i = C35853a.f88632a[ToggleType.m147719b(B).ordinal()];
        if (i == 1) {
            return C35849p.m147802c(bVar);
        }
        if (i == 2) {
            return C35832e.m147747c(bVar);
        }
        throw new JsonException("Failed to parse ToggleStyle! Unknown type: " + B);
    }

    @C0359n0
    /* renamed from: b */
    public ToggleType mo107377b() {
        return this.f88631a;
    }
}
