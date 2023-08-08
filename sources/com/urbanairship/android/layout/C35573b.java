package com.urbanairship.android.layout;

import androidx.annotation.C0359n0;
import com.urbanairship.android.layout.property.PresentationType;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;

/* renamed from: com.urbanairship.android.layout.b */
public abstract class C35573b {
    @C0359n0

    /* renamed from: a */
    public final PresentationType f87955a;

    /* renamed from: com.urbanairship.android.layout.b$a */
    public static /* synthetic */ class C35574a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f87956a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.urbanairship.android.layout.property.PresentationType[] r0 = com.urbanairship.android.layout.property.PresentationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f87956a = r0
                com.urbanairship.android.layout.property.PresentationType r1 = com.urbanairship.android.layout.property.PresentationType.BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f87956a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.urbanairship.android.layout.property.PresentationType r1 = com.urbanairship.android.layout.property.PresentationType.MODAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.C35573b.C35574a.<clinit>():void");
        }
    }

    public C35573b(@C0359n0 PresentationType presentationType) {
        this.f87955a = presentationType;
    }

    @C0359n0
    /* renamed from: a */
    public static C35573b m146835a(@C0359n0 C9323b bVar) throws JsonException {
        String B = bVar.mo18801A("type").mo18750B();
        int i = C35574a.f87956a[PresentationType.m147683b(B).ordinal()];
        if (i == 1) {
            return C35572a.m146830c(bVar);
        }
        if (i == 2) {
            return C35576d.m146837c(bVar);
        }
        throw new JsonException("Failed to parse presentation! Unknown type: " + B);
    }

    @C0359n0
    /* renamed from: b */
    public PresentationType mo106580b() {
        return this.f87955a;
    }
}
