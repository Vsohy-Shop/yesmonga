package com.carrefour.fid.android.design.components.extension;

import android.view.View;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11047d;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11719b3;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.extension.c */
public final class C37110c {

    /* renamed from: com.carrefour.fid.android.design.components.extension.c$a */
    public static final class C37111a implements C11047d {

        /* renamed from: a */
        public final /* synthetic */ View f92907a;

        public C37111a(View view) {
            this.f92907a = view;
        }

        @C12579k
        /* renamed from: Q */
        public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
            return C11047d.C11048a.m42588d(this, coroutineContext);
        }

        @C12580l
        /* renamed from: b */
        public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
            return C11047d.C11048a.m42586b(this, bVar);
        }

        @C12579k
        /* renamed from: f */
        public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
            return C11047d.C11048a.m42587c(this, bVar);
        }

        @C12579k
        public CoroutineContext.C11042b<?> getKey() {
            return C11047d.f28247u0;
        }

        /* renamed from: l */
        public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return C11047d.C11048a.m42585a(this, r, pVar);
        }

        /* renamed from: m */
        public void mo22490m(@C12579k C11045c<?> cVar) {
            C11047d.C11048a.m42589e(this, cVar);
        }

        @C12579k
        /* renamed from: o */
        public <T> C11045c<T> mo22491o(@C12579k C11045c<? super T> cVar) {
            Intrinsics.checkNotNullParameter(cVar, "continuation");
            C11723c2 c2Var = (C11723c2) cVar.getContext().mo7444b(C11723c2.f29067w0);
            if (c2Var != null) {
                C37110c.m152145c(this.f92907a, c2Var);
            }
            return cVar;
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C11047d m152143a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        return new C37111a(view);
    }

    @C12579k
    /* renamed from: b */
    public static final C11047d m152144b(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return m152143a(view);
    }

    /* renamed from: c */
    public static final void m152145c(@C12579k View view, @C12579k C11723c2 c2Var) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(c2Var, "job");
        view.addOnAttachStateChangeListener(new C37117h(view, c2Var));
    }

    @C12579k
    /* renamed from: d */
    public static final C12074o0 m152146d(@C12579k View view) {
        C12074o0 o0Var;
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i = C36896b.C36906j.auto_dispose_view_tag;
        Object tag = view.getTag(i);
        if (tag instanceof C12074o0) {
            o0Var = (C12074o0) tag;
        } else {
            o0Var = null;
        }
        if (o0Var != null) {
            return o0Var;
        }
        C37118i iVar = new C37118i(C11719b3.m46155c((C11723c2) null, 1, (Object) null).mo7443Q(C11768d1.m46783e()).mo7443Q(m152144b(view)));
        view.setTag(i, iVar);
        return iVar;
    }
}
