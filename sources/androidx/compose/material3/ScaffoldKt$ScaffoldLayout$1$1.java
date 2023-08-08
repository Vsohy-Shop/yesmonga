package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15562f1;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8553b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements C11304p<C15562f1, C16476b, C15564g0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $bottomBar;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C2354e1 $contentWindowInsets;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $snackbar;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, int i, C2354e1 e1Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, int i2, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar) {
        super(2);
        this.$topBar = pVar;
        this.$snackbar = pVar2;
        this.$fab = pVar3;
        this.$fabPosition = i;
        this.$contentWindowInsets = e1Var;
        this.$bottomBar = pVar4;
        this.$$dirty = i2;
        this.$content = qVar;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo11811a(@C12579k C15562f1 f1Var, long j) {
        Intrinsics.checkNotNullParameter(f1Var, "$this$SubcomposeLayout");
        int p = C16476b.m74362p(j);
        int o = C16476b.m74361o(j);
        final long e = C16476b.m74351e(j, 0, 0, 0, 0, 10, (Object) null);
        final C11304p<C8592o, Integer, C11079d2> pVar = this.$topBar;
        final C11304p<C8592o, Integer, C11079d2> pVar2 = this.$snackbar;
        final C11304p<C8592o, Integer, C11079d2> pVar3 = this.$fab;
        final int i = this.$fabPosition;
        final C2354e1 e1Var = this.$contentWindowInsets;
        final C11304p<C8592o, Integer, C11079d2> pVar4 = this.$bottomBar;
        final int i2 = this.$$dirty;
        final C11305q<C2366i0, C8592o, Integer, C11079d2> qVar = this.$content;
        final C15562f1 f1Var2 = f1Var;
        final int i3 = p;
        final int i4 = o;
        return C15568h0.m69206r2(f1Var, p, o, (Map) null, new C11300l<C15611w0.C15612a, C11079d2>() {
            /* renamed from: a */
            public final void mo11812a(@C12579k C15611w0.C15612a aVar) {
                Object obj;
                int i;
                Object obj2;
                int i2;
                Object obj3;
                int i3;
                C8256o0 o0Var;
                Object obj4;
                Integer num;
                Integer num2;
                int i4;
                int i5;
                int i6;
                int i7;
                Object obj5;
                Object obj6;
                int i8;
                boolean z;
                Intrinsics.checkNotNullParameter(aVar, "$this$layout");
                Iterable<C15557e0> k0 = f1Var2.mo44296k0(ScaffoldLayoutContent.TopBar, pVar);
                long j = e;
                ArrayList<C15611w0> arrayList = new ArrayList<>(C10978t.m41495Y(k0, 10));
                for (C15557e0 t0 : k0) {
                    arrayList.add(t0.mo44324t0(j));
                }
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    obj = null;
                } else {
                    obj = it.next();
                    if (it.hasNext()) {
                        int G0 = ((C15611w0) obj).mo44468G0();
                        do {
                            Object next = it.next();
                            int G02 = ((C15611w0) next).mo44468G0();
                            if (G0 < G02) {
                                obj = next;
                                G0 = G02;
                            }
                        } while (it.hasNext());
                    }
                }
                C15611w0 w0Var = (C15611w0) obj;
                if (w0Var != null) {
                    i = w0Var.mo44468G0();
                } else {
                    i = 0;
                }
                Iterable<C15557e0> k02 = f1Var2.mo44296k0(ScaffoldLayoutContent.Snackbar, pVar2);
                C2354e1 e1Var = e1Var;
                C15562f1 f1Var = f1Var2;
                long j2 = e;
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(k02, 10));
                for (C15557e0 t02 : k02) {
                    arrayList2.add(t02.mo44324t0(C16478c.m74384i(j2, (-e1Var.mo7987d(f1Var, f1Var.getLayoutDirection())) - e1Var.mo7985b(f1Var, f1Var.getLayoutDirection()), -e1Var.mo7986c(f1Var))));
                }
                Iterator it2 = arrayList2.iterator();
                if (!it2.hasNext()) {
                    obj2 = null;
                } else {
                    obj2 = it2.next();
                    if (it2.hasNext()) {
                        int G03 = ((C15611w0) obj2).mo44468G0();
                        do {
                            Object next2 = it2.next();
                            int G04 = ((C15611w0) next2).mo44468G0();
                            if (G03 < G04) {
                                obj2 = next2;
                                G03 = G04;
                            }
                        } while (it2.hasNext());
                    }
                }
                C15611w0 w0Var2 = (C15611w0) obj2;
                if (w0Var2 != null) {
                    i2 = w0Var2.mo44468G0();
                } else {
                    i2 = 0;
                }
                Iterator it3 = arrayList2.iterator();
                if (!it3.hasNext()) {
                    obj3 = null;
                } else {
                    obj3 = it3.next();
                    if (it3.hasNext()) {
                        int K0 = ((C15611w0) obj3).mo44471K0();
                        while (true) {
                            Object next3 = it3.next();
                            int K02 = ((C15611w0) next3).mo44471K0();
                            if (K0 < K02) {
                                obj3 = next3;
                                K0 = K02;
                            }
                            if (!it3.hasNext()) {
                                break;
                            }
                        }
                    }
                }
                C15611w0 w0Var3 = (C15611w0) obj3;
                if (w0Var3 != null) {
                    i3 = w0Var3.mo44471K0();
                } else {
                    i3 = 0;
                }
                C2354e1 e1Var2 = e1Var;
                C15562f1 f1Var2 = f1Var2;
                long j3 = e;
                ArrayList arrayList3 = new ArrayList();
                for (C15557e0 t03 : f1Var2.mo44296k0(ScaffoldLayoutContent.Fab, pVar3)) {
                    C15611w0 t04 = t03.mo44324t0(C16478c.m74384i(j3, (-e1Var2.mo7987d(f1Var2, f1Var2.getLayoutDirection())) - e1Var2.mo7985b(f1Var2, f1Var2.getLayoutDirection()), -e1Var2.mo7986c(f1Var2)));
                    if (t04.mo44468G0() == 0 || t04.mo44471K0() == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        t04 = null;
                    }
                    if (t04 != null) {
                        arrayList3.add(t04);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Iterator it4 = arrayList3.iterator();
                    if (!it4.hasNext()) {
                        obj5 = null;
                    } else {
                        obj5 = it4.next();
                        if (it4.hasNext()) {
                            int K03 = ((C15611w0) obj5).mo44471K0();
                            do {
                                Object next4 = it4.next();
                                int K04 = ((C15611w0) next4).mo44471K0();
                                if (K03 < K04) {
                                    obj5 = next4;
                                    K03 = K04;
                                }
                            } while (it4.hasNext());
                        }
                    }
                    Intrinsics.checkNotNull(obj5);
                    int K05 = ((C15611w0) obj5).mo44471K0();
                    Iterator it5 = arrayList3.iterator();
                    if (!it5.hasNext()) {
                        obj6 = null;
                    } else {
                        obj6 = it5.next();
                        if (it5.hasNext()) {
                            int G05 = ((C15611w0) obj6).mo44468G0();
                            do {
                                Object next5 = it5.next();
                                int G06 = ((C15611w0) next5).mo44468G0();
                                if (G05 < G06) {
                                    obj6 = next5;
                                    G05 = G06;
                                }
                            } while (it5.hasNext());
                        }
                    }
                    Intrinsics.checkNotNull(obj6);
                    int G07 = ((C15611w0) obj6).mo44468G0();
                    if (!C8261p0.m27441f(i, C8261p0.f20408b.mo12901b())) {
                        i8 = (i3 - K05) / 2;
                    } else if (f1Var2.getLayoutDirection() == LayoutDirection.Ltr) {
                        i8 = (i3 - f1Var2.mo7429n2(ScaffoldKt.f19601b)) - K05;
                    } else {
                        i8 = f1Var2.mo7429n2(ScaffoldKt.f19601b);
                    }
                    o0Var = new C8256o0(i8, K05, G07);
                } else {
                    o0Var = null;
                }
                Iterable<C15557e0> k03 = f1Var2.mo44296k0(ScaffoldLayoutContent.BottomBar, C8553b.m31049c(-1455477816, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(o0Var, pVar4, i2)));
                long j4 = e;
                ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(k03, 10));
                for (C15557e0 t05 : k03) {
                    arrayList4.add(t05.mo44324t0(j4));
                }
                Iterator it6 = arrayList4.iterator();
                if (!it6.hasNext()) {
                    obj4 = null;
                } else {
                    obj4 = it6.next();
                    if (it6.hasNext()) {
                        int G08 = ((C15611w0) obj4).mo44468G0();
                        while (true) {
                            Object next6 = it6.next();
                            int G09 = ((C15611w0) next6).mo44468G0();
                            if (G08 < G09) {
                                obj4 = next6;
                                G08 = G09;
                            }
                            if (!it6.hasNext()) {
                                break;
                            }
                            ArrayList arrayList5 = arrayList2;
                            ArrayList arrayList6 = arrayList3;
                            arrayList2 = arrayList5;
                        }
                    }
                }
                C15611w0 w0Var4 = (C15611w0) obj4;
                if (w0Var4 != null) {
                    num = Integer.valueOf(w0Var4.mo44468G0());
                } else {
                    num = null;
                }
                if (o0Var != null) {
                    C15562f1 f1Var3 = f1Var2;
                    C2354e1 e1Var3 = e1Var;
                    if (num == null) {
                        i7 = o0Var.mo12881a() + f1Var3.mo7429n2(ScaffoldKt.f19601b) + e1Var3.mo7986c(f1Var3);
                    } else {
                        i7 = num.intValue() + o0Var.mo12881a() + f1Var3.mo7429n2(ScaffoldKt.f19601b);
                    }
                    num2 = Integer.valueOf(i7);
                } else {
                    num2 = null;
                }
                if (i2 != 0) {
                    if (num2 != null) {
                        i6 = num2.intValue();
                    } else if (num != null) {
                        i6 = num.intValue();
                    } else {
                        i6 = e1Var.mo7986c(f1Var2);
                    }
                    i4 = i2 + i6;
                } else {
                    i4 = 0;
                }
                C15562f1 f1Var4 = f1Var2;
                ArrayList arrayList7 = arrayList3;
                ArrayList<C15611w0> arrayList8 = arrayList2;
                Iterable<C15557e0> k04 = f1Var4.mo44296k0(ScaffoldLayoutContent.MainContent, C8553b.m31049c(1643221465, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(e1Var, f1Var4, arrayList, i, arrayList4, num, qVar, i2)));
                long j5 = e;
                ArrayList<C15611w0> arrayList9 = new ArrayList<>(C10978t.m41495Y(k04, 10));
                for (C15557e0 t06 : k04) {
                    arrayList9.add(t06.mo44324t0(j5));
                }
                for (C15611w0 p : arrayList9) {
                    ArrayList arrayList10 = arrayList7;
                    C15611w0.C15612a.m69412p(aVar, p, 0, 0, 0.0f, 4, (Object) null);
                    arrayList = arrayList;
                    arrayList4 = arrayList4;
                }
                ArrayList<C15611w0> arrayList11 = arrayList4;
                ArrayList<C15611w0> arrayList12 = arrayList7;
                for (C15611w0 p2 : arrayList) {
                    C15611w0.C15612a.m69412p(aVar, p2, 0, 0, 0.0f, 4, (Object) null);
                }
                int i9 = i3;
                C2354e1 e1Var4 = e1Var;
                C15562f1 f1Var5 = f1Var2;
                int i10 = i4;
                for (C15611w0 p3 : arrayList8) {
                    C15611w0.C15612a.m69412p(aVar, p3, e1Var4.mo7987d(f1Var5, f1Var5.getLayoutDirection()) + ((i9 - i3) / 2), i10 - i4, 0.0f, 4, (Object) null);
                }
                int i11 = i4;
                for (C15611w0 w0Var5 : arrayList11) {
                    if (num != null) {
                        i5 = num.intValue();
                    } else {
                        i5 = 0;
                    }
                    C15611w0.C15612a.m69412p(aVar, w0Var5, 0, i11 - i5, 0.0f, 4, (Object) null);
                }
                if (o0Var != null) {
                    int i12 = i4;
                    for (C15611w0 p4 : arrayList12) {
                        int b = o0Var.mo12882b();
                        Intrinsics.checkNotNull(num2);
                        C15611w0.C15612a.m69412p(aVar, p4, b, i12 - num2.intValue(), 0.0f, 4, (Object) null);
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo11812a((C15611w0.C15612a) obj);
                return C11079d2.f28267a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo11811a((C15562f1) obj, ((C16476b) obj2).mo47807x());
    }
}
