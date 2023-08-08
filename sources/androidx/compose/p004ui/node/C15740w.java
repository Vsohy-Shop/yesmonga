package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.layout.C15540b1;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8761g
/* renamed from: androidx.compose.ui.node.w */
public interface C15740w extends C15540b1, C15678d {
    /* renamed from: c */
    int mo17118c(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return NodeMeasuringIntrinsics.f38961a.mo44906a(this, mVar, lVar, i);
    }

    /* renamed from: d */
    int mo17119d(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return NodeMeasuringIntrinsics.f38961a.mo44908c(this, mVar, lVar, i);
    }

    /* renamed from: e */
    void mo44367e() {
        C15681e.m70235p(this).mo44367e();
    }

    /* renamed from: f */
    int mo17120f(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return NodeMeasuringIntrinsics.f38961a.mo44909d(this, mVar, lVar, i);
    }

    /* renamed from: h */
    int mo17121h(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return NodeMeasuringIntrinsics.f38961a.mo44907b(this, mVar, lVar, i);
    }

    @C12579k
    /* renamed from: i */
    C15564g0 mo17122i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j);
}
