package androidx.customview.poolingcontainer;

import com.google.android.gms.common.internal.C40852x;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.customview.poolingcontainer.c */
public final class C18539c {
    @C12579k

    /* renamed from: a */
    public final ArrayList<C18538b> f47316a = new ArrayList<>();

    /* renamed from: a */
    public final void mo53416a(@C12579k C18538b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40852x.C40853a.f103958a);
        this.f47316a.add(bVar);
    }

    /* renamed from: b */
    public final void mo53417b() {
        for (int G = CollectionsKt__CollectionsKt.m40443G(this.f47316a); -1 < G; G--) {
            this.f47316a.get(G).mo45568g();
        }
    }

    /* renamed from: c */
    public final void mo53418c(@C12579k C18538b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40852x.C40853a.f103958a);
        this.f47316a.remove(bVar);
    }
}
