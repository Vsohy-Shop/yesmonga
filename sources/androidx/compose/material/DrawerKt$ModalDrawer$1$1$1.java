package androidx.compose.material;

import androidx.compose.p004ui.unit.C16500q;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DrawerKt$ModalDrawer$1$1$1 extends Lambda implements C11304p<DrawerValue, C16500q, Float> {
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1$a */
    public /* synthetic */ class C2920a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material.DrawerValue[] r0 = androidx.compose.material.DrawerValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.DrawerValue r1 = androidx.compose.material.DrawerValue.Closed     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.DrawerValue r1 = androidx.compose.material.DrawerValue.Open     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1.C2920a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$1$1(float f, float f2) {
        super(2);
        this.$minValue = f;
        this.$maxValue = f2;
    }

    @C12580l
    /* renamed from: a */
    public final Float mo10153a(@C12579k DrawerValue drawerValue, long j) {
        Intrinsics.checkNotNullParameter(drawerValue, "value");
        int i = C2920a.$EnumSwitchMapping$0[drawerValue.ordinal()];
        if (i == 1) {
            return Float.valueOf(this.$minValue);
        }
        if (i == 2) {
            return Float.valueOf(this.$maxValue);
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo10153a((DrawerValue) obj, ((C16500q) obj2).mo47895q());
    }
}
