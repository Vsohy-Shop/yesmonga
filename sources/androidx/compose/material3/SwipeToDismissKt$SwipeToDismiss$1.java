package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16500q;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwipeToDismissKt$SwipeToDismiss$1 extends Lambda implements C11304p<DismissValue, C16500q, Float> {
    final /* synthetic */ Set<DismissDirection> $directions;

    /* renamed from: androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$1$a */
    public /* synthetic */ class C8114a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.DismissValue[] r0 = androidx.compose.material3.DismissValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.DismissValue r1 = androidx.compose.material3.DismissValue.DismissedToEnd     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.DismissValue r1 = androidx.compose.material3.DismissValue.DismissedToStart     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.DismissValue r1 = androidx.compose.material3.DismissValue.Default     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeToDismissKt$SwipeToDismiss$1.C8114a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$1(Set<? extends DismissDirection> set) {
        super(2);
        this.$directions = set;
    }

    @C12580l
    /* renamed from: a */
    public final Float mo12016a(@C12579k DismissValue dismissValue, long j) {
        Intrinsics.checkNotNullParameter(dismissValue, "value");
        float m = (float) C16500q.m74662m(j);
        int i = C8114a.$EnumSwitchMapping$0[dismissValue.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return Float.valueOf(0.0f);
                }
                throw new NoWhenBranchMatchedException();
            } else if (this.$directions.contains(DismissDirection.EndToStart)) {
                return Float.valueOf(-m);
            } else {
                return null;
            }
        } else if (this.$directions.contains(DismissDirection.StartToEnd)) {
            return Float.valueOf(m);
        } else {
            return null;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo12016a((DismissValue) obj, ((C16500q) obj2).mo47895q());
    }
}
