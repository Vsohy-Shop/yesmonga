package androidx.compose.p004ui.autofill;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.lifecycle.C19456p0;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n151#2,3:231\n33#2,4:234\n154#2,2:238\n38#2:240\n156#2:241\n37#3,2:242\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n96#1:231,3\n96#1:234,4\n96#1:238,2\n96#1:240\n96#1:241\n96#1:242,2\n*E\n"})
/* renamed from: androidx.compose.ui.autofill.h */
public final class C8712h {
    @C0376v0(26)
    @C8761g
    /* renamed from: a */
    public static final void m32326a(@C12579k C8709e eVar, @C12579k SparseArray<AutofillValue> sparseArray) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(sparseArray, C19456p0.f49833g);
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue a = C8711g.m32325a(sparseArray.get(keyAt));
            C8724t tVar = C8724t.f23395a;
            Intrinsics.checkNotNullExpressionValue(a, "value");
            if (tVar.mo17038d(a)) {
                eVar.mo17029d().mo17056b(keyAt, tVar.mo17043i(a).toString());
            } else if (tVar.mo17036b(a)) {
                throw new NotImplementedError("An operation is not implemented: " + "b/138604541: Add onFill() callback for date");
            } else if (tVar.mo17037c(a)) {
                throw new NotImplementedError("An operation is not implemented: " + "b/138604541: Add onFill() callback for list");
            } else if (tVar.mo17039e(a)) {
                throw new NotImplementedError("An operation is not implemented: " + "b/138604541:  Add onFill() callback for toggle");
            }
        }
    }

    @C0376v0(26)
    @C8761g
    /* renamed from: b */
    public static final void m32327b(@C12579k C8709e eVar, @C12579k ViewStructure viewStructure) {
        ViewStructure viewStructure2 = viewStructure;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(viewStructure2, C10108c.f27819v);
        int a = C8714j.f23394a.mo17031a(viewStructure2, eVar.mo17029d().mo17055a().size());
        for (Map.Entry next : eVar.mo17029d().mo17055a().entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            C8729y yVar = (C8729y) next.getValue();
            C8714j jVar = C8714j.f23394a;
            ViewStructure b = jVar.mo17032b(viewStructure2, a);
            if (b != null) {
                C8724t tVar = C8724t.f23395a;
                AutofillId a2 = tVar.mo17035a(viewStructure2);
                Intrinsics.checkNotNull(a2);
                tVar.mo17041g(b, a2, intValue);
                jVar.mo17034d(b, intValue, eVar.mo17030e().getContext().getPackageName(), (String) null, (String) null);
                tVar.mo17042h(b, 1);
                List<AutofillType> c = yVar.mo17047c();
                ArrayList arrayList = new ArrayList(c.size());
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(C8710f.m32323b(c.get(i)));
                }
                tVar.mo17040f(b, (String[]) arrayList.toArray(new String[0]));
                C15098i d = yVar.mo17048d();
                if (d != null) {
                    int L0 = C11409d.m43851L0(d.mo42279t());
                    int L02 = C11409d.m43851L0(d.mo42249B());
                    C8714j.f23394a.mo17033c(b, L0, L02, 0, 0, C11409d.m43851L0(d.mo42283x()) - L0, C11409d.m43851L0(d.mo42271j()) - L02);
                }
            }
            a++;
        }
    }
}
