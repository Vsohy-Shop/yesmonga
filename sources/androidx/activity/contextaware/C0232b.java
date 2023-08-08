package androidx.activity.contextaware;

import android.content.Context;
import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.iam.events.C9175a;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.activity.contextaware.b */
public final class C0232b {
    @C12579k

    /* renamed from: a */
    public final Set<C0233c> f732a = new CopyOnWriteArraySet();
    @C12580l

    /* renamed from: b */
    public volatile Context f733b;

    /* renamed from: a */
    public final void mo825a(@C12579k C0233c cVar) {
        Intrinsics.checkNotNullParameter(cVar, C40852x.C40853a.f103958a);
        Context context = this.f733b;
        if (context != null) {
            cVar.mo823a(context);
        }
        this.f732a.add(cVar);
    }

    /* renamed from: b */
    public final void mo826b() {
        this.f733b = null;
    }

    /* renamed from: c */
    public final void mo827c(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f733b = context;
        for (C0233c a : this.f732a) {
            a.mo823a(context);
        }
    }

    @C12580l
    /* renamed from: d */
    public final Context mo828d() {
        return this.f733b;
    }

    /* renamed from: e */
    public final void mo829e(@C12579k C0233c cVar) {
        Intrinsics.checkNotNullParameter(cVar, C40852x.C40853a.f103958a);
        this.f732a.remove(cVar);
    }
}
