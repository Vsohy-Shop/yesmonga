package com.carrefour.fid.android.domain.models.consent;

import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/consent/ChoiceOptIn;", "", "", "r", "<init>", "(Ljava/lang/String;I)V", "a", "c", "d", "e", "f", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum ChoiceOptIn {
    REFUSED,
    ACCEPTED,
    FORCED,
    NO_SPECIFIED;
    
    @C12579k

    /* renamed from: a */
    public static final C37994a f95635a = null;
    @C12579k

    /* renamed from: b */
    public static final ChoiceOptIn f95636b = null;

    /* renamed from: com.carrefour.fid.android.domain.models.consent.ChoiceOptIn$a */
    public static final class C37994a {
        public /* synthetic */ C37994a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final ChoiceOptIn mo117316a(boolean z) {
            if (z) {
                return ChoiceOptIn.ACCEPTED;
            }
            if (!z) {
                return ChoiceOptIn.REFUSED;
            }
            throw new NoWhenBranchMatchedException();
        }

        @C12579k
        /* renamed from: b */
        public final ChoiceOptIn mo117317b() {
            return ChoiceOptIn.f95636b;
        }

        public C37994a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.consent.ChoiceOptIn$b */
    public /* synthetic */ class C37995b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.carrefour.fid.android.domain.models.consent.ChoiceOptIn[] r0 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r1 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.ACCEPTED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r1 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.NO_SPECIFIED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r1 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.REFUSED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r1 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.FORCED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.C37995b.<clinit>():void");
        }
    }

    /* access modifiers changed from: public */
    static {
        ChoiceOptIn choiceOptIn;
        f95635a = new C37994a((DefaultConstructorMarker) null);
        f95636b = choiceOptIn;
    }

    /* renamed from: r */
    public final boolean mo117315r() {
        int i = C37995b.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
