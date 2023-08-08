package androidx.compose.p004ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n116#2,2:98\n33#2,6:100\n118#2:106\n33#2,6:107\n33#2,6:113\n33#2,6:119\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n54#1:98,2\n54#1:100,6\n54#1:106\n62#1:107,6\n66#1:113,6\n70#1:119,6\n*E\n"})
/* renamed from: androidx.compose.ui.node.o0 */
public final class C15720o0 implements C15721o1 {

    /* renamed from: a */
    public final int f39044a;
    @C12579k

    /* renamed from: b */
    public final List<C15721o1> f39045b = new ArrayList();

    /* renamed from: a */
    public void mo45165a(@C12579k View view, @C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        List<C15721o1> list = this.f39045b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).mo45165a(view, viewGroup);
        }
    }

    /* renamed from: b */
    public void mo45166b(@C12579k View view, @C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        List<C15721o1> list = this.f39045b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).mo45166b(view, viewGroup);
        }
    }

    /* renamed from: c */
    public void mo45167c(@C12579k View view, @C12579k ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        List<C15721o1> list = this.f39045b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).mo45167c(view, viewGroup);
        }
    }

    @C12579k
    /* renamed from: d */
    public final <T extends C15721o1> T mo45168d(int i, @C12579k C11289a<? extends T> aVar) {
        T t;
        T t2;
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "factory");
        List<C15721o1> e = mo45169e();
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
        mo45169e().add(t3);
        return t3;
    }

    @C12579k
    /* renamed from: e */
    public final List<C15721o1> mo45169e() {
        return this.f39045b;
    }

    public int getId() {
        return this.f39044a;
    }
}
