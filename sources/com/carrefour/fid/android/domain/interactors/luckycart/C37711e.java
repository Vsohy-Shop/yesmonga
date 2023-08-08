package com.carrefour.fid.android.domain.interactors.luckycart;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.luckycart.e */
public interface C37711e extends C37679f<C37712a, Boolean> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.luckycart.e$a */
    public static final class C37712a {
        @C12579k

        /* renamed from: a */
        public final Context f94596a;

        public C37712a(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            this.f94596a = context;
        }

        /* renamed from: c */
        public static /* synthetic */ C37712a m154520c(C37712a aVar, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = aVar.f94596a;
            }
            return aVar.mo114773b(context);
        }

        @C12579k
        /* renamed from: a */
        public final Context mo114772a() {
            return this.f94596a;
        }

        @C12579k
        /* renamed from: b */
        public final C37712a mo114773b(@C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            return new C37712a(context);
        }

        @C12579k
        /* renamed from: d */
        public final Context mo114774d() {
            return this.f94596a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37712a) && Intrinsics.areEqual((Object) this.f94596a, (Object) ((C37712a) obj).f94596a);
        }

        public int hashCode() {
            return this.f94596a.hashCode();
        }

        @C12579k
        public String toString() {
            Context context = this.f94596a;
            return "Param(context=" + context + ")";
        }
    }
}
