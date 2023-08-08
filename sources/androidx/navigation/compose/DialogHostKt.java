package androidx.navigation.compose;

import androidx.compose.p004ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.saveable.C8623b;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.C19714d;
import com.bumptech.glide.load.data.mediastore.C22132b;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class DialogHostKt {
    @C8540g
    /* renamed from: a */
    public static final void m91692a(@C12579k C19714d dVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(dVar, "dialogNavigator");
        C8592o o = oVar.mo15009o(294589392);
        if ((i & 14) == 0) {
            if (o.mo15006n0(dVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            C8623b a = SaveableStateHolderKt.m31370a(o, 0);
            C8578k2<List<NavBackStackEntry>> b = C8415c2.m30233b(dVar.mo58382n(), (CoroutineContext) null, o, 8, 1);
            SnapshotStateList<NavBackStackEntry> d = m91695d(m91693b(b), o, 8);
            m91694c(d, m91693b(b), o, 64);
            for (NavBackStackEntry next : d) {
                C19714d.C19716b bVar = (C19714d.C19716b) next.mo58065f();
                AndroidDialog_androidKt.m74858a(new DialogHostKt$DialogHost$1$1(dVar, next), bVar.mo58385G0(), C8553b.m31048b(o, 1129586364, true, new DialogHostKt$DialogHost$1$2(next, a, dVar, bVar)), o, C22132b.f56831b, 0);
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DialogHostKt$DialogHost$2(dVar, i));
        }
    }

    /* renamed from: b */
    public static final List<NavBackStackEntry> m91693b(C8578k2<? extends List<NavBackStackEntry>> k2Var) {
        return (List) k2Var.getValue();
    }

    @C8540g
    /* renamed from: c */
    public static final void m91694c(@C12579k List<NavBackStackEntry> list, @C12579k Collection<NavBackStackEntry> collection, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(collection, "transitionsInProgress");
        C8592o o = oVar.mo15009o(1537894851);
        for (NavBackStackEntry navBackStackEntry : collection) {
            EffectsKt.m29891c(navBackStackEntry.getLifecycle(), new DialogHostKt$PopulateVisibleList$1$1(navBackStackEntry, list), o, 8);
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new DialogHostKt$PopulateVisibleList$2(list, collection, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r0 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0023;
     */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.navigation.NavBackStackEntry> m91695d(@org.jetbrains.annotations.C12579k java.util.Collection<androidx.navigation.NavBackStackEntry> r4, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r5, int r6) {
        /*
            java.lang.String r6 = "transitionsInProgress"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            r6 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            r5.mo14918M(r6)
            r6 = -3686930(0xffffffffffc7bdee, float:NaN)
            r5.mo14918M(r6)
            boolean r6 = r5.mo15006n0(r4)
            java.lang.Object r0 = r5.mo14921N()
            if (r6 != 0) goto L_0x0023
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r0 != r6) goto L_0x0059
        L_0x0023:
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = androidx.compose.runtime.C8415c2.m30237f()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0032:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r4.next()
            r2 = r1
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            androidx.lifecycle.Lifecycle$State r2 = r2.mo57465b()
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r2 = r2.mo57474q(r3)
            if (r2 == 0) goto L_0x0032
            r6.add(r1)
            goto L_0x0032
        L_0x0053:
            r0.addAll(r6)
            r5.mo14893C(r0)
        L_0x0059:
            r5.mo15002m0()
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = (androidx.compose.runtime.snapshots.SnapshotStateList) r0
            r5.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.DialogHostKt.m91695d(java.util.Collection, androidx.compose.runtime.o, int):androidx.compose.runtime.snapshots.SnapshotStateList");
    }
}
