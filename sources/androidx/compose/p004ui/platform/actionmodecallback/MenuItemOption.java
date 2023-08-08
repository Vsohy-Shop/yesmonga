package androidx.compose.p004ui.platform.actionmodecallback;

import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo22516d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "", "id", "I", "q", "()I", "order", "r", "w", "titleResource", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.actionmodecallback.MenuItemOption */
public enum MenuItemOption {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);
    

    /* renamed from: id */
    private final int f39488id;
    private final int order;

    /* renamed from: androidx.compose.ui.platform.actionmodecallback.MenuItemOption$a */
    public /* synthetic */ class C15847a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption[] r0 = androidx.compose.p004ui.platform.actionmodecallback.MenuItemOption.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.p004ui.platform.actionmodecallback.MenuItemOption.Copy     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.p004ui.platform.actionmodecallback.MenuItemOption.Paste     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.p004ui.platform.actionmodecallback.MenuItemOption.Cut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.p004ui.platform.actionmodecallback.MenuItemOption.SelectAll     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.actionmodecallback.MenuItemOption.C15847a.<clinit>():void");
        }
    }

    /* access modifiers changed from: public */
    MenuItemOption(int i) {
        this.f39488id = i;
        this.order = i;
    }

    /* renamed from: q */
    public final int mo45647q() {
        return this.f39488id;
    }

    /* renamed from: r */
    public final int mo45648r() {
        return this.order;
    }

    /* renamed from: w */
    public final int mo45649w() {
        int i = C15847a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return 17039361;
        }
        if (i == 2) {
            return 17039371;
        }
        if (i == 3) {
            return 17039363;
        }
        if (i == 4) {
            return 17039373;
        }
        throw new NoWhenBranchMatchedException();
    }
}
