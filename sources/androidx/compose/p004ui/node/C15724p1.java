package androidx.compose.p004ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n54#2:98\n55#2,4:108\n116#3,2:99\n33#3,6:101\n118#3:107\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n45#1:98\n45#1:108,4\n45#1:99,2\n45#1:101,6\n45#1:107\n*E\n"})
/* renamed from: androidx.compose.ui.node.p1 */
public final class C15724p1 {

    /* renamed from: a */
    public static final int f39050a = m70492d("ViewAdapter");

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static final <T extends C15721o1> T m70489a(@C12579k View view, int i, @C12579k C11289a<? extends T> aVar) {
        T t;
        T t2;
        boolean z;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "factory");
        C15720o0 b = m70490b(view);
        List<C15721o1> e = b.mo45169e();
        int size = e.size();
        int i2 = 0;
        while (true) {
            t = null;
            if (i2 >= size) {
                t2 = null;
                break;
            }
            t2 = e.get(i2);
            if (((C15721o1) t2).getId() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i2++;
        }
        if (t2 instanceof C15721o1) {
            t = (C15721o1) t2;
        }
        if (t != null) {
            return t;
        }
        T t3 = (C15721o1) aVar.invoke();
        b.mo45169e().add(t3);
        return t3;
    }

    @C12579k
    /* renamed from: b */
    public static final C15720o0 m70490b(@C12579k View view) {
        C15720o0 o0Var;
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i = f39050a;
        Object tag = view.getTag(i);
        if (tag instanceof C15720o0) {
            o0Var = (C15720o0) tag;
        } else {
            o0Var = null;
        }
        if (o0Var != null) {
            return o0Var;
        }
        C15720o0 o0Var2 = new C15720o0();
        view.setTag(i, o0Var2);
        return o0Var2;
    }

    @C12580l
    /* renamed from: c */
    public static final C15720o0 m70491c(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(f39050a);
        if (tag instanceof C15720o0) {
            return (C15720o0) tag;
        }
        return null;
    }

    /* renamed from: d */
    public static final int m70492d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return str.hashCode() | 50331648;
    }
}
