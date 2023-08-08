package androidx.compose.p004ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.unit.C16476b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5 */
public final class AndroidViewHolder$layoutNode$1$5 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ AndroidViewHolder f40943a;

    /* renamed from: b */
    public final /* synthetic */ LayoutNode f40944b;

    public AndroidViewHolder$layoutNode$1$5(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        this.f40943a = androidViewHolder;
        this.f40944b = layoutNode;
    }

    @C12579k
    /* renamed from: a */
    public C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (this.f40943a.getChildCount() == 0) {
            return C15568h0.m69206r2(h0Var, C16476b.m74364r(j), C16476b.m74363q(j), (Map) null, AndroidViewHolder$layoutNode$1$5$measure$1.f40945f, 4, (Object) null);
        }
        if (C16476b.m74364r(j) != 0) {
            this.f40943a.getChildAt(0).setMinimumWidth(C16476b.m74364r(j));
        }
        if (C16476b.m74363q(j) != 0) {
            this.f40943a.getChildAt(0).setMinimumHeight(C16476b.m74363q(j));
        }
        AndroidViewHolder androidViewHolder = this.f40943a;
        int r = C16476b.m74364r(j);
        int p = C16476b.m74362p(j);
        ViewGroup.LayoutParams layoutParams = this.f40943a.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams);
        int i = androidViewHolder.mo47938j(r, p, layoutParams.width);
        AndroidViewHolder androidViewHolder2 = this.f40943a;
        int q = C16476b.m74363q(j);
        int o = C16476b.m74361o(j);
        ViewGroup.LayoutParams layoutParams2 = this.f40943a.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2);
        androidViewHolder.measure(i, androidViewHolder2.mo47938j(q, o, layoutParams2.height));
        return C15568h0.m69206r2(h0Var, this.f40943a.getMeasuredWidth(), this.f40943a.getMeasuredHeight(), (Map) null, new AndroidViewHolder$layoutNode$1$5$measure$2(this.f40943a, this.f40944b), 4, (Object) null);
    }

    /* renamed from: b */
    public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo47964k(i);
    }

    /* renamed from: c */
    public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo47963j(i);
    }

    /* renamed from: d */
    public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo47964k(i);
    }

    /* renamed from: e */
    public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return mo47963j(i);
    }

    /* renamed from: j */
    public final int mo47963j(int i) {
        AndroidViewHolder androidViewHolder = this.f40943a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams);
        androidViewHolder.measure(androidViewHolder.mo47938j(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.f40943a.getMeasuredHeight();
    }

    /* renamed from: k */
    public final int mo47964k(int i) {
        AndroidViewHolder androidViewHolder = this.f40943a;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AndroidViewHolder androidViewHolder2 = this.f40943a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams);
        androidViewHolder.measure(makeMeasureSpec, androidViewHolder2.mo47938j(0, i, layoutParams.height));
        return this.f40943a.getMeasuredWidth();
    }
}
