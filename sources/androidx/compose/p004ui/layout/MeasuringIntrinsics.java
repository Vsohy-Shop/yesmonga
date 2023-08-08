package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.graphics.C15327u2;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16502r;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics */
public final class MeasuringIntrinsics {
    @C12579k

    /* renamed from: a */
    public static final MeasuringIntrinsics f38657a = new MeasuringIntrinsics();

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$IntrinsicMinMax */
    public enum IntrinsicMinMax {
        Min,
        Max
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$IntrinsicWidthHeight */
    public enum IntrinsicWidthHeight {
        Width,
        Height
    }

    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$a */
    public static final class C15523a implements C15557e0 {
        @C12579k

        /* renamed from: a */
        public final C15580l f38664a;
        @C12579k

        /* renamed from: b */
        public final IntrinsicMinMax f38665b;
        @C12579k

        /* renamed from: c */
        public final IntrinsicWidthHeight f38666c;

        public C15523a(@C12579k C15580l lVar, @C12579k IntrinsicMinMax intrinsicMinMax, @C12579k IntrinsicWidthHeight intrinsicWidthHeight) {
            Intrinsics.checkNotNullParameter(lVar, "measurable");
            Intrinsics.checkNotNullParameter(intrinsicMinMax, "minMax");
            Intrinsics.checkNotNullParameter(intrinsicWidthHeight, "widthHeight");
            this.f38664a = lVar;
            this.f38665b = intrinsicMinMax;
            this.f38666c = intrinsicWidthHeight;
        }

        @C12579k
        /* renamed from: a */
        public final C15580l mo44316a() {
            return this.f38664a;
        }

        /* renamed from: a0 */
        public int mo44317a0(int i) {
            return this.f38664a.mo44317a0(i);
        }

        @C12579k
        /* renamed from: b */
        public final IntrinsicMinMax mo44318b() {
            return this.f38665b;
        }

        @C12580l
        /* renamed from: c */
        public Object mo44319c() {
            return this.f38664a.mo44319c();
        }

        /* renamed from: d */
        public int mo44320d(int i) {
            return this.f38664a.mo44320d(i);
        }

        @C12579k
        /* renamed from: e */
        public final IntrinsicWidthHeight mo44321e() {
            return this.f38666c;
        }

        /* renamed from: o0 */
        public int mo44322o0(int i) {
            return this.f38664a.mo44322o0(i);
        }

        /* renamed from: p0 */
        public int mo44323p0(int i) {
            return this.f38664a.mo44323p0(i);
        }

        @C12579k
        /* renamed from: t0 */
        public C15611w0 mo44324t0(long j) {
            int i;
            int i2;
            if (this.f38666c == IntrinsicWidthHeight.Width) {
                if (this.f38665b == IntrinsicMinMax.Max) {
                    i2 = this.f38664a.mo44323p0(C16476b.m74361o(j));
                } else {
                    i2 = this.f38664a.mo44322o0(C16476b.m74361o(j));
                }
                return new C15524b(i2, C16476b.m74361o(j));
            }
            if (this.f38665b == IntrinsicMinMax.Max) {
                i = this.f38664a.mo44320d(C16476b.m74362p(j));
            } else {
                i = this.f38664a.mo44317a0(C16476b.m74362p(j));
            }
            return new C15524b(C16476b.m74362p(j), i);
        }
    }

    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$b */
    public static final class C15524b extends C15611w0 {
        public C15524b(int i, int i2) {
            mo44473Q0(C16502r.m74668a(i, i2));
        }

        /* renamed from: A */
        public int mo44325A(@C12579k C15531a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
            return Integer.MIN_VALUE;
        }

        /* renamed from: N0 */
        public void mo44326N0(long j, float f, @C12580l C11300l<? super C15327u2, C11079d2> lVar) {
        }
    }

    /* renamed from: a */
    public final int mo44312a(@C12579k C15603u uVar, @C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(uVar, "modifier");
        Intrinsics.checkNotNullParameter(mVar, "instrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(lVar, "intrinsicMeasurable");
        return uVar.mo6430i(new C15585n(mVar, mVar.getLayoutDirection()), new C15523a(lVar, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), C16478c.m74377b(0, i, 0, 0, 13, (Object) null)).getHeight();
    }

    /* renamed from: b */
    public final int mo44313b(@C12579k C15603u uVar, @C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(uVar, "modifier");
        Intrinsics.checkNotNullParameter(mVar, "instrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(lVar, "intrinsicMeasurable");
        return uVar.mo6430i(new C15585n(mVar, mVar.getLayoutDirection()), new C15523a(lVar, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), C16478c.m74377b(0, 0, 0, i, 7, (Object) null)).getWidth();
    }

    /* renamed from: c */
    public final int mo44314c(@C12579k C15603u uVar, @C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(uVar, "modifier");
        Intrinsics.checkNotNullParameter(mVar, "instrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(lVar, "intrinsicMeasurable");
        return uVar.mo6430i(new C15585n(mVar, mVar.getLayoutDirection()), new C15523a(lVar, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), C16478c.m74377b(0, i, 0, 0, 13, (Object) null)).getHeight();
    }

    /* renamed from: d */
    public final int mo44315d(@C12579k C15603u uVar, @C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(uVar, "modifier");
        Intrinsics.checkNotNullParameter(mVar, "instrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(lVar, "intrinsicMeasurable");
        return uVar.mo6430i(new C15585n(mVar, mVar.getLayoutDirection()), new C15523a(lVar, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), C16478c.m74377b(0, 0, 0, i, 7, (Object) null)).getWidth();
    }
}
