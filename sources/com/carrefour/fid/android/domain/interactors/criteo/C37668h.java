package com.carrefour.fid.android.domain.interactors.criteo;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.criteo.h */
public interface C37668h extends C37679f<C37669a, Boolean> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.criteo.h$a */
    public static final class C37669a {
        @C12579k

        /* renamed from: a */
        public final Context f94528a;

        public C37669a(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            this.f94528a = context;
        }

        /* renamed from: c */
        public static /* synthetic */ C37669a m154423c(C37669a aVar, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = aVar.f94528a;
            }
            return aVar.mo114677b(context);
        }

        @C12579k
        /* renamed from: a */
        public final Context mo114676a() {
            return this.f94528a;
        }

        @C12579k
        /* renamed from: b */
        public final C37669a mo114677b(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            return new C37669a(context);
        }

        @C12579k
        /* renamed from: d */
        public final Context mo114678d() {
            return this.f94528a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37669a) && Intrinsics.areEqual((Object) this.f94528a, (Object) ((C37669a) obj).f94528a);
        }

        public int hashCode() {
            return this.f94528a.hashCode();
        }

        @C12579k
        public String toString() {
            Context context = this.f94528a;
            return "Param(context=" + context + ")";
        }
    }
}
