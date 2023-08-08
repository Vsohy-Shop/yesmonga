package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16491k;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1024:1\n135#2:1025\n135#2:1026\n135#2:1027\n135#2:1028\n135#2:1029\n135#2:1030\n135#2:1031\n135#2:1032\n135#2:1033\n135#2:1034\n135#2:1035\n135#2:1036\n135#2:1037\n135#2:1038\n135#2:1039\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n61#1:1025\n85#1:1026\n111#1:1027\n138#1:1028\n176#1:1029\n199#1:1030\n226#1:1031\n257#1:1032\n285#1:1033\n315#1:1034\n342#1:1035\n381#1:1036\n405#1:1037\n434#1:1038\n619#1:1039\n*E\n"})
public final class SizeKt {
    @C12579k

    /* renamed from: a */
    public static final FillModifier f6148a = m10103c(1.0f);
    @C12579k

    /* renamed from: b */
    public static final FillModifier f6149b = m10101a(1.0f);
    @C12579k

    /* renamed from: c */
    public static final FillModifier f6150c = m10102b(1.0f);
    @C12579k

    /* renamed from: d */
    public static final WrapContentModifier f6151d;
    @C12579k

    /* renamed from: e */
    public static final WrapContentModifier f6152e;
    @C12579k

    /* renamed from: f */
    public static final WrapContentModifier f6153f;
    @C12579k

    /* renamed from: g */
    public static final WrapContentModifier f6154g;
    @C12579k

    /* renamed from: h */
    public static final WrapContentModifier f6155h;
    @C12579k

    /* renamed from: i */
    public static final WrapContentModifier f6156i;

    static {
        C8734c.C8735a aVar = C8734c.f23406a;
        f6151d = m10106f(aVar.mo17068m(), false);
        f6152e = m10106f(aVar.mo17072u(), false);
        f6153f = m10104d(aVar.mo17070q(), false);
        f6154g = m10104d(aVar.mo17073w(), false);
        f6155h = m10105e(aVar.mo17066i(), false);
        f6156i = m10105e(aVar.mo17061C(), false);
    }

    @C8547h2
    @C12579k
    /* renamed from: A */
    public static final C8767m m10085A(@C12579k C8767m mVar, float f, float f2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$requiredWidthIn");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$requiredWidthInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(f, 0.0f, f2, 0.0f, false, lVar, 10, (DefaultConstructorMarker) null));
    }

    /* renamed from: B */
    public static /* synthetic */ C8767m m10086B(C8767m mVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.f40871b.mo47828e();
        }
        if ((i & 2) != 0) {
            f2 = C16483g.f40871b.mo47828e();
        }
        return m10085A(mVar, f, f2);
    }

    @C8547h2
    @C12579k
    /* renamed from: C */
    public static final C8767m m10087C(@C12579k C8767m mVar, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$size");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(f, f, f, f, true, lVar, (DefaultConstructorMarker) null));
    }

    @C8547h2
    @C12579k
    /* renamed from: D */
    public static final C8767m m10088D(@C12579k C8767m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "$this$size");
        return m10089E(mVar, C16491k.m74558p(j), C16491k.m74555m(j));
    }

    @C8547h2
    @C12579k
    /* renamed from: E */
    public static final C8767m m10089E(@C12579k C8767m mVar, float f, float f2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$size");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(f, f2, f, f2, true, lVar, (DefaultConstructorMarker) null));
    }

    @C8547h2
    @C12579k
    /* renamed from: F */
    public static final C8767m m10090F(@C12579k C8767m mVar, float f, float f2, float f3, float f4) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$sizeIn");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(f, f2, f3, f4, true, lVar, (DefaultConstructorMarker) null));
    }

    /* renamed from: G */
    public static /* synthetic */ C8767m m10091G(C8767m mVar, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.f40871b.mo47828e();
        }
        if ((i & 2) != 0) {
            f2 = C16483g.f40871b.mo47828e();
        }
        if ((i & 4) != 0) {
            f3 = C16483g.f40871b.mo47828e();
        }
        if ((i & 8) != 0) {
            f4 = C16483g.f40871b.mo47828e();
        }
        return m10090F(mVar, f, f2, f3, f4);
    }

    @C8547h2
    @C12579k
    /* renamed from: H */
    public static final C8767m m10092H(@C12579k C8767m mVar, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$width");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(f, 0.0f, f, 0.0f, true, lVar, 10, (DefaultConstructorMarker) null));
    }

    @C8547h2
    @C12579k
    /* renamed from: I */
    public static final C8767m m10093I(@C12579k C8767m mVar, float f, float f2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$widthIn");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(f, 0.0f, f2, 0.0f, true, lVar, 10, (DefaultConstructorMarker) null));
    }

    /* renamed from: J */
    public static /* synthetic */ C8767m m10094J(C8767m mVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.f40871b.mo47828e();
        }
        if ((i & 2) != 0) {
            f2 = C16483g.f40871b.mo47828e();
        }
        return m10093I(mVar, f, f2);
    }

    @C8547h2
    @C12579k
    /* renamed from: K */
    public static final C8767m m10095K(@C12579k C8767m mVar, @C12579k C8734c.C8737c cVar, boolean z) {
        WrapContentModifier wrapContentModifier;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "align");
        C8734c.C8735a aVar = C8734c.f23406a;
        if (Intrinsics.areEqual((Object) cVar, (Object) aVar.mo17070q()) && !z) {
            wrapContentModifier = f6153f;
        } else if (!Intrinsics.areEqual((Object) cVar, (Object) aVar.mo17073w()) || z) {
            wrapContentModifier = m10104d(cVar, z);
        } else {
            wrapContentModifier = f6154g;
        }
        return mVar.mo17224k3(wrapContentModifier);
    }

    /* renamed from: L */
    public static /* synthetic */ C8767m m10096L(C8767m mVar, C8734c.C8737c cVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = C8734c.f23406a.mo17070q();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return m10095K(mVar, cVar, z);
    }

    @C8547h2
    @C12579k
    /* renamed from: M */
    public static final C8767m m10097M(@C12579k C8767m mVar, @C12579k C8734c cVar, boolean z) {
        WrapContentModifier wrapContentModifier;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "align");
        C8734c.C8735a aVar = C8734c.f23406a;
        if (Intrinsics.areEqual((Object) cVar, (Object) aVar.mo17066i()) && !z) {
            wrapContentModifier = f6155h;
        } else if (!Intrinsics.areEqual((Object) cVar, (Object) aVar.mo17061C()) || z) {
            wrapContentModifier = m10105e(cVar, z);
        } else {
            wrapContentModifier = f6156i;
        }
        return mVar.mo17224k3(wrapContentModifier);
    }

    /* renamed from: N */
    public static /* synthetic */ C8767m m10098N(C8767m mVar, C8734c cVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = C8734c.f23406a.mo17066i();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return m10097M(mVar, cVar, z);
    }

    @C8547h2
    @C12579k
    /* renamed from: O */
    public static final C8767m m10099O(@C12579k C8767m mVar, @C12579k C8734c.C8736b bVar, boolean z) {
        WrapContentModifier wrapContentModifier;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "align");
        C8734c.C8735a aVar = C8734c.f23406a;
        if (Intrinsics.areEqual((Object) bVar, (Object) aVar.mo17068m()) && !z) {
            wrapContentModifier = f6151d;
        } else if (!Intrinsics.areEqual((Object) bVar, (Object) aVar.mo17072u()) || z) {
            wrapContentModifier = m10106f(bVar, z);
        } else {
            wrapContentModifier = f6152e;
        }
        return mVar.mo17224k3(wrapContentModifier);
    }

    /* renamed from: P */
    public static /* synthetic */ C8767m m10100P(C8767m mVar, C8734c.C8736b bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = C8734c.f23406a.mo17068m();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return m10099O(mVar, bVar, z);
    }

    /* renamed from: a */
    public static final FillModifier m10101a(float f) {
        return new FillModifier(Direction.Vertical, f, new SizeKt$createFillHeightModifier$1(f));
    }

    /* renamed from: b */
    public static final FillModifier m10102b(float f) {
        return new FillModifier(Direction.Both, f, new SizeKt$createFillSizeModifier$1(f));
    }

    /* renamed from: c */
    public static final FillModifier m10103c(float f) {
        return new FillModifier(Direction.Horizontal, f, new SizeKt$createFillWidthModifier$1(f));
    }

    /* renamed from: d */
    public static final WrapContentModifier m10104d(C8734c.C8737c cVar, boolean z) {
        return new WrapContentModifier(Direction.Vertical, z, new SizeKt$createWrapContentHeightModifier$1(cVar), cVar, new SizeKt$createWrapContentHeightModifier$2(cVar, z));
    }

    /* renamed from: e */
    public static final WrapContentModifier m10105e(C8734c cVar, boolean z) {
        return new WrapContentModifier(Direction.Both, z, new SizeKt$createWrapContentSizeModifier$1(cVar), cVar, new SizeKt$createWrapContentSizeModifier$2(cVar, z));
    }

    /* renamed from: f */
    public static final WrapContentModifier m10106f(C8734c.C8736b bVar, boolean z) {
        return new WrapContentModifier(Direction.Horizontal, z, new SizeKt$createWrapContentWidthModifier$1(bVar), bVar, new SizeKt$createWrapContentWidthModifier$2(bVar, z));
    }

    @C8547h2
    @C12579k
    /* renamed from: g */
    public static final C8767m m10107g(@C12579k C8767m mVar, float f, float f2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$defaultMinSize");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$defaultMinSizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new UnspecifiedConstraintsModifier(f, f2, lVar, (DefaultConstructorMarker) null));
    }

    /* renamed from: h */
    public static /* synthetic */ C8767m m10108h(C8767m mVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.f40871b.mo47828e();
        }
        if ((i & 2) != 0) {
            f2 = C16483g.f40871b.mo47828e();
        }
        return m10107g(mVar, f, f2);
    }

    @C8547h2
    @C12579k
    /* renamed from: i */
    public static final C8767m m10109i(@C12579k C8767m mVar, float f) {
        boolean z;
        FillModifier fillModifier;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fillModifier = f6149b;
        } else {
            fillModifier = m10101a(f);
        }
        return mVar.mo17224k3(fillModifier);
    }

    /* renamed from: j */
    public static /* synthetic */ C8767m m10110j(C8767m mVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m10109i(mVar, f);
    }

    @C8547h2
    @C12579k
    /* renamed from: k */
    public static final C8767m m10111k(@C12579k C8767m mVar, float f) {
        boolean z;
        FillModifier fillModifier;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fillModifier = f6150c;
        } else {
            fillModifier = m10102b(f);
        }
        return mVar.mo17224k3(fillModifier);
    }

    /* renamed from: l */
    public static /* synthetic */ C8767m m10112l(C8767m mVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m10111k(mVar, f);
    }

    @C8547h2
    @C12579k
    /* renamed from: m */
    public static final C8767m m10113m(@C12579k C8767m mVar, float f) {
        boolean z;
        FillModifier fillModifier;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fillModifier = f6148a;
        } else {
            fillModifier = m10103c(f);
        }
        return mVar.mo17224k3(fillModifier);
    }

    /* renamed from: n */
    public static /* synthetic */ C8767m m10114n(C8767m mVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m10113m(mVar, f);
    }

    @C8547h2
    @C12579k
    /* renamed from: o */
    public static final C8767m m10115o(@C12579k C8767m mVar, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$height");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(0.0f, f, 0.0f, f, true, lVar, 5, (DefaultConstructorMarker) null));
    }

    @C8547h2
    @C12579k
    /* renamed from: p */
    public static final C8767m m10116p(@C12579k C8767m mVar, float f, float f2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$heightIn");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(0.0f, f, 0.0f, f2, true, lVar, 5, (DefaultConstructorMarker) null));
    }

    /* renamed from: q */
    public static /* synthetic */ C8767m m10117q(C8767m mVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.f40871b.mo47828e();
        }
        if ((i & 2) != 0) {
            f2 = C16483g.f40871b.mo47828e();
        }
        return m10116p(mVar, f, f2);
    }

    @C8547h2
    @C12579k
    /* renamed from: r */
    public static final C8767m m10118r(@C12579k C8767m mVar, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$requiredHeight");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(0.0f, f, 0.0f, f, false, lVar, 5, (DefaultConstructorMarker) null));
    }

    @C8547h2
    @C12579k
    /* renamed from: s */
    public static final C8767m m10119s(@C12579k C8767m mVar, float f, float f2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$requiredHeightIn");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$requiredHeightInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(0.0f, f, 0.0f, f2, false, lVar, 5, (DefaultConstructorMarker) null));
    }

    /* renamed from: t */
    public static /* synthetic */ C8767m m10120t(C8767m mVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.f40871b.mo47828e();
        }
        if ((i & 2) != 0) {
            f2 = C16483g.f40871b.mo47828e();
        }
        return m10119s(mVar, f, f2);
    }

    @C8547h2
    @C12579k
    /* renamed from: u */
    public static final C8767m m10121u(@C12579k C8767m mVar, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$requiredSize");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(f, f, f, f, false, lVar, (DefaultConstructorMarker) null));
    }

    @C8547h2
    @C12579k
    /* renamed from: v */
    public static final C8767m m10122v(@C12579k C8767m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "$this$requiredSize");
        return m10123w(mVar, C16491k.m74558p(j), C16491k.m74555m(j));
    }

    @C8547h2
    @C12579k
    /* renamed from: w */
    public static final C8767m m10123w(@C12579k C8767m mVar, float f, float f2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$requiredSize");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(f, f2, f, f2, false, lVar, (DefaultConstructorMarker) null));
    }

    @C8547h2
    @C12579k
    /* renamed from: x */
    public static final C8767m m10124x(@C12579k C8767m mVar, float f, float f2, float f3, float f4) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$requiredSizeIn");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(f, f2, f3, f4, false, lVar, (DefaultConstructorMarker) null));
    }

    /* renamed from: y */
    public static /* synthetic */ C8767m m10125y(C8767m mVar, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.f40871b.mo47828e();
        }
        if ((i & 2) != 0) {
            f2 = C16483g.f40871b.mo47828e();
        }
        if ((i & 4) != 0) {
            f3 = C16483g.f40871b.mo47828e();
        }
        if ((i & 8) != 0) {
            f4 = C16483g.f40871b.mo47828e();
        }
        return m10124x(mVar, f, f2, f3, f4);
    }

    @C8547h2
    @C12579k
    /* renamed from: z */
    public static final C8767m m10126z(@C12579k C8767m mVar, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$requiredWidth");
        if (InspectableValueKt.m71063e()) {
            lVar = new SizeKt$requiredWidth3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new SizeModifier(f, 0.0f, f, 0.0f, false, lVar, 10, (DefaultConstructorMarker) null));
    }
}
