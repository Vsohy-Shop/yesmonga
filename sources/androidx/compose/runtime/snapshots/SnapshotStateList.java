package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8438a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8450g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.C11079d2;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11349e;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C11363r0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n153#1:458\n189#1,6:460\n195#1:467\n153#1:468\n196#1,9:470\n149#1:479\n205#1,6:485\n214#1,6:494\n185#1,10:500\n195#1:511\n153#1:512\n196#1,9:514\n149#1:523\n205#1,6:529\n214#1,6:538\n186#1:544\n189#1,6:545\n195#1:552\n153#1:553\n196#1,9:555\n149#1:564\n205#1,6:570\n214#1,6:579\n149#1:585\n189#1,6:596\n195#1:603\n153#1:604\n196#1,9:606\n149#1:615\n205#1,6:621\n214#1,6:630\n189#1,6:636\n195#1:643\n153#1:644\n196#1,9:646\n149#1:655\n205#1,6:661\n214#1,6:670\n185#1,10:677\n195#1:688\n153#1:689\n196#1,9:691\n149#1:700\n205#1,6:706\n214#1,6:715\n186#1:721\n185#1,10:722\n195#1:733\n153#1:734\n196#1,9:736\n149#1:745\n205#1,6:751\n214#1,6:760\n186#1:766\n159#1,4:767\n163#1:772\n153#1:773\n164#1,7:775\n149#1:782\n171#1,6:788\n179#1,3:797\n159#1,4:800\n163#1:805\n153#1:806\n164#1,7:808\n149#1:815\n171#1,6:821\n179#1,3:830\n153#1:833\n159#1,4:845\n163#1:850\n153#1:851\n164#1,7:853\n149#1:860\n171#1,6:866\n179#1,3:875\n153#1:879\n149#1:881\n189#1,6:892\n195#1:899\n153#1:900\n196#1,9:902\n149#1:911\n205#1,6:917\n214#1,6:926\n153#1:933\n149#1:935\n2180#2:459\n2180#2:469\n2073#2,2:480\n1686#2:482\n2075#2,2:483\n2077#2,3:491\n2180#2:513\n2073#2,2:524\n1686#2:526\n2075#2,2:527\n2077#2,3:535\n2180#2:554\n2073#2,2:565\n1686#2:567\n2075#2,2:568\n2077#2,3:576\n2073#2,2:586\n1686#2:588\n2075#2,2:590\n2077#2,3:593\n2180#2:605\n2073#2,2:616\n1686#2:618\n2075#2,2:619\n2077#2,3:627\n2180#2:645\n2073#2,2:656\n1686#2:658\n2075#2,2:659\n2077#2,3:667\n2180#2:690\n2073#2,2:701\n1686#2:703\n2075#2,2:704\n2077#2,3:712\n2180#2:735\n2073#2,2:746\n1686#2:748\n2075#2,2:749\n2077#2,3:757\n2180#2:774\n2073#2,2:783\n1686#2:785\n2075#2,2:786\n2077#2,3:794\n2180#2:807\n2073#2,2:816\n1686#2:818\n2075#2,2:819\n2077#2,3:827\n2180#2:834\n2073#2,2:835\n1686#2:837\n2075#2,5:839\n2180#2:844\n2180#2:852\n2073#2,2:861\n1686#2:863\n2075#2,2:864\n2077#2,3:872\n2180#2:880\n2073#2,2:882\n1686#2:884\n2075#2,2:886\n2077#2,3:889\n2180#2:901\n2073#2,2:912\n1686#2:914\n2075#2,2:915\n2077#2,3:923\n2180#2:934\n2073#2,2:936\n1686#2:938\n2075#2,2:940\n2077#2,3:943\n70#3:466\n70#3:510\n70#3:551\n70#3:589\n70#3:592\n70#3:602\n70#3:642\n70#3:687\n70#3:732\n70#3:771\n70#3:804\n70#3:838\n70#3:849\n70#3:878\n70#3:885\n70#3:888\n70#3:898\n70#3:932\n70#3:939\n70#3:942\n1#4:676\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n62#1:458\n101#1:460,6\n101#1:467\n101#1:468\n101#1:470,9\n101#1:479\n101#1:485,6\n101#1:494,6\n102#1:500,10\n102#1:511\n102#1:512\n102#1:514,9\n102#1:523\n102#1:529,6\n102#1:538,6\n102#1:544\n107#1:545,6\n107#1:552\n107#1:553\n107#1:555,9\n107#1:564\n107#1:570,6\n107#1:579,6\n109#1:585\n116#1:596,6\n116#1:603\n116#1:604\n116#1:606,9\n116#1:615\n116#1:621,6\n116#1:630,6\n117#1:636,6\n117#1:643\n117#1:644\n117#1:646,9\n117#1:655\n117#1:661,6\n117#1:670,6\n118#1:677,10\n118#1:688\n118#1:689\n118#1:691,9\n118#1:700\n118#1:706,6\n118#1:715,6\n118#1:721\n121#1:722,10\n121#1:733\n121#1:734\n121#1:736,9\n121#1:745\n121#1:751,6\n121#1:760,6\n121#1:766\n125#1:767,4\n125#1:772\n125#1:773\n125#1:775,7\n125#1:782\n125#1:788,6\n125#1:797,3\n132#1:800,4\n132#1:805\n132#1:806\n132#1:808,7\n132#1:815\n132#1:821,6\n132#1:830,3\n145#1:833\n155#1:845,4\n155#1:850\n155#1:851\n155#1:853,7\n155#1:860\n155#1:866,6\n155#1:875,3\n163#1:879\n170#1:881\n185#1:892,6\n185#1:899\n185#1:900\n185#1:902,9\n185#1:911\n185#1:917,6\n185#1:926,6\n195#1:933\n204#1:935\n62#1:459\n101#1:469\n101#1:480,2\n101#1:482\n101#1:483,2\n101#1:491,3\n102#1:513\n102#1:524,2\n102#1:526\n102#1:527,2\n102#1:535,3\n107#1:554\n107#1:565,2\n107#1:567\n107#1:568,2\n107#1:576,3\n109#1:586,2\n109#1:588\n109#1:590,2\n109#1:593,3\n116#1:605\n116#1:616,2\n116#1:618\n116#1:619,2\n116#1:627,3\n117#1:645\n117#1:656,2\n117#1:658\n117#1:659,2\n117#1:667,3\n118#1:690\n118#1:701,2\n118#1:703\n118#1:704,2\n118#1:712,3\n121#1:735\n121#1:746,2\n121#1:748\n121#1:749,2\n121#1:757,3\n125#1:774\n125#1:783,2\n125#1:785\n125#1:786,2\n125#1:794,3\n132#1:807\n132#1:816,2\n132#1:818\n132#1:819,2\n132#1:827,3\n145#1:834\n149#1:835,2\n149#1:837\n149#1:839,5\n153#1:844\n155#1:852\n155#1:861,2\n155#1:863\n155#1:864,2\n155#1:872,3\n163#1:880\n170#1:882,2\n170#1:884\n170#1:886,2\n170#1:889,3\n185#1:901\n185#1:912,2\n185#1:914\n185#1:915,2\n185#1:923,3\n195#1:934\n204#1:936,2\n204#1:938\n204#1:940,2\n204#1:943,3\n101#1:466\n102#1:510\n107#1:551\n109#1:589\n110#1:592\n116#1:602\n117#1:642\n118#1:687\n121#1:732\n125#1:771\n132#1:804\n149#1:838\n155#1:849\n162#1:878\n170#1:885\n171#1:888\n185#1:898\n194#1:932\n204#1:939\n205#1:942\n*E\n"})
public final class SnapshotStateList<T> implements List<T>, C8635a0, C11349e {

    /* renamed from: b */
    public static final int f23138b = 0;
    @C12579k

    /* renamed from: a */
    public C8638b0 f23139a = new C8631a(C8438a.m30463G());

    @C11363r0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,457:1\n70#2:458\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n76#1:458\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotStateList$a */
    public static final class C8631a<T> extends C8638b0 {
        @C12579k

        /* renamed from: d */
        public C8450g<? extends T> f23140d;

        /* renamed from: e */
        public int f23141e;

        public C8631a(@C12579k C8450g<? extends T> gVar) {
            Intrinsics.checkNotNullParameter(gVar, "list");
            this.f23140d = gVar;
        }

        /* renamed from: a */
        public void mo15124a(@C12579k C8638b0 b0Var) {
            Intrinsics.checkNotNullParameter(b0Var, "value");
            synchronized (C8666s.f23219a) {
                this.f23140d = ((C8631a) b0Var).f23140d;
                this.f23141e = ((C8631a) b0Var).f23141e;
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }

        @C12579k
        /* renamed from: b */
        public C8638b0 mo15125b() {
            return new C8631a(this.f23140d);
        }

        @C12579k
        /* renamed from: g */
        public final C8450g<T> mo16491g() {
            return this.f23140d;
        }

        /* renamed from: h */
        public final int mo16492h() {
            return this.f23141e;
        }

        /* renamed from: i */
        public final void mo16493i(@C12579k C8450g<? extends T> gVar) {
            Intrinsics.checkNotNullParameter(gVar, "<set-?>");
            this.f23140d = gVar;
        }

        /* renamed from: j */
        public final void mo16494j(int i) {
            this.f23141e = i;
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m31511Q() {
    }

    /* renamed from: y */
    public static /* synthetic */ void m31512y() {
    }

    /* renamed from: H */
    public final int mo16454H() {
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C8631a) SnapshotKt.m31444B((C8631a) i)).mo16492h();
    }

    @C12579k
    /* renamed from: M */
    public final C8631a<T> mo16455M() {
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C8631a) SnapshotKt.m31464V((C8631a) i, this);
    }

    /* renamed from: W */
    public int mo16456W() {
        return mo16455M().mo16491g().size();
    }

    /* renamed from: X */
    public final <R> R mo16457X(C11300l<? super List<T>, ? extends R> lVar) {
        int h;
        C8450g g;
        R invoke;
        C8646f b;
        boolean z;
        do {
            synchronized (C8666s.f23219a) {
                try {
                    C8638b0 i = mo15119i();
                    Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i);
                    h = aVar.mo16492h();
                    g = aVar.mo16491g();
                    C11079d2 d2Var = C11079d2.f28267a;
                    C11322b0.m43481d(1);
                } finally {
                    C11322b0.m43481d(1);
                    C11322b0.m43480c(1);
                }
            }
            C11322b0.m43480c(1);
            Intrinsics.checkNotNull(g);
            C8450g.C8451a builder = g.builder();
            invoke = lVar.invoke(builder);
            C8450g g2 = builder.mo15660g();
            if (Intrinsics.areEqual((Object) g2, (Object) g)) {
                break;
            }
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C8631a aVar2 = (C8631a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                try {
                    b = C8646f.f23196e.mo16622b();
                    C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                    synchronized (C8666s.f23219a) {
                        if (aVar3.mo16492h() == h) {
                            aVar3.mo16493i(g2);
                            aVar3.mo16494j(aVar3.mo16492h() + 1);
                            z = true;
                        } else {
                            z = false;
                        }
                        C11322b0.m43481d(1);
                    }
                    C11322b0.m43480c(1);
                    C11322b0.m43481d(1);
                } catch (Throwable th) {
                    throw th;
                }
            }
            C11322b0.m43480c(1);
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return invoke;
    }

    public boolean add(T t) {
        int h;
        C8450g g;
        boolean z;
        C8646f b;
        do {
            synchronized (C8666s.f23219a) {
                C8638b0 i = mo15119i();
                Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i);
                h = aVar.mo16492h();
                g = aVar.mo16491g();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8450g add = g.add(t);
            z = false;
            if (Intrinsics.areEqual((Object) add, (Object) g)) {
                return false;
            }
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C8631a aVar2 = (C8631a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                synchronized (C8666s.f23219a) {
                    if (aVar3.mo16492h() == h) {
                        aVar3.mo16493i(add);
                        aVar3.mo16494j(aVar3.mo16492h() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return true;
    }

    public boolean addAll(int i, @C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return mo16465e0(new SnapshotStateList$addAll$1(i, collection));
    }

    public void clear() {
        C8646f b;
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        C8631a aVar = (C8631a) i;
        SnapshotKt.m31449G();
        synchronized (SnapshotKt.m31447E()) {
            b = C8646f.f23196e.mo16622b();
            C8631a aVar2 = (C8631a) SnapshotKt.m31490k0(aVar, this, b);
            synchronized (C8666s.f23219a) {
                aVar2.mo16493i(C8438a.m30463G());
                aVar2.mo16494j(aVar2.mo16492h() + 1);
            }
        }
        SnapshotKt.m31457O(b, this);
    }

    public boolean contains(Object obj) {
        return mo16455M().mo16491g().contains(obj);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return mo16455M().mo16491g().containsAll(collection);
    }

    /* renamed from: e */
    public void mo15116e(@C12579k C8638b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "value");
        b0Var.mo16550e(mo15119i());
        this.f23139a = (C8631a) b0Var;
    }

    /* renamed from: e0 */
    public final boolean mo16465e0(C11300l<? super List<T>, Boolean> lVar) {
        int h;
        C8450g g;
        Boolean invoke;
        C8646f b;
        boolean z;
        do {
            synchronized (C8666s.f23219a) {
                C8638b0 i = mo15119i();
                Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i);
                h = aVar.mo16492h();
                g = aVar.mo16491g();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8450g.C8451a builder = g.builder();
            invoke = lVar.invoke(builder);
            C8450g g2 = builder.mo15660g();
            if (Intrinsics.areEqual((Object) g2, (Object) g)) {
                break;
            }
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C8631a aVar2 = (C8631a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                synchronized (C8666s.f23219a) {
                    if (aVar3.mo16492h() == h) {
                        aVar3.mo16493i(g2);
                        z = true;
                        aVar3.mo16494j(aVar3.mo16492h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return invoke.booleanValue();
    }

    /* renamed from: f0 */
    public T mo16466f0(int i) {
        int h;
        C8450g g;
        C8646f b;
        boolean z;
        T t = get(i);
        do {
            synchronized (C8666s.f23219a) {
                C8638b0 i2 = mo15119i();
                Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i2);
                h = aVar.mo16492h();
                g = aVar.mo16491g();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8450g Z0 = g.mo15661Z0(i);
            if (Intrinsics.areEqual((Object) Z0, (Object) g)) {
                break;
            }
            C8638b0 i3 = mo15119i();
            Intrinsics.checkNotNull(i3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C8631a aVar2 = (C8631a) i3;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                synchronized (C8666s.f23219a) {
                    if (aVar3.mo16492h() == h) {
                        aVar3.mo16493i(Z0);
                        z = true;
                        aVar3.mo16494j(aVar3.mo16492h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return t;
    }

    public T get(int i) {
        return mo16455M().mo16491g().get(i);
    }

    /* renamed from: h0 */
    public final void mo16468h0(int i, int i2) {
        int h;
        C8450g g;
        C8646f b;
        boolean z;
        do {
            synchronized (C8666s.f23219a) {
                C8638b0 i3 = mo15119i();
                Intrinsics.checkNotNull(i3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i3);
                h = aVar.mo16492h();
                g = aVar.mo16491g();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8450g.C8451a builder = g.builder();
            builder.subList(i, i2).clear();
            C8450g g2 = builder.mo15660g();
            if (!Intrinsics.areEqual((Object) g2, (Object) g)) {
                C8638b0 i4 = mo15119i();
                Intrinsics.checkNotNull(i4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar2 = (C8631a) i4;
                SnapshotKt.m31449G();
                synchronized (SnapshotKt.m31447E()) {
                    b = C8646f.f23196e.mo16622b();
                    C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                    synchronized (C8666s.f23219a) {
                        if (aVar3.mo16492h() == h) {
                            aVar3.mo16493i(g2);
                            z = true;
                            aVar3.mo16494j(aVar3.mo16492h() + 1);
                        } else {
                            z = false;
                        }
                    }
                }
                SnapshotKt.m31457O(b, this);
            } else {
                return;
            }
        } while (!z);
    }

    @C12579k
    /* renamed from: i */
    public C8638b0 mo15119i() {
        return this.f23139a;
    }

    /* renamed from: i0 */
    public final int mo16469i0(@C12579k Collection<? extends T> collection, int i, int i2) {
        int h;
        C8450g g;
        C8646f b;
        boolean z;
        Intrinsics.checkNotNullParameter(collection, "elements");
        int size = size();
        do {
            synchronized (C8666s.f23219a) {
                C8638b0 i3 = mo15119i();
                Intrinsics.checkNotNull(i3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i3);
                h = aVar.mo16492h();
                g = aVar.mo16491g();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8450g.C8451a builder = g.builder();
            builder.subList(i, i2).retainAll(collection);
            C8450g g2 = builder.mo15660g();
            if (Intrinsics.areEqual((Object) g2, (Object) g)) {
                break;
            }
            C8638b0 i4 = mo15119i();
            Intrinsics.checkNotNull(i4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C8631a aVar2 = (C8631a) i4;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                synchronized (C8666s.f23219a) {
                    if (aVar3.mo16492h() == h) {
                        aVar3.mo16493i(g2);
                        z = true;
                        aVar3.mo16494j(aVar3.mo16492h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return size - size();
    }

    public int indexOf(Object obj) {
        return mo16455M().mo16491g().indexOf(obj);
    }

    public boolean isEmpty() {
        return mo16455M().mo16491g().isEmpty();
    }

    @C12579k
    public Iterator<T> iterator() {
        return listIterator();
    }

    @C12579k
    /* renamed from: j0 */
    public final List<T> mo16473j0() {
        return mo16455M().mo16491g();
    }

    /* renamed from: l0 */
    public final void mo16474l0(C11300l<? super C8450g<? extends T>, ? extends C8450g<? extends T>> lVar) {
        int h;
        C8450g g;
        C8646f b;
        boolean z;
        do {
            synchronized (C8666s.f23219a) {
                try {
                    C8638b0 i = mo15119i();
                    Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i);
                    h = aVar.mo16492h();
                    g = aVar.mo16491g();
                    C11079d2 d2Var = C11079d2.f28267a;
                    C11322b0.m43481d(1);
                } finally {
                    C11322b0.m43481d(1);
                    C11322b0.m43480c(1);
                }
            }
            C11322b0.m43480c(1);
            Intrinsics.checkNotNull(g);
            C8450g gVar = (C8450g) lVar.invoke(g);
            if (!Intrinsics.areEqual((Object) gVar, (Object) g)) {
                C8638b0 i2 = mo15119i();
                Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar2 = (C8631a) i2;
                SnapshotKt.m31449G();
                synchronized (SnapshotKt.m31447E()) {
                    try {
                        b = C8646f.f23196e.mo16622b();
                        C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                        synchronized (C8666s.f23219a) {
                            if (aVar3.mo16492h() == h) {
                                aVar3.mo16493i(gVar);
                                aVar3.mo16494j(aVar3.mo16492h() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            C11322b0.m43481d(1);
                        }
                        C11322b0.m43480c(1);
                        C11322b0.m43481d(1);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C11322b0.m43480c(1);
                SnapshotKt.m31457O(b, this);
            } else {
                return;
            }
        } while (!z);
    }

    public int lastIndexOf(Object obj) {
        return mo16455M().mo16491g().lastIndexOf(obj);
    }

    @C12579k
    public ListIterator<T> listIterator() {
        return new C8670v(this, 0);
    }

    /* renamed from: m0 */
    public final <R> R mo16478m0(C11300l<? super C8631a<T>, ? extends R> lVar) {
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return lVar.invoke(SnapshotKt.m31444B((C8631a) i));
    }

    /* renamed from: n0 */
    public final <R> R mo16479n0(C11300l<? super C8631a<T>, ? extends R> lVar) {
        C8646f b;
        R invoke;
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        C8631a aVar = (C8631a) i;
        SnapshotKt.m31449G();
        synchronized (SnapshotKt.m31447E()) {
            try {
                b = C8646f.f23196e.mo16622b();
                invoke = lVar.invoke(SnapshotKt.m31490k0(aVar, this, b));
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        SnapshotKt.m31457O(b, this);
        return invoke;
    }

    /* renamed from: r */
    public final boolean mo16480r(C11300l<? super C8450g<? extends T>, ? extends C8450g<? extends T>> lVar) {
        int h;
        C8450g g;
        boolean z;
        C8646f b;
        do {
            synchronized (C8666s.f23219a) {
                try {
                    C8638b0 i = mo15119i();
                    Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i);
                    h = aVar.mo16492h();
                    g = aVar.mo16491g();
                    C11079d2 d2Var = C11079d2.f28267a;
                    C11322b0.m43481d(1);
                } finally {
                    C11322b0.m43481d(1);
                    C11322b0.m43480c(1);
                }
            }
            C11322b0.m43480c(1);
            Intrinsics.checkNotNull(g);
            C8450g gVar = (C8450g) lVar.invoke(g);
            z = false;
            if (Intrinsics.areEqual((Object) gVar, (Object) g)) {
                return false;
            }
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C8631a aVar2 = (C8631a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                try {
                    b = C8646f.f23196e.mo16622b();
                    C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                    synchronized (C8666s.f23219a) {
                        if (aVar3.mo16492h() == h) {
                            aVar3.mo16493i(gVar);
                            aVar3.mo16494j(aVar3.mo16492h() + 1);
                            z = true;
                        }
                        C11322b0.m43481d(1);
                    }
                    C11322b0.m43480c(1);
                    C11322b0.m43481d(1);
                } catch (Throwable th) {
                    throw th;
                }
            }
            C11322b0.m43480c(1);
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return true;
    }

    public final /* bridge */ T remove(int i) {
        return mo16466f0(i);
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
        int h;
        C8450g g;
        boolean z;
        C8646f b;
        Intrinsics.checkNotNullParameter(collection, "elements");
        do {
            synchronized (C8666s.f23219a) {
                C8638b0 i = mo15119i();
                Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i);
                h = aVar.mo16492h();
                g = aVar.mo16491g();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8450g<? extends Object> removeAll = g.removeAll(collection);
            z = false;
            if (Intrinsics.areEqual((Object) removeAll, (Object) g)) {
                return false;
            }
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C8631a aVar2 = (C8631a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                synchronized (C8666s.f23219a) {
                    if (aVar3.mo16492h() == h) {
                        aVar3.mo16493i(removeAll);
                        aVar3.mo16494j(aVar3.mo16492h() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return true;
    }

    public boolean retainAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return mo16465e0(new SnapshotStateList$retainAll$1(collection));
    }

    public T set(int i, T t) {
        int h;
        C8450g g;
        C8646f b;
        boolean z;
        T t2 = get(i);
        do {
            synchronized (C8666s.f23219a) {
                C8638b0 i2 = mo15119i();
                Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i2);
                h = aVar.mo16492h();
                g = aVar.mo16491g();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8450g gVar = g.set(i, t);
            if (Intrinsics.areEqual((Object) gVar, (Object) g)) {
                break;
            }
            C8638b0 i3 = mo15119i();
            Intrinsics.checkNotNull(i3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C8631a aVar2 = (C8631a) i3;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                synchronized (C8666s.f23219a) {
                    if (aVar3.mo16492h() == h) {
                        aVar3.mo16493i(gVar);
                        z = true;
                        aVar3.mo16494j(aVar3.mo16492h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return t2;
    }

    public final /* bridge */ int size() {
        return mo16456W();
    }

    @C12579k
    public List<T> subList(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i < 0 || i > i2) {
            z = false;
        } else {
            z = true;
        }
        if (!z || i2 > size()) {
            z2 = false;
        }
        if (z2) {
            return new C8640c0(this, i, i2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    @C11314h(name = "getDebuggerDisplayValue")
    @C12579k
    /* renamed from: w */
    public final List<T> mo16490w() {
        C8638b0 i = mo15119i();
        Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C8631a) SnapshotKt.m31444B((C8631a) i)).mo16491g();
    }

    public boolean addAll(@C12579k Collection<? extends T> collection) {
        int h;
        C8450g g;
        boolean z;
        C8646f b;
        Intrinsics.checkNotNullParameter(collection, "elements");
        do {
            synchronized (C8666s.f23219a) {
                C8638b0 i = mo15119i();
                Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i);
                h = aVar.mo16492h();
                g = aVar.mo16491g();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8450g<? extends T> addAll = g.addAll(collection);
            z = false;
            if (Intrinsics.areEqual((Object) addAll, (Object) g)) {
                return false;
            }
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C8631a aVar2 = (C8631a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                synchronized (C8666s.f23219a) {
                    if (aVar3.mo16492h() == h) {
                        aVar3.mo16493i(addAll);
                        aVar3.mo16494j(aVar3.mo16492h() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return true;
    }

    @C12579k
    public ListIterator<T> listIterator(int i) {
        return new C8670v(this, i);
    }

    public boolean remove(Object obj) {
        int h;
        C8450g g;
        boolean z;
        C8646f b;
        do {
            synchronized (C8666s.f23219a) {
                C8638b0 i = mo15119i();
                Intrinsics.checkNotNull(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i);
                h = aVar.mo16492h();
                g = aVar.mo16491g();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8450g remove = g.remove(obj);
            z = false;
            if (Intrinsics.areEqual((Object) remove, (Object) g)) {
                return false;
            }
            C8638b0 i2 = mo15119i();
            Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C8631a aVar2 = (C8631a) i2;
            SnapshotKt.m31449G();
            synchronized (SnapshotKt.m31447E()) {
                b = C8646f.f23196e.mo16622b();
                C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                synchronized (C8666s.f23219a) {
                    if (aVar3.mo16492h() == h) {
                        aVar3.mo16493i(remove);
                        aVar3.mo16494j(aVar3.mo16492h() + 1);
                        z = true;
                    }
                }
            }
            SnapshotKt.m31457O(b, this);
        } while (!z);
        return true;
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }

    public void add(int i, T t) {
        int h;
        C8450g g;
        C8646f b;
        boolean z;
        do {
            synchronized (C8666s.f23219a) {
                C8638b0 i2 = mo15119i();
                Intrinsics.checkNotNull(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar = (C8631a) SnapshotKt.m31444B((C8631a) i2);
                h = aVar.mo16492h();
                g = aVar.mo16491g();
                C11079d2 d2Var = C11079d2.f28267a;
            }
            Intrinsics.checkNotNull(g);
            C8450g add = g.add(i, t);
            if (!Intrinsics.areEqual((Object) add, (Object) g)) {
                C8638b0 i3 = mo15119i();
                Intrinsics.checkNotNull(i3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C8631a aVar2 = (C8631a) i3;
                SnapshotKt.m31449G();
                synchronized (SnapshotKt.m31447E()) {
                    b = C8646f.f23196e.mo16622b();
                    C8631a aVar3 = (C8631a) SnapshotKt.m31490k0(aVar2, this, b);
                    synchronized (C8666s.f23219a) {
                        if (aVar3.mo16492h() == h) {
                            aVar3.mo16493i(add);
                            z = true;
                            aVar3.mo16494j(aVar3.mo16492h() + 1);
                        } else {
                            z = false;
                        }
                    }
                }
                SnapshotKt.m31457O(b, this);
            } else {
                return;
            }
        } while (!z);
    }
}
