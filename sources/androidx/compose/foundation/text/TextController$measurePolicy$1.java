package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C2837n;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16500q;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n80#2,3:703\n83#2:710\n84#2:712\n85#2:714\n69#3,4:706\n74#3:713\n1#4:711\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1\n*L\n343#1:703,3\n343#1:710\n343#1:712\n343#1:714\n343#1:706,4\n343#1:713\n343#1:711\n*E\n"})
public final class TextController$measurePolicy$1 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ TextController f7183a;

    public TextController$measurePolicy$1(TextController textController) {
        this.f7183a = textController;
    }

    @C12579k
    /* renamed from: a */
    public C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        boolean z;
        int i;
        Pair pair;
        C2837n a;
        C15568h0 h0Var2 = h0Var;
        List<? extends C15557e0> list2 = list;
        Intrinsics.checkNotNullParameter(h0Var2, "$this$measure");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        this.f7183a.mo9331l().mo9468c();
        C16260h0 d = this.f7183a.mo9331l().mo9469d();
        C16260h0 o = this.f7183a.mo9331l().mo9475j().mo9580o(j, h0Var.getLayoutDirection(), d);
        if (!Intrinsics.areEqual((Object) d, (Object) o)) {
            this.f7183a.mo9331l().mo9470e().invoke(o);
            if (d != null) {
                TextController textController = this.f7183a;
                if (!Intrinsics.areEqual((Object) d.mo47058l().mo47040n(), (Object) o.mo47058l().mo47040n()) && (a = textController.f7170b) != null) {
                    a.mo9706g(textController.mo9331l().mo9473h());
                }
            }
        }
        this.f7183a.mo9331l().mo9479n(o);
        if (list.size() >= o.mo47042A().size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<C15098i> A = o.mo47042A();
            ArrayList arrayList = new ArrayList(A.size());
            int size = A.size();
            int i2 = 0;
            while (i2 < size) {
                C15098i iVar = A.get(i2);
                if (iVar != null) {
                    i = size;
                    pair = new Pair(((C15557e0) list2.get(i2)).mo44324t0(C16478c.m74377b(0, (int) ((float) Math.floor((double) iVar.mo42253G())), 0, (int) ((float) Math.floor((double) iVar.mo42278r())), 5, (Object) null)), C16494m.m74570b(C16496n.m74593a(C11409d.m43851L0(iVar.mo42279t()), C11409d.m43851L0(iVar.mo42249B()))));
                } else {
                    i = size;
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
                i2++;
                size = i;
            }
            return h0Var2.mo8741C3(C16500q.m74662m(o.mo47043B()), C16500q.m74659j(o.mo47043B()), C10977s0.m41456W(C11078d1.m42659a(AlignmentLineKt.m68885a(), Integer.valueOf(C11409d.m43851L0(o.mo47053h()))), C11078d1.m42659a(AlignmentLineKt.m68886b(), Integer.valueOf(C11409d.m43851L0(o.mo47057k())))), new TextController$measurePolicy$1$measure$2(arrayList));
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        this.f7183a.mo9331l().mo9475j().mo9581q(mVar.getLayoutDirection());
        return this.f7183a.mo9331l().mo9475j().mo9569d();
    }

    /* renamed from: c */
    public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return C16500q.m74659j(C2785r.m12642p(this.f7183a.mo9331l().mo9475j(), C16478c.m74376a(0, i, 0, Integer.MAX_VALUE), mVar.getLayoutDirection(), (C16260h0) null, 4, (Object) null).mo47043B());
    }

    /* renamed from: d */
    public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        this.f7183a.mo9331l().mo9475j().mo9581q(mVar.getLayoutDirection());
        return this.f7183a.mo9331l().mo9475j().mo9571f();
    }

    /* renamed from: e */
    public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return C16500q.m74659j(C2785r.m12642p(this.f7183a.mo9331l().mo9475j(), C16478c.m74376a(0, i, 0, Integer.MAX_VALUE), mVar.getLayoutDirection(), (C16260h0) null, 4, (Object) null).mo47043B());
    }
}
