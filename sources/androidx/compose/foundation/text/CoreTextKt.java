package androidx.compose.foundation.text;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.C16454v;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,702:1\n33#2,4:703\n38#2:738\n33#2,6:739\n71#3,4:707\n75#3,11:712\n88#3:737\n76#4:711\n456#5,14:723\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt\n*L\n81#1:703,4\n81#1:738\n682#1:739,6\n82#1:707,4\n82#1:712,11\n82#1:737\n82#1:711\n82#1:723,14\n*E\n"})
public final class CoreTextKt {
    @C12579k

    /* renamed from: a */
    public static final Pair<List<C16156d.C16159b<C16454v>>, List<C16156d.C16159b<C11305q<String, C8592o, Integer, C11079d2>>>> f7101a = new Pair<>(CollectionsKt__CollectionsKt.m40441E(), CollectionsKt__CollectionsKt.m40441E());

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m12283a(@C12579k C16156d dVar, @C12579k List<C16156d.C16159b<C11305q<String, C8592o, Integer, C11079d2>>> list, @C12580l C8592o oVar, int i) {
        C16156d dVar2 = dVar;
        List<C16156d.C16159b<C11305q<String, C8592o, Integer, C11079d2>>> list2 = list;
        int i2 = i;
        Intrinsics.checkNotNullParameter(dVar2, "text");
        Intrinsics.checkNotNullParameter(list2, "inlineContents");
        C8592o o = oVar.mo15009o(-110905764);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-110905764, i2, -1, "androidx.compose.foundation.text.InlineChildren (CoreText.kt:76)");
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            C16156d.C16159b bVar = list2.get(i3);
            C11305q qVar = (C11305q) bVar.mo46731a();
            int b = bVar.mo46732b();
            int c = bVar.mo46733c();
            CoreTextKt$InlineChildren$1$2 coreTextKt$InlineChildren$1$2 = CoreTextKt$InlineChildren$1$2.f7102a;
            o.mo14918M(-1323940314);
            C8767m.C8768a aVar = C8767m.f23478j;
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
            int i4 = size;
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, coreTextKt$InlineChildren$1$2, companion.mo44588d());
            Updater.m30188j(b2, dVar3, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            qVar.invoke(dVar2.subSequence(b, c).mo46683j(), o, 0);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            i3++;
            size = i4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CoreTextKt$InlineChildren$2(dVar2, list2, i2));
        }
    }

    @C12579k
    /* renamed from: b */
    public static final Pair<List<C16156d.C16159b<C16454v>>, List<C16156d.C16159b<C11305q<String, C8592o, Integer, C11079d2>>>> m12284b(@C12579k C16156d dVar, @C12579k Map<String, C2762c> map) {
        Intrinsics.checkNotNullParameter(dVar, "text");
        Intrinsics.checkNotNullParameter(map, "inlineContent");
        if (map.isEmpty()) {
            return f7101a;
        }
        List<C16156d.C16159b<String>> i = dVar.mo46682i(C2765d.f7274a, 0, dVar.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16156d.C16159b bVar = i.get(i2);
            C2762c cVar = map.get(bVar.mo46738h());
            if (cVar != null) {
                arrayList.add(new C16156d.C16159b(cVar.mo9501b(), bVar.mo46740i(), bVar.mo46737g()));
                arrayList2.add(new C16156d.C16159b(cVar.mo9500a(), bVar.mo46740i(), bVar.mo46737g()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @C12579k
    /* renamed from: c */
    public static final C2785r m12285c(@C12579k C2785r rVar, @C12579k C16156d dVar, @C12579k C16361p0 p0Var, @C12579k C16479d dVar2, @C12579k C16242u.C16244b bVar, boolean z, int i, int i2, int i3, @C12579k List<C16156d.C16159b<C16454v>> list) {
        C16156d dVar3 = dVar;
        C16361p0 p0Var2 = p0Var;
        C16479d dVar4 = dVar2;
        C16242u.C16244b bVar2 = bVar;
        List<C16156d.C16159b<C16454v>> list2 = list;
        C2785r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(rVar, "current");
        Intrinsics.checkNotNullParameter(dVar, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(dVar4, "density");
        Intrinsics.checkNotNullParameter(bVar2, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        if (!Intrinsics.areEqual((Object) rVar.mo9579n(), (Object) dVar) || !Intrinsics.areEqual((Object) rVar.mo9578m(), (Object) p0Var)) {
            boolean z2 = z;
        } else if (rVar.mo9577l() == z) {
            if (C16449r.m74263g(rVar.mo9574i(), i)) {
                if (rVar.mo9570e() == i2) {
                    if (rVar.mo9572g() == i3 && Intrinsics.areEqual((Object) rVar.mo9566a(), (Object) dVar4) && Intrinsics.areEqual((Object) rVar.mo9576k(), (Object) list2) && rVar.mo9567b() == bVar2) {
                        return rVar2;
                    }
                    return new C2785r(dVar, p0Var, i2, i3, z, i, dVar2, bVar, list, (DefaultConstructorMarker) null);
                }
                int i4 = i3;
                return new C2785r(dVar, p0Var, i2, i3, z, i, dVar2, bVar, list, (DefaultConstructorMarker) null);
            }
            int i5 = i2;
            int i42 = i3;
            return new C2785r(dVar, p0Var, i2, i3, z, i, dVar2, bVar, list, (DefaultConstructorMarker) null);
        }
        int i6 = i;
        int i52 = i2;
        int i422 = i3;
        return new C2785r(dVar, p0Var, i2, i3, z, i, dVar2, bVar, list, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C2785r m12286d(C2785r rVar, C16156d dVar, C16361p0 p0Var, C16479d dVar2, C16242u.C16244b bVar, boolean z, int i, int i2, int i3, List list, int i4, Object obj) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8 = i4;
        if ((i8 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i8 & 64) != 0) {
            i5 = C16449r.f40760b.mo47726a();
        } else {
            i5 = i;
        }
        if ((i8 & 128) != 0) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = i2;
        }
        if ((i8 & 256) != 0) {
            i7 = 1;
        } else {
            i7 = i3;
        }
        return m12285c(rVar, dVar, p0Var, dVar2, bVar, z2, i5, i6, i7, list);
    }

    @C12579k
    /* renamed from: e */
    public static final C2785r m12287e(@C12579k C2785r rVar, @C12579k String str, @C12579k C16361p0 p0Var, @C12579k C16479d dVar, @C12579k C16242u.C16244b bVar, boolean z, int i, int i2, int i3) {
        String str2 = str;
        C16361p0 p0Var2 = p0Var;
        C16479d dVar2 = dVar;
        C16242u.C16244b bVar2 = bVar;
        C2785r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(rVar2, "current");
        Intrinsics.checkNotNullParameter(str2, "text");
        Intrinsics.checkNotNullParameter(p0Var2, "style");
        Intrinsics.checkNotNullParameter(dVar2, "density");
        Intrinsics.checkNotNullParameter(bVar2, "fontFamilyResolver");
        if (!Intrinsics.areEqual((Object) rVar.mo9579n().mo46683j(), (Object) str2) || !Intrinsics.areEqual((Object) rVar.mo9578m(), (Object) p0Var2)) {
            boolean z2 = z;
        } else if (rVar.mo9577l() == z) {
            if (C16449r.m74263g(rVar.mo9574i(), i)) {
                if (rVar.mo9570e() == i2) {
                    if (rVar.mo9572g() == i3 && Intrinsics.areEqual((Object) rVar.mo9566a(), (Object) dVar2) && rVar.mo9567b() == bVar2) {
                        return rVar2;
                    }
                    return new C2785r(new C16156d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), p0Var, i2, i3, z, i, dVar, bVar, (List) null, 256, (DefaultConstructorMarker) null);
                }
                int i4 = i3;
                return new C2785r(new C16156d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), p0Var, i2, i3, z, i, dVar, bVar, (List) null, 256, (DefaultConstructorMarker) null);
            }
            int i5 = i2;
            int i42 = i3;
            return new C2785r(new C16156d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), p0Var, i2, i3, z, i, dVar, bVar, (List) null, 256, (DefaultConstructorMarker) null);
        }
        int i6 = i;
        int i52 = i2;
        int i422 = i3;
        return new C2785r(new C16156d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), p0Var, i2, i3, z, i, dVar, bVar, (List) null, 256, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C2785r m12288f(C2785r rVar, String str, C16361p0 p0Var, C16479d dVar, C16242u.C16244b bVar, boolean z, int i, int i2, int i3, int i4, Object obj) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8 = i4;
        if ((i8 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i8 & 64) != 0) {
            i5 = C16449r.f40760b.mo47726a();
        } else {
            i5 = i;
        }
        if ((i8 & 128) != 0) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = i2;
        }
        if ((i8 & 256) != 0) {
            i7 = 1;
        } else {
            i7 = i3;
        }
        return m12287e(rVar, str, p0Var, dVar, bVar, z2, i5, i6, i7);
    }
}
