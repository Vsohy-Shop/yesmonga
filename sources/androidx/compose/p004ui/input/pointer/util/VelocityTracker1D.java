package androidx.compose.p004ui.input.pointer.util;

import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker1D */
public final class VelocityTracker1D {

    /* renamed from: f */
    public static final int f38546f = 8;

    /* renamed from: a */
    public final boolean f38547a;
    @C12579k

    /* renamed from: b */
    public final Strategy f38548b;

    /* renamed from: c */
    public final int f38549c;
    @C12579k

    /* renamed from: d */
    public final C15501a[] f38550d;

    /* renamed from: e */
    public int f38551e;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy */
    public enum Strategy {
        Lsq2,
        Impulse
    }

    /* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker1D$a */
    public /* synthetic */ class C15500a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy[] r0 = androidx.compose.p004ui.input.pointer.util.VelocityTracker1D.Strategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy r1 = androidx.compose.p004ui.input.pointer.util.VelocityTracker1D.Strategy.Impulse     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy r1 = androidx.compose.p004ui.input.pointer.util.VelocityTracker1D.Strategy.Lsq2     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.util.VelocityTracker1D.C15500a.<clinit>():void");
        }
    }

    public VelocityTracker1D() {
        this(false, (Strategy) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final void mo44133a(long j, float f) {
        int i = (this.f38551e + 1) % 20;
        this.f38551e = i;
        C15505e.m68785g(this.f38550d, i, j, f);
    }

    /* renamed from: b */
    public final float mo44134b(List<Float> list, List<Float> list2) {
        try {
            return C15505e.m68784f(list2, list, 2).get(1).floatValue();
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    /* renamed from: c */
    public final float mo44135c() {
        float f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = this.f38551e;
        C15501a aVar = this.f38550d[i];
        if (aVar == null) {
            return 0.0f;
        }
        int i2 = 0;
        C15501a aVar2 = aVar;
        while (true) {
            C15501a aVar3 = this.f38550d[i];
            if (aVar3 != null) {
                float f2 = (float) (aVar.mo44143f() - aVar3.mo44143f());
                float abs = (float) Math.abs(aVar3.mo44143f() - aVar2.mo44143f());
                if (f2 > 100.0f || abs > 40.0f) {
                    break;
                }
                arrayList.add(Float.valueOf(aVar3.mo44141e()));
                arrayList2.add(Float.valueOf(-f2));
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                aVar2 = aVar3;
            } else {
                break;
            }
        }
        if (i2 < this.f38549c) {
            return 0.0f;
        }
        int i3 = C15500a.$EnumSwitchMapping$0[this.f38548b.ordinal()];
        if (i3 == 1) {
            f = C15505e.m68782d(arrayList, arrayList2, this.f38547a);
        } else if (i3 == 2) {
            f = mo44134b(arrayList, arrayList2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return f * ((float) 1000);
    }

    /* renamed from: d */
    public final boolean mo44136d() {
        return this.f38547a;
    }

    /* renamed from: e */
    public final void mo44137e() {
        C10956m.m41313w2(this.f38550d, (Object) null, 0, 0, 6, (Object) null);
        this.f38551e = 0;
    }

    public VelocityTracker1D(boolean z, @C12579k Strategy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f38547a = z;
        this.f38548b = strategy;
        if (!z || !strategy.equals(Strategy.Lsq2)) {
            int i = C15500a.$EnumSwitchMapping$0[strategy.ordinal()];
            int i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.f38549c = i2;
            C15501a[] aVarArr = new C15501a[20];
            for (int i3 = 0; i3 < 20; i3++) {
                aVarArr[i3] = null;
            }
            this.f38550d = aVarArr;
            return;
        }
        throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VelocityTracker1D(boolean z, Strategy strategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public VelocityTracker1D(boolean z) {
        this(z, Strategy.Impulse);
    }
}
