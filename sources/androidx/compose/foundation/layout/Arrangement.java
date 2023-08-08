package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import com.urbanairship.iam.C9168d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,709:1\n700#1,2:715\n703#1,5:720\n700#1,2:725\n703#1,5:730\n700#1,2:738\n703#1,5:743\n700#1,2:751\n703#1,5:756\n700#1,2:764\n703#1,5:769\n700#1,2:777\n703#1,5:782\n155#2:710\n155#2:711\n13032#3,3:712\n13674#3,3:717\n13674#3,3:727\n13032#3,3:735\n13674#3,3:740\n13032#3,3:748\n13674#3,3:753\n13032#3,3:761\n13674#3,3:766\n13032#3,3:774\n13674#3,3:779\n13674#3,3:787\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n618#1:715,2\n618#1:720,5\n626#1:725,2\n626#1:730,5\n640#1:738,2\n640#1:743,5\n655#1:751,2\n655#1:756,5\n674#1:764,2\n674#1:769,5\n693#1:777,2\n693#1:782,5\n354#1:710\n366#1:711\n616#1:712,3\n618#1:717,3\n626#1:727,3\n638#1:735,3\n640#1:740,3\n652#1:748,3\n655#1:753,3\n667#1:761,3\n674#1:766,3\n686#1:774,3\n693#1:779,3\n701#1:787,3\n*E\n"})
public final class Arrangement {
    @C12579k

    /* renamed from: a */
    public static final Arrangement f6010a = new Arrangement();
    @C12579k

    /* renamed from: b */
    public static final C2269d f6011b = new C2277j();
    @C12579k

    /* renamed from: c */
    public static final C2269d f6012c = new C2268c();
    @C12579k

    /* renamed from: d */
    public static final C2279l f6013d = new C2278k();
    @C12579k

    /* renamed from: e */
    public static final C2279l f6014e = new C2266a();
    @C12579k

    /* renamed from: f */
    public static final C2271e f6015f = new C2267b();
    @C12579k

    /* renamed from: g */
    public static final C2271e f6016g = new C2275h();
    @C12579k

    /* renamed from: h */
    public static final C2271e f6017h = new C2274g();
    @C12579k

    /* renamed from: i */
    public static final C2271e f6018i = new C2273f();

    /* renamed from: j */
    public static final int f6019j = 0;

    @C8585m0
    @C11363r0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n555#1:710\n*E\n"})
    public static final class Absolute {
        @C12579k

        /* renamed from: a */
        public static final Absolute f6020a = new Absolute();
        @C12579k

        /* renamed from: b */
        public static final C2269d f6021b = new C2261b();
        @C12579k

        /* renamed from: c */
        public static final C2269d f6022c = new C2260a();
        @C12579k

        /* renamed from: d */
        public static final C2269d f6023d = new C2262c();
        @C12579k

        /* renamed from: e */
        public static final C2269d f6024e = new C2264e();
        @C12579k

        /* renamed from: f */
        public static final C2269d f6025f = new C2265f();
        @C12579k

        /* renamed from: g */
        public static final C2269d f6026g = new C2263d();

        /* renamed from: h */
        public static final int f6027h = 0;

        /* renamed from: androidx.compose.foundation.layout.Arrangement$Absolute$a */
        public static final class C2260a implements C2269d {
            /* renamed from: e */
            public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(iArr, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(iArr2, "outPositions");
                Arrangement.f6010a.mo7632t(i, iArr, iArr2, false);
            }

            @C12579k
            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        /* renamed from: androidx.compose.foundation.layout.Arrangement$Absolute$b */
        public static final class C2261b implements C2269d {
            /* renamed from: e */
            public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(iArr, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(iArr2, "outPositions");
                Arrangement.f6010a.mo7633u(iArr, iArr2, false);
            }

            @C12579k
            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        /* renamed from: androidx.compose.foundation.layout.Arrangement$Absolute$c */
        public static final class C2262c implements C2269d {
            /* renamed from: e */
            public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(iArr, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(iArr2, "outPositions");
                Arrangement.f6010a.mo7634v(i, iArr, iArr2, false);
            }

            @C12579k
            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        /* renamed from: androidx.compose.foundation.layout.Arrangement$Absolute$d */
        public static final class C2263d implements C2269d {
            /* renamed from: e */
            public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(iArr, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(iArr2, "outPositions");
                Arrangement.f6010a.mo7635w(i, iArr, iArr2, false);
            }

            @C12579k
            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        /* renamed from: androidx.compose.foundation.layout.Arrangement$Absolute$e */
        public static final class C2264e implements C2269d {
            /* renamed from: e */
            public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(iArr, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(iArr2, "outPositions");
                Arrangement.f6010a.mo7636x(i, iArr, iArr2, false);
            }

            @C12579k
            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        /* renamed from: androidx.compose.foundation.layout.Arrangement$Absolute$f */
        public static final class C2265f implements C2269d {
            /* renamed from: e */
            public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(iArr, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(iArr2, "outPositions");
                Arrangement.f6010a.mo7637y(i, iArr, iArr2, false);
            }

            @C12579k
            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        @C8547h2
        /* renamed from: c */
        public static /* synthetic */ void m9751c() {
        }

        @C8547h2
        /* renamed from: e */
        public static /* synthetic */ void m9752e() {
        }

        @C8547h2
        /* renamed from: g */
        public static /* synthetic */ void m9753g() {
        }

        @C8547h2
        /* renamed from: i */
        public static /* synthetic */ void m9754i() {
        }

        @C8547h2
        /* renamed from: k */
        public static /* synthetic */ void m9755k() {
        }

        @C8547h2
        /* renamed from: m */
        public static /* synthetic */ void m9756m() {
        }

        @C8547h2
        @C12579k
        /* renamed from: a */
        public final C2269d mo7639a(@C12579k C8734c.C8736b bVar) {
            Intrinsics.checkNotNullParameter(bVar, C9168d0.f24891y);
            return new C2276i(C16483g.m74435M((float) 0), false, new Arrangement$Absolute$aligned$1(bVar), (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: b */
        public final C2269d mo7640b() {
            return f6022c;
        }

        @C12579k
        /* renamed from: d */
        public final C2269d mo7641d() {
            return f6021b;
        }

        @C12579k
        /* renamed from: f */
        public final C2269d mo7642f() {
            return f6023d;
        }

        @C12579k
        /* renamed from: h */
        public final C2269d mo7643h() {
            return f6026g;
        }

        @C12579k
        /* renamed from: j */
        public final C2269d mo7644j() {
            return f6024e;
        }

        @C12579k
        /* renamed from: l */
        public final C2269d mo7645l() {
            return f6025f;
        }

        @C8547h2
        @C12579k
        /* renamed from: n */
        public final C2271e mo7646n(float f) {
            return new C2276i(f, false, (C11304p) null, (DefaultConstructorMarker) null);
        }

        @C8547h2
        @C12579k
        /* renamed from: o */
        public final C2269d mo7647o(float f, @C12579k C8734c.C8736b bVar) {
            Intrinsics.checkNotNullParameter(bVar, C9168d0.f24891y);
            return new C2276i(f, false, new Arrangement$Absolute$spacedBy$1(bVar), (DefaultConstructorMarker) null);
        }

        @C8547h2
        @C12579k
        /* renamed from: p */
        public final C2279l mo7648p(float f, @C12579k C8734c.C8737c cVar) {
            Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
            return new C2276i(f, false, new Arrangement$Absolute$spacedBy$2(cVar), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: androidx.compose.foundation.layout.Arrangement$a */
    public static final class C2266a implements C2279l {
        /* renamed from: d */
        public void mo7656d(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            Arrangement.f6010a.mo7634v(i, iArr, iArr2, false);
        }

        @C12579k
        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    @C11363r0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Center$1\n*L\n190#1:710\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.Arrangement$b */
    public static final class C2267b implements C2271e {

        /* renamed from: a */
        public final float f6028a = C16483g.m74435M((float) 0);

        /* renamed from: a */
        public float mo7658a() {
            return this.f6028a;
        }

        /* renamed from: d */
        public void mo7656d(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            Arrangement.f6010a.mo7632t(i, iArr, iArr2, false);
        }

        /* renamed from: e */
        public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f6010a.mo7632t(i, iArr, iArr2, false);
            } else {
                Arrangement.f6010a.mo7632t(i, iArr, iArr2, true);
            }
        }

        @C12579k
        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.Arrangement$c */
    public static final class C2268c implements C2269d {
        /* renamed from: e */
        public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f6010a.mo7634v(i, iArr, iArr2, false);
            } else {
                Arrangement.f6010a.mo7633u(iArr, iArr2, true);
            }
        }

        @C12579k
        public String toString() {
            return "Arrangement#End";
        }
    }

    @C8547h2
    @C11363r0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n50#1:710\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.Arrangement$d */
    public interface C2269d {

        /* renamed from: androidx.compose.foundation.layout.Arrangement$d$a */
        public static final class C2270a {
            @Deprecated
            /* renamed from: a */
            public static float m9781a(@C12579k C2269d dVar) {
                return C2269d.super.mo7658a();
            }
        }

        /* renamed from: a */
        float mo7658a() {
            return C16483g.m74435M((float) 0);
        }

        /* renamed from: e */
        void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2);
    }

    @C8547h2
    @C11363r0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n107#1:710\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.Arrangement$e */
    public interface C2271e extends C2269d, C2279l {

        /* renamed from: androidx.compose.foundation.layout.Arrangement$e$a */
        public static final class C2272a {
            @Deprecated
            /* renamed from: a */
            public static float m9784a(@C12579k C2271e eVar) {
                return C2271e.super.mo7658a();
            }
        }

        /* renamed from: a */
        float mo7658a() {
            return C16483g.m74435M((float) 0);
        }
    }

    @C11363r0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceAround$1\n*L\n278#1:710\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.Arrangement$f */
    public static final class C2273f implements C2271e {

        /* renamed from: a */
        public final float f6029a = C16483g.m74435M((float) 0);

        /* renamed from: a */
        public float mo7658a() {
            return this.f6029a;
        }

        /* renamed from: d */
        public void mo7656d(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            Arrangement.f6010a.mo7635w(i, iArr, iArr2, false);
        }

        /* renamed from: e */
        public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f6010a.mo7635w(i, iArr, iArr2, false);
            } else {
                Arrangement.f6010a.mo7635w(i, iArr, iArr2, true);
            }
        }

        @C12579k
        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    @C11363r0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceBetween$1\n*L\n248#1:710\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.Arrangement$g */
    public static final class C2274g implements C2271e {

        /* renamed from: a */
        public final float f6030a = C16483g.m74435M((float) 0);

        /* renamed from: a */
        public float mo7658a() {
            return this.f6030a;
        }

        /* renamed from: d */
        public void mo7656d(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            Arrangement.f6010a.mo7636x(i, iArr, iArr2, false);
        }

        /* renamed from: e */
        public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f6010a.mo7636x(i, iArr, iArr2, false);
            } else {
                Arrangement.f6010a.mo7636x(i, iArr, iArr2, true);
            }
        }

        @C12579k
        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    @C11363r0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpaceEvenly$1\n*L\n219#1:710\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.Arrangement$h */
    public static final class C2275h implements C2271e {

        /* renamed from: a */
        public final float f6031a = C16483g.m74435M((float) 0);

        /* renamed from: a */
        public float mo7658a() {
            return this.f6031a;
        }

        /* renamed from: d */
        public void mo7656d(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            Arrangement.f6010a.mo7637y(i, iArr, iArr2, false);
        }

        /* renamed from: e */
        public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f6010a.mo7637y(i, iArr, iArr2, false);
            } else {
                Arrangement.f6010a.mo7637y(i, iArr, iArr2, true);
            }
        }

        @C12579k
        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    @C8585m0
    @C11363r0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,709:1\n700#2,2:710\n703#2,5:715\n13674#3,3:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n585#1:710,2\n585#1:715,5\n585#1:712,3\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.Arrangement$i */
    public static final class C2276i implements C2271e {

        /* renamed from: a */
        public final float f6032a;

        /* renamed from: b */
        public final boolean f6033b;
        @C12580l

        /* renamed from: c */
        public final C11304p<Integer, LayoutDirection, Integer> f6034c;

        /* renamed from: d */
        public final float f6035d;

        public /* synthetic */ C2276i(float f, boolean z, C11304p pVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, z, pVar);
        }

        /* renamed from: k */
        public static /* synthetic */ C2276i m9794k(C2276i iVar, float f, boolean z, C11304p<Integer, LayoutDirection, Integer> pVar, int i, Object obj) {
            if ((i & 1) != 0) {
                f = iVar.f6032a;
            }
            if ((i & 2) != 0) {
                z = iVar.f6033b;
            }
            if ((i & 4) != 0) {
                pVar = iVar.f6034c;
            }
            return iVar.mo7669j(f, z, pVar);
        }

        /* renamed from: a */
        public float mo7658a() {
            return this.f6035d;
        }

        /* renamed from: d */
        public void mo7656d(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            mo7649e(dVar, i, iArr, LayoutDirection.Ltr, iArr2);
        }

        /* renamed from: e */
        public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
            boolean z;
            boolean z2;
            int i2;
            int i3;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int n2 = dVar.mo7429n2(this.f6032a);
                if (!this.f6033b || layoutDirection != LayoutDirection.Rtl) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Arrangement arrangement = Arrangement.f6010a;
                if (!z2) {
                    int length = iArr.length;
                    int i4 = 0;
                    i3 = 0;
                    i2 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        int i6 = iArr[i4];
                        int min = Math.min(i3, i - i6);
                        iArr2[i5] = min;
                        int min2 = Math.min(n2, (i - min) - i6);
                        int i7 = iArr2[i5] + i6 + min2;
                        i4++;
                        i5++;
                        int i8 = i7;
                        i2 = min2;
                        i3 = i8;
                    }
                } else {
                    int i9 = 0;
                    int i10 = 0;
                    for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                        int i11 = iArr[length2];
                        int min3 = Math.min(i3, i - i11);
                        iArr2[length2] = min3;
                        i10 = Math.min(n2, (i - min3) - i11);
                        i9 = iArr2[length2] + i11 + i10;
                    }
                }
                int i12 = i3 - i2;
                C11304p<Integer, LayoutDirection, Integer> pVar = this.f6034c;
                if (pVar != null && i12 < i) {
                    int intValue = pVar.invoke(Integer.valueOf(i - i12), layoutDirection).intValue();
                    int length3 = iArr2.length;
                    for (int i13 = 0; i13 < length3; i13++) {
                        iArr2[i13] = iArr2[i13] + intValue;
                    }
                }
            }
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2276i)) {
                return false;
            }
            C2276i iVar = (C2276i) obj;
            return C16483g.m74440e0(this.f6032a, iVar.f6032a) && this.f6033b == iVar.f6033b && Intrinsics.areEqual((Object) this.f6034c, (Object) iVar.f6034c);
        }

        /* renamed from: g */
        public final float mo7665g() {
            return this.f6032a;
        }

        /* renamed from: h */
        public final boolean mo7666h() {
            return this.f6033b;
        }

        public int hashCode() {
            int h0 = C16483g.m74442h0(this.f6032a) * 31;
            boolean z = this.f6033b;
            if (z) {
                z = true;
            }
            int i = (h0 + (z ? 1 : 0)) * 31;
            C11304p<Integer, LayoutDirection, Integer> pVar = this.f6034c;
            return i + (pVar == null ? 0 : pVar.hashCode());
        }

        @C12580l
        /* renamed from: i */
        public final C11304p<Integer, LayoutDirection, Integer> mo7668i() {
            return this.f6034c;
        }

        @C12579k
        /* renamed from: j */
        public final C2276i mo7669j(float f, boolean z, @C12580l C11304p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            return new C2276i(f, z, pVar, (DefaultConstructorMarker) null);
        }

        @C12580l
        /* renamed from: l */
        public final C11304p<Integer, LayoutDirection, Integer> mo7670l() {
            return this.f6034c;
        }

        /* renamed from: m */
        public final boolean mo7671m() {
            return this.f6033b;
        }

        /* renamed from: n */
        public final float mo7672n() {
            return this.f6032a;
        }

        @C12579k
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6033b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append(C16483g.m74447o0(this.f6032a));
            sb.append(", ");
            sb.append(this.f6034c);
            sb.append(')');
            return sb.toString();
        }

        public C2276i(float f, boolean z, C11304p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            this.f6032a = f;
            this.f6033b = z;
            this.f6034c = pVar;
            this.f6035d = f;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.Arrangement$j */
    public static final class C2277j implements C2269d {
        /* renamed from: e */
        public void mo7649e(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f6010a.mo7633u(iArr, iArr2, false);
            } else {
                Arrangement.f6010a.mo7634v(i, iArr, iArr2, true);
            }
        }

        @C12579k
        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.Arrangement$k */
    public static final class C2278k implements C2279l {
        /* renamed from: d */
        public void mo7656d(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k int[] iArr2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(iArr, "sizes");
            Intrinsics.checkNotNullParameter(iArr2, "outPositions");
            Arrangement.f6010a.mo7633u(iArr, iArr2, false);
        }

        @C12579k
        public String toString() {
            return "Arrangement#Top";
        }
    }

    @C8547h2
    @C11363r0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,709:1\n155#2:710\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n79#1:710\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.Arrangement$l */
    public interface C2279l {

        /* renamed from: androidx.compose.foundation.layout.Arrangement$l$a */
        public static final class C2280a {
            @Deprecated
            /* renamed from: a */
            public static float m9810a(@C12579k C2279l lVar) {
                return C2279l.super.mo7658a();
            }
        }

        /* renamed from: a */
        float mo7658a() {
            return C16483g.m74435M((float) 0);
        }

        /* renamed from: d */
        void mo7656d(@C12579k C16479d dVar, int i, @C12579k int[] iArr, @C12579k int[] iArr2);
    }

    @C8547h2
    /* renamed from: e */
    public static /* synthetic */ void m9723e() {
    }

    @C8547h2
    /* renamed from: g */
    public static /* synthetic */ void m9724g() {
    }

    @C8547h2
    /* renamed from: i */
    public static /* synthetic */ void m9725i() {
    }

    @C8547h2
    /* renamed from: k */
    public static /* synthetic */ void m9726k() {
    }

    @C8547h2
    /* renamed from: m */
    public static /* synthetic */ void m9727m() {
    }

    @C8547h2
    /* renamed from: o */
    public static /* synthetic */ void m9728o() {
    }

    @C8547h2
    /* renamed from: q */
    public static /* synthetic */ void m9729q() {
    }

    @C8547h2
    /* renamed from: s */
    public static /* synthetic */ void m9730s() {
    }

    @C8547h2
    @C12579k
    /* renamed from: A */
    public final C2269d mo7619A(float f, @C12579k C8734c.C8736b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C9168d0.f24891y);
        return new C2276i(f, true, new Arrangement$spacedBy$2(bVar), (DefaultConstructorMarker) null);
    }

    @C8547h2
    @C12579k
    /* renamed from: B */
    public final C2279l mo7620B(float f, @C12579k C8734c.C8737c cVar) {
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        return new C2276i(f, false, new Arrangement$spacedBy$3(cVar), (DefaultConstructorMarker) null);
    }

    @C8547h2
    @C12579k
    /* renamed from: a */
    public final C2269d mo7621a(@C12579k C8734c.C8736b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C9168d0.f24891y);
        return new C2276i(C16483g.m74435M((float) 0), true, new Arrangement$aligned$1(bVar), (DefaultConstructorMarker) null);
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public final C2279l mo7622b(@C12579k C8734c.C8737c cVar) {
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        return new C2276i(C16483g.m74435M((float) 0), false, new Arrangement$aligned$2(cVar), (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final void mo7623c(int[] iArr, boolean z, C11304p<? super Integer, ? super Integer, C11079d2> pVar) {
        if (!z) {
            int length = iArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                pVar.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i]));
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                pVar.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            } else {
                return;
            }
        }
    }

    @C12579k
    /* renamed from: d */
    public final C2279l mo7624d() {
        return f6014e;
    }

    @C12579k
    /* renamed from: f */
    public final C2271e mo7625f() {
        return f6015f;
    }

    @C12579k
    /* renamed from: h */
    public final C2269d mo7626h() {
        return f6012c;
    }

    @C12579k
    /* renamed from: j */
    public final C2271e mo7627j() {
        return f6018i;
    }

    @C12579k
    /* renamed from: l */
    public final C2271e mo7628l() {
        return f6017h;
    }

    @C12579k
    /* renamed from: n */
    public final C2271e mo7629n() {
        return f6016g;
    }

    @C12579k
    /* renamed from: p */
    public final C2269d mo7630p() {
        return f6011b;
    }

    @C12579k
    /* renamed from: r */
    public final C2279l mo7631r() {
        return f6013d;
    }

    /* renamed from: t */
    public final void mo7632t(int i, @C12579k int[] iArr, @C12579k int[] iArr2, boolean z) {
        Intrinsics.checkNotNullParameter(iArr, C9168d0.f24889w);
        Intrinsics.checkNotNullParameter(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = ((float) (i - i3)) / ((float) 2);
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = C11409d.m43851L0(f);
                f += (float) i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i7 = iArr[length2];
                iArr2[length2] = C11409d.m43851L0(f);
                f += (float) i7;
            } else {
                return;
            }
        }
    }

    /* renamed from: u */
    public final void mo7633u(@C12579k int[] iArr, @C12579k int[] iArr2, boolean z) {
        Intrinsics.checkNotNullParameter(iArr, C9168d0.f24889w);
        Intrinsics.checkNotNullParameter(iArr2, "outPosition");
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i5 = iArr[length2];
                iArr2[length2] = i;
                i += i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: v */
    public final void mo7634v(int i, @C12579k int[] iArr, @C12579k int[] iArr2, boolean z) {
        Intrinsics.checkNotNullParameter(iArr, C9168d0.f24889w);
        Intrinsics.checkNotNullParameter(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i8 = iArr[length2];
                iArr2[length2] = i5;
                i5 += i8;
            } else {
                return;
            }
        }
    }

    /* renamed from: w */
    public final void mo7635w(int i, @C12579k int[] iArr, @C12579k int[] iArr2, boolean z) {
        boolean z2;
        float f;
        Intrinsics.checkNotNullParameter(iArr, C9168d0.f24889w);
        Intrinsics.checkNotNullParameter(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        if (iArr.length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            f = ((float) (i - i3)) / ((float) iArr.length);
        } else {
            f = 0.0f;
        }
        float f2 = f / ((float) 2);
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = C11409d.m43851L0(f2);
                f2 += ((float) i6) + f;
                i2++;
                i5++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i7 = iArr[length2];
            iArr2[length2] = C11409d.m43851L0(f2);
            f2 += ((float) i7) + f;
        }
    }

    /* renamed from: x */
    public final void mo7636x(int i, @C12579k int[] iArr, @C12579k int[] iArr2, boolean z) {
        float f;
        Intrinsics.checkNotNullParameter(iArr, C9168d0.f24889w);
        Intrinsics.checkNotNullParameter(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f2 = 0.0f;
        if (iArr.length > 1) {
            f = ((float) (i - i3)) / ((float) (iArr.length - 1));
        } else {
            f = 0.0f;
        }
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = C11409d.m43851L0(f2);
                f2 += ((float) i6) + f;
                i2++;
                i5++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i7 = iArr[length2];
            iArr2[length2] = C11409d.m43851L0(f2);
            f2 += ((float) i7) + f;
        }
    }

    /* renamed from: y */
    public final void mo7637y(int i, @C12579k int[] iArr, @C12579k int[] iArr2, boolean z) {
        Intrinsics.checkNotNullParameter(iArr, C9168d0.f24889w);
        Intrinsics.checkNotNullParameter(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = ((float) (i - i3)) / ((float) (iArr.length + 1));
        if (!z) {
            int length2 = iArr.length;
            float f = length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = C11409d.m43851L0(f);
                f += ((float) i6) + length;
                i2++;
                i5++;
            }
            return;
        }
        float f2 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = C11409d.m43851L0(f2);
            f2 += ((float) i7) + length;
        }
    }

    @C8547h2
    @C12579k
    /* renamed from: z */
    public final C2271e mo7638z(float f) {
        return new C2276i(f, true, Arrangement$spacedBy$1.f6036f, (DefaultConstructorMarker) null);
    }
}
