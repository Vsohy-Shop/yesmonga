package androidx.compose.runtime.internal;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8586m1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.C11312x;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11366s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,176:1\n37#2,2:177\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n110#1:177,2\n*E\n"})
public final class ComposableLambdaNImpl implements C8554c {

    /* renamed from: a */
    public final int f22988a;

    /* renamed from: b */
    public final boolean f22989b;

    /* renamed from: c */
    public final int f22990c;
    @C12580l

    /* renamed from: d */
    public Object f22991d;
    @C12580l

    /* renamed from: e */
    public C8586m1 f22992e;
    @C12580l

    /* renamed from: f */
    public List<C8586m1> f22993f;

    public ComposableLambdaNImpl(int i, boolean z, int i2) {
        this.f22988a = i;
        this.f22989b = z;
        this.f22990c = i2;
    }

    @C12580l
    /* renamed from: O3 */
    public Object mo16197O3(@C12579k Object... objArr) {
        int i;
        Intrinsics.checkNotNullParameter(objArr, "args");
        int b = mo16199b(objArr.length);
        C8592o oVar = objArr[b];
        Intrinsics.checkNotNull(oVar, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = ArraysKt___ArraysKt.m40198su(objArr, C11479u.m44378W1(0, objArr.length - 1)).toArray(new Object[0]);
        Integer num = objArr[objArr.length - 1];
        Intrinsics.checkNotNull(num, "null cannot be cast to non-null type kotlin.Int");
        int intValue = num.intValue();
        C8592o o = oVar.mo15009o(this.f22988a);
        mo16200c(o);
        if (o.mo15006n0(this)) {
            i = C8553b.m31050d(b);
        } else {
            i = C8553b.m31052f(b);
        }
        int i2 = intValue | i;
        Object obj = this.f22991d;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        C11366s0 s0Var = new C11366s0(2);
        s0Var.mo22856b(array);
        s0Var.mo22855a(Integer.valueOf(i2));
        Object O3 = ((C11312x) obj).mo16197O3(s0Var.mo22858d(new Object[s0Var.mo22857c()]));
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ComposableLambdaNImpl$invoke$1(objArr, b, this));
        }
        return O3;
    }

    /* renamed from: a */
    public final int mo16198a() {
        return this.f22988a;
    }

    /* renamed from: b */
    public final int mo16199b(int i) {
        int i2 = (i - 1) - 1;
        for (int i3 = 1; i3 * 10 < i2; i3++) {
            i2--;
        }
        return i2;
    }

    /* renamed from: c */
    public final void mo16200c(C8592o oVar) {
        C8586m1 K;
        if (this.f22989b && (K = oVar.mo14912K()) != null) {
            oVar.mo14981g0(K);
            if (C8553b.m31051e(this.f22992e, K)) {
                this.f22992e = K;
                return;
            }
            List<C8586m1> list = this.f22993f;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f22993f = arrayList;
                arrayList.add(K);
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (C8553b.m31051e(list.get(i), K)) {
                    list.set(i, K);
                    return;
                }
            }
            list.add(K);
        }
    }

    /* renamed from: d */
    public final void mo16201d() {
        if (this.f22989b) {
            C8586m1 m1Var = this.f22992e;
            if (m1Var != null) {
                m1Var.invalidate();
                this.f22992e = null;
            }
            List<C8586m1> list = this.f22993f;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    /* renamed from: e */
    public final void mo16202e(@C12579k Object obj) {
        boolean z;
        Intrinsics.checkNotNullParameter(obj, C28534f.f69159i0);
        if (!Intrinsics.areEqual(obj, this.f22991d)) {
            if (this.f22991d == null) {
                z = true;
            } else {
                z = false;
            }
            this.f22991d = (C11312x) obj;
            if (!z) {
                mo16201d();
            }
        }
    }

    public int getArity() {
        return this.f22990c;
    }
}
